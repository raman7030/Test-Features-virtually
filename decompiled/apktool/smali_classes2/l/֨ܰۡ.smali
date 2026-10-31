.class public final Ll/֨ܰۡ;
.super Ljava/lang/Object;
.source "L4GC"


# instance fields
.field public ֫:I

.field public ۜ:[B

.field public ۡ:Ljava/lang/String;

.field public ۢ:I

.field public ۧ:I

.field public ܳ:[B

.field public ܺ:[B

.field public ܽ:I

.field public ܿ:[B

.field public ᩳ:Ll/۠ܰۡ;

.field public ᩷:Ll/ܶܰۡ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 8

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 28
    iput v0, p0, Ll/֨ܰۡ;->ۢ:I

    if-eqz p1, :cond_a

    .line 34
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    const/4 v1, 0x3

    if-eq p2, v0, :cond_1

    if-ne p2, v1, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid key strength in AES encryptor constructor"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 42
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/֨ܰۡ;->ۡ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 44
    iput-boolean p1, p0, Ll/֨ܰۡ;->᩻:Z

    const/16 v2, 0x10

    new-array v3, v2, [B

    .line 45
    iput-object v3, p0, Ll/֨ܰۡ;->ܿ:[B

    new-array v3, v2, [B

    .line 46
    iput-object v3, p0, Ll/֨ܰۡ;->ۜ:[B

    const/16 v3, 0x8

    if-eq p2, v0, :cond_3

    if-ne p2, v1, :cond_2

    const/16 p2, 0x20

    .line 58
    iput p2, p0, Ll/֨ܰۡ;->֫:I

    .line 59
    iput p2, p0, Ll/֨ܰۡ;->ۧ:I

    .line 60
    iput v2, p0, Ll/֨ܰۡ;->ܽ:I

    goto :goto_1

    .line 63
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "invalid aes key strength, cannot determine key sizes"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 53
    :cond_3
    iput v2, p0, Ll/֨ܰۡ;->֫:I

    .line 54
    iput v2, p0, Ll/֨ܰۡ;->ۧ:I

    .line 55
    iput v3, p0, Ll/֨ܰۡ;->ܽ:I

    .line 66
    :goto_1
    iget p2, p0, Ll/֨ܰۡ;->ܽ:I

    if-eq p2, v3, :cond_5

    if-ne p2, v2, :cond_4

    goto :goto_2

    .line 129
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "invalid salt size, cannot generate salt"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    const/4 v0, 0x2

    if-ne p2, v3, :cond_6

    const/4 v3, 0x2

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    :goto_3
    if-ne p2, v2, :cond_7

    const/4 v3, 0x4

    .line 139
    :cond_7
    new-array p2, p2, [B

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v3, :cond_8

    .line 141
    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    .line 142
    invoke-virtual {v4}, Ljava/util/Random;->nextInt()I

    move-result v4

    mul-int/lit8 v5, v2, 0x4

    shr-int/lit8 v6, v4, 0x18

    int-to-byte v6, v6

    .line 143
    aput-byte v6, p2, v5

    add-int/lit8 v6, v5, 0x1

    shr-int/lit8 v7, v4, 0x10

    int-to-byte v7, v7

    .line 144
    aput-byte v7, p2, v6

    add-int/lit8 v6, v5, 0x2

    shr-int/lit8 v7, v4, 0x8

    int-to-byte v7, v7

    .line 145
    aput-byte v7, p2, v6

    add-int/2addr v5, v1

    int-to-byte v4, v4

    .line 146
    aput-byte v4, p2, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 66
    :cond_8
    iput-object p2, p0, Ll/֨ܰۡ;->ܺ:[B

    .line 67
    iget-object v1, p0, Ll/֨ܰۡ;->ۡ:Ljava/lang/String;

    .line 88
    :try_start_0
    new-instance v2, Ll/᩹ܰۡ;

    invoke-direct {v2, p2}, Ll/᩹ܰۡ;-><init>([B)V

    .line 89
    new-instance p2, Ll/᩸ܰۡ;

    invoke-direct {p2, v2}, Ll/᩸ܰۡ;-><init>(Ll/᩹ܰۡ;)V

    const-string v2, "UTF-8"

    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    iget v2, p0, Ll/֨ܰۡ;->֫:I

    iget v3, p0, Ll/֨ܰۡ;->ۧ:I

    add-int/2addr v2, v3

    add-int/2addr v2, v0

    invoke-virtual {p2, v2, v1}, Ll/᩸ܰۡ;->֫(I[B)[B

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    array-length v1, p2

    iget v2, p0, Ll/֨ܰۡ;->֫:I

    iget v3, p0, Ll/֨ܰۡ;->ۧ:I

    add-int v4, v2, v3

    add-int/2addr v4, v0

    if-ne v1, v4, :cond_9

    .line 73
    new-array v1, v2, [B

    .line 74
    new-array v3, v3, [B

    new-array v4, v0, [B

    .line 75
    iput-object v4, p0, Ll/֨ܰۡ;->ܳ:[B

    .line 77
    invoke-static {p2, p1, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    iget v2, p0, Ll/֨ܰۡ;->֫:I

    iget v4, p0, Ll/֨ܰۡ;->ۧ:I

    invoke-static {p2, v2, v3, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    iget v2, p0, Ll/֨ܰۡ;->֫:I

    iget v4, p0, Ll/֨ܰۡ;->ۧ:I

    add-int/2addr v2, v4

    iget-object v4, p0, Ll/֨ܰۡ;->ܳ:[B

    invoke-static {p2, v2, v4, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 81
    new-instance p1, Ll/۠ܰۡ;

    invoke-direct {p1, v1}, Ll/۠ܰۡ;-><init>([B)V

    iput-object p1, p0, Ll/֨ܰۡ;->ᩳ:Ll/۠ܰۡ;

    .line 82
    new-instance p1, Ll/ܶܰۡ;

    invoke-direct {p1}, Ll/ܶܰۡ;-><init>()V

    iput-object p1, p0, Ll/֨ܰۡ;->᩷:Ll/ܶܰۡ;

    .line 83
    invoke-virtual {p1, v3}, Ll/ܶܰۡ;->֫([B)V

    return-void

    .line 70
    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string p2, "invalid key generated, cannot decrypt file"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    .line 92
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 35
    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string p2, "input password is empty or null in AES encryptor constructor"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(I[B)V
    .locals 9

    .line 98
    iget-boolean v0, p0, Ll/֨ܰۡ;->᩻:Z

    if-nez v0, :cond_4

    .line 105
    rem-int/lit8 v0, p1, 0x10

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 106
    iput-boolean v1, p0, Ll/֨ܰۡ;->᩻:Z

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_3

    add-int/lit8 v2, v0, 0x10

    if-gt v2, p1, :cond_1

    const/16 v3, 0x10

    goto :goto_1

    :cond_1
    sub-int v3, p1, v0

    .line 113
    :goto_1
    iget v4, p0, Ll/֨ܰۡ;->ۢ:I

    iget-object v5, p0, Ll/֨ܰۡ;->ۜ:[B

    invoke-static {v4, v5}, Ll/֡ܰۡ;->ۧ(I[B)V

    .line 114
    iget-object v4, p0, Ll/֨ܰۡ;->ᩳ:Ll/۠ܰۡ;

    iget-object v6, p0, Ll/֨ܰۡ;->ܿ:[B

    invoke-virtual {v4, v5, v6}, Ll/۠ܰۡ;->֫([B[B)V

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_2

    add-int v5, v0, v4

    .line 117
    aget-byte v7, p2, v5

    aget-byte v8, v6, v4

    xor-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, p2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 120
    :cond_2
    iget-object v4, p0, Ll/֨ܰۡ;->᩷:Ll/ܶܰۡ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    :try_start_0
    iget-object v4, v4, Ll/ܶܰۡ;->ۧ:Ljavax/crypto/Mac;

    invoke-virtual {v4, p2, v0, v3}, Ljavax/crypto/Mac;->update([BII)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    iget v0, p0, Ll/֨ܰۡ;->ۢ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/֨ܰۡ;->ۢ:I

    move v0, v2

    goto :goto_0

    :catch_0
    move-exception p1

    .line 71
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    return-void

    .line 102
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "AES Encryptor is in finished state (A non 16 byte block has already been passed to encryptor)"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()[B
    .locals 1

    .line 159
    iget-object v0, p0, Ll/֨ܰۡ;->ܳ:[B

    return-object v0
.end method

.method public final ۧ()[B
    .locals 4

    .line 152
    iget-object v0, p0, Ll/֨ܰۡ;->᩷:Ll/ܶܰۡ;

    .line 52
    iget-object v0, v0, Ll/ܶܰۡ;->ۧ:Ljavax/crypto/Mac;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    const/16 v1, 0xa

    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 154
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

.method public final ܽ()[B
    .locals 1

    .line 167
    iget-object v0, p0, Ll/֨ܰۡ;->ܺ:[B

    return-object v0
.end method
