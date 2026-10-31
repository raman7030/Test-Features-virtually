.class public final Ll/ۙۙܿ;
.super Ljava/lang/Object;
.source "L9CC"


# instance fields
.field public final ֫:Landroid/view/View;

.field public final ۧ:Landroid/view/ContextThemeWrapper;

.field public final ܽ:I

.field public final synthetic ܿ:Ll/ۗۙܿ;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;Landroid/view/ContextThemeWrapper;I)V
    .locals 2

    .line 1524
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۙܿ;->ܿ:Ll/ۗۙܿ;

    .line 1525
    iput-object p2, p0, Ll/ۙۙܿ;->ۧ:Landroid/view/ContextThemeWrapper;

    .line 1526
    iput p3, p0, Ll/ۙۙܿ;->ܽ:I

    .line 1527
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0700c5

    .line 1528
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Ll/ۙۙܿ;->ᩳ:I

    const/4 v1, 0x0

    .line 1554
    invoke-static {p1, p2, v1, p3}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;Landroid/view/ContextThemeWrapper;Landroid/view/MenuItem;I)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    .line 1556
    invoke-virtual {p1, v0, p2, v0, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 1529
    iput-object p1, p0, Ll/ۙۙܿ;->֫:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/MenuItem;)I
    .locals 3

    .line 1546
    iget-object v0, p0, Ll/ۙۙܿ;->ܿ:Ll/ۗۙܿ;

    iget-object v1, p0, Ll/ۙۙܿ;->֫:Landroid/view/View;

    iget v2, p0, Ll/ۙۙܿ;->ܽ:I

    invoke-static {v0, v1, p1, v2}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;Landroid/view/View;Landroid/view/MenuItem;I)V

    const/4 p1, 0x0

    .line 1548
    invoke-virtual {v1, p1, p1}, Landroid/view/View;->measure(II)V

    .line 1550
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    return p1
.end method

.method public final ֫(Landroid/view/MenuItem;ILandroid/view/View;)Landroid/view/View;
    .locals 2

    .line 1533
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1534
    iget v0, p0, Ll/ۙۙܿ;->ܽ:I

    iget-object v1, p0, Ll/ۙۙܿ;->ܿ:Ll/ۗۙܿ;

    if-eqz p3, :cond_0

    .line 1535
    invoke-static {v1, p3, p1, v0}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;Landroid/view/View;Landroid/view/MenuItem;I)V

    goto :goto_0

    .line 1554
    :cond_0
    iget-object p3, p0, Ll/ۙۙܿ;->ۧ:Landroid/view/ContextThemeWrapper;

    invoke-static {v1, p3, p1, v0}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;Landroid/view/ContextThemeWrapper;Landroid/view/MenuItem;I)Landroid/view/View;

    move-result-object p3

    .line 1556
    iget p1, p0, Ll/ۙۙܿ;->ᩳ:I

    const/4 v0, 0x0

    invoke-virtual {p3, p1, v0, p1, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 427
    new-instance p1, Ll/ۧۙܿ;

    invoke-direct {p1, v1}, Ll/ۧۙܿ;-><init>(Ll/ۗۙܿ;)V

    invoke-virtual {p3, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1541
    :goto_0
    invoke-virtual {p3, p2}, Landroid/view/View;->setMinimumWidth(I)V

    return-object p3
.end method
