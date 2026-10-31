.class public abstract Ll/֨᩷;
.super Landroid/view/ViewGroup;
.source "64NR"


# instance fields
.field public ۗ:Ll/ۡۢ;

.field public ۙ:Z

.field public ۤ:Ll/ܶ᩺;

.field public final ۫:Ll/ۚ᩷;

.field public final ۬:Landroid/content/Context;

.field public ᩶:Z

.field public ᩸:Ll/ܿۢ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, p1, p2, v0}, Ll/֨᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 62
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    new-instance p2, Ll/ۚ᩷;

    invoke-direct {p2, p0}, Ll/ۚ᩷;-><init>(Ll/֨᩷;)V

    iput-object p2, p0, Ll/֨᩷;->۫:Ll/ۚ᩷;

    .line 64
    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    const v0, 0x7f040002

    const/4 v1, 0x1

    invoke-virtual {p3, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p3

    if-eqz p3, :cond_0

    iget p3, p2, Landroid/util/TypedValue;->resourceId:I

    if-eqz p3, :cond_0

    .line 67
    new-instance p3, Landroid/view/ContextThemeWrapper;

    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {p3, p1, p2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object p3, p0, Ll/֨᩷;->۬:Landroid/content/Context;

    return-void

    .line 69
    :cond_0
    iput-object p1, p0, Ll/֨᩷;->۬:Landroid/content/Context;

    return-void
.end method

.method public static ֫(IIILandroid/view/View;Z)I
    .locals 3

    .line 262
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 263
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    const/4 v2, 0x2

    .line 264
    invoke-static {p2, v1, v2, p1}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result p1

    if-eqz p4, :cond_0

    sub-int p2, p0, v0

    add-int/2addr v1, p1

    .line 267
    invoke-virtual {p3, p2, p1, p0, v1}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    :cond_0
    add-int p2, p0, v0

    add-int/2addr v1, p1

    .line 269
    invoke-virtual {p3, p0, p1, p2, v1}, Landroid/view/View;->layout(IIII)V

    :goto_0
    if-eqz p4, :cond_1

    neg-int p0, v0

    return p0

    :cond_1
    return v0
.end method

.method public static ֫(Landroid/view/View;II)I
    .locals 1

    const/high16 v0, -0x80000000

    .line 248
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, v0, p2}, Landroid/view/View;->measure(II)V

    .line 251
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    sub-int/2addr p1, p0

    const/4 p0, 0x0

    .line 254
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static synthetic ֫(Ll/֨᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 36
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/֨᩷;I)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 75
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    sget-object v1, Ll/ۗᩳ;->֫:[I

    const v2, 0x7f040005

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 v0, 0xd

    .line 81
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v0

    invoke-virtual {p0, v0}, Ll/֨᩷;->֫(I)V

    .line 82
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 84
    iget-object p1, p0, Ll/֨᩷;->᩸:Ll/ܿۢ;

    if-eqz p1, :cond_0

    .line 85
    invoke-virtual {p1}, Ll/ܿۢ;->ܿ()V

    :cond_0
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 120
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    if-ne v0, v2, :cond_0

    .line 122
    iput-boolean v1, p0, Ll/֨᩷;->᩶:Z

    .line 125
    :cond_0
    iget-boolean v3, p0, Ll/֨᩷;->᩶:Z

    const/4 v4, 0x1

    if-nez v3, :cond_1

    .line 126
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-ne v0, v2, :cond_1

    if-nez p1, :cond_1

    .line 128
    iput-boolean v4, p0, Ll/֨᩷;->᩶:Z

    :cond_1
    const/16 p1, 0xa

    if-eq v0, p1, :cond_3

    const/4 p1, 0x3

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    return v4

    .line 134
    :cond_3
    :goto_0
    iput-boolean v1, p0, Ll/֨᩷;->᩶:Z

    return v4
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 96
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 98
    iput-boolean v1, p0, Ll/֨᩷;->ۙ:Z

    .line 101
    :cond_0
    iget-boolean v2, p0, Ll/֨᩷;->ۙ:Z

    const/4 v3, 0x1

    if-nez v2, :cond_1

    .line 102
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez v0, :cond_1

    if-nez p1, :cond_1

    .line 104
    iput-boolean v3, p0, Ll/֨᩷;->ۙ:Z

    :cond_1
    if-eq v0, v3, :cond_3

    const/4 p1, 0x3

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    return v3

    .line 109
    :cond_3
    :goto_0
    iput-boolean v1, p0, Ll/֨᩷;->ۙ:Z

    return v3
.end method

.method public setVisibility(I)V
    .locals 1

    .line 187
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq p1, v0, :cond_1

    .line 188
    iget-object v0, p0, Ll/֨᩷;->ۤ:Ll/ܶ᩺;

    if-eqz v0, :cond_0

    .line 189
    invoke-virtual {v0}, Ll/ܶ᩺;->֫()V

    .line 191
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public ֫(I)V
    .locals 0

    .line 141
    iput p1, p0, Ll/֨᩷;->᩹:I

    .line 142
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
