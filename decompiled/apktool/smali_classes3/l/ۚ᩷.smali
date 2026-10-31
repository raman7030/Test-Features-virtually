.class public final Ll/ۚ᩷;
.super Ljava/lang/Object;
.source "64NR"

# interfaces
.implements Ll/᩸᩺;


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public final synthetic ܽ:Ll/֨᩷;


# direct methods
.method public constructor <init>(Ll/֨᩷;)V
    .locals 0

    .line 275
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩷;->ܽ:Ll/֨᩷;

    const/4 p1, 0x0

    .line 276
    iput-boolean p1, p0, Ll/ۚ᩷;->֫:Z

    return-void
.end method


# virtual methods
.method public final onAnimationCancel()V
    .locals 1

    const/4 v0, 0x1

    .line 302
    iput-boolean v0, p0, Ll/ۚ᩷;->֫:Z

    return-void
.end method

.method public final onAnimationEnd()V
    .locals 2

    .line 294
    iget-boolean v0, p0, Ll/ۚ᩷;->֫:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 296
    iget-object v1, p0, Ll/ۚ᩷;->ܽ:Ll/֨᩷;

    iput-object v0, v1, Ll/֨᩷;->ۤ:Ll/ܶ᩺;

    .line 297
    iget v0, p0, Ll/ۚ᩷;->ۧ:I

    invoke-static {v1, v0}, Ll/֨᩷;->֫(Ll/֨᩷;I)V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 288
    iget-object v0, p0, Ll/ۚ᩷;->ܽ:Ll/֨᩷;

    invoke-static {v0}, Ll/֨᩷;->֫(Ll/֨᩷;)V

    const/4 v0, 0x0

    .line 289
    iput-boolean v0, p0, Ll/ۚ᩷;->֫:Z

    return-void
.end method
