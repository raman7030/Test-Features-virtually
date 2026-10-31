.class public Ll/۫ۜۖ;
.super Ll/۬ۜۖ;
.source "Y4D9"


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public final ۙ:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 965
    invoke-direct {p0}, Ll/ۛۜۖ;-><init>()V

    .line 1378
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1380
    iput-object p1, p0, Ll/۫ۜۖ;->ۙ:[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1486
    :cond_0
    instance-of v1, p1, Ll/ۛۜۖ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 1490
    :cond_1
    invoke-virtual {p0}, Ll/۫ۜۖ;->size()I

    move-result v1

    move-object v3, p1

    check-cast v3, Ll/ۛۜۖ;

    invoke-virtual {v3}, Ll/ۛۜۖ;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    .line 1493
    :cond_2
    invoke-virtual {p0}, Ll/۫ۜۖ;->size()I

    move-result v1

    if-nez v1, :cond_3

    return v0

    .line 1497
    :cond_3
    instance-of v0, p1, Ll/۫ۜۖ;

    if-eqz v0, :cond_a

    .line 1498
    check-cast p1, Ll/۫ۜۖ;

    .line 1501
    invoke-virtual {p0}, Ll/ۛۜۖ;->ᩳ()I

    move-result v0

    .line 1502
    invoke-virtual {p1}, Ll/ۛۜۖ;->ᩳ()I

    move-result v1

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    if-eq v0, v1, :cond_4

    return v2

    .line 1507
    :cond_4
    invoke-virtual {p0}, Ll/۫ۜۖ;->size()I

    move-result v0

    .line 1525
    invoke-virtual {p1}, Ll/۫ۜۖ;->size()I

    move-result v1

    if-gt v0, v1, :cond_9

    add-int v1, v2, v0

    .line 1528
    invoke-virtual {p1}, Ll/۫ۜۖ;->size()I

    move-result v3

    if-gt v1, v3, :cond_8

    .line 1533
    instance-of v3, p1, Ll/۫ۜۖ;

    const/4 v4, 0x0

    if-eqz v3, :cond_7

    .line 1536
    iget-object v1, p1, Ll/۫ۜۖ;->ۙ:[B

    .line 1537
    invoke-virtual {p0}, Ll/۫ۜۖ;->᩻()I

    move-result v3

    add-int/2addr v3, v0

    .line 1538
    invoke-virtual {p0}, Ll/۫ۜۖ;->᩻()I

    move-result v0

    .line 1539
    invoke-virtual {p1}, Ll/۫ۜۖ;->᩻()I

    move-result p1

    add-int/2addr p1, v2

    :goto_0
    if-ge v0, v3, :cond_6

    .line 1542
    iget-object v2, p0, Ll/۫ۜۖ;->ۙ:[B

    aget-byte v2, v2, v0

    aget-byte v5, v1, p1

    if-eq v2, v5, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_6
    const/4 v4, 0x1

    goto :goto_1

    .line 1549
    :cond_7
    invoke-virtual {p1, v2, v1}, Ll/۫ۜۖ;->ۧ(II)Ll/ۛۜۖ;

    move-result-object p1

    invoke-virtual {p0, v4, v0}, Ll/۫ۜۖ;->ۧ(II)Ll/ۛۜۖ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۛۜۖ;->equals(Ljava/lang/Object;)Z

    move-result v4

    :goto_1
    return v4

    .line 1529
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Ran off end of other: "

    const-string v4, ", "

    .line 0
    invoke-static {v3, v2, v4, v4, v0}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1530
    invoke-virtual {p1}, Ll/۫ۜۖ;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1526
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Length too large: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/۫ۜۖ;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1510
    :cond_a
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public size()I
    .locals 1

    .line 1398
    iget-object v0, p0, Ll/۫ۜۖ;->ۙ:[B

    array-length v0, v0

    return v0
.end method

.method public ֫(I)B
    .locals 1

    .line 1388
    iget-object v0, p0, Ll/۫ۜۖ;->ۙ:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final ֫(III)I
    .locals 2

    .line 1554
    invoke-virtual {p0}, Ll/۫ۜۖ;->᩻()I

    move-result v0

    add-int/2addr v0, p2

    sget-object p2, Ll/ܰᩴۖ;->֫:[B

    move p2, v0

    :goto_0
    add-int v1, v0, p3

    if-ge p2, v1, :cond_0

    mul-int/lit8 p1, p1, 0x1f

    .line 281
    iget-object v1, p0, Ll/۫ۜۖ;->ۙ:[B

    aget-byte v1, v1, p2

    add-int/2addr p1, v1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public final ֫(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 4

    .line 1460
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Ll/۫ۜۖ;->᩻()I

    move-result v1

    invoke-virtual {p0}, Ll/۫ۜۖ;->size()I

    move-result v2

    iget-object v3, p0, Ll/۫ۜۖ;->ۙ:[B

    invoke-direct {v0, v3, v1, v2, p1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public ֫(I[BII)V
    .locals 1

    .line 1424
    iget-object v0, p0, Ll/۫ۜۖ;->ۙ:[B

    invoke-static {v0, p1, p2, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ֫(Ll/ܳ᩷ۖ;)V
    .locals 3

    .line 1455
    invoke-virtual {p0}, Ll/۫ۜۖ;->᩻()I

    move-result v0

    invoke-virtual {p0}, Ll/۫ۜۖ;->size()I

    move-result v1

    iget-object v2, p0, Ll/۫ۜۖ;->ۙ:[B

    invoke-virtual {p1, v0, v1, v2}, Ll/֨ۜۖ;->֫(II[B)V

    return-void
.end method

.method public ۧ(I)B
    .locals 1

    .line 1393
    iget-object v0, p0, Ll/۫ۜۖ;->ۙ:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final ۧ(II)Ll/ۛۜۖ;
    .locals 2

    .line 1406
    invoke-virtual {p0}, Ll/۫ۜۖ;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Ll/ۛۜۖ;->ۧ(III)I

    move-result p2

    if-nez p2, :cond_0

    .line 1409
    sget-object p1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    return-object p1

    .line 1412
    :cond_0
    new-instance v0, Ll/᩹ۜۖ;

    invoke-virtual {p0}, Ll/۫ۜۖ;->᩻()I

    move-result v1

    add-int/2addr v1, p1

    iget-object p1, p0, Ll/۫ۜۖ;->ۙ:[B

    invoke-direct {v0, p1, v1, p2}, Ll/᩹ۜۖ;-><init>([BII)V

    return-object v0
.end method

.method public final ۧ()Z
    .locals 3

    .line 1468
    invoke-virtual {p0}, Ll/۫ۜۖ;->᩻()I

    move-result v0

    .line 1469
    invoke-virtual {p0}, Ll/۫ۜۖ;->size()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v2, p0, Ll/۫ۜۖ;->ۙ:[B

    invoke-static {v0, v1, v2}, Ll/۫֨ۖ;->ܽ(II[B)Z

    move-result v0

    return v0
.end method

.method public final ܽ()Ll/۟ۜۖ;
    .locals 4

    .line 1570
    invoke-virtual {p0}, Ll/۫ۜۖ;->᩻()I

    move-result v0

    invoke-virtual {p0}, Ll/۫ۜۖ;->size()I

    move-result v1

    const/4 v2, 0x1

    .line 1569
    iget-object v3, p0, Ll/۫ۜۖ;->ۙ:[B

    invoke-static {v2, v0, v1, v3}, Ll/۟ۜۖ;->֫(ZII[B)Ll/۟ۜۖ;

    move-result-object v0

    return-object v0
.end method

.method public ᩻()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
