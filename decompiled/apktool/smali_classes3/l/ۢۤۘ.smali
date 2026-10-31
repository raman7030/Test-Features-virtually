.class public final enum Ll/ۢۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "ScriptDataDoubleEscapedDash"

    const/16 v1, 0x1d

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۢۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 475
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 1

    .line 477
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

    move-result p2

    if-eqz p2, :cond_3

    const/16 v0, 0x2d

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3c

    if-eq p2, v0, :cond_1

    const v0, 0xffff

    if-eq p2, v0, :cond_0

    .line 497
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(C)V

    .line 498
    sget-object p2, Ll/ܶۛۘ;->ᩳۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 493
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 494
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 484
    :cond_1
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(C)V

    .line 485
    sget-object p2, Ll/ܶۛۘ;->᩻ۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 480
    :cond_2
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(C)V

    .line 481
    sget-object p2, Ll/ܶۛۘ;->ܳۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 488
    :cond_3
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    const p2, 0xfffd

    .line 489
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(C)V

    .line 490
    sget-object p2, Ll/ܶۛۘ;->ᩳۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void
.end method
