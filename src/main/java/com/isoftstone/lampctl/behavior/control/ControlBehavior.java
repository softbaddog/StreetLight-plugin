package com.isoftstone.lampctl.behavior.control;

import com.isoftstone.lampctl.params.ControlParam;

/**
 * ClassName: OnBehavior
 * Package: com.isoftstone.lampctl.on
 * Description:
 *
 * @Date: 2019/11/26 12:25
 * @Author: softbaddog@sina.com
 */
public interface ControlBehavior {
    byte[] on(ControlParam param);
    byte[] off(ControlParam param);
    byte[] dim(ControlParam param);
}
