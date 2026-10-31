.class public final Ll/֫ܰۧ;
.super Landroid/database/DataSetObserver;
.source "I5V7"

# interfaces
.implements Ll/ۖܰۧ;
.implements Ll/ܺܰۧ;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/ܽܰۧ;


# direct methods
.method public constructor <init>(Ll/ܽܰۧ;)V
    .locals 0

    .line 475
    iput-object p1, p0, Ll/֫ܰۧ;->᩹:Ll/ܽܰۧ;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdapterChanged(Ll/֡ܰۧ;Ll/ۨ᩺ۧ;Ll/ۨ᩺ۧ;)V
    .locals 0

    .line 506
    iget-object p1, p0, Ll/֫ܰۧ;->᩹:Ll/ܽܰۧ;

    invoke-virtual {p1, p2, p3}, Ll/ܽܰۧ;->֫(Ll/ۨ᩺ۧ;Ll/ۨ᩺ۧ;)V

    return-void
.end method

.method public final onChanged()V
    .locals 4

    .line 511
    iget-object v0, p0, Ll/֫ܰۧ;->᩹:Ll/ܽܰۧ;

    iget-object v1, v0, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    .line 627
    iget v2, v1, Ll/֡ܰۧ;->۫:I

    .line 572
    iget-object v1, v1, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    .line 511
    invoke-virtual {v0, v2, v1}, Ll/ܽܰۧ;->֫(ILl/ۨ᩺ۧ;)V

    .line 513
    iget v1, v0, Ll/ܽܰۧ;->ۙ:F

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 514
    :goto_0
    iget-object v2, v0, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    .line 627
    iget v2, v2, Ll/֡ܰۧ;->۫:I

    const/4 v3, 0x1

    .line 514
    invoke-virtual {v0, v1, v3, v2}, Ll/ܽܰۧ;->֫(FZI)V

    return-void
.end method

.method public final onPageScrollStateChanged(I)V
    .locals 0

    .line 500
    iput p1, p0, Ll/֫ܰۧ;->᩸:I

    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 1

    const/high16 p3, 0x3f000000    # 0.5f

    cmpl-float p3, p2, p3

    if-lez p3, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 484
    :cond_0
    iget-object p3, p0, Ll/֫ܰۧ;->᩹:Ll/ܽܰۧ;

    const/4 v0, 0x0

    invoke-virtual {p3, p2, v0, p1}, Ll/ܽܰۧ;->֫(FZI)V

    return-void
.end method

.method public final onPageSelected(I)V
    .locals 3

    .line 489
    iget p1, p0, Ll/֫ܰۧ;->᩸:I

    if-nez p1, :cond_1

    .line 491
    iget-object p1, p0, Ll/֫ܰۧ;->᩹:Ll/ܽܰۧ;

    iget-object v0, p1, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    .line 627
    iget v1, v0, Ll/֡ܰۧ;->۫:I

    .line 572
    iget-object v0, v0, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    .line 491
    invoke-virtual {p1, v1, v0}, Ll/ܽܰۧ;->֫(ILl/ۨ᩺ۧ;)V

    .line 493
    iget v0, p1, Ll/ܽܰۧ;->ۙ:F

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 494
    :goto_0
    iget-object v1, p1, Ll/ܽܰۧ;->۫:Ll/֡ܰۧ;

    .line 627
    iget v1, v1, Ll/֡ܰۧ;->۫:I

    const/4 v2, 0x1

    .line 494
    invoke-virtual {p1, v0, v2, v1}, Ll/ܽܰۧ;->֫(FZI)V

    :cond_1
    return-void
.end method
