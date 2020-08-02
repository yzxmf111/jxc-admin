package cn.toesbieya.jxc.model.vo;

import cn.toesbieya.jxc.model.entity.SysSupplier;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SupplierVo extends SysSupplier {
    private String regionName;

    public SupplierVo(SysSupplier parent) {
        BeanUtils.copyProperties(parent, this);
    }
}
