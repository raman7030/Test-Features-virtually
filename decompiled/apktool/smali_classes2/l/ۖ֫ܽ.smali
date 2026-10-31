.class public final Ll/ۖ֫ܽ;
.super Ljava/lang/Object;
.source "W73L"


# direct methods
.method public static ֫()Ll/ۘ֫ܽ;
    .locals 3

    .line 73
    :try_start_0
    invoke-static {}, Ll/ۖ֫ܽ;->ۧ()Ljava/lang/reflect/InvocationHandler;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    new-instance v1, Ll/ᩴ֫ܽ;

    const-class v2, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    invoke-static {v2, v0}, Ll/ܺᩴ֡;->֫(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    invoke-direct {v1, v0}, Ll/ᩴ֫ܽ;-><init>(Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;)V

    return-object v1

    .line 82
    :catch_0
    new-instance v0, Ll/֫֫ܽ;

    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v0

    .line 78
    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ۧ()Ljava/lang/reflect/InvocationHandler;
    .locals 4

    .line 92
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    .line 93
    invoke-static {}, Ll/᩺۟ۧ;->֫()Ljava/lang/ClassLoader;

    move-result-object v0

    goto :goto_0

    .line 102
    :cond_0
    :try_start_0
    const-class v0, Landroid/webkit/WebView;

    const-string v1, "getFactory"

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 104
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    :goto_0
    const-string v1, "org.chromium.support_lib_glue.SupportLibReflectionUtil"

    const/4 v3, 0x0

    .line 62
    invoke-static {v1, v3, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "createWebViewProviderFactory"

    .line 64
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 66
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/InvocationHandler;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    .line 106
    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ܽ()Ll/᩵֫ܽ;
    .locals 1

    .line 47
    sget-object v0, Ll/ۡ֫ܽ;->֫:Ll/᩵֫ܽ;

    return-object v0
.end method

.method public static ᩳ()Ll/ۘ֫ܽ;
    .locals 1

    .line 43
    sget-object v0, Ll/ܺ֫ܽ;->֫:Ll/ۘ֫ܽ;

    return-object v0
.end method
