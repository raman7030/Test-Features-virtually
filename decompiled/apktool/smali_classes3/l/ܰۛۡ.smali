.class public Ll/ܰۛۡ;
.super Ljava/lang/Object;
.source "N7JL"


# static fields
.field public static ֫:Z


# direct methods
.method public static ֫(FI)I
    .locals 5

    int-to-double v0, p1

    float-to-double v2, p0

    div-double/2addr v0, v2

    .line 226
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-long v0, v0

    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(J)J

    move-result-wide v0

    const-wide/16 v2, 0x2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/32 v2, 0x40000000

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    long-to-int p0, v0

    return p0

    .line 227
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Too large ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " expected elements with load factor "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(I)I
    .locals 1

    const v0, -0x61c88647

    mul-int p0, p0, v0

    ushr-int/lit8 v0, p0, 0x10

    xor-int/2addr p0, v0

    return p0
.end method

.method public static ֫(Ll/ۡ۬ۖ;)I
    .locals 5

    const/4 v0, 0x0

    .line 69
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    const/16 v2, 0x7f

    if-gt v1, v2, :cond_0

    return v1

    :cond_0
    and-int/2addr v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    shl-int/lit8 v3, v3, 0x8

    .line 77
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_2

    return v3

    .line 81
    :cond_2
    new-instance p0, Ll/ۖ۬ۖ;

    const-string v1, "The indefinite length form is not (yet) supported!"

    .line 20
    invoke-direct {p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 81
    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 86
    new-instance v1, Ll/ۖ۬ۖ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v0

    const-string p0, "Unable to read the length of the ASN.1 object."

    invoke-direct {v1, p0, v2}, Ll/ۖ۬ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1
.end method

.method public static ֫(J)J
    .locals 2

    const-wide/16 v0, 0x1

    sub-long/2addr p0, v0

    .line 178
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x40

    shl-long p0, v0, p0

    return-wide p0
.end method

.method public static ֫()V
    .locals 3

    .line 15
    :try_start_0
    const-class v0, Ll/ۙۗ;

    const-string v1, "\u05ab"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 16
    const-class v1, Ll/ۙۗ;

    const-string v2, "\u06e7"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    .line 23
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 25
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    .line 27
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ֫([B)Z
    .locals 15

    .line 14
    array-length v0, p0

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v0, 0x1

    .line 19
    aget-byte v1, p0, v0

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x2

    .line 20
    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    const/4 v4, 0x6

    .line 21
    aget-byte v4, p0, v4

    and-int/lit16 v4, v4, 0xff

    const/16 v5, 0x8

    shl-int/2addr v4, v5

    const/4 v6, 0x5

    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    or-int/2addr v4, v6

    const/4 v6, 0x7

    .line 22
    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0xd

    .line 23
    aget-byte v7, p0, v7

    and-int/lit16 v7, v7, 0xff

    shl-int/2addr v7, v5

    const/16 v8, 0xc

    aget-byte v8, p0, v8

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v7, v8

    const/16 v8, 0xf

    .line 24
    aget-byte v9, p0, v8

    and-int/lit16 v9, v9, 0xff

    shl-int/2addr v9, v5

    const/16 v10, 0xe

    aget-byte v10, p0, v10

    and-int/lit16 v10, v10, 0xff

    or-int/2addr v9, v10

    const/16 v10, 0x10

    .line 25
    aget-byte p0, p0, v10

    and-int/lit16 p0, p0, 0xff

    if-eqz v1, :cond_1

    if-eq v1, v0, :cond_1

    goto/16 :goto_5

    :cond_1
    const/16 v11, 0xb

    const/16 v12, 0xa

    const/4 v13, 0x3

    const/16 v14, 0x9

    if-eq v3, v0, :cond_2

    if-eq v3, v2, :cond_2

    if-eq v3, v13, :cond_2

    if-eq v3, v14, :cond_2

    if-eq v3, v12, :cond_2

    if-ne v3, v11, :cond_d

    :cond_2
    if-eqz v7, :cond_d

    if-nez v9, :cond_3

    goto :goto_5

    :cond_3
    if-eq v3, v0, :cond_5

    if-ne v3, v14, :cond_4

    goto :goto_0

    :cond_4
    if-nez v1, :cond_d

    goto :goto_1

    :cond_5
    :goto_0
    if-ne v1, v0, :cond_d

    :goto_1
    const/16 v7, 0x20

    const/16 v9, 0x18

    if-ne v1, v0, :cond_6

    if-lez v4, :cond_d

    if-eq v6, v8, :cond_6

    if-eq v6, v10, :cond_6

    if-eq v6, v9, :cond_6

    if-ne v6, v7, :cond_d

    :cond_6
    if-eq v3, v0, :cond_b

    if-ne v3, v14, :cond_7

    goto :goto_3

    :cond_7
    if-eq v3, v2, :cond_a

    if-ne v3, v12, :cond_8

    goto :goto_2

    :cond_8
    if-eq v3, v13, :cond_9

    if-ne v3, v11, :cond_d

    :cond_9
    if-eq p0, v5, :cond_c

    if-ne p0, v10, :cond_d

    goto :goto_4

    :cond_a
    :goto_2
    if-eq p0, v8, :cond_c

    if-eq p0, v10, :cond_c

    if-eq p0, v9, :cond_c

    if-ne p0, v7, :cond_d

    goto :goto_4

    :cond_b
    :goto_3
    if-eq p0, v5, :cond_c

    if-ne p0, v10, :cond_d

    :cond_c
    :goto_4
    return v0

    :cond_d
    :goto_5
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(ILl/ۡ۬ۖ;)[B
    .locals 5

    const/4 v0, 0x0

    .line 93
    :try_start_0
    new-array v1, p0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p0, :cond_0

    sub-int v3, p0, v2

    .line 96
    invoke-virtual {p1, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    return-object v1

    :catch_0
    move-exception p0

    .line 101
    new-instance p1, Ll/ۖ۬ۖ;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v0

    const-string p0, "Unable to read the value of the ASN.1 object"

    invoke-direct {p1, p0, v1}, Ll/ۖ۬ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

.method public static ۧ(FI)I
    .locals 4

    int-to-double v0, p1

    float-to-double v2, p0

    mul-double v0, v0, v2

    .line 195
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p0, v0

    add-int/lit8 p1, p1, -0x1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/ۡ۬ۖ;)Ll/ۨ۬ۖ;
    .locals 6

    const/4 v0, 0x0

    .line 33
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    int-to-byte v2, v1

    .line 34
    invoke-static {v2}, Ll/᩺۬ۖ;->֫(B)Ll/᩺۬ۖ;

    move-result-object v3

    .line 35
    invoke-static {v2}, Ll/֡۬ۖ;->֫(B)Ll/֡۬ۖ;

    move-result-object v2

    and-int/lit8 v1, v1, 0x1f

    const/16 v4, 0x1e

    if-gt v1, v4, :cond_0

    .line 39
    invoke-static {v3, v1}, Ll/ۨ۬ۖ;->֫(Ll/᩺۬ۖ;I)Ll/ۨ۬ۖ;

    move-result-object p0

    invoke-virtual {p0, v2}, Ll/ۨ۬ۖ;->֫(Ll/֡۬ۖ;)Ll/ۨ۬ۖ;

    move-result-object p0

    return-object p0

    .line 42
    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    and-int/lit8 v4, v1, 0x7f

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    :goto_0
    if-ltz v1, :cond_1

    and-int/lit16 v5, v1, 0x80

    if-eqz v5, :cond_1

    and-int/lit8 v1, v1, 0x7f

    or-int/2addr v1, v4

    shl-int/lit8 v4, v1, 0x7

    .line 50
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    goto :goto_0

    :cond_1
    if-ltz v1, :cond_2

    and-int/lit8 p0, v1, 0x7f

    or-int/2addr p0, v4

    .line 59
    invoke-static {v3, p0}, Ll/ۨ۬ۖ;->֫(Ll/᩺۬ۖ;I)Ll/ۨ۬ۖ;

    move-result-object p0

    invoke-virtual {p0, v2}, Ll/ۨ۬ۖ;->֫(Ll/֡۬ۖ;)Ll/ۨ۬ۖ;

    move-result-object p0

    return-object p0

    .line 54
    :cond_2
    new-instance p0, Ll/ۖ۬ۖ;

    const-string v1, "EOF found inside tag value."

    .line 20
    invoke-direct {p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 54
    throw p0

    .line 44
    :cond_3
    new-instance p0, Ll/ۖ۬ۖ;

    const-string v1, "corrupted stream - invalid high tag number found"

    .line 20
    invoke-direct {p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 44
    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 62
    new-instance v1, Ll/ۖ۬ۖ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v0

    const-string p0, "Unable to parse ASN.1 tag"

    invoke-direct {v1, p0, v2}, Ll/ۖ۬ۖ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1
.end method
