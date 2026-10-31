.class public final enum Ll/ܶ۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "CommentStart"

    const/16 v1, 0x2c

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܶ۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 940
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 942
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result v0

    if-eqz v0, :cond_3

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3e

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    .line 963
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܶ()V

    .line 964
    sget-object p2, Ll/᩵ܶۚ;->ۡ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 958
    :cond_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 959
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ᩳ()V

    .line 960
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 953
    :cond_1
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 954
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ᩳ()V

    .line 955
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 945
    :cond_2
    sget-object p2, Ll/᩵ܶۚ;->᩵֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 948
    :cond_3
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 949
    iget-object p2, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    const v0, 0xfffd

    invoke-virtual {p2, v0}, Ll/ܳ֨ۚ;->֫(C)V

    .line 950
    sget-object p2, Ll/᩵ܶۚ;->ۡ֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
