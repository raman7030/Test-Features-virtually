.class public final enum Ll/۬֨ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "Data"

    const/4 v1, 0x0

    .line 0
    invoke-direct {p0, v0, v1}, Ll/۬֨ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 12
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܺ()C

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0x26

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    .line 27
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    .line 28
    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ljava/lang/String;)V

    return-void

    .line 24
    :cond_0
    new-instance p2, Ll/ۜ֨ۚ;

    invoke-direct {p2}, Ll/ۜ֨ۚ;-><init>()V

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/ۖ֨ۚ;)V

    return-void

    .line 17
    :cond_1
    sget-object p2, Ll/᩵ܶۚ;->ܶۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    .line 14
    :cond_2
    sget-object p2, Ll/᩵ܶۚ;->᩷֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(Ll/᩵ܶۚ;)V

    return-void

    .line 20
    :cond_3
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 21
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->֫(C)V

    return-void
.end method
