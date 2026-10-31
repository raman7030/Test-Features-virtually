.class public Ll/ۗۨۧ;
.super Ll/᩶ۨۧ;
.source "X62V"


# static fields
.field public static ܳ:Z = true

.field public static ᩻:Z = true


# virtual methods
.method public ֫(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    .line 47
    sget-boolean v0, Ll/ۗۨۧ;->ܳ:Z

    if-eqz v0, :cond_0

    .line 51
    :try_start_0
    invoke-static {p1, p2}, Ll/ۙۨۧ;->ۧ(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    .line 53
    sput-boolean p1, Ll/ۗۨۧ;->ܳ:Z

    :cond_0
    return-void
.end method

.method public ۧ(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    .line 61
    sget-boolean v0, Ll/ۗۨۧ;->᩻:Z

    if-eqz v0, :cond_0

    .line 65
    :try_start_0
    invoke-static {p1, p2}, Ll/ۙۨۧ;->ܽ(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    .line 67
    sput-boolean p1, Ll/ۗۨۧ;->᩻:Z

    :cond_0
    return-void
.end method
