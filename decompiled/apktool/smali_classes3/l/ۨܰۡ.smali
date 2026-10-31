.class public final Ll/ۨܰۡ;
.super Ljava/io/OutputStream;
.source "Q4GJ"


# instance fields
.field public ᩶:Ljava/io/OutputStream;

.field public ᩸:J

.field public ᩹:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 9
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Ll/ۨܰۡ;->᩹:Ljava/util/zip/CRC32;

    const-wide/16 v0, 0x0

    .line 10
    iput-wide v0, p0, Ll/ۨܰۡ;->᩸:J

    .line 13
    iput-object p1, p0, Ll/ۨܰۡ;->᩶:Ljava/io/OutputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 40
    iget-object v0, p0, Ll/ۨܰۡ;->᩶:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final write(I)V
    .locals 4

    .line 25
    iget-object v0, p0, Ll/ۨܰۡ;->᩶:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 26
    iget-object v0, p0, Ll/ۨܰۡ;->᩹:Ljava/util/zip/CRC32;

    invoke-virtual {v0, p1}, Ljava/util/zip/CRC32;->update(I)V

    .line 27
    iget-wide v0, p0, Ll/ۨܰۡ;->᩸:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۨܰۡ;->᩸:J

    return-void
.end method

.method public final write([BII)V
    .locals 2

    .line 18
    iget-object v0, p0, Ll/ۨܰۡ;->᩶:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 19
    iget-object v0, p0, Ll/ۨܰۡ;->᩹:Ljava/util/zip/CRC32;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 20
    iget-wide p1, p0, Ll/ۨܰۡ;->᩸:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ۨܰۡ;->᩸:J

    return-void
.end method

.method public final ֫()J
    .locals 2

    .line 31
    iget-wide v0, p0, Ll/ۨܰۡ;->᩸:J

    return-wide v0
.end method

.method public final ܽ()I
    .locals 2

    .line 35
    iget-object v0, p0, Ll/ۨܰۡ;->᩹:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method
