.class public final Ll/᩻᩻ۘ;
.super Ljava/lang/Object;
.source "RAHB"


# instance fields
.field public ֫:I

.field public ۧ:[B

.field public ܽ:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 5

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x1000

    new-array v1, v1, [B

    .line 98
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-eq v2, v3, :cond_0

    .line 99
    invoke-virtual {v0, v1, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    iput-object p1, p0, Ll/᩻᩻ۘ;->ۧ:[B

    .line 102
    array-length p1, p1

    iput p1, p0, Ll/᩻᩻ۘ;->ܽ:I

    .line 103
    iput v4, p0, Ll/᩻᩻ۘ;->֫:I

    return-void
.end method

.method private ܳ()B
    .locals 3

    .line 113
    iget v0, p0, Ll/᩻᩻ۘ;->֫:I

    iget v1, p0, Ll/᩻᩻ۘ;->ܽ:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    .line 116
    iput v1, p0, Ll/᩻᩻ۘ;->֫:I

    iget-object v1, p0, Ll/᩻᩻ۘ;->ۧ:[B

    aget-byte v0, v1, v0

    return v0

    .line 114
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Reached EOF, file size="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/᩻᩻ۘ;->ܽ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 76
    iget v0, p0, Ll/᩻᩻ۘ;->֫:I

    return v0
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 4

    .line 151
    iget v0, p0, Ll/᩻᩻ۘ;->֫:I

    add-int v1, p1, v0

    iget v2, p0, Ll/᩻᩻ۘ;->ܽ:I

    if-gt v1, v2, :cond_1

    .line 155
    new-array v1, p1, [B

    .line 156
    iget-object v2, p0, Ll/᩻᩻ۘ;->ۧ:[B

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 157
    iget v0, p0, Ll/᩻᩻ۘ;->֫:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/᩻᩻ۘ;->֫:I

    if-lez p1, :cond_0

    .line 159
    aget-byte p1, v1, v3

    if-nez p1, :cond_0

    const-string p1, "UTF-16BE"

    goto :goto_0

    :cond_0
    const-string p1, "ISO-8859-1"

    .line 164
    :goto_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0

    .line 152
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Reached EOF, file size="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩻᩻ۘ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(J)V
    .locals 3

    .line 236
    iget v0, p0, Ll/᩻᩻ۘ;->ܽ:I

    int-to-long v0, v0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    long-to-int p2, p1

    .line 239
    iput p2, p0, Ll/᩻᩻ۘ;->֫:I

    return-void

    .line 237
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Reached EOF, file size="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/᩻᩻ۘ;->ܽ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " offset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()B
    .locals 1

    .line 126
    invoke-direct {p0}, Ll/᩻᩻ۘ;->ܳ()B

    move-result v0

    return v0
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 4

    .line 176
    iget v0, p0, Ll/᩻᩻ۘ;->֫:I

    add-int v1, p1, v0

    iget v2, p0, Ll/᩻᩻ۘ;->ܽ:I

    if-gt v1, v2, :cond_0

    .line 180
    new-array v1, p1, [B

    .line 181
    iget-object v2, p0, Ll/᩻᩻ۘ;->ۧ:[B

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 182
    iget v0, p0, Ll/᩻᩻ۘ;->֫:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/᩻᩻ۘ;->֫:I

    .line 185
    new-instance p1, Ljava/lang/String;

    const-string v0, "UTF-16BE"

    invoke-direct {p1, v1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object p1

    .line 177
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Reached EOF, file size="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩻᩻ۘ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(J)V
    .locals 2

    .line 249
    iget v0, p0, Ll/᩻᩻ۘ;->֫:I

    int-to-long v0, v0

    add-long/2addr v0, p1

    invoke-virtual {p0, v0, v1}, Ll/᩻᩻ۘ;->֫(J)V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 195
    invoke-direct {p0}, Ll/᩻᩻ۘ;->ܳ()B

    move-result v0

    if-gez v0, :cond_0

    add-int/lit16 v0, v0, 0x100

    :cond_0
    return v0
.end method

.method public final ܿ()I
    .locals 2

    .line 226
    invoke-virtual {p0}, Ll/᩻᩻ۘ;->ܽ()I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Ll/᩻᩻ۘ;->ܽ()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ᩳ()J
    .locals 5

    .line 211
    invoke-virtual {p0}, Ll/᩻᩻ۘ;->ܽ()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x8

    shl-long/2addr v0, v2

    .line 212
    invoke-virtual {p0}, Ll/᩻᩻ۘ;->ܽ()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v0, v3

    shl-long/2addr v0, v2

    .line 213
    invoke-virtual {p0}, Ll/᩻᩻ۘ;->ܽ()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v0, v3

    shl-long/2addr v0, v2

    .line 214
    invoke-virtual {p0}, Ll/᩻᩻ۘ;->ܽ()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method
