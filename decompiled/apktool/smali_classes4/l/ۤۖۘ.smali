.class public abstract Ll/ۤۖۘ;
.super Ljava/lang/Object;
.source "K7YO"

# interfaces
.implements Ll/ܳۡۘ;


# instance fields
.field public ֫:Ljava/security/KeyFactory;

.field public ۧ:Ljava/security/Signature;


# direct methods
.method public static ܽ([B)[B
    .locals 4

    const/4 v0, 0x0

    .line 191
    aget-byte v1, p0, v0

    and-int/lit16 v1, v1, 0x80

    if-nez v1, :cond_0

    return-object p0

    .line 193
    :cond_0
    array-length v1, p0

    const/4 v2, 0x1

    add-int/2addr v1, v2

    new-array v1, v1, [B

    .line 194
    array-length v3, p0

    invoke-static {p0, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 195
    invoke-static {p0}, Ll/ܳۘۘ;->֫([B)V

    return-object v1
.end method

.method public static ᩳ([B)[B
    .locals 4

    .line 209
    array-length v0, p0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 213
    :goto_0
    array-length v2, p0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_1

    .line 214
    aget-byte v2, p0, v1

    if-nez v2, :cond_1

    add-int/lit8 v2, v1, 0x1

    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    :goto_1
    return-object p0

    .line 223
    :cond_2
    array-length v2, p0

    sub-int/2addr v2, v1

    new-array v3, v2, [B

    .line 224
    invoke-static {p0, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 225
    invoke-static {p0}, Ll/ܳۘۘ;->֫([B)V

    return-object v3
.end method


# virtual methods
.method public init()V
    .locals 2

    .line 52
    invoke-virtual {p0}, Ll/ۤۖۘ;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ecdsa-sha2-nistp384"

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "SHA384withECDSA"

    goto :goto_0

    :cond_0
    const-string v1, "ecdsa-sha2-nistp521"

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "SHA512withECDSA"

    goto :goto_0

    :cond_1
    const-string v0, "SHA256withECDSA"

    .line 58
    :goto_0
    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    iput-object v0, p0, Ll/ۤۖۘ;->ۧ:Ljava/security/Signature;

    const-string v0, "EC"

    .line 59
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    iput-object v0, p0, Ll/ۤۖۘ;->֫:Ljava/security/KeyFactory;

    return-void
.end method

.method public sign()[B
    .locals 9

    .line 105
    iget-object v0, p0, Ll/ۤۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object v0

    const/4 v1, 0x0

    .line 109
    aget-byte v2, v0, v1

    const/16 v3, 0x30

    if-ne v2, v3, :cond_4

    const/4 v2, 0x1

    aget-byte v3, v0, v2

    add-int/lit8 v4, v3, 0x2

    array-length v5, v0

    const/4 v6, 0x3

    const/4 v7, 0x2

    if-eq v4, v5, :cond_0

    and-int/lit16 v4, v3, 0x80

    if-eqz v4, :cond_4

    aget-byte v4, v0, v7

    and-int/lit16 v4, v4, 0xff

    add-int/2addr v4, v6

    array-length v5, v0

    if-ne v4, v5, :cond_4

    :cond_0
    and-int/lit16 v3, v3, 0x80

    if-eqz v3, :cond_1

    .line 114
    aget-byte v3, v0, v7

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v3, v6

    array-length v4, v0

    if-ne v3, v4, :cond_1

    const/4 v6, 0x4

    .line 117
    :cond_1
    aget-byte v3, v0, v6

    new-array v4, v3, [B

    add-int/lit8 v5, v6, 0x2

    add-int/2addr v5, v3

    .line 118
    aget-byte v5, v0, v5

    new-array v7, v5, [B

    add-int/lit8 v8, v6, 0x1

    .line 119
    invoke-static {v0, v8, v4, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v8, v6, 0x3

    .line 120
    aget-byte v6, v0, v6

    add-int/2addr v8, v6

    invoke-static {v0, v8, v7, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 200
    aget-byte v0, v4, v1

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    sub-int/2addr v3, v2

    .line 202
    new-array v0, v3, [B

    .line 203
    invoke-static {v4, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    invoke-static {v4}, Ll/ܳۘۘ;->֫([B)V

    move-object v4, v0

    .line 200
    :goto_0
    aget-byte v0, v7, v1

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    sub-int/2addr v5, v2

    .line 202
    new-array v0, v5, [B

    .line 203
    invoke-static {v7, v2, v0, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    invoke-static {v7}, Ll/ܳۘۘ;->֫([B)V

    move-object v7, v0

    .line 125
    :goto_1
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0}, Ll/ܺ᩻ۘ;-><init>()V

    .line 126
    invoke-virtual {v0, v4}, Ll/ܺ᩻ۘ;->ܽ([B)V

    .line 127
    invoke-virtual {v0, v7}, Ll/ܺ᩻ۘ;->ܽ([B)V

    .line 129
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ᩳ()I

    move-result v1

    new-array v1, v1, [B

    .line 130
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ۖ()V

    .line 131
    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->֫([B)V

    return-object v1

    :cond_4
    return-object v0
.end method

.method public verify([B)Z
    .locals 10

    const/4 v0, 0x0

    .line 147
    aget-byte v1, p1, v0

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/16 v5, 0x30

    if-ne v1, v5, :cond_0

    aget-byte v1, p1, v3

    add-int/lit8 v6, v1, 0x2

    array-length v7, p1

    if-eq v6, v7, :cond_2

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_0

    aget-byte v1, p1, v4

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v1, v2

    array-length v6, p1

    if-eq v1, v6, :cond_2

    .line 150
    :cond_0
    new-instance v1, Ll/ܺ᩻ۘ;

    invoke-direct {v1, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 152
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 153
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 155
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    .line 156
    invoke-virtual {v1}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object v1

    .line 158
    invoke-static {p1}, Ll/ۤۖۘ;->ܽ([B)[B

    move-result-object p1

    invoke-static {p1}, Ll/ۤۖۘ;->ᩳ([B)[B

    move-result-object p1

    .line 159
    invoke-static {v1}, Ll/ۤۖۘ;->ܽ([B)[B

    move-result-object v1

    invoke-static {v1}, Ll/ۤۖۘ;->ᩳ([B)[B

    move-result-object v1

    .line 162
    array-length v6, p1

    const/16 v7, 0x40

    const/4 v8, 0x5

    const/4 v9, 0x4

    if-ge v6, v7, :cond_1

    .line 163
    array-length v6, p1

    add-int/lit8 v6, v6, 0x6

    array-length v7, v1

    add-int/2addr v6, v7

    new-array v6, v6, [B

    .line 164
    aput-byte v5, v6, v0

    .line 165
    array-length v5, p1

    add-int/2addr v5, v9

    array-length v7, v1

    add-int/2addr v5, v7

    int-to-byte v5, v5

    aput-byte v5, v6, v3

    .line 166
    aput-byte v4, v6, v4

    .line 167
    array-length v3, p1

    int-to-byte v3, v3

    aput-byte v3, v6, v2

    .line 168
    array-length v2, p1

    invoke-static {p1, v0, v6, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 169
    array-length v2, p1

    add-int/2addr v2, v9

    aput-byte v4, v6, v2

    .line 170
    array-length v2, p1

    add-int/2addr v2, v8

    array-length v3, v1

    int-to-byte v3, v3

    aput-byte v3, v6, v2

    .line 171
    array-length p1, p1

    add-int/lit8 p1, p1, 0x6

    array-length v2, v1

    invoke-static {v1, v0, v6, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 173
    :cond_1
    array-length v6, p1

    add-int/lit8 v6, v6, 0x6

    array-length v7, v1

    add-int/2addr v6, v7

    add-int/2addr v6, v3

    new-array v6, v6, [B

    .line 174
    aput-byte v5, v6, v0

    const/16 v5, -0x7f

    .line 175
    aput-byte v5, v6, v3

    .line 176
    array-length v3, p1

    add-int/2addr v3, v9

    array-length v5, v1

    add-int/2addr v3, v5

    int-to-byte v3, v3

    aput-byte v3, v6, v4

    .line 177
    aput-byte v4, v6, v2

    .line 178
    array-length v2, p1

    int-to-byte v2, v2

    aput-byte v2, v6, v9

    .line 179
    array-length v2, p1

    invoke-static {p1, v0, v6, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 180
    array-length v2, p1

    add-int/2addr v2, v8

    aput-byte v4, v6, v2

    .line 181
    array-length v2, p1

    add-int/lit8 v2, v2, 0x6

    array-length v3, v1

    int-to-byte v3, v3

    aput-byte v3, v6, v2

    .line 182
    array-length p1, p1

    add-int/lit8 p1, p1, 0x7

    array-length v2, v1

    invoke-static {v1, v0, v6, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    move-object p1, v6

    .line 187
    :cond_2
    iget-object v0, p0, Ll/ۤۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {v0, p1}, Ljava/security/Signature;->verify([B)Z

    move-result p1

    return p1
.end method

.method public abstract ֫()Ljava/lang/String;
.end method

.method public ֫([B)V
    .locals 3

    .line 87
    invoke-static {p1}, Ll/ۤۖۘ;->ܽ([B)[B

    move-result-object p1

    .line 90
    array-length v0, p1

    const/16 v1, 0x40

    if-lt v0, v1, :cond_0

    const-string v0, "secp521r1"

    goto :goto_0

    .line 92
    :cond_0
    array-length v0, p1

    const/16 v1, 0x30

    if-lt v0, v1, :cond_1

    const-string v0, "secp384r1"

    goto :goto_0

    :cond_1
    const-string v0, "secp256r1"

    :goto_0
    const-string v1, "EC"

    .line 95
    invoke-static {v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v1

    .line 96
    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    invoke-direct {v2, v0}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 97
    const-class v0, Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v1, v0}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v0

    check-cast v0, Ljava/security/spec/ECParameterSpec;

    .line 98
    new-instance v1, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 99
    iget-object p1, p0, Ll/ۤۖۘ;->֫:Ljava/security/KeyFactory;

    new-instance v2, Ljava/security/spec/ECPrivateKeySpec;

    invoke-direct {v2, v1, v0}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    invoke-virtual {p1, v2}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p1

    .line 100
    iget-object v0, p0, Ll/ۤۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {v0, p1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    return-void
.end method

.method public ֫([B[B)V
    .locals 4

    .line 66
    invoke-static {p1}, Ll/ۤۖۘ;->ܽ([B)[B

    move-result-object p1

    .line 67
    invoke-static {p2}, Ll/ۤۖۘ;->ܽ([B)[B

    move-result-object p2

    .line 70
    array-length v0, p1

    const/16 v1, 0x40

    if-lt v0, v1, :cond_0

    const-string v0, "secp521r1"

    goto :goto_0

    .line 72
    :cond_0
    array-length v0, p1

    const/16 v1, 0x30

    if-lt v0, v1, :cond_1

    const-string v0, "secp384r1"

    goto :goto_0

    :cond_1
    const-string v0, "secp256r1"

    :goto_0
    const-string v1, "EC"

    .line 75
    invoke-static {v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v1

    .line 76
    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    invoke-direct {v2, v0}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 77
    const-class v0, Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v1, v0}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v0

    check-cast v0, Ljava/security/spec/ECParameterSpec;

    .line 78
    new-instance v1, Ljava/security/spec/ECPoint;

    new-instance v2, Ljava/math/BigInteger;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, v3, p2}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {v1, v2, p1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 79
    iget-object p1, p0, Ll/ۤۖۘ;->֫:Ljava/security/KeyFactory;

    new-instance p2, Ljava/security/spec/ECPublicKeySpec;

    invoke-direct {p2, v1, v0}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    invoke-virtual {p1, p2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    .line 80
    iget-object p2, p0, Ll/ۤۖۘ;->ۧ:Ljava/security/Signature;

    invoke-virtual {p2, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    return-void
.end method
