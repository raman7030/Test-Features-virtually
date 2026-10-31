.class public final Ll/֡᩹ܽ;
.super Ll/ܺ᩶ܽ;
.source "P676"


# instance fields
.field public final synthetic ۤ:Z

.field public final synthetic ۫:Ll/᩷᩶ܽ;


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;Ll/᩷᩶ܽ;Z)V
    .locals 0

    .line 673
    iput-object p1, p0, Ll/֡᩹ܽ;->۫:Ll/᩷᩶ܽ;

    iput-boolean p3, p0, Ll/֡᩹ܽ;->ۤ:Z

    invoke-direct {p0, p2}, Ll/ܺ᩶ܽ;-><init>(Ll/᩷᩶ܽ;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 702
    iget-object v0, p0, Ll/֡᩹ܽ;->۫:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩶ܽ;

    iget-object v1, v1, Ll/֡᩶ܽ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 703
    sget-object v1, Ll/ۜ᩶ܽ;->ۤ:Ll/ۜ᩶ܽ;

    invoke-static {v0, v1}, Ll/᩷᩶ܽ;->֫(Ll/᩷᩶ܽ;Ll/ۜ᩶ܽ;)V

    return-void
.end method

.method public final ֫(Ljava/util/regex/Pattern;Ljava/lang/String;)V
    .locals 4

    .line 676
    iget-object v0, p0, Ll/֡᩹ܽ;->۫:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 677
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܿ(Ll/᩷᩶ܽ;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v2

    iput v2, v1, Ll/֡᩶ܽ;->ۧ:I

    .line 679
    :cond_0
    iget-boolean v1, p0, Ll/֡᩹ܽ;->ۤ:Z

    if-eqz v1, :cond_1

    .line 680
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩶ܽ;

    iget-object v1, v1, Ll/֡᩶ܽ;->֫:Ljava/util/ArrayList;

    goto :goto_0

    .line 682
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 683
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v2

    iget-object v2, v2, Ll/ᩳ᩶ܽ;->ۙ:Ll/ۧ᩸֡;

    invoke-virtual {v2}, Ll/ۧ᩸֡;->᩻()Ll/۟ܶ֡;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 685
    invoke-virtual {v2}, Ll/۟ܶ֡;->ۧܽ()[Ll/ܰܶ֡;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 686
    invoke-virtual {v2}, Ll/۟ܶ֡;->ܿܽ()[Ll/ܰܶ֡;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 689
    :cond_2
    :goto_0
    new-instance v2, Ll/֡᩶ܽ;

    invoke-direct {v2}, Ll/֡᩶ܽ;-><init>()V

    .line 690
    iput-object p2, v2, Ll/֡᩶ܽ;->ܽ:Ljava/lang/String;

    .line 692
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰܶ֡;

    .line 693
    invoke-static {v1, p1}, Ll/ۚ᩶ܽ;->֫(Ll/ܰܶ֡;Ljava/util/regex/Pattern;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 694
    iget-object v3, v2, Ll/֡᩶ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 696
    :cond_4
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object p1

    iget-object p1, p1, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {p1, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object p1

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ᩳ᩶ܽ;->ᩳ()Ll/ۜ᩶ܽ;

    move-result-object p2

    iput-object p2, p1, Ll/ᩳ᩶ܽ;->ᩴ֫:Ll/ۜ᩶ܽ;

    return-void
.end method
