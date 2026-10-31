.class public final Ll/۫ܿᩳ;
.super Ll/۬ܿᩳ;
.source "H1VX"


# instance fields
.field public final ܽ:Ll/ܶ᩵ܿ;

.field public final ᩳ:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ll/۬ܿᩳ;-><init>()V

    .line 16
    iput-object p1, p0, Ll/۫ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    .line 17
    iput-object p2, p0, Ll/۫ܿᩳ;->ܽ:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, ".pk8"

    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۫ܿᩳ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v2, ".x509.pem"

    .line 58
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Ll/۫ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v2, p1}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 60
    invoke-static {v1, v0}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    return-object v3

    .line 64
    :cond_0
    invoke-static {v2, p1}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 67
    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۫ܿᩳ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/۫ܿᩳ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()[B
    .locals 1

    .line 27
    iget-object v0, p0, Ll/۫ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/۫ܿᩳ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    .line 75
    iget-object v0, p0, Ll/۫ܿᩳ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫()Z

    .line 76
    iget-object v0, p0, Ll/۫ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫()Z

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/۫ܿᩳ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 2

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    iget-object v1, p0, Ll/۫ܿᩳ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v1

    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".key"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 6

    .line 86
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 87
    invoke-virtual {p0}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v1

    .line 88
    invoke-virtual {p0}, Ll/۬ܿᩳ;->ܺ()Ljava/security/PrivateKey;

    move-result-object v2

    invoke-interface {v2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    .line 89
    new-instance v3, Ljava/util/zip/CRC32;

    invoke-direct {v3}, Ljava/util/zip/CRC32;-><init>()V

    .line 90
    invoke-virtual {v3, v1}, Ljava/util/zip/CRC32;->update([B)V

    .line 91
    invoke-virtual {v3, v2}, Ljava/util/zip/CRC32;->update([B)V

    .line 92
    new-instance v4, Ljava/io/DataOutputStream;

    invoke-direct {v4, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    const v5, -0x532ddc55

    .line 93
    :try_start_0
    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 94
    array-length v5, v1

    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 95
    invoke-virtual {v4, v1}, Ljava/io/OutputStream;->write([B)V

    .line 96
    array-length v1, v2

    invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 97
    invoke-virtual {v4, v2}, Ljava/io/OutputStream;->write([B)V

    .line 98
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    invoke-virtual {v4, v1, v2}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 100
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    .line 92
    :try_start_1
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
.end method

.method public final ᩷()[B
    .locals 1

    .line 32
    iget-object v0, p0, Ll/۫ܿᩳ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    return-object v0
.end method
