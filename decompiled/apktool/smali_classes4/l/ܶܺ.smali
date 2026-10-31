.class public final Ll/ܶܺ;
.super Ljava/lang/Object;
.source "J62F"


# static fields
.field public static final ֫:[I

.field public static final ۧ:[I

.field public static final ܽ:Landroid/graphics/Rect;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x10100a0

    .line 42
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/ܶܺ;->֫:[I

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 43
    sput-object v0, Ll/ܶܺ;->ۧ:[I

    .line 45
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Ll/ܶܺ;->ܽ:Landroid/graphics/Rect;

    return-void
.end method

.method public static ֫(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    return-object p1

    .line 133
    :pswitch_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    .line 131
    :pswitch_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    .line 129
    :pswitch_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    .line 127
    :cond_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    .line 125
    :cond_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    .line 123
    :cond_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 77
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    sget-object v3, Ll/ܶܺ;->֫:[I

    sget-object v4, Ll/ܶܺ;->ۧ:[I

    if-ne v1, v2, :cond_2

    const-string v2, "android.graphics.drawable.VectorDrawable"

    .line 78
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 105
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    if-eqz v0, :cond_1

    .line 106
    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_0

    .line 111
    :cond_0
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_1

    .line 108
    :cond_1
    :goto_0
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 114
    :goto_1
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    return-void

    :cond_2
    const/16 v2, 0x1d

    if-lt v1, v2, :cond_5

    const/16 v2, 0x1f

    if-ge v1, v2, :cond_5

    const-string v1, "android.graphics.drawable.ColorStateListDrawable"

    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 105
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    if-eqz v0, :cond_4

    .line 106
    array-length v1, v0

    if-nez v1, :cond_3

    goto :goto_2

    .line 111
    :cond_3
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_3

    .line 108
    :cond_4
    :goto_2
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 114
    :goto_3
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_5
    return-void
.end method

.method public static ۧ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
    .locals 4

    .line 57
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 58
    invoke-static {p0}, Ll/۠ܺ;->֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Insets;

    move-result-object p0

    .line 59
    new-instance v0, Landroid/graphics/Rect;

    invoke-static {p0}, Ll/۠ۢ֡;->֫(Landroid/graphics/Insets;)I

    move-result v1

    invoke-static {p0}, Ll/ۙ᩵ᩴ;->֫(Landroid/graphics/Insets;)I

    move-result v2

    invoke-static {p0}, Ll/۫ۤ᩷;->֫(Landroid/graphics/Insets;)I

    move-result v3

    invoke-static {p0}, Ll/ܺ۫᩷;->֫(Landroid/graphics/Insets;)I

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    .line 66
    :cond_0
    invoke-static {p0}, Ll/۠۬;->ܿ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, Ll/֨ܺ;->֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method
