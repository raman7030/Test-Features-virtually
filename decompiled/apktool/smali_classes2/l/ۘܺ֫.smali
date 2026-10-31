.class public final Ll/ۘܺ֫;
.super Ljava/lang/Object;
.source "W1GC"


# static fields
.field public static final ֫:Ljava/util/List;

.field public static final ۧ:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Class;

    .line 239
    const-class v1, Landroid/app/Application;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const-class v2, Ll/ۧܺ֫;

    aput-object v2, v0, v1

    .line 238
    invoke-static {v0}, Ll/֫ܶ᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ۘܺ֫;->֫:Ljava/util/List;

    .line 242
    invoke-static {v2}, Ll/֫ܶ᩵;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/ۘܺ֫;->ۧ:Ljava/util/List;

    return-void
.end method

.method public static final ֫(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;
    .locals 6

    const-string v0, "signature"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const-string v1, "modelClass.constructors"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    .line 251
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    const-string v5, "constructor.parameterTypes"

    invoke-static {v4, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ll/᩺۠᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 169
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    return-object v3

    .line 256
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-ne v3, v5, :cond_2

    invoke-interface {v4, p1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 257
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 258
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Class "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " must have parameters in the proper order: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 257
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final synthetic ֫()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ll/ۘܺ֫;->֫:Ljava/util/List;

    return-object v0
.end method

.method public static final varargs ֫(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ll/ۚܺ֫;
    .locals 2

    .line 226
    :try_start_0
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚܺ֫;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 232
    new-instance p2, Ljava/lang/RuntimeException;

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "An exception happened in constructor of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 232
    invoke-direct {p2, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 230
    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "A "

    const-string v1, " cannot be instantiated."

    .line 0
    invoke-static {p0, v0, v1}, Ll/᩸ܳۡ;->֫(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 230
    invoke-direct {p2, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    .line 228
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to access "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final synthetic ۧ()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ll/ۘܺ֫;->ۧ:Ljava/util/List;

    return-object v0
.end method
