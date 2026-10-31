.class public final Ll/ܽۧܽ;
.super Ljava/lang/Object;
.source "7AMJ"


# direct methods
.method public static ֫(Landroid/app/Activity;Landroidx/window/extensions/layout/FoldingFeature;)Ll/ۜۧܽ;
    .locals 10

    .line 32
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getType()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    if-eq v0, v1, :cond_0

    goto/16 :goto_7

    .line 122
    :cond_0
    invoke-static {}, Ll/᩻ۧܽ;->ۧ()Ll/᩻ۧܽ;

    move-result-object v0

    goto :goto_0

    .line 117
    :cond_1
    invoke-static {}, Ll/᩻ۧܽ;->֫()Ll/᩻ۧܽ;

    move-result-object v0

    .line 37
    :goto_0
    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getState()I

    move-result v4

    if-eq v4, v3, :cond_3

    if-eq v4, v1, :cond_2

    goto/16 :goto_7

    .line 39
    :cond_2
    sget-object v1, Ll/ܿۧܽ;->ܽ:Ll/ܿۧܽ;

    goto :goto_1

    .line 38
    :cond_3
    sget-object v1, Ll/ܿۧܽ;->ۧ:Ll/ܿۧܽ;

    .line 42
    :goto_1
    new-instance v4, Ll/ۚ֫ܽ;

    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    const-string v6, "oemFeature.bounds"

    invoke-static {v5, v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v5}, Ll/ۚ֫ܽ;-><init>(Landroid/graphics/Rect;)V

    .line 73
    sget-object v5, Ll/ۜܽܽ;->֫:Ll/ۜܽܽ;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1e

    if-lt v5, v7, :cond_4

    .line 54
    invoke-static {p0}, Ll/ۛ֫ܽ;->֫(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object p0

    goto/16 :goto_6

    :cond_4
    const/16 v7, 0x1d

    if-lt v5, v7, :cond_6

    .line 90
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    .line 91
    :try_start_0
    const-class v7, Landroid/content/res/Configuration;

    const-string v8, "windowConfiguration"

    .line 93
    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    .line 94
    invoke-virtual {v7, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1606
    invoke-virtual {v7, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 96
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-string v7, "getBounds"

    invoke-virtual {v5, v7, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 97
    new-instance v7, Landroid/graphics/Rect;

    invoke-virtual {v5, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5

    check-cast v3, Landroid/graphics/Rect;

    invoke-direct {v7, v3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    move-object p0, v7

    goto/16 :goto_6

    :cond_5
    new-instance v3, Ljava/lang/NullPointerException;

    const-string v5, "null cannot be cast to non-null type android.graphics.Rect"

    invoke-direct {v3, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    :catch_0
    invoke-static {p0}, Ll/ۜܽܽ;->֫(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object p0

    goto/16 :goto_6

    .line 108
    :catch_1
    invoke-static {p0}, Ll/ۜܽܽ;->֫(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object p0

    goto/16 :goto_6

    .line 105
    :catch_2
    invoke-static {p0}, Ll/ۜܽܽ;->֫(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object p0

    goto/16 :goto_6

    .line 102
    :catch_3
    invoke-static {p0}, Ll/ۜܽܽ;->֫(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object p0

    goto/16 :goto_6

    :cond_6
    const/16 v3, 0x1c

    if-lt v5, v3, :cond_7

    .line 58
    invoke-static {p0}, Ll/ۜܽܽ;->֫(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object p0

    goto/16 :goto_6

    :cond_7
    const/16 v3, 0x18

    if-lt v5, v3, :cond_b

    .line 237
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 241
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v5

    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v5

    .line 245
    invoke-virtual {v5, v3}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 246
    invoke-static {p0}, Ll/ۤ֫ܽ;->֫(Landroid/app/Activity;)Z

    move-result v7

    if-nez v7, :cond_a

    .line 303
    new-instance v7, Landroid/graphics/Point;

    invoke-direct {v7}, Landroid/graphics/Point;-><init>()V

    .line 30
    invoke-virtual {v5, v7}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 334
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const-string v5, "dimen"

    const-string v8, "android"

    const-string v9, "navigation_bar_height"

    .line 335
    invoke-virtual {p0, v9, v5, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    if-lez v5, :cond_8

    .line 337
    invoke-virtual {p0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    goto :goto_2

    :cond_8
    const/4 p0, 0x0

    .line 252
    :goto_2
    iget v5, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v5, p0

    iget v8, v7, Landroid/graphics/Point;->y:I

    if-ne v5, v8, :cond_9

    .line 253
    iput v5, v3, Landroid/graphics/Rect;->bottom:I

    goto :goto_3

    .line 254
    :cond_9
    iget v5, v3, Landroid/graphics/Rect;->right:I

    add-int/2addr v5, p0

    iget p0, v7, Landroid/graphics/Point;->x:I

    if-ne v5, p0, :cond_a

    .line 255
    iput v5, v3, Landroid/graphics/Rect;->right:I

    :cond_a
    :goto_3
    move-object p0, v3

    goto :goto_6

    .line 274
    :cond_b
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p0

    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    const-string v3, "defaultDisplay"

    .line 275
    invoke-static {p0, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    .line 30
    invoke-virtual {p0, v3}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 276
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 277
    iget v7, v3, Landroid/graphics/Point;->x:I

    if-eqz v7, :cond_d

    iget v3, v3, Landroid/graphics/Point;->y:I

    if-nez v3, :cond_c

    goto :goto_4

    .line 283
    :cond_c
    iput v7, v5, Landroid/graphics/Rect;->right:I

    .line 284
    iput v3, v5, Landroid/graphics/Rect;->bottom:I

    goto :goto_5

    .line 281
    :cond_d
    :goto_4
    invoke-virtual {p0, v5}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    :goto_5
    move-object p0, v5

    .line 64
    :goto_6
    new-instance v3, Ll/ܳܽܽ;

    invoke-direct {v3, p0}, Ll/ܳܽܽ;-><init>(Landroid/graphics/Rect;)V

    .line 73
    invoke-virtual {v3}, Ll/ܳܽܽ;->֫()Landroid/graphics/Rect;

    move-result-object p0

    .line 65
    invoke-virtual {v4}, Ll/ۚ֫ܽ;->֫()I

    move-result v3

    if-nez v3, :cond_e

    invoke-virtual {v4}, Ll/ۚ֫ܽ;->ᩳ()I

    move-result v3

    if-nez v3, :cond_e

    goto :goto_7

    .line 77
    :cond_e
    invoke-virtual {v4}, Ll/ۚ֫ܽ;->ᩳ()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v5

    if-eq v3, v5, :cond_f

    invoke-virtual {v4}, Ll/ۚ֫ܽ;->֫()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v5

    if-eq v3, v5, :cond_f

    goto :goto_7

    .line 80
    :cond_f
    invoke-virtual {v4}, Ll/ۚ֫ܽ;->ᩳ()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v5

    if-ge v3, v5, :cond_10

    invoke-virtual {v4}, Ll/ۚ֫ܽ;->֫()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v5

    if-ge v3, v5, :cond_10

    goto :goto_7

    .line 83
    :cond_10
    invoke-virtual {v4}, Ll/ۚ֫ܽ;->ᩳ()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v5

    if-ne v3, v5, :cond_11

    invoke-virtual {v4}, Ll/ۚ֫ܽ;->֫()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result p0

    if-ne v3, p0, :cond_11

    :goto_7
    return-object v2

    .line 44
    :cond_11
    new-instance p0, Ll/ۜۧܽ;

    new-instance v2, Ll/ۚ֫ܽ;

    invoke-virtual {p1}, Landroidx/window/extensions/layout/FoldingFeature;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-static {p1, v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1}, Ll/ۚ֫ܽ;-><init>(Landroid/graphics/Rect;)V

    invoke-direct {p0, v2, v0, v1}, Ll/ۜۧܽ;-><init>(Ll/ۚ֫ܽ;Ll/᩻ۧܽ;Ll/ܿۧܽ;)V

    return-object p0
.end method

.method public static ֫(Landroid/app/Activity;Landroidx/window/extensions/layout/WindowLayoutInfo;)Ll/ܿܽܽ;
    .locals 3

    const-string v0, "info"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p1}, Landroidx/window/extensions/layout/WindowLayoutInfo;->getDisplayFeatures()Ljava/util/List;

    move-result-object p1

    const-string v0, "info.displayFeatures"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1849
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 98
    check-cast v1, Landroidx/window/extensions/layout/DisplayFeature;

    .line 53
    instance-of v2, v1, Landroidx/window/extensions/layout/FoldingFeature;

    if-eqz v2, :cond_0

    const-string v2, "feature"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/window/extensions/layout/FoldingFeature;

    invoke-static {p0, v1}, Ll/ܽۧܽ;->֫(Landroid/app/Activity;Landroidx/window/extensions/layout/FoldingFeature;)Ll/ۜۧܽ;

    move-result-object v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 57
    :cond_2
    new-instance p0, Ll/ܿܽܽ;

    invoke-direct {p0, v0}, Ll/ܿܽܽ;-><init>(Ljava/util/List;)V

    return-object p0
.end method
