.class public final Ll/᩻֫ۘ;
.super Ljava/lang/Object;
.source "L9KD"

# interfaces
.implements Ll/ۚ۟ۖ;


# static fields
.field public static ۧ:Ljava/util/HashMap;


# instance fields
.field public final ֫:Lorg/bouncycastle/crypto/Mac;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 32
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/᩻֫ۘ;->ۧ:Ljava/util/HashMap;

    .line 35
    new-instance v1, Ll/ᩳ֫ۘ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "HMACSHA256"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    new-instance v1, Ll/ܿ֫ۘ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "HMACMD5"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    new-instance v1, Ll/ܳ֫ۘ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "AESCMAC"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    sget-object v0, Ll/᩻֫ۘ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ܰۖ;

    if-eqz v0, :cond_0

    .line 59
    invoke-interface {v0}, Ll/᩶ܰۖ;->create()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/bouncycastle/crypto/Mac;

    iput-object p1, p0, Ll/᩻֫ۘ;->֫:Lorg/bouncycastle/crypto/Mac;

    return-void

    .line 65
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No Mac defined for "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final init([B)V
    .locals 1

    .line 72
    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    iget-object p1, p0, Ll/᩻֫ۘ;->֫:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {p1, v0}, Lorg/bouncycastle/crypto/Mac;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public final update([B)V
    .locals 3

    const/4 v0, 0x0

    .line 82
    array-length v1, p1

    iget-object v2, p0, Ll/᩻֫ۘ;->֫:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v2, p1, v0, v1}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    return-void
.end method

.method public final update([BII)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/᩻֫ۘ;->֫:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    return-void
.end method

.method public final ֫()[B
    .locals 3

    .line 92
    iget-object v0, p0, Ll/᩻֫ۘ;->֫:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v1

    new-array v1, v1, [B

    const/4 v2, 0x0

    .line 93
    invoke-interface {v0, v1, v2}, Lorg/bouncycastle/crypto/Mac;->doFinal([BI)I

    return-object v1
.end method
