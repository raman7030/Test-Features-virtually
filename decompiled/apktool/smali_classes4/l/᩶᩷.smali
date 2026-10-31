.class public final Ll/᩶᩷;
.super Landroid/animation/AnimatorListenerAdapter;
.source "Q63C"


# instance fields
.field public final synthetic ֫:Ll/ۤ᩷;


# direct methods
.method public constructor <init>(Ll/ۤ᩷;)V
    .locals 0

    .line 113
    iput-object p1, p0, Ll/᩶᩷;->֫:Ll/ۤ᩷;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    const/4 p1, 0x0

    .line 122
    iget-object v0, p0, Ll/᩶᩷;->֫:Ll/ۤ᩷;

    iput-object p1, v0, Ll/ۤ᩷;->ۨ:Landroid/view/ViewPropertyAnimator;

    const/4 p1, 0x0

    .line 123
    iput-boolean p1, v0, Ll/ۤ᩷;->ۗ:Z

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const/4 p1, 0x0

    .line 116
    iget-object v0, p0, Ll/᩶᩷;->֫:Ll/ۤ᩷;

    iput-object p1, v0, Ll/ۤ᩷;->ۨ:Landroid/view/ViewPropertyAnimator;

    const/4 p1, 0x0

    .line 117
    iput-boolean p1, v0, Ll/ۤ᩷;->ۗ:Z

    return-void
.end method
