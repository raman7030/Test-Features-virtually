.class public final Ll/۠ܽ᩻;
.super Landroid/widget/BaseAdapter;
.source "29SR"


# instance fields
.field public final synthetic ᩶:Ll/ۙܽ᩻;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۙܽ᩻;)V
    .locals 1

    .line 175
    iput-object p1, p0, Ll/۠ܽ᩻;->᩶:Ll/ۙܽ᩻;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۠ܽ᩻;->᩹:Ljava/util/ArrayList;

    .line 176
    invoke-static {p1}, Ll/ۙܽ᩻;->ᩳ(Ll/ۙܽ᩻;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠ܽ᩻;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ܽ᩻;->᩹:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 203
    iget-object v0, p0, Ll/۠ܽ᩻;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

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

    .line 220
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܶܽ᩻;

    goto :goto_0

    :cond_0
    const p2, 0x7f0d0166

    .line 0
    invoke-static {p3, p2, p3, v0}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 224
    new-instance p3, Ll/ܶܽ᩻;

    invoke-direct {p3}, Ll/ܶܽ᩻;-><init>()V

    const v1, 0x7f0a05e2

    .line 225
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p3, Ll/ܶܽ᩻;->ܽ:Landroid/widget/TextView;

    const v1, 0x7f0a05ef

    .line 226
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p3, Ll/ܶܽ᩻;->֫:Landroid/widget/TextView;

    const v1, 0x7f0a0278

    .line 227
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p3, Ll/ܶܽ᩻;->ۧ:Landroid/widget/ImageView;

    const v1, 0x7f0a0477

    .line 228
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    iput-object v1, p3, Ll/ܶܽ᩻;->ᩳ:Landroid/widget/RadioButton;

    .line 229
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 232
    :goto_0
    iget-object v1, p0, Ll/۠ܽ᩻;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ܽ᩻;

    .line 233
    iget-object v1, p1, Ll/᩹ܽ᩻;->ܳ:Ll/ۨ֨ۢ;

    .line 234
    iget-object v2, p3, Ll/ܶܽ᩻;->ܽ:Landroid/widget/TextView;

    invoke-virtual {v1}, Ll/ۨ֨ۢ;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    iget-object v2, p3, Ll/ܶܽ᩻;->ᩳ:Landroid/widget/RadioButton;

    iget v3, p1, Ll/᩹ܽ᩻;->ᩳ:I

    iget-object v4, p0, Ll/۠ܽ᩻;->᩶:Ll/ۙܽ᩻;

    invoke-static {v4}, Ll/ۙܽ᩻;->᩻(Ll/ۙܽ᩻;)I

    move-result v4

    const/4 v5, 0x1

    if-ne v3, v4, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-virtual {v2, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 238
    iget-object v0, v1, Ll/ۨ֨ۢ;->ܽ:Landroid/content/pm/PackageInfo;

    if-nez v0, :cond_2

    .line 239
    iget-object v0, p3, Ll/ܶܽ᩻;->֫:Landroid/widget/TextView;

    const v1, 0x7f120a17

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 241
    :cond_2
    iget-object v0, p3, Ll/ܶܽ᩻;->֫:Landroid/widget/TextView;

    invoke-virtual {v1}, Ll/ۨ֨ۢ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 243
    :goto_1
    iget-object p3, p3, Ll/ܶܽ᩻;->ۧ:Landroid/widget/ImageView;

    .line 282
    iget-object v0, p1, Ll/᩹ܽ᩻;->ܳ:Ll/ۨ֨ۢ;

    iget-object v0, v0, Ll/ۨ֨ۢ;->ܽ:Landroid/content/pm/PackageInfo;

    if-nez v0, :cond_3

    .line 283
    iget-object p1, p1, Ll/᩹ܽ᩻;->ܿ:Ll/ۙܽ᩻;

    invoke-static {p1}, Ll/ۙܽ᩻;->ܽ(Ll/ۙܽ᩻;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 285
    :cond_3
    iput-boolean v5, p1, Ll/᩹ܽ᩻;->֫:Z

    .line 286
    iget-object v0, p1, Ll/᩹ܽ᩻;->ۧ:Ll/֡᩻;

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 287
    iget-boolean p3, p1, Ll/᩹ܽ᩻;->ܽ:Z

    if-eqz p3, :cond_4

    .line 288
    iget-object p3, p1, Ll/᩹ܽ᩻;->ܿ:Ll/ۙܽ᩻;

    invoke-static {p3}, Ll/ۙܽ᩻;->ܳ(Ll/ۙܽ᩻;)Ljava/util/LinkedList;

    move-result-object p3

    move-object v0, p3

    monitor-enter v0

    .line 289
    :try_start_0
    iget-object p3, p1, Ll/᩹ܽ᩻;->ܿ:Ll/ۙܽ᩻;

    invoke-static {p3}, Ll/ۙܽ᩻;->ܳ(Ll/ۙܽ᩻;)Ljava/util/LinkedList;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 290
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 246
    :cond_4
    :goto_2
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 247
    iget-object p3, p0, Ll/۠ܽ᩻;->᩶:Ll/ۙܽ᩻;

    invoke-static {p3}, Ll/ۙܽ᩻;->ܿ(Ll/ۙܽ᩻;)Ll/ۢۢۡ;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    if-nez p3, :cond_5

    const/4 p3, -0x1

    .line 250
    :cond_5
    iput p3, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 251
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p2
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 5

    .line 180
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۠ܽ᩻;->᩸:Ljava/lang/String;

    .line 185
    iget-object v0, p0, Ll/۠ܽ᩻;->᩶:Ll/ۙܽ᩻;

    iget-object v1, p0, Ll/۠ܽ᩻;->᩹:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 191
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 192
    iget-object p1, p0, Ll/۠ܽ᩻;->᩸:Ljava/lang/String;

    .line 193
    invoke-static {v0}, Ll/ۙܽ᩻;->ᩳ(Ll/ۙܽ᩻;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܽ᩻;

    .line 276
    iget-object v3, v2, Ll/᩹ܽ᩻;->ܳ:Ll/ۨ֨ۢ;

    iget-object v4, v3, Ll/ۨ֨ۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    iget v4, v3, Ll/ۨ֨ۢ;->ᩳ:I

    .line 277
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v3, Ll/ۨ֨ۢ;->ܽ:Landroid/content/pm/PackageInfo;

    if-eqz v4, :cond_1

    .line 278
    invoke-virtual {v3}, Ll/ۨ֨ۢ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 195
    :cond_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 198
    :cond_3
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    .line 186
    :cond_4
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 187
    invoke-static {v0}, Ll/ۙܽ᩻;->ᩳ(Ll/ۙܽ᩻;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 188
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
