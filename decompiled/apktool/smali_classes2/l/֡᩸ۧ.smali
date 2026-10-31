.class public final Ll/֡᩸ۧ;
.super Ll/۟ۗۧ;
.source "I5JQ"


# instance fields
.field public ֫:Z

.field public ۧ:Landroid/graphics/drawable/Drawable;

.field public ܽ:I

.field public final synthetic ᩳ:Ll/᩸᩸ۧ;


# direct methods
.method public constructor <init>(Ll/᩸᩸ۧ;)V
    .locals 0

    .line 851
    iput-object p1, p0, Ll/֡᩸ۧ;->ᩳ:Ll/᩸᩸ۧ;

    invoke-direct {p0}, Ll/۟ۗۧ;-><init>()V

    const/4 p1, 0x1

    .line 849
    iput-boolean p1, p0, Ll/֡᩸ۧ;->֫:Z

    return-void
.end method

.method private ֫(Ll/۬۬ۧ;Landroid/view/View;)Z
    .locals 4

    .line 880
    invoke-virtual {p1, p2}, Ll/۬۬ۧ;->getChildViewHolder(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v0

    .line 881
    instance-of v1, v0, Ll/᩷᩹ۧ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Ll/᩷᩹ۧ;

    .line 882
    invoke-virtual {v0}, Ll/᩷᩹ۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 886
    iget-boolean v0, p0, Ll/֡᩸ۧ;->֫:Z

    .line 887
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p2

    .line 888
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    if-ge p2, v1, :cond_1

    add-int/2addr p2, v3

    .line 889
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    .line 890
    invoke-virtual {p1, p2}, Ll/۬۬ۧ;->getChildViewHolder(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object p1

    .line 891
    instance-of p2, p1, Ll/᩷᩹ۧ;

    if-eqz p2, :cond_0

    check-cast p1, Ll/᩷᩹ۧ;

    .line 892
    invoke-virtual {p1}, Ll/᩷᩹ۧ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    return v3

    :cond_0
    return v2

    :cond_1
    return v0

    :cond_2
    return v2
.end method


# virtual methods
.method public final getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Ll/۬۬ۧ;Ll/᩸۬ۧ;)V
    .locals 0

    .line 874
    invoke-direct {p0, p3, p2}, Ll/֡᩸ۧ;->֫(Ll/۬۬ۧ;Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 875
    iget p2, p0, Ll/֡᩸ۧ;->ܽ:I

    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    :cond_0
    return-void
.end method

.method public final onDrawOver(Landroid/graphics/Canvas;Ll/۬۬ۧ;Ll/᩸۬ۧ;)V
    .locals 6

    .line 856
    iget-object p3, p0, Ll/֡᩸ۧ;->ۧ:Landroid/graphics/drawable/Drawable;

    if-nez p3, :cond_0

    goto :goto_1

    .line 859
    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    .line 860
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p3, :cond_2

    .line 862
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 863
    invoke-direct {p0, p2, v3}, Ll/֡᩸ۧ;->֫(Ll/۬۬ۧ;Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 864
    invoke-virtual {v3}, Landroid/view/View;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v3, v4

    .line 865
    iget-object v4, p0, Ll/֡᩸ۧ;->ۧ:Landroid/graphics/drawable/Drawable;

    iget v5, p0, Ll/֡᩸ۧ;->ܽ:I

    add-int/2addr v5, v3

    invoke-virtual {v4, v1, v3, v0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 866
    iget-object v3, p0, Ll/֡᩸ۧ;->ۧ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 908
    iput p1, p0, Ll/֡᩸ۧ;->ܽ:I

    .line 909
    iget-object p1, p0, Ll/֡᩸ۧ;->ᩳ:Ll/᩸᩸ۧ;

    iget-object p1, p1, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    invoke-virtual {p1}, Ll/۬۬ۧ;->invalidateItemDecorations()V

    return-void
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 899
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Ll/֡᩸ۧ;->ܽ:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 901
    iput v0, p0, Ll/֡᩸ۧ;->ܽ:I

    .line 903
    :goto_0
    iput-object p1, p0, Ll/֡᩸ۧ;->ۧ:Landroid/graphics/drawable/Drawable;

    .line 904
    iget-object p1, p0, Ll/֡᩸ۧ;->ᩳ:Ll/᩸᩸ۧ;

    iget-object p1, p1, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    invoke-virtual {p1}, Ll/۬۬ۧ;->invalidateItemDecorations()V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 913
    iput-boolean p1, p0, Ll/֡᩸ۧ;->֫:Z

    return-void
.end method
