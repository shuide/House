package com.shen.house.post;

import android.text.TextUtils;

import com.luck.picture.lib.entity.LocalMedia;
import com.shen.baselibrary.customview.spinnerpopupwindow.BaseItem;
import com.shen.baselibrary.utiles.StringUtils;
import com.zaaach.citypicker.model.AreaBean;

import java.util.List;

public class PostBean {
    public String title;
    public String content;
    public List<LocalMedia> pics;
    public String name;
    public AreaBean area;//区县
    public String address;
    public String mianji;//float
    public ShiTing shiting;
    public BaseItem chaoxiang;
    public DianTi dianti;
    public String fangling;//int
    public String danjia;//float
    public String zongjia;//float
    public String shoufu;//float
    public String daikuan;//float
    public String qita;//float
    public String louceng;//int
    public String alllouceng;//int
    public BaseItem zhuangxiu;
    public BaseItem xingzhi;
    public List<BaseItem> wuzhengs;//选中的
    public String phone;//int
    public String weixin;
    public String qq;//int

    public boolean isNotEmpty() {//联系信息就不计算在内判断了
        if (!TextUtils.isEmpty(title) || !TextUtils.isEmpty(content) || StringUtils.listSize(pics) > 0 || !TextUtils.isEmpty(name) || area != null || !TextUtils.isEmpty(address)
                || !TextUtils.isEmpty(mianji) || shiting != null || chaoxiang != null || dianti != null || !TextUtils.isEmpty(fangling) || !TextUtils.isEmpty(danjia) || !TextUtils.isEmpty(zongjia)
                || !TextUtils.isEmpty(shoufu) || !TextUtils.isEmpty(daikuan) || !TextUtils.isEmpty(qita) || !TextUtils.isEmpty(louceng) || !TextUtils.isEmpty(alllouceng) || zhuangxiu != null
                || xingzhi != null || StringUtils.listSize(wuzhengs) > 0) {
            return true;
        }
        return false;
    }

    public static class ShiTing {
        public int shi;
        public int ting;
        public int wei;
        public String shis;
        public String tings;
        public String weis;

        public ShiTing(int shi, String shis, int ting, String tings, int wei, String weis) {
            this.shi = shi;
            this.shis = shis;
            this.ting = ting;
            this.tings = tings;
            this.wei = wei;
            this.weis = weis;
        }
    }

    public static class DianTi {
        public boolean has;
        public int ti;
        public String tis;
        public int hu;
        public String hus;

        public DianTi(boolean has, int ti, String tis, int hu, String hus) {
            this.has = has;
            this.ti = ti;
            this.tis = tis;
            this.hu = hu;
            this.hus = hus;
        }
    }
}
