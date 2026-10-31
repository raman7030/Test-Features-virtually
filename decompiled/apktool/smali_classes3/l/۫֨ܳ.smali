.class public final Ll/۫֨ܳ;
.super Ljava/lang/Object;
.source "E4GI"


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public final ۧ:Ll/۬֨ܳ;

.field public ܽ:Z

.field public ᩳ:Ljava/util/function/BooleanSupplier;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/ᩳܰۡ;)V
    .locals 1

    .line 43
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۜۛۡ;

    invoke-direct {v0, p2}, Ll/ۜۛۡ;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Ll/۫֨ܳ;-><init>(Ll/ۗܺ᩷;Ll/۬֨ܳ;)V

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;Ll/۬֨ܳ;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ll/֡ܳᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    .line 38
    iput-object p1, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    .line 39
    iput-object p2, p0, Ll/۫֨ܳ;->ۧ:Ll/۬֨ܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫֨ܳ;)Ll/ۗܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    return-object p0
.end method

.method public static synthetic ֫(Ll/۫֨ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 5

    .line 70
    iget-object v0, p0, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move-object v0, p0

    .line 71
    monitor-enter v0

    .line 72
    :try_start_0
    iput-boolean v2, p0, Ll/۫֨ܳ;->ܽ:Z

    .line 73
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 75
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 78
    :cond_0
    new-instance v3, Ll/᩸֨ܳ;

    iget-object v0, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    invoke-direct {v3, p0, v0, p1}, Ll/᩸֨ܳ;-><init>(Ll/۫֨ܳ;Ll/ۗܺ᩷;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    const/4 v4, 0x0

    .line 114
    invoke-virtual {v3, v4}, Ll/ۨ۬ܿ;->֫(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 117
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 126
    :cond_1
    invoke-virtual {v3}, Ll/ۨ۬ܿ;->ۜ()V

    return-void

    .line 0
    :cond_2
    :goto_0
    invoke-virtual {p2, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v3, :cond_2

    :goto_1
    move-object v0, p0

    .line 119
    monitor-enter v0

    .line 120
    :try_start_1
    iput-boolean v2, p0, Ll/۫֨ܳ;->ܽ:Z

    .line 121
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 123
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0
.end method

.method public static synthetic ֫(Ll/۫֨ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;[Ljava/lang/CharSequence;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 4

    .line 233
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    .line 234
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 241
    :cond_0
    iget-object v0, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v2, 0x7f1201a5

    .line 242
    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v2, Ll/ۢ۫᩷;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p3}, Ll/ۢ۫᩷;-><init>(ILjava/lang/Object;)V

    const/4 v3, -0x1

    .line 243
    invoke-virtual {v0, p2, v3, v2}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p2, 0x7f12070a

    const/4 v2, 0x0

    .line 244
    invoke-virtual {v0, p2, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/۠֨ܳ;

    const/4 v3, 0x0

    invoke-direct {p2, p0, p1, p3, v3}, Ll/۠֨ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v3, 0x7f12015e

    .line 245
    invoke-virtual {v0, v3, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 p2, 0x0

    .line 253
    invoke-virtual {v0, p2}, Ll/᩵ۚۢ;->֫(Z)V

    .line 254
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p2

    .line 255
    invoke-virtual {p4, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 257
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    .line 258
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 267
    :cond_1
    invoke-virtual {p2}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p4

    new-instance v0, Ll/ܶ֨ܳ;

    invoke-direct {v0, p0, p3, p1, p2}, Ll/ܶ֨ܳ;-><init>(Ll/۫֨ܳ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/֡ۚۢ;)V

    invoke-virtual {p4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 0
    :cond_2
    :goto_0
    invoke-virtual {p4, p2, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p3

    if-eq p3, p2, :cond_2

    .line 260
    :goto_1
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    move-object v0, p0

    .line 261
    monitor-enter v0

    .line 262
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 263
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 264
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_4
    :goto_2
    move-object v0, p0

    .line 235
    monitor-enter v0

    .line 236
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 237
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 238
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0
.end method

.method public static bridge synthetic ۧ(Ll/۫֨ܳ;)Ll/۬֨ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫֨ܳ;->ۧ:Ll/۬֨ܳ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/۫֨ܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/۫֨ܳ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/function/BooleanSupplier;)V
    .locals 0

    .line 53
    iput-object p1, p0, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    return-void
.end method

.method public final ֫()Z
    .locals 7

    .line 58
    invoke-static {}, Ll/ۧۨۡ;->ܽ()V

    .line 59
    iget-object v0, p0, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 60
    iput-boolean v2, p0, Ll/۫֨ܳ;->ܽ:Z

    return v1

    .line 63
    :cond_0
    iget-object v0, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    if-eqz v0, :cond_7

    .line 64
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 67
    :cond_1
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 68
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 69
    iget-object v0, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    new-instance v5, Ll/ۚ֨ܳ;

    invoke-direct {v5, p0, v3, v4}, Ll/ۚ֨ܳ;-><init>(Ll/۫֨ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {v0, v5}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    move-object v0, p0

    .line 129
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    const-wide/16 v5, 0xc8

    .line 131
    :try_start_1
    invoke-virtual {p0, v5, v6}, Ljava/lang/Object;->wait(J)V

    .line 132
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    .line 135
    :cond_3
    iget-object v5, p0, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    invoke-interface {v5}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v5, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v5, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 136
    :cond_4
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 137
    iput-boolean v2, p0, Ll/۫֨ܳ;->ܽ:Z

    const/4 v1, 0x0

    .line 138
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ۬ܿ;

    if-eqz v1, :cond_5

    .line 140
    iget-object v3, p0, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    new-instance v4, Ll/᩷ۛ᩻;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v1}, Ll/᩷ۛ᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 146
    :cond_5
    :goto_0
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_6
    :goto_1
    return v1

    .line 151
    :cond_7
    new-instance v0, Ll/᩶֨ܳ;

    invoke-direct {v0, p0}, Ll/᩶֨ܳ;-><init>(Ll/۫֨ܳ;)V

    iget-object v1, p0, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    .line 187
    invoke-virtual {v0, v1}, Ll/۠ܶۢ;->֫(Ljava/util/function/BooleanSupplier;)Z

    move-result v0

    xor-int/2addr v0, v2

    iput-boolean v0, p0, Ll/۫֨ܳ;->ܽ:Z

    .line 189
    :catch_0
    :goto_2
    iget-boolean v0, p0, Ll/۫֨ܳ;->ܽ:Z

    xor-int/2addr v0, v2

    return v0
.end method

.method public final ֫(Ljava/util/List;)Z
    .locals 17

    move-object/from16 v8, p0

    .line 196
    invoke-static {}, Ll/ۧۨۡ;->ܽ()V

    .line 197
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    invoke-virtual/range {p0 .. p0}, Ll/۫֨ܳ;->֫()Z

    move-result v0

    return v0

    .line 0
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 215
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    const/4 v10, 0x1

    add-int/2addr v0, v10

    new-array v4, v0, [Ljava/lang/CharSequence;

    const/4 v11, 0x0

    const/4 v0, 0x0

    .line 216
    :goto_1
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 217
    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ܺܳ;

    invoke-virtual {v1}, Ll/۫ܺܳ;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    aput-object v1, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 219
    :cond_2
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    const v1, 0x7f120305

    invoke-static {v1}, Ll/ۙ᩸᩷;->ܽ(I)Ljava/lang/CharSequence;

    move-result-object v1

    aput-object v1, v4, v0

    .line 220
    iget-object v0, v8, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    const/4 v12, -0x1

    if-nez v0, :cond_3

    .line 302
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v12}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 303
    new-instance v1, Ll/ۗ֨ܳ;

    invoke-direct {v1, v4, v0}, Ll/ۗ֨ܳ;-><init>([Ljava/lang/CharSequence;Ljava/util/concurrent/atomic/AtomicInteger;)V

    iget-object v2, v8, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    .line 320
    invoke-virtual {v1, v2}, Ll/۠ܶۢ;->֫(Ljava/util/function/BooleanSupplier;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 321
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v12

    goto/16 :goto_4

    .line 225
    :cond_3
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, v8, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, v8, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_3

    .line 228
    :cond_4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 229
    new-instance v13, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v13, v12}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 230
    new-instance v14, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v14}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 231
    iget-object v15, v8, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    new-instance v7, Ll/֨֨ܳ;

    const/16 v16, 0x0

    move-object v1, v7

    move-object/from16 v2, p0

    move-object v3, v0

    move-object v5, v13

    move-object v6, v14

    move-object v12, v7

    move/from16 v7, v16

    invoke-direct/range {v1 .. v7}, Ll/֨֨ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Cloneable;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v15, v12}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    move-object/from16 v16, p0

    .line 280
    :try_start_0
    monitor-enter v16
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    :cond_5
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_7

    const-wide/16 v1, 0xc8

    .line 282
    invoke-virtual {v8, v1, v2}, Ljava/lang/Object;->wait(J)V

    .line 283
    iget-object v1, v8, Ll/۫֨ܳ;->ᩳ:Ljava/util/function/BooleanSupplier;

    invoke-interface {v1}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, v8, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, v8, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 284
    :cond_6
    invoke-virtual {v0, v11, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    .line 285
    invoke-virtual {v14, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۚۢ;

    if-eqz v1, :cond_5

    .line 287
    iget-object v2, v8, Ll/۫֨ܳ;->֫:Ll/ۗܺ᩷;

    new-instance v3, Ll/᩷۠᩷;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v1}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_2

    .line 292
    :cond_7
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 297
    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v12

    goto :goto_4

    :catchall_0
    move-exception v0

    .line 292
    :try_start_2
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 294
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_8
    :goto_3
    const/4 v12, -0x1

    :goto_4
    if-gez v12, :cond_9

    .line 203
    iput-boolean v10, v8, Ll/۫֨ܳ;->ܽ:Z

    return v11

    .line 206
    :cond_9
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ne v12, v0, :cond_a

    .line 207
    invoke-virtual/range {p0 .. p0}, Ll/۫֨ܳ;->֫()Z

    move-result v0

    return v0

    .line 209
    :cond_a
    iget-object v0, v8, Ll/۫֨ܳ;->ۧ:Ll/۬֨ܳ;

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ܺܳ;

    .line 210
    iget-object v1, v1, Ll/۫ܺܳ;->ۧ:Ljava/lang/String;

    .line 209
    invoke-interface {v0, v1}, Ll/۬֨ܳ;->֫(Ljava/lang/String;)V

    return v10
.end method
