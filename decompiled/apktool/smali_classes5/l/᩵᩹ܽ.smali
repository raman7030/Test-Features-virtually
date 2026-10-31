.class public final Ll/᩵᩹ܽ;
.super Ll/ܺ᩶ܽ;
.source "P676"


# instance fields
.field public final synthetic ۤ:Z

.field public final synthetic ۫:Ll/᩷᩶ܽ;


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;Ll/᩷᩶ܽ;Z)V
    .locals 0

    .line 622
    iput-object p1, p0, Ll/᩵᩹ܽ;->۫:Ll/᩷᩶ܽ;

    iput-boolean p3, p0, Ll/᩵᩹ܽ;->ۤ:Z

    invoke-direct {p0, p2}, Ll/ܺ᩶ܽ;-><init>(Ll/᩷᩶ܽ;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 666
    iget-object v0, p0, Ll/᩵᩹ܽ;->۫:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ܳ֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩶ܽ;

    iget-object v1, v1, Ll/֡᩶ܽ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 667
    sget-object v1, Ll/ۜ᩶ܽ;->۫:Ll/ۜ᩶ܽ;

    invoke-static {v0, v1}, Ll/᩷᩶ܽ;->֫(Ll/᩷᩶ܽ;Ll/ۜ᩶ܽ;)V

    return-void
.end method

.method public final ֫(Ljava/util/regex/Pattern;Ljava/lang/String;)V
    .locals 5

    .line 625
    iget-object v0, p0, Ll/᩵᩹ܽ;->۫:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ܳ֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 626
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ܳ֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܿ(Ll/᩷᩶ܽ;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v2

    iput v2, v1, Ll/֡᩶ܽ;->ۧ:I

    .line 627
    :cond_0
    iget-boolean v1, p0, Ll/᩵᩹ܽ;->ۤ:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ܳ֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩶ܽ;

    iget-object v1, v1, Ll/֡᩶ܽ;->֫:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    .line 628
    :goto_0
    new-instance v2, Ll/֡᩶ܽ;

    invoke-direct {v2}, Ll/֡᩶ܽ;-><init>()V

    .line 629
    iput-object p2, v2, Ll/֡᩶ܽ;->ܽ:Ljava/lang/String;

    .line 631
    new-instance p2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p2, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>(Ljava/util/Collection;)V

    .line 633
    new-instance v1, Ll/ᩴ᩹ܽ;

    const/4 v3, 0x0

    invoke-direct {v1, p2, p1, v2, v3}, Ll/ᩴ᩹ܽ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 645
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 646
    sget p2, Ll/ܿ᩸ۡ;->֫:I

    div-int/lit8 p2, p2, 0x2

    :goto_1
    if-ge v3, p2, :cond_2

    .line 648
    new-instance v4, Ljava/lang/Thread;

    invoke-direct {v4, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 649
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 650
    invoke-virtual {p1, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 652
    :cond_2
    invoke-virtual {v1}, Ll/ᩴ᩹ܽ;->run()V

    .line 653
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Thread;

    .line 655
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    goto :goto_2

    .line 660
    :cond_3
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object p1

    iget-object p1, p1, Ll/ᩳ᩶ܽ;->ܳ֫:Ljava/util/Stack;

    invoke-virtual {p1, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 661
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object p1

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ᩳ᩶ܽ;->ᩳ()Ll/ۜ᩶ܽ;

    move-result-object p2

    iput-object p2, p1, Ll/ᩳ᩶ܽ;->ۘ֫:Ll/ۜ᩶ܽ;

    return-void
.end method
