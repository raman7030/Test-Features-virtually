.class public Ll/۟ᩳ;
.super Ljava/lang/Object;
.source "43T5"

# interfaces
.implements Ll/۠ۧ֫;


# instance fields
.field public ۗ:Z

.field public ۙ:Ll/ۚ᩻;

.field public ᩶:Landroid/graphics/drawable/Drawable;

.field public final ᩸:Ll/ۨᩳ;

.field public final ᩹:Ll/۬ۧ֫;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/۬ۧ֫;Ll/ۢᩴ;)V
    .locals 1

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 129
    iput-boolean v0, p0, Ll/۟ᩳ;->ۗ:Z

    if-eqz p3, :cond_0

    .line 196
    new-instance p1, Ll/ܰᩳ;

    invoke-direct {p1, p3}, Ll/ܰᩳ;-><init>(Ll/ۢᩴ;)V

    iput-object p1, p0, Ll/۟ᩳ;->᩸:Ll/ۨᩳ;

    .line 197
    new-instance p1, Ll/ۛᩳ;

    invoke-direct {p1, p0}, Ll/ۛᩳ;-><init>(Ll/۟ᩳ;)V

    invoke-virtual {p3, p1}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 208
    :cond_0
    invoke-interface {p1}, Ll/᩺ᩳ;->ܿ()Ll/ۨᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/۟ᩳ;->᩸:Ll/ۨᩳ;

    .line 213
    :goto_0
    iput-object p2, p0, Ll/۟ᩳ;->᩹:Ll/۬ۧ֫;

    .line 217
    new-instance p1, Ll/ۚ᩻;

    iget-object p2, p0, Ll/۟ᩳ;->᩸:Ll/ۨᩳ;

    invoke-interface {p2}, Ll/ۨᩳ;->֫()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ۚ᩻;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Ll/۟ᩳ;->ۙ:Ll/ۚ᩻;

    .line 502
    iget-object p1, p0, Ll/۟ᩳ;->᩸:Ll/ۨᩳ;

    invoke-interface {p1}, Ll/ۨᩳ;->ܽ()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 222
    iput-object p1, p0, Ll/۟ᩳ;->᩶:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method private ֫(F)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    .line 506
    iget-object v1, p0, Ll/۟ᩳ;->ۙ:Ll/ۚ᩻;

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 507
    invoke-virtual {v1, v0}, Ll/ۚ᩻;->֫(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 509
    invoke-virtual {v1, v0}, Ll/ۚ᩻;->֫(Z)V

    .line 511
    :cond_1
    :goto_0
    invoke-virtual {v1, p1}, Ll/ۚ᩻;->֫(F)V

    return-void
.end method


# virtual methods
.method public onDrawerClosed(Landroid/view/View;)V
    .locals 1

    const/4 p1, 0x0

    .line 443
    invoke-direct {p0, p1}, Ll/۟ᩳ;->֫(F)V

    const/4 p1, 0x0

    .line 498
    iget-object v0, p0, Ll/۟ᩳ;->᩸:Ll/ۨᩳ;

    invoke-interface {v0, p1}, Ll/ۨᩳ;->֫(I)V

    return-void
.end method

.method public onDrawerOpened(Landroid/view/View;)V
    .locals 1

    const/high16 p1, 0x3f800000    # 1.0f

    .line 428
    invoke-direct {p0, p1}, Ll/۟ᩳ;->֫(F)V

    const/4 p1, 0x0

    .line 498
    iget-object v0, p0, Ll/۟ᩳ;->᩸:Ll/ۨᩳ;

    invoke-interface {v0, p1}, Ll/ۨᩳ;->֫(I)V

    return-void
.end method

.method public onDrawerSlide(Landroid/view/View;F)V
    .locals 1

    const/high16 p1, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    .line 413
    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-direct {p0, p1}, Ll/۟ᩳ;->֫(F)V

    return-void
.end method

.method public final onDrawerStateChanged(I)V
    .locals 0

    return-void
.end method

.method public final ֫()Ll/ۚ᩻;
    .locals 1

    .line 370
    iget-object v0, p0, Ll/۟ᩳ;->ۙ:Ll/ۚ᩻;

    return-object v0
.end method

.method public final ۧ()V
    .locals 3

    .line 235
    iget-object v0, p0, Ll/۟ᩳ;->᩹:Ll/۬ۧ֫;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->ᩳ(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    .line 236
    invoke-direct {p0, v2}, Ll/۟ᩳ;->֫(F)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 238
    invoke-direct {p0, v2}, Ll/۟ᩳ;->֫(F)V

    .line 242
    :goto_0
    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->ᩳ(I)Z

    .line 488
    iget-boolean v0, p0, Ll/۟ᩳ;->ۗ:Z

    iget-object v1, p0, Ll/۟ᩳ;->᩸:Ll/ۨᩳ;

    if-nez v0, :cond_1

    invoke-interface {v1}, Ll/ۨᩳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 492
    iput-boolean v0, p0, Ll/۟ᩳ;->ۗ:Z

    .line 494
    :cond_1
    iget-object v0, p0, Ll/۟ᩳ;->ۙ:Ll/ۚ᩻;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Ll/ۨᩳ;->֫(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final ܽ()V
    .locals 4

    .line 281
    iget-object v0, p0, Ll/۟ᩳ;->᩹:Ll/۬ۧ֫;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->ܽ(I)I

    move-result v2

    .line 282
    invoke-virtual {v0}, Ll/۬ۧ֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    .line 284
    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->֫(I)V

    return-void

    :cond_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    .line 286
    invoke-virtual {v0, v1}, Ll/۬ۧ֫;->ܿ(I)V

    :cond_1
    return-void
.end method
