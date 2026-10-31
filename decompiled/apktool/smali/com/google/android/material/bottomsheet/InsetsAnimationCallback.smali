.class public Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;
.super Ll/۬᩺;
.source "InsetsAnimationCallback.java"


# instance fields
.field public startTranslationY:I

.field public startY:I

.field public final tmpLocation:[I

.field public final view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 37
    invoke-direct {p0, v0}, Ll/۬᩺;-><init>(I)V

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 34
    iput-object v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->tmpLocation:[I

    .line 38
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onEnd(Ll/ܿܰ;)V
    .locals 1

    .line 81
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public onPrepare(Ll/ܿܰ;)V
    .locals 1

    .line 43
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->tmpLocation:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 44
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->tmpLocation:[I

    const/4 v0, 0x1

    aget p1, p1, v0

    iput p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->startY:I

    return-void
.end method

.method public onProgress(Ll/᩸ܰ;Ljava/util/List;)Ll/᩸ܰ;
    .locals 2

    .line 67
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿܰ;

    .line 68
    invoke-virtual {v0}, Ll/ܿܰ;->ܽ()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_0

    .line 70
    iget p2, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->startTranslationY:I

    const/4 v1, 0x0

    .line 71
    invoke-virtual {v0}, Ll/ܿܰ;->ۧ()F

    move-result v0

    invoke-static {p2, v1, v0}, Lcom/google/android/material/animation/AnimationUtils;->lerp(IIF)I

    move-result p2

    int-to-float p2, p2

    .line 72
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-object p1
.end method

.method public onStart(Ll/ܿܰ;Ll/ۗ᩺;)Ll/ۗ᩺;
    .locals 1

    .line 52
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->tmpLocation:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 53
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->tmpLocation:[I

    const/4 v0, 0x1

    aget p1, p1, v0

    .line 54
    iget v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->startY:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->startTranslationY:I

    .line 57
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-object p2
.end method
