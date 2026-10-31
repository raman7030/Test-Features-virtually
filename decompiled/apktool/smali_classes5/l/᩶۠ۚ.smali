.class public final enum Ll/᩶۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "CommentEndDash"

    const/16 v1, 0x2f

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩶۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1018
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 1020
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result p2

    const/16 v0, 0x2d

    if-eqz p2, :cond_2

    if-eq p2, v0, :cond_1

    const v1, 0xffff

    if-eq p2, v1, :cond_0

    .line 1036
    iget-object v1, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    invoke-virtual {v1, v0}, Ll/ܳ֨ۚ;->֫(C)V

    invoke-virtual {v1, p2}, Ll/ܳ֨ۚ;->֫(C)V

    .line 1037
    sget-object p2, Ll/᩵ܶۚ;->ۡ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1031
    :cond_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 1032
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ᩳ()V

    .line 1033
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1023
    :cond_1
    sget-object p2, Ll/᩵ܶۚ;->ܺ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 1026
    :cond_2
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 1027
    iget-object p2, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    invoke-virtual {p2, v0}, Ll/ܳ֨ۚ;->֫(C)V

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Ll/ܳ֨ۚ;->֫(C)V

    .line 1028
    sget-object p2, Ll/᩵ܶۚ;->ۡ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
