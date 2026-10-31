.class public Ll/ۨܽ֡;
.super Ljava/lang/Object;
.source "Y4D9"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# static fields
.field public static final serialVersionUID:J = 0x1L

.field public static final ۗ:[C

.field public static final ۙ:Ll/ۨܽ֡;


# instance fields
.field public transient ᩶:Ljava/lang/String;

.field public final ᩸:[B

.field public transient ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 53
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨܽ֡;->ۗ:[C

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 58
    invoke-static {v0}, Ll/ۨܽ֡;->֫([B)Ll/ۨܽ֡;

    move-result-object v0

    sput-object v0, Ll/ۨܽ֡;->ۙ:Ll/ۨܽ֡;

    return-void

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Ll/ۨܽ֡;->᩸:[B

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 5

    .line 528
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    if-ltz v0, :cond_2

    .line 249
    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    sub-int v3, v0, v2

    .line 251
    invoke-virtual {p1, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    .line 252
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 254
    :cond_1
    new-instance p1, Ll/ۨܽ֡;

    invoke-direct {p1, v1}, Ll/ۨܽ֡;-><init>([B)V

    .line 531
    :try_start_0
    const-class v0, Ll/ۨܽ֡;

    const-string v1, "\u1a78"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 532
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 533
    iget-object p1, p1, Ll/ۨܽ֡;->᩸:[B

    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 537
    :catch_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 535
    :catch_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 247
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "byteCount < 0: "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 247
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 542
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 543
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->write([B)V

    return-void
.end method

.method public static ֫(C)I
    .locals 3

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x37

    return p0

    .line 236
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected hex digit: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۨܽ֡;
    .locals 15

    if-eqz p0, :cond_11

    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    const/16 v1, 0x9

    const/16 v2, 0x20

    const/16 v3, 0xd

    const/16 v4, 0xa

    if-lez v0, :cond_1

    add-int/lit8 v5, v0, -0x1

    .line 33
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x3d

    if-eq v5, v6, :cond_0

    if-eq v5, v4, :cond_0

    if-eq v5, v3, :cond_0

    if-eq v5, v2, :cond_0

    if-eq v5, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long v5, v0

    const-wide/16 v7, 0x6

    mul-long v5, v5, v7

    const-wide/16 v7, 0x8

    .line 40
    div-long/2addr v5, v7

    long-to-int v6, v5

    new-array v5, v6, [B

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_2
    const/4 v12, 0x0

    if-ge v8, v0, :cond_a

    .line 46
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v14, 0x41

    if-lt v13, v14, :cond_2

    const/16 v14, 0x5a

    if-gt v13, v14, :cond_2

    add-int/lit8 v13, v13, -0x41

    goto :goto_5

    :cond_2
    const/16 v14, 0x61

    if-lt v13, v14, :cond_3

    const/16 v14, 0x7a

    if-gt v13, v14, :cond_3

    add-int/lit8 v13, v13, -0x47

    goto :goto_5

    :cond_3
    const/16 v14, 0x30

    if-lt v13, v14, :cond_4

    const/16 v14, 0x39

    if-gt v13, v14, :cond_4

    add-int/lit8 v13, v13, 0x4

    goto :goto_5

    :cond_4
    const/16 v14, 0x2b

    if-eq v13, v14, :cond_8

    const/16 v14, 0x2d

    if-ne v13, v14, :cond_5

    goto :goto_4

    :cond_5
    const/16 v14, 0x2f

    if-eq v13, v14, :cond_7

    const/16 v14, 0x5f

    if-ne v13, v14, :cond_6

    goto :goto_3

    :cond_6
    if-eq v13, v4, :cond_9

    if-eq v13, v3, :cond_9

    if-eq v13, v2, :cond_9

    if-ne v13, v1, :cond_b

    goto :goto_6

    :cond_7
    :goto_3
    const/16 v13, 0x3f

    goto :goto_5

    :cond_8
    :goto_4
    const/16 v13, 0x3e

    :goto_5
    shl-int/lit8 v10, v10, 0x6

    int-to-byte v12, v13

    or-int/2addr v10, v12

    add-int/lit8 v9, v9, 0x1

    .line 79
    rem-int/lit8 v12, v9, 0x4

    if-nez v12, :cond_9

    add-int/lit8 v12, v11, 0x1

    shr-int/lit8 v13, v10, 0x10

    int-to-byte v13, v13

    .line 80
    aput-byte v13, v5, v11

    add-int/lit8 v13, v11, 0x2

    shr-int/lit8 v14, v10, 0x8

    int-to-byte v14, v14

    .line 81
    aput-byte v14, v5, v12

    add-int/lit8 v11, v11, 0x3

    int-to-byte v12, v10

    .line 82
    aput-byte v12, v5, v13

    :cond_9
    :goto_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 86
    :cond_a
    rem-int/lit8 v9, v9, 0x4

    const/4 p0, 0x1

    if-ne v9, p0, :cond_c

    :cond_b
    move-object v5, v12

    goto :goto_8

    :cond_c
    const/4 p0, 0x2

    if-ne v9, p0, :cond_d

    shl-int/lit8 p0, v10, 0xc

    add-int/lit8 v0, v11, 0x1

    shr-int/lit8 p0, p0, 0x10

    int-to-byte p0, p0

    .line 93
    aput-byte p0, v5, v11

    move v11, v0

    goto :goto_7

    :cond_d
    const/4 p0, 0x3

    if-ne v9, p0, :cond_e

    shl-int/lit8 p0, v10, 0x6

    add-int/lit8 v0, v11, 0x1

    shr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    .line 97
    aput-byte v1, v5, v11

    add-int/lit8 v11, v11, 0x2

    shr-int/lit8 p0, p0, 0x8

    int-to-byte p0, p0

    .line 98
    aput-byte p0, v5, v0

    :cond_e
    :goto_7
    if-ne v11, v6, :cond_f

    goto :goto_8

    .line 105
    :cond_f
    new-array p0, v11, [B

    .line 106
    invoke-static {v5, v7, p0, v7, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v5, p0

    :goto_8
    if-eqz v5, :cond_10

    .line 204
    new-instance p0, Ll/ۨܽ֡;

    invoke-direct {p0, v5}, Ll/ۨܽ֡;-><init>([B)V

    return-object p0

    :cond_10
    return-object v12

    .line 202
    :cond_11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "base64 == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static varargs ֫([B)Ll/ۨܽ֡;
    .locals 1

    if-eqz p0, :cond_0

    .line 73
    new-instance v0, Ll/ۨܽ֡;

    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    invoke-direct {v0, p0}, Ll/ۨܽ֡;-><init>([B)V

    return-object v0

    .line 72
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "data == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۨܽ֡;
    .locals 5

    .line 221
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_1

    .line 223
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v3, v2, 0x2

    .line 225
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ll/ۨܽ֡;->֫(C)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    add-int/lit8 v3, v3, 0x1

    .line 226
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ll/ۨܽ֡;->֫(C)I

    move-result v3

    add-int/2addr v4, v3

    int-to-byte v3, v4

    .line 227
    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 229
    :cond_0
    invoke-static {v1}, Ll/ۨܽ֡;->֫([B)Ll/ۨܽ֡;

    move-result-object p0

    return-object p0

    .line 221
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected hex string: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܽ(Ljava/lang/String;)Ll/ۨܽ֡;
    .locals 1

    .line 156
    :try_start_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-static {p1}, Ll/ۨܽ֡;->֫([B)Ll/ۨܽ֡;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 158
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static ܿ(Ljava/lang/String;)Ll/ۨܽ֡;
    .locals 2

    if-eqz p0, :cond_0

    .line 100
    new-instance v0, Ll/ۨܽ֡;

    sget-object v1, Ll/᩸ᩳ֡;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۨܽ֡;-><init>([B)V

    .line 101
    iput-object p0, v0, Ll/ۨܽ֡;->᩶:Ljava/lang/String;

    return-object v0

    .line 99
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "s == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩳ(Ljava/lang/String;)Ll/ۨܽ֡;
    .locals 2

    .line 2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    if-eqz p0, :cond_1

    if-eqz v0, :cond_0

    .line 109
    new-instance v1, Ll/ۨܽ֡;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v1, p0}, Ll/ۨܽ֡;-><init>([B)V

    return-object v1

    .line 108
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "charset == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 107
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "s == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 7

    .line 52
    check-cast p1, Ll/ۨܽ֡;

    .line 473
    invoke-virtual {p0}, Ll/ۨܽ֡;->᩷()I

    move-result v0

    .line 474
    invoke-virtual {p1}, Ll/ۨܽ֡;->᩷()I

    move-result v1

    .line 475
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    .line 476
    invoke-virtual {p0, v4}, Ll/ۨܽ֡;->֫(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    .line 477
    invoke-virtual {p1, v4}, Ll/ۨܽ֡;->֫(I)B

    move-result v6

    and-int/lit16 v6, v6, 0xff

    if-ne v5, v6, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    if-ge v5, v6, :cond_3

    goto :goto_1

    :cond_1
    if-ne v0, v1, :cond_2

    return v3

    :cond_2
    if-ge v0, v1, :cond_3

    :goto_1
    const/4 p1, -0x1

    return p1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 462
    :cond_0
    instance-of v1, p1, Ll/ۨܽ֡;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ll/ۨܽ֡;

    .line 463
    invoke-virtual {p1}, Ll/ۨܽ֡;->᩷()I

    move-result v1

    iget-object v3, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v4, v3

    if-ne v1, v4, :cond_1

    array-length v1, v3

    .line 464
    invoke-virtual {p1, v2, v3, v2, v1}, Ll/ۨܽ֡;->֫(I[BII)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public hashCode()I
    .locals 1

    .line 468
    iget v0, p0, Ll/ۨܽ֡;->᩹:I

    if-eqz v0, :cond_0

    return v0

    .line 469
    :cond_0
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    iput v0, p0, Ll/ۨܽ֡;->᩹:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 490
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v0, v0

    if-nez v0, :cond_0

    const-string v0, "[size=0]"

    return-object v0

    .line 494
    :cond_0
    invoke-virtual {p0}, Ll/ۨܽ֡;->ᩴ()Ljava/lang/String;

    move-result-object v0

    .line 513
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    const/16 v6, 0x40

    if-ge v3, v1, :cond_5

    if-ne v4, v6, :cond_1

    goto :goto_1

    .line 517
    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v7

    .line 518
    invoke-static {v7}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0xa

    if-eq v7, v8, :cond_2

    const/16 v8, 0xd

    if-ne v7, v8, :cond_3

    :cond_2
    const v8, 0xfffd

    if-ne v7, v8, :cond_4

    :cond_3
    const/4 v3, -0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 513
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v5

    add-int/2addr v3, v5

    goto :goto_0

    .line 524
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    :goto_1
    const-string v1, "\u2026]"

    const-string v4, "[size="

    const-string v7, "]"

    if-ne v3, v5, :cond_7

    .line 498
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v0, v0

    if-gt v0, v6, :cond_6

    .line 499
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[hex="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۨܽ֡;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 500
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " hex="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۨܽ֡;->ۢ()Ll/ۨܽ֡;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܽ֡;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 503
    :cond_7
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v5, "\\"

    const-string v6, "\\\\"

    .line 504
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "\n"

    const-string v6, "\\n"

    .line 505
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "\r"

    const-string v6, "\\r"

    .line 506
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 507
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v3, v0, :cond_8

    .line 508
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " text="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_8
    const-string v0, "[text="

    .line 0
    invoke-static {v0, v2, v7}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(I)B
    .locals 1

    .line 340
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public ֫()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    invoke-static {v0}, Ll/ۗܽ֡;->֫([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/۫ܽ֡;)V
    .locals 3

    .line 377
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    const/4 v1, 0x0

    array-length v2, v0

    invoke-virtual {p1, v0, v1, v2}, Ll/۫ܽ֡;->write([BII)V

    return-void
.end method

.method public ֫(I[BII)Z
    .locals 5

    const/4 v0, 0x0

    if-ltz p1, :cond_2

    .line 395
    iget-object v1, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v2, v1

    sub-int/2addr v2, p4

    if-gt p1, v2, :cond_2

    if-ltz p3, :cond_2

    array-length v2, p2

    sub-int/2addr v2, p4

    if-gt p3, v2, :cond_2

    .line 397
    sget-object v2, Ll/᩸ᩳ֡;->֫:Ljava/nio/charset/Charset;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p4, :cond_1

    add-int v3, v2, p1

    .line 76
    aget-byte v3, v1, v3

    add-int v4, v2, p3

    aget-byte v4, p2, v4

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    return v0
.end method

.method public ֫(Ll/ۨܽ֡;I)Z
    .locals 2

    const/4 v0, 0x0

    .line 386
    iget-object v1, p0, Ll/ۨܽ֡;->᩸:[B

    invoke-virtual {p1, v0, v1, v0, p2}, Ll/ۨܽ֡;->֫(I[BII)Z

    move-result p1

    return p1
.end method

.method public ۡ()Ll/ۨܽ֡;
    .locals 6

    const/4 v0, 0x0

    .line 264
    :goto_0
    iget-object v1, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v2, v1

    if-ge v0, v2, :cond_5

    .line 265
    aget-byte v2, v1, v0

    const/16 v3, 0x41

    if-lt v2, v3, :cond_4

    const/16 v4, 0x5a

    if-le v2, v4, :cond_0

    goto :goto_3

    .line 270
    :cond_0
    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    add-int/lit8 v5, v0, 0x1

    add-int/lit8 v2, v2, 0x20

    int-to-byte v2, v2

    .line 271
    aput-byte v2, v1, v0

    .line 272
    :goto_1
    array-length v0, v1

    if-ge v5, v0, :cond_3

    .line 273
    aget-byte v0, v1, v5

    if-lt v0, v3, :cond_2

    if-le v0, v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v0, v0, 0x20

    int-to-byte v0, v0

    .line 275
    aput-byte v0, v1, v5

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 277
    :cond_3
    new-instance v0, Ll/ۨܽ֡;

    invoke-direct {v0, v1}, Ll/ۨܽ֡;-><init>([B)V

    return-object v0

    :cond_4
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    return-object p0
.end method

.method public ۢ()Ll/ۨܽ֡;
    .locals 4

    .line 322
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v1, v0

    const/16 v2, 0x40

    if-gt v2, v1, :cond_1

    .line 329
    array-length v1, v0

    if-ne v2, v1, :cond_0

    return-object p0

    :cond_0
    new-array v1, v2, [B

    const/4 v3, 0x0

    .line 334
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 335
    new-instance v0, Ll/ۨܽ֡;

    invoke-direct {v0, v1}, Ll/ۨܽ֡;-><init>([B)V

    return-object v0

    .line 323
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "endIndex > length("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v2, v2

    const-string v3, ")"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 323
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۧ()Ljava/lang/String;
    .locals 9

    .line 209
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [C

    .line 211
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-byte v5, v0, v3

    add-int/lit8 v6, v4, 0x1

    shr-int/lit8 v7, v5, 0x4

    and-int/lit8 v7, v7, 0xf

    .line 212
    sget-object v8, Ll/ۨܽ֡;->ۗ:[C

    aget-char v7, v8, v7

    aput-char v7, v1, v4

    add-int/lit8 v4, v4, 0x2

    and-int/lit8 v5, v5, 0xf

    .line 213
    aget-char v5, v8, v5

    aput-char v5, v1, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 215
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public ܺ()[B
    .locals 1

    .line 354
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public ܿ()Ll/ۨܽ֡;
    .locals 1

    const-string v0, "MD5"

    .line 136
    invoke-direct {p0, v0}, Ll/ۨܽ֡;->ܽ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v0

    return-object v0
.end method

.method public ᩴ()Ljava/lang/String;
    .locals 3

    .line 114
    iget-object v0, p0, Ll/ۨܽ֡;->᩶:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 116
    :cond_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۨܽ֡;->᩸:[B

    sget-object v2, Ll/᩸ᩳ֡;->֫:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v0, p0, Ll/ۨܽ֡;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public ᩷()I
    .locals 1

    .line 347
    iget-object v0, p0, Ll/ۨܽ֡;->᩸:[B

    array-length v0, v0

    return v0
.end method

.method public ᩻()Ll/ۨܽ֡;
    .locals 1

    const-string v0, "SHA-256"

    .line 146
    invoke-direct {p0, v0}, Ll/ۨܽ֡;->ܽ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v0

    return-object v0
.end method
