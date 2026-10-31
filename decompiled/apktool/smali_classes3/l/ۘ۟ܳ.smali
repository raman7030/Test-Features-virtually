.class public Ll/ۘ۟ܳ;
.super Ll/ۛܶۢ;
.source "B29A"


# instance fields
.field public ۖ֫:Ljava/util/ArrayList;

.field public ܺ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 509
    invoke-direct {p0}, Ll/ۛܶۢ;-><init>()V

    .line 510
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘ۟ܳ;->ۖ֫:Ljava/util/ArrayList;

    .line 511
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘ۟ܳ;->ܺ֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 578
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 579
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 580
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 581
    iget-object p1, p0, Ll/ۘ۟ܳ;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f120122

    .line 582
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 585
    :cond_0
    iget-object p1, p0, Ll/ۘ۟ܳ;->ۖ֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    .line 586
    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 587
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ܿ۠ۢ;Z)V
    .locals 0

    .line 571
    iget-object p2, p0, Ll/ۘ۟ܳ;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_0

    .line 572
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

    .line 515
    sget-object v0, Ll/᩻ܶۢ;->ۘ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۡ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 9

    const-string v0, "oldNames"

    .line 537
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "newNames"

    .line 538
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const-string v2, "path"

    .line 539
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 541
    sget-object v3, Ll/ܽ֨ۢ;->ۙ:Ll/ܽ֨ۢ;

    invoke-static {v2, v3}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V

    const-wide/16 v3, 0xc8

    .line 542
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    .line 544
    new-instance v3, Ll/᩵ۛۡ;

    array-length v4, v0

    int-to-long v4, v4

    invoke-direct {v3, v4, v5}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v4, Ll/᩻ۨ᩷;

    const/4 v5, 0x1

    invoke-direct {v4, v5, p0}, Ll/᩻ۨ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    const/16 v4, 0x3e8

    .line 546
    array-length v5, v0

    div-int/2addr v4, v5

    const/16 v5, 0x96

    if-le v4, v5, :cond_0

    const/16 v4, 0x96

    :cond_0
    const/4 v5, 0x0

    .line 550
    :goto_0
    array-length v6, v0

    if-ge v5, v6, :cond_4

    .line 551
    new-instance v6, Ll/ۜۤܳ;

    aget-object v7, v0, v5

    aget-object v8, v1, v5

    invoke-direct {v6, v7, v8}, Ll/ۜۤܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x1

    .line 41
    invoke-virtual {v3, v7}, Ll/᩵ۛۡ;->֫(I)Z

    .line 553
    invoke-virtual {v6}, Ll/ۜۤܳ;->ܽ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    if-lez v4, :cond_1

    int-to-long v7, v4

    .line 555
    invoke-static {v7, v8}, Landroid/os/SystemClock;->sleep(J)V

    .line 557
    :cond_1
    invoke-virtual {v6, v2}, Ll/ۜۤܳ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 558
    iget-object v7, p0, Ll/ۘ۟ܳ;->ۖ֫:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ll/ۜۤܳ;->ۧ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 560
    :cond_2
    iget-object v7, p0, Ll/ۘ۟ܳ;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ll/ۜۤܳ;->ܽ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 562
    :goto_1
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 563
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 566
    :cond_4
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 594
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 595
    invoke-static {}, Ll/ۡᩴܳ;->᩻()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f12088f

    .line 530
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 531
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
