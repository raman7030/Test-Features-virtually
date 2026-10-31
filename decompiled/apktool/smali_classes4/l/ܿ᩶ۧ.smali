.class public final synthetic Ll/ܿ᩶ۧ;
.super Ljava/lang/Object;
.source "79M1"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ᩶ۧ;->᩸:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 0

    .line 2
    iget-object p1, p0, Ll/ܿ᩶ۧ;->᩸:Ljava/lang/Runnable;

    .line 161
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
