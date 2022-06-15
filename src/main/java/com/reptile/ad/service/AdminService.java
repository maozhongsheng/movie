package com.reptile.ad.service;

import com.reptile.ad.utils.LarkPageInfoVo;
import com.reptile.ad.vo.RotationChart;
import com.reptile.ad.vo.request.AdminRotationRequest;
import com.reptile.ad.vo.response.AdminRotationResponseDTO;

import java.util.List;
import java.util.Map;

public interface AdminService {

    LarkPageInfoVo<AdminRotationResponseDTO> adminRotationList(AdminRotationRequest adminRotationRequest);

    RotationChart adminRotationById(AdminRotationRequest adminRotationRequest);

    Integer addAdminRotation(AdminRotationRequest adminRotationRequest);

    Integer updateAdminRotation(AdminRotationRequest adminRotationRequest);

    Integer deleteAdminRotation(AdminRotationRequest adminRotationRequest);

    List<Map> adminRotationListBox();

    List<Map> adminHotListBox();

    List<Map> adminAllListBox(AdminRotationRequest adminRotationRequest);

    Integer addadminHotBox(AdminRotationRequest adminRotationRequest);

    Integer deleteadminHotBox(AdminRotationRequest adminRotationRequest);
}
