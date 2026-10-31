.class public final Ll/ܽ᩷ۖ;
.super Ll/ܳ᩷ۖ;
.source "39NU"


# instance fields
.field public final ܳ:I

.field public final ܿ:[B

.field public ᩻:I


# direct methods
.method public constructor <init>([BI)V
    .locals 4

    const/4 v0, 0x0

    .line 1148
    invoke-direct {p0, v0}, Ll/ܳ᩷ۖ;-><init>(I)V

    .line 1152
    array-length v1, p1

    sub-int/2addr v1, p2

    or-int/2addr v1, p2

    if-ltz v1, :cond_0

    .line 1158
    iput-object p1, p0, Ll/ܽ᩷ۖ;->ܿ:[B

    .line 1160
    iput v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    .line 1161
    iput p2, p0, Ll/ܽ᩷ۖ;->ܳ:I

    return-void

    .line 1153
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    array-length p1, p1

    .line 1156
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v0

    const/4 p1, 0x1

    aput-object v2, v3, p1

    const/4 p1, 0x2

    aput-object p2, v3, p1

    const-string p1, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"

    .line 1154
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 1479
    iget v0, p0, Ll/ܽ᩷ۖ;->ܳ:I

    iget v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ֫(B)V
    .locals 7

    .line 1310
    :try_start_0
    iget-object v0, p0, Ll/ܽ᩷ۖ;->ܿ:[B

    iget v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܽ᩷ۖ;->᩻:I

    aput-byte p1, v0, v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 1312
    new-instance v0, Ll/ᩳ᩷ۖ;

    iget v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    .line 1313
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/ܽ᩷ۖ;->ܳ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    aput-object v2, v5, v3

    const/4 v1, 0x2

    aput-object v4, v5, v1

    const-string v1, "Pos: %d, limit: %d, len: %d"

    invoke-static {v1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ᩳ᩷ۖ;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw v0
.end method

.method public final ֫(I)V
    .locals 7

    .line 1348
    :try_start_0
    iget-object v0, p0, Ll/ܽ᩷ۖ;->ܿ:[B

    iget v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܽ᩷ۖ;->᩻:I

    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x2

    .line 1349
    iput v3, p0, Ll/ܽ᩷ۖ;->᩻:I

    shr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x3

    .line 1350
    iput v2, p0, Ll/ܽ᩷ۖ;->᩻:I

    shr-int/lit8 v4, p1, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x4

    .line 1351
    iput v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 1353
    new-instance v0, Ll/ᩳ᩷ۖ;

    iget v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    .line 1354
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/ܽ᩷ۖ;->ܳ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    aput-object v2, v5, v3

    const/4 v1, 0x2

    aput-object v4, v5, v1

    const-string v1, "Pos: %d, limit: %d, len: %d"

    invoke-static {v1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ᩳ᩷ۖ;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw v0
.end method

.method public final ֫(II)V
    .locals 1

    const/4 v0, 0x5

    .line 1183
    invoke-virtual {p0, p1, v0}, Ll/ܽ᩷ۖ;->ܽ(II)V

    .line 1184
    invoke-virtual {p0, p2}, Ll/ܽ᩷ۖ;->֫(I)V

    return-void
.end method

.method public final ֫(II[B)V
    .locals 0

    .line 1418
    invoke-virtual {p0, p3, p1, p2}, Ll/ܽ᩷ۖ;->֫([BII)V

    return-void
.end method

.method public final ֫(IJ)V
    .locals 1

    const/4 v0, 0x1

    .line 1195
    invoke-virtual {p0, p1, v0}, Ll/ܽ᩷ۖ;->ܽ(II)V

    .line 1196
    invoke-virtual {p0, p2, p3}, Ll/ܽ᩷ۖ;->֫(J)V

    return-void
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    .line 1207
    invoke-virtual {p0, p1, v0}, Ll/ܽ᩷ۖ;->ܽ(II)V

    .line 1208
    invoke-virtual {p0, p2}, Ll/ܽ᩷ۖ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(ILl/ۛۜۖ;)V
    .locals 1

    const/4 v0, 0x2

    .line 1213
    invoke-virtual {p0, p1, v0}, Ll/ܽ᩷ۖ;->ܽ(II)V

    .line 1214
    invoke-virtual {p0, p2}, Ll/ܽ᩷ۖ;->֫(Ll/ۛۜۖ;)V

    return-void
.end method

.method public final ֫(ILl/ۡ֡ۖ;Ll/ۢۚۖ;)V
    .locals 1

    const/4 v0, 0x2

    .line 1272
    invoke-virtual {p0, p1, v0}, Ll/ܽ᩷ۖ;->ܽ(II)V

    .line 1273
    move-object p1, p2

    check-cast p1, Ll/ۘۜۖ;

    invoke-virtual {p1, p3}, Ll/ۘۜۖ;->getSerializedSize(Ll/ۢۚۖ;)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܽ᩷ۖ;->ܽ(I)V

    .line 1274
    iget-object p1, p0, Ll/ܳ᩷ۖ;->֫:Ll/᩻᩷ۖ;

    invoke-interface {p3, p2, p1}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ll/ۜ۠ۖ;)V

    return-void
.end method

.method public final ֫(IZ)V
    .locals 1

    const/4 v0, 0x0

    .line 1201
    invoke-virtual {p0, p1, v0}, Ll/ܽ᩷ۖ;->ܽ(II)V

    int-to-byte p1, p2

    .line 1202
    invoke-virtual {p0, p1}, Ll/ܽ᩷ۖ;->֫(B)V

    return-void
.end method

.method public final ֫(I[B)V
    .locals 1

    .line 1247
    invoke-virtual {p0, p1}, Ll/ܽ᩷ۖ;->ܽ(I)V

    const/4 v0, 0x0

    .line 1248
    invoke-virtual {p0, p2, v0, p1}, Ll/ܽ᩷ۖ;->֫([BII)V

    return-void
.end method

.method public final ֫(J)V
    .locals 7

    .line 1391
    :try_start_0
    iget-object v0, p0, Ll/ܽ᩷ۖ;->ܿ:[B

    iget v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܽ᩷ۖ;->᩻:I

    long-to-int v3, p1

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x2

    .line 1392
    iput v3, p0, Ll/ܽ᩷ۖ;->᩻:I

    const/16 v4, 0x8

    shr-long v5, p1, v4

    long-to-int v6, v5

    and-int/lit16 v5, v6, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v1, 0x3

    .line 1393
    iput v2, p0, Ll/ܽ᩷ۖ;->᩻:I

    const/16 v5, 0x10

    shr-long v5, p1, v5

    long-to-int v6, v5

    and-int/lit16 v5, v6, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    add-int/lit8 v3, v1, 0x4

    .line 1394
    iput v3, p0, Ll/ܽ᩷ۖ;->᩻:I

    const/16 v5, 0x18

    shr-long v5, p1, v5

    long-to-int v6, v5

    and-int/lit16 v5, v6, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v1, 0x5

    .line 1395
    iput v2, p0, Ll/ܽ᩷ۖ;->᩻:I

    const/16 v5, 0x20

    shr-long v5, p1, v5

    long-to-int v6, v5

    and-int/lit16 v5, v6, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    add-int/lit8 v3, v1, 0x6

    .line 1396
    iput v3, p0, Ll/ܽ᩷ۖ;->᩻:I

    const/16 v5, 0x28

    shr-long v5, p1, v5

    long-to-int v6, v5

    and-int/lit16 v5, v6, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v2

    add-int/lit8 v2, v1, 0x7

    .line 1397
    iput v2, p0, Ll/ܽ᩷ۖ;->᩻:I

    const/16 v5, 0x30

    shr-long v5, p1, v5

    long-to-int v6, v5

    and-int/lit16 v5, v6, 0xff

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    add-int/2addr v1, v4

    .line 1398
    iput v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    const/16 v1, 0x38

    shr-long/2addr p1, v1

    long-to-int p2, p1

    and-int/lit16 p1, p2, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 1400
    new-instance p2, Ll/ᩳ᩷ۖ;

    iget v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    .line 1401
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ܽ᩷ۖ;->ܳ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    aput-object v1, v4, v2

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const-string v0, "Pos: %d, limit: %d, len: %d"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ll/ᩳ᩷ۖ;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 5

    .line 1440
    iget v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    .line 1444
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    .line 1445
    invoke-static {v1}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v1

    .line 1446
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v2
    :try_end_0
    .catch Ll/ۗ֨ۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1447
    iget-object v3, p0, Ll/ܽ᩷ۖ;->ܿ:[B

    if-ne v2, v1, :cond_0

    add-int v1, v0, v2

    .line 1448
    :try_start_1
    iput v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    .line 1449
    invoke-virtual {p0}, Ll/ܽ᩷ۖ;->֫()I

    move-result v4

    invoke-static {v1, v4, p1, v3}, Ll/۫֨ۖ;->֫(IILjava/lang/String;[B)I

    move-result v1

    .line 1452
    iput v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    sub-int v3, v1, v0

    sub-int/2addr v3, v2

    .line 1454
    invoke-virtual {p0, v3}, Ll/ܽ᩷ۖ;->ܽ(I)V

    .line 1455
    iput v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    return-void

    .line 1457
    :cond_0
    invoke-static {p1}, Ll/۫֨ۖ;->֫(Ljava/lang/String;)I

    move-result v1

    .line 1458
    invoke-virtual {p0, v1}, Ll/ܽ᩷ۖ;->ܽ(I)V

    .line 1459
    iget v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    invoke-virtual {p0}, Ll/ܽ᩷ۖ;->֫()I

    move-result v2

    invoke-static {v1, v2, p1, v3}, Ll/۫֨ۖ;->֫(IILjava/lang/String;[B)I

    move-result v1

    iput v1, p0, Ll/ܽ᩷ۖ;->᩻:I
    :try_end_1
    .catch Ll/ۗ֨ۖ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 1468
    new-instance v0, Ll/ᩳ᩷ۖ;

    invoke-direct {v0, p1}, Ll/ᩳ᩷ۖ;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    throw v0

    :catch_1
    move-exception v1

    .line 1463
    iput v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    .line 1466
    invoke-virtual {p0, p1, v1}, Ll/ܳ᩷ۖ;->֫(Ljava/lang/String;Ll/ۗ֨ۖ;)V

    return-void
.end method

.method public final ֫(Ll/ۛۜۖ;)V
    .locals 1

    .line 1240
    invoke-virtual {p1}, Ll/ۛۜۖ;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܽ᩷ۖ;->ܽ(I)V

    .line 1241
    invoke-virtual {p1, p0}, Ll/ۛۜۖ;->֫(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ֫(Ll/ۡ֡ۖ;)V
    .locals 1

    .line 1297
    invoke-interface {p1}, Ll/ۡ֡ۖ;->getSerializedSize()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܽ᩷ۖ;->ܽ(I)V

    .line 1298
    invoke-interface {p1, p0}, Ll/ۡ֡ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ֫([BII)V
    .locals 4

    .line 1408
    :try_start_0
    iget-object v0, p0, Ll/ܽ᩷ۖ;->ܿ:[B

    iget v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1409
    iget p1, p0, Ll/ܽ᩷ۖ;->᩻:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ܽ᩷ۖ;->᩻:I
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 1411
    new-instance p2, Ll/ᩳ᩷ۖ;

    iget v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    .line 1412
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ܽ᩷ۖ;->ܳ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object p3, v2, v0

    const-string p3, "Pos: %d, limit: %d, len: %d"

    invoke-static {p3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ll/ᩳ᩷ۖ;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method

.method public final ۧ(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 1320
    invoke-virtual {p0, p1}, Ll/ܽ᩷ۖ;->ܽ(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    .line 1323
    invoke-virtual {p0, v0, v1}, Ll/ܽ᩷ۖ;->ۧ(J)V

    return-void
.end method

.method public final ۧ(II)V
    .locals 1

    const/4 v0, 0x0

    .line 1171
    invoke-virtual {p0, p1, v0}, Ll/ܽ᩷ۖ;->ܽ(II)V

    .line 1172
    invoke-virtual {p0, p2}, Ll/ܽ᩷ۖ;->ۧ(I)V

    return-void
.end method

.method public final ۧ(IJ)V
    .locals 1

    const/4 v0, 0x0

    .line 1189
    invoke-virtual {p0, p1, v0}, Ll/ܽ᩷ۖ;->ܽ(II)V

    .line 1190
    invoke-virtual {p0, p2, p3}, Ll/ܽ᩷ۖ;->ۧ(J)V

    return-void
.end method

.method public final ۧ(ILl/ۛۜۖ;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    .line 1289
    invoke-virtual {p0, v0, v1}, Ll/ܽ᩷ۖ;->ܽ(II)V

    const/4 v2, 0x2

    .line 1290
    invoke-virtual {p0, v2, p1}, Ll/ܽ᩷ۖ;->ᩳ(II)V

    .line 1291
    invoke-virtual {p0, v1, p2}, Ll/ܽ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    const/4 p1, 0x4

    .line 1292
    invoke-virtual {p0, v0, p1}, Ll/ܽ᩷ۖ;->ܽ(II)V

    return-void
.end method

.method public final ۧ(ILl/ۡ֡ۖ;)V
    .locals 1

    const/4 v0, 0x2

    .line 1265
    invoke-virtual {p0, p1, v0}, Ll/ܽ᩷ۖ;->ܽ(II)V

    .line 1266
    invoke-virtual {p0, p2}, Ll/ܽ᩷ۖ;->֫(Ll/ۡ֡ۖ;)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 9

    .line 1360
    invoke-static {}, Ll/ܳ᩷ۖ;->ۧ()Z

    move-result v0

    const/4 v1, 0x7

    const-wide/16 v2, 0x0

    const-wide/16 v4, -0x80

    iget-object v6, p0, Ll/ܽ᩷ۖ;->ܿ:[B

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/ܽ᩷ۖ;->֫()I

    move-result v0

    const/16 v7, 0xa

    if-lt v0, v7, :cond_1

    :goto_0
    and-long v7, p1, v4

    cmp-long v0, v7, v2

    if-nez v0, :cond_0

    .line 1363
    iget v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    int-to-long v0, v0

    long-to-int p2, p1

    int-to-byte p1, p2

    invoke-static {v6, v0, v1, p1}, Ll/᩸֨ۖ;->֫([BJB)V

    return-void

    .line 1366
    :cond_0
    iget v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    add-int/lit8 v7, v0, 0x1

    iput v7, p0, Ll/ܽ᩷ۖ;->᩻:I

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

    .line 1374
    :try_start_0
    iget v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    long-to-int p2, p1

    int-to-byte p1, p2

    aput-byte p1, v6, v0

    return-void

    .line 1377
    :cond_2
    iget v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    add-int/lit8 v7, v0, 0x1

    iput v7, p0, Ll/ܽ᩷ۖ;->᩻:I

    long-to-int v7, p1

    or-int/lit16 v7, v7, 0x80

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, v6, v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    ushr-long/2addr p1, v1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 1382
    new-instance p2, Ll/ᩳ᩷ۖ;

    iget v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    .line 1383
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ܽ᩷ۖ;->ܳ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    aput-object v1, v4, v2

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const-string v0, "Pos: %d, limit: %d, len: %d"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ll/ᩳ᩷ۖ;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw p2
.end method

.method public final ܽ(I)V
    .locals 7

    :goto_0
    and-int/lit8 v0, p1, -0x80

    .line 1331
    iget-object v1, p0, Ll/ܽ᩷ۖ;->ܿ:[B

    if-nez v0, :cond_0

    .line 1332
    :try_start_0
    iget v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ܽ᩷ۖ;->᩻:I

    int-to-byte p1, p1

    aput-byte p1, v1, v0

    return-void

    .line 1335
    :cond_0
    iget v0, p0, Ll/ܽ᩷ۖ;->᩻:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ܽ᩷ۖ;->᩻:I

    or-int/lit16 v2, p1, 0x80

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :catch_0
    move-exception p1

    .line 1340
    new-instance v0, Ll/ᩳ᩷ۖ;

    iget v1, p0, Ll/ܽ᩷ۖ;->᩻:I

    .line 1341
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/ܽ᩷ۖ;->ܳ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    aput-object v2, v5, v3

    const/4 v1, 0x2

    aput-object v4, v5, v1

    const-string v1, "Pos: %d, limit: %d, len: %d"

    invoke-static {v1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ᩳ᩷ۖ;-><init>(Ljava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V

    throw v0
.end method

.method public final ܽ(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    .line 1166
    invoke-virtual {p0, p1}, Ll/ܽ᩷ۖ;->ܽ(I)V

    return-void
.end method

.method public final ܽ(ILl/ۡ֡ۖ;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    .line 1280
    invoke-virtual {p0, v0, v1}, Ll/ܽ᩷ۖ;->ܽ(II)V

    const/4 v2, 0x2

    .line 1281
    invoke-virtual {p0, v2, p1}, Ll/ܽ᩷ۖ;->ᩳ(II)V

    .line 1282
    invoke-virtual {p0, v1, p2}, Ll/ܽ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    const/4 p1, 0x4

    .line 1283
    invoke-virtual {p0, v0, p1}, Ll/ܽ᩷ۖ;->ܽ(II)V

    return-void
.end method

.method public final ᩳ(II)V
    .locals 1

    const/4 v0, 0x0

    .line 1177
    invoke-virtual {p0, p1, v0}, Ll/ܽ᩷ۖ;->ܽ(II)V

    .line 1178
    invoke-virtual {p0, p2}, Ll/ܽ᩷ۖ;->ܽ(I)V

    return-void
.end method
