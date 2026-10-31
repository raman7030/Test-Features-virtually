.class public final Ll/᩸ܺܽ;
.super Ljava/lang/Object;
.source "S135"

# interfaces
.implements Ll/ܶܺܽ;


# instance fields
.field public final ֫:Ljava/security/MessageDigest;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 21
    :try_start_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/᩸ܺܽ;->֫:Ljava/security/MessageDigest;

    return-void

    :catch_0
    move-exception p1

    .line 23
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Ll/᩸ܺܽ;->֫:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩴܺܽ;)V
    .locals 3

    .line 21
    invoke-virtual {p1}, Ll/ᩴܺܽ;->֫()[B

    move-result-object v0

    invoke-virtual {p1}, Ll/ᩴܺܽ;->ۧ()I

    move-result p1

    const/4 v1, 0x0

    .line 29
    iget-object v2, p0, Ll/᩸ܺܽ;->֫:Ljava/security/MessageDigest;

    invoke-virtual {v2, v0, v1, p1}, Ljava/security/MessageDigest;->update([BII)V

    return-void
.end method

.method public final ֫()[B
    .locals 1

    .line 34
    iget-object v0, p0, Ll/᩸ܺܽ;->֫:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    return-object v0
.end method
