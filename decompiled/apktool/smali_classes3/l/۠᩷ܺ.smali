.class public final enum Ll/۠᩷ܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_21H"

    const/16 v1, 0xb

    .line 0
    invoke-direct {p0, v0, v1}, Ll/۠᩷ܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 248
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 8

    .line 252
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 253
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result v7

    .line 254
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result p1

    int-to-short p1, p1

    int-to-long p1, p1

    const/16 v0, 0x15

    if-ne v2, v0, :cond_0

    const/16 v0, 0x10

    goto :goto_0

    :cond_0
    const/16 v0, 0x30

    :goto_0
    shl-long v5, p1, v0

    .line 263
    new-instance p1, Ll/᩹ۢܺ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Ll/᩹ۢܺ;-><init>(Ll/۠ۢܺ;IIIJI)V

    return-object p1
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 1

    .line 272
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v0

    .line 276
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result p1

    invoke-static {v0, p1}, Ll/۠ۢܺ;->ۧ(II)S

    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ܺ()V

    return-void
.end method
