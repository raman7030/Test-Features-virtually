.class public final Ll/ܳۚۖ;
.super Ljava/lang/Object;
.source "Z93V"

# interfaces
.implements Ll/ۢۜۖ;


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۜ:Ll/ۢۜۖ;

.field public ۧ:Ll/ܽۚۖ;

.field public ܳ:Z

.field public ܽ:Ll/ᩳۚۖ;

.field public ܿ:Z

.field public ᩳ:Ll/ܿۚۖ;

.field public ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;ZLl/ۢۜۖ;Z)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-object p1, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    .line 110
    iput-boolean p2, p0, Ll/ܳۚۖ;->ܳ:Z

    .line 111
    iput-object p3, p0, Ll/ܳۚۖ;->ۜ:Ll/ۢۜۖ;

    .line 112
    iput-boolean p4, p0, Ll/ܳۚۖ;->ܿ:Z

    return-void
.end method

.method private ֫(IZ)Ll/ۘᩴۖ;
    .locals 1

    .line 185
    iget-object v0, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 189
    iget-object p2, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘᩴۖ;

    return-object p1

    .line 192
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 197
    iget-object p2, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘᩴۖ;

    return-object p1

    :cond_1
    if-eqz p2, :cond_2

    .line 200
    invoke-virtual {v0}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܿ()Ll/ۘᩴۖ;

    move-result-object p1

    return-object p1
.end method

.method private ۖ()V
    .locals 1

    .line 517
    iget-boolean v0, p0, Ll/ܳۚۖ;->ܿ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܳۚۖ;->ۜ:Ll/ۢۜۖ;

    if-eqz v0, :cond_0

    .line 518
    invoke-interface {v0}, Ll/ۢۜۖ;->֫()V

    const/4 v0, 0x0

    .line 521
    iput-boolean v0, p0, Ll/ܳۚۖ;->ܿ:Z

    :cond_0
    return-void
.end method

.method private ۡ()V
    .locals 2

    .line 125
    iget-boolean v0, p0, Ll/ܳۚۖ;->ܳ:Z

    if-nez v0, :cond_0

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    const/4 v0, 0x1

    .line 127
    iput-boolean v0, p0, Ll/ܳۚۖ;->ܳ:Z

    :cond_0
    return-void
.end method

.method private ۢ()V
    .locals 3

    .line 136
    iget-object v0, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 137
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 138
    :goto_0
    iget-object v1, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 139
    iget-object v1, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ܺ()V
    .locals 1

    .line 535
    iget-object v0, p0, Ll/ܳۚۖ;->ܽ:Ll/ᩳۚۖ;

    if-eqz v0, :cond_0

    .line 536
    invoke-virtual {v0}, Ll/ᩳۚۖ;->ۧ()V

    .line 538
    :cond_0
    iget-object v0, p0, Ll/ܳۚۖ;->ۧ:Ll/ܽۚۖ;

    if-eqz v0, :cond_1

    .line 539
    invoke-virtual {v0}, Ll/ܽۚۖ;->ۧ()V

    .line 541
    :cond_1
    iget-object v0, p0, Ll/ܳۚۖ;->ᩳ:Ll/ܿۚۖ;

    if-eqz v0, :cond_2

    .line 542
    invoke-virtual {v0}, Ll/ܿۚۖ;->ۧ()V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/᩶ۘۖ;
    .locals 3

    .line 212
    invoke-direct {p0}, Ll/ܳۚۖ;->ۢ()V

    .line 213
    iget-object v0, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۚۖ;

    if-nez v0, :cond_0

    .line 215
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘᩴۖ;

    .line 216
    new-instance v1, Ll/ܺۚۖ;

    iget-boolean v2, p0, Ll/ܳۚۖ;->ܿ:Z

    invoke-direct {v1, v0, p0, v2}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    .line 217
    iget-object v0, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    .line 219
    :cond_0
    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILl/ۘᩴۖ;)Ll/᩶ۘۖ;
    .locals 2

    .line 379
    invoke-direct {p0}, Ll/ܳۚۖ;->ۡ()V

    .line 380
    invoke-direct {p0}, Ll/ܳۚۖ;->ۢ()V

    .line 381
    new-instance v0, Ll/ܺۚۖ;

    iget-boolean v1, p0, Ll/ܳۚۖ;->ܿ:Z

    invoke-direct {v0, p2, p0, v1}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    .line 383
    iget-object p2, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {p2, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 384
    iget-object p2, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2, p1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 385
    invoke-direct {p0}, Ll/ܳۚۖ;->ۖ()V

    .line 386
    invoke-direct {p0}, Ll/ܳۚۖ;->ܺ()V

    .line 387
    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۘᩴۖ;)Ll/᩶ۘۖ;
    .locals 2

    .line 359
    invoke-direct {p0}, Ll/ܳۚۖ;->ۡ()V

    .line 360
    invoke-direct {p0}, Ll/ܳۚۖ;->ۢ()V

    .line 361
    new-instance v0, Ll/ܺۚۖ;

    iget-boolean v1, p0, Ll/ܳۚۖ;->ܿ:Z

    invoke-direct {v0, p1, p0, v1}, Ll/ܺۚۖ;-><init>(Ll/ۘᩴۖ;Ll/ۢۜۖ;Z)V

    .line 363
    iget-object p1, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 364
    iget-object p1, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    invoke-direct {p0}, Ll/ܳۚۖ;->ۖ()V

    .line 366
    invoke-direct {p0}, Ll/ܳۚۖ;->ܺ()V

    .line 367
    invoke-virtual {v0}, Ll/ܺۚۖ;->ᩳ()Ll/᩶ۘۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 0

    .line 527
    invoke-direct {p0}, Ll/ܳۚۖ;->ۖ()V

    return-void
.end method

.method public final ֫(Ljava/lang/Iterable;)V
    .locals 3

    .line 324
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘᩴۖ;

    .line 325
    sget-object v2, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    .line 330
    :cond_0
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_2

    .line 331
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    .line 332
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 335
    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    .line 337
    :goto_1
    invoke-direct {p0}, Ll/ܳۚۖ;->ۡ()V

    if-ltz v0, :cond_3

    .line 339
    iget-object v1, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    instance-of v2, v1, Ljava/util/ArrayList;

    if-eqz v2, :cond_3

    .line 340
    move-object v2, v1

    check-cast v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 343
    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘᩴۖ;

    .line 344
    invoke-virtual {p0, v0}, Ll/ܳۚۖ;->ۧ(Ll/ۘᩴۖ;)V

    goto :goto_2

    .line 347
    :cond_4
    invoke-direct {p0}, Ll/ܳۚۖ;->ۖ()V

    .line 348
    invoke-direct {p0}, Ll/ܳۚۖ;->ܺ()V

    return-void
.end method

.method public final ۜ()Ljava/util/List;
    .locals 1

    .line 506
    iget-object v0, p0, Ll/ܳۚۖ;->ᩳ:Ll/ܿۚۖ;

    if-nez v0, :cond_0

    .line 507
    new-instance v0, Ll/ܿۚۖ;

    invoke-direct {v0, p0}, Ll/ܿۚۖ;-><init>(Ll/ܳۚۖ;)V

    iput-object v0, p0, Ll/ܳۚۖ;->ᩳ:Ll/ܿۚۖ;

    .line 509
    :cond_0
    iget-object v0, p0, Ll/ܳۚۖ;->ᩳ:Ll/ܿۚۖ;

    return-object v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 5

    const/4 v0, 0x1

    .line 433
    iput-boolean v0, p0, Ll/ܳۚۖ;->ܿ:Z

    .line 435
    iget-boolean v1, p0, Ll/ܳۚۖ;->ܳ:Z

    if-nez v1, :cond_0

    iget-object v2, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    if-nez v2, :cond_0

    .line 437
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    return-object v0

    :cond_0
    const/4 v2, 0x0

    if-nez v1, :cond_3

    const/4 v1, 0x0

    .line 444
    :goto_0
    iget-object v3, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 445
    iget-object v3, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻֡ۖ;

    .line 446
    iget-object v4, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺۚۖ;

    if-eqz v4, :cond_1

    .line 448
    invoke-virtual {v4}, Ll/ܺۚۖ;->ۧ()Ll/ۘᩴۖ;

    move-result-object v4

    if-eq v4, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 456
    :cond_2
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    return-object v0

    .line 461
    :cond_3
    :goto_1
    invoke-direct {p0}, Ll/ܳۚۖ;->ۡ()V

    const/4 v1, 0x0

    .line 462
    :goto_2
    iget-object v3, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    .line 463
    iget-object v3, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-direct {p0, v1, v0}, Ll/ܳۚۖ;->֫(IZ)Ll/ۘᩴۖ;

    move-result-object v4

    invoke-interface {v3, v1, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 468
    :cond_4
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    .line 469
    iput-boolean v2, p0, Ll/ܳۚۖ;->ܳ:Z

    return-object v0
.end method

.method public final ۧ(I)Ll/ۘᩴۖ;
    .locals 1

    const/4 v0, 0x0

    .line 171
    invoke-direct {p0, p1, v0}, Ll/ܳۚۖ;->֫(IZ)Ll/ۘᩴۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(ILl/ۘᩴۖ;)V
    .locals 1

    .line 303
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    invoke-direct {p0}, Ll/ܳۚۖ;->ۡ()V

    .line 305
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 306
    iget-object p2, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    .line 307
    invoke-virtual {p2, p1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 309
    :cond_0
    invoke-direct {p0}, Ll/ܳۚۖ;->ۖ()V

    .line 310
    invoke-direct {p0}, Ll/ܳۚۖ;->ܺ()V

    return-void
.end method

.method public final ۧ(Ll/ۘᩴۖ;)V
    .locals 1

    .line 281
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    invoke-direct {p0}, Ll/ܳۚۖ;->ۡ()V

    .line 283
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 284
    iget-object p1, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 285
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    :cond_0
    invoke-direct {p0}, Ll/ܳۚۖ;->ۖ()V

    .line 288
    invoke-direct {p0}, Ll/ܳۚۖ;->ܺ()V

    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ܽ(I)Ll/ۘ֡ۖ;
    .locals 1

    .line 231
    iget-object v0, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 235
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ֡ۖ;

    return-object p1

    .line 238
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۚۖ;

    if-nez v0, :cond_1

    .line 243
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ֡ۖ;

    return-object p1

    .line 246
    :cond_1
    invoke-virtual {v0}, Ll/ܺۚۖ;->ܳ()Ll/ۘ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()V
    .locals 2

    .line 411
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    const/4 v0, 0x0

    .line 412
    iput-boolean v0, p0, Ll/ܳۚۖ;->ܳ:Z

    .line 413
    iget-object v0, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 414
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۚۖ;

    if-eqz v1, :cond_0

    .line 416
    invoke-virtual {v1}, Ll/ܺۚۖ;->ܽ()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 419
    iput-object v0, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    .line 421
    :cond_2
    invoke-direct {p0}, Ll/ܳۚۖ;->ۖ()V

    .line 422
    invoke-direct {p0}, Ll/ܳۚۖ;->ܺ()V

    return-void
.end method

.method public final ܽ(ILl/ۘᩴۖ;)V
    .locals 1

    .line 259
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    invoke-direct {p0}, Ll/ܳۚۖ;->ۡ()V

    .line 261
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 262
    iget-object p2, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    .line 263
    invoke-virtual {p2, p1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۚۖ;

    if-eqz p1, :cond_0

    .line 265
    invoke-virtual {p1}, Ll/ܺۚۖ;->ܽ()V

    .line 268
    :cond_0
    invoke-direct {p0}, Ll/ܳۚۖ;->ۖ()V

    .line 269
    invoke-direct {p0}, Ll/ܳۚۖ;->ܺ()V

    return-void
.end method

.method public final ܿ()Ljava/util/List;
    .locals 1

    .line 493
    iget-object v0, p0, Ll/ܳۚۖ;->ۧ:Ll/ܽۚۖ;

    if-nez v0, :cond_0

    .line 494
    new-instance v0, Ll/ܽۚۖ;

    invoke-direct {v0, p0}, Ll/ܽۚۖ;-><init>(Ll/ܳۚۖ;)V

    iput-object v0, p0, Ll/ܳۚۖ;->ۧ:Ll/ܽۚۖ;

    .line 496
    :cond_0
    iget-object v0, p0, Ll/ܳۚۖ;->ۧ:Ll/ܽۚۖ;

    return-object v0
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 117
    iput-object v0, p0, Ll/ܳۚۖ;->ۜ:Ll/ۢۜۖ;

    return-void
.end method

.method public final ᩳ(I)V
    .locals 1

    .line 397
    invoke-direct {p0}, Ll/ܳۚۖ;->ۡ()V

    .line 398
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 399
    iget-object v0, p0, Ll/ܳۚۖ;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 400
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۚۖ;

    if-eqz p1, :cond_0

    .line 402
    invoke-virtual {p1}, Ll/ܺۚۖ;->ܽ()V

    .line 405
    :cond_0
    invoke-direct {p0}, Ll/ܳۚۖ;->ۖ()V

    .line 406
    invoke-direct {p0}, Ll/ܳۚۖ;->ܺ()V

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ܳۚۖ;->᩻:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ᩻()Ljava/util/List;
    .locals 1

    .line 480
    iget-object v0, p0, Ll/ܳۚۖ;->ܽ:Ll/ᩳۚۖ;

    if-nez v0, :cond_0

    .line 481
    new-instance v0, Ll/ᩳۚۖ;

    invoke-direct {v0, p0}, Ll/ᩳۚۖ;-><init>(Ll/ܳۚۖ;)V

    iput-object v0, p0, Ll/ܳۚۖ;->ܽ:Ll/ᩳۚۖ;

    .line 483
    :cond_0
    iget-object v0, p0, Ll/ܳۚۖ;->ܽ:Ll/ᩳۚۖ;

    return-object v0
.end method
