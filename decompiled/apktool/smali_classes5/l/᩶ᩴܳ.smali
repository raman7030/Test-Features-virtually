.class public final Ll/᩶ᩴܳ;
.super Ljava/lang/Object;
.source "715M"

# interfaces
.implements Ll/ܿۡۡ;


# instance fields
.field public final synthetic ֫:Ll/ۚ᩵ܳ;


# direct methods
.method public constructor <init>(Ll/ۚ᩵ܳ;)V
    .locals 0

    .line 351
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ᩴܳ;->֫:Ll/ۚ᩵ܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 354
    iget-object v0, p0, Ll/᩶ᩴܳ;->֫:Ll/ۚ᩵ܳ;

    invoke-static {v0, p1}, Ll/ۚ᩵ܳ;->֫(Ll/ۚ᩵ܳ;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ܳۡۡ;)V
    .locals 7

    .line 360
    invoke-virtual {p1}, Ll/ܳۡۡ;->֫()Z

    move-result v0

    iget-object v1, p0, Ll/᩶ᩴܳ;->֫:Ll/ۚ᩵ܳ;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ll/ۚ᩵ܳ;->᩻(Ll/ۚ᩵ܳ;)Ll/ܳ᩷ۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܳ᩷ۡ;->ܳ()F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    .line 361
    new-instance v0, Ll/֡᩵ܳ;

    invoke-static {v1}, Ll/ۚ᩵ܳ;->ܶ(Ll/ۚ᩵ܳ;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object v2

    invoke-static {v1}, Ll/ۚ᩵ܳ;->֨(Ll/ۚ᩵ܳ;)Ll/᩻ۡۡ;

    move-result-object v3

    invoke-static {v1}, Ll/ۚ᩵ܳ;->᩵(Ll/ۚ᩵ܳ;)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Landroid/view/View;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    const/4 v2, 0x2

    aput-object v4, v5, v2

    invoke-direct {v0, v5}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    const/4 v3, 0x0

    .line 362
    invoke-virtual {v0, v3}, Ll/֡᩵ܳ;->setAlpha(F)V

    new-array v2, v2, [F

    .line 363
    fill-array-data v2, :array_0

    const-string v3, "alpha"

    invoke-static {v0, v3, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 365
    :cond_0
    invoke-virtual {p1}, Ll/ܳۡۡ;->ۧ()Z

    move-result p1

    invoke-static {v1, p1}, Ll/ۚ᩵ܳ;->ۧ(Ll/ۚ᩵ܳ;Z)V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final synthetic ۧ(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
