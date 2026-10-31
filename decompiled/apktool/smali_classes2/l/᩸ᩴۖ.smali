.class public abstract Ll/᩸ᩴۖ;
.super Ll/ۘۜۖ;
.source "D9PY"


# static fields
.field public static ᩶:Ll/ۧۤᩴ;


# instance fields
.field public ᩸:I

.field public ᩹:Ll/ۡ֨ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 363
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/᩸ᩴۖ;->᩶:Ll/ۧۤᩴ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ll/ۘۜۖ;-><init>()V

    const/4 v0, -0x1

    .line 55
    iput v0, p0, Ll/᩸ᩴۖ;->᩸:I

    .line 61
    invoke-static {}, Ll/ۡ֨ۖ;->ᩳ()Ll/ۡ֨ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ᩴۖ;->᩹:Ll/ۡ֨ۖ;

    return-void
.end method

.method public static varargs ֫(Ljava/lang/reflect/Method;Ll/᩸ᩴۖ;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1254
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 1259
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 1260
    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    .line 1262
    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    .line 1263
    check-cast p0, Ljava/lang/Error;

    throw p0

    .line 1265
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 1261
    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    .line 1256
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/Class;)Ll/᩸ᩴۖ;
    .locals 4

    .line 368
    sget-object v0, Ll/᩸ᩴۖ;->᩶:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ᩴۖ;

    if-nez v1, :cond_0

    .line 373
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 377
    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ᩴۖ;

    goto :goto_0

    :catch_0
    move-exception p0

    .line 375
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v1, :cond_2

    .line 382
    invoke-static {p0}, Ll/᩸֨ۖ;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ᩴۖ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    sget-object v2, Ll/۠ᩴۖ;->ۙ:Ll/۠ᩴۖ;

    .line 290
    invoke-virtual {v1}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    move-result-object v1

    .line 96
    check-cast v1, Ll/᩸ᩴۖ;

    if-eqz v1, :cond_1

    .line 387
    invoke-virtual {v0, p0, v1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    .line 385
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    .line 156
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 160
    :cond_2
    invoke-static {}, Ll/ۨ֡ۖ;->֫()Ll/ۨ֡ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ֡ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object v0

    .line 160
    check-cast p1, Ll/᩸ᩴۖ;

    invoke-interface {v0, p0, p1}, Ll/ۢۚۖ;->֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;)Z

    move-result p1

    return p1
.end method

.method public getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 96
    sget-object v0, Ll/۠ᩴۖ;->ۙ:Ll/۠ᩴۖ;

    .line 290
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 96
    check-cast v0, Ll/᩸ᩴۖ;

    return-object v0
.end method

.method public final getMemoizedSerializedSize()I
    .locals 2

    .line 299
    iget v0, p0, Ll/᩸ᩴۖ;->᩸:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    return v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 90
    sget-object v0, Ll/۠ᩴۖ;->ۙ:Ll/۠ᩴۖ;

    .line 290
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 90
    check-cast v0, Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 1

    const/4 v0, 0x0

    .line 345
    invoke-virtual {p0, v0}, Ll/᩸ᩴۖ;->getSerializedSize(Ll/ۢۚۖ;)I

    move-result v0

    return v0
.end method

.method public final getSerializedSize(Ll/ۢۚۖ;)I
    .locals 2

    .line 321
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    .line 351
    invoke-static {}, Ll/ۨ֡ۖ;->֫()Ll/ۨ֡ۖ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨ֡ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object p1

    .line 351
    invoke-interface {p1, p0}, Ll/ۢۚۖ;->֫(Ll/ۘۜۖ;)I

    move-result p1

    goto :goto_0

    .line 354
    :cond_0
    invoke-interface {p1, p0}, Ll/ۢۚۖ;->֫(Ll/ۘۜۖ;)I

    move-result p1

    :goto_0
    if-ltz p1, :cond_1

    return p1

    .line 325
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "serialized size must be non-negative, was "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 325
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 331
    :cond_2
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->getMemoizedSerializedSize()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_3

    .line 332
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->getMemoizedSerializedSize()I

    move-result p1

    return p1

    :cond_3
    if-nez p1, :cond_4

    .line 351
    invoke-static {}, Ll/ۨ֡ۖ;->֫()Ll/ۨ֡ۖ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۨ֡ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object p1

    .line 351
    invoke-interface {p1, p0}, Ll/ۢۚۖ;->֫(Ll/ۘۜۖ;)I

    move-result p1

    goto :goto_1

    .line 354
    :cond_4
    invoke-interface {p1, p0}, Ll/ۢۚۖ;->֫(Ll/ۘۜۖ;)I

    move-result p1

    .line 337
    :goto_1
    invoke-virtual {p0, p1}, Ll/᩸ᩴۖ;->setMemoizedSerializedSize(I)V

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 129
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    invoke-static {}, Ll/ۨ֡ۖ;->֫()Ll/ۨ֡ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ֡ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object v0

    .line 141
    invoke-interface {v0, p0}, Ll/ۢۚۖ;->֫(Ll/᩸ᩴۖ;)I

    move-result v0

    return v0

    .line 72
    :cond_0
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-nez v0, :cond_1

    .line 141
    invoke-static {}, Ll/ۨ֡ۖ;->֫()Ll/ۨ֡ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ֡ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object v0

    .line 141
    invoke-interface {v0, p0}, Ll/ۢۚۖ;->֫(Ll/᩸ᩴۖ;)I

    move-result v0

    .line 76
    iput v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    .line 72
    :cond_1
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1478
    sget-object v0, Ll/۠ᩴۖ;->ۙ:Ll/۠ᩴۖ;

    .line 290
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 1479
    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    .line 1486
    :cond_1
    invoke-static {}, Ll/ۨ֡ۖ;->֫()Ll/ۨ֡ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ֡ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object v0

    .line 1486
    invoke-interface {v0, p0}, Ll/ۢۚۖ;->ۧ(Ljava/lang/Object;)Z

    move-result v1

    .line 285
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    :goto_0
    return v1
.end method

.method public newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 102
    sget-object v0, Ll/۠ᩴۖ;->ۙ:Ll/۠ᩴۖ;

    .line 290
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 102
    check-cast v0, Ll/᩵ᩴۖ;

    return-object v0
.end method

.method public final setMemoizedSerializedSize(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 307
    iget v0, p0, Ll/᩸ᩴۖ;->᩸:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    const v1, 0x7fffffff

    and-int/2addr p1, v1

    or-int/2addr p1, v0

    iput p1, p0, Ll/᩸ᩴۖ;->᩸:I

    return-void

    .line 305
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "serialized size must be non-negative, was "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 305
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 37
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->toBuilder()Ll/᩵ᩴۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/᩵ᩴۖ;
    .locals 1

    .line 229
    sget-object v0, Ll/۠ᩴۖ;->ۙ:Ll/۠ᩴۖ;

    .line 290
    invoke-virtual {p0}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 229
    check-cast v0, Ll/᩵ᩴۖ;

    .line 230
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 504
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 123
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۖ֡ۖ;->֫(Ll/᩸ᩴۖ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 2

    .line 313
    invoke-static {}, Ll/ۨ֡ۖ;->֫()Ll/ۨ֡ۖ;

    move-result-object v0

    .line 314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ֡ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object v0

    .line 315
    invoke-static {p1}, Ll/᩻᩷ۖ;->֫(Ll/ܳ᩷ۖ;)Ll/᩻᩷ۖ;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ll/ۜ۠ۖ;)V

    return-void
.end method

.method public abstract ֫()Ljava/lang/Object;
.end method

.method public final ۧ()Z
    .locals 2

    .line 64
    iget v0, p0, Ll/᩸ᩴۖ;->᩸:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 2

    .line 68
    iget v0, p0, Ll/᩸ᩴۖ;->᩸:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Ll/᩸ᩴۖ;->᩸:I

    return-void
.end method
