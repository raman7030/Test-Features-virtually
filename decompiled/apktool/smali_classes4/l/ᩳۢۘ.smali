.class public abstract Ll/ᩳۢۘ;
.super Ljava/lang/Object;
.source "M7WW"


# static fields
.field public static final ܺ:[B


# instance fields
.field public ֫:Ll/᩻ۜۘ;

.field public ۜ:Ljava/lang/String;

.field public ۡ:I

.field public ۢ:Ll/ۖ᩷ۘ;

.field public ۧ:[B

.field public ܳ:[B

.field public ܽ:Z

.field public ܿ:Ll/᩹᩷ۘ;

.field public ᩳ:Ll/ۖ᩷ۘ;

.field public ᩷:[B

.field public ᩻:Ll/֫ۢۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 63
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "openssh-key-v1\u0000"

    .line 393
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 63
    sput-object v1, Ll/ᩳۢۘ;->ܺ:[B

    const-string v1, "\n"

    .line 64
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    const-string v1, "-----BEGIN OPENSSH PRIVATE KEY-----"

    .line 66
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    const-string v1, "-----END OPENSSH PRIVATE KEY-----"

    .line 67
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    const-string v1, "none"

    .line 68
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    const-string v1, "Proc-Type: 4,ENCRYPTED"

    .line 393
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v1, "DEK-Info: DES-EDE3-CBC,"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v0, " "

    .line 424
    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    return-void
.end method

.method public constructor <init>(Ll/᩹᩷ۘ;)V
    .locals 2

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 61
    iput v0, p0, Ll/ᩳۢۘ;->ۡ:I

    const-string v1, "no comment"

    .line 123
    iput-object v1, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 913
    iput-boolean v0, p0, Ll/ᩳۢۘ;->ܽ:Z

    const/4 v0, 0x0

    .line 914
    iput-object v0, p0, Ll/ᩳۢۘ;->ۧ:[B

    .line 915
    iput-object v0, p0, Ll/ᩳۢۘ;->ܳ:[B

    .line 916
    iput-object v0, p0, Ll/ᩳۢۘ;->᩷:[B

    .line 133
    iput-object p1, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    return-void
.end method

.method public static ֫(I)I
    .locals 2

    const/16 v0, 0x7f

    const/4 v1, 0x1

    if-gt p0, v0, :cond_0

    return v1

    :cond_0
    :goto_0
    if-lez p0, :cond_1

    ushr-int/lit8 p0, p0, 0x8

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static ֫(I[B[B)I
    .locals 2

    add-int/lit8 v0, p0, 0x1

    const/4 v1, 0x2

    .line 719
    aput-byte v1, p1, p0

    .line 720
    array-length p0, p2

    invoke-static {v0, p0, p1}, Ll/ᩳۢۘ;->ۧ(II[B)I

    move-result p0

    const/4 v0, 0x0

    .line 721
    array-length v1, p2

    invoke-static {p2, v0, p1, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 722
    array-length p1, p2

    add-int/2addr p0, p1

    return p0
.end method

.method public static ֫(Ll/᩹᩷ۘ;Ljava/lang/String;[B)Ll/ᩳۢۘ;
    .locals 12

    .line 1736
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0, p2}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 1737
    array-length p2, p2

    invoke-virtual {v0, p2}, Ll/ܺ᩻ۘ;->ܽ(I)V

    .line 1739
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p2

    sget-object v1, Ll/᩵ۡۘ;->ܽ:[B

    .line 409
    array-length v1, p2

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v3, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v3, p2, v4, v1, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    if-eqz p1, :cond_2

    const-string p2, ""

    .line 1740
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 1742
    :cond_0
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    .line 1743
    :cond_1
    new-instance p0, Ll/۫᩷ۘ;

    const-string p2, "] does not match expected type ["

    const-string v0, "]"

    const-string v1, "pubkeyblob type ["

    .line 0
    invoke-static {v1, v3, p2, p1, v0}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1743
    throw p0

    :cond_2
    :goto_0
    move-object p1, v3

    :goto_1
    const-string p2, "ssh-rsa"

    .line 1747
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    .line 1748
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    new-array p2, p1, [B

    .line 165
    invoke-virtual {v0, v4, p1, p2}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 1750
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    new-array v2, p1, [B

    .line 165
    invoke-virtual {v0, v4, p1, v2}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 1753
    new-instance p1, Ll/ۘۢۘ;

    invoke-direct {p1, p0, v2, p2, v1}, Ll/ۘۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B[B)V

    return-object p1

    :cond_3
    const-string p2, "ssh-dss"

    .line 1754
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 1755
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    new-array v7, p1, [B

    .line 165
    invoke-virtual {v0, v4, p1, v7}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 1757
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    new-array v8, p1, [B

    .line 165
    invoke-virtual {v0, v4, p1, v8}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 1759
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    new-array v9, p1, [B

    .line 165
    invoke-virtual {v0, v4, p1, v9}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 1761
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    new-array v10, p1, [B

    .line 165
    invoke-virtual {v0, v4, p1, v10}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 1764
    new-instance p1, Ll/ܿۢۘ;

    const/4 v11, 0x0

    move-object v5, p1

    move-object v6, p0

    invoke-direct/range {v5 .. v11}, Ll/ܿۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B[B[B[B)V

    return-object p1

    :cond_4
    const-string p2, "ecdsa-sha2-nistp256"

    .line 1765
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    const-string p2, "ecdsa-sha2-nistp384"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    const-string p2, "ecdsa-sha2-nistp521"

    .line 1766
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_3

    :cond_5
    const-string p2, "ssh-ed25519"

    .line 1778
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v2, "ssh-ed448"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_2

    .line 1788
    :cond_6
    new-instance p0, Ll/۫᩷ۘ;

    const-string p2, "key type "

    const-string v0, " is not supported"

    .line 0
    invoke-static {p2, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1788
    throw p0

    .line 1779
    :cond_7
    :goto_2
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v2

    new-array v3, v2, [B

    .line 165
    invoke-virtual {v0, v4, v2, v3}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 1782
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1783
    new-instance p1, Ll/᩷ۢۘ;

    .line 40
    invoke-direct {p1, p0, v3, v1}, Ll/ۡۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B)V

    return-object p1

    .line 1785
    :cond_8
    new-instance p1, Ll/ۢۢۘ;

    .line 40
    invoke-direct {p1, p0, v3, v1}, Ll/ۡۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B)V

    return-object p1

    .line 1767
    :cond_9
    :goto_3
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v6

    .line 1769
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    .line 1770
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->֫()I

    add-int/lit8 p1, p1, -0x1

    .line 1772
    div-int/lit8 p1, p1, 0x2

    new-array v7, p1, [B

    .line 1773
    new-array v8, p1, [B

    .line 165
    invoke-virtual {v0, v4, p1, v7}, Ll/ܺ᩻ۘ;->֫(II[B)V

    invoke-virtual {v0, v4, p1, v8}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 1777
    new-instance p1, Ll/ۜۢۘ;

    const/4 v9, 0x0

    move-object v4, p1

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Ll/ۜۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B[B[B)V

    return-object p1
.end method

.method public static ֫(Ll/᩹᩷ۘ;[B)Ll/ᩳۢۘ;
    .locals 12

    const-string v0, " is not available"

    const-string v1, "cipher "

    const-string v2, "kdf "

    const-string v3, "invalid privatekey"

    if-eqz p1, :cond_8

    .line 1467
    new-instance v4, Ll/ܺ᩻ۘ;

    invoke-direct {v4, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 1468
    sget-object p1, Ll/ᩳۢۘ;->ܺ:[B

    array-length v5, p1

    new-array v6, v5, [B

    const/4 v7, 0x0

    .line 165
    invoke-virtual {v4, v7, v5, v6}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 1470
    invoke-static {p1, v6}, Ll/᩵ۡۘ;->ۧ([B[B)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 1474
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 409
    array-length v5, p1

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v8, Ljava/lang/String;

    invoke-direct {v8, p1, v7, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 1475
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 409
    array-length v5, p1

    .line 405
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, p1, v7, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 1476
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 1478
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_6

    .line 1483
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v5

    const/4 v6, 0x0

    .line 1484
    invoke-static {p0, v6, v5}, Ll/ᩳۢۘ;->֫(Ll/᩹᩷ۘ;Ljava/lang/String;[B)Ll/ᩳۢۘ;

    move-result-object p0

    const-string v10, "none"

    .line 1485
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    xor-int/lit8 v11, v10, 0x1

    iput-boolean v11, p0, Ll/ᩳۢۘ;->ܽ:Z

    .line 1486
    iput-object v5, p0, Ll/ᩳۢۘ;->᩷:[B

    const/4 v5, 0x4

    .line 1487
    iput v5, p0, Ll/ᩳۢۘ;->ۡ:I

    const-string v5, ""

    .line 1488
    iput-object v5, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    if-eqz v10, :cond_1

    .line 1492
    :try_start_0
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۢۘ;->ۧ:[B

    .line 1493
    invoke-virtual {p0, p1}, Ll/ᩳۢۘ;->ܽ([B)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1496
    iget-object p1, p0, Ll/ᩳۢۘ;->ۧ:[B

    invoke-static {p1}, Ll/᩵ۡۘ;->ۧ([B)V

    return-object p0

    .line 1494
    :cond_0
    new-instance p1, Ll/۫᩷ۘ;

    .line 39
    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1494
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto/16 :goto_3

    .line 1501
    :cond_1
    :try_start_1
    invoke-static {v8}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-class v5, Ll/᩻ۜۘ;

    invoke-virtual {v3, v5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v3

    .line 1502
    invoke-virtual {v3, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۜۘ;

    iput-object v3, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    .line 1503
    invoke-interface {v3}, Ll/᩻ۜۘ;->ᩳ()I

    move-result v3

    .line 1504
    iget-object v5, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    invoke-interface {v5}, Ll/᩻ۜۘ;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v3, 0x0

    goto :goto_0

    .line 1506
    :cond_2
    iget-object v5, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    invoke-interface {v5}, Ll/᩻ۜۘ;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v3, 0xc

    .line 1509
    :cond_3
    :goto_0
    new-array v3, v3, [B

    iput-object v3, p0, Ll/ᩳۢۘ;->ܳ:[B

    .line 1512
    invoke-virtual {v4}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v3

    .line 1513
    array-length v5, v3

    iget-object v10, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    invoke-interface {v10}, Ll/᩻ۜۘ;->ۧ()I

    move-result v10

    add-int/2addr v5, v10

    new-array v10, v5, [B

    .line 1514
    array-length v11, v3

    invoke-static {v3, v7, v10, v7, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1515
    array-length v7, v3

    array-length v3, v3

    sub-int/2addr v5, v3

    invoke-virtual {v4, v7, v5, v10}, Ll/ܺ᩻ۘ;->֫(II[B)V

    .line 1516
    iput-object v10, p0, Ll/ᩳۢۘ;->ۧ:[B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_3

    .line 1524
    :try_start_2
    invoke-static {v9}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v3, Ll/֫ۢۘ;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 1525
    invoke-virtual {v1, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۢۘ;

    iput-object v1, p0, Ll/ᩳۢۘ;->᩻:Ll/֫ۢۘ;

    .line 1526
    invoke-interface {v1, p1}, Ll/֫ۢۘ;->֫([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/LinkageError; {:try_start_2 .. :try_end_2} :catch_1

    return-object p0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    .line 1528
    :goto_1
    :try_start_3
    instance-of v1, p1, Ll/۫᩷ۘ;

    if-eqz v1, :cond_4

    .line 1529
    check-cast p1, Ll/۫᩷ۘ;

    throw p1

    .line 1530
    :cond_4
    new-instance v1, Ll/۫᩷ۘ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1530
    throw v1

    :catch_3
    move-exception p1

    goto :goto_2

    :catch_4
    move-exception p1

    .line 1518
    :goto_2
    instance-of v2, p1, Ll/۫᩷ۘ;

    if-eqz v2, :cond_5

    .line 1519
    check-cast p1, Ll/۫᩷ۘ;

    throw p1

    .line 1520
    :cond_5
    new-instance v2, Ll/۫᩷ۘ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-direct {v2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1520
    throw v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 1536
    :goto_3
    iget-object p0, p0, Ll/ᩳۢۘ;->ۧ:[B

    invoke-static {p0}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 1537
    throw p1

    .line 1480
    :cond_6
    new-instance p0, Ll/۫᩷ۘ;

    const-string p1, "We don\'t support having more than 1 key in the file (yet)."

    .line 39
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1480
    throw p0

    .line 1471
    :cond_7
    new-instance p0, Ll/۫᩷ۘ;

    const-string p1, "Invalid openssh v1 format."

    .line 39
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1471
    throw p0

    .line 1464
    :cond_8
    new-instance p0, Ll/۫᩷ۘ;

    .line 39
    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1464
    throw p0
.end method

.method public static ֫(Ll/᩹᩷ۘ;[B[B)Ll/ᩳۢۘ;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "aes128-cbc"

    const-string v4, "aes192-cbc"

    const-string v5, "aes256-cbc"

    const/16 v6, 0x8

    new-array v6, v6, [B

    const/4 v7, 0x7

    const/4 v8, 0x2

    const/4 v9, 0x3

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-nez v2, :cond_7

    if-eqz v1, :cond_7

    .line 1017
    array-length v12, v1

    const/16 v13, 0xb

    if-le v12, v13, :cond_7

    aget-byte v11, v1, v11

    if-nez v11, :cond_7

    aget-byte v10, v1, v10

    if-nez v10, :cond_7

    aget-byte v8, v1, v8

    if-nez v8, :cond_7

    aget-byte v8, v1, v9

    if-eq v8, v7, :cond_0

    const/16 v7, 0x9

    if-eq v8, v7, :cond_0

    if-eq v8, v13, :cond_0

    const/16 v7, 0x13

    if-ne v8, v7, :cond_7

    .line 1022
    :cond_0
    new-instance v2, Ll/ܺ᩻ۘ;

    invoke-direct {v2, v1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 1023
    array-length v1, v1

    invoke-virtual {v2, v1}, Ll/ܺ᩻ۘ;->ܽ(I)V

    .line 1024
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v1

    invoke-static {v1}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object v1

    .line 1025
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܺ()V

    const-string v3, "ssh-rsa"

    .line 1028
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1029
    invoke-static {v0, v2}, Ll/ۘۢۘ;->֫(Ll/᩹᩷ۘ;Ll/ܺ᩻ۘ;)Ll/ᩳۢۘ;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v3, "ssh-dss"

    .line 1030
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1031
    invoke-static {v0, v2}, Ll/ܿۢۘ;->֫(Ll/᩹᩷ۘ;Ll/ܺ᩻ۘ;)Ll/ᩳۢۘ;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v3, "ecdsa-sha2-nistp256"

    .line 1032
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "ecdsa-sha2-nistp384"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "ecdsa-sha2-nistp521"

    .line 1033
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    const-string v3, "ssh-ed25519"

    .line 1035
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1036
    invoke-static {v0, v2}, Ll/᩷ۢۘ;->֫(Ll/᩹᩷ۘ;Ll/ܺ᩻ۘ;)Ll/ᩳۢۘ;

    move-result-object v0

    return-object v0

    :cond_4
    const-string v3, "ssh-ed448"

    .line 1037
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 1038
    invoke-static {v0, v2}, Ll/ۢۢۘ;->֫(Ll/᩹᩷ۘ;Ll/ܺ᩻ۘ;)Ll/ᩳۢۘ;

    move-result-object v0

    return-object v0

    .line 1040
    :cond_5
    new-instance v0, Ll/۫᩷ۘ;

    const-string v2, "privatekey: invalid key "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1034
    :cond_6
    :goto_0
    invoke-static {v0, v2}, Ll/ۜۢۘ;->֫(Ll/᩹᩷ۘ;Ll/ܺ᩻ۘ;)Ll/ᩳۢۘ;

    move-result-object v0

    return-object v0

    :cond_7
    if-eqz v1, :cond_8

    .line 1049
    :try_start_0
    invoke-static/range {p0 .. p1}, Ll/ᩳۢۘ;->ۧ(Ll/᩹᩷ۘ;[B)Ll/ᩳۢۘ;

    move-result-object v7

    if-eqz v7, :cond_8

    return-object v7

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :catch_1
    move-exception v0

    goto/16 :goto_9

    :cond_8
    if-eqz v1, :cond_9

    .line 1054
    array-length v7, v1

    goto :goto_1

    :cond_9
    const/4 v7, 0x0

    :goto_1
    const/4 v8, 0x0

    :goto_2
    const/16 v10, 0x2d

    if-ge v8, v7, :cond_b

    const/4 v11, 0x2

    .line 1059
    aget-byte v12, v1, v8

    if-ne v12, v10, :cond_a

    add-int/lit8 v12, v8, 0x4

    if-ge v12, v7, :cond_a

    add-int/lit8 v13, v8, 0x1

    const/4 v14, 0x1

    aget-byte v13, v1, v13

    if-ne v13, v10, :cond_a

    add-int/lit8 v13, v8, 0x2

    aget-byte v13, v1, v13

    if-ne v13, v10, :cond_a

    add-int/lit8 v13, v8, 0x3

    aget-byte v13, v1, v13

    if-ne v13, v10, :cond_a

    aget-byte v12, v1, v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v12, v10, :cond_a

    goto :goto_3

    :cond_a
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_b
    const/4 v11, 0x2

    const/4 v14, 0x1

    :goto_3
    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v15, 0x0

    :goto_4
    const-string v9, "invalid privatekey"

    if-ge v8, v7, :cond_2a

    move/from16 v16, v13

    .line 1067
    :try_start_1
    aget-byte v13, v1, v8

    move-object/from16 v17, v15

    const/16 v15, 0x42

    const/16 v2, 0x45

    if-ne v13, v15, :cond_14

    add-int/lit8 v15, v8, 0x3

    if-ge v15, v7, :cond_14

    add-int/lit8 v18, v8, 0x1

    move/from16 v19, v11

    aget-byte v11, v1, v18

    if-ne v11, v2, :cond_15

    add-int/lit8 v2, v8, 0x2

    aget-byte v2, v1, v2

    const/16 v11, 0x47

    if-ne v2, v11, :cond_15

    aget-byte v2, v1, v15

    const/16 v11, 0x49

    if-ne v2, v11, :cond_15

    add-int/lit8 v2, v8, 0x6

    add-int/lit8 v11, v8, 0x8

    if-ge v11, v7, :cond_13

    .line 1072
    aget-byte v12, v1, v2

    const/16 v13, 0x44

    if-ne v12, v13, :cond_c

    add-int/lit8 v13, v8, 0x7

    aget-byte v13, v1, v13

    const/16 v15, 0x53

    if-ne v13, v15, :cond_c

    aget-byte v13, v1, v11

    const/16 v15, 0x41

    if-ne v13, v15, :cond_c

    const/4 v8, 0x1

    goto :goto_5

    :cond_c
    const/16 v13, 0x52

    if-ne v12, v13, :cond_d

    add-int/lit8 v13, v8, 0x7

    .line 1074
    aget-byte v13, v1, v13

    const/16 v15, 0x53

    if-ne v13, v15, :cond_d

    aget-byte v13, v1, v11

    const/16 v15, 0x41

    if-ne v13, v15, :cond_d

    const/4 v8, 0x2

    goto :goto_5

    :cond_d
    const/16 v13, 0x45

    if-ne v12, v13, :cond_e

    add-int/lit8 v13, v8, 0x7

    .line 1076
    aget-byte v13, v1, v13

    const/16 v15, 0x43

    if-ne v13, v15, :cond_e

    const/4 v8, 0x3

    :goto_5
    move/from16 v13, v16

    goto/16 :goto_7

    :cond_e
    const/16 v10, 0x53

    if-ne v12, v10, :cond_f

    add-int/lit8 v13, v8, 0x7

    .line 1078
    aget-byte v13, v1, v13

    if-ne v13, v10, :cond_f

    aget-byte v10, v1, v11

    const/16 v13, 0x48

    if-ne v10, v13, :cond_f

    const/4 v8, 0x1

    const/4 v10, 0x1

    goto/16 :goto_6

    :cond_f
    add-int/lit8 v10, v8, 0xc

    const/16 v13, 0x50

    if-ge v10, v7, :cond_10

    if-ne v12, v13, :cond_10

    add-int/lit8 v13, v8, 0x7

    .line 1081
    aget-byte v13, v1, v13

    const/16 v15, 0x52

    if-ne v13, v15, :cond_10

    aget-byte v13, v1, v11

    const/16 v15, 0x49

    if-ne v13, v15, :cond_10

    add-int/lit8 v13, v8, 0x9

    aget-byte v15, v1, v13

    move/from16 v18, v13

    const/16 v13, 0x56

    if-ne v15, v13, :cond_10

    add-int/lit8 v13, v8, 0xa

    aget-byte v13, v1, v13

    const/16 v15, 0x41

    if-ne v13, v15, :cond_10

    add-int/lit8 v13, v8, 0xb

    aget-byte v13, v1, v13

    const/16 v15, 0x54

    if-ne v13, v15, :cond_10

    aget-byte v13, v1, v10

    const/16 v15, 0x45

    if-ne v13, v15, :cond_10

    const/4 v10, 0x3

    const/4 v8, 0x4

    const/4 v13, 0x0

    move/from16 v2, v18

    goto :goto_7

    :cond_10
    add-int/lit8 v13, v8, 0xe

    if-ge v13, v7, :cond_11

    const/16 v15, 0x45

    if-ne v12, v15, :cond_11

    add-int/lit8 v12, v8, 0x7

    .line 1087
    aget-byte v12, v1, v12

    const/16 v15, 0x4e

    if-ne v12, v15, :cond_11

    aget-byte v11, v1, v11

    const/16 v12, 0x43

    if-ne v11, v12, :cond_11

    add-int/lit8 v11, v8, 0x9

    aget-byte v11, v1, v11

    const/16 v12, 0x52

    if-ne v11, v12, :cond_11

    add-int/lit8 v11, v8, 0xa

    aget-byte v11, v1, v11

    const/16 v12, 0x59

    if-ne v11, v12, :cond_11

    add-int/lit8 v11, v8, 0xb

    aget-byte v12, v1, v11

    const/16 v15, 0x50

    if-ne v12, v15, :cond_11

    aget-byte v10, v1, v10

    const/16 v12, 0x54

    if-ne v10, v12, :cond_11

    add-int/lit8 v8, v8, 0xd

    aget-byte v8, v1, v8

    const/16 v10, 0x45

    if-ne v8, v10, :cond_11

    aget-byte v8, v1, v13

    const/16 v10, 0x44

    if-ne v8, v10, :cond_11

    const/4 v2, 0x3

    move v2, v11

    const/4 v10, 0x3

    goto :goto_6

    .line 1093
    :cond_11
    invoke-static {v2, v7, v1}, Ll/ᩳۢۘ;->֫(II[B)Z

    move-result v8

    if-eqz v8, :cond_12

    const/4 v8, 0x4

    const/4 v10, 0x4

    :goto_6
    const/4 v8, 0x4

    goto/16 :goto_5

    :goto_7
    add-int/lit8 v2, v2, 0x3

    move v12, v8

    move/from16 v18, v14

    move-object/from16 v15, v17

    move v8, v2

    goto/16 :goto_12

    .line 1097
    :cond_12
    new-instance v0, Ll/۫᩷ۘ;

    invoke-direct {v0, v9}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1071
    :cond_13
    new-instance v0, Ll/۫᩷ۘ;

    invoke-direct {v0, v9}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_0

    :cond_14
    move/from16 v19, v11

    .line 1102
    :cond_15
    const-class v2, Ll/᩻ۜۘ;

    const/16 v11, 0x41

    if-ne v13, v11, :cond_17

    add-int/lit8 v11, v8, 0x7

    if-ge v11, v7, :cond_17

    add-int/lit8 v15, v8, 0x1

    :try_start_2
    aget-byte v15, v1, v15

    move/from16 v18, v14

    const/16 v14, 0x45

    if-ne v15, v14, :cond_18

    add-int/lit8 v14, v8, 0x2

    aget-byte v14, v1, v14

    const/16 v15, 0x53

    if-ne v14, v15, :cond_18

    add-int/lit8 v14, v8, 0x3

    aget-byte v14, v1, v14

    const/16 v15, 0x2d

    if-ne v14, v15, :cond_18

    add-int/lit8 v14, v8, 0x4

    aget-byte v14, v1, v14

    const/16 v15, 0x32

    if-ne v14, v15, :cond_18

    add-int/lit8 v14, v8, 0x5

    aget-byte v14, v1, v14

    const/16 v15, 0x35

    if-ne v14, v15, :cond_18

    add-int/lit8 v14, v8, 0x6

    aget-byte v14, v1, v14

    const/16 v15, 0x36

    if-ne v14, v15, :cond_18

    aget-byte v11, v1, v11

    const/16 v14, 0x2d

    if-ne v11, v14, :cond_18

    add-int/lit8 v8, v8, 0x8

    .line 1106
    invoke-static {v5}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/۟ۢۘ;->ᩳ(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_16

    .line 1108
    invoke-static {v5}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    const/4 v6, 0x0

    .line 1109
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۜۘ;

    .line 1111
    invoke-interface {v2}, Ll/᩻ۜۘ;->ᩳ()I

    move-result v6

    new-array v6, v6, [B

    goto :goto_8

    .line 1113
    :cond_16
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "privatekey: aes256-cbc is not available"

    invoke-direct {v0, v1}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    move/from16 v18, v14

    :cond_18
    const/16 v11, 0x41

    if-ne v13, v11, :cond_1a

    add-int/lit8 v11, v8, 0x7

    if-ge v11, v7, :cond_1a

    add-int/lit8 v14, v8, 0x1

    .line 1117
    aget-byte v14, v1, v14

    const/16 v15, 0x45

    if-ne v14, v15, :cond_1a

    add-int/lit8 v14, v8, 0x2

    aget-byte v14, v1, v14

    const/16 v15, 0x53

    if-ne v14, v15, :cond_1a

    add-int/lit8 v14, v8, 0x3

    aget-byte v14, v1, v14

    const/16 v15, 0x2d

    if-ne v14, v15, :cond_1a

    add-int/lit8 v14, v8, 0x4

    aget-byte v14, v1, v14

    const/16 v15, 0x31

    if-ne v14, v15, :cond_1a

    add-int/lit8 v14, v8, 0x5

    aget-byte v14, v1, v14

    const/16 v15, 0x39

    if-ne v14, v15, :cond_1a

    add-int/lit8 v14, v8, 0x6

    aget-byte v14, v1, v14

    const/16 v15, 0x32

    if-ne v14, v15, :cond_1a

    aget-byte v11, v1, v11

    const/16 v14, 0x2d

    if-ne v11, v14, :cond_1a

    add-int/lit8 v8, v8, 0x8

    .line 1121
    invoke-static {v4}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/۟ۢۘ;->ᩳ(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_19

    .line 1123
    invoke-static {v4}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    const/4 v6, 0x0

    .line 1124
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۜۘ;

    .line 1126
    invoke-interface {v2}, Ll/᩻ۜۘ;->ᩳ()I

    move-result v6

    new-array v6, v6, [B

    :goto_8
    move-object v15, v2

    move/from16 v13, v16

    goto/16 :goto_12

    .line 1128
    :cond_19
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "privatekey: aes192-cbc is not available"

    invoke-direct {v0, v1}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_9
    const/4 v1, 0x0

    goto/16 :goto_38

    :cond_1a
    const/16 v11, 0x41

    if-ne v13, v11, :cond_1c

    add-int/lit8 v11, v8, 0x7

    if-ge v11, v7, :cond_1c

    add-int/lit8 v14, v8, 0x1

    .line 1132
    aget-byte v14, v1, v14

    const/16 v15, 0x45

    if-ne v14, v15, :cond_1c

    add-int/lit8 v14, v8, 0x2

    aget-byte v14, v1, v14

    const/16 v15, 0x53

    if-ne v14, v15, :cond_1c

    add-int/lit8 v14, v8, 0x3

    aget-byte v14, v1, v14

    const/16 v15, 0x2d

    if-ne v14, v15, :cond_1c

    add-int/lit8 v14, v8, 0x4

    aget-byte v14, v1, v14

    const/16 v15, 0x31

    if-ne v14, v15, :cond_1c

    add-int/lit8 v14, v8, 0x5

    aget-byte v14, v1, v14

    const/16 v15, 0x32

    if-ne v14, v15, :cond_1c

    add-int/lit8 v14, v8, 0x6

    aget-byte v14, v1, v14

    const/16 v15, 0x38

    if-ne v14, v15, :cond_1c

    aget-byte v11, v1, v11

    const/16 v14, 0x2d

    if-ne v11, v14, :cond_1c

    add-int/lit8 v8, v8, 0x8

    .line 1136
    invoke-static {v3}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/۟ۢۘ;->ᩳ(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1b

    .line 1138
    invoke-static {v3}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_2 .. :try_end_2} :catch_0

    const/4 v6, 0x0

    .line 1139
    :try_start_3
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۜۘ;

    .line 1141
    invoke-interface {v2}, Ll/᩻ۜۘ;->ᩳ()I

    move-result v9

    new-array v6, v9, [B

    goto :goto_8

    :cond_1b
    const/4 v6, 0x0

    .line 1143
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "privatekey: aes128-cbc is not available"

    invoke-direct {v0, v1}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/LinkageError; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    move-exception v0

    goto/16 :goto_1a

    :catch_3
    move-exception v0

    goto/16 :goto_1a

    :cond_1c
    const/4 v2, 0x0

    const/16 v11, 0x43

    if-ne v13, v11, :cond_1f

    add-int/lit8 v11, v8, 0x3

    if-ge v11, v7, :cond_1f

    add-int/lit8 v14, v8, 0x1

    .line 1147
    :try_start_4
    aget-byte v14, v1, v14

    const/16 v15, 0x42

    if-ne v14, v15, :cond_1f

    add-int/lit8 v14, v8, 0x2

    aget-byte v14, v1, v14

    const/16 v15, 0x43

    if-ne v14, v15, :cond_1f

    aget-byte v11, v1, v11

    const/16 v14, 0x2c

    if-ne v11, v14, :cond_1f

    add-int/lit8 v8, v8, 0x4

    const/4 v9, 0x0

    .line 1150
    :goto_a
    array-length v11, v6

    if-ge v9, v11, :cond_29

    add-int/lit8 v11, v8, 0x1

    .line 1151
    aget-byte v13, v1, v8

    const/16 v14, 0x30

    if-gt v14, v13, :cond_1d

    const/16 v15, 0x39

    if-gt v13, v15, :cond_1d

    add-int/lit8 v13, v13, -0x30

    goto :goto_b

    :cond_1d
    add-int/lit8 v13, v13, -0x57

    :goto_b
    int-to-byte v13, v13

    shl-int/lit8 v13, v13, 0x4

    and-int/lit16 v13, v13, 0xf0

    add-int/lit8 v8, v8, 0x2

    aget-byte v11, v1, v11

    const/16 v15, 0x39

    if-gt v14, v11, :cond_1e

    if-gt v11, v15, :cond_1e

    add-int/lit8 v11, v11, -0x30

    goto :goto_c

    :cond_1e
    add-int/lit8 v11, v11, -0x57

    :goto_c
    int-to-byte v11, v11

    and-int/lit8 v11, v11, 0xf

    add-int/2addr v13, v11

    int-to-byte v11, v13

    aput-byte v11, v6, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    :cond_1f
    const/16 v11, 0xd

    if-ne v13, v11, :cond_20

    add-int/lit8 v11, v8, 0x1

    .line 1155
    array-length v14, v1

    if-ge v11, v14, :cond_20

    aget-byte v14, v1, v11

    const/16 v15, 0xa

    if-ne v14, v15, :cond_21

    move v8, v11

    goto :goto_11

    :cond_20
    const/16 v15, 0xa

    :cond_21
    if-ne v13, v15, :cond_28

    add-int/lit8 v11, v8, 0x1

    .line 1159
    array-length v13, v1

    if-ge v11, v13, :cond_28

    .line 1160
    aget-byte v13, v1, v11

    if-ne v13, v15, :cond_22

    add-int/lit8 v8, v8, 0x2

    :goto_d
    move/from16 v13, v16

    goto :goto_13

    :cond_22
    const/16 v14, 0xd

    if-ne v13, v14, :cond_23

    add-int/lit8 v13, v8, 0x2

    .line 1164
    array-length v14, v1

    if-ge v13, v14, :cond_23

    aget-byte v13, v1, v13

    const/16 v14, 0xa

    if-ne v13, v14, :cond_23

    add-int/lit8 v8, v8, 0x3

    goto :goto_d

    :cond_23
    move v13, v11

    .line 1169
    :goto_e
    array-length v14, v1

    if-ge v13, v14, :cond_26

    .line 1170
    aget-byte v14, v1, v13

    const/16 v15, 0xa

    if-ne v14, v15, :cond_24

    goto :goto_f

    :cond_24
    const/16 v15, 0x3a

    if-ne v14, v15, :cond_25

    goto :goto_10

    :cond_25
    add-int/lit8 v13, v13, 0x1

    goto :goto_e

    :cond_26
    :goto_f
    const/4 v3, 0x3

    if-eq v10, v3, :cond_27

    const/4 v13, 0x0

    move v8, v11

    goto :goto_13

    :cond_27
    move v8, v11

    goto :goto_d

    :cond_28
    :goto_10
    add-int/lit8 v8, v8, 0x1

    :cond_29
    :goto_11
    move/from16 v13, v16

    move-object/from16 v15, v17

    :goto_12
    move-object/from16 v2, p2

    move/from16 v14, v18

    move/from16 v11, v19

    goto/16 :goto_4

    :cond_2a
    move/from16 v19, v11

    move/from16 v16, v13

    move/from16 v18, v14

    move-object/from16 v17, v15

    const/4 v2, 0x0

    :goto_13
    if-eqz v1, :cond_35

    if-eqz v12, :cond_34

    move v3, v8

    :goto_14
    if-ge v3, v7, :cond_2c

    .line 1196
    aget-byte v4, v1, v3

    const/16 v5, 0x2d

    if-ne v4, v5, :cond_2b

    goto :goto_15

    :cond_2b
    add-int/lit8 v3, v3, 0x1

    goto :goto_14

    :cond_2c
    :goto_15
    sub-int/2addr v7, v3

    if-eqz v7, :cond_33

    sub-int/2addr v3, v8

    if-eqz v3, :cond_33

    .line 1207
    new-array v4, v3, [B

    const/4 v5, 0x0

    .line 1208
    invoke-static {v1, v8, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v5, 0x0

    :goto_16
    if-ge v5, v3, :cond_31

    .line 1216
    aget-byte v7, v4, v5

    const/16 v8, 0xa

    if-ne v7, v8, :cond_2f

    if-lez v5, :cond_2d

    add-int/lit8 v7, v5, -0x1

    .line 1217
    aget-byte v7, v4, v7

    const/16 v8, 0xd

    if-ne v7, v8, :cond_2d

    const/4 v7, 0x1

    goto :goto_17

    :cond_2d
    const/4 v7, 0x0

    :goto_17
    add-int/lit8 v8, v5, 0x1

    sub-int v11, v5, v7

    sub-int v14, v3, v8

    .line 1219
    invoke-static {v4, v8, v4, v11, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz v7, :cond_2e

    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v5, v5, -0x1

    :cond_2e
    add-int/lit8 v3, v3, -0x1

    goto :goto_16

    :cond_2f
    const/16 v8, 0x2d

    if-ne v7, v8, :cond_30

    goto :goto_18

    :cond_30
    add-int/lit8 v5, v5, 0x1

    goto :goto_16

    :cond_31
    :goto_18
    if-lez v5, :cond_32

    const/4 v3, 0x0

    .line 1234
    invoke-static {v3, v5, v4}, Ll/᩵ۡۘ;->ۧ(II[B)[B

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/LinkageError; {:try_start_4 .. :try_end_4} :catch_4

    .line 1236
    :cond_32
    :try_start_5
    invoke-static {v4}, Ll/᩵ۡۘ;->ۧ([B)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/LinkageError; {:try_start_5 .. :try_end_5} :catch_6

    goto :goto_1b

    .line 1203
    :cond_33
    :try_start_6
    new-instance v0, Ll/۫᩷ۘ;

    invoke-direct {v0, v9}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1191
    :cond_34
    new-instance v0, Ll/۫᩷ۘ;

    invoke-direct {v0, v9}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/LinkageError; {:try_start_6 .. :try_end_6} :catch_4

    :catch_4
    move-exception v0

    goto :goto_19

    :catch_5
    move-exception v0

    :goto_19
    move-object v6, v2

    :goto_1a
    move-object v1, v6

    goto/16 :goto_38

    :cond_35
    :goto_1b
    const/4 v3, 0x4

    if-ne v10, v3, :cond_36

    .line 1240
    :try_start_7
    invoke-static {v0, v2}, Ll/ᩳۢۘ;->֫(Ll/᩹᩷ۘ;[B)Ll/ᩳۢۘ;

    move-result-object v0

    return-object v0

    :catch_6
    move-exception v0

    goto/16 :goto_37

    :catch_7
    move-exception v0

    goto/16 :goto_37

    :cond_36
    if-eqz v2, :cond_39

    .line 1241
    array-length v4, v2

    if-le v4, v3, :cond_39

    const/4 v3, 0x0

    aget-byte v3, v2, v3

    const/16 v4, 0x3f

    if-ne v3, v4, :cond_39

    aget-byte v3, v2, v18

    const/16 v4, 0x6f

    if-ne v3, v4, :cond_39

    aget-byte v3, v2, v19

    const/4 v4, -0x7

    if-ne v3, v4, :cond_39

    const/4 v3, 0x3

    aget-byte v3, v2, v3

    const/16 v4, -0x15

    if-ne v3, v4, :cond_39

    .line 1245
    new-instance v3, Ll/ܺ᩻ۘ;

    invoke-direct {v3, v2}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 1246
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1247
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1248
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 1249
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v4

    invoke-static {v4}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object v4

    const-string v5, "3des-cbc"

    .line 1250
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/LinkageError; {:try_start_7 .. :try_end_7} :catch_6

    const-string v7, " is not supported for this privatekey format"

    const-string v8, "cipher "

    if-nez v5, :cond_38

    :try_start_8
    const-string v5, "none"

    .line 1258
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_37

    .line 1259
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1260
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1264
    array-length v4, v2

    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->᩻()I

    move-result v5

    sub-int/2addr v4, v5

    new-array v4, v4, [B

    .line 1265
    invoke-virtual {v3, v4}, Ll/ܺ᩻ۘ;->֫([B)V

    const/4 v13, 0x0

    move-object v2, v4

    goto :goto_1c

    .line 1268
    :cond_37
    new-instance v0, Ll/۫᩷ۘ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1251
    :cond_38
    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 1252
    array-length v0, v2

    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->᩻()I

    move-result v1

    sub-int/2addr v0, v1

    new-array v1, v0, [B

    .line 1253
    invoke-virtual {v3, v1}, Ll/ܺ᩻ۘ;->֫([B)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/lang/LinkageError; {:try_start_8 .. :try_end_8} :catch_6

    .line 1256
    :try_start_9
    new-instance v0, Ll/۫᩷ۘ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9
    .catch Ljava/lang/LinkageError; {:try_start_9 .. :try_end_9} :catch_8

    :catch_8
    move-exception v0

    goto/16 :goto_38

    :catch_9
    move-exception v0

    goto/16 :goto_38

    :cond_39
    :goto_1c
    const-string v3, ""

    move-object/from16 v4, p2

    if-eqz v4, :cond_61

    .line 1276
    :try_start_a
    array-length v5, v4

    .line 1277
    array-length v7, v4

    const/4 v8, 0x4

    const/4 v11, 0x6

    if-le v7, v8, :cond_48

    const/4 v7, 0x0

    aget-byte v7, v4, v7

    const/16 v8, 0x2d

    if-ne v7, v8, :cond_48

    aget-byte v7, v4, v18

    if-ne v7, v8, :cond_48

    aget-byte v7, v4, v19

    if-ne v7, v8, :cond_48

    const/4 v7, 0x3

    aget-byte v7, v4, v7

    if-ne v7, v8, :cond_48

    const/4 v7, 0x0

    :cond_3a
    add-int/lit8 v7, v7, 0x1

    .line 1284
    array-length v8, v4

    if-le v8, v7, :cond_3b

    aget-byte v8, v4, v7

    const/16 v11, 0xa

    if-ne v8, v11, :cond_3a

    .line 1285
    :cond_3b
    array-length v8, v4

    if-gt v8, v7, :cond_3c

    const/4 v8, 0x0

    goto :goto_1d

    :cond_3c
    const/4 v8, 0x1

    :goto_1d
    if-eqz v8, :cond_41

    .line 1290
    aget-byte v11, v4, v7

    const/16 v14, 0xa

    if-ne v11, v14, :cond_40

    add-int/lit8 v11, v7, 0x1

    move v14, v11

    .line 1292
    :goto_1e
    array-length v15, v4

    if-ge v14, v15, :cond_3f

    .line 1293
    aget-byte v15, v4, v14
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a
    .catch Ljava/lang/LinkageError; {:try_start_a .. :try_end_a} :catch_6

    move-object/from16 v16, v3

    const/16 v3, 0xa

    if-ne v15, v3, :cond_3d

    goto :goto_1f

    :cond_3d
    const/16 v3, 0x3a

    if-ne v15, v3, :cond_3e

    goto :goto_20

    :cond_3e
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v3, v16

    goto :goto_1e

    :cond_3f
    move-object/from16 v16, v3

    :goto_1f
    move v7, v11

    goto :goto_21

    :cond_40
    move-object/from16 v16, v3

    :goto_20
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v3, v16

    goto :goto_1d

    :cond_41
    move-object/from16 v16, v3

    .line 1307
    :goto_21
    :try_start_b
    array-length v3, v4

    if-gt v3, v7, :cond_42

    const/4 v8, 0x0

    :cond_42
    move v3, v7

    :goto_22
    if-eqz v8, :cond_45

    if-ge v3, v5, :cond_45

    .line 1313
    aget-byte v11, v4, v3

    const/16 v14, 0xa

    if-ne v11, v14, :cond_43

    add-int/lit8 v11, v3, 0x1

    sub-int v14, v5, v3

    add-int/lit8 v14, v14, -0x1

    .line 1314
    invoke-static {v4, v11, v4, v3, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v5, v5, -0x1

    goto :goto_22

    :cond_43
    const/16 v14, 0x2d

    if-ne v11, v14, :cond_44

    goto :goto_23

    :cond_44
    add-int/lit8 v3, v3, 0x1

    goto :goto_22

    :cond_45
    :goto_23
    if-eqz v8, :cond_5f

    sub-int/2addr v3, v7

    .line 1324
    invoke-static {v7, v3, v4}, Ll/᩵ۡۘ;->ۧ(II[B)[B

    move-result-object v3
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b
    .catch Ljava/lang/LinkageError; {:try_start_b .. :try_end_b} :catch_6

    if-eqz v1, :cond_46

    const/4 v1, 0x4

    if-ne v12, v1, :cond_60

    :cond_46
    const/16 v1, 0x8

    .line 1326
    :try_start_c
    aget-byte v1, v3, v1
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c
    .catch Ljava/lang/LinkageError; {:try_start_c .. :try_end_c} :catch_6

    const/16 v5, 0x64

    if-ne v1, v5, :cond_47

    const/4 v1, 0x1

    const/4 v12, 0x1

    goto/16 :goto_34

    :cond_47
    const/16 v5, 0x72

    if-ne v1, v5, :cond_60

    const/4 v1, 0x2

    const/4 v12, 0x2

    goto/16 :goto_34

    :cond_48
    move-object/from16 v16, v3

    const/4 v3, 0x0

    .line 1334
    :try_start_d
    aget-byte v3, v4, v3

    const/16 v7, 0x65

    const/16 v8, 0x73

    const/16 v14, 0x20

    if-ne v3, v8, :cond_55

    aget-byte v15, v4, v18

    if-ne v15, v8, :cond_55

    aget-byte v15, v4, v19

    const/16 v8, 0x68

    if-ne v15, v8, :cond_55

    const/4 v8, 0x3

    aget-byte v8, v4, v8

    const/16 v15, 0x2d

    if-ne v8, v15, :cond_55

    if-nez v1, :cond_4c

    .line 1335
    array-length v1, v4

    const/4 v3, 0x7

    if-le v1, v3, :cond_4c

    const/4 v1, 0x4

    .line 1336
    aget-byte v1, v4, v1

    const/16 v3, 0x64

    if-ne v1, v3, :cond_49

    const/4 v12, 0x1

    goto :goto_24

    :cond_49
    const/16 v3, 0x72

    if-ne v1, v3, :cond_4a

    const/4 v12, 0x2

    goto :goto_24

    :cond_4a
    if-ne v1, v7, :cond_4b

    .line 1340
    aget-byte v3, v4, v11

    const/16 v8, 0x32

    if-ne v3, v8, :cond_4b

    const/4 v12, 0x5

    goto :goto_24

    :cond_4b
    if-ne v1, v7, :cond_4c

    .line 1342
    aget-byte v1, v4, v11

    const/16 v3, 0x34

    if-ne v1, v3, :cond_4c

    const/4 v12, 0x6

    :cond_4c
    :goto_24
    const/4 v1, 0x0

    :goto_25
    if-ge v1, v5, :cond_4e

    .line 1348
    aget-byte v3, v4, v1

    if-ne v3, v14, :cond_4d

    goto :goto_26

    :cond_4d
    add-int/lit8 v1, v1, 0x1

    goto :goto_25

    :cond_4e
    :goto_26
    add-int/lit8 v1, v1, 0x1

    if-ge v1, v5, :cond_51

    move v3, v1

    :goto_27
    if-ge v3, v5, :cond_50

    .line 1356
    aget-byte v7, v4, v3

    if-ne v7, v14, :cond_4f

    goto :goto_28

    :cond_4f
    add-int/lit8 v3, v3, 0x1

    goto :goto_27

    :cond_50
    :goto_28
    sub-int v7, v3, v1

    .line 1360
    invoke-static {v1, v7, v4}, Ll/᩵ۡۘ;->ۧ(II[B)[B

    move-result-object v1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_b
    .catch Ljava/lang/LinkageError; {:try_start_d .. :try_end_d} :catch_6

    move/from16 v20, v3

    move-object v3, v1

    move/from16 v1, v20

    goto :goto_29

    :cond_51
    const/4 v3, 0x0

    :goto_29
    add-int/lit8 v7, v1, 0x1

    if-ge v1, v5, :cond_60

    move v1, v7

    :goto_2a
    if-ge v1, v5, :cond_53

    .line 1365
    :try_start_e
    aget-byte v8, v4, v1

    const/16 v11, 0xa

    if-ne v8, v11, :cond_52

    goto :goto_2b

    :cond_52
    add-int/lit8 v1, v1, 0x1

    goto :goto_2a

    :cond_53
    :goto_2b
    if-lez v1, :cond_54

    add-int/lit8 v5, v1, -0x1

    .line 1369
    aget-byte v5, v4, v5

    const/16 v8, 0xd

    if-ne v5, v8, :cond_54

    add-int/lit8 v1, v1, -0x1

    :cond_54
    if-ge v7, v1, :cond_60

    sub-int/2addr v1, v7

    .line 1372
    invoke-static {v7, v1, v4}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v1
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_c
    .catch Ljava/lang/LinkageError; {:try_start_e .. :try_end_e} :catch_6

    :goto_2c
    move-object/from16 v16, v1

    goto/16 :goto_34

    :cond_55
    if-ne v3, v7, :cond_5f

    .line 1375
    :try_start_f
    aget-byte v3, v4, v18

    const/16 v7, 0x63

    if-ne v3, v7, :cond_5f

    aget-byte v3, v4, v19

    const/16 v7, 0x64

    if-ne v3, v7, :cond_5f

    const/4 v3, 0x3

    aget-byte v3, v4, v3

    const/16 v7, 0x73

    if-ne v3, v7, :cond_5f

    if-nez v1, :cond_56

    .line 1376
    array-length v1, v4

    const/4 v3, 0x7

    if-le v1, v3, :cond_56

    const/4 v12, 0x3

    :cond_56
    const/4 v1, 0x0

    :goto_2d
    if-ge v1, v5, :cond_58

    .line 1381
    aget-byte v3, v4, v1

    if-ne v3, v14, :cond_57

    goto :goto_2e

    :cond_57
    add-int/lit8 v1, v1, 0x1

    goto :goto_2d

    :cond_58
    :goto_2e
    add-int/lit8 v1, v1, 0x1

    if-ge v1, v5, :cond_5b

    move v3, v1

    :goto_2f
    if-ge v3, v5, :cond_5a

    .line 1389
    aget-byte v7, v4, v3

    if-ne v7, v14, :cond_59

    goto :goto_30

    :cond_59
    add-int/lit8 v3, v3, 0x1

    goto :goto_2f

    :cond_5a
    :goto_30
    sub-int v7, v3, v1

    .line 1393
    invoke-static {v1, v7, v4}, Ll/᩵ۡۘ;->ۧ(II[B)[B

    move-result-object v1
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_b
    .catch Ljava/lang/LinkageError; {:try_start_f .. :try_end_f} :catch_6

    move/from16 v20, v3

    move-object v3, v1

    move/from16 v1, v20

    goto :goto_31

    :cond_5b
    const/4 v3, 0x0

    :goto_31
    add-int/lit8 v7, v1, 0x1

    if-ge v1, v5, :cond_60

    move v1, v7

    :goto_32
    if-ge v1, v5, :cond_5d

    .line 1398
    :try_start_10
    aget-byte v8, v4, v1

    const/16 v11, 0xa

    if-ne v8, v11, :cond_5c

    goto :goto_33

    :cond_5c
    add-int/lit8 v1, v1, 0x1

    goto :goto_32

    :cond_5d
    :goto_33
    if-lez v1, :cond_5e

    add-int/lit8 v5, v1, -0x1

    .line 1402
    aget-byte v5, v4, v5

    const/16 v8, 0xd

    if-ne v5, v8, :cond_5e

    add-int/lit8 v1, v1, -0x1

    :cond_5e
    if-ge v7, v1, :cond_60

    sub-int/2addr v1, v7

    .line 1405
    invoke-static {v7, v1, v4}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v1
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_c
    .catch Ljava/lang/LinkageError; {:try_start_10 .. :try_end_10} :catch_6

    goto :goto_2c

    :cond_5f
    const/4 v3, 0x0

    goto :goto_34

    :catch_a
    move-object/from16 v16, v3

    :catch_b
    const/4 v3, 0x0

    .line 1411
    :catch_c
    :try_start_11
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object v1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 1411
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_60
    :goto_34
    const/4 v1, 0x1

    goto :goto_35

    :cond_61
    move-object/from16 v16, v3

    const/4 v1, 0x1

    const/4 v3, 0x0

    :goto_35
    move-object/from16 v5, v16

    if-ne v12, v1, :cond_62

    .line 1419
    new-instance v1, Ll/ܿۢۘ;

    invoke-direct {v1, v0}, Ll/ܿۢۘ;-><init>(Ll/᩹᩷ۘ;)V

    goto :goto_36

    :cond_62
    const/4 v1, 0x2

    if-ne v12, v1, :cond_63

    .line 1421
    new-instance v1, Ll/ۘۢۘ;

    invoke-direct {v1, v0}, Ll/ۘۢۘ;-><init>(Ll/᩹᩷ۘ;)V

    goto :goto_36

    :cond_63
    const/4 v1, 0x3

    if-ne v12, v1, :cond_64

    .line 1423
    new-instance v1, Ll/ۜۢۘ;

    invoke-direct {v1, v0, v4}, Ll/ۜۢۘ;-><init>(Ll/᩹᩷ۘ;[B)V

    goto :goto_36

    :cond_64
    const/4 v1, 0x5

    if-ne v12, v1, :cond_65

    .line 1425
    new-instance v1, Ll/᩷ۢۘ;

    invoke-direct {v1, v0, v4}, Ll/᩷ۢۘ;-><init>(Ll/᩹᩷ۘ;[B)V

    goto :goto_36

    :cond_65
    const/4 v1, 0x6

    if-ne v12, v1, :cond_66

    .line 1427
    new-instance v1, Ll/ۢۢۘ;

    invoke-direct {v1, v0, v4}, Ll/ۢۢۘ;-><init>(Ll/᩹᩷ۘ;[B)V

    goto :goto_36

    :cond_66
    const/4 v1, 0x3

    if-ne v10, v1, :cond_67

    .line 1429
    new-instance v1, Ll/ۖۢۘ;

    invoke-direct {v1, v0}, Ll/ۖۢۘ;-><init>(Ll/᩹᩷ۘ;)V

    goto :goto_36

    :cond_67
    const/4 v1, 0x0

    :goto_36
    if-eqz v1, :cond_6b

    .line 1433
    iput-boolean v13, v1, Ll/ᩳۢۘ;->ܽ:Z

    .line 1434
    iput-object v3, v1, Ll/ᩳۢۘ;->᩷:[B

    .line 1435
    iput v10, v1, Ll/ᩳۢۘ;->ۡ:I

    .line 1436
    iput-object v5, v1, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    move-object/from16 v15, v17

    .line 1437
    iput-object v15, v1, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    if-eqz v13, :cond_68

    const/4 v0, 0x1

    .line 1440
    iput-boolean v0, v1, Ll/ᩳۢۘ;->ܽ:Z

    .line 1441
    iput-object v6, v1, Ll/ᩳۢۘ;->ܳ:[B

    .line 1442
    iput-object v2, v1, Ll/ᩳۢۘ;->ۧ:[B

    goto :goto_39

    .line 1444
    :cond_68
    invoke-virtual {v1, v2}, Ll/ᩳۢۘ;->ܽ([B)Z

    move-result v0

    if-eqz v0, :cond_69

    const/4 v0, 0x0

    .line 1445
    iput-boolean v0, v1, Ll/ᩳۢۘ;->ܽ:Z

    goto :goto_39

    .line 1447
    :cond_69
    new-instance v0, Ll/۫᩷ۘ;

    invoke-direct {v0, v9}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_7
    .catch Ljava/lang/LinkageError; {:try_start_11 .. :try_end_11} :catch_6

    :goto_37
    move-object v1, v2

    .line 1454
    :goto_38
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 1455
    instance-of v1, v0, Ll/۫᩷ۘ;

    if-eqz v1, :cond_6a

    .line 1456
    check-cast v0, Ll/۫᩷ۘ;

    throw v0

    .line 1457
    :cond_6a
    new-instance v1, Ll/۫᩷ۘ;

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/۫᩷ۘ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_6b
    :goto_39
    return-object v1
.end method

.method public static ֫(II[B)Z
    .locals 1

    add-int/lit8 v0, p0, 0x18

    if-ge v0, p1, :cond_0

    .line 1544
    invoke-static {p2, p0, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    invoke-static {p0}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object p0

    const-string p1, "OPENSSH PRIVATE KEY-----"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/ܺ᩻ۘ;Ljava/util/HashMap;)Z
    .locals 10

    .line 1828
    iget-object v0, p0, Ll/ܺ᩻ۘ;->֫:[B

    .line 1829
    iget v1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    move v2, v1

    .line 1832
    :goto_0
    array-length v3, v0

    const/16 v4, 0xd

    const/16 v5, 0xa

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-ge v2, v3, :cond_4

    .line 1833
    aget-byte v3, v0, v2

    if-eq v3, v4, :cond_3

    if-ne v3, v5, :cond_0

    goto :goto_1

    :cond_0
    const/16 v8, 0x3a

    if-ne v3, v8, :cond_2

    sub-int v3, v2, v1

    .line 1840
    invoke-static {v1, v3, v0}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v3, v2, 0x1

    .line 1842
    array-length v8, v0

    if-ge v3, v8, :cond_1

    aget-byte v8, v0, v3

    const/16 v9, 0x20

    if-ne v8, v9, :cond_1

    add-int/lit8 v2, v2, 0x2

    goto :goto_2

    :cond_1
    move v2, v3

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    add-int/2addr v2, v6

    .line 1834
    array-length v3, v0

    if-ge v2, v3, :cond_4

    aget-byte v2, v0, v2

    :cond_4
    move v2, v1

    move-object v1, v7

    :goto_2
    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    move v3, v2

    .line 1853
    :goto_3
    array-length v8, v0

    if-ge v3, v8, :cond_8

    .line 1854
    aget-byte v8, v0, v3

    if-eq v8, v4, :cond_7

    if-ne v8, v5, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    sub-int v4, v3, v2

    .line 1855
    invoke-static {v2, v4, v0}, Ll/᩵ۡۘ;->֫(II[B)Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v2, v3, 0x1

    .line 1857
    array-length v4, v0

    if-ge v2, v4, :cond_8

    aget-byte v0, v0, v2

    if-ne v0, v5, :cond_8

    add-int/lit8 v2, v3, 0x2

    :cond_8
    if-eqz v7, :cond_9

    .line 1866
    invoke-virtual {p1, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1867
    iput v2, p0, Ll/ܺ᩻ۘ;->ۧ:I

    :cond_9
    if-eqz v7, :cond_a

    return v6

    :cond_a
    :goto_5
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/ܺ᩻ۘ;I)[B
    .locals 9

    .line 1793
    iget-object v0, p0, Ll/ܺ᩻ۘ;->֫:[B

    .line 1794
    iget v1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, p1, -0x1

    if-lez p1, :cond_6

    move p1, v1

    .line 1799
    :goto_1
    array-length v4, v0

    const/16 v5, 0xa

    if-le v4, p1, :cond_4

    add-int/lit8 v4, p1, 0x1

    .line 1800
    aget-byte p1, v0, p1

    const/16 v6, 0xd

    if-eq p1, v6, :cond_1

    if-ne p1, v5, :cond_0

    goto :goto_2

    :cond_0
    move p1, v4

    goto :goto_1

    :cond_1
    :goto_2
    sub-int p1, v4, v1

    add-int/lit8 p1, p1, -0x1

    const/4 v6, 0x0

    if-nez v2, :cond_2

    .line 1804
    new-array v2, p1, [B

    .line 1805
    invoke-static {v0, v1, v2, v6, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3

    :cond_2
    if-lez p1, :cond_3

    .line 1807
    array-length v7, v2

    add-int/2addr v7, p1

    new-array v7, v7, [B

    .line 1808
    array-length v8, v2

    invoke-static {v2, v6, v7, v6, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1809
    array-length v6, v2

    invoke-static {v0, v1, v7, v6, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1810
    invoke-static {v2}, Ll/᩵ۡۘ;->ۧ([B)V

    move p1, v4

    move-object v2, v7

    goto :goto_4

    :cond_3
    :goto_3
    move p1, v4

    .line 1816
    :cond_4
    :goto_4
    array-length v1, v0

    if-ge p1, v1, :cond_5

    aget-byte v1, v0, p1

    if-ne v1, v5, :cond_5

    add-int/lit8 p1, p1, 0x1

    :cond_5
    move v1, p1

    move p1, v3

    goto :goto_0

    :cond_6
    if-eqz v2, :cond_7

    .line 1822
    iput v1, p0, Ll/ܺ᩻ۘ;->ۧ:I

    :cond_7
    return-object v2
.end method

.method private ֫([B[B[B)[B
    .locals 6

    .line 691
    :try_start_0
    invoke-virtual {p0, p2, p3}, Ll/ᩳۢۘ;->֫([B[B)[B

    move-result-object p2

    .line 692
    iget-object v0, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    const/4 v1, 0x1

    invoke-interface {v0, v1, p2, p3}, Ll/᩻ۜۘ;->֫(I[B[B)V

    .line 693
    invoke-static {p2}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 694
    array-length p2, p1

    iget-object p3, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    invoke-interface {p3}, Ll/᩻ۜۘ;->ۧ()I

    move-result p3

    sub-int/2addr p2, p3

    new-array p2, p2, [B

    .line 695
    iget-object p3, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    invoke-interface {p3}, Ll/᩻ۜۘ;->ܽ()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 696
    iget-object p3, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Ll/᩻ۜۘ;->֫(I)V

    .line 697
    iget-object v0, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    array-length p3, p1

    invoke-interface {v0}, Ll/᩻ۜۘ;->ۧ()I

    move-result v1

    sub-int v3, p3, v1

    const/4 v5, 0x0

    const/4 v1, -0x4

    move-object v2, p1

    move-object v4, p2

    invoke-interface/range {v0 .. v5}, Ll/᩻ۜۘ;->ۧ(I[BI[BI)V

    return-object p2

    .line 698
    :cond_0
    iget-object p3, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    invoke-interface {p3}, Ll/᩻ۜۘ;->ܿ()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 699
    iget-object v0, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    array-length v3, p1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v2, p1

    move-object v4, p2

    invoke-interface/range {v0 .. v5}, Ll/᩻ۜۘ;->ۧ(I[BI[BI)V

    return-object p2

    .line 701
    :cond_1
    iget-object v0, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    array-length v3, p1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v2, p1

    move-object v4, p2

    invoke-interface/range {v0 .. v5}, Ll/᩻ۜۘ;->֫(I[BI[BI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    .line 705
    :catch_0
    iget-object p1, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 705
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public static ۧ(II[B)I
    .locals 4

    .line 754
    invoke-static {p1}, Ll/ᩳۢۘ;->֫(I)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_0

    add-int/lit8 v0, p0, 0x1

    int-to-byte p1, p1

    .line 756
    aput-byte p1, p2, p0

    return v0

    :cond_0
    add-int/lit8 v1, p0, 0x1

    or-int/lit16 v2, v0, 0x80

    int-to-byte v2, v2

    .line 759
    aput-byte v2, p2, p0

    add-int p0, v1, v0

    :goto_0
    if-lez v0, :cond_1

    add-int v2, v1, v0

    add-int/lit8 v2, v2, -0x1

    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    .line 762
    aput-byte v3, p2, v2

    ushr-int/lit8 p1, p1, 0x8

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return p0
.end method

.method public static ۧ(Ll/᩹᩷ۘ;[B)Ll/ᩳۢۘ;
    .locals 9

    .line 1634
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 1635
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 1638
    :cond_0
    invoke-static {v0, p1}, Ll/ᩳۢۘ;->֫(Ll/ܺ᩻ۘ;Ljava/util/HashMap;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "PuTTY-User-Key-File-2"

    .line 1643
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_2

    const-string v1, "PuTTY-User-Key-File-3"

    .line 1645
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1

    return-object v3

    :cond_1
    const/4 v4, 0x5

    goto :goto_0

    :cond_2
    const/4 v4, 0x2

    :goto_0
    :try_start_0
    const-string v5, "Public-Lines"

    .line 1656
    invoke-virtual {p1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 1657
    invoke-static {v0, v5}, Ll/ᩳۢۘ;->֫(Ll/ܺ᩻ۘ;I)[B

    move-result-object v5

    .line 1660
    :cond_3
    invoke-static {v0, p1}, Ll/ᩳۢۘ;->֫(Ll/ܺ᩻ۘ;Ljava/util/HashMap;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "Private-Lines"

    .line 1664
    invoke-virtual {p1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 1665
    invoke-static {v0, v6}, Ll/ᩳۢۘ;->֫(Ll/ܺ᩻ۘ;I)[B

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1668
    :cond_4
    :try_start_1
    invoke-static {v0, p1}, Ll/ᩳۢۘ;->֫(Ll/ܺ᩻ۘ;Ljava/util/HashMap;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 1672
    array-length v0, v6

    const/4 v7, 0x0

    invoke-static {v7, v0, v6}, Ll/᩵ۡۘ;->ۧ(II[B)[B

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1673
    :try_start_2
    array-length v8, v5

    invoke-static {v7, v8, v5}, Ll/᩵ۡۘ;->ۧ(II[B)[B

    move-result-object v5

    .line 1675
    invoke-static {p0, v1, v5}, Ll/ᩳۢۘ;->֫(Ll/᩹᩷ۘ;Ljava/lang/String;[B)Ll/ᩳۢۘ;

    move-result-object p0

    const-string v1, "Encryption"

    .line 1676
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v7, "none"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, p0, Ll/ᩳۢۘ;->ܽ:Z

    .line 1677
    iput-object v5, p0, Ll/ᩳۢۘ;->᩷:[B

    .line 1678
    iput v4, p0, Ll/ᩳۢۘ;->ۡ:I

    const-string v1, "Comment"

    .line 1679
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 1680
    iget-boolean v1, p0, Ll/ᩳۢۘ;->ܽ:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_9

    :try_start_3
    const-string v1, "aes256-cbc"

    .line 1683
    invoke-static {v1}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v5, Ll/᩻ۜۘ;

    invoke-virtual {v1, v5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 1684
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۜۘ;

    iput-object v1, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    .line 1685
    invoke-interface {v1}, Ll/᩻ۜۘ;->ᩳ()I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, p0, Ll/ᩳۢۘ;->ܳ:[B
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/LinkageError; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v4, v2, :cond_6

    :try_start_4
    const-string p1, "sha-1"

    .line 1694
    invoke-static {p1}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class v1, Ll/ۖ᩷ۘ;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    .line 1695
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖ᩷ۘ;

    .line 1696
    invoke-interface {p1}, Ll/ۖ᩷ۘ;->init()V

    .line 1697
    iput-object p1, p0, Ll/ᩳۢۘ;->ۢ:Ll/ۖ᩷ۘ;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 1699
    :goto_1
    :try_start_5
    instance-of p1, p0, Ll/۫᩷ۘ;

    if-eqz p1, :cond_5

    .line 1700
    check-cast p0, Ll/۫᩷ۘ;

    throw p0

    .line 1701
    :cond_5
    new-instance p1, Ll/۫᩷ۘ;

    const-string v1, "hash sha-1 is not available"

    .line 43
    invoke-direct {p1, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1701
    throw p1

    :cond_6
    const-string v1, "Key-Derivation"

    .line 1704
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1706
    :try_start_6
    invoke-static {v1}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-class v4, Ll/֫ۢۘ;

    invoke-virtual {v2, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    .line 1707
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۢۘ;

    iput-object v2, p0, Ll/ᩳۢۘ;->᩻:Ll/֫ۢۘ;

    .line 1708
    invoke-interface {v2, p1}, Ll/֫ۢۘ;->֫(Ljava/util/HashMap;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/LinkageError; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1716
    :goto_2
    :try_start_7
    iput-object v0, p0, Ll/ᩳۢۘ;->ۧ:[B

    goto :goto_5

    :catch_2
    move-exception p0

    goto :goto_3

    :catch_3
    move-exception p0

    .line 1710
    :goto_3
    instance-of p1, p0, Ll/۫᩷ۘ;

    if-eqz p1, :cond_7

    .line 1711
    check-cast p0, Ll/۫᩷ۘ;

    throw p0

    .line 1712
    :cond_7
    new-instance p1, Ll/۫᩷ۘ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "kdf "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not available"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-direct {p1, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1712
    throw p1

    :catch_4
    move-exception p0

    goto :goto_4

    :catch_5
    move-exception p0

    .line 1687
    :goto_4
    instance-of p1, p0, Ll/۫᩷ۘ;

    if-eqz p1, :cond_8

    .line 1688
    check-cast p0, Ll/۫᩷ۘ;

    throw p0

    .line 1689
    :cond_8
    new-instance p1, Ll/۫᩷ۘ;

    const-string v1, "cipher aes256-cbc is not available"

    .line 43
    invoke-direct {p1, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1689
    throw p1

    .line 1718
    :cond_9
    iput-object v0, p0, Ll/ᩳۢۘ;->ۧ:[B

    .line 1719
    invoke-virtual {p0, v0}, Ll/ᩳۢۘ;->ܽ([B)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 1722
    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ([B)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 1730
    :goto_5
    invoke-static {v6}, Ll/᩵ۡۘ;->ۧ([B)V

    return-object p0

    .line 1720
    :cond_a
    :try_start_8
    new-instance p0, Ll/۫᩷ۘ;

    const-string p1, "invalid privatekey"

    .line 39
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1720
    throw p0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catch_6
    move-exception p0

    move-object v3, v0

    goto :goto_6

    :catch_7
    move-exception p0

    goto :goto_6

    :catchall_0
    move-exception p0

    goto :goto_7

    :catch_8
    move-exception p0

    move-object v6, v3

    .line 1727
    :goto_6
    :try_start_9
    invoke-static {v3}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 1728
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_1
    move-exception p0

    move-object v3, v6

    .line 1730
    :goto_7
    invoke-static {v3}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 1731
    throw p0
.end method

.method private ܳ()Ll/ۖ᩷ۘ;
    .locals 2

    :try_start_0
    const-string v0, "md5"

    .line 786
    invoke-static {v0}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/ۖ᩷ۘ;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    .line 787
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ᩷ۘ;

    iput-object v0, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    .line 788
    invoke-interface {v0}, Ll/ۖ᩷ۘ;->init()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 790
    :catch_0
    iget-object v0, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object v0, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 790
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    :goto_0
    iget-object v0, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    return-object v0
.end method


# virtual methods
.method public final finalize()V
    .locals 0

    .line 1564
    invoke-virtual {p0}, Ll/ᩳۢۘ;->֫()V

    return-void
.end method

.method public ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ᩳۢۘ;)V
    .locals 1

    .line 1874
    iget-object v0, p1, Ll/ᩳۢۘ;->᩷:[B

    iput-object v0, p0, Ll/ᩳۢۘ;->᩷:[B

    .line 1875
    iget v0, p1, Ll/ᩳۢۘ;->ۡ:I

    iput v0, p0, Ll/ᩳۢۘ;->ۡ:I

    .line 1876
    iget-object v0, p1, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    iput-object v0, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 1877
    iget-object p1, p1, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    iput-object p1, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    return-void
.end method

.method public ֫([B)Z
    .locals 5

    .line 931
    iget-boolean v0, p0, Ll/ᩳۢۘ;->ܽ:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-nez p1, :cond_1

    xor-int/lit8 p1, v0, 0x1

    return p1

    .line 937
    :cond_1
    array-length v0, p1

    new-array v2, v0, [B

    const/4 v3, 0x0

    .line 938
    invoke-static {p1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p1, 0x0

    .line 942
    :try_start_0
    iget-object v0, p0, Ll/ᩳۢۘ;->ۧ:[B

    iget-object v4, p0, Ll/ᩳۢۘ;->ܳ:[B

    invoke-direct {p0, v0, v2, v4}, Ll/ᩳۢۘ;->֫([B[B[B)[B

    move-result-object p1

    .line 943
    invoke-virtual {p0, p1}, Ll/ᩳۢۘ;->ܽ([B)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 944
    iput-boolean v3, p0, Ll/ᩳۢۘ;->ܽ:Z

    .line 945
    iget-object v0, p0, Ll/ᩳۢۘ;->ۧ:[B

    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 948
    :cond_2
    invoke-static {v2}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 949
    invoke-static {p1}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 951
    iget-boolean p1, p0, Ll/ᩳۢۘ;->ܽ:Z

    xor-int/2addr p1, v1

    return p1

    :catchall_0
    move-exception v0

    .line 948
    invoke-static {v2}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 949
    invoke-static {p1}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 950
    throw v0
.end method

.method public abstract ֫(Ljava/lang/String;[B)[B
.end method

.method public final declared-synchronized ֫([B[B)[B
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 830
    :try_start_0
    iget-object v1, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    :try_start_1
    const-string v1, "3des-cbc"

    .line 815
    invoke-static {v1}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v3, Ll/᩻ۜۘ;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 816
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۜۘ;

    iput-object v1, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 818
    :catch_0
    :try_start_2
    iget-object v1, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object v1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 818
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    :goto_0
    iget-object v1, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    .line 831
    iput-object v1, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    .line 832
    :cond_0
    iget-object v1, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    if-nez v1, :cond_1

    .line 833
    invoke-direct {p0}, Ll/ᩳۢۘ;->ܳ()Ll/ۖ᩷ۘ;

    move-result-object v1

    iput-object v1, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    .line 835
    :cond_1
    iget-object v1, p0, Ll/ᩳۢۘ;->֫:Ll/᩻ۜۘ;

    invoke-interface {v1}, Ll/᩻ۜۘ;->getBlockSize()I

    move-result v1

    new-array v3, v1, [B

    .line 836
    iget-object v4, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    invoke-interface {v4}, Ll/ۖ᩷ۘ;->getBlockSize()I

    move-result v4

    .line 837
    div-int v5, v1, v4

    mul-int v5, v5, v4

    rem-int v6, v1, v4

    const/4 v7, 0x0

    if-nez v6, :cond_2

    const/4 v6, 0x0

    goto :goto_1

    :cond_2
    move v6, v4

    :goto_1
    add-int/2addr v5, v6

    new-array v6, v5, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 840
    :try_start_3
    iget v8, p0, Ll/ᩳۢۘ;->ۡ:I

    if-nez v8, :cond_6

    const/4 v8, 0x0

    :goto_2
    add-int v9, v8, v4

    if-gt v9, v5, :cond_5

    if-eqz v2, :cond_3

    .line 843
    iget-object v9, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    array-length v10, v2

    invoke-interface {v9, v10, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 845
    :cond_3
    iget-object v2, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    array-length v9, p1

    invoke-interface {v2, v9, p1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 846
    iget-object v2, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    array-length v9, p2

    const/16 v10, 0x8

    if-le v9, v10, :cond_4

    goto :goto_3

    :cond_4
    array-length v10, p2

    :goto_3
    invoke-interface {v2, v10, p2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 847
    iget-object v2, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    invoke-interface {v2}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v2

    .line 848
    array-length v9, v2

    invoke-static {v2, v7, v6, v8, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 849
    array-length v9, v2

    add-int/2addr v8, v9

    goto :goto_2

    .line 851
    :cond_5
    invoke-static {v6, v7, v3, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_5

    :cond_6
    const/4 v9, 0x4

    if-ne v8, v9, :cond_7

    .line 853
    iget-object v2, p0, Ll/ᩳۢۘ;->᩻:Ll/֫ۢۘ;

    array-length v4, p2

    add-int/2addr v4, v1

    invoke-interface {v2, v4, p1}, Ll/֫ۢۘ;->֫(I[B)[B

    move-result-object p1

    .line 854
    invoke-static {p1, v7, v3, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 855
    array-length v2, p2

    invoke-static {p1, v1, p2, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 856
    invoke-static {p1}, Ll/᩵ۡۘ;->ۧ([B)V

    goto/16 :goto_5

    :cond_7
    const/4 v10, 0x1

    if-ne v8, v10, :cond_a

    const/4 p2, 0x0

    :goto_4
    add-int v8, p2, v4

    if-gt v8, v5, :cond_9

    if-eqz v2, :cond_8

    .line 860
    iget-object v8, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    array-length v9, v2

    invoke-interface {v8, v9, v2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 862
    :cond_8
    iget-object v2, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    array-length v8, p1

    invoke-interface {v2, v8, p1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 863
    iget-object v2, p0, Ll/ᩳۢۘ;->ᩳ:Ll/ۖ᩷ۘ;

    invoke-interface {v2}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v2

    .line 864
    array-length v8, v2

    invoke-static {v2, v7, v6, p2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 865
    array-length v8, v2

    add-int/2addr p2, v8

    goto :goto_4

    .line 867
    :cond_9
    invoke-static {v6, v7, v3, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_5

    :cond_a
    const/4 v2, 0x2

    if-ne v8, v2, :cond_b

    new-array p2, v9, [B

    .line 871
    iget-object v2, p0, Ll/ᩳۢۘ;->ۢ:Ll/ۖ᩷ۘ;

    invoke-interface {v2, v9, p2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 872
    iget-object v2, p0, Ll/ᩳۢۘ;->ۢ:Ll/ۖ᩷ۘ;

    array-length v4, p1

    invoke-interface {v2, v4, p1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 873
    iget-object v2, p0, Ll/ᩳۢۘ;->ۢ:Ll/ۖ᩷ۘ;

    invoke-interface {v2}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object v2

    .line 874
    array-length v4, v2

    invoke-static {v2, v7, v3, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 875
    invoke-static {v2}, Ll/᩵ۡۘ;->ۧ([B)V

    const/4 v2, 0x3

    aput-byte v10, p2, v2

    .line 878
    iget-object v2, p0, Ll/ᩳۢۘ;->ۢ:Ll/ۖ᩷ۘ;

    invoke-interface {v2, v9, p2}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 879
    iget-object p2, p0, Ll/ᩳۢۘ;->ۢ:Ll/ۖ᩷ۘ;

    array-length v2, p1

    invoke-interface {p2, v2, p1}, Ll/ۖ᩷ۘ;->֫(I[B)V

    .line 880
    iget-object p1, p0, Ll/ᩳۢۘ;->ۢ:Ll/ۖ᩷ۘ;

    invoke-interface {p1}, Ll/ۖ᩷ۘ;->֫()[B

    move-result-object p1

    .line 881
    array-length p2, p1

    array-length v2, p1

    sub-int/2addr v1, v2

    invoke-static {p1, v7, v3, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 882
    invoke-static {p1}, Ll/᩵ۡۘ;->ۧ([B)V

    goto :goto_5

    :cond_b
    const/4 v2, 0x5

    if-ne v8, v2, :cond_c

    .line 884
    iget-object v2, p0, Ll/ᩳۢۘ;->᩻:Ll/֫ۢۘ;

    array-length v4, p2

    add-int/2addr v4, v1

    add-int/lit8 v4, v4, 0x20

    invoke-interface {v2, v4, p1}, Ll/֫ۢۘ;->֫(I[B)[B

    move-result-object p1

    .line 885
    invoke-static {p1, v7, v3, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 886
    array-length v2, p2

    invoke-static {p1, v1, p2, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 887
    invoke-static {p1}, Ll/᩵ۡۘ;->ۧ([B)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    .line 890
    :catch_1
    :try_start_4
    iget-object p1, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 890
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 894
    :cond_c
    :goto_5
    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public abstract ۧ()[B
.end method

.method public abstract ۧ([B)[B
.end method

.method public abstract ܽ()I
.end method

.method public abstract ܽ([B)Z
.end method

.method public ܿ()[B
    .locals 1

    .line 448
    iget-object v0, p0, Ll/ᩳۢۘ;->᩷:[B

    return-object v0
.end method

.method public abstract ᩳ()[B
.end method
