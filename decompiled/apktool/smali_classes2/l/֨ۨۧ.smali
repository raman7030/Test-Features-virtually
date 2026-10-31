.class public final Ll/֨ۨۧ;
.super Ljava/lang/Object;
.source "W5UQ"


# static fields
.field public static ֫:Z = true


# direct methods
.method public static ֫(Landroid/view/ViewGroup;Z)V
    .locals 2

    .line 47
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 48
    invoke-static {p0, p1}, Ll/ۚۨۧ;->֫(Landroid/view/ViewGroup;Z)V

    return-void

    .line 56
    :cond_0
    sget-boolean v0, Ll/֨ۨۧ;->֫:Z

    if-eqz v0, :cond_1

    .line 60
    :try_start_0
    invoke-static {p0, p1}, Ll/ۚۨۧ;->֫(Landroid/view/ViewGroup;Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p0, 0x0

    .line 62
    sput-boolean p0, Ll/֨ۨۧ;->֫:Z

    :cond_1
    return-void
.end method
