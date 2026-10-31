.class public final Ll/ܿۤۜ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "D8GL"


# instance fields
.field public final synthetic ֫:Ll/ۤۤۜ;


# direct methods
.method public constructor <init>(Ll/ۤۤۜ;)V
    .locals 0

    .line 5003
    iput-object p1, p0, Ll/ܿۤۜ;->֫:Ll/ۤۤۜ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 5006
    iget-object p1, p0, Ll/ܿۤۜ;->֫:Ll/ۤۤۜ;

    invoke-static {p1}, Ll/ۤۤۜ;->ܽ֫(Ll/ۤۤۜ;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
