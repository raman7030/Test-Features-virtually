.class public final Ll/ܿܳ;
.super Ljava/lang/Object;
.source "422Y"


# direct methods
.method public static ֫(Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 3902
    invoke-virtual {p0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/os/PowerManager;)Z
    .locals 0

    .line 3897
    invoke-virtual {p0}, Landroid/os/PowerManager;->isPowerSaveMode()Z

    move-result p0

    return p0
.end method
