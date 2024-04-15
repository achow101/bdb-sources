/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sleepycat.thrift;


public enum TCursorPutConfig implements org.apache.thrift.TEnum {
  AFTER(1),
  BEFORE(2),
  CURRENT(3),
  DEFAULT(4),
  KEY_FIRST(5),
  KEY_LAST(6),
  NO_DUP_DATA(7),
  NO_OVERWRITE(8);

  private final int value;

  private TCursorPutConfig(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TCursorPutConfig findByValue(int value) { 
    switch (value) {
      case 1:
        return AFTER;
      case 2:
        return BEFORE;
      case 3:
        return CURRENT;
      case 4:
        return DEFAULT;
      case 5:
        return KEY_FIRST;
      case 6:
        return KEY_LAST;
      case 7:
        return NO_DUP_DATA;
      case 8:
        return NO_OVERWRITE;
      default:
        return null;
    }
  }
}
