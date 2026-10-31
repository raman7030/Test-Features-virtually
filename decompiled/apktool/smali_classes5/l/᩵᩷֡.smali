.class public abstract Ll/᩵᩷֡;
.super Ljava/io/FilterInputStream;
.source "E8EY"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:J

.field public final ᩹:[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 1

    .line 80
    sget v0, Ll/ۡۢ֡;->֫:I

    .line 241
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    if-nez p2, :cond_0

    goto :goto_0

    .line 254
    :cond_0
    invoke-static {p2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    .line 68
    :goto_0
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p1, 0x1

    new-array p1, p1, [B

    .line 50
    iput-object p1, p0, Ll/᩵᩷֡;->᩹:[B

    if-nez v0, :cond_1

    .line 217
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    :cond_1
    return-void
.end method


# virtual methods
.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 202
    iget-object v1, p0, Ll/᩵᩷֡;->᩹:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    .line 203
    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
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

    .line 125
    iget-wide v0, p0, Ll/᩵᩷֡;->᩸:J

    return-wide v0
.end method

.method public final ֫(I)V
    .locals 2

    int-to-long v0, p1

    .line 103
    invoke-virtual {p0, v0, v1}, Ll/᩵᩷֡;->ۧ(J)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 3

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    .line 114
    iget-wide v0, p0, Ll/᩵᩷֡;->᩸:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/᩵᩷֡;->᩸:J

    :cond_0
    return-void
.end method

.method public final ᩳ(J)V
    .locals 2

    .line 187
    iget-wide v0, p0, Ll/᩵᩷֡;->᩸:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Ll/᩵᩷֡;->᩸:J

    return-void
.end method
