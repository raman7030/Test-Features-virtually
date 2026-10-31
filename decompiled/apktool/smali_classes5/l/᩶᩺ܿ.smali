.class public final Ll/᩶᩺ܿ;
.super Ljava/io/FilterInputStream;
.source "P70J"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩶:J

.field public ᩸:Z

.field public final ᩹:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Ljava/io/BufferedInputStream;)V
    .locals 0

    .line 528
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 523
    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Ll/᩶᩺ܿ;->᩹:Ljava/util/zip/CRC32;

    const/4 p1, 0x1

    .line 524
    iput-boolean p1, p0, Ll/᩶᩺ܿ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final getPosition()J
    .locals 2

    .line 561
    iget-wide v0, p0, Ll/᩶᩺ܿ;->᩶:J

    return-wide v0
.end method

.method public final read()I
    .locals 5

    .line 533
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 534
    iget-boolean v1, p0, Ll/᩶᩺ܿ;->᩸:Z

    if-eqz v1, :cond_0

    if-ltz v0, :cond_0

    .line 535
    iget-object v1, p0, Ll/᩶᩺ܿ;->᩹:Ljava/util/zip/CRC32;

    invoke-virtual {v1, v0}, Ljava/util/zip/CRC32;->update(I)V

    :cond_0
    if-ltz v0, :cond_1

    .line 538
    iget-wide v1, p0, Ll/᩶᩺ܿ;->᩶:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩶᩺ܿ;->᩶:J

    :cond_1
    return v0
.end method

.method public final read([BII)I
    .locals 2

    .line 545
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p3

    .line 546
    iget-boolean v0, p0, Ll/᩶᩺ܿ;->᩸:Z

    if-eqz v0, :cond_0

    if-lez p3, :cond_0

    .line 547
    iget-object v0, p0, Ll/᩶᩺ܿ;->᩹:Ljava/util/zip/CRC32;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    :cond_0
    if-lez p3, :cond_1

    .line 550
    iget-wide p1, p0, Ll/᩶᩺ܿ;->᩶:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩶᩺ܿ;->᩶:J

    :cond_1
    return p3
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()J
    .locals 2

    .line 556
    iget-object v0, p0, Ll/᩶᩺ܿ;->᩹:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 565
    iput-boolean v0, p0, Ll/᩶᩺ܿ;->᩸:Z

    return-void
.end method
