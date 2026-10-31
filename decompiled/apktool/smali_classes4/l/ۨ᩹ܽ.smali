.class public final Ll/ۨ᩹ܽ;
.super Ll/۬ۙܽ;
.source "P676"


# instance fields
.field public final synthetic ۜ:Z

.field public final synthetic ᩻:Ll/᩷᩶ܽ;


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;Ll/᩷᩶ܽ;Z)V
    .locals 0

    .line 560
    iput-object p1, p0, Ll/ۨ᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    iput-boolean p3, p0, Ll/ۨ᩹ܽ;->ۜ:Z

    const p1, 0x7f0d009e

    const-string p3, "dex_search_type_constant"

    invoke-direct {p0, p1, p2, p3}, Ll/۬ۙܽ;-><init>(ILl/ۗܺ᩷;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 587
    iget-object v0, p0, Ll/ۨ᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩶ܽ;

    iget-object v1, v1, Ll/֡᩶ܽ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 588
    sget-object v1, Ll/ۜ᩶ܽ;->ۤ:Ll/ۜ᩶ܽ;

    invoke-static {v0, v1}, Ll/᩷᩶ܽ;->֫(Ll/᩷᩶ܽ;Ll/ۜ᩶ܽ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .line 563
    iget-object v0, p0, Ll/ۨ᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 564
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

    .line 566
    :cond_0
    iget-boolean v1, p0, Ll/ۨ᩹ܽ;->ۜ:Z

    if-eqz v1, :cond_1

    .line 567
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩶ܽ;

    iget-object v1, v1, Ll/֡᩶ܽ;->֫:Ljava/util/ArrayList;

    goto :goto_0

    .line 569
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 570
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v2

    iget-object v2, v2, Ll/ᩳ᩶ܽ;->ۙ:Ll/ۧ᩸֡;

    invoke-virtual {v2}, Ll/ۧ᩸֡;->᩻()Ll/۟ܶ֡;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 572
    invoke-virtual {v2}, Ll/۟ܶ֡;->ۧܽ()[Ll/ܰܶ֡;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 573
    invoke-virtual {v2}, Ll/۟ܶ֡;->ܿܽ()[Ll/ܰܶ֡;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    .line 254
    new-instance p3, Ll/֡᩶ܽ;

    invoke-direct {p3}, Ll/֡᩶ܽ;-><init>()V

    .line 255
    iput-object p2, p3, Ll/֡᩶ܽ;->ܽ:Ljava/lang/String;

    .line 256
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 257
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰܶ֡;

    .line 258
    invoke-static {v1, p1}, Ll/ۚ᩶ܽ;->֫(Ll/ܰܶ֡;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 259
    iget-object v2, p3, Ll/֡᩶ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 105
    :cond_4
    new-instance p3, Ll/֡᩶ܽ;

    invoke-direct {p3}, Ll/֡᩶ܽ;-><init>()V

    .line 106
    iput-object p2, p3, Ll/֡᩶ܽ;->ܽ:Ljava/lang/String;

    .line 109
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰܶ֡;

    .line 114
    invoke-static {v2, p1, p2}, Ll/ۚ᩶ܽ;->֫(Ll/ܰܶ֡;J)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 115
    iget-object v3, p3, Ll/֡᩶ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 581
    :catch_0
    :cond_6
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object p1

    iget-object p1, p1, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {p1, p3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object p1

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ᩳ᩶ܽ;->ᩳ()Ll/ۜ᩶ܽ;

    move-result-object p2

    iput-object p2, p1, Ll/ᩳ᩶ܽ;->ᩴ֫:Ll/ۜ᩶ܽ;

    return-void
.end method
