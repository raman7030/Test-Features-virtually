.class public Lcom/google/android/material/snackbar/BaseTransientBottomBar$9;
.super Landroid/animation/AnimatorListenerAdapter;
.source "BaseTransientBottomBar.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V
    .locals 0

    .line 957
    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$9;->this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 960
    iget-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$9;->this$0:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->onViewShown()V

    return-void
.end method
