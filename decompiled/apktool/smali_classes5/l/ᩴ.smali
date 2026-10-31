.class public Ll/ᩴ;
.super Ll/᩸ۧ;
.source "95XT"


# virtual methods
.method public final ֫(ILandroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 1056
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1058
    :try_start_0
    invoke-virtual {p2}, Landroid/os/BaseBundle;->isEmpty()Z
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p2, v0

    :cond_0
    :goto_0
    if-nez p1, :cond_3

    if-eqz p2, :cond_3

    const-string p1, "media_item"

    .line 2295
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2299
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 2300
    instance-of p2, p1, Ll/ܶ;

    if-eqz p2, :cond_1

    goto :goto_1

    .line 2303
    :cond_1
    throw v0

    .line 2301
    :cond_2
    :goto_1
    check-cast p1, Ll/ܶ;

    throw v0

    .line 2296
    :cond_3
    throw v0
.end method
