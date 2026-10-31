.class public final Ll/ܽۡ;
.super Ljava/lang/Object;
.source "J4YO"


# instance fields
.field public ֫:Ll/ۛۘ;

.field public ۧ:I

.field public ܽ:Ll/ۛۘ;

.field public final ᩳ:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput v0, p0, Ll/ܽۡ;->ۧ:I

    .line 48
    iput-object p1, p0, Ll/ܽۡ;->ᩳ:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 237
    iget-object v0, p0, Ll/ܽۡ;->ᩳ:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 238
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v1, p0, Ll/ܽۡ;->ۧ:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 89
    iget-object v0, p0, Ll/ܽۡ;->ᩳ:Landroid/widget/ImageView;

    if-eqz p1, :cond_1

    .line 90
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 92
    invoke-static {p1}, Ll/ܶܺ;->֫(Landroid/graphics/drawable/Drawable;)V

    .line 94
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 96
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 99
    :goto_0
    invoke-virtual {p0}, Ll/ܽۡ;->ۧ()V

    return-void
.end method

.method public final ֫(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ܽۡ;->֫:Ll/ۛۘ;

    if-nez v0, :cond_0

    .line 115
    new-instance v0, Ll/ۛۘ;

    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object v0, p0, Ll/ܽۡ;->֫:Ll/ۛۘ;

    .line 117
    :cond_0
    iget-object v0, p0, Ll/ܽۡ;->֫:Ll/ۛۘ;

    iput-object p1, v0, Ll/ۛۘ;->ܽ:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    .line 118
    iput-boolean p1, v0, Ll/ۛۘ;->֫:Z

    .line 119
    invoke-virtual {p0}, Ll/ܽۡ;->ۧ()V

    return-void
.end method

.method public final ֫(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ܽۡ;->֫:Ll/ۛۘ;

    if-nez v0, :cond_0

    .line 128
    new-instance v0, Ll/ۛۘ;

    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object v0, p0, Ll/ܽۡ;->֫:Ll/ۛۘ;

    .line 130
    :cond_0
    iget-object v0, p0, Ll/ܽۡ;->֫:Ll/ۛۘ;

    iput-object p1, v0, Ll/ۛۘ;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    .line 131
    iput-boolean p1, v0, Ll/ۛۘ;->ۧ:Z

    .line 133
    invoke-virtual {p0}, Ll/ܽۡ;->ۧ()V

    return-void
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 230
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result p1

    iput p1, p0, Ll/ܽۡ;->ۧ:I

    return-void
.end method

.method public final ֫(Landroid/util/AttributeSet;I)V
    .locals 8

    .line 52
    iget-object v6, p0, Ll/ܽۡ;->ᩳ:Landroid/widget/ImageView;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Ll/ۗᩳ;->᩻:[I

    invoke-static {v0, p1, v2, p2, v1}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object v7

    .line 54
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 55
    invoke-virtual {v7}, Ll/᩺ۘ;->ܽ()Landroid/content/res/TypedArray;

    move-result-object v4

    move-object v0, v6

    move-object v3, p1

    move v5, p2

    .line 54
    invoke-static/range {v0 .. v5}, Ll/ܿ᩺;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 57
    :try_start_0
    invoke-virtual {v6}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/4 p2, -0x1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    .line 61
    invoke-virtual {v7, v0, p2}, Ll/᩺ۘ;->ܳ(II)I

    move-result v0

    if-eq v0, p2, :cond_0

    .line 63
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 65
    invoke-virtual {v6, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 71
    invoke-static {p1}, Ll/ܶܺ;->֫(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    const/4 p1, 0x2

    .line 74
    invoke-virtual {v7, p1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 76
    invoke-virtual {v7, p1}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 75
    invoke-static {v6, p1}, Ll/᩷֫֫;->֫(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    :cond_2
    const/4 p1, 0x3

    .line 78
    invoke-virtual {v7, p1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 81
    invoke-virtual {v7, p1, p2}, Ll/᩺ۘ;->ܽ(II)I

    move-result p1

    const/4 p2, 0x0

    .line 80
    invoke-static {p1, p2}, Ll/ܶܺ;->֫(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    .line 79
    invoke-static {v6, p1}, Ll/᩷֫֫;->֫(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :cond_3
    invoke-virtual {v7}, Ll/᩺ۘ;->ܿ()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v7}, Ll/᩺ۘ;->ܿ()V

    .line 85
    throw p1
.end method

.method public final ۧ()V
    .locals 5

    .line 141
    iget-object v0, p0, Ll/ܽۡ;->ᩳ:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 143
    invoke-static {v1}, Ll/ܶܺ;->֫(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz v1, :cond_7

    .line 178
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-le v2, v3, :cond_1

    goto :goto_0

    :cond_1
    if-ne v2, v3, :cond_6

    .line 200
    iget-object v2, p0, Ll/ܽۡ;->ܽ:Ll/ۛۘ;

    if-nez v2, :cond_2

    .line 201
    new-instance v2, Ll/ۛۘ;

    .line 27
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 201
    iput-object v2, p0, Ll/ܽۡ;->ܽ:Ll/ۛۘ;

    .line 203
    :cond_2
    iget-object v2, p0, Ll/ܽۡ;->ܽ:Ll/ۛۘ;

    const/4 v3, 0x0

    .line 34
    iput-object v3, v2, Ll/ۛۘ;->ܽ:Landroid/content/res/ColorStateList;

    const/4 v4, 0x0

    .line 35
    iput-boolean v4, v2, Ll/ۛۘ;->֫:Z

    .line 36
    iput-object v3, v2, Ll/ۛۘ;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    .line 37
    iput-boolean v4, v2, Ll/ۛۘ;->ۧ:Z

    .line 206
    invoke-static {v0}, Ll/᩷֫֫;->֫(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    .line 208
    iput-boolean v4, v2, Ll/ۛۘ;->֫:Z

    .line 209
    iput-object v3, v2, Ll/ۛۘ;->ܽ:Landroid/content/res/ColorStateList;

    .line 211
    :cond_3
    invoke-static {v0}, Ll/᩷֫֫;->ۧ(Landroid/widget/ImageView;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 213
    iput-boolean v4, v2, Ll/ۛۘ;->ۧ:Z

    .line 214
    iput-object v3, v2, Ll/ۛۘ;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    .line 217
    :cond_4
    iget-boolean v3, v2, Ll/ۛۘ;->֫:Z

    if-nez v3, :cond_5

    iget-boolean v3, v2, Ll/ۛۘ;->ۧ:Z

    if-eqz v3, :cond_6

    .line 218
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    sget v3, Ll/ۛۢ;->ۧ:I

    .line 497
    invoke-static {v1, v2, v0}, Ll/֫ۘ;->֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;[I)V

    return-void

    .line 154
    :cond_6
    :goto_0
    iget-object v2, p0, Ll/ܽۡ;->֫:Ll/ۛۘ;

    if-eqz v2, :cond_7

    .line 156
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    .line 155
    sget v3, Ll/ۛۢ;->ۧ:I

    .line 497
    invoke-static {v1, v2, v0}, Ll/֫ۘ;->֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;[I)V

    :cond_7
    return-void
.end method

.method public final ܽ()Landroid/content/res/ColorStateList;
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ܽۡ;->֫:Ll/ۛۘ;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۛۘ;->ܽ:Landroid/content/res/ColorStateList;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ܽۡ;->ᩳ:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 104
    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 137
    iget-object v0, p0, Ll/ܽۡ;->֫:Ll/ۛۘ;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۛۘ;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
