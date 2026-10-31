.class public final Ll/᩻۟ۧ;
.super Ll/۟ܰۧ;
.source "F1OQ"


# instance fields
.field public final ֫:Ll/ۚ۟;

.field public final ۧ:Ll/ۚ۟;

.field public final synthetic ܽ:Ll/ۖ۟ۧ;


# direct methods
.method public constructor <init>(Ll/ۖ۟ۧ;)V
    .locals 0

    .line 1235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1347
    iput-object p1, p0, Ll/᩻۟ۧ;->ܽ:Ll/ۖ۟ۧ;

    .line 1348
    new-instance p1, Ll/ᩳ۟ۧ;

    invoke-direct {p1, p0}, Ll/ᩳ۟ۧ;-><init>(Ll/᩻۟ۧ;)V

    iput-object p1, p0, Ll/᩻۟ۧ;->ۧ:Ll/ۚ۟;

    .line 1359
    new-instance p1, Ll/ܿ۟ۧ;

    invoke-direct {p1, p0}, Ll/ܿ۟ۧ;-><init>(Ll/᩻۟ۧ;)V

    iput-object p1, p0, Ll/᩻۟ۧ;->֫:Ll/ۚ۟;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 10

    const v0, 0x1020048

    .line 1515
    iget-object v1, p0, Ll/᩻۟ۧ;->ܽ:Ll/ۖ۟ۧ;

    invoke-static {v0, v1}, Ll/ܿ᩺;->ᩳ(ILandroid/view/View;)V

    const v2, 0x1020049

    .line 1516
    invoke-static {v2, v1}, Ll/ܿ᩺;->ᩳ(ILandroid/view/View;)V

    const v2, 0x1020046

    .line 1517
    invoke-static {v2, v1}, Ll/ܿ᩺;->ᩳ(ILandroid/view/View;)V

    const v3, 0x1020047

    .line 1518
    invoke-static {v3, v1}, Ll/ܿ᩺;->ᩳ(ILandroid/view/View;)V

    .line 490
    iget-object v4, v1, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v4}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v4

    if-nez v4, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v4, v1, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    invoke-virtual {v4}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v4

    .line 1524
    invoke-virtual {v4}, Ll/᩶ۗۧ;->getItemCount()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_2

    .line 1529
    :cond_1
    invoke-virtual {v1}, Ll/ۖ۟ۧ;->ܳ()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    .line 1533
    :cond_2
    invoke-virtual {v1}, Ll/ۖ۟ۧ;->ᩳ()I

    move-result v5

    iget-object v6, p0, Ll/᩻۟ۧ;->֫:Ll/ۚ۟;

    iget-object v7, p0, Ll/᩻۟ۧ;->ۧ:Ll/ۚ۟;

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v5, :cond_7

    .line 586
    iget-object v2, v1, Ll/ۖ۟ۧ;->۬:Ll/ۜۗۧ;

    invoke-virtual {v2}, Ll/ܿ۬ۧ;->getLayoutDirection()I

    move-result v2

    if-ne v2, v8, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    const v3, 0x1020048

    goto :goto_1

    :cond_4
    const v3, 0x1020049

    :goto_1
    if-eqz v2, :cond_5

    const v0, 0x1020049

    .line 1538
    :cond_5
    iget v2, v1, Ll/ۖ۟ۧ;->᩹:I

    sub-int/2addr v4, v8

    if-ge v2, v4, :cond_6

    .line 1539
    new-instance v2, Ll/ܰܰ;

    invoke-direct {v2, v3, v9}, Ll/ܰܰ;-><init>(ILjava/lang/String;)V

    invoke-static {v1, v2, v9, v7}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܰܰ;Ljava/lang/String;Ll/ۚ۟;)V

    .line 1543
    :cond_6
    iget v2, v1, Ll/ۖ۟ۧ;->᩹:I

    if-lez v2, :cond_9

    .line 1544
    new-instance v2, Ll/ܰܰ;

    invoke-direct {v2, v0, v9}, Ll/ܰܰ;-><init>(ILjava/lang/String;)V

    invoke-static {v1, v2, v9, v6}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܰܰ;Ljava/lang/String;Ll/ۚ۟;)V

    return-void

    .line 1549
    :cond_7
    iget v0, v1, Ll/ۖ۟ۧ;->᩹:I

    sub-int/2addr v4, v8

    if-ge v0, v4, :cond_8

    .line 1550
    new-instance v0, Ll/ܰܰ;

    invoke-direct {v0, v3, v9}, Ll/ܰܰ;-><init>(ILjava/lang/String;)V

    invoke-static {v1, v0, v9, v7}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܰܰ;Ljava/lang/String;Ll/ۚ۟;)V

    .line 1554
    :cond_8
    iget v0, v1, Ll/ۖ۟ۧ;->᩹:I

    if-lez v0, :cond_9

    .line 1555
    new-instance v0, Ll/ܰܰ;

    invoke-direct {v0, v2, v9}, Ll/ܰܰ;-><init>(ILjava/lang/String;)V

    invoke-static {v1, v0, v9, v6}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܰܰ;Ljava/lang/String;Ll/ۚ۟;)V

    :cond_9
    :goto_2
    return-void
.end method
