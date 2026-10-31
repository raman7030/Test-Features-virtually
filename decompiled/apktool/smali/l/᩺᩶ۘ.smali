.class public final Ll/᩺᩶ۘ;
.super Ljava/lang/Object;
.source "C8YQ"

# interfaces
.implements Ll/֡᩶ۘ;


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:Ljava/util/HashSet;

.field public final ܽ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/᩺᩶ۘ;->֫:Ljava/util/List;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩺᩶ۘ;->ܽ:Ljava/util/ArrayList;

    .line 23
    new-instance p1, Ljava/util/HashSet;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object p1, p0, Ll/᩺᩶ۘ;->ۧ:Ljava/util/HashSet;

    return-void
.end method

.method private ֫(Ll/ۚ᩶ۘ;)V
    .locals 3

    .line 52
    iget-object v0, p0, Ll/᩺᩶ۘ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 54
    iget-object v1, p0, Ll/᩺᩶ۘ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 59
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 61
    invoke-interface {p1, p0}, Ll/ۚ᩶ۘ;->֫(Ll/֡᩶ۘ;)V

    .line 64
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 70
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 72
    const-class v1, Ll/᩸ۙۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 73
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    .line 75
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Cyclic dependency chain found: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۚ᩶ۘ;
    .locals 6

    .line 87
    iget-object v0, p0, Ll/᩺᩶ۘ;->ܽ:Ljava/util/ArrayList;

    .line 108
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const-class v3, Ll/᩸ۙۘ;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ᩶ۘ;

    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_5

    .line 108
    iget-object v0, p0, Ll/᩺᩶ۘ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ᩶ۘ;

    .line 109
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v2, v4

    :cond_3
    if-eqz v2, :cond_4

    .line 98
    invoke-direct {p0, v2}, Ll/᩺᩶ۘ;->֫(Ll/ۚ᩶ۘ;)V

    return-object v2

    .line 94
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Requested plugin is not added: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", plugins: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    return-object v1
.end method

.method public final ۧ()Ljava/util/ArrayList;
    .locals 2

    .line 41
    iget-object v0, p0, Ll/᩺᩶ۘ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ᩶ۘ;

    .line 42
    invoke-direct {p0, v1}, Ll/᩺᩶ۘ;->֫(Ll/ۚ᩶ۘ;)V

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Ll/᩺᩶ۘ;->ܽ:Ljava/util/ArrayList;

    return-object v0
.end method
