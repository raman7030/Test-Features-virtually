.class public Ll/ۡۢ֨;
.super Landroid/widget/TextView;
.source "B4IO"


# instance fields
.field public ᩸:Ll/֨ۢ֨;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 44
    invoke-direct {p0, p2, p1}, Ll/ۡۢ֨;->֫(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    invoke-direct {p0, p2, p3}, Ll/ۡۢ֨;->֫(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private ֫(I)Landroid/graphics/drawable/Drawable;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 134
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 135
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v1

    .line 136
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Ll/۠ۢ֨;->֫:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 138
    :try_start_0
    new-instance v1, Ll/֫ۢ֨;

    invoke-direct {v1, v0, p1}, Ll/֫ۢ֨;-><init>(Landroid/content/res/Resources;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 143
    :catch_0
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method private ֫(Landroid/util/AttributeSet;I)V
    .locals 10

    if-eqz p1, :cond_8

    const-string v0, "drawableLeft"

    const-string v1, "http://schemas.android.com/apk/res/android"

    const/4 v2, 0x0

    .line 86
    invoke-interface {p1, v1, v0, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v3, "drawableTop"

    .line 87
    invoke-interface {p1, v1, v3, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    invoke-direct {p0, v3}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const-string v4, "drawableRight"

    .line 88
    invoke-interface {p1, v1, v4, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v4

    invoke-direct {p0, v4}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const-string v5, "drawableBottom"

    .line 89
    invoke-interface {p1, v1, v5, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v5

    invoke-direct {p0, v5}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    const-string v6, "drawableStart"

    .line 90
    invoke-interface {p1, v1, v6, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v6

    invoke-direct {p0, v6}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    const-string v7, "drawableEnd"

    .line 91
    invoke-interface {p1, v1, v7, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v7

    invoke-direct {p0, v7}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v8

    if-nez v8, :cond_2

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v6

    :goto_0
    if-nez v7, :cond_1

    goto :goto_3

    :cond_1
    move-object v4, v7

    goto :goto_3

    :cond_2
    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v6

    :goto_1
    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    move-object v0, v7

    :goto_2
    move-object v9, v4

    move-object v4, v0

    move-object v0, v9

    .line 108
    :goto_3
    invoke-virtual {p0, v0, v3, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    const-string v0, "background"

    .line 109
    invoke-interface {p1, v1, v0, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 110
    new-instance v0, Ll/֨ۢ֨;

    invoke-direct {v0, p0, p1, p2}, Ll/֨ۢ֨;-><init>(Landroid/view/View;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Ll/ۡۢ֨;->᩸:Ll/֨ۢ֨;

    .line 117
    iget p1, v0, Ll/֨ۢ֨;->ۧ:I

    if-gez p1, :cond_5

    goto :goto_6

    .line 120
    :cond_5
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object p1

    array-length p2, p1

    const/4 v0, 0x0

    :goto_4
    if-ge v0, p2, :cond_6

    aget-object v1, p1, v0

    .line 121
    iget-object v3, p0, Ll/ۡۢ֨;->᩸:Ll/֨ۢ֨;

    iget v3, v3, Ll/֨ۢ֨;->ۧ:I

    invoke-static {v1, v3}, Ll/۠ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 123
    :cond_6
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object p1

    array-length p2, p1

    :goto_5
    if-ge v2, p2, :cond_7

    aget-object v0, p1, v2

    .line 124
    iget-object v1, p0, Ll/ۡۢ֨;->᩸:Ll/֨ۢ֨;

    iget v1, v1, Ll/֨ۢ֨;->ۧ:I

    invoke-static {v0, v1}, Ll/۠ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 126
    :cond_7
    iget-object p1, p0, Ll/ۡۢ֨;->᩸:Ll/֨ۢ֨;

    iget p1, p1, Ll/֨ۢ֨;->ۧ:I

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-static {p2, p1}, Ll/۠ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    .line 113
    :cond_8
    :goto_6
    new-instance p1, Ll/֨ۢ֨;

    invoke-direct {p1}, Ll/֨ۢ֨;-><init>()V

    iput-object p1, p0, Ll/ۡۢ֨;->᩸:Ll/֨ۢ֨;

    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 6

    .line 193
    invoke-super {p0}, Landroid/widget/TextView;->onAttachedToWindow()V

    .line 209
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 77
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    if-eqz v5, :cond_0

    .line 79
    invoke-virtual {v5, v4, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 210
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 77
    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_3

    aget-object v5, v0, v3

    if-eqz v5, :cond_2

    .line 79
    invoke-virtual {v5, v4, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 5

    .line 199
    invoke-super {p0}, Landroid/widget/TextView;->onDetachedFromWindow()V

    .line 209
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 77
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    .line 79
    invoke-virtual {v4, v2, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 210
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 77
    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    if-eqz v4, :cond_2

    .line 79
    invoke-virtual {v4, v2, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 4

    .line 173
    instance-of v0, p1, Ll/֡ۢ֨;

    if-nez v0, :cond_0

    .line 174
    invoke-super {p0, p1}, Landroid/widget/TextView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 177
    :cond_0
    check-cast p1, Ll/֡ۢ֨;

    .line 178
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/TextView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 180
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    .line 181
    aget-object v2, v0, v1

    invoke-virtual {p1, v2, v1}, Ll/֡ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    const/4 v2, 0x1

    .line 182
    aget-object v3, v0, v2

    invoke-virtual {p1, v3, v2}, Ll/֡ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    const/4 v2, 0x2

    .line 183
    aget-object v3, v0, v2

    invoke-virtual {p1, v3, v2}, Ll/֡ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    const/4 v3, 0x3

    .line 184
    aget-object v0, v0, v3

    invoke-virtual {p1, v0, v3}, Ll/֡ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    .line 185
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 186
    aget-object v1, v0, v1

    const/4 v3, 0x4

    invoke-virtual {p1, v1, v3}, Ll/֡ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    .line 187
    aget-object v0, v0, v2

    const/4 v1, 0x5

    invoke-virtual {p1, v0, v1}, Ll/֡ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    .line 188
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Ll/֡ۢ֨;->֫(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    const/4 v0, 0x7

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    .line 159
    iget-object v1, p0, Ll/ۡۢ֨;->᩸:Ll/֨ۢ֨;

    iget-boolean v1, v1, Ll/֨ۢ֨;->֫:Z

    if-eqz v1, :cond_0

    .line 160
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 161
    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 163
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x4

    .line 164
    aget-object v3, v1, v3

    aput-object v3, v0, v2

    const/4 v2, 0x2

    .line 165
    aget-object v1, v1, v2

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v1, 0x6

    .line 166
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    aput-object v2, v0, v1

    .line 168
    :cond_0
    new-instance v1, Ll/֡ۢ֨;

    invoke-super {p0}, Landroid/widget/TextView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/֡ۢ֨;-><init>(Landroid/os/Parcelable;[Landroid/graphics/drawable/Drawable;)V

    return-object v1
.end method

.method public final setBackgroundResource(I)V
    .locals 0

    .line 205
    invoke-direct {p0, p1}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V
    .locals 0

    .line 153
    invoke-direct {p0, p1}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-direct {p0, p2}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-direct {p0, p3}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-direct {p0, p4}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p4

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setCompoundDrawablesWithIntrinsicBounds(IIII)V
    .locals 0

    .line 148
    invoke-direct {p0, p1}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-direct {p0, p2}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-direct {p0, p3}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-direct {p0, p4}, Ll/ۡۢ֨;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p4

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
