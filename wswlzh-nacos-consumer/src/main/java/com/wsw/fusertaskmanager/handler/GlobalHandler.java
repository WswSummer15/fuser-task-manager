package com.wsw.fusertaskmanager.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wsw.fusertaskmanager.entities.CommonResult;
import com.wsw.fusertaskmanager.entities.Payment;

/**
 * @Author WangSongWen
 * @Date: Created in 14:31 2020/10/26
 * @Description:
 */
public class GlobalHandler {
    public static CommonResult<Payment> blockHandler(Long id, BlockException exception){
        Payment payment = new Payment(id, null);
        return new CommonResult<>(4444, "获取资源失败: " + exception.getMessage().toString(), payment);
    }
}
