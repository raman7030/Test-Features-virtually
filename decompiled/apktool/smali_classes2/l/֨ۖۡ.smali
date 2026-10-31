.class public final Ll/֨ۖۡ;
.super Ljava/lang/Object;
.source "5BM7"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    .line 33
    iput-object p1, p0, Ll/֨ۖۡ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/֨ۖۡ;->֫:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 95
    iget-object v0, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 37
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    .line 38
    invoke-virtual {p0}, Ll/֨ۖۡ;->ۧ()V

    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_empty"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, ""

    .line 40
    iput-object p1, p0, Ll/֨ۖۡ;->֫:Ljava/lang/String;

    return-void

    .line 41
    :cond_0
    iget-object p1, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 42
    iget-object p1, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Ll/֨ۖۡ;->֫:Ljava/lang/String;

    return-void

    .line 44
    :cond_1
    iput-object p2, p0, Ll/֨ۖۡ;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    .line 63
    iget-object v0, p0, Ll/֨ۖۡ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "_empty"

    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 67
    invoke-interface {v1, v0, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eq v2, p1, :cond_1

    .line 0
    invoke-static {v1, v0, p1}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    :cond_1
    if-eqz p1, :cond_2

    const/4 p1, 0x0

    .line 71
    iput-object p1, p0, Ll/֨ۖۡ;->֫:Ljava/lang/String;

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)I
    .locals 1

    .line 111
    iget-object v0, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ۧ()V
    .locals 3

    .line 50
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    iget-object v1, p0, Ll/֨ۖۡ;->ܽ:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v0, v1

    :goto_0
    iput-object v0, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 107
    iget-object v0, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 99
    iget-object v0, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Ll/֨ۖۡ;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 87
    iget-object v0, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 76
    iget-object v0, p0, Ll/֨ۖۡ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 78
    :cond_0
    iget-object v1, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 79
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    invoke-interface {v1, v0}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void

    .line 81
    :cond_1
    iget-object v1, p0, Ll/֨ۖۡ;->ۧ:Ljava/util/ArrayList;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    .line 82
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v2}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
