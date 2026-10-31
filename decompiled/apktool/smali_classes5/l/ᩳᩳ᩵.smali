.class public abstract Ll/ᩳᩳ᩵;
.super Ljava/util/concurrent/CountedCompleter;
.source "N673"

# interfaces
.implements Ll/֡ᩳ᩵;


# instance fields
.field public final a:Ll/ܶ۫ᩴ;

.field public final b:Ll/ۡ᩺ᩴ;

.field public final c:J

.field public final d:J

.field public final e:J

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Ll/ܶ۫ᩴ;Ll/ۡ᩺ᩴ;I)V
    .locals 0

    .line 1844
    invoke-direct {p0}, Ljava/util/concurrent/CountedCompleter;-><init>()V

    .line 1846
    iput-object p1, p0, Ll/ᩳᩳ᩵;->a:Ll/ܶ۫ᩴ;

    .line 1847
    iput-object p2, p0, Ll/ᩳᩳ᩵;->b:Ll/ۡ᩺ᩴ;

    .line 1848
    invoke-interface {p1}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide p1

    invoke-static {p1, p2}, Ll/۬ܰᩴ;->e(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ᩳᩳ᩵;->c:J

    const-wide/16 p1, 0x0

    .line 1849
    iput-wide p1, p0, Ll/ᩳᩳ᩵;->d:J

    int-to-long p1, p3

    .line 1850
    iput-wide p1, p0, Ll/ᩳᩳ᩵;->e:J

    return-void
.end method

.method public constructor <init>(Ll/ᩳᩳ᩵;Ll/ܶ۫ᩴ;JJI)V
    .locals 3

    .line 1855
    invoke-direct {p0, p1}, Ljava/util/concurrent/CountedCompleter;-><init>(Ljava/util/concurrent/CountedCompleter;)V

    .line 1857
    iput-object p2, p0, Ll/ᩳᩳ᩵;->a:Ll/ܶ۫ᩴ;

    .line 1858
    iget-object p2, p1, Ll/ᩳᩳ᩵;->b:Ll/ۡ᩺ᩴ;

    iput-object p2, p0, Ll/ᩳᩳ᩵;->b:Ll/ۡ᩺ᩴ;

    .line 1859
    iget-wide p1, p1, Ll/ᩳᩳ᩵;->c:J

    iput-wide p1, p0, Ll/ᩳᩳ᩵;->c:J

    .line 1860
    iput-wide p3, p0, Ll/ᩳᩳ᩵;->d:J

    .line 1861
    iput-wide p5, p0, Ll/ᩳᩳ᩵;->e:J

    const-wide/16 p1, 0x0

    cmp-long v0, p3, p1

    if-ltz v0, :cond_0

    cmp-long v0, p5, p1

    if-ltz v0, :cond_0

    add-long p1, p3, p5

    const-wide/16 v0, 0x1

    sub-long/2addr p1, v0

    int-to-long v0, p7

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    return-void

    .line 1864
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 1866
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    const/4 p6, 0x4

    new-array p6, p6, [Ljava/lang/Object;

    const/4 p7, 0x0

    aput-object p2, p6, p7

    const/4 p2, 0x1

    aput-object p3, p6, p2

    const/4 p2, 0x2

    aput-object p4, p6, p2

    const/4 p2, 0x3

    aput-object p5, p6, p2

    const-string p2, "offset and length interval [%d, %d + %d) is not within array size interval [0, %d)"

    .line 1865
    invoke-static {p2, p6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public abstract a(Ll/ܶ۫ᩴ;JJ)Ll/ᩳᩳ᩵;
.end method

.method public synthetic accept(D)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->m()V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic accept(I)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->t()V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic accept(J)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->u()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final c(J)V
    .locals 3

    .line 1894
    iget-wide v0, p0, Ll/ᩳᩳ᩵;->e:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    .line 1899
    iget-wide p1, p0, Ll/ᩳᩳ᩵;->d:J

    long-to-int p2, p1

    iput p2, p0, Ll/ᩳᩳ᩵;->f:I

    long-to-int p1, v0

    add-int/2addr p2, p1

    .line 1900
    iput p2, p0, Ll/ᩳᩳ᩵;->g:I

    return-void

    .line 1895
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "size passed to Sink.begin exceeds array length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final compute()V
    .locals 10

    .line 1873
    iget-object v6, p0, Ll/ᩳᩳ᩵;->a:Ll/ܶ۫ᩴ;

    move-object v7, p0

    .line 1874
    :goto_0
    invoke-interface {v6}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v0

    iget-wide v2, v7, Ll/ᩳᩳ᩵;->c:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 1875
    invoke-interface {v6}, Ll/ܶ۫ᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 1876
    invoke-virtual {v7, v0}, Ljava/util/concurrent/CountedCompleter;->setPendingCount(I)V

    .line 1877
    invoke-interface {v1}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v8

    .line 1878
    iget-wide v2, v7, Ll/ᩳᩳ᩵;->d:J

    move-object v0, v7

    move-wide v4, v8

    invoke-virtual/range {v0 .. v5}, Ll/ᩳᩳ᩵;->a(Ll/ܶ۫ᩴ;JJ)Ll/ᩳᩳ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->fork()Ljava/util/concurrent/ForkJoinTask;

    .line 1879
    iget-wide v0, v7, Ll/ᩳᩳ᩵;->d:J

    add-long v2, v0, v8

    iget-wide v0, v7, Ll/ᩳᩳ᩵;->e:J

    sub-long v4, v0, v8

    move-object v0, v7

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Ll/ᩳᩳ᩵;->a(Ll/ܶ۫ᩴ;JJ)Ll/ᩳᩳ᩵;

    move-result-object v7

    goto :goto_0

    .line 1886
    :cond_0
    iget-object v0, v7, Ll/ᩳᩳ᩵;->b:Ll/ۡ᩺ᩴ;

    invoke-virtual {v0, v6, v7}, Ll/ۡ᩺ᩴ;->f0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    .line 1887
    invoke-virtual {v7}, Ljava/util/concurrent/CountedCompleter;->propagateCompletion()V

    return-void
.end method

.method public final synthetic end()V
    .locals 0

    return-void
.end method

.method public final synthetic f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
