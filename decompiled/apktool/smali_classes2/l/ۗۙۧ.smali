.class public final Ll/ۗۙۧ;
.super Ljava/lang/Object;
.source "B66A"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/֫ۗۧ;

.field public final synthetic ᩹:Ll/ۙۙۧ;


# direct methods
.method public constructor <init>(Ll/֫ۗۧ;Ll/ۙۙۧ;I)V
    .locals 0

    .line 709
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۙۧ;->᩸:Ll/֫ۗۧ;

    iput-object p2, p0, Ll/ۗۙۧ;->᩹:Ll/ۙۙۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 712
    iget-object v0, p0, Ll/ۗۙۧ;->᩹:Ll/ۙۙۧ;

    iget-object v1, v0, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    iget-object v2, p0, Ll/ۗۙۧ;->᩸:Ll/֫ۗۧ;

    iget-object v3, v2, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ll/۬۬ۧ;->isAttachedToWindow()Z

    move-result v3

    if-eqz v3, :cond_4

    iget-boolean v0, v0, Ll/᩺ۙۧ;->ܿ:Z

    if-nez v0, :cond_4

    .line 714
    invoke-virtual {v1}, Ll/ۗ۬ۧ;->getAbsoluteAdapterPosition()I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_4

    .line 716
    iget-object v0, v2, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v3, 0x0

    .line 720
    invoke-virtual {v0, v3}, Ll/᩺ۗۧ;->֫(Ll/ۘ᩹ܳ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 733
    :cond_0
    iget-object v0, v2, Ll/֫ۗۧ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    .line 735
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺ۙۧ;

    iget-boolean v5, v5, Ll/᩺ۙۧ;->ۧ:Z

    if-nez v5, :cond_2

    .line 724
    :cond_1
    iget-object v0, v2, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 722
    :cond_3
    iget-object v0, v2, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    invoke-virtual {v0, v1}, Ll/ۤۙۧ;->ܽ(Ll/ۗ۬ۧ;)V

    :cond_4
    return-void
.end method
