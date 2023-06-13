package cn.emi.coupontemplateimpl.converter;

import cn.emi.template.api.beans.CouponTemplateInfo;
import cn.emi.template.dao.entity.CouponTemplate;

/**
 * 将数据 entity 转换为 view 实体类
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/6/13 17:44
 */
public class CouponTemplateConverter {
    public static CouponTemplateInfo convertToTemplateInfo(CouponTemplate template) {
        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }
}
 