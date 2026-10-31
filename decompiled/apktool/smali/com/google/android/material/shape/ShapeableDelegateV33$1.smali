.class public Lcom/google/android/material/shape/ShapeableDelegateV33$1;
.super Landroid/view/ViewOutlineProvider;
.source "ShapeableDelegateV33.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/shape/ShapeableDelegateV33;


# direct methods
.method public constructor <init>(Lcom/google/android/material/shape/ShapeableDelegateV33;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/google/android/material/shape/ShapeableDelegateV33$1;->this$0:Lcom/google/android/material/shape/ShapeableDelegateV33;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 0

    .line 64
    iget-object p1, p0, Lcom/google/android/material/shape/ShapeableDelegateV33$1;->this$0:Lcom/google/android/material/shape/ShapeableDelegateV33;

    iget-object p1, p1, Lcom/google/android/material/shape/ShapeableDelegate;->shapePath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 65
    iget-object p1, p0, Lcom/google/android/material/shape/ShapeableDelegateV33$1;->this$0:Lcom/google/android/material/shape/ShapeableDelegateV33;

    iget-object p1, p1, Lcom/google/android/material/shape/ShapeableDelegate;->shapePath:Landroid/graphics/Path;

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->setPath(Landroid/graphics/Path;)V

    :cond_0
    return-void
.end method
