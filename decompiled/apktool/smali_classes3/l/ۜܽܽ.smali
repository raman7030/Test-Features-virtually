.class public final Ll/ۜܽܽ;
.super Ljava/lang/Object;
.source "4ALA"

# interfaces
.implements Ll/᩻ܽܽ;


# static fields
.field public static final ֫:Ll/ۜܽܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/ۜܽܽ;

    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/ۜܽܽ;->֫:Ll/ۜܽܽ;

    return-void
.end method

.method public static ֫(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 10

    .line 128
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 129
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 130
    :try_start_0
    const-class v4, Landroid/content/res/Configuration;

    const-string v5, "windowConfiguration"

    .line 132
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 133
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 134
    invoke-virtual {v4, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "null cannot be cast to non-null type android.graphics.Rect"

    if-eqz v4, :cond_1

    .line 140
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v6, "getBounds"

    invoke-virtual {v4, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 141
    invoke-virtual {v4, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 143
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v6, "getAppBounds"

    invoke-virtual {v4, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 144
    invoke-virtual {v4, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    check-cast v1, Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 213
    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 217
    invoke-virtual {v1, v0}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 159
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    .line 164
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 165
    new-instance v4, Landroid/graphics/Point;

    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    const-string v5, "currentDisplay"

    .line 169
    invoke-static {v1, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-virtual {v1, v4}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_6

    .line 334
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const-string v7, "dimen"

    const-string v8, "android"

    const-string v9, "navigation_bar_height"

    .line 335
    invoke-virtual {v5, v9, v7, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    if-lez v7, :cond_3

    .line 337
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    .line 175
    :goto_1
    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v7, v5

    iget v8, v4, Landroid/graphics/Point;->y:I

    if-ne v7, v8, :cond_4

    .line 176
    iput v7, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_2

    .line 177
    :cond_4
    iget v7, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v5

    iget v8, v4, Landroid/graphics/Point;->x:I

    if-ne v7, v8, :cond_5

    .line 178
    iput v7, v0, Landroid/graphics/Rect;->right:I

    goto :goto_2

    .line 179
    :cond_5
    iget v7, v0, Landroid/graphics/Rect;->left:I

    if-ne v7, v5, :cond_6

    .line 180
    iput v6, v0, Landroid/graphics/Rect;->left:I

    .line 183
    :cond_6
    :goto_2
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v5

    iget v7, v4, Landroid/graphics/Point;->x:I

    if-lt v5, v7, :cond_7

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v5

    iget v7, v4, Landroid/graphics/Point;->y:I

    if-ge v5, v7, :cond_c

    .line 27
    :cond_7
    invoke-virtual {p0}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result p0

    if-nez p0, :cond_c

    :try_start_2
    const-string p0, "android.view.DisplayInfo"

    .line 352
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    .line 353
    invoke-virtual {p0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    .line 354
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 355
    invoke-virtual {p0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 356
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-string v7, "getDisplayInfo"

    .line 357
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    new-array v9, v2, [Ljava/lang/Class;

    aput-object v8, v9, v6

    .line 356
    invoke-virtual {v5, v7, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 359
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v7, v2, [Ljava/lang/Object;

    aput-object p0, v7, v6

    .line 360
    invoke-virtual {v5, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v5, "displayCutout"

    invoke-virtual {v1, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 362
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 363
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 364
    instance-of v1, p0, Landroid/view/DisplayCutout;

    if-eqz v1, :cond_8

    .line 365
    check-cast p0, Landroid/view/DisplayCutout;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_1

    move-object v3, p0

    goto :goto_3

    :catch_1
    nop

    :cond_8
    :goto_3
    if-eqz v3, :cond_c

    .line 192
    iget p0, v0, Landroid/graphics/Rect;->left:I

    .line 38
    invoke-virtual {v3}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    move-result v1

    if-ne p0, v1, :cond_9

    .line 193
    iput v6, v0, Landroid/graphics/Rect;->left:I

    .line 195
    :cond_9
    iget p0, v4, Landroid/graphics/Point;->x:I

    iget v1, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr p0, v1

    .line 46
    invoke-virtual {v3}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v1

    if-ne p0, v1, :cond_a

    .line 196
    iget p0, v0, Landroid/graphics/Rect;->right:I

    .line 46
    invoke-virtual {v3}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v1

    add-int/2addr v1, p0

    .line 196
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 198
    :cond_a
    iget p0, v0, Landroid/graphics/Rect;->top:I

    .line 42
    invoke-virtual {v3}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    move-result v1

    if-ne p0, v1, :cond_b

    .line 199
    iput v6, v0, Landroid/graphics/Rect;->top:I

    .line 201
    :cond_b
    iget p0, v4, Landroid/graphics/Point;->y:I

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p0, v1

    .line 50
    invoke-virtual {v3}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result v1

    if-ne p0, v1, :cond_c

    .line 202
    iget p0, v0, Landroid/graphics/Rect;->bottom:I

    .line 50
    invoke-virtual {v3}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result v1

    add-int/2addr v1, p0

    .line 202
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    :cond_c
    return-object v0
.end method
