.class public final Ll/᩺ܶ᩵;
.super Ljava/lang/Object;
.source "ZB02"


# direct methods
.method public static ֫(Ll/ۗۗ᩵;Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;
    .locals 2

    const-string v0, "key"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    instance-of v0, p1, Ll/ۗܶ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 57
    check-cast p1, Ll/ۗܶ᩵;

    invoke-virtual {p0}, Ll/ۙܶ᩵;->getKey()Ll/ܿ᩸᩵;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۗܶ᩵;->֫(Ll/ܿ᩸᩵;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, p0}, Ll/ۗܶ᩵;->֫(Ll/ۗۗ᩵;)Ll/ᩳ᩸᩵;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    return-object v1

    .line 60
    :cond_1
    sget-object v0, Ll/۟ܶ᩵;->֡:Ll/ܰܶ᩵;

    sget-object v0, Ll/ܰܶ᩵;->᩸:Ll/ܰܶ᩵;

    if-ne v0, p1, :cond_2

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static ۧ(Ll/ۗۗ᩵;Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 1

    const-string v0, "key"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    instance-of v0, p1, Ll/ۗܶ᩵;

    if-eqz v0, :cond_0

    .line 68
    check-cast p1, Ll/ۗܶ᩵;

    invoke-virtual {p0}, Ll/ۙܶ᩵;->getKey()Ll/ܿ᩸᩵;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۗܶ᩵;->֫(Ll/ܿ᩸᩵;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, p0}, Ll/ۗܶ᩵;->֫(Ll/ۗۗ᩵;)Ll/ᩳ᩸᩵;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 70
    :cond_0
    sget-object v0, Ll/۟ܶ᩵;->֡:Ll/ܰܶ᩵;

    sget-object v0, Ll/ܰܶ᩵;->᩸:Ll/ܰܶ᩵;

    if-ne v0, p1, :cond_1

    .line 68
    :goto_0
    sget-object p0, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    :cond_1
    return-object p0
.end method
