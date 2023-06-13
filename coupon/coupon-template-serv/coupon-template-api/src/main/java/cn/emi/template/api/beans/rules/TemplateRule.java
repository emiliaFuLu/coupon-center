package cn.emi.template.api.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 优惠卷计算规则
 *
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/6/13 17:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateRule {
    /**
     * 可以享受的折扣
     */
    private Discount discount;

    /**
     * 每个人最多可以领券数量
     */
    private Integer limitation;

    /**
     * 过期时间
     */
    private Long deadline;
}
 