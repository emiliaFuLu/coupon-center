package cn.emi.coupontemplateimpl.service.intf;

import cn.emi.template.api.beans.CouponTemplateInfo;
import cn.emi.template.api.beans.PagedCouponTemplateInfo;
import cn.emi.template.api.beans.TemplateSearchParams;

import java.util.Collection;
import java.util.Map;

/**
 * 接口
 *
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/6/13 17:41
 */
public interface CouponTemplateService {
    // 创建优惠券模板
    CouponTemplateInfo createTemplate(CouponTemplateInfo request);

    CouponTemplateInfo cloneTemplate(Long templateId);

    // 模板查询（分页）
    PagedCouponTemplateInfo search(TemplateSearchParams request);

    // 通过模板ID查询优惠券模板
    CouponTemplateInfo loadTemplateInfo(Long id);

    // 让优惠券模板无效
    void deleteTemplate(Long id);

    // 批量查询
    // Map是模板ID，key是模板详情
    Map<Long, CouponTemplateInfo> getTemplateInfoMap(Collection<Long> ids);
}