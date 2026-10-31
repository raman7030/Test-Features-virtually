.class public final Ll/ܳۡ֡;
.super Ljava/lang/Object;
.source "FC0P"


# static fields
.field public static final ֫:[Ll/ᩳۡ֡;

.field public static final ۧ:[Ll/ܳ۠ᩴ;

.field public static final ܽ:[Ll/᩻۠ᩴ;

.field public static final ܿ:[Ll/᩻۠ᩴ;

.field public static final ᩳ:[Ll/ܳ۠ᩴ;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ll/᩻۠ᩴ;

    .line 201
    sget-object v1, Ll/ۘ۠ᩴ;->CREATE:Ll/ۘ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۘ۠ᩴ;->TRUNCATE_EXISTING:Ll/ۘ۠ᩴ;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sput-object v0, Ll/ܳۡ֡;->ܿ:[Ll/᩻۠ᩴ;

    .line 202
    sget-object v0, Ll/ۘ۠ᩴ;->APPEND:Ll/ۘ۠ᩴ;

    new-array v0, v2, [Ll/ᩳۡ֡;

    .line 214
    sput-object v0, Ll/ܳۡ֡;->֫:[Ll/ᩳۡ֡;

    new-array v0, v2, [Ll/ܳ۠ᩴ;

    .line 228
    sput-object v0, Ll/ܳۡ֡;->ۧ:[Ll/ܳ۠ᩴ;

    new-array v0, v3, [Ll/ܳ۠ᩴ;

    .line 236
    sget-object v1, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v1, v0, v2

    sput-object v0, Ll/ܳۡ֡;->ᩳ:[Ll/ܳ۠ᩴ;

    new-array v0, v2, [Ll/᩻۠ᩴ;

    .line 246
    sput-object v0, Ll/ܳۡ֡;->ܽ:[Ll/᩻۠ᩴ;

    return-void
.end method

.method public static ֫(Ll/᩷۠ᩴ;)Ljava/io/OutputStream;
    .locals 7

    .line 1378
    sget-object v0, Ll/ܳۡ֡;->ۧ:[Ll/ܳ۠ᩴ;

    invoke-static {p0, v0}, Ll/ܳۡ֡;->֫(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-nez v1, :cond_8

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 1379
    array-length v3, v0

    if-lez v3, :cond_0

    aget-object v3, v0, v2

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    new-array v4, v2, [Ll/᩹۠ᩴ;

    if-nez p0, :cond_1

    move-object v5, v1

    goto :goto_1

    .line 1096
    :cond_1
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v5

    .line 477
    :goto_1
    sget-object v6, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    if-ne v3, v6, :cond_2

    goto :goto_3

    :cond_2
    if-eqz v5, :cond_4

    .line 1482
    invoke-static {v5}, Ll/ܿ۠ᩴ;->isSymbolicLink(Ll/᩷۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v5}, Ll/ܿ۠ᩴ;->readSymbolicLink(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v5

    :cond_4
    :goto_2
    move-object v5, v1

    :goto_3
    if-nez v5, :cond_5

    goto :goto_5

    :cond_5
    if-nez v3, :cond_6

    new-array v1, v2, [Ll/ܳ۠ᩴ;

    .line 481
    invoke-static {v5, v1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    goto :goto_4

    :cond_6
    const/4 v1, 0x1

    new-array v1, v1, [Ll/ܳ۠ᩴ;

    aput-object v3, v1, v2

    invoke-static {v5, v1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    :goto_4
    if-eqz v1, :cond_7

    goto :goto_5

    .line 482
    :cond_7
    invoke-static {v5, v4}, Ll/ܿ۠ᩴ;->createDirectories(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)Ll/᩷۠ᩴ;

    .line 1381
    :cond_8
    :goto_5
    new-instance v1, Ljava/util/ArrayList;

    sget-object v2, Ll/ܳۡ֡;->ܿ:[Ll/᩻۠ᩴ;

    sget-object v3, Ll/ܳۡ֡;->ܽ:[Ll/᩻۠ᩴ;

    if-eqz v2, :cond_9

    goto :goto_6

    :cond_9
    move-object v2, v3

    :goto_6
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1382
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1383
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩻۠ᩴ;

    invoke-static {p0, v0}, Ll/ܿ۠ᩴ;->newOutputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/OutputStream;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ֫(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;[Ll/ᩳۡ֡;)Ll/ܰۢ֡;
    .locals 7

    .line 556
    invoke-static {p0, p1}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 597
    new-instance v0, Ll/ܿۡ֡;

    invoke-static {}, Ll/۟ۢ֡;->֫()Ll/ܰۢ֡;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-direct {v0, v1, p1, p2, v2}, Ll/ܿۡ֡;-><init>(Ll/ܰۢ֡;[Ll/ܳ۠ᩴ;[Ll/ᩳۡ֡;[Ljava/lang/String;)V

    .line 1845
    invoke-static {p0, v0}, Ll/ܿ۠ᩴ;->walkFileTree(Ll/᩷۠ᩴ;Ll/ᩳ۠ᩴ;)Ll/᩷۠ᩴ;

    .line 597
    invoke-virtual {v0}, Ll/ܽۡ֡;->֫()Ll/ܰۢ֡;

    move-result-object p0

    return-object p0

    .line 643
    :cond_0
    invoke-static {p0, p1}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 646
    invoke-static {}, Ll/۟ۢ֡;->֫()Ll/ܰۢ֡;

    move-result-object v0

    .line 647
    invoke-static {p0, p1}, Ll/ܳۡ֡;->֫(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_1

    .line 648
    invoke-static {p0}, Ll/ܿ۠ᩴ;->isSymbolicLink(Ll/᩷۠ᩴ;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p0}, Ll/ܿ۠ᩴ;->size(Ll/᩷۠ᩴ;)J

    move-result-wide v4

    goto :goto_0

    :cond_1
    move-wide v4, v2

    .line 650
    :goto_0
    :try_start_0
    invoke-static {p0}, Ll/ܿ۠ᩴ;->deleteIfExists(Ll/᩷۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 651
    move-object v1, v0

    check-cast v1, Ll/ۤۢ֡;

    invoke-virtual {v1}, Ll/ۤۢ֡;->ۧ()Ll/ۛۢ֡;

    move-result-object v6

    invoke-interface {v6}, Ll/ۛۢ֡;->֫()V

    .line 652
    invoke-virtual {v1}, Ll/ۤۢ֡;->ܽ()Ll/ۛۢ֡;

    move-result-object v1

    invoke-interface {v1, v4, v5}, Ll/ۛۢ֡;->add(J)V
    :try_end_0
    .catch Ljava/nio/file/AccessDeniedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    nop

    :cond_2
    const/4 v1, 0x0

    if-nez p0, :cond_3

    move-object v4, v1

    goto :goto_1

    .line 1096
    :cond_3
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v4

    .line 1409
    :goto_1
    :try_start_1
    invoke-static {p2}, Ll/ܽ᩺ᩴ;->of([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v5, Ll/᩸᩹ۡ;

    const/4 v6, 0x3

    invoke-direct {v5, v6}, Ll/᩸᩹ۡ;-><init>(I)V

    invoke-interface {p2, v5}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 1507
    const-class p2, Ll/ۗ۠ᩴ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v4, :cond_4

    goto :goto_2

    .line 1425
    :cond_4
    :try_start_2
    invoke-static {v4, p2, p1}, Ll/ܿ۠ᩴ;->readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;

    move-result-object p2
    :try_end_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catch_1
    :goto_2
    move-object p2, v1

    .line 1507
    :goto_3
    :try_start_3
    check-cast p2, Ll/ۗ۠ᩴ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 663
    :try_start_4
    invoke-static {p0, p1}, Ll/ܳۡ֡;->ۧ(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v1, p2

    goto :goto_4

    :catchall_0
    move-exception p0

    goto :goto_5

    .line 666
    :cond_5
    :goto_4
    :try_start_5
    invoke-static {p0, p1}, Ll/ܳۡ֡;->֫(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 667
    invoke-static {p0}, Ll/ܿ۠ᩴ;->isSymbolicLink(Ll/᩷۠ᩴ;)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-static {p0}, Ll/ܿ۠ᩴ;->size(Ll/᩷۠ᩴ;)J

    move-result-wide v2

    .line 668
    :cond_6
    invoke-static {p0}, Ll/ܿ۠ᩴ;->deleteIfExists(Ll/᩷۠ᩴ;)Z

    move-result p0

    if-eqz p0, :cond_7

    .line 669
    move-object p0, v0

    check-cast p0, Ll/ۤۢ֡;

    invoke-virtual {p0}, Ll/ۤۢ֡;->ۧ()Ll/ۛۢ֡;

    move-result-object p1

    invoke-interface {p1}, Ll/ۛۢ֡;->֫()V

    .line 670
    invoke-virtual {p0}, Ll/ۤۢ֡;->ܽ()Ll/ۛۢ֡;

    move-result-object p0

    invoke-interface {p0, v2, v3}, Ll/ۛۢ֡;->add(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_7
    if-eqz v1, :cond_8

    .line 674
    invoke-interface {v1}, Ll/ۗ۠ᩴ;->permissions()Ljava/util/Set;

    move-result-object p0

    invoke-static {v4, p0}, Ll/ܿ۠ᩴ;->setPosixFilePermissions(Ll/᩷۠ᩴ;Ljava/util/Set;)Ll/᩷۠ᩴ;

    :cond_8
    return-object v0

    :catchall_1
    move-exception p0

    move-object p2, v1

    :goto_5
    if-eqz p2, :cond_9

    invoke-interface {p2}, Ll/ۗ۠ᩴ;->permissions()Ljava/util/Set;

    move-result-object p1

    invoke-static {v4, p1}, Ll/ܿ۠ᩴ;->setPosixFilePermissions(Ll/᩷۠ᩴ;Ljava/util/Set;)Ll/᩷۠ᩴ;

    .line 676
    :cond_9
    throw p0

    .line 644
    :cond_a
    new-instance p1, Ljava/nio/file/NoSuchFileException;

    invoke-interface {p0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/nio/file/NoSuchFileException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static varargs ֫(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    .line 784
    invoke-static {p0, p1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_0
    new-array p1, v0, [Ll/ܳ۠ᩴ;

    invoke-static {p0, p1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method

.method public static varargs ۧ(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)V
    .locals 6

    const/4 v0, 0x0

    .line 968
    :try_start_0
    const-class v1, Ll/᩸۠ᩴ;

    invoke-static {p0, v1, p1}, Ll/ܿ۠ᩴ;->getFileAttributeView(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/᩶۠ᩴ;

    move-result-object v1

    check-cast v1, Ll/᩸۠ᩴ;

    if-eqz v1, :cond_0

    .line 1575
    invoke-interface {v1, v0}, Ll/᩸۠ᩴ;->setReadOnly(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    nop

    :cond_0
    const/4 v1, 0x0

    if-nez p0, :cond_1

    move-object v2, v1

    goto :goto_0

    .line 1096
    :cond_1
    invoke-interface {p0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v2

    .line 1324
    :goto_0
    invoke-static {v2, p1}, Ll/ܳۡ֡;->֫(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_4

    .line 1507
    const-class v3, Ll/ۗ۠ᩴ;

    if-nez v2, :cond_2

    goto :goto_1

    .line 1425
    :cond_2
    :try_start_1
    invoke-static {v2, v3, p1}, Ll/ܿ۠ᩴ;->readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    .line 1507
    :goto_1
    check-cast v1, Ll/ۗ۠ᩴ;

    if-eqz v1, :cond_4

    new-array p0, v4, [Ll/۬۠ᩴ;

    .line 1609
    sget-object v1, Ll/۬۠ᩴ;->OWNER_WRITE:Ll/۬۠ᩴ;

    aput-object v1, p0, v0

    sget-object v0, Ll/۬۠ᩴ;->OWNER_EXECUTE:Ll/۬۠ᩴ;

    aput-object v0, p0, v5

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    if-eqz v2, :cond_3

    .line 1636
    invoke-static {v2, p1}, Ll/ܿ۠ᩴ;->getPosixFilePermissions(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Ljava/util/Set;

    move-result-object p1

    .line 1637
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 1639
    invoke-interface {v0, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1643
    invoke-interface {v0, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    .line 1644
    invoke-static {v2, v0}, Ll/ܿ۠ᩴ;->setPosixFilePermissions(Ll/᩷۠ᩴ;Ljava/util/Set;)Ll/᩷۠ᩴ;

    :cond_3
    return-void

    .line 1702
    :cond_4
    new-instance v1, Ljava/io/IOException;

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p0, v2, v0

    aput-object p1, v2, v5

    const-string p0, "DOS or POSIX file operations not available for \'%s\', linkOptions %s"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
