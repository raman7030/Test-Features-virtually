.class public final Ll/ܶᩴۖ;
.super Ljava/lang/Object;
.source "D9PY"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public final ᩸:[B

.field public final ᩹:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ll/ۘᩴۖ;)V
    .locals 1

    .line 1420
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1421
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Ll/ܶᩴۖ;->᩹:Ljava/lang/Class;

    .line 1422
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܶᩴۖ;->᩶:Ljava/lang/String;

    .line 1423
    invoke-interface {p1}, Ll/ۡ֡ۖ;->toByteArray()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܶᩴۖ;->᩸:[B

    return-void
.end method

.method private ֫()Ljava/lang/Class;
    .locals 1

    .line 1454
    iget-object v0, p0, Ll/ܶᩴۖ;->᩹:Ljava/lang/Class;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ܶᩴۖ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 4

    .line 1434
    iget-object v0, p0, Ll/ܶᩴۖ;->᩶:Ljava/lang/String;

    :try_start_0
    invoke-direct {p0}, Ll/ܶᩴۖ;->֫()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "DEFAULT_INSTANCE"

    .line 1436
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    .line 1437
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v2, 0x0

    .line 1438
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    .line 1439
    invoke-interface {v1}, Ll/ۡ֡ۖ;->newBuilderForType()Ll/ۢ֡ۖ;

    move-result-object v1

    iget-object v2, p0, Ll/ܶᩴۖ;->᩸:[B

    invoke-interface {v1, v2}, Ll/ۢ֡ۖ;->mergeFrom([B)Ll/ۢ֡ۖ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۢ֡ۖ;->buildPartial()Ll/ۡ֡ۖ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 1449
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to understand proto buffer"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 1447
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to call parsePartialFrom"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v1

    .line 1445
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Unable to call DEFAULT_INSTANCE in "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_3
    move-exception v1

    .line 1443
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Unable to find DEFAULT_INSTANCE in "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_4
    move-exception v1

    .line 1441
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Unable to find proto buffer class: "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method
