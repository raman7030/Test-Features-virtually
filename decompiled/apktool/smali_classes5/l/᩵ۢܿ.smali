.class public final Ll/᩵ۢܿ;
.super Ljava/lang/Object;
.source "V702"

# interfaces
.implements Ll/ۛ᩷ܿ;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final synthetic ܳ:Ll/ۗۢܿ;

.field public ܽ:I

.field public ܿ:[Ll/᩶ۘܿ;

.field public ᩳ:[I


# direct methods
.method public constructor <init>(Ll/ۗۢܿ;)V
    .locals 0

    .line 5103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    const/4 p1, -0x1

    .line 5105
    iput p1, p0, Ll/᩵ۢܿ;->ܽ:I

    return-void
.end method

.method public static ֫(Ll/֨ۢܿ;I)I
    .locals 4

    if-gez p1, :cond_0

    return p1

    .line 5321
    :cond_0
    iget p0, p0, Ll/֨ۢܿ;->ۚ֫:I

    int-to-long v0, p0

    int-to-long p0, p1

    add-long/2addr v0, p0

    long-to-int p0, v0

    int-to-long v2, p0

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    return p0

    .line 0
    :cond_1
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0
.end method

.method private ۛ(I)Z
    .locals 2

    .line 5271
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    .line 5272
    iget-object v0, p1, Ll/֨ۢܿ;->ۡ֫:Ll/᩶ܺܿ;

    instance-of v1, v0, Ll/ۤܺܿ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۤܺܿ;

    iget-object v0, v0, Ll/ۤܺܿ;->ܿ:Ll/۠ܺܿ;

    if-eqz v0, :cond_1

    iget v0, p1, Ll/֨ۢܿ;->ܶ֫:I

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0xf

    if-ne v0, v1, :cond_1

    :cond_0
    iget-boolean p1, p1, Ll/֨ۢܿ;->֫֫:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private ۨ(I)I
    .locals 2

    .line 5313
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܽ(Ll/ۗۢܿ;)Ll/ܳۢܿ;

    move-result-object v1

    if-eqz v1, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 5314
    :cond_0
    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget v0, v0, Ll/֨ۢܿ;->֡:I

    sub-int/2addr p1, v0

    if-ltz p1, :cond_1

    return p1

    .line 5315
    :cond_1
    sget-object p1, Ll/֡ۢܿ;->᩶:Ll/֡ۢܿ;

    .line 5099
    new-instance v0, Ll/۠ۢܿ;

    invoke-direct {v0, p1}, Ll/۠ۢܿ;-><init>(Ll/֡ۢܿ;)V

    .line 5315
    throw v0

    :cond_2
    :goto_0
    const/4 p1, -0x1

    return p1
.end method


# virtual methods
.method public final ֡(I)I
    .locals 1

    .line 5123
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->۠֫:I

    return p1
.end method

.method public final ֨(I)I
    .locals 2

    .line 5230
    invoke-direct {p0, p1}, Ll/᩵ۢܿ;->ۛ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5231
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->᩺:I

    invoke-static {v1, p1}, Ll/᩵ۢܿ;->֫(Ll/֨ۢܿ;I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫()I
    .locals 2

    .line 5280
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܽ(Ll/ۗۢܿ;)Ll/ܳۢܿ;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget v0, v0, Ll/֨ۢܿ;->֡:I

    return v0
.end method

.method public final ֫(I)I
    .locals 2

    .line 5143
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ۗ֫:I

    invoke-static {v1, p1}, Ll/᩵ۢܿ;->֫(Ll/֨ۢܿ;I)I

    move-result p1

    return p1
.end method

.method public final ۖ(I)I
    .locals 2

    .line 5218
    invoke-direct {p0, p1}, Ll/᩵ۢܿ;->ۛ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5219
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ܳ֫:I

    invoke-static {v1, p1}, Ll/᩵ۢܿ;->֫(Ll/֨ۢܿ;I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ۗ(I)I
    .locals 3

    .line 5254
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    .line 5255
    iget-boolean v0, p1, Ll/֨ۢܿ;->֫֫:Z

    .line 5256
    iget-boolean v1, p1, Ll/֨ۢܿ;->ۙ:Z

    if-eqz v1, :cond_0

    or-int/lit8 v0, v0, 0x2

    .line 5259
    :cond_0
    iget-boolean v1, p1, Ll/֨ۢܿ;->֨:Z

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x4

    .line 5262
    :cond_1
    iget v1, p1, Ll/֨ۢܿ;->ܶ֫:I

    const/16 v2, 0xf

    if-ne v1, v2, :cond_3

    or-int/lit8 v1, v0, 0x8

    .line 5264
    iget-boolean p1, p1, Ll/֨ۢܿ;->᩵:Z

    if-eqz p1, :cond_2

    or-int/lit8 p1, v0, 0x18

    return p1

    :cond_2
    return v1

    :cond_3
    return v0
.end method

.method public final ۘ(I)I
    .locals 1

    .line 5236
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ۨ:I

    return p1
.end method

.method public final ۙ(I)I
    .locals 1

    .line 5180
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ᩴ֫:I

    return p1
.end method

.method public final ۚ(I)Ll/᩶ۘܿ;
    .locals 1

    .line 5201
    iget v0, p0, Ll/᩵ۢܿ;->ܽ:I

    if-ltz v0, :cond_0

    iget-object v0, p0, Ll/᩵ۢܿ;->ܿ:[Ll/᩶ۘܿ;

    aget-object p1, v0, p1

    return-object p1

    .line 5202
    :cond_0
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget-object p1, p1, Ll/֨ۢܿ;->ۢ:Ll/᩶ۘܿ;

    return-object p1
.end method

.method public final ۜ(I)I
    .locals 1

    .line 5241
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->۬:I

    return p1
.end method

.method public final ۠(I)I
    .locals 1

    .line 5170
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->᩺֫:I

    return p1
.end method

.method public final ۡ(I)I
    .locals 3

    .line 5291
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܽ(Ll/ۗۢܿ;)Ll/ܳۢܿ;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 5292
    :cond_0
    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v1

    aget-object p1, v1, p1

    iget p1, p1, Ll/֨ۢܿ;->֡:I

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object v0, v0, v2

    iget v0, v0, Ll/֨ۢܿ;->֡:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public final ۢ(I)I
    .locals 5

    .line 5246
    iget v0, p0, Ll/᩵ۢܿ;->ܽ:I

    if-ltz v0, :cond_0

    iget v1, p0, Ll/᩵ۢܿ;->ۧ:I

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_0

    return v0

    .line 5247
    :cond_0
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    .line 5248
    iget-object v0, p1, Ll/֨ۢܿ;->ۗ:Ll/ܶۢܿ;

    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    .line 5249
    :cond_1
    iget v0, v0, Ll/ܶۢܿ;->ܽ:I

    iget p1, p1, Ll/֨ۢܿ;->۫:I

    int-to-long v0, v0

    int-to-long v2, p1

    add-long/2addr v0, v2

    long-to-int p1, v0

    int-to-long v2, p1

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    return p1

    .line 0
    :cond_2
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ۤ(I)I
    .locals 1

    .line 5207
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget-object p1, p1, Ll/֨ۢܿ;->ۢ֫:Ll/ܶۢܿ;

    iget p1, p1, Ll/ܶۢܿ;->ܽ:I

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 5113
    iget v0, p0, Ll/᩵ۢܿ;->ܽ:I

    if-gez v0, :cond_0

    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->֫(Ll/ۗۢܿ;)I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Ll/᩵ۢܿ;->ۧ:I

    return v0
.end method

.method public final ۧ(I)I
    .locals 1

    .line 5133
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ܶ֫:I

    return p1
.end method

.method public final ۫(I)I
    .locals 6

    .line 5163
    iget v0, p0, Ll/᩵ۢܿ;->ܽ:I

    if-ltz v0, :cond_0

    iget v1, p0, Ll/᩵ۢܿ;->ۧ:I

    add-int/lit8 v1, v1, -0x1

    if-ne p1, v1, :cond_0

    return v0

    .line 5164
    :cond_0
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v1

    aget-object v1, v1, p1

    iget-wide v1, v1, Ll/֨ۢܿ;->ۨ֫:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_1

    long-to-int p1, v1

    return p1

    .line 5165
    :cond_1
    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ۚ֫:I

    long-to-int v0, v1

    int-to-long v1, p1

    int-to-long v3, v0

    add-long/2addr v1, v3

    long-to-int p1, v1

    int-to-long v3, p1

    cmp-long v0, v1, v3

    if-nez v0, :cond_2

    return p1

    .line 0
    :cond_2
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ۬(I)I
    .locals 1

    .line 5118
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget-object p1, p1, Ll/֨ۢܿ;->۬֫:Ll/᩶ۢܿ;

    iget p1, p1, Ll/᩶ۢܿ;->ܳ:I

    return p1
.end method

.method public final ܳ(I)I
    .locals 2

    .line 5138
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ۜ֫:I

    invoke-static {v1, p1}, Ll/᩵ۢܿ;->֫(Ll/֨ۢܿ;I)I

    move-result p1

    return p1
.end method

.method public final ܶ(I)I
    .locals 5

    .line 5212
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    .line 5213
    iget-object p1, p1, Ll/֨ۢܿ;->ۢ֫:Ll/ܶۢܿ;

    iget v0, p1, Ll/ܶۢܿ;->ܽ:I

    iget p1, p1, Ll/ܶۢܿ;->ۧ:I

    int-to-long v0, v0

    int-to-long v2, p1

    add-long/2addr v0, v2

    long-to-int p1, v0

    int-to-long v2, p1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return p1

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ܺ(I)I
    .locals 2

    .line 5302
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    .line 5303
    iget-object v0, p1, Ll/֨ۢܿ;->ۡ֫:Ll/᩶ܺܿ;

    instance-of v1, v0, Ll/ۤܺܿ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۤܺܿ;

    iget-object v0, v0, Ll/ۤܺܿ;->ܿ:Ll/۠ܺܿ;

    if-eqz v0, :cond_1

    iget v0, p1, Ll/֨ۢܿ;->ܶ֫:I

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0xf

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 5308
    :cond_0
    iget p1, p1, Ll/֨ۢܿ;->ܶ:I

    invoke-direct {p0, p1}, Ll/᩵ۢܿ;->ۨ(I)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ܽ()I
    .locals 3

    .line 5285
    iget v0, p0, Ll/᩵ۢܿ;->ܽ:I

    if-ltz v0, :cond_0

    iget v0, p0, Ll/᩵ۢܿ;->֫:I

    return v0

    .line 5286
    :cond_0
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܽ(Ll/ۗۢܿ;)Ll/ܳۢܿ;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-static {v0}, Ll/ۗۢܿ;->ܽ(Ll/ۗۢܿ;)Ll/ܳۢܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܳۢܿ;->ۧ()I

    move-result v1

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object v0, v0, v2

    iget v0, v0, Ll/֨ۢܿ;->֡:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ܽ(I)J
    .locals 2

    .line 5190
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget-wide v0, p1, Ll/֨ۢܿ;->֫:J

    return-wide v0
.end method

.method public final ܿ(I)I
    .locals 1

    .line 5195
    iget v0, p0, Ll/᩵ۢܿ;->ܽ:I

    if-ltz v0, :cond_0

    iget-object v0, p0, Ll/᩵ۢܿ;->ᩳ:[I

    aget p1, v0, p1

    return p1

    .line 5196
    :cond_0
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->᩷:I

    return p1
.end method

.method public final ᩳ(I)I
    .locals 2

    .line 5153
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ܺ֫:I

    invoke-static {v1, p1}, Ll/᩵ۢܿ;->֫(Ll/֨ۢܿ;I)I

    move-result p1

    return p1
.end method

.method public final ᩴ(I)I
    .locals 1

    .line 5297
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ۚ:I

    invoke-direct {p0, p1}, Ll/᩵ۢܿ;->ۨ(I)I

    move-result p1

    return p1
.end method

.method public final ᩵(I)I
    .locals 1

    .line 5128
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget-object p1, p1, Ll/֨ۢܿ;->۬֫:Ll/᩶ۢܿ;

    iget p1, p1, Ll/᩶ۢܿ;->᩷:I

    return p1
.end method

.method public final ᩶(I)I
    .locals 1

    .line 5185
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->᩵֫:I

    return p1
.end method

.method public final ᩷(I)I
    .locals 2

    .line 5158
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ۘ֫:I

    invoke-static {v1, p1}, Ll/᩵ۢܿ;->֫(Ll/֨ۢܿ;I)I

    move-result p1

    return p1
.end method

.method public final ᩸(I)I
    .locals 2

    .line 5224
    invoke-direct {p0, p1}, Ll/᩵ۢܿ;->ۛ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5225
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ܰ:I

    invoke-static {v1, p1}, Ll/᩵ۢܿ;->֫(Ll/֨ۢܿ;I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ᩹(I)I
    .locals 2

    .line 5148
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ۙ֫:I

    invoke-static {v1, p1}, Ll/᩵ۢܿ;->֫(Ll/֨ۢܿ;I)I

    move-result p1

    return p1
.end method

.method public final ᩻(I)I
    .locals 1

    .line 5175
    iget-object v0, p0, Ll/᩵ۢܿ;->ܳ:Ll/ۗۢܿ;

    invoke-static {v0}, Ll/ۗۢܿ;->ܳ(Ll/ۗۢܿ;)[Ll/֨ۢܿ;

    move-result-object v0

    aget-object p1, v0, p1

    iget p1, p1, Ll/֨ۢܿ;->ۜ:I

    return p1
.end method
