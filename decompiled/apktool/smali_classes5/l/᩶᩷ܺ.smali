.class public final enum Ll/᩶᩷ܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_22T"

    const/16 v1, 0xf

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩶᩷ܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 349
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 10

    .line 353
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->ۖ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 354
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v3

    .line 355
    invoke-static {p1}, Ll/۠ۢܺ;->᩻(I)I

    move-result v8

    .line 356
    invoke-static {p1}, Ll/۠ۢܺ;->ۜ(I)I

    move-result v9

    .line 357
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result p1

    int-to-short p1, p1

    .line 358
    new-instance p2, Ll/۫ۢܺ;

    add-int v5, v0, p1

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    move-object v2, p0

    invoke-direct/range {v1 .. v9}, Ll/۫ۢܺ;-><init>(Ll/۠ۢܺ;IIIJII)V

    return-object p2
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 2

    .line 366
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->ۖ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۘ᩷ܺ;->ܽ(I)S

    .line 368
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v0

    .line 369
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result v1

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ۧ()I

    move-result p1

    invoke-static {v1, p1}, Ll/۠ۢܺ;->ܽ(II)I

    move-result p1

    .line 368
    invoke-static {v0, p1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 367
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ܺ()V

    return-void
.end method
