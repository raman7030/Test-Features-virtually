.class public final Ll/᩶᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# direct methods
.method public static ֫(Lcom/tencent/connect/common/AssistActivity;)V
    .locals 4

    const-string v0, "ActivityFixUtils"

    .line 22
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ne v1, v2, :cond_0

    invoke-static {p0}, Ll/᩶᩸ۘ;->ܽ(Lcom/tencent/connect/common/AssistActivity;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 53
    :try_start_0
    const-class v2, Landroid/app/Activity;

    const-string v3, "mActivityInfo"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x1

    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 55
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ActivityInfo;

    const/4 v3, -0x1

    .line 56
    iput v3, p0, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    .line 57
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    const-string v2, "fixOrientation exception"

    .line 60
    invoke-static {v0, v2, p0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    :goto_0
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v2, "onCreate fixOrientation when Oreo, result = "

    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static ۧ(Lcom/tencent/connect/common/AssistActivity;)Z
    .locals 2

    .line 29
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Ll/᩶᩸ۘ;->ܽ(Lcom/tencent/connect/common/AssistActivity;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "ActivityFixUtils"

    const-string v0, "avoid calling setRequestedOrientation when Oreo."

    .line 30
    invoke-static {p0, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Lcom/tencent/connect/common/AssistActivity;)Z
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.android.internal.R$styleable"

    .line 39
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "Window"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    .line 40
    invoke-virtual {p0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p0

    .line 41
    const-class v1, Landroid/content/pm/ActivityInfo;

    const-string v3, "isTranslucentOrFloating"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    const-class v6, Landroid/content/res/TypedArray;

    aput-object v6, v5, v0

    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 42
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v3, v4, [Ljava/lang/Object;

    aput-object p0, v3, v0

    .line 43
    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 44
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return p0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception p0

    move-object v0, p0

    const/4 p0, 0x0

    :goto_0
    const-string v1, "ActivityFixUtils"

    const-string v2, "isTranslucentOrFloating exception"

    .line 46
    invoke-static {v1, v2, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return p0
.end method
