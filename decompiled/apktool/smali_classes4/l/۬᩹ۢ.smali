.class public final Ll/۬᩹ۢ;
.super Ll/֡ܽ;
.source "Q1R8"


# instance fields
.field public final synthetic ܳ:Ll/ۤ᩹ۢ;

.field public ܿ:Ll/ۡۤۡ;

.field public ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ᩻:Ll/᩸ۚۢ;


# direct methods
.method public constructor <init>(Ll/ۤ᩹ۢ;)V
    .locals 0

    .line 481
    iput-object p1, p0, Ll/۬᩹ۢ;->ܳ:Ll/ۤ᩹ۢ;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/֡ܽ;-><init>(Z)V

    .line 483
    invoke-static {}, Ll/ۡۤۡ;->ܳ()Ll/ۡۤۡ;

    move-result-object p1

    iput-object p1, p0, Ll/۬᩹ۢ;->ܿ:Ll/ۡۤۡ;

    .line 484
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ll/۬᩹ۢ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 4

    .line 488
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "term_double_confirm_to_exit"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iget-object v1, p0, Ll/۬᩹ۢ;->ܳ:Ll/ۤ᩹ۢ;

    if-nez v0, :cond_0

    .line 489
    invoke-static {v1}, Ll/ۤ᩹ۢ;->ᩳ(Ll/ۤ᩹ۢ;)Ll/۫᩹ۢ;

    move-result-object v0

    iget-object v0, v0, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->ܳ()V

    .line 490
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 493
    :cond_0
    iget-object v0, p0, Ll/۬᩹ۢ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 494
    iget-object v2, p0, Ll/۬᩹ۢ;->ܿ:Ll/ۡۤۡ;

    invoke-virtual {v2}, Ll/ۡۤۡ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 495
    iget-object v0, p0, Ll/۬᩹ۢ;->᩻:Ll/᩸ۚۢ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩸ۚۢ;->֫()V

    .line 496
    :cond_1
    invoke-static {v1}, Ll/ۤ᩹ۢ;->ᩳ(Ll/ۤ᩹ۢ;)Ll/۫᩹ۢ;

    move-result-object v0

    iget-object v0, v0, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->ܳ()V

    .line 497
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 499
    :cond_2
    new-instance v1, Ll/ۗ᩹ۢ;

    invoke-direct {v1, p0, v0}, Ll/ۗ᩹ۢ;-><init>(Ll/۬᩹ۢ;I)V

    const-wide/16 v2, 0x64

    invoke-static {v1, v2, v3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method
