.class public final Ll/֨ۛ;
.super Ljava/lang/Object;
.source "C5P1"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ֫:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v0, Landroid/view/GestureDetector;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    iput-object v0, p0, Ll/֨ۛ;->֫:Landroid/view/GestureDetector;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 112
    iget-object v1, p0, Ll/֨ۛ;->֫:Landroid/view/GestureDetector;

    invoke-virtual {v1, v0}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    return-void
.end method

.method public final ֫(Landroid/view/GestureDetector$OnDoubleTapListener;)V
    .locals 1

    .line 123
    iget-object v0, p0, Ll/֨ۛ;->֫:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    return-void
.end method

.method public final ֫(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 98
    iget-object v0, p0, Ll/֨ۛ;->֫:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
