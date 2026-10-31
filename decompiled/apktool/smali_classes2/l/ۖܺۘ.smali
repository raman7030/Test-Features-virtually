.class public final Ll/ۖܺۘ;
.super Ljava/lang/Object;
.source "L7X2"

# interfaces
.implements Ll/֫ۢۘ;


# instance fields
.field public ֫:Ll/ܺܺۘ;

.field public ۧ:I

.field public ܽ:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/HashMap;)V
    .locals 1

    .line 39
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "initWithPPKv3Header() not supported"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫([B)V
    .locals 1

    .line 39
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 40
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۖܺۘ;->ܽ:[B

    .line 41
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    iput p1, p0, Ll/ۖܺۘ;->ۧ:I

    .line 42
    new-instance p1, Ll/ܺܺۘ;

    .line 70
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/ۖܺۘ;->֫:Ll/ܺܺۘ;

    return-void
.end method

.method public final ֫(I[B)[B
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p1

    .line 47
    new-array v2, v0, [B

    .line 48
    iget-object v3, v1, Ll/ۖܺۘ;->֫:Ll/ܺܺۘ;

    iget-object v4, v1, Ll/ۖܺۘ;->ܽ:[B

    iget v5, v1, Ll/ۖܺۘ;->ۧ:I

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    const-string v6, "SHA-512"

    .line 506
    invoke-static {v6}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v6

    add-int/lit8 v7, v0, 0x1f

    const/16 v8, 0x20

    .line 508
    div-int/2addr v7, v8

    move-object/from16 v9, p2

    .line 509
    invoke-virtual {v6, v9}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v9

    const/16 v10, 0x40

    new-array v10, v10, [B

    new-array v11, v8, [B

    new-array v8, v8, [B

    const/4 v12, 0x1

    :goto_0
    if-gt v12, v7, :cond_4

    shr-int/lit8 v14, v12, 0x18

    and-int/lit16 v14, v14, 0xff

    int-to-byte v14, v14

    shr-int/lit8 v15, v12, 0x10

    and-int/lit16 v15, v15, 0xff

    int-to-byte v15, v15

    shr-int/lit8 v13, v12, 0x8

    and-int/lit16 v13, v13, 0xff

    int-to-byte v13, v13

    and-int/lit16 v1, v12, 0xff

    int-to-byte v1, v1

    move-object/from16 v16, v2

    const/4 v2, 0x4

    new-array v2, v2, [B

    const/4 v0, 0x0

    aput-byte v14, v2, v0

    const/4 v14, 0x1

    aput-byte v15, v2, v14

    const/4 v14, 0x2

    aput-byte v13, v2, v14

    const/4 v13, 0x3

    aput-byte v1, v2, v13

    .line 522
    invoke-virtual {v6}, Ljava/security/MessageDigest;->reset()V

    .line 523
    invoke-virtual {v6, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 524
    invoke-virtual {v6, v2}, Ljava/security/MessageDigest;->update([B)V

    const/16 v1, 0x40

    .line 525
    invoke-virtual {v6, v10, v0, v1}, Ljava/security/MessageDigest;->digest([BII)I

    .line 527
    invoke-virtual {v3, v9, v10, v11}, Ll/ܺܺۘ;->֫([B[B[B)V

    const/16 v1, 0x20

    .line 528
    invoke-static {v11, v0, v8, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, 0x1

    :goto_1
    if-ge v1, v5, :cond_1

    .line 531
    invoke-virtual {v6}, Ljava/security/MessageDigest;->reset()V

    .line 532
    invoke-virtual {v6, v8}, Ljava/security/MessageDigest;->update([B)V

    const/16 v2, 0x40

    .line 533
    invoke-virtual {v6, v10, v0, v2}, Ljava/security/MessageDigest;->digest([BII)I

    .line 535
    invoke-virtual {v3, v9, v10, v8}, Ll/ܺܺۘ;->֫([B[B[B)V

    const/4 v2, 0x0

    :goto_2
    const/16 v13, 0x20

    if-ge v2, v13, :cond_0

    .line 538
    aget-byte v13, v11, v2

    aget-byte v14, v8, v2

    xor-int/2addr v13, v14

    int-to-byte v13, v13

    aput-byte v13, v11, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    const/16 v1, 0x20

    :goto_3
    if-ge v0, v1, :cond_3

    mul-int v2, v0, v7

    add-int/lit8 v13, v12, -0x1

    add-int/2addr v13, v2

    move/from16 v2, p1

    if-ge v13, v2, :cond_2

    .line 545
    aget-byte v14, v11, v0

    aput-byte v14, v16, v13
    :try_end_0
    .catch Ljava/security/DigestException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    move/from16 v2, p1

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p0

    move v0, v2

    move-object/from16 v2, v16

    goto :goto_0

    :cond_4
    move-object/from16 v16, v2

    return-object v16

    :catch_0
    move-exception v0

    .line 552
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 550
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ۧ([B)V
    .locals 1

    .line 43
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "initWithASN1() not supported"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 43
    throw p1
.end method
