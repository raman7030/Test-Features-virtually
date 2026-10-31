.class public final Ll/ܰ᩵ܳ;
.super Ljava/lang/Object;
.source "473S"


# instance fields
.field public final ֫:Ll/֨ۚܳ;

.field public final ۧ:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ܽ:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ᩳ:J


# direct methods
.method public constructor <init>(JLl/֨ۚܳ;)V
    .locals 1

    .line 964
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 959
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ll/ܰ᩵ܳ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 960
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ll/ܰ᩵ܳ;->ܽ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 965
    iput-wide p1, p0, Ll/ܰ᩵ܳ;->ᩳ:J

    .line 966
    iput-object p3, p0, Ll/ܰ᩵ܳ;->֫:Ll/֨ۚܳ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 996
    iget-object v0, p0, Ll/ܰ᩵ܳ;->ܽ:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method

.method public final ֫(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 971
    new-instance v0, Ll/ۨ᩵ܳ;

    invoke-direct {v0, p1, p2}, Ll/ۨ᩵ܳ;-><init>(J)V

    iget-object p1, p0, Ll/ܰ᩵ܳ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {p1, v0}, Ll/ۜۤᩴ;->updateAndGet(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/function/LongUnaryOperator;)J

    :cond_0
    return-void
.end method

.method public final ֫(JJ)V
    .locals 3

    .line 983
    iget-object v0, p0, Ll/ܰ᩵ܳ;->ܽ:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    cmp-long v0, p1, v1

    if-nez v0, :cond_0

    const-wide/16 p3, 0x1

    .line 984
    :cond_0
    invoke-virtual {p0, p3, p4}, Ll/ܰ᩵ܳ;->֫(J)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 1000
    iget-object v0, p0, Ll/ܰ᩵ܳ;->ܽ:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 1001
    iget-object v0, p0, Ll/ܰ᩵ܳ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    iget-wide v1, p0, Ll/ܰ᩵ܳ;->ᩳ:J

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method

.method public final ۧ(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 990
    new-instance v0, Ll/᩺᩵ܳ;

    invoke-direct {v0, p1, p2}, Ll/᩺᩵ܳ;-><init>(J)V

    iget-object p1, p0, Ll/ܰ᩵ܳ;->ܽ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {p1, v0}, Ll/ۜۤᩴ;->updateAndGet(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/function/LongUnaryOperator;)J

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 5

    .line 1005
    iget-object v0, p0, Ll/ܰ᩵ܳ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-object v2, p0, Ll/ܰ᩵ܳ;->ܽ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll/ܿ֡ܳ;->֫(JJ)J

    move-result-wide v0

    .line 1006
    iget-wide v2, p0, Ll/ܰ᩵ܳ;->ᩳ:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 188
    iget-object v4, p0, Ll/ܰ᩵ܳ;->֫:Ll/֨ۚܳ;

    invoke-virtual {v4, v0, v1, v2, v3}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    return-void
.end method
