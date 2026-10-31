.class public final Ll/᩹ᩴ;
.super Ljava/lang/Object;
.source "R697"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Z

.field public static ܽ:Ljava/lang/reflect/Method;

.field public static ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 7

    .line 66
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 67
    invoke-static {p0, p1, p2}, Ll/᩸ᩴ;->֫(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    return-void

    .line 69
    :cond_0
    sget-boolean v0, Ll/᩹ᩴ;->ᩳ:Z

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-nez v0, :cond_1

    .line 70
    sput-boolean v3, Ll/᩹ᩴ;->ᩳ:Z

    .line 72
    :try_start_0
    const-class v0, Landroid/view/View;

    const-string v4, "computeFitSystemWindows"

    new-array v5, v2, [Ljava/lang/Class;

    const-class v6, Landroid/graphics/Rect;

    aput-object v6, v5, v1

    aput-object v6, v5, v3

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/᩹ᩴ;->ܽ:Ljava/lang/reflect/Method;

    .line 74
    invoke-virtual {v0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v0

    if-nez v0, :cond_1

    .line 75
    sget-object v0, Ll/᩹ᩴ;->ܽ:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 82
    :cond_1
    :goto_0
    sget-object v0, Ll/᩹ᩴ;->ܽ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    aput-object p2, v2, v3

    .line 84
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_2
    return-void
.end method
