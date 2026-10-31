.class public Lcom/google/android/material/search/SearchBarAnimationHelper$4;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SearchBarAnimationHelper.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;

.field public final synthetic val$searchBar:Lcom/google/android/material/search/SearchBar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/search/SearchBarAnimationHelper;Lcom/google/android/material/search/SearchBar;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$4;->this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;

    iput-object p2, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$4;->val$searchBar:Lcom/google/android/material/search/SearchBar;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 254
    iget-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$4;->this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/material/search/SearchBarAnimationHelper;->access$102(Lcom/google/android/material/search/SearchBarAnimationHelper;Z)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 249
    iget-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$4;->val$searchBar:Lcom/google/android/material/search/SearchBar;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
