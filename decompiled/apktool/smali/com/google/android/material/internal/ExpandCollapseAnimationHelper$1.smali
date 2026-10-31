.class public Lcom/google/android/material/internal/ExpandCollapseAnimationHelper$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ExpandCollapseAnimationHelper.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;


# direct methods
.method public constructor <init>(Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/google/android/material/internal/ExpandCollapseAnimationHelper$1;->this$0:Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 78
    iget-object p1, p0, Lcom/google/android/material/internal/ExpandCollapseAnimationHelper$1;->this$0:Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;

    invoke-static {p1}, Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;->access$000(Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
