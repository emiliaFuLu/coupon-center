package cn.emi.template.dao.convert;

import cn.emi.template.api.beans.rules.TemplateRule;
import com.alibaba.fastjson.JSON;

import javax.persistence.AttributeConverter;

/**
 * 优惠卷计算规则转换
 *
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/6/13 17:26
 */
public class RuleConverter implements AttributeConverter<TemplateRule,String> {
    @Override
    public String convertToDatabaseColumn(TemplateRule rule) {
        return JSON.toJSONString(rule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String rule) {
        return JSON.parseObject(rule, TemplateRule.class);
    }
}
 