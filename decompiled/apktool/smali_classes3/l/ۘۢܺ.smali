.class public final enum Ll/ۘۢܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_11N"

    const/4 v1, 0x3

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۘۢܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 86
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 8

    .line 90
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 91
    invoke-static {p1}, Ll/۠ۢܺ;->᩻(I)I

    move-result v7

    .line 92
    invoke-static {p1}, Ll/۠ۢܺ;->ۜ(I)I

    move-result p1

    shl-int/lit8 p1, p1, 0x1c

    shr-int/lit8 p1, p1, 0x1c

    .line 93
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

    .line 102
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ۖ()S

    move-result v0

    .line 103
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result v1

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ۢ()I

    move-result p1

    invoke-static {v1, p1}, Ll/۠ۢܺ;->ܽ(II)I

    move-result p1

    .line 102
    invoke-static {v0, p1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 101
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->֫()V

    return-void
.end method
