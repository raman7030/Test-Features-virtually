.class public final Ll/ܺۜۖ;
.super Ljava/io/FilterInputStream;
.source "V9OM"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 254
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 255
    iput p2, p0, Ll/ܺۜۖ;->᩸:I

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 260
    invoke-super {p0}, Ljava/io/FilterInputStream;->available()I

    move-result v0

    iget v1, p0, Ll/ܺۜۖ;->᩸:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final read()I
    .locals 2

    .line 265
    iget v0, p0, Ll/ܺۜۖ;->᩸:I

    if-gtz v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 268
    :cond_0
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    if-ltz v0, :cond_1

    .line 270
    iget v1, p0, Ll/ܺۜۖ;->᩸:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ܺۜۖ;->᩸:I

    :cond_1
    return v0
.end method

.method public final read([BII)I
    .locals 1

    .line 277
    iget v0, p0, Ll/ܺۜۖ;->᩸:I

    if-gtz v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 280
    :cond_0
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 281
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    if-ltz p1, :cond_1

    .line 283
    iget p2, p0, Ll/ܺۜۖ;->᩸:I

    sub-int/2addr p2, p1

    iput p2, p0, Ll/ܺۜۖ;->᩸:I

    :cond_1
    return p1
.end method

.method public final skip(J)J
    .locals 2

    .line 292
    iget v0, p0, Ll/ܺۜۖ;->᩸:I

    int-to-long v0, v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-super {p0, p1, p2}, Ljava/io/FilterInputStream;->skip(J)J

    move-result-wide p1

    long-to-int p2, p1

    if-ltz p2, :cond_0

    .line 295
    iget p1, p0, Ll/ܺۜۖ;->᩸:I

    sub-int/2addr p1, p2

    iput p1, p0, Ll/ܺۜۖ;->᩸:I

    :cond_0
    int-to-long p1, p2

    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
