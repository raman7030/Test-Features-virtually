.class public final Ll/۠ܺ֫;
.super Ll/᩹ܺ֫;
.source "V627"


# static fields
.field public static ܿ:Ll/۠ܺ֫;

.field public static final ᩳ:Ll/ܰܺ֫;


# instance fields
.field public final ܽ:Landroid/app/Application;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 356
    sget-object v0, Ll/֨ܺ֫;->֫:Ll/֨ܺ֫;

    sput-object v0, Ll/۠ܺ֫;->ᩳ:Ll/ܰܺ֫;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 267
    invoke-direct {p0, v0, v1}, Ll/۠ܺ֫;-><init>(Landroid/app/Application;I)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 275
    invoke-direct {p0, p1, v0}, Ll/۠ܺ֫;-><init>(Landroid/app/Application;I)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;I)V
    .locals 0

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 254
    iput-object p1, p0, Ll/۠ܺ֫;->ܽ:Landroid/app/Application;

    return-void
.end method

.method private final ֫(Ljava/lang/Class;Landroid/app/Application;)Ll/ۚܺ֫;
    .locals 5

    const-string v0, "Cannot create an instance of "

    .line 312
    const-class v1, Ll/ᩴۢ֫;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :try_start_0
    new-array v2, v1, [Ljava/lang/Class;

    .line 314
    const-class v3, Landroid/app/Application;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v4

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۚܺ֫;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    const-string p1, "{\n                try {\n\u2026          }\n            }"

    .line 312
    invoke-static {p2, p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2

    :catch_0
    move-exception p2

    .line 322
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception p2

    .line 320
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception p2

    .line 318
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception p2

    .line 316
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 324
    :cond_0
    invoke-super {p0, p1}, Ll/᩹ܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic ֫()Ll/۠ܺ֫;
    .locals 1

    .line 252
    sget-object v0, Ll/۠ܺ֫;->ܿ:Ll/۠ܺ֫;

    return-object v0
.end method

.method public static final synthetic ֫(Ll/۠ܺ֫;)V
    .locals 0

    .line 252
    sput-object p0, Ll/۠ܺ֫;->ܿ:Ll/۠ܺ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ll/ۚܺ֫;
    .locals 1

    .line 299
    iget-object v0, p0, Ll/۠ܺ֫;->ܽ:Landroid/app/Application;

    if-eqz v0, :cond_0

    .line 306
    invoke-direct {p0, p1, v0}, Ll/۠ܺ֫;->֫(Ljava/lang/Class;Landroid/app/Application;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 300
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras)."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/Class;Ll/ܽۖ֫;)Ll/ۚܺ֫;
    .locals 1

    .line 279
    iget-object v0, p0, Ll/۠ܺ֫;->ܽ:Landroid/app/Application;

    if-eqz v0, :cond_0

    .line 280
    invoke-virtual {p0, p1}, Ll/۠ܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 282
    :cond_0
    sget-object v0, Ll/֨ܺ֫;->֫:Ll/֨ܺ֫;

    .line 66
    invoke-virtual {p2}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 282
    check-cast p2, Landroid/app/Application;

    if-eqz p2, :cond_1

    .line 284
    invoke-direct {p0, p1, p2}, Ll/۠ܺ֫;->֫(Ljava/lang/Class;Landroid/app/Application;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 287
    :cond_1
    const-class p2, Ll/ᩴۢ֫;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 292
    invoke-super {p0, p1}, Ll/᩹ܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    return-object p1

    .line 288
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "CreationExtras must have an application by `APPLICATION_KEY`"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
