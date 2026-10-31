.class public final enum Ll/᩺֨ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "ScriptDataEscapedDashDash"

    const/16 v1, 0x17

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩺֨ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 390
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 1

    .line 392
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 393
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 394
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 398
    :cond_0
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result p2

    if-eqz p2, :cond_4

    const/16 v0, 0x2d

    if-eq p2, v0, :cond_3

    const/16 v0, 0x3c

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3e

    if-eq p2, v0, :cond_1

    .line 416
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(C)V

    .line 417
    sget-object p2, Ll/᩵ܶۚ;->ܺۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 407
    :cond_1
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(C)V

    .line 408
    sget-object p2, Ll/᩵ܶۚ;->֫ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 404
    :cond_2
    sget-object p2, Ll/᩵ܶۚ;->֡ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 401
    :cond_3
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(C)V

    return-void

    .line 411
    :cond_4
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    const p2, 0xfffd

    .line 412
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(C)V

    .line 413
    sget-object p2, Ll/᩵ܶۚ;->ܺۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
