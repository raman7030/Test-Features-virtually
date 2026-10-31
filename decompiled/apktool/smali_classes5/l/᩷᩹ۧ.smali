.class public final Ll/᩷᩹ۧ;
.super Ll/ۗ۬ۧ;
.source "J63W"


# instance fields
.field public final ֫:Landroid/graphics/drawable/Drawable;

.field public final ۧ:Landroid/util/SparseArray;

.field public ܽ:Z

.field public ܿ:Landroid/content/res/ColorStateList;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 4

    .line 45
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 40
    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Ll/᩷᩹ۧ;->ۧ:Landroid/util/SparseArray;

    const v1, 0x1020016

    .line 47
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const v1, 0x1020010

    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const v1, 0x1020006

    .line 52
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const v1, 0x7f0a027f

    .line 53
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const v1, 0x102003e

    .line 55
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 54
    invoke-virtual {v0, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩹ۧ;->֫:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_0

    .line 59
    invoke-virtual {v2}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩹ۧ;->ܿ:Landroid/content/res/ColorStateList;

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Z)V
    .locals 0

    .line 111
    iput-boolean p1, p0, Ll/᩷᩹ۧ;->ܽ:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Ll/᩷᩹ۧ;->ܽ:Z

    return v0
.end method

.method public final ۧ(I)Landroid/view/View;
    .locals 2

    .line 78
    iget-object v0, p0, Ll/᩷᩹ۧ;->ۧ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    return-object v1

    .line 82
    :cond_0
    iget-object v1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 84
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1
    return-object v1
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 135
    iput-boolean p1, p0, Ll/᩷᩹ۧ;->ᩳ:Z

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 121
    iget-boolean v0, p0, Ll/᩷᩹ۧ;->ᩳ:Z

    return v0
.end method

.method public final ܽ()V
    .locals 3

    .line 144
    iget-object v0, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Ll/᩷᩹ۧ;->֫:Landroid/graphics/drawable/Drawable;

    if-eq v0, v1, :cond_0

    .line 145
    iget-object v0, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    sget v2, Ll/ܿ᩺;->֫:I

    .line 3370
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const v0, 0x1020016

    .line 148
    invoke-virtual {p0, v0}, Ll/᩷᩹ۧ;->ۧ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 149
    iget-object v1, p0, Ll/᩷᩹ۧ;->ܿ:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_1

    .line 150
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 151
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1
    return-void
.end method
