.class public final Ll/᩷֨ۧ;
.super Ll/᩶ۗۧ;
.source "28G3"


# instance fields
.field public final ֫:[Ljava/lang/String;

.field public final ۧ:[F

.field public ܽ:I

.field public final synthetic ᩳ:Ll/۠֨ۧ;


# direct methods
.method public constructor <init>(Ll/۠֨ۧ;[Ljava/lang/String;[F)V
    .locals 0

    .line 2174
    iput-object p1, p0, Ll/᩷֨ۧ;->ᩳ:Ll/۠֨ۧ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 2175
    iput-object p2, p0, Ll/᩷֨ۧ;->֫:[Ljava/lang/String;

    .line 2176
    iput-object p3, p0, Ll/᩷֨ۧ;->ۧ:[F

    return-void
.end method

.method public static synthetic ֫(Ll/᩷֨ۧ;I)V
    .locals 2

    .line 2219
    iget-object v0, p0, Ll/᩷֨ۧ;->ᩳ:Ll/۠֨ۧ;

    iget v1, p0, Ll/᩷֨ۧ;->ܽ:I

    if-eq p1, v1, :cond_0

    .line 2220
    iget-object p0, p0, Ll/᩷֨ۧ;->ۧ:[F

    aget p0, p0, p1

    invoke-static {v0, p0}, Ll/۠֨ۧ;->֫(Ll/۠֨ۧ;F)V

    .line 2222
    :cond_0
    invoke-static {v0}, Ll/۠֨ۧ;->᩶(Ll/۠֨ۧ;)Landroid/widget/PopupWindow;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 2228
    iget-object v0, p0, Ll/᩷֨ۧ;->֫:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 3

    .line 2168
    check-cast p1, Ll/ۖ֨ۧ;

    .line 2207
    iget-object v0, p0, Ll/᩷֨ۧ;->֫:[Ljava/lang/String;

    array-length v1, v0

    if-ge p2, v1, :cond_0

    .line 2208
    iget-object v1, p1, Ll/ۖ֨ۧ;->ۧ:Landroid/widget/TextView;

    aget-object v0, v0, p2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2210
    :cond_0
    iget v0, p0, Ll/᩷֨ۧ;->ܽ:I

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    .line 2211
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 2212
    iget-object v0, p1, Ll/ۖ֨ۧ;->֫:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 2214
    :cond_1
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 2215
    iget-object v0, p1, Ll/ۖ֨ۧ;->֫:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2217
    :goto_0
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    new-instance v0, Ll/ۜ֨ۧ;

    invoke-direct {v0, p0, p2}, Ll/ۜ֨ۧ;-><init>(Ll/᩷֨ۧ;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 2

    .line 2198
    iget-object p2, p0, Ll/᩷֨ۧ;->ᩳ:Ll/۠֨ۧ;

    .line 2199
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0126

    const/4 v1, 0x0

    .line 2200
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2202
    new-instance p2, Ll/ۖ֨ۧ;

    invoke-direct {p2, p1}, Ll/ۖ֨ۧ;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 2193
    iget-object v0, p0, Ll/᩷֨ۧ;->֫:[Ljava/lang/String;

    iget v1, p0, Ll/᩷֨ۧ;->ܽ:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final ֫(F)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 2182
    :goto_0
    iget-object v3, p0, Ll/᩷֨ۧ;->ۧ:[F

    array-length v4, v3

    if-ge v0, v4, :cond_1

    .line 2183
    aget v3, v3, v0

    sub-float v3, p1, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpg-float v4, v3, v2

    if-gez v4, :cond_0

    move v1, v0

    move v2, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2189
    :cond_1
    iput v1, p0, Ll/᩷֨ۧ;->ܽ:I

    return-void
.end method
