.class public final Ll/ۤ᩺;
.super Landroid/animation/AnimatorListenerAdapter;
.source "R9NW"


# instance fields
.field public final synthetic ֫:Ll/ܿܰ;

.field public final synthetic ۧ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Ll/ܿܰ;)V
    .locals 0

    .line 836
    iput-object p2, p0, Ll/ۤ᩺;->֫:Ll/ܿܰ;

    iput-object p1, p0, Ll/ۤ᩺;->ۧ:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const/high16 p1, 0x3f800000    # 1.0f

    .line 840
    iget-object v0, p0, Ll/ۤ᩺;->֫:Ll/ܿܰ;

    invoke-virtual {v0, p1}, Ll/ܿܰ;->֫(F)V

    .line 841
    iget-object p1, p0, Ll/ۤ᩺;->ۧ:Landroid/view/View;

    invoke-static {p1, v0}, Ll/᩺᩺;->֫(Landroid/view/View;Ll/ܿܰ;)V

    return-void
.end method
