.class public final Ll/ܿۛۧ;
.super Ll/ᩳۨۧ;
.source "A65W"


# instance fields
.field public ֫:Z

.field public final ۧ:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 506
    iput-boolean v0, p0, Ll/ܿۛۧ;->֫:Z

    .line 511
    iput-object p1, p0, Ll/ܿۛۧ;->ۧ:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final onTransitionCancel(Ll/ܽۨۧ;)V
    .locals 1

    .line 516
    iget-object p1, p0, Ll/ܿۛۧ;->ۧ:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/֨ۨۧ;->֫(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    .line 517
    iput-boolean p1, p0, Ll/ܿۛۧ;->֫:Z

    return-void
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;)V
    .locals 2

    .line 522
    iget-boolean v0, p0, Ll/ܿۛۧ;->֫:Z

    if-nez v0, :cond_0

    .line 523
    iget-object v0, p0, Ll/ܿۛۧ;->ۧ:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/֨ۨۧ;->֫(Landroid/view/ViewGroup;Z)V

    .line 525
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method

.method public final onTransitionPause(Ll/ܽۨۧ;)V
    .locals 1

    .line 530
    iget-object p1, p0, Ll/ܿۛۧ;->ۧ:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/֨ۨۧ;->֫(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public final onTransitionResume(Ll/ܽۨۧ;)V
    .locals 1

    .line 535
    iget-object p1, p0, Ll/ܿۛۧ;->ۧ:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ll/֨ۨۧ;->֫(Landroid/view/ViewGroup;Z)V

    return-void
.end method
