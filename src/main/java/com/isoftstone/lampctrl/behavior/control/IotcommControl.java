package com.isoftstone.lampctrl.behavior.control;

import com.isoftstone.lampctrl.params.ControlParam;
import com.huawei.utils.Utilty;

/**
 * ClassName: HuatiOnBehavior
 * Package: com.isoftstone.lampctl.on
 * Description:
 *
 * @Date: 2019/11/26 12:25
 * @Author: softbaddog@sina.com
 */
public class IotcommControl implements ControlBehavior {
    @Override
    public byte[] on(ControlParam param) {
        System.out.println("---IOTCOMM on---");
        return Utilty.getByteArray("0000");
    }

    @Override
    public byte[] off(ControlParam param) {
        System.out.println("---IOTCOMM off---");
        return Utilty.getByteArray("0000");
    }

    @Override
    public byte[] dim(ControlParam param) {
        System.out.println("---IOTCOMM dim---");
        return Utilty.getByteArray("0000");
    }
}
