.class public final Ll/ۤ᩻ۧ;
.super Ljava/lang/Object;
.source "68R4"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final ۗ:Ll/ۤ᩻ۧ;


# instance fields
.field public volatile ۙ:J

.field public ᩶:I

.field public ᩸:Landroid/view/Choreographer;

.field public final ᩹:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 495
    new-instance v0, Ll/ۤ᩻ۧ;

    invoke-direct {v0}, Ll/ۤ᩻ۧ;-><init>()V

    sput-object v0, Ll/ۤ᩻ۧ;->ۗ:Ll/ۤ᩻ۧ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 506
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 507
    iput-wide v0, p0, Ll/ۤ᩻ۧ;->ۙ:J

    .line 508
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "ExoPlayer:FrameReleaseChoreographer"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 509
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 510
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 783
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 510
    iput-object v1, p0, Ll/ۤ᩻ۧ;->᩹:Landroid/os/Handler;

    const/4 v0, 0x1

    .line 511
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public static ܽ()Ll/ۤ᩻ۧ;
    .locals 1

    .line 503
    sget-object v0, Ll/ۤ᩻ۧ;->ۗ:Ll/ۤ᩻ۧ;

    return-object v0
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 2

    .line 532
    iput-wide p1, p0, Ll/ۤ᩻ۧ;->ۙ:J

    .line 533
    iget-object p1, p0, Ll/ۤ᩻ۧ;->᩸:Landroid/view/Choreographer;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x1f4

    .line 533
    invoke-virtual {p1, p0, v0, v1}, Landroid/view/Choreographer;->postFrameCallbackDelayed(Landroid/view/Choreographer$FrameCallback;J)V

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 538
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 572
    :cond_0
    iget-object p1, p0, Ll/ۤ᩻ۧ;->᩸:Landroid/view/Choreographer;

    if-eqz p1, :cond_2

    .line 573
    iget v1, p0, Ll/ۤ᩻ۧ;->᩶:I

    sub-int/2addr v1, v0

    iput v1, p0, Ll/ۤ᩻ۧ;->᩶:I

    if-nez v1, :cond_2

    .line 575
    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 576
    iput-wide v1, p0, Ll/ۤ᩻ۧ;->ۙ:J

    return v0

    .line 563
    :cond_1
    iget-object p1, p0, Ll/ۤ᩻ۧ;->᩸:Landroid/view/Choreographer;

    if-eqz p1, :cond_2

    .line 564
    iget v1, p0, Ll/ۤ᩻ۧ;->᩶:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۤ᩻ۧ;->᩶:I

    if-ne v1, v0, :cond_2

    .line 566
    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_2
    return v0

    .line 555
    :cond_3
    :try_start_0
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ᩻ۧ;->᩸:Landroid/view/Choreographer;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception p1

    const-string v1, "Vsync sampling disabled due to platform error"

    .line 558
    invoke-static {v1, p1}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public final ֫()V
    .locals 2

    .line 519
    iget-object v0, p0, Ll/ۤ᩻ۧ;->᩹:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 527
    iget-object v0, p0, Ll/ۤ᩻ۧ;->᩹:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method
