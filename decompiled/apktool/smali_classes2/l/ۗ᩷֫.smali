.class public abstract Ll/ۗ᩷֫;
.super Ljava/lang/Object;
.source "VB94"


# instance fields
.field public final ֫:Landroid/view/ViewGroup;

.field public ۧ:Z

.field public ܽ:Z

.field public final ܿ:Ljava/util/ArrayList;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۗ᩷֫;->ܿ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 89
    iput-boolean v0, p0, Ll/ۗ᩷֫;->ܽ:Z

    .line 90
    iput-boolean v0, p0, Ll/ۗ᩷֫;->ۧ:Z

    .line 93
    iput-object p1, p0, Ll/ۗ᩷֫;->֫:Landroid/view/ViewGroup;

    return-void
.end method

.method public static ֫(Landroid/view/ViewGroup;Ll/ۚۜ֫;)Ll/ۗ᩷֫;
    .locals 0

    .line 55
    invoke-virtual {p1}, Ll/ۚۜ֫;->᩶()Ll/۬᩷֫;

    move-result-object p1

    .line 56
    invoke-static {p0, p1}, Ll/ۗ᩷֫;->֫(Landroid/view/ViewGroup;Ll/۬᩷֫;)Ll/ۗ᩷֫;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/ViewGroup;Ll/۬᩷֫;)Ll/ۗ᩷֫;
    .locals 3

    const v0, 0x7f0a0545

    .line 72
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    .line 73
    instance-of v2, v1, Ll/ۗ᩷֫;

    if-eqz v2, :cond_0

    .line 74
    check-cast v1, Ll/ۗ᩷֫;

    return-object v1

    .line 77
    :cond_0
    check-cast p1, Ll/ܿۜ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    new-instance p1, Ll/᩹ܳ֫;

    .line 52
    invoke-direct {p1, p0}, Ll/ۗ᩷֫;-><init>(Landroid/view/ViewGroup;)V

    .line 78
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-object p1
.end method

.method private ֫(Ll/ۡ᩻֫;)Ll/ۙ᩷֫;
    .locals 3

    .line 135
    iget-object v0, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ᩷֫;

    .line 136
    invoke-virtual {v1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/ۡ᩻֫;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ll/ۙ᩷֫;->ܳ()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private ֫(Ll/᩶᩷֫;Ll/᩹᩷֫;Ll/ۛۜ֫;)V
    .locals 3

    .line 193
    iget-object v0, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 194
    :try_start_0
    new-instance v1, Ll/᩻۫;

    invoke-direct {v1}, Ll/᩻۫;-><init>()V

    .line 196
    invoke-virtual {p3}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v2

    invoke-direct {p0, v2}, Ll/ۗ᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۙ᩷֫;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 200
    invoke-virtual {v2, p1, p2}, Ll/ۙ᩷֫;->֫(Ll/᩶᩷֫;Ll/᩹᩷֫;)V

    .line 201
    monitor-exit v0

    return-void

    .line 203
    :cond_0
    new-instance v2, Ll/ܶ᩷֫;

    invoke-direct {v2, p1, p2, p3, v1}, Ll/ܶ᩷֫;-><init>(Ll/᩶᩷֫;Ll/᩹᩷֫;Ll/ۛۜ֫;Ll/᩻۫;)V

    .line 205
    iget-object p1, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    new-instance p1, Ll/ۚ᩷֫;

    invoke-direct {p1, p0, v2}, Ll/ۚ᩷֫;-><init>(Ll/ۗ᩷֫;Ll/ܶ᩷֫;)V

    invoke-virtual {v2, p1}, Ll/ۙ᩷֫;->֫(Ljava/lang/Runnable;)V

    .line 217
    new-instance p1, Ll/֨᩷֫;

    invoke-direct {p1, p0, v2}, Ll/֨᩷֫;-><init>(Ll/ۗ᩷֫;Ll/ܶ᩷֫;)V

    invoke-virtual {v2, p1}, Ll/ۙ᩷֫;->֫(Ljava/lang/Runnable;)V

    .line 224
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ܿ()V
    .locals 4

    .line 356
    iget-object v0, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ᩷֫;

    .line 358
    invoke-virtual {v1}, Ll/ۙ᩷֫;->ܿ()Ll/᩹᩷֫;

    move-result-object v2

    sget-object v3, Ll/᩹᩷֫;->᩹:Ll/᩹᩷֫;

    if-ne v2, v3, :cond_0

    .line 359
    invoke-virtual {v1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v2

    .line 360
    invoke-virtual {v2}, Ll/ۡ᩻֫;->requireView()Landroid/view/View;

    move-result-object v2

    .line 361
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    invoke-static {v2}, Ll/᩶᩷֫;->֫(I)Ll/᩶᩷֫;

    move-result-object v2

    .line 362
    sget-object v3, Ll/᩹᩷֫;->᩶:Ll/᩹᩷֫;

    invoke-virtual {v1, v2, v3}, Ll/ۙ᩷֫;->֫(Ll/᩶᩷֫;Ll/᩹᩷֫;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 265
    iget-boolean v0, p0, Ll/ۗ᩷֫;->ۧ:Z

    if-eqz v0, :cond_0

    return-void

    .line 271
    :cond_0
    iget-object v0, p0, Ll/ۗ᩷֫;->֫:Landroid/view/ViewGroup;

    sget v1, Ll/ܿ᩺;->֫:I

    .line 4137
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 272
    invoke-virtual {p0}, Ll/ۗ᩷֫;->ۧ()V

    .line 273
    iput-boolean v1, p0, Ll/ۗ᩷֫;->ܽ:Z

    return-void

    .line 276
    :cond_1
    iget-object v0, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 277
    :try_start_0
    iget-object v2, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    .line 278
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۗ᩷֫;->ܿ:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 280
    iget-object v3, p0, Ll/ۗ᩷֫;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 281
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ᩷֫;

    .line 282
    invoke-static {v4}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 283
    invoke-static {v3}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 286
    :cond_3
    invoke-virtual {v3}, Ll/ۙ᩷֫;->֫()V

    .line 287
    invoke-virtual {v3}, Ll/ۙ᩷֫;->᩻()Z

    move-result v4

    if-nez v4, :cond_2

    .line 290
    iget-object v4, p0, Ll/ۗ᩷֫;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 294
    :cond_4
    invoke-direct {p0}, Ll/ۗ᩷֫;->ܿ()V

    .line 296
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 297
    iget-object v3, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 298
    iget-object v3, p0, Ll/ۗ᩷֫;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 299
    invoke-static {v4}, Ll/ۚۜ֫;->ܿ(I)Z

    .line 303
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙ᩷֫;

    .line 304
    invoke-virtual {v5}, Ll/ۙ᩷֫;->ۜ()V

    goto :goto_1

    .line 306
    :cond_5
    iget-boolean v3, p0, Ll/ۗ᩷֫;->ܽ:Z

    invoke-virtual {p0, v2, v3}, Ll/ۗ᩷֫;->֫(Ljava/util/ArrayList;Z)V

    .line 307
    iput-boolean v1, p0, Ll/ۗ᩷֫;->ܽ:Z

    .line 308
    invoke-static {v4}, Ll/ۚۜ֫;->ܿ(I)Z

    .line 313
    :cond_6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public abstract ֫(Ljava/util/ArrayList;Z)V
.end method

.method public final ֫(Ll/ۛۜ֫;)V
    .locals 2

    const/4 v0, 0x2

    .line 173
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    invoke-virtual {p1}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 178
    :cond_0
    sget-object v0, Ll/᩶᩷֫;->᩹:Ll/᩶᩷֫;

    sget-object v1, Ll/᩹᩷֫;->᩶:Ll/᩹᩷֫;

    invoke-direct {p0, v0, v1, p1}, Ll/ۗ᩷֫;->֫(Ll/᩶᩷֫;Ll/᩹᩷֫;Ll/ۛۜ֫;)V

    return-void
.end method

.method public final ֫(Ll/᩶᩷֫;Ll/ۛۜ֫;)V
    .locals 1

    const/4 v0, 0x2

    .line 155
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    invoke-virtual {p2}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    :cond_0
    sget-object v0, Ll/᩹᩷֫;->᩹:Ll/᩹᩷֫;

    invoke-direct {p0, p1, v0, p2}, Ll/ۗ᩷֫;->֫(Ll/᩶᩷֫;Ll/᩹᩷֫;Ll/ۛۜ֫;)V

    return-void
.end method

.method public final ۧ()V
    .locals 7

    const/4 v1, 0x2

    .line 317
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    .line 322
    iget-object v0, p0, Ll/ۗ᩷֫;->֫:Landroid/view/ViewGroup;

    sget v2, Ll/ܿ᩺;->֫:I

    .line 4137
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    .line 323
    iget-object v0, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 324
    :try_start_0
    invoke-direct {p0}, Ll/ۗ᩷֫;->ܿ()V

    .line 325
    iget-object v3, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙ᩷֫;

    .line 326
    invoke-virtual {v4}, Ll/ۙ᩷֫;->ۜ()V

    goto :goto_0

    .line 330
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p0, Ll/ۗ᩷֫;->ܿ:Ljava/util/ArrayList;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 331
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙ᩷֫;

    .line 332
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz v2, :cond_1

    goto :goto_2

    .line 335
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Container "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۗ᩷֫;->֫:Landroid/view/ViewGroup;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " is not attached to window. "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    invoke-static {v4}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 338
    :cond_2
    invoke-virtual {v4}, Ll/ۙ᩷֫;->֫()V

    goto :goto_1

    .line 342
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 343
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙ᩷֫;

    .line 344
    invoke-static {v1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v5

    if-eqz v5, :cond_5

    if-eqz v2, :cond_4

    goto :goto_4

    .line 347
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Container "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۗ᩷֫;->֫:Landroid/view/ViewGroup;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " is not attached to window. "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_4
    invoke-static {v4}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 350
    :cond_5
    invoke-virtual {v4}, Ll/ۙ᩷֫;->֫()V

    goto :goto_3

    .line 352
    :cond_6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ(Ll/ۛۜ֫;)V
    .locals 2

    const/4 v0, 0x2

    .line 182
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 185
    invoke-virtual {p1}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    :cond_0
    sget-object v0, Ll/᩶᩷֫;->ۙ:Ll/᩶᩷֫;

    sget-object v1, Ll/᩹᩷֫;->ۙ:Ll/᩹᩷֫;

    invoke-direct {p0, v0, v1, p1}, Ll/ۗ᩷֫;->֫(Ll/᩶᩷֫;Ll/᩹᩷֫;Ll/ۛۜ֫;)V

    return-void
.end method

.method public final ܽ()Landroid/view/ViewGroup;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۗ᩷֫;->֫:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final ܽ(Ll/ۛۜ֫;)V
    .locals 2

    const/4 v0, 0x2

    .line 164
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    invoke-virtual {p1}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 169
    :cond_0
    sget-object v0, Ll/᩶᩷֫;->ۗ:Ll/᩶᩷֫;

    sget-object v1, Ll/᩹᩷֫;->᩶:Ll/᩹᩷֫;

    invoke-direct {p0, v0, v1, p1}, Ll/ۗ᩷֫;->֫(Ll/᩶᩷֫;Ll/᩹᩷֫;Ll/ۛۜ֫;)V

    return-void
.end method

.method public final ᩳ(Ll/ۛۜ֫;)Ll/᩹᩷֫;
    .locals 5

    .line 119
    invoke-virtual {p1}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۗ᩷֫;->֫(Ll/ۡ᩻֫;)Ll/ۙ᩷֫;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {v0}, Ll/ۙ᩷֫;->ܿ()Ll/᩹᩷֫;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 124
    :goto_0
    invoke-virtual {p1}, Ll/ۛۜ֫;->᩷()Ll/ۡ᩻֫;

    move-result-object p1

    .line 145
    iget-object v2, p0, Ll/ۗ᩷֫;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ᩷֫;

    .line 146
    invoke-virtual {v3}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v4

    invoke-virtual {v4, p1}, Ll/ۡ᩻֫;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ll/ۙ᩷֫;->ܳ()Z

    move-result v4

    if-nez v4, :cond_1

    move-object v1, v3

    :cond_2
    if-eqz v1, :cond_4

    if-eqz v0, :cond_3

    .line 126
    sget-object p1, Ll/᩹᩷֫;->᩶:Ll/᩹᩷֫;

    if-ne v0, p1, :cond_4

    .line 128
    :cond_3
    invoke-virtual {v1}, Ll/ۙ᩷֫;->ܿ()Ll/᩹᩷֫;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v0
.end method

.method public final ᩳ()V
    .locals 6

    .line 232
    iget-object v0, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 233
    :try_start_0
    invoke-direct {p0}, Ll/ۗ᩷֫;->ܿ()V

    const/4 v1, 0x0

    .line 235
    iput-boolean v1, p0, Ll/ۗ᩷֫;->ۧ:Z

    .line 236
    iget-object v1, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    .line 237
    iget-object v2, p0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ᩷֫;

    .line 239
    invoke-virtual {v2}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v3

    iget-object v3, v3, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-static {v3}, Ll/᩶᩷֫;->ۧ(Landroid/view/View;)Ll/᩶᩷֫;

    move-result-object v3

    .line 240
    invoke-virtual {v2}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object v4

    sget-object v5, Ll/᩶᩷֫;->ۗ:Ll/᩶᩷֫;

    if-ne v4, v5, :cond_0

    if-eq v3, v5, :cond_0

    .line 242
    invoke-virtual {v2}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v1

    .line 245
    invoke-virtual {v1}, Ll/ۡ᩻֫;->isPostponed()Z

    move-result v1

    iput-boolean v1, p0, Ll/ۗ᩷֫;->ۧ:Z

    .line 249
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
