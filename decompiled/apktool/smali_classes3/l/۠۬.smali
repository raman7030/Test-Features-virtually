.class public final Ll/۠۬;
.super Ljava/lang/Object;
.source "65YF"


# static fields
.field public static ֫:Ljava/lang/reflect/Method;

.field public static ۧ:Z

.field public static ܽ:Ljava/lang/reflect/Method;

.field public static ᩳ:Z


# direct methods
.method public static ֫(Landroid/graphics/drawable/Drawable;FF)V
    .locals 0

    .line 108
    invoke-static {p0, p1, p2}, Ll/ۚ۬;->֫(Landroid/graphics/drawable/Drawable;FF)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;IIII)V
    .locals 0

    .line 125
    invoke-static {p0, p1, p2, p3, p4}, Ll/ۚ۬;->֫(Landroid/graphics/drawable/Drawable;IIII)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 151
    invoke-static {p0, p1}, Ll/ۚ۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 188
    invoke-static {p0, p1}, Ll/ۚ۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 273
    invoke-static {p0, p1, p2, p3, p4}, Ll/ۚ۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 165
    invoke-static {p0, p1}, Ll/ۚ۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;)Z
    .locals 0

    .line 198
    invoke-static {p0}, Ll/ۚ۬;->֫(Landroid/graphics/drawable/Drawable;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;I)Z
    .locals 6

    .line 360
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 361
    invoke-static {p0, p1}, Ll/֨۬;->֫(Landroid/graphics/drawable/Drawable;I)Z

    move-result p0

    return p0

    .line 363
    :cond_0
    sget-boolean v0, Ll/۠۬;->ᩳ:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 365
    :try_start_0
    const-class v0, Landroid/graphics/drawable/Drawable;

    const-string v3, "setLayoutDirection"

    new-array v4, v2, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v1

    .line 366
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/۠۬;->ܽ:Ljava/lang/reflect/Method;

    .line 367
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 371
    :catch_0
    sput-boolean v2, Ll/۠۬;->ᩳ:Z

    .line 374
    :cond_1
    sget-object v0, Ll/۠۬;->ܽ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    .line 376
    :try_start_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v3, v2, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return v2

    :catch_1
    const/4 p0, 0x0

    .line 380
    sput-object p0, Ll/۠۬;->ܽ:Ljava/lang/reflect/Method;

    :cond_2
    return v1
.end method

.method public static ۧ(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 224
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 226
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    return-void

    .line 228
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 234
    instance-of v0, p0, Landroid/graphics/drawable/InsetDrawable;

    if-eqz v0, :cond_1

    .line 235
    check-cast p0, Landroid/graphics/drawable/InsetDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/InsetDrawable;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, Ll/۠۬;->ۧ(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 236
    :cond_1
    instance-of v0, p0, Ll/۫۬;

    if-eqz v0, :cond_2

    .line 237
    check-cast p0, Ll/۫۬;

    invoke-interface {p0}, Ll/۫۬;->֫()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, Ll/۠۬;->ۧ(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 238
    :cond_2
    instance-of v0, p0, Landroid/graphics/drawable/DrawableContainer;

    if-eqz v0, :cond_4

    .line 239
    check-cast p0, Landroid/graphics/drawable/DrawableContainer;

    .line 241
    invoke-virtual {p0}, Landroid/graphics/drawable/DrawableContainer;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p0

    check-cast p0, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;

    if-eqz p0, :cond_4

    .line 244
    invoke-virtual {p0}, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    .line 245
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;->getChild(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 247
    invoke-static {v2}, Ll/۠۬;->ۧ(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public static ۧ(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 137
    invoke-static {p0, p1}, Ll/ۚ۬;->֫(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public static ܳ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 312
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 315
    :cond_0
    instance-of v0, p0, Ll/۬۬;

    if-nez v0, :cond_1

    .line 316
    new-instance v0, Ll/ۛ۬;

    invoke-direct {v0, p0}, Ll/ۛ۬;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static ܽ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;
    .locals 0

    .line 213
    invoke-static {p0}, Ll/ۚ۬;->ۧ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 339
    instance-of v0, p0, Ll/۫۬;

    if-eqz v0, :cond_0

    .line 340
    check-cast p0, Ll/۫۬;

    invoke-interface {p0}, Ll/۫۬;->֫()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ᩳ(Landroid/graphics/drawable/Drawable;)I
    .locals 4

    .line 396
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 397
    invoke-static {p0}, Ll/֨۬;->֫(Landroid/graphics/drawable/Drawable;)I

    move-result p0

    return p0

    .line 399
    :cond_0
    sget-boolean v0, Ll/۠۬;->ۧ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 401
    :try_start_0
    const-class v2, Landroid/graphics/drawable/Drawable;

    const-string v3, "getLayoutDirection"

    .line 402
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Ll/۠۬;->֫:Ljava/lang/reflect/Method;

    .line 403
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 407
    :catch_0
    sput-boolean v0, Ll/۠۬;->ۧ:Z

    .line 410
    :cond_1
    sget-object v0, Ll/۠۬;->֫:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    .line 412
    :try_start_1
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return p0

    .line 415
    :catch_1
    sput-object v1, Ll/۠۬;->֫:Ljava/lang/reflect/Method;

    :cond_2
    const/4 p0, 0x0

    return p0
.end method
