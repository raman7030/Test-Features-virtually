.class public final Ll/ܺᩴ;
.super Ll/֨ۧܺ;
.source "H56R"


# instance fields
.field public ֫:Z

.field public final synthetic ۧ:Ll/ۖᩴ;

.field public final synthetic ܽ:I


# direct methods
.method public constructor <init>(Ll/ۖᩴ;I)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 571
    iput-object p1, p0, Ll/ܺᩴ;->ۧ:Ll/ۖᩴ;

    iput p2, p0, Ll/ܺᩴ;->ܽ:I

    const/4 p1, 0x0

    .line 572
    iput-boolean p1, p0, Ll/ܺᩴ;->֫:Z

    return-void
.end method


# virtual methods
.method public final onAnimationCancel()V
    .locals 1

    const/4 v0, 0x1

    .line 588
    iput-boolean v0, p0, Ll/ܺᩴ;->֫:Z

    return-void
.end method

.method public final onAnimationEnd()V
    .locals 2

    .line 581
    iget-boolean v0, p0, Ll/ܺᩴ;->֫:Z

    if-nez v0, :cond_0

    .line 582
    iget-object v0, p0, Ll/ܺᩴ;->ۧ:Ll/ۖᩴ;

    iget-object v0, v0, Ll/ۖᩴ;->ۘ:Ll/ۢᩴ;

    iget v1, p0, Ll/ܺᩴ;->ܽ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 576
    iget-object v0, p0, Ll/ܺᩴ;->ۧ:Ll/ۖᩴ;

    iget-object v0, v0, Ll/ۖᩴ;->ۘ:Ll/ۢᩴ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
