.class public final Ll/᩸ۛۜ;
.super Ljava/lang/Object;
.source "L6LG"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/ۨۨۜ;

.field public ۙ:Ljava/io/BufferedInputStream;

.field public final ᩶:Ll/᩺ۨۜ;

.field public final ᩸:Ljava/io/RandomAccessFile;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/᩺ۨۜ;)V
    .locals 3

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/᩸ۛۜ;->᩶:Ll/᩺ۨۜ;

    .line 20
    invoke-virtual {p1}, Ll/᩺ۨۜ;->᩵()Ll/ۨۨۜ;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۛۜ;->ۗ:Ll/ۨۨۜ;

    .line 21
    invoke-virtual {p1}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/RandomAccessFile;

    invoke-virtual {p1}, Ll/᩺ۨۜ;->ۜ()Ljava/io/File;

    move-result-object v1

    const-string v2, "r"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :goto_0
    iput-object v0, p0, Ll/᩸ۛۜ;->᩸:Ljava/io/RandomAccessFile;

    if-nez v0, :cond_1

    .line 22
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {p1}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object p1

    const v1, 0x8000

    invoke-direct {v0, p1, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object v0, p0, Ll/᩸ۛۜ;->ۙ:Ljava/io/BufferedInputStream;

    :cond_1
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 69
    iget-object v0, p0, Ll/᩸ۛۜ;->᩸:Ljava/io/RandomAccessFile;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    return-void

    .line 70
    :cond_0
    iget-object v0, p0, Ll/᩸ۛۜ;->ۙ:Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_1
    return-void
.end method

.method public final ֫(J[BIILl/ܿۖ᩷;)V
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_9

    if-ltz p5, :cond_9

    const-wide/32 v2, 0x10000000

    int-to-long v4, p5

    sub-long/2addr v2, v4

    cmp-long v4, p1, v2

    if-gtz v4, :cond_9

    .line 28
    invoke-static {p6}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 29
    iget-object v2, p0, Ll/᩸ۛۜ;->᩸:Ljava/io/RandomAccessFile;

    const v3, 0x8000

    if-eqz v2, :cond_0

    .line 30
    invoke-virtual {v2, p1, p2}, Ljava/io/RandomAccessFile;->seek(J)V

    :goto_0
    if-lez p5, :cond_8

    .line 32
    invoke-static {p6}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 33
    invoke-static {p5, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 34
    invoke-virtual {v2, p3, p4, p1}, Ljava/io/RandomAccessFile;->readFully([BII)V

    add-int/2addr p4, p1

    sub-int/2addr p5, p1

    goto :goto_0

    .line 39
    :cond_0
    iget-wide v4, p0, Ll/᩸ۛۜ;->᩹:J

    cmp-long v2, p1, v4

    if-gez v2, :cond_1

    .line 40
    iget-object v2, p0, Ll/᩸ۛۜ;->ۗ:Ll/ۨۨۜ;

    iget-object v4, p0, Ll/᩸ۛۜ;->᩶:Ll/᩺ۨۜ;

    invoke-virtual {v4, v2}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 41
    iget-object v2, p0, Ll/᩸ۛۜ;->ۙ:Ljava/io/BufferedInputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 42
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-virtual {v4}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v2, v4, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object v2, p0, Ll/᩸ۛۜ;->ۙ:Ljava/io/BufferedInputStream;

    .line 43
    iput-wide v0, p0, Ll/᩸ۛۜ;->᩹:J

    .line 45
    :cond_1
    :goto_1
    iget-wide v4, p0, Ll/᩸ۛۜ;->᩹:J

    const-string v2, "Truncated animation input"

    cmp-long v6, v4, p1

    if-gez v6, :cond_4

    .line 46
    invoke-static {p6}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 47
    iget-object v4, p0, Ll/᩸ۛۜ;->ۙ:Ljava/io/BufferedInputStream;

    iget-wide v5, p0, Ll/᩸ۛۜ;->᩹:J

    sub-long v5, p1, v5

    const-wide/32 v7, 0x8000

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-nez v6, :cond_3

    .line 49
    iget-object v4, p0, Ll/᩸ۛۜ;->ۙ:Ljava/io/BufferedInputStream;

    invoke-virtual {v4}, Ljava/io/InputStream;->read()I

    move-result v4

    if-ltz v4, :cond_2

    const-wide/16 v4, 0x1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 52
    :cond_3
    :goto_2
    iget-wide v6, p0, Ll/᩸ۛۜ;->᩹:J

    add-long/2addr v6, v4

    iput-wide v6, p0, Ll/᩸ۛۜ;->᩹:J

    goto :goto_1

    :cond_4
    :goto_3
    if-lez p5, :cond_8

    .line 55
    invoke-static {p6}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 56
    iget-object p1, p0, Ll/᩸ۛۜ;->ۙ:Ljava/io/BufferedInputStream;

    invoke-static {p5, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {p1, p3, p4, p2}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-ltz p1, :cond_7

    if-nez p1, :cond_6

    .line 59
    iget-object p1, p0, Ll/᩸ۛۜ;->ۙ:Ljava/io/BufferedInputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result p1

    if-ltz p1, :cond_5

    int-to-byte p1, p1

    .line 61
    aput-byte p1, p3, p4

    const/4 p1, 0x1

    goto :goto_4

    .line 60
    :cond_5
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_4
    add-int/2addr p4, p1

    sub-int/2addr p5, p1

    .line 64
    iget-wide v0, p0, Ll/᩸ۛۜ;->᩹:J

    int-to-long p1, p1

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/᩸ۛۜ;->᩹:J

    goto :goto_3

    .line 57
    :cond_7
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    return-void

    .line 27
    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Animation input exceeds byte limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
