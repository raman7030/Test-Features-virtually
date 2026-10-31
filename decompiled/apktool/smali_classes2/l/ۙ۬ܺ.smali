.class public final Ll/ۙ۬ܺ;
.super Ljava/lang/Object;
.source "W3U9"


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 774
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 775
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙ۬ܺ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۬۬ܺ;
    .locals 7

    .line 830
    new-instance v0, Ll/֫۬ܺ;

    .line 831
    iget-object v1, p0, Ll/ۙ۬ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 776
    invoke-direct {v0, v2}, Ll/ۛۗܺ;-><init>(I)V

    .line 832
    sget v2, Ll/ܰۤܺ;->᩶:I

    .line 129
    sget-object v2, Ll/᩺ۤܺ;->᩸:Ll/ۤۤܺ;

    .line 832
    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 833
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-static {v1}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;)Ll/ۛۤܺ;

    move-result-object v1

    .line 834
    :goto_0
    move-object v2, v1

    check-cast v2, Ll/᩹۫ܺ;

    invoke-virtual {v2}, Ll/᩹۫ܺ;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 835
    invoke-virtual {v2}, Ll/᩹۫ܺ;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۤܺ;

    .line 836
    :goto_1
    invoke-virtual {v2}, Ll/᩹۫ܺ;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 837
    invoke-virtual {v2}, Ll/᩹۫ܺ;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۤܺ;

    .line 838
    invoke-virtual {v3, v4}, Ll/ܰۤܺ;->ܽ(Ll/ܰۤܺ;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 840
    invoke-virtual {v3, v4}, Ll/ܰۤܺ;->ۧ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܰۤܺ;->֫()Z

    move-result v5

    const-string v6, "Overlapping ranges not permitted but found %s overlapping %s"

    .line 839
    invoke-static {v5, v6, v3, v4}, Ll/ۘܶܺ;->֫(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 844
    invoke-virtual {v2}, Ll/᩹۫ܺ;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۤܺ;

    invoke-virtual {v3, v4}, Ll/ܰۤܺ;->ᩳ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object v3

    goto :goto_1

    .line 789
    :cond_0
    invoke-virtual {v0, v3}, Ll/ۛۗܺ;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 851
    :cond_1
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v0

    .line 852
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 853
    invoke-static {}, Ll/۬۬ܺ;->ܽ()Ll/۬۬ܺ;

    move-result-object v0

    return-object v0

    .line 854
    :cond_2
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    invoke-static {v0}, Ll/ۡ۫ܺ;->֫(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۤܺ;

    invoke-static {}, Ll/ܰۤܺ;->ᩳ()Ll/ܰۤܺ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܰۤܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 855
    invoke-static {}, Ll/۬۬ܺ;->ۧ()Ll/۬۬ܺ;

    move-result-object v0

    return-object v0

    .line 857
    :cond_3
    new-instance v1, Ll/۬۬ܺ;

    invoke-direct {v1, v0}, Ll/۬۬ܺ;-><init>(Ll/ܳ۬ܺ;)V

    return-object v1
.end method

.method public final ֫(Ll/ۙ۬ܺ;)V
    .locals 1

    .line 820
    iget-object p1, p1, Ll/ۙ۬ܺ;->֫:Ljava/util/ArrayList;

    .line 812
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۤܺ;

    .line 813
    invoke-virtual {p0, v0}, Ll/ۙ۬ܺ;->֫(Ll/ܰۤܺ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܰۤܺ;)V
    .locals 2

    .line 788
    invoke-virtual {p1}, Ll/ܰۤܺ;->֫()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "range must not be empty, but was %s"

    invoke-static {p1, v1, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 789
    iget-object v0, p0, Ll/ۙ۬ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
