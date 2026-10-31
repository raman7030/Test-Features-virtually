.class public final Ll/ܰۜܽ;
.super Ljava/lang/Object;
.source "H9R4"

# interfaces
.implements Ll/ۙۜܽ;


# instance fields
.field public final ᩸:Ll/֫᩷ܽ;

.field public final ᩹:Ll/᩻ۖܽ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Ll/᩺ۜܽ;

    invoke-direct {v0, p0}, Ll/᩺ۜܽ;-><init>(Ll/ܰۜܽ;)V

    iput-object v0, p0, Ll/ܰۜܽ;->᩸:Ll/֫᩷ܽ;

    const-string v0, "rw"

    .line 16
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    const-wide/16 v0, 0x0

    .line 17
    invoke-virtual {p1, v0, v1}, Ll/᩻ۖܽ;->setLength(J)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰۜܽ;)Ll/᩻ۖܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 199
    iget-object v0, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->close()V

    return-void
.end method

.method public final getPosition()J
    .locals 2

    .line 37
    iget-object v0, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    return-wide v0
.end method

.method public final seek(J)V
    .locals 1

    .line 32
    iget-object v0, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1, p2}, Ll/᩻ۖܽ;->seek(J)V

    return-void
.end method

.method public final skipBytes(I)V
    .locals 3

    .line 181
    iget-object v0, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1}, Ll/᩻ۖܽ;->skipBytes(I)I

    move-result v1

    sub-int/2addr p1, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 183
    invoke-virtual {v0, v1}, Ll/᩻ۖܽ;->write(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final write([B)V
    .locals 3

    .line 22
    iget-object v0, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 111
    array-length v2, p1

    invoke-virtual {v0, p1, v1, v2}, Ll/᩻ۖܽ;->write([BII)V

    return-void
.end method

.method public final writeByte(I)V
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1}, Ll/᩻ۖܽ;->write(I)V

    return-void
.end method

.method public final writeInt(I)V
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1}, Ll/᩻ۖܽ;->writeInt(I)V

    return-void
.end method

.method public final ֫(C)V
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1}, Ll/᩻ۖܽ;->֫(C)V

    return-void
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 4

    .line 168
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 170
    :goto_0
    array-length v2, p2

    iget-object v3, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    if-ge v1, v2, :cond_0

    if-eqz p1, :cond_0

    add-int/lit8 v2, v1, 0x1

    .line 171
    aget-char v1, p2, v1

    invoke-virtual {v3, v1}, Ll/᩻ۖܽ;->֫(C)V

    add-int/lit8 p1, p1, -0x1

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_1
    if-ge p2, p1, :cond_1

    .line 175
    invoke-virtual {v3, v0}, Ll/᩻ۖܽ;->֫(C)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 3

    const/4 v0, 0x0

    .line 107
    iget-object v1, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    if-nez p1, :cond_0

    .line 108
    invoke-virtual {v1, v0}, Ll/᩻ۖܽ;->writeInt(I)V

    return-void

    .line 110
    :cond_0
    invoke-static {p1}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v2

    .line 111
    invoke-virtual {v1, v2}, Ll/᩻ۖܽ;->writeInt(I)V

    .line 113
    :try_start_0
    iget-object v1, p0, Ll/ܰۜܽ;->᩸:Ll/֫᩷ܽ;

    .line 273
    invoke-static {v1, p1, v0}, Ll/ۛۖܽ;->֫(Ll/֫᩷ܽ;Ljava/lang/CharSequence;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 115
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 137
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 138
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 139
    aget-byte v2, p1, v1

    if-nez v2, :cond_0

    const/16 v2, 0x20

    .line 140
    aput-byte v2, p1, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 22
    :cond_1
    iget-object v1, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    array-length v2, p1

    invoke-virtual {v1, p1, v0, v2}, Ll/᩻ۖܽ;->write([BII)V

    .line 143
    invoke-virtual {p0, v0}, Ll/ܰۜܽ;->writeByte(I)V

    return-void
.end method

.method public final ֫(S)V
    .locals 2

    and-int/lit16 v0, p1, 0xff

    .line 89
    iget-object v1, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v1, v0}, Ll/᩻ۖܽ;->write(I)V

    ushr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    .line 90
    invoke-virtual {v1, p1}, Ll/᩻ۖܽ;->write(I)V

    return-void
.end method

.method public final ֫([I)V
    .locals 4

    .line 87
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    .line 88
    iget-object v3, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v3, v2}, Ll/᩻ۖܽ;->writeInt(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۡ(I)V
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v0, p1}, Ll/᩻ۖܽ;->ۡ(I)V

    return-void
.end method

.method public final ۧ([B)V
    .locals 3

    .line 94
    array-length v0, p1

    iget-object v1, p0, Ll/ܰۜܽ;->᩹:Ll/᩻ۖܽ;

    invoke-virtual {v1, v0}, Ll/᩻ۖܽ;->writeInt(I)V

    const/4 v0, 0x0

    .line 95
    array-length v2, p1

    invoke-virtual {v1, p1, v0, v2}, Ll/᩻ۖܽ;->write([BII)V

    return-void
.end method

.method public final ᩷ܽ()V
    .locals 1

    const/4 v0, 0x4

    .line 189
    invoke-virtual {p0, v0}, Ll/ܰۜܽ;->skipBytes(I)V

    return-void
.end method
