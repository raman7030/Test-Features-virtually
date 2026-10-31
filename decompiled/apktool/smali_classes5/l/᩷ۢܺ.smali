.class public final enum Ll/᩷ۢܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_4RCC"

    const/16 v1, 0x20

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩷ۢܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 716
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 7

    .line 720
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    const/16 v0, 0xfb

    if-ne v2, v0, :cond_0

    .line 726
    invoke-static {p1}, Ll/۠ۢܺ;->ᩳ(I)I

    move-result v5

    .line 727
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v3

    .line 728
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v4

    .line 729
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v6

    .line 730
    invoke-static {v2}, Ll/ۢ᩷ܺ;->ۧ(I)Ll/ۜ᩷ܺ;

    .line 731
    new-instance p1, Ll/᩸ۢܺ;

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Ll/᩸ۢܺ;-><init>(Ll/۠ۢܺ;IIIII)V

    return-object p1

    .line 724
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 2

    .line 739
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ᩴ()I

    move-result v1

    invoke-static {v0, v1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 382
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܽ()I

    move-result v0

    const/high16 v1, -0x10000

    and-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 742
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ۘ()S

    .line 738
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ܽ()V

    return-void

    .line 385
    :cond_0
    new-instance p1, Ll/֡ۧܺ;

    int-to-long v0, v0

    invoke-static {v0, v1}, Ll/ܳᩴܺ;->֫(J)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Register C out of range: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 60
    invoke-direct {p1, p2, v0}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 385
    throw p1
.end method
