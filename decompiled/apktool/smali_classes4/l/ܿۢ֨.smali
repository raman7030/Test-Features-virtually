.class public Ll/ܿۢ֨;
.super Landroid/widget/ImageButton;
.source "14K2"


# instance fields
.field public ᩸:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 39
    invoke-static {p0, p2, p1}, Ll/۠ۢ֨;->֫(Landroid/widget/ImageView;Landroid/util/AttributeSet;I)Ll/ۚۢ֨;

    move-result-object p1

    .line 72
    iget-boolean p2, p1, Ll/֨ۢ֨;->֫:Z

    iput-boolean p2, p0, Ll/ܿۢ֨;->᩸:Z

    .line 73
    iget p2, p1, Ll/ۚۢ֨;->ᩳ:I

    if-lez p2, :cond_0

    .line 74
    invoke-super {p0, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 76
    :cond_0
    iget p1, p1, Ll/ۚۢ֨;->ܽ:I

    if-lez p1, :cond_1

    .line 77
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    invoke-static {p0, p2, p3}, Ll/۠ۢ֨;->֫(Landroid/widget/ImageView;Landroid/util/AttributeSet;I)Ll/ۚۢ֨;

    move-result-object p1

    .line 72
    iget-boolean p2, p1, Ll/֨ۢ֨;->֫:Z

    iput-boolean p2, p0, Ll/ܿۢ֨;->᩸:Z

    .line 73
    iget p2, p1, Ll/ۚۢ֨;->ᩳ:I

    if-lez p2, :cond_0

    .line 74
    invoke-super {p0, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 76
    :cond_0
    iget p1, p1, Ll/ۚۢ֨;->ܽ:I

    if-lez p1, :cond_1

    .line 77
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 119
    instance-of v0, p1, Ll/֡ۢ֨;

    if-nez v0, :cond_0

    .line 120
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 123
    :cond_0
    check-cast p1, Ll/֡ۢ֨;

    .line 124
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/ImageButton;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 125
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ll/֡ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ll/֡ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 6

    const/4 v0, 0x0

    .line 112
    iget-boolean v1, p0, Ll/ܿۢ֨;->᩸:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    if-eqz v1, :cond_1

    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 114
    :cond_1
    new-instance v1, Ll/֡ۢ֨;

    invoke-super {p0}, Landroid/widget/ImageButton;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v0, v4, v2

    invoke-direct {v1, v3, v4}, Ll/֡ۢ֨;-><init>(Landroid/os/Parcelable;[Landroid/graphics/drawable/Drawable;)V

    return-object v1
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    const/4 v0, 0x0

    .line 105
    invoke-static {p0, v0, p1}, Ll/۠ۢ֨;->֫(Landroid/widget/ImageView;ZI)Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    :cond_0
    return-void
.end method

.method public final setImageResource(I)V
    .locals 1

    const/4 v0, 0x1

    .line 98
    invoke-static {p0, v0, p1}, Ll/۠ۢ֨;->֫(Landroid/widget/ImageView;ZI)Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method public final setImageURI(Landroid/net/Uri;)V
    .locals 2

    .line 91
    sget-object v0, Ll/۠ۢ֨;->֫:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 72
    :try_start_0
    new-instance v0, Ll/֫ۢ֨;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/֫ۢ֨;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 92
    :catch_0
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageURI(Landroid/net/Uri;)V

    return-void
.end method
