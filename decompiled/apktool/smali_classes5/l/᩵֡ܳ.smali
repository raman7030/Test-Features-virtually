.class public final Ll/᩵֡ܳ;
.super Ll/֫ۜܳ;
.source "D1Q7"


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1205b9

    const v1, 0x7f0801e2

    .line 21
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 5

    .line 26
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_0

    const p1, 0x7f120415

    .line 27
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 30
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 34
    new-instance v3, Ll/ۤۢܳ;

    invoke-direct {v3, v2}, Ll/ۤۢܳ;-><init>(Ll/ᩳۜܳ;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    new-instance v3, Ll/ۖ֡ܳ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0, p1}, Ll/ۖ֡ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v0, v3}, Ll/ܽ᩷ܳ;->֫(Ll/ܽۢܳ;Ljava/util/List;Ljava/lang/Runnable;)V

    return-void

    .line 45
    :cond_2
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    .line 46
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v3

    new-instance v4, Ll/ۘ֡ܳ;

    invoke-direct {v4, v0, p1}, Ll/ۘ֡ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3, v4}, Ll/ܽ᩷ܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/۟ۜܳ;)V

    return-void
.end method
