.class public final Ll/ۧ᩶ᩳ;
.super Ljava/io/InputStream;
.source "V6SW"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ۙ:Ljava/io/InputStream;

.field public ᩶:J

.field public ᩸:Z

.field public final ᩹:[B


# direct methods
.method public constructor <init>(JLjava/io/InputStream;)V
    .locals 1

    .line 186
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 183
    iput-object v0, p0, Ll/ۧ᩶ᩳ;->᩹:[B

    const/4 v0, 0x1

    .line 185
    iput-boolean v0, p0, Ll/ۧ᩶ᩳ;->᩸:Z

    .line 186
    iput-object p3, p0, Ll/ۧ᩶ᩳ;->ۙ:Ljava/io/InputStream;

    iput-wide p1, p0, Ll/ۧ᩶ᩳ;->᩶:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 212
    iput-boolean v0, p0, Ll/ۧ᩶ᩳ;->᩸:Z

    return-void
.end method

.method public final read()I
    .locals 5

    .line 188
    iget-boolean v0, p0, Ll/ۧ᩶ᩳ;->᩸:Z

    if-eqz v0, :cond_2

    .line 189
    iget-wide v0, p0, Ll/ۧ᩶ᩳ;->᩶:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, -0x1

    return v0

    .line 190
    :cond_0
    iget-object v0, p0, Ll/ۧ᩶ᩳ;->ۙ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_1

    .line 192
    iget-wide v1, p0, Ll/ۧ᩶ᩳ;->᩶:J

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۧ᩶ᩳ;->᩶:J

    return v0

    .line 191
    :cond_1
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Truncated legacy app state field"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 188
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Legacy app state field is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([BII)I
    .locals 5

    .line 195
    array-length v0, p1

    invoke-static {p2, p3, v0}, Ll/ۧ۫ᩴ;->checkFromIndexSize(III)I

    .line 196
    iget-boolean v0, p0, Ll/ۧ᩶ᩳ;->᩸:Z

    if-eqz v0, :cond_3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 198
    :cond_0
    iget-wide v0, p0, Ll/ۧ᩶ᩳ;->᩶:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    int-to-long v2, p3

    .line 199
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    .line 200
    iget-object v0, p0, Ll/ۧ᩶ᩳ;->ۙ:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_2

    if-gt p1, p3, :cond_2

    .line 202
    iget-wide p2, p0, Ll/ۧ᩶ᩳ;->᩶:J

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Ll/ۧ᩶ᩳ;->᩶:J

    return p1

    .line 201
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Truncated or stalled legacy app state field"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 196
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Legacy app state field is closed"

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

.method public final ֫()I
    .locals 1

    const/4 v0, 0x4

    .line 210
    invoke-virtual {p0, v0}, Ll/ۧ᩶ᩳ;->֫(I)Ll/۬ۜܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Ll/۬ۜܽ;
    .locals 5

    int-to-long v0, p1

    .line 205
    iget-wide v2, p0, Ll/ۧ᩶ᩳ;->᩶:J

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    const/4 v0, 0x0

    .line 207
    :goto_0
    iget-object v1, p0, Ll/ۧ᩶ᩳ;->᩹:[B

    if-eq v0, p1, :cond_0

    sub-int v2, p1, v0

    invoke-virtual {p0, v1, v0, v2}, Ll/ۧ᩶ᩳ;->read([BII)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    .line 208
    :cond_0
    new-instance p1, Ll/۬ۜܽ;

    invoke-direct {p1, v1}, Ll/۬ۜܽ;-><init>([B)V

    return-object p1

    .line 205
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    const-string v0, "Truncated legacy app state number"

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
