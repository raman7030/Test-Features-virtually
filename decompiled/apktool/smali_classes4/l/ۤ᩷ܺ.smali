.class public final enum Ll/ۤ᩷ܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_30T"

    const/16 v1, 0x13

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۤ᩷ܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 444
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 9

    .line 448
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->ۖ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 449
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v3

    .line 450
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result p1

    .line 451
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readInt()I

    move-result p2

    .line 452
    new-instance v8, Ll/ۤۢܺ;

    add-int v5, v0, p2

    int-to-long v6, p1

    const/4 v4, 0x0

    move-object v1, v8

    move-object v2, p0

    .line 30
    invoke-direct/range {v1 .. v7}, Ll/ۘ᩷ܺ;-><init>(Ll/۠ۢܺ;IIIJ)V

    return-object v8
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 1

    .line 459
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->ۖ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۘ᩷ܺ;->֫(I)I

    move-result p1

    .line 461
    invoke-static {p1}, Ll/۠ۢܺ;->᩷(I)S

    invoke-static {p1}, Ll/۠ۢܺ;->ۢ(I)S

    .line 460
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ۧ()V

    return-void
.end method
