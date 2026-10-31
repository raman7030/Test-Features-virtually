.class public final Ll/ۖۜܿ;
.super Ll/ۢܺܿ;
.source "4ATX"


# instance fields
.field public ܽ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ۢܺܿ;Ll/۬ۜܽ;)V
    .locals 3

    .line 23
    invoke-direct {p0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    const/16 p1, 0x4f03

    .line 24
    invoke-static {p2, p1}, Ll/᩹ۜܽ;->֫(Ll/۬ۜܽ;I)V

    .line 25
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    .line 26
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p1

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 29
    invoke-static {p0, p2}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;Ll/۬ۜܽ;)Ll/ۢܺܿ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۖۜܿ;->ܽ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;
    .locals 3

    .line 63
    new-instance v0, Ll/ۖۜܿ;

    .line 19
    invoke-direct {v0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    .line 64
    iget-object v1, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    iput-object v1, v0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    .line 65
    iget-object v1, p0, Ll/ۖۜܿ;->ܽ:Ljava/util/List;

    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/ܺۜܿ;

    invoke-direct {v2, p1}, Ll/ܺۜܿ;-><init>(Ll/ۢܺܿ;)V

    .line 66
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 67
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {p1, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, v0, Ll/ۖۜܿ;->ܽ:Ljava/util/List;

    return-object v0
.end method

.method public final ֫(Ljava/lang/StringBuilder;I)V
    .locals 4

    const-string v0, "\t"

    .line 73
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    iget-object v1, p0, Ll/ۖۜܿ;->ܽ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢܺܿ;

    add-int/lit8 v3, p2, 0x1

    .line 75
    invoke-virtual {v2, p1, v3}, Ll/ۢܺܿ;->֫(Ljava/lang/StringBuilder;I)V

    goto :goto_0

    .line 77
    :cond_0
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "}\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 2

    .line 82
    iget-object v0, p0, Ll/ۖۜܿ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢܺܿ;

    .line 83
    invoke-virtual {v1, p1}, Ll/ۢܺܿ;->֫(Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 2

    const/16 v0, 0x4f03

    .line 37
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 38
    invoke-virtual {p1}, Ll/ۤۜܽ;->ܳ()V

    .line 39
    iget-object v0, p0, Ll/ۖۜܿ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 40
    iget-object v0, p0, Ll/ۖۜܿ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢܺܿ;

    .line 41
    invoke-virtual {v1, p1}, Ll/ۢܺܿ;->֫(Ll/ۤۜܽ;)V

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p1}, Ll/ۤۜܽ;->֫()V

    return-void
.end method

.method public final ֫(Ll/᩷ܺܿ;)V
    .locals 2

    .line 48
    iget-object v0, p0, Ll/ۖۜܿ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢܺܿ;

    .line 49
    invoke-virtual {v1, p1}, Ll/ۢܺܿ;->֫(Ll/᩷ܺܿ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۖۜܿ;->ܽ:Ljava/util/List;

    return-object v0
.end method

.method public final ۧ(Ljava/util/ArrayList;)V
    .locals 0

    .line 54
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۖۜܿ;->ܽ:Ljava/util/List;

    return-void
.end method
