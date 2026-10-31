.class public final enum Ll/ۧۤۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "ScriptDataEscapedDash"

    const/16 v1, 0x16

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۧۤۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 350
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 1

    .line 352
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 353
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ۧ(Ll/ܶۛۘ;)V

    .line 354
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 358
    :cond_0
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۧ()C

    move-result p2

    if-eqz p2, :cond_3

    const/16 v0, 0x2d

    if-eq p2, v0, :cond_2

    const/16 v0, 0x3c

    if-eq p2, v0, :cond_1

    .line 373
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(C)V

    .line 374
    sget-object p2, Ll/ܶۛۘ;->ܺۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 365
    :cond_1
    sget-object p2, Ll/ܶۛۘ;->֡ۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 361
    :cond_2
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(C)V

    .line 362
    sget-object p2, Ll/ܶۛۘ;->ۘۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    .line 368
    :cond_3
    invoke-virtual {p1, p0}, Ll/ܶ۫ۘ;->ܽ(Ll/ܶۛۘ;)V

    const p2, 0xfffd

    .line 369
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(C)V

    .line 370
    sget-object p2, Ll/ܶۛۘ;->ܺۧ:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void
.end method
