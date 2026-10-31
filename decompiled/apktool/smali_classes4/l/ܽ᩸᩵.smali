.class public final Ll/ܽ᩸᩵;
.super Ljava/lang/Object;
.source "ZB07"


# direct methods
.method public static ֫(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 1

    const-string v0, "context"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-static {p0, p1}, Ll/ۧ᩸᩵;->֫(Ll/ܳ᩸᩵;Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩳ᩸᩵;Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 1

    const-string v0, "key"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-interface {p0}, Ll/ᩳ᩸᩵;->getKey()Ll/ܿ᩸᩵;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    :cond_0
    return-object p0
.end method
