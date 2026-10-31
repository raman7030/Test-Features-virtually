.class public abstract Ll/ۛܺۘ;
.super Ljava/lang/Object;
.source "BAEU"

# interfaces
.implements Ll/֨ۢۘ;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:I

.field public ܽ:Z

.field public final ܿ:[B

.field public ᩳ:Ljavax/crypto/Mac;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 60
    iput-object v0, p0, Ll/ۛܺۘ;->ܿ:[B

    return-void
.end method


# virtual methods
.method public init([B)V
    .locals 3

    .line 50
    array-length v0, p1

    iget v1, p0, Ll/ۛܺۘ;->ۧ:I

    if-le v0, v1, :cond_0

    .line 51
    new-array v0, v1, [B

    const/4 v2, 0x0

    .line 52
    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v0

    .line 55
    :cond_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v1, p0, Ll/ۛܺۘ;->֫:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 56
    iget-object p1, p0, Ll/ۛܺۘ;->֫:Ljava/lang/String;

    invoke-static {p1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p1

    iput-object p1, p0, Ll/ۛܺۘ;->ᩳ:Ljavax/crypto/Mac;

    .line 57
    invoke-virtual {p1, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    return-void
.end method

.method public ֫(I)V
    .locals 3

    ushr-int/lit8 v0, p1, 0x18

    int-to-byte v0, v0

    .line 64
    iget-object v1, p0, Ll/ۛܺۘ;->ܿ:[B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    ushr-int/lit8 v0, p1, 0x10

    int-to-byte v0, v0

    const/4 v2, 0x1

    .line 65
    aput-byte v0, v1, v2

    ushr-int/lit8 v0, p1, 0x8

    int-to-byte v0, v0

    const/4 v2, 0x2

    .line 66
    aput-byte v0, v1, v2

    const/4 v0, 0x3

    int-to-byte p1, p1

    .line 67
    aput-byte p1, v1, v0

    const/4 p1, 0x4

    .line 68
    invoke-virtual {p0, p1, v1}, Ll/ۛܺۘ;->֫(I[B)V

    return-void
.end method

.method public ֫(I[B)V
    .locals 2

    const/4 v0, 0x0

    .line 73
    iget-object v1, p0, Ll/ۛܺۘ;->ᩳ:Ljavax/crypto/Mac;

    invoke-virtual {v1, p2, v0, p1}, Ljavax/crypto/Mac;->update([BII)V

    return-void
.end method

.method public ۧ(I[B)V
    .locals 1

    .line 79
    :try_start_0
    iget-object v0, p0, Ll/ۛܺۘ;->ᩳ:Ljavax/crypto/Mac;

    invoke-virtual {v0, p2, p1}, Ljavax/crypto/Mac;->doFinal([BI)V
    :try_end_0
    .catch Ljavax/crypto/ShortBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 81
    :catch_0
    invoke-static {}, Ll/᩶᩷ۘ;->ᩳ()Ll/ۚۢۘ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
