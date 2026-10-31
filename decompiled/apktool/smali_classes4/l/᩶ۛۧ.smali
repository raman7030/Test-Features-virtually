.class public final Ll/᩶ۛۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "G5Y2"


# instance fields
.field public final synthetic ֫:Ll/ܽۨۧ;


# direct methods
.method public constructor <init>(Ll/ܽۨۧ;)V
    .locals 0

    .line 2029
    iput-object p1, p0, Ll/᩶ۛۧ;->֫:Ll/ܽۨۧ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 2032
    iget-object v0, p0, Ll/᩶ۛۧ;->֫:Ll/ܽۨۧ;

    invoke-virtual {v0}, Ll/ܽۨۧ;->end()V

    .line 2033
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method
