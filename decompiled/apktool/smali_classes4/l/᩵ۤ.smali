.class public final Ll/᩵ۤ;
.super Ljava/lang/Object;
.source "O529"


# direct methods
.method public static ֫(Ljava/lang/Object;)Landroid/icu/util/ULocale;
    .locals 0

    .line 165
    check-cast p0, Landroid/icu/util/ULocale;

    invoke-static {p0}, Landroid/icu/util/ULocale;->addLikelySubtags(Landroid/icu/util/ULocale;)Landroid/icu/util/ULocale;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/Locale;)Landroid/icu/util/ULocale;
    .locals 0

    .line 160
    invoke-static {p0}, Landroid/icu/util/ULocale;->forLocale(Ljava/util/Locale;)Landroid/icu/util/ULocale;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 170
    check-cast p0, Landroid/icu/util/ULocale;

    invoke-virtual {p0}, Landroid/icu/util/ULocale;->getScript()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
