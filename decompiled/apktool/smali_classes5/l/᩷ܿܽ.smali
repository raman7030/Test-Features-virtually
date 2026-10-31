.class public abstract Ll/᩷ܿܽ;
.super Ljava/lang/Object;
.source "H61Y"

# interfaces
.implements Ll/۫᩻ܽ;


# static fields
.field public static final ۧ:Ll/֡ۛۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 19
    new-instance v0, Ll/֡ۛۡ;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/᩷ܿܽ;->ۧ:Ll/֡ۛۡ;

    return-void
.end method

.method public static ֫(IIIII)I
    .locals 4

    int-to-long v0, p0

    int-to-long v2, p3

    add-long/2addr v2, v0

    if-le p2, p1, :cond_0

    if-gt p2, p3, :cond_0

    int-to-long p0, p2

    add-long v2, v0, p0

    :cond_0
    int-to-long p0, p4

    const-wide/16 p2, 0x0

    .line 269
    invoke-static {p2, p3, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    invoke-static {v2, v3, p0, p1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    cmp-long p4, p0, p2

    if-gtz p4, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    const-wide/32 p2, 0x7fffffff

    cmp-long p4, p0, p2

    if-ltz p4, :cond_2

    const p0, 0x7fffffff

    return p0

    :cond_2
    long-to-int p1, p0

    return p1
.end method

.method public static ֫(Ll/᩻ܿܽ;II)I
    .locals 1

    const/4 v0, 0x2

    .line 372
    invoke-static {p1, v0, p2}, Ll/᩷ܿܽ;->֫(III)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 375
    invoke-interface {p0, p1}, Ll/᩻ܿܽ;->֫(I)I

    move-result p0

    return p0

    .line 373
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unexpected end of string data"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(II[B)Ljava/lang/String;
    .locals 7

    if-ltz p0, :cond_7

    if-ltz p1, :cond_7

    .line 186
    array-length v0, p2

    if-gt p0, v0, :cond_7

    array-length v0, p2

    sub-int/2addr v0, p0

    if-lt v0, p1, :cond_7

    if-nez p1, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    add-int v0, p0, p1

    add-int/lit8 p1, p1, 0x1

    ushr-int/lit8 p1, p1, 0x1

    .line 193
    new-array p1, p1, [C

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, p0, 0x1

    const v4, 0xfffd

    if-ge v3, v0, :cond_5

    .line 232
    aget-byte v5, p2, p0

    and-int/lit16 v5, v5, 0xff

    aget-byte v3, p2, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v3, v5

    int-to-char v3, v3

    add-int/lit8 v5, p0, 0x2

    .line 199
    invoke-static {v3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/lit8 v6, p0, 0x3

    if-ge v6, v0, :cond_2

    .line 232
    aget-byte v5, p2, v5

    and-int/lit16 v5, v5, 0xff

    add-int/lit8 v6, p0, 0x3

    aget-byte v6, p2, v6

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v6, v6, 0x8

    or-int/2addr v5, v6

    int-to-char v5, v5

    .line 202
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_1

    add-int/lit8 v4, v2, 0x1

    .line 203
    aput-char v3, p1, v2

    add-int/lit8 v2, v2, 0x2

    .line 204
    aput-char v5, p1, v4

    add-int/lit8 p0, p0, 0x4

    goto :goto_0

    :cond_1
    add-int/lit8 v3, v2, 0x1

    .line 208
    aput-char v4, p1, v2

    add-int/lit8 p0, p0, 0x4

    move v2, v3

    goto :goto_0

    :cond_2
    add-int/lit8 p0, v2, 0x1

    .line 212
    aput-char v4, p1, v2

    move v2, p0

    move p0, v0

    goto :goto_0

    .line 215
    :cond_3
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result p0

    if-eqz p0, :cond_4

    add-int/lit8 p0, v2, 0x1

    .line 216
    aput-char v4, p1, v2

    goto :goto_1

    :cond_4
    add-int/lit8 p0, v2, 0x1

    .line 218
    aput-char v3, p1, v2

    :goto_1
    move v2, p0

    move p0, v5

    goto :goto_0

    :cond_5
    if-ge p0, v0, :cond_6

    add-int/lit8 p0, v2, 0x1

    .line 223
    aput-char v4, p1, v2

    move v2, p0

    .line 225
    :cond_6
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1, v1, v2}, Ljava/lang/String;-><init>([CII)V

    return-object p0

    .line 187
    :cond_7
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p0
.end method

.method private declared-synchronized ֫(Ll/ۗۜܽ;II)Ljava/lang/String;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 112
    :try_start_0
    new-instance v1, Ll/ܽܿܽ;

    invoke-direct {v1, p1}, Ll/ܽܿܽ;-><init>(Ll/ۗۜܽ;)V

    invoke-static {v1, p2, p3}, Ll/᩷ܿܽ;->ᩳ(Ll/᩻ܿܽ;II)Ll/ۜܿܽ;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 p3, 0x0

    if-nez p2, :cond_0

    .line 114
    monitor-exit v0

    return-object p3

    .line 116
    :cond_0
    :try_start_1
    sget-object v1, Ll/᩷ܿܽ;->ۧ:Ll/֡ۛۡ;

    invoke-virtual {v1}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/StringBuilder;

    if-nez v1, :cond_1

    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 121
    :cond_1
    :try_start_2
    invoke-virtual {p1}, Ll/ۗۜܽ;->֫()[B

    move-result-object p1

    iget v2, p2, Ll/ۜܿܽ;->ᩳ:I

    iget v3, p2, Ll/ۜܿܽ;->ܽ:I

    invoke-static {v1, p1, v2, v3}, Ll/ۛۖܽ;->֫(Ljava/lang/StringBuilder;[BII)V

    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 123
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    and-int/lit16 v2, v2, 0x7fff

    iget p2, p2, Ll/ۜܿܽ;->֫:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eq v2, p2, :cond_2

    .line 128
    :try_start_3
    invoke-static {v1}, Ll/᩷ܿܽ;->֫(Ljava/lang/StringBuilder;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 124
    monitor-exit v0

    return-object p3

    .line 128
    :cond_2
    :try_start_4
    invoke-static {v1}, Ll/᩷ܿܽ;->֫(Ljava/lang/StringBuilder;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 126
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 128
    :try_start_5
    invoke-static {v1}, Ll/᩷ܿܽ;->֫(Ljava/lang/StringBuilder;)V

    .line 129
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method private declared-synchronized ֫(Ll/᩻ۖܽ;II)Ljava/lang/String;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 169
    :try_start_0
    new-instance v1, Ll/ܳܿܽ;

    invoke-direct {v1, p1}, Ll/ܳܿܽ;-><init>(Ll/᩻ۖܽ;)V

    invoke-static {v1, p2, p3}, Ll/᩷ܿܽ;->ۧ(Ll/᩻ܿܽ;II)Ll/ۜܿܽ;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_0

    .line 171
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    .line 173
    :cond_0
    :try_start_1
    iget p3, p2, Ll/ۜܿܽ;->ܽ:I

    new-array v1, p3, [B

    .line 174
    iget v2, p2, Ll/ۜܿܽ;->ᩳ:I

    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    const/4 v2, 0x0

    .line 187
    invoke-virtual {p1, v1, v2, p3}, Ll/᩻ۖܽ;->֫([BII)V

    .line 176
    iget p1, p2, Ll/ۜܿܽ;->ܽ:I

    invoke-static {v2, p1, v1}, Ll/᩷ܿܽ;->֫(II[B)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 178
    :try_start_2
    new-instance p2, Ll/۟ܽܽ;

    .line 8
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 178
    throw p2

    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static ֫(Ljava/lang/StringBuilder;)V
    .locals 2

    const/4 v0, 0x0

    .line 383
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 384
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->capacity()I

    move-result v0

    const/16 v1, 0x1800

    if-gt v0, v1, :cond_0

    .line 385
    sget-object v0, Ll/᩷ܿܽ;->ۧ:Ll/֡ۛۡ;

    invoke-virtual {v0, p0}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static ֫(III)Z
    .locals 2

    if-ltz p0, :cond_0

    if-ltz p1, :cond_0

    int-to-long v0, p0

    int-to-long p0, p1

    add-long/2addr v0, p0

    int-to-long p0, p2

    cmp-long p2, v0, p0

    if-gtz p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ll/ۗۜܽ;IZI)I
    .locals 1

    .line 82
    :try_start_0
    new-instance v0, Ll/ܽܿܽ;

    invoke-direct {v0, p0}, Ll/ܽܿܽ;-><init>(Ll/ۗۜܽ;)V

    if-eqz p2, :cond_0

    .line 284
    invoke-static {v0, p1, p3}, Ll/᩷ܿܽ;->ᩳ(Ll/᩻ܿܽ;II)Ll/ۜܿܽ;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {v0, p1, p3}, Ll/᩷ܿܽ;->ۧ(Ll/᩻ܿܽ;II)Ll/ۜܿܽ;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    .line 83
    :cond_1
    iget p0, p0, Ll/ۜܿܽ;->ۧ:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :goto_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ۧ(Ll/᩻ۖܽ;IZI)I
    .locals 1

    .line 146
    :try_start_0
    new-instance v0, Ll/ܳܿܽ;

    invoke-direct {v0, p0}, Ll/ܳܿܽ;-><init>(Ll/᩻ۖܽ;)V

    if-eqz p2, :cond_0

    .line 284
    invoke-static {v0, p1, p3}, Ll/᩷ܿܽ;->ᩳ(Ll/᩻ܿܽ;II)Ll/ۜܿܽ;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {v0, p1, p3}, Ll/᩷ܿܽ;->ۧ(Ll/᩻ܿܽ;II)Ll/ۜܿܽ;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    const/4 p0, -0x1

    return p0

    .line 147
    :cond_1
    iget p0, p0, Ll/ۜܿܽ;->ۧ:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 149
    new-instance p1, Ll/۟ܽܽ;

    .line 8
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 149
    throw p1
.end method

.method public static ۧ(Ll/᩻ܿܽ;II)Ll/ۜܿܽ;
    .locals 9

    const/4 v0, 0x2

    .line 288
    invoke-static {p1, v0, p2}, Ll/᩷ܿܽ;->֫(III)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 291
    :cond_0
    invoke-static {p0, p1, p2}, Ll/᩷ܿܽ;->֫(Ll/᩻ܿܽ;II)I

    move-result v1

    const v2, 0x8000

    and-int/2addr v2, v1

    if-eqz v2, :cond_2

    const/4 v0, 0x4

    .line 295
    invoke-static {p1, v0, p2}, Ll/᩷ܿܽ;->֫(III)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, p1, 0x2

    .line 298
    invoke-static {p0, v2, p2}, Ll/᩷ܿܽ;->֫(Ll/᩻ܿܽ;II)I

    move-result v2

    and-int/lit16 v1, v1, 0x7fff

    int-to-long v3, v1

    const/16 v1, 0x10

    shl-long/2addr v3, v1

    int-to-long v1, v2

    or-long/2addr v1, v3

    goto :goto_0

    :cond_2
    int-to-long v1, v1

    :goto_0
    add-int/2addr p1, v0

    const-wide/16 v3, 0x2

    mul-long v1, v1, v3

    int-to-long v5, p1

    add-long/2addr v5, v1

    add-long/2addr v3, v5

    const-wide/32 v7, 0x7fffffff

    cmp-long v0, v1, v7

    if-gtz v0, :cond_5

    cmp-long v0, v5, v7

    if-gtz v0, :cond_5

    int-to-long v7, p2

    cmp-long v0, v3, v7

    if-lez v0, :cond_3

    goto :goto_1

    :cond_3
    long-to-int v0, v5

    .line 311
    invoke-static {p0, v0, p2}, Ll/᩷ܿܽ;->֫(Ll/᩻ܿܽ;II)I

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    .line 314
    :cond_4
    new-instance p0, Ll/ۜܿܽ;

    long-to-int p2, v1

    long-to-int v0, v3

    const/4 v1, -0x1

    invoke-direct {p0, p1, p2, v0, v1}, Ll/ۜܿܽ;-><init>(IIII)V

    return-object p0

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܽ(Ll/᩻ܿܽ;II)Ll/ᩳܿܽ;
    .locals 3

    const/4 v0, 0x1

    .line 339
    invoke-static {p1, v0, p2}, Ll/᩷ܿܽ;->֫(III)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 342
    :cond_0
    invoke-interface {p0, p1}, Ll/᩻ܿܽ;->ۧ(I)I

    move-result v1

    and-int/lit16 v2, v1, 0x80

    if-nez v2, :cond_1

    .line 344
    new-instance p0, Ll/ᩳܿܽ;

    add-int/2addr p1, v0

    invoke-direct {p0, v1, p1}, Ll/ᩳܿܽ;-><init>(II)V

    return-object p0

    :cond_1
    const/4 v0, 0x2

    .line 346
    invoke-static {p1, v0, p2}, Ll/᩷ܿܽ;->֫(III)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_2
    add-int/lit8 p2, p1, 0x1

    .line 349
    invoke-interface {p0, p2}, Ll/᩻ܿܽ;->ۧ(I)I

    move-result p0

    .line 350
    new-instance p2, Ll/ᩳܿܽ;

    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr p0, v1

    add-int/2addr p1, v0

    invoke-direct {p2, p0, p1}, Ll/ᩳܿܽ;-><init>(II)V

    return-object p2
.end method

.method public static ᩳ(Ll/᩻ܿܽ;II)Ll/ۜܿܽ;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 318
    invoke-static/range {p0 .. p2}, Ll/᩷ܿܽ;->ܽ(Ll/᩻ܿܽ;II)Ll/ᩳܿܽ;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_3

    .line 322
    :cond_0
    iget v3, v2, Ll/ᩳܿܽ;->֫:I

    invoke-static {v0, v3, v1}, Ll/᩷ܿܽ;->ܽ(Ll/᩻ܿܽ;II)Ll/ᩳܿܽ;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_3

    .line 326
    :cond_1
    iget v4, v3, Ll/ᩳܿܽ;->֫:I

    .line 327
    iget v3, v3, Ll/ᩳܿܽ;->ۧ:I

    int-to-long v5, v3

    const-wide/16 v7, -0x1

    const-wide/16 v9, 0x0

    move-wide v11, v9

    move-wide v9, v7

    move-wide v7, v5

    :goto_0
    const-wide/32 v13, 0x7fffffff

    cmp-long v15, v7, v9

    if-lez v15, :cond_4

    int-to-long v9, v4

    add-long/2addr v9, v7

    const-wide/16 v15, 0x1

    move/from16 p1, v4

    int-to-long v3, v1

    cmp-long v17, v9, v3

    if-ltz v17, :cond_2

    goto :goto_1

    :cond_2
    long-to-int v3, v9

    .line 362
    invoke-interface {v0, v3}, Ll/᩻ܿܽ;->ۧ(I)I

    move-result v3

    if-nez v3, :cond_3

    cmp-long v0, v7, v13

    if-gtz v0, :cond_5

    long-to-int v3, v7

    goto :goto_2

    :cond_3
    add-long/2addr v11, v15

    const/16 v3, 0xf

    shl-long v3, v11, v3

    or-long/2addr v3, v5

    move-wide v9, v7

    move-wide v7, v3

    move/from16 v4, p1

    goto :goto_0

    :cond_4
    move/from16 p1, v4

    const-wide/16 v15, 0x1

    :cond_5
    :goto_1
    const/4 v3, -0x1

    :goto_2
    if-gez v3, :cond_6

    goto :goto_3

    :cond_6
    move/from16 v0, p1

    int-to-long v4, v0

    int-to-long v6, v3

    add-long/2addr v4, v6

    add-long/2addr v4, v15

    cmp-long v1, v4, v13

    if-lez v1, :cond_7

    :goto_3
    const/4 v0, 0x0

    return-object v0

    .line 335
    :cond_7
    new-instance v1, Ll/ۜܿܽ;

    long-to-int v5, v4

    iget v2, v2, Ll/ᩳܿܽ;->ۧ:I

    invoke-direct {v1, v0, v3, v5, v2}, Ll/ۜܿܽ;-><init>(IIII)V

    return-object v1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    .line 38
    :goto_0
    invoke-interface {p0}, Ll/۫᩻ܽ;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 39
    invoke-interface {p0, v0}, Ll/۫᩻ܽ;->getItem(I)Ll/ۗ᩻ܽ;

    move-result-object v1

    .line 40
    invoke-interface {v1}, Ll/ۗ᩻ܽ;->᩺֫()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(Ll/ۗۜܽ;IZI)Ljava/lang/String;
    .locals 2

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    .line 97
    :try_start_0
    invoke-direct {p0, p1, p2, p4}, Ll/᩷ܿܽ;->֫(Ll/ۗۜܽ;II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v0, p0

    .line 0
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    :try_start_1
    new-instance p3, Ll/ܽܿܽ;

    invoke-direct {p3, p1}, Ll/ܽܿܽ;-><init>(Ll/ۗۜܽ;)V

    invoke-static {p3, p2, p4}, Ll/᩷ܿܽ;->ۧ(Ll/᩻ܿܽ;II)Ll/ۜܿܽ;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p2, :cond_1

    .line 106
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    .line 108
    :cond_1
    :try_start_3
    invoke-virtual {p1}, Ll/ۗۜܽ;->֫()[B

    move-result-object p1

    iget p3, p2, Ll/ۜܿܽ;->ᩳ:I

    iget p2, p2, Ll/ۜܿܽ;->ܽ:I

    invoke-static {p3, p2, p1}, Ll/᩷ܿܽ;->֫(II[B)Ljava/lang/String;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    return-object v1
.end method

.method public final ֫(Ll/᩻ۖܽ;IZI)Ljava/lang/String;
    .locals 5

    if-eqz p3, :cond_3

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 237
    :try_start_0
    new-instance p3, Ll/ܳܿܽ;

    invoke-direct {p3, p1}, Ll/ܳܿܽ;-><init>(Ll/᩻ۖܽ;)V

    invoke-static {p3, p2, p4}, Ll/᩷ܿܽ;->ᩳ(Ll/᩻ܿܽ;II)Ll/ۜܿܽ;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 p3, 0x0

    if-nez p2, :cond_0

    .line 239
    monitor-exit v0

    return-object p3

    .line 241
    :cond_0
    :try_start_1
    sget-object p4, Ll/᩷ܿܽ;->ۧ:Ll/֡ۛۡ;

    invoke-virtual {p4}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/StringBuilder;

    if-nez p4, :cond_1

    .line 243
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    :cond_1
    iget v1, p2, Ll/ۜܿܽ;->ܽ:I

    new-array v2, v1, [B

    .line 246
    iget v3, p2, Ll/ۜܿܽ;->ᩳ:I

    int-to-long v3, v3

    invoke-virtual {p1, v3, v4}, Ll/᩻ۖܽ;->seek(J)V

    const/4 v3, 0x0

    .line 187
    invoke-virtual {p1, v2, v3, v1}, Ll/᩻ۖܽ;->֫([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 249
    :try_start_2
    iget p1, p2, Ll/ۜܿܽ;->ܽ:I

    invoke-static {p4, v2, v3, p1}, Ll/ۛۖܽ;->֫(Ljava/lang/StringBuilder;[BII)V

    .line 250
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 251
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    and-int/lit16 v1, v1, 0x7fff

    iget p2, p2, Ll/ۜܿܽ;->֫:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eq v1, p2, :cond_2

    .line 256
    :try_start_3
    invoke-static {p4}, Ll/᩷ܿܽ;->֫(Ljava/lang/StringBuilder;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 252
    monitor-exit v0

    return-object p3

    .line 256
    :cond_2
    :try_start_4
    invoke-static {p4}, Ll/᩷ܿܽ;->֫(Ljava/lang/StringBuilder;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 254
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 256
    :try_start_5
    invoke-static {p4}, Ll/᩷ܿܽ;->֫(Ljava/lang/StringBuilder;)V

    .line 257
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 259
    :try_start_6
    new-instance p2, Ll/۟ܽܽ;

    .line 8
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 259
    throw p2

    :goto_0
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1

    .line 164
    :cond_3
    invoke-direct {p0, p1, p2, p4}, Ll/᩷ܿܽ;->֫(Ll/᩻ۖܽ;II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ljava/lang/Iterable;
    .locals 1

    .line 48
    new-instance v0, Ll/ܿܿܽ;

    invoke-direct {v0, p0}, Ll/ܿܿܽ;-><init>(Ll/᩷ܿܽ;)V

    return-object v0
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 1

    if-ltz p1, :cond_1

    .line 25
    invoke-interface {p0}, Ll/۫᩻ܽ;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {p0, p1}, Ll/۫᩻ܽ;->getItem(I)Ll/ۗ᩻ܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p0}, Ll/۫᩻ܽ;->size()I

    move-result v0

    .line 47
    invoke-static {p1, v0}, Ll/᩹ܽܽ;->ۧ(II)Ljava/lang/IndexOutOfBoundsException;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()Ljava/lang/Iterable;
    .locals 1

    .line 52
    new-instance v0, Ll/ܿܿܽ;

    invoke-direct {v0, p0}, Ll/ܿܿܽ;-><init>(Ll/᩷ܿܽ;)V

    return-object v0
.end method
