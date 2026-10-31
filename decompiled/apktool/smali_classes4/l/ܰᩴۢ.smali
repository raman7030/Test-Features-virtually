.class public final Ll/ܰᩴۢ;
.super Ljava/io/InputStream;
.source "V7BB"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:J

.field public final synthetic ᩹:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(JLjava/io/InputStream;)V
    .locals 2

    .line 214
    iput-object p3, p0, Ll/ܰᩴۢ;->᩹:Ljava/io/InputStream;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-wide/16 v0, 0x0

    .line 215
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ܰᩴۢ;->᩸:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 243
    iget-object v0, p0, Ll/ܰᩴۢ;->᩹:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final read()I
    .locals 6

    .line 219
    iget-wide v0, p0, Ll/ܰᩴۢ;->᩸:J

    const-wide/16 v2, 0x0

    const/4 v4, -0x1

    cmp-long v5, v0, v2

    if-gtz v5, :cond_0

    return v4

    .line 222
    :cond_0
    iget-object v0, p0, Ll/ܰᩴۢ;->᩹:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-eq v0, v4, :cond_1

    .line 224
    iget-wide v1, p0, Ll/ܰᩴۢ;->᩸:J

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ll/ܰᩴۢ;->᩸:J

    :cond_1
    return v0
.end method

.method public final read([BII)I
    .locals 5

    .line 231
    iget-wide v0, p0, Ll/ܰᩴۢ;->᩸:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    int-to-long v2, p3

    .line 234
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    iget-object v0, p0, Ll/ܰᩴۢ;->᩹:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_1

    .line 236
    iget-wide p2, p0, Ll/ܰᩴۢ;->᩸:J

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Ll/ܰᩴۢ;->᩸:J

    :cond_1
    return p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
