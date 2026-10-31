.class public final enum Ll/֨۠ۚ;
.super Ll/᩵ܶۚ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "BogusComment"

    const/16 v1, 0x2a

    .line 0
    invoke-direct {p0, v0, v1}, Ll/֨۠ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 907
    invoke-direct {p0, p1, p2, v0}, Ll/᩵ܶۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V
    .locals 3

    .line 910
    iget-object v0, p1, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    const/16 v1, 0x3e

    invoke-virtual {p2, v1}, Ll/ᩳۚۚ;->֫(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܳ֨ۚ;->֫(Ljava/lang/String;)V

    .line 912
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܺ()C

    move-result v0

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 914
    :cond_1
    :goto_0
    invoke-virtual {p2}, Ll/ᩳۚۚ;->ܽ()C

    .line 915
    invoke-virtual {p1}, Ll/᩵֨ۚ;->ᩳ()V

    .line 916
    sget-object p2, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    invoke-virtual {p1, p2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    return-void
.end method
