.class public Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;
.super Ljava/lang/Object;
.source "HeaderBehavior.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final layout:Landroid/view/View;

.field public final parent:Ll/ᩳ᩹;

.field public final synthetic this$0:Lcom/google/android/material/appbar/HeaderBehavior;


# direct methods
.method public constructor <init>(Lcom/google/android/material/appbar/HeaderBehavior;Ll/ᩳ᩹;Landroid/view/View;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->this$0:Lcom/google/android/material/appbar/HeaderBehavior;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 264
    iput-object p2, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->parent:Ll/ᩳ᩹;

    .line 265
    iput-object p3, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->layout:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 270
    iget-object v0, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->layout:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->this$0:Lcom/google/android/material/appbar/HeaderBehavior;

    iget-object v0, v0, Lcom/google/android/material/appbar/HeaderBehavior;->scroller:Landroid/widget/OverScroller;

    if-eqz v0, :cond_1

    .line 271
    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    iget-object v0, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->this$0:Lcom/google/android/material/appbar/HeaderBehavior;

    iget-object v1, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->parent:Ll/ᩳ᩹;

    iget-object v2, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->layout:Landroid/view/View;

    iget-object v3, v0, Lcom/google/android/material/appbar/HeaderBehavior;->scroller:Landroid/widget/OverScroller;

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/material/appbar/HeaderBehavior;->setHeaderTopBottomOffset(Ll/ᩳ᩹;Landroid/view/View;I)I

    .line 274
    iget-object v0, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->layout:Landroid/view/View;

    sget v1, Ll/ܿ᩺;->֫:I

    .line 1359
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void

    .line 276
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->this$0:Lcom/google/android/material/appbar/HeaderBehavior;

    iget-object v1, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->parent:Ll/ᩳ᩹;

    iget-object v2, p0, Lcom/google/android/material/appbar/HeaderBehavior$FlingRunnable;->layout:Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/appbar/HeaderBehavior;->onFlingFinished(Ll/ᩳ᩹;Landroid/view/View;)V

    :cond_1
    return-void
.end method
