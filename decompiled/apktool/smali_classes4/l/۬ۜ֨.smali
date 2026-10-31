.class public final Ll/۬ۜ֨;
.super Ll/ۙۜ֨;
.source "M1T9"


# instance fields
.field public ܳ:Ll/ۚۜ֨;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    new-instance v0, Ll/᩹᩻֨;

    invoke-direct {v0}, Ll/᩹᩻֨;-><init>()V

    invoke-direct {p0, v0}, Ll/ۙۜ֨;-><init>(Ll/ۖۜ֨;)V

    .line 24
    :try_start_0
    new-instance v0, Ll/۠ۜ֨;

    invoke-direct {v0}, Ll/۠ۜ֨;-><init>()V

    iput-object v0, p0, Ll/۬ۜ֨;->ܳ:Ll/ۚۜ֨;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 26
    :catch_0
    new-instance v0, Ll/᩵ۜ֨;

    invoke-direct {v0}, Ll/᩵ۜ֨;-><init>()V

    iput-object v0, p0, Ll/۬ۜ֨;->ܳ:Ll/ۚۜ֨;

    return-void
.end method


# virtual methods
.method public final ֫(JJ)V
    .locals 1

    .line 33
    invoke-super {p0, p1, p2, p3, p4}, Ll/ۙۜ֨;->֫(JJ)V

    const/16 v0, 0x10

    .line 35
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 36
    invoke-virtual {v0, p1, p2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 37
    invoke-virtual {v0, p3, p4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 38
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    iget-object p2, p0, Ll/۬ۜ֨;->ܳ:Ll/ۚۜ֨;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p3, 0x0

    .line 18
    array-length p4, p1

    invoke-virtual {p2, p1, p3, p4}, Ll/ۚۜ֨;->֫([BII)V

    return-void
.end method

.method public final ֫(Ljava/io/InputStream;)V
    .locals 11

    .line 44
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    const/4 v1, 0x0

    .line 45
    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update(I)V

    .line 46
    new-instance v2, Ljava/util/zip/CheckedInputStream;

    invoke-direct {v2, p1, v0}, Ljava/util/zip/CheckedInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Checksum;)V

    .line 52
    invoke-static {v2}, Ll/ܶۜ֨;->֫(Ljava/io/InputStream;)J

    move-result-wide v3

    .line 53
    iget-wide v5, p0, Ll/ۙۜ֨;->ᩳ:J

    cmp-long p1, v3, v5

    if-nez p1, :cond_7

    .line 59
    new-instance p1, Ll/۬ۜ֨;

    invoke-direct {p1}, Ll/۬ۜ֨;-><init>()V

    const-wide/16 v3, 0x0

    .line 60
    :goto_0
    iget-wide v5, p0, Ll/ۙۜ֨;->ᩳ:J

    const-string v7, "XZ Index is corrupt"

    cmp-long v8, v3, v5

    if-gez v8, :cond_1

    .line 61
    invoke-static {v2}, Ll/ܶۜ֨;->֫(Ljava/io/InputStream;)J

    move-result-wide v5

    .line 62
    invoke-static {v2}, Ll/ܶۜ֨;->֫(Ljava/io/InputStream;)J

    move-result-wide v8

    .line 65
    :try_start_0
    invoke-virtual {p1, v5, v6, v8, v9}, Ll/۬ۜ֨;->֫(JJ)V
    :try_end_0
    .catch Ll/ۖۜ֨; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    iget-wide v5, p1, Ll/ۙۜ֨;->֫:J

    iget-wide v8, p0, Ll/ۙۜ֨;->֫:J

    cmp-long v10, v5, v8

    if-gtz v10, :cond_0

    iget-wide v5, p1, Ll/ۙۜ֨;->ܿ:J

    iget-wide v8, p0, Ll/ۙۜ֨;->ܿ:J

    cmp-long v10, v5, v8

    if-gtz v10, :cond_0

    iget-wide v5, p1, Ll/ۙۜ֨;->ۧ:J

    iget-wide v8, p0, Ll/ۙۜ֨;->ۧ:J

    cmp-long v10, v5, v8

    if-gtz v10, :cond_0

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    goto :goto_0

    .line 73
    :cond_0
    new-instance p1, Ll/᩹᩻֨;

    .line 20
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 73
    throw p1

    .line 67
    :catch_0
    new-instance p1, Ll/᩹᩻֨;

    .line 20
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 67
    throw p1

    .line 76
    :cond_1
    iget-wide v3, p1, Ll/ۙۜ֨;->֫:J

    iget-wide v5, p0, Ll/ۙۜ֨;->֫:J

    cmp-long v8, v3, v5

    if-nez v8, :cond_6

    iget-wide v3, p1, Ll/ۙۜ֨;->ܿ:J

    iget-wide v5, p0, Ll/ۙۜ֨;->ܿ:J

    cmp-long v8, v3, v5

    if-nez v8, :cond_6

    iget-wide v3, p1, Ll/ۙۜ֨;->ۧ:J

    iget-wide v5, p0, Ll/ۙۜ֨;->ۧ:J

    cmp-long v8, v3, v5

    if-nez v8, :cond_6

    iget-object p1, p1, Ll/۬ۜ֨;->ܳ:Ll/ۚۜ֨;

    .line 79
    invoke-virtual {p1}, Ll/ۚۜ֨;->֫()[B

    move-result-object p1

    iget-object v3, p0, Ll/۬ۜ֨;->ܳ:Ll/ۚۜ֨;

    invoke-virtual {v3}, Ll/ۚۜ֨;->֫()[B

    move-result-object v3

    invoke-static {p1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 83
    new-instance p1, Ljava/io/DataInputStream;

    invoke-direct {p1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 84
    invoke-virtual {p0}, Ll/ۙۜ֨;->֫()I

    move-result v2

    :goto_1
    if-lez v2, :cond_3

    .line 85
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    .line 86
    :cond_2
    new-instance p1, Ll/᩹᩻֨;

    .line 20
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 86
    throw p1

    .line 89
    :cond_3
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2

    :goto_2
    const/4 v0, 0x4

    if-ge v1, v0, :cond_5

    mul-int/lit8 v0, v1, 0x8

    ushr-long v4, v2, v0

    const-wide/16 v8, 0xff

    and-long/2addr v4, v8

    .line 91
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    int-to-long v8, v0

    cmp-long v0, v4, v8

    if-nez v0, :cond_4

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 92
    :cond_4
    new-instance p1, Ll/᩹᩻֨;

    .line 20
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 92
    throw p1

    :cond_5
    return-void

    .line 80
    :cond_6
    new-instance p1, Ll/᩹᩻֨;

    .line 20
    invoke-direct {p1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 80
    throw p1

    .line 54
    :cond_7
    new-instance p1, Ll/᩹᩻֨;

    const-string v0, "XZ Block Header or the start of XZ Index is corrupt"

    .line 20
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 54
    throw p1
.end method

.method public final ܽ()J
    .locals 6

    .line 31
    iget-wide v0, p0, Ll/ۙۜ֨;->֫:J

    const-wide/16 v2, 0xc

    add-long/2addr v0, v2

    invoke-virtual {p0}, Ll/ۙۜ֨;->ۧ()J

    move-result-wide v4

    add-long/2addr v4, v0

    add-long/2addr v4, v2

    return-wide v4
.end method
