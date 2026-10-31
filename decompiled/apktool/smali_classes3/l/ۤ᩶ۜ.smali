.class public final Ll/ۤ᩶ۜ;
.super Ljava/lang/Object;
.source "B78Q"


# static fields
.field public static final ۜ:Ll/۬᩶ۜ;

.field public static final ᩻:Ll/᩶۫᩷;


# instance fields
.field public final ֫:Ll/᩶۫᩷;

.field public ۧ:J

.field public final ܳ:Ll/۬᩶ۜ;

.field public final ܽ:Ll/ۗ᩶ۜ;

.field public final ܿ:Ljava/lang/Runnable;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۤ᩶ۜ;->᩻:Ll/᩶۫᩷;

    .line 24
    new-instance v0, Ll/۬᩶ۜ;

    .line 214
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    sput-object v0, Ll/ۤ᩶ۜ;->ۜ:Ll/۬᩶ۜ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ll/ۗ᩶ۜ;

    invoke-direct {v0, p0}, Ll/ۗ᩶ۜ;-><init>(Ll/ۤ᩶ۜ;)V

    iput-object v0, p0, Ll/ۤ᩶ۜ;->ܽ:Ll/ۗ᩶ۜ;

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۤ᩶ۜ;->ᩳ:Ljava/util/ArrayList;

    const-wide/16 v0, -0x1

    .line 31
    iput-wide v0, p0, Ll/ۤ᩶ۜ;->ۧ:J

    .line 45
    iput-object p1, p0, Ll/ۤ᩶ۜ;->ܿ:Ljava/lang/Runnable;

    .line 46
    sget-object p1, Ll/ۤ᩶ۜ;->᩻:Ll/᩶۫᩷;

    iput-object p1, p0, Ll/ۤ᩶ۜ;->֫:Ll/᩶۫᩷;

    .line 47
    sget-object p1, Ll/ۤ᩶ۜ;->ۜ:Ll/۬᩶ۜ;

    iput-object p1, p0, Ll/ۤ᩶ۜ;->ܳ:Ll/۬᩶ۜ;

    return-void
.end method

.method public static ֫(Ll/ۤ᩶ۜ;)V
    .locals 9

    .line 127
    iget-object v0, p0, Ll/ۤ᩶ۜ;->ܽ:Ll/ۗ᩶ۜ;

    iget-object v1, p0, Ll/ۤ᩶ۜ;->ܳ:Ll/۬᩶ۜ;

    .line 73
    iget-wide v2, p0, Ll/ۤ᩶ۜ;->ۧ:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3

    .line 130
    invoke-virtual {p0}, Ll/ۤ᩶ۜ;->ۧ()J

    move-result-wide v2

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-lez v8, :cond_0

    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 164
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    .line 220
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object p0

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 144
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 73
    iget-wide v0, p0, Ll/ۤ᩶ۜ;->ۧ:J

    cmp-long v2, v0, v4

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 146
    :goto_0
    iput-wide v4, p0, Ll/ۤ᩶ۜ;->ۧ:J

    if-eqz v0, :cond_2

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۤ᩶ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩶ۜ;

    .line 172
    invoke-interface {v1}, Ll/۫᩶ۜ;->֫()V

    goto :goto_1

    .line 137
    :cond_2
    iget-object p0, p0, Ll/ۤ᩶ۜ;->ܿ:Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 144
    iget-object v0, p0, Ll/ۤ᩶ۜ;->ܳ:Ll/۬᩶ۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Ll/ۤ᩶ۜ;->ܽ:Ll/ۗ᩶ۜ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 73
    iget-wide v0, p0, Ll/ۤ᩶ۜ;->ۧ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 146
    :goto_0
    iput-wide v2, p0, Ll/ۤ᩶ۜ;->ۧ:J

    if-eqz v0, :cond_1

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۤ᩶ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩶ۜ;

    .line 172
    invoke-interface {v1}, Ll/۫᩶ۜ;->֫()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(I)V
    .locals 6

    const/4 v0, 0x1

    if-lt p1, v0, :cond_1

    const/16 v0, 0x3e7

    if-gt p1, v0, :cond_1

    .line 57
    iget-object v0, p0, Ll/ۤ᩶ۜ;->֫:Ll/᩶۫᩷;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    int-to-long v2, p1

    const-wide/32 v4, 0xea60

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/ۤ᩶ۜ;->ۧ:J

    .line 156
    invoke-virtual {p0}, Ll/ۤ᩶ۜ;->ۧ()J

    move-result-wide v0

    .line 163
    iget-object p1, p0, Ll/ۤ᩶ۜ;->ܳ:Ll/۬᩶ۜ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object p1

    iget-object v2, p0, Ll/ۤ᩶ۜ;->ܽ:Ll/ۗ᩶ۜ;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v3, 0x0

    .line 164
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 220
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 171
    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Ll/ۤ᩶ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩶ۜ;

    .line 172
    invoke-interface {v0}, Ll/۫᩶ۜ;->֫()V

    goto :goto_0

    :cond_0
    return-void

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Minutes must be between 1 and 999"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/۫᩶ۜ;)V
    .locals 2

    .line 101
    iget-object v0, p0, Ll/ۤ᩶ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 102
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ۧ()J
    .locals 7

    .line 73
    iget-wide v0, p0, Ll/ۤ᩶ۜ;->ۧ:J

    const-wide/16 v2, -0x1

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v2

    if-eqz v6, :cond_0

    .line 94
    iget-object v2, p0, Ll/ۤ᩶ۜ;->֫:Ll/᩶۫᩷;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_0
    return-wide v4
.end method

.method public final ۧ(Ll/۫᩶ۜ;)V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۤ᩶ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ()I
    .locals 5

    .line 80
    invoke-virtual {p0}, Ll/ۤ᩶ۜ;->ۧ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-wide/32 v2, 0xea5f

    add-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    .line 84
    div-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method
