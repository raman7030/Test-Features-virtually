.class public final Ll/۫ۚᩳ;
.super Ljava/lang/Object;
.source "75NJ"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic ֫:Ll/ܽ֨ᩳ;


# direct methods
.method public constructor <init>(Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 1014
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۚᩳ;->֫:Ll/ܽ֨ᩳ;

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1022
    iget-object p1, p0, Ll/۫ۚᩳ;->֫:Ll/ܽ֨ᩳ;

    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
