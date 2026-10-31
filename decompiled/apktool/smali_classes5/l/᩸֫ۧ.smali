.class public abstract Ll/᩸֫ۧ;
.super Ll/ۢ֫ۧ;
.source "98O4"


# instance fields
.field public ۛ:Landroid/os/Handler;

.field public final ۤ:Ljava/util/HashMap;

.field public ۨ:Ll/֡ܶ֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Ll/ۢ֫ۧ;-><init>()V

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩸֫ۧ;->ۤ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public ֫(ILjava/lang/Object;)I
    .locals 0

    return p1
.end method

.method public ֫(JLjava/lang/Object;)J
    .locals 0

    return-wide p1
.end method

.method public abstract ֫(Ljava/lang/Object;Ll/ܺۧۧ;)Ll/ܺۧۧ;
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۘۧۧ;)V
    .locals 4

    .line 116
    iget-object v0, p0, Ll/᩸֫ۧ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 117
    new-instance v1, Ll/֨֫ۧ;

    invoke-direct {v1, p0, p1}, Ll/֨֫ۧ;-><init>(Ll/᩸֫ۧ;Ljava/lang/Object;)V

    .line 119
    new-instance v2, Ll/۠֫ۧ;

    invoke-direct {v2, p0, p1}, Ll/۠֫ۧ;-><init>(Ll/᩸֫ۧ;Ljava/lang/Object;)V

    .line 120
    new-instance v3, Ll/ܶ֫ۧ;

    invoke-direct {v3, p2, v1, v2}, Ll/ܶ֫ۧ;-><init>(Ll/ۘۧۧ;Ll/֨֫ۧ;Ll/۠֫ۧ;)V

    invoke-virtual {v0, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    iget-object p1, p0, Ll/᩸֫ۧ;->ۛ:Landroid/os/Handler;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    invoke-interface {p2, p1, v2}, Ll/ۘۧۧ;->֫(Landroid/os/Handler;Ll/ܶۧۧ;)V

    .line 122
    iget-object p1, p0, Ll/᩸֫ۧ;->ۛ:Landroid/os/Handler;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    invoke-interface {p2, p1, v2}, Ll/ۘۧۧ;->֫(Landroid/os/Handler;Ll/᩸ۛ֫;)V

    .line 123
    iget-object p1, p0, Ll/᩸֫ۧ;->ۨ:Ll/֡ܶ֫;

    invoke-virtual {p0}, Ll/ۢ֫ۧ;->᩻()Ll/ܰ۬֫;

    move-result-object v0

    invoke-interface {p2, v1, p1, v0}, Ll/ۘۧۧ;->֫(Ll/ۖۧۧ;Ll/֡ܶ֫;Ll/ܰ۬֫;)V

    .line 124
    invoke-virtual {p0}, Ll/ۢ֫ۧ;->ۜ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 125
    invoke-interface {p2, v1}, Ll/ۘۧۧ;->ܽ(Ll/ۖۧۧ;)V

    :cond_0
    return-void
.end method

.method public abstract ֫(Ljava/lang/Object;Ll/ۢ֫ۧ;Ll/ۙ᩵֫;)V
.end method

.method public ֫(Ll/֡ܶ֫;)V
    .locals 0

    .line 54
    iput-object p1, p0, Ll/᩸֫ۧ;->ۨ:Ll/֡ܶ֫;

    const/4 p1, 0x0

    .line 715
    invoke-static {p1}, Ll/ۘ֨֫;->֫(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    .line 55
    iput-object p1, p0, Ll/᩸֫ۧ;->ۛ:Landroid/os/Handler;

    return-void
.end method

.method public ۧ()V
    .locals 2

    .line 61
    iget-object v0, p0, Ll/᩸֫ۧ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ֫ۧ;

    .line 62
    iget-object v1, v1, Ll/ܶ֫ۧ;->ܽ:Ll/ۘۧۧ;

    invoke-interface {v1}, Ll/ۘۧۧ;->ۧ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܳ()V
    .locals 3

    .line 69
    iget-object v0, p0, Ll/᩸֫ۧ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ֫ۧ;

    .line 70
    iget-object v2, v1, Ll/ܶ֫ۧ;->ܽ:Ll/ۘۧۧ;

    iget-object v1, v1, Ll/ܶ֫ۧ;->֫:Ll/֨֫ۧ;

    invoke-interface {v2, v1}, Ll/ۘۧۧ;->֫(Ll/ۖۧۧ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 77
    iget-object v0, p0, Ll/᩸֫ۧ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ֫ۧ;

    .line 78
    iget-object v2, v1, Ll/ܶ֫ۧ;->ܽ:Ll/ۘۧۧ;

    iget-object v1, v1, Ll/ܶ֫ۧ;->֫:Ll/֨֫ۧ;

    invoke-interface {v2, v1}, Ll/ۘۧۧ;->ܽ(Ll/ۖۧۧ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ᩷()V
    .locals 5

    .line 85
    iget-object v0, p0, Ll/᩸֫ۧ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ֫ۧ;

    .line 86
    iget-object v3, v2, Ll/ܶ֫ۧ;->ܽ:Ll/ۘۧۧ;

    iget-object v4, v2, Ll/ܶ֫ۧ;->ۧ:Ll/۠֫ۧ;

    iget-object v2, v2, Ll/ܶ֫ۧ;->֫:Ll/֨֫ۧ;

    invoke-interface {v3, v2}, Ll/ۘۧۧ;->ۧ(Ll/ۖۧۧ;)V

    .line 87
    invoke-interface {v3, v4}, Ll/ۘۧۧ;->֫(Ll/ܶۧۧ;)V

    .line 88
    invoke-interface {v3, v4}, Ll/ۘۧۧ;->֫(Ll/᩸ۛ֫;)V

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method
