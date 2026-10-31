.class public final Ll/ۡܳ֫;
.super Landroid/animation/AnimatorListenerAdapter;
.source "RB93"


# instance fields
.field public final synthetic ֫:Ll/۠ܳ֫;

.field public final synthetic ۧ:Landroid/view/ViewGroup;

.field public final synthetic ܽ:Z

.field public final synthetic ܿ:Landroid/view/View;

.field public final synthetic ᩳ:Ll/ۙ᩷֫;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;ZLl/ۙ᩷֫;Ll/۠ܳ֫;)V
    .locals 0

    .line 210
    iput-object p1, p0, Ll/ۡܳ֫;->ۧ:Landroid/view/ViewGroup;

    iput-object p2, p0, Ll/ۡܳ֫;->ܿ:Landroid/view/View;

    iput-boolean p3, p0, Ll/ۡܳ֫;->ܽ:Z

    iput-object p4, p0, Ll/ۡܳ֫;->ᩳ:Ll/ۙ᩷֫;

    iput-object p5, p0, Ll/ۡܳ֫;->֫:Ll/۠ܳ֫;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 213
    iget-object p1, p0, Ll/ۡܳ֫;->ۧ:Landroid/view/ViewGroup;

    iget-object v0, p0, Ll/ۡܳ֫;->ܿ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 214
    iget-boolean p1, p0, Ll/ۡܳ֫;->ܽ:Z

    iget-object v1, p0, Ll/ۡܳ֫;->ᩳ:Ll/ۙ᩷֫;

    if-eqz p1, :cond_0

    .line 217
    invoke-virtual {v1}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/᩶᩷֫;->֫(Landroid/view/View;)V

    .line 219
    :cond_0
    iget-object p1, p0, Ll/ۡܳ֫;->֫:Ll/۠ܳ֫;

    invoke-virtual {p1}, Ll/ܶܳ֫;->֫()V

    const/4 p1, 0x2

    .line 220
    invoke-static {p1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 221
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    return-void
.end method
