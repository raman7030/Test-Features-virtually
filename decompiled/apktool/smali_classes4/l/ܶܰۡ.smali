.class public final Ll/ܶܰۡ;
.super Ljava/lang/Object;
.source "14GC"


# instance fields
.field public ֫:I

.field public ۧ:Ljavax/crypto/Mac;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "HmacSHA1"

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    iput-object v0, p0, Ll/ܶܰۡ;->ۧ:Ljavax/crypto/Mac;

    .line 41
    invoke-virtual {v0}, Ljavax/crypto/Mac;->getMacLength()I

    move-result v0

    iput v0, p0, Ll/ܶܰۡ;->֫:I
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 43
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final ֫([B)V
    .locals 3

    .line 61
    :try_start_0
    iget-object v0, p0, Ll/ܶܰۡ;->ۧ:Ljavax/crypto/Mac;

    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "HmacSHA1"

    invoke-direct {v1, p1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 63
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
