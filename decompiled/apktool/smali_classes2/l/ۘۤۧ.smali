.class public final Ll/ۘۤۧ;
.super Ljava/lang/Object;
.source "D5XC"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic ֫:Ll/᩵ۤۧ;

.field public final synthetic ۧ:Ll/ᩴۤۧ;


# direct methods
.method public constructor <init>(Ll/᩵ۤۧ;Ll/ᩴۤۧ;)V
    .locals 0

    .line 581
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۤۧ;->֫:Ll/᩵ۤۧ;

    iput-object p2, p0, Ll/ۘۤۧ;->ۧ:Ll/ᩴۤۧ;

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 5

    .line 600
    iget-object v0, p0, Ll/ۘۤۧ;->֫:Ll/᩵ۤۧ;

    const/high16 v1, 0x3f800000    # 1.0f

    iget-object v2, p0, Ll/ۘۤۧ;->ۧ:Ll/ᩴۤۧ;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Ll/᩵ۤۧ;->֫(FLl/ᩴۤۧ;Z)V

    .line 936
    iget v4, v2, Ll/ᩴۤۧ;->᩵:F

    iput v4, v2, Ll/ᩴۤۧ;->֨:F

    .line 937
    iget v4, v2, Ll/ᩴۤۧ;->ۡ:F

    iput v4, v2, Ll/ᩴۤۧ;->֡:F

    .line 938
    iget v4, v2, Ll/ᩴۤۧ;->ۘ:F

    iput v4, v2, Ll/ᩴۤۧ;->ۚ:F

    .line 810
    iget v4, v2, Ll/ᩴۤۧ;->ۜ:I

    add-int/2addr v4, v3

    iget-object v3, v2, Ll/ᩴۤۧ;->᩷:[I

    array-length v3, v3

    rem-int/2addr v4, v3

    .line 818
    invoke-virtual {v2, v4}, Ll/ᩴۤۧ;->֫(I)V

    .line 603
    iget-boolean v3, v0, Ll/᩵ۤۧ;->᩹:Z

    if-eqz v3, :cond_1

    const/4 v1, 0x0

    .line 606
    iput-boolean v1, v0, Ll/᩵ۤۧ;->᩹:Z

    .line 607
    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    const-wide/16 v3, 0x534

    .line 608
    invoke-virtual {p1, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 609
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    .line 902
    iget-boolean p1, v2, Ll/ᩴۤۧ;->ᩴ:Z

    if-eqz p1, :cond_0

    .line 903
    iput-boolean v1, v2, Ll/ᩴۤۧ;->ᩴ:Z

    :cond_0
    return-void

    .line 612
    :cond_1
    iget p1, v0, Ll/᩵ۤۧ;->۬:F

    add-float/2addr p1, v1

    iput p1, v0, Ll/᩵ۤۧ;->۬:F

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 585
    iget-object p1, p0, Ll/ۘۤۧ;->֫:Ll/᩵ۤۧ;

    const/4 v0, 0x0

    iput v0, p1, Ll/᩵ۤۧ;->۬:F

    return-void
.end method
