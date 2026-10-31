.class public final Ll/ۙۖۘ;
.super Ljava/lang/Object;
.source "X7WN"

# interfaces
.implements Ll/ܿۡۘ;


# instance fields
.field public ֫:Ljava/security/KeyFactory;

.field public ۧ:Ljava/security/Signature;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ܽ([B)[B
    .locals 4

    .line 154
    array-length v0, p0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    aget-byte v2, p0, v0

    if-nez v2, :cond_0

    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0x80

    if-nez v2, :cond_0

    .line 155
    array-length v2, p0

    sub-int/2addr v2, v1

    new-array v3, v2, [B

    .line 156
    invoke-static {p0, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 157
    invoke-static {v3}, Ll/ۙۖۘ;->ܽ([B)[B

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final init()V
    .locals 1

    const-string v0, "SHA1withDSA"

    .line 46
    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۖۘ;->ۧ:Ljava/security/Signature;

    const-string v0, "DSA"

    .line 47
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۖۘ;->֫:Ljava/security/KeyFactory;

    return-void
.end method

.method public final sign()[B
    .locals 9

    .line 68
    iget-object v0, p0, Ll/ۙۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object v0

    const/4 v1, 0x3

    .line 77
    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    .line 79
    new-array v2, v1, [B

    const/4 v3, 0x4

    const/4 v4, 0x0

    .line 80
    invoke-static {v0, v3, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v3, v1, 0x5

    add-int/lit8 v5, v1, 0x6

    .line 82
    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    .line 84
    new-array v6, v3, [B

    .line 85
    invoke-static {v0, v5, v6, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v0, 0x28

    new-array v0, v0, [B

    const/16 v5, 0x14

    if-le v1, v5, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    if-le v1, v5, :cond_1

    const/4 v8, 0x0

    goto :goto_1

    :cond_1
    rsub-int/lit8 v8, v1, 0x14

    :goto_1
    if-le v1, v5, :cond_2

    const/16 v1, 0x14

    .line 91
    :cond_2
    invoke-static {v2, v7, v0, v8, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-le v3, v5, :cond_3

    const/4 v4, 0x1

    :cond_3
    if-le v3, v5, :cond_4

    const/16 v1, 0x14

    goto :goto_2

    :cond_4
    rsub-int/lit8 v1, v3, 0x28

    :goto_2
    if-le v3, v5, :cond_5

    const/16 v3, 0x14

    .line 93
    :cond_5
    invoke-static {v6, v4, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public final update([B)V
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۙۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    return-void
.end method

.method public final verify([B)Z
    .locals 10

    .line 112
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 114
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v2

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v2, "ssh-dss"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 115
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    .line 116
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩻()I

    move-result v0

    .line 117
    new-array v3, v1, [B

    .line 118
    invoke-static {p1, v0, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v3

    :cond_0
    const/16 v0, 0x14

    new-array v1, v0, [B

    .line 123
    invoke-static {p1, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 124
    invoke-static {v1}, Ll/ۙۖۘ;->ܽ([B)[B

    move-result-object v1

    new-array v3, v0, [B

    .line 127
    invoke-static {p1, v0, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 128
    invoke-static {v3}, Ll/ۙۖۘ;->ܽ([B)[B

    move-result-object p1

    .line 131
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0x80

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 132
    :goto_0
    aget-byte v4, p1, v2

    and-int/lit16 v4, v4, 0x80

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    .line 134
    :goto_1
    array-length v5, v1

    array-length v6, p1

    add-int/2addr v5, v6

    add-int/lit8 v5, v5, 0x6

    add-int/2addr v5, v0

    add-int/2addr v5, v4

    .line 135
    new-array v5, v5, [B

    const/16 v6, 0x30

    .line 136
    aput-byte v6, v5, v2

    .line 137
    array-length v6, v1

    array-length v7, p1

    add-int/2addr v6, v7

    add-int/lit8 v6, v6, 0x4

    int-to-byte v6, v6

    aput-byte v6, v5, v3

    int-to-byte v7, v0

    add-int/2addr v6, v7

    int-to-byte v6, v6

    .line 138
    aput-byte v6, v5, v3

    int-to-byte v8, v4

    add-int/2addr v6, v8

    int-to-byte v6, v6

    .line 139
    aput-byte v6, v5, v3

    const/4 v3, 0x2

    .line 140
    aput-byte v3, v5, v3

    .line 141
    array-length v6, v1

    int-to-byte v6, v6

    const/4 v9, 0x3

    aput-byte v6, v5, v9

    add-int/2addr v6, v7

    int-to-byte v6, v6

    .line 142
    aput-byte v6, v5, v9

    add-int/lit8 v0, v0, 0x4

    .line 143
    array-length v6, v1

    invoke-static {v1, v2, v5, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 144
    aget-byte v0, v5, v9

    add-int/lit8 v0, v0, 0x4

    aput-byte v3, v5, v0

    .line 145
    aget-byte v0, v5, v9

    add-int/lit8 v0, v0, 0x5

    array-length v1, p1

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 146
    aget-byte v0, v5, v9

    add-int/lit8 v0, v0, 0x5

    aget-byte v1, v5, v0

    add-int/2addr v1, v8

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 147
    aget-byte v0, v5, v9

    add-int/lit8 v0, v0, 0x6

    add-int/2addr v0, v4

    array-length v1, p1

    invoke-static {p1, v2, v5, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 150
    iget-object p1, p0, Ll/ۙۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {p1, v5}, Ljava/security/Signature;->verify([B)Z

    move-result p1

    return p1
.end method

.method public final ֫([B[B[B[B)V
    .locals 2

    .line 60
    new-instance v0, Ljava/security/spec/DSAPrivateKeySpec;

    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, p1}, Ljava/math/BigInteger;-><init>([B)V

    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, p2}, Ljava/math/BigInteger;-><init>([B)V

    new-instance p2, Ljava/math/BigInteger;

    invoke-direct {p2, p3}, Ljava/math/BigInteger;-><init>([B)V

    new-instance p3, Ljava/math/BigInteger;

    invoke-direct {p3, p4}, Ljava/math/BigInteger;-><init>([B)V

    invoke-direct {v0, v1, p1, p2, p3}, Ljava/security/spec/DSAPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 62
    iget-object p1, p0, Ll/ۙۖۘ;->֫:Ljava/security/KeyFactory;

    invoke-virtual {p1, v0}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p1

    .line 63
    iget-object p2, p0, Ll/ۙۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {p2, p1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    return-void
.end method

.method public final ۧ([B[B[B[B)V
    .locals 2

    .line 52
    new-instance v0, Ljava/security/spec/DSAPublicKeySpec;

    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, p1}, Ljava/math/BigInteger;-><init>([B)V

    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, p2}, Ljava/math/BigInteger;-><init>([B)V

    new-instance p2, Ljava/math/BigInteger;

    invoke-direct {p2, p3}, Ljava/math/BigInteger;-><init>([B)V

    new-instance p3, Ljava/math/BigInteger;

    invoke-direct {p3, p4}, Ljava/math/BigInteger;-><init>([B)V

    invoke-direct {v0, v1, p1, p2, p3}, Ljava/security/spec/DSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 54
    iget-object p1, p0, Ll/ۙۖۘ;->֫:Ljava/security/KeyFactory;

    invoke-virtual {p1, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    .line 55
    iget-object p2, p0, Ll/ۙۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {p2, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    return-void
.end method
