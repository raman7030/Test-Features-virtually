package bin.mt.plugin.api.ui;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public interface PluginView {
    public static final int GONE = 8;
    public static final int INVISIBLE = 4;
    public static final int MATCH_PARENT = -1;
    public static final int VISIBLE = 0;
    public static final int WRAP_CONTENT = -2;

    public interface OnClickListener {
        void onClick(PluginView pluginView);
    }

    public interface OnLongClickListener {
        boolean onLongClick(PluginView pluginView);
    }

    PluginView findViewById(String str);

    float getAlpha();

    Drawable getBackground();

    int getHeight();

    String getId();

    int getLayoutGravity();

    float getLayoutWeight();

    int getMarginBottom();

    int getMarginLeft();

    int getMarginRight();

    int getMarginTop();

    int getPaddingBottom();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingTop();

    PluginViewGroup getParentView();

    PluginUI getPluginUI();

    PluginViewGroup getRootView();

    Object getTag();

    int getViewHeight();

    int getViewWidth();

    int getVisibility();

    int getWidth();

    boolean isEnabled();

    boolean isFocused();

    boolean performClick();

    boolean performLongClick();

    boolean requestFocus();

    String requireId();

    PluginViewGroup requireParentView();

    PluginView requireViewById(String str);

    void setAlpha(float f);

    void setBackground(Drawable drawable);

    void setBackgroundColor(int i);

    void setEnabled(boolean z);

    void setGone();

    void setHeight(int i);

    void setHeightDp(float f);

    void setInvisible();

    void setLayoutGravity(int i);

    void setLayoutWeight(float f);

    void setMargin(int i);

    void setMargin(int i, int i2, int i3, int i4);

    void setMarginBottom(int i);

    void setMarginBottomDp(float f);

    void setMarginDp(float f);

    void setMarginDp(float f, float f2, float f3, float f4);

    void setMarginHorizontal(int i);

    void setMarginHorizontalDp(float f);

    void setMarginLeft(int i);

    void setMarginLeftDp(float f);

    void setMarginRight(int i);

    void setMarginRightDp(float f);

    void setMarginTop(int i);

    void setMarginTopDp(float f);

    void setMarginVertical(int i);

    void setMarginVerticalDp(float f);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnLongClickListener(OnLongClickListener onLongClickListener);

    void setPadding(int i);

    void setPadding(int i, int i2, int i3, int i4);

    void setPaddingBottom(int i);

    void setPaddingBottomDp(float f);

    void setPaddingDp(float f);

    void setPaddingDp(float f, float f2, float f3, float f4);

    void setPaddingHorizontal(int i);

    void setPaddingHorizontalDp(float f);

    void setPaddingLeft(int i);

    void setPaddingLeftDp(float f);

    void setPaddingRight(int i);

    void setPaddingRightDp(float f);

    void setPaddingTop(int i);

    void setPaddingTopDp(float f);

    void setPaddingVertical(int i);

    void setPaddingVerticalDp(float f);

    void setSize(int i, int i2);

    void setSizeDp(float f, float f2);

    void setTag(Object obj);

    void setVisibility(int i);

    void setVisible();

    void setWidth(int i);

    void setWidthDp(float f);

    void unifyWidth(PluginView... pluginViewArr);

    void unifyWidth(String... strArr);
}
