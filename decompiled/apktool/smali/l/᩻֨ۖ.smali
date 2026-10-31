.class public final Ll/᩻֨ۖ;
.super Ljava/lang/Object;
.source "P9QE"


# instance fields
.field public ֫:Ll/ۜ֨ۖ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 862
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 863
    new-instance v0, Ll/ۜ֨ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۜ֨ۖ;-><init>(I)V

    iput-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    return-void
.end method

.method public static ۧ()Ll/᩻֨ۖ;
    .locals 1

    .line 867
    new-instance v0, Ll/᩻֨ۖ;

    invoke-direct {v0}, Ll/᩻֨ۖ;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 860
    invoke-virtual {p0}, Ll/᩻֨ۖ;->clone()Ll/᩻֨ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/᩻֨ۖ;
    .locals 4

    .line 875
    new-instance v0, Ll/ۜ֨ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۜ֨ۖ;-><init>(I)V

    .line 876
    iget-object v1, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v1}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 877
    invoke-static {v0, v2}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    goto :goto_0

    .line 879
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v3}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 881
    :goto_0
    iget-object v1, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v1}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    .line 882
    invoke-static {v0, v2}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    goto :goto_1

    .line 884
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v3}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 886
    :goto_1
    iget-object v1, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v1}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_2

    .line 887
    invoke-static {v0, v2}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    goto :goto_2

    .line 889
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v3}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 891
    :goto_2
    iget-object v1, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v1}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_3

    .line 892
    invoke-static {v0, v2}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    goto :goto_3

    .line 894
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v3}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 896
    :goto_3
    iget-object v1, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_4

    .line 897
    invoke-static {v0, v2}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;Ljava/util/List;)V

    goto :goto_4

    .line 899
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v2}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 902
    :goto_4
    new-instance v1, Ll/᩻֨ۖ;

    invoke-direct {v1}, Ll/᩻֨ۖ;-><init>()V

    .line 903
    iput-object v0, v1, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    return-object v1
.end method

.method public final ֫()Ll/ۜ֨ۖ;
    .locals 3

    .line 911
    new-instance v0, Ll/ۜ֨ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۜ֨ۖ;-><init>(I)V

    .line 912
    iget-object v1, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v1}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    .line 913
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    goto :goto_0

    .line 915
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v2}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 917
    :goto_0
    iget-object v1, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v1}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    .line 918
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    goto :goto_1

    .line 920
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v2}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 922
    :goto_1
    iget-object v1, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v1}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_2

    .line 923
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    goto :goto_2

    .line 925
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v2}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 927
    :goto_2
    iget-object v1, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v1}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_3

    .line 928
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    goto :goto_3

    .line 930
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    .line 931
    invoke-static {v2}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 930
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 933
    :goto_3
    iget-object v1, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_4

    .line 934
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;Ljava/util/List;)V

    return-object v0

    .line 936
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v2}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;Ljava/util/List;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 2

    .line 997
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 998
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 1000
    :cond_0
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(J)V
    .locals 2

    .line 1006
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1007
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 1009
    :cond_0
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۛۜۖ;)V
    .locals 2

    .line 1015
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1016
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 1018
    :cond_0
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۜ֨ۖ;)V
    .locals 2

    .line 953
    invoke-static {p1}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 954
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 955
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 957
    :cond_0
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 959
    :cond_1
    invoke-static {p1}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 960
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    .line 961
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 963
    :cond_2
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Ll/ۜ֨ۖ;->ܽ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 965
    :cond_3
    invoke-static {p1}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 966
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_4

    .line 967
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 969
    :cond_4
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Ll/ۜ֨ۖ;->ᩳ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 971
    :cond_5
    invoke-static {p1}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 972
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_6

    .line 973
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 975
    :cond_6
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Ll/ۜ֨ۖ;->ܿ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 977
    :cond_7
    invoke-static {p1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 978
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_8

    .line 979
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 981
    :cond_8
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_9
    return-void
.end method

.method public final ֫(Ll/ۢ֨ۖ;)V
    .locals 2

    .line 1024
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1025
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 1027
    :cond_0
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(J)V
    .locals 2

    .line 988
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 989
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;Ljava/util/List;)V

    .line 991
    :cond_0
    iget-object v0, p0, Ll/᩻֨ۖ;->֫:Ll/ۜ֨ۖ;

    invoke-static {v0}, Ll/ۜ֨ۖ;->ۧ(Ll/ۜ֨ۖ;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
