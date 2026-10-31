.class public abstract Ll/ۖܳۖ;
.super Ll/۠ᩳۖ;
.source "H88J"


# instance fields
.field public final ֫:Ll/᩵ܳۖ;


# direct methods
.method public constructor <init>(Ll/᩵ܳۖ;)V
    .locals 0

    .line 477
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    .line 478
    iput-object p1, p0, Ll/ۖܳۖ;->֫:Ll/᩵ܳۖ;

    return-void
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 3

    .line 501
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 502
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 506
    :cond_0
    invoke-virtual {p0}, Ll/ۖܳۖ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    .line 507
    iget-object v1, p0, Ll/ۖܳۖ;->֫:Ll/᩵ܳۖ;

    iget-object v1, v1, Ll/᩵ܳۖ;->֫:Ljava/util/Map;

    .line 510
    :try_start_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܽ()V

    .line 511
    :goto_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 512
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۙ()Ljava/lang/String;

    move-result-object v2

    .line 513
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘܳۖ;

    if-nez v2, :cond_1

    .line 515
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩺()V

    goto :goto_0

    .line 517
    :cond_1
    invoke-virtual {p0, v0, p1, v2}, Ll/ۖܳۖ;->֫(Ljava/lang/Object;Ll/ܿۜۖ;Ll/ۘܳۖ;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 525
    :cond_2
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩻()V

    .line 526
    invoke-virtual {p0, v0}, Ll/ۖܳۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 523
    sget v0, Ll/۬᩻ۖ;->֫:I

    .line 201
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 521
    new-instance v0, Ll/ܳᩳۖ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 521
    throw v0
.end method

.method public abstract ֫(Ljava/lang/Object;Ll/ܿۜۖ;Ll/ۘܳۖ;)V
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    .line 484
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 488
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ܽ()V

    .line 490
    :try_start_0
    iget-object v0, p0, Ll/ۖܳۖ;->֫:Ll/᩵ܳۖ;

    iget-object v0, v0, Ll/᩵ܳۖ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘܳۖ;

    .line 491
    invoke-virtual {v1, p1, p2}, Ll/ۘܳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 496
    :cond_1
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ܳ()V

    return-void

    :catch_0
    move-exception p1

    .line 494
    sget p2, Ll/۬᩻ۖ;->֫:I

    .line 201
    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public abstract ۧ()Ljava/lang/Object;
.end method
