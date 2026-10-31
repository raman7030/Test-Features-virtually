.class public final Ll/ۨۨᩳ;
.super Ll/۟ܶۡ;
.source "YAH9"


# instance fields
.field public final ۜ:Ll/ۡ᩹ۡ;

.field public final synthetic ۡ:Ll/۫ۨᩳ;

.field public final synthetic ۢ:Ll/ۜۜܿ;

.field public ܳ:Ll/۟᩸ᩳ;

.field public final synthetic ᩷:Ll/ۗܺ᩷;

.field public ᩻:Ll/۬᩹ᩳ;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Ll/ۗܺ᩷;Ll/ۜۜܿ;)V
    .locals 0

    .line 414
    iput-object p1, p0, Ll/ۨۨᩳ;->ۡ:Ll/۫ۨᩳ;

    iput-object p2, p0, Ll/ۨۨᩳ;->᩷:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ۨۨᩳ;->ۢ:Ll/ۜۜܿ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 416
    invoke-static {p1}, Ll/ۡ᩹ۡ;->֫(Ll/۫ۨᩳ;)Ll/ۡ᩹ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨۨᩳ;->ۜ:Ll/ۡ᩹ۡ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 441
    iget-object v0, p0, Ll/ۨۨᩳ;->ۜ:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 442
    :cond_0
    iget-object v0, p0, Ll/ۨۨᩳ;->ۡ:Ll/۫ۨᩳ;

    iget-object v1, p0, Ll/ۨۨᩳ;->᩻:Ll/۬᩹ᩳ;

    invoke-static {v0, v1}, Ll/᩺ۨᩳ;->֫(Ll/۫ۨᩳ;Ll/۬᩹ᩳ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 447
    iget-object v0, p0, Ll/ۨۨᩳ;->ۜ:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 448
    :cond_0
    iget-object v0, p0, Ll/ۨۨᩳ;->᩷:Ll/ۗܺ᩷;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 421
    iget-object v0, p0, Ll/ۨۨᩳ;->ۡ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۨۨᩳ;->ܳ:Ll/۟᩸ᩳ;

    .line 422
    iget-object v0, p0, Ll/ۨۨᩳ;->᩷:Ll/ۗܺ᩷;

    if-eqz v0, :cond_0

    const v1, 0x7f1207a7

    .line 423
    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 429
    iget-object v0, p0, Ll/ۨۨᩳ;->ۡ:Ll/۫ۨᩳ;

    iget-object v1, p0, Ll/ۨۨᩳ;->ܳ:Ll/۟᩸ᩳ;

    .line 430
    :try_start_0
    new-instance v2, Ll/ᩴ᩷ܿ;

    .line 431
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ll/۠֨ᩴ;->toPath(Ljava/io/File;)Ll/᩷۠ᩴ;

    move-result-object v0

    const-string v3, "format-output"

    invoke-interface {v0, v3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    .line 432
    invoke-static {}, Ll/ۜ֡ᩳ;->֫()Ll/֨۬ᩳ;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ll/ᩴ᩷ܿ;-><init>(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 433
    :try_start_1
    iget-object v0, p0, Ll/ۨۨᩳ;->ۢ:Ll/ۜۜܿ;

    invoke-interface {v0, v1, v2}, Ll/ۜۜܿ;->֫(Ljava/lang/CharSequence;Ll/ᩴ᩷ܿ;)V

    .line 434
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_1

    .line 435
    invoke-virtual {v2}, Ll/ᩴ᩷ܿ;->finish()Ll/۬᩹ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۨۨᩳ;->᩻:Ll/۬᩹ᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 436
    :try_start_2
    invoke-virtual {v2}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V

    :cond_0
    return-void

    .line 434
    :cond_1
    :try_start_3
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    .line 429
    :try_start_4
    invoke-virtual {v2}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_5
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    if-eqz v1, :cond_2

    :try_start_6
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 456
    :try_start_0
    iget-object v0, p0, Ll/ۨۨᩳ;->᩻:Ll/۬᩹ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 458
    :cond_0
    iget-object v0, p0, Ll/ۨۨᩳ;->ܳ:Ll/۟᩸ᩳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    .line 459
    :cond_1
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void

    :catchall_0
    move-exception v0

    .line 458
    iget-object v1, p0, Ll/ۨۨᩳ;->ܳ:Ll/۟᩸ᩳ;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V

    .line 459
    :cond_2
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 460
    throw v0
.end method
