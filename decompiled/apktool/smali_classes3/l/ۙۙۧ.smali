.class public final Ll/ۙۙۧ;
.super Ll/᩺ۙۧ;
.source "B66A"


# instance fields
.field public final synthetic ۘ:Ll/֫ۗۧ;

.field public final synthetic ᩴ:Ll/ۗ۬ۧ;

.field public final synthetic ᩵:I


# direct methods
.method public constructor <init>(Ll/֫ۗۧ;Ll/ۗ۬ۧ;IFFFFILl/ۗ۬ۧ;)V
    .locals 8

    move-object v7, p0

    move-object v0, p1

    .line 644
    iput-object v0, v7, Ll/ۙۙۧ;->ۘ:Ll/֫ۗۧ;

    move/from16 v0, p8

    iput v0, v7, Ll/ۙۙۧ;->᩵:I

    move-object/from16 v0, p9

    iput-object v0, v7, Ll/ۙۙۧ;->ᩴ:Ll/ۗ۬ۧ;

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    move v6, p7

    invoke-direct/range {v0 .. v6}, Ll/᩺ۙۧ;-><init>(Ll/ۗ۬ۧ;IFFFF)V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 647
    invoke-super {p0, p1}, Ll/᩺ۙۧ;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 648
    iget-boolean p1, p0, Ll/᩺ۙۧ;->ܿ:Z

    if-eqz p1, :cond_0

    goto :goto_1

    .line 651
    :cond_0
    iget p1, p0, Ll/ۙۙۧ;->᩵:I

    iget-object v0, p0, Ll/ۙۙۧ;->ᩴ:Ll/ۗ۬ۧ;

    iget-object v1, p0, Ll/ۙۙۧ;->ۘ:Ll/֫ۗۧ;

    if-gtz p1, :cond_1

    .line 653
    iget-object p1, v1, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    iget-object v2, v1, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {p1, v2, v0}, Ll/ۤۙۧ;->֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;)V

    goto :goto_0

    .line 657
    :cond_1
    iget-object v2, v1, Ll/֫ۗۧ;->ᩴ:Ljava/util/ArrayList;

    iget-object v3, v0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    .line 658
    iput-boolean v2, p0, Ll/᩺ۙۧ;->ᩳ:Z

    if-lez p1, :cond_2

    .line 709
    iget-object v2, v1, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    new-instance v3, Ll/ۗۙۧ;

    invoke-direct {v3, v1, p0, p1}, Ll/ۗۙۧ;-><init>(Ll/֫ۗۧ;Ll/ۙۙۧ;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 666
    :cond_2
    :goto_0
    iget-object p1, v1, Ll/֫ۗۧ;->ۘ:Landroid/view/View;

    iget-object v0, v0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    if-ne p1, v0, :cond_3

    .line 667
    invoke-virtual {v1, v0}, Ll/֫ۗۧ;->ܽ(Landroid/view/View;)V

    :cond_3
    :goto_1
    return-void
.end method
