.class public Ll/᩹ܺ֫;
.super Ljava/lang/Object;
.source "V627"

# interfaces
.implements Ll/ܶܺ֫;


# static fields
.field public static final synthetic ֫:I

.field public static ۧ:Ll/᩹ܺ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final synthetic ֫()Ll/᩹ܺ֫;
    .locals 1

    .line 197
    sget-object v0, Ll/᩹ܺ֫;->ۧ:Ll/᩹ܺ֫;

    return-object v0
.end method

.method public static final synthetic ֫(Ll/᩹ܺ֫;)V
    .locals 0

    .line 197
    sput-object p0, Ll/᩹ܺ֫;->ۧ:Ll/᩹ܺ֫;

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/Class;)Ll/ۚܺ֫;
    .locals 4

    const-string v0, "Cannot create an instance of "

    const/4 v1, 0x0

    .line 202
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "{\n                modelC\u2026wInstance()\n            }"

    .line 201
    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ll/ۚܺ֫;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    .line 208
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v1

    .line 206
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_2
    move-exception v1

    .line 204
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public ֫(Ljava/lang/Class;Ll/ܽۖ֫;)Ll/ۚܺ֫;
    .locals 0

    .line 83
    invoke-interface {p0, p1}, Ll/ܶܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1
.end method
