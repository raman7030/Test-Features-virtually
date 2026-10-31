.class public final enum Ll/ۜۢܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_45CC"

    const/16 v1, 0x1f

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۜۢܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 672
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 8

    .line 676
    invoke-static {p1}, Ll/۠ۢܺ;->ۧ(I)I

    move-result v2

    const/16 v0, 0xfa

    if-ne v2, v0, :cond_1

    .line 682
    invoke-static {p1}, Ll/۠ۢܺ;->᩻(I)I

    move-result v0

    .line 683
    invoke-static {p1}, Ll/۠ۢܺ;->ۜ(I)I

    move-result p1

    .line 684
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v3

    .line 685
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v1

    .line 686
    invoke-static {v1}, Ll/۠ۢܺ;->ܿ(I)I

    move-result v4

    .line 687
    invoke-static {v1}, Ll/۠ۢܺ;->ܳ(I)I

    move-result v5

    .line 688
    invoke-static {v1}, Ll/۠ۢܺ;->᩻(I)I

    move-result v6

    .line 689
    invoke-static {v1}, Ll/۠ۢܺ;->ۜ(I)I

    move-result v1

    .line 690
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result p2

    .line 691
    invoke-static {v2}, Ll/ۢ᩷ܺ;->ۧ(I)Ll/ۜ᩷ܺ;

    const/4 v7, 0x1

    if-lt p1, v7, :cond_0

    const/4 v7, 0x5

    if-gt p1, v7, :cond_0

    .line 696
    filled-new-array {v4, v5, v6, v1, v0}, [I

    move-result-object v0

    const/4 v1, 0x0

    .line 697
    invoke-static {v0, v1, p1}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object v5

    .line 699
    new-instance p1, Ll/ܶۢܺ;

    move-object v0, p1

    move-object v1, p0

    move v4, p2

    invoke-direct/range {v0 .. v5}, Ll/ܶۢܺ;-><init>(Ll/۠ۢܺ;III[I)V

    return-object p1

    .line 694
    :cond_0
    new-instance p2, Ll/֡ۧܺ;

    invoke-static {p1}, Ll/ܳᩴܺ;->ܿ(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "bogus registerCount: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 60
    invoke-direct {p2, p1, v0}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 694
    throw p2

    .line 680
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 3

    .line 705
    check-cast p1, Ll/ܶۢܺ;

    .line 707
    invoke-virtual {p1}, Ll/ۘ᩷ܺ;->ܺ()I

    move-result v0

    .line 708
    invoke-virtual {p1}, Ll/ܶۢܺ;->֡()I

    move-result v1

    invoke-virtual {p1}, Ll/ܶۢܺ;->ᩴ()I

    move-result v2

    invoke-static {v1, v2}, Ll/۠ۢܺ;->ܽ(II)I

    move-result v1

    .line 707
    invoke-static {v0, v1}, Ll/۠ۢܺ;->ۧ(II)S

    .line 710
    invoke-virtual {p1}, Ll/ܶۢܺ;->ܽ()I

    move-result v0

    invoke-virtual {p1}, Ll/ܶۢܺ;->ᩳ()I

    move-result v1

    invoke-virtual {p1}, Ll/ܶۢܺ;->ܿ()I

    move-result v2

    invoke-virtual {p1}, Ll/ܶۢܺ;->᩵()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Ll/۠ۢܺ;->֫(IIII)S

    .line 707
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ܽ()V

    return-void
.end method
