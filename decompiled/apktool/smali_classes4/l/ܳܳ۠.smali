.class public final Ll/ܳܳ۠;
.super Ljava/lang/Object;
.source "K7QT"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۙ:Ll/᩻ܳ۠;

.field public ᩶:Ljava/util/Iterator;

.field public ᩸:Ljava/util/Set;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/᩻ܳ۠;)V
    .locals 0

    .line 1267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳܳ۠;->ۙ:Ll/᩻ܳ۠;

    .line 1268
    iget-object p1, p1, Ll/۠ܳ۠;->ᩳ:Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/ܳܳ۠;->᩶:Ljava/util/Iterator;

    const/4 p1, 0x0

    .line 1269
    iput p1, p0, Ll/ܳܳ۠;->᩹:I

    const/4 p1, 0x0

    .line 1270
    iput-object p1, p0, Ll/ܳܳ۠;->᩸:Ljava/util/Set;

    return-void
.end method

.method private ֫(Ll/᩷۠ᩴ;)Ll/᩺ܶ۠;
    .locals 13

    .line 1378
    iget-object v0, p0, Ll/ܳܳ۠;->ۙ:Ll/᩻ܳ۠;

    iget-object v0, v0, Ll/᩻ܳ۠;->᩻:Ll/᩹ܳ۠;

    const/4 v1, 0x0

    new-array v2, v1, [Ll/ܳ۠ᩴ;

    invoke-static {p1, v2}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v2

    const-string v3, "module-info.class"

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    .line 1379
    invoke-interface {p1, v3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    new-array v2, v1, [Ll/ܳ۠ᩴ;

    invoke-static {v0, v2}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "module-info.sig"

    .line 1380
    invoke-interface {p1, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    new-array v1, v1, [Ll/ܳ۠ᩴ;

    invoke-static {v0, v1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1381
    :cond_0
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1382
    invoke-static {v0}, Ll/ۗ᩸۠;->ܽ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1383
    new-instance v1, Ll/᩺ܶ۠;

    invoke-direct {v1, v0, p1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_1
    return-object v4

    .line 1388
    :cond_2
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, ".jar"

    invoke-virtual {v2, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x1

    const-string v6, "locn.bad.module-info"

    const-string v7, "compiler"

    if-eqz v2, :cond_f

    invoke-static {v0}, Ll/᩹ܳ۠;->ۧ(Ll/᩹ܳ۠;)Ll/ۖܿ۠;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/ۖܿ۠;->֫(Ll/᩷۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 1389
    invoke-static {v0}, Ll/᩹ܳ۠;->ۧ(Ll/᩹ܳ۠;)Ll/ۖܿ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۖܿ۠;->֫()Ll/֨᩶۠;

    move-result-object v2

    if-nez v2, :cond_3

    .line 1391
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v0

    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2697
    new-instance v2, Ll/۫۠۠;

    new-array v3, v5, [Ljava/lang/Object;

    aput-object p1, v3, v1

    const-string p1, "no.zipfs.for.archive"

    invoke-direct {v2, v7, p1, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1391
    invoke-virtual {v0, v2}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    return-object v4

    .line 1394
    :cond_3
    :try_start_0
    invoke-static {v0}, Ll/᩹ܳ۠;->֫(Ll/᩹ܳ۠;)Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v2, p1, v8}, Ll/֨᩶۠;->newFileSystem(Ll/᩷۠ᩴ;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object v2
    :try_end_0
    .catch Ll/ܺۢ۠; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-array v8, v1, [Ljava/lang/String;

    .line 1395
    invoke-virtual {v2, v3, v8}, Ll/۟֨ᩴ;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    new-array v8, v1, [Ll/ܳ۠ᩴ;

    .line 1396
    invoke-static {v3, v8}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 1397
    invoke-direct {p0, v3}, Ll/ܳܳ۠;->ۧ(Ll/᩷۠ᩴ;)Ljava/lang/String;

    move-result-object v3

    .line 1398
    new-instance v8, Ll/᩺ܶ۠;

    invoke-direct {v8, v3, p1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1418
    :try_start_2
    invoke-virtual {v2}, Ll/۟֨ᩴ;->close()V
    :try_end_2
    .catch Ll/ܺۢ۠; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v8

    :cond_4
    :try_start_3
    const-string v3, "META-INF/MANIFEST.MF"

    new-array v8, v1, [Ljava/lang/String;

    .line 1400
    invoke-virtual {v2, v3, v8}, Ll/۟֨ᩴ;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    new-array v8, v1, [Ll/ܳ۠ᩴ;

    .line 1401
    invoke-static {v3, v8}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const-string v9, "locn.cant.get.module.name.for.jar"

    if-eqz v8, :cond_c

    :try_start_4
    new-array v8, v1, [Ll/᩻۠ᩴ;

    .line 1402
    invoke-static {v3, v8}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1403
    :try_start_5
    new-instance v8, Ljava/util/jar/Manifest;

    invoke-direct {v8, v3}, Ljava/util/jar/Manifest;-><init>(Ljava/io/InputStream;)V

    .line 1404
    invoke-virtual {v8}, Ljava/util/jar/Manifest;->getMainAttributes()Ljava/util/jar/Attributes;

    move-result-object v8

    if-eqz v8, :cond_a

    .line 1406
    new-instance v10, Ljava/util/jar/Attributes$Name;

    const-string v11, "Automatic-Module-Name"

    invoke-direct {v10, v11}, Ljava/util/jar/Attributes$Name;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v10}, Ljava/util/jar/Attributes;->getValue(Ljava/util/jar/Attributes$Name;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_a

    const/4 v10, 0x0

    :goto_0
    const/16 v11, 0x2e

    .line 1512
    invoke-virtual {v8, v11, v10}, Ljava/lang/String;->indexOf(II)I

    move-result v11

    const/4 v12, -0x1

    if-eq v11, v12, :cond_6

    .line 1513
    invoke-virtual {v8, v10, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 1514
    invoke-static {v10}, Ll/ۗ᩸۠;->ܽ(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_5

    const/4 v10, 0x0

    goto :goto_1

    :cond_5
    add-int/lit8 v10, v11, 0x1

    goto :goto_0

    .line 1518
    :cond_6
    invoke-virtual {v8, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    .line 1519
    invoke-static {v10}, Ll/ۗ᩸۠;->ܽ(Ljava/lang/CharSequence;)Z

    move-result v10

    :goto_1
    if-eqz v10, :cond_8

    .line 1409
    new-instance v9, Ll/᩺ܶ۠;

    invoke-direct {v9, v8, p1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v3, :cond_7

    .line 1416
    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1418
    :cond_7
    :try_start_7
    invoke-virtual {v2}, Ll/۟֨ᩴ;->close()V
    :try_end_7
    .catch Ll/ܺۢ۠; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    return-object v9

    .line 1411
    :cond_8
    :try_start_8
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v8

    sget-object v10, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2385
    new-instance v10, Ll/۫۠۠;

    new-array v11, v5, [Ljava/lang/Object;

    aput-object p1, v11, v1

    invoke-direct {v10, v7, v9, v11}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1411
    invoke-virtual {v8, v10}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-eqz v3, :cond_9

    .line 1416
    :try_start_9
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 1418
    :cond_9
    :try_start_a
    invoke-virtual {v2}, Ll/۟֨ᩴ;->close()V
    :try_end_a
    .catch Ll/ܺۢ۠; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    return-object v4

    :cond_a
    if-eqz v3, :cond_c

    .line 1416
    :try_start_b
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto :goto_3

    :catchall_0
    move-exception v8

    if-eqz v3, :cond_b

    .line 1402
    :try_start_c
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v3

    :try_start_d
    invoke-virtual {v8, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_b
    :goto_2
    throw v8
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 1418
    :cond_c
    :goto_3
    :try_start_e
    invoke-virtual {v2}, Ll/۟֨ᩴ;->close()V
    :try_end_e
    .catch Ll/ܺۢ۠; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    .line 1427
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    .line 0
    invoke-static {v3, v1, v2}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "-(\\d+(\\.|$))"

    .line 1434
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 1435
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_d

    .line 1436
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    .line 1438
    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_d
    const-string v3, "[^A-Za-z0-9]"

    const-string v6, "."

    .line 1442
    invoke-virtual {v2, v3, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "(\\.)(\\1)+"

    .line 1443
    invoke-virtual {v2, v3, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "^\\."

    const-string v6, ""

    .line 1444
    invoke-virtual {v2, v3, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\.$"

    .line 1445
    invoke-virtual {v2, v3, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1448
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_e

    .line 1449
    new-instance v0, Ll/᩺ܶ۠;

    invoke-direct {v0, v2, p1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 1452
    :cond_e
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v0

    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2385
    new-instance v2, Ll/۫۠۠;

    new-array v3, v5, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-direct {v2, v7, v9, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1452
    invoke-virtual {v0, v2}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    return-object v4

    :catchall_2
    move-exception v3

    .line 1394
    :try_start_f
    invoke-virtual {v2}, Ll/۟֨ᩴ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v2

    :try_start_10
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v3
    :try_end_10
    .catch Ll/ܺۢ۠; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_0

    .line 1422
    :catch_0
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v0

    invoke-static {p1}, Ll/ۛᩴ۠;->֫(Ll/᩷۠ᩴ;)Ll/۫۠۠;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    return-object v4

    .line 1419
    :catch_1
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v0

    sget-object v2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2377
    new-instance v2, Ll/۫۠۠;

    new-array v3, v5, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-direct {v2, v7, v6, v3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1419
    invoke-virtual {v0, v2}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    return-object v4

    .line 1456
    :cond_f
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, ".jmod"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 1459
    :try_start_11
    invoke-static {p1}, Ll/ۢ᩶۠;->֫(Ll/᩷۠ᩴ;)V

    .line 1463
    iget-object v2, v0, Ll/᩹ܳ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟֨ᩴ;

    if-nez v2, :cond_12

    .line 1465
    invoke-static {v0}, Ll/᩹ܳ۠;->ۧ(Ll/᩹ܳ۠;)Ll/ۖܿ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۖܿ۠;->֫()Ll/֨᩶۠;

    move-result-object v2

    if-nez v2, :cond_10

    .line 1467
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v2

    invoke-static {p1}, Ll/ۛᩴ۠;->֫(Ll/᩷۠ᩴ;)Ll/۫۠۠;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    return-object v4

    .line 1470
    :cond_10
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-virtual {v2, p1, v3}, Ll/֨᩶۠;->newFileSystem(Ll/᩷۠ᩴ;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object v2
    :try_end_11
    .catch Ll/ܺۢ۠; {:try_start_11 .. :try_end_11} :catch_3
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_2

    :try_start_12
    const-string v3, "classes/module-info.class"

    new-array v8, v1, [Ljava/lang/String;

    .line 1472
    invoke-virtual {v2, v3, v8}, Ll/۟֨ᩴ;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    .line 1473
    invoke-direct {p0, v3}, Ll/ܳܳ۠;->ۧ(Ll/᩷۠ᩴ;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "classes"

    new-array v9, v1, [Ljava/lang/String;

    .line 1474
    invoke-virtual {v2, v8, v9}, Ll/۟֨ᩴ;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v8

    .line 1475
    iget-object v9, v0, Ll/᩹ܳ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-interface {v9, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1476
    iget-object v9, v0, Ll/᩹ܳ۠;->֫:Ljava/util/ArrayList;

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    .line 1478
    :try_start_13
    new-instance v2, Ll/᩺ܶ۠;

    invoke-direct {v2, v3, v8}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    return-object v2

    :catchall_4
    move-exception v2

    move-object v3, v2

    move-object v2, v4

    goto :goto_5

    :catchall_5
    move-exception v3

    :goto_5
    if-eqz v2, :cond_11

    .line 1481
    :try_start_14
    invoke-virtual {v2}, Ll/۟֨ᩴ;->close()V

    .line 1482
    :cond_11
    throw v3
    :try_end_14
    .catch Ll/ܺۢ۠; {:try_start_14 .. :try_end_14} :catch_3
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_2

    .line 1487
    :catch_2
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v0

    invoke-static {p1}, Ll/ۛᩴ۠;->֫(Ll/᩷۠ᩴ;)Ll/۫۠۠;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    return-object v4

    .line 1485
    :catch_3
    invoke-static {v0}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v2

    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2377
    new-instance v3, Ll/۫۠۠;

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v1

    invoke-direct {v3, v7, v6, v5}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1485
    invoke-virtual {v2, v3}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 1492
    :cond_12
    invoke-static {v0}, Ll/᩹ܳ۠;->ܿ(Ll/᩹ܳ۠;)Z

    return-object v4
.end method

.method private ۧ(Ll/᩷۠ᩴ;)Ljava/lang/String;
    .locals 2

    .line 1499
    iget-object v0, p0, Ll/ܳܳ۠;->ۙ:Ll/᩻ܳ۠;

    iget-object v0, v0, Ll/᩻ܳ۠;->᩻:Ll/᩹ܳ۠;

    invoke-static {v0}, Ll/᩹ܳ۠;->ᩳ(Ll/᩹ܳ۠;)Ll/ۖۢ۠;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1500
    new-instance v1, Ll/ۖۢ۠;

    invoke-direct {v1}, Ll/ۖۢ۠;-><init>()V

    invoke-static {v0, v1}, Ll/᩹ܳ۠;->֫(Ll/᩹ܳ۠;Ll/ۖۢ۠;)V

    .line 1501
    :cond_0
    invoke-static {v0}, Ll/᩹ܳ۠;->ᩳ(Ll/᩹ܳ۠;)Ll/ۖۢ۠;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    new-array v1, v1, [Ll/᩻۠ᩴ;

    .line 76
    invoke-static {p1, v1}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object p1

    .line 77
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ۖۢ۠;->֫(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    .line 78
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    :cond_1
    return-object v0

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_2

    .line 76
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 20

    move-object/from16 v1, p0

    const-string v2, "compiler"

    .line 1274
    iget-object v10, v1, Ll/ܳܳ۠;->ۙ:Ll/᩻ܳ۠;

    iget-object v11, v10, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    iget-object v12, v10, Ll/᩻ܳ۠;->᩻:Ll/᩹ܳ۠;

    iget-object v0, v1, Ll/ܳܳ۠;->᩸:Ljava/util/Set;

    const/4 v13, 0x1

    if-eqz v0, :cond_0

    goto/16 :goto_a

    .line 1277
    :cond_0
    :goto_0
    iget-object v0, v1, Ll/ܳܳ۠;->᩸:Ljava/util/Set;

    if-nez v0, :cond_a

    .line 1278
    iget-object v0, v1, Ll/ܳܳ۠;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v14, 0x0

    if-eqz v3, :cond_9

    .line 1279
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ll/᩷۠ᩴ;

    new-array v0, v14, [Ll/ܳ۠ᩴ;

    .line 1280
    invoke-static {v15, v0}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    const-string v9, "["

    const-string v8, ":"

    const-string v7, "]"

    if-eqz v0, :cond_7

    .line 1304
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1306
    :try_start_0
    invoke-static {v15}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;)Ljava/nio/file/DirectoryStream;

    move-result-object v3
    :try_end_0
    .catch Ljava/nio/file/DirectoryIteratorException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 1307
    :try_start_1
    invoke-interface {v3}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v5, :cond_2

    :try_start_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷۠ᩴ;

    const-string v6, "module-info.class"

    .line 1308
    invoke-interface {v5, v6}, Ll/᩷۠ᩴ;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    .line 1312
    :cond_1
    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v4, v0

    move-object/from16 v17, v10

    goto/16 :goto_5

    :cond_2
    const/4 v5, 0x0

    .line 1314
    :goto_2
    :try_start_3
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/nio/file/DirectoryIteratorException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    if-eqz v5, :cond_3

    .line 1324
    :try_start_4
    invoke-direct {v1, v5}, Ll/ܳܳ۠;->ۧ(Ll/᩷۠ᩴ;)Ljava/lang/String;

    move-result-object v0

    .line 1325
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v11}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v1, Ll/ܳܳ۠;->᩹:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1327
    new-instance v16, Ll/ܽܳ۠;

    .line 1329
    invoke-static {v15}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x0

    move-object/from16 v3, v16

    move-object v4, v12

    move-object v5, v10

    move-object v7, v0

    invoke-direct/range {v3 .. v9}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 1330
    invoke-static/range {v16 .. v16}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0
    :try_end_4
    .catch Ll/ܺۢ۠; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_3

    .line 1335
    :catch_0
    invoke-static {v12}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v0

    invoke-static {v15}, Ll/ۛᩴ۠;->֫(Ll/᩷۠ᩴ;)Ll/۫۠۠;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 1336
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_3

    .line 1332
    :catch_1
    invoke-static {v12}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v0

    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2377
    new-instance v3, Ll/۫۠۠;

    new-array v4, v13, [Ljava/lang/Object;

    aput-object v15, v4, v14

    const-string v5, "locn.bad.module-info"

    invoke-direct {v3, v2, v5, v4}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1332
    invoke-virtual {v0, v3}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 1333
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    :goto_3
    move-object/from16 v17, v10

    goto/16 :goto_7

    .line 1341
    :cond_3
    new-instance v15, Ljava/util/LinkedHashSet;

    invoke-direct {v15}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1343
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷۠ᩴ;

    .line 1344
    invoke-direct {v1, v3}, Ll/ܳܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩺ܶ۠;

    move-result-object v3

    if-nez v3, :cond_4

    goto :goto_4

    .line 1349
    :cond_4
    iget-object v4, v3, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    move-object v6, v4

    check-cast v6, Ljava/lang/String;

    .line 1350
    iget-object v3, v3, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v3, Ll/᩷۠ᩴ;

    .line 1351
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v11}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v1, Ll/ܳܳ۠;->᩹:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 1353
    new-instance v5, Ll/ܽܳ۠;

    .line 1355
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v18, 0x0

    move-object v3, v5

    move-object v4, v12

    move-object v13, v5

    move-object v5, v10

    move-object/from16 v19, v6

    move-object v6, v14

    move-object v14, v7

    move-object/from16 v7, v19

    move-object/from16 v19, v0

    move-object v0, v8

    move-object/from16 v8, v17

    move-object/from16 v17, v10

    move-object v10, v9

    move/from16 v9, v18

    invoke-direct/range {v3 .. v9}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 1356
    invoke-interface {v15, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object v8, v0

    move-object v9, v10

    move-object v7, v14

    move/from16 v14, v16

    move-object/from16 v10, v17

    move-object/from16 v0, v19

    const/4 v13, 0x1

    goto :goto_4

    :cond_5
    move-object/from16 v17, v10

    move-object v0, v15

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object/from16 v17, v10

    move-object v4, v0

    :goto_5
    if-eqz v3, :cond_6

    .line 1306
    :try_start_5
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v3, v0

    :try_start_6
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_6
    throw v4
    :try_end_6
    .catch Ljava/nio/file/DirectoryIteratorException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    :catch_2
    move-object/from16 v17, v10

    .line 1315
    :catch_3
    invoke-static {v12}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object v0

    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2393
    new-instance v3, Ll/۫۠۠;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    aput-object v15, v5, v14

    const-string v4, "locn.cant.read.directory"

    invoke-direct {v3, v2, v4, v5}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1315
    invoke-virtual {v0, v3}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    .line 1316
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 1281
    :goto_7
    iput-object v0, v1, Ll/ܳܳ۠;->᩸:Ljava/util/Set;

    goto :goto_9

    :cond_7
    move-object v14, v7

    move-object v0, v8

    move-object/from16 v17, v10

    move-object v10, v9

    .line 1362
    invoke-direct {v1, v15}, Ll/ܳܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩺ܶ۠;

    move-result-object v3

    if-nez v3, :cond_8

    .line 1365
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_8

    .line 1367
    :cond_8
    iget-object v4, v3, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    move-object v7, v4

    check-cast v7, Ljava/lang/String;

    .line 1368
    iget-object v3, v3, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v3, Ll/᩷۠ᩴ;

    .line 1369
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v11}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v1, Ll/ܳܳ۠;->᩹:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1371
    new-instance v0, Ll/ܽܳ۠;

    .line 1373
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x0

    move-object v3, v0

    move-object v4, v12

    move-object/from16 v5, v17

    invoke-direct/range {v3 .. v9}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 1374
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 1283
    :goto_8
    iput-object v0, v1, Ll/ܳܳ۠;->᩸:Ljava/util/Set;

    .line 1285
    :goto_9
    iget v0, v1, Ll/ܳܳ۠;->᩹:I

    const/4 v3, 0x1

    add-int/2addr v0, v3

    iput v0, v1, Ll/ܳܳ۠;->᩹:I

    move-object/from16 v10, v17

    const/4 v13, 0x1

    goto/16 :goto_0

    :cond_9
    return v14

    :cond_a
    :goto_a
    const/4 v3, 0x1

    return v3
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1294
    invoke-virtual {p0}, Ll/ܳܳ۠;->hasNext()Z

    .line 1295
    iget-object v0, p0, Ll/ܳܳ۠;->᩸:Ljava/util/Set;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 1297
    iput-object v1, p0, Ll/ܳܳ۠;->᩸:Ljava/util/Set;

    return-object v0

    .line 1300
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
