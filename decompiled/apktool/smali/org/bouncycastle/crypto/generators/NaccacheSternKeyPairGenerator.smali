.class public Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/AsymmetricCipherKeyPairGenerator;


# static fields
.field public static final ONE:Ljava/math/BigInteger;

.field public static smallPrimes:[I


# instance fields
.field public param:Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x65

    new-array v0, v0, [I

    .line 0
    fill-array-data v0, :array_0

    sput-object v0, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->smallPrimes:[I

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->ONE:Ljava/math/BigInteger;

    return-void

    :array_0
    .array-data 4
        0x3
        0x5
        0x7
        0xb
        0xd
        0x11
        0x13
        0x17
        0x1d
        0x1f
        0x25
        0x29
        0x2b
        0x2f
        0x35
        0x3b
        0x3d
        0x43
        0x47
        0x49
        0x4f
        0x53
        0x59
        0x61
        0x65
        0x67
        0x6b
        0x6d
        0x71
        0x7f
        0x83
        0x89
        0x8b
        0x95
        0x97
        0x9d
        0xa3
        0xa7
        0xad
        0xb3
        0xb5
        0xbf
        0xc1
        0xc5
        0xc7
        0xd3
        0xdf
        0xe3
        0xe5
        0xe9
        0xef
        0xf1
        0xfb
        0x101
        0x107
        0x10d
        0x10f
        0x115
        0x119
        0x11b
        0x125
        0x133
        0x137
        0x139
        0x13d
        0x14b
        0x151
        0x15b
        0x15d
        0x161
        0x167
        0x16f
        0x175
        0x17b
        0x17f
        0x185
        0x18d
        0x191
        0x199
        0x1a3
        0x1a5
        0x1af
        0x1b1
        0x1b7
        0x1bb
        0x1c1
        0x1c9
        0x1cd
        0x1cf
        0x1d3
        0x1df
        0x1e7
        0x1eb
        0x1f3
        0x1f7
        0x1fd
        0x209
        0x20b
        0x21d
        0x223
        0x22d
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static findFirstPrimes(I)Ljava/util/Vector;
    .locals 4

    .line 0
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0, p0}, Ljava/util/Vector;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-eq v1, p0, :cond_0

    sget-object v2, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->smallPrimes:[I

    aget v2, v2, v1

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static generatePrime(IILjava/security/SecureRandom;)Ljava/math/BigInteger;
    .locals 2

    .line 0
    :goto_0
    invoke-static {p0, p1, p2}, Lorg/bouncycastle/util/BigIntegers;->createRandomPrime(IILjava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    if-eq v1, p0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static getInt(Ljava/security/SecureRandom;I)I
    .locals 4

    neg-int v0, p1

    and-int/2addr v0, p1

    const v1, 0x7fffffff

    if-ne v0, p1, :cond_0

    int-to-long v2, p1

    .line 0
    invoke-virtual {p0}, Ljava/util/Random;->nextInt()I

    move-result p0

    and-int/2addr p0, v1

    int-to-long p0, p0

    mul-long v2, v2, p0

    const/16 p0, 0x1f

    shr-long p0, v2, p0

    long-to-int p1, p0

    return p1

    :cond_0
    invoke-virtual {p0}, Ljava/util/Random;->nextInt()I

    move-result v0

    and-int/2addr v0, v1

    rem-int v2, v0, p1

    sub-int/2addr v0, v2

    add-int/lit8 v3, p1, -0x1

    add-int/2addr v3, v0

    if-ltz v3, :cond_0

    return v2
.end method

.method public static permuteList(Ljava/util/Vector;Ljava/security/SecureRandom;)Ljava/util/Vector;
    .locals 5

    .line 0
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    move-result v4

    if-ge v3, v4, :cond_0

    invoke-virtual {p0, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/Vector;->removeElementAt(I)V

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {p1, v3}, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->getInt(Ljava/security/SecureRandom;I)I

    move-result v3

    invoke-virtual {v0, p0, v3}, Ljava/util/Vector;->insertElementAt(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_1
    return-object v0
.end method


# virtual methods
.method public generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;
    .locals 27

    move-object/from16 v0, p0

    .line 4
    iget-object v1, v0, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->param:Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;

    .line 7
    invoke-virtual {v1}, Lorg/bouncycastle/crypto/KeyGenerationParameters;->getStrength()I

    move-result v1

    .line 10
    iget-object v2, v0, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->param:Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;

    .line 13
    invoke-virtual {v2}, Lorg/bouncycastle/crypto/KeyGenerationParameters;->getRandom()Ljava/security/SecureRandom;

    move-result-object v2

    .line 16
    iget-object v3, v0, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->param:Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;

    .line 19
    invoke-virtual {v3}, Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;->getCertainty()I

    move-result v3

    .line 22
    iget-object v4, v0, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->param:Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;

    .line 25
    invoke-virtual {v4}, Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;->isDebug()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 30
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 32
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Fetching first "

    .line 37
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    iget-object v7, v0, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->param:Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;

    .line 42
    invoke-virtual {v7}, Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;->getCntSmallPrimes()I

    move-result v7

    .line 46
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " primes."

    .line 51
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 58
    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 60
    :cond_0
    iget-object v5, v0, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->param:Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;

    .line 63
    invoke-virtual {v5}, Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;->getCntSmallPrimes()I

    move-result v5

    .line 67
    invoke-static {v5}, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->findFirstPrimes(I)Ljava/util/Vector;

    move-result-object v5

    .line 71
    invoke-static {v5, v2}, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->permuteList(Ljava/util/Vector;Ljava/security/SecureRandom;)Ljava/util/Vector;

    move-result-object v10

    .line 74
    sget-object v5, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->ONE:Ljava/math/BigInteger;

    const/4 v6, 0x0

    move-object v7, v5

    .line 79
    :goto_0
    invoke-virtual {v10}, Ljava/util/Vector;->size()I

    move-result v8

    .line 82
    div-int/lit8 v8, v8, 0x2

    if-ge v6, v8, :cond_1

    .line 87
    invoke-virtual {v10, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v8

    .line 90
    check-cast v8, Ljava/math/BigInteger;

    .line 93
    invoke-virtual {v7, v8}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {v10}, Ljava/util/Vector;->size()I

    move-result v6

    .line 103
    div-int/lit8 v6, v6, 0x2

    .line 106
    :goto_1
    invoke-virtual {v10}, Ljava/util/Vector;->size()I

    move-result v8

    if-ge v6, v8, :cond_2

    .line 112
    invoke-virtual {v10, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v8

    .line 115
    check-cast v8, Ljava/math/BigInteger;

    .line 118
    invoke-virtual {v5, v8}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 125
    :cond_2
    invoke-virtual {v7, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v6

    .line 129
    invoke-virtual {v6}, Ljava/math/BigInteger;->bitLength()I

    move-result v8

    sub-int v8, v1, v8

    add-int/lit8 v8, v8, -0x30

    .line 136
    div-int/lit8 v8, v8, 0x2

    const/4 v9, 0x1

    add-int/2addr v8, v9

    .line 141
    invoke-static {v8, v3, v2}, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->generatePrime(IILjava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v11

    .line 145
    invoke-static {v8, v3, v2}, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->generatePrime(IILjava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v8

    if-eqz v4, :cond_3

    .line 150
    sget-object v12, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v13, "generating p and q"

    .line 155
    invoke-virtual {v12, v13}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 158
    :cond_3
    invoke-virtual {v11, v7}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    .line 162
    invoke-virtual {v7, v9}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v7

    .line 166
    invoke-virtual {v8, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    .line 170
    invoke-virtual {v5, v9}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v5

    const-wide/16 v12, 0x0

    :goto_2
    const-wide/16 v14, 0x1

    add-long/2addr v12, v14

    const/16 v9, 0x18

    .line 182
    invoke-static {v9, v3, v2}, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->generatePrime(IILjava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v9

    .line 186
    invoke-virtual {v9, v7}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v14

    .line 189
    sget-object v15, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->ONE:Ljava/math/BigInteger;

    .line 192
    invoke-virtual {v14, v15}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v14

    .line 196
    invoke-virtual {v14, v3}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v15

    if-nez v15, :cond_4

    move-object/from16 v24, v2

    move/from16 v25, v3

    move-object/from16 v18, v5

    move-object/from16 v19, v7

    :goto_3
    move-object v5, v11

    move-object/from16 v26, v8

    move v8, v1

    move-object/from16 v1, v26

    goto/16 :goto_14

    :cond_4
    :goto_4
    const/16 v15, 0x18

    .line 220
    :goto_5
    invoke-static {v15, v3, v2}, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->generatePrime(IILjava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v0

    .line 224
    invoke-virtual {v9, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_5

    goto :goto_5

    .line 231
    :cond_5
    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v15

    move-object/from16 v18, v5

    .line 236
    sget-object v5, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->ONE:Ljava/math/BigInteger;

    .line 239
    invoke-virtual {v15, v5}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v15

    .line 243
    invoke-virtual {v15, v3}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v19

    if-eqz v19, :cond_1b

    move-object/from16 v19, v7

    .line 251
    invoke-virtual {v9, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    .line 255
    invoke-static {v7, v6}, Lorg/bouncycastle/util/BigIntegers;->modOddIsCoprime(Ljava/math/BigInteger;Ljava/math/BigInteger;)Z

    move-result v7

    if-nez v7, :cond_6

    move-object/from16 v24, v2

    move/from16 v25, v3

    goto :goto_3

    .line 274
    :cond_6
    invoke-virtual {v14, v15}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    move-object/from16 v20, v8

    .line 280
    invoke-virtual {v7}, Ljava/math/BigInteger;->bitLength()I

    move-result v8

    if-lt v8, v1, :cond_19

    const-string v8, "needed "

    if-eqz v4, :cond_7

    move-object/from16 v21, v11

    .line 291
    sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v22, v0

    .line 295
    new-instance v0, Ljava/lang/StringBuilder;

    .line 298
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 301
    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v12, " tries to generate p and q."

    .line 306
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 313
    invoke-virtual {v11, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    move-object/from16 v22, v0

    move-object/from16 v21, v11

    .line 319
    :goto_6
    invoke-virtual {v14, v5}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 323
    invoke-virtual {v15, v5}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    .line 327
    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v11

    if-eqz v4, :cond_8

    .line 332
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v5, "generating g"

    .line 337
    invoke-virtual {v0, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_8
    const-wide/16 v12, 0x0

    .line 341
    :goto_7
    new-instance v0, Ljava/util/Vector;

    .line 344
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    const/4 v5, 0x0

    move-object/from16 v23, v15

    .line 350
    :goto_8
    invoke-virtual {v10}, Ljava/util/Vector;->size()I

    move-result v15

    if-eq v5, v15, :cond_a

    .line 356
    invoke-virtual {v10, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v15

    .line 359
    check-cast v15, Ljava/math/BigInteger;

    .line 362
    invoke-virtual {v11, v15}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v15

    const-wide/16 v16, 0x1

    :goto_9
    add-long v12, v12, v16

    move-wide/from16 v18, v12

    .line 370
    invoke-static {v1, v3, v2}, Lorg/bouncycastle/util/BigIntegers;->createRandomPrime(IILjava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v12

    .line 376
    invoke-virtual {v12, v15, v7}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v13

    move-object/from16 v24, v2

    .line 381
    sget-object v2, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->ONE:Ljava/math/BigInteger;

    .line 384
    invoke-virtual {v13, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    move-wide/from16 v12, v18

    move-object/from16 v2, v24

    goto :goto_9

    .line 397
    :cond_9
    invoke-virtual {v0, v12}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    move-wide/from16 v12, v18

    move-object/from16 v2, v24

    goto :goto_8

    :cond_a
    move-object/from16 v24, v2

    const-wide/16 v16, 0x1

    .line 410
    sget-object v2, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->ONE:Ljava/math/BigInteger;

    const/4 v5, 0x0

    .line 414
    :goto_a
    invoke-virtual {v10}, Ljava/util/Vector;->size()I

    move-result v15

    if-ge v5, v15, :cond_b

    .line 420
    invoke-virtual {v0, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v15

    .line 423
    check-cast v15, Ljava/math/BigInteger;

    .line 426
    invoke-virtual {v10, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v0

    .line 429
    move-object/from16 v0, v18

    check-cast v0, Ljava/math/BigInteger;

    .line 432
    invoke-virtual {v6, v0}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 436
    invoke-virtual {v15, v0, v7}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 440
    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 444
    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, v19

    goto :goto_a

    :cond_b
    const/4 v0, 0x0

    .line 452
    :goto_b
    invoke-virtual {v10}, Ljava/util/Vector;->size()I

    move-result v5

    if-ge v0, v5, :cond_e

    .line 458
    invoke-virtual {v10, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v5

    .line 461
    check-cast v5, Ljava/math/BigInteger;

    .line 464
    invoke-virtual {v11, v5}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    .line 468
    invoke-virtual {v2, v5, v7}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    .line 471
    sget-object v15, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->ONE:Ljava/math/BigInteger;

    .line 474
    invoke-virtual {v5, v15}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    if-eqz v4, :cond_c

    .line 481
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 483
    new-instance v15, Ljava/lang/StringBuilder;

    move/from16 v25, v3

    const-string v3, "g has order phi(n)/"

    .line 488
    invoke-direct {v15, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 491
    invoke-virtual {v10, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    .line 495
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\n g: "

    .line 500
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 506
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 510
    invoke-virtual {v5, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_d

    :cond_c
    move/from16 v25, v3

    goto :goto_d

    :cond_d
    move/from16 v25, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_e
    move/from16 v25, v3

    const-wide/16 v18, 0x4

    .line 526
    invoke-static/range {v18 .. v19}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    .line 530
    invoke-virtual {v11, v0}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 534
    invoke-virtual {v2, v0, v7}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 537
    sget-object v3, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->ONE:Ljava/math/BigInteger;

    .line 540
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    if-eqz v4, :cond_f

    .line 547
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 549
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "g has order phi(n)/4\n g:"

    .line 554
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_c
    move-object v5, v3

    move-object v3, v0

    move-object/from16 v0, v22

    goto :goto_e

    :cond_f
    :goto_d
    move-object/from16 v0, v22

    goto :goto_f

    .line 568
    :cond_10
    invoke-virtual {v11, v9}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 572
    invoke-virtual {v2, v0, v7}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 576
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    if-eqz v4, :cond_f

    .line 583
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 585
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "g has order phi(n)/p\'\n g: "

    .line 590
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_c

    :cond_11
    move-object/from16 v0, v22

    .line 594
    invoke-virtual {v11, v0}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    .line 598
    invoke-virtual {v2, v5, v7}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    .line 602
    invoke-virtual {v5, v3}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    if-eqz v4, :cond_12

    .line 609
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 611
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v15, "g has order phi(n)/q\'\n g: "

    .line 616
    invoke-direct {v5, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 557
    :goto_e
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 560
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 564
    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_12
    :goto_f
    move-object/from16 v18, v11

    move-object/from16 v5, v21

    move/from16 v21, v1

    :goto_10
    move-object/from16 v1, v20

    goto :goto_12

    :cond_13
    move-object/from16 v5, v21

    .line 622
    invoke-virtual {v11, v5}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v15

    .line 626
    invoke-virtual {v2, v15, v7}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v15

    .line 630
    invoke-virtual {v15, v3}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_15

    if-eqz v4, :cond_14

    .line 637
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 639
    new-instance v15, Ljava/lang/StringBuilder;

    move/from16 v21, v1

    const-string v1, "g has order phi(n)/a\n g: "

    .line 644
    invoke-direct {v15, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 647
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 650
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 654
    invoke-virtual {v3, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_11

    :cond_14
    move/from16 v21, v1

    :goto_11
    move-object/from16 v18, v11

    goto :goto_10

    :cond_15
    move/from16 v21, v1

    move-object/from16 v1, v20

    .line 663
    invoke-virtual {v11, v1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v15

    .line 667
    invoke-virtual {v2, v15, v7}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v15

    .line 671
    invoke-virtual {v15, v3}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_17

    if-eqz v4, :cond_16

    .line 678
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 680
    new-instance v15, Ljava/lang/StringBuilder;

    move-object/from16 v18, v11

    const-string v11, "g has order phi(n)/b\n g: "

    .line 687
    invoke-direct {v15, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 690
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 693
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 697
    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_12

    :cond_16
    move-object/from16 v18, v11

    :goto_12
    move-object/from16 v22, v0

    move-object/from16 v20, v1

    move-object/from16 v11, v18

    move/from16 v1, v21

    move-object/from16 v15, v23

    move-object/from16 v2, v24

    move/from16 v3, v25

    move-object/from16 v21, v5

    goto/16 :goto_7

    :cond_17
    move-object/from16 v18, v11

    if-eqz v4, :cond_18

    .line 715
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 717
    new-instance v4, Ljava/lang/StringBuilder;

    .line 720
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 723
    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " tries to generate g"

    .line 728
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 735
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 737
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 740
    invoke-virtual {v3}, Ljava/io/PrintStream;->println()V

    .line 742
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v4, "found new NaccacheStern cipher variables:"

    .line 747
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 749
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 751
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "smallPrimes: "

    .line 756
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 759
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 762
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 766
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 768
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 770
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "sigma:...... "

    .line 775
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 778
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " ("

    .line 783
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    invoke-virtual {v6}, Ljava/math/BigInteger;->bitLength()I

    move-result v8

    .line 790
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, " bits)"

    .line 795
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 802
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 804
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 806
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "a:.......... "

    .line 811
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 814
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 817
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 821
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 823
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 825
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "b:.......... "

    .line 830
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 833
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 836
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 840
    invoke-virtual {v3, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 842
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 844
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "p\':......... "

    .line 849
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 852
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 855
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 859
    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 861
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 863
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "q\':......... "

    .line 868
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 871
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 874
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 878
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 880
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 882
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "p:.......... "

    .line 887
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 890
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 893
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 897
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 899
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 901
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "q:.......... "

    .line 906
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v3, v23

    .line 911
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 914
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 918
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 920
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 922
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "n:.......... "

    .line 927
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 930
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 933
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 937
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 939
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 941
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "phi(n):..... "

    .line 946
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v3, v18

    .line 949
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 952
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 956
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 958
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 960
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "g:.......... "

    .line 965
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 968
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 971
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 975
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 977
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 980
    invoke-virtual {v0}, Ljava/io/PrintStream;->println()V

    goto :goto_13

    :cond_18
    move-object/from16 v3, v18

    .line 982
    :goto_13
    new-instance v0, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    .line 984
    new-instance v1, Lorg/bouncycastle/crypto/params/NaccacheSternKeyParameters;

    .line 987
    invoke-virtual {v6}, Ljava/math/BigInteger;->bitLength()I

    move-result v4

    const/4 v5, 0x0

    .line 992
    invoke-direct {v1, v5, v2, v7, v4}, Lorg/bouncycastle/crypto/params/NaccacheSternKeyParameters;-><init>(ZLjava/math/BigInteger;Ljava/math/BigInteger;I)V

    .line 994
    new-instance v4, Lorg/bouncycastle/crypto/params/NaccacheSternPrivateKeyParameters;

    .line 997
    invoke-virtual {v6}, Ljava/math/BigInteger;->bitLength()I

    move-result v9

    move-object v6, v4

    move-object v5, v7

    move-object v7, v2

    move-object v8, v5

    move-object v11, v3

    .line 1003
    invoke-direct/range {v6 .. v11}, Lorg/bouncycastle/crypto/params/NaccacheSternPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;ILjava/util/Vector;Ljava/math/BigInteger;)V

    .line 1006
    invoke-direct {v0, v1, v4}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;-><init>(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)V

    return-object v0

    :cond_19
    move/from16 v21, v1

    move-object/from16 v24, v2

    move/from16 v25, v3

    move-object v5, v11

    move-object v3, v15

    move-object/from16 v1, v20

    if-eqz v4, :cond_1a

    .line 1021
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "key size too small. Should be "

    const-string v7, " but is actually "

    move/from16 v8, v21

    .line 0
    invoke-static {v8, v2, v7}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_14

    :cond_1a
    move/from16 v8, v21

    :goto_14
    move-object/from16 v0, p0

    move-object v11, v5

    move-object/from16 v5, v18

    move-object/from16 v7, v19

    move-object/from16 v2, v24

    move/from16 v3, v25

    move/from16 v26, v8

    move-object v8, v1

    move/from16 v1, v26

    goto/16 :goto_2

    :cond_1b
    const-wide/16 v16, 0x1

    move-object/from16 v26, v8

    move v8, v1

    move-object/from16 v1, v26

    move-object/from16 v0, p0

    move-object/from16 v5, v18

    move/from16 v26, v8

    move-object v8, v1

    move/from16 v1, v26

    goto/16 :goto_4
.end method

.method public init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V
    .locals 4

    .line 0
    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;

    iput-object v0, p0, Lorg/bouncycastle/crypto/generators/NaccacheSternKeyPairGenerator;->param:Lorg/bouncycastle/crypto/params/NaccacheSternKeyGenerationParameters;

    new-instance v0, Lorg/bouncycastle/crypto/constraints/DefaultServiceProperties;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/KeyGenerationParameters;->getStrength()I

    move-result v1

    invoke-static {v1}, Lorg/bouncycastle/crypto/constraints/ConstraintUtils;->bitsOfSecurityForFF(I)I

    move-result v1

    sget-object v2, Lorg/bouncycastle/crypto/CryptoServicePurpose;->KEYGEN:Lorg/bouncycastle/crypto/CryptoServicePurpose;

    const-string v3, "NaccacheStern KeyGen"

    invoke-direct {v0, v3, v1, p1, v2}, Lorg/bouncycastle/crypto/constraints/DefaultServiceProperties;-><init>(Ljava/lang/String;ILjava/lang/Object;Lorg/bouncycastle/crypto/CryptoServicePurpose;)V

    invoke-static {v0}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->checkConstraints(Lorg/bouncycastle/crypto/CryptoServiceProperties;)V

    return-void
.end method
