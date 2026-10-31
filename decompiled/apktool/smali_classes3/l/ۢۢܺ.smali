.class public final enum Ll/ۢۢܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_PACKED_SWITCH_PAYLOAD"

    const/16 v1, 0x21

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۢۢܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 747
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 6

    .line 751
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->᩷()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 752
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v1

    .line 753
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readInt()I

    move-result v2

    .line 754
    new-array v3, v1, [I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 757
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readInt()I

    move-result v5

    add-int/2addr v5, v0

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 760
    :cond_0
    new-instance p2, Ll/᩶ۢܺ;

    invoke-direct {p2, p0, p1, v2, v3}, Ll/᩶ۢܺ;-><init>(Ll/۠ۢܺ;II[I)V

    return-object p2
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 3

    .line 766
    check-cast p1, Ll/᩶ۢܺ;

    .line 768
    invoke-virtual {p1}, Ll/᩶ۢܺ;->᩵()[I

    move-result-object p1

    .line 769
    invoke-interface {p2}, Ll/ۡ᩷ܺ;->᩷()I

    .line 771
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->֫()V

    .line 772
    array-length v0, p1

    invoke-static {v0}, Ll/۠ۢܺ;->֫(I)S

    invoke-interface {p2}, Ll/ۖ᩷ܺ;->֫()V

    .line 773
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ۡ()V

    .line 775
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    .line 776
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ۡ()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
