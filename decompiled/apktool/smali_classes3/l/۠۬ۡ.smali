.class public final Ll/۠۬ۡ;
.super Ljava/lang/Object;
.source "W9DK"


# direct methods
.method public static ֫(Ll/ܽۙܿ;)Ljava/lang/Object;
    .locals 4

    :try_start_0
    const-string v0, "android.view.ViewTreeObserver$OnComputeInternalInsetsListener"

    .line 23
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    new-instance v0, Ll/֨۬ۡ;

    invoke-direct {v0, p0}, Ll/֨۬ۡ;-><init>(Ll/ܽۙܿ;)V

    invoke-static {v1, v2, v0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method
