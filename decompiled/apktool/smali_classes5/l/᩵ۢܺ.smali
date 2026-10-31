.class public final enum Ll/᩵ۢܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_10T"

    const/4 v1, 0x5

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩵ۢܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 125
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 8

    .line 129
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->ۖ()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    .line 130
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 131
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result p1

    int-to-byte p1, p1

    .line 132
    new-instance v7, Ll/ۤۢܺ;

    add-int v4, p2, p1

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p0

    .line 30
    invoke-direct/range {v0 .. v6}, Ll/ۘ᩷ܺ;-><init>(Ll/۠ۢܺ;IIIJ)V

    return-object v7
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 1

    .line 139
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->ۖ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۘ᩷ܺ;->ۧ(I)I

    move-result v0

    .line 140
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result p1

    invoke-static {p1, v0}, Ll/۠ۢܺ;->ۧ(II)S

    invoke-interface {p2}, Ll/ۖ᩷ܺ;->֫()V

    return-void
.end method
