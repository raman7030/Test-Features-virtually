.class public final Ll/ۗ᩷᩷;
.super Ll/ۢ᩷᩷;
.source "Q7IN"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;


# instance fields
.field public ֡:Ljava/lang/Boolean;

.field public ֨:Landroid/graphics/Bitmap;

.field public ۘ:Landroid/graphics/ColorFilter;

.field public ۚ:Ljava/lang/Integer;

.field public ۠:Landroid/graphics/drawable/Drawable;

.field public ܶ:Landroid/graphics/Matrix;

.field public ᩴ:Ljava/lang/Integer;

.field public ᩵:Landroid/graphics/PorterDuff$Mode;

.field public ᩶:Landroid/widget/ImageView$ScaleType;

.field public ᩸:Landroid/content/res/ColorStateList;

.field public ᩹:Landroid/graphics/PorterDuff$Mode;


# virtual methods
.method public final colorFilter(I)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 137
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩷᩷;->ᩴ:Ljava/lang/Integer;

    const/4 p1, 0x0

    .line 138
    iput-object p1, p0, Ll/ۗ᩷᩷;->᩵:Landroid/graphics/PorterDuff$Mode;

    .line 139
    iput-object p1, p0, Ll/ۗ᩷᩷;->ۘ:Landroid/graphics/ColorFilter;

    return-object p0
.end method

.method public final colorFilter(ILandroid/graphics/PorterDuff$Mode;)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 129
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩷᩷;->ᩴ:Ljava/lang/Integer;

    .line 130
    iput-object p2, p0, Ll/ۗ᩷᩷;->᩵:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x0

    .line 131
    iput-object p1, p0, Ll/ۗ᩷᩷;->ۘ:Landroid/graphics/ColorFilter;

    return-object p0
.end method

.method public final colorFilter(Landroid/graphics/ColorFilter;)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 145
    iput-object p1, p0, Ll/ۗ᩷᩷;->ۘ:Landroid/graphics/ColorFilter;

    const/4 p1, 0x0

    .line 146
    iput-object p1, p0, Ll/ۗ᩷᩷;->ᩴ:Ljava/lang/Integer;

    .line 147
    iput-object p1, p0, Ll/ۗ᩷᩷;->᩵:Landroid/graphics/PorterDuff$Mode;

    return-object p0
.end method

.method public final cropToPadding(Z)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 123
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩷᩷;->֡:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final image(Landroid/graphics/Bitmap;)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 92
    iput-object p1, p0, Ll/ۗ᩷᩷;->֨:Landroid/graphics/Bitmap;

    const/4 p1, 0x0

    .line 93
    iput-object p1, p0, Ll/ۗ᩷᩷;->۠:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final image(Landroid/graphics/drawable/Drawable;)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 85
    iput-object p1, p0, Ll/ۗ᩷᩷;->۠:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    .line 86
    iput-object p1, p0, Ll/ۗ᩷᩷;->֨:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public final imageAlpha(I)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 153
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩷᩷;->ۚ:Ljava/lang/Integer;

    return-object p0
.end method

.method public final imageMatrix(Landroid/graphics/Matrix;)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 117
    iput-object p1, p0, Ll/ۗ᩷᩷;->ܶ:Landroid/graphics/Matrix;

    return-object p0
.end method

.method public final imageTintList(Landroid/content/res/ColorStateList;)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 99
    iput-object p1, p0, Ll/ۗ᩷᩷;->᩸:Landroid/content/res/ColorStateList;

    return-object p0
.end method

.method public final imageTintMode(Landroid/graphics/PorterDuff$Mode;)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 105
    iput-object p1, p0, Ll/ۗ᩷᩷;->᩹:Landroid/graphics/PorterDuff$Mode;

    return-object p0
.end method

.method public final scaleType(Landroid/widget/ImageView$ScaleType;)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 0

    .line 111
    iput-object p1, p0, Ll/ۗ᩷᩷;->᩶:Landroid/widget/ImageView$ScaleType;

    return-object p0
.end method

.method public final ֫(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 45
    new-instance v0, Ll/ᩳۡ;

    invoke-direct {v0, p1}, Ll/ᩳۡ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)Ll/۟ۜ᩷;
    .locals 1

    .line 40
    new-instance v0, Ll/֨ۜ᩷;

    .line 21
    invoke-direct {v0, p1, p2}, Ll/۟ۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    return-object v0
.end method

.method public final ֫(Ll/۟ۜ᩷;)V
    .locals 2

    .line 21
    check-cast p1, Ll/֨ۜ᩷;

    .line 50
    invoke-super {p0, p1}, Ll/ۢ᩷᩷;->֫(Ll/۟ۜ᩷;)V

    .line 51
    iget-object v0, p0, Ll/ۗ᩷᩷;->۠:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {p1, v0}, Ll/֨ۜ᩷;->setImage(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 53
    :cond_0
    iget-object v0, p0, Ll/ۗ᩷᩷;->֨:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 54
    invoke-virtual {p1, v0}, Ll/֨ۜ᩷;->setImage(Landroid/graphics/Bitmap;)V

    .line 56
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۗ᩷᩷;->᩸:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    .line 57
    invoke-virtual {p1, v0}, Ll/֨ۜ᩷;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 59
    :cond_2
    iget-object v0, p0, Ll/ۗ᩷᩷;->᩹:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_3

    .line 60
    invoke-virtual {p1, v0}, Ll/֨ۜ᩷;->setImageTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 62
    :cond_3
    iget-object v0, p0, Ll/ۗ᩷᩷;->᩶:Landroid/widget/ImageView$ScaleType;

    if-eqz v0, :cond_4

    .line 63
    invoke-virtual {p1, v0}, Ll/֨ۜ᩷;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 65
    :cond_4
    iget-object v0, p0, Ll/ۗ᩷᩷;->ܶ:Landroid/graphics/Matrix;

    if-eqz v0, :cond_5

    .line 66
    invoke-virtual {p1, v0}, Ll/֨ۜ᩷;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 68
    :cond_5
    iget-object v0, p0, Ll/ۗ᩷᩷;->֡:Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    .line 69
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/֨ۜ᩷;->setCropToPadding(Z)V

    .line 71
    :cond_6
    iget-object v0, p0, Ll/ۗ᩷᩷;->ۘ:Landroid/graphics/ColorFilter;

    if-eqz v0, :cond_7

    .line 72
    invoke-virtual {p1, v0}, Ll/֨ۜ᩷;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_1

    .line 73
    :cond_7
    iget-object v0, p0, Ll/ۗ᩷᩷;->ᩴ:Ljava/lang/Integer;

    if-eqz v0, :cond_8

    iget-object v1, p0, Ll/ۗ᩷᩷;->᩵:Landroid/graphics/PorterDuff$Mode;

    if-eqz v1, :cond_8

    .line 74
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Ll/ۗ᩷᩷;->᩵:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v0, v1}, Ll/֨ۜ᩷;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    :cond_8
    if-eqz v0, :cond_9

    .line 76
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֨ۜ᩷;->setColorFilter(I)V

    .line 78
    :cond_9
    :goto_1
    iget-object v0, p0, Ll/ۗ᩷᩷;->ۚ:Ljava/lang/Integer;

    if-eqz v0, :cond_a

    .line 79
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֨ۜ᩷;->setImageAlpha(I)V

    :cond_a
    return-void
.end method
