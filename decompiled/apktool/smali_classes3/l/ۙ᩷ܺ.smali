.class public final enum Ll/ۙ᩷ܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_22S"

    const/16 v1, 0x10

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۙ᩷ܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 374
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 9

    .line 378
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 379
    invoke-static {p1}, Ll/۠ۢܺ;->᩻(I)I

    move-result v7

    .line 380
    invoke-static {p1}, Ll/۠ۢܺ;->ۜ(I)I

    move-result v8

    .line 381
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result p1

    int-to-short p1, p1

    .line 382
    new-instance p2, Ll/۫ۢܺ;

    const/4 v4, 0x0

    int-to-long v5, p1

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Ll/۫ۢܺ;-><init>(Ll/۠ۢܺ;IIIJII)V

    return-object p2
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 3

    .line 391
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v0

    .line 392
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result v1

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ۧ()I

    move-result v2

    invoke-static {v1, v2}, Ll/۠ۢܺ;->ܽ(II)I

    move-result v1

    .line 391
    invoke-static {v0, v1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 393
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ۡ()S

    .line 390
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ܺ()V

    return-void
.end method
