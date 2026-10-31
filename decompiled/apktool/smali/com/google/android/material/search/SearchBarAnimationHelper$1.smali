.class public Lcom/google/android/material/search/SearchBarAnimationHelper$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SearchBarAnimationHelper.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;


# direct methods
.method public constructor <init>(Lcom/google/android/material/search/SearchBarAnimationHelper;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$1;->this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 84
    iget-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$1;->this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;

    new-instance v0, Lcom/google/android/material/search/SearchBarAnimationHelper$1$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Lcom/google/android/material/search/SearchBarAnimationHelper;->access$000(Lcom/google/android/material/search/SearchBarAnimationHelper;Lcom/google/android/material/search/SearchBarAnimationHelper$OnLoadAnimationInvocation;)V

    return-void
.end method
