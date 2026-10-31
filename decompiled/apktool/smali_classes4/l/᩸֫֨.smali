.class public final Ll/᩸֫֨;
.super Ljava/lang/Object;
.source "O7F3"


# instance fields
.field public ֫:Ll/ۙ۬ۚ;

.field public ۧ:[B

.field public final ܽ:Ll/᩶ۗۚ;

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩶ۗۚ;Ll/ۙ۬ۚ;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Ll/᩸֫֨;->ܽ:Ll/᩶ۗۚ;

    .line 53
    iput-object p2, p0, Ll/᩸֫֨;->֫:Ll/ۙ۬ۚ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 70
    iget-object v0, p0, Ll/᩸֫֨;->ۧ:[B

    if-eqz v0, :cond_1

    array-length v1, v0

    if-lez v1, :cond_1

    .line 71
    array-length v0, v0

    const/16 v1, 0xa

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v2, 0x0

    .line 72
    invoke-static {v2, v0}, Ll/ܰۨᩴ;->range(II)Ll/ۧ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ܶ֫֨;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ܶ֫֨;-><init>(I)V

    invoke-interface {v0, v2}, Ll/ۧ᩺ᩴ;->mapToObj(Ljava/util/function/IntFunction;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    const-string v2, ", "

    invoke-static {v2}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 73
    iget-object v2, p0, Ll/᩸֫֨;->ۧ:[B

    array-length v2, v2

    if-le v2, v1, :cond_0

    const-string v1, ", ..."

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 97
    iput p1, p0, Ll/᩸֫֨;->ᩳ:I

    return-void
.end method

.method public final ֫(IILjava/io/DataInputStream;)V
    .locals 6

    .line 57
    iget-object v0, p0, Ll/᩸֫֨;->ܽ:Ll/᩶ۗۚ;

    iput p1, p0, Ll/᩸֫֨;->ܿ:I

    .line 58
    iput p2, p0, Ll/᩸֫֨;->ᩳ:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    .line 60
    :try_start_0
    new-array v4, p2, [B

    iput-object v4, p0, Ll/᩸֫֨;->ۧ:[B

    .line 61
    invoke-virtual {p3, v4}, Ljava/io/DataInputStream;->readFully([B)V

    const-string p3, "AttrData:#%d length=%d"

    .line 62
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v3, [Ljava/lang/Object;

    aput-object p1, v5, v2

    aput-object v4, v5, v1

    invoke-virtual {v0, p3, v5}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 64
    :catch_0
    new-instance p1, Ll/ۙۗۚ;

    invoke-virtual {v0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object p3

    iget-object v0, p0, Ll/᩸֫֨;->֫:Ll/ۙ۬ۚ;

    .line 65
    invoke-virtual {v0}, Ll/ۙ۬ۚ;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    aput-object p2, v3, v1

    const-string p2, "{0}: Invalid attribute length #{1}"

    invoke-direct {p1, p3, p2, v3}, Ll/ۙۗۚ;-><init>(Ll/ܰۗۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public final ۧ()Ll/ۙ۬ۚ;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/᩸֫֨;->֫:Ll/ۙ۬ۚ;

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 92
    iput p1, p0, Ll/᩸֫֨;->ܿ:I

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 115
    iget v0, p0, Ll/᩸֫֨;->ᩳ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 111
    iget v0, p0, Ll/᩸֫֨;->ܿ:I

    return v0
.end method
