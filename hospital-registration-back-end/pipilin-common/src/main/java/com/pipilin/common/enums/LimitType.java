package com.pipilin.common.enums;

/**
 * 限流类型
 *
 * @author  931708230@qq.com
 */

public enum LimitType
{
    /**
     * 默认策略全局限流
     */
    DEFAULT,

    /**
     * 根据请求者IP进行限流
     */
    IP
}
