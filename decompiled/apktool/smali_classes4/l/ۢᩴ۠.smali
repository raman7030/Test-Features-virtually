.class public final Ll/ۢᩴ۠;
.super Ll/᩸᩹۠;
.source "640U"


# instance fields
.field public final ֫:Ll/ۙ᩹۠;


# direct methods
.method public constructor <init>(Ll/᩸ۖ۠;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 980
    iput-object p1, p0, Ll/ۢᩴ۠;->֫:Ll/ۙ᩹۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۘ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 974
    check-cast p2, Ljava/util/Set;

    .line 999
    invoke-interface {p1}, Ll/ܰ᩸۠;->ܽ()Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Ll/᩹᩹۠;->֫(Ljava/util/List;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    invoke-interface {p1}, Ll/ܰ᩸۠;->getParameters()Ll/ۖܶ۠;

    move-result-object v0

    .line 131
    invoke-interface {p1}, Ll/ۜ᩹۠;->ܽ()Ll/ۖܶ۠;

    move-result-object p1

    .line 132
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 135
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 136
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object v0, v1

    .line 126
    :goto_0
    invoke-virtual {p0, v0, p2}, Ll/᩹᩹۠;->֫(Ljava/util/List;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1000
    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public final ֫(Ll/۠֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 974
    check-cast p2, Ljava/util/Set;

    return-object p2
.end method

.method public final ֫(Ll/ܳ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 974
    check-cast p2, Ljava/util/Set;

    .line 1257
    invoke-virtual {p1}, Ll/ۛ֡֨;->ᩳ֫()Ll/ۖܶ۠;

    move-result-object v0

    .line 992
    invoke-virtual {p0, v0, p2}, Ll/᩹᩹۠;->֫(Ljava/util/List;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1257
    invoke-virtual {p1}, Ll/ܳ֡֨;->ܺ()Ll/ۖܶ۠;

    move-result-object v0

    .line 131
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܽ()Ll/ۖܶ۠;

    move-result-object p1

    .line 132
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 135
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 136
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object v0, v1

    .line 112
    :goto_0
    invoke-virtual {p0, v0, p2}, Ll/᩹᩹۠;->֫(Ljava/util/List;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 993
    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public final ֫(Ll/ۨ᩸۠;Ljava/util/Set;)Ljava/util/Set;
    .locals 2

    .line 1005
    iget-object v0, p0, Ll/ۢᩴ۠;->֫:Ll/ۙ᩹۠;

    check-cast v0, Ll/᩸ۖ۠;

    invoke-virtual {v0, p1}, Ll/᩸ۖ۠;->֫(Ll/ۨ᩸۠;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩸۠;

    .line 1006
    invoke-interface {v1}, Ll/۫᩸۠;->ᩳ()Ll/᩵᩹۠;

    move-result-object v1

    invoke-interface {v1}, Ll/᩵᩹۠;->۠()Ll/᩶֡֨;

    move-result-object v1

    .line 1007
    check-cast v1, Ll/ۡ᩹۠;

    invoke-interface {p2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 153
    :cond_0
    invoke-interface {p1, p0, p2}, Ll/ۨ᩸۠;->֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1014
    check-cast p1, Ljava/util/Set;

    return-object p1
.end method
