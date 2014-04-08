--다면평가 1차 대상자 전체풀 엑셀출력용....2013.11.22

SELECT --ROWNUM,
       USER_NM                      AS "성명"
     , EMP_NO                       AS "사번"
     , PAR_ORG_NM                   AS "평가소속부서"
     , PAR_TEAM_NM                  AS "평가소속부"
     , JGRD_NM                      AS "피평정자직급"
     ,
       (
       SELECT
              TO_NUMBER( P_PAR_JGRD_CD )
       FROM
              T_POLYPAR_MASTER S
       WHERE
              S.SYS_CD = PAR_SYS_CD
          AND S.EMP_NO = A.EMP_NO
       ) ||'급'                     AS "피평가자직위직급"
     , POS_NM                       AS "직위"
     , HM_NM                        AS "인사관리단위"
     , PARTYPE_NM                   AS "평가그룹"
     , PARSIJUM                     AS "관찰범위"
     , PAR_EMP_NO                   AS "평가자사번"
     , PAR_EMP_NM                   AS "평가자성명"
     , P_PAR_ORG_NM                 AS "평가소속부서1"
     , P_PAR_TEAM_NM                AS "평가소속부1"
     , P_JGRD_NM                    AS "평가자직급1"
     ,
       (
       SELECT
              TO_NUMBER( P_PAR_JGRD_CD )
       FROM
              T_POLYPAR_MASTER S
       WHERE
              S.SYS_CD = PAR_SYS_CD
          AND S.EMP_NO = A.PAR_EMP_NO
       ) ||'급'                     AS "평가자직위직급"
     , P_POS_NM                     AS "평가자직위"
     , SORT_ORDER                   AS "지역구분"
     , OUT_GUBUN                    AS "출신구분"
     , PAR_SYS_CD                   AS "평가자 추출년도"
     , P_DEPT_NAME                  AS "현소속부서"
     , P_TEAM_NAME                  AS "현소속부"
FROM
       (
       SELECT --ROWNUM,
              EMP_NO
            , PAR_ORG
            , PAR_ORG_NM
            , PAR_TEAM
            , PAR_TEAM_NM
            , DEPT_CODE
            , TEAM_CODE
            , USER_NM
            , JGRD_NM
            , POS_NM
            , HM_NM
            , PARSIJUM
            , PARTYPE_NM
            , PAR_EMP_NO
            , PAR_EMP_NM
            , P_JGRD_NM
            , P_POS_NM
            , P_PAR_ORG
            , P_PAR_ORG_NM
            , P_PAR_TEAM
            , P_PAR_TEAM_NM
            , P_DEPT_NAME
            , P_TEAM_NAME
            , TO_CHAR( C_CMMD_DATE, 'YYYY-MM-DD' ) C_CMMD_DATE
            , TO_CHAR( C_CMMD_END_DATE, 'YYYY-MM-DD' ) C_CMMD_END_DATE
            , SORT_ORDER
            , OUT_GUBUN
            , PAR_SYS_CD
       FROM
              (
              SELECT
                     A.EMP_NO
                   , A.PAR_GIGAN
                   , A.PAR_GUBUN
                   , A.PAR_ORG
                   , A.PAR_ORG_NM
                   , A.PAR_TEAM
                   , A.PAR_TEAM_NM
                   , A.DEPT_CODE
                   , A.TEAM_CODE
                   , A.USER_NM
                   , A.JGRD_NM
                   , A.POS_NM
                   , A.HM_NM
                   , A.PAR_SIJUM
                   , A.PARSIJUM
                   , A.PAR_TYPE
                   , A.PARTYPE_NM
                   , A.PAR_EMP_NO
                   , C.USER_NM PAR_EMP_NM
                   , A.P_JGRD_CD
                   , A.P_JGRD_NM
                   , A.P_POS_CD
                   , A.P_POS_NM
                   , A.P_HM_CD
                   , A.P_HM_NM
                   , A.P_PAR_ORG
                   , FNC_GET( 'ORG_NM', A.PAR_SYS_CD, A.P_PAR_ORG ) P_PAR_ORG_NM
                   , A.P_PAR_TEAM
                   , FNC_GET( 'ORG_NM', A.PAR_SYS_CD, A.P_PAR_TEAM ) P_PAR_TEAM_NM
                   , C.DEPT_CODE AS P_DEPT_CODE
                   , FNC_GET( 'ORG_NM', A.SYS_CD, C.DEPT_CODE ) P_DEPT_NAME
                   , C.TEAM_CODE AS P_TEAM_CODE
                   , C.TEAM_NAME AS P_TEAM_NAME
                   , A.JGRD_CD
                   , A.P_CMMD_DATE
                   , A.P_CMMD_END_DATE
                   , A.C_CMMD_DATE
                   , A.C_CMMD_END_DATE
                   , A.OUT_GUBUN
                   , DECODE( SUBSTR( A.SORT_ORDER, 1, 1 ), 'A', '본사', '지역' ) AS SORT_ORDER -- 출신구분
                   , A.PAR_SYS_CD -- 평정추출년도
              FROM
                     (
                     SELECT
                            /*+ index(a IX_FIRST_DAESANG_DA_TOTAL_JOB2) */
                            A.EMP_NO
                          , A.SYS_CD
                          ,
                            (
                            SELECT
                                   O.SORT_ORDER
                            FROM
                                   T_ORG O
                            WHERE
                                   O.SYS_CD = A.PAR_SYS_CD
                               AND O.ORG_CD = A.PAR_TEAM
                            ) SORT_ORDER
                          , A.PAR_GIGAN
                          , A.PAR_GUBUN
                          , A.PAR_ORG
                          , FNC_GET( 'ORG_NM', A.PAR_SYS_CD, A.PAR_ORG ) PAR_ORG_NM
                          , A.PAR_TEAM
                          , FNC_GET( 'ORG_NM', A.PAR_SYS_CD, A.PAR_TEAM ) PAR_TEAM_NM
                          ,
                            (
                            SELECT
                                   B.USER_NM
                            FROM
                                   T_USER B
                            WHERE
                                   A.PAR_SYS_CD = B.SYS_CD
                               AND A.EMP_NO = B.EMP_NO
                            ) USER_NM
                          , A.JGRD_CD
                          , A.JGRD_NM
                          , A.POS_NM
                          , A.HM_NM
                          , A.DEPT_CODE
                          , A.TEAM_CODE
                          , A.PAR_SIJUM
                          , CASE
                                WHEN PAR_SIJUM = '0001'
                                THEN '1차관찰'
                                WHEN PAR_SIJUM = '0002'
                                THEN '2차관찰'
                                WHEN PAR_SIJUM = '0003'
                                THEN '확장'
                            END PARSIJUM
                          , A.PAR_TYPE
                          , CASE
                                WHEN PAR_TYPE = '0001'
                                THEN '상사'
                                WHEN PAR_TYPE = '0002'
                                THEN '동료'
                                WHEN PAR_TYPE = '0003'
                                THEN '부하'
                            END PARTYPE_NM
                          , A.PAR_EMP_NO
                          , A.P_JGRD_CD
                          , A.P_JGRD_NM
                          , A.P_POS_CD
                          , A.P_POS_NM
                          , A.P_PAR_ORG
                          , A.P_PAR_TEAM
                          , A.P_HM_CD
                          , A.P_HM_NM
                          , A.PAR_OUT_GUBUN AS OUT_GUBUN--
                          , A.PAR_SYS_CD --
                          , A.CMMD_DATE
                          , A.CMMD_END_DATE
                          , A.P_CMMD_DATE
                          , A.P_CMMD_END_DATE
                          , CASE
                                WHEN A.CMMD_DATE <= A.P_CMMD_DATE
                                THEN A.CMMD_DATE
                                WHEN A.CMMD_DATE > A.P_CMMD_DATE
                                THEN A.P_CMMD_DATE
                            END AS C_CMMD_DATE
                          , CASE
                                WHEN A.CMMD_END_DATE <= A.P_CMMD_END_DATE
                                THEN A.CMMD_END_DATE
                                WHEN A.CMMD_END_DATE > A.P_CMMD_END_DATE
                                THEN A.P_CMMD_END_DATE
                            END AS C_CMMD_END_DATE
                          ,
                            (
                                CASE
                                    WHEN A.CMMD_END_DATE <= A.P_CMMD_END_DATE
                                    THEN A.CMMD_END_DATE
                                    WHEN A.CMMD_END_DATE > A.P_CMMD_END_DATE
                                    THEN A.P_CMMD_END_DATE
                                END -
                                CASE
                                    WHEN A.CMMD_DATE <= A.P_CMMD_DATE
                                    THEN A.CMMD_DATE
                                    WHEN A.CMMD_DATE > A.P_CMMD_DATE
                                    THEN A.P_CMMD_DATE
                                END
                            )
                            + 1 AS WORK_CNT
                     FROM
                            TMP_FIRST_DAESANG_DA_TOTAL_JOB A
                     WHERE
                            A.SYS_CD = '2013'
                        AND A.PAR_GUBUN = '0007'
                        AND A.PAR_GIGAN = '0003' --  AND A.EMP_NO  like '&v_emp_no%'
                            --  AND A.EMP_NO = '114775'
                            --  AND A.PAR_EMP_NO like '&v_PAR_emp_no%'-- '111030'
                            --  AND A.PAR_SIJUM = '0001'
                            --and a.emp_no <= '112847'   --
--                     order by
--                            a.sys_cd
--                          , a.par_gigan
--                          , a.par_gubun
--                          , a.emp_no
                     ) A
                 INNER JOIN
                     T_USER C
                 ON
                     (
                         A.PAR_SYS_CD = C.SYS_CD
                     AND A.PAR_EMP_NO = C.EMP_NO
                     )
              WHERE
                     0 = 0
                 AND NVL( PAR_GIGAN, '0003' ) = '0003'
              ) TOT --  WHERE ROWNUM BETWEEN 1 AND 1000000
       ) A --ORDER BY EMP_NO--, JGRD_NM--, SORT_ORDER