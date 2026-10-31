.class public final Ll/֡ܺᩴ;
.super Ljava/io/OutputStream;
.source "B1QE"

# interfaces
.implements Ll/۠ܺᩴ;
.implements Ljava/io/ObjectOutput;
.implements Ll/֨ܺᩴ;


# instance fields
.field public ᩶:I

.field public ᩸:[B

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x10

    .line 55
    invoke-direct {p0, v0}, Ll/֡ܺᩴ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 63
    new-array p1, p1, [B

    iput-object p1, p0, Ll/֡ܺᩴ;->᩸:[B

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final position(J)V
    .locals 3

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    long-to-int p2, p1

    .line 103
    iput p2, p0, Ll/֡ܺᩴ;->᩶:I

    return-void

    .line 102
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Position too large: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 102
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final write(I)V
    .locals 3

    .line 87
    iget v0, p0, Ll/֡ܺᩴ;->᩶:I

    iget-object v1, p0, Ll/֡ܺᩴ;->᩸:[B

    array-length v2, v1

    if-lt v0, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    iget v2, p0, Ll/֡ܺᩴ;->᩹:I

    invoke-static {v0, v2, v1}, Ll/ۚ᩺ۘ;->֫(II[B)[B

    move-result-object v0

    iput-object v0, p0, Ll/֡ܺᩴ;->᩸:[B

    .line 88
    :cond_0
    iget-object v0, p0, Ll/֡ܺᩴ;->᩸:[B

    iget v1, p0, Ll/֡ܺᩴ;->᩶:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/֡ܺᩴ;->᩶:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    .line 89
    iget p1, p0, Ll/֡ܺᩴ;->᩹:I

    if-ge p1, v2, :cond_1

    iput v2, p0, Ll/֡ܺᩴ;->᩹:I

    :cond_1
    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 129
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/֡ܺᩴ;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 4

    .line 357
    array-length v0, p1

    invoke-static {v0, p2, p3}, Ll/ۢ᩹ۡ;->ۧ(III)V

    .line 95
    iget v0, p0, Ll/֡ܺᩴ;->᩶:I

    add-int v1, v0, p3

    iget-object v2, p0, Ll/֡ܺᩴ;->᩸:[B

    array-length v3, v2

    if-le v1, v3, :cond_0

    add-int v1, v0, p3

    invoke-static {v1, v0, v2}, Ll/ۚ᩺ۘ;->֫(II[B)[B

    move-result-object v0

    iput-object v0, p0, Ll/֡ܺᩴ;->᩸:[B

    .line 96
    :cond_0
    iget-object v0, p0, Ll/֡ܺᩴ;->᩸:[B

    iget v1, p0, Ll/֡ܺᩴ;->᩶:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 97
    iget p1, p0, Ll/֡ܺᩴ;->᩶:I

    add-int p2, p1, p3

    iget v0, p0, Ll/֡ܺᩴ;->᩹:I

    if-le p2, v0, :cond_1

    add-int/2addr p1, p3

    iput p1, p0, Ll/֡ܺᩴ;->᩶:I

    iput p1, p0, Ll/֡ܺᩴ;->᩹:I

    :cond_1
    return-void
.end method

.method public final writeBoolean(Z)V
    .locals 0

    .line 145
    invoke-virtual {p0, p1}, Ll/֡ܺᩴ;->write(I)V

    return-void
.end method

.method public final writeByte(I)V
    .locals 0

    .line 150
    invoke-virtual {p0, p1}, Ll/֡ܺᩴ;->write(I)V

    return-void
.end method

.method public final writeBytes(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 196
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 197
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-byte v2, v2

    invoke-virtual {p0, v2}, Ll/֡ܺᩴ;->write(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final writeChar(I)V
    .locals 1

    shr-int/lit8 v0, p1, 0x8

    .line 161
    invoke-virtual {p0, v0}, Ll/֡ܺᩴ;->write(I)V

    .line 162
    invoke-virtual {p0, p1}, Ll/֡ܺᩴ;->write(I)V

    return-void
.end method

.method public final writeChars(Ljava/lang/String;)V
    .locals 3

    .line 203
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 204
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 205
    invoke-virtual {p0, v2}, Ll/֡ܺᩴ;->writeChar(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final writeDouble(D)V
    .locals 0

    .line 186
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ll/֡ܺᩴ;->writeLong(J)V

    return-void
.end method

.method public final writeFloat(F)V
    .locals 0

    .line 181
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/֡ܺᩴ;->writeInt(I)V

    return-void
.end method

.method public final writeInt(I)V
    .locals 1

    shr-int/lit8 v0, p1, 0x18

    .line 167
    invoke-virtual {p0, v0}, Ll/֡ܺᩴ;->write(I)V

    shr-int/lit8 v0, p1, 0x10

    .line 168
    invoke-virtual {p0, v0}, Ll/֡ܺᩴ;->write(I)V

    shr-int/lit8 v0, p1, 0x8

    .line 169
    invoke-virtual {p0, v0}, Ll/֡ܺᩴ;->write(I)V

    .line 170
    invoke-virtual {p0, p1}, Ll/֡ܺᩴ;->write(I)V

    return-void
.end method

.method public final writeLong(J)V
    .locals 2

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v1, v0

    .line 175
    invoke-virtual {p0, v1}, Ll/֡ܺᩴ;->writeInt(I)V

    long-to-int p2, p1

    .line 176
    invoke-virtual {p0, p2}, Ll/֡ܺᩴ;->writeInt(I)V

    return-void
.end method

.method public final writeObject(Ljava/lang/Object;)V
    .locals 1

    .line 245
    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, p0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 246
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 247
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 245
    :try_start_1
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final writeShort(I)V
    .locals 1

    shr-int/lit8 v0, p1, 0x8

    .line 155
    invoke-virtual {p0, v0}, Ll/֡ܺᩴ;->write(I)V

    .line 156
    invoke-virtual {p0, p1}, Ll/֡ܺᩴ;->write(I)V

    return-void
.end method

.method public final writeUTF(Ljava/lang/String;)V
    .locals 9

    .line 211
    iget v0, p0, Ll/֡ܺᩴ;->᩶:I

    const/4 v1, 0x0

    .line 212
    invoke-virtual {p0, v1}, Ll/֡ܺᩴ;->writeShort(I)V

    .line 213
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ge v3, v2, :cond_3

    .line 214
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x80

    if-eqz v6, :cond_0

    if-ge v6, v7, :cond_0

    .line 228
    invoke-virtual {p0, v6}, Ll/֡ܺᩴ;->write(I)V

    goto :goto_1

    :cond_0
    const/16 v8, 0x800

    if-lt v6, v8, :cond_1

    shr-int/lit8 v8, v6, 0xc

    and-int/lit8 v8, v8, 0xf

    or-int/lit16 v8, v8, 0xe0

    .line 231
    invoke-virtual {p0, v8}, Ll/֡ܺᩴ;->write(I)V

    shr-int/lit8 v8, v6, 0x6

    and-int/lit8 v8, v8, 0x3f

    or-int/2addr v8, v7

    .line 232
    invoke-virtual {p0, v8}, Ll/֡ܺᩴ;->write(I)V

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v7

    .line 233
    invoke-virtual {p0, v6}, Ll/֡ܺᩴ;->write(I)V

    goto :goto_1

    :cond_1
    shr-int/lit8 v8, v6, 0x6

    and-int/lit8 v8, v8, 0x1f

    or-int/lit16 v8, v8, 0xc0

    .line 236
    invoke-virtual {p0, v8}, Ll/֡ܺᩴ;->write(I)V

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v7

    .line 237
    invoke-virtual {p0, v6}, Ll/֡ܺᩴ;->write(I)V

    .line 215
    :goto_1
    iget v6, p0, Ll/֡ܺᩴ;->᩶:I

    sub-int/2addr v6, v0

    const v7, 0x10001

    if-gt v6, v7, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 216
    :cond_2
    iput v0, p0, Ll/֡ܺᩴ;->᩶:I

    iput v0, p0, Ll/֡ܺᩴ;->᩹:I

    .line 217
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x63

    invoke-virtual {p1, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v1

    aput-object p1, v3, v5

    const-string p1, "UTF encoded string too long: %d: %s"

    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_3
    iget p1, p0, Ll/֡ܺᩴ;->᩶:I

    sub-int/2addr p1, v0

    sub-int/2addr p1, v4

    .line 221
    iget-object v1, p0, Ll/֡ܺᩴ;->᩸:[B

    shr-int/lit8 v2, p1, 0x8

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int/2addr v0, v5

    int-to-byte p1, p1

    .line 222
    aput-byte p1, v1, v0

    return-void
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 76
    iput v0, p0, Ll/֡ܺᩴ;->᩹:I

    .line 77
    iput v0, p0, Ll/֡ܺᩴ;->᩶:I

    return-void
.end method

.method public final ܽ()V
    .locals 4

    .line 82
    iget-object v0, p0, Ll/֡ܺᩴ;->᩸:[B

    iget v1, p0, Ll/֡ܺᩴ;->᩹:I

    .line 220
    array-length v2, v0

    if-lt v1, v2, :cond_0

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    .line 221
    sget-object v2, Ll/ۚ᩺ۘ;->֫:[B

    goto :goto_0

    :cond_1
    new-array v2, v1, [B

    :goto_0
    const/4 v3, 0x0

    .line 222
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v2

    .line 82
    :goto_1
    iput-object v0, p0, Ll/֡ܺᩴ;->᩸:[B

    return-void
.end method
