package bin.p000mt.plugin.api.p002ui.builder;

import android.graphics.drawable.Drawable;
import bin.p000mt.plugin.api.p002ui.PluginView;

/* JADX INFO: loaded from: classes.dex */
public interface PluginBaseViewBuilder extends PluginUIBuilder {
    PluginUIBuilder alpha(float f);

    PluginUIBuilder background(Drawable drawable);

    PluginUIBuilder backgroundColor(int i);

    PluginUIBuilder enable(boolean z);

    String getId();

    Object getTag();

    PluginUIBuilder gone();

    PluginUIBuilder height(int i);

    PluginUIBuilder heightDp(float f);

    PluginUIBuilder heightMatchParent();

    PluginUIBuilder heightWrapContent();

    /* JADX INFO: renamed from: id */
    PluginUIBuilder mo52id(String str);

    PluginUIBuilder invisible();

    PluginUIBuilder layoutGravity(int i);

    PluginUIBuilder layoutWeight(float f);

    PluginUIBuilder margin(int i);

    PluginUIBuilder margin(int i, int i2, int i3, int i4);

    PluginUIBuilder marginBottom(int i);

    PluginUIBuilder marginBottomDp(float f);

    PluginUIBuilder marginDp(float f);

    PluginUIBuilder marginDp(float f, float f2, float f3, float f4);

    PluginUIBuilder marginHorizontal(int i);

    PluginUIBuilder marginHorizontalDp(float f);

    PluginUIBuilder marginLeft(int i);

    PluginUIBuilder marginLeftDp(float f);

    PluginUIBuilder marginRight(int i);

    PluginUIBuilder marginRightDp(float f);

    PluginUIBuilder marginTop(int i);

    PluginUIBuilder marginTopDp(float f);

    PluginUIBuilder marginVertical(int i);

    PluginUIBuilder marginVerticalDp(float f);

    PluginUIBuilder onClick(PluginView.OnClickListener onClickListener);

    PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener);

    PluginUIBuilder padding(int i);

    PluginUIBuilder padding(int i, int i2, int i3, int i4);

    PluginUIBuilder paddingBottom(int i);

    PluginUIBuilder paddingBottomDp(float f);

    PluginUIBuilder paddingDp(float f);

    PluginUIBuilder paddingDp(float f, float f2, float f3, float f4);

    PluginUIBuilder paddingHorizontal(int i);

    PluginUIBuilder paddingHorizontalDp(float f);

    PluginUIBuilder paddingLeft(int i);

    PluginUIBuilder paddingLeftDp(float f);

    PluginUIBuilder paddingRight(int i);

    PluginUIBuilder paddingRightDp(float f);

    PluginUIBuilder paddingTop(int i);

    PluginUIBuilder paddingTopDp(float f);

    PluginUIBuilder paddingVertical(int i);

    PluginUIBuilder paddingVerticalDp(float f);

    PluginUIBuilder requestFocus();

    String requireId();

    PluginUIBuilder size(int i, int i2);

    PluginUIBuilder sizeDp(float f, float f2);

    PluginUIBuilder tag(Object obj);

    PluginUIBuilder unifyWidth(String... strArr);

    PluginUIBuilder visible();

    PluginUIBuilder width(int i);

    PluginUIBuilder widthDp(float f);

    PluginUIBuilder widthMatchParent();

    PluginUIBuilder widthWrapContent();
}
