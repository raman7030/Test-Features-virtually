.class public final Ll/֡ۛ֨;
.super Ljava/lang/Object;
.source "M43N"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public final synthetic ۧ:Ll/ۚۛ֨;


# direct methods
.method public constructor <init>(Ll/ۚۛ֨;)V
    .locals 9

    .line 1837
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۛ֨;->ۧ:Ll/ۚۛ֨;

    .line 1882
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    .line 1883
    iget-object p1, p1, Ll/ۚۛ֨;->֫:Ll/֡ۨ֨;

    invoke-virtual {p1}, Ll/֡ۨ֨;->ᩳ()Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 1884
    iget-object v2, p0, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    new-instance v3, Ll/᩵ۛ֨;

    invoke-direct {v3, p0, v1}, Ll/᩵ۛ֨;-><init>(Ll/֡ۛ֨;Ll/ۙ֨֨;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1887
    :cond_0
    iget-object v0, p0, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵ۛ֨;

    .line 1888
    iget-object v2, v1, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ᩴܶ۠;

    invoke-virtual {v2}, Ll/ᩴܶ۠;->first()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ֨֨;

    .line 1889
    iget-object v3, p0, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵ۛ֨;

    .line 1890
    iget-object v5, v4, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    check-cast v5, Ll/ᩴܶ۠;

    invoke-virtual {v5}, Ll/ᩴܶ۠;->first()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙ֨֨;

    if-eq v2, v5, :cond_2

    .line 1893
    invoke-virtual {p1, v2}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v6

    check-cast v6, Ll/֨֨֨;

    .line 1894
    invoke-static {}, Ll/᩵֨֨;->values()[Ll/᩵֨֨;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v6

    invoke-static {v5}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v5

    invoke-static {v6, v5}, Ll/ۙ֨֨;->֫(Ll/ۖܶ۠;Ll/ۖܶ۠;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 1719
    iget-object v5, v1, Ll/᩵ۛ֨;->ۙ:Ljava/util/LinkedHashSet;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1902
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 1903
    iget-object v0, p0, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۠۠;->֫(Ljava/util/AbstractCollection;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖܶ۠;

    .line 1904
    invoke-virtual {v1}, Ll/ۖܶ۠;->ۧ()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_9

    .line 1905
    iget-object v2, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/᩵ۛ֨;

    .line 1906
    iget-object v4, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1777
    iget-object v5, v2, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v4}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵ۛ֨;

    .line 1778
    iget-object v7, v6, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    check-cast v7, Ll/ᩴܶ۠;

    invoke-virtual {v7}, Ll/ᩴܶ۠;->ۧ()I

    move-result v7

    if-ne v7, v3, :cond_5

    const/4 v7, 0x1

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    :goto_3
    const-string v8, "Attempt to merge a compound node!"

    invoke-static {v8, v7}, Ll/۫ۙ;->֫(Ljava/lang/String;Z)V

    .line 1779
    move-object v7, v5

    check-cast v7, Ll/ᩴܶ۠;

    iget-object v8, v6, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    check-cast v8, Ll/ᩴܶ۠;

    invoke-virtual {v7, v8}, Ll/ᩴܶ۠;->֫(Ll/ᩴܶ۠;)V

    .line 1780
    iget-object v6, v6, Ll/᩵ۛ֨;->ۙ:Ljava/util/LinkedHashSet;

    .line 1726
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩵ۛ֨;

    .line 1719
    iget-object v8, v2, Ll/᩵ۛ֨;->ۙ:Ljava/util/LinkedHashSet;

    invoke-interface {v8, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 1783
    :cond_6
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1784
    iget-object v4, v2, Ll/᩵ۛ֨;->ۙ:Ljava/util/LinkedHashSet;

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵ۛ֨;

    .line 1785
    move-object v7, v5

    check-cast v7, Ll/ᩴܶ۠;

    iget-object v8, v6, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    check-cast v8, Ll/ᩴܶ۠;

    invoke-virtual {v8}, Ll/ᩴܶ۠;->first()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ll/ᩴܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 1786
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 1788
    :cond_7
    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 1791
    :cond_8
    iput-object v3, v2, Ll/᩵ۛ֨;->ۙ:Ljava/util/LinkedHashSet;

    .line 1907
    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵ۛ֨;

    .line 1908
    invoke-virtual {p0, v4, v2}, Ll/֡ۛ֨;->֫(Ll/᩵ۛ֨;Ll/᩵ۛ֨;)V

    goto :goto_6

    .line 1911
    :cond_9
    iget-object v1, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/᩵ۛ֨;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 1913
    :cond_a
    iput-object p1, p0, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵ۛ֨;Ll/᩵ۛ֨;)V
    .locals 3

    .line 1869
    iget-object v0, p0, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵ۛ֨;

    .line 1735
    iget-object v2, v1, Ll/᩵ۛ֨;->ۙ:Ljava/util/LinkedHashSet;

    invoke-interface {v2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz p2, :cond_0

    .line 1719
    iget-object v1, v1, Ll/᩵ۛ֨;->ۙ:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method
