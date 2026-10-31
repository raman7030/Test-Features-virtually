.class public final Ll/֡᩺ᩳ;
.super Ll/۟ܶۡ;
.source "G4ML"


# instance fields
.field public final synthetic ۖ:Ll/ܰ᩺ᩳ;

.field public final synthetic ۘ:Ll/۬۟ᩳ;

.field public final synthetic ۜ:Ljava/lang/String;

.field public final synthetic ۡ:Ll/۟᩺ᩳ;

.field public final synthetic ۢ:I

.field public ܳ:Ljava/lang/StringBuilder;

.field public final synthetic ܺ:I

.field public final synthetic ᩴ:I

.field public final synthetic ᩷:Ljava/lang/String;

.field public final synthetic ᩻:Ll/ܶ᩺ᩳ;


# direct methods
.method public constructor <init>(Ll/ܶ᩺ᩳ;Ll/ܰ᩺ᩳ;Ll/۟᩺ᩳ;ILjava/lang/String;ILjava/lang/String;Ll/۬۟ᩳ;I)V
    .locals 0

    .line 439
    iput-object p1, p0, Ll/֡᩺ᩳ;->᩻:Ll/ܶ᩺ᩳ;

    iput-object p2, p0, Ll/֡᩺ᩳ;->ۖ:Ll/ܰ᩺ᩳ;

    iput-object p3, p0, Ll/֡᩺ᩳ;->ۡ:Ll/۟᩺ᩳ;

    iput p4, p0, Ll/֡᩺ᩳ;->ᩴ:I

    iput-object p5, p0, Ll/֡᩺ᩳ;->᩷:Ljava/lang/String;

    iput p6, p0, Ll/֡᩺ᩳ;->ܺ:I

    iput-object p7, p0, Ll/֡᩺ᩳ;->ۜ:Ljava/lang/String;

    iput-object p8, p0, Ll/֡᩺ᩳ;->ۘ:Ll/۬۟ᩳ;

    iput p9, p0, Ll/֡᩺ᩳ;->ۢ:I

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 479
    iget-object v0, p0, Ll/֡᩺ᩳ;->᩻:Ll/ܶ᩺ᩳ;

    iget v1, p0, Ll/֡᩺ᩳ;->ۢ:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    invoke-static {v0}, Ll/ܶ᩺ᩳ;->᩻(Ll/ܶ᩺ᩳ;)Ll/۫ۨᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 481
    :cond_0
    iget-object v3, p0, Ll/֡᩺ᩳ;->ۖ:Ll/ܰ᩺ᩳ;

    invoke-virtual {v3}, Ll/ܰ᩺ᩳ;->֫()Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v3, 0x1

    if-eq v1, v3, :cond_6

    const/4 v3, 0x2

    if-eq v1, v3, :cond_5

    if-eq v1, v2, :cond_4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_3

    .line 494
    new-instance v1, Landroid/content/Intent;

    invoke-static {v0}, Ll/ܶ᩺ᩳ;->ܳ(Ll/ܶ᩺ᩳ;)Ll/ۗܺ᩷;

    move-result-object v2

    const-class v3, Ll/ܽ֨ᩳ;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "bin.mt.edit2.ACTION_CREATE_WITH_TEXT"

    .line 495
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 496
    iget-object v2, p0, Ll/֡᩺ᩳ;->ܳ:Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll/ܽ֨ᩳ;->֫(Ljava/lang/CharSequence;)V

    .line 497
    invoke-static {v0}, Ll/ܶ᩺ᩳ;->ܳ(Ll/ܶ᩺ᩳ;)Ll/ۗܺ᩷;

    move-result-object v2

    instance-of v3, v2, Ll/ܽ֨ᩳ;

    if-eqz v3, :cond_2

    check-cast v2, Ll/ܽ֨ᩳ;

    .line 498
    invoke-virtual {v2, v1}, Ll/ܽ֨ᩳ;->ܽ(Landroid/content/Intent;)V

    return-void

    .line 500
    :cond_2
    invoke-static {v0}, Ll/ܶ᩺ᩳ;->ܳ(Ll/ܶ᩺ᩳ;)Ll/ۗܺ᩷;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 504
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 490
    :cond_4
    iget-object v1, p0, Ll/֡᩺ᩳ;->ۡ:Ll/۟᩺ᩳ;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    iget-object v3, p0, Ll/֡᩺ᩳ;->ܳ:Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    invoke-interface {v1, v4, v2, v3}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 491
    invoke-static {v0}, Ll/ܶ᩺ᩳ;->᩻(Ll/ܶ᩺ᩳ;)Ll/۫ۨᩳ;

    move-result-object v1

    invoke-static {v0}, Ll/ܶ᩺ᩳ;->᩻(Ll/ܶ᩺ᩳ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/۫ۨᩳ;->ᩴ(I)V

    return-void

    .line 487
    :cond_5
    iget-object v0, p0, Ll/֡᩺ᩳ;->ܳ:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    return-void

    .line 484
    :cond_6
    invoke-static {v0}, Ll/ܶ᩺ᩳ;->ܳ(Ll/ܶ᩺ᩳ;)Ll/ۗܺ᩷;

    move-result-object v0

    iget-object v1, p0, Ll/֡᩺ᩳ;->ܳ:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f12036e

    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 323
    invoke-static {v0, v1, v2, v3, v3}, Ll/ܶۖᩳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 4

    .line 510
    iget-object v0, p0, Ll/֡᩺ᩳ;->ۖ:Ll/ܰ᩺ᩳ;

    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 511
    :cond_0
    instance-of v0, p1, Ljava/lang/RuntimeException;

    iget-object v1, p0, Ll/֡᩺ᩳ;->᩻:Ll/ܶ᩺ᩳ;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/lang/RuntimeException;

    invoke-static {v1}, Ll/ܶ᩺ᩳ;->᩻(Ll/ܶ᩺ᩳ;)Ll/۫ۨᩳ;

    move-result-object v2

    iget-object v3, p0, Ll/֡᩺ᩳ;->ۡ:Ll/۟᩺ᩳ;

    invoke-virtual {v2, v3, v0}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 512
    :cond_1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_2

    :goto_0
    return-void

    .line 514
    :cond_2
    instance-of v0, p1, Ljava/util/regex/PatternSyntaxException;

    if-eqz v0, :cond_3

    check-cast p1, Ljava/util/regex/PatternSyntaxException;

    .line 515
    invoke-static {v1, p1}, Ll/ܶ᩺ᩳ;->֫(Ll/ܶ᩺ᩳ;Ljava/util/regex/PatternSyntaxException;)V

    return-void

    .line 517
    :cond_3
    invoke-static {v1}, Ll/ܶ᩺ᩳ;->ܳ(Ll/ܶ᩺ᩳ;)Ll/ۗܺ᩷;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 0

    return-void
.end method

.method public final ܿ()V
    .locals 7

    .line 447
    iget-object v0, p0, Ll/֡᩺ᩳ;->ۜ:Ljava/lang/String;

    iget-object v1, p0, Ll/֡᩺ᩳ;->᩷:Ljava/lang/String;

    iget-object v2, p0, Ll/֡᩺ᩳ;->ۖ:Ll/ܰ᩺ᩳ;

    invoke-virtual {v2}, Ll/ܰ᩺ᩳ;->ᩳ()V

    .line 448
    iget-object v3, p0, Ll/֡᩺ᩳ;->ۡ:Ll/۟᩺ᩳ;

    invoke-interface {v3}, Ll/᩶᩸ᩳ;->ܶ()Ll/۟᩸ᩳ;

    move-result-object v3

    .line 449
    :try_start_0
    new-instance v4, Ll/᩵᩺ᩳ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Ll/۟᩸ᩳ;->ۧ(Ljava/lang/Runnable;)V

    .line 450
    invoke-virtual {v2}, Ll/ܰ᩺ᩳ;->ᩳ()V

    .line 451
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v4

    iget v5, p0, Ll/֡᩺ᩳ;->ᩴ:I

    if-ne v4, v5, :cond_4

    .line 452
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    const v5, 0x7f120a62

    if-nez v4, :cond_3

    .line 456
    iget v4, p0, Ll/֡᩺ᩳ;->ܺ:I

    invoke-static {v4, v1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v1

    .line 457
    invoke-static {v1, v0}, Ll/ܰۘܽ;->֫(Ll/ۨۘܽ;Ljava/lang/String;)V

    .line 459
    invoke-virtual {v1, v3}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۘܽ;->ۡ()V

    .line 460
    new-instance v4, Ll/᩵᩺ᩳ;

    const/4 v6, 0x0

    invoke-direct {v4, v6, v2}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v4}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    .line 461
    iget-object v4, p0, Ll/֡᩺ᩳ;->ۘ:Ll/۬۟ᩳ;

    if-eqz v4, :cond_0

    .line 462
    iget v6, v4, Ll/۬۟ᩳ;->ۧ:I

    iget v4, v4, Ll/۬۟ᩳ;->֫:I

    invoke-virtual {v1, v6, v4}, Ll/۫ۘܽ;->region(II)V

    .line 465
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v4, p0, Ll/֡᩺ᩳ;->ܳ:Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    .line 467
    :goto_0
    invoke-static {v1}, Ll/۫۟ᩳ;->ۧ(Ll/۫ۘܽ;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 468
    invoke-virtual {v2}, Ll/ܰ᩺ᩳ;->ᩳ()V

    .line 470
    iget-object v4, p0, Ll/֡᩺ᩳ;->ܳ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v0}, Ll/۫ۘܽ;->expandReplacementInto(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/4 v4, 0x1

    goto :goto_0

    .line 472
    :cond_1
    invoke-virtual {v2}, Ll/ܰ᩺ᩳ;->ᩳ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_2

    .line 474
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V

    return-void

    .line 473
    :cond_2
    :try_start_1
    new-instance v0, Ll/ܳۨۡ;

    invoke-direct {v0, v5}, Ll/ܳۨۡ;-><init>(I)V

    throw v0

    .line 453
    :cond_3
    new-instance v0, Ll/ܳۨۡ;

    invoke-direct {v0, v5}, Ll/ܳۨۡ;-><init>(I)V

    throw v0

    .line 451
    :cond_4
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 448
    :try_start_2
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
.end method

.method public final ᩳ()V
    .locals 3

    const/4 v0, 0x0

    .line 523
    iput-object v0, p0, Ll/֡᩺ᩳ;->ܳ:Ljava/lang/StringBuilder;

    .line 524
    iget-object v0, p0, Ll/֡᩺ᩳ;->ۖ:Ll/ܰ᩺ᩳ;

    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->ܿ()V

    .line 525
    iget-object v1, p0, Ll/֡᩺ᩳ;->᩻:Ll/ܶ᩺ᩳ;

    invoke-static {v1}, Ll/ܶ᩺ᩳ;->ۜ(Ll/ܶ᩺ᩳ;)Ll/ܰ᩺ᩳ;

    move-result-object v2

    if-ne v2, v0, :cond_0

    invoke-static {v1}, Ll/ܶ᩺ᩳ;->ۡ(Ll/ܶ᩺ᩳ;)V

    :cond_0
    return-void
.end method
