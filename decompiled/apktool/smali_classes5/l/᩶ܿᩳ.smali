.class public final Ll/᩶ܿᩳ;
.super Ll/۬ܿᩳ;
.source "C5CA"


# instance fields
.field public ܽ:[B

.field public ܿ:[B

.field public final ᩳ:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ll/۬ܿᩳ;-><init>()V

    .line 26
    iput-object p1, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    .line 27
    sget-object p1, Ll/۬ܿᩳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p0}, Ll/᩶ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Ll/۬ܿᩳ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/۬ܿᩳ;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 161
    instance-of v0, p0, Ll/᩶ܿᩳ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/᩶ܿᩳ;

    .line 162
    iget-object p0, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    return-object p0

    .line 164
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;[B[BLjava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 4

    .line 88
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 89
    invoke-virtual {v0, p2}, Ljava/util/zip/CRC32;->update([B)V

    .line 90
    invoke-virtual {v0, p3}, Ljava/util/zip/CRC32;->update([B)V

    .line 91
    invoke-static {p4, p2}, Ll/᩶ܿᩳ;->ۧ(Ljava/lang/String;[B)[B

    move-result-object p2

    .line 92
    invoke-static {p4, p3}, Ll/᩶ܿᩳ;->ۧ(Ljava/lang/String;[B)[B

    move-result-object p3

    .line 93
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p4

    if-nez p4, :cond_0

    .line 94
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 95
    :cond_0
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".aes"

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p4

    const/4 v1, 0x1

    .line 97
    :goto_0
    invoke-virtual {p4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 98
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x28

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ").aes"

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p4

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    .line 101
    :try_start_0
    new-instance p1, Ljava/io/DataOutputStream;

    const/4 v1, 0x0

    .line 446
    invoke-virtual {p4, v1}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v1

    .line 101
    invoke-direct {p1, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const p0, -0x532ddc56

    .line 102
    :try_start_1
    invoke-virtual {p1, p0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 103
    array-length p0, p2

    invoke-virtual {p1, p0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 104
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 105
    array-length p0, p3

    invoke-virtual {p1, p0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 106
    invoke-virtual {p1, p3}, Ljava/io/OutputStream;->write([B)V

    .line 107
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-object p4

    :catchall_0
    move-exception p0

    move-object v3, p1

    move-object p1, p0

    move-object p0, v3

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_1
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 110
    throw p1
.end method

.method public static ֫(Ljava/lang/String;[B)[B
    .locals 5

    .line 115
    new-instance v0, Ll/ۡۗ᩻;

    invoke-direct {v0}, Ll/ۡۗ᩻;-><init>()V

    .line 116
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    .line 186
    invoke-virtual {v0, p0}, Ll/ۡۗ᩻;->ۧ([B)V

    .line 187
    invoke-virtual {v0}, Ll/ۡۗ᩻;->֫()[B

    move-result-object p0

    .line 117
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "AES"

    invoke-direct {v1, p0, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const-string v2, "AES/CBC/PKCS5Padding"

    .line 118
    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v4, 0x10

    .line 182
    invoke-virtual {v0, p0, v3, v4}, Ll/ۡۗ᩻;->֫([BII)V

    .line 187
    invoke-virtual {v0}, Ll/ۡۗ᩻;->֫()[B

    move-result-object p0

    .line 120
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v0, p0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 p0, 0x2

    invoke-virtual {v2, p0, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 121
    invoke-virtual {v2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;[B)[B
    .locals 5

    .line 125
    new-instance v0, Ll/ۡۗ᩻;

    invoke-direct {v0}, Ll/ۡۗ᩻;-><init>()V

    .line 126
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    .line 186
    invoke-virtual {v0, p0}, Ll/ۡۗ᩻;->ۧ([B)V

    .line 187
    invoke-virtual {v0}, Ll/ۡۗ᩻;->֫()[B

    move-result-object p0

    .line 127
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "AES"

    invoke-direct {v1, p0, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const-string v2, "AES/CBC/PKCS5Padding"

    .line 128
    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v4, 0x10

    .line 182
    invoke-virtual {v0, p0, v3, v4}, Ll/ۡۗ᩻;->֫([BII)V

    .line 187
    invoke-virtual {v0}, Ll/ۡۗ᩻;->֫()[B

    move-result-object p0

    .line 130
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v0, p0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 p0, 0x1

    invoke-virtual {v2, p0, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 131
    invoke-virtual {v2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֡()V
    .locals 1

    const/4 v0, 0x0

    .line 73
    iput-object v0, p0, Ll/᩶ܿᩳ;->ܽ:[B

    .line 74
    iput-object v0, p0, Ll/᩶ܿᩳ;->ܿ:[B

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, ".aes"

    .line 151
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 152
    invoke-static {v0, p1}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 8

    .line 49
    iget-object v0, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 50
    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :try_start_1
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v4, -0x532ddc56

    const-string v5, "Bad file: "

    if-ne v3, v4, :cond_1

    .line 53
    :try_start_2
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    new-array v3, v3, [B

    .line 54
    invoke-virtual {v2, v3}, Ljava/io/DataInputStream;->readFully([B)V

    .line 55
    iget-object v4, p0, Ll/۬ܿᩳ;->֫:Ljava/lang/String;

    invoke-static {v4, v3}, Ll/᩶ܿᩳ;->֫(Ljava/lang/String;[B)[B

    move-result-object v3

    iput-object v3, p0, Ll/᩶ܿᩳ;->ܽ:[B

    .line 56
    invoke-virtual {v1, v3}, Ljava/util/zip/CRC32;->update([B)V

    .line 58
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    new-array v3, v3, [B

    .line 59
    invoke-virtual {v2, v3}, Ljava/io/DataInputStream;->readFully([B)V

    .line 60
    iget-object v4, p0, Ll/۬ܿᩳ;->֫:Ljava/lang/String;

    invoke-static {v4, v3}, Ll/᩶ܿᩳ;->֫(Ljava/lang/String;[B)[B

    move-result-object v3

    iput-object v3, p0, Ll/᩶ܿᩳ;->ܿ:[B

    .line 61
    invoke-virtual {v1, v3}, Ljava/util/zip/CRC32;->update([B)V

    .line 62
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    invoke-virtual {v2}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    cmp-long v1, v3, v6

    if-nez v1, :cond_0

    .line 64
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    .line 63
    :cond_0
    :try_start_4
    new-instance v1, Ll/֫ۛۡ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 63
    throw v1

    .line 52
    :cond_1
    new-instance v1, Ll/֫ۛۡ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 52
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    .line 50
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 65
    iput-object v1, p0, Ll/۬ܿᩳ;->֫:Ljava/lang/String;

    .line 66
    sget-object v1, Ll/۬ܿᩳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p0}, Ll/᩶ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    throw v0
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 2

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()[B
    .locals 1

    .line 79
    iget-object v0, p0, Ll/᩶ܿᩳ;->ܽ:[B

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    .line 157
    iget-object v0, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫()Z

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 4

    .line 175
    iget-object v0, p0, Ll/᩶ܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v1

    .line 176
    new-instance v2, Ljava/io/DataInputStream;

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v2, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    const v3, -0x532ddc56

    if-ne v2, v3, :cond_0

    return-object v1

    .line 177
    :cond_0
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bad file: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ᩴ()Z
    .locals 2

    .line 37
    iget-object v0, p0, Ll/۬ܿᩳ;->֫:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 40
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/᩶ܿᩳ;->֫()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    return v0

    :catch_0
    return v1
.end method

.method public final ᩷()[B
    .locals 1

    .line 84
    iget-object v0, p0, Ll/᩶ܿᩳ;->ܿ:[B

    return-object v0
.end method
