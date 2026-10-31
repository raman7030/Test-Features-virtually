.class public final Ll/᩷᩺;
.super Ljava/lang/Object;
.source "W5B8"


# static fields
.field public static final synthetic ֫:I

.field public static ۧ:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-ne v0, v1, :cond_0

    .line 58
    :try_start_0
    const-class v0, Landroid/view/ViewConfiguration;

    const-string v1, "getScaledScrollFactor"

    const/4 v2, 0x0

    .line 59
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/᩷᩺;->ۧ:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static ֫(Landroid/view/ViewConfiguration;Landroid/content/Context;)F
    .locals 3

    .line 124
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    sget-object v0, Ll/᩷᩺;->ۧ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 126
    :try_start_0
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-float p0, p0

    return p0

    :catch_0
    nop

    .line 132
    :cond_0
    new-instance p0, Landroid/util/TypedValue;

    invoke-direct {p0}, Landroid/util/TypedValue;-><init>()V

    .line 133
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x101004d

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 135
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Landroid/view/ViewConfiguration;)I
    .locals 2

    .line 146
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 147
    invoke-static {p0}, Ll/᩻᩺;->֫(Landroid/view/ViewConfiguration;)I

    move-result p0

    return p0

    .line 149
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    return p0
.end method

.method public static ۧ(Landroid/view/ViewConfiguration;Landroid/content/Context;)F
    .locals 2

    .line 98
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 99
    invoke-static {p0}, Ll/ܳ᩺;->֫(Landroid/view/ViewConfiguration;)F

    move-result p0

    return p0

    .line 101
    :cond_0
    invoke-static {p0, p1}, Ll/᩷᩺;->֫(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result p0

    return p0
.end method

.method public static ܽ(Landroid/view/ViewConfiguration;Landroid/content/Context;)F
    .locals 2

    .line 115
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 116
    invoke-static {p0}, Ll/ܳ᩺;->ۧ(Landroid/view/ViewConfiguration;)F

    move-result p0

    return p0

    .line 118
    :cond_0
    invoke-static {p0, p1}, Ll/᩷᩺;->֫(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result p0

    return p0
.end method

.method public static ᩳ(Landroid/view/ViewConfiguration;Landroid/content/Context;)Z
    .locals 2

    .line 160
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 161
    invoke-static {p0}, Ll/᩻᩺;->ۧ(Landroid/view/ViewConfiguration;)Z

    move-result p0

    return p0

    .line 163
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const-string p1, "bool"

    const-string v0, "android"

    const-string v1, "config_showMenuShortcutsWhenKeyboardPresent"

    .line 367
    invoke-virtual {p0, v1, p1, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_1

    .line 166
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
