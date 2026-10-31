.class public Lorg/bouncycastle/crypto/util/JournalingSecureRandom;
.super Ljava/security/SecureRandom;


# static fields
.field public static EMPTY_TRANSCRIPT:[B


# instance fields
.field public final base:Ljava/security/SecureRandom;

.field public index:I

.field public tOut:Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

.field public transcript:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 0
    sput-object v0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->EMPTY_TRANSCRIPT:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-static {}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;-><init>(Ljava/security/SecureRandom;)V

    return-void
.end method

.method public constructor <init>(Ljava/security/SecureRandom;)V
    .locals 2

    .line 0
    invoke-direct {p0}, Ljava/security/SecureRandom;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;-><init>(Lorg/bouncycastle/crypto/util/JournalingSecureRandom$1;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->tOut:Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->index:I

    iput-object p1, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->base:Ljava/security/SecureRandom;

    sget-object p1, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->EMPTY_TRANSCRIPT:[B

    iput-object p1, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->transcript:[B

    return-void
.end method

.method public constructor <init>([BLjava/security/SecureRandom;)V
    .locals 2

    .line 0
    invoke-direct {p0}, Ljava/security/SecureRandom;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;-><init>(Lorg/bouncycastle/crypto/util/JournalingSecureRandom$1;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->tOut:Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->index:I

    iput-object p2, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->base:Ljava/security/SecureRandom;

    invoke-static {p1}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->transcript:[B

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->transcript:[B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->tOut:Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;->clear()V

    return-void
.end method

.method public getFullTranscript()[B
    .locals 3

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->index:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->transcript:[B

    array-length v2, v1

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->tOut:Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object v0

    return-object v0
.end method

.method public getTranscript()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->tOut:Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public final nextBytes([B)V
    .locals 5

    .line 2
    iget v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->index:I

    .line 4
    iget-object v1, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->transcript:[B

    .line 5
    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 9
    iget-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->base:Ljava/security/SecureRandom;

    .line 12
    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 16
    :goto_0
    array-length v2, p1

    if-eq v1, v2, :cond_1

    .line 20
    iget v2, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->index:I

    .line 22
    iget-object v3, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->transcript:[B

    .line 23
    array-length v4, v3

    if-ge v2, v4, :cond_1

    add-int/lit8 v4, v2, 0x1

    .line 29
    iput v4, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->index:I

    .line 31
    aget-byte v2, v3, v2

    .line 33
    aput-byte v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 37
    :cond_1
    array-length v2, p1

    if-eq v1, v2, :cond_2

    .line 40
    array-length v2, p1

    sub-int/2addr v2, v1

    .line 43
    new-array v3, v2, [B

    .line 45
    iget-object v4, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->base:Ljava/security/SecureRandom;

    .line 48
    invoke-virtual {v4, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 51
    invoke-static {v3, v0, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    :cond_2
    :goto_1
    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->tOut:Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

    .line 56
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 60
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to record transcript: "

    .line 67
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->index:I

    iget-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->transcript:[B

    array-length v0, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->tOut:Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->transcript:[B

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/util/JournalingSecureRandom;->tOut:Lorg/bouncycastle/crypto/util/JournalingSecureRandom$TranscriptStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    return-void
.end method
