.class public final Ll/ۡ᩶ۢ;
.super Ljava/lang/Object;
.source "W1V4"


# instance fields
.field public ֫:Ll/֨ۛ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ۘ᩶ۢ;)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ll/֨ۛ;

    new-instance v1, Ll/᩷᩶ۢ;

    invoke-direct {v1, p2}, Ll/᩷᩶ۢ;-><init>(Ll/ۘ᩶ۢ;)V

    invoke-direct {v0, p1, v1}, Ll/֨ۛ;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Ll/ۡ᩶ۢ;->֫:Ll/֨ۛ;

    .line 40
    new-instance p1, Ll/ۢ᩶ۢ;

    invoke-direct {p1, p2}, Ll/ۢ᩶ۢ;-><init>(Ll/ۘ᩶ۢ;)V

    invoke-virtual {v0, p1}, Ll/֨ۛ;->֫(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/MotionEvent;)V
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۡ᩶ۢ;->֫:Ll/֨ۛ;

    invoke-virtual {v0, p1}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    return-void
.end method
