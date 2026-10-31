.class public final Ll/ܶۢܺ;
.super Ll/ۘ᩷ܺ;
.source "SB9Z"


# instance fields
.field public final ܳ:[I

.field public final ܿ:I


# direct methods
.method public constructor <init>(Ll/۠ۢܺ;III[I)V
    .locals 7

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    .line 36
    invoke-direct/range {v0 .. v6}, Ll/ۘ᩷ܺ;-><init>(Ll/۠ۢܺ;IIIJ)V

    int-to-short p1, p4

    if-ne p4, p1, :cond_0

    .line 40
    iput p4, p0, Ll/ܶۢܺ;->ܿ:I

    .line 41
    iput-object p5, p0, Ll/ܶۢܺ;->ܳ:[I

    return-void

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "protoIndex doesn\'t fit in a short: "

    .line 0
    invoke-static {p4, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 38
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֡()I
    .locals 3

    .line 82
    iget-object v0, p0, Ll/ܶۢܺ;->ܳ:[I

    array-length v1, v0

    const/4 v2, 0x4

    if-le v1, v2, :cond_0

    aget v0, v0, v2

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۘ()S
    .locals 1

    .line 87
    iget v0, p0, Ll/ܶۢܺ;->ܿ:I

    int-to-short v0, v0

    return v0
.end method

.method public final ܽ()I
    .locals 3

    .line 64
    iget-object v0, p0, Ll/ܶۢܺ;->ܳ:[I

    array-length v1, v0

    const/4 v2, 0x0

    if-lez v1, :cond_0

    aget v0, v0, v2

    return v0

    :cond_0
    return v2
.end method

.method public final ܿ()I
    .locals 3

    .line 74
    iget-object v0, p0, Ll/ܶۢܺ;->ܳ:[I

    array-length v1, v0

    const/4 v2, 0x2

    if-le v1, v2, :cond_0

    aget v0, v0, v2

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 3

    .line 69
    iget-object v0, p0, Ll/ܶۢܺ;->ܳ:[I

    array-length v1, v0

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    aget v0, v0, v2

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ܶۢܺ;->ܳ:[I

    array-length v0, v0

    return v0
.end method

.method public final ᩵()I
    .locals 3

    .line 78
    iget-object v0, p0, Ll/ܶۢܺ;->ܳ:[I

    array-length v1, v0

    const/4 v2, 0x3

    if-le v1, v2, :cond_0

    aget v0, v0, v2

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
