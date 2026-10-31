.class public final synthetic Ll/ۘۛۜ;
.super Ljava/lang/Object;
.source "B6LA"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ֫:Ll/ᩴۛۜ;

.field public final synthetic ۧ:F

.field public final synthetic ܽ:F


# direct methods
.method public synthetic constructor <init>(Ll/ᩴۛۜ;FF)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۛۜ;->֫:Ll/ᩴۛۜ;

    iput p2, p0, Ll/ۘۛۜ;->ۧ:F

    iput p3, p0, Ll/ۘۛۜ;->ܽ:F

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 112
    iget-object v0, p0, Ll/ۘۛۜ;->֫:Ll/ᩴۛۜ;

    iget-object v0, v0, Ll/ᩴۛۜ;->᩸:Ll/ۚۛۜ;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget v1, p0, Ll/ۘۛۜ;->ۧ:F

    iget v2, p0, Ll/ۘۛۜ;->ܽ:F

    invoke-static {v0, p1, v1, v2}, Ll/ۚۛۜ;->֫(Ll/ۚۛۜ;FFF)V

    return-void
.end method
