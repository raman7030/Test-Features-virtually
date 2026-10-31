.class public final Ll/ۧ۟ۧ;
.super Ll/ۜۗۧ;
.source "F1OQ"


# instance fields
.field public final synthetic ֫:Ll/ۖ۟ۧ;


# direct methods
.method public constructor <init>(Ll/ۖ۟ۧ;Landroid/content/Context;)V
    .locals 0

    .line 1008
    iput-object p1, p0, Ll/ۧ۟ۧ;->֫:Ll/ۖ۟ۧ;

    .line 1009
    invoke-direct {p0, p2}, Ll/ۜۗۧ;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final calculateExtraLayoutSpace(Ll/᩸۬ۧ;[I)V
    .locals 3

    .line 1039
    iget-object v0, p0, Ll/ۧ۟ۧ;->֫:Ll/ۖ۟ۧ;

    invoke-virtual {v0}, Ll/ۖ۟ۧ;->ܽ()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 1042
    invoke-super {p0, p1, p2}, Ll/ۜۗۧ;->calculateExtraLayoutSpace(Ll/᩸۬ۧ;[I)V

    return-void

    .line 564
    :cond_0
    iget-object p1, v0, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    .line 565
    invoke-virtual {v0}, Ll/ۖ۟ۧ;->ᩳ()I

    move-result v0

    if-nez v0, :cond_1

    .line 566
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result p1

    goto :goto_0

    .line 567
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result p1

    :goto_0
    sub-int/2addr v0, p1

    mul-int v0, v0, v1

    const/4 p1, 0x0

    .line 1046
    aput v0, p2, p1

    const/4 p1, 0x1

    .line 1047
    aput v0, p2, p1

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Ll/ܳ۟;)V
    .locals 0

    .line 1024
    invoke-super {p0, p1, p2, p3}, Ll/ܿ۬ۧ;->onInitializeAccessibilityNodeInfo(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Ll/ܳ۟;)V

    .line 1025
    iget-object p1, p0, Ll/ۧ۟ۧ;->֫:Ll/ۖ۟ۧ;

    iget-object p1, p1, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfoForItem(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Landroid/view/View;Ll/ܳ۟;)V
    .locals 6

    .line 1033
    iget-object p1, p0, Ll/ۧ۟ۧ;->֫:Ll/ۖ۟ۧ;

    iget-object p1, p1, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    .line 1582
    iget-object p1, p1, Ll/᩻۟ۧ;->ܽ:Ll/ۖ۟ۧ;

    invoke-virtual {p1}, Ll/ۖ۟ۧ;->ᩳ()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 1583
    iget-object p2, p1, Ll/ۖ۟ۧ;->۬:Ll/ۜۗۧ;

    invoke-virtual {p2, p3}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result p2

    move v0, p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 1585
    :goto_0
    invoke-virtual {p1}, Ll/ۖ۟ۧ;->ᩳ()I

    move-result p2

    if-nez p2, :cond_1

    .line 1586
    iget-object p1, p1, Ll/ۖ۟ۧ;->۬:Ll/ۜۗۧ;

    invoke-virtual {p1, p3}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result p1

    move v2, p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    const/4 v2, 0x0

    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x1

    .line 1589
    invoke-static/range {v0 .. v5}, Ll/ᩳ۟;->֫(IIIIZZ)Ll/ᩳ۟;

    move-result-object p1

    .line 1591
    invoke-virtual {p4, p1}, Ll/ܳ۟;->֫(Ll/ᩳ۟;)V

    return-void
.end method

.method public final performAccessibilityAction(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;ILandroid/os/Bundle;)Z
    .locals 1

    .line 1015
    iget-object v0, p0, Ll/ۧ۟ۧ;->֫:Ll/ۖ۟ۧ;

    iget-object v0, v0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1018
    invoke-super {p0, p1, p2, p3, p4}, Ll/ܿ۬ۧ;->performAccessibilityAction(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final requestChildRectangleOnScreen(Ll/۬۬ۧ;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
