.class public Ll/᩹ܰ;
.super Ll/۬ܰ;
.source "XAMH"


# instance fields
.field public final ֫:Ll/ۖۨ;

.field public final ۧ:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/Window;Ll/ۖۨ;)V
    .locals 0

    .line 388
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 445
    iput-object p1, p0, Ll/᩹ܰ;->ۧ:Landroid/view/Window;

    .line 446
    iput-object p2, p0, Ll/᩹ܰ;->֫:Ll/ۖۨ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_4

    and-int v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    if-eq v1, v0, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/16 v2, 0x8

    if-eq v1, v2, :cond_1

    goto :goto_1

    .line 494
    :cond_1
    iget-object v2, p0, Ll/᩹ܰ;->֫:Ll/ۖۨ;

    invoke-virtual {v2}, Ll/ۖۨ;->֫()V

    goto :goto_1

    .line 491
    :cond_2
    invoke-virtual {p0, v2}, Ll/᩹ܰ;->ᩳ(I)V

    goto :goto_1

    :cond_3
    const/4 v2, 0x4

    .line 488
    invoke-virtual {p0, v2}, Ll/᩹ܰ;->ᩳ(I)V

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ۧ(I)V
    .locals 3

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    const/16 v1, 0x1000

    const/16 v2, 0x800

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    return-void

    .line 534
    :cond_0
    invoke-virtual {p0, v2}, Ll/᩹ܰ;->ܿ(I)V

    .line 535
    invoke-virtual {p0, v1}, Ll/᩹ܰ;->ᩳ(I)V

    return-void

    .line 530
    :cond_1
    invoke-virtual {p0, v1}, Ll/᩹ܰ;->ܿ(I)V

    .line 531
    invoke-virtual {p0, v2}, Ll/᩹ܰ;->ᩳ(I)V

    return-void

    :cond_2
    const/16 p1, 0x1800

    .line 538
    invoke-virtual {p0, p1}, Ll/᩹ܰ;->ܿ(I)V

    return-void
.end method

.method public final ܽ(I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_4

    and-int v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    if-eq v1, v0, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/16 v2, 0x8

    if-eq v1, v2, :cond_1

    goto :goto_1

    .line 470
    :cond_1
    iget-object v2, p0, Ll/᩹ܰ;->֫:Ll/ۖۨ;

    invoke-virtual {v2}, Ll/ۖۨ;->ۧ()V

    goto :goto_1

    .line 467
    :cond_2
    invoke-virtual {p0, v2}, Ll/᩹ܰ;->ܿ(I)V

    goto :goto_1

    :cond_3
    const/4 v2, 0x4

    .line 463
    invoke-virtual {p0, v2}, Ll/᩹ܰ;->ܿ(I)V

    const/16 v2, 0x400

    .line 517
    iget-object v3, p0, Ll/᩹ܰ;->ۧ:Landroid/view/Window;

    invoke-virtual {v3, v2}, Landroid/view/Window;->clearFlags(I)V

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ܿ(I)V
    .locals 2

    .line 506
    iget-object v0, p0, Ll/᩹ܰ;->ۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 508
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    not-int p1, p1

    and-int/2addr p1, v1

    .line 507
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method public final ᩳ(I)V
    .locals 2

    .line 499
    iget-object v0, p0, Ll/᩹ܰ;->ۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 501
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    or-int/2addr p1, v1

    .line 500
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method
