.class public final Ll/ܺᩴ֡;
.super Ljava/lang/Object;
.source "L72M"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 74
    :cond_0
    const-class v0, Ll/ܺᩴ֡;

    .line 76
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    .line 75
    invoke-static {v0, v1, p1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
