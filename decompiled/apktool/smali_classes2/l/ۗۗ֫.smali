.class public final Ll/ۗۗ֫;
.super Ljava/lang/Object;
.source "98TD"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۜ:Ljava/util/ArrayList;

.field public final ۡ:Ll/ܰ۬֫;

.field public ۢ:Ll/֡ܶ֫;

.field public final ۧ:Ljava/util/HashSet;

.field public final ܳ:Ljava/util/IdentityHashMap;

.field public ܺ:Ll/֨ܽۧ;

.field public final ܽ:Ll/᩵ۚ֫;

.field public ܿ:Z

.field public final ᩳ:Ll/᩵۬֫;

.field public final ᩷:Ll/ۙۗ֫;

.field public final ᩻:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ۙۗ֫;Ll/᩵۬֫;Ll/᩵ۚ֫;Ll/ܰ۬֫;)V
    .locals 0

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p4, p0, Ll/ۗۗ֫;->ۡ:Ll/ܰ۬֫;

    .line 111
    iput-object p1, p0, Ll/ۗۗ֫;->᩷:Ll/ۙۗ֫;

    .line 112
    new-instance p1, Ll/ۚܽۧ;

    invoke-direct {p1}, Ll/ۚܽۧ;-><init>()V

    iput-object p1, p0, Ll/ۗۗ֫;->ܺ:Ll/֨ܽۧ;

    .line 113
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Ll/ۗۗ֫;->ܳ:Ljava/util/IdentityHashMap;

    .line 114
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۗۗ֫;->᩻:Ljava/util/HashMap;

    .line 115
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    .line 116
    iput-object p2, p0, Ll/ۗۗ֫;->ᩳ:Ll/᩵۬֫;

    .line 117
    iput-object p3, p0, Ll/ۗۗ֫;->ܽ:Ll/᩵ۚ֫;

    .line 118
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۗۗ֫;->֫:Ljava/util/HashMap;

    .line 119
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/ۗۗ֫;->ۧ:Ljava/util/HashSet;

    return-void
.end method

.method private ֫(II)V
    .locals 7

    const/4 v0, 0x1

    sub-int/2addr p2, v0

    :goto_0
    if-lt p2, p1, :cond_2

    .line 425
    iget-object v1, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ۗ֫;

    .line 426
    iget-object v3, p0, Ll/ۗۗ֫;->᩻:Ljava/util/HashMap;

    iget-object v4, v2, Ll/᩶ۗ֫;->ܿ:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    iget-object v3, v2, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    invoke-virtual {v3}, Ll/᩻ۧۧ;->ܺ()Ll/ۙ᩵֫;

    move-result-object v3

    .line 429
    invoke-virtual {v3}, Ll/ۙ᩵֫;->ۧ()I

    move-result v3

    neg-int v3, v3

    move v4, p2

    .line 438
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_0

    .line 439
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩶ۗ֫;

    .line 440
    iget v6, v5, Ll/᩶ۗ֫;->ۧ:I

    add-int/2addr v6, v3

    iput v6, v5, Ll/᩶ۗ֫;->ۧ:I

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 430
    :cond_0
    iput-boolean v0, v2, Ll/᩶ۗ֫;->ܽ:Z

    .line 431
    iget-boolean v1, p0, Ll/ۗۗ֫;->ܿ:Z

    if-eqz v1, :cond_1

    .line 432
    invoke-direct {p0, v2}, Ll/ۗۗ֫;->֫(Ll/᩶ۗ֫;)V

    :cond_1
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static synthetic ֫(Ll/ۗۗ֫;)V
    .locals 0

    .line 469
    iget-object p0, p0, Ll/ۗۗ֫;->᩷:Ll/ۙۗ֫;

    check-cast p0, Ll/᩶ۙ֫;

    invoke-virtual {p0}, Ll/᩶ۙ֫;->ᩳ()V

    return-void
.end method

.method private ֫(Ll/᩶ۗ֫;)V
    .locals 3

    .line 479
    iget-boolean v0, p1, Ll/᩶ۗ֫;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/᩶ۗ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 480
    iget-object v0, p0, Ll/ۗۗ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ۗ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Ll/᩹ۗ֫;->ۧ:Ll/᩸ۗ֫;

    iget-object v2, v0, Ll/᩹ۗ֫;->ܽ:Ll/ۘۧۧ;

    .line 481
    iget-object v0, v0, Ll/᩹ۗ֫;->֫:Ll/ۢۗ֫;

    invoke-interface {v2, v0}, Ll/ۘۧۧ;->ۧ(Ll/ۖۧۧ;)V

    .line 482
    invoke-interface {v2, v1}, Ll/ۘۧۧ;->֫(Ll/ܶۧۧ;)V

    .line 483
    invoke-interface {v2, v1}, Ll/ۘۧۧ;->֫(Ll/᩸ۛ֫;)V

    .line 484
    iget-object v0, p0, Ll/ۗۗ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۗ֫;->ܽ:Ll/᩵ۚ֫;

    return-object p0
.end method

.method private ۧ(Ll/᩶ۗ֫;)V
    .locals 5

    .line 467
    iget-object v0, p1, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    .line 468
    new-instance v1, Ll/ۢۗ֫;

    invoke-direct {v1, p0}, Ll/ۢۗ֫;-><init>(Ll/ۗۗ֫;)V

    .line 470
    new-instance v2, Ll/᩸ۗ֫;

    invoke-direct {v2, p0, p1}, Ll/᩸ۗ֫;-><init>(Ll/ۗۗ֫;Ll/᩶ۗ֫;)V

    .line 471
    new-instance v3, Ll/᩹ۗ֫;

    invoke-direct {v3, v0, v1, v2}, Ll/᩹ۗ֫;-><init>(Ll/ۘۧۧ;Ll/ۢۗ֫;Ll/᩸ۗ֫;)V

    iget-object v4, p0, Ll/ۗۗ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v4, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 903
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 904
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    .line 783
    :goto_0
    new-instance v3, Landroid/os/Handler;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 472
    invoke-virtual {v0, v3, v2}, Ll/ۢ֫ۧ;->֫(Landroid/os/Handler;Ll/ܶۧۧ;)V

    .line 903
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    .line 904
    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    .line 783
    :goto_1
    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 473
    invoke-virtual {v0, v3, v2}, Ll/ۢ֫ۧ;->֫(Landroid/os/Handler;Ll/᩸ۛ֫;)V

    .line 474
    iget-object p1, p0, Ll/ۗۗ֫;->ۢ:Ll/֡ܶ֫;

    iget-object v2, p0, Ll/ۗۗ֫;->ۡ:Ll/ܰ۬֫;

    invoke-virtual {v0, v1, p1, v2}, Ll/ۢ֫ۧ;->֫(Ll/ۖۧۧ;Ll/֡ܶ֫;Ll/ܰ۬֫;)V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۗۗ֫;)Ll/᩵۬֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۗ֫;->ᩳ:Ll/᩵۬֫;

    return-object p0
.end method

.method private ᩻()V
    .locals 3

    .line 406
    iget-object v0, p0, Ll/ۗۗ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 407
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 408
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۗ֫;

    .line 409
    iget-object v2, v1, Ll/᩶ۗ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 417
    iget-object v2, p0, Ll/ۗۗ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ۗ֫;

    if-eqz v1, :cond_1

    .line 419
    iget-object v2, v1, Ll/᩹ۗ֫;->ܽ:Ll/ۘۧۧ;

    iget-object v1, v1, Ll/᩹ۗ֫;->֫:Ll/ۢۗ֫;

    invoke-interface {v2, v1}, Ll/ۘۧۧ;->ܽ(Ll/ۖۧۧ;)V

    .line 411
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۙ᩵֫;
    .locals 4

    .line 378
    iget-object v0, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 379
    sget-object v0, Ll/ۙ᩵֫;->֫:Ll/ۙ᩵֫;

    return-object v0

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 382
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 383
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶ۗ֫;

    .line 384
    iput v2, v3, Ll/᩶ۗ֫;->ۧ:I

    .line 385
    iget-object v3, v3, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    invoke-virtual {v3}, Ll/᩻ۧۧ;->ܺ()Ll/ۙ᩵֫;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۙ᩵֫;->ۧ()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 387
    :cond_1
    new-instance v1, Ll/ܰۗ֫;

    iget-object v2, p0, Ll/ۗۗ֫;->ܺ:Ll/֨ܽۧ;

    invoke-direct {v1, v0, v2}, Ll/ܰۗ֫;-><init>(Ljava/util/List;Ll/֨ܽۧ;)V

    return-object v1
.end method

.method public final ֫(IILjava/util/List;)Ll/ۙ᩵֫;
    .locals 4

    .line 267
    iget-object v0, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    .line 289
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gt p2, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 267
    :goto_0
    invoke-static {v2}, Ll/᩺֡֫;->֫(Z)V

    .line 268
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    sub-int v3, p2, p1

    if-ne v2, v3, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    move v1, p1

    :goto_1
    if-ge v1, p2, :cond_2

    .line 270
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ۗ֫;

    iget-object v2, v2, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    sub-int v3, v1, p1

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧ᩵֫;

    invoke-virtual {v2, v3}, Ll/᩻ۧۧ;->֫(Ll/ۧ᩵֫;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 272
    :cond_2
    invoke-virtual {p0}, Ll/ۗۗ֫;->֫()Ll/ۙ᩵֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(IILl/֨ܽۧ;)Ll/ۙ᩵֫;
    .locals 1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    .line 289
    iget-object v0, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 194
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 195
    iput-object p3, p0, Ll/ۗۗ֫;->ܺ:Ll/֨ܽۧ;

    .line 196
    invoke-direct {p0, p1, p2}, Ll/ۗۗ֫;->֫(II)V

    .line 197
    invoke-virtual {p0}, Ll/ۗۗ֫;->֫()Ll/ۙ᩵֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILjava/util/List;Ll/֨ܽۧ;)Ll/ۙ᩵֫;
    .locals 6

    .line 145
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 146
    iput-object p3, p0, Ll/ۗۗ֫;->ܺ:Ll/֨ܽۧ;

    move p3, p1

    .line 147
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p1

    if-ge p3, v0, :cond_4

    sub-int v0, p3, p1

    .line 148
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۗ֫;

    const/4 v1, 0x0

    .line 149
    iget-object v2, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    if-lez p3, :cond_0

    add-int/lit8 v3, p3, -0x1

    .line 150
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶ۗ֫;

    .line 151
    iget-object v4, v3, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    invoke-virtual {v4}, Ll/᩻ۧۧ;->ܺ()Ll/ۙ᩵֫;

    move-result-object v4

    .line 152
    iget v3, v3, Ll/᩶ۗ֫;->ۧ:I

    .line 154
    invoke-virtual {v4}, Ll/ۙ᩵֫;->ۧ()I

    move-result v4

    add-int/2addr v4, v3

    .line 519
    iput v4, v0, Ll/᩶ۗ֫;->ۧ:I

    goto :goto_1

    :cond_0
    iput v1, v0, Ll/᩶ۗ֫;->ۧ:I

    .line 520
    :goto_1
    iput-boolean v1, v0, Ll/᩶ۗ֫;->ܽ:Z

    .line 521
    iget-object v1, v0, Ll/᩶ۗ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 158
    iget-object v1, v0, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    invoke-virtual {v1}, Ll/᩻ۧۧ;->ܺ()Ll/ۙ᩵֫;

    move-result-object v1

    .line 161
    invoke-virtual {v1}, Ll/ۙ᩵֫;->ۧ()I

    move-result v1

    move v3, p3

    .line 438
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 439
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩶ۗ֫;

    .line 440
    iget v5, v4, Ll/᩶ۗ֫;->ۧ:I

    add-int/2addr v5, v1

    iput v5, v4, Ll/᩶ۗ֫;->ۧ:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 162
    :cond_1
    invoke-virtual {v2, p3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 163
    iget-object v1, p0, Ll/ۗۗ֫;->᩻:Ljava/util/HashMap;

    iget-object v2, v0, Ll/᩶ۗ֫;->ܿ:Ljava/lang/Object;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    iget-boolean v1, p0, Ll/ۗۗ֫;->ܿ:Z

    if-eqz v1, :cond_3

    .line 165
    invoke-direct {p0, v0}, Ll/ۗۗ֫;->ۧ(Ll/᩶ۗ֫;)V

    .line 166
    iget-object v1, p0, Ll/ۗۗ֫;->ܳ:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 167
    iget-object v1, p0, Ll/ۗۗ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 417
    :cond_2
    iget-object v1, p0, Ll/ۗۗ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ۗ֫;

    if-eqz v0, :cond_3

    .line 419
    iget-object v1, v0, Ll/᩹ۗ֫;->ܽ:Ll/ۘۧۧ;

    iget-object v0, v0, Ll/᩹ۗ֫;->֫:Ll/ۢۗ֫;

    invoke-interface {v1, v0}, Ll/ۘۧۧ;->ܽ(Ll/ۖۧۧ;)V

    :cond_3
    :goto_3
    add-int/lit8 p3, p3, 0x1

    goto/16 :goto_0

    .line 174
    :cond_4
    invoke-virtual {p0}, Ll/ۗۗ֫;->֫()Ll/ۙ᩵֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/util/List;Ll/֨ܽۧ;)Ll/ۙ᩵֫;
    .locals 3

    .line 130
    iget-object v0, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {p0, v2, v1}, Ll/ۗۗ֫;->֫(II)V

    .line 131
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1, p2}, Ll/ۗۗ֫;->֫(ILjava/util/List;Ll/֨ܽۧ;)Ll/ۙ᩵֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֨ܽۧ;)Ll/ۙ᩵֫;
    .locals 2

    .line 289
    iget-object v0, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 299
    invoke-interface {p1}, Ll/֨ܽۧ;->getLength()I

    move-result v1

    if-eq v1, v0, :cond_0

    .line 302
    invoke-interface {p1}, Ll/֨ܽۧ;->ۧ()Ll/ۚܽۧ;

    move-result-object p1

    .line 303
    invoke-virtual {p1, v0}, Ll/ۚܽۧ;->ᩳ(I)Ll/ۚܽۧ;

    move-result-object p1

    .line 305
    :cond_0
    iput-object p1, p0, Ll/ۗۗ֫;->ܺ:Ll/֨ܽۧ;

    .line 306
    invoke-virtual {p0}, Ll/ۗۗ֫;->֫()Ll/ۙ᩵֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ᩳۧۧ;
    .locals 3

    .line 331
    iget-object v0, p1, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 490
    sget v1, Ll/ᩴ᩹֫;->ᩳ:I

    .line 42
    check-cast v0, Landroid/util/Pair;

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 53
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 333
    invoke-virtual {p1, v0}, Ll/ܺۧۧ;->֫(Ljava/lang/Object;)Ll/ܺۧۧ;

    move-result-object p1

    .line 334
    iget-object v0, p0, Ll/ۗۗ֫;->᩻:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۗ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    iget-object v1, p0, Ll/ۗۗ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 399
    iget-object v1, p0, Ll/ۗۗ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ۗ֫;

    if-eqz v1, :cond_0

    .line 401
    iget-object v2, v1, Ll/᩹ۗ֫;->ܽ:Ll/ۘۧۧ;

    iget-object v1, v1, Ll/᩹ۗ֫;->֫:Ll/ۢۗ֫;

    invoke-interface {v2, v1}, Ll/ۘۧۧ;->֫(Ll/ۖۧۧ;)V

    .line 336
    :cond_0
    iget-object v1, v0, Ll/᩶ۗ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    iget-object v1, v0, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    .line 338
    invoke-virtual {v1, p1, p2, p3, p4}, Ll/᩻ۧۧ;->֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ᩳۧۧ;

    move-result-object p1

    .line 339
    iget-object p2, p0, Ll/ۗۗ֫;->ܳ:Ljava/util/IdentityHashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    invoke-direct {p0}, Ll/ۗۗ֫;->᩻()V

    return-object p1
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 3

    .line 311
    iget-boolean v0, p0, Ll/ۗۗ֫;->ܿ:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 312
    iput-object p1, p0, Ll/ۗۗ֫;->ۢ:Ll/֡ܶ֫;

    const/4 p1, 0x0

    .line 313
    :goto_0
    iget-object v0, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 314
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۗ֫;

    .line 315
    invoke-direct {p0, v0}, Ll/ۗۗ֫;->ۧ(Ll/᩶ۗ֫;)V

    .line 316
    iget-object v2, p0, Ll/ۗۗ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 318
    :cond_0
    iput-boolean v1, p0, Ll/ۗۗ֫;->ܿ:Z

    return-void
.end method

.method public final ֫(Ll/ۢۧۧ;)V
    .locals 3

    .line 350
    iget-object v0, p0, Ll/ۗۗ֫;->ܳ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۗ֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    iget-object v2, v1, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    invoke-virtual {v2, p1}, Ll/᩻ۧۧ;->֫(Ll/ۢۧۧ;)V

    .line 352
    iget-object v2, v1, Ll/᩶ۗ֫;->֫:Ljava/util/ArrayList;

    check-cast p1, Ll/ᩳۧۧ;

    iget-object p1, p1, Ll/ᩳۧۧ;->᩶:Ll/ܺۧۧ;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 353
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 354
    invoke-direct {p0}, Ll/ۗۗ֫;->᩻()V

    .line 356
    :cond_0
    invoke-direct {p0, v1}, Ll/ۗۗ֫;->֫(Ll/᩶ۗ֫;)V

    return-void
.end method

.method public final ۧ()Ll/֨ܽۧ;
    .locals 1

    .line 392
    iget-object v0, p0, Ll/ۗۗ֫;->ܺ:Ll/֨ܽۧ;

    return-object v0
.end method

.method public final ܳ()V
    .locals 5

    .line 361
    iget-object v0, p0, Ll/ۗۗ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ۗ֫;

    .line 363
    :try_start_0
    iget-object v3, v2, Ll/᩹ۗ֫;->ܽ:Ll/ۘۧۧ;

    iget-object v4, v2, Ll/᩹ۗ֫;->֫:Ll/ۢۗ֫;

    invoke-interface {v3, v4}, Ll/ۘۧۧ;->ۧ(Ll/ۖۧۧ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "Failed to release child source."

    .line 366
    invoke-static {v4, v3}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 368
    :goto_1
    iget-object v3, v2, Ll/᩹ۗ֫;->ܽ:Ll/ۘۧۧ;

    iget-object v4, v2, Ll/᩹ۗ֫;->ۧ:Ll/᩸ۗ֫;

    invoke-interface {v3, v4}, Ll/ۘۧۧ;->֫(Ll/ܶۧۧ;)V

    .line 369
    iget-object v2, v2, Ll/᩹ۗ֫;->ܽ:Ll/ۘۧۧ;

    invoke-interface {v2, v4}, Ll/ۘۧۧ;->֫(Ll/᩸ۛ֫;)V

    goto :goto_0

    .line 371
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 372
    iget-object v0, p0, Ll/ۗۗ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    const/4 v0, 0x0

    .line 373
    iput-boolean v0, p0, Ll/ۗۗ֫;->ܿ:Z

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ܿ()Ll/ۙ᩵֫;
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ۗۗ֫;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 235
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    const/4 v0, 0x0

    .line 237
    iput-object v0, p0, Ll/ۗۗ֫;->ܺ:Ll/֨ܽۧ;

    .line 239
    invoke-virtual {p0}, Ll/ۗۗ֫;->֫()Ll/ۙ᩵֫;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 284
    iget-boolean v0, p0, Ll/ۗۗ֫;->ܿ:Z

    return v0
.end method
