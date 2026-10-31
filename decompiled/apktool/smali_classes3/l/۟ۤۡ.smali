.class public final Ll/۟ۤۡ;
.super Ljava/lang/Object;
.source "Q159"


# static fields
.field public static ֫:I = -0x1


# direct methods
.method public static ֫(Landroid/content/Context;)Z
    .locals 6

    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    const/4 v3, 0x1

    if-lt v0, v1, :cond_3

    .line 48
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 49
    sget v1, Ll/۟ۤۡ;->֫:I

    const/4 v4, -0x1

    if-ne v1, v4, :cond_1

    const-string v1, "config_navBarInteractionMode"

    const-string v4, "integer"

    const-string v5, "android"

    .line 50
    invoke-virtual {v0, v1, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    sput v1, Ll/۟ۤۡ;->֫:I

    .line 52
    :cond_1
    sget v1, Ll/۟ۤۡ;->֫:I

    if-eqz v1, :cond_3

    .line 53
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x2

    if-ne p0, v0, :cond_2

    return v3

    :cond_2
    :goto_0
    return v2

    :catch_0
    nop

    .line 59
    :cond_3
    invoke-static {}, Ll/ۗᩴܺ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 60
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "force_fsg_nav_bar"

    invoke-static {p0, v0, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-eqz p0, :cond_4

    const/4 v2, 0x1

    :cond_4
    return v2

    .line 62
    :cond_5
    invoke-static {}, Ll/ۗᩴܺ;->ܿ()Z

    move-result v0

    const-string v1, "navigation_gesture_on"

    if-nez v0, :cond_f

    invoke-static {}, Ll/ۗᩴܺ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_1

    .line 65
    :cond_6
    invoke-static {}, Ll/ۗᩴܺ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 66
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "navigationbar_hide_bar_enabled"

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_7

    .line 67
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-static {p0, v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-eqz p0, :cond_8

    :cond_7
    const/4 v2, 0x1

    :cond_8
    return v2

    .line 69
    :cond_9
    invoke-static {}, Ll/ۗᩴܺ;->ۧ()Z

    move-result v0

    const-string v3, "navigationbar_is_min"

    if-eqz v0, :cond_c

    .line 70
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0, v3, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_a

    .line 71
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-static {p0, v3, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-eqz p0, :cond_b

    :cond_a
    const/4 v2, 0x1

    :cond_b
    return v2

    .line 73
    :cond_c
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0, v3, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_d

    .line 74
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-static {p0, v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-eqz p0, :cond_e

    :cond_d
    const/4 v2, 0x1

    :cond_e
    return v2

    .line 63
    :cond_f
    :goto_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-static {p0, v1, v2}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-eqz p0, :cond_10

    const/4 v2, 0x1

    :cond_10
    return v2
.end method
