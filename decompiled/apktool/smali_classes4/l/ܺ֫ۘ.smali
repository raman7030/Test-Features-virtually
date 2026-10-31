.class public final Ll/ܺ֫ۘ;
.super Ljava/lang/Object;
.source "I9IW"

# interfaces
.implements Ll/֨۟ۖ;


# static fields
.field public static ۧ:Ljava/util/HashMap;


# instance fields
.field public final ֫:Lorg/bouncycastle/crypto/Digest;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ܺ֫ۘ;->ۧ:Ljava/util/HashMap;

    .line 34
    new-instance v1, Ll/ۜ֫ۘ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "SHA-512"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    new-instance v1, Ll/᩷֫ۘ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "SHA256"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    new-instance v1, Ll/ۢ֫ۘ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "MD4"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    new-instance v1, Ll/ۡ֫ۘ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "MD5"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    sget-object v0, Ll/ܺ֫ۘ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ܰۖ;

    if-eqz v0, :cond_0

    .line 71
    invoke-interface {v0}, Ll/᩶ܰۖ;->create()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/bouncycastle/crypto/Digest;

    .line 63
    iput-object p1, p0, Ll/ܺ֫ۘ;->֫:Lorg/bouncycastle/crypto/Digest;

    return-void

    .line 69
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No MessageDigest "

    const-string v2, " defined in BouncyCastle"

    .line 0
    invoke-static {v1, p1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 69
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫([B)V
    .locals 3

    const/4 v0, 0x0

    .line 81
    array-length v1, p1

    iget-object v2, p0, Ll/ܺ֫ۘ;->֫:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v2, p1, v0, v1}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    return-void
.end method

.method public final ֫([BII)V
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ܺ֫ۘ;->֫:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    return-void
.end method

.method public final ֫()[B
    .locals 3

    .line 91
    iget-object v0, p0, Ll/ܺ֫ۘ;->֫:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    new-array v1, v1, [B

    const/4 v2, 0x0

    .line 92
    invoke-interface {v0, v1, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    return-object v1
.end method

.method public final ۧ()I
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ܺ֫ۘ;->֫:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    return v0
.end method

.method public final ܽ()V
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ܺ֫ۘ;->֫:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->reset()V

    return-void
.end method
