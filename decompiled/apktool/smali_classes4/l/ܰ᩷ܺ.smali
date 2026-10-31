.class public final enum Ll/ܰ᩷ܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_31C"

    const/16 v1, 0x17

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܰ᩷ܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 545
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 8

    .line 549
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 550
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result v7

    .line 551
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readInt()I

    move-result v3

    .line 552
    invoke-static {v2}, Ll/ۢ᩷ܺ;->ۧ(I)Ll/ۜ᩷ܺ;

    .line 553
    new-instance p1, Ll/᩹ۢܺ;

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Ll/᩹ۢܺ;-><init>(Ll/۠ۢܺ;IIIJI)V

    return-object p1
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 2

    .line 561
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܳ()I

    move-result v0

    .line 563
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v1

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result p1

    invoke-static {v1, p1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 564
    invoke-static {v0}, Ll/۠ۢܺ;->᩷(I)S

    .line 565
    invoke-static {v0}, Ll/۠ۢܺ;->ۢ(I)S

    .line 562
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ۧ()V

    return-void
.end method
