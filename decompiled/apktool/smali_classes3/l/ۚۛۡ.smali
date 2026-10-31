.class public final Ll/ۚۛۡ;
.super Ljava/io/InputStream;
.source "G8BC"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 19
    iput-wide p1, p0, Ll/ۚۛۡ;->᩸:J

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 5

    .line 50
    iget-wide v0, p0, Ll/ۚۛۡ;->᩸:J

    const-wide/32 v2, 0xffff

    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    long-to-int v1, v0

    return v1

    :cond_0
    const v0, 0xffff

    return v0
.end method

.method public final read()I
    .locals 5

    .line 24
    iget-wide v0, p0, Ll/ۚۛۡ;->᩸:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    .line 27
    iput-wide v0, p0, Ll/ۚۛۡ;->᩸:J

    const/4 v0, 0x0

    return v0
.end method

.method public final read([BII)I
    .locals 5

    .line 33
    iget-wide v0, p0, Ll/ۚۛۡ;->᩸:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    int-to-long v2, p3

    cmp-long v4, v2, v0

    if-lez v4, :cond_1

    long-to-int p3, v0

    :cond_1
    add-int v0, p2, p3

    const/4 v1, 0x0

    .line 43
    invoke-static {p1, p2, v0, v1}, Ljava/util/Arrays;->fill([BIIB)V

    .line 44
    iget-wide p1, p0, Ll/ۚۛۡ;->᩸:J

    int-to-long v0, p3

    sub-long/2addr p1, v0

    iput-wide p1, p0, Ll/ۚۛۡ;->᩸:J

    return p3
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
