.class public final Ll/ۢ᩵ܳ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "715M"


# instance fields
.field public final synthetic ֫:Ll/᩵᩵ܳ;


# direct methods
.method public constructor <init>(Ll/᩵᩵ܳ;)V
    .locals 0

    .line 1107
    iput-object p1, p0, Ll/ۢ᩵ܳ;->֫:Ll/᩵᩵ܳ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1110
    iget-object p1, p0, Ll/ۢ᩵ܳ;->֫:Ll/᩵᩵ܳ;

    invoke-static {p1}, Ll/᩵᩵ܳ;->ۧ(Ll/᩵᩵ܳ;)Landroid/widget/ImageView;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method
