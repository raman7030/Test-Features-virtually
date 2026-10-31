.class public final Ll/ۖ֨᩻;
.super Ljava/io/InputStream;
.source "M9Q4"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩶:Ll/۠ۖܽ;

.field public ᩸:J

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/۠ۖܽ;JJ)V
    .locals 0

    .line 783
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 784
    iput-object p1, p0, Ll/ۖ֨᩻;->᩶:Ll/۠ۖܽ;

    .line 785
    iput-wide p2, p0, Ll/ۖ֨᩻;->᩹:J

    .line 786
    iput-wide p4, p0, Ll/ۖ֨᩻;->᩸:J

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 5

    .line 815
    iget-wide v0, p0, Ll/ۖ֨᩻;->᩸:J

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const v0, 0x7fffffff

    return v0

    :cond_0
    long-to-int v1, v0

    return v1
.end method

.method public final read()I
    .locals 1

    .line 791
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final read([BII)I
    .locals 5

    .line 796
    iget-wide v0, p0, Ll/ۖ֨᩻;->᩸:J

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

    .line 802
    :cond_1
    iget-object v0, p0, Ll/ۖ֨᩻;->᩶:Ll/۠ۖܽ;

    monitor-enter v0

    .line 803
    :try_start_0
    iget-object v1, p0, Ll/ۖ֨᩻;->᩶:Ll/۠ۖܽ;

    iget-wide v2, p0, Ll/ۖ֨᩻;->᩹:J

    invoke-interface {v1, v2, v3}, Ll/۠ۖܽ;->seek(J)V

    .line 804
    iget-object v1, p0, Ll/ۖ֨᩻;->᩶:Ll/۠ۖܽ;

    invoke-interface {v1, p1, p2, p3}, Ll/۠ۖܽ;->read([BII)I

    move-result p1

    if-lez p1, :cond_2

    .line 806
    iget-wide p2, p0, Ll/ۖ֨᩻;->᩸:J

    int-to-long v1, p1

    sub-long/2addr p2, v1

    iput-wide p2, p0, Ll/ۖ֨᩻;->᩸:J

    .line 807
    iget-wide p2, p0, Ll/ۖ֨᩻;->᩹:J

    add-long/2addr p2, v1

    iput-wide p2, p0, Ll/ۖ֨᩻;->᩹:J

    .line 809
    :cond_2
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 810
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
