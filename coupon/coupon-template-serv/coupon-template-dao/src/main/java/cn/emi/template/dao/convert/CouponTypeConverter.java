package cn.emi.template.dao.convert;

import cn.emi.template.api.enums.CouponType;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

/**
 * 优惠卷类型转换
 *
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/6/13 17:24
 */
@Convert
public class CouponTypeConverter implements AttributeConverter<CouponType,String> {
    @Override
    public String convertToDatabaseColumn(CouponType attribute) {
        return attribute.getCode();
    }

    @Override
    public CouponType convertToEntityAttribute(String code) {
        return CouponType.convert(code);
    }
}
 