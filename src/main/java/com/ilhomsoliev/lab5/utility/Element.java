package com.ilhomsoliev.lab5.utility;

/**
 * Полезный абстрактный класс для класса, указанного в задаче.
 * @author ilhom_soliev
 */
public abstract class Element implements Comparable<Element>, Validatable {
  abstract public long getId();
}
