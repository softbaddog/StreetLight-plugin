package com.isoftstone.lampctrl.behavior.passthrough;

import com.isoftstone.lampctrl.params.ControlParam;
import com.huawei.utils.Utilty;

/**
 * 华体NB设备透传下发
 *
 * @author yhmaoc
 * @since 0.1.0, 2019/11/29
 */
public class HuatiPassthrough implements PassthroughBehavior {

  /**
   * 华体NB设备透传下发命令
   * @param param
   * @return
   */
  @Override
  public byte[] send(ControlParam param) {
    return Utilty.getByteArray(param.getCmd());
  }
}
