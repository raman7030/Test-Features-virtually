.class public final enum Ll/᩺᩷ܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_31T"

    const/16 v1, 0x16

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩺᩷ܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 508
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 9

    .line 512
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->ۖ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 513
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v3

    .line 514
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result v8

    .line 515
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readInt()I

    move-result p1

    add-int v5, p1, v0

    const/16 p1, 0x2b

    if-eq v3, p1, :cond_0

    const/16 p1, 0x2c

    if-eq v3, p1, :cond_0

    goto :goto_0

    .line 524
    :cond_0
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->ۢ()V

    .line 530
    :goto_0
    new-instance p1, Ll/᩹ۢܺ;

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v1 .. v8}, Ll/᩹ۢܺ;-><init>(Ll/۠ۢܺ;IIIJI)V

    return-object p1
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 2

    .line 538
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->ۖ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۘ᩷ܺ;->֫(I)I

    move-result v0

    .line 540
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v1

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result p1

    invoke-static {v1, p1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 541
    invoke-static {v0}, Ll/۠ۢܺ;->᩷(I)S

    invoke-static {v0}, Ll/۠ۢܺ;->ۢ(I)S

    .line 539
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ۧ()V

    return-void
.end method
