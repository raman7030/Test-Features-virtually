.class public Lcom/google/android/material/internal/WindowUtils$Api30Impl;
.super Ljava/lang/Object;
.source "WindowUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getCurrentWindowBounds(Landroid/view/WindowManager;)Landroid/graphics/Rect;
    .locals 0

    .line 63
    invoke-interface {p0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method
