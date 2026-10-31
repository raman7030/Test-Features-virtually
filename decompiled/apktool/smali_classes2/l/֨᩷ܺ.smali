.class public final enum Ll/֨᩷ܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_21S"

    const/16 v1, 0xa

    .line 0
    invoke-direct {p0, v0, v1}, Ll/֨᩷ܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 227
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 8

    .line 231
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 232
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result v7

    .line 233
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result p1

    int-to-short p1, p1

    .line 234
    new-instance p2, Ll/᩹ۢܺ;

    const/4 v4, 0x0

    int-to-long v5, p1

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Ll/᩹ۢܺ;-><init>(Ll/۠ۢܺ;IIIJI)V

    return-object p2
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 2

    .line 243
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result v1

    invoke-static {v0, v1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 244
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ۡ()S

    .line 242
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ܺ()V

    return-void
.end method
