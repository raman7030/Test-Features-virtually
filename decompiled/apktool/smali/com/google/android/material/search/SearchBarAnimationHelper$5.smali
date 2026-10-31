.class public Lcom/google/android/material/search/SearchBarAnimationHelper$5;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SearchBarAnimationHelper.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;


# direct methods
.method public constructor <init>(Lcom/google/android/material/search/SearchBarAnimationHelper;)V
    .locals 0

    .line 290
    iput-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$5;->this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 293
    iget-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$5;->this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/material/search/SearchBarAnimationHelper;->access$202(Lcom/google/android/material/search/SearchBarAnimationHelper;Landroid/animation/Animator;)Landroid/animation/Animator;

    return-void
.end method
