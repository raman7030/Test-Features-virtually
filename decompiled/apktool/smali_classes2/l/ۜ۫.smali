.class public final Ll/ۜ۫;
.super Ljava/lang/Object;
.source "G3C1"


# direct methods
.method public static ֫(Landroid/content/res/Configuration;)Landroid/os/LocaleList;
    .locals 0

    .line 75
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/res/Configuration;Ll/ۘ۫;)V
    .locals 0

    .line 81
    invoke-virtual {p1}, Ll/ۘ۫;->ᩳ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/LocaleList;

    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    return-void
.end method
