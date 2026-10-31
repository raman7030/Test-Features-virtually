.class public final Ll/ۢۡۢ;
.super Ll/۟ܶۡ;
.source "31PG"


# instance fields
.field public final synthetic ۜ:Ljava/util/Collection;

.field public final synthetic ۢ:Ljava/lang/String;

.field public ܳ:Ljava/lang/String;

.field public final synthetic ᩷:Ljava/lang/String;

.field public final synthetic ᩻:Ll/۟ۡۢ;


# direct methods
.method public constructor <init>(Ll/۟ۡۢ;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V
    .locals 0

    .line 532
    iput-object p1, p0, Ll/ۢۡۢ;->᩻:Ll/۟ۡۢ;

    iput-object p2, p0, Ll/ۢۡۢ;->ۢ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۢۡۢ;->᩷:Ljava/lang/String;

    iput-object p4, p0, Ll/ۢۡۢ;->ۜ:Ljava/util/Collection;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 594
    iget-object v0, p0, Ll/ۢۡۢ;->ܳ:Ljava/lang/String;

    const v1, 0x7f12079c

    iget-object v2, p0, Ll/ۢۡۢ;->᩻:Ll/۟ۡۢ;

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    .line 323
    invoke-static {v2, v0, v1, v3, v3}, Ll/ܶۖᩳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 599
    iget-object v0, p0, Ll/ۢۡۢ;->᩻:Ll/۟ۡۢ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 537
    iget-object v0, p0, Ll/ۢۡۢ;->᩻:Ll/۟ۡۢ;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 12

    .line 542
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 543
    iget-object v1, p0, Ll/ۢۡۢ;->ۢ:Ljava/lang/String;

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v3, :cond_1

    aget-object v6, v1, v4

    .line 544
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_0

    .line 545
    new-instance v7, Ll/ۗۢۢ;

    invoke-direct {v7, v6, v5}, Ll/ۗۢۢ;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 548
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 549
    iget-object v1, p0, Ll/ۢۡۢ;->᩷:Ljava/lang/String;

    invoke-static {v1}, Ll/᩹ۢۢ;->ۧ(Ljava/lang/String;)Ll/᩹ۢۢ;

    move-result-object v1

    .line 552
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 554
    iget-object v4, p0, Ll/ۢۡۢ;->ۜ:Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x0

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۖۡۢ;

    .line 555
    iget-object v8, v7, Ll/ۖۡۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v8}, Ll/᩹ۢۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 557
    iget-boolean v7, v7, Ll/ۖۡۢ;->֫:Z

    if-eqz v7, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    .line 560
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۗۢۢ;

    .line 561
    invoke-virtual {v10, v9}, Ll/ۗۢۢ;->֫(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 562
    iget-boolean v7, v10, Ll/ۗۢۢ;->᩸:Z

    xor-int/2addr v7, v5

    goto :goto_2

    :cond_5
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_2

    .line 84
    new-instance v7, Ll/ۤۤ;

    invoke-direct {v7, v9, v8}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 568
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    iget-object v7, v1, Ll/᩹ۢۢ;->֫:Ljava/util/Map;

    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_2

    .line 569
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    .line 575
    :cond_6
    new-instance v0, Ll/᩷ۡۢ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v3, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 576
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 577
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۤۤ;

    .line 578
    iget-object v4, v4, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_7
    if-eqz v6, :cond_9

    const-string v1, "\n# mapping\u5bf9\u7167\n"

    .line 581
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۤ;

    .line 584
    iget-object v4, v3, Ll/ۤۤ;->֫:Ljava/lang/Object;

    iget-object v5, v3, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    .line 585
    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " -> "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 589
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۢۡۢ;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 604
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
