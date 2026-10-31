.class public final Ll/᩸ۨ᩵;
.super Ljava/io/FilterOutputStream;
.source "A8DI"


# static fields
.field public static final ۤ:[Ll/֨ۨ᩵;


# instance fields
.field public ۗ:Ll/ܶۨ᩵;

.field public final ۙ:Ll/ۗۘۢ;

.field public final ۫:I

.field public final ۬:Ljava/nio/ByteBuffer;

.field public final ᩶:[B

.field public final ᩸:Ljava/nio/ByteBuffer;

.field public final ᩹:Ll/֫᩺᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/֨ۨ᩵;

    .line 58
    sget-object v1, Ll/֨ۨ᩵;->ۙ:Ll/֨ۨ᩵;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Ll/᩸ۨ᩵;->ۤ:[Ll/֨ۨ᩵;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 8

    .line 145
    sget-object v2, Ll/ۚۨ᩵;->ۗ:Ll/ۚۨ᩵;

    .line 94
    invoke-static {}, Ll/ᩴۨ᩵;->ۧ()Ll/ᩴۨ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    invoke-static {}, Ll/ܽ᩺᩵;->֫()Ll/ܽ᩺᩵;

    invoke-static {}, Ll/ܽ᩺᩵;->ۧ()Ll/֫᩺᩵;

    move-result-object v6

    const-wide/16 v3, -0x1

    .line 94
    sget-object v5, Ll/ۙۨ᩵;->ۧ:Ll/ۗۘۢ;

    sget-object v7, Ll/᩸ۨ᩵;->ۤ:[Ll/֨ۨ᩵;

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Ll/᩸ۨ᩵;-><init>(Ljava/io/OutputStream;Ll/ۚۨ᩵;JLl/ۗۘۢ;Ll/֫᩺᩵;[Ll/֨ۨ᩵;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;IJ)V
    .locals 8

    .line 149
    sget-object v2, Ll/ۚۨ᩵;->ۗ:Ll/ۚۨ᩵;

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    invoke-static {}, Ll/ᩴۨ᩵;->ۧ()Ll/ᩴۨ᩵;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Ll/ۙۨ᩵;->ۧ:Ll/ۗۘۢ;

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/ᩴۨ᩵;->ۧ()Ll/ᩴۨ᩵;

    move-result-object v1

    invoke-virtual {v1, p2}, Ll/ᩴۨ᩵;->֫(I)Ll/ۗۘۢ;

    move-result-object p2

    :goto_0
    move-object v5, p2

    .line 150
    invoke-static {}, Ll/ܽ᩺᩵;->֫()Ll/ܽ᩺᩵;

    invoke-static {}, Ll/ܽ᩺᩵;->ۧ()Ll/֫᩺᩵;

    move-result-object v6

    const-wide/16 v3, 0x0

    const/4 p2, 0x0

    const/4 v1, 0x2

    cmp-long v7, p3, v3

    if-gez v7, :cond_1

    new-array v1, v1, [Ll/֨ۨ᩵;

    sget-object v3, Ll/֨ۨ᩵;->ۙ:Ll/֨ۨ᩵;

    aput-object v3, v1, p2

    sget-object p2, Ll/֨ۨ᩵;->ۗ:Ll/֨ۨ᩵;

    aput-object p2, v1, v0

    move-object v7, v1

    goto :goto_1

    :cond_1
    const/4 v3, 0x3

    new-array v3, v3, [Ll/֨ۨ᩵;

    sget-object v4, Ll/֨ۨ᩵;->ۙ:Ll/֨ۨ᩵;

    aput-object v4, v3, p2

    sget-object p2, Ll/֨ۨ᩵;->ۗ:Ll/֨ۨ᩵;

    aput-object p2, v3, v0

    sget-object p2, Ll/֨ۨ᩵;->۬:Ll/֨ۨ᩵;

    aput-object p2, v3, v1

    move-object v7, v3

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-wide v3, p3

    .line 149
    invoke-direct/range {v0 .. v7}, Ll/᩸ۨ᩵;-><init>(Ljava/io/OutputStream;Ll/ۚۨ᩵;JLl/ۗۘۢ;Ll/֫᩺᩵;[Ll/֨ۨ᩵;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/io/OutputStream;Ll/ۚۨ᩵;JLl/ۗۘۢ;Ll/֫᩺᩵;[Ll/֨ۨ᩵;)V
    .locals 6

    .line 111
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/4 p1, 0x4

    .line 67
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۨ᩵;->۬:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Ll/᩸ۨ᩵;->ۗ:Ll/ܶۨ᩵;

    .line 112
    iput-object p5, p0, Ll/᩸ۨ᩵;->ۙ:Ll/ۗۘۢ;

    .line 113
    iput-object p6, p0, Ll/᩸ۨ᩵;->᩹:Ll/֫᩺᩵;

    .line 114
    new-instance v0, Ll/ܶۨ᩵;

    new-instance v2, Ll/۠ۨ᩵;

    invoke-direct {v2, p7}, Ll/۠ۨ᩵;-><init>([Ll/֨ۨ᩵;)V

    new-instance p7, Ll/֡ۨ᩵;

    const/4 v3, 0x0

    invoke-direct {p7, p2, v3}, Ll/֡ۨ᩵;-><init>(Ll/ۚۨ᩵;I)V

    invoke-direct {v0, v2, p7}, Ll/ܶۨ᩵;-><init>(Ll/۠ۨ᩵;Ll/֡ۨ᩵;)V

    iput-object v0, p0, Ll/᩸ۨ᩵;->ۗ:Ll/ܶۨ᩵;

    .line 115
    invoke-virtual {v0}, Ll/ܶۨ᩵;->ܽ()Ll/֡ۨ᩵;

    move-result-object p2

    invoke-virtual {p2}, Ll/֡ۨ᩵;->֫()I

    move-result p2

    iput p2, p0, Ll/᩸ۨ᩵;->۫:I

    .line 116
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p7

    invoke-virtual {p7, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p7

    iput-object p7, p0, Ll/᩸ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    .line 117
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p2, :cond_4

    const/high16 p5, 0x7e000000

    if-ge p2, p5, :cond_3

    .line 40
    div-int/lit16 p5, p2, 0xff

    add-int/2addr p5, p2

    add-int/lit8 p5, p5, 0x10

    .line 117
    new-array p2, p5, [B

    iput-object p2, p0, Ll/᩸ۨ᩵;->᩶:[B

    .line 118
    invoke-virtual {v0}, Ll/ܶۨ᩵;->ᩳ()Ll/۠ۨ᩵;

    move-result-object p2

    sget-object p5, Ll/֨ۨ᩵;->۬:Ll/֨ۨ᩵;

    invoke-virtual {p2, p5}, Ll/۠ۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-wide/16 v4, 0x0

    cmp-long p2, p3, v4

    if-ltz p2, :cond_0

    goto :goto_0

    .line 119
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Known size must be greater than zero in order to use the known size feature"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/16 p2, 0xf

    .line 159
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p2

    const p7, 0x184d2204

    .line 160
    invoke-virtual {p2, p7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 161
    invoke-virtual {v0}, Ll/ܶۨ᩵;->ᩳ()Ll/۠ۨ᩵;

    move-result-object p7

    invoke-virtual {p7}, Ll/۠ۨ᩵;->֫()B

    move-result p7

    invoke-virtual {p2, p7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 162
    invoke-virtual {v0}, Ll/ܶۨ᩵;->ܽ()Ll/֡ۨ᩵;

    move-result-object p7

    invoke-virtual {p7}, Ll/֡ۨ᩵;->ۧ()B

    move-result p7

    invoke-virtual {p2, p7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 163
    invoke-virtual {v0, p5}, Ll/ܶۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result p5

    if-eqz p5, :cond_2

    .line 164
    invoke-virtual {p2, p3, p4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 167
    :cond_2
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p3

    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    move-result p4

    sub-int/2addr p4, p1

    invoke-virtual {p6, p3, p1, p4}, Ll/֫᩺᩵;->֫([BII)I

    move-result p1

    shr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 168
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 170
    iget-object p1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p3

    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    move-result p2

    invoke-virtual {p1, p3, v3, p2}, Ljava/io/OutputStream;->write([BII)V

    return-void

    .line 38
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "length must be < 2113929216"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 36
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "length must be >= 0, got "

    .line 0
    invoke-static {p2, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 36
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫()V
    .locals 8

    .line 180
    iget-object v0, p0, Ll/᩸ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 184
    :cond_0
    iget-object v1, p0, Ll/᩸ۨ᩵;->᩶:[B

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([BB)V

    .line 186
    sget-object v3, Ll/֨ۨ᩵;->ۗ:Ll/֨ۨ᩵;

    iget-object v4, p0, Ll/᩸ۨ᩵;->ۗ:Ll/ܶۨ᩵;

    invoke-virtual {v4, v3}, Ll/ܶۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 187
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    invoke-virtual {v4, v5, v3}, Ll/ܶۨ᩵;->֫(I[B)V

    .line 190
    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    iget-object v6, p0, Ll/᩸ۨ᩵;->ۙ:Ll/ۗۘۢ;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    array-length v7, v1

    invoke-virtual {v6, v5, v7, v3, v1}, Ll/ۗۘۢ;->֫(II[B[B)I

    move-result v3

    .line 195
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v5

    if-lt v3, v5, :cond_2

    .line 196
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v3

    .line 197
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    const/high16 v5, -0x80000000

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    or-int/2addr v5, v3

    .line 205
    iget-object v6, p0, Ll/᩸ۨ᩵;->۬:Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v2, v5}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 206
    iget-object v5, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/io/OutputStream;->write([B)V

    .line 207
    iget-object v5, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v5, v1, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 210
    sget-object v5, Ll/֨ۨ᩵;->᩶:Ll/֨ۨ᩵;

    invoke-virtual {v4, v5}, Ll/ܶۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 211
    iget-object v4, p0, Ll/᩸ۨ᩵;->᩹:Ll/֫᩺᩵;

    invoke-virtual {v4, v1, v2, v3}, Ll/֫᩺᩵;->֫([BII)I

    move-result v1

    invoke-virtual {v6, v2, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 212
    iget-object v1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 214
    :cond_3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 281
    iget-object v0, p0, Ll/᩸ۨ᩵;->ۗ:Ll/ܶۨ᩵;

    invoke-virtual {v0}, Ll/ܶۨ᩵;->ܿ()Z

    move-result v1

    if-nez v1, :cond_1

    .line 282
    invoke-virtual {p0}, Ll/᩸ۨ᩵;->flush()V

    .line 224
    iget-object v1, p0, Ll/᩸ۨ᩵;->۬:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 225
    iget-object v3, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/OutputStream;->write([B)V

    .line 226
    sget-object v3, Ll/֨ۨ᩵;->ۗ:Ll/֨ۨ᩵;

    invoke-virtual {v0, v3}, Ll/ܶۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 227
    invoke-virtual {v0}, Ll/ܶۨ᩵;->֫()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 228
    iget-object v2, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write([B)V

    .line 230
    :cond_0
    invoke-virtual {v0}, Ll/ܶۨ᩵;->ۧ()V

    .line 285
    :cond_1
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 264
    iget-object v0, p0, Ll/᩸ۨ᩵;->ۗ:Ll/ܶۨ᩵;

    invoke-virtual {v0}, Ll/ܶۨ᩵;->ܿ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 265
    invoke-direct {p0}, Ll/᩸ۨ᩵;->֫()V

    .line 267
    :cond_0
    invoke-super {p0}, Ljava/io/FilterOutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 3

    .line 274
    iget-object v0, p0, Ll/᩸ۨ᩵;->ۗ:Ll/ܶۨ᩵;

    invoke-virtual {v0}, Ll/ܶۨ᩵;->ܿ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 236
    iget-object v0, p0, Ll/᩸ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    iget v2, p0, Ll/᩸ۨ᩵;->۫:I

    if-ne v1, v2, :cond_0

    .line 237
    invoke-direct {p0}, Ll/᩸ۨ᩵;->֫()V

    :cond_0
    int-to-byte p1, p1

    .line 239
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    return-void

    .line 275
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The stream is already closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([BII)V
    .locals 2

    if-ltz p2, :cond_2

    if-ltz p3, :cond_2

    add-int v0, p2, p3

    .line 244
    array-length v1, p1

    if-gt v0, v1, :cond_2

    .line 274
    iget-object v0, p0, Ll/᩸ۨ᩵;->ۗ:Ll/ܶۨ᩵;

    invoke-virtual {v0}, Ll/ܶۨ᩵;->ܿ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 250
    :goto_0
    iget-object v0, p0, Ll/᩸ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    if-le p3, v1, :cond_0

    .line 251
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    .line 253
    invoke-virtual {v0, p1, p2, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 254
    invoke-direct {p0}, Ll/᩸ۨ᩵;->֫()V

    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    goto :goto_0

    .line 259
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    return-void

    .line 275
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The stream is already closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 245
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
