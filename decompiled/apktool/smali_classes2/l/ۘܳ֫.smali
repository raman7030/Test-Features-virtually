.class public final Ll/ۘܳ֫;
.super Ljava/lang/Object;
.source "RB93"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic ֫:Ll/۠ܳ֫;

.field public final synthetic ۧ:Landroid/view/ViewGroup;

.field public final synthetic ܽ:Ll/ۙ᩷֫;

.field public final synthetic ᩳ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/ViewGroup;Ll/۠ܳ֫;Ll/ۙ᩷֫;)V
    .locals 0

    .line 286
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ll/ۘܳ֫;->ܽ:Ll/ۙ᩷֫;

    iput-object p2, p0, Ll/ۘܳ֫;->ۧ:Landroid/view/ViewGroup;

    iput-object p1, p0, Ll/ۘܳ֫;->ᩳ:Landroid/view/View;

    iput-object p3, p0, Ll/ۘܳ֫;->֫:Ll/۠ܳ֫;

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 300
    new-instance p1, Ll/ۖܳ֫;

    invoke-direct {p1, p0}, Ll/ۖܳ֫;-><init>(Ll/ۘܳ֫;)V

    iget-object v0, p0, Ll/ۘܳ֫;->ۧ:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x2

    .line 307
    invoke-static {p1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 308
    iget-object p1, p0, Ll/ۘܳ֫;->ܽ:Ll/ۙ᩷֫;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    const/4 p1, 0x2

    .line 289
    invoke-static {p1}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 290
    iget-object p1, p0, Ll/ۘܳ֫;->ܽ:Ll/ۙ᩷֫;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method
