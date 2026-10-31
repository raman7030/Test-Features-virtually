.class public final Ll/ۧ᩸᩵;
.super Ljava/lang/Object;
.source "ZB07"


# direct methods
.method public static ֫(Ll/ܳ᩸᩵;Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 1

    const-string v0, "context"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    sget-object v0, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    if-ne p1, v0, :cond_0

    return-object p0

    .line 32
    :cond_0
    new-instance v0, Ll/֫᩸᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, p0, v0}, Ll/ܳ᩸᩵;->֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳ᩸᩵;

    return-object p0
.end method
