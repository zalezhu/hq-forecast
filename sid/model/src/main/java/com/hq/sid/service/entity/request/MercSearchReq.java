package com.hq.sid.service.entity.request;

import java.util.List;

/**
 * Created by Zale on 2016/12/12.
 */
public class MercSearchReq {
    private Integer coreId;
    private String mercId;
    private Integer pcoreId;
    private String mercName;
    private String mercShotName;
    private String mercAddr;
    private Boolean mercType;
    private Boolean busiIsThreeInOne;
    private String busiLicenseNo;
    private String busiLicenseDate;
    private String busiLicenseIndate;
    private String busiScope;
    private String busiLicenseProv;
    private String busiLicenseCity;
    private String orgCode;
    private String legalPersonName;
    private String legalPersonCertType;
    private String legalPersonCertNo;
    private String legalPersonCertDate;
    private String legalPersonCertIndate;
    private Boolean bankType;
    private String bankCardNo;
    private String bankAccountName;
    private String bankSub;
    private String bankName;
    private String bankProv;
    private String bankCity;
    private String bankAccountMobile;
    private String bankHolderCertno;
    private String contactName;
    private String contactMobile;
    private String contactEmail;
    private String serviceTel;
    private String aliLoginId;
    private String aliMccCode;
    private String aliFwName;
    private String shopName;
    private String wxMccCode;
    private String wxPublicName;
    private String webAddress;
    private String sellDetail;

    private String busiAuthPic;
    private String orgPic;
    private String legalPersonCertPicF;
    private String legalPersonCertPicB;
    private String logoPic;
    private String shopBoardPic;
    private List<String> shopScenePic;
    private String webAuthPic;
    private String busiLicensePic;
    private String busiSpecialPic;

    private String operId;
    private String unionCode;

    public String getUnionCode() {
        return unionCode;
    }

    public void setUnionCode(String unionCode) {
        this.unionCode = unionCode;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public Integer getCoreId() {
        return coreId;
    }

    public void setCoreId(Integer coreId) {
        this.coreId = coreId;
    }

    public String getMercId() {
        return mercId;
    }

    public void setMercId(String mercId) {
        this.mercId = mercId;
    }

    public Integer getPcoreId() {
        return pcoreId;
    }
    public void setPcoreId(Integer pcoreId) {
        this.pcoreId = pcoreId;
    }

    public String getMercName() {
        return mercName;
    }

    public void setMercName(String mercName) {
        this.mercName = mercName;
    }

    public String getMercShotName() {
        return mercShotName;
    }

    public void setMercShotName(String mercShotName) {
        this.mercShotName = mercShotName;
    }

    public String getMercAddr() {
        return mercAddr;
    }

    public void setMercAddr(String mercAddr) {
        this.mercAddr = mercAddr;
    }

    public Boolean getMercType() {
        return mercType;
    }

    public void setMercType(Boolean mercType) {
        this.mercType = mercType;
    }

    public Boolean getBusiIsThreeInOne() {
        return busiIsThreeInOne;
    }

    public void setBusiIsThreeInOne(Boolean busiIsThreeInOne) {
        this.busiIsThreeInOne = busiIsThreeInOne;
    }

    public String getBusiLicenseNo() {
        return busiLicenseNo;
    }

    public void setBusiLicenseNo(String busiLicenseNo) {
        this.busiLicenseNo = busiLicenseNo;
    }

    public String getBusiLicenseDate() {
        return busiLicenseDate;
    }

    public void setBusiLicenseDate(String busiLicenseDate) {
        this.busiLicenseDate = busiLicenseDate;
    }

    public String getBusiLicenseIndate() {
        return busiLicenseIndate;
    }

    public void setBusiLicenseIndate(String busiLicenseIndate) {
        this.busiLicenseIndate = busiLicenseIndate;
    }

    public String getBusiScope() {
        return busiScope;
    }

    public void setBusiScope(String busiScope) {
        this.busiScope = busiScope;
    }

    public String getBusiLicenseProv() {
        return busiLicenseProv;
    }

    public void setBusiLicenseProv(String busiLicenseProv) {
        this.busiLicenseProv = busiLicenseProv;
    }

    public String getBusiLicenseCity() {
        return busiLicenseCity;
    }

    public void setBusiLicenseCity(String busiLicenseCity) {
        this.busiLicenseCity = busiLicenseCity;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    public String getLegalPersonCertType() {
        return legalPersonCertType;
    }

    public void setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
    }

    public String getLegalPersonCertNo() {
        return legalPersonCertNo;
    }

    public void setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
    }

    public String getLegalPersonCertDate() {
        return legalPersonCertDate;
    }

    public void setLegalPersonCertDate(String legalPersonCertDate) {
        this.legalPersonCertDate = legalPersonCertDate;
    }

    public String getLegalPersonCertIndate() {
        return legalPersonCertIndate;
    }

    public void setLegalPersonCertIndate(String legalPersonCertIndate) {
        this.legalPersonCertIndate = legalPersonCertIndate;
    }

    public Boolean getBankType() {
        return bankType;
    }

    public void setBankType(Boolean bankType) {
        this.bankType = bankType;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankSub() {
        return bankSub;
    }

    public void setBankSub(String bankSub) {
        this.bankSub = bankSub;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankProv() {
        return bankProv;
    }

    public void setBankProv(String bankProv) {
        this.bankProv = bankProv;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankAccountMobile() {
        return bankAccountMobile;
    }

    public void setBankAccountMobile(String bankAccountMobile) {
        this.bankAccountMobile = bankAccountMobile;
    }

    public String getBankHolderCertno() {
        return bankHolderCertno;
    }

    public void setBankHolderCertno(String bankHolderCertno) {
        this.bankHolderCertno = bankHolderCertno;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel;
    }

    public String getAliLoginId() {
        return aliLoginId;
    }

    public void setAliLoginId(String aliLoginId) {
        this.aliLoginId = aliLoginId;
    }

    public String getAliMccCode() {
        return aliMccCode;
    }

    public void setAliMccCode(String aliMccCode) {
        this.aliMccCode = aliMccCode;
    }

    public String getAliFwName() {
        return aliFwName;
    }

    public void setAliFwName(String aliFwName) {
        this.aliFwName = aliFwName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getWxMccCode() {
        return wxMccCode;
    }

    public void setWxMccCode(String wxMccCode) {
        this.wxMccCode = wxMccCode;
    }

    public String getWxPublicName() {
        return wxPublicName;
    }

    public void setWxPublicName(String wxPublicName) {
        this.wxPublicName = wxPublicName;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getSellDetail() {
        return sellDetail;
    }

    public void setSellDetail(String sellDetail) {
        this.sellDetail = sellDetail;
    }

    public String getBusiAuthPic() {
        return busiAuthPic;
    }

    public void setBusiAuthPic(String busiAuthPic) {
        this.busiAuthPic = busiAuthPic;
    }

    public String getOrgPic() {
        return orgPic;
    }

    public void setOrgPic(String orgPic) {
        this.orgPic = orgPic;
    }

    public String getLegalPersonCertPicF() {
        return legalPersonCertPicF;
    }

    public void setLegalPersonCertPicF(String legalPersonCertPicF) {
        this.legalPersonCertPicF = legalPersonCertPicF;
    }

    public String getLegalPersonCertPicB() {
        return legalPersonCertPicB;
    }

    public void setLegalPersonCertPicB(String legalPersonCertPicB) {
        this.legalPersonCertPicB = legalPersonCertPicB;
    }

    public String getLogoPic() {
        return logoPic;
    }

    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic;
    }

    public String getShopBoardPic() {
        return shopBoardPic;
    }

    public void setShopBoardPic(String shopBoardPic) {
        this.shopBoardPic = shopBoardPic;
    }

    public List<String> getShopScenePic() {
        return shopScenePic;
    }

    public void setShopScenePic(List<String> shopScenePic) {
        this.shopScenePic = shopScenePic;
    }

    public String getWebAuthPic() {
        return webAuthPic;
    }

    public void setWebAuthPic(String webAuthPic) {
        this.webAuthPic = webAuthPic;
    }

    public String getBusiLicensePic() {
        return busiLicensePic;
    }

    public void setBusiLicensePic(String busiLicensePic) {
        this.busiLicensePic = busiLicensePic;
    }

    public String getBusiSpecialPic() {
        return busiSpecialPic;
    }

    public void setBusiSpecialPic(String busiSpecialPic) {
        this.busiSpecialPic = busiSpecialPic;
    }

    @Override
    public String toString() {
        return "MercReq{" +
                "coreId=" + coreId +
                ", mercId='" + mercId + '\'' +
                ", pcoreId=" + pcoreId +
                ", mercName='" + mercName + '\'' +
                ", mercShotName='" + mercShotName + '\'' +
                ", mercAddr='" + mercAddr + '\'' +
                ", mercType=" + mercType +
                ", busiIsThreeInOne=" + busiIsThreeInOne +
                ", busiLicenseNo='" + busiLicenseNo + '\'' +
                ", busiLicenseDate='" + busiLicenseDate + '\'' +
                ", busiLicenseIndate='" + busiLicenseIndate + '\'' +
                ", busiScope='" + busiScope + '\'' +
                ", busiLicenseProv='" + busiLicenseProv + '\'' +
                ", busiLicenseCity='" + busiLicenseCity + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", legalPersonName='" + legalPersonName + '\'' +
                ", legalPersonCertType='" + legalPersonCertType + '\'' +
                ", legalPersonCertNo='" + legalPersonCertNo + '\'' +
                ", legalPersonCertDate='" + legalPersonCertDate + '\'' +
                ", legalPersonCertIndate='" + legalPersonCertIndate + '\'' +
                ", bankType=" + bankType +
                ", bankCardNo='" + bankCardNo + '\'' +
                ", bankAccountName='" + bankAccountName + '\'' +
                ", bankSub='" + bankSub + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankProv='" + bankProv + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", bankAccountMobile='" + bankAccountMobile + '\'' +
                ", bankHolderCertno='" + bankHolderCertno + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactMobile='" + contactMobile + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", serviceTel='" + serviceTel + '\'' +
                ", aliLoginId='" + aliLoginId + '\'' +
                ", aliMccCode='" + aliMccCode + '\'' +
                ", aliFwName='" + aliFwName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", wxMccCode='" + wxMccCode + '\'' +
                ", wxPublicName='" + wxPublicName + '\'' +
                ", webAddress='" + webAddress + '\'' +
                ", sellDetail='" + sellDetail + '\'' +
                ", busiAuthPic='" + busiAuthPic + '\'' +
                ", orgPic='" + orgPic + '\'' +
                ", legalPersonCertPicF='" + legalPersonCertPicF + '\'' +
                ", legalPersonCertPicB='" + legalPersonCertPicB + '\'' +
                ", logoPic='" + logoPic + '\'' +
                ", shopBoardPic='" + shopBoardPic + '\'' +
                ", shopScenePic=" + shopScenePic +
                ", webAuthPic='" + webAuthPic + '\'' +
                ", busiLicensePic='" + busiLicensePic + '\'' +
                ", busiSpecialPic='" + busiSpecialPic + '\'' +
                '}';
    }
}
