.class public final enum Ll/᩻ۢܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_51L"

    const/16 v1, 0x1e

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩻ۢܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 647
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 8

    .line 651
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    .line 652
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result v7

    .line 653
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readLong()J

    move-result-wide v5

    .line 654
    new-instance p1, Ll/᩹ۢܺ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Ll/᩹ۢܺ;-><init>(Ll/۠ۢܺ;IIIJI)V

    return-object p1
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 3

    .line 662
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->᩻()J

    move-result-wide v0

    .line 664
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v2

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->֫()I

    move-result p1

    invoke-static {v2, p1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 665
    invoke-static {v0, v1}, Ll/۠ۢܺ;->֫(J)S

    .line 666
    invoke-static {v0, v1}, Ll/۠ۢܺ;->ܽ(J)S

    .line 667
    invoke-static {v0, v1}, Ll/۠ۢܺ;->ᩳ(J)S

    .line 668
    invoke-static {v0, v1}, Ll/۠ۢܺ;->ܿ(J)S

    .line 663
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ᩳ()V

    return-void
.end method
