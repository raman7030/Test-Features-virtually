.class public abstract Ll/ܰۜ֨;
.super Ljava/lang/Object;
.source "61SM"


# instance fields
.field public final ֫:[B

.field public ۜ:I

.field public ۡ:I

.field public ۢ:I

.field public final ۧ:I

.field public final ܳ:I

.field public ܽ:Z

.field public final ܿ:I

.field public final ᩳ:I

.field public ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIIILl/ۘ᩻֨;)V
    .locals 2

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 36
    iput v0, p0, Ll/ܰۜ֨;->ۢ:I

    .line 37
    iput v0, p0, Ll/ܰۜ֨;->᩷:I

    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Ll/ܰۜ֨;->ܽ:Z

    .line 39
    iput v0, p0, Ll/ܰۜ֨;->ۡ:I

    .line 40
    iput v0, p0, Ll/ܰۜ֨;->ۜ:I

    add-int/2addr p2, p1

    const/16 v0, 0x111

    add-int/2addr p3, v0

    .line 60
    div-int/lit8 p1, p1, 0x2

    const/high16 v1, 0x40000

    add-int/2addr p1, v1

    const/high16 v1, 0x20000000

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int v1, p2, p3

    add-int/2addr v1, p1

    .line 137
    iput v1, p0, Ll/ܰۜ֨;->ۧ:I

    .line 142
    invoke-virtual {p5, v1}, Ll/ۘ᩻֨;->֫(I)[B

    move-result-object p1

    iput-object p1, p0, Ll/ܰۜ֨;->֫:[B

    .line 145
    iput p2, p0, Ll/ܰۜ֨;->ܿ:I

    .line 146
    iput p3, p0, Ll/ܰۜ֨;->ᩳ:I

    .line 148
    iput v0, p0, Ll/ܰۜ֨;->ܳ:I

    .line 149
    iput p4, p0, Ll/ܰۜ֨;->᩻:I

    return-void
.end method

.method public static ֫(IIIIIILl/ۘ᩻֨;)Ll/ܰۜ֨;
    .locals 8

    const/4 v0, 0x4

    if-eq p4, v0, :cond_1

    const/16 v0, 0x14

    if-ne p4, v0, :cond_0

    .line 125
    new-instance p4, Ll/ۤۜ֨;

    move-object v1, p4

    move v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Ll/ۤۜ֨;-><init>(IIIIILl/ۘ᩻֨;)V

    return-object p4

    .line 129
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 121
    :cond_1
    new-instance p4, Ll/ۛۜ֨;

    move-object v0, p4

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ll/ۛۜ֨;-><init>(IIIIILl/ۘ᩻֨;)V

    return-object p4
.end method

.method public static ֫(II[I)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_1

    .line 45
    aget v2, p2, v1

    if-gt v2, p1, :cond_0

    .line 46
    aput v0, p2, v1

    goto :goto_1

    :cond_0
    sub-int/2addr v2, p1

    .line 48
    aput v2, p2, v1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ᩻()V
    .locals 3

    .line 236
    iget v0, p0, Ll/ܰۜ֨;->ۜ:I

    if-lez v0, :cond_0

    iget v1, p0, Ll/ܰۜ֨;->ۢ:I

    iget v2, p0, Ll/ܰۜ֨;->᩷:I

    if-ge v1, v2, :cond_0

    sub-int/2addr v1, v0

    .line 237
    iput v1, p0, Ll/ܰۜ֨;->ۢ:I

    const/4 v1, 0x0

    .line 239
    iput v1, p0, Ll/ܰۜ֨;->ۜ:I

    .line 240
    invoke-virtual {p0, v0}, Ll/ܰۜ֨;->ᩳ(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 294
    iget v0, p0, Ll/ܰۜ֨;->ۡ:I

    iget v1, p0, Ll/ܰۜ֨;->ۢ:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 315
    iget v0, p0, Ll/ܰۜ֨;->ۢ:I

    sub-int/2addr v0, p1

    iget-object p1, p0, Ll/ܰۜ֨;->֫:[B

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public final ֫(II)I
    .locals 1

    .line 324
    iget v0, p0, Ll/ܰۜ֨;->ۢ:I

    add-int/2addr v0, p1

    sub-int/2addr v0, p2

    iget-object p1, p0, Ll/ܰۜ֨;->֫:[B

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public final ֫(III)I
    .locals 2

    .line 349
    iget v0, p0, Ll/ܰۜ֨;->ۢ:I

    add-int/2addr v0, p1

    add-int/lit8 p2, p2, 0x1

    const/4 p1, 0x0

    iget-object v1, p0, Ll/ܰۜ֨;->֫:[B

    invoke-static {v1, v0, p2, p1, p3}, Ll/۟ۜ֨;->֫([BIIII)I

    move-result p1

    return p1
.end method

.method public final ֫(II[B)I
    .locals 6

    .line 200
    iget v0, p0, Ll/ܰۜ֨;->ۢ:I

    iget v1, p0, Ll/ܰۜ֨;->ۧ:I

    iget v2, p0, Ll/ܰۜ֨;->ᩳ:I

    sub-int v3, v1, v2

    iget-object v4, p0, Ll/ܰۜ֨;->֫:[B

    if-lt v0, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 184
    iget v3, p0, Ll/ܰۜ֨;->ܿ:I

    sub-int/2addr v0, v3

    and-int/lit8 v0, v0, -0x10

    .line 185
    iget v3, p0, Ll/ܰۜ֨;->ۡ:I

    sub-int/2addr v3, v0

    const/4 v5, 0x0

    .line 186
    invoke-static {v4, v0, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 188
    iget v3, p0, Ll/ܰۜ֨;->ۢ:I

    sub-int/2addr v3, v0

    iput v3, p0, Ll/ܰۜ֨;->ۢ:I

    .line 189
    iget v3, p0, Ll/ܰۜ֨;->᩷:I

    sub-int/2addr v3, v0

    iput v3, p0, Ll/ܰۜ֨;->᩷:I

    .line 190
    iget v3, p0, Ll/ܰۜ֨;->ۡ:I

    sub-int/2addr v3, v0

    iput v3, p0, Ll/ܰۜ֨;->ۡ:I

    .line 205
    :cond_0
    iget v0, p0, Ll/ܰۜ֨;->ۡ:I

    sub-int/2addr v1, v0

    if-le p2, v1, :cond_1

    move p2, v1

    .line 208
    :cond_1
    invoke-static {p3, p1, v4, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 209
    iget p1, p0, Ll/ܰۜ֨;->ۡ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ܰۜ֨;->ۡ:I

    if-lt p1, v2, :cond_2

    sub-int/2addr p1, v2

    .line 214
    iput p1, p0, Ll/ܰۜ֨;->᩷:I

    .line 216
    :cond_2
    invoke-direct {p0}, Ll/ܰۜ֨;->᩻()V

    return p2
.end method

.method public final ֫(Ljava/io/OutputStream;II)V
    .locals 1

    .line 282
    iget v0, p0, Ll/ܰۜ֨;->ۢ:I

    add-int/lit8 v0, v0, 0x1

    sub-int/2addr v0, p2

    iget-object p2, p0, Ll/ܰۜ֨;->֫:[B

    invoke-virtual {p1, p2, v0, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public abstract ֫(Ll/ۘ᩻֨;)V
.end method

.method public final ۧ(II)I
    .locals 3

    .line 336
    iget v0, p0, Ll/ܰۜ֨;->ۢ:I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ܰۜ֨;->֫:[B

    invoke-static {v2, v0, p1, v1, p2}, Ll/۟ۜ֨;->֫([BIIII)I

    move-result p1

    return p1
.end method

.method public abstract ۧ()Ll/֫᩷֨;
.end method

.method public final ۧ(I)Z
    .locals 1

    .line 277
    iget v0, p0, Ll/ܰۜ֨;->ۢ:I

    sub-int/2addr v0, p1

    iget p1, p0, Ll/ܰۜ֨;->᩷:I

    if-ge v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()V
    .locals 1

    .line 258
    iget v0, p0, Ll/ܰۜ֨;->ۡ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܰۜ֨;->᩷:I

    .line 259
    invoke-direct {p0}, Ll/ܰۜ֨;->᩻()V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 302
    iget v0, p0, Ll/ܰۜ֨;->ۢ:I

    return v0
.end method

.method public final ܽ(I)I
    .locals 2

    .line 393
    iget v0, p0, Ll/ܰۜ֨;->ۢ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܰۜ֨;->ۢ:I

    .line 394
    iget v1, p0, Ll/ܰۜ֨;->ۡ:I

    sub-int/2addr v1, v0

    if-ge v1, p1, :cond_1

    const/4 p1, 0x4

    if-lt v1, p1, :cond_0

    .line 397
    iget-boolean p1, p0, Ll/ܰۜ֨;->ܽ:Z

    if-nez p1, :cond_1

    .line 398
    :cond_0
    iget p1, p0, Ll/ܰۜ֨;->ۜ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܰۜ֨;->ۜ:I

    const/4 p1, 0x0

    return p1

    :cond_1
    return v1
.end method

.method public final ܿ()V
    .locals 2

    .line 267
    iget v0, p0, Ll/ܰۜ֨;->ۡ:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ܰۜ֨;->᩷:I

    .line 268
    iput-boolean v1, p0, Ll/ܰۜ֨;->ܽ:Z

    .line 269
    invoke-direct {p0}, Ll/ܰۜ֨;->᩻()V

    return-void
.end method

.method public abstract ᩳ(I)V
.end method

.method public final ᩳ()Z
    .locals 2

    .line 250
    iget v0, p0, Ll/ܰۜ֨;->ۢ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
