.class public final enum Ll/᩸ۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AfterAttributeValue_quoted"

    const/16 v1, 0x28

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩸ۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 845
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 847
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_3

    const/16 v1, 0xa

    if-eq v0, v1, :cond_3

    const/16 v1, 0xc

    if-eq v0, v1, :cond_3

    const/16 v1, 0xd

    if-eq v0, v1, :cond_3

    const/16 v1, 0x20

    if-eq v0, v1, :cond_3

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3e

    if-eq v0, v1, :cond_1

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    .line 868
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    .line 869
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->֡()V

    .line 870
    sget-object p2, Ll/ܶۛۘ;->۟:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 864
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 865
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 860
    :cond_1
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܿ()V

    .line 861
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 857
    :cond_2
    sget-object p2, Ll/ܶۛۘ;->֨ۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 854
    :cond_3
    sget-object p2, Ll/ܶۛۘ;->۟:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void
.end method
