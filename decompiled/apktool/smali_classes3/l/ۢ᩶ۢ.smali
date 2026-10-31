.class public final Ll/ۢ᩶ۢ;
.super Ljava/lang/Object;
.source "W1V4"

# interfaces
.implements Landroid/view/GestureDetector$OnDoubleTapListener;


# instance fields
.field public final synthetic ᩸:Ll/ۘ᩶ۢ;


# direct methods
.method public constructor <init>(Ll/ۘ᩶ۢ;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۢ᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    .line 254
    iget-object v0, v0, Ll/ۘ᩶ۢ;->֫:Ll/֡᩶ۢ;

    invoke-static {v0}, Ll/֡᩶ۢ;->ۚ(Ll/֡᩶ۢ;)V

    .line 255
    invoke-virtual {v0, p1}, Ll/֡᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 43
    iget-object p1, p0, Ll/ۢ᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    .line 151
    iget-object p1, p1, Ll/ۘ᩶ۢ;->֫:Ll/֡᩶ۢ;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;F)V

    const/4 p1, 0x1

    return p1
.end method
