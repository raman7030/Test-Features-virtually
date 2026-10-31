.class public final Ll/᩻ۙܽ;
.super Ll/᩶ۗۧ;
.source "28VT"


# instance fields
.field public final synthetic ֫:Ll/᩹ۙܽ;

.field public ۧ:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ll/᩹ۙܽ;)V
    .locals 0

    .line 270
    iput-object p1, p0, Ll/᩻ۙܽ;->֫:Ll/᩹ۙܽ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 271
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ۙܽ;->ۧ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 3

    .line 364
    iget-object v0, p0, Ll/᩻ۙܽ;->֫:Ll/᩹ۙܽ;

    invoke-static {v0}, Ll/᩹ۙܽ;->ۡ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-static {v0}, Ll/᩹ۙܽ;->ۜ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final getItemViewType(I)I
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 282
    iget-object v0, p0, Ll/᩻ۙܽ;->֫:Ll/᩹ۙܽ;

    invoke-static {v0}, Ll/᩹ۙܽ;->ۡ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-ge p1, v0, :cond_1

    goto :goto_0

    :cond_1
    sub-int/2addr p1, v0

    if-nez p1, :cond_2

    return v1

    :cond_2
    :goto_0
    const/4 p1, 0x2

    return p1
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 7

    .line 307
    instance-of v0, p1, Ll/᩸ۙܽ;

    if-eqz v0, :cond_6

    check-cast p1, Ll/᩸ۙܽ;

    add-int/lit8 v0, p2, -0x1

    .line 309
    iget-object v1, p0, Ll/᩻ۙܽ;->֫:Ll/᩹ۙܽ;

    invoke-static {v1}, Ll/᩹ۙܽ;->ۡ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    const v4, 0x7f1206eb

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_1

    if-nez v0, :cond_0

    .line 311
    invoke-static {p1}, Ll/᩸ۙܽ;->֫(Ll/᩸ۙܽ;)Landroid/widget/ImageView;

    move-result-object p2

    invoke-static {v1}, Ll/᩹ۙܽ;->᩻(Ll/᩹ۙܽ;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 312
    invoke-static {p1}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setText(I)V

    .line 313
    invoke-static {p1}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object p2

    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 314
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p2, v5}, Landroid/view/View;->setClickable(Z)V

    .line 315
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, v5}, Landroid/view/View;->setLongClickable(Z)V

    return-void

    :cond_0
    add-int/lit8 p2, p2, -0x3

    goto :goto_1

    .line 319
    :cond_1
    invoke-static {v1}, Ll/᩹ۙܽ;->ۡ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_3

    .line 320
    invoke-static {v1}, Ll/᩹ۙܽ;->ۡ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۬ܿᩳ;

    .line 321
    invoke-static {p1}, Ll/᩸ۙܽ;->֫(Ll/᩸ۙܽ;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v1}, Ll/᩹ۙܽ;->᩻(Ll/᩹ۙܽ;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 322
    invoke-static {p1}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 323
    invoke-static {v1}, Ll/᩹ۙܽ;->ᩳ(Ll/᩹ۙܽ;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Ll/۬ܿᩳ;->ۢ()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1}, Ll/᩹ۙܽ;->ᩳ(Ll/᩹ۙܽ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 324
    invoke-static {p1}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object p2

    sget v0, Ll/᩹֡᩷;->ܿ֫:I

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 325
    invoke-static {v1, v3}, Ll/᩹ۙܽ;->ۧ(Ll/᩹ۙܽ;Ljava/lang/String;)V

    goto :goto_0

    .line 327
    :cond_2
    invoke-static {p1}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object p2

    sget-object v0, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 329
    :goto_0
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p2, v6}, Landroid/view/View;->setClickable(Z)V

    .line 330
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, v6}, Landroid/view/View;->setLongClickable(Z)V

    return-void

    .line 333
    :cond_3
    invoke-static {v1}, Ll/᩹ۙܽ;->ۡ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/2addr p2, v6

    sub-int p2, v0, p2

    .line 335
    :goto_1
    invoke-static {v1}, Ll/᩹ۙܽ;->ۜ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p2, :cond_6

    .line 337
    invoke-static {p1}, Ll/᩸ۙܽ;->֫(Ll/᩸ۙܽ;)Landroid/widget/ImageView;

    move-result-object p2

    invoke-static {v1}, Ll/᩹ۙܽ;->ܳ(Ll/᩹ۙܽ;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 338
    invoke-static {p1}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setText(I)V

    .line 339
    invoke-static {p1}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object p2

    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 340
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p2, v5}, Landroid/view/View;->setClickable(Z)V

    .line 341
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, v5}, Landroid/view/View;->setLongClickable(Z)V

    return-void

    .line 344
    :cond_4
    invoke-static {v1}, Ll/᩹ۙܽ;->ۜ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_6

    .line 345
    invoke-static {v1}, Ll/᩹ۙܽ;->ۜ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܶ᩵ܿ;

    .line 346
    invoke-static {p1}, Ll/᩸ۙܽ;->֫(Ll/᩸ۙܽ;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v1}, Ll/᩹ۙܽ;->ܳ(Ll/᩹ۙܽ;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 347
    invoke-static {p1}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 348
    invoke-static {v1}, Ll/᩹ۙܽ;->ܿ(Ll/᩹ۙܽ;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1}, Ll/᩹ۙܽ;->ܿ(Ll/᩹ۙܽ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 349
    invoke-static {p1}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object p2

    sget v0, Ll/᩹֡᩷;->ܿ֫:I

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 350
    invoke-static {v1, v3}, Ll/᩹ۙܽ;->ܽ(Ll/᩹ۙܽ;Ljava/lang/String;)V

    goto :goto_2

    .line 352
    :cond_5
    invoke-static {p1}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object p2

    sget-object v0, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 354
    :goto_2
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p2, v6}, Landroid/view/View;->setClickable(Z)V

    .line 355
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, v6}, Landroid/view/View;->setLongClickable(Z)V

    :cond_6
    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 293
    iget-object v2, p0, Ll/᩻ۙܽ;->֫:Ll/᩹ۙܽ;

    if-eqz p2, :cond_1

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 298
    :cond_0
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d015e

    .line 299
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 300
    new-instance p2, Ll/᩸ۙܽ;

    invoke-direct {p2, v2, p1}, Ll/᩸ۙܽ;-><init>(Ll/᩹ۙܽ;Landroid/view/View;)V

    .line 301
    iget-object p1, p0, Ll/᩻ۙܽ;->ۧ:Ljava/util/Set;

    invoke-static {p2}, Ll/᩸ۙܽ;->ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p2

    .line 294
    :cond_1
    :goto_0
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v4, 0x7f0d015f

    .line 295
    invoke-virtual {v3, v4, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 296
    new-instance v1, Ll/᩷ۙܽ;

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-direct {v1, v2, p1, v0}, Ll/᩷ۙܽ;-><init>(Ll/᩹ۙܽ;Landroid/view/View;Z)V

    return-object v1
.end method

.method public final ֫()V
    .locals 4

    .line 368
    iget-object v0, p0, Ll/᩻ۙܽ;->ۧ:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 369
    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v2

    sget v3, Ll/᩹֡᩷;->ܿ֫:I

    if-ne v2, v3, :cond_0

    .line 370
    sget-object v2, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_1
    return-void
.end method
