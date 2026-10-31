.class public final Ll/ۗܰܿ;
.super Ljava/lang/Object;
.source "F70U"

# interfaces
.implements Ll/ᩴܽܳ;
.implements Ll/ۘܽܳ;
.implements Ll/ۖܽܳ;


# instance fields
.field public final ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۙ:Ll/ۨܰܿ;

.field public final ᩶:I

.field public ᩸:J

.field public volatile ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۨܰܿ;I)V
    .locals 2

    .line 1229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1223
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/ۗܰܿ;->ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

    const-wide/16 v0, -0x1

    .line 1225
    iput-wide v0, p0, Ll/ۗܰܿ;->᩸:J

    .line 1230
    iput-object p1, p0, Ll/ۗܰܿ;->ۙ:Ll/ۨܰܿ;

    .line 1231
    iput p2, p0, Ll/ۗܰܿ;->᩶:I

    .line 1232
    invoke-virtual {p1}, Ll/ۨܰܿ;->ܽ()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1294
    iget-object v0, p0, Ll/ۗܰܿ;->ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-lez v1, :cond_0

    return-void

    :cond_0
    if-ltz v1, :cond_1

    .line 1302
    iget-object v0, p0, Ll/ۗܰܿ;->ۙ:Ll/ۨܰܿ;

    invoke-virtual {v0}, Ll/ۨܰܿ;->ۧ()V

    return-void

    .line 1299
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 1300
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Hex restore delta source already closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final length()I
    .locals 1

    .line 1237
    iget v0, p0, Ll/ۗܰܿ;->᩶:I

    return v0
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 1243
    iget-object v0, p0, Ll/ۗܰܿ;->ۙ:Ll/ۨܰܿ;

    return-object v0
.end method

.method public final ֫(I[BII)V
    .locals 7

    .line 1267
    iget-boolean v0, p0, Ll/ۗܰܿ;->᩹:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۗܰܿ;->ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_1

    .line 1270
    iget v0, p0, Ll/ۗܰܿ;->᩶:I

    invoke-static {v0, p1, p4}, Ll/ۡܽܳ;->ܽ(III)V

    .line 1271
    array-length v0, p2

    invoke-static {v0, p3, p4}, Ll/ۡܽܳ;->ۧ(III)V

    if-nez p4, :cond_0

    return-void

    .line 1275
    :cond_0
    iget-object v1, p0, Ll/ۗܰܿ;->ۙ:Ll/ۨܰܿ;

    iget-wide v2, p0, Ll/ۗܰܿ;->᩸:J

    int-to-long v4, p1

    add-long/2addr v2, v4

    move-object v4, p2

    move v5, p3

    move v6, p4

    invoke-virtual/range {v1 .. v6}, Ll/ۨܰܿ;->֫(J[BII)V

    return-void

    .line 1268
    :cond_1
    new-instance p1, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {p1}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw p1
.end method

.method public final ۧ(J)V
    .locals 3

    .line 1258
    iget-object v0, p0, Ll/ۗܰܿ;->ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 1261
    iput-wide p1, p0, Ll/ۗܰܿ;->᩸:J

    const/4 p1, 0x1

    .line 1262
    iput-boolean p1, p0, Ll/ۗܰܿ;->᩹:Z

    return-void

    .line 1259
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid hex restore delta mapping"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۫()Z
    .locals 1

    .line 1253
    iget-object v0, p0, Ll/ۗܰܿ;->ۙ:Ll/ۨܰܿ;

    invoke-virtual {v0}, Ll/ۨܰܿ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ܽ()J
    .locals 2

    .line 1248
    iget-object v0, p0, Ll/ۗܰܿ;->ۙ:Ll/ۨܰܿ;

    invoke-virtual {v0}, Ll/ۨܰܿ;->ᩳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩺ۧ()Ll/ᩴܽܳ;
    .locals 3

    .line 1281
    :cond_0
    iget-object v0, p0, Ll/ۗܰܿ;->ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_1

    add-int/lit8 v2, v1, 0x1

    .line 1285
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 1283
    :cond_1
    new-instance v0, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {v0}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw v0
.end method
