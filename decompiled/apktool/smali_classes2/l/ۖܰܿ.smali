.class public final Ll/ۖܰܿ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "C5GL"


# instance fields
.field public final synthetic ֫:Ll/ۚܰܿ;


# direct methods
.method public constructor <init>(Ll/ۚܰܿ;)V
    .locals 0

    .line 926
    iput-object p1, p0, Ll/ۖܰܿ;->֫:Ll/ۚܰܿ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 929
    iget-object p1, p0, Ll/ۖܰܿ;->֫:Ll/ۚܰܿ;

    invoke-static {p1}, Ll/ۚܰܿ;->᩻(Ll/ۚܰܿ;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 930
    invoke-static {p1}, Ll/ۚܰܿ;->ۖ(Ll/ۚܰܿ;)V

    return-void
.end method
