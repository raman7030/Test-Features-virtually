.class public final Ll/ܳ֡֡;
.super Ll/ۡ֨֡;
.source "M8XG"


# instance fields
.field public final ֫:Ll/᩸ۚ֡;

.field public final ۧ:Ll/۟᩵֡;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ll/᩸ۚ֡;

    invoke-direct {v0}, Ll/᩸ۚ֡;-><init>()V

    iput-object v0, p0, Ll/ܳ֡֡;->֫:Ll/᩸ۚ֡;

    .line 15
    new-instance v0, Ll/۟᩵֡;

    invoke-direct {v0}, Ll/۟᩵֡;-><init>()V

    iput-object v0, p0, Ll/ܳ֡֡;->ۧ:Ll/۟᩵֡;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/util/List;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ܳ֡֡;->ۧ:Ll/۟᩵֡;

    invoke-virtual {v0, p1}, Ll/۟᩵֡;->֫(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;
    .locals 1

    .line 30
    invoke-interface {p1}, Ll/᩵֨֡;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 31
    invoke-interface {p1}, Ll/᩵֨֡;->getIndex()I

    move-result p1

    invoke-static {p1}, Ll/ܳ᩵֡;->֫(I)Ll/ܳ᩵֡;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ll/ᩳ֨֡;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ܳ֡֡;->ۧ:Ll/۟᩵֡;

    invoke-virtual {v0}, Ll/۟᩵֡;->ۧ()Ll/ᩳ֨֡;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۨۚ֡;)V
    .locals 2

    .line 73
    iget-object v0, p0, Ll/ܳ֡֡;->ۧ:Ll/۟᩵֡;

    invoke-virtual {v0}, Ll/۟᩵֡;->ۧ()Ll/ᩳ֨֡;

    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ll/ᩳ֨֡;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 75
    iget-object v1, p0, Ll/ܳ֡֡;->֫:Ll/᩸ۚ֡;

    invoke-interface {p1, v0, v1}, Ll/ۨۚ֡;->֫(Ll/ᩳ֨֡;Ll/֡ۚ֡;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܽ֨֡;)V
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ܳ֡֡;->ۧ:Ll/۟᩵֡;

    invoke-virtual {v0, p1}, Ll/۟᩵֡;->֫(Ll/ܽ֨֡;)V

    return-void
.end method

.method public final ֫(Ll/᩶ۚ֡;)V
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ܳ֡֡;->ۧ:Ll/۟᩵֡;

    invoke-virtual {v0, p1}, Ll/۟᩵֡;->֫(Ll/᩶ۚ֡;)V

    return-void
.end method

.method public final ۜ()V
    .locals 4

    .line 60
    iget-object v0, p0, Ll/ܳ֡֡;->ۧ:Ll/۟᩵֡;

    invoke-virtual {v0}, Ll/۟᩵֡;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v3, p0, Ll/ܳ֡֡;->֫:Ll/᩸ۚ֡;

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘۚ֡;

    .line 61
    invoke-virtual {v3, v2}, Ll/֡ۚ֡;->֫(Ll/ۘۚ֡;)V

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v0}, Ll/۟᩵֡;->ۧ()Ll/ᩳ֨֡;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩳ֨֡;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 65
    invoke-virtual {v3}, Ll/֡ۚ֡;->ۜ()V

    return-void

    .line 67
    :cond_1
    invoke-virtual {v0}, Ll/۟᩵֡;->ܽ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/֡ۚ֡;->֫(Ljava/util/List;)V

    return-void
.end method

.method public final ܿ()Ll/ۨ֡֡;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ܳ֡֡;->֫:Ll/᩸ۚ֡;

    return-object v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 4

    .line 51
    new-instance v0, Ll/ܽۚ֡;

    invoke-direct {v0}, Ll/ܽۚ֡;-><init>()V

    .line 52
    iget-object v1, p0, Ll/ܳ֡֡;->ۧ:Ll/۟᩵֡;

    invoke-virtual {v1}, Ll/۟᩵֡;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘۚ֡;

    .line 53
    invoke-virtual {v2}, Ll/ۘۚ֡;->ۢ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ll/ܽۚ֡;->֫(Ljava/lang/String;Ll/ۘۚ֡;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v1, v2, v3

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
