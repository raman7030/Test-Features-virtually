.class public final Ll/ᩴۘ֡;
.super Ljava/lang/Object;
.source "6AIE"


# instance fields
.field public final ֫:Ll/ۧۤᩴ;

.field public final ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ܳ:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ܽ:Ll/᩶ۘ֡;

.field public final ܿ:Ljava/lang/Object;

.field public ᩳ:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/ᩴۘ֡;->ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 111
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ᩴۘ֡;->ܿ:Ljava/lang/Object;

    .line 117
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ᩴۘ֡;->֫:Ll/ۧۤᩴ;

    .line 126
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ll/ᩴۘ֡;->ܳ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 134
    new-instance v0, Ll/᩶ۘ֡;

    invoke-direct {v0}, Ll/᩶ۘ֡;-><init>()V

    iput-object v0, p0, Ll/ᩴۘ֡;->ܽ:Ll/᩶ۘ֡;

    return-void
.end method

.method public static synthetic ֫(Ll/ᩴۘ֡;)Ljava/lang/Object;
    .locals 0

    .line 100
    iget-object p0, p0, Ll/ᩴۘ֡;->ܿ:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ᩴۘ֡;)J
    .locals 2

    .line 100
    iget-wide v0, p0, Ll/ᩴۘ֡;->ᩳ:J

    return-wide v0
.end method

.method public static synthetic ܽ(Ll/ᩴۘ֡;)V
    .locals 4

    .line 100
    iget-wide v0, p0, Ll/ᩴۘ֡;->ᩳ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ᩴۘ֡;->ᩳ:J

    return-void
.end method

.method public static synthetic ܿ(Ll/ᩴۘ֡;)Ll/᩶ۘ֡;
    .locals 0

    .line 100
    iget-object p0, p0, Ll/ᩴۘ֡;->ܽ:Ll/᩶ۘ֡;

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/ᩴۘ֡;)V
    .locals 4

    .line 100
    iget-wide v0, p0, Ll/ᩴۘ֡;->ᩳ:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Ll/ᩴۘ֡;->ᩳ:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ObjectDeque [idleObjects="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    iget-object v1, p0, Ll/ᩴۘ֡;->ܽ:Ll/᩶ۘ֡;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createCount="

    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    iget-object v1, p0, Ll/ᩴۘ֡;->ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allObjects="

    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    iget-object v1, p0, Ll/ᩴۘ֡;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", numInterested="

    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    iget-object v1, p0, Ll/ᩴۘ֡;->ܳ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۧۤᩴ;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/ᩴۘ֡;->֫:Ll/ۧۤᩴ;

    return-object v0
.end method

.method public final ۧ()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 153
    iget-object v0, p0, Ll/ᩴۘ֡;->ۧ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method public final ܽ()Ll/᩶ۘ֡;
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ᩴۘ֡;->ܽ:Ll/᩶ۘ֡;

    return-object v0
.end method

.method public final ᩳ()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 1

    .line 171
    iget-object v0, p0, Ll/ᩴۘ֡;->ܳ:Ljava/util/concurrent/atomic/AtomicLong;

    return-object v0
.end method
