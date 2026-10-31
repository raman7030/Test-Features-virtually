.class public final Ll/ۜۡᩳ;
.super Ll/ᩳۡᩳ;
.source "LAW9"


# instance fields
.field public ۘ:Ll/ۚܽۚ;


# direct methods
.method public constructor <init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ll/ۚܽۚ;)V
    .locals 3

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    invoke-interface {p3}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 18
    invoke-direct {p0, p1, p2, v0, v1}, Ll/ᩳۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ljava/lang/String;Z)V

    .line 19
    iput-object p3, p0, Ll/ۜۡᩳ;->ۘ:Ll/ۚܽۚ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CustomMethodDecryptor["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۜۡᩳ;->ۘ:Ll/ۚܽۚ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "Ljava/lang/CharSequence;"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "Ljava/lang/Object;"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    const-string p1, "Ljava/lang/String;"

    return-object p1
.end method

.method public final ֫(Ll/ܿۡᩳ;)Ljava/util/List;
    .locals 5

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 228
    iget-object p1, p1, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {p1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object p1

    .line 33
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩷ۚ;

    .line 34
    invoke-virtual {v1}, Ll/֡᩷ۚ;->ۧܽ()Ll/᩻۫ܺ;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ۢۚ;

    .line 104
    sget-object v3, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {v2}, Ll/֨ۢۚ;->ܽ()I

    move-result v4

    invoke-virtual {v3, v4}, Ll/ܺۗ֡;->֫(I)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 39
    :cond_2
    iget-object v3, p0, Ll/ۜۡᩳ;->ۘ:Ll/ۚܽۚ;

    invoke-virtual {v2, v3}, Ll/ᩴ۬֡;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 40
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 44
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    return-object v0
.end method
