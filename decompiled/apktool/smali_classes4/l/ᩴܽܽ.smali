.class public final Ll/ᩴܽܽ;
.super Ljava/lang/Object;
.source "SAOU"

# interfaces
.implements Ljava/io/DataOutput;
.implements Ljava/io/Flushable;
.implements Ljava/io/Closeable;


# instance fields
.field public ۗ:Ljava/util/HashMap;

.field public final ۙ:Ljava/io/OutputStream;

.field public ᩶:I

.field public final ᩸:[B

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ᩴܽܽ;->ۗ:Ljava/util/HashMap;

    .line 55
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ᩴܽܽ;->ۙ:Ljava/io/OutputStream;

    const p1, 0x8000

    new-array v0, p1, [B

    .line 60
    iput-object v0, p0, Ll/ᩴܽܽ;->᩸:[B

    .line 61
    iput p1, p0, Ll/ᩴܽܽ;->᩹:I

    return-void
.end method

.method private ֫()V
    .locals 4

    .line 65
    iget v0, p0, Ll/ᩴܽܽ;->᩶:I

    if-lez v0, :cond_0

    .line 66
    iget-object v1, p0, Ll/ᩴܽܽ;->ۙ:Ljava/io/OutputStream;

    iget-object v2, p0, Ll/ᩴܽܽ;->᩸:[B

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 67
    iput v3, p0, Ll/ᩴܽܽ;->᩶:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ᩴܽܽ;->ۙ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 73
    invoke-direct {p0}, Ll/ᩴܽܽ;->֫()V

    .line 74
    iget-object v0, p0, Ll/ᩴܽܽ;->ۙ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 0

    .line 84
    invoke-virtual {p0, p1}, Ll/ᩴܽܽ;->writeByte(I)V

    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 89
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ᩴܽܽ;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 2

    .line 94
    iget v0, p0, Ll/ᩴܽܽ;->᩹:I

    if-ge v0, p3, :cond_0

    .line 95
    invoke-direct {p0}, Ll/ᩴܽܽ;->֫()V

    .line 96
    iget-object v0, p0, Ll/ᩴܽܽ;->ۙ:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    return-void

    .line 98
    :cond_0
    iget v1, p0, Ll/ᩴܽܽ;->᩶:I

    sub-int/2addr v0, v1

    if-ge v0, p3, :cond_1

    invoke-direct {p0}, Ll/ᩴܽܽ;->֫()V

    .line 99
    :cond_1
    iget-object v0, p0, Ll/ᩴܽܽ;->᩸:[B

    iget v1, p0, Ll/ᩴܽܽ;->᩶:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 100
    iget p1, p0, Ll/ᩴܽܽ;->᩶:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ᩴܽܽ;->᩶:I

    return-void
.end method

.method public final writeBoolean(Z)V
    .locals 0

    .line 146
    invoke-virtual {p0, p1}, Ll/ᩴܽܽ;->writeByte(I)V

    return-void
.end method

.method public final writeByte(I)V
    .locals 2

    .line 151
    iget v0, p0, Ll/ᩴܽܽ;->᩹:I

    iget v1, p0, Ll/ᩴܽܽ;->᩶:I

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    invoke-direct {p0}, Ll/ᩴܽܽ;->֫()V

    .line 152
    :cond_0
    iget v0, p0, Ll/ᩴܽܽ;->᩶:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ᩴܽܽ;->᩶:I

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    iget-object v1, p0, Ll/ᩴܽܽ;->᩸:[B

    aput-byte p1, v1, v0

    return-void
.end method

.method public final writeBytes(Ljava/lang/String;)V
    .locals 0

    .line 204
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final writeChar(I)V
    .locals 0

    int-to-short p1, p1

    .line 164
    invoke-virtual {p0, p1}, Ll/ᩴܽܽ;->writeShort(I)V

    return-void
.end method

.method public final writeChars(Ljava/lang/String;)V
    .locals 0

    .line 210
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final writeDouble(D)V
    .locals 0

    .line 198
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ll/ᩴܽܽ;->writeLong(J)V

    return-void
.end method

.method public final writeFloat(F)V
    .locals 0

    .line 193
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ᩴܽܽ;->writeInt(I)V

    return-void
.end method

.method public final writeInt(I)V
    .locals 6

    .line 169
    iget v0, p0, Ll/ᩴܽܽ;->᩹:I

    iget v1, p0, Ll/ᩴܽܽ;->᩶:I

    sub-int/2addr v0, v1

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    invoke-direct {p0}, Ll/ᩴܽܽ;->֫()V

    .line 170
    :cond_0
    iget v0, p0, Ll/ᩴܽܽ;->᩶:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ᩴܽܽ;->᩶:I

    shr-int/lit8 v3, p1, 0x18

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    iget-object v4, p0, Ll/ᩴܽܽ;->᩸:[B

    aput-byte v3, v4, v0

    add-int/lit8 v3, v0, 0x2

    .line 171
    iput v3, p0, Ll/ᩴܽܽ;->᩶:I

    shr-int/lit8 v5, p1, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v4, v2

    add-int/lit8 v2, v0, 0x3

    .line 172
    iput v2, p0, Ll/ᩴܽܽ;->᩶:I

    shr-int/lit8 v5, p1, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v4, v3

    add-int/2addr v0, v1

    .line 173
    iput v0, p0, Ll/ᩴܽܽ;->᩶:I

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v4, v2

    return-void
.end method

.method public final writeLong(J)V
    .locals 7

    .line 178
    iget v0, p0, Ll/ᩴܽܽ;->᩹:I

    iget v1, p0, Ll/ᩴܽܽ;->᩶:I

    sub-int/2addr v0, v1

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    invoke-direct {p0}, Ll/ᩴܽܽ;->֫()V

    :cond_0
    const/16 v0, 0x20

    shr-long v2, p1, v0

    long-to-int v0, v2

    .line 180
    iget v2, p0, Ll/ᩴܽܽ;->᩶:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ᩴܽܽ;->᩶:I

    shr-int/lit8 v4, v0, 0x18

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    iget-object v5, p0, Ll/ᩴܽܽ;->᩸:[B

    aput-byte v4, v5, v2

    add-int/lit8 v4, v2, 0x2

    .line 181
    iput v4, p0, Ll/ᩴܽܽ;->᩶:I

    shr-int/lit8 v6, v0, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v5, v3

    add-int/lit8 v3, v2, 0x3

    .line 182
    iput v3, p0, Ll/ᩴܽܽ;->᩶:I

    shr-int/lit8 v6, v0, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v5, v4

    add-int/lit8 v4, v2, 0x4

    .line 183
    iput v4, p0, Ll/ᩴܽܽ;->᩶:I

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v5, v3

    long-to-int p2, p1

    add-int/lit8 p1, v2, 0x5

    .line 185
    iput p1, p0, Ll/ᩴܽܽ;->᩶:I

    shr-int/lit8 v0, p2, 0x18

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v5, v4

    add-int/lit8 v0, v2, 0x6

    .line 186
    iput v0, p0, Ll/ᩴܽܽ;->᩶:I

    shr-int/lit8 v3, p2, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v5, p1

    add-int/lit8 p1, v2, 0x7

    .line 187
    iput p1, p0, Ll/ᩴܽܽ;->᩶:I

    shr-int/lit8 v3, p2, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v5, v0

    add-int/2addr v2, v1

    .line 188
    iput v2, p0, Ll/ᩴܽܽ;->᩶:I

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    aput-byte p2, v5, p1

    return-void
.end method

.method public final writeShort(I)V
    .locals 5

    .line 157
    iget v0, p0, Ll/ᩴܽܽ;->᩹:I

    iget v1, p0, Ll/ᩴܽܽ;->᩶:I

    sub-int/2addr v0, v1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    invoke-direct {p0}, Ll/ᩴܽܽ;->֫()V

    .line 158
    :cond_0
    iget v0, p0, Ll/ᩴܽܽ;->᩶:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ᩴܽܽ;->᩶:I

    shr-int/lit8 v3, p1, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    iget-object v4, p0, Ll/ᩴܽܽ;->᩸:[B

    aput-byte v3, v4, v0

    add-int/2addr v0, v1

    .line 159
    iput v0, p0, Ll/ᩴܽܽ;->᩶:I

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v4, v2

    return-void
.end method

.method public final writeUTF(Ljava/lang/String;)V
    .locals 3

    .line 108
    iget v0, p0, Ll/ᩴܽܽ;->᩹:I

    iget v1, p0, Ll/ᩴܽܽ;->᩶:I

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_0

    invoke-direct {p0}, Ll/ᩴܽܽ;->֫()V

    .line 110
    :cond_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 111
    array-length v0, p1

    const v1, 0xffff

    if-gt v0, v1, :cond_1

    .line 114
    array-length v0, p1

    invoke-virtual {p0, v0}, Ll/ᩴܽܽ;->writeShort(I)V

    const/4 v0, 0x0

    .line 115
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ᩴܽܽ;->write([BII)V

    return-void

    .line 112
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Modified UTF-8 length too large: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 130
    iget-object v0, p0, Ll/ᩴܽܽ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Short;

    if-eqz v1, :cond_0

    .line 132
    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result p1

    invoke-virtual {p0, p1}, Ll/ᩴܽܽ;->writeShort(I)V

    return-void

    :cond_0
    const v1, 0xffff

    .line 134
    invoke-virtual {p0, v1}, Ll/ᩴܽܽ;->writeShort(I)V

    .line 135
    invoke-virtual {p0, p1}, Ll/ᩴܽܽ;->writeUTF(Ljava/lang/String;)V

    .line 139
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v1

    int-to-short v1, v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    .line 140
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
