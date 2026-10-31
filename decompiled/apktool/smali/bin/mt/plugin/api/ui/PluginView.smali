.class public interface abstract Lbin/mt/plugin/api/ui/PluginView;
.super Ljava/lang/Object;
.source "PluginView.java"


# static fields
.field public static final GONE:I = 0x8

.field public static final INVISIBLE:I = 0x4

.field public static final MATCH_PARENT:I = -0x1

.field public static final VISIBLE:I = 0x0

.field public static final WRAP_CONTENT:I = -0x2


# virtual methods
.method public abstract findViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;
.end method

.method public abstract getAlpha()F
.end method

.method public abstract getBackground()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getHeight()I
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract getLayoutGravity()I
.end method

.method public abstract getLayoutWeight()F
.end method

.method public abstract getMarginBottom()I
.end method

.method public abstract getMarginLeft()I
.end method

.method public abstract getMarginRight()I
.end method

.method public abstract getMarginTop()I
.end method

.method public abstract getPaddingBottom()I
.end method

.method public abstract getPaddingLeft()I
.end method

.method public abstract getPaddingRight()I
.end method

.method public abstract getPaddingTop()I
.end method

.method public abstract getParentView()Lbin/mt/plugin/api/ui/PluginViewGroup;
.end method

.method public abstract getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;
.end method

.method public abstract getRootView()Lbin/mt/plugin/api/ui/PluginViewGroup;
.end method

.method public abstract getTag()Ljava/lang/Object;
.end method

.method public abstract getViewHeight()I
.end method

.method public abstract getViewWidth()I
.end method

.method public abstract getVisibility()I
.end method

.method public abstract getWidth()I
.end method

.method public abstract isEnabled()Z
.end method

.method public abstract isFocused()Z
.end method

.method public abstract performClick()Z
.end method

.method public abstract performLongClick()Z
.end method

.method public abstract requestFocus()Z
.end method

.method public abstract requireId()Ljava/lang/String;
.end method

.method public abstract requireParentView()Lbin/mt/plugin/api/ui/PluginViewGroup;
.end method

.method public abstract requireViewById(Ljava/lang/String;)Lbin/mt/plugin/api/ui/PluginView;
.end method

.method public abstract setAlpha(F)V
.end method

.method public abstract setBackground(Landroid/graphics/drawable/Drawable;)V
.end method

.method public abstract setBackgroundColor(I)V
.end method

.method public abstract setEnabled(Z)V
.end method

.method public abstract setGone()V
.end method

.method public abstract setHeight(I)V
.end method

.method public abstract setHeightDp(F)V
.end method

.method public abstract setInvisible()V
.end method

.method public abstract setLayoutGravity(I)V
.end method

.method public abstract setLayoutWeight(F)V
.end method

.method public abstract setMargin(I)V
.end method

.method public abstract setMargin(IIII)V
.end method

.method public abstract setMarginBottom(I)V
.end method

.method public abstract setMarginBottomDp(F)V
.end method

.method public abstract setMarginDp(F)V
.end method

.method public abstract setMarginDp(FFFF)V
.end method

.method public abstract setMarginHorizontal(I)V
.end method

.method public abstract setMarginHorizontalDp(F)V
.end method

.method public abstract setMarginLeft(I)V
.end method

.method public abstract setMarginLeftDp(F)V
.end method

.method public abstract setMarginRight(I)V
.end method

.method public abstract setMarginRightDp(F)V
.end method

.method public abstract setMarginTop(I)V
.end method

.method public abstract setMarginTopDp(F)V
.end method

.method public abstract setMarginVertical(I)V
.end method

.method public abstract setMarginVerticalDp(F)V
.end method

.method public abstract setOnClickListener(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)V
.end method

.method public abstract setOnLongClickListener(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)V
.end method

.method public abstract setPadding(I)V
.end method

.method public abstract setPadding(IIII)V
.end method

.method public abstract setPaddingBottom(I)V
.end method

.method public abstract setPaddingBottomDp(F)V
.end method

.method public abstract setPaddingDp(F)V
.end method

.method public abstract setPaddingDp(FFFF)V
.end method

.method public abstract setPaddingHorizontal(I)V
.end method

.method public abstract setPaddingHorizontalDp(F)V
.end method

.method public abstract setPaddingLeft(I)V
.end method

.method public abstract setPaddingLeftDp(F)V
.end method

.method public abstract setPaddingRight(I)V
.end method

.method public abstract setPaddingRightDp(F)V
.end method

.method public abstract setPaddingTop(I)V
.end method

.method public abstract setPaddingTopDp(F)V
.end method

.method public abstract setPaddingVertical(I)V
.end method

.method public abstract setPaddingVerticalDp(F)V
.end method

.method public abstract setSize(II)V
.end method

.method public abstract setSizeDp(FF)V
.end method

.method public abstract setTag(Ljava/lang/Object;)V
.end method

.method public abstract setVisibility(I)V
.end method

.method public abstract setVisible()V
.end method

.method public abstract setWidth(I)V
.end method

.method public abstract setWidthDp(F)V
.end method

.method public varargs abstract unifyWidth([Lbin/mt/plugin/api/ui/PluginView;)V
.end method

.method public varargs abstract unifyWidth([Ljava/lang/String;)V
.end method
