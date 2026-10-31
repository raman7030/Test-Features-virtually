.class public final synthetic Ll/ۗۙܳ;
.super Ljava/lang/Object;
.source "Y4UF"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۬ۙܳ;


# direct methods
.method public synthetic constructor <init>(Ll/۬ۙܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۙܳ;->᩸:Ll/۬ۙܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 2
    iget-object v1, p0, Ll/ۗۙܳ;->᩸:Ll/۬ۙܳ;

    .line 121
    iget-object v0, v1, Ll/۬ۙܳ;->֫:Ll/۫ۙܳ;

    invoke-static {v0}, Ll/۫ۙܳ;->ۧ(Ll/۫ۙܳ;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 122
    iget-object v0, v1, Ll/۬ۙܳ;->֫:Ll/۫ۙܳ;

    invoke-static {v0}, Ll/۫ۙܳ;->֫(Ll/۫ۙܳ;)Ljava/util/LinkedList;

    move-result-object v0

    monitor-enter v0

    .line 123
    :try_start_0
    iget-object v2, v1, Ll/۬ۙܳ;->֫:Ll/۫ۙܳ;

    invoke-static {v2}, Ll/۫ۙܳ;->֫(Ll/۫ۙܳ;)Ljava/util/LinkedList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 124
    invoke-virtual {v3}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    .line 126
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v4, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 127
    :cond_0
    new-instance v6, Landroid/graphics/drawable/TransitionDrawable;

    iget-object v7, v1, Ll/۬ۙܳ;->֫:Ll/۫ۙܳ;

    .line 129
    invoke-virtual {v7}, Ll/۫ۙܳ;->֫()Ll/ᩳۜܳ;

    move-result-object v7

    invoke-interface {v7}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    const/4 v8, 0x2

    new-array v8, v8, [Landroid/graphics/drawable/Drawable;

    aput-object v4, v8, v5

    const/4 v4, 0x1

    aput-object v7, v8, v4

    invoke-direct {v6, v8}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 131
    invoke-virtual {v6, v4}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    .line 132
    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 v3, 0x12c

    .line 133
    invoke-virtual {v6, v3}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    goto :goto_0

    .line 135
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    return-void
.end method
