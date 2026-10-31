.class public abstract Ll/۟ۗۧ;
.super Ljava/lang/Object;
.source "Y6A7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11515
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;ILl/۬۬ۧ;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p2, 0x0

    .line 11564
    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Ll/۬۬ۧ;Ll/᩸۬ۧ;)V
    .locals 0

    .line 11589
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Ll/ܳ۬ۧ;

    .line 12605
    iget-object p2, p2, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getLayoutPosition()I

    move-result p2

    .line 11589
    invoke-virtual {p0, p1, p2, p3}, Ll/۟ۗۧ;->getItemOffsets(Landroid/graphics/Rect;ILl/۬۬ۧ;)V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;Ll/۬۬ۧ;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;Ll/۬۬ۧ;Ll/᩸۬ۧ;)V
    .locals 0

    .line 11526
    invoke-virtual {p0, p1, p2}, Ll/۟ۗۧ;->onDraw(Landroid/graphics/Canvas;Ll/۬۬ۧ;)V

    return-void
.end method

.method public onDrawOver(Landroid/graphics/Canvas;Ll/۬۬ۧ;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onDrawOver(Landroid/graphics/Canvas;Ll/۬۬ۧ;Ll/᩸۬ۧ;)V
    .locals 0

    .line 11547
    invoke-virtual {p0, p1, p2}, Ll/۟ۗۧ;->onDrawOver(Landroid/graphics/Canvas;Ll/۬۬ۧ;)V

    return-void
.end method
