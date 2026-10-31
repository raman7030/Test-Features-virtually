.class public final Lcom/amazonaws/auth/AbstractAWSSigner$1;
.super Ljava/lang/ThreadLocal;
.source "AbstractAWSSigner.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 4

    :try_start_0
    const-string v0, "SHA-256"

    .line 67
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 69
    new-instance v1, Lcom/amazonaws/AmazonClientException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to get SHA256 Function"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 50
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    throw v1
.end method
