.class public final Ll/۠۟ܳ;
.super Ll/֫ۜܳ;
.source "895N"


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f120a88

    const v1, 0x7f0801e8

    .line 31
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 10

    .line 36
    new-instance v0, Ll/᩻ܿ᩻;

    const v1, 0x7f120a8e

    const/4 v2, -0x1

    .line 93
    invoke-direct {v0, v1, v2}, Ll/֫ۜܳ;-><init>(II)V

    .line 36
    new-instance v1, Ll/֡ᩳ᩻;

    const v3, 0x7f120a8d

    .line 41
    invoke-direct {v1, v3, v2}, Ll/֫ۜܳ;-><init>(II)V

    .line 36
    new-instance v3, Ll/᩷ᩳ᩻;

    const v4, 0x7f120a8c

    .line 44
    invoke-direct {v3, v4, v2}, Ll/֫ۜܳ;-><init>(II)V

    .line 36
    new-instance v4, Ll/ܽᩳ᩻;

    invoke-direct {v4}, Ll/ܽᩳ᩻;-><init>()V

    new-instance v5, Ll/᩷ܿ᩻;

    const v6, 0x7f120a0a

    .line 22
    invoke-direct {v5, v6, v2}, Ll/֫ۜܳ;-><init>(II)V

    .line 36
    new-instance v6, Ll/ۤܽ᩻;

    const v7, 0x7f120a89

    .line 43
    invoke-direct {v6, v7, v2}, Ll/֫ۜܳ;-><init>(II)V

    .line 36
    new-instance v7, Ll/ۛܽ᩻;

    const v8, 0x7f120a8a

    .line 18
    invoke-direct {v7, v8, v2}, Ll/֫ۜܳ;-><init>(II)V

    .line 36
    new-instance v8, Ll/ܺᩳ᩻;

    const v9, 0x7f120355

    .line 28
    invoke-direct {v8, v9, v2}, Ll/֫ۜܳ;-><init>(II)V

    const/16 v2, 0x8

    new-array v2, v2, [Ll/֫ۜܳ;

    const/4 v9, 0x0

    aput-object v0, v2, v9

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v3, v2, v0

    const/4 v0, 0x3

    aput-object v4, v2, v0

    const/4 v0, 0x4

    aput-object v5, v2, v0

    const/4 v0, 0x5

    aput-object v6, v2, v0

    const/4 v0, 0x6

    aput-object v7, v2, v0

    const/4 v0, 0x7

    aput-object v8, v2, v0

    .line 36
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 46
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫ۜܳ;

    .line 49
    invoke-virtual {v4}, Ll/֫ۜܳ;->ᩳ()I

    move-result v5

    invoke-static {v5}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    invoke-virtual {v4, p1}, Ll/֫ۜܳ;->ᩳ(Ll/ۖۢܳ;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    .line 53
    invoke-virtual {p0}, Ll/֫ۜܳ;->ᩳ()I

    move-result v4

    invoke-virtual {v3, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v4, Ll/֨۟ܳ;

    .line 54
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v5

    invoke-direct {v4, v5, v1, v2}, Ll/֨۟ܳ;-><init>(Lbin/mt/plus/Main;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    new-instance v1, Ll/ۚ۟ܳ;

    invoke-direct {v1, v9, v0, p1}, Ll/ۚ۟ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4, v1}, Ll/᩵ۚۢ;->֫(Landroid/widget/ListAdapter;Ll/ۚ۟ܳ;)V

    .line 57
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
