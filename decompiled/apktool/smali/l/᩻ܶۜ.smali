.class public final synthetic Ll/᩻ܶۜ;
.super Ljava/lang/Object;
.source "X8B6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ۙ:Ljava/util/ArrayList;

.field public final synthetic ᩶:Landroid/net/Uri;

.field public final synthetic ᩸:Ll/ܺܶۜ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/ܺܶۜ;ZLandroid/net/Uri;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ܶۜ;->᩸:Ll/ܺܶۜ;

    iput-boolean p2, p0, Ll/᩻ܶۜ;->᩹:Z

    iput-object p3, p0, Ll/᩻ܶۜ;->᩶:Landroid/net/Uri;

    iput-object p4, p0, Ll/᩻ܶۜ;->ۙ:Ljava/util/ArrayList;

    iput-object p5, p0, Ll/᩻ܶۜ;->ۗ:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget-object v0, p0, Ll/᩻ܶۜ;->ۙ:Ljava/util/ArrayList;

    .line 4
    sget v1, Ll/ܺܶۜ;->۬ۧ:I

    .line 309
    iget-object v1, p0, Ll/᩻ܶۜ;->᩸:Ll/ܺܶۜ;

    iget-boolean v2, p0, Ll/᩻ܶۜ;->᩹:Z

    iget-object v3, p0, Ll/᩻ܶۜ;->᩶:Landroid/net/Uri;

    iget-object v4, p0, Ll/᩻ܶۜ;->ۗ:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v2, :cond_0

    :try_start_0
    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ۜܶۜ;

    invoke-direct {v2, v4}, Ll/ۜܶۜ;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-static {v3, v0, v2}, Ll/᩻ۚۜ;->֫(Landroid/net/Uri;Ljava/util/ArrayList;Ll/ۜܶۜ;)Ll/ۖܶۜ;

    move-result-object v0

    goto :goto_0

    .line 310
    :cond_0
    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۜܶۜ;

    invoke-direct {v0, v4}, Ll/ۜܶۜ;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-static {v3, v0}, Ll/᩻ۚۜ;->֫(Landroid/net/Uri;Ll/ۜܶۜ;)Ll/ۖܶۜ;

    move-result-object v0

    .line 311
    :goto_0
    new-instance v2, Ll/ۨ۠ۜ;

    invoke-direct {v2, v1, v4, v0}, Ll/ۨ۠ۜ;-><init>(Ll/ܺܶۜ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ۖܶۜ;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 317
    new-instance v2, Ll/ۧ۠᩷;

    invoke-direct {v2, v1, v4, v0}, Ll/ۧ۠᩷;-><init>(Ll/ܺܶۜ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/Exception;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
