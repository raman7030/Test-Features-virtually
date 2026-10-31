.class public final Ll/᩸ۤۧ;
.super Ljava/lang/Object;
.source "85MM"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic ֫:Ll/۫ۤۧ;


# direct methods
.method public constructor <init>(Ll/۫ۤۧ;)V
    .locals 0

    .line 1217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۤۧ;->֫:Ll/۫ۤۧ;

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1225
    iget-object p1, p0, Ll/᩸ۤۧ;->֫:Ll/۫ۤۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 1226
    invoke-virtual {p1, v0}, Ll/۫ۤۧ;->֫(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
