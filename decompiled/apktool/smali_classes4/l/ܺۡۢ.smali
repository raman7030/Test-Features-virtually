.class public final Ll/ܺۡۢ;
.super Ll/᩶ۗۧ;
.source "31PG"


# instance fields
.field public final synthetic ֫:Ll/۟ۡۢ;


# direct methods
.method public constructor <init>(Ll/۟ۡۢ;)V
    .locals 0

    .line 814
    iput-object p1, p0, Ll/ܺۡۢ;->֫:Ll/۟ۡۢ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 2

    .line 849
    iget-object v0, p0, Ll/ܺۡۢ;->֫:Ll/۟ۡۢ;

    invoke-static {v0}, Ll/۟ۡۢ;->ܿ(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0}, Ll/۟ۡۢ;->᩷(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 8

    .line 814
    check-cast p1, Ll/ܰۡۢ;

    .line 825
    iget-object v0, p0, Ll/ܺۡۢ;->֫:Ll/۟ۡۢ;

    invoke-static {v0}, Ll/۟ۡۢ;->ܿ(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt p2, v1, :cond_0

    .line 826
    invoke-static {v0}, Ll/۟ۡۢ;->᩷(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Ll/۟ۡۢ;->ܿ(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr p2, v2

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܽܺۢ;

    goto :goto_0

    .line 828
    :cond_0
    invoke-static {v0}, Ll/۟ۡۢ;->ܿ(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܽܺۢ;

    .line 830
    :goto_0
    iput-object p2, p1, Ll/ܰۡۢ;->ۗ:Ll/ܽܺۢ;

    iget-object v1, p1, Ll/ܰۡۢ;->ۙ:Landroid/widget/TextView;

    iget-object v2, p1, Ll/ܰۡۢ;->᩹:Landroid/widget/ImageView;

    .line 831
    iget-object v3, p2, Ll/ܽܺۢ;->᩶:Landroid/graphics/Bitmap;

    if-nez v3, :cond_1

    const v3, 0x7f0802b2

    .line 832
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 834
    :cond_1
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 835
    :goto_1
    new-instance v2, Landroid/text/SpannableString;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p2, Ll/ܽܺۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p2, Ll/ܽܺۢ;->᩺:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 836
    iget-object v3, p2, Ll/ܽܺۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    .line 837
    invoke-virtual {v2}, Landroid/text/SpannableString;->length()I

    move-result v4

    .line 838
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    sget v6, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v5, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v6, 0x11

    invoke-virtual {v2, v5, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 839
    new-instance v5, Landroid/text/style/RelativeSizeSpan;

    const v7, 0x3f4ccccd    # 0.8f

    invoke-direct {v5, v7}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v2, v5, v3, v4, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 840
    iget-object v3, p1, Ll/ܰۡۢ;->᩸:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 841
    iget-object v2, p1, Ll/ܰۡۢ;->᩶:Landroid/widget/TextView;

    iget-object v3, p2, Ll/ܽܺۢ;->۬:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 842
    iget-object p1, p1, Ll/ܰۡۢ;->۫:Landroid/widget/TextView;

    iget-wide v2, p2, Ll/ܽܺۢ;->ۛ:J

    invoke-static {v2, v3}, Ll/ܿۨۡ;->֫(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 843
    invoke-static {v0, p2, v1}, Ll/۟ۡۢ;->֫(Ll/۟ۡۢ;Ll/ܽܺۢ;Landroid/widget/TextView;)V

    .line 844
    iget-object p1, p2, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 1

    .line 819
    new-instance p2, Ll/ܰۡۢ;

    iget-object v0, p0, Ll/ܺۡۢ;->֫:Ll/۟ۡۢ;

    invoke-direct {p2, v0, p1}, Ll/ܰۡۢ;-><init>(Ll/۟ۡۢ;Landroid/view/ViewGroup;)V

    return-object p2
.end method
