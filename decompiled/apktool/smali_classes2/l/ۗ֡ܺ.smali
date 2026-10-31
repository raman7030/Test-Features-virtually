.class public final Ll/ۗ֡ܺ;
.super Ljava/lang/Object;
.source "SB7W"

# interfaces
.implements Ll/۬֡ܺ;


# instance fields
.field public ֫:[B

.field public ۧ:I

.field public ܽ:[F

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2179
    iput v0, p0, Ll/ۗ֡ܺ;->ۧ:I

    .line 2181
    iput v0, p0, Ll/ۗ֡ܺ;->ᩳ:I

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 2193
    iput-object v0, p0, Ll/ۗ֡ܺ;->֫:[B

    const/16 v0, 0x10

    new-array v0, v0, [F

    .line 2194
    iput-object v0, p0, Ll/ۗ֡ܺ;->ܽ:[F

    return-void
.end method

.method private ֫(B)V
    .locals 4

    .line 2212
    iget v0, p0, Ll/ۗ֡ܺ;->ۧ:I

    iget-object v1, p0, Ll/ۗ֡ܺ;->֫:[B

    array-length v2, v1

    if-ne v0, v2, :cond_0

    .line 2213
    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    .line 2214
    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2215
    iput-object v0, p0, Ll/ۗ֡ܺ;->֫:[B

    .line 2217
    :cond_0
    iget-object v0, p0, Ll/ۗ֡ܺ;->֫:[B

    iget v1, p0, Ll/ۗ֡ܺ;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۗ֡ܺ;->ۧ:I

    aput-byte p1, v0, v1

    return-void
.end method

.method private ֫(I)V
    .locals 3

    .line 2223
    iget-object v0, p0, Ll/ۗ֡ܺ;->ܽ:[F

    array-length v1, v0

    iget v2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    add-int/2addr v2, p1

    if-ge v1, v2, :cond_0

    .line 2224
    array-length p1, v0

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [F

    .line 2225
    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2226
    iput-object p1, p0, Ll/ۗ֡ܺ;->ܽ:[F

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/16 v0, 0x8

    .line 2294
    invoke-direct {p0, v0}, Ll/ۗ֡ܺ;->֫(B)V

    return-void
.end method

.method public final ֫()I
    .locals 1

    .line 2206
    iget v0, p0, Ll/ۗ֡ܺ;->ۧ:I

    return v0
.end method

.method public final ֫(FF)V
    .locals 4

    const/4 v0, 0x0

    .line 2234
    invoke-direct {p0, v0}, Ll/ۗ֡ܺ;->֫(B)V

    const/4 v0, 0x2

    .line 2235
    invoke-direct {p0, v0}, Ll/ۗ֡ܺ;->֫(I)V

    .line 2236
    iget-object v1, p0, Ll/ۗ֡ܺ;->ܽ:[F

    iget v2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p1, v1, v2

    add-int/2addr v2, v0

    .line 2237
    iput v2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p2, v1, v3

    return-void
.end method

.method public final ֫(FFFF)V
    .locals 4

    const/4 v0, 0x3

    .line 2268
    invoke-direct {p0, v0}, Ll/ۗ֡ܺ;->֫(B)V

    const/4 v0, 0x4

    .line 2269
    invoke-direct {p0, v0}, Ll/ۗ֡ܺ;->֫(I)V

    .line 2270
    iget-object v1, p0, Ll/ۗ֡ܺ;->ܽ:[F

    iget v2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p1, v1, v2

    add-int/lit8 p1, v2, 0x2

    .line 2271
    iput p1, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p2, v1, v3

    add-int/lit8 p2, v2, 0x3

    .line 2272
    iput p2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p3, v1, p1

    add-int/2addr v2, v0

    .line 2273
    iput v2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p4, v1, p2

    return-void
.end method

.method public final ֫(FFFFFF)V
    .locals 4

    const/4 v0, 0x2

    .line 2254
    invoke-direct {p0, v0}, Ll/ۗ֡ܺ;->֫(B)V

    const/4 v0, 0x6

    .line 2255
    invoke-direct {p0, v0}, Ll/ۗ֡ܺ;->֫(I)V

    .line 2256
    iget-object v1, p0, Ll/ۗ֡ܺ;->ܽ:[F

    iget v2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p1, v1, v2

    add-int/lit8 p1, v2, 0x2

    .line 2257
    iput p1, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p2, v1, v3

    add-int/lit8 p2, v2, 0x3

    .line 2258
    iput p2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p3, v1, p1

    add-int/lit8 p1, v2, 0x4

    .line 2259
    iput p1, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p4, v1, p2

    add-int/lit8 p2, v2, 0x5

    .line 2260
    iput p2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p5, v1, p1

    add-int/2addr v2, v0

    .line 2261
    iput v2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p6, v1, p2

    return-void
.end method

.method public final ֫(FFFZZFF)V
    .locals 2

    if-eqz p4, :cond_0

    const/4 p4, 0x2

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    or-int/lit8 p4, p4, 0x4

    or-int/2addr p4, p5

    int-to-byte p4, p4

    .line 2281
    invoke-direct {p0, p4}, Ll/ۗ֡ܺ;->֫(B)V

    const/4 p4, 0x5

    .line 2282
    invoke-direct {p0, p4}, Ll/ۗ֡ܺ;->֫(I)V

    .line 2283
    iget-object p5, p0, Ll/ۗ֡ܺ;->ܽ:[F

    iget v0, p0, Ll/ۗ֡ܺ;->ᩳ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p1, p5, v0

    add-int/lit8 p1, v0, 0x2

    .line 2284
    iput p1, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p2, p5, v1

    add-int/lit8 p2, v0, 0x3

    .line 2285
    iput p2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p3, p5, p1

    add-int/lit8 p1, v0, 0x4

    .line 2286
    iput p1, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p6, p5, p2

    add-int/2addr v0, p4

    .line 2287
    iput v0, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p7, p5, p1

    return-void
.end method

.method public final ֫(Ll/۬֡ܺ;)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2302
    :goto_0
    iget v2, p0, Ll/ۗ֡ܺ;->ۧ:I

    if-ge v1, v2, :cond_7

    .line 2304
    iget-object v2, p0, Ll/ۗ֡ܺ;->֫:[B

    aget-byte v2, v2, v1

    if-eqz v2, :cond_6

    const/4 v3, 0x1

    if-eq v2, v3, :cond_5

    const/4 v3, 0x2

    if-eq v2, v3, :cond_4

    const/4 v3, 0x3

    if-eq v2, v3, :cond_3

    const/16 v3, 0x8

    if-eq v2, v3, :cond_2

    and-int/lit8 v3, v2, 0x2

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    const/4 v8, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    const/4 v8, 0x0

    :goto_1
    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    const/4 v9, 0x1

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    const/4 v9, 0x0

    .line 2325
    :goto_2
    iget-object v2, p0, Ll/ۗ֡ܺ;->ܽ:[F

    add-int/lit8 v3, v0, 0x1

    aget v5, v2, v0

    add-int/lit8 v4, v0, 0x2

    aget v6, v2, v3

    add-int/lit8 v3, v0, 0x3

    aget v7, v2, v4

    add-int/lit8 v4, v0, 0x4

    aget v10, v2, v3

    add-int/lit8 v0, v0, 0x5

    aget v11, v2, v4

    move-object v4, p1

    invoke-interface/range {v4 .. v11}, Ll/۬֡ܺ;->֫(FFFZZFF)V

    goto :goto_3

    .line 2320
    :cond_2
    invoke-interface {p1}, Ll/۬֡ܺ;->close()V

    goto :goto_3

    .line 2317
    :cond_3
    iget-object v2, p0, Ll/ۗ֡ܺ;->ܽ:[F

    add-int/lit8 v3, v0, 0x1

    aget v4, v2, v0

    add-int/lit8 v5, v0, 0x2

    aget v3, v2, v3

    add-int/lit8 v6, v0, 0x3

    aget v5, v2, v5

    add-int/lit8 v0, v0, 0x4

    aget v2, v2, v6

    invoke-interface {p1, v4, v3, v5, v2}, Ll/۬֡ܺ;->֫(FFFF)V

    goto :goto_3

    .line 2314
    :cond_4
    iget-object v2, p0, Ll/ۗ֡ܺ;->ܽ:[F

    add-int/lit8 v3, v0, 0x1

    aget v5, v2, v0

    add-int/lit8 v4, v0, 0x2

    aget v6, v2, v3

    add-int/lit8 v3, v0, 0x3

    aget v7, v2, v4

    add-int/lit8 v4, v0, 0x4

    aget v8, v2, v3

    add-int/lit8 v3, v0, 0x5

    aget v9, v2, v4

    add-int/lit8 v0, v0, 0x6

    aget v10, v2, v3

    move-object v4, p1

    invoke-interface/range {v4 .. v10}, Ll/۬֡ܺ;->֫(FFFFFF)V

    goto :goto_3

    .line 2311
    :cond_5
    iget-object v2, p0, Ll/ۗ֡ܺ;->ܽ:[F

    add-int/lit8 v3, v0, 0x1

    aget v4, v2, v0

    add-int/lit8 v0, v0, 0x2

    aget v2, v2, v3

    invoke-interface {p1, v4, v2}, Ll/۬֡ܺ;->ۧ(FF)V

    goto :goto_3

    .line 2308
    :cond_6
    iget-object v2, p0, Ll/ۗ֡ܺ;->ܽ:[F

    add-int/lit8 v3, v0, 0x1

    aget v4, v2, v0

    add-int/lit8 v0, v0, 0x2

    aget v2, v2, v3

    invoke-interface {p1, v4, v2}, Ll/۬֡ܺ;->֫(FF)V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method public final ۧ(FF)V
    .locals 4

    const/4 v0, 0x1

    .line 2244
    invoke-direct {p0, v0}, Ll/ۗ֡ܺ;->֫(B)V

    const/4 v0, 0x2

    .line 2245
    invoke-direct {p0, v0}, Ll/ۗ֡ܺ;->֫(I)V

    .line 2246
    iget-object v1, p0, Ll/ۗ֡ܺ;->ܽ:[F

    iget v2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p1, v1, v2

    add-int/2addr v2, v0

    .line 2247
    iput v2, p0, Ll/ۗ֡ܺ;->ᩳ:I

    aput p2, v1, v3

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 2200
    iget v0, p0, Ll/ۗ֡ܺ;->ۧ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
