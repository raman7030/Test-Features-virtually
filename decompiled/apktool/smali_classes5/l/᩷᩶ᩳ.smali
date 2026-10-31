.class public final Ll/᩷᩶ᩳ;
.super Ljava/io/InputStream;
.source "A6SP"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ۙ:Ll/ۢ᩶ᩳ;

.field public ᩶:J

.field public ᩸:Z

.field public final ᩹:[B


# direct methods
.method public constructor <init>(Ll/ۢ᩶ᩳ;)V
    .locals 0

    .line 198
    iput-object p1, p0, Ll/᩷᩶ᩳ;->ۙ:Ll/ۢ᩶ᩳ;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 p1, 0x1

    new-array p1, p1, [B

    .line 199
    iput-object p1, p0, Ll/᩷᩶ᩳ;->᩹:[B

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    .line 216
    iput-boolean v0, p0, Ll/᩷᩶ᩳ;->᩸:Z

    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 203
    iget-object v1, p0, Ll/᩷᩶ᩳ;->᩹:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/᩷᩶ᩳ;->read([BII)I

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
    .locals 8

    .line 206
    array-length v0, p1

    invoke-static {p2, p3, v0}, Ll/ۧ۫ᩴ;->checkFromIndexSize(III)I

    .line 207
    iget-object v0, p0, Ll/᩷᩶ᩳ;->ۙ:Ll/ۢ᩶ᩳ;

    iget-object v1, v0, Ll/ۢ᩶ᩳ;->ܽ:Ll/ۡ᩶ᩳ;

    invoke-static {v1}, Ll/ۡ᩶ᩳ;->ۧ(Ll/ۡ᩶ᩳ;)V

    .line 208
    iget-boolean v2, p0, Ll/᩷᩶ᩳ;->᩸:Z

    if-nez v2, :cond_3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 210
    :cond_0
    iget-wide v2, p0, Ll/᩷᩶ᩳ;->᩶:J

    invoke-static {v0}, Ll/ۢ᩶ᩳ;->֫(Ll/ۢ᩶ᩳ;)J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    const/4 p1, -0x1

    return p1

    .line 211
    :cond_1
    invoke-static {v1}, Ll/ۡ᩶ᩳ;->֫(Ll/ۡ᩶ᩳ;)Ljava/nio/channels/FileChannel;

    move-result-object v1

    int-to-long v2, p3

    invoke-static {v0}, Ll/ۢ᩶ᩳ;->֫(Ll/ۢ᩶ᩳ;)J

    move-result-wide v4

    iget-wide v6, p0, Ll/᩷᩶ᩳ;->᩶:J

    sub-long/2addr v4, v6

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    invoke-static {p1, p2, p3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {v0}, Ll/ۢ᩶ᩳ;->ۧ(Ll/ۢ᩶ᩳ;)J

    move-result-wide p2

    iget-wide v2, p0, Ll/᩷᩶ᩳ;->᩶:J

    add-long/2addr p2, v2

    invoke-virtual {v1, p1, p2, p3}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    move-result p1

    if-lez p1, :cond_2

    .line 213
    iget-wide p2, p0, Ll/᩷᩶ᩳ;->᩶:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/᩷᩶ᩳ;->᩶:J

    return p1

    .line 212
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Legacy state slice is truncated"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 208
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Legacy state slice is closed"

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
