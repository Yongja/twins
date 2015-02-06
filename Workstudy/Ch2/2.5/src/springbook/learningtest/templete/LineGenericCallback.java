package springbook.learningtest.templete;

public interface LineGenericCallback<T> {
	T doSomethingWithReader(String line, T value);
}
