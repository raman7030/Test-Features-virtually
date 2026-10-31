.class public Ll/۫ۨۧ;
.super Ll/ۗۨۧ;
.source "N619"


# static fields
.field public static ۜ:Z = true


# virtual methods
.method public ֫(Landroid/view/View;IIII)V
    .locals 1

    .line 37
    sget-boolean v0, Ll/۫ۨۧ;->ۜ:Z

    if-eqz v0, :cond_0

    .line 41
    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, Ll/۬ۨۧ;->֫(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    .line 43
    sput-boolean p1, Ll/۫ۨۧ;->ۜ:Z

    :cond_0
    return-void
.end method
