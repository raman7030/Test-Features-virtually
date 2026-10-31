.class public Ll/ܶܿ᩻;
.super Ll/᩶ܶۢ;
.source "OAIH"


# static fields
.field public static final synthetic ܽۧ:I


# instance fields
.field public ֫ۧ:Ll/ۙ֡ܿ;

.field public ۗ֫:Ll/᩹ۚۢ;

.field public ۛ֫:Ljava/util/concurrent/atomic/AtomicReference;

.field public ۟֫:Ljava/util/List;

.field public ۤ֫:Ll/᩷᩻᩻;

.field public ۧۧ:Ll/ۗۢ᩻;

.field public ۨ֫:Z

.field public ۫֫:Ll/ܶ۬ܳ;

.field public ۬֫:Ll/᩵۬ܳ;

.field public ܰ֫:Z

.field public ᩺֫:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 79
    invoke-direct {p0}, Ll/᩶ܶۢ;-><init>()V

    .line 81
    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v0

    iput-boolean v0, p0, Ll/ܶܿ᩻;->ܰ֫:Z

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 82
    iput-object v0, p0, Ll/ܶܿ᩻;->۟֫:Ljava/util/List;

    .line 85
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/ܶܿ᩻;->ۛ֫:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 86
    iput-object v0, p0, Ll/ܶܿ᩻;->᩺֫:Ljava/util/List;

    .line 87
    new-instance v0, Ll/ۙ֡ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۙ֡ܿ;-><init>(I)V

    iput-object v0, p0, Ll/ܶܿ᩻;->֫ۧ:Ll/ۙ֡ܿ;

    .line 88
    new-instance v0, Ll/᩹ۚۢ;

    invoke-direct {v0}, Ll/᩹ۚۢ;-><init>()V

    iput-object v0, p0, Ll/ܶܿ᩻;->ۗ֫:Ll/᩹ۚۢ;

    .line 94
    new-instance v0, Ll/֨ܿ᩻;

    invoke-direct {v0, p0}, Ll/֨ܿ᩻;-><init>(Ll/ܶܿ᩻;)V

    iput-object v0, p0, Ll/ܶܿ᩻;->۬֫:Ll/᩵۬ܳ;

    return-void
.end method

.method private ۧ(Ll/֨۬ܳ;)V
    .locals 2

    .line 391
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 392
    invoke-virtual {p1}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    .line 393
    invoke-virtual {v0}, Ll/֡۬ܳ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 394
    invoke-virtual {v0}, Ll/֡۬ܳ;->᩶()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 395
    invoke-direct {p0, v0}, Ll/ܶܿ᩻;->ۧ(Ll/֨۬ܳ;)V

    goto :goto_0

    :cond_0
    const v1, 0x7f12087c

    .line 398
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 399
    invoke-virtual {p1}, Ll/֨۬ܳ;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 400
    iget-object p1, p0, Ll/ܶܿ᩻;->ۧۧ:Ll/ۗۢ᩻;

    invoke-static {p1, v0}, Ll/ۤܿ᩻;->֫(Ll/ۗۢ᩻;Ll/֡۬ܳ;)Z

    :cond_1
    return-void
.end method

.method private ܽ(Ll/֨۬ܳ;)V
    .locals 13

    .line 319
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Ll/ܶܿ᩻;->ۛ֫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    .line 322
    :cond_0
    invoke-virtual {p1}, Ll/֨۬ܳ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 323
    invoke-virtual {p1}, Ll/֨۬ܳ;->ܶ()V

    .line 325
    :try_start_0
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۘ()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ll/ܶܿ᩻;->ۗ֫:Ll/᩹ۚۢ;

    if-eqz v0, :cond_4

    .line 327
    :try_start_1
    invoke-virtual {p1}, Ll/֨۬ܳ;->֡()Z

    move-result v0

    if-nez v0, :cond_2

    .line 328
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۡ()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 329
    sget-object v2, Ll/ܽ֨ۢ;->۬:Ll/ܽ֨ۢ;

    invoke-virtual {v1, v0, v2}, Ll/᩹ۚۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽ֨ۢ;)V

    .line 330
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 331
    invoke-virtual {p1}, Ll/֨۬ܳ;->ܽ()Ll/ܿ᩵ܿ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 333
    invoke-virtual {v1, v0}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 335
    :cond_1
    iget-boolean v1, p0, Ll/ܶܿ᩻;->ܰ֫:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 336
    iget-object v1, p0, Ll/ܶܿ᩻;->۟֫:Ljava/util/List;

    new-instance v2, Ll/᩹۫᩷;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v0, p1}, Ll/᩹۫᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    :cond_2
    invoke-virtual {p1}, Ll/֨۬ܳ;->۠()V

    .line 342
    iget-object v0, p0, Ll/ܶܿ᩻;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {v0}, Ll/᩷۫ܳ;->᩷()V

    .line 343
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۢ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 344
    iget-object v0, p0, Ll/ܶܿ᩻;->᩺֫:Ljava/util/List;

    invoke-virtual {p1}, Ll/֨۬ܳ;->ۢ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 347
    :cond_3
    invoke-virtual {p1}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡۬ܳ;->᩶()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۬ܳ;

    .line 348
    invoke-direct {p0, v1}, Ll/ܶܿ᩻;->ܽ(Ll/֨۬ܳ;)V

    goto :goto_0

    .line 352
    :cond_4
    invoke-virtual {p1}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v3

    .line 354
    invoke-virtual {p1}, Ll/֨۬ܳ;->ܽ()Ll/ܿ᩵ܿ;

    move-result-object v0

    .line 355
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۢ()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Ll/֨۬ܳ;->ۢ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    .line 359
    :goto_1
    invoke-virtual {p1}, Ll/֨۬ܳ;->֡()Z

    move-result v4

    if-nez v4, :cond_6

    .line 361
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۡ()Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 362
    sget-object v5, Ll/ܽ֨ۢ;->۬:Ll/ܽ֨ۢ;

    invoke-virtual {v1, v4, v5}, Ll/᩹ۚۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽ֨ۢ;)V

    goto :goto_2

    .line 363
    :cond_6
    invoke-virtual {p1}, Ll/֨۬ܳ;->ᩴ()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_8

    .line 365
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۡ()Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 1147
    invoke-virtual {v4, v5}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 366
    sget-object v5, Ll/ܽ֨ۢ;->۬:Ll/ܽ֨ۢ;

    invoke-virtual {v1, v4, v5}, Ll/᩹ۚۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽ֨ۢ;)V

    if-eqz v2, :cond_7

    .line 368
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 369
    invoke-virtual {p1, v2}, Ll/֨۬ܳ;->ᩳ(Ljava/lang/String;)V

    :cond_7
    :goto_2
    const/4 v1, 0x0

    const/4 v5, 0x0

    move-object v10, v0

    move-object v9, v2

    const/4 v11, 0x0

    const/4 v12, 0x0

    goto :goto_3

    .line 373
    :cond_8
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۡ()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 374
    sget-object v4, Ll/ܽ֨ۢ;->۬:Ll/ܽ֨ۢ;

    invoke-virtual {v1, v0, v4}, Ll/᩹ۚۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽ֨ۢ;)V

    .line 376
    new-instance v1, Ll/ܿ᩵ܿ;

    invoke-direct {v1}, Ll/ܿ᩵ܿ;-><init>()V

    .line 377
    invoke-virtual {v1, v0}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 379
    invoke-virtual {p1}, Ll/֨۬ܳ;->֨()Z

    move-result v4

    const/4 v5, 0x1

    move-object v10, v1

    move-object v9, v2

    move v12, v4

    const/4 v11, 0x1

    move-object v4, v0

    .line 383
    :goto_3
    iget-object v1, p0, Ll/ܶܿ᩻;->ۤ֫:Ll/᩷᩻᩻;

    invoke-virtual {p1}, Ll/֨۬ܳ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v5

    invoke-virtual {p1}, Ll/֨۬ܳ;->ۖ()J

    move-result-wide v7

    invoke-virtual/range {v1 .. v12}, Ll/᩷᩻᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;JJLjava/lang/String;Ll/ܿ᩵ܿ;ZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 386
    :cond_9
    invoke-virtual {p1}, Ll/֨۬ܳ;->۠()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Ll/֨۬ܳ;->۠()V

    .line 387
    throw v0

    :cond_a
    :goto_4
    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 407
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 408
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 409
    iget-boolean p1, p0, Ll/ܶܿ᩻;->ۨ֫:Z

    if-eqz p1, :cond_0

    .line 410
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    .line 413
    :cond_0
    iget-object p1, p0, Ll/ܶܿ᩻;->᩺֫:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 414
    invoke-virtual {p3, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 415
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    .line 119
    iget-boolean v0, p0, Ll/ܶܿ᩻;->ۨ֫:Z

    if-eqz v0, :cond_0

    const v0, 0x7f120a2c

    goto :goto_0

    :cond_0
    const v0, 0x7f120a28

    :goto_0
    const-string v1, "targetPath"

    .line 120
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ۚ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 655
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 114
    sget-object v0, Ll/᩻ܶۢ;->ۚ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 5

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "targetPath"

    .line 133
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "moveMode"

    .line 134
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Ll/ܶܿ᩻;->ۨ֫:Z

    .line 135
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֫֫()Ll/ܰܺܳ;

    move-result-object v2

    check-cast v2, Ll/ۗۢ᩻;

    iput-object v2, p0, Ll/ܶܿ᩻;->ۧۧ:Ll/ۗۢ᩻;

    .line 146
    sget-object v2, Ll/ܽ֨ۢ;->ۙ:Ll/ܽ֨ۢ;

    invoke-static {v1, v2}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    .line 147
    invoke-static {v1, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 148
    new-instance v3, Ll/ۙۤܳ;

    .line 25
    invoke-direct {v3, v2}, Ll/ۙۤܳ;-><init>(Z)V

    .line 148
    iget-object v4, p0, Ll/ܶܿ᩻;->۬֫:Ll/᩵۬ܳ;

    invoke-static {v1, v3, v4}, Ll/ܶ۬ܳ;->֫(Ljava/lang/String;Ll/ۙۤܳ;Ll/᩵۬ܳ;)Ll/ܶ۬ܳ;

    move-result-object v1

    iput-object v1, p0, Ll/ܶܿ᩻;->۫֫:Ll/ܶ۬ܳ;

    .line 149
    iget-object v3, p0, Ll/ܶܿ᩻;->ۧۧ:Ll/ۗۢ᩻;

    iget-object v3, v3, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    iget-boolean v3, v3, Ll/ۗ᩻᩻;->۟:Z

    if-nez v3, :cond_0

    .line 150
    invoke-virtual {v1}, Ll/ܶ۬ܳ;->ۡ()V

    .line 152
    :cond_0
    iget-object v1, p0, Ll/ܶܿ᩻;->۫֫:Ll/ܶ۬ܳ;

    iget-object v3, p0, Ll/ܶܿ᩻;->ۧۧ:Ll/ۗۢ᩻;

    const/4 v4, 0x1

    invoke-virtual {v1, v0, v3, v2, v4}, Ll/ܶ۬ܳ;->֫([Ljava/lang/String;Ll/ܰܺܳ;ZZ)V

    .line 160
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 161
    new-instance v0, Ll/۠۠ܿ;

    invoke-direct {v0}, Ll/۠۠ܿ;-><init>()V

    .line 162
    iget-object v1, p0, Ll/ܶܿ᩻;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {v1}, Ll/ܶ۬ܳ;->ܺ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۬ܳ;

    .line 163
    invoke-virtual {v2, v0, v4}, Ll/֨۬ܳ;->֫(Ll/۠۠ܿ;Z)V

    goto :goto_0

    .line 165
    :cond_1
    invoke-virtual {v0}, Ll/۠۠ܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 166
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->cancel()V

    .line 168
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 171
    :cond_2
    iget-boolean v0, p0, Ll/ܶܿ᩻;->ۨ֫:Z

    if-eqz v0, :cond_3

    const v0, 0x7f120647

    goto :goto_1

    :cond_3
    const v0, 0x7f1202d0

    :goto_1
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 172
    iget-object v0, p0, Ll/ܶܿ᩻;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {p0, v0}, Ll/᩶ܶۢ;->ۧ(Ll/᩷۫ܳ;)V

    .line 173
    invoke-virtual {p0, v4}, Ll/᩶ܶۢ;->ᩳ(Z)V

    .line 174
    iget-object v0, p0, Ll/ܶܿ᩻;->ۗ֫:Ll/᩹ۚۢ;

    invoke-virtual {v0}, Ll/᩹ۚۢ;->֫()V

    .line 175
    iget-object v0, p0, Ll/ܶܿ᩻;->֫ۧ:Ll/ۙ֡ܿ;

    invoke-virtual {v0}, Ll/ۙ֡ܿ;->ۧ()V

    .line 177
    new-instance v0, Ll/᩷᩻᩻;

    iget-object v1, p0, Ll/ܶܿ᩻;->ۧۧ:Ll/ۗۢ᩻;

    new-instance v2, Ll/۠ܿ᩻;

    invoke-direct {v2, p0}, Ll/۠ܿ᩻;-><init>(Ll/ܶܿ᩻;)V

    invoke-direct {v0, v1, v2}, Ll/᩷᩻᩻;-><init>(Ll/ۗۢ᩻;Ll/ۚ᩸ܿ;)V

    iput-object v0, p0, Ll/ܶܿ᩻;->ۤ֫:Ll/᩷᩻᩻;

    .line 206
    iget-object v0, p0, Ll/ܶܿ᩻;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {v0}, Ll/ܶ۬ܳ;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/ܶܿ᩻;->ۛ֫:Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۬ܳ;

    .line 207
    invoke-direct {p0, v1}, Ll/ܶܿ᩻;->ܽ(Ll/֨۬ܳ;)V

    .line 208
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 213
    :cond_5
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 215
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 217
    :cond_6
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_d

    .line 222
    iget-object v0, p0, Ll/ܶܿ᩻;->ۤ֫:Ll/᩷᩻᩻;

    new-instance v1, Ll/ۚܿ᩻;

    invoke-direct {v1, p0}, Ll/ۚܿ᩻;-><init>(Ll/ܶܿ᩻;)V

    invoke-virtual {v0, v1}, Ll/᩷᩻᩻;->֫(Ll/᩻᩻᩻;)V

    .line 258
    iget-object v0, p0, Ll/ܶܿ᩻;->ۤ֫:Ll/᩷᩻᩻;

    invoke-virtual {v0}, Ll/᩷᩻᩻;->ܽ()V

    .line 260
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 262
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 264
    :cond_7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_c

    .line 267
    iget-boolean v0, p0, Ll/ܶܿ᩻;->ۨ֫:Z

    if-eqz v0, :cond_9

    .line 269
    iget-object v0, p0, Ll/ܶܿ᩻;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {v0}, Ll/ܶ۬ܳ;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۬ܳ;

    .line 270
    invoke-direct {p0, v1}, Ll/ܶܿ᩻;->ۧ(Ll/֨۬ܳ;)V

    .line 271
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 273
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 277
    :cond_9
    iget-object v0, p0, Ll/ܶܿ᩻;->۟֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 278
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 279
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 281
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_b
    const-wide/16 v0, 0x64

    .line 284
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 286
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 265
    :cond_c
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0

    .line 218
    :cond_d
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 421
    iget-object p1, p0, Ll/ܶܿ᩻;->ۤ֫:Ll/᩷᩻᩻;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/᩷᩻᩻;->֫()Z

    move-result p1

    if-nez p1, :cond_0

    .line 422
    iget-object p1, p0, Ll/ܶܿ᩻;->ۤ֫:Ll/᩷᩻᩻;

    invoke-virtual {p1}, Ll/᩷᩻᩻;->ۧ()V

    .line 424
    :cond_0
    iget-object p1, p0, Ll/ܶܿ᩻;->֫ۧ:Ll/ۙ֡ܿ;

    invoke-virtual {p1}, Ll/ۙ֡ܿ;->ܽ()V

    .line 425
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 426
    iget-boolean p1, p0, Ll/ܶܿ᩻;->ۨ֫:Z

    if-eqz p1, :cond_1

    .line 427
    iget-object p1, p0, Ll/ܶܿ᩻;->ۧۧ:Ll/ۗۢ᩻;

    invoke-virtual {p1}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 125
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 126
    invoke-virtual {p0, v0}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method
