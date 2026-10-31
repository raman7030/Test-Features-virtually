.class public final Ll/ۙ᩺ۜ;
.super Ljava/io/OutputStream;
.source "P6N0"


# instance fields
.field public final ۙ:Ljava/io/FileOutputStream;

.field public final ᩶:J

.field public final ᩸:Ll/ۜܶۜ;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ljava/io/File;JLl/ۜܶۜ;)V
    .locals 1

    .line 170
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 171
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Ll/ۙ᩺ۜ;->ۙ:Ljava/io/FileOutputStream;

    .line 172
    iput-wide p2, p0, Ll/ۙ᩺ۜ;->᩶:J

    .line 173
    iput-object p4, p0, Ll/ۙ᩺ۜ;->᩸:Ll/ۜܶۜ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 200
    iget-object v0, p0, Ll/ۙ᩺ۜ;->ۙ:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 199
    iget-object v0, p0, Ll/ۙ᩺ۜ;->ۙ:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 7

    .line 195
    iget-object v0, p0, Ll/ۙ᩺ۜ;->᩸:Ll/ۜܶۜ;

    invoke-static {v0}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    const/4 v1, 0x1

    int-to-long v1, v1

    .line 196
    iget-wide v3, p0, Ll/ۙ᩺ۜ;->᩶:J

    iget-wide v5, p0, Ll/ۙ᩺ۜ;->᩹:J

    sub-long/2addr v3, v5

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    .line 179
    iget-object v1, p0, Ll/ۙ᩺ۜ;->ۙ:Ljava/io/FileOutputStream;

    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write(I)V

    .line 180
    iget-wide v1, p0, Ll/ۙ᩺ۜ;->᩹:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۙ᩺ۜ;->᩹:J

    .line 181
    invoke-static {v0}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    return-void

    .line 196
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Image export exceeds byte limit"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([BII)V
    .locals 7

    if-ltz p2, :cond_1

    if-ltz p3, :cond_1

    .line 186
    array-length v0, p1

    sub-int/2addr v0, p3

    if-gt p2, v0, :cond_1

    .line 195
    iget-object v0, p0, Ll/ۙ᩺ۜ;->᩸:Ll/ۜܶۜ;

    invoke-static {v0}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    int-to-long v1, p3

    .line 196
    iget-wide v3, p0, Ll/ۙ᩺ۜ;->᩶:J

    iget-wide v5, p0, Ll/ۙ᩺ۜ;->᩹:J

    sub-long/2addr v3, v5

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    .line 189
    iget-object v3, p0, Ll/ۙ᩺ۜ;->ۙ:Ljava/io/FileOutputStream;

    invoke-virtual {v3, p1, p2, p3}, Ljava/io/FileOutputStream;->write([BII)V

    .line 190
    iget-wide p1, p0, Ll/ۙ᩺ۜ;->᩹:J

    add-long/2addr p1, v1

    iput-wide p1, p0, Ll/ۙ᩺ۜ;->᩹:J

    .line 191
    invoke-static {v0}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    return-void

    .line 196
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Image export exceeds byte limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 187
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
