.class public final Ll/۠ܺۜ;
.super Ljava/io/FilterInputStream;
.source "16WT"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩸:Ljava/io/OutputStream;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;JLjava/io/OutputStream;)V
    .locals 0

    .line 133
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 134
    iput-object p4, p0, Ll/۠ܺۜ;->᩸:Ljava/io/OutputStream;

    .line 135
    iput-wide p2, p0, Ll/۠ܺۜ;->᩹:J

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 160
    invoke-virtual {p0, v1, v2, v0}, Ll/۠ܺۜ;->read([BII)I

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
    .locals 7

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 142
    :cond_0
    :try_start_0
    invoke-static {}, Ll/᩸ܺۜ;->֫()V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    iget-wide v0, p0, Ll/۠ܺۜ;->᩹:J

    const-wide/16 v2, 0x0

    const/4 v4, -0x1

    cmp-long v5, v0, v2

    if-nez v5, :cond_2

    .line 147
    iget-object p1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result p1

    if-ne p1, v4, :cond_1

    return v4

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Source grew during text append"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 150
    :cond_2
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    int-to-long v1, p3

    iget-wide v5, p0, Ll/۠ܺۜ;->᩹:J

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p3, v1

    .line 115
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p3

    if-eqz p3, :cond_3

    move v4, p3

    goto :goto_0

    .line 117
    :cond_3
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result p3

    if-gez p3, :cond_4

    goto :goto_0

    :cond_4
    int-to-byte p3, p3

    .line 119
    aput-byte p3, p1, p2

    const/4 v4, 0x1

    :goto_0
    if-ltz v4, :cond_5

    .line 152
    iget-object p3, p0, Ll/۠ܺۜ;->᩸:Ljava/io/OutputStream;

    invoke-virtual {p3, p1, p2, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 153
    iget-wide p1, p0, Ll/۠ܺۜ;->᩹:J

    int-to-long v0, v4

    sub-long/2addr p1, v0

    iput-wide p1, p0, Ll/۠ܺۜ;->᩹:J

    return v4

    .line 151
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Source ended before its expected size"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    .line 144
    new-instance p2, Ll/֨ܺۜ;

    invoke-direct {p2, p1}, Ll/֨ܺۜ;-><init>(Ll/ۗۛ᩻;)V

    throw p2
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
