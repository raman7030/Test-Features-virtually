.class public final Ll/ۨ۟᩻;
.super Ljava/lang/Object;
.source "L764"


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p1, p0, Ll/ۨ۟᩻;->ۧ:I

    .line 35
    iput p2, p0, Ll/ۨ۟᩻;->֫:I

    return-void
.end method

.method public static ֫(Ljava/io/RandomAccessFile;)[B
    .locals 5

    .line 97
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x10

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 101
    invoke-virtual {p0, v0}, Ljava/io/RandomAccessFile;->readFully([B)V

    const/4 p0, 0x0

    .line 102
    aget-byte p0, v0, p0

    const/16 v1, 0x7f

    if-ne p0, v1, :cond_0

    const/4 p0, 0x1

    aget-byte p0, v0, p0

    const/16 v1, 0x45

    if-ne p0, v1, :cond_0

    const/4 p0, 0x2

    aget-byte p0, v0, p0

    const/16 v1, 0x4c

    if-ne p0, v1, :cond_0

    const/4 p0, 0x3

    aget-byte p0, v0, p0

    const/16 v1, 0x46

    if-ne p0, v1, :cond_0

    return-object v0

    .line 103
    :cond_0
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 98
    :cond_1
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ()Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "NATIVE_ENTRY_NOT_ELF"

    const-string v1, "ZIP entry is not an Android little-endian ELF file."

    .line 213
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static ܿ(Ljava/lang/String;)V
    .locals 9

    .line 69
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string p0, "r"

    invoke-direct {v0, v1, p0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :try_start_1
    invoke-static {v0}, Ll/ۨ۟᩻;->֫(Ljava/io/RandomAccessFile;)[B

    move-result-object p0

    const/4 v1, 0x4

    .line 71
    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    const/16 v2, 0x40

    const/4 v3, 0x2

    const/16 v4, 0x20

    const/4 v5, 0x1

    if-ne v1, v5, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    if-ne v1, v3, :cond_8

    const/16 v1, 0x40

    :goto_0
    const/4 v6, 0x5

    .line 72
    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    if-eq v6, v5, :cond_1

    if-ne v6, v3, :cond_7

    :cond_1
    const/4 v7, 0x6

    .line 73
    aget-byte p0, p0, v7

    and-int/lit16 p0, p0, 0xff

    if-ne p0, v5, :cond_7

    const/16 p0, 0x34

    if-ne v1, v4, :cond_2

    const/16 v2, 0x34

    :cond_2
    if-ne v1, v4, :cond_3

    const/16 p0, 0x28

    .line 79
    :cond_3
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v4

    int-to-long v7, v2

    cmp-long v1, v4, v7

    if-ltz v1, :cond_6

    int-to-long v4, p0

    .line 82
    invoke-virtual {v0, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 194
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    move-result p0

    .line 195
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v6, v3, :cond_4

    shl-int/lit8 p0, p0, 0x8

    goto :goto_1

    :cond_4
    shl-int/lit8 v1, v1, 0x8

    :goto_1
    or-int/2addr p0, v1

    if-ne p0, v2, :cond_5

    .line 86
    :try_start_2
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    .line 84
    :cond_5
    :try_start_3
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 80
    :cond_6
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 75
    :cond_7
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 183
    :cond_8
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p0

    .line 69
    :try_start_4
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    .line 89
    :catch_0
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    .line 87
    throw p0
.end method

.method public static ᩳ(Ljava/lang/String;)Ll/ۨ۟᩻;
    .locals 10

    .line 42
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string p0, "r"

    invoke-direct {v0, v1, p0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :try_start_1
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v1

    const-wide/16 v3, 0x14

    cmp-long p0, v1, v3

    if-ltz p0, :cond_9

    .line 46
    invoke-static {v0}, Ll/ۨ۟᩻;->֫(Ljava/io/RandomAccessFile;)[B

    move-result-object p0

    const/4 v1, 0x4

    .line 47
    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    const/16 v2, 0x40

    const/16 v3, 0x20

    const/4 v4, 0x1

    if-ne v1, v4, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    if-ne v1, v5, :cond_8

    const/16 v1, 0x40

    :goto_0
    const/4 v5, 0x5

    .line 48
    aget-byte p0, p0, v5

    and-int/lit16 p0, p0, 0xff

    if-ne p0, v4, :cond_7

    const-wide/16 v4, 0x12

    .line 51
    invoke-virtual {v0, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 194
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    move-result p0

    .line 195
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr p0, v4

    const-string v4, "ELF machine/class pair is not supported by native analysis."

    const-string v5, "NATIVE_UNSUPPORTED_ELF"

    const/16 v6, 0x3e

    const/4 v7, 0x3

    const/16 v8, 0xb7

    const/16 v9, 0x28

    if-eq p0, v9, :cond_2

    if-eq p0, v8, :cond_2

    if-eq p0, v7, :cond_2

    if-ne p0, v6, :cond_1

    goto :goto_1

    .line 218
    :cond_1
    :try_start_2
    invoke-static {v5, v4}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 54
    throw p0

    :cond_2
    :goto_1
    if-eq p0, v9, :cond_3

    if-ne p0, v7, :cond_4

    :cond_3
    if-ne v1, v3, :cond_4

    goto :goto_2

    :cond_4
    if-eq p0, v8, :cond_5

    if-ne p0, v6, :cond_6

    :cond_5
    if-ne v1, v2, :cond_6

    .line 57
    :goto_2
    new-instance v2, Ll/ۨ۟᩻;

    invoke-direct {v2, p0, v1}, Ll/ۨ۟᩻;-><init>(II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    :try_start_3
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    return-object v2

    .line 218
    :cond_6
    :try_start_4
    invoke-static {v5, v4}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 209
    throw p0

    .line 49
    :cond_7
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 183
    :cond_8
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 44
    :cond_9
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p0

    .line 42
    :try_start_5
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0

    .line 61
    :catch_0
    invoke-static {}, Ll/ۨ۟᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    .line 59
    throw p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)I
    .locals 3

    const/16 v0, 0x28

    const/16 v1, 0x20

    .line 122
    iget v2, p0, Ll/ۨ۟᩻;->ۧ:I

    if-ne v2, v0, :cond_1

    const-string v0, "thumb"

    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x10

    return p1

    :cond_0
    return v1

    :cond_1
    const/16 p1, 0xb7

    if-eq v2, p1, :cond_4

    const/16 p1, 0x3e

    if-ne v2, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x3

    if-ne v2, p1, :cond_3

    return v1

    .line 131
    :cond_3
    iget p1, p0, Ll/ۨ۟᩻;->֫:I

    return p1

    :cond_4
    :goto_0
    const/16 p1, 0x40

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x3

    .line 112
    iget v1, p0, Ll/ۨ۟᩻;->ۧ:I

    if-eq v1, v0, :cond_1

    const/16 v0, 0x3e

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "arm"

    return-object v0

    :cond_1
    :goto_0
    const-string v0, "x86"

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x28

    .line 145
    iget v1, p0, Ll/ۨ۟᩻;->ۧ:I

    if-ne v1, v0, :cond_1

    const-string v0, "thumb"

    .line 146
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const-string p1, "arm"

    return-object p1

    :cond_1
    const/16 p1, 0xb7

    if-ne v1, p1, :cond_2

    const-string p1, "aarch64"

    return-object p1

    :cond_2
    const/16 p1, 0x3e

    if-ne v1, p1, :cond_3

    const-string p1, "x86_64"

    return-object p1

    :cond_3
    const-string p1, "x86"

    return-object p1
.end method

.method public final ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/16 v0, 0x28

    const-string v1, "fixed32"

    .line 162
    iget v2, p0, Ll/ۨ۟᩻;->ۧ:I

    if-ne v2, v0, :cond_1

    const-string v0, "thumb"

    .line 163
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "mixed16_32"

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    const/16 p1, 0xb7

    if-ne v2, p1, :cond_2

    return-object v1

    :cond_2
    const-string p1, "variable"

    return-object p1
.end method
