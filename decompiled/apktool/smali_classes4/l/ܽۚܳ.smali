.class public final Ll/ܽۚܳ;
.super Ll/֫ۜܳ;
.source "W1YM"


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1205bc

    const v1, 0x7f0801e2

    .line 22
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 9

    .line 27
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_0

    const p1, 0x7f120415

    .line 28
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 31
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "resources.arsc"

    const/4 v4, 0x2

    if-ne v0, v4, :cond_3

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    const/4 v4, 0x4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 35
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۜܳ;

    .line 36
    new-instance v7, Ll/ۤۢܳ;

    invoke-direct {v7, v6}, Ll/ۤۢܳ;-><init>(Ll/ᩳۜܳ;)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    invoke-interface {v6}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 40
    new-instance v6, Ll/ۤۢܳ;

    invoke-direct {v6, v3, v5, v2, v1}, Ll/ۤۢܳ;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    new-instance v3, Ll/ۖۘ᩷;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v0, p1}, Ll/ۖۘ᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v0, v3}, Ll/ܽ᩷ܳ;->֫(Ll/ܽۢܳ;Ljava/util/List;Ljava/lang/Runnable;)V

    return-void

    .line 51
    :cond_3
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    .line 52
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v4

    .line 55
    invoke-virtual {v0}, Ll/ܽۢܳ;->۠()Ll/ᩳۜܳ;

    move-result-object v7

    .line 56
    new-instance v8, Ll/ۤۢܳ;

    invoke-direct {v8, v4}, Ll/ۤۢܳ;-><init>(Ll/ᩳۜܳ;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    new-instance v8, Ll/ۤۢܳ;

    invoke-interface {v4}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v8, v3, v4, v2, v1}, Ll/ۤۢܳ;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    new-instance v4, Ll/ۤۢܳ;

    invoke-direct {v4, v7}, Ll/ۤۢܳ;-><init>(Ll/ᩳۜܳ;)V

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    new-instance v4, Ll/ۤۢܳ;

    invoke-interface {v7}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v3, v7, v2, v1}, Ll/ۤۢܳ;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    new-instance v3, Ll/֫ۚܳ;

    invoke-direct {v3, v0, p1, v5, v6}, Ll/֫ۚܳ;-><init>(Ll/ܽۢܳ;Ll/ۖۢܳ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v2, v5, v3}, Ll/ܽ᩷ܳ;->֫(Ll/ܽۢܳ;Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method
