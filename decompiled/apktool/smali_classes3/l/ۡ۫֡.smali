.class public final Ll/ۡ۫֡;
.super Ljava/lang/Object;
.source "J4ZK"


# instance fields
.field public ֫:Ll/ܺ۫֡;

.field public final ۧ:Ll/֨۫֡;

.field public final ܽ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۡ۫֡;->ܽ:Ljava/util/HashMap;

    .line 53
    new-instance v0, Ll/֨۫֡;

    invoke-direct {v0, p1}, Ll/֨۫֡;-><init>(I)V

    iput-object v0, p0, Ll/ۡ۫֡;->ۧ:Ll/֨۫֡;

    .line 54
    iget-object p1, v0, Ll/֨۫֡;->ۧ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺ۫֡;

    iput-object p1, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 143
    iget-object v0, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    .line 131
    invoke-virtual {v0}, Ll/ܺ۫֡;->ۧ()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/᩸۫֡;

    .line 39
    invoke-direct {v1}, Ll/ۛ۬֡;-><init>()V

    .line 131
    check-cast v0, Ll/ۜ۫֡;

    invoke-virtual {v0, v1}, Ll/ۜ۫֡;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 131
    iget-object v0, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    .line 119
    invoke-virtual {v0}, Ll/ܺ۫֡;->ۧ()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/ܶ۫֡;

    invoke-direct {v1, p1}, Ll/ܶ۫֡;-><init>(I)V

    check-cast v0, Ll/ۜ۫֡;

    invoke-virtual {v0, v1}, Ll/ۜ۫֡;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(ILl/۟ۢۚ;Ll/᩻ۡۚ;Ll/۟ۢۚ;)V
    .locals 2

    .line 127
    iget-object v0, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    .line 115
    invoke-virtual {v0}, Ll/ܺ۫֡;->ۧ()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/۬۫֡;

    invoke-direct {v1, p1, p2, p3, p4}, Ll/۬۫֡;-><init>(ILl/ܶܽۚ;Ll/᩸ܽۚ;Ll/ܶܽۚ;)V

    check-cast v0, Ll/ۜ۫֡;

    invoke-virtual {v0, v1}, Ll/ۜ۫֡;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 71
    iget-object v0, p0, Ll/ۡ۫֡;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ۫֡;

    if-eqz v1, :cond_1

    .line 74
    invoke-virtual {v1}, Ll/ᩳ۫֡;->ܿ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 77
    iget-object p1, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    invoke-virtual {p1}, Ll/ܺ۫֡;->ܿ()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ll/ۜ۫֡;

    invoke-virtual {p1, v1}, Ll/ۜ۫֡;->add(Ljava/lang/Object;)Z

    return-void

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "There is already a label with that name."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 80
    :cond_1
    iget-object v1, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    new-instance v2, Ll/ܿ۫֡;

    invoke-direct {v2}, Ll/ܿ۫֡;-><init>()V

    .line 100
    invoke-virtual {v1}, Ll/ܺ۫֡;->ܿ()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ll/ۜ۫֡;

    invoke-virtual {v1, v2}, Ll/ۜ۫֡;->add(Ljava/lang/Object;)Z

    .line 81
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/۟ۢۚ;)V
    .locals 2

    .line 147
    iget-object v0, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    .line 135
    invoke-virtual {v0}, Ll/ܺ۫֡;->ۧ()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/ۗ۫֡;

    invoke-direct {v1, p1}, Ll/ۗ۫֡;-><init>(Ll/ܶܽۚ;)V

    check-cast v0, Ll/ۜ۫֡;

    invoke-virtual {v0, v1}, Ll/ۜ۫֡;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/۟۬֡;)V
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ۡ۫֡;->ۧ:Ll/֨۫֡;

    invoke-virtual {v0, p1}, Ll/֨۫֡;->֫(Ll/۟۬֡;)V

    .line 152
    iget-object p1, v0, Ll/֨۫֡;->ۧ:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 0
    invoke-static {p1, v0}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p1

    .line 152
    check-cast p1, Ll/ܺ۫֡;

    iput-object p1, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    return-void
.end method

.method public final ֫(Ll/ܿ۫֡;Ll/ܿ۫֡;Ll/ܿ۫֡;)V
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ۡ۫֡;->ۧ:Ll/֨۫֡;

    invoke-virtual {v0, p1, p2, p3}, Ll/֨۫֡;->֫(Ll/ܿ۫֡;Ll/ܿ۫֡;Ll/ܿ۫֡;)V

    return-void
.end method

.method public final ֫(Ll/᩻ۡۚ;Ll/ܿ۫֡;Ll/ܿ۫֡;Ll/ܿ۫֡;)V
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ۡ۫֡;->ۧ:Ll/֨۫֡;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/֨۫֡;->֫(Ll/᩻ۡۚ;Ll/ܿ۫֡;Ll/ܿ۫֡;Ll/ܿ۫֡;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ܿ۫֡;
    .locals 2

    .line 99
    iget-object v0, p0, Ll/ۡ۫֡;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ۫֡;

    if-nez v1, :cond_0

    .line 101
    new-instance v1, Ll/ܿ۫֡;

    invoke-direct {v1}, Ll/ܿ۫֡;-><init>()V

    .line 102
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public final ۧ()V
    .locals 2

    .line 139
    iget-object v0, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    .line 127
    invoke-virtual {v0}, Ll/ܺ۫֡;->ۧ()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/᩶۫֡;

    .line 39
    invoke-direct {v1}, Ll/ۛ۬֡;-><init>()V

    .line 127
    check-cast v0, Ll/ۜ۫֡;

    invoke-virtual {v0, v1}, Ll/ۜ۫֡;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(I)V
    .locals 2

    .line 122
    iget-object v0, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    .line 110
    invoke-virtual {v0}, Ll/ܺ۫֡;->ۧ()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/᩹۫֡;

    invoke-direct {v1, p1}, Ll/᩹۫֡;-><init>(I)V

    check-cast v0, Ll/ۜ۫֡;

    invoke-virtual {v0, v1}, Ll/ۜ۫֡;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ()Ll/֨۫֡;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۡ۫֡;->ۧ:Ll/֨۫֡;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 2

    .line 135
    iget-object v0, p0, Ll/ۡ۫֡;->֫:Ll/ܺ۫֡;

    .line 123
    invoke-virtual {v0}, Ll/ܺ۫֡;->ۧ()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/ۙ۫֡;

    invoke-direct {v1, p1}, Ll/ۙ۫֡;-><init>(I)V

    check-cast v0, Ll/ۜ۫֡;

    invoke-virtual {v0, v1}, Ll/ۜ۫֡;->add(Ljava/lang/Object;)Z

    return-void
.end method
