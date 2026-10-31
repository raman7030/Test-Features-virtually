.class public final Ll/ۙܳ֨;
.super Ljava/lang/Object;
.source "OBKY"


# static fields
.field public static ֫:Ljava/lang/Object;

.field public static ۧ:Ljava/lang/Class;

.field public static ܽ:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 15
    const-class v0, Landroid/content/Context;

    :try_start_0
    const-string v1, "com.android.id.impl.IdProviderImpl"

    .line 21
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Ll/ۙܳ֨;->ۧ:Ljava/lang/Class;

    .line 22
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    sput-object v2, Ll/ۙܳ֨;->֫:Ljava/lang/Object;

    const-string v2, "getUDID"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    .line 23
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v2, "getOAID"

    new-array v4, v3, [Ljava/lang/Class;

    aput-object v0, v4, v5

    .line 24
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Ll/ۙܳ֨;->ܽ:Ljava/lang/reflect/Method;

    const-string v2, "getVAID"

    new-array v4, v3, [Ljava/lang/Class;

    aput-object v0, v4, v5

    .line 25
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v2, "getAAID"

    new-array v3, v3, [Ljava/lang/Class;

    aput-object v0, v3, v5

    .line 26
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ֫(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 82
    sget-object v0, Ll/ۙܳ֨;->֫:Ljava/lang/Object;

    if-eqz v0, :cond_0

    sget-object v1, Ll/ۙܳ֨;->ܽ:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    .line 84
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 86
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫()Z
    .locals 1

    .line 38
    sget-object v0, Ll/ۙܳ֨;->ۧ:Ljava/lang/Class;

    if-eqz v0, :cond_0

    sget-object v0, Ll/ۙܳ֨;->֫:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
