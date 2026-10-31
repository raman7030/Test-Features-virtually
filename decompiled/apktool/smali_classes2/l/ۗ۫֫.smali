.class public final Ll/ۗ۫֫;
.super Ljava/lang/Object;
.source "W8Q1"


# instance fields
.field public ֫:J

.field public final ۧ:Landroid/media/AudioTimestamp;

.field public ܳ:J

.field public final ܽ:Landroid/media/AudioTrack;

.field public ܿ:J

.field public ᩳ:Z

.field public ᩻:J


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;)V
    .locals 0

    .line 366
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 367
    iput-object p1, p0, Ll/ۗ۫֫;->ܽ:Landroid/media/AudioTrack;

    .line 368
    new-instance p1, Landroid/media/AudioTimestamp;

    invoke-direct {p1}, Landroid/media/AudioTimestamp;-><init>()V

    iput-object p1, p0, Ll/ۗ۫֫;->ۧ:Landroid/media/AudioTimestamp;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 408
    iput-boolean v0, p0, Ll/ۗ۫֫;->ᩳ:Z

    return-void
.end method

.method public final ۧ()J
    .locals 2

    .line 404
    iget-wide v0, p0, Ll/ۗ۫֫;->ܿ:J

    return-wide v0
.end method

.method public final ܽ()J
    .locals 4

    .line 400
    iget-object v0, p0, Ll/ۗ۫֫;->ۧ:Landroid/media/AudioTimestamp;

    iget-wide v0, v0, Landroid/media/AudioTimestamp;->nanoTime:J

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public final ᩳ()Z
    .locals 7

    .line 378
    iget-object v0, p0, Ll/ۗ۫֫;->ܽ:Landroid/media/AudioTrack;

    iget-object v1, p0, Ll/ۗ۫֫;->ۧ:Landroid/media/AudioTimestamp;

    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->getTimestamp(Landroid/media/AudioTimestamp;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 380
    iget-wide v1, v1, Landroid/media/AudioTimestamp;->framePosition:J

    .line 381
    iget-wide v3, p0, Ll/ۗ۫֫;->ܳ:J

    cmp-long v5, v3, v1

    if-lez v5, :cond_1

    .line 382
    iget-boolean v5, p0, Ll/ۗ۫֫;->ᩳ:Z

    if-eqz v5, :cond_0

    .line 383
    iget-wide v5, p0, Ll/ۗ۫֫;->֫:J

    add-long/2addr v5, v3

    iput-wide v5, p0, Ll/ۗ۫֫;->֫:J

    const/4 v3, 0x0

    .line 384
    iput-boolean v3, p0, Ll/ۗ۫֫;->ᩳ:Z

    goto :goto_0

    .line 387
    :cond_0
    iget-wide v3, p0, Ll/ۗ۫֫;->᩻:J

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/ۗ۫֫;->᩻:J

    .line 390
    :cond_1
    :goto_0
    iput-wide v1, p0, Ll/ۗ۫֫;->ܳ:J

    .line 391
    iget-wide v3, p0, Ll/ۗ۫֫;->֫:J

    add-long/2addr v1, v3

    iget-wide v3, p0, Ll/ۗ۫֫;->᩻:J

    const/16 v5, 0x20

    shl-long/2addr v3, v5

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۗ۫֫;->ܿ:J

    :cond_2
    return v0
.end method
