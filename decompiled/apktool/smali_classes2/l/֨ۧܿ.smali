.class public final Ll/֨ۧܿ;
.super Ljava/lang/Object;
.source "44TS"


# instance fields
.field public ֡:I

.field public ֨:Z

.field public final ֫:Ll/ۗܺ᩷;

.field public ۖ:Z

.field public ۗ:Ll/۟᩺ᩳ;

.field public ۘ:Ll/۫ۘܽ;

.field public ۙ:I

.field public ۚ:Z

.field public ۛ:Z

.field public ۜ:I

.field public ۠:Ll/ۖۧܿ;

.field public ۡ:Z

.field public ۢ:Ljava/lang/String;

.field public ۤ:Ll/ۘۧܿ;

.field public final ۧ:Ll/۫ۨᩳ;

.field public ۫:Ll/ܰ᩺ᩳ;

.field public ۬:Z

.field public ܳ:Z

.field public ܶ:Ljava/util/regex/PatternSyntaxException;

.field public ܺ:Ll/ۡۤۡ;

.field public ܽ:Z

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩴ:I

.field public ᩵:Ll/۟᩺ᩳ;

.field public volatile ᩶:I

.field public ᩷:Ll/۬۟ᩳ;

.field public volatile ᩸:Ll/ۚۧܿ;

.field public ᩹:Ll/᩵ۧܿ;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/۫ۨᩳ;)V
    .locals 2

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 32
    iput v0, p0, Ll/֨ۧܿ;->ۜ:I

    .line 33
    iput v0, p0, Ll/֨ۧܿ;->᩻:I

    const/4 v1, 0x0

    .line 45
    iput-object v1, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    .line 49
    iput v0, p0, Ll/֨ۧܿ;->֡:I

    .line 53
    new-instance v1, Ll/᩵ۧܿ;

    invoke-direct {v1}, Ll/᩵ۧܿ;-><init>()V

    iput-object v1, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    .line 55
    iput v0, p0, Ll/֨ۧܿ;->᩶:I

    const/4 v0, 0x0

    .line 56
    iput-boolean v0, p0, Ll/֨ۧܿ;->ܽ:Z

    const/16 v0, 0x96

    .line 58
    invoke-static {v0}, Ll/ۡۤۡ;->֫(I)Ll/ۡۤۡ;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۧܿ;->ܺ:Ll/ۡۤۡ;

    const/4 v0, 0x1

    .line 177
    iput-boolean v0, p0, Ll/֨ۧܿ;->ᩳ:Z

    .line 62
    iput-object p1, p0, Ll/֨ۧܿ;->֫:Ll/ۗܺ᩷;

    .line 63
    iput-object p2, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۧܿ;)Ll/ۗܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۧܿ;->֫:Ll/ۗܺ᩷;

    return-object p0
.end method

.method private ֫(Ljava/lang/String;ZZ)V
    .locals 2

    const/4 v0, 0x0

    .line 213
    iput-boolean v0, p0, Ll/֨ۧܿ;->ܽ:Z

    .line 214
    iget-boolean v0, p0, Ll/֨ۧܿ;->۬:Z

    iput-boolean v0, p0, Ll/֨ۧܿ;->ܳ:Z

    .line 215
    iget-boolean v0, p0, Ll/֨ۧܿ;->ۛ:Z

    iput-boolean v0, p0, Ll/֨ۧܿ;->ۡ:Z

    .line 216
    iput-object p1, p0, Ll/֨ۧܿ;->ۢ:Ljava/lang/String;

    .line 217
    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object v1

    iput-object v1, p0, Ll/֨ۧܿ;->᩷:Ll/۬۟ᩳ;

    .line 218
    iget-boolean v1, p0, Ll/֨ۧܿ;->ۖ:Z

    iput-boolean v1, p0, Ll/֨ۧܿ;->ܿ:Z

    .line 1294
    iget v0, v0, Ll/۫ۨᩳ;->ۢ֫:I

    .line 219
    iput v0, p0, Ll/֨ۧܿ;->᩻:I

    iput v0, p0, Ll/֨ۧܿ;->ۜ:I

    const/4 v0, 0x0

    .line 220
    iput-object v0, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    .line 221
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 222
    invoke-direct {p0}, Ll/֨ۧܿ;->᩷()V

    return-void

    .line 227
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/֨ۧܿ;->ۧ()I

    move-result v1

    invoke-static {v1, p1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object p1

    .line 228
    iput-object v0, p0, Ll/֨ۧܿ;->ܶ:Ljava/util/regex/PatternSyntaxException;
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۨۘܽ;)V

    .line 819
    iget-object p1, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    if-eqz p1, :cond_1

    .line 821
    invoke-interface {p1}, Ll/ۘۧܿ;->ۧ()V

    .line 238
    :cond_1
    invoke-direct {p0, p2, p3}, Ll/֨ۧܿ;->֫(ZZ)V

    return-void

    :catch_0
    move-exception p1

    .line 230
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ljava/util/regex/PatternSyntaxException;)V

    .line 231
    iput-object p1, p0, Ll/֨ۧܿ;->ܶ:Ljava/util/regex/PatternSyntaxException;

    .line 232
    invoke-direct {p0}, Ll/֨ۧܿ;->᩷()V

    return-void
.end method

.method private ֫(Ljava/util/regex/PatternSyntaxException;)V
    .locals 1

    .line 831
    iget-object v0, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    if-eqz v0, :cond_0

    .line 833
    invoke-interface {v0, p1}, Ll/ۘۧܿ;->֫(Ljava/util/regex/PatternSyntaxException;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/֨ۧܿ;I)V
    .locals 0

    .line 813
    iget-object p0, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    if-eqz p0, :cond_0

    .line 815
    invoke-interface {p0, p1}, Ll/ۘۧܿ;->֫(I)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۧܿ;Ljava/util/regex/PatternSyntaxException;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ljava/util/regex/PatternSyntaxException;)V

    return-void
.end method

.method public static synthetic ֫(Ll/֨ۧܿ;Ll/ۚۧܿ;)V
    .locals 0

    .line 454
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result p0

    if-eqz p0, :cond_0

    iget-object p0, p1, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    invoke-virtual {p0}, Ll/ܰ᩺ᩳ;->᩻()Z

    move-result p0

    if-eqz p0, :cond_0

    const p0, 0x7f120904

    invoke-static {p0}, Ll/᩸ۚۢ;->ۧ(I)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/֨ۧܿ;Ll/ۚۧܿ;ILl/᩵ۧܿ;)V
    .locals 2

    .line 486
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 487
    :cond_0
    invoke-virtual {p1}, Ll/ۚۧܿ;->ۧ()V

    .line 488
    iget-object v0, p1, Ll/ۚۧܿ;->᩷:Ll/ۖۧܿ;

    new-instance v1, Ll/ۡۧܿ;

    invoke-direct {v1, p0, p1, p3}, Ll/ۡۧܿ;-><init>(Ll/֨ۧܿ;Ll/ۚۧܿ;Ll/᩵ۧܿ;)V

    invoke-interface {v0, p2, v1}, Ll/ۖۧܿ;->֫(ILl/ۡۧܿ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/֨ۧܿ;Ll/ۚۧܿ;Ljava/lang/RuntimeException;)V
    .locals 1

    .line 444
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    iget-object p1, p1, Ll/ۚۧܿ;->֡:Ll/۟᩺ᩳ;

    invoke-virtual {p0, p1, p2}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/֨ۧܿ;Ll/ۚۧܿ;Ll/ܳۨۡ;)V
    .locals 0

    .line 449
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result p0

    if-eqz p0, :cond_0

    iget-object p0, p1, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    invoke-virtual {p0}, Ll/ܰ᩺ᩳ;->᩻()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/֨ۧܿ;Ll/ۚۧܿ;Ll/᩵ۧܿ;)V
    .locals 2

    .line 490
    iget-object v0, p0, Ll/֨ۧܿ;->ۢ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۚۧܿ;->ۢ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/֨ۧܿ;->ۧ()I

    move-result v0

    iget v1, p1, Ll/ۚۧܿ;->ᩳ:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Ll/֨ۧܿ;->֨:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 491
    :cond_0
    iget-object p1, p1, Ll/ۚۧܿ;->ܳ:Ll/۫ۘܽ;

    invoke-virtual {p1}, Ll/۫ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۨۘܽ;)V

    .line 492
    iget-object p1, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    .line 1294
    iget p1, p1, Ll/۫ۨᩳ;->ۢ֫:I

    .line 492
    iput p1, p0, Ll/֨ۧܿ;->᩻:I

    iput p1, p0, Ll/֨ۧܿ;->ۜ:I

    const/4 v0, 0x0

    .line 493
    iput-object v0, p0, Ll/֨ۧܿ;->᩷:Ll/۬۟ᩳ;

    .line 494
    iput-object p2, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll/֨ۧܿ;->ܽ:Z

    iput p1, p0, Ll/֨ۧܿ;->᩶:I

    .line 495
    iget-object p1, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۧܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p1

    iput p1, p0, Ll/֨ۧܿ;->ۙ:I

    .line 496
    iget-object p1, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    iget-object p1, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/᩵ۧܿ;->ܽ()I

    move-result v0

    invoke-virtual {p2}, Ll/᩵ۧܿ;->֫()I

    move-result p2

    invoke-virtual {p1, v0, p2}, Ll/۫ۨᩳ;->᩷(II)V

    iget-object p0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    const/4 p1, 0x0

    .line 1674
    invoke-virtual {p0, p1}, Ll/۫ۨᩳ;->ۧ(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ll/֨ۧܿ;Ll/ۚۧܿ;ZLl/᩵ۧܿ;Z)V
    .locals 1

    .line 427
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 428
    :cond_0
    iput-boolean p2, p0, Ll/֨ۧܿ;->ܽ:Z

    .line 429
    iget v0, p1, Ll/ۚۧܿ;->֨:I

    iput v0, p0, Ll/֨ۧܿ;->᩻:I

    if-eqz p2, :cond_1

    .line 431
    iput-object p3, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    .line 432
    iput v0, p0, Ll/֨ۧܿ;->᩶:I

    .line 433
    iget-object p2, p1, Ll/ۚۧܿ;->֡:Ll/۟᩺ᩳ;

    iput-object p2, p0, Ll/֨ۧܿ;->ۗ:Ll/۟᩺ᩳ;

    .line 434
    iget p1, p1, Ll/ۚۧܿ;->᩻:I

    iput p1, p0, Ll/֨ۧܿ;->ۙ:I

    .line 435
    iget-object p1, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 436
    iget-object p1, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {p3}, Ll/᩵ۧܿ;->ܽ()I

    move-result p2

    invoke-virtual {p3}, Ll/᩵ۧܿ;->֫()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Ll/۫ۨᩳ;->᩷(II)V

    .line 437
    iget-object p0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    const/4 p1, 0x0

    .line 1674
    invoke-virtual {p0, p1}, Ll/۫ۨᩳ;->ۧ(Z)V

    return-void

    .line 439
    :cond_1
    invoke-direct {p0, p4}, Ll/֨ۧܿ;->ܳ(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/֨ۧܿ;Ll/ۚۧܿ;ZZ)V
    .locals 11

    const-string v0, ""

    .line 381
    invoke-virtual {p1}, Ll/ۚۧܿ;->ܿ()V

    iget v1, p1, Ll/ۚۧܿ;->ۚ:I

    iget-object v2, p1, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    .line 382
    iget-object v3, p1, Ll/ۚۧܿ;->ܳ:Ll/۫ۘܽ;

    .line 383
    new-instance v8, Ll/᩵ۧܿ;

    invoke-direct {v8}, Ll/᩵ۧܿ;-><init>()V

    const/4 v10, 0x0

    .line 386
    :try_start_0
    invoke-virtual {v2}, Ll/ܰ᩺ᩳ;->ᩳ()V

    .line 387
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result v4
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ll/ܳۨۡ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v4, :cond_0

    .line 458
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p0, Ll/ܿۧܿ;

    const/4 p2, 0x0

    invoke-direct {p0, p2, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    goto/16 :goto_4

    .line 388
    :cond_0
    :try_start_1
    new-instance v4, Ll/᩵᩺ᩳ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    .line 389
    iget-object v2, p1, Ll/ۚۧܿ;->֡:Ll/۟᩺ᩳ;

    invoke-interface {v2}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/UncheckedIOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ll/ۘ۬ᩳ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ll/ܳۨۡ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 390
    :try_start_2
    invoke-virtual {v2, v4}, Ll/۟᩸ᩳ;->ۧ(Ljava/lang/Runnable;)V

    .line 391
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v2}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v5

    iget v6, p1, Ll/ۚۧܿ;->᩻:I

    if-ne v5, v6, :cond_b

    invoke-virtual {v2}, Ll/۟᩸ᩳ;->length()I

    move-result v5

    if-eq v5, v1, :cond_1

    goto/16 :goto_3

    .line 392
    :cond_1
    invoke-virtual {v3, v4}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 393
    iget v4, p1, Ll/ۚۧܿ;->ۖ:I

    iget v5, p1, Ll/ۚۧܿ;->ܺ:I

    invoke-virtual {v3, v4, v5}, Ll/۫ۘܽ;->region(II)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz p2, :cond_5

    .line 396
    invoke-virtual {v3}, Ll/۫ۘܽ;->regionStart()I

    move-result p2

    .line 397
    iget v1, p1, Ll/ۚۧܿ;->ᩴ:I

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 398
    iget-boolean v6, p1, Ll/ۚۧܿ;->֫:Z

    invoke-static {v3, v1, v6}, Ll/֨ۧܿ;->֫(Ll/۫ۘܽ;IZ)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 399
    invoke-virtual {v8, v3}, Ll/᩵ۧܿ;->֫(Ll/۫ۘܽ;)V

    goto :goto_0

    :cond_2
    if-nez p3, :cond_3

    .line 402
    invoke-direct {p0, p1, v5}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;Z)Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v6, :cond_3

    .line 442
    :try_start_3
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_3
    .catch Ljava/io/UncheckedIOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ll/ۘ۬ᩳ; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ll/ܳۨۡ; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 458
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p0, Ll/ܿۧܿ;

    const/4 p2, 0x0

    invoke-direct {p0, p2, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    goto/16 :goto_4

    .line 403
    :cond_3
    :try_start_4
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result v6

    if-eqz v6, :cond_4

    if-le v1, p2, :cond_4

    .line 404
    invoke-static {v3, p2, v5}, Ll/֨ۧܿ;->֫(Ll/۫ۘܽ;IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 405
    invoke-virtual {v8, v3}, Ll/᩵ۧܿ;->֫(Ll/۫ۘܽ;)V

    :goto_0
    const/4 v4, 0x1

    :cond_4
    move v7, v4

    goto/16 :goto_2

    :catchall_0
    move-exception p2

    goto/16 :goto_5

    .line 410
    :cond_5
    invoke-virtual {v3}, Ll/۫ۘܽ;->regionStart()I

    move-result p2

    invoke-static {v3, p2, v5}, Ll/֨ۧܿ;->֫(Ll/۫ۘܽ;IZ)Z

    move-result p2

    if-eqz p2, :cond_9

    .line 411
    invoke-virtual {v8, v3}, Ll/᩵ۧܿ;->֫(Ll/۫ۘܽ;)V

    .line 414
    invoke-virtual {v3}, Ll/۫ۘܽ;->start()I

    move-result p2

    iget v5, p1, Ll/ۚۧܿ;->᩵:I

    if-lt p2, v5, :cond_6

    if-nez p3, :cond_7

    .line 415
    invoke-direct {p0, p1, v4}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;Z)Z

    move-result p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz p2, :cond_7

    .line 442
    :try_start_5
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_5
    .catch Ljava/io/UncheckedIOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ll/ۘ۬ᩳ; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ll/ܳۨۡ; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 458
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p0, Ll/ܿۧܿ;

    const/4 p2, 0x0

    invoke-direct {p0, p2, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    goto/16 :goto_4

    :cond_6
    move v1, v5

    .line 420
    :cond_7
    :goto_1
    :try_start_6
    invoke-static {v3}, Ll/۫۟ᩳ;->ۧ(Ll/۫ۘܽ;)Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {v3}, Ll/۫ۘܽ;->start()I

    move-result p2

    if-ge p2, v1, :cond_8

    .line 421
    invoke-virtual {v8, v3}, Ll/᩵ۧܿ;->֫(Ll/۫ۘܽ;)V

    goto :goto_1

    :cond_8
    const/4 p2, 0x1

    const/4 v7, 0x1

    goto :goto_2

    :cond_9
    if-nez p3, :cond_a

    .line 423
    invoke-direct {p0, p1, v4}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;Z)Z

    move-result p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz p2, :cond_a

    .line 442
    :try_start_7
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_7
    .catch Ljava/io/UncheckedIOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ll/ۘ۬ᩳ; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ll/ܳۨۡ; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 458
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p0, Ll/ܿۧܿ;

    const/4 p2, 0x0

    invoke-direct {p0, p2, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    goto :goto_4

    :catch_0
    move-exception p2

    goto/16 :goto_7

    :catch_1
    move-exception p2

    goto/16 :goto_9

    :catch_2
    move-exception p2

    goto/16 :goto_9

    :cond_a
    const/4 p2, 0x0

    const/4 v7, 0x0

    .line 426
    :goto_2
    :try_start_8
    new-instance p2, Ll/ۜۧܿ;

    move-object v4, p2

    move-object v5, p0

    move-object v6, p1

    move v9, p3

    invoke-direct/range {v4 .. v9}, Ll/ۜۧܿ;-><init>(Ll/֨ۧܿ;Ll/ۚۧܿ;ZLl/᩵ۧܿ;Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 442
    :try_start_9
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_9
    .catch Ljava/io/UncheckedIOException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ll/ۘ۬ᩳ; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ll/ܳۨۡ; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 458
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p0, Ll/ܿۧܿ;

    const/4 p3, 0x0

    invoke-direct {p0, p3, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    goto/16 :goto_b

    :catch_3
    move-exception p3

    goto :goto_8

    :catch_4
    move-exception p3

    goto/16 :goto_a

    :catch_5
    move-exception p3

    goto/16 :goto_a

    .line 442
    :cond_b
    :goto_3
    :try_start_a
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_a
    .catch Ljava/io/UncheckedIOException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ll/ۘ۬ᩳ; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_6
    .catch Ll/ܳۨۡ; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 458
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p0, Ll/ܿۧܿ;

    const/4 p2, 0x0

    invoke-direct {p0, p2, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    :goto_4
    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 389
    :goto_5
    :try_start_b
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p3

    :try_start_c
    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p2
    :try_end_c
    .catch Ljava/io/UncheckedIOException; {:try_start_c .. :try_end_c} :catch_2
    .catch Ll/ۘ۬ᩳ; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_c} :catch_6
    .catch Ll/ܳۨۡ; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :catchall_2
    move-object p2, v10

    .line 453
    :catchall_3
    :try_start_d
    new-instance p3, Ll/᩻ۧܿ;

    invoke-direct {p3, p0, p1}, Ll/᩻ۧܿ;-><init>(Ll/֨ۧܿ;Ll/ۚۧܿ;)V

    invoke-static {p3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 458
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p0, Ll/ܿۧܿ;

    const/4 p3, 0x0

    invoke-direct {p0, p3, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    goto :goto_b

    :catchall_4
    move-exception p0

    goto :goto_c

    :goto_7
    move-object p3, p2

    move-object p2, v10

    .line 448
    :goto_8
    :try_start_e
    new-instance v1, Ll/ܳۧܿ;

    invoke-direct {v1, p0, p1, p3}, Ll/ܳۧܿ;-><init>(Ll/֨ۧܿ;Ll/ۚۧܿ;Ll/ܳۨۡ;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 458
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p0, Ll/ܿۧܿ;

    const/4 p3, 0x0

    invoke-direct {p0, p3, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    goto :goto_b

    :catch_6
    move-object p2, v10

    .line 458
    :catch_7
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p0, Ll/ܿۧܿ;

    const/4 p3, 0x0

    invoke-direct {p0, p3, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    goto :goto_b

    :goto_9
    move-object p3, p2

    move-object p2, v10

    .line 444
    :goto_a
    :try_start_f
    new-instance v1, Ll/᩷ۧܿ;

    invoke-direct {v1, p0, p1, p3}, Ll/᩷ۧܿ;-><init>(Ll/֨ۧܿ;Ll/ۚۧܿ;Ljava/lang/RuntimeException;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 458
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p0, Ll/ܿۧܿ;

    const/4 p3, 0x0

    invoke-direct {p0, p3, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    :goto_b
    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    if-eqz p2, :cond_c

    .line 462
    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_c
    return-void

    .line 458
    :goto_c
    invoke-virtual {v3, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 459
    invoke-static {p1}, Ll/ۚۧܿ;->ۧ(Ll/ۚۧܿ;)V

    .line 460
    new-instance p2, Ll/ܿۧܿ;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 461
    throw p0
.end method

.method private ֫(Ll/ۨۘܽ;)V
    .locals 4

    .line 320
    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۧܿ;->᩵:Ll/۟᩺ᩳ;

    .line 321
    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    iput v0, p0, Ll/֨ۧܿ;->ᩴ:I

    .line 322
    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    .line 1294
    iget v0, v0, Ll/۫ۨᩳ;->ۢ֫:I

    .line 322
    iput v0, p0, Ll/֨ۧܿ;->֡:I

    .line 323
    iget-object v0, p0, Ll/֨ۧܿ;->᩸:Ll/ۚۧܿ;

    .line 324
    iget-object v1, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    const-string v2, ""

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/۫ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v1

    if-ne v1, p1, :cond_1

    if-eqz v0, :cond_0

    iget-object v1, v0, Ll/ۚۧܿ;->ܳ:Ll/۫ۘܽ;

    iget-object v3, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    if-ne v1, v3, :cond_0

    invoke-static {v0}, Ll/ۚۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 328
    :cond_0
    iget-object p1, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    invoke-virtual {p1, v2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Ll/۫ۘܽ;->ۡ()V

    return-void

    .line 326
    :cond_1
    :goto_0
    invoke-virtual {p1, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۫ۘܽ;->ۡ()V

    iput-object p1, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    return-void
.end method

.method private declared-synchronized ֫(ZZ)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 366
    :try_start_0
    iget-object v1, p0, Ll/֨ۧܿ;->᩸:Ll/ۚۧܿ;

    if-eqz v1, :cond_0

    .line 367
    invoke-virtual {v1}, Ll/ۚۧܿ;->ᩳ()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ll/ۚۧܿ;->֫()V

    .line 368
    :cond_0
    iget-object v2, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-nez v2, :cond_2

    .line 507
    iput-boolean v4, p0, Ll/֨ۧܿ;->ܽ:Z

    .line 508
    iput v3, p0, Ll/֨ۧܿ;->᩻:I

    .line 514
    iput v3, p0, Ll/֨ۧܿ;->᩶:I

    const/4 p1, 0x0

    .line 515
    iput-object p1, p0, Ll/֨ۧܿ;->ۗ:Ll/۟᩺ᩳ;

    .line 370
    iget-object p1, p0, Ll/֨ۧܿ;->ܶ:Ljava/util/regex/PatternSyntaxException;

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ljava/util/regex/PatternSyntaxException;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 371
    :cond_1
    monitor-exit v0

    return-void

    :cond_2
    if-eqz v1, :cond_3

    .line 373
    :try_start_1
    iget-object v5, v1, Ll/ۚۧܿ;->ܳ:Ll/۫ۘܽ;

    if-ne v5, v2, :cond_3

    invoke-static {v1}, Ll/ۚۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 374
    iget-object v1, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    invoke-virtual {v1}, Ll/۫ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/֨ۧܿ;->֫(Ll/ۨۘܽ;)V

    .line 376
    :cond_3
    new-instance v1, Ll/ۚۧܿ;

    invoke-direct {v1, p0}, Ll/ۚۧܿ;-><init>(Ll/֨ۧܿ;)V

    .line 377
    iput-object v1, p0, Ll/֨ۧܿ;->᩸:Ll/ۚۧܿ;

    .line 507
    iput-boolean v4, p0, Ll/֨ۧܿ;->ܽ:Z

    .line 508
    iput v3, p0, Ll/֨ۧܿ;->᩻:I

    .line 380
    sget-object v2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/ܽۧܿ;

    invoke-direct {v3, p0, v1, p1, p2}, Ll/ܽۧܿ;-><init>(Ll/֨ۧܿ;Ll/ۚۧܿ;ZZ)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۚۧܿ;->֫(Ljava/util/concurrent/Future;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 464
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static synthetic ֫(Ll/֨ۧܿ;Ll/۬۟ᩳ;)Z
    .locals 0

    .line 674
    iget-object p0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private ֫(Ll/ۚۧܿ;)Z
    .locals 3

    .line 358
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->ۧ(Ll/ۚۧܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۚۧܿ;->֡:Ll/۟᩺ᩳ;

    iget-object v1, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    if-ne v0, v2, :cond_0

    iget v0, p1, Ll/ۚۧܿ;->᩻:I

    iget-object v2, p1, Ll/ۚۧܿ;->֡:Ll/۟᩺ᩳ;

    .line 359
    invoke-interface {v2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    if-ne v0, v2, :cond_0

    iget p1, p1, Ll/ۚۧܿ;->֨:I

    .line 1294
    iget v0, v1, Ll/۫ۨᩳ;->ۢ֫:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ֫(Ll/ۚۧܿ;Z)Z
    .locals 16

    move-object/from16 v0, p1

    .line 468
    iget-object v1, v0, Ll/ۚۧܿ;->᩷:Ll/ۖۧܿ;

    iget-object v2, v0, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    iget-boolean v4, v0, Ll/ۚۧܿ;->ۜ:Z

    if-eqz v4, :cond_6

    iget-object v4, v0, Ll/ۚۧܿ;->ۡ:Ll/۬۟ᩳ;

    if-nez v4, :cond_6

    invoke-direct/range {p0 .. p1}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_7

    .line 469
    :cond_0
    invoke-interface {v1}, Ll/ۖۧܿ;->֫()I

    move-result v4

    invoke-interface {v1}, Ll/ۖۧܿ;->ۧ()I

    move-result v5

    .line 470
    iget-object v6, v0, Ll/ۚۧܿ;->ܳ:Ll/۫ۘܽ;

    invoke-virtual {v6}, Ll/۫ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v6

    const-string v7, ""

    invoke-virtual {v6, v7}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v6

    invoke-virtual {v6}, Ll/۫ۘܽ;->ۡ()V

    .line 471
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Ll/᩵᩺ᩳ;

    const/4 v9, 0x0

    invoke-direct {v8, v9, v2}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v6, v8}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    const/4 v8, 0x1

    const/4 v9, 0x1

    :goto_0
    const/4 v10, 0x0

    if-ge v9, v4, :cond_5

    .line 474
    :try_start_0
    invoke-virtual {v2}, Ll/ܰ᩺ᩳ;->ᩳ()V

    .line 475
    invoke-direct/range {p0 .. p1}, Ll/֨ۧܿ;->֫(Ll/ۚۧܿ;)Z

    move-result v11

    if-nez v11, :cond_1

    goto/16 :goto_6

    :cond_1
    if-eqz p2, :cond_2

    move v11, v9

    goto :goto_1

    :cond_2
    sub-int v11, v4, v9

    :goto_1
    add-int/2addr v11, v5

    .line 476
    rem-int/2addr v11, v4

    .line 477
    new-instance v12, Ll/᩵ۧܿ;

    invoke-direct {v12}, Ll/᩵ۧܿ;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 478
    :try_start_1
    invoke-interface {v1, v11}, Ll/ۖۧܿ;->֫(I)Ll/۟᩸ᩳ;

    move-result-object v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 479
    :try_start_2
    new-instance v14, Ll/᩵᩺ᩳ;

    const/4 v15, 0x0

    invoke-direct {v14, v15, v2}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v13, v14}, Ll/۟᩸ᩳ;->ۧ(Ljava/lang/Runnable;)V

    .line 480
    invoke-virtual {v6, v13}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 481
    invoke-static {v6, v3, v8}, Ll/֨ۧܿ;->֫(Ll/۫ۘܽ;IZ)Z

    move-result v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v14, :cond_3

    .line 484
    :try_start_3
    invoke-virtual {v13}, Ll/۟᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-virtual {v6, v7}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 482
    :cond_3
    :try_start_5
    invoke-virtual {v12, v6}, Ll/᩵ۧܿ;->֫(Ll/۫ۘܽ;)V

    if-nez p2, :cond_4

    .line 483
    :goto_2
    invoke-static {v6}, Ll/۫۟ᩳ;->ۧ(Ll/۫ۘܽ;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v12, v6}, Ll/᩵ۧܿ;->֫(Ll/۫ۘܽ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    .line 484
    :cond_4
    :try_start_6
    invoke-virtual {v13}, Ll/۟᩸ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    invoke-virtual {v6, v7}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 485
    new-instance v1, Ll/ۢۧܿ;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move-object/from16 v2, p0

    :try_start_8
    invoke-direct {v1, v2, v0, v11, v12}, Ll/ۢۧܿ;-><init>(Ll/֨ۧܿ;Ll/ۚۧܿ;ILl/᩵ۧܿ;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 502
    invoke-virtual {v6, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v6, v7}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    return v8

    :catchall_0
    move-exception v0

    move-object/from16 v2, p0

    move-object v1, v0

    .line 478
    :try_start_9
    invoke-virtual {v13}, Ll/۟᩸ᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_a
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object/from16 v2, p0

    .line 484
    :goto_4
    :try_start_b
    invoke-virtual {v6, v7}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception v0

    goto :goto_5

    :catchall_5
    move-exception v0

    move-object/from16 v2, p0

    .line 502
    :goto_5
    invoke-virtual {v6, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v6, v7}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    throw v0

    :cond_5
    :goto_6
    move-object/from16 v2, p0

    invoke-virtual {v6, v10}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    invoke-virtual {v6, v7}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    return v3

    :cond_6
    :goto_7
    move-object/from16 v2, p0

    return v3
.end method

.method public static ֫(Ll/۫ۘܽ;IZ)Z
    .locals 1

    .line 286
    invoke-static {p0, p1}, Ll/۫۟ᩳ;->֫(Ll/۫ۘܽ;I)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    .line 287
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result p2

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result p2

    if-ne p2, p1, :cond_0

    .line 288
    invoke-static {p0}, Ll/۫۟ᩳ;->ۧ(Ll/۫ۘܽ;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۖ(Ll/֨ۧܿ;)V
    .locals 0

    .line 803
    iget-object p0, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    return-void
.end method

.method public static ۘ(Ll/֨ۧܿ;)V
    .locals 0

    .line 797
    iget-object p0, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/֨ۧܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֨ۧܿ;->֡:I

    return p0
.end method

.method public static bridge synthetic ۡ(Ll/֨ۧܿ;)Ll/ܰ᩺ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۧܿ;->۫:Ll/ܰ᩺ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/֨ۧܿ;)Ll/ۖۧܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۧܿ;->۠:Ll/ۖۧܿ;

    return-object p0
.end method

.method private ۢ()Z
    .locals 3

    .line 333
    iget-object v0, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֨ۧܿ;->᩵:Ll/۟᩺ᩳ;

    iget-object v1, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Ll/֨ۧܿ;->᩵:Ll/۟᩺ᩳ;

    if-eqz v0, :cond_0

    iget v2, p0, Ll/֨ۧܿ;->ᩴ:I

    .line 334
    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    if-ne v2, v0, :cond_0

    iget v0, p0, Ll/֨ۧܿ;->֡:I

    .line 1294
    iget v1, v1, Ll/۫ۨᩳ;->ۢ֫:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ۧ(Ll/֨ۧܿ;)Ll/۫ۨᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    return-object p0
.end method

.method public static ۧ(Ll/֨ۧܿ;I)Z
    .locals 3

    .line 299
    iget-object v0, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    invoke-virtual {v0}, Ll/᩵ۧܿ;->ۧ()Ll/ۨۘܽ;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 302
    :cond_0
    iget-object v0, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    invoke-virtual {v0}, Ll/᩵ۧܿ;->ۧ()Ll/ۨۘܽ;

    move-result-object v0

    iget-object v1, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    invoke-virtual {v1}, Ll/۫ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 305
    :cond_1
    iget-object v0, p0, Ll/֨ۧܿ;->ۗ:Ll/۟᩺ᩳ;

    if-eqz v0, :cond_3

    iget v0, p0, Ll/֨ۧܿ;->᩶:I

    iget-object v1, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    .line 1294
    iget v2, v1, Ll/۫ۨᩳ;->ۢ֫:I

    if-ne v0, v2, :cond_3

    .line 305
    iget-object v0, p0, Ll/֨ۧܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    if-ne v0, v1, :cond_3

    iget v0, p0, Ll/֨ۧܿ;->ۙ:I

    iget-object v1, p0, Ll/֨ۧܿ;->ۗ:Ll/۟᩺ᩳ;

    .line 306
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 309
    :cond_2
    iget-object v0, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    invoke-virtual {v0}, Ll/᩵ۧܿ;->ܽ()I

    move-result v0

    if-ne v0, p1, :cond_3

    iget-object v0, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    .line 310
    invoke-virtual {v0}, Ll/᩵ۧܿ;->֫()I

    move-result v0

    if-ne v0, p1, :cond_3

    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    .line 311
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v0

    if-ne v0, p1, :cond_3

    iget-object p0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    .line 312
    invoke-virtual {p0}, Ll/۫ۨᩳ;->۬֫()I

    move-result p0

    if-ne p0, p1, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/֨ۧܿ;Ll/ۚۧܿ;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->ۧ(Ll/ۚۧܿ;)Z

    move-result p0

    return p0
.end method

.method private ۧ(Ll/ۚۧܿ;)Z
    .locals 2

    .line 351
    iget-object v0, p0, Ll/֨ۧܿ;->᩸:Ll/ۚۧܿ;

    if-ne v0, p1, :cond_0

    invoke-virtual {p1}, Ll/ۚۧܿ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    iget-object v1, p1, Ll/ۚۧܿ;->ܳ:Ll/۫ۘܽ;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/֨ۧܿ;->ۢ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۚۧܿ;->ۢ:Ljava/lang/String;

    .line 352
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/֨ۧܿ;->ۧ()I

    move-result v0

    iget v1, p1, Ll/ۚۧܿ;->ᩳ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    .line 353
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object v0

    iget-object v1, p1, Ll/ۚۧܿ;->ۡ:Ll/۬۟ᩳ;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֨ۧܿ;->۠:Ll/ۖۧܿ;

    iget-object v1, p1, Ll/ۚۧܿ;->᩷:Ll/ۖۧܿ;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/֨ۧܿ;->֨:Z

    iget-boolean p1, p1, Ll/ۚۧܿ;->ۜ:Z

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ܳ(Ll/֨ۧܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֨ۧܿ;->ᩴ:I

    return p0
.end method

.method private ܳ(Z)V
    .locals 2

    .line 809
    iget-object v0, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    iget-object v1, p0, Ll/֨ۧܿ;->᩷:Ll/۬۟ᩳ;

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/֨ۧܿ;->۠:Ll/ۖۧܿ;

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Ll/֨ۧܿ;->֨:Z

    if-eqz v1, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, Ll/ۘۧܿ;->֫(Z)V

    return-void
.end method

.method public static bridge synthetic ܺ(Ll/֨ۧܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/֨ۧܿ;->۫:Ll/ܰ᩺ᩳ;

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/֨ۧܿ;)Ll/۬۟ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۧܿ;->᩷:Ll/۬۟ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/֨ۧܿ;)Ll/۫ۘܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֨ۧܿ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۧܿ;->ۢ:Ljava/lang/String;

    return-object p0
.end method

.method private ᩳ(Ljava/lang/String;)Z
    .locals 3

    .line 87
    invoke-direct {p0}, Ll/֨ۧܿ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/֨ۧܿ;->ۜ:I

    .line 1294
    iget-object v1, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    iget v2, v1, Ll/۫ۨᩳ;->ۢ֫:I

    if-ne v0, v2, :cond_0

    .line 87
    iget-object v0, p0, Ll/֨ۧܿ;->ۢ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 89
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/֨ۧܿ;->᩷:Ll/۬۟ᩳ;

    .line 90
    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ll/֨ۧܿ;->ܳ:Z

    iget-boolean v0, p0, Ll/֨ۧܿ;->۬:Z

    if-ne p1, v0, :cond_0

    iget-boolean p1, p0, Ll/֨ۧܿ;->ۡ:Z

    iget-boolean v0, p0, Ll/֨ۧܿ;->ۛ:Z

    if-ne p1, v0, :cond_0

    iget-boolean p1, p0, Ll/֨ۧܿ;->ܿ:Z

    iget-boolean v0, p0, Ll/֨ۧܿ;->ۖ:Z

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ᩴ(Ll/֨ۧܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, v0}, Ll/֨ۧܿ;->ܳ(Z)V

    return-void
.end method

.method private ᩷()V
    .locals 2

    .line 340
    iget-object v0, p0, Ll/֨ۧܿ;->᩸:Ll/ۚۧܿ;

    const/4 v1, 0x0

    .line 341
    iput-object v1, p0, Ll/֨ۧܿ;->᩸:Ll/ۚۧܿ;

    if-eqz v0, :cond_0

    .line 343
    invoke-virtual {v0}, Ll/ۚۧܿ;->֫()V

    .line 344
    invoke-virtual {v0}, Ll/ۚۧܿ;->ۧ()V

    :cond_0
    const/4 v0, 0x0

    .line 507
    iput-boolean v0, p0, Ll/֨ۧܿ;->ܽ:Z

    const/4 v0, -0x1

    .line 508
    iput v0, p0, Ll/֨ۧܿ;->᩻:I

    .line 514
    iput v0, p0, Ll/֨ۧܿ;->᩶:I

    .line 515
    iput-object v1, p0, Ll/֨ۧܿ;->ۗ:Ll/۟᩺ᩳ;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/֨ۧܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֨ۧܿ;->֨:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/֨ۧܿ;)Ll/۟᩺ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۧܿ;->᩵:Ll/۟᩺ᩳ;

    return-object p0
.end method


# virtual methods
.method public final ֫()B
    .locals 2

    .line 158
    iget-boolean v0, p0, Ll/֨ۧܿ;->۬:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    int-to-byte v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 162
    :goto_0
    iget-boolean v1, p0, Ll/֨ۧܿ;->ۛ:Z

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    .line 166
    :cond_1
    iget-boolean v1, p0, Ll/֨ۧܿ;->ۖ:Z

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x4

    int-to-byte v0, v0

    .line 79
    :cond_2
    iget-boolean v1, p0, Ll/֨ۧܿ;->֨:Z

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    .line 170
    :cond_3
    iget-boolean v1, p0, Ll/֨ۧܿ;->ۚ:Z

    if-eqz v1, :cond_4

    or-int/lit8 v0, v0, 0x10

    int-to-byte v0, v0

    :cond_4
    return v0
.end method

.method public final ֫(B)V
    .locals 5

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v2, p1, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    and-int/lit8 v3, p1, 0x4

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v4, p1, 0x8

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    .line 129
    :goto_3
    invoke-virtual {p0, v4}, Ll/֨ۧܿ;->ܽ(Z)V

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_4

    const/4 v1, 0x1

    .line 131
    :cond_4
    invoke-virtual {p0, v0}, Ll/֨ۧܿ;->ᩳ(Z)V

    .line 132
    invoke-virtual {p0, v2}, Ll/֨ۧܿ;->ܿ(Z)V

    .line 133
    invoke-virtual {p0, v3}, Ll/֨ۧܿ;->֫(Z)V

    .line 154
    iput-boolean v1, p0, Ll/֨ۧܿ;->ۚ:Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 183
    iget-object v0, p0, Ll/֨ۧܿ;->ܺ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 200
    :cond_0
    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    iget-object v0, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v0}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    .line 203
    iput-boolean v0, p0, Ll/֨ۧܿ;->ᩳ:Z

    .line 204
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    .line 210
    invoke-direct {p0, p1, v0, v2}, Ll/֨ۧܿ;->֫(Ljava/lang/String;ZZ)V

    return-void

    .line 363
    :cond_2
    invoke-direct {p0, v0, v2}, Ll/֨ۧܿ;->֫(ZZ)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 578
    iget-object v0, p0, Ll/֨ۧܿ;->ܺ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    .line 580
    :cond_0
    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v1

    if-nez v1, :cond_d

    iget-object v1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v1}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_4

    .line 97
    :cond_1
    invoke-direct {p0}, Ll/֨ۧܿ;->ۢ()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_b

    iget v1, p0, Ll/֨ۧܿ;->᩻:I

    .line 1294
    iget v3, v0, Ll/۫ۨᩳ;->ۢ֫:I

    if-ne v1, v3, :cond_b

    .line 97
    iget-boolean v1, p0, Ll/֨ۧܿ;->ܽ:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֨ۧܿ;->ۗ:Ll/۟᩺ᩳ;

    iget-object v3, p0, Ll/֨ۧܿ;->᩵:Ll/۟᩺ᩳ;

    if-ne v1, v3, :cond_b

    iget v1, p0, Ll/֨ۧܿ;->ۙ:I

    iget v3, p0, Ll/֨ۧܿ;->ᩴ:I

    if-ne v1, v3, :cond_b

    :cond_2
    iget-object v1, p0, Ll/֨ۧܿ;->ۢ:Ljava/lang/String;

    if-eqz v1, :cond_b

    .line 100
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Ll/֨ۧܿ;->᩷:Ll/۬۟ᩳ;

    .line 101
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-boolean v1, p0, Ll/֨ۧܿ;->ܳ:Z

    iget-boolean v3, p0, Ll/֨ۧܿ;->۬:Z

    if-ne v1, v3, :cond_b

    iget-boolean v1, p0, Ll/֨ۧܿ;->ۡ:Z

    iget-boolean v3, p0, Ll/֨ۧܿ;->ۛ:Z

    if-ne v1, v3, :cond_b

    iget-boolean v1, p0, Ll/֨ۧܿ;->ܿ:Z

    iget-boolean v3, p0, Ll/֨ۧܿ;->ۖ:Z

    if-ne v1, v3, :cond_b

    .line 588
    iget-boolean v1, p0, Ll/֨ۧܿ;->ܽ:Z

    if-nez v1, :cond_3

    .line 589
    invoke-direct {p0, v2}, Ll/֨ۧܿ;->ܳ(Z)V

    return-void

    .line 592
    :cond_3
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v1

    iget-object v3, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    invoke-virtual {v3}, Ll/᩵ۧܿ;->ܽ()I

    move-result v3

    if-ne v1, v3, :cond_a

    .line 593
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result v1

    iget-object v3, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    invoke-virtual {v3}, Ll/᩵ۧܿ;->֫()I

    move-result v3

    if-eq v1, v3, :cond_4

    goto/16 :goto_3

    .line 597
    :cond_4
    iget-object v1, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    invoke-virtual {v1}, Ll/᩵ۧܿ;->ܽ()I

    move-result v1

    .line 598
    iget-object v3, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    invoke-virtual {v3}, Ll/᩵ۧܿ;->֫()I

    move-result v3

    .line 600
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v4

    .line 602
    :try_start_0
    iget-boolean v5, p0, Ll/֨ۧܿ;->۬:Z

    if-eqz v5, :cond_6

    .line 604
    invoke-interface {v4}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v5
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_0 .. :try_end_0} :catch_0

    .line 605
    :try_start_1
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v6

    iget v7, p0, Ll/֨ۧܿ;->ۙ:I

    if-eq v6, v7, :cond_5

    .line 606
    iget-boolean p2, p0, Ll/֨ۧܿ;->ᩳ:Z

    invoke-direct {p0, p1, p2, v2}, Ll/֨ۧܿ;->֫(Ljava/lang/String;ZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 610
    :try_start_2
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/UncheckedIOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    .line 609
    :cond_5
    :try_start_3
    iget-object p1, p0, Ll/֨ۧܿ;->᩹:Ll/᩵ۧܿ;

    .line 772
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 773
    new-instance v7, Ll/ᩴۧܿ;

    invoke-direct {v7, p1, v5}, Ll/ᩴۧܿ;-><init>(Ll/᩵ۧܿ;Ll/۟᩸ᩳ;)V

    invoke-static {v7, v6, p2}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 788
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 610
    :try_start_4
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->close()V
    :try_end_4
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/UncheckedIOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 604
    :try_start_5
    invoke-virtual {v5}, Ll/۟᩸ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_6
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 825
    :cond_6
    :goto_1
    iget-object p1, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    if-eqz p1, :cond_7

    .line 827
    invoke-interface {p1}, Ll/ۘۧܿ;->֫()V

    .line 613
    :cond_7
    invoke-interface {v4, v1, v3, p2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;
    :try_end_6
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/io/UncheckedIOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ll/ۘ۬ᩳ; {:try_start_6 .. :try_end_6} :catch_0

    const/4 p1, 0x0

    .line 1040
    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ᩳ(Z)V

    const/4 p1, -0x1

    .line 622
    iput p1, p0, Ll/֨ۧܿ;->ۜ:I

    .line 1294
    iget p1, v0, Ll/۫ۨᩳ;->ۢ֫:I

    .line 623
    iput p1, p0, Ll/֨ۧܿ;->᩻:I

    .line 624
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 625
    iget-object p1, p0, Ll/֨ۧܿ;->᩷:Ll/۬۟ᩳ;

    if-eqz p1, :cond_8

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۧܿ;->᩷:Ll/۬۟ᩳ;

    .line 626
    :cond_8
    iget-object p1, p0, Ll/֨ۧܿ;->ۘ:Ll/۫ۘܽ;

    invoke-virtual {p1}, Ll/۫ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ll/ۨۘܽ;)V

    .line 170
    iget-boolean p1, p0, Ll/֨ۧܿ;->ۚ:Z

    if-nez p1, :cond_d

    .line 628
    iget-boolean p1, p0, Ll/֨ۧܿ;->ᩳ:Z

    invoke-direct {p0, p1, v2}, Ll/֨ۧܿ;->֫(ZZ)V

    .line 629
    iget-boolean p1, p0, Ll/֨ۧܿ;->ܽ:Z

    if-nez p1, :cond_d

    .line 630
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ᩴ(I)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 618
    :goto_2
    invoke-virtual {v0, v4, p1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2

    if-eqz p2, :cond_9

    goto :goto_4

    :cond_9
    throw p1

    :catch_2
    move-exception p1

    .line 615
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ljava/util/regex/PatternSyntaxException;)V

    return-void

    .line 594
    :cond_a
    :goto_3
    iget-boolean p1, p0, Ll/֨ۧܿ;->ᩳ:Z

    invoke-direct {p0, p1, v2}, Ll/֨ۧܿ;->֫(ZZ)V

    return-void

    .line 584
    :cond_b
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->ᩳ(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_c

    iget-boolean p1, p0, Ll/֨ۧܿ;->ᩳ:Z

    invoke-direct {p0, p1, v2}, Ll/֨ۧܿ;->֫(ZZ)V

    return-void

    .line 585
    :cond_c
    iget-boolean p2, p0, Ll/֨ۧܿ;->ᩳ:Z

    invoke-direct {p0, p1, p2, v2}, Ll/֨ۧܿ;->֫(Ljava/lang/String;ZZ)V

    :cond_d
    :goto_4
    return-void
.end method

.method public final ֫(Ll/ۖۧܿ;)V
    .locals 1

    .line 75
    iget-object v0, p0, Ll/֨ۧܿ;->۠:Ll/ۖۧܿ;

    if-eq v0, p1, :cond_0

    invoke-direct {p0}, Ll/֨ۧܿ;->᩷()V

    .line 76
    :cond_0
    iput-object p1, p0, Ll/֨ۧܿ;->۠:Ll/ۖۧܿ;

    return-void
.end method

.method public final ֫(Ll/ۘۧܿ;)V
    .locals 0

    .line 793
    iput-object p1, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 149
    iget-boolean v0, p0, Ll/֨ۧܿ;->ۖ:Z

    if-eq v0, p1, :cond_0

    invoke-virtual {p0}, Ll/֨ۧܿ;->ۜ()V

    .line 150
    :cond_0
    iput-boolean p1, p0, Ll/֨ۧܿ;->ۖ:Z

    return-void
.end method

.method public final ۜ()V
    .locals 1

    .line 262
    invoke-direct {p0}, Ll/֨ۧܿ;->᩷()V

    .line 263
    iget-object v0, p0, Ll/֨ۧܿ;->۫:Ll/ܰ᩺ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->ܽ()V

    .line 264
    :cond_0
    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    iget-object v0, v0, Ll/۫ۨᩳ;->֡ᩳ:Ll/ۜ֫ܿ;

    invoke-virtual {v0}, Ll/ۜ֫ܿ;->֫()V

    return-void
.end method

.method public final ۧ()I
    .locals 3

    .line 174
    iget-boolean v0, p0, Ll/֨ۧܿ;->۬:Z

    iget-boolean v1, p0, Ll/֨ۧܿ;->ۖ:Z

    iget-boolean v2, p0, Ll/֨ۧܿ;->ۛ:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    if-nez v1, :cond_1

    or-int/lit8 v0, v0, 0x42

    :cond_1
    if-eqz v2, :cond_2

    or-int/lit16 v0, v0, 0x200

    :cond_2
    return v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 193
    iget-object v0, p0, Ll/֨ۧܿ;->ܺ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 200
    :cond_0
    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    iget-object v0, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v0}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    .line 203
    iput-boolean v0, p0, Ll/֨ۧܿ;->ᩳ:Z

    .line 204
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 210
    invoke-direct {p0, p1, v0, v0}, Ll/֨ۧܿ;->֫(Ljava/lang/String;ZZ)V

    return-void

    .line 363
    :cond_2
    invoke-direct {p0, v0, v0}, Ll/֨ۧܿ;->֫(ZZ)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 639
    iget-object v0, p0, Ll/֨ۧܿ;->۫:Ll/ܰ᩺ᩳ;

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 640
    :cond_0
    iget-object v0, p0, Ll/֨ۧܿ;->ܺ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_1

    .line 642
    :cond_1
    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v1}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_1

    :cond_2
    const/4 v1, -0x1

    .line 645
    iput v1, p0, Ll/֨ۧܿ;->᩻:I

    iput v1, p0, Ll/֨ۧܿ;->ۜ:I

    .line 647
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    .line 651
    :cond_3
    :try_start_0
    invoke-virtual {p0}, Ll/֨ۧܿ;->ۧ()I

    move-result v1

    invoke-static {v1, p1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v7
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_1

    .line 656
    iget-boolean p1, p0, Ll/֨ۧܿ;->۬:Z

    if-eqz p1, :cond_4

    .line 658
    :try_start_1
    invoke-static {v7, p2}, Ll/ܰۘܽ;->֫(Ll/ۨۘܽ;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 660
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ljava/util/regex/PatternSyntaxException;)V

    return-void

    .line 819
    :cond_4
    :goto_0
    iget-object p1, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    if-eqz p1, :cond_5

    .line 821
    invoke-interface {p1}, Ll/ۘۧܿ;->ۧ()V

    .line 825
    :cond_5
    iget-object p1, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    if-eqz p1, :cond_6

    .line 827
    invoke-interface {p1}, Ll/ۘۧܿ;->֫()V

    .line 668
    :cond_6
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v5

    .line 669
    invoke-interface {v5}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v6

    .line 670
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object v8

    .line 671
    iget-boolean v10, p0, Ll/֨ۧܿ;->۬:Z

    .line 672
    invoke-direct {p0}, Ll/֨ۧܿ;->᩷()V

    .line 673
    new-instance v4, Ll/ܰ᩺ᩳ;

    new-instance p1, Ll/ᩳۧܿ;

    invoke-direct {p1, p0, v8}, Ll/ᩳۧܿ;-><init>(Ll/֨ۧܿ;Ll/۬۟ᩳ;)V

    iget-object v1, p0, Ll/֨ۧܿ;->֫:Ll/ۗܺ᩷;

    const v2, 0x7f1207a7

    invoke-direct {v4, v0, v1, v2, p1}, Ll/ܰ᩺ᩳ;-><init>(Ll/۫ۨᩳ;Ll/ۗܺ᩷;ILjava/util/function/BooleanSupplier;)V

    .line 675
    iput-object v4, p0, Ll/֨ۧܿ;->۫:Ll/ܰ᩺ᩳ;

    .line 676
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Ll/۠֨ᩴ;->toPath(Ljava/io/File;)Ll/᩷۠ᩴ;

    move-result-object p1

    const-string v0, "replace-output"

    invoke-interface {p1, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v11

    .line 677
    new-instance p1, Ll/ܺۧܿ;

    move-object v2, p1

    move-object v3, p0

    move-object v9, p2

    invoke-direct/range {v2 .. v11}, Ll/ܺۧܿ;-><init>(Ll/֨ۧܿ;Ll/ܰ᩺ᩳ;Ll/۟᩺ᩳ;ILl/ۨۘܽ;Ll/۬۟ᩳ;Ljava/lang/String;ZLl/᩷۠ᩴ;)V

    .line 741
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void

    :catch_1
    move-exception p1

    .line 653
    invoke-direct {p0, p1}, Ll/֨ۧܿ;->֫(Ljava/util/regex/PatternSyntaxException;)V

    :cond_7
    :goto_1
    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 154
    iput-boolean p1, p0, Ll/֨ۧܿ;->ۚ:Z

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 158
    iget-boolean v0, p0, Ll/֨ۧܿ;->۬:Z

    return v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 3

    .line 242
    iget-object v0, p0, Ll/֨ۧܿ;->ۢ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ll/֨ۧܿ;->᩷()V

    .line 243
    :cond_0
    iget-object v0, p0, Ll/֨ۧܿ;->ۧ:Ll/۫ۨᩳ;

    iget-object v1, v0, Ll/۫ۨᩳ;->֡ᩳ:Ll/ۜ֫ܿ;

    .line 244
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 245
    invoke-virtual {v1}, Ll/ۜ֫ܿ;->֫()V

    .line 246
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧ()V

    return-void

    .line 251
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ll/֨ۧܿ;->ۧ()I

    move-result v2

    invoke-static {v2, p1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v1, v0, p1}, Ll/ۜ֫ܿ;->֫(Ll/۟᩺ᩳ;Ll/ۨۘܽ;)V

    return-void

    .line 254
    :catch_0
    invoke-virtual {v1}, Ll/ۜ֫ܿ;->ܽ()V

    return-void
.end method

.method public final ܽ(Z)V
    .locals 1

    .line 82
    iget-boolean v0, p0, Ll/֨ۧܿ;->֨:Z

    if-eq v0, p1, :cond_0

    invoke-direct {p0}, Ll/֨ۧܿ;->᩷()V

    .line 83
    :cond_0
    iput-boolean p1, p0, Ll/֨ۧܿ;->֨:Z

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 166
    iget-boolean v0, p0, Ll/֨ۧܿ;->ۖ:Z

    return v0
.end method

.method public final ܿ(Z)V
    .locals 1

    .line 144
    iget-boolean v0, p0, Ll/֨ۧܿ;->ۛ:Z

    if-eq v0, p1, :cond_0

    invoke-virtual {p0}, Ll/֨ۧܿ;->ۜ()V

    .line 145
    :cond_0
    iput-boolean p1, p0, Ll/֨ۧܿ;->ۛ:Z

    return-void
.end method

.method public final ܿ()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Ll/֨ۧܿ;->֨:Z

    return v0
.end method

.method public final ᩳ(Z)V
    .locals 1

    .line 138
    iget-boolean v0, p0, Ll/֨ۧܿ;->۬:Z

    if-eq v0, p1, :cond_0

    invoke-virtual {p0}, Ll/֨ۧܿ;->ۜ()V

    .line 139
    :cond_0
    iput-boolean p1, p0, Ll/֨ۧܿ;->۬:Z

    .line 837
    iget-object v0, p0, Ll/֨ۧܿ;->ۤ:Ll/ۘۧܿ;

    if-eqz v0, :cond_1

    .line 839
    invoke-interface {v0, p1}, Ll/ۘۧܿ;->ۧ(Z)V

    :cond_1
    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 170
    iget-boolean v0, p0, Ll/֨ۧܿ;->ۚ:Z

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 162
    iget-boolean v0, p0, Ll/֨ۧܿ;->ۛ:Z

    return v0
.end method
