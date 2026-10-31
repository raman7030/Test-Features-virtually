.class public final Ll/᩺᩺;
.super Ll/ᩳܰ;
.source "R9NW"


# static fields
.field public static final ۜ:Landroid/view/animation/PathInterpolator;

.field public static final ܳ:Landroid/view/animation/DecelerateInterpolator;

.field public static final synthetic ܿ:I

.field public static final ᩻:Ll/ۢۢ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 595
    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3f8ccccd    # 1.1f

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v3, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Ll/᩺᩺;->ۜ:Landroid/view/animation/PathInterpolator;

    .line 602
    new-instance v0, Ll/ۢۢ֫;

    invoke-direct {v0}, Ll/ۢۢ֫;-><init>()V

    sput-object v0, Ll/᩺᩺;->᩻:Ll/ۢۢ֫;

    .line 608
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Ll/᩺᩺;->ܳ:Landroid/view/animation/DecelerateInterpolator;

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    const v0, 0x7f0a05ae

    .line 869
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object p1

    .line 872
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ILl/᩸ܰ;Ll/᩸ܰ;)Landroid/view/animation/Interpolator;
    .locals 1

    const/16 v0, 0x8

    and-int/2addr p0, v0

    if-eqz p0, :cond_1

    .line 693
    invoke-virtual {p1, v0}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object p0

    iget p0, p0, Ll/ۧ۬;->֫:I

    .line 694
    invoke-virtual {p2, v0}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object p1

    iget p1, p1, Ll/ۧ۬;->֫:I

    if-le p0, p1, :cond_0

    .line 695
    sget-object p0, Ll/᩺᩺;->ۜ:Landroid/view/animation/PathInterpolator;

    return-object p0

    .line 697
    :cond_0
    sget-object p0, Ll/᩺᩺;->᩻:Ll/ۢۢ֫;

    return-object p0

    .line 700
    :cond_1
    sget-object p0, Ll/᩺᩺;->ܳ:Landroid/view/animation/DecelerateInterpolator;

    return-object p0
.end method

.method public static ֫(Landroid/view/View;)Ll/۬᩺;
    .locals 1

    const v0, 0x7f0a05b6

    .line 956
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    .line 959
    instance-of v0, p0, Ll/ۨ᩺;

    if-eqz v0, :cond_0

    .line 960
    check-cast p0, Ll/ۨ᩺;

    iget-object p0, p0, Ll/ۨ᩺;->֫:Ll/۬᩺;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Landroid/view/View;Ll/ܿܰ;)V
    .locals 2

    .line 938
    invoke-static {p0}, Ll/᩺᩺;->֫(Landroid/view/View;)Ll/۬᩺;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 940
    invoke-virtual {v0, p1}, Ll/۬᩺;->onEnd(Ll/ܿܰ;)V

    .line 941
    invoke-virtual {v0}, Ll/۬᩺;->getDispatchMode()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 945
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 946
    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    .line 947
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 948
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 949
    invoke-static {v1, p1}, Ll/᩺᩺;->֫(Landroid/view/View;Ll/ܿܰ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/ܿܰ;Landroid/view/WindowInsets;Z)V
    .locals 2

    .line 877
    invoke-static {p0}, Ll/᩺᩺;->֫(Landroid/view/View;)Ll/۬᩺;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 879
    iput-object p2, v0, Ll/۬᩺;->mDispachedInsets:Landroid/view/WindowInsets;

    if-nez p3, :cond_1

    .line 881
    invoke-virtual {v0, p1}, Ll/۬᩺;->onPrepare(Ll/ܿܰ;)V

    .line 882
    invoke-virtual {v0}, Ll/۬᩺;->getDispatchMode()I

    move-result p3

    if-nez p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 888
    :cond_1
    :goto_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 889
    check-cast p0, Landroid/view/ViewGroup;

    .line 890
    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 891
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 892
    invoke-static {v0, p1, p2, p3}, Ll/᩺᩺;->֫(Landroid/view/View;Ll/ܿܰ;Landroid/view/WindowInsets;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/ܿܰ;Ll/ۗ᩺;)V
    .locals 2

    .line 900
    invoke-static {p0}, Ll/᩺᩺;->֫(Landroid/view/View;)Ll/۬᩺;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 902
    invoke-virtual {v0, p1, p2}, Ll/۬᩺;->onStart(Ll/ܿܰ;Ll/ۗ᩺;)Ll/ۗ᩺;

    .line 903
    invoke-virtual {v0}, Ll/۬᩺;->getDispatchMode()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 907
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 908
    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    .line 909
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 910
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 911
    invoke-static {v1, p1, p2}, Ll/᩺᩺;->֫(Landroid/view/View;Ll/ܿܰ;Ll/ۗ᩺;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/᩸ܰ;Ljava/util/List;)V
    .locals 2

    .line 919
    invoke-static {p0}, Ll/᩺᩺;->֫(Landroid/view/View;)Ll/۬᩺;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 922
    invoke-virtual {v0, p1, p2}, Ll/۬᩺;->onProgress(Ll/᩸ܰ;Ljava/util/List;)Ll/᩸ܰ;

    move-result-object p1

    .line 923
    invoke-virtual {v0}, Ll/۬᩺;->getDispatchMode()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 927
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 928
    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    .line 929
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 930
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 931
    invoke-static {v1, p1, p2}, Ll/᩺᩺;->֫(Landroid/view/View;Ll/᩸ܰ;Ljava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
