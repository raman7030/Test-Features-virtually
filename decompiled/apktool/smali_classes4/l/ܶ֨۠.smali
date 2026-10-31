.class public final Ll/ܶ֨۠;
.super Ljava/lang/Object;
.source "43ZE"


# instance fields
.field public ֫:[B

.field public ۧ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-array p1, p1, [B

    iput-object p1, p0, Ll/ܶ֨۠;->֫:[B

    const/4 p1, 0x0

    .line 60
    iput p1, p0, Ll/ܶ֨۠;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    .line 66
    iget-object v0, p0, Ll/ܶ֨۠;->֫:[B

    iget v1, p0, Ll/ܶ֨۠;->ۧ:I

    invoke-static {v1, v0}, Ll/ۛ᩸ۘ;->֫(I[B)[B

    move-result-object v0

    iput-object v0, p0, Ll/ܶ֨۠;->֫:[B

    .line 67
    iget v1, p0, Ll/ܶ֨۠;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܶ֨۠;->ۧ:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void
.end method

.method public final ֫(II[B)V
    .locals 2

    .line 74
    iget-object v0, p0, Ll/ܶ֨۠;->֫:[B

    iget v1, p0, Ll/ܶ֨۠;->ۧ:I

    add-int/2addr v1, p2

    invoke-static {v1, v0}, Ll/ۛ᩸ۘ;->֫(I[B)[B

    move-result-object v0

    iput-object v0, p0, Ll/ܶ֨۠;->֫:[B

    .line 75
    iget v1, p0, Ll/ܶ֨۠;->ۧ:I

    invoke-static {p3, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    iget p1, p0, Ll/ܶ֨۠;->ۧ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ܶ֨۠;->ۧ:I

    return-void
.end method

.method public final ֫(Ljava/io/InputStream;)V
    .locals 4

    .line 154
    :try_start_0
    iget v0, p0, Ll/ܶ֨۠;->ۧ:I

    .line 155
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v1

    .line 156
    iget-object v2, p0, Ll/ܶ֨۠;->֫:[B

    iget v3, p0, Ll/ܶ֨۠;->ۧ:I

    add-int/2addr v3, v1

    invoke-static {v3, v2}, Ll/ۛ᩸ۘ;->֫(I[B)[B

    move-result-object v2

    iput-object v2, p0, Ll/ܶ֨۠;->֫:[B

    .line 157
    invoke-virtual {p1, v2, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    :goto_0
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    add-int/2addr v0, v1

    .line 161
    iget-object v1, p0, Ll/ܶ֨۠;->֫:[B

    invoke-static {v0, v1}, Ll/ۛ᩸ۘ;->֫(I[B)[B

    move-result-object v1

    iput-object v1, p0, Ll/ܶ֨۠;->֫:[B

    .line 162
    array-length v2, v1

    sub-int/2addr v2, v0

    invoke-virtual {p1, v1, v0, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 166
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 173
    :catch_1
    throw v0
.end method

.method public final ۧ(I)V
    .locals 3

    .line 88
    iget-object v0, p0, Ll/ܶ֨۠;->֫:[B

    iget v1, p0, Ll/ܶ֨۠;->ۧ:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1, v0}, Ll/ۛ᩸ۘ;->֫(I[B)[B

    move-result-object v0

    iput-object v0, p0, Ll/ܶ֨۠;->֫:[B

    .line 89
    iget v1, p0, Ll/ܶ֨۠;->ۧ:I

    shr-int/lit8 v2, p1, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v2, v1, 0x1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 90
    aput-byte p1, v0, v2

    add-int/lit8 v1, v1, 0x2

    .line 91
    iput v1, p0, Ll/ܶ֨۠;->ۧ:I

    return-void
.end method

.method public final ܽ(I)V
    .locals 4

    .line 97
    iget-object v0, p0, Ll/ܶ֨۠;->֫:[B

    iget v1, p0, Ll/ܶ֨۠;->ۧ:I

    add-int/lit8 v1, v1, 0x3

    invoke-static {v1, v0}, Ll/ۛ᩸ۘ;->֫(I[B)[B

    move-result-object v0

    iput-object v0, p0, Ll/ܶ֨۠;->֫:[B

    .line 98
    iget v1, p0, Ll/ܶ֨۠;->ۧ:I

    shr-int/lit8 v2, p1, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v2, v1, 0x1

    shr-int/lit8 v3, p1, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    .line 99
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x2

    shr-int/lit8 v3, p1, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    .line 100
    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x3

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 101
    aput-byte p1, v0, v2

    add-int/lit8 v1, v1, 0x4

    .line 102
    iput v1, p0, Ll/ܶ֨۠;->ۧ:I

    return-void
.end method

.method public final ܿ(I)I
    .locals 3

    .line 179
    iget-object v0, p0, Ll/ܶ֨۠;->֫:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v2, p1, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    add-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x2

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    add-int/2addr v1, v2

    add-int/lit8 p1, p1, 0x3

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    add-int/2addr v1, p1

    return v1
.end method

.method public final ᩳ(I)C
    .locals 2

    .line 226
    iget-object v0, p0, Ll/ܶ֨۠;->֫:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 p1, p1, 0x1

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    add-int/2addr v1, p1

    int-to-char p1, v1

    return p1
.end method
