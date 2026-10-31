.class public final Ll/᩻᩶ᩳ;
.super Ljava/lang/Object;
.source "56SO"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ljava/io/InputStream;

.field public ۙ:J

.field public final ᩶:[B

.field public ᩸:Z

.field public final ᩹:Ll/۬ۜܽ;


# direct methods
.method public constructor <init>(JLjava/io/InputStream;)V
    .locals 3

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 21
    iput-object v0, p0, Ll/᩻᩶ᩳ;->᩶:[B

    .line 22
    new-instance v1, Ll/۬ۜܽ;

    invoke-direct {v1, v0}, Ll/۬ۜܽ;-><init>([B)V

    iput-object v1, p0, Ll/᩻᩶ᩳ;->᩹:Ll/۬ۜܽ;

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 29
    iput-object p3, p0, Ll/᩻᩶ᩳ;->ۗ:Ljava/io/InputStream;

    .line 30
    iput-wide p1, p0, Ll/᩻᩶ᩳ;->ۙ:J

    return-void

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid legacy record length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private read([BII)I
    .locals 6

    .line 171
    invoke-direct {p0}, Ll/᩻᩶ᩳ;->᩻()V

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 173
    :cond_0
    iget-wide v0, p0, Ll/᩻᩶ᩳ;->ۙ:J

    const-wide/16 v2, 0x0

    const/4 v4, -0x1

    cmp-long v5, v0, v2

    if-nez v5, :cond_1

    return v4

    :cond_1
    int-to-long v2, p3

    .line 174
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    .line 175
    iget-object v0, p0, Ll/᩻᩶ᩳ;->ۗ:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-eq p1, v4, :cond_3

    if-lez p1, :cond_2

    if-gt p1, p3, :cond_2

    .line 178
    iget-wide p2, p0, Ll/᩻᩶ᩳ;->ۙ:J

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Ll/᩻᩶ᩳ;->ۙ:J

    return p1

    .line 177
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Legacy record read made invalid progress"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 176
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Truncated legacy record"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/᩻᩶ᩳ;[BII)I
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ll/᩻᩶ᩳ;->read([BII)I

    move-result p0

    return p0
.end method

.method private ֫(ILl/᩸۬ᩳ;Ljava/lang/Integer;)Ll/ۨ᩹ᩳ;
    .locals 2

    .line 129
    invoke-direct {p0, p1}, Ll/᩻᩶ᩳ;->ᩳ(I)V

    .line 130
    new-instance v0, Ll/᩹᩶ᩳ;

    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 131
    new-instance v1, Ll/ܳ᩶ᩳ;

    invoke-direct {v1, p0, p1}, Ll/ܳ᩶ᩳ;-><init>(Ll/᩻᩶ᩳ;I)V

    iget-object p1, p2, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-static {v1, p1}, Ll/ۨ᩶ᩳ;->֫(Ljava/io/InputStream;Ll/֨۬ᩳ;)Ll/ۨ᩶ᩳ;

    move-result-object p1

    const v1, 0x7fffffff

    .line 132
    :try_start_0
    invoke-static {p1, p2, v1, v0}, Ll/᩶᩶ᩳ;->֫(Ljava/io/Reader;Ll/᩸۬ᩳ;ILl/᩹᩶ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object p2

    .line 133
    invoke-virtual {p2}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/᩹᩶ᩳ;->֫(I)I

    move-result v0

    .line 139
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p3, v0, :cond_0

    .line 135
    invoke-virtual {p1}, Ll/ۨ᩶ᩳ;->close()V

    return-object p2

    .line 139
    :cond_0
    :try_start_1
    new-instance p2, Ll/ۙ᩶ᩳ;

    const-string p3, "Legacy text fast hash changed since state was saved"

    .line 10
    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 139
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p2

    .line 131
    :try_start_2
    invoke-virtual {p1}, Ll/ۨ᩶ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
.end method

.method public static ֫(JLjava/io/InputStream;)Ll/᩻᩶ᩳ;
    .locals 1

    .line 35
    :try_start_0
    new-instance v0, Ll/᩻᩶ᩳ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩻᩶ᩳ;-><init>(JLjava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 37
    :goto_0
    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    :catch_2
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 38
    :goto_1
    throw p0
.end method

.method private ֫(I[B)V
    .locals 2

    .line 183
    invoke-direct {p0, p1}, Ll/᩻᩶ᩳ;->ᩳ(I)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    sub-int v1, p1, v0

    .line 185
    invoke-direct {p0, p2, v0, v1}, Ll/᩻᩶ᩳ;->read([BII)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ᩳ(I)V
    .locals 4

    .line 166
    invoke-direct {p0}, Ll/᩻᩶ᩳ;->᩻()V

    if-ltz p1, :cond_0

    int-to-long v0, p1

    .line 167
    iget-wide v2, p0, Ll/᩻᩶ᩳ;->ۙ:J

    cmp-long p1, v0, v2

    if-gtz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    const-string v0, "Invalid or truncated legacy field length"

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ᩻()V
    .locals 2

    .line 189
    iget-boolean v0, p0, Ll/᩻᩶ᩳ;->᩸:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Legacy record reader is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 193
    iget-boolean v0, p0, Ll/᩻᩶ᩳ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 194
    iput-boolean v0, p0, Ll/᩻᩶ᩳ;->᩸:Z

    .line 195
    iget-object v0, p0, Ll/᩻᩶ᩳ;->ۗ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final readByte()I
    .locals 2

    const/4 v0, 0x1

    .line 46
    iget-object v1, p0, Ll/᩻᩶ᩳ;->᩶:[B

    invoke-direct {p0, v0, v1}, Ll/᩻᩶ᩳ;->֫(I[B)V

    const/4 v0, 0x0

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final readInt()I
    .locals 3

    .line 44
    iget-object v0, p0, Ll/᩻᩶ᩳ;->᩶:[B

    const/4 v1, 0x4

    invoke-direct {p0, v1, v0}, Ll/᩻᩶ᩳ;->֫(I[B)V

    const-wide/16 v0, 0x0

    iget-object v2, p0, Ll/᩻᩶ᩳ;->᩹:Ll/۬ۜܽ;

    invoke-virtual {v2, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    return v0
.end method

.method public final readLong()J
    .locals 3

    .line 45
    iget-object v0, p0, Ll/᩻᩶ᩳ;->᩶:[B

    const/16 v1, 0x8

    invoke-direct {p0, v1, v0}, Ll/᩻᩶ᩳ;->֫(I[B)V

    const-wide/16 v0, 0x0

    iget-object v2, p0, Ll/᩻᩶ᩳ;->᩹:Ll/۬ۜܽ;

    invoke-virtual {v2, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    invoke-virtual {v2}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 9

    .line 77
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v0

    const-wide/16 v1, 0x2

    int-to-long v3, v0

    mul-long v3, v3, v1

    if-ltz v0, :cond_2

    if-ltz p1, :cond_2

    int-to-long v1, p1

    cmp-long p1, v3, v1

    if-gtz p1, :cond_2

    .line 79
    iget-wide v1, p0, Ll/᩻᩶ᩳ;->ۙ:J

    cmp-long p1, v3, v1

    if-gtz p1, :cond_2

    .line 82
    new-array p1, v0, [C

    const-wide/16 v1, 0x2000

    .line 83
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    new-array v1, v2, [B

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 86
    div-int/lit8 v4, v2, 0x2

    sub-int v5, v0, v3

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    mul-int/lit8 v5, v4, 0x2

    .line 87
    invoke-direct {p0, v5, v1}, Ll/᩻᩶ᩳ;->֫(I[B)V

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_0

    add-int v6, v3, v5

    mul-int/lit8 v7, v5, 0x2

    .line 88
    aget-byte v8, v1, v7

    and-int/lit16 v8, v8, 0xff

    add-int/lit8 v7, v7, 0x1

    aget-byte v7, v1, v7

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x8

    or-int/2addr v7, v8

    int-to-char v7, v7

    aput-char v7, p1, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    add-int/2addr v3, v4

    goto :goto_0

    .line 91
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([C)V

    return-object v0

    .line 80
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid raw UTF-16 app string length"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(II)Ljava/lang/String;
    .locals 1

    .line 68
    invoke-direct {p0, p1}, Ll/᩻᩶ᩳ;->ᩳ(I)V

    if-ltz p2, :cond_0

    if-gt p1, p2, :cond_0

    .line 70
    new-array p2, p1, [B

    .line 71
    invoke-direct {p0, p1, p2}, Ll/᩻᩶ᩳ;->֫(I[B)V

    .line 72
    new-instance p1, Ljava/lang/String;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p1, p2, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p1

    .line 69
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Legacy app string exceeds limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩸۬ᩳ;Ll/ۘ᩹ܽ;Ljava/lang/Integer;)Ll/ۨ᩹ᩳ;
    .locals 6

    .line 113
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v0

    const v1, -0x7d8c8e8

    if-eq v0, v1, :cond_0

    .line 114
    invoke-direct {p0, v0, p1, p3}, Ll/᩻᩶ᩳ;->֫(ILl/᩸۬ᩳ;Ljava/lang/Integer;)Ll/ۨ᩹ᩳ;

    move-result-object p1

    return-object p1

    .line 115
    :cond_0
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->readByte()I

    move-result v0

    if-nez v0, :cond_1

    .line 116
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->readInt()I

    move-result p2

    invoke-direct {p0, p2, p1, p3}, Ll/᩻᩶ᩳ;->֫(ILl/᩸۬ᩳ;Ljava/lang/Integer;)Ll/ۨ᩹ᩳ;

    move-result-object p1

    return-object p1

    .line 118
    :cond_1
    iget-object v0, p1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    .line 155
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v1

    .line 156
    invoke-direct {p0, v1}, Ll/᩻᩶ᩳ;->ᩳ(I)V

    const/16 v2, 0x2000

    if-gt v1, v2, :cond_5

    int-to-long v2, v1

    const-wide/16 v4, 0x3

    mul-long v2, v2, v4

    const-wide/16 v4, 0x80

    add-long/2addr v2, v4

    .line 158
    invoke-virtual {v0, v2, v3}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v0

    .line 159
    :try_start_0
    new-array v2, v1, [B

    .line 160
    invoke-direct {p0, v1, v2}, Ll/᩻᩶ᩳ;->֫(I[B)V

    .line 161
    new-instance v1, Ljava/lang/String;

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 162
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    if-eqz p2, :cond_4

    .line 120
    iget-object p2, p2, Ll/ۘ᩹ܽ;->᩹:Ljava/lang/Object;

    check-cast p2, Ll/᩶ۘᩳ;

    invoke-virtual {p2, v1}, Ll/᩶ۘᩳ;->֫(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p2

    iget-object v0, p1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    invoke-static {p2, v0}, Ll/ܺ᩶ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)Ll/ܺ᩶ᩳ;

    move-result-object p2

    .line 121
    :try_start_1
    invoke-virtual {p2}, Ll/ܺ᩶ᩳ;->length()I

    move-result v0

    const v1, 0x7fffffff

    if-gt v0, v1, :cond_3

    .line 122
    invoke-virtual {p2}, Ll/ܺ᩶ᩳ;->֫()I

    move-result v0

    .line 139
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-ne p3, v0, :cond_2

    const/4 p3, 0x0

    .line 16
    invoke-static {p2, p1, v1, p3}, Ll/᩶᩶ᩳ;->֫(Ljava/io/Reader;Ll/᩸۬ᩳ;ILl/᩹᩶ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    invoke-virtual {p2}, Ll/ܺ᩶ᩳ;->close()V

    return-object p1

    .line 139
    :cond_2
    :try_start_2
    new-instance p1, Ll/ۙ᩶ᩳ;

    const-string p3, "Legacy text fast hash changed since state was saved"

    .line 10
    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 139
    throw p1

    .line 121
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p3, "Legacy file exceeds migration coordinate limit"

    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    .line 120
    :try_start_3
    invoke-virtual {p2}, Ll/ܺ᩶ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 119
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Legacy file path resolver is required"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_2
    move-exception p1

    .line 158
    :try_start_4
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    .line 157
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Legacy path field exceeds limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Z
    .locals 1

    .line 48
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->readByte()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۛۧ()I
    .locals 3

    .line 47
    iget-object v0, p0, Ll/᩻᩶ᩳ;->᩶:[B

    const/4 v1, 0x2

    invoke-direct {p0, v1, v0}, Ll/᩻᩶ᩳ;->֫(I[B)V

    const-wide/16 v0, 0x0

    iget-object v2, p0, Ll/᩻᩶ᩳ;->᩹:Ll/۬ۜܽ;

    invoke-virtual {v2, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    invoke-virtual {v2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v0

    return v0
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 4

    if-ltz p1, :cond_2

    .line 97
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x80

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    .line 99
    :goto_0
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->readByte()I

    move-result v1

    if-nez v1, :cond_0

    .line 100
    new-instance p1, Ljava/lang/String;

    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v1

    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v0

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v3, 0x0

    invoke-direct {p1, v1, v3, v0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object p1

    .line 101
    :cond_0
    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v2

    if-eq v2, p1, :cond_1

    .line 102
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_0

    .line 101
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Legacy app string exceeds limit"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 96
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid legacy string limit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()V
    .locals 7

    .line 58
    invoke-direct {p0}, Ll/᩻᩶ᩳ;->᩻()V

    const-wide/16 v0, 0x2000

    .line 59
    iget-wide v2, p0, Ll/᩻᩶ᩳ;->ۙ:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    new-array v0, v1, [B

    .line 60
    :goto_0
    iget-wide v2, p0, Ll/᩻᩶ᩳ;->ۙ:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    int-to-long v4, v1

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v3}, Ll/᩻᩶ᩳ;->read([BII)I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ()J
    .locals 2

    .line 42
    iget-wide v0, p0, Ll/᩻᩶ᩳ;->ۙ:J

    return-wide v0
.end method

.method public final ܽ(I)Ljava/lang/String;
    .locals 1

    .line 64
    invoke-virtual {p0}, Ll/᩻᩶ᩳ;->readInt()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Ll/᩻᩶ᩳ;->֫(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ᩳ()V
    .locals 5

    .line 52
    invoke-direct {p0}, Ll/᩻᩶ᩳ;->᩻()V

    .line 53
    iget-wide v0, p0, Ll/᩻᩶ᩳ;->ۙ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing bytes in legacy record"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
