.class public final Ll/᩺ܰۡ;
.super Ljava/io/InputStream;
.source "Q73C"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ۗ:Ljava/io/InputStream;

.field public final ۙ:Ll/ۗ᩺ۡ;

.field public ۬:Z

.field public final ᩶:Ljava/util/zip/CRC32;

.field public final ᩸:Ljava/io/InputStream;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;Ll/᩵ܰۡ;Z)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 31
    iput-object p1, p0, Ll/᩺ܰۡ;->ۙ:Ll/ۗ᩺ۡ;

    .line 32
    iput-object p2, p0, Ll/᩺ܰۡ;->ۗ:Ljava/io/InputStream;

    .line 33
    iput-object p3, p0, Ll/᩺ܰۡ;->᩸:Ljava/io/InputStream;

    if-eqz p4, :cond_0

    .line 34
    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/᩺ܰۡ;->᩶:Ljava/util/zip/CRC32;

    return-void
.end method

.method private ֫()V
    .locals 8

    .line 80
    iget-boolean v0, p0, Ll/᩺ܰۡ;->۬:Z

    if-eqz v0, :cond_0

    return-void

    .line 83
    :cond_0
    iget-object v0, p0, Ll/᩺ܰۡ;->᩸:Ljava/io/InputStream;

    if-eqz v0, :cond_1

    const/16 v1, 0x2000

    new-array v1, v1, [B

    .line 85
    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 89
    :cond_1
    iget-wide v0, p0, Ll/᩺ܰۡ;->᩹:J

    iget-object v2, p0, Ll/᩺ܰۡ;->ۙ:Ll/ۗ᩺ۡ;

    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v3

    const/4 v5, 0x1

    cmp-long v6, v0, v3

    if-nez v6, :cond_4

    .line 92
    iget-object v0, p0, Ll/᩺ܰۡ;->᩶:Ljava/util/zip/CRC32;

    if-eqz v0, :cond_3

    .line 93
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    .line 94
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->ۜ()I

    move-result v0

    if-ne v0, v1, :cond_2

    goto :goto_1

    .line 95
    :cond_2
    invoke-static {v2, v1}, Ll/ۛܰۡ;->֫(Ll/ۗ᩺ۡ;I)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 98
    :cond_3
    :goto_1
    iput-boolean v5, p0, Ll/᩺ܰۡ;->۬:Z

    return-void

    .line 90
    :cond_4
    iget-wide v0, p0, Ll/᩺ܰۡ;->᩹:J

    .line 103
    new-instance v3, Ljava/util/zip/ZipException;

    .line 105
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v2, v6

    aput-object v0, v2, v5

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const-string v0, "Bad uncompressed size: expected=%d, got=%d (%s)"

    .line 103
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 90
    throw v3
.end method

.method private ֫(I)V
    .locals 9

    .line 67
    iget-object v0, p0, Ll/᩺ܰۡ;->ۙ:Ll/ۗ᩺ۡ;

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v1

    .line 68
    iget-wide v3, p0, Ll/᩺ܰۡ;->᩹:J

    int-to-long v5, p1

    const-wide v7, 0x7fffffffffffffffL

    sub-long/2addr v7, v5

    cmp-long p1, v3, v7

    if-gtz p1, :cond_1

    add-long/2addr v3, v5

    cmp-long p1, v3, v1

    if-gtz p1, :cond_0

    .line 75
    iput-wide v3, p0, Ll/᩺ܰۡ;->᩹:J

    return-void

    .line 103
    :cond_0
    new-instance p1, Ljava/util/zip/ZipException;

    .line 105
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const-string v0, "Bad uncompressed size: expected=%d, got=%d (%s)"

    .line 103
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 73
    throw p1

    .line 69
    :cond_1
    new-instance p1, Ljava/util/zip/ZipException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Uncompressed size overflow ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/᩺ܰۡ;->ۗ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final read()I
    .locals 2

    .line 39
    iget-object v0, p0, Ll/᩺ܰۡ;->ۗ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 41
    invoke-direct {p0}, Ll/᩺ܰۡ;->֫()V

    return v0

    :cond_0
    const/4 v1, 0x1

    .line 43
    invoke-direct {p0, v1}, Ll/᩺ܰۡ;->֫(I)V

    .line 44
    iget-object v1, p0, Ll/᩺ܰۡ;->᩶:Ljava/util/zip/CRC32;

    if-eqz v1, :cond_1

    .line 45
    invoke-virtual {v1, v0}, Ljava/util/zip/CRC32;->update(I)V

    :cond_1
    return v0
.end method

.method public final read([BII)I
    .locals 1

    .line 53
    iget-object v0, p0, Ll/᩺ܰۡ;->ۗ:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p3

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 55
    invoke-direct {p0}, Ll/᩺ܰۡ;->֫()V

    return p3

    :cond_0
    if-lez p3, :cond_1

    .line 57
    invoke-direct {p0, p3}, Ll/᩺ܰۡ;->֫(I)V

    .line 58
    iget-object v0, p0, Ll/᩺ܰۡ;->᩶:Ljava/util/zip/CRC32;

    if-eqz v0, :cond_1

    .line 59
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

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
