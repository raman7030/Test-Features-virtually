.class public final Ll/۫ۧ᩻;
.super Ll/ۤۜܳ;
.source "22BV"


# instance fields
.field public final synthetic ᩳ:Ll/ܽܽ᩻;


# direct methods
.method public constructor <init>(Ll/ܽܽ᩻;)V
    .locals 1

    .line 850
    iput-object p1, p0, Ll/۫ۧ᩻;->ᩳ:Ll/ܽܽ᩻;

    const p1, 0x7f120184

    const v0, 0x7f0801dd

    invoke-direct {p0, p1, v0}, Ll/ۤۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 5

    .line 853
    new-instance v0, Ll/ܽۙܳ;

    const-string v1, "local"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܽۙܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܽܽ᩻;->ۧ(Ll/ܽۙܳ;)V

    .line 854
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۧ()V

    .line 855
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۡ()Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 856
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۡ()Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ۧ()V

    goto :goto_0

    .line 858
    :cond_0
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 860
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 861
    iget-object v1, p0, Ll/۫ۧ᩻;->ᩳ:Ll/ܽܽ᩻;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 862
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۡ()Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    .line 863
    instance-of v2, v1, Ll/ܽܽ᩻;

    if-eqz v2, :cond_1

    .line 864
    check-cast v1, Ll/ܽܽ᩻;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 866
    :cond_1
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۗ()Ll/ۢۘܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢۘܳ;->᩻()Ll/ۨ᩸ۡ;

    move-result-object v1

    .line 867
    invoke-virtual {v1}, Ll/ۨ᩸ۡ;->ᩳ()V

    .line 869
    :try_start_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽ᩷ܳ;

    .line 870
    instance-of v4, v3, Ll/ܽܽ᩻;

    if-eqz v4, :cond_2

    .line 871
    check-cast v3, Ll/ܽܽ᩻;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 875
    :cond_3
    invoke-virtual {v1}, Ll/ۨ᩸ۡ;->ܿ()V

    .line 877
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽܽ᩻;

    .line 878
    iget-object v1, v1, Ll/ܽ᩷ܳ;->ۜ:Ll/ۧ᩷ܳ;

    invoke-virtual {v1}, Ll/ۧ᩷ܳ;->ܽ()V

    goto :goto_2

    .line 880
    :cond_4
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۗ()Ll/ۢۘܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢۘܳ;->᩸()V

    return-void

    :catchall_0
    move-exception p1

    .line 875
    invoke-virtual {v1}, Ll/ۨ᩸ۡ;->ܿ()V

    .line 876
    throw p1
.end method

.method public final ܳ()Z
    .locals 1

    .line 885
    iget-object v0, p0, Ll/۫ۧ᩻;->ᩳ:Ll/ܽܽ᩻;

    invoke-virtual {v0}, Ll/ܽܽ᩻;->۬()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ll/ܽܽ᩻;->ܿ֫()Ll/ܽۙܳ;

    move-result-object v0

    iget-object v0, v0, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
