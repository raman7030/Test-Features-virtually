.class public final Ll/ܳۨۧ;
.super Ljava/lang/Object;
.source "K5ZM"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public ᩸:Landroid/view/ViewGroup;

.field public ᩹:Ll/ܽۨۧ;


# virtual methods
.method public final onPreDraw()Z
    .locals 7

    .line 267
    iget-object v0, p0, Ll/ܳۨۧ;->᩹:Ll/ܽۨۧ;

    .line 243
    iget-object v1, p0, Ll/ܳۨۧ;->᩸:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 244
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 270
    sget-object v2, Ll/᩻ۨۧ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    return v3

    .line 276
    :cond_0
    invoke-static {}, Ll/᩻ۨۧ;->֫()Ll/ۖ᩵;

    move-result-object v2

    const/4 v4, 0x0

    .line 369
    invoke-virtual {v2, v1, v4}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 277
    check-cast v5, Ljava/util/ArrayList;

    if-nez v5, :cond_1

    .line 280
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 281
    invoke-virtual {v2, v1, v5}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 282
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_2

    .line 283
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 285
    :cond_2
    :goto_0
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    new-instance v5, Ll/ܿۨۧ;

    invoke-direct {v5, p0, v2}, Ll/ܿۨۧ;-><init>(Ll/ܳۨۧ;Ll/ۖ᩵;)V

    invoke-virtual {v0, v5}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    const/4 v2, 0x0

    .line 294
    invoke-virtual {v0, v1, v2}, Ll/ܽۨۧ;->captureValues(Landroid/view/ViewGroup;Z)V

    if-eqz v4, :cond_3

    .line 296
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽۨۧ;

    .line 297
    invoke-virtual {v4, v1}, Ll/ܽۨۧ;->resume(Landroid/view/View;)V

    goto :goto_1

    .line 300
    :cond_3
    invoke-virtual {v0, v1}, Ll/ܽۨۧ;->playTransition(Landroid/view/ViewGroup;)V

    return v3
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 243
    iget-object p1, p0, Ll/ܳۨۧ;->᩸:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 244
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 255
    sget-object v0, Ll/᩻ۨۧ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 256
    invoke-static {}, Ll/᩻ۨۧ;->֫()Ll/ۖ᩵;

    move-result-object v0

    const/4 v1, 0x0

    .line 369
    invoke-virtual {v0, p1, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 256
    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 257
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 258
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    .line 259
    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->resume(Landroid/view/View;)V

    goto :goto_0

    .line 262
    :cond_0
    iget-object p1, p0, Ll/ܳۨۧ;->᩹:Ll/ܽۨۧ;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ll/ܽۨۧ;->clearValues(Z)V

    return-void
.end method
