.class public final Ll/ۜۘܳ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "J26J"


# instance fields
.field public final synthetic ֫:Ll/ۢۘܳ;


# direct methods
.method public constructor <init>(Ll/ۢۘܳ;)V
    .locals 0

    .line 1316
    iput-object p1, p0, Ll/ۜۘܳ;->֫:Ll/ۢۘܳ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1319
    iget-object p1, p0, Ll/ۜۘܳ;->֫:Ll/ۢۘܳ;

    invoke-static {p1}, Ll/ۢۘܳ;->᩻(Ll/ۢۘܳ;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1320
    invoke-static {p1}, Ll/ۢۘܳ;->᩻(Ll/ۢۘܳ;)Landroid/widget/TextView;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method
