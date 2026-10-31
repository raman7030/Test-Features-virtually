.class public final Ll/֡ܰۡ;
.super Ljava/lang/Object;
.source "D4GL"


# static fields
.field public static final ۢ:[Ljava/nio/charset/Charset;

.field public static final ᩷:[Ljava/nio/charset/Charset;


# instance fields
.field public ֫:Ll/۠ܰۡ;

.field public ۜ:I

.field public ۧ:[B

.field public ܳ:Ll/ܶܰۡ;

.field public final ܽ:Ll/ۛܶܺ;

.field public ܿ:I

.field public ᩳ:[B

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v0, "GBK"

    .line 18
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/nio/charset/Charset;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    sput-object v3, Ll/֡ܰۡ;->ۢ:[Ljava/nio/charset/Charset;

    .line 21
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "UTF-8"

    .line 22
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    const-string v3, "BIG5"

    .line 23
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/nio/charset/Charset;

    aput-object v0, v5, v4

    aput-object v1, v5, v2

    const/4 v0, 0x2

    aput-object v3, v5, v0

    sput-object v5, Ll/֡ܰۡ;->᩷:[Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;[B[BLl/ۛܶܺ;)V
    .locals 10

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 33
    iput v0, p0, Ll/֡ܰۡ;->ۜ:I

    .line 39
    iput-object p5, p0, Ll/֡ܰۡ;->ܽ:Ll/ۛܶܺ;

    const/16 p5, 0x10

    new-array v1, p5, [B

    .line 40
    iput-object v1, p0, Ll/֡ܰۡ;->ᩳ:[B

    new-array v1, p5, [B

    .line 41
    iput-object v1, p0, Ll/֡ܰۡ;->ۧ:[B

    const/4 v1, 0x2

    if-eq p1, v0, :cond_2

    if-eq p1, v1, :cond_1

    const/4 p5, 0x3

    if-ne p1, p5, :cond_0

    const/16 p1, 0x20

    .line 56
    iput p1, p0, Ll/֡ܰۡ;->ܿ:I

    .line 57
    iput p1, p0, Ll/֡ܰۡ;->᩻:I

    goto :goto_0

    .line 60
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid aes key strength"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/16 p1, 0x18

    .line 52
    iput p1, p0, Ll/֡ܰۡ;->ܿ:I

    .line 53
    iput p1, p0, Ll/֡ܰۡ;->᩻:I

    goto :goto_0

    .line 48
    :cond_2
    iput p5, p0, Ll/֡ܰۡ;->ܿ:I

    .line 49
    iput p5, p0, Ll/֡ܰۡ;->᩻:I

    :goto_0
    if-eqz p2, :cond_6

    .line 63
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    .line 68
    iget p1, p0, Ll/֡ܰۡ;->ܿ:I

    new-array p1, p1, [B

    .line 69
    iget p5, p0, Ll/֡ܰۡ;->᩻:I

    new-array p5, p5, [B

    new-array v0, v1, [B

    .line 72
    invoke-static {p2}, Ll/֡ܰۡ;->֫(Ljava/lang/String;)[Ljava/nio/charset/Charset;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_5

    aget-object v6, v2, v5

    .line 73
    invoke-virtual {p2, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v6

    .line 124
    :try_start_0
    new-instance v7, Ll/᩹ܰۡ;

    invoke-direct {v7, p3}, Ll/᩹ܰۡ;-><init>([B)V

    .line 125
    new-instance v8, Ll/᩸ܰۡ;

    invoke-direct {v8, v7}, Ll/᩸ܰۡ;-><init>(Ll/᩹ܰۡ;)V

    .line 126
    iget v7, p0, Ll/֡ܰۡ;->ܿ:I

    iget v9, p0, Ll/֡ܰۡ;->᩻:I

    add-int/2addr v7, v9

    add-int/2addr v7, v1

    invoke-virtual {v8, v7, v6}, Ll/᩸ܰۡ;->֫(I[B)[B

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    array-length v7, v6

    iget v8, p0, Ll/֡ܰۡ;->ܿ:I

    iget v9, p0, Ll/֡ܰۡ;->᩻:I

    add-int/2addr v8, v9

    add-int/lit8 v9, v8, 0x2

    if-eq v7, v9, :cond_3

    goto :goto_2

    .line 78
    :cond_3
    invoke-static {v6, v8, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    invoke-static {p4, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 80
    iget p2, p0, Ll/֡ܰۡ;->ܿ:I

    invoke-static {v6, v4, p1, v4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 81
    iget p2, p0, Ll/֡ܰۡ;->ܿ:I

    iget p3, p0, Ll/֡ܰۡ;->᩻:I

    invoke-static {v6, p2, p5, v4, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    new-instance p2, Ll/۠ܰۡ;

    invoke-direct {p2, p1}, Ll/۠ܰۡ;-><init>([B)V

    iput-object p2, p0, Ll/֡ܰۡ;->֫:Ll/۠ܰۡ;

    .line 92
    new-instance p1, Ll/ܶܰۡ;

    invoke-direct {p1}, Ll/ܶܰۡ;-><init>()V

    iput-object p1, p0, Ll/֡ܰۡ;->ܳ:Ll/ܶܰۡ;

    .line 93
    invoke-virtual {p1, p5}, Ll/ܶܰۡ;->֫([B)V

    return-void

    :cond_4
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 128
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 88
    :cond_5
    iget-object p1, p0, Ll/֡ܰۡ;->ܽ:Ll/ۛܶܺ;

    invoke-interface {p1}, Ll/ۛܶܺ;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘܰۡ;

    throw p1

    .line 64
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Empty or null password provided for AES Decryptor"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;)[Ljava/nio/charset/Charset;
    .locals 4

    .line 156
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 157
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x20

    if-lt v2, v3, :cond_1

    const/16 v3, 0x7e

    if-le v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 159
    :cond_1
    :goto_1
    sget-object p0, Ll/֡ܰۡ;->᩷:[Ljava/nio/charset/Charset;

    return-object p0

    .line 162
    :cond_2
    sget-object p0, Ll/֡ܰۡ;->ۢ:[Ljava/nio/charset/Charset;

    return-object p0
.end method

.method public static ۧ(I[B)V
    .locals 3

    int-to-byte v0, p0

    const/4 v1, 0x0

    .line 137
    aput-byte v0, p1, v1

    shr-int/lit8 v0, p0, 0x8

    int-to-byte v0, v0

    const/4 v2, 0x1

    .line 138
    aput-byte v0, p1, v2

    shr-int/lit8 v0, p0, 0x10

    int-to-byte v0, v0

    const/4 v2, 0x2

    .line 139
    aput-byte v0, p1, v2

    shr-int/lit8 p0, p0, 0x18

    int-to-byte p0, p0

    const/4 v0, 0x3

    .line 140
    aput-byte p0, p1, v0

    const/4 p0, 0x4

    .line 141
    aput-byte v1, p1, p0

    const/4 p0, 0x5

    .line 142
    aput-byte v1, p1, p0

    const/4 p0, 0x6

    .line 143
    aput-byte v1, p1, p0

    const/4 p0, 0x7

    .line 144
    aput-byte v1, p1, p0

    const/16 p0, 0x8

    .line 145
    aput-byte v1, p1, p0

    const/16 p0, 0x9

    .line 146
    aput-byte v1, p1, p0

    const/16 p0, 0xa

    .line 147
    aput-byte v1, p1, p0

    const/16 p0, 0xb

    .line 148
    aput-byte v1, p1, p0

    const/16 p0, 0xc

    .line 149
    aput-byte v1, p1, p0

    const/16 p0, 0xd

    .line 150
    aput-byte v1, p1, p0

    const/16 p0, 0xe

    .line 151
    aput-byte v1, p1, p0

    const/16 p0, 0xf

    .line 152
    aput-byte v1, p1, p0

    return-void
.end method


# virtual methods
.method public final ֫(I[B)V
    .locals 9

    .line 97
    iget-object v0, p0, Ll/֡ܰۡ;->ۧ:[B

    iget-object v1, p0, Ll/֡ܰۡ;->ᩳ:[B

    iget-object v2, p0, Ll/֡ܰۡ;->֫:Ll/۠ܰۡ;

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_2

    add-int/lit8 v3, v2, 0x10

    if-gt v3, p1, :cond_0

    const/16 v4, 0x10

    goto :goto_1

    :cond_0
    sub-int v4, p1, v2

    .line 105
    :goto_1
    :try_start_0
    iget-object v5, p0, Ll/֡ܰۡ;->ܳ:Ll/ܶܰۡ;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 69
    :try_start_1
    iget-object v5, v5, Ll/ܶܰۡ;->ۧ:Ljavax/crypto/Mac;

    invoke-virtual {v5, p2, v2, v4}, Ljavax/crypto/Mac;->update([BII)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 106
    :try_start_2
    iget v5, p0, Ll/֡ܰۡ;->ۜ:I

    invoke-static {v5, v1}, Ll/֡ܰۡ;->ۧ(I[B)V

    .line 107
    iget-object v5, p0, Ll/֡ܰۡ;->֫:Ll/۠ܰۡ;

    invoke-virtual {v5, v1, v0}, Ll/۠ܰۡ;->֫([B[B)V

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_1

    add-int v6, v2, v5

    .line 110
    aget-byte v7, p2, v6

    aget-byte v8, v0, v5

    xor-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, p2, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 112
    :cond_1
    iget v2, p0, Ll/֡ܰۡ;->ۜ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/֡ܰۡ;->ۜ:I

    move v2, v3

    goto :goto_0

    :catch_0
    move-exception p1

    .line 71
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    .line 118
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    .line 116
    throw p1

    :cond_2
    return-void

    .line 98
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "AES not initialized properly"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()[B
    .locals 1

    .line 133
    iget-object v0, p0, Ll/֡ܰۡ;->ܳ:Ll/ܶܰۡ;

    .line 52
    iget-object v0, v0, Ll/ܶܰۡ;->ۧ:Ljavax/crypto/Mac;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    return-object v0
.end method
