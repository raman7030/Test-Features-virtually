.class public final Ll/ۖ᩷ۖ;
.super Ljava/lang/Object;
.source "M9PM"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ll/ۧۤᩴ;

.field public final ᩳ:Ljava/util/Stack;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 269
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ۖ᩷ۖ;->ܽ:Ll/ۧۤᩴ;

    const/4 v0, 0x0

    .line 274
    iput v0, p0, Ll/ۖ᩷ۖ;->֫:I

    .line 275
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Ll/ۖ᩷ۖ;->ᩳ:Ljava/util/Stack;

    .line 276
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۖ᩷ۖ;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method private ۧ(Ll/ᩳۖۖ;)Ll/ۡ᩷ۖ;
    .locals 9

    .line 314
    new-instance v0, Ll/ۡ᩷ۖ;

    iget v1, p0, Ll/ۖ᩷ۖ;->֫:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۖ᩷ۖ;->֫:I

    invoke-direct {v0, p1, v1}, Ll/ۡ᩷ۖ;-><init>(Ll/ᩳۖۖ;I)V

    .line 315
    iget-object v1, p0, Ll/ۖ᩷ۖ;->ᩳ:Ljava/util/Stack;

    invoke-virtual {v1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    iget-object v2, p0, Ll/ۖ᩷ۖ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    invoke-virtual {p1}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۖۖ;

    .line 320
    invoke-virtual {v3}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v4

    sget-object v5, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v4, v5, :cond_0

    .line 321
    invoke-virtual {v3}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ᩷ۖ;

    if-nez v4, :cond_1

    .line 324
    invoke-virtual {v3}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v3

    invoke-direct {p0, v3}, Ll/ۖ᩷ۖ;->ۧ(Ll/ᩳۖۖ;)Ll/ۡ᩷ۖ;

    move-result-object v3

    .line 325
    iget v4, v0, Ll/ۡ᩷ۖ;->ᩳ:I

    iget v3, v3, Ll/ۡ᩷ۖ;->ᩳ:I

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v0, Ll/ۡ᩷ۖ;->ᩳ:I

    goto :goto_0

    .line 327
    :cond_1
    iget-object v3, v4, Ll/ۡ᩷ۖ;->֫:Ll/ܺ᩷ۖ;

    if-nez v3, :cond_0

    .line 329
    iget v3, v0, Ll/ۡ᩷ۖ;->ᩳ:I

    iget v4, v4, Ll/ۡ᩷ۖ;->ᩳ:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v0, Ll/ۡ᩷ۖ;->ᩳ:I

    goto :goto_0

    .line 335
    :cond_2
    iget p1, v0, Ll/ۡ᩷ۖ;->ܽ:I

    iget v3, v0, Ll/ۡ᩷ۖ;->ᩳ:I

    if-ne p1, v3, :cond_9

    .line 337
    new-instance p1, Ll/ܺ᩷ۖ;

    invoke-direct {p1}, Ll/ܺ᩷ۖ;-><init>()V

    .line 339
    :cond_3
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ᩷ۖ;

    .line 340
    iput-object p1, v3, Ll/ۡ᩷ۖ;->֫:Ll/ܺ᩷ۖ;

    .line 341
    iget-object v4, v3, Ll/ۡ᩷ۖ;->ۧ:Ll/ᩳۖۖ;

    iget-object v5, p1, Ll/ܺ᩷ۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-ne v3, v0, :cond_3

    .line 357
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۖۖ;

    .line 358
    invoke-virtual {v3}, Ll/ᩳۖۖ;->᩸()Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_5

    goto :goto_1

    .line 363
    :cond_5
    invoke-virtual {v3}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ۖۖ;

    .line 364
    invoke-virtual {v4}, Ll/֡ۖۖ;->ۛ()Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_1

    .line 369
    :cond_7
    invoke-virtual {v4}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v7

    sget-object v8, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v7, v8, :cond_6

    .line 372
    invoke-virtual {v4}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ᩷ۖ;

    .line 373
    iget-object v4, v4, Ll/ۡ᩷ۖ;->֫:Ll/ܺ᩷ۖ;

    if-eq v4, p1, :cond_6

    .line 374
    iget-boolean v4, v4, Ll/ܺ᩷ۖ;->ۧ:Z

    if-eqz v4, :cond_6

    goto :goto_1

    :cond_8
    const/4 v6, 0x0

    .line 383
    :goto_1
    iput-boolean v6, p1, Ll/ܺ᩷ۖ;->ۧ:Z

    .line 385
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۖۖ;

    .line 386
    iget-boolean v3, p1, Ll/ܺ᩷ۖ;->ۧ:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-object v4, p0, Ll/ۖ᩷ۖ;->ܽ:Ll/ۧۤᩴ;

    invoke-virtual {v4, v2, v3}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_9
    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ᩳۖۖ;)Z
    .locals 2

    .line 279
    iget-object v0, p0, Ll/ۖ᩷ۖ;->ܽ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 281
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    move-object v0, p0

    .line 283
    monitor-enter v0

    .line 286
    :try_start_0
    iget-object v1, p0, Ll/ۖ᩷ۖ;->ܽ:Ll/ۧۤᩴ;

    invoke-virtual {v1, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    .line 288
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    monitor-exit v0

    return p1

    .line 290
    :cond_1
    invoke-direct {p0, p1}, Ll/ۖ᩷ۖ;->ۧ(Ll/ᩳۖۖ;)Ll/ۡ᩷ۖ;

    move-result-object p1

    iget-object p1, p1, Ll/ۡ᩷ۖ;->֫:Ll/ܺ᩷ۖ;

    iget-boolean p1, p1, Ll/ܺ᩷ۖ;->ۧ:Z

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 291
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
