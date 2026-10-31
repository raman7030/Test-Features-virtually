.class public final Ll/۟ۜۡ;
.super Landroid/widget/Filter;
.source "N155"


# instance fields
.field public final synthetic ֫:Ll/֫᩷ۡ;


# direct methods
.method public constructor <init>(Ll/֫᩷ۡ;)V
    .locals 0

    .line 576
    iput-object p1, p0, Ll/۟ۜۡ;->֫:Ll/֫᩷ۡ;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method


# virtual methods
.method public final performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 10

    .line 579
    new-instance v1, Landroid/widget/Filter$FilterResults;

    invoke-direct {v1}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 581
    iget-object v0, p0, Ll/۟ۜۡ;->֫:Ll/֫᩷ۡ;

    invoke-static {v0}, Ll/֫᩷ۡ;->ܽ(Ll/֫᩷ۡ;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    .line 582
    iget-object v0, p0, Ll/۟ۜۡ;->֫:Ll/֫᩷ۡ;

    invoke-static {v0}, Ll/֫᩷ۡ;->֫(Ll/֫᩷ۡ;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 583
    :try_start_0
    iget-object v2, p0, Ll/۟ۜۡ;->֫:Ll/֫᩷ۡ;

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p0, Ll/۟ۜۡ;->֫:Ll/֫᩷ۡ;

    invoke-static {v4}, Ll/֫᩷ۡ;->ۧ(Ll/֫᩷ۡ;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2, v3}, Ll/֫᩷ۡ;->֫(Ll/֫᩷ۡ;Ljava/util/ArrayList;)V

    .line 584
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :goto_0
    if-eqz p1, :cond_6

    .line 587
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_4

    .line 595
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 598
    iget-object v0, p0, Ll/۟ۜۡ;->֫:Ll/֫᩷ۡ;

    invoke-static {v0}, Ll/֫᩷ۡ;->֫(Ll/֫᩷ۡ;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 599
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/۟ۜۡ;->֫:Ll/֫᩷ۡ;

    invoke-static {v3}, Ll/֫᩷ۡ;->ܽ(Ll/֫᩷ۡ;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 600
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 602
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 603
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v0, :cond_5

    .line 606
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 607
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    .line 610
    invoke-virtual {v6, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 611
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    const-string v7, " "

    .line 613
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 614
    array-length v7, v6

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_4

    aget-object v9, v6, v8

    .line 615
    invoke-virtual {v9, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 616
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 623
    :cond_5
    iput-object v3, v1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 624
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, v1, Landroid/widget/Filter$FilterResults;->count:I

    return-object v1

    :catchall_1
    move-exception p1

    .line 600
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 589
    :cond_6
    :goto_4
    iget-object p1, p0, Ll/۟ۜۡ;->֫:Ll/֫᩷ۡ;

    invoke-static {p1}, Ll/֫᩷ۡ;->֫(Ll/֫᩷ۡ;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    monitor-enter v0

    .line 590
    :try_start_3
    new-instance p1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/۟ۜۡ;->֫:Ll/֫᩷ۡ;

    invoke-static {v2}, Ll/֫᩷ۡ;->ܽ(Ll/֫᩷ۡ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 591
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 592
    iput-object p1, v1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 593
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, v1, Landroid/widget/Filter$FilterResults;->count:I

    return-object v1

    :catchall_2
    move-exception p1

    .line 591
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public final publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 1

    .line 633
    iget-object p1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Ll/۟ۜۡ;->֫:Ll/֫᩷ۡ;

    invoke-static {v0, p1}, Ll/֫᩷ۡ;->֫(Ll/֫᩷ۡ;Ljava/util/List;)V

    .line 634
    iget p1, p2, Landroid/widget/Filter$FilterResults;->count:I

    if-lez p1, :cond_0

    .line 635
    invoke-virtual {v0}, Ll/֫᩷ۡ;->notifyDataSetChanged()V

    return-void

    .line 637
    :cond_0
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void
.end method
