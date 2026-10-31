.class public final Ll/᩵᩵ܿ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ۙ:Ll/֫᩵ܿ;

.field public final synthetic ᩶:J

.field public ᩸:J

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/֫᩵ܿ;J)V
    .locals 0

    .line 585
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵᩵ܿ;->ۙ:Ll/֫᩵ܿ;

    iput-wide p2, p0, Ll/᩵᩵ܿ;->᩶:J

    .line 586
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩵᩵ܿ;->᩸:J

    const-wide/16 p1, 0x0

    .line 587
    iput-wide p1, p0, Ll/᩵᩵ܿ;->᩹:J

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 14

    .line 591
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 592
    iget-wide v2, p0, Ll/᩵᩵ܿ;->᩸:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3e8

    iget-object v13, p0, Ll/᩵᩵ܿ;->ۙ:Ll/֫᩵ܿ;

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    .line 593
    invoke-virtual {v13}, Ll/֫᩵ܿ;->᩷֫()V

    .line 594
    iput-wide v0, p0, Ll/᩵᩵ܿ;->᩸:J

    .line 596
    :cond_0
    iget-wide v0, p0, Ll/᩵᩵ܿ;->᩹:J

    int-to-long v7, p1

    add-long v9, v0, v7

    iput-wide v9, p0, Ll/᩵᩵ܿ;->᩹:J

    .line 597
    iget-wide v11, p0, Ll/᩵᩵ܿ;->᩶:J

    move-object v6, v13

    invoke-virtual/range {v6 .. v12}, Ll/֫᩵ܿ;->֫(JJJ)V

    .line 80
    iget-object p1, v13, Ll/֫᩵ܿ;->᩸:Ll/᩹᩸ܿ;

    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    .line 599
    :cond_1
    new-instance p1, Ljava/util/concurrent/CancellationException;

    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p1
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
