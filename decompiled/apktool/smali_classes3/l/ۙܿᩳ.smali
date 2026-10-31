.class public final Ll/ۙܿᩳ;
.super Ll/۬ܿᩳ;
.source "95DK"


# instance fields
.field public ܽ:[B

.field public ܿ:[B

.field public final ᩳ:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ll/۬ܿᩳ;-><init>()V

    .line 19
    iput-object p1, p0, Ll/ۙܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;[B[B)Ll/ܶ᩵ܿ;
    .locals 5

    .line 66
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 67
    invoke-virtual {v0, p2}, Ljava/util/zip/CRC32;->update([B)V

    .line 68
    invoke-virtual {v0, p3}, Ljava/util/zip/CRC32;->update([B)V

    .line 69
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 70
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 71
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".key"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    const/4 v2, 0x1

    .line 73
    :goto_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x28

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ").key"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    .line 77
    :try_start_0
    new-instance p1, Ljava/io/DataOutputStream;

    const/4 v2, 0x0

    .line 446
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v2

    .line 77
    invoke-direct {p1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const p0, -0x532ddc55

    .line 78
    :try_start_1
    invoke-virtual {p1, p0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 79
    array-length p0, p2

    invoke-virtual {p1, p0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 80
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 81
    array-length p0, p3

    invoke-virtual {p1, p0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 82
    invoke-virtual {p1, p3}, Ljava/io/OutputStream;->write([B)V

    .line 83
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-object v1

    :catchall_0
    move-exception p0

    move-object v4, p1

    move-object p1, p0

    move-object p0, v4

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_1
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 86
    throw p1
.end method


# virtual methods
.method public final ֡()V
    .locals 1

    const/4 v0, 0x0

    .line 61
    iput-object v0, p0, Ll/ۙܿᩳ;->ܽ:[B

    .line 62
    iput-object v0, p0, Ll/ۙܿᩳ;->ܿ:[B

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, ".key"

    .line 107
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۙܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 108
    invoke-static {v0, p1}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۙܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ۙܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۚ()V
    .locals 8

    .line 42
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 43
    new-instance v1, Ljava/io/DataInputStream;

    iget-object v2, p0, Ll/ۙܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 44
    :try_start_0
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v4, -0x532ddc55

    const-string v5, "Bad file: "

    if-ne v3, v4, :cond_1

    .line 47
    :try_start_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    new-array v3, v3, [B

    iput-object v3, p0, Ll/ۙܿᩳ;->ܽ:[B

    .line 48
    invoke-virtual {v1, v3}, Ljava/io/DataInputStream;->readFully([B)V

    .line 49
    iget-object v3, p0, Ll/ۙܿᩳ;->ܽ:[B

    invoke-virtual {v0, v3}, Ljava/util/zip/CRC32;->update([B)V

    .line 51
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    new-array v3, v3, [B

    iput-object v3, p0, Ll/ۙܿᩳ;->ܿ:[B

    .line 52
    invoke-virtual {v1, v3}, Ljava/io/DataInputStream;->readFully([B)V

    .line 53
    iget-object v3, p0, Ll/ۙܿᩳ;->ܿ:[B

    invoke-virtual {v0, v3}, Ljava/util/zip/CRC32;->update([B)V

    .line 54
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v0, v3, v6

    if-nez v0, :cond_0

    .line 56
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-void

    .line 55
    :cond_0
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    .line 43
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
.end method

.method public final ۜ()[B
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ۙܿᩳ;->ܽ:[B

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p0}, Ll/ۙܿᩳ;->ۚ()V

    .line 31
    :cond_0
    iget-object v0, p0, Ll/ۙܿᩳ;->ܽ:[B

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۙܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    .line 113
    iget-object v0, p0, Ll/ۙܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫()Z

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۙܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ۙܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 1

    .line 123
    invoke-virtual {p0}, Ll/ۙܿᩳ;->ۚ()V

    .line 124
    invoke-virtual {p0}, Ll/ۙܿᩳ;->֡()V

    .line 125
    iget-object v0, p0, Ll/ۙܿᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()[B
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ۙܿᩳ;->ܿ:[B

    if-nez v0, :cond_0

    .line 37
    invoke-virtual {p0}, Ll/ۙܿᩳ;->ۚ()V

    .line 38
    :cond_0
    iget-object v0, p0, Ll/ۙܿᩳ;->ܿ:[B

    return-object v0
.end method
