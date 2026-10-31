.class public final Ll/ܰۧ֫;
.super Ll/ۨۧ֫;
.source "RB4Y"


# instance fields
.field public final ۧ:Landroid/view/Choreographer;

.field public final ܽ:Landroid/view/Choreographer$FrameCallback;


# direct methods
.method public constructor <init>(Ll/ۤۧ֫;)V
    .locals 0

    .line 203
    invoke-direct {p0, p1}, Ll/ۨۧ֫;-><init>(Ll/ۤۧ֫;)V

    .line 199
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۧ֫;->ۧ:Landroid/view/Choreographer;

    .line 204
    new-instance p1, Ll/᩺ۧ֫;

    invoke-direct {p1, p0}, Ll/᩺ۧ֫;-><init>(Ll/ܰۧ֫;)V

    iput-object p1, p0, Ll/ܰۧ֫;->ܽ:Landroid/view/Choreographer$FrameCallback;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 214
    iget-object v0, p0, Ll/ܰۧ֫;->ۧ:Landroid/view/Choreographer;

    iget-object v1, p0, Ll/ܰۧ֫;->ܽ:Landroid/view/Choreographer$FrameCallback;

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method
