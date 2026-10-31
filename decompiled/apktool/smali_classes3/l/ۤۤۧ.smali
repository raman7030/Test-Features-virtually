.class public final Ll/ۤۤۧ;
.super Ljava/lang/Object;
.source "QB8K"


# static fields
.field public static ֫:Ljava/lang/reflect/Method;

.field public static ۧ:J


# direct methods
.method public static ֫()Z
    .locals 7

    .line 61
    :try_start_0
    sget-object v0, Ll/ۤۤۧ;->֫:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    .line 62
    invoke-static {}, Landroid/os/Trace;->isEnabled()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 159
    :catch_0
    :cond_0
    const-class v0, Landroid/os/Trace;

    const/4 v1, 0x0

    .line 161
    :try_start_1
    sget-object v2, Ll/ۤۤۧ;->֫:Ljava/lang/reflect/Method;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    const-string v2, "TRACE_TAG_APP"

    .line 162
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 163
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v5

    sput-wide v5, Ll/ۤۤۧ;->ۧ:J

    const-string v2, "isTagEnabled"

    new-array v5, v3, [Ljava/lang/Class;

    .line 164
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v1

    .line 165
    invoke-virtual {v0, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ll/ۤۤۧ;->֫:Ljava/lang/reflect/Method;

    .line 167
    :cond_1
    sget-object v0, Ll/ۤۤۧ;->֫:Ljava/lang/reflect/Method;

    sget-wide v5, Ll/ۤۤۧ;->ۧ:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v1

    invoke-virtual {v0, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 229
    instance-of v2, v0, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v2, :cond_3

    .line 230
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 231
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_2

    .line 232
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 234
    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    :goto_0
    return v1
.end method
