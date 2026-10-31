.class public final Ll/۠ۢ֨;
.super Ljava/lang/Object;
.source "L5HA"


# static fields
.field public static final ֫:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "drawable"

    const-string v1, "mipmap"

    const-string v2, "raw"

    .line 22
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/۠ۢ֨;->֫:Ljava/util/List;

    return-void
.end method

.method public static ֫(Landroid/widget/ImageView;Landroid/util/AttributeSet;I)Ll/ۚۢ֨;
    .locals 1

    if-eqz p1, :cond_1

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_1

    .line 29
    new-instance v0, Ll/ۚۢ֨;

    invoke-direct {v0, p0, p1, p2}, Ll/ۚۢ֨;-><init>(Landroid/widget/ImageView;Landroid/util/AttributeSet;I)V

    .line 31
    iget p1, v0, Ll/֨ۢ֨;->ۧ:I

    if-ltz p1, :cond_0

    .line 32
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-static {p2, p1}, Ll/۠ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0, p1}, Ll/۠ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    :cond_0
    return-object v0

    .line 37
    :cond_1
    new-instance p0, Ll/ۚۢ֨;

    invoke-direct {p0}, Ll/ۚۢ֨;-><init>()V

    return-object p0
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    .line 41
    instance-of v0, p0, Ll/֫ۢ֨;

    if-eqz v0, :cond_0

    .line 42
    check-cast p0, Ll/֫ۢ֨;

    .line 424
    iget-object p0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {p0, p1}, Lpl/droidsonroids/gif/GifInfoHandle;->֫(I)V

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/widget/ImageView;ZI)Z
    .locals 3

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 51
    :try_start_0
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v1

    .line 52
    sget-object v2, Ll/۠ۢ֨;->֫:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 55
    :cond_0
    new-instance v1, Ll/֫ۢ֨;

    invoke-direct {v1, v0, p2}, Ll/֫ۢ֨;-><init>(Landroid/content/res/Resources;I)V

    if-eqz p1, :cond_1

    .line 57
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_2
    :goto_1
    const/4 p0, 0x0

    return p0
.end method
