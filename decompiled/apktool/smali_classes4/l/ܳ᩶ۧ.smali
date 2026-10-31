.class public final Ll/ܳ᩶ۧ;
.super Ljava/lang/Object;
.source "79M1"


# direct methods
.method public static ֫(Ljava/lang/Runnable;)V
    .locals 2

    .line 161
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    new-instance v1, Ll/ܿ᩶ۧ;

    invoke-direct {v1, p0}, Ll/ܿ᩶ۧ;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method
