.class public final Ll/ۜ۟ۡ;
.super Ll/ܳ۟ۡ;
.source "OAR3"


# instance fields
.field public final ֫:Ll/ܿ۟ۡ;

.field public final synthetic ۜ:Ll/ۡ۟ۡ;

.field public ۧ:Z

.field public ܳ:I

.field public final ܽ:Ll/ܿ۟ۡ;

.field public ܿ:I

.field public ᩳ:[B

.field public final ᩻:Ll/ܺ۟ۡ;


# direct methods
.method public constructor <init>(Ll/ۡ۟ۡ;Ll/ܺ۟ۡ;[I[I)V
    .locals 0

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 271
    iput-object p1, p0, Ll/ۜ۟ۡ;->ۜ:Ll/ۡ۟ۡ;

    .line 268
    sget-object p1, Ll/ۚ᩺ۘ;->֫:[B

    iput-object p1, p0, Ll/ۜ۟ۡ;->ᩳ:[B

    .line 272
    iput-object p2, p0, Ll/ۜ۟ۡ;->᩻:Ll/ܺ۟ۡ;

    .line 273
    invoke-static {p3}, Ll/ۡ۟ۡ;->ۧ([I)Ll/ܿ۟ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ۟ۡ;->ܽ:Ll/ܿ۟ۡ;

    .line 274
    invoke-static {p4}, Ll/ۡ۟ۡ;->ۧ([I)Ll/ܿ۟ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ۟ۡ;->֫:Ll/ܿ۟ۡ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 348
    iget v0, p0, Ll/ۜ۟ۡ;->ܿ:I

    iget v1, p0, Ll/ۜ۟ۡ;->ܳ:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ֫([BII)I
    .locals 8

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 291
    :cond_0
    iget-boolean v1, p0, Ll/ۜ۟ۡ;->ۧ:Z

    if-eqz v1, :cond_1

    const/4 p1, -0x1

    return p1

    .line 331
    :cond_1
    iget v1, p0, Ll/ۜ۟ۡ;->ܿ:I

    iget v2, p0, Ll/ۜ۟ۡ;->ܳ:I

    sub-int/2addr v1, v2

    if-lez v1, :cond_2

    .line 334
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 335
    iget-object v2, p0, Ll/ۜ۟ۡ;->ᩳ:[B

    iget v3, p0, Ll/ۜ۟ۡ;->ܳ:I

    invoke-static {v2, v3, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 336
    iget v2, p0, Ll/ۜ۟ۡ;->ܳ:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/ۜ۟ۡ;->ܳ:I

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_7

    .line 297
    iget-object v2, p0, Ll/ۜ۟ۡ;->ۜ:Ll/ۡ۟ۡ;

    invoke-static {v2}, Ll/ۡ۟ۡ;->ܽ(Ll/ۡ۟ۡ;)Ll/۬ܰۡ;

    move-result-object v3

    iget-object v4, p0, Ll/ۜ۟ۡ;->ܽ:Ll/ܿ۟ۡ;

    invoke-static {v3, v4}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;Ll/ܿ۟ۡ;)I

    move-result v3

    const/16 v4, 0x100

    if-ge v3, v4, :cond_3

    add-int/lit8 v4, v1, 0x1

    add-int/2addr v1, p2

    .line 299
    invoke-static {v2}, Ll/ۡ۟ۡ;->ۧ(Ll/ۡ۟ۡ;)Ll/᩻۟ۡ;

    move-result-object v2

    int-to-byte v3, v3

    invoke-virtual {v2, v3}, Ll/᩻۟ۡ;->֫(B)V

    aput-byte v3, p1, v1

    move v1, v4

    goto :goto_0

    :cond_3
    if-le v3, v4, :cond_6

    .line 301
    invoke-static {}, Ll/ۡ۟ۡ;->ܽ()[S

    move-result-object v4

    add-int/lit16 v3, v3, -0x101

    aget-short v3, v4, v3

    ushr-int/lit8 v4, v3, 0x5

    and-int/lit8 v3, v3, 0x1f

    .line 304
    invoke-static {v2, v3}, Ll/ۡ۟ۡ;->֫(Ll/ۡ۟ۡ;I)J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Ll/ᩳ۟ۡ;->֫(IJ)I

    move-result v3

    .line 306
    invoke-static {v2}, Ll/ۡ۟ۡ;->ܽ(Ll/ۡ۟ۡ;)Ll/۬ܰۡ;

    move-result-object v4

    iget-object v5, p0, Ll/ۜ۟ۡ;->֫:Ll/ܿ۟ۡ;

    invoke-static {v4, v5}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;Ll/ܿ۟ۡ;)I

    move-result v4

    .line 308
    invoke-static {}, Ll/ۡ۟ۡ;->֫()[I

    move-result-object v5

    aget v4, v5, v4

    ushr-int/lit8 v5, v4, 0x4

    and-int/lit8 v4, v4, 0xf

    .line 311
    invoke-static {v2, v4}, Ll/ۡ۟ۡ;->֫(Ll/ۡ۟ۡ;I)J

    move-result-wide v6

    invoke-static {v5, v6, v7}, Ll/ᩳ۟ۡ;->֫(IJ)I

    move-result v4

    .line 313
    iget-object v5, p0, Ll/ۜ۟ۡ;->ᩳ:[B

    array-length v5, v5

    if-ge v5, v3, :cond_4

    .line 314
    new-array v5, v3, [B

    iput-object v5, p0, Ll/ۜ۟ۡ;->ᩳ:[B

    .line 316
    :cond_4
    iput v3, p0, Ll/ۜ۟ۡ;->ܿ:I

    .line 317
    iput v0, p0, Ll/ۜ۟ۡ;->ܳ:I

    .line 318
    invoke-static {v2}, Ll/ۡ۟ۡ;->ۧ(Ll/ۡ۟ۡ;)Ll/᩻۟ۡ;

    move-result-object v2

    iget-object v5, p0, Ll/ۜ۟ۡ;->ᩳ:[B

    invoke-virtual {v2, v4, v3, v5}, Ll/᩻۟ۡ;->֫(II[B)V

    add-int v2, p2, v1

    sub-int v3, p3, v1

    .line 331
    iget v4, p0, Ll/ۜ۟ۡ;->ܿ:I

    iget v5, p0, Ll/ۜ۟ۡ;->ܳ:I

    sub-int/2addr v4, v5

    if-lez v4, :cond_5

    .line 334
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 335
    iget-object v4, p0, Ll/ۜ۟ۡ;->ᩳ:[B

    iget v5, p0, Ll/ۜ۟ۡ;->ܳ:I

    invoke-static {v4, v5, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 336
    iget v2, p0, Ll/ۜ۟ۡ;->ܳ:I

    add-int/2addr v2, v3

    iput v2, p0, Ll/ۜ۟ۡ;->ܳ:I

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    :goto_1
    add-int/2addr v1, v3

    goto/16 :goto_0

    :cond_6
    const/4 p1, 0x1

    .line 322
    iput-boolean p1, p0, Ll/ۜ۟ۡ;->ۧ:Z

    :cond_7
    return v1
.end method

.method public final ۧ()Z
    .locals 1

    .line 343
    iget-boolean v0, p0, Ll/ۜ۟ۡ;->ۧ:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܽ()Ll/ܺ۟ۡ;
    .locals 1

    .line 279
    iget-boolean v0, p0, Ll/ۜ۟ۡ;->ۧ:Z

    if-eqz v0, :cond_0

    sget-object v0, Ll/ܺ۟ۡ;->ۙ:Ll/ܺ۟ۡ;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۜ۟ۡ;->᩻:Ll/ܺ۟ۡ;

    return-object v0
.end method
