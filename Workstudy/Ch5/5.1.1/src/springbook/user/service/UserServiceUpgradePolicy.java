/**
 * 
 */
package springbook.user.service;

import springbook.user.domain.User;

/**
 * @author JamesPark
 *
 */
public interface UserServiceUpgradePolicy {
	boolean canUpgradeLevel(User user);
	void upgradeLevel(User user);
}
