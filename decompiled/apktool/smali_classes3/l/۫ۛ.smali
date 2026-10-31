.class public final Ll/۫ۛ;
.super Ljava/lang/Object;
.source "0B2V"


# instance fields
.field public final ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ۧ:Ljava/lang/Runnable;

.field public final ܽ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Ll/۫ۛ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 57
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫ۛ;->ܽ:Ljava/util/HashMap;

    .line 67
    iput-object p1, p0, Ll/۫ۛ;->ۧ:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic ֫(Ll/۫ۛ;Ll/ܰۢ֫;Ll/ۨۛ;Ll/᩺ۢ֫;)V
    .locals 1

    .line 181
    invoke-static {p1}, Ll/᩺ۢ֫;->ᩳ(Ll/ܰۢ֫;)Ll/᩺ۢ֫;

    move-result-object v0

    if-ne p3, v0, :cond_0

    .line 182
    invoke-virtual {p0, p2}, Ll/۫ۛ;->֫(Ll/ۨۛ;)V

    return-void

    .line 183
    :cond_0
    sget-object v0, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-ne p3, v0, :cond_1

    .line 184
    invoke-virtual {p0, p2}, Ll/۫ۛ;->ۧ(Ll/ۨۛ;)V

    return-void

    .line 185
    :cond_1
    invoke-static {p1}, Ll/᩺ۢ֫;->֫(Ll/ܰۢ֫;)Ll/᩺ۢ֫;

    move-result-object p1

    if-ne p3, p1, :cond_2

    .line 186
    iget-object p1, p0, Ll/۫ۛ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 187
    iget-object p0, p0, Ll/۫ۛ;->ۧ:Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/Menu;)V
    .locals 2

    .line 121
    iget-object v0, p0, Ll/۫ۛ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۛ;

    .line 122
    invoke-interface {v1, p1}, Ll/ۨۛ;->֫(Landroid/view/Menu;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    .line 92
    iget-object v0, p0, Ll/۫ۛ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۛ;

    .line 93
    invoke-interface {v1, p1, p2}, Ll/ۨۛ;->֫(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۨۛ;)V
    .locals 1

    .line 132
    iget-object v0, p0, Ll/۫ۛ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    iget-object p1, p0, Ll/۫ۛ;->ۧ:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final ֫(Ll/ۨۛ;Ll/᩻ۡ֫;)V
    .locals 3

    .line 146
    invoke-virtual {p0, p1}, Ll/۫ۛ;->֫(Ll/ۨۛ;)V

    .line 147
    invoke-interface {p2}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p2

    .line 148
    iget-object v0, p0, Ll/۫ۛ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۛ;

    if-eqz v1, :cond_0

    .line 150
    invoke-virtual {v1}, Ll/۬ۛ;->֫()V

    .line 152
    :cond_0
    new-instance v1, Ll/ۗۛ;

    invoke-direct {v1, p0, p1}, Ll/ۗۛ;-><init>(Ll/۫ۛ;Ll/ۨۛ;)V

    .line 157
    new-instance v2, Ll/۬ۛ;

    invoke-direct {v2, p2, v1}, Ll/۬ۛ;-><init>(Ll/۟ۢ֫;Ll/ܿۡ֫;)V

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ۨۛ;Ll/᩻ۡ֫;Ll/ܰۢ֫;)V
    .locals 2

    .line 175
    invoke-interface {p2}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p2

    .line 176
    iget-object v0, p0, Ll/۫ۛ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۛ;

    if-eqz v1, :cond_0

    .line 178
    invoke-virtual {v1}, Ll/۬ۛ;->֫()V

    .line 180
    :cond_0
    new-instance v1, Ll/ۙۛ;

    invoke-direct {v1, p0, p3, p1}, Ll/ۙۛ;-><init>(Ll/۫ۛ;Ll/ܰۢ֫;Ll/ۨۛ;)V

    .line 190
    new-instance p3, Ll/۬ۛ;

    invoke-direct {p3, p2, v1}, Ll/۬ۛ;-><init>(Ll/۟ۢ֫;Ll/ܿۡ֫;)V

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Landroid/view/MenuItem;)Z
    .locals 2

    .line 106
    iget-object v0, p0, Ll/۫ۛ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۛ;

    .line 107
    invoke-interface {v1, p1}, Ll/ۨۛ;->֫(Landroid/view/MenuItem;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Landroid/view/Menu;)V
    .locals 2

    .line 79
    iget-object v0, p0, Ll/۫ۛ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۛ;

    .line 80
    invoke-interface {v1, p1}, Ll/ۨۛ;->ۧ(Landroid/view/Menu;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۨۛ;)V
    .locals 1

    .line 199
    iget-object v0, p0, Ll/۫ۛ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 200
    iget-object v0, p0, Ll/۫ۛ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ۛ;

    if-eqz p1, :cond_0

    .line 202
    invoke-virtual {p1}, Ll/۬ۛ;->֫()V

    .line 204
    :cond_0
    iget-object p1, p0, Ll/۫ۛ;->ۧ:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
