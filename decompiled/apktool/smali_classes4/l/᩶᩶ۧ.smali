.class public final Ll/᩶᩶ۧ;
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

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶᩶ۧ;->᩸:Ll/۟᩶ۧ;

    iput-object p2, p0, Ll/᩶᩶ۧ;->᩹:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 126
    iget-object v0, p0, Ll/᩶᩶ۧ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v4, p0, Ll/᩶᩶ۧ;->᩸:Ll/۟᩶ۧ;

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰ᩶ۧ;

    .line 127
    iget-object v5, v2, Ll/ܰ᩶ۧ;->ܽ:Ll/ۗ۬ۧ;

    iget v3, v2, Ll/ܰ᩶ۧ;->֫:I

    iget v6, v2, Ll/ܰ᩶ۧ;->ۧ:I

    iget v7, v2, Ll/ܰ᩶ۧ;->ᩳ:I

    iget v2, v2, Ll/ܰ᩶ۧ;->ܿ:I

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    iget-object v8, v5, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    sub-int/2addr v7, v3

    sub-int/2addr v2, v6

    const/4 v3, 0x0

    if-eqz v7, :cond_0

    .line 287
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    :cond_0
    if-eqz v2, :cond_1

    .line 290
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 295
    :cond_1
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    .line 296
    iget-object v3, v4, Ll/۟᩶ۧ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    invoke-virtual {v4}, Ll/᩺ۗۧ;->ܿ()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v10

    new-instance v11, Ll/ۤ᩶ۧ;

    move-object v3, v11

    move v6, v7

    move-object v7, v8

    move v8, v2

    invoke-direct/range {v3 .. v9}, Ll/ۤ᩶ۧ;-><init>(Ll/۟᩶ۧ;Ll/ۗ۬ۧ;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V

    invoke-virtual {v10, v11}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    .line 320
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_0

    .line 130
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 131
    iget-object v1, v4, Ll/۟᩶ۧ;->ۖ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
