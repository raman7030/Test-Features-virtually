.class public final Ll/֡ᩴᩳ;
.super Ljava/lang/Object;
.source "D6RX"


# instance fields
.field public final ֫:Ljava/util/HashSet;

.field public final ۧ:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ll/֡ᩴᩳ;->ۧ:Landroid/os/Bundle;

    .line 11
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/֡ᩴᩳ;->֫:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/os/Bundle;)V
    .locals 2

    .line 22
    iget-object v0, p0, Ll/֡ᩴᩳ;->֫:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Ll/֡ᩴᩳ;->ۧ:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-void
.end method

.method public final varargs ֫(Landroid/os/Bundle;[Ljava/lang/String;)V
    .locals 4

    .line 14
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 15
    new-instance p1, Ljava/util/HashSet;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 16
    new-instance v1, Ljava/util/HashSet;

    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_0

    .line 17
    :cond_1
    array-length p1, p2

    const/4 v1, 0x0

    :goto_1
    iget-object v2, p0, Ll/֡ᩴᩳ;->ۧ:Landroid/os/Bundle;

    if-ge v1, p1, :cond_2

    aget-object v3, p2, v1

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v2, p0, Ll/֡ᩴᩳ;->֫:Ljava/util/HashSet;

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 18
    :cond_2
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ֫(Ll/֡ᩴᩳ;)V
    .locals 4

    .line 27
    iget-object v0, p1, Ll/֡ᩴᩳ;->֫:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/֡ᩴᩳ;->ۧ:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Ll/֡ᩴᩳ;->֫:Ljava/util/HashSet;

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_0

    .line 28
    :cond_0
    iget-object p1, p1, Ll/֡ᩴᩳ;->ۧ:Landroid/os/Bundle;

    invoke-virtual {v2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-void
.end method
