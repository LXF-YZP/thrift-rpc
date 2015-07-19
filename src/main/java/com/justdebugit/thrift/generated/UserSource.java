/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.justdebugit.thrift.generated;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum UserSource implements org.apache.thrift.TEnum {
  WEIBO(1),
  QQ(2),
  WEIXIN(3),
  RENREN(4);

  private final int value;

  private UserSource(int value) {
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
  public static UserSource findByValue(int value) { 
    switch (value) {
      case 1:
        return WEIBO;
      case 2:
        return QQ;
      case 3:
        return WEIXIN;
      case 4:
        return RENREN;
      default:
        return null;
    }
  }
}