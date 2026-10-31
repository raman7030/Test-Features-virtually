.class public final Ll/ۤۚᩳ;
.super Ll/᩶ۗۧ;
.source "75NJ"


# instance fields
.field public final synthetic ֫:Ll/ܽ֨ᩳ;


# direct methods
.method public constructor <init>(Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 1312
    iput-object p1, p0, Ll/ۤۚᩳ;->֫:Ll/ܽ֨ᩳ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 1361
    iget-object v0, p0, Ll/ۤۚᩳ;->֫:Ll/ܽ֨ᩳ;

    invoke-static {v0}, Ll/ܽ֨ᩳ;->᩻(Ll/ܽ֨ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 8

    .line 1312
    check-cast p1, Ll/ۧ֨ᩳ;

    .line 1323
    iget-object v0, p0, Ll/ۤۚᩳ;->֫:Ll/ܽ֨ᩳ;

    invoke-static {v0}, Ll/ܽ֨ᩳ;->᩻(Ll/ܽ֨ᩳ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܶᩳ;

    .line 1324
    invoke-virtual {v1}, Ll/֫ۘᩳ;->ܿ()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1325
    invoke-virtual {v1}, Ll/᩹ܶᩳ;->᩸()Ljava/lang/String;

    move-result-object v3

    .line 1326
    invoke-virtual {v1}, Ll/᩹ܶᩳ;->ܺ()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    .line 1327
    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1329
    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v6, 0x2

    invoke-direct {v3, v6}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v4}, Landroid/text/SpannableString;->length()I

    move-result v6

    const/16 v7, 0x11

    invoke-virtual {v4, v3, v5, v6, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    move-object v3, v4

    .line 1331
    :cond_0
    invoke-static {p1}, Ll/ۧ֨ᩳ;->ܿ(Ll/ۧ֨ᩳ;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1332
    invoke-static {v0}, Ll/ܽ֨ᩳ;->ܿ(Ll/ܽ֨ᩳ;)I

    move-result v3

    if-ne v3, p2, :cond_1

    .line 1333
    invoke-static {p1}, Ll/ۧ֨ᩳ;->ܿ(Ll/ۧ֨ᩳ;)Landroid/widget/TextView;

    move-result-object p2

    sget v3, Ll/᩹֡᩷;->֫:I

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1334
    invoke-static {p1}, Ll/ۧ֨ᩳ;->֫(Ll/ۧ֨ᩳ;)Landroid/view/View;

    move-result-object p2

    sget v3, Ll/᩹֡᩷;->֫:I

    const v4, 0x20ffffff

    and-int/2addr v3, v4

    invoke-virtual {p2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1335
    sget p2, Ll/᩹֡᩷;->֫:I

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, p2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 1337
    :cond_1
    invoke-static {p1}, Ll/ۧ֨ᩳ;->ܿ(Ll/ۧ֨ᩳ;)Landroid/widget/TextView;

    move-result-object p2

    sget-object v3, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 1338
    invoke-static {p1}, Ll/ۧ֨ᩳ;->֫(Ll/ۧ֨ᩳ;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1339
    sget p2, Ll/᩹֡᩷;->ܳ֫:I

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, p2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 1341
    :goto_0
    invoke-static {p1}, Ll/ۧ֨ᩳ;->ܽ(Ll/ۧ֨ᩳ;)Landroid/widget/ImageView;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2765
    :try_start_0
    invoke-virtual {v1}, Ll/֫ۘᩳ;->ܽ()Ll/ۙܶᩳ;

    move-result-object p2

    .line 63
    iget-object p2, p2, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    const/16 v2, 0x96

    .line 2765
    invoke-static {v2, p2}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 p2, 0x0

    :goto_1
    if-nez p2, :cond_2

    .line 1344
    invoke-static {p1}, Ll/ۧ֨ᩳ;->ܿ(Ll/ۧ֨ᩳ;)Landroid/widget/TextView;

    move-result-object p2

    const/high16 v2, 0x41880000    # 17.0f

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1345
    invoke-static {p1}, Ll/ۧ֨ᩳ;->ᩳ(Ll/ۧ֨ᩳ;)Landroid/widget/TextView;

    move-result-object p2

    const/16 v2, 0x8

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 1347
    :cond_2
    invoke-static {p1}, Ll/ۧ֨ᩳ;->ܿ(Ll/ۧ֨ᩳ;)Landroid/widget/TextView;

    move-result-object v2

    const/high16 v3, 0x41700000    # 15.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1348
    invoke-static {p1}, Ll/ۧ֨ᩳ;->ᩳ(Ll/ۧ֨ᩳ;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1349
    invoke-static {p1}, Ll/ۧ֨ᩳ;->ᩳ(Ll/ۧ֨ᩳ;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1351
    :goto_2
    invoke-virtual {v1}, Ll/֫ۘᩳ;->ۡ()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 1352
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    sget v1, Ll/᩹֡᩷;->᩻:I

    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_3

    .line 1354
    :cond_3
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p2, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1356
    :goto_3
    invoke-static {v0}, Ll/ܽ֨ᩳ;->ۢ(Ll/ܽ֨ᩳ;)Ll/ܽۢۡ;

    move-result-object p2

    invoke-static {p1}, Ll/ۧ֨ᩳ;->ۧ(Ll/ۧ֨ᩳ;)Landroid/widget/ImageView;

    move-result-object p1

    const/4 v0, 0x1

    .line 97
    invoke-virtual {p2, p1, v0}, Ll/ܽۢۡ;->֫(Landroid/widget/ImageView;Z)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    .line 1317
    iget-object p2, p0, Ll/ۤۚᩳ;->֫:Ll/ܽ֨ᩳ;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0119

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 1318
    new-instance v0, Ll/ۧ֨ᩳ;

    invoke-direct {v0, p2, p1}, Ll/ۧ֨ᩳ;-><init>(Ll/ܽ֨ᩳ;Landroid/view/View;)V

    return-object v0
.end method
