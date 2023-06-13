package cn.emi.template.api.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 折扣
 *
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/6/13 17:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Discount {
    /**
     * 满减 - 减掉的钱数
     * 折扣 - 90 = 9折,  95=95折
     */
    private Long quota;

    /**
     * 最低达到多少消费才能用
     */
    private Long threshold;
}
 