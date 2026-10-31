.class public final Ll/ۗۢܳ;
.super Ljava/lang/Object;
.source "I29D"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public final synthetic ܽ:Ll/۫ۢܳ;


# direct methods
.method public constructor <init>(Ll/۫ۢܳ;)V
    .locals 0

    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۢܳ;->ܽ:Ll/۫ۢܳ;

    return-void
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 8

    .line 282
    iget-boolean v0, p0, Ll/ۗۢܳ;->ۧ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 283
    :cond_0
    iget-object v0, p0, Ll/ۗۢܳ;->ܽ:Ll/۫ۢܳ;

    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    .line 284
    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    if-gtz v3, :cond_1

    return v4

    .line 286
    :cond_1
    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v5

    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v6

    invoke-virtual {v6}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v6

    sub-int v6, p1, v6

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 287
    iget-boolean v6, p0, Ll/ۗۢܳ;->֫:Z

    if-nez v6, :cond_3

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v6

    if-le v6, v2, :cond_2

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v6

    add-int v7, v2, v3

    if-lt v6, v7, :cond_3

    .line 289
    :cond_2
    iput-boolean v1, p0, Ll/ۗۢܳ;->֫:Z

    .line 290
    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢۢۡ;->setSelection(I)V

    return v4

    .line 293
    :cond_3
    iput-boolean v1, p0, Ll/ۗۢܳ;->ۧ:Z

    if-nez v5, :cond_4

    goto :goto_0

    .line 295
    :cond_4
    iget-boolean v6, p0, Ll/ۗۢܳ;->֫:Z

    if-eqz v6, :cond_5

    .line 297
    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v0

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v1

    sub-int/2addr v3, v1

    div-int/lit8 v3, v3, 0x2

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/widget/AbsListView;->setSelectionFromTop(II)V

    return v4

    .line 298
    :cond_5
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v6

    if-lt v6, v2, :cond_7

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v6

    add-int v7, v2, v3

    if-le v6, v7, :cond_6

    goto :goto_1

    :cond_6
    :goto_0
    return v1

    .line 299
    :cond_7
    :goto_1
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v1

    if-ge v1, v2, :cond_8

    const/4 v1, 0x0

    goto :goto_2

    :cond_8
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v1

    sub-int/2addr v3, v1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 300
    :goto_2
    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Landroid/widget/AbsListView;->setSelectionFromTop(II)V

    return v4
.end method
