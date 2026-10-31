.class public final Ll/۟ܺ᩻;
.super Ljava/io/InputStream;
.source "880P"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ۙ:Ljava/io/InputStream;

.field public final ᩶:J

.field public ᩸:J

.field public ᩹:Z


# direct methods
.method public constructor <init>(JLjava/io/InputStream;)V
    .locals 3

    .line 22
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    if-eqz p3, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 29
    iput-object p3, p0, Ll/۟ܺ᩻;->ۙ:Ljava/io/InputStream;

    .line 30
    iput-wide p1, p0, Ll/۟ܺ᩻;->᩶:J

    .line 31
    iput-wide v0, p0, Ll/۟ܺ᩻;->᩸:J

    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Ll/۟ܺ᩻;->᩹:Z

    return-void

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Max size cannot be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Input stream cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final available()I
    .locals 4

    .line 107
    iget-boolean v0, p0, Ll/۟ܺ᩻;->᩹:Z

    if-nez v0, :cond_0

    .line 111
    iget-wide v0, p0, Ll/۟ܺ᩻;->᩶:J

    iget-wide v2, p0, Ll/۟ܺ᩻;->᩸:J

    sub-long/2addr v0, v2

    .line 112
    iget-object v2, p0, Ll/۟ܺ᩻;->ۙ:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v2

    int-to-long v2, v2

    .line 113
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    return v1

    .line 108
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 1

    .line 118
    iget-boolean v0, p0, Ll/۟ܺ᩻;->᩹:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 119
    iput-boolean v0, p0, Ll/۟ܺ᩻;->᩹:Z

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 6

    .line 37
    iget-boolean v0, p0, Ll/۟ܺ᩻;->᩹:Z

    if-nez v0, :cond_2

    .line 41
    iget-wide v0, p0, Ll/۟ܺ᩻;->᩸:J

    iget-wide v2, p0, Ll/۟ܺ᩻;->᩶:J

    const/4 v4, -0x1

    cmp-long v5, v0, v2

    if-ltz v5, :cond_0

    return v4

    .line 45
    :cond_0
    iget-object v0, p0, Ll/۟ܺ᩻;->ۙ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-eq v0, v4, :cond_1

    .line 47
    iget-wide v1, p0, Ll/۟ܺ᩻;->᩸:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/۟ܺ᩻;->᩸:J

    :cond_1
    return v0

    .line 38
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 54
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/۟ܺ᩻;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 5

    .line 59
    iget-boolean v0, p0, Ll/۟ܺ᩻;->᩹:Z

    if-nez v0, :cond_5

    if-eqz p1, :cond_4

    if-ltz p2, :cond_3

    if-ltz p3, :cond_3

    .line 66
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 73
    :cond_0
    iget-wide v0, p0, Ll/۟ܺ᩻;->᩸:J

    iget-wide v2, p0, Ll/۟ܺ᩻;->᩶:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    sub-long/2addr v2, v0

    int-to-long v0, p3

    .line 79
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    .line 81
    iget-object v0, p0, Ll/۟ܺ᩻;->ۙ:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_2

    .line 83
    iget-wide p2, p0, Ll/۟ܺ᩻;->᩸:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/۟ܺ᩻;->᩸:J

    :cond_2
    return p1

    .line 67
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 64
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Buffer cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 60
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final skip(J)J
    .locals 4

    .line 90
    iget-boolean v0, p0, Ll/۟ܺ᩻;->᩹:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    return-wide v0

    .line 98
    :cond_0
    iget-wide v0, p0, Ll/۟ܺ᩻;->᩶:J

    iget-wide v2, p0, Ll/۟ܺ᩻;->᩸:J

    sub-long/2addr v0, v2

    .line 99
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    .line 100
    iget-object v0, p0, Ll/۟ܺ᩻;->ۙ:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    .line 101
    iget-wide v0, p0, Ll/۟ܺ᩻;->᩸:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/۟ܺ᩻;->᩸:J

    return-wide p1

    .line 91
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream is closed"

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

.method public final ֫()J
    .locals 2

    .line 127
    iget-wide v0, p0, Ll/۟ܺ᩻;->᩸:J

    return-wide v0
.end method
