.class public final synthetic Ll/᩺۠ۜ;
.super Ljava/lang/Object;
.source "X8B6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/۬۬ܿ;

.field public final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ᩸:Ll/ܺܶۜ;

.field public final synthetic ᩹:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ll/ܺܶۜ;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/۬۬ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺۠ۜ;->᩸:Ll/ܺܶۜ;

    iput-object p2, p0, Ll/᩺۠ۜ;->᩹:Ljava/util/ArrayList;

    iput-object p3, p0, Ll/᩺۠ۜ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p4, p0, Ll/᩺۠ۜ;->ۙ:Ll/۬۬ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 2
    iget-object v6, p0, Ll/᩺۠ۜ;->᩸:Ll/ܺܶۜ;

    .line 4
    iget-object v5, p0, Ll/᩺۠ۜ;->᩹:Ljava/util/ArrayList;

    .line 6
    iget-object v7, p0, Ll/᩺۠ۜ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    iget-object v8, p0, Ll/᩺۠ۜ;->ۙ:Ll/۬۬ܿ;

    .line 10
    sget v0, Ll/ܺܶۜ;->۬ۧ:I

    .line 529
    :try_start_0
    new-instance v0, Ll/ۜܶۜ;

    invoke-direct {v0, v7}, Ll/ۜܶۜ;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-static {v5, v0}, Ll/۬᩺ۜ;->֫(Ljava/util/ArrayList;Ll/ۜܶۜ;)Ll/ۗ᩺ۜ;

    move-result-object v4

    .line 530
    new-instance v9, Ll/ܰ۠ۜ;

    move-object v0, v9

    move-object v1, v6

    move-object v2, v8

    move-object v3, v7

    invoke-direct/range {v0 .. v5}, Ll/ܰ۠ۜ;-><init>(Ll/ܺܶۜ;Ll/۬۬ܿ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ۗ᩺ۜ;Ljava/util/ArrayList;)V

    invoke-virtual {v6, v9}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 544
    new-instance v1, Ll/۟۠ۜ;

    invoke-direct {v1, v6, v8, v7, v0}, Ll/۟۠ۜ;-><init>(Ll/ܺܶۜ;Ll/۬۬ܿ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/Exception;)V

    invoke-virtual {v6, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
