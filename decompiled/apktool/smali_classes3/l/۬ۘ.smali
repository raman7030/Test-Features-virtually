.class public final Ll/۬ۘ;
.super Ljava/lang/Object;
.source "H5IM"


# static fields
.field public static final ֫:[I

.field public static final ۧ:[I

.field public static final ܳ:[I

.field public static final ܽ:[I

.field public static final ܿ:[I

.field public static final ᩳ:[I

.field public static final ᩻:Ljava/lang/ThreadLocal;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/۬ۘ;->᩻:Ljava/lang/ThreadLocal;

    const v0, -0x101009e

    .line 42
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/۬ۘ;->ۧ:[I

    const v0, 0x101009c

    .line 43
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/۬ۘ;->ᩳ:[I

    const v0, 0x10100a7

    .line 45
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/۬ۘ;->ܿ:[I

    const v0, 0x10100a0

    .line 46
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/۬ۘ;->֫:[I

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 50
    sput-object v0, Ll/۬ۘ;->ܽ:[I

    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 52
    sput-object v0, Ll/۬ۘ;->ܳ:[I

    return-void
.end method

.method public static ֫(Landroid/content/Context;I)I
    .locals 4

    .line 125
    invoke-static {p0, p1}, Ll/۬ۘ;->ܽ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 126
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 128
    sget-object p0, Ll/۬ۘ;->ۧ:[I

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    invoke-virtual {v0, p0, p1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p0

    return p0

    .line 142
    :cond_0
    sget-object v0, Ll/۬ۘ;->᩻:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/TypedValue;

    if-nez v1, :cond_1

    .line 144
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 134
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v2, 0x1010033

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 135
    invoke-virtual {v1}, Landroid/util/TypedValue;->getFloat()F

    move-result v0

    .line 151
    invoke-static {p0, p1}, Ll/۬ۘ;->ۧ(Landroid/content/Context;I)I

    move-result p0

    .line 152
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, v0

    .line 153
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p0, p1}, Ll/۟ۗ;->ܽ(II)I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/content/Context;Landroid/view/View;)V
    .locals 1

    .line 161
    sget-object v0, Ll/ۗᩳ;->ۡ:[I

    invoke-virtual {p0, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p0

    const/16 v0, 0x75

    .line 167
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    :cond_0
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 174
    throw p1
.end method

.method public static ۧ(Landroid/content/Context;I)I
    .locals 2

    .line 90
    sget-object v0, Ll/۬ۘ;->ܳ:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x0

    .line 91
    invoke-static {p0, p1, v0}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ll/᩺ۘ;

    move-result-object p0

    .line 93
    :try_start_0
    invoke-virtual {p0, v1}, Ll/᩺ۘ;->֫(I)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    invoke-virtual {p0}, Ll/᩺ۘ;->ܿ()V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ll/᩺ۘ;->ܿ()V

    .line 96
    throw p1
.end method

.method public static ܽ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 2

    .line 108
    sget-object v0, Ll/۬ۘ;->ܳ:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x0

    .line 109
    invoke-static {p0, p1, v0}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ll/᩺ۘ;

    move-result-object p0

    .line 111
    :try_start_0
    invoke-virtual {p0, v1}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    invoke-virtual {p0}, Ll/᩺ۘ;->ܿ()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ll/᩺ۘ;->ܿ()V

    .line 114
    throw p1
.end method
