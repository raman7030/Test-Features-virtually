.class public final Ll/ۤ۠ۡ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "86WH"


# instance fields
.field public final synthetic ֫:Ll/ۛ۠ۡ;


# direct methods
.method public constructor <init>(Ll/ۛ۠ۡ;)V
    .locals 0

    .line 258
    iput-object p1, p0, Ll/ۤ۠ۡ;->֫:Ll/ۛ۠ۡ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 261
    iget-object v0, p0, Ll/ۤ۠ۡ;->֫:Ll/ۛ۠ۡ;

    invoke-static {v0}, Ll/ۛ۠ۡ;->ܺ(Ll/ۛ۠ۡ;)Landroid/animation/ValueAnimator;

    move-result-object v1

    if-eq v1, p1, :cond_0

    return-void

    .line 262
    :cond_0
    invoke-static {v0}, Ll/ۛ۠ۡ;->᩵(Ll/ۛ۠ۡ;)V

    .line 263
    invoke-static {v0}, Ll/ۛ۠ۡ;->֡(Ll/ۛ۠ۡ;)V

    return-void
.end method
