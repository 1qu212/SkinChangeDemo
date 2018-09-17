package cn.msz.skinchangedemo.util;

import android.content.Context;
import android.view.View;

public class DynamicSkinAttrItem {
    public SkinAttr skinAttr;
    public View view;

    public DynamicSkinAttrItem(Context context, View view, SkinAttr skinAttr, int attrValueId) {
        this.view = view;
        this.skinAttr = skinAttr;
        this.skinAttr.attrValueId = attrValueId;
        this.skinAttr.resourceTypeName = context.getResources().getResourceTypeName(attrValueId);
    }
}
