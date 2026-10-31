.class public final Ll/֡ۜܿ;
.super Ll/ۢܺܿ;
.source "Y9BM"


# instance fields
.field public ܽ:Ljava/lang/String;

.field public ᩳ:Ll/ۢܺܿ;


# direct methods
.method public constructor <init>(Ll/ۢܺܿ;Ll/۬ۜܽ;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    const/16 p1, 0x4f06

    .line 23
    invoke-static {p2, p1}, Ll/᩹ۜܽ;->֫(Ll/۬ۜܽ;I)V

    .line 24
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    .line 25
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;
    .locals 1

    .line 60
    new-instance v0, Ll/֡ۜܿ;

    .line 18
    invoke-direct {v0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    .line 61
    iget-object p1, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    iput-object p1, v0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    .line 62
    iget-object p1, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    iput-object p1, v0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;I)V
    .locals 2

    const-string v0, "\t"

    .line 68
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, p2, 0x1

    .line 69
    invoke-static {v1, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "include: \""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "}\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 5

    .line 75
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۜܿ;

    .line 76
    iget-object v1, v1, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    iget-object v2, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "\""

    const-string v3, "include \""

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۜܿ;

    .line 79
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 81
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    new-instance p1, Ll/ۧۜܿ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "There is a circular hard dependency: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " > "

    invoke-static {v0, v2}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 82
    throw p1

    .line 86
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 87
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    iget-object v0, p0, Ll/֡ۜܿ;->ᩳ:Ll/ۢܺܿ;

    if-nez v0, :cond_3

    .line 71
    iget-object v0, p0, Ll/ۢܺܿ;->֫:Ll/ۢܺܿ;

    invoke-virtual {v0}, Ll/ۢܺܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    .line 89
    iget-object v1, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ܶۜܿ;->ۧ(Ljava/lang/String;)Ll/ۢܺܿ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۜܿ;->ᩳ:Ll/ۢܺܿ;

    .line 91
    :cond_3
    iget-object v0, p0, Ll/֡ۜܿ;->ᩳ:Ll/ۢܺܿ;

    invoke-virtual {v0, p1}, Ll/ۢܺܿ;->֫(Ljava/util/ArrayList;)V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    const/16 v0, 0x4f06

    .line 31
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 32
    invoke-virtual {p1}, Ll/ۤۜܽ;->ܳ()V

    .line 33
    iget-object v0, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Ll/ۤۜܽ;->֫()V

    return-void
.end method

.method public final ֫(Ll/᩷ܺܿ;)V
    .locals 2

    .line 39
    iget-object v0, p1, Ll/᩷ܺܿ;->֫:Ljava/util/HashSet;

    iget-object v1, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 71
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ۢܺܿ;->֫:Ll/ۢܺܿ;

    invoke-virtual {v0}, Ll/ۢܺܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    .line 43
    iget-object v1, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ܶۜܿ;->ۧ(Ljava/lang/String;)Ll/ۢܺܿ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۜܿ;->ᩳ:Ll/ۢܺܿ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    invoke-virtual {v0, p1}, Ll/ۢܺܿ;->֫(Ll/᩷ܺܿ;)V

    return-void

    :catch_0
    move-exception p1

    .line 45
    new-instance v0, Ll/ۘۜܿ;

    iget-object v1, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/ۘۜܿ;-><init>(Landroid/graphics/Point;Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/֡ۜܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
