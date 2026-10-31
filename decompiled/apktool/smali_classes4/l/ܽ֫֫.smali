.class public final Ll/ܽ֫֫;
.super Ljava/lang/Object;
.source "R52T"


# static fields
.field public static ֫:Ljava/lang/reflect/Field;

.field public static ۧ:Z


# direct methods
.method public static ֫(Lcom/google/android/material/radiobutton/MaterialRadioButton;)Landroid/content/res/ColorStateList;
    .locals 0

    .line 75
    invoke-static {p0}, Ll/֫֫֫;->֫(Landroid/widget/CompoundButton;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lcom/google/android/material/checkbox/MaterialCheckBox;)Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 112
    invoke-static {p0}, Ll/֫֫֫;->ۧ(Landroid/widget/CompoundButton;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 127
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 128
    invoke-static {p0}, Ll/ۧ֫֫;->֫(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    .line 131
    :cond_0
    sget-boolean v0, Ll/ܽ֫֫;->ۧ:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 133
    :try_start_0
    const-class v1, Landroid/widget/CompoundButton;

    const-string v2, "mButtonDrawable"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Ll/ܽ֫֫;->֫:Ljava/lang/reflect/Field;

    .line 134
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    :catch_0
    sput-boolean v0, Ll/ܽ֫֫;->ۧ:Z

    .line 141
    :cond_1
    sget-object v0, Ll/ܽ֫֫;->֫:Ljava/lang/reflect/Field;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 143
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    .line 146
    :catch_1
    sput-object v1, Ll/ܽ֫֫;->֫:Ljava/lang/reflect/Field;

    :cond_2
    return-object v1
.end method

.method public static ֫(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 61
    invoke-static {p0, p1}, Ll/֫֫֫;->֫(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static ֫(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 98
    invoke-static {p0, p1}, Ll/֫֫֫;->֫(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method
