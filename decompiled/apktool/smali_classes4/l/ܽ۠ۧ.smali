.class public final Ll/ܽ۠ۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "S8GQ"


# instance fields
.field public final synthetic ֫:Ll/᩷۠ۧ;

.field public final synthetic ۧ:Ll/۠֨ۧ;


# direct methods
.method public constructor <init>(Ll/᩷۠ۧ;Ll/۠֨ۧ;)V
    .locals 0

    .line 229
    iput-object p1, p0, Ll/ܽ۠ۧ;->֫:Ll/᩷۠ۧ;

    iput-object p2, p0, Ll/ܽ۠ۧ;->ۧ:Ll/۠֨ۧ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    const/4 p1, 0x2

    .line 237
    iget-object v0, p0, Ll/ܽ۠ۧ;->֫:Ll/᩷۠ۧ;

    invoke-static {v0, p1}, Ll/᩷۠ۧ;->֫(Ll/᩷۠ۧ;I)V

    .line 238
    invoke-static {v0}, Ll/᩷۠ۧ;->ۘ(Ll/᩷۠ۧ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 239
    iget-object p1, p0, Ll/ܽ۠ۧ;->ۧ:Ll/۠֨ۧ;

    invoke-static {v0}, Ll/᩷۠ۧ;->ᩴ(Ll/᩷۠ۧ;)Ll/ܶ֨ۧ;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 240
    invoke-static {v0}, Ll/᩷۠ۧ;->֡(Ll/᩷۠ۧ;)V

    :cond_0
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 232
    iget-object p1, p0, Ll/ܽ۠ۧ;->֫:Ll/᩷۠ۧ;

    const/4 v0, 0x3

    invoke-static {p1, v0}, Ll/᩷۠ۧ;->֫(Ll/᩷۠ۧ;I)V

    return-void
.end method
