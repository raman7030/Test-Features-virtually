.class public Ll/᩶ۨۧ;
.super Ljava/lang/Object;
.source "H4NK"


# static fields
.field public static ֫:Z = false

.field public static ۧ:Ljava/lang/reflect/Method; = null

.field public static ܽ:Z = true

.field public static ܿ:Z

.field public static ᩳ:Ljava/lang/reflect/Field;


# virtual methods
.method public ֫(Landroid/view/View;)F
    .locals 1

    .line 67
    sget-boolean v0, Ll/᩶ۨۧ;->ܽ:Z

    if-eqz v0, :cond_0

    .line 71
    :try_start_0
    invoke-static {p1}, Ll/᩹ۨۧ;->֫(Landroid/view/View;)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 v0, 0x0

    .line 73
    sput-boolean v0, Ll/᩶ۨۧ;->ܽ:Z

    .line 76
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result p1

    return p1
.end method

.method public ֫(Landroid/view/View;F)V
    .locals 1

    .line 52
    sget-boolean v0, Ll/᩶ۨۧ;->ܽ:Z

    if-eqz v0, :cond_0

    .line 56
    :try_start_0
    invoke-static {p1, p2}, Ll/᩹ۨۧ;->֫(Landroid/view/View;F)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 v0, 0x0

    .line 59
    sput-boolean v0, Ll/᩶ۨۧ;->ܽ:Z

    .line 62
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public ֫(Landroid/view/View;I)V
    .locals 3

    .line 167
    sget-boolean v0, Ll/᩶ۨۧ;->ܿ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 169
    :try_start_0
    const-class v1, Landroid/view/View;

    const-string v2, "mViewFlags"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Ll/᩶ۨۧ;->ᩳ:Ljava/lang/reflect/Field;

    .line 170
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    :catch_0
    sput-boolean v0, Ll/᩶ۨۧ;->ܿ:Z

    .line 176
    :cond_0
    sget-object v0, Ll/᩶ۨۧ;->ᩳ:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1

    .line 178
    :try_start_1
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    .line 179
    sget-object v1, Ll/᩶ۨۧ;->ᩳ:Ljava/lang/reflect/Field;

    and-int/lit8 v0, v0, -0xd

    or-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    return-void
.end method

.method public ֫(Landroid/view/View;IIII)V
    .locals 9

    .line 191
    sget-boolean v0, Ll/᩶ۨۧ;->֫:Z

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x1

    if-nez v0, :cond_0

    .line 193
    :try_start_0
    const-class v0, Landroid/view/View;

    const-string v6, "setFrame"

    new-array v7, v4, [Ljava/lang/Class;

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v3

    aput-object v8, v7, v5

    aput-object v8, v7, v2

    aput-object v8, v7, v1

    invoke-virtual {v0, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/᩶ۨۧ;->ۧ:Ljava/lang/reflect/Method;

    .line 195
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    :catch_0
    sput-boolean v5, Ll/᩶ۨۧ;->֫:Z

    .line 154
    :cond_0
    sget-object v0, Ll/᩶ۨۧ;->ۧ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    .line 156
    :try_start_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p2, v4, v3

    aput-object p3, v4, v5

    aput-object p4, v4, v2

    aput-object p5, v4, v1

    invoke-virtual {v0, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 160
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    :cond_1
    :goto_0
    return-void
.end method
