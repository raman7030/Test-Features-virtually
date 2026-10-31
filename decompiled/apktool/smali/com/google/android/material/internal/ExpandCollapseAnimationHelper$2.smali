.class public Lcom/google/android/material/internal/ExpandCollapseAnimationHelper$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "ExpandCollapseAnimationHelper.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;


# direct methods
.method public constructor <init>(Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/google/android/material/internal/ExpandCollapseAnimationHelper$2;->this$0:Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 93
    iget-object p1, p0, Lcom/google/android/material/internal/ExpandCollapseAnimationHelper$2;->this$0:Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;

    invoke-static {p1}, Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;->access$000(Lcom/google/android/material/internal/ExpandCollapseAnimationHelper;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
