.class public final Ll/ܳۤۡ;
.super Ljava/lang/Object;
.source "22T1"


# static fields
.field public static final ֫:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final ۧ:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Ll/ܳۤۡ;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 16
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܳۤۡ;->ۧ:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 186
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object v0

    .line 187
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 189
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    invoke-virtual {v0, v3}, Ljava/security/MessageDigest;->update(B)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 191
    :cond_0
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 1

    .line 195
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object v0

    .line 196
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 197
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫()Ljava/security/MessageDigest;
    .locals 2

    :try_start_0
    const-string v0, "MD5"

    .line 52
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 54
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ֫(Ljava/security/MessageDigest;Ljava/io/InputStream;)V
    .locals 5

    .line 83
    sget-object v0, Ll/ܳۤۡ;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    if-nez v2, :cond_0

    const/16 v2, 0x400

    new-array v2, v2, [B

    .line 89
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x0

    .line 90
    invoke-virtual {p0, v2, v4, v3}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 0
    :cond_1
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 96
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p0

    .line 0
    :cond_3
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_3

    :goto_2
    if-eqz p1, :cond_5

    .line 96
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 100
    :catch_1
    :cond_5
    throw p0
.end method

.method public static ֫(Ljava/security/MessageDigest;Ljava/lang/String;)V
    .locals 5

    .line 126
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 127
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x80

    if-eqz v2, :cond_0

    if-ge v2, v3, :cond_0

    int-to-byte v2, v2

    .line 129
    invoke-virtual {p0, v2}, Ljava/security/MessageDigest;->update(B)V

    goto :goto_1

    :cond_0
    const/16 v4, 0x800

    if-ge v2, v4, :cond_1

    shr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x1f

    or-int/lit16 v4, v4, 0xc0

    int-to-byte v4, v4

    .line 131
    invoke-virtual {p0, v4}, Ljava/security/MessageDigest;->update(B)V

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v3

    int-to-byte v2, v2

    .line 132
    invoke-virtual {p0, v2}, Ljava/security/MessageDigest;->update(B)V

    goto :goto_1

    :cond_1
    shr-int/lit8 v4, v2, 0xc

    and-int/lit8 v4, v4, 0xf

    or-int/lit16 v4, v4, 0xe0

    int-to-byte v4, v4

    .line 134
    invoke-virtual {p0, v4}, Ljava/security/MessageDigest;->update(B)V

    shr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v3

    int-to-byte v4, v4

    .line 135
    invoke-virtual {p0, v4}, Ljava/security/MessageDigest;->update(B)V

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v3

    int-to-byte v2, v2

    .line 136
    invoke-virtual {p0, v2}, Ljava/security/MessageDigest;->update(B)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(Ljava/security/MessageDigest;Ljava/security/MessageDigest;Ljava/io/InputStream;)V
    .locals 5

    .line 104
    sget-object v0, Ll/ܳۤۡ;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    if-nez v2, :cond_0

    const/16 v2, 0x400

    new-array v2, v2, [B

    .line 110
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {p2, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x0

    .line 111
    invoke-virtual {p0, v2, v4, v3}, Ljava/security/MessageDigest;->update([BII)V

    .line 112
    invoke-virtual {p1, v2, v4, v3}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 0
    :cond_1
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 118
    :goto_1
    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p0

    .line 0
    :cond_3
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    :goto_2
    if-eqz p2, :cond_5

    .line 118
    :try_start_2
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 122
    :catch_1
    :cond_5
    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 207
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object v0

    .line 208
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 209
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ([B)Ljava/lang/String;
    .locals 8

    .line 142
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [C

    .line 144
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-byte v4, p0, v2

    add-int/lit8 v5, v3, 0x1

    ushr-int/lit8 v6, v4, 0x4

    and-int/lit8 v6, v6, 0xf

    .line 145
    sget-object v7, Ll/ܳۤۡ;->ۧ:[C

    aget-char v6, v7, v6

    aput-char v6, v0, v3

    add-int/lit8 v3, v3, 0x2

    and-int/lit8 v4, v4, 0xf

    .line 146
    aget-char v4, v7, v4

    aput-char v4, v0, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 148
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static ۧ()Ljava/security/MessageDigest;
    .locals 2

    :try_start_0
    const-string v0, "SHA1"

    .line 44
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 46
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ܽ([B)Ljava/lang/String;
    .locals 8

    .line 173
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [C

    .line 175
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-byte v4, p0, v2

    if-lez v3, :cond_0

    add-int/lit8 v5, v3, 0x1

    const/16 v6, 0x3a

    .line 177
    aput-char v6, v0, v3

    move v3, v5

    :cond_0
    add-int/lit8 v5, v3, 0x1

    ushr-int/lit8 v6, v4, 0x4

    and-int/lit8 v6, v6, 0xf

    .line 179
    sget-object v7, Ll/ܳۤۡ;->ۧ:[C

    aget-char v6, v7, v6

    aput-char v6, v0, v3

    add-int/lit8 v3, v3, 0x2

    and-int/lit8 v4, v4, 0xf

    .line 180
    aget-char v4, v7, v4

    aput-char v4, v0, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 182
    :cond_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static ܽ()Ljava/security/MessageDigest;
    .locals 2

    :try_start_0
    const-string v0, "SHA-256"

    .line 36
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 38
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ܽ(Ljava/lang/String;)[B
    .locals 6

    .line 152
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 153
    rem-int/lit8 v1, v0, 0x2

    if-nez v1, :cond_2

    .line 157
    div-int/lit8 v1, v0, 0x2

    new-array v1, v1, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 159
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    add-int/lit8 v5, v2, 0x1

    .line 160
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5, v4}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    const/4 v5, -0x1

    if-eq v3, v5, :cond_0

    if-eq v4, v5, :cond_0

    .line 166
    div-int/lit8 v5, v2, 0x2

    shl-int/lit8 v3, v3, 0x4

    add-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v1, v5

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 163
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid hex digit in input."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object v1

    .line 154
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Hex string length is not even."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
