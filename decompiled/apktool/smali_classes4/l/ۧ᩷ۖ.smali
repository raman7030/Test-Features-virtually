.class public abstract Ll/ۧ᩷ۖ;
.super Ll/ܳ᩷ۖ;
.source "39NU"


# instance fields
.field public final ܳ:I

.field public final ܿ:[B

.field public ᩻:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2202
    invoke-direct {p0, v0}, Ll/ܳ᩷ۖ;-><init>(I)V

    if-ltz p1, :cond_0

    const/16 v0, 0x14

    .line 2210
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    new-array v0, p1, [B

    iput-object v0, p0, Ll/ۧ᩷ۖ;->ܿ:[B

    .line 2211
    iput p1, p0, Ll/ۧ᩷ۖ;->ܳ:I

    return-void

    .line 2204
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bufferSize must be >= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 2216
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۜ(I)V
    .locals 5

    .line 2327
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    and-int/lit16 v2, p1, 0xff

    int-to-byte v2, v2

    iget-object v3, p0, Ll/ۧ᩷ۖ;->ܿ:[B

    aput-byte v2, v3, v0

    add-int/lit8 v2, v0, 0x2

    .line 2328
    iput v2, p0, Ll/ۧ᩷ۖ;->᩻:I

    shr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v3, v1

    add-int/lit8 v1, v0, 0x3

    .line 2329
    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    shr-int/lit8 v4, p1, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    add-int/lit8 v0, v0, 0x4

    .line 2330
    iput v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v3, v1

    return-void
.end method

.method public final ۜ(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    .line 2240
    invoke-virtual {p0, p1}, Ll/ۧ᩷ۖ;->᩷(I)V

    return-void
.end method

.method public final ܿ(J)V
    .locals 9

    .line 2294
    invoke-static {}, Ll/ܳ᩷ۖ;->ۧ()Z

    move-result v0

    const/4 v1, 0x7

    const-wide/16 v2, 0x0

    const-wide/16 v4, -0x80

    iget-object v6, p0, Ll/ۧ᩷ۖ;->ܿ:[B

    if-eqz v0, :cond_1

    :goto_0
    and-long v7, p1, v4

    cmp-long v0, v7, v2

    if-nez v0, :cond_0

    .line 2298
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    int-to-long v0, v0

    long-to-int p2, p1

    int-to-byte p1, p2

    invoke-static {v6, v0, v1, p1}, Ll/᩸֨ۖ;->֫([BJB)V

    return-void

    .line 2301
    :cond_0
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v7, v0, 0x1

    iput v7, p0, Ll/ۧ᩷ۖ;->᩻:I

    int-to-long v7, v0

    long-to-int v0, p1

    or-int/lit16 v0, v0, 0x80

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-static {v6, v7, v8, v0}, Ll/᩸֨ۖ;->֫([BJB)V

    ushr-long/2addr p1, v1

    goto :goto_0

    :cond_1
    :goto_1
    and-long v7, p1, v4

    cmp-long v0, v7, v2

    if-nez v0, :cond_2

    .line 2310
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    long-to-int p2, p1

    int-to-byte p1, p2

    aput-byte p1, v6, v0

    return-void

    .line 2314
    :cond_2
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v7, v0, 0x1

    iput v7, p0, Ll/ۧ᩷ۖ;->᩻:I

    long-to-int v7, p1

    or-int/lit16 v7, v7, 0x80

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, v6, v0

    ushr-long/2addr p1, v1

    goto :goto_1
.end method

.method public final ᩳ(J)V
    .locals 9

    .line 2339
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    const-wide/16 v2, 0xff

    and-long v4, p1, v2

    long-to-int v5, v4

    int-to-byte v4, v5

    iget-object v5, p0, Ll/ۧ᩷ۖ;->ܿ:[B

    aput-byte v4, v5, v0

    add-int/lit8 v4, v0, 0x2

    .line 2340
    iput v4, p0, Ll/ۧ᩷ۖ;->᩻:I

    const/16 v6, 0x8

    shr-long v7, p1, v6

    and-long/2addr v7, v2

    long-to-int v8, v7

    int-to-byte v7, v8

    aput-byte v7, v5, v1

    add-int/lit8 v1, v0, 0x3

    .line 2341
    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    const/16 v7, 0x10

    shr-long v7, p1, v7

    and-long/2addr v7, v2

    long-to-int v8, v7

    int-to-byte v7, v8

    aput-byte v7, v5, v4

    add-int/lit8 v4, v0, 0x4

    .line 2342
    iput v4, p0, Ll/ۧ᩷ۖ;->᩻:I

    const/16 v7, 0x18

    shr-long v7, p1, v7

    and-long/2addr v2, v7

    long-to-int v3, v2

    int-to-byte v2, v3

    aput-byte v2, v5, v1

    add-int/lit8 v1, v0, 0x5

    .line 2343
    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    const/16 v2, 0x20

    shr-long v2, p1, v2

    long-to-int v3, v2

    and-int/lit16 v2, v3, 0xff

    int-to-byte v2, v2

    aput-byte v2, v5, v4

    add-int/lit8 v2, v0, 0x6

    .line 2344
    iput v2, p0, Ll/ۧ᩷ۖ;->᩻:I

    const/16 v3, 0x28

    shr-long v3, p1, v3

    long-to-int v4, v3

    and-int/lit16 v3, v4, 0xff

    int-to-byte v3, v3

    aput-byte v3, v5, v1

    add-int/lit8 v1, v0, 0x7

    .line 2345
    iput v1, p0, Ll/ۧ᩷ۖ;->᩻:I

    const/16 v3, 0x30

    shr-long v3, p1, v3

    long-to-int v4, v3

    and-int/lit16 v3, v4, 0xff

    int-to-byte v3, v3

    aput-byte v3, v5, v2

    add-int/2addr v0, v6

    .line 2346
    iput v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    const/16 v0, 0x38

    shr-long/2addr p1, v0

    long-to-int p2, p1

    and-int/lit16 p1, p2, 0xff

    int-to-byte p1, p1

    aput-byte p1, v5, v1

    return-void
.end method

.method public final ᩷(I)V
    .locals 4

    .line 2261
    invoke-static {}, Ll/ܳ᩷ۖ;->ۧ()Z

    move-result v0

    iget-object v1, p0, Ll/ۧ᩷ۖ;->ܿ:[B

    if-eqz v0, :cond_1

    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    .line 2265
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ۧ᩷ۖ;->᩻:I

    int-to-long v2, v0

    int-to-byte p1, p1

    invoke-static {v1, v2, v3, p1}, Ll/᩸֨ۖ;->֫([BJB)V

    return-void

    .line 2268
    :cond_0
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ۧ᩷ۖ;->᩻:I

    int-to-long v2, v0

    or-int/lit16 v0, p1, 0x80

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-static {v1, v2, v3, v0}, Ll/᩸֨ۖ;->֫([BJB)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_1
    :goto_1
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_2

    .line 2277
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ۧ᩷ۖ;->᩻:I

    int-to-byte p1, p1

    aput-byte p1, v1, v0

    return-void

    .line 2281
    :cond_2
    iget v0, p0, Ll/ۧ᩷ۖ;->᩻:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ۧ᩷ۖ;->᩻:I

    or-int/lit16 v2, p1, 0x80

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_1
.end method
