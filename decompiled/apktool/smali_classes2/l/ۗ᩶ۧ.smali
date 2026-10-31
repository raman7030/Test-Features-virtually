.class public final Ll/ۗ᩶ۧ;
.super Ljava/lang/Object;
.source "E5OI"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟᩶ۧ;

.field public final synthetic ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/۟᩶ۧ;Ljava/util/ArrayList;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ᩶ۧ;->᩸:Ll/۟᩶ۧ;

    iput-object p2, p0, Ll/ۗ᩶ۧ;->᩹:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 173
    iget-object v0, p0, Ll/ۗ᩶ۧ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v3, p0, Ll/ۗ᩶ۧ;->᩸:Ll/۟᩶ۧ;

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ۬ۧ;

    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    iget-object v4, v2, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 234
    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    .line 235
    iget-object v6, v3, Ll/۟᩶ۧ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v6, 0x3f800000    # 1.0f

    .line 236
    invoke-virtual {v5, v6}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    invoke-virtual {v3}, Ll/᩺ۗۧ;->ܽ()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    new-instance v7, Ll/۫᩶ۧ;

    invoke-direct {v7, v4, v5, v3, v2}, Ll/۫᩶ۧ;-><init>(Landroid/view/View;Landroid/view/ViewPropertyAnimator;Ll/۟᩶ۧ;Ll/ۗ۬ۧ;)V

    .line 237
    invoke-virtual {v6, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    .line 255
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_0

    .line 176
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 177
    iget-object v1, v3, Ll/۟᩶ۧ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
