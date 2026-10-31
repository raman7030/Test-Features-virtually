.class public Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/util/Encodable;


# instance fields
.field public final I:[B

.field public final K:[B

.field public final parameter:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

.field public final q:I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;[BI[B)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->parameter:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    iput-object p2, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->I:[B

    iput p3, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->q:I

    iput-object p4, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->K:[B

    return-void
.end method

.method public static getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;
    .locals 4

    .line 2
    instance-of v0, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;

    if-eqz v0, :cond_0

    .line 6
    check-cast p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;

    return-object p0

    .line 9
    :cond_0
    instance-of v0, p0, Ljava/io/DataInputStream;

    if-eqz v0, :cond_1

    .line 13
    check-cast p0, Ljava/io/DataInputStream;

    .line 16
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 20
    invoke-static {v0}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->getParametersForType(I)Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    move-result-object v0

    const/16 v1, 0x10

    new-array v1, v1, [B

    .line 28
    invoke-virtual {p0, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 31
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    .line 35
    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->getN()I

    move-result v3

    .line 38
    new-array v3, v3, [B

    .line 41
    invoke-virtual {p0, v3}, Ljava/io/DataInputStream;->readFully([B)V

    .line 43
    new-instance p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;

    .line 46
    invoke-direct {p0, v0, v1, v2, v3}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;-><init>(Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;[BI[B)V

    return-object p0

    .line 49
    :cond_1
    instance-of v0, p0, [B

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 54
    :try_start_0
    new-instance v1, Ljava/io/DataInputStream;

    .line 56
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 58
    check-cast p0, [B

    .line 61
    invoke-direct {v2, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 64
    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 67
    :try_start_1
    invoke-static {v1}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p0

    :goto_0
    if-eqz v0, :cond_2

    .line 81
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 82
    :cond_2
    throw p0

    .line 84
    :cond_3
    instance-of v0, p0, Ljava/io/InputStream;

    if-eqz v0, :cond_4

    .line 88
    check-cast p0, Ljava/io/InputStream;

    .line 91
    invoke-static {p0}, Lorg/bouncycastle/util/io/Streams;->readAll(Ljava/io/InputStream;)[B

    move-result-object p0

    .line 95
    invoke-static {p0}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;

    move-result-object p0

    return-object p0

    .line 99
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot parse "

    .line 0
    invoke-static {p0, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public createOtsContext(Lorg/bouncycastle/pqc/crypto/lms/LMOtsSignature;)Lorg/bouncycastle/pqc/crypto/lms/LMSContext;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->parameter:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    invoke-static {v0}, Lorg/bouncycastle/pqc/crypto/lms/DigestUtil;->getDigest(Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;)Lorg/bouncycastle/crypto/Digest;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->I:[B

    invoke-static {v1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LmsUtils;->byteArray([BLorg/bouncycastle/crypto/Digest;)V

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->q:I

    invoke-static {v1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LmsUtils;->u32str(ILorg/bouncycastle/crypto/Digest;)V

    const/16 v1, -0x7e7f

    invoke-static {v1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LmsUtils;->u16str(SLorg/bouncycastle/crypto/Digest;)V

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsSignature;->getC()[B

    move-result-object v1

    invoke-static {v1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LmsUtils;->byteArray([BLorg/bouncycastle/crypto/Digest;)V

    new-instance v1, Lorg/bouncycastle/pqc/crypto/lms/LMSContext;

    invoke-direct {v1, p0, p1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LMSContext;-><init>(Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;Ljava/lang/Object;Lorg/bouncycastle/crypto/Digest;)V

    return-object v1
.end method

.method public createOtsContext(Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;)Lorg/bouncycastle/pqc/crypto/lms/LMSContext;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->parameter:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    invoke-static {v0}, Lorg/bouncycastle/pqc/crypto/lms/DigestUtil;->getDigest(Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;)Lorg/bouncycastle/crypto/Digest;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->I:[B

    invoke-static {v1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LmsUtils;->byteArray([BLorg/bouncycastle/crypto/Digest;)V

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->q:I

    invoke-static {v1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LmsUtils;->u32str(ILorg/bouncycastle/crypto/Digest;)V

    const/16 v1, -0x7e7f

    invoke-static {v1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LmsUtils;->u16str(SLorg/bouncycastle/crypto/Digest;)V

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/lms/LMSSignature;->getOtsSignature()Lorg/bouncycastle/pqc/crypto/lms/LMOtsSignature;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsSignature;->getC()[B

    move-result-object v1

    invoke-static {v1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LmsUtils;->byteArray([BLorg/bouncycastle/crypto/Digest;)V

    new-instance v1, Lorg/bouncycastle/pqc/crypto/lms/LMSContext;

    invoke-direct {v1, p0, p1, v0}, Lorg/bouncycastle/pqc/crypto/lms/LMSContext;-><init>(Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;Ljava/lang/Object;Lorg/bouncycastle/crypto/Digest;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->q:I

    iget v3, p1, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->q:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->parameter:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    iget-object v3, p1, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->parameter:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    invoke-static {v2, v3}, Lorg/bouncycastle/util/Objects;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->I:[B

    iget-object v3, p1, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->I:[B

    invoke-static {v2, v3}, Lorg/bouncycastle/util/Arrays;->areEqual([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->K:[B

    iget-object p1, p1, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->K:[B

    invoke-static {v2, p1}, Lorg/bouncycastle/util/Arrays;->areEqual([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public getEncoded()[B
    .locals 2

    .line 0
    invoke-static {}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->compose()Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->parameter:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;->getType()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->u32str(I)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->I:[B

    invoke-virtual {v0, v1}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->bytes([B)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v0

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->q:I

    invoke-virtual {v0, v1}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->u32str(I)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->K:[B

    invoke-virtual {v0, v1}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->bytes([B)Lorg/bouncycastle/pqc/crypto/lms/Composer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/lms/Composer;->build()[B

    move-result-object v0

    return-object v0
.end method

.method public getI()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->I:[B

    return-object v0
.end method

.method public getK()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->K:[B

    return-object v0
.end method

.method public getParameter()Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->parameter:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    return-object v0
.end method

.method public getQ()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->q:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->q:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->parameter:Lorg/bouncycastle/pqc/crypto/lms/LMOtsParameters;

    invoke-static {v1}, Lorg/bouncycastle/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->I:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->hashCode([B)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/lms/LMOtsPublicKey;->K:[B

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
