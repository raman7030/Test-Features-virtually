.class public Ll/ۚܳ᩻;
.super Ll/ۛܶۢ;
.source "OAHZ"


# instance fields
.field public ۖ֫:Ll/ۗۢ᩻;

.field public ۘ֫:Ljava/util/ArrayList;

.field public ܺ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 413
    invoke-direct {p0}, Ll/ۛܶۢ;-><init>()V

    .line 415
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚܳ᩻;->ۘ֫:Ljava/util/ArrayList;

    .line 416
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚܳ᩻;->ܺ֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 473
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 474
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 475
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 476
    iget-object p1, p0, Ll/ۚܳ᩻;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f120122

    .line 477
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 480
    :cond_0
    iget-object p1, p0, Ll/ۚܳ᩻;->ۘ֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    .line 481
    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 482
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ܿ۠ۢ;Z)V
    .locals 0

    .line 466
    iget-object p2, p0, Ll/ۚܳ᩻;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_0

    .line 467
    invoke-static {p1, p2}, Ll/᩷ۤܳ;->֫(Ll/ۗܺ᩷;Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 1

    const v0, 0x7f120121

    .line 651
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 420
    sget-object v0, Ll/᩻ܶۢ;->ۘ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۡ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 8

    const-string v0, "oldNames"

    .line 442
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "newNames"

    .line 443
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const-string v2, "path"

    .line 444
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 445
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֫֫()Ll/ܰܺܳ;

    move-result-object v3

    check-cast v3, Ll/ۗۢ᩻;

    iput-object v3, p0, Ll/ۚܳ᩻;->ۖ֫:Ll/ۗۢ᩻;

    .line 447
    new-instance v3, Ll/᩵ۛۡ;

    array-length v4, v0

    int-to-long v4, v4

    invoke-direct {v3, v4, v5}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v4, Ll/ܺ᩵ܿ;

    const/4 v5, 0x5

    invoke-direct {v4, v5, p0}, Ll/ܺ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    const/4 v4, 0x0

    .line 448
    :goto_0
    array-length v5, v0

    if-ge v4, v5, :cond_2

    .line 449
    new-instance v5, Ll/ۜۤܳ;

    aget-object v6, v0, v4

    aget-object v7, v1, v4

    invoke-direct {v5, v6, v7}, Ll/ۜۤܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x1

    .line 41
    invoke-virtual {v3, v6}, Ll/᩵ۛۡ;->֫(I)Z

    .line 451
    invoke-virtual {v5}, Ll/ۜۤܳ;->ܽ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 452
    iget-object v6, p0, Ll/ۚܳ᩻;->ۖ֫:Ll/ۗۢ᩻;

    invoke-virtual {v5, v6, v2}, Ll/ۜۤܳ;->֫(Ll/ۗۢ᩻;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 453
    iget-object v6, p0, Ll/ۚܳ᩻;->ۘ֫:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ll/ۜۤܳ;->ۧ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 455
    :cond_0
    iget-object v6, p0, Ll/ۚܳ᩻;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ll/ۜۤܳ;->ܽ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    :goto_1
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 458
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 461
    :cond_2
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 489
    iget-object p1, p0, Ll/ۚܳ᩻;->ۖ֫:Ll/ۗۢ᩻;

    invoke-virtual {p1}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f12088f

    .line 435
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 436
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
