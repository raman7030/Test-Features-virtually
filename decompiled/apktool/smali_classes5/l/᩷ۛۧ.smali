.class public Ll/᩷ۛۧ;
.super Ll/֫᩺ۧ;
.source "P5CY"


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 90
    invoke-direct {p0}, Ll/֫᩺ۧ;-><init>()V

    .line 91
    invoke-virtual {p0, p1}, Ll/֫᩺ۧ;->setMode(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 101
    invoke-direct {p0, p1, p2}, Ll/֫᩺ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 102
    sget-object v0, Ll/ܶۛۧ;->ܽ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 104
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const/4 v0, 0x0

    .line 105
    invoke-virtual {p0}, Ll/֫᩺ۧ;->getMode()I

    move-result v1

    const-string v2, "fadingMode"

    .line 104
    invoke-static {p1, p2, v2, v0, v1}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    .line 106
    invoke-virtual {p0, p2}, Ll/֫᩺ۧ;->setMode(I)V

    .line 107
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static ֫(Ll/᩵ۨۧ;F)F
    .locals 1

    if-eqz p0, :cond_0

    .line 178
    iget-object p0, p0, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    const-string v0, "android:fade:transitionAlpha"

    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    if-eqz p0, :cond_0

    .line 180
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0

    :cond_0
    return p1
.end method

.method private ֫(FFLandroid/view/View;)Landroid/animation/ObjectAnimator;
    .locals 2

    cmpl-float v0, p1, p2

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 136
    :cond_0
    invoke-static {p3, p1}, Ll/᩸ۨۧ;->֫(Landroid/view/View;F)V

    .line 137
    sget-object p1, Ll/᩸ۨۧ;->ۧ:Landroid/util/Property;

    const/4 v0, 0x1

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p2, v0, v1

    invoke-static {p3, p1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 142
    new-instance p2, Ll/ۜۛۧ;

    invoke-direct {p2, p3}, Ll/ۜۛۧ;-><init>(Landroid/view/View;)V

    .line 143
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 144
    invoke-virtual {p0}, Ll/ܽۨۧ;->getRootTransition()Ll/ܽۨۧ;

    move-result-object p3

    invoke-virtual {p3, p2}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-object p1
.end method


# virtual methods
.method public final captureStartValues(Ll/᩵ۨۧ;)V
    .locals 2

    .line 112
    invoke-super {p0, p1}, Ll/֫᩺ۧ;->captureStartValues(Ll/᩵ۨۧ;)V

    .line 113
    iget-object v0, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    const v1, 0x7f0a064a

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-nez v0, :cond_1

    .line 115
    iget-object v0, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 116
    iget-object v0, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    invoke-static {v0}, Ll/᩸ۨۧ;->֫(Landroid/view/View;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 118
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 121
    :cond_1
    :goto_0
    iget-object p1, p1, Ll/᩵ۨۧ;->ۧ:Ljava/util/HashMap;

    const-string v1, "android:fade:transitionAlpha"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final isSeekingSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final onAppear(Landroid/view/ViewGroup;Landroid/view/View;Ll/᩵ۨۧ;Ll/᩵ۨۧ;)Landroid/animation/Animator;
    .locals 0

    .line 157
    invoke-static {}, Ll/᩸ۨۧ;->ۧ()V

    const/4 p1, 0x0

    .line 158
    invoke-static {p3, p1}, Ll/᩷ۛۧ;->֫(Ll/᩵ۨۧ;F)F

    move-result p1

    const/high16 p3, 0x3f800000    # 1.0f

    .line 159
    invoke-direct {p0, p1, p3, p2}, Ll/᩷ۛۧ;->֫(FFLandroid/view/View;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    return-object p1
.end method

.method public final onDisappear(Landroid/view/ViewGroup;Landroid/view/View;Ll/᩵ۨۧ;Ll/᩵ۨۧ;)Landroid/animation/Animator;
    .locals 1

    .line 166
    invoke-static {}, Ll/᩸ۨۧ;->ۧ()V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 167
    invoke-static {p3, p1}, Ll/᩷ۛۧ;->֫(Ll/᩵ۨۧ;F)F

    move-result p3

    const/4 v0, 0x0

    .line 168
    invoke-direct {p0, p3, v0, p2}, Ll/᩷ۛۧ;->֫(FFLandroid/view/View;)Landroid/animation/ObjectAnimator;

    move-result-object p3

    if-nez p3, :cond_0

    .line 170
    invoke-static {p4, p1}, Ll/᩷ۛۧ;->֫(Ll/᩵ۨۧ;F)F

    move-result p1

    invoke-static {p2, p1}, Ll/᩸ۨۧ;->֫(Landroid/view/View;F)V

    :cond_0
    return-object p3
.end method
