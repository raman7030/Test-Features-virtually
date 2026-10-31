.class public final Ll/֨᩸᩵;
.super Ljava/lang/Object;
.source "RANP"


# static fields
.field public static ֫:Ll/ۚ᩸᩵;

.field public static final ۧ:Ll/ۚ᩸᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 66
    new-instance v0, Ll/ۚ᩸᩵;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Ll/ۚ᩸᩵;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v0, Ll/֨᩸᩵;->ۧ:Ll/ۚ᩸᩵;

    return-void
.end method

.method public static ֫(Ll/ۖ᩸᩵;)Ljava/lang/String;
    .locals 6

    .line 71
    sget-object v0, Ll/֨᩸᩵;->֫:Ll/ۚ᩸᩵;

    sget-object v1, Ll/֨᩸᩵;->ۧ:Ll/ۚ᩸᩵;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 82
    :try_start_0
    const-class v0, Ljava/lang/Class;

    const-string v3, "getModule"

    invoke-virtual {v0, v3, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const-string v4, "java.lang.Module"

    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-string v4, "getDescriptor"

    .line 84
    invoke-virtual {v3, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    const-string v5, "java.lang.module.ModuleDescriptor"

    invoke-virtual {v4, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "name"

    .line 86
    invoke-virtual {v4, v5, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 87
    new-instance v5, Ll/ۚ᩸᩵;

    invoke-direct {v5, v0, v3, v4}, Ll/ۚ᩸᩵;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v5, Ll/֨᩸᩵;->֫:Ll/ۚ᩸᩵;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v5

    goto :goto_0

    .line 89
    :catch_0
    sput-object v1, Ll/֨᩸᩵;->֫:Ll/ۚ᩸᩵;

    move-object v0, v1

    :cond_0
    :goto_0
    if-ne v0, v1, :cond_1

    goto :goto_2

    .line 75
    :cond_1
    iget-object v1, v0, Ll/ۚ᩸᩵;->ۧ:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_2

    .line 76
    :cond_2
    iget-object v1, v0, Ll/ۚ᩸᩵;->֫:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_5

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_2

    .line 77
    :cond_3
    iget-object v0, v0, Ll/ۚ᩸᩵;->ܽ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_4
    move-object p0, v2

    :goto_1
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_5

    move-object v2, p0

    check-cast v2, Ljava/lang/String;

    :cond_5
    :goto_2
    return-object v2
.end method
