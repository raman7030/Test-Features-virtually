.class public final enum Ll/᩸᩷ܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_23X"

    const/16 v1, 0xd

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩸᩷ܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 302
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 7

    .line 306
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 307
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result v4

    .line 308
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result p1

    .line 309
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v5

    .line 310
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result v6

    .line 311
    new-instance p1, Ll/۬ۢܺ;

    const/4 v3, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Ll/۬ۢܺ;-><init>(Ll/۠ۢܺ;IIIII)V

    return-object p1
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 2

    .line 320
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result v1

    invoke-static {v0, v1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 321
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ۧ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܽ()I

    move-result p1

    invoke-static {v0, p1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 319
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ܺ()V

    return-void
.end method
