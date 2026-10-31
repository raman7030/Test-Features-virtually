.class public final Ll/֡ᩳ֡;
.super Ll/ۨܽ֡;
.source "B4EZ"


# instance fields
.field public final transient ۫:[[B

.field public final transient ۬:[I


# direct methods
.method public constructor <init>(Ll/۫ܽ֡;I)V
    .locals 7

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, v0}, Ll/ۨܽ֡;-><init>([B)V

    .line 58
    iget-wide v1, p1, Ll/۫ܽ֡;->᩹:J

    const-wide/16 v3, 0x0

    int-to-long v5, p2

    invoke-static/range {v1 .. v6}, Ll/᩸ᩳ֡;->֫(JJJ)V

    .line 63
    iget-object v0, p1, Ll/۫ܽ֡;->᩸:Ll/ᩴᩳ֡;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, p2, :cond_1

    .line 64
    iget v4, v0, Ll/ᩴᩳ֡;->ۧ:I

    iget v5, v0, Ll/ᩴᩳ֡;->ܿ:I

    if-eq v4, v5, :cond_0

    sub-int/2addr v4, v5

    add-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    .line 63
    iget-object v0, v0, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    goto :goto_0

    .line 65
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "s.limit == s.pos"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 72
    :cond_1
    new-array v0, v3, [[B

    iput-object v0, p0, Ll/֡ᩳ֡;->۫:[[B

    mul-int/lit8 v3, v3, 0x2

    .line 73
    new-array v0, v3, [I

    iput-object v0, p0, Ll/֡ᩳ֡;->۬:[I

    .line 76
    iget-object p1, p1, Ll/۫ܽ֡;->᩸:Ll/ᩴᩳ֡;

    const/4 v0, 0x0

    :goto_1
    if-ge v1, p2, :cond_3

    .line 77
    iget-object v2, p0, Ll/֡ᩳ֡;->۫:[[B

    iget-object v3, p1, Ll/ᩴᩳ֡;->֫:[B

    aput-object v3, v2, v0

    .line 78
    iget v3, p1, Ll/ᩴᩳ֡;->ۧ:I

    iget v4, p1, Ll/ᩴᩳ֡;->ܿ:I

    sub-int/2addr v3, v4

    add-int/2addr v3, v1

    if-le v3, p2, :cond_2

    move v1, p2

    goto :goto_2

    :cond_2
    move v1, v3

    .line 82
    :goto_2
    iget-object v3, p0, Ll/֡ᩳ֡;->۬:[I

    aput v1, v3, v0

    .line 83
    array-length v2, v2

    add-int/2addr v2, v0

    aput v4, v3, v2

    const/4 v2, 0x1

    .line 84
    iput-boolean v2, p1, Ll/ᩴᩳ֡;->᩻:Z

    add-int/lit8 v0, v0, 0x1

    .line 76
    iget-object p1, p1, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    goto :goto_1

    :cond_3
    return-void
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 1

    .line 296
    invoke-direct {p0}, Ll/֡ᩳ֡;->֡()Ll/ۨܽ֡;

    move-result-object v0

    return-object v0
.end method

.method private ֡()Ll/ۨܽ֡;
    .locals 2

    .line 257
    new-instance v0, Ll/ۨܽ֡;

    invoke-virtual {p0}, Ll/֡ᩳ֡;->ܺ()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۨܽ֡;-><init>([B)V

    return-object v0
.end method

.method private ۧ(I)I
    .locals 3

    .line 156
    iget-object v0, p0, Ll/֡ᩳ֡;->۫:[[B

    array-length v0, v0

    add-int/lit8 p1, p1, 0x1

    iget-object v1, p0, Ll/֡ᩳ֡;->۬:[I

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, p1}, Ljava/util/Arrays;->binarySearch([IIII)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    not-int p1, p1

    return p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    .line 266
    :cond_0
    instance-of v0, p1, Ll/ۨܽ֡;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ۨܽ֡;

    .line 267
    invoke-virtual {p1}, Ll/ۨܽ֡;->᩷()I

    move-result v0

    invoke-virtual {p0}, Ll/֡ᩳ֡;->᩷()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 268
    invoke-virtual {p0}, Ll/֡ᩳ֡;->᩷()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Ll/֡ᩳ֡;->֫(Ll/ۨܽ֡;I)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 9

    .line 272
    iget v0, p0, Ll/ۨܽ֡;->᩹:I

    if-eqz v0, :cond_0

    return v0

    .line 278
    :cond_0
    iget-object v0, p0, Ll/֡ᩳ֡;->۫:[[B

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    :goto_0
    if-ge v2, v1, :cond_2

    .line 279
    aget-object v5, v0, v2

    add-int v6, v1, v2

    .line 280
    iget-object v7, p0, Ll/֡ᩳ֡;->۬:[I

    aget v6, v7, v6

    .line 281
    aget v7, v7, v2

    sub-int v3, v7, v3

    add-int/2addr v3, v6

    :goto_1
    if-ge v6, v3, :cond_1

    mul-int/lit8 v4, v4, 0x1f

    .line 284
    aget-byte v8, v5, v6

    add-int/2addr v4, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v3, v7

    goto :goto_0

    .line 288
    :cond_2
    iput v4, p0, Ll/ۨܽ֡;->᩹:I

    return v4
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 292
    invoke-direct {p0}, Ll/֡ᩳ֡;->֡()Ll/ۨܽ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܽ֡;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)B
    .locals 9

    .line 146
    iget-object v0, p0, Ll/֡ᩳ֡;->۫:[[B

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Ll/֡ᩳ֡;->۬:[I

    aget v1, v2, v1

    int-to-long v3, v1

    int-to-long v5, p1

    const-wide/16 v7, 0x1

    invoke-static/range {v3 .. v8}, Ll/᩸ᩳ֡;->֫(JJJ)V

    .line 147
    invoke-direct {p0, p1}, Ll/֡ᩳ֡;->ۧ(I)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v3, v1, -0x1

    .line 148
    aget v3, v2, v3

    .line 149
    :goto_0
    array-length v4, v0

    add-int/2addr v4, v1

    aget v2, v2, v4

    .line 150
    aget-object v0, v0, v1

    sub-int/2addr p1, v3

    add-int/2addr p1, v2

    aget-byte p1, v0, p1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 98
    invoke-direct {p0}, Ll/֡ᩳ֡;->֡()Ll/ۨܽ֡;

    move-result-object v0

    .line 131
    iget-object v0, v0, Ll/ۨܽ֡;->᩸:[B

    invoke-static {v0}, Ll/ۗܽ֡;->֫([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۫ܽ֡;)V
    .locals 9

    .line 194
    iget-object v0, p0, Ll/֡ᩳ֡;->۫:[[B

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    add-int v4, v1, v2

    .line 195
    iget-object v5, p0, Ll/֡ᩳ֡;->۬:[I

    aget v4, v5, v4

    .line 196
    aget v5, v5, v2

    .line 197
    new-instance v6, Ll/ᩴᩳ֡;

    aget-object v7, v0, v2

    add-int v8, v4, v5

    sub-int/2addr v8, v3

    invoke-direct {v6, v7, v4, v8}, Ll/ᩴᩳ֡;-><init>([BII)V

    .line 199
    iget-object v3, p1, Ll/۫ܽ֡;->᩸:Ll/ᩴᩳ֡;

    if-nez v3, :cond_0

    .line 200
    iput-object v6, v6, Ll/ᩴᩳ֡;->ܳ:Ll/ᩴᩳ֡;

    iput-object v6, v6, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    iput-object v6, p1, Ll/۫ܽ֡;->᩸:Ll/ᩴᩳ֡;

    goto :goto_1

    .line 202
    :cond_0
    iget-object v3, v3, Ll/ᩴᩳ֡;->ܳ:Ll/ᩴᩳ֡;

    invoke-virtual {v3, v6}, Ll/ᩴᩳ֡;->֫(Ll/ᩴᩳ֡;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    .line 206
    :cond_1
    iget-wide v0, p1, Ll/۫ܽ֡;->᩹:J

    int-to-long v2, v3

    add-long/2addr v0, v2

    iput-wide v0, p1, Ll/۫ܽ֡;->᩹:J

    return-void
.end method

.method public final ֫(I[BII)Z
    .locals 8

    const/4 v0, 0x0

    if-ltz p1, :cond_5

    .line 228
    invoke-virtual {p0}, Ll/֡ᩳ֡;->᩷()I

    move-result v1

    sub-int/2addr v1, p4

    if-gt p1, v1, :cond_5

    if-ltz p3, :cond_5

    array-length v1, p2

    sub-int/2addr v1, p4

    if-le p3, v1, :cond_0

    goto :goto_3

    .line 233
    :cond_0
    invoke-direct {p0, p1}, Ll/֡ᩳ֡;->ۧ(I)I

    move-result v1

    :goto_0
    if-lez p4, :cond_4

    .line 234
    iget-object v2, p0, Ll/֡ᩳ֡;->۬:[I

    if-nez v1, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v1, -0x1

    aget v3, v2, v3

    .line 235
    :goto_1
    aget v4, v2, v1

    sub-int/2addr v4, v3

    add-int/2addr v4, v3

    sub-int/2addr v4, p1

    .line 236
    invoke-static {p4, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 237
    iget-object v5, p0, Ll/֡ᩳ֡;->۫:[[B

    array-length v6, v5

    add-int/2addr v6, v1

    aget v2, v2, v6

    sub-int v3, p1, v3

    add-int/2addr v3, v2

    .line 239
    aget-object v2, v5, v1

    sget-object v5, Ll/᩸ᩳ֡;->֫:Ljava/nio/charset/Charset;

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_3

    add-int v6, v5, v3

    .line 76
    aget-byte v6, v2, v6

    add-int v7, v5, p3

    aget-byte v7, p2, v7

    if-eq v6, v7, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    add-int/2addr p1, v4

    add-int/2addr p3, v4

    sub-int/2addr p4, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_3
    return v0
.end method

.method public final ֫(Ll/ۨܽ֡;I)Z
    .locals 9

    .line 211
    invoke-virtual {p0}, Ll/֡ᩳ֡;->᩷()I

    move-result v0

    sub-int/2addr v0, p2

    const/4 v1, 0x0

    if-gez v0, :cond_0

    goto :goto_2

    .line 213
    :cond_0
    invoke-direct {p0, v1}, Ll/֡ᩳ֡;->ۧ(I)I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-lez p2, :cond_3

    .line 214
    iget-object v4, p0, Ll/֡ᩳ֡;->۬:[I

    if-nez v0, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v0, -0x1

    aget v5, v4, v5

    .line 215
    :goto_1
    aget v6, v4, v0

    sub-int/2addr v6, v5

    add-int/2addr v6, v5

    sub-int/2addr v6, v2

    .line 216
    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 217
    iget-object v7, p0, Ll/֡ᩳ֡;->۫:[[B

    array-length v8, v7

    add-int/2addr v8, v0

    aget v4, v4, v8

    sub-int v5, v2, v5

    add-int/2addr v5, v4

    .line 219
    aget-object v4, v7, v0

    invoke-virtual {p1, v3, v4, v5, v6}, Ll/ۨܽ֡;->֫(I[BII)Z

    move-result v4

    if-nez v4, :cond_2

    :goto_2
    return v1

    :cond_2
    add-int/2addr v2, v6

    add-int/2addr v3, v6

    sub-int/2addr p2, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final ۡ()Ll/ۨܽ֡;
    .locals 1

    .line 106
    invoke-direct {p0}, Ll/֡ᩳ֡;->֡()Ll/ۨܽ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܽ֡;->ۡ()Ll/ۨܽ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ll/ۨܽ֡;
    .locals 1

    .line 142
    invoke-direct {p0}, Ll/֡ᩳ֡;->֡()Ll/ۨܽ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܽ֡;->ۢ()Ll/ۨܽ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 102
    invoke-direct {p0}, Ll/֡ᩳ֡;->֡()Ll/ۨܽ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܽ֡;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()[B
    .locals 10

    .line 165
    iget-object v0, p0, Ll/֡ᩳ֡;->۫:[[B

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Ll/֡ᩳ֡;->۬:[I

    aget v1, v2, v1

    new-array v1, v1, [B

    .line 167
    array-length v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    add-int v6, v3, v4

    .line 168
    aget v6, v2, v6

    .line 169
    aget v7, v2, v4

    .line 170
    aget-object v8, v0, v4

    sub-int v9, v7, v5

    invoke-static {v8, v6, v1, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v4, v4, 0x1

    move v5, v7

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final ܿ()Ll/ۨܽ֡;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 90
    invoke-direct {p0}, Ll/֡ᩳ֡;->֡()Ll/ۨܽ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܽ֡;->ᩴ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()I
    .locals 2

    .line 161
    iget-object v0, p0, Ll/֡ᩳ֡;->۫:[[B

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Ll/֡ᩳ֡;->۬:[I

    aget v0, v1, v0

    return v0
.end method

.method public final ᩻()Ll/ۨܽ֡;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
