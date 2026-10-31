.class public abstract Ll/۫᩺ۧ;
.super Ljava/lang/Object;
.source "A21P"


# instance fields
.field public final ֫:Ll/ۖ᩵;

.field public final ۧ:Ll/ۖ᩵;

.field public final ܽ:Ll/ۖ᩵;


# direct methods
.method public constructor <init>(Ll/ۖ᩵;Ll/ۖ᩵;Ll/ۖ᩵;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-object p1, p0, Ll/۫᩺ۧ;->ۧ:Ll/ۖ᩵;

    .line 88
    iput-object p2, p0, Ll/۫᩺ۧ;->ܽ:Ll/ۖ᩵;

    .line 89
    iput-object p3, p0, Ll/۫᩺ۧ;->֫:Ll/ۖ᩵;

    return-void
.end method

.method private ֫(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 4

    .line 1628
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 369
    iget-object v2, p0, Ll/۫᩺ۧ;->֫:Ll/ۖ᩵;

    invoke-virtual {v2, v0, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1628
    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_0

    .line 1630
    invoke-virtual {p1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1631
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Parcelizer"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 1632
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v0, v1, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    .line 1633
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private ۧ(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1616
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 369
    iget-object v2, p0, Ll/۫᩺ۧ;->ܽ:Ll/ۖ᩵;

    invoke-virtual {v2, v0, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1616
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    .line 1618
    invoke-direct {p0, p1}, Ll/۫᩺ۧ;->֫(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 1619
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object p1, v1, v3

    .line 1620
    const-class v3, Ll/۫᩺ۧ;

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const-string v3, "write"

    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 1621
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private ۧ(Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 5

    const/4 v0, 0x0

    .line 369
    iget-object v1, p0, Ll/۫᩺ۧ;->ۧ:Ll/ۖ᩵;

    invoke-virtual {v1, p1, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1604
    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    .line 1606
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1607
    const-class v0, Ll/۫᩺ۧ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {p1, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const-string v0, "read"

    .line 1608
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 1609
    invoke-virtual {v1, p1, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ֫(II)I
    .locals 0

    .line 409
    invoke-virtual {p0, p2}, Ll/۫᩺ۧ;->֫(I)Z

    move-result p2

    if-nez p2, :cond_0

    return p1

    .line 412
    :cond_0
    invoke-virtual {p0}, Ll/۫᩺ۧ;->ܳ()I

    move-result p1

    return p1
.end method

.method public final ֫(Landroid/os/Parcelable;I)Landroid/os/Parcelable;
    .locals 0

    .line 481
    invoke-virtual {p0, p2}, Ll/۫᩺ۧ;->֫(I)Z

    move-result p2

    if-nez p2, :cond_0

    return-object p1

    .line 484
    :cond_0
    invoke-virtual {p0}, Ll/۫᩺ۧ;->᩻()Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 0

    .line 616
    invoke-virtual {p0, p1}, Ll/۫᩺ۧ;->֫(I)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p2

    .line 619
    :cond_0
    invoke-virtual {p0}, Ll/۫᩺ۧ;->ܿ()Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 451
    invoke-virtual {p0, p1}, Ll/۫᩺ۧ;->֫(I)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p2

    .line 454
    :cond_0
    invoke-virtual {p0}, Ll/۫᩺ۧ;->ۜ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۛ᩺ۧ;)Ll/ۛ᩺ۧ;
    .locals 1

    const/4 v0, 0x1

    .line 1493
    invoke-virtual {p0, v0}, Ll/۫᩺ۧ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 1496
    :cond_0
    invoke-virtual {p0}, Ll/۫᩺ۧ;->᩷()Ll/ۛ᩺ۧ;

    move-result-object p1

    return-object p1
.end method

.method public abstract ֫()V
.end method

.method public abstract ֫(Landroid/os/Parcelable;)V
.end method

.method public abstract ֫(Ljava/lang/CharSequence;)V
.end method

.method public abstract ֫(Ljava/lang/String;)V
.end method

.method public abstract ֫(Z)V
.end method

.method public abstract ֫(I)Z
.end method

.method public final ֫(IZ)Z
    .locals 0

    .line 399
    invoke-virtual {p0, p1}, Ll/۫᩺ۧ;->֫(I)Z

    move-result p1

    if-nez p1, :cond_0

    return p2

    .line 402
    :cond_0
    invoke-virtual {p0}, Ll/۫᩺ۧ;->ܽ()Z

    move-result p1

    return p1
.end method

.method public final ֫([B)[B
    .locals 1

    const/4 v0, 0x2

    .line 472
    invoke-virtual {p0, v0}, Ll/۫᩺ۧ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 475
    :cond_0
    invoke-virtual {p0}, Ll/۫᩺ۧ;->ᩳ()[B

    move-result-object p1

    return-object p1
.end method

.method public abstract ۜ()Ljava/lang/String;
.end method

.method public abstract ۧ()Ll/۫᩺ۧ;
.end method

.method public abstract ۧ(I)V
.end method

.method public final ۧ(II)V
    .locals 0

    .line 334
    invoke-virtual {p0, p2}, Ll/۫᩺ۧ;->ۧ(I)V

    .line 335
    invoke-virtual {p0, p1}, Ll/۫᩺ۧ;->ܽ(I)V

    return-void
.end method

.method public final ۧ(ILjava/lang/CharSequence;)V
    .locals 0

    .line 325
    invoke-virtual {p0, p1}, Ll/۫᩺ۧ;->ۧ(I)V

    .line 326
    invoke-virtual {p0, p2}, Ll/۫᩺ۧ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ(ILjava/lang/String;)V
    .locals 0

    .line 370
    invoke-virtual {p0, p1}, Ll/۫᩺ۧ;->ۧ(I)V

    .line 371
    invoke-virtual {p0, p2}, Ll/۫᩺ۧ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(IZ)V
    .locals 0

    .line 294
    invoke-virtual {p0, p1}, Ll/۫᩺ۧ;->ۧ(I)V

    .line 295
    invoke-virtual {p0, p2}, Ll/۫᩺ۧ;->֫(Z)V

    return-void
.end method

.method public final ۧ(Landroid/os/Parcelable;I)V
    .locals 0

    .line 391
    invoke-virtual {p0, p2}, Ll/۫᩺ۧ;->ۧ(I)V

    .line 392
    invoke-virtual {p0, p1}, Ll/۫᩺ۧ;->֫(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final ۧ(Ll/ۛ᩺ۧ;)V
    .locals 1

    const/4 v0, 0x1

    .line 1021
    invoke-virtual {p0, v0}, Ll/۫᩺ۧ;->ۧ(I)V

    .line 1022
    invoke-virtual {p0, p1}, Ll/۫᩺ۧ;->ܽ(Ll/ۛ᩺ۧ;)V

    return-void
.end method

.method public abstract ۧ([B)V
.end method

.method public abstract ܳ()I
.end method

.method public abstract ܽ(I)V
.end method

.method public final ܽ(Ll/ۛ᩺ۧ;)V
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 1029
    invoke-virtual {p0, v0}, Ll/۫᩺ۧ;->֫(Ljava/lang/String;)V

    return-void

    .line 1042
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/۫᩺ۧ;->֫(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    .line 1047
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/۫᩺ۧ;->֫(Ljava/lang/String;)V

    .line 1034
    invoke-virtual {p0}, Ll/۫᩺ۧ;->ۧ()Ll/۫᩺ۧ;

    move-result-object v1

    .line 1586
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {p0, v2}, Ll/۫᩺ۧ;->ۧ(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object v1, v3, p1

    .line 1587
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1036
    invoke-virtual {v1}, Ll/۫᩺ۧ;->֫()V

    return-void

    :catch_0
    move-exception p1

    .line 1598
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "VersionedParcel encountered ClassNotFoundException"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 1596
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "VersionedParcel encountered NoSuchMethodException"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p1

    .line 1591
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_1

    .line 1592
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    .line 1594
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "VersionedParcel encountered InvocationTargetException"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p1

    .line 1589
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "VersionedParcel encountered IllegalAccessException"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_4
    move-exception v0

    .line 1044
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v2, " does not have a Parcelizer"

    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ܽ([B)V
    .locals 1

    const/4 v0, 0x2

    .line 304
    invoke-virtual {p0, v0}, Ll/۫᩺ۧ;->ۧ(I)V

    .line 305
    invoke-virtual {p0, p1}, Ll/۫᩺ۧ;->ۧ([B)V

    return-void
.end method

.method public abstract ܽ()Z
.end method

.method public abstract ܿ()Ljava/lang/CharSequence;
.end method

.method public abstract ᩳ()[B
.end method

.method public final ᩷()Ll/ۛ᩺ۧ;
    .locals 5

    .line 1509
    invoke-virtual {p0}, Ll/۫᩺ۧ;->ۜ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 1513
    :cond_0
    invoke-virtual {p0}, Ll/۫᩺ۧ;->ۧ()Ll/۫᩺ۧ;

    move-result-object v2

    .line 1565
    :try_start_0
    invoke-direct {p0, v0}, Ll/۫᩺ۧ;->ۧ(Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    .line 1566
    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩺ۧ;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 1577
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "VersionedParcel encountered ClassNotFoundException"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 1575
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "VersionedParcel encountered NoSuchMethodException"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    .line 1570
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_1

    .line 1571
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 1573
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "VersionedParcel encountered InvocationTargetException"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    .line 1568
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "VersionedParcel encountered IllegalAccessException"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public abstract ᩻()Landroid/os/Parcelable;
.end method
