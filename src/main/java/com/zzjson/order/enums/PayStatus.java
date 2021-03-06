package com.zzjson.order.enums;

import lombok.Getter;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 rollBall team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : com.zzjson.order.enums</li>
 * <li>Version     : 3.8.5</li>
 * <li>Creation    : 2018年09月23日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@Getter
public enum PayStatus {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;
    private String message;

    PayStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}