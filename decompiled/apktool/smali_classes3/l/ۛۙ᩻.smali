.class public final Ll/ۛۙ᩻;
.super Ljava/lang/Object;
.source "Z202"

# interfaces
.implements Ll/ܶ᩶᩻;


# instance fields
.field public final synthetic ۗ:Ll/ۨۙ᩻;

.field public ۙ:Ljava/util/List;

.field public final synthetic ۬:Ll/ۗ᩺ۡ;

.field public ᩶:Z

.field public ᩸:Ljava/util/Iterator;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۨۙ᩻;Ll/ۗ᩺ۡ;)V
    .locals 0

    .line 446
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۙ᩻;->ۗ:Ll/ۨۙ᩻;

    iput-object p2, p0, Ll/ۛۙ᩻;->۬:Ll/ۗ᩺ۡ;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 498
    iget-object v0, p0, Ll/ۛۙ᩻;->ۗ:Ll/ۨۙ᩻;

    iget-object v0, v0, Ll/ۨۙ᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۧ()V

    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 454
    iget-object v0, p0, Ll/ۛۙ᩻;->ۗ:Ll/ۨۙ᩻;

    iget-object v0, v0, Ll/ۨۙ᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩹ۗܿ;->ۧ(JJ)V

    return-void
.end method

.method public final ۖ()Z
    .locals 1

    .line 493
    iget-boolean v0, p0, Ll/ۛۙ᩻;->᩶:Z

    return v0
.end method

.method public final ᩴ()Z
    .locals 6

    .line 459
    iget-object v0, p0, Ll/ۛۙ᩻;->ۗ:Ll/ۨۙ᩻;

    iget-object v1, v0, Ll/ۨۙ᩻;->ۖ:Ll/ܽۢܳ;

    iget-object v2, v0, Ll/ۨۙ᩻;->ۘ:Ll/ᩳܰۡ;

    invoke-virtual {v2}, Ll/ᩳܰۡ;->᩹()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    .line 460
    iput-boolean v4, p0, Ll/ۛۙ᩻;->᩹:Z

    .line 461
    iput-boolean v4, p0, Ll/ۛۙ᩻;->᩶:Z

    return v3

    .line 464
    :cond_0
    iget-object v2, p0, Ll/ۛۙ᩻;->۬:Ll/ۗ᩺ۡ;

    invoke-static {v2}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 465
    iget-object v3, p0, Ll/ۛۙ᩻;->ۙ:Ljava/util/List;

    if-nez v3, :cond_1

    .line 466
    iget-object v3, v0, Ll/ۨۙ᩻;->ۘ:Ll/ᩳܰۡ;

    invoke-static {v3, v2, p0}, Ll/᩹᩶᩻;->֫(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/ܿۖ᩷;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Ll/ۛۙ᩻;->ۙ:Ljava/util/List;

    .line 468
    :cond_1
    iput-boolean v4, p0, Ll/ۛۙ᩻;->᩹:Z

    .line 469
    new-instance v2, Ll/۫֨ܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    iget-object v0, v0, Ll/ۨۙ᩻;->ۘ:Ll/ᩳܰۡ;

    invoke-direct {v2, v1, v0}, Ll/۫֨ܳ;-><init>(Lbin/mt/plus/Main;Ll/ᩳܰۡ;)V

    new-instance v0, Ll/ۤۙ᩻;

    invoke-direct {v0, p0}, Ll/ۤۙ᩻;-><init>(Ll/ۛۙ᩻;)V

    .line 470
    invoke-virtual {v2, v0}, Ll/۫֨ܳ;->֫(Ljava/util/function/BooleanSupplier;)V

    .line 471
    iget-object v0, p0, Ll/ۛۙ᩻;->ۙ:Ljava/util/List;

    invoke-virtual {v2, v0}, Ll/۫֨ܳ;->֫(Ljava/util/List;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛۙ᩻;->᩶:Z

    return v0

    .line 473
    :cond_2
    iget-object v2, p0, Ll/ۛۙ᩻;->᩸:Ljava/util/Iterator;

    if-nez v2, :cond_3

    .line 474
    invoke-static {}, Ll/ۤܺܳ;->ۧ()Ljava/util/Iterator;

    move-result-object v2

    iput-object v2, p0, Ll/ۛۙ᩻;->᩸:Ljava/util/Iterator;

    .line 476
    :cond_3
    iget-object v2, p0, Ll/ۛۙ᩻;->᩸:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 477
    iget-object v0, v0, Ll/ۨۙ᩻;->ۘ:Ll/ᩳܰۡ;

    iget-object v1, p0, Ll/ۛۙ᩻;->᩸:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 478
    iput-boolean v3, p0, Ll/ۛۙ᩻;->᩹:Z

    .line 479
    iput-boolean v4, p0, Ll/ۛۙ᩻;->᩶:Z

    return v3

    .line 482
    :cond_4
    iput-boolean v4, p0, Ll/ۛۙ᩻;->᩹:Z

    .line 483
    new-instance v2, Ll/۫֨ܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    iget-object v0, v0, Ll/ۨۙ᩻;->ۘ:Ll/ᩳܰۡ;

    invoke-direct {v2, v1, v0}, Ll/۫֨ܳ;-><init>(Lbin/mt/plus/Main;Ll/ᩳܰۡ;)V

    invoke-virtual {v2}, Ll/۫֨ܳ;->֫()Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛۙ᩻;->᩶:Z

    return v0
.end method

.method public final ᩺()Z
    .locals 1

    .line 488
    iget-boolean v0, p0, Ll/ۛۙ᩻;->᩹:Z

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 503
    iget-object v0, p0, Ll/ۛۙ᩻;->ۗ:Ll/ۨۙ᩻;

    iget-object v0, v0, Ll/ۨۙ᩻;->ܳ:Ll/᩹ۗܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method
