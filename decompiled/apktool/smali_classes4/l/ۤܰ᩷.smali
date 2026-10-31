.class public final Ll/ۤܰ᩷;
.super Ll/ܰܳۡ;
.source "E1KB"


# instance fields
.field public final synthetic ۡ֫:Ll/ܰܰ᩷;


# direct methods
.method public constructor <init>(Ll/ܰܰ᩷;)V
    .locals 0

    .line 143
    iput-object p1, p0, Ll/ۤܰ᩷;->ۡ֫:Ll/ܰܰ᩷;

    const-string p1, "<>"

    .line 90
    invoke-static {p1}, Ll/ܰܳۡ;->ᩳ(Ljava/lang/String;)[Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 144
    invoke-direct {p0, p1}, Ll/ܰܳۡ;-><init>([Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 3

    .line 221
    invoke-super {p0}, Ll/ܰܳۡ;->getItemCount()I

    move-result v0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 225
    :cond_0
    iget-object v1, p0, Ll/ۤܰ᩷;->ۡ֫:Ll/ܰܰ᩷;

    invoke-static {v1}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 226
    invoke-static {v1}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v1, v0

    return v1

    :cond_1
    return v0
.end method

.method public final getItemViewType(I)I
    .locals 2

    .line 149
    iget-object v0, p0, Ll/ۤܰ᩷;->ۡ֫:Ll/ܰܰ᩷;

    invoke-static {v0}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 154
    invoke-static {v0}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 157
    :cond_1
    invoke-static {v0}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr p1, v0

    :cond_2
    if-nez p1, :cond_3

    const/4 p1, 0x2

    return p1

    :cond_3
    add-int/lit8 p1, p1, -0x1

    .line 163
    invoke-super {p0, p1}, Ll/ܰܳۡ;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 2

    .line 203
    iget-object v0, p0, Ll/ۤܰ᩷;->ۡ֫:Ll/ܰܰ᩷;

    invoke-static {v0}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 208
    invoke-static {v0}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    .line 209
    check-cast p1, Ll/᩺ܰ᩷;

    invoke-static {v0}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ll/᩺ܰ᩷;->֫(Ljava/lang/String;)V

    return-void

    .line 212
    :cond_1
    invoke-static {v0}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr p2, v0

    :cond_2
    if-lez p2, :cond_3

    add-int/lit8 p2, p2, -0x1

    .line 215
    invoke-super {p0, p1, p2}, Ll/ܰܳۡ;->onBindViewHolder(Ll/ۗ۬ۧ;I)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    const v0, 0x7f0a05e2

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    const/4 v2, 0x1

    if-eq p2, v2, :cond_1

    const/4 v2, 0x2

    if-eq p2, v2, :cond_0

    .line 197
    invoke-super {p0, p1, p2}, Ll/ܰܳۡ;->onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;

    move-result-object p1

    return-object p1

    :cond_0
    const p2, 0x7f0d015a

    .line 0
    invoke-static {p1, p2, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 193
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const v0, 0x7f12062d

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 194
    new-instance p2, Ll/ۗܰ᩷;

    .line 330
    invoke-direct {p2, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    return-object p2

    :cond_1
    const p2, 0x7f0d014b

    .line 0
    invoke-static {p1, p2, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 188
    new-instance p2, Ll/᩺ܰ᩷;

    iget-object v0, p0, Ll/ۤܰ᩷;->ۡ֫:Ll/ܰܰ᩷;

    invoke-direct {p2, v0, p1}, Ll/᩺ܰ᩷;-><init>(Ll/ܰܰ᩷;Landroid/view/View;)V

    return-object p2

    :cond_2
    const p2, 0x7f0d015b

    .line 0
    invoke-static {p1, p2, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 173
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const v0, 0x7f1207dc

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    const p2, 0x7f0a03ae

    .line 174
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    new-instance v0, Ll/۬ܰ᩷;

    invoke-direct {v0, p0}, Ll/۬ܰ᩷;-><init>(Ll/ۤܰ᩷;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    new-instance p2, Ll/ۗܰ᩷;

    .line 330
    invoke-direct {p2, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final ۜ()I
    .locals 2

    .line 233
    iget-object v0, p0, Ll/ۤܰ᩷;->ۡ֫:Ll/ܰܰ᩷;

    invoke-static {v0}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-static {v0}, Ll/ܰܰ᩷;->ᩳ(Ll/ܰܰ᩷;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method
