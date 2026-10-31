.class public final Ll/᩺֨ۜ;
.super Ljava/io/FilterInputStream;
.source "K74T"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:J

.field public final ᩹:J


# direct methods
.method public constructor <init>(Ll/᩶۠֫;)V
    .locals 2

    .line 980
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-wide/32 v0, 0x200000

    .line 981
    iput-wide v0, p0, Ll/᩺֨ۜ;->᩹:J

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 6

    .line 986
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return v1

    .line 990
    :cond_0
    iget-wide v1, p0, Ll/᩺֨ۜ;->᩸:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩺֨ۜ;->᩸:J

    iget-wide v3, p0, Ll/᩺֨ۜ;->᩹:J

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1

    return v0

    .line 991
    :cond_1
    new-instance v0, Ll/ۧ۠ۜ;

    invoke-direct {v0}, Ll/ۧ۠ۜ;-><init>()V

    throw v0
.end method

.method public final read([BII)I
    .locals 8

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    int-to-long v0, p3

    .line 1001
    iget-wide v2, p0, Ll/᩺֨ۜ;->᩸:J

    iget-wide v4, p0, Ll/᩺֨ۜ;->᩹:J

    sub-long v2, v4, v2

    const-wide/16 v6, 0x1

    add-long/2addr v2, v6

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 1002
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    if-gtz p1, :cond_1

    goto :goto_0

    .line 1006
    :cond_1
    iget-wide p2, p0, Ll/᩺֨ۜ;->᩸:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/᩺֨ۜ;->᩸:J

    cmp-long v0, p2, v4

    if-gtz v0, :cond_2

    :goto_0
    return p1

    .line 1008
    :cond_2
    new-instance p1, Ll/ۧ۠ۜ;

    invoke-direct {p1}, Ll/ۧ۠ۜ;-><init>()V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
