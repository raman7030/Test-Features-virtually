.class public final enum Ll/ۚ۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "SelfClosingStartTag"

    const/16 v1, 0x29

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۚ۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 887
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 2

    .line 889
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    move-result v0

    const/16 v1, 0x3e

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    .line 901
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܶ()V

    .line 902
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ܽ(Ll/᩵ܶۚ;)V

    .line 903
    sget-object p2, Ll/᩵ܶۚ;->۟:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 897
    :cond_0
    invoke-virtual {p1, p0}, Ll/᩵֨ۚ;->ۧ(Ll/᩵ܶۚ;)V

    .line 898
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void

    .line 892
    :cond_1
    iget-object p2, p1, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    const/4 v0, 0x1

    iput-boolean v0, p2, Ll/ۡ֨ۚ;->ۖ:Z

    .line 893
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ܳ()V

    .line 894
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
