.class public final Ll/ۛۙᩳ;
.super Ljava/io/InputStream;
.source "B6RA"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ۙ:Ljava/nio/channels/FileChannel;

.field public ᩶:J

.field public ᩸:Z

.field public final ᩹:[B


# direct methods
.method public constructor <init>(Ll/ۨۙᩳ;Ljava/nio/channels/FileChannel;)V
    .locals 0

    .line 129
    iput-object p2, p0, Ll/ۛۙᩳ;->ۙ:Ljava/nio/channels/FileChannel;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 p2, 0x1

    new-array p2, p2, [B

    .line 130
    iput-object p2, p0, Ll/ۛۙᩳ;->᩹:[B

    .line 131
    invoke-static {p1}, Ll/ۨۙᩳ;->֫(Ll/ۨۙᩳ;)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۛۙᩳ;->᩶:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 143
    iget-boolean v0, p0, Ll/ۛۙᩳ;->᩸:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll/ۛۙᩳ;->᩸:Z

    iget-object v0, p0, Ll/ۛۙᩳ;->ۙ:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 133
    iget-object v1, p0, Ll/ۛۙᩳ;->᩹:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۛۙᩳ;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 5

    .line 135
    array-length v0, p1

    invoke-static {p2, p3, v0}, Ll/ۧ۫ᩴ;->checkFromIndexSize(III)I

    .line 136
    iget-boolean v0, p0, Ll/ۛۙᩳ;->᩸:Z

    if-nez v0, :cond_3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 138
    :cond_0
    iget-wide v0, p0, Ll/ۛۙᩳ;->᩶:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    int-to-long v2, p3

    .line 139
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    invoke-static {p1, p2, p3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object p2, p0, Ll/ۛۙᩳ;->ۙ:Ljava/nio/channels/FileChannel;

    invoke-virtual {p2, p1}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    if-lez p1, :cond_2

    .line 141
    iget-wide p2, p0, Ll/ۛۙᩳ;->᩶:J

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Ll/ۛۙᩳ;->᩶:J

    return p1

    .line 140
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Recovery attachment changed during reading"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 136
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery attachment stream is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
