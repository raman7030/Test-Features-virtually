.class public final Ll/ۜ᩶᩷;
.super Ll/ۗ۬ۧ;
.source "V933"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ᩸:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 231
    new-instance v0, Ll/ᩳۡ;

    invoke-direct {v0, p1}, Ll/ᩳۡ;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const/high16 v0, 0x42000000    # 32.0f

    .line 232
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    .line 233
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/high16 v0, 0x41400000    # 12.0f

    .line 234
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 235
    iget-object v0, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 236
    iget-object v0, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-static {p1}, Ll/᩶ۖ᩷;->ۧ(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 237
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 238
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ۜ᩶᩷;->᩸:Landroid/widget/ImageView;

    .line 239
    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜ᩶᩷;)Landroid/widget/ImageView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜ᩶᩷;->᩸:Landroid/widget/ImageView;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 244
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapter()Ll/᩶ۗۧ;

    move-result-object p1

    instance-of v0, p1, Ll/᩻᩶᩷;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩻᩶᩷;

    .line 245
    invoke-static {p1}, Ll/᩻᩶᩷;->֫(Ll/᩻᩶᩷;)Ll/۬ۤ;

    move-result-object v0

    invoke-static {p1}, Ll/᩻᩶᩷;->ۧ(Ll/᩻᩶᩷;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ۖܳ;

    check-cast v0, Ll/ᩳ᩶᩷;

    invoke-virtual {v0, p1}, Ll/ᩳ᩶᩷;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
