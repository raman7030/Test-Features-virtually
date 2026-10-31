.class public Ll/᩷۫ܳ;
.super Ljava/lang/Object;
.source "3AH0"


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۧ:Ljava/util/concurrent/atomic/AtomicLong;

.field public ܽ:I

.field public ᩳ:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ll/᩷۫ܳ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/᩷۫ܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ll/᩷۫ܳ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/᩷۫ܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    iput-wide p2, p0, Ll/᩷۫ܳ;->ᩳ:J

    .line 19
    iput p1, p0, Ll/᩷۫ܳ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 23
    iget-wide v0, p0, Ll/᩷۫ܳ;->ᩳ:J

    .line 31
    iget-object v2, p0, Ll/᩷۫ܳ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 43
    invoke-static {v0, v1}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(J)V
    .locals 3

    .line 57
    iget-object v0, p0, Ll/᩷۫ܳ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide p1

    .line 58
    iget-wide v0, p0, Ll/᩷۫ܳ;->ᩳ:J

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 59
    iput-wide p1, p0, Ll/᩷۫ܳ;->ᩳ:J

    :cond_0
    return-void
.end method

.method public final ۜ()J
    .locals 2

    .line 23
    iget-wide v0, p0, Ll/᩷۫ܳ;->ᩳ:J

    return-wide v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 23
    iget-wide v0, p0, Ll/᩷۫ܳ;->ᩳ:J

    .line 47
    invoke-static {v0, v1}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()I
    .locals 2

    .line 27
    iget v0, p0, Ll/᩷۫ܳ;->ܽ:I

    .line 35
    iget-object v1, p0, Ll/᩷۫ܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ܽ()I
    .locals 5

    .line 51
    iget-wide v0, p0, Ll/᩷۫ܳ;->ᩳ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x0

    return v0

    .line 53
    :cond_0
    iget-object v0, p0, Ll/᩷۫ܳ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x64

    mul-long v0, v0, v2

    iget-wide v2, p0, Ll/᩷۫ܳ;->ᩳ:J

    div-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method

.method public final ܿ()J
    .locals 2

    .line 31
    iget-object v0, p0, Ll/᩷۫ܳ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 35
    iget-object v0, p0, Ll/᩷۫ܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final ᩷()V
    .locals 1

    .line 64
    iget-object v0, p0, Ll/᩷۫ܳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final ᩻()I
    .locals 1

    .line 27
    iget v0, p0, Ll/᩷۫ܳ;->ܽ:I

    return v0
.end method
