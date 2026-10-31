.class public final enum Ll/֨ۛۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "TagOpen"

    const/4 v1, 0x7

    .line 0
    invoke-direct {p0, v0, v1}, Ll/֨ۛۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 97
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 2

    .line 100
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۢ()C

    move-result v0

    const/16 v1, 0x21

    if-eq v0, v1, :cond_3

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3f

    if-eq v0, v1, :cond_1

    .line 111
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۘ()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 112
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Z)Ll/ۚ۫ۘ;

    .line 113
    sget-object p2, Ll/ܶۛۘ;->۠ۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 115
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    const/16 p2, 0x3c

    .line 116
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(C)V

    .line 117
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 108
    :cond_1
    sget-object p2, Ll/ܶۛۘ;->ܳ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void

    .line 105
    :cond_2
    sget-object p2, Ll/ܶۛۘ;->᩶֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void

    .line 102
    :cond_3
    sget-object p2, Ll/ܶۛۘ;->ۙ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void
.end method
