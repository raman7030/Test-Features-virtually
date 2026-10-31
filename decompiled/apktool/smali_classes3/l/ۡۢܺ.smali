.class public final enum Ll/ۡۢܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_SPARSE_SWITCH_PAYLOAD"

    const/16 v1, 0x22

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۡۢܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 781
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 7

    .line 785
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->᩷()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 786
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v1

    .line 787
    new-array v2, v1, [I

    .line 788
    new-array v3, v1, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_0

    .line 791
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readInt()I

    move-result v6

    aput v6, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v4, v1, :cond_1

    .line 795
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readInt()I

    move-result v5

    add-int/2addr v5, v0

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 798
    :cond_1
    new-instance p2, Ll/ۗۢܺ;

    invoke-direct {p2, p0, p1, v2, v3}, Ll/ۗۢܺ;-><init>(Ll/۠ۢܺ;I[I[I)V

    return-object p2
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 5

    .line 804
    check-cast p1, Ll/ۗۢܺ;

    .line 806
    invoke-virtual {p1}, Ll/ۗۢܺ;->᩵()[I

    move-result-object v0

    .line 807
    invoke-virtual {p1}, Ll/ۗۢܺ;->֡()[I

    move-result-object p1

    .line 808
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->᩷()I

    .line 810
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->֫()V

    .line 811
    array-length v1, p1

    invoke-static {v1}, Ll/۠ۢܺ;->֫(I)S

    invoke-interface {p2}, Ll/ۖ᩷ܺ;->֫()V

    .line 813
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget v4, v0, v3

    .line 814
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ۡ()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 817
    :cond_0
    array-length v0, p1

    :goto_1
    if-ge v2, v0, :cond_1

    aget v1, p1, v2

    .line 818
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ۡ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
