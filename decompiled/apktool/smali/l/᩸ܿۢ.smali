.class public final Ll/᩸ܿۢ;
.super Landroid/widget/BaseAdapter;
.source "SBMC"


# instance fields
.field public ᩸:Ljava/lang/String;

.field public final synthetic ᩹:Ll/᩶ܿۢ;


# direct methods
.method public constructor <init>(Ll/᩶ܿۢ;)V
    .locals 0

    .line 978
    iput-object p1, p0, Ll/᩸ܿۢ;->᩹:Ll/᩶ܿۢ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 2

    .line 1023
    iget-object v0, p0, Ll/᩸ܿۢ;->᩹:Ll/᩶ܿۢ;

    invoke-static {v0}, Ll/᩶ܿۢ;->ᩴ(Ll/᩶ܿۢ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/᩶ܿۢ;->᩵(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll/᩶ܿۢ;->ܺ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 2

    .line 1028
    iget-object v0, p0, Ll/᩸ܿۢ;->᩹:Ll/᩶ܿۢ;

    invoke-static {v0}, Ll/᩶ܿۢ;->ᩴ(Ll/᩶ܿۢ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/᩶ܿۢ;->᩵(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll/᩶ܿۢ;->ܺ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 1040
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩹ܿۢ;

    goto :goto_0

    :cond_0
    const p2, 0x7f0d0150

    .line 0
    invoke-static {p3, p2, p3, v0}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 1044
    new-instance p3, Ll/᩹ܿۢ;

    invoke-direct {p3}, Ll/᩹ܿۢ;-><init>()V

    const v1, 0x7f0a05e2

    .line 1045
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p3, Ll/᩹ܿۢ;->ܽ:Landroid/widget/TextView;

    const v1, 0x7f0a05ef

    .line 1046
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p3, Ll/᩹ܿۢ;->֫:Landroid/widget/TextView;

    const v1, 0x7f0a0278

    .line 1047
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p3, Ll/᩹ܿۢ;->ۧ:Landroid/widget/ImageView;

    .line 1048
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1051
    :goto_0
    iget-object v1, p0, Ll/᩸ܿۢ;->᩹:Ll/᩶ܿۢ;

    invoke-static {v1}, Ll/᩶ܿۢ;->ᩴ(Ll/᩶ܿۢ;)Z

    move-result v2

    const/16 v3, 0xc8

    if-eqz v2, :cond_2

    .line 1052
    invoke-static {v1}, Ll/᩶ܿۢ;->᩵(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢۧۢ;

    .line 1053
    invoke-static {v1}, Ll/᩶ܿۢ;->᩻(Ll/᩶ܿۢ;)Ll/ۢۧۢ;

    move-result-object v2

    if-ne p1, v2, :cond_1

    .line 1054
    sget v2, Ll/᩹֡᩷;->ܺ:I

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_1

    .line 1056
    :cond_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1058
    :goto_1
    iget-object v2, p3, Ll/᩹ܿۢ;->ۧ:Landroid/widget/ImageView;

    invoke-static {v1}, Ll/᩶ܿۢ;->ۢ(Ll/᩶ܿۢ;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1059
    iget-object v2, p3, Ll/᩹ܿۢ;->ܽ:Landroid/widget/TextView;

    invoke-virtual {p1}, Ll/ۢۧۢ;->ܽ()Ljava/lang/String;

    move-result-object p1

    const/16 v4, 0xa

    const/16 v5, 0x20

    .line 1060
    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    const/16 v4, 0xd

    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    .line 1059
    invoke-static {v3, p1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1061
    iget-object p1, p3, Ll/᩹ܿۢ;->ܽ:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 1062
    iget-object p1, p3, Ll/᩹ܿۢ;->֫:Landroid/widget/TextView;

    const/16 p3, 0x8

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_3

    .line 1064
    :cond_2
    invoke-static {v1}, Ll/᩶ܿۢ;->ܺ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    .line 1065
    invoke-static {v1}, Ll/᩶ܿۢ;->ۘ(Ll/᩶ܿۢ;)Ll/ۖۧۢ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۖۧۢ;->֫()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_3

    .line 1066
    sget v2, Ll/᩹֡᩷;->ܺ:I

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_2

    .line 1068
    :cond_3
    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1070
    :goto_2
    iget-object v2, p3, Ll/᩹ܿۢ;->ܽ:Landroid/widget/TextView;

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 1071
    iget-object v2, p3, Ll/᩹ܿۢ;->֫:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1072
    instance-of v0, p1, Ll/ۡۧۢ;

    const/16 v2, 0x64

    if-eqz v0, :cond_4

    .line 1073
    check-cast p1, Ll/ۡۧۢ;

    .line 1074
    iget-object v0, p3, Ll/᩹ܿۢ;->ۧ:Landroid/widget/ImageView;

    invoke-static {v1}, Ll/᩶ܿۢ;->ۡ(Ll/᩶ܿۢ;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1075
    iget-object v0, p3, Ll/᩹ܿۢ;->ܽ:Landroid/widget/TextView;

    invoke-virtual {p1}, Ll/ۡۧۢ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1076
    iget-object p3, p3, Ll/᩹ܿۢ;->֫:Landroid/widget/TextView;

    invoke-virtual {p1}, Ll/ۡۧۢ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 1077
    :cond_4
    instance-of v0, p1, Ll/ܳۧۢ;

    if-eqz v0, :cond_5

    .line 1078
    check-cast p1, Ll/ܳۧۢ;

    .line 1079
    iget-object v0, p3, Ll/᩹ܿۢ;->ۧ:Landroid/widget/ImageView;

    invoke-static {v1}, Ll/᩶ܿۢ;->ۜ(Ll/᩶ܿۢ;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1080
    iget-object v0, p3, Ll/᩹ܿۢ;->ܽ:Landroid/widget/TextView;

    invoke-virtual {p1}, Ll/ܳۧۢ;->ᩳ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1081
    iget-object p3, p3, Ll/᩹ܿۢ;->֫:Landroid/widget/TextView;

    invoke-virtual {p1}, Ll/ܳۧۢ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 1083
    :cond_5
    check-cast p1, Ll/᩻ۧۢ;

    .line 1084
    iget-object v0, p3, Ll/᩹ܿۢ;->ۧ:Landroid/widget/ImageView;

    invoke-static {v1}, Ll/᩶ܿۢ;->᩷(Ll/᩶ܿۢ;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1085
    iget-object v0, p3, Ll/᩹ܿۢ;->ܽ:Landroid/widget/TextView;

    invoke-virtual {p1}, Ll/᩻ۧۢ;->ܿ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1086
    iget-object p3, p3, Ll/᩹ܿۢ;->֫:Landroid/widget/TextView;

    invoke-virtual {p1}, Ll/᩻ۧۢ;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1091
    :goto_3
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 1092
    invoke-static {v1}, Ll/᩶ܿۢ;->ۖ(Ll/᩶ܿۢ;)Landroid/widget/ListView;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    if-nez p3, :cond_6

    const/4 p3, -0x1

    .line 1095
    :cond_6
    iput p3, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1096
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p2
.end method

.method public final ֫()V
    .locals 5

    .line 993
    iget-object v0, p0, Ll/᩸ܿۢ;->᩸:Ljava/lang/String;

    iget-object v1, p0, Ll/᩸ܿۢ;->᩹:Ll/᩶ܿۢ;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 1001
    :cond_0
    invoke-static {v1}, Ll/᩶ܿۢ;->ܺ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1002
    invoke-static {v1}, Ll/᩶ܿۢ;->᩵(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1004
    :try_start_0
    iget-object v0, p0, Ll/᩸ܿۢ;->᩸:Ljava/lang/String;

    .line 1005
    invoke-static {v1}, Ll/᩶ܿۢ;->ܿ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 1006
    invoke-static {v1, v3, v0}, Ll/᩶ܿۢ;->֫(Ll/᩶ܿۢ;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1007
    invoke-static {v1}, Ll/᩶ܿۢ;->ܺ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1010
    :cond_2
    invoke-static {v1}, Ll/᩶ܿۢ;->ܳ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢۧۢ;

    .line 1011
    invoke-virtual {v3}, Ll/ۢۧۢ;->ܽ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 1012
    invoke-static {v1}, Ll/᩶ܿۢ;->᩵(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 1018
    :catch_0
    :cond_4
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    .line 994
    :cond_5
    :goto_2
    invoke-static {v1}, Ll/᩶ܿۢ;->᩵(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 995
    invoke-static {v1}, Ll/᩶ܿۢ;->᩵(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v0

    invoke-static {v1}, Ll/᩶ܿۢ;->ܳ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v2

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 996
    invoke-static {v1}, Ll/᩶ܿۢ;->ܺ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 997
    invoke-static {v1}, Ll/᩶ܿۢ;->ܺ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v0

    invoke-static {v1}, Ll/᩶ܿۢ;->ܿ(Ll/᩶ܿۢ;)Ljava/util/List;

    move-result-object v1

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 998
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 985
    iput-object p1, p0, Ll/᩸ܿۢ;->᩸:Ljava/lang/String;

    .line 986
    invoke-virtual {p0}, Ll/᩸ܿۢ;->֫()V

    return-void
.end method
