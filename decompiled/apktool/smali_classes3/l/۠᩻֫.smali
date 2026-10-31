.class public final Ll/۠᩻֫;
.super Ljava/lang/Object;
.source "G1H1"


# direct methods
.method public static ֫(Landroid/content/Context;I)I
    .locals 1

    const v0, 0x1030001

    .line 169
    filled-new-array {p1}, [I

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, -0x1

    .line 171
    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 172
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return p1
.end method

.method public static ֫(Landroid/content/Context;Ll/ۡ᩻֫;ZZ)Ll/ۚ᩻֫;
    .locals 4

    .line 45
    invoke-virtual {p1}, Ll/ۡ᩻֫;->getNextTransition()I

    move-result v0

    if-eqz p3, :cond_1

    if-eqz p2, :cond_0

    .line 123
    invoke-virtual {p1}, Ll/ۡ᩻֫;->getPopEnterAnim()I

    move-result p3

    goto :goto_0

    .line 125
    :cond_0
    invoke-virtual {p1}, Ll/ۡ᩻֫;->getPopExitAnim()I

    move-result p3

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 129
    invoke-virtual {p1}, Ll/ۡ᩻֫;->getEnterAnim()I

    move-result p3

    goto :goto_0

    .line 131
    :cond_2
    invoke-virtual {p1}, Ll/ۡ᩻֫;->getExitAnim()I

    move-result p3

    :goto_0
    const/4 v1, 0x0

    .line 48
    invoke-virtual {p1, v1, v1, v1, v1}, Ll/ۡ᩻֫;->setAnimations(IIII)V

    .line 54
    iget-object v1, p1, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    const v3, 0x7f0a0690

    .line 55
    invoke-virtual {v1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 56
    iget-object v1, p1, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v1, v3, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 59
    :cond_3
    iget-object v1, p1, Ll/ۡ᩻֫;->mContainer:Landroid/view/ViewGroup;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    move-result-object v1

    if-eqz v1, :cond_4

    return-object v2

    .line 63
    :cond_4
    invoke-virtual {p1, v0, p2, p3}, Ll/ۡ᩻֫;->onCreateAnimation(IZI)Landroid/view/animation/Animation;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 65
    new-instance p0, Ll/ۚ᩻֫;

    invoke-direct {p0, v1}, Ll/ۚ᩻֫;-><init>(Landroid/view/animation/Animation;)V

    return-object p0

    .line 68
    :cond_5
    invoke-virtual {p1, v0, p2, p3}, Ll/ۡ᩻֫;->onCreateAnimator(IZI)Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 70
    new-instance p0, Ll/ۚ᩻֫;

    invoke-direct {p0, p1}, Ll/ۚ᩻֫;-><init>(Landroid/animation/Animator;)V

    return-object p0

    :cond_6
    if-nez p3, :cond_11

    if-eqz v0, :cond_11

    const/16 p1, 0x1001

    if-eq v0, p1, :cond_f

    const/16 p1, 0x2002

    if-eq v0, p1, :cond_d

    const/16 p1, 0x2005

    if-eq v0, p1, :cond_b

    const/16 p1, 0x1003

    if-eq v0, p1, :cond_9

    const/16 p1, 0x1004

    if-eq v0, p1, :cond_7

    const/4 p3, -0x1

    goto :goto_2

    :cond_7
    if-eqz p2, :cond_8

    const p1, 0x10100b8

    .line 152
    invoke-static {p0, p1}, Ll/۠᩻֫;->֫(Landroid/content/Context;I)I

    move-result p1

    goto :goto_1

    :cond_8
    const p1, 0x10100b9

    .line 153
    invoke-static {p0, p1}, Ll/۠᩻֫;->֫(Landroid/content/Context;I)I

    move-result p1

    goto :goto_1

    :cond_9
    if-eqz p2, :cond_a

    const p3, 0x7f020008

    goto :goto_2

    :cond_a
    const p3, 0x7f020009

    goto :goto_2

    :cond_b
    if-eqz p2, :cond_c

    const p1, 0x10100ba

    .line 157
    invoke-static {p0, p1}, Ll/۠᩻֫;->֫(Landroid/content/Context;I)I

    move-result p1

    goto :goto_1

    :cond_c
    const p1, 0x10100bb

    .line 159
    invoke-static {p0, p1}, Ll/۠᩻֫;->֫(Landroid/content/Context;I)I

    move-result p1

    :goto_1
    move p3, p1

    goto :goto_2

    :cond_d
    if-eqz p2, :cond_e

    const p3, 0x7f020006

    goto :goto_2

    :cond_e
    const p3, 0x7f020007

    goto :goto_2

    :cond_f
    if-eqz p2, :cond_10

    const p3, 0x7f02000a

    goto :goto_2

    :cond_10
    const p3, 0x7f02000b

    :cond_11
    :goto_2
    if-eqz p3, :cond_14

    .line 78
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "anim"

    .line 79
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 84
    :try_start_0
    invoke-static {p0, p3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p2

    if-eqz p2, :cond_14

    .line 86
    new-instance v0, Ll/ۚ᩻֫;

    invoke-direct {v0, p2}, Ll/ۚ᩻֫;-><init>(Landroid/view/animation/Animation;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    :catch_0
    move-exception p0

    .line 91
    throw p0

    .line 99
    :catch_1
    :cond_12
    :try_start_1
    invoke-static {p0, p3}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object p2

    if-eqz p2, :cond_14

    .line 101
    new-instance v0, Ll/ۚ᩻֫;

    invoke-direct {v0, p2}, Ll/ۚ᩻֫;-><init>(Landroid/animation/Animator;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    return-object v0

    :catch_2
    move-exception p2

    if-nez p1, :cond_13

    .line 109
    invoke-static {p0, p3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p0

    if-eqz p0, :cond_14

    .line 111
    new-instance p1, Ll/ۚ᩻֫;

    invoke-direct {p1, p0}, Ll/ۚ᩻֫;-><init>(Landroid/view/animation/Animation;)V

    return-object p1

    .line 106
    :cond_13
    throw p2

    :cond_14
    return-object v2
.end method
