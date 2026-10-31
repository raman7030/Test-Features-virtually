.class public final Ll/᩵ۛۡ;
.super Ljava/lang/Object;
.source "91U1"


# instance fields
.field public ֫:Ll/ܿۖ᩷;

.field public final ۧ:Ljava/util/concurrent/atomic/AtomicLong;

.field public ܽ:Ll/ۖۛۡ;

.field public final ܿ:J

.field public final ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(J)V
    .locals 3

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Ll/᩵ۛۡ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/᩵ۛۡ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    iput-wide p1, p0, Ll/᩵ۛۡ;->ܿ:J

    return-void
.end method

.method public static ֫(JJ)I
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-wide/16 v0, 0x64

    mul-long p0, p0, v0

    .line 108
    div-long/2addr p0, p2

    long-to-int p1, p0

    return p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 87
    iget-object v0, p0, Ll/᩵ۛۡ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final ֫(J)V
    .locals 5

    const-wide/16 v0, 0x0

    .line 69
    iget-wide v2, p0, Ll/᩵ۛۡ;->ܿ:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    iget-object v0, p0, Ll/᩵ۛۡ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide p1

    const-wide/16 v0, 0x64

    mul-long p1, p1, v0

    .line 72
    div-long/2addr p1, v2

    long-to-int p2, p1

    const/16 p1, 0x64

    if-le p2, p1, :cond_1

    const/16 p2, 0x64

    .line 76
    :cond_1
    iget-object p1, p0, Ll/᩵ۛۡ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result p1

    if-eq p2, p1, :cond_2

    .line 77
    iget-object p1, p0, Ll/᩵ۛۡ;->ܽ:Ll/ۖۛۡ;

    if-eqz p1, :cond_2

    .line 79
    invoke-interface {p1, p2}, Ll/ۖۛۡ;->֫(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ۖۛۡ;)V
    .locals 1

    .line 21
    iput-object p1, p0, Ll/᩵ۛۡ;->ܽ:Ll/ۖۛۡ;

    .line 22
    instance-of v0, p1, Ll/ܿۖ᩷;

    if-eqz v0, :cond_0

    .line 23
    check-cast p1, Ll/ܿۖ᩷;

    iput-object p1, p0, Ll/᩵ۛۡ;->֫:Ll/ܿۖ᩷;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Ll/᩵ۛۡ;->֫:Ll/ܿۖ᩷;

    return-void
.end method

.method public final ֫(I)Z
    .locals 7

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 48
    iget-wide v3, p0, Ll/᩵ۛۡ;->ܿ:J

    cmp-long v5, v3, v0

    if-nez v5, :cond_0

    return v2

    .line 50
    :cond_0
    iget-object v0, p0, Ll/᩵ۛۡ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    int-to-long v5, p1

    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v0

    const-wide/16 v5, 0x64

    mul-long v0, v0, v5

    .line 51
    div-long/2addr v0, v3

    long-to-int p1, v0

    const/16 v0, 0x64

    if-le p1, v0, :cond_1

    const/16 p1, 0x64

    .line 55
    :cond_1
    iget-object v0, p0, Ll/᩵ۛۡ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result v0

    if-eq p1, v0, :cond_3

    .line 56
    iget-object v0, p0, Ll/᩵ۛۡ;->ܽ:Ll/ۖۛۡ;

    if-eqz v0, :cond_2

    .line 58
    invoke-interface {v0, p1}, Ll/ۖۛۡ;->֫(I)V

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    return v2
.end method

.method public final ۧ(Ll/ۖۛۡ;)V
    .locals 1

    .line 31
    new-instance v0, Ll/ۜۛۡ;

    invoke-direct {v0, p1}, Ll/ۜۛۡ;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩵ۛۡ;->ܽ:Ll/ۖۛۡ;

    .line 32
    instance-of v0, p1, Ll/ܿۖ᩷;

    if-eqz v0, :cond_0

    .line 33
    check-cast p1, Ll/ܿۖ᩷;

    iput-object p1, p0, Ll/᩵ۛۡ;->֫:Ll/ܿۖ᩷;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Ll/᩵ۛۡ;->֫:Ll/ܿۖ᩷;

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 91
    iget-object v0, p0, Ll/᩵ۛۡ;->֫:Ll/ܿۖ᩷;

    if-eqz v0, :cond_0

    .line 92
    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
