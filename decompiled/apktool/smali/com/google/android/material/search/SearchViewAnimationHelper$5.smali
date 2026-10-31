.class public Lcom/google/android/material/search/SearchViewAnimationHelper$5;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SearchViewAnimationHelper.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/search/SearchViewAnimationHelper;

.field public final synthetic val$show:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/search/SearchViewAnimationHelper;Z)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper$5;->this$0:Lcom/google/android/material/search/SearchViewAnimationHelper;

    iput-boolean p2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper$5;->val$show:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 300
    iget-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper$5;->this$0:Lcom/google/android/material/search/SearchViewAnimationHelper;

    iget-boolean v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper$5;->val$show:Z

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->access$200(Lcom/google/android/material/search/SearchViewAnimationHelper;F)V

    .line 303
    iget-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper$5;->this$0:Lcom/google/android/material/search/SearchViewAnimationHelper;

    invoke-static {p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->access$100(Lcom/google/android/material/search/SearchViewAnimationHelper;)Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->resetClipBoundsAndCornerRadius()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 295
    iget-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper$5;->this$0:Lcom/google/android/material/search/SearchViewAnimationHelper;

    iget-boolean v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper$5;->val$show:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    invoke-static {p1, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->access$200(Lcom/google/android/material/search/SearchViewAnimationHelper;F)V

    return-void
.end method
