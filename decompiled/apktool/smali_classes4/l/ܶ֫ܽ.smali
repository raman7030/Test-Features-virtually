.class public final Ll/ܶ֫ܽ;
.super Ljava/lang/Object;
.source "XAPG"


# direct methods
.method public static ֫(Ljava/lang/Object;Ll/᩸֫ܽ;)Ll/᩹֫ܽ;
    .locals 2

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verificationMode"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    new-instance v0, Ll/᩶֫ܽ;

    sget-object v1, Ll/֡֫ܽ;->֫:Ll/֡֫ܽ;

    invoke-direct {v0, p0, p1, v1}, Ll/᩶֫ܽ;-><init>(Ljava/lang/Object;Ll/᩸֫ܽ;Ll/֡֫ܽ;)V

    return-object v0
.end method
