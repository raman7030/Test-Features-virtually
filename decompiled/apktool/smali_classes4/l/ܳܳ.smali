.class public final Ll/ܳܳ;
.super Ljava/lang/Object;
.source "422Y"


# direct methods
.method public static ֫(Landroid/content/res/Configuration;)Ll/ۘ۫;
    .locals 0

    .line 3925
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۘ۫;->֫(Ljava/lang/String;)Ll/ۘ۫;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V
    .locals 1

    .line 3915
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object p0

    .line 3916
    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v0

    .line 3917
    invoke-virtual {p0, v0}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 3918
    invoke-virtual {p2, v0}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 3919
    iget-object p0, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object p0, p2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/content/res/Configuration;Ll/ۘ۫;)V
    .locals 0

    .line 3930
    invoke-virtual {p1}, Ll/ۘ۫;->ܽ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    return-void
.end method

.method public static ֫(Ll/ۘ۫;)V
    .locals 0

    .line 3935
    invoke-virtual {p0}, Ll/ۘ۫;->ܽ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {p0}, Landroid/os/LocaleList;->setDefault(Landroid/os/LocaleList;)V

    return-void
.end method
