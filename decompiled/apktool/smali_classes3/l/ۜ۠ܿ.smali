.class public final Ll/ۜ۠ܿ;
.super Ll/᩶ۗۧ;
.source "313O"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/util/List;

.field public final synthetic ܽ:Ll/ۘ۠ܿ;


# direct methods
.method public constructor <init>(Ll/ۘ۠ܿ;)V
    .locals 0

    .line 526
    iput-object p1, p0, Ll/ۜ۠ܿ;->ܽ:Ll/ۘ۠ܿ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 528
    invoke-static {p1}, Ll/ۘ۠ܿ;->ܽ(Ll/ۘ۠ܿ;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ۠ܿ;->ۧ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 572
    iget-object v0, p0, Ll/ۜ۠ܿ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 3

    .line 526
    check-cast p1, Ll/ۖ۠ܿ;

    .line 564
    iget-object v0, p0, Ll/ۜ۠ܿ;->ۧ:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۡ۠ܿ;

    .line 565
    iput-object p2, p1, Ll/ۖ۠ܿ;->᩸:Ll/ۡ۠ܿ;

    .line 566
    iget-object v0, p1, Ll/ۖ۠ܿ;->ۙ:Landroid/widget/TextView;

    iget-object v1, p2, Ll/ۡ۠ܿ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 567
    iget-object p1, p1, Ll/ۖ۠ܿ;->᩹:Landroid/widget/ImageView;

    .line 600
    iget-object v0, p2, Ll/ۡ۠ܿ;->ܽ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 601
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 603
    :cond_0
    iget-object v0, p2, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    invoke-virtual {v0}, Ll/ۗ֨ܿ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    .line 604
    invoke-static {}, Ll/ۘ۠ܿ;->֫()Ll/֨᩵;

    move-result-object v0

    monitor-enter v0

    .line 605
    :try_start_0
    invoke-static {}, Ll/ۘ۠ܿ;->֫()Ll/֨᩵;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable;

    iput-object v1, p2, Ll/ۡ۠ܿ;->ܽ:Landroid/graphics/drawable/Drawable;

    .line 606
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 608
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 611
    :cond_1
    iget-object v0, p2, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 612
    iget-object p2, p2, Ll/ۡ۠ܿ;->ܳ:Ll/ۢ۠ܿ;

    iget-boolean v0, p2, Ll/ۢ۠ܿ;->᩸:Z

    if-eqz v0, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x1

    .line 614
    iput-boolean v0, p2, Ll/ۢ۠ܿ;->᩸:Z

    .line 615
    iput-object p1, p2, Ll/ۢ۠ܿ;->᩹:Landroid/widget/ImageView;

    .line 616
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    .line 606
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    .line 558
    iget-object p2, p0, Ll/ۜ۠ܿ;->ܽ:Ll/ۘ۠ܿ;

    invoke-static {p2}, Ll/ۘ۠ܿ;->ۧ(Ll/ۘ۠ܿ;)Ll/ۗܺ᩷;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d00f0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 559
    new-instance v0, Ll/ۖ۠ܿ;

    invoke-direct {v0, p2, p1}, Ll/ۖ۠ܿ;-><init>(Ll/ۘ۠ܿ;Landroid/view/View;)V

    return-object v0
.end method

.method public final ֫()V
    .locals 5

    .line 537
    iget-object v0, p0, Ll/ۜ۠ܿ;->֫:Ljava/lang/String;

    .line 538
    iget-object v1, p0, Ll/ۜ۠ܿ;->ܽ:Ll/ۘ۠ܿ;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 543
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 544
    invoke-static {v1}, Ll/ۘ۠ܿ;->ܽ(Ll/ۘ۠ܿ;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ۠ܿ;

    .line 545
    iget-object v4, v3, Ll/ۡ۠ܿ;->ᩳ:Ljava/lang/String;

    invoke-static {v4, v0}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 546
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 547
    :cond_2
    iget-object v4, v3, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ll/ۗ֨ܿ;->ܿ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 548
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 551
    :cond_3
    iput-object v2, p0, Ll/ۜ۠ܿ;->ۧ:Ljava/util/List;

    .line 552
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void

    .line 539
    :cond_4
    :goto_1
    invoke-static {v1}, Ll/ۘ۠ܿ;->ܽ(Ll/ۘ۠ܿ;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۜ۠ܿ;->ۧ:Ljava/util/List;

    .line 540
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 531
    iput-object p1, p0, Ll/ۜ۠ܿ;->֫:Ljava/lang/String;

    .line 532
    invoke-virtual {p0}, Ll/ۜ۠ܿ;->֫()V

    return-void
.end method
