.class public final Ll/ۤ᩵᩷;
.super Ll/ۗ۬ۧ;
.source "6AY4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ۗ:Landroid/view/View;

.field public final ۙ:Landroid/widget/TextView;

.field public final synthetic ۫:Ll/᩵֡᩷;

.field public final ۬:Landroid/widget/TextView;

.field public final ᩶:Landroid/widget/ImageView;

.field public final ᩸:Landroid/view/View;

.field public ᩹:Ll/ᩳۜܳ;


# direct methods
.method public constructor <init>(Ll/᩵֡᩷;Landroid/view/ViewGroup;)V
    .locals 2

    .line 1833
    iput-object p1, p0, Ll/ۤ᩵᩷;->۫:Ll/᩵֡᩷;

    .line 1835
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d0135

    const/4 v1, 0x0

    .line 1836
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 1833
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 1839
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a03d3

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll/ۤ᩵᩷;->ۗ:Landroid/view/View;

    .line 1840
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const v0, 0x7f0a010e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll/ۤ᩵᩷;->᩸:Landroid/view/View;

    .line 1841
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const v0, 0x7f0a0278

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ۤ᩵᩷;->᩶:Landroid/widget/ImageView;

    .line 1842
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const v0, 0x7f0a03d6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۤ᩵᩷;->۬:Landroid/widget/TextView;

    .line 1843
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const v0, 0x7f0a028b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۤ᩵᩷;->ۙ:Landroid/widget/TextView;

    .line 1846
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1850
    iget-object p1, p0, Ll/ۤ᩵᩷;->۫:Ll/᩵֡᩷;

    invoke-static {p1}, Ll/᩵֡᩷;->۠(Ll/᩵֡᩷;)Ll/۫ۤۧ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ll/۫ۤۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 1853
    :cond_0
    invoke-static {p1}, Ll/᩵֡᩷;->᩹(Ll/᩵֡᩷;)Ll/ܽܽ᩻;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 1855
    :cond_1
    invoke-virtual {p0}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v2

    invoke-interface {v2}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1856
    invoke-static {p1}, Ll/᩵֡᩷;->ܿ(Ll/᩵֡᩷;)V

    return-void

    .line 1859
    :cond_2
    invoke-virtual {p0}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v2

    invoke-interface {v2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1860
    iget-object v1, v0, Ll/ܽ᩷ܳ;->ۜ:Ll/ۧ᩷ܳ;

    iget-object v1, v1, Ll/ۧ᩷ܳ;->֫:Ll/ۖ᩵;

    const-string v2, "backPositionMap"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ll/᩵֡᩷;->᩸(Ll/᩵֡᩷;)Ll/ᩳ֡᩷;

    move-result-object v2

    invoke-virtual {v2}, Ll/ᩳ֡᩷;->֫()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1861
    invoke-virtual {p0}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1861
    invoke-static {p1, v0}, Ll/᩵֡᩷;->ܽ(Ll/᩵֡᩷;Ljava/lang/String;)V

    return-void

    .line 1865
    :cond_3
    invoke-static {p1}, Ll/᩵֡᩷;->ܶ(Ll/᩵֡᩷;)I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_b

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 1872
    invoke-virtual {p0}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v0

    .line 760
    invoke-interface {v0}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1873
    invoke-virtual {p0}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳۜܳ;->isChecked()Z

    move-result v1

    xor-int/2addr v1, v2

    invoke-interface {v0, v1}, Ll/ᩳۜܳ;->setChecked(Z)V

    .line 1874
    invoke-static {p1, p0}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;Ll/ۤ᩵᩷;)V

    .line 1875
    invoke-static {p1}, Ll/᩵֡᩷;->᩶(Ll/᩵֡᩷;)V

    :cond_4
    :goto_0
    return-void

    .line 1893
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 1880
    :cond_6
    invoke-virtual {p0}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1881
    invoke-static {p1}, Ll/᩵֡᩷;->ۢ(Ll/᩵֡᩷;)Landroid/widget/EditText;

    move-result-object v2

    const-string v3, "filenameEditText"

    if-eqz v2, :cond_a

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1882
    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-static {v0}, Ll/ۗۙ᩵;->ۧ(Ljava/lang/String;)I

    move-result v2

    const/4 v4, -0x1

    if-ne v2, v4, :cond_7

    .line 1884
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    .line 1886
    :cond_7
    invoke-static {p1}, Ll/᩵֡᩷;->ۢ(Ll/᩵֡᩷;)Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_9

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v2}, Landroid/widget/EditText;->setSelection(II)V

    .line 1887
    invoke-static {p1}, Ll/᩵֡᩷;->ۢ(Ll/᩵֡᩷;)Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Ll/ۙ᩸᩷;->ܽ(Landroid/view/View;)V

    .line 1888
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v0

    invoke-static {p1, v0}, Ll/᩵֡᩷;->ۧ(Ll/᩵֡᩷;I)V

    .line 1889
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 v2, 0x1f4

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-static {p1, v0, v1}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;J)V

    return-void

    .line 1887
    :cond_8
    invoke-static {v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1

    .line 1886
    :cond_9
    invoke-static {v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1

    .line 1881
    :cond_a
    invoke-static {v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1

    .line 1867
    :cond_b
    invoke-virtual {p0}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getPath(...)"

    invoke-static {v0, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-static {v0, v1}, Ll/ۡᩴܳ;->֫(Ljava/lang/String;Ll/ܿᩴܳ;)V

    .line 1868
    invoke-virtual {p0}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;Ljava/lang/String;)V

    return-void

    :cond_c
    const-string p1, "swipeRefreshLayout"

    .line 1850
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫()Landroid/view/View;
    .locals 1

    .line 1840
    iget-object v0, p0, Ll/ۤ᩵᩷;->᩸:Landroid/view/View;

    return-object v0
.end method

.method public final ۧ()Ll/ᩳۜܳ;
    .locals 1

    .line 1838
    iget-object v0, p0, Ll/ۤ᩵᩷;->᩹:Ll/ᩳۜܳ;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "fileItem"

    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final ܳ()Landroid/widget/TextView;
    .locals 1

    .line 1842
    iget-object v0, p0, Ll/ۤ᩵᩷;->۬:Landroid/widget/TextView;

    return-object v0
.end method

.method public final ܽ()Landroid/widget/ImageView;
    .locals 1

    .line 1841
    iget-object v0, p0, Ll/ۤ᩵᩷;->᩶:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final ܿ()Landroid/view/View;
    .locals 1

    .line 1839
    iget-object v0, p0, Ll/ۤ᩵᩷;->ۗ:Landroid/view/View;

    return-object v0
.end method

.method public final ᩳ()Landroid/widget/TextView;
    .locals 1

    .line 1843
    iget-object v0, p0, Ll/ۤ᩵᩷;->ۙ:Landroid/widget/TextView;

    return-object v0
.end method
