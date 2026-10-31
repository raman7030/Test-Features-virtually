.class public final Ll/ܺ֨ۧ;
.super Ll/᩶ۗۧ;
.source "28G3"


# instance fields
.field public final ֫:[Landroid/graphics/drawable/Drawable;

.field public final ۧ:[Ljava/lang/String;

.field public final ܽ:[Ljava/lang/String;

.field public final synthetic ᩳ:Ll/۠֨ۧ;


# direct methods
.method public constructor <init>(Ll/۠֨ۧ;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 2075
    iput-object p1, p0, Ll/ܺ֨ۧ;->ᩳ:Ll/۠֨ۧ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 2076
    iput-object p2, p0, Ll/ܺ֨ۧ;->ۧ:[Ljava/lang/String;

    .line 2077
    array-length p1, p2

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Ll/ܺ֨ۧ;->ܽ:[Ljava/lang/String;

    .line 2078
    iput-object p3, p0, Ll/ܺ֨ۧ;->֫:[Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method private ֫(I)Z
    .locals 4

    .line 2134
    iget-object v0, p0, Ll/ܺ֨ۧ;->ᩳ:Ll/۠֨ۧ;

    invoke-static {v0}, Ll/۠֨ۧ;->ᩴ(Ll/۠֨ۧ;)Ll/֨᩵֫;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    return v1

    .line 2139
    :cond_1
    invoke-static {v0}, Ll/۠֨ۧ;->ᩴ(Ll/۠֨ۧ;)Ll/֨᩵֫;

    move-result-object p1

    const/16 v3, 0x1e

    invoke-interface {p1, v3}, Ll/֨᩵֫;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v0}, Ll/۠֨ۧ;->ᩴ(Ll/۠֨ۧ;)Ll/֨᩵֫;

    move-result-object p1

    const/16 v0, 0x1d

    .line 2140
    invoke-interface {p1, v0}, Ll/֨᩵֫;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    return v2

    .line 2142
    :cond_3
    invoke-static {v0}, Ll/۠֨ۧ;->ᩴ(Ll/۠֨ۧ;)Ll/֨᩵֫;

    move-result-object p1

    const/16 v0, 0xd

    invoke-interface {p1, v0}, Ll/֨᩵֫;->ۧ(I)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 2121
    iget-object v0, p0, Ll/ܺ֨ۧ;->ۧ:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 4

    .line 2069
    check-cast p1, Ll/ۡ֨ۧ;

    .line 2091
    invoke-direct {p0, p2}, Ll/ܺ֨ۧ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2092
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    new-instance v1, Ll/ܳ۬ۧ;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Ll/ܳ۬ۧ;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 2096
    :cond_0
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    new-instance v1, Ll/ܳ۬ۧ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Ll/ܳ۬ۧ;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2099
    :goto_0
    invoke-static {p1}, Ll/ۡ֨ۧ;->ۧ(Ll/ۡ֨ۧ;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Ll/ܺ֨ۧ;->ۧ:[Ljava/lang/String;

    aget-object v1, v1, p2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2101
    iget-object v0, p0, Ll/ܺ֨ۧ;->ܽ:[Ljava/lang/String;

    aget-object v1, v0, p2

    const/16 v2, 0x8

    if-nez v1, :cond_1

    .line 2102
    invoke-static {p1}, Ll/ۡ֨ۧ;->ܽ(Ll/ۡ֨ۧ;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 2104
    :cond_1
    invoke-static {p1}, Ll/ۡ֨ۧ;->ܽ(Ll/ۡ֨ۧ;)Landroid/widget/TextView;

    move-result-object v1

    aget-object v0, v0, p2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2107
    :goto_1
    iget-object v0, p0, Ll/ܺ֨ۧ;->֫:[Landroid/graphics/drawable/Drawable;

    aget-object v1, v0, p2

    if-nez v1, :cond_2

    .line 2108
    invoke-static {p1}, Ll/ۡ֨ۧ;->֫(Ll/ۡ֨ۧ;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 2110
    :cond_2
    invoke-static {p1}, Ll/ۡ֨ۧ;->֫(Ll/ۡ֨ۧ;)Landroid/widget/ImageView;

    move-result-object p1

    aget-object p2, v0, p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    .line 2084
    iget-object p2, p0, Ll/ܺ֨ۧ;->ᩳ:Ll/۠֨ۧ;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0125

    const/4 v2, 0x0

    .line 2085
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2086
    new-instance v0, Ll/ۡ֨ۧ;

    invoke-direct {v0, p2, p1}, Ll/ۡ֨ۧ;-><init>(Ll/۠֨ۧ;Landroid/view/View;)V

    return-object v0
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 1

    .line 2125
    iget-object v0, p0, Ll/ܺ֨ۧ;->ܽ:[Ljava/lang/String;

    aput-object p2, v0, p1

    return-void
.end method

.method public final ֫()Z
    .locals 3

    const/4 v0, 0x1

    .line 2129
    invoke-direct {p0, v0}, Ll/ܺ֨ۧ;->֫(I)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 2130
    invoke-direct {p0, v1}, Ll/ܺ֨ۧ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    return v0
.end method
