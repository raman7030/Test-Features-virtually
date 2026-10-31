.class public final Ll/ۜ᩷ܿ;
.super Ljava/lang/Object;
.source "B4S2"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/lang/ThreadLocal;

.field public static final ܽ:Ll/ۧۤᩴ;

.field public static volatile ᩳ:Ll/ܿ᩷ܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 71
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ۜ᩷ܿ;->ۧ:Ljava/lang/ThreadLocal;

    .line 72
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/ۜ᩷ܿ;->ܽ:Ll/ۧۤᩴ;

    .line 332
    invoke-static {}, Ll/ۜ᩷ܿ;->᩻()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 1

    .line 908
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static ֫(Ll/۟ۜܿ;Ljava/lang/String;)I
    .locals 1

    .line 913
    invoke-static {p0}, Ll/۟ۜܿ;->ᩳ(Ll/۟ۜܿ;)I

    move-result p0

    mul-int/lit8 p0, p0, 0x1f

    .line 908
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    add-int/2addr p1, p0

    return p1
.end method

.method public static ֫(Ll/ۢܺܿ;Ljava/lang/String;)Ll/ۢܺܿ;
    .locals 1

    const-string v0, "Built-in parent is null"

    .line 1203
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0}, Ll/ۢܺܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    .line 1204
    invoke-virtual {v0}, Ll/ܶۜܿ;->᩻()Ll/۟ۜܿ;

    move-result-object v0

    invoke-static {v0}, Ll/۟ۜܿ;->֫(Ll/۟ۜܿ;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢܺܿ;

    if-eqz v0, :cond_0

    .line 1208
    invoke-virtual {v0, p0}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;

    move-result-object p0

    return-object p0

    .line 1206
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Built-in matcher not found: "

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1206
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܶۜܿ;)Ll/ۧ᩷ܿ;
    .locals 2

    .line 244
    sget-object v0, Ll/ۜ᩷ܿ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩷ܿ;

    if-nez v0, :cond_0

    .line 245
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ll/ܿ᩷ܿ;

    invoke-direct {v1, v0}, Ll/ܿ᩷ܿ;-><init>(Ll/ܳ᩷ܿ;)V

    move-object v0, v1

    .line 246
    :goto_0
    new-instance v1, Ll/ۧ᩷ܿ;

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1, v0, p0}, Ll/ۧ᩷ܿ;-><init>(Ll/ܿ᩷ܿ;Ll/ܶۜܿ;)V

    return-object v1
.end method

.method public static ֫(ILjava/lang/String;)Ll/ۨۘܽ;
    .locals 3

    .line 1362
    new-instance v0, Ll/ᩳ᩷ܿ;

    invoke-direct {v0, p1, p0}, Ll/ᩳ᩷ܿ;-><init>(Ljava/lang/String;I)V

    .line 1363
    sget-object v1, Ll/ۜ᩷ܿ;->ܽ:Ll/ۧۤᩴ;

    invoke-virtual {v1, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨۘܽ;

    if-nez v2, :cond_1

    .line 1365
    invoke-static {p0, p1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object p0

    .line 1366
    invoke-virtual {v1, v0, p0}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨۘܽ;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object p0

    :cond_1
    return-object v2
.end method

.method public static ֫(Ll/۬ۜܽ;Ljava/lang/String;ILjava/lang/Exception;)Ll/ܶۜܿ;
    .locals 1

    const/4 v0, 0x0

    .line 1065
    :try_start_0
    invoke-static {v0, p0}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;Ll/۬ۜܽ;)Ll/ۢܺܿ;

    move-result-object p0

    check-cast p0, Ll/ܶۜܿ;

    .line 1066
    new-instance v0, Ll/ۤۜܿ;

    invoke-direct {v0, p1}, Ll/ۤۜܿ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/ܶۜܿ;->֫(Ljava/util/concurrent/Callable;)V

    .line 1067
    invoke-virtual {p0}, Ll/ܶۜܿ;->ᩴ()V

    .line 1068
    invoke-virtual {p0, p2}, Ll/ܶۜܿ;->ۧ(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 1071
    invoke-virtual {p3, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1072
    throw p3
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܺ֡ܿ;
    .locals 2

    .line 285
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 280
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 285
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".cache"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩸ۧ()Ll/ܺ֡ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫()Ll/ܿ᩷ܿ;
    .locals 2

    .line 632
    sget-object v0, Ll/ۜ᩷ܿ;->ᩳ:Ll/ܿ᩷ܿ;

    const-string v1, "Language registry is not initialized"

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public static ֫(Ll/᩻᩷ܿ;)Ll/ܿ᩷ܿ;
    .locals 4

    .line 531
    new-instance v0, Ll/ܳ᩷ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܳ᩷ܿ;-><init>(I)V

    .line 532
    sget-object v1, Ll/ۜ᩷ܿ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩷ܿ;

    .line 533
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 535
    :try_start_0
    invoke-interface {p0, v0}, Ll/᩻᩷ܿ;->֫(Ll/ܳ᩷ܿ;)V

    .line 536
    invoke-static {v0}, Ll/ܳ᩷ܿ;->ܽ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object p0

    invoke-static {}, Ll/ۢ᩷ܿ;->ۧ()Ljava/util/HashMap;

    move-result-object v3

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0, v3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 537
    new-instance p0, Ll/ܿ᩷ܿ;

    invoke-direct {p0, v0}, Ll/ܿ᩷ܿ;-><init>(Ll/ܳ᩷ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    .line 540
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    return-object p0

    .line 542
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object p0

    :catchall_0
    move-exception p0

    if-nez v2, :cond_1

    .line 540
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_0

    .line 542
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 544
    :goto_0
    throw p0
.end method

.method public static ֫(Landroid/content/res/AssetManager;)V
    .locals 12

    .line 648
    invoke-static {}, Ll/ۜ᩷ܿ;->ۜ()Ll/ܳ᩷ܿ;

    move-result-object v0

    .line 649
    invoke-static {v0}, Ll/ܳ᩷ܿ;->ܿ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const-string v0, "syntax/internal"

    .line 650
    invoke-virtual {p0, v0}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    const-string v5, ".mtsx"

    .line 651
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x5

    .line 0
    invoke-static {v5, v2, v4}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v5, "syntax/internal/"

    .line 653
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 654
    new-instance v6, Ll/ۛۜܿ;

    invoke-direct {v6, p0, v4}, Ll/ۛۜܿ;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 815
    invoke-static {}, Ll/ۜ᩷ܿ;->ۜ()Ll/ܳ᩷ܿ;

    move-result-object v4

    invoke-static {v4}, Ll/ܳ᩷ܿ;->ܿ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v7, "internal"

    .line 814
    invoke-static/range {v6 .. v11}, Ll/ۜ᩷ܿ;->֫(Ll/֫᩷ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Z)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Landroid/content/res/AssetManager;Ll/ܳ᩷ܿ;)V
    .locals 10

    const-string v0, "syntax/init/styles.mtsx"

    .line 481
    invoke-virtual {p0, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 482
    :try_start_0
    invoke-static {v0}, Ll/ۜ᩷ܿ;->ۧ(Ljava/io/InputStream;)V

    .line 483
    invoke-static {p1}, Ll/ܳ᩷ܿ;->ᩳ(Ll/ܳ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v1

    invoke-static {p1}, Ll/ܳ᩷ܿ;->ᩳ(Ll/ܳ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v2

    invoke-static {v2}, Ll/۟ۜܿ;->ܽ(Ll/۟ۜܿ;)Ll/ۙ᩷ܿ;

    move-result-object v2

    sget v3, Ll/ۙ᩷ܿ;->ܽ:I

    .line 484
    invoke-virtual {v2, v3}, Ll/ۙ᩷ܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v2

    .line 483
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, v2}, Ll/۟ۜܿ;->֫(Ll/۟ۜܿ;Ll/᩸᩷ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v0, :cond_0

    .line 485
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    const-string v0, "syntax/init/builtins.mtsx"

    .line 486
    invoke-virtual {p0, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 487
    :try_start_1
    invoke-static {v0}, Ll/ۜ᩷ܿ;->֫(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    .line 488
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_1
    const-string v0, "syntax"

    .line 489
    invoke-virtual {p0, v0}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v1, v0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v1, :cond_3

    aget-object v2, v0, v9

    const-string v3, ".mtsx"

    .line 491
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x2f

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    const/4 v3, 0x5

    .line 0
    invoke-static {v3, v8, v2}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v3, "syntax/"

    .line 493
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 494
    new-instance v3, Ll/ۗۜܿ;

    invoke-direct {v3, p0, v2}, Ll/ۗۜܿ;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 808
    invoke-static {}, Ll/ۜ᩷ܿ;->ۜ()Ll/ܳ᩷ܿ;

    move-result-object v2

    .line 809
    invoke-static {v2}, Ll/ܳ᩷ܿ;->ۧ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v5

    invoke-static {v2}, Ll/ܳ᩷ܿ;->֫(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v6

    const-string v7, "builtIn"

    move-object v2, v3

    move-object v3, v7

    move v7, v8

    invoke-static/range {v2 .. v7}, Ll/ۜ᩷ܿ;->֫(Ll/֫᩷ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Z)V

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 498
    :cond_3
    invoke-static {p1}, Ll/ܳ᩷ܿ;->ۧ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "Text"

    .line 280
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 498
    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    invoke-static {p0}, Ll/ۜ᩷ܿ;->֫(Landroid/content/res/AssetManager;)V

    return-void

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_4

    .line 486
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    throw p0

    :catchall_2
    move-exception p0

    if-eqz v0, :cond_5

    .line 481
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    throw p0
.end method

.method public static ֫(Ljava/io/InputStream;)V
    .locals 11

    .line 731
    invoke-static {}, Ll/ۜ᩷ܿ;->ۜ()Ll/ܳ᩷ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ܳ᩷ܿ;->ᩳ(Ll/ܳ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v0

    .line 732
    invoke-static {v0}, Ll/۟ۜܿ;->֫(Ll/۟ۜܿ;)Ljava/util/HashMap;

    move-result-object v1

    .line 733
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 734
    invoke-static {p0, v2}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    const-string v2, "init/builtins.mtsx"

    .line 733
    invoke-static {v2, p0}, Ll/᩵ۖܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 735
    invoke-static {v0, p0}, Ll/۟ۜܿ;->֫(Ll/۟ۜܿ;Ljava/lang/String;)V

    .line 736
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v3, "syntax/builtins.cache"

    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩸ۧ()Ll/ܺ֡ܿ;

    move-result-object v0

    .line 737
    invoke-virtual {v0}, Ll/ܺ֡ܿ;->ۤ()Z

    move-result v3

    const/16 v4, 0x1008

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    .line 739
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object v3

    .line 740
    invoke-virtual {v3}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v7

    if-ne v7, v4, :cond_0

    .line 741
    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v7

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v8

    if-ne v7, v8, :cond_0

    .line 742
    invoke-virtual {v3}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 743
    invoke-virtual {v3}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v7

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_6

    .line 745
    invoke-virtual {v3}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v9

    .line 746
    invoke-static {v5, v3}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;Ll/۬ۜܽ;)Ll/ۢܺܿ;

    move-result-object v10

    .line 747
    invoke-virtual {v1, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 755
    :catch_0
    :cond_0
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 756
    new-instance v3, Ll/ܳۨۢ;

    new-instance v7, Ll/ۨܿ֡;

    .line 23
    new-instance v8, Ll/֡᩹ᩳ;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-direct {v7, p0, v8}, Ll/ۨܿ֡;-><init>(Ljava/lang/CharSequence;Ljava/lang/Runnable;)V

    .line 756
    invoke-direct {v3, v7}, Ll/ܳۨۢ;-><init>(Ll/ۨܿ֡;)V

    .line 757
    new-instance v7, Ll/֫ܳ֡;

    invoke-direct {v7, v3}, Ll/֫ܳ֡;-><init>(Ll/᩻ܳ֡;)V

    .line 758
    new-instance v3, Ll/ܳܰۢ;

    invoke-direct {v3, v7}, Ll/ܳܰۢ;-><init>(Ll/֫ܳ֡;)V

    .line 759
    new-instance v7, Ll/ܽ᩷ܿ;

    invoke-direct {v7, v2}, Ll/ܽ᩷ܿ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 760
    invoke-virtual {v3}, Ll/ܳܰۢ;->ۗ()Ll/ܺۨۢ;

    move-result-object v2

    .line 261
    const-class v3, Ll/ۢۨۢ;

    invoke-virtual {v2, v3}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 760
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢۨۢ;

    .line 310
    const-class v7, Ll/ۡۨۢ;

    invoke-virtual {v3, v7, v6}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v7

    check-cast v7, Ll/ۡۨۢ;

    const/16 v8, 0x32

    .line 353
    invoke-virtual {v7, v8, v6}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v7

    .line 761
    invoke-interface {v7}, Ll/ܺ᩷֡;->getText()Ljava/lang/String;

    move-result-object v7

    .line 313
    const-class v8, Ll/ۛۨۢ;

    invoke-virtual {v3, v8, v6}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v3

    check-cast v3, Ll/ۛۨۢ;

    .line 1001
    const-class v8, Ll/᩹᩺ۢ;

    invoke-virtual {v3, v8}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    .line 764
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_1

    .line 765
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_2

    .line 766
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩹᩺ۢ;

    invoke-static {v5, v3, v6}, Ll/ܶۜܿ;->֫(Ll/ۢܺܿ;Ll/᩹᩺ۢ;Z)Ll/ۢܺܿ;

    move-result-object v3

    .line 767
    invoke-virtual {v1, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 769
    :cond_2
    new-instance v8, Ll/ۖۜܿ;

    .line 19
    invoke-direct {v8, v5}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    .line 770
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 771
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩹᩺ۢ;

    .line 772
    invoke-static {v8, v10, v6}, Ll/ܶۜܿ;->֫(Ll/ۢܺܿ;Ll/᩹᩺ۢ;Z)Ll/ۢܺܿ;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 774
    :cond_3
    invoke-virtual {v8, v9}, Ll/ۖۜܿ;->ۧ(Ljava/util/ArrayList;)V

    .line 775
    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 779
    :cond_4
    new-instance v2, Ll/ۤۜܽ;

    invoke-direct {v2}, Ll/ۤۜܽ;-><init>()V

    .line 780
    invoke-virtual {v2, v4}, Ll/ۤۜܽ;->ۡ(I)V

    .line 781
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 782
    invoke-virtual {v2, p0}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 783
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result p0

    invoke-virtual {v2, p0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 784
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 785
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 786
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢܺܿ;

    invoke-virtual {v1, v2}, Ll/ۢܺܿ;->֫(Ll/ۤۜܽ;)V

    goto :goto_3

    .line 789
    :cond_5
    :try_start_1
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_6
    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/Collection;)V
    .locals 3

    .line 669
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۜܿ;

    .line 670
    invoke-static {v0}, Ll/᩺ܺܿ;->ۧ(Ll/ܶۜܿ;)Ll/᩺ܺܿ;

    move-result-object v1

    .line 671
    invoke-virtual {v1}, Ll/᩺ܺܿ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 672
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Syntax does not support early window completion: "

    const-string v2, "/"

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 673
    invoke-virtual {v0}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public static ֫(Ll/֫᩷ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Z)V
    .locals 9

    .line 824
    invoke-interface {p0}, Ll/֫᩷ܿ;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    .line 825
    :try_start_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0, v1}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 826
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 828
    :cond_0
    :try_start_1
    invoke-static {v2}, Ll/᩵ۖܿ;->֫(Ljava/lang/String;)V
    :try_end_1
    .catch Ll/ۡ᩷ܿ; {:try_start_1 .. :try_end_1} :catch_1

    const-string v0, ".mtsx"

    .line 0
    invoke-static {p2, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 834
    invoke-static {v0, v2}, Ll/᩵ۖܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 835
    invoke-static {}, Ll/ۜ᩷ܿ;->ۧ()Ll/۟ۜܿ;

    move-result-object v4

    invoke-static {v4, v3}, Ll/ۜ᩷ܿ;->֫(Ll/۟ۜܿ;Ljava/lang/String;)I

    move-result v4

    .line 836
    sget-object v5, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v6, "-"

    const-string v7, ".cache"

    const-string v8, "syntax/"

    .line 0
    invoke-static {v8, p1, v6, p2, v7}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 836
    invoke-virtual {v5, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩸ۧ()Ll/ܺ֡ܿ;

    move-result-object p1

    .line 837
    invoke-virtual {p1}, Ll/ܺ֡ܿ;->ۤ()Z

    move-result p2

    const/16 v5, 0x1008

    if-eqz p2, :cond_2

    .line 839
    :try_start_2
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object p2

    .line 840
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v6

    if-ne v6, v5, :cond_2

    .line 841
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    if-ne v6, v4, :cond_2

    .line 842
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v6, 0x0

    .line 843
    invoke-static {v6, p2}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;Ll/۬ۜܽ;)Ll/ۢܺܿ;

    move-result-object p2

    check-cast p2, Ll/ܶۜܿ;

    if-eqz p5, :cond_1

    .line 878
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 879
    new-instance v6, Ll/᩺ۜܿ;

    invoke-direct {v6, v1}, Ll/᩺ۜܿ;-><init>([B)V

    invoke-virtual {p2, v6}, Ll/ܶۜܿ;->֫(Ljava/util/concurrent/Callable;)V

    goto :goto_0

    .line 881
    :cond_1
    new-instance v1, Ll/᩹ۜܿ;

    invoke-direct {v1, p0}, Ll/᩹ۜܿ;-><init>(Ll/֫᩷ܿ;)V

    invoke-virtual {p2, v1}, Ll/ܶۜܿ;->֫(Ljava/util/concurrent/Callable;)V

    .line 845
    :goto_0
    invoke-virtual {p2, v4}, Ll/ܶۜܿ;->ۧ(I)V

    .line 846
    invoke-static {p2, p3, p4}, Ll/ۜ᩷ܿ;->֫(Ll/ܶۜܿ;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    nop

    .line 853
    :cond_2
    new-instance p2, Ll/ܽ᩷ܿ;

    invoke-direct {p2, v0}, Ll/ܽ᩷ܿ;-><init>(Ljava/lang/String;)V

    .line 854
    new-instance v0, Ll/ܳۨۢ;

    new-instance v1, Ll/ۨܿ֡;

    .line 23
    new-instance v6, Ll/֡᩹ᩳ;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-direct {v1, v3, v6}, Ll/ۨܿ֡;-><init>(Ljava/lang/CharSequence;Ljava/lang/Runnable;)V

    .line 854
    invoke-direct {v0, v1}, Ll/ܳۨۢ;-><init>(Ll/ۨܿ֡;)V

    .line 855
    invoke-virtual {v0, p2}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 856
    new-instance v1, Ll/֫ܳ֡;

    invoke-direct {v1, v0}, Ll/֫ܳ֡;-><init>(Ll/᩻ܳ֡;)V

    .line 857
    new-instance v0, Ll/ܳܰۢ;

    invoke-direct {v0, v1}, Ll/ܳܰۢ;-><init>(Ll/֫ܳ֡;)V

    .line 858
    invoke-virtual {v0, p2}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 859
    invoke-virtual {v0}, Ll/ܳܰۢ;->ۜ֫()Ll/۫ۨۢ;

    move-result-object p2

    .line 860
    new-instance v0, Ll/ܶۜܿ;

    invoke-direct {v0, p2}, Ll/ܶۜܿ;-><init>(Ll/۫ۨۢ;)V

    .line 861
    invoke-virtual {v0}, Ll/ܶۜܿ;->ۧ()V

    if-eqz p5, :cond_3

    .line 878
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 879
    new-instance p2, Ll/᩺ۜܿ;

    invoke-direct {p2, p0}, Ll/᩺ۜܿ;-><init>([B)V

    invoke-virtual {v0, p2}, Ll/ܶۜܿ;->֫(Ljava/util/concurrent/Callable;)V

    goto :goto_1

    .line 881
    :cond_3
    new-instance p2, Ll/᩹ۜܿ;

    invoke-direct {p2, p0}, Ll/᩹ۜܿ;-><init>(Ll/֫᩷ܿ;)V

    invoke-virtual {v0, p2}, Ll/ܶۜܿ;->֫(Ljava/util/concurrent/Callable;)V

    .line 863
    :goto_1
    invoke-virtual {v0, v4}, Ll/ܶۜܿ;->ۧ(I)V

    .line 864
    invoke-static {v0, p3, p4}, Ll/ۜ᩷ܿ;->֫(Ll/ܶۜܿ;Ljava/util/Map;Ljava/util/Map;)V

    .line 972
    :try_start_3
    new-instance p0, Ll/ۤۜܽ;

    invoke-direct {p0}, Ll/ۤۜܽ;-><init>()V

    .line 973
    invoke-virtual {p0, v5}, Ll/ۤۜܽ;->ۡ(I)V

    .line 974
    invoke-virtual {p0, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 975
    invoke-virtual {p0, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 976
    invoke-virtual {v0, p0}, Ll/ܶۜܿ;->֫(Ll/ۤۜܽ;)V

    .line 931
    invoke-virtual {p1, p0}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    return-void

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_4

    .line 824
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    throw p0
.end method

.method public static ֫(Ll/ܶۜܿ;Ljava/lang/String;)V
    .locals 1

    .line 919
    invoke-virtual {p0}, Ll/ܶۜܿ;->᩻()Ll/۟ۜܿ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۜ᩷ܿ;->֫(Ll/۟ۜܿ;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܶۜܿ;->ۧ(I)V

    return-void
.end method

.method public static ֫(Ll/ܶۜܿ;Ljava/util/Map;Ljava/util/Map;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 893
    invoke-virtual {p0}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 280
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 894
    invoke-static {p1, v0, p0}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 895
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Duplicate syntax name: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    const-string p1, "Text"

    .line 899
    invoke-virtual {p0}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 900
    invoke-virtual {p0}, Ll/ܶۜܿ;->ܺ()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 280
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 901
    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static declared-synchronized ֫(Ll/ܶ᩵ܿ;)V
    .locals 7

    .line 2
    const-class v0, Ll/ۜ᩷ܿ;

    .line 3
    monitor-enter v0

    .line 568
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object v1

    .line 569
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ll/ۢ᩷ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object p0

    .line 570
    invoke-virtual {p0}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v2

    .line 280
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 572
    sget-object v4, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v5, "syntax/custom"

    invoke-virtual {v4, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 574
    invoke-static {v4, v2}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܺ֡ܿ;

    move-result-object v2

    .line 576
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v4

    .line 577
    new-instance v5, Ll/ܳ᩷ܿ;

    invoke-direct {v5, v4}, Ll/ܳ᩷ܿ;-><init>(Ll/ܿ᩷ܿ;)V

    .line 578
    invoke-static {v5}, Ll/ܳ᩷ܿ;->ܽ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v6

    invoke-static {v4}, Ll/ܿ᩷ܿ;->ᩳ(Ll/ܿ᩷ܿ;)Ljava/util/Map;

    move-result-object v4

    check-cast v6, Ljava/util/HashMap;

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 579
    invoke-static {v5}, Ll/ܳ᩷ܿ;->ܽ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v4

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    new-instance v3, Ll/ܿ᩷ܿ;

    invoke-direct {v3, v5}, Ll/ܿ᩷ܿ;-><init>(Ll/ܳ᩷ܿ;)V

    .line 582
    invoke-static {v2, v1, p0}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ܶۜܿ;)V

    .line 583
    new-instance v2, Ll/ۤۜܿ;

    invoke-direct {v2, v1}, Ll/ۤۜܿ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Ll/ܶۜܿ;->֫(Ljava/util/concurrent/Callable;)V

    .line 584
    invoke-static {v3}, Ll/ۜ᩷ܿ;->֫(Ll/ܿ᩷ܿ;)V

    const/4 p0, 0x1

    .line 586
    invoke-static {p0}, Ll/ۖ֨ܿ;->֫(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 587
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ܶۜܿ;)V
    .locals 3

    .line 937
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩵ۖܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 938
    invoke-virtual {p2}, Ll/ܶۜܿ;->᩻()Ll/۟ۜܿ;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۜ᩷ܿ;->֫(Ll/۟ۜܿ;Ljava/lang/String;)I

    move-result v0

    .line 972
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    const/16 v2, 0x1008

    .line 973
    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->ۡ(I)V

    .line 974
    invoke-virtual {v1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 975
    invoke-virtual {v1, p1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 976
    invoke-virtual {p2, v1}, Ll/ܶۜܿ;->֫(Ll/ۤۜܽ;)V

    .line 940
    invoke-static {p0, v1}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ۤۜܽ;)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ۤۜܽ;)V
    .locals 3

    .line 956
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۨ()V

    const-string v0, ".syntax_cache"

    .line 957
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 959
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 963
    invoke-virtual {v0, p0, v2, p1, v1}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;ZZLjava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 965
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 966
    throw p0
.end method

.method public static ֫(Ll/ܺ֡ܿ;Ll/ܺ֡ܿ;Ljava/util/List;Landroid/content/res/AssetManager;Ll/ܳ᩷ܿ;)V
    .locals 6

    .line 445
    invoke-virtual {p0}, Ll/ܺ֡ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0

    .line 446
    :try_start_0
    invoke-static {p0}, Ll/ۜ᩷ܿ;->ۧ(Ljava/io/InputStream;)V

    .line 447
    invoke-static {p4}, Ll/ܳ᩷ܿ;->ᩳ(Ll/ܳ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v0

    invoke-static {p4}, Ll/ܳ᩷ܿ;->ᩳ(Ll/ܳ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v1

    invoke-static {v1}, Ll/۟ۜܿ;->ܽ(Ll/۟ۜܿ;)Ll/ۙ᩷ܿ;

    move-result-object v1

    sget v2, Ll/ۙ᩷ܿ;->ܽ:I

    .line 448
    invoke-virtual {v1, v2}, Ll/ۙ᩷ܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v1

    .line 447
    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, v1}, Ll/۟ۜܿ;->֫(Ll/۟ۜܿ;Ll/᩸᩷ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 449
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 450
    invoke-virtual {p1}, Ll/ܺ֡ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0

    .line 451
    :try_start_1
    invoke-static {p0}, Ll/ۜ᩷ܿ;->֫(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 452
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 453
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ᩵ܿ;

    .line 454
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/۬ۜܿ;

    invoke-direct {v0, p1}, Ll/۬ۜܿ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v2

    .line 808
    invoke-static {}, Ll/ۜ᩷ܿ;->ۜ()Ll/ܳ᩷ܿ;

    move-result-object p1

    .line 809
    invoke-static {p1}, Ll/ܳ᩷ܿ;->ۧ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v3

    invoke-static {p1}, Ll/ܳ᩷ܿ;->֫(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v4

    const-string v1, "builtIn"

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Ll/ۜ᩷ܿ;->֫(Ll/֫᩷ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Z)V

    goto :goto_0

    .line 457
    :cond_0
    invoke-static {p4}, Ll/ܳ᩷ܿ;->ۧ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "Text"

    .line 280
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 457
    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    invoke-static {p4}, Ll/ܳ᩷ܿ;->ۧ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_1

    .line 462
    invoke-static {p3}, Ll/ۜ᩷ܿ;->֫(Landroid/content/res/AssetManager;)V

    .line 661
    new-instance p0, Ljava/util/IdentityHashMap;

    invoke-direct {p0}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {p0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p0

    .line 662
    invoke-static {p4}, Ll/ܳ᩷ܿ;->ۧ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 663
    invoke-static {p4}, Ll/ܳ᩷ܿ;->֫(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    const-string p1, "online"

    .line 664
    invoke-static {p1, p0}, Ll/ۜ᩷ܿ;->֫(Ljava/lang/String;Ljava/util/Collection;)V

    .line 464
    invoke-static {p4}, Ll/ܳ᩷ܿ;->ܿ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p0

    const-string p1, "online internal"

    invoke-static {p1, p0}, Ll/ۜ᩷ܿ;->֫(Ljava/lang/String;Ljava/util/Collection;)V

    return-void

    .line 460
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Online syntax package has no eligible root languages"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p1

    .line 450
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    :catchall_2
    move-exception p1

    .line 445
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public static ֫(Ll/ܿ᩷ܿ;)V
    .locals 2

    .line 625
    sget-object v0, Ll/ۜ᩷ܿ;->ᩳ:Ll/ܿ᩷ܿ;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    .line 626
    :cond_0
    invoke-static {v0}, Ll/ܿ᩷ܿ;->ܳ(Ll/ܿ᩷ܿ;)I

    move-result v0

    add-int/2addr v1, v0

    :goto_0
    invoke-static {p0, v1}, Ll/ܿ᩷ܿ;->֫(Ll/ܿ᩷ܿ;I)V

    .line 627
    sput-object p0, Ll/ۜ᩷ܿ;->ᩳ:Ll/ܿ᩷ܿ;

    return-void
.end method

.method public static ֫([Ljava/lang/String;I)V
    .locals 7

    const/4 v0, 0x1

    .line 368
    aget-object p0, p0, v0

    const-string v0, "Code-"

    .line 378
    sget-object v1, Ll/ܽ֡ܿ;->ۢ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 379
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v2

    new-instance v3, Ll/ۢ۟᩵;

    invoke-direct {v3}, Ll/ۢ۟᩵;-><init>()V

    invoke-virtual {v3, p0}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p0

    invoke-virtual {v2, p0}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object p0

    invoke-interface {p0}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 380
    :try_start_1
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 383
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 387
    invoke-virtual {v0}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V

    .line 388
    new-instance v0, Ll/ᩳܰۡ;

    invoke-direct {v0, v1}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 389
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩺ۡ;

    .line 390
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v3

    invoke-static {v4, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    goto :goto_0

    .line 392
    :cond_0
    sget-object v2, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v3, "syntax/online"

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 393
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    .line 394
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 395
    invoke-virtual {v0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ᩺ۡ;

    .line 396
    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    .line 399
    :cond_1
    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    .line 400
    invoke-virtual {v2, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 401
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 402
    invoke-virtual {v0, v4}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v5, v4}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 404
    :cond_2
    :try_start_3
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    .line 405
    new-instance v0, Ll/ۤۜܽ;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Ll/ۤۜܽ;-><init>(I)V

    .line 406
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 407
    sget-object p1, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v2, "syntax/online/VERSION"

    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V

    .line 408
    invoke-static {}, Ll/ۜ᩷ܿ;->᩻()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 409
    :try_start_4
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 415
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    :catchall_0
    move-exception p1

    .line 388
    :try_start_5
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    .line 385
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Response body is null"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 381
    :cond_4
    new-instance p1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ۖ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    .line 379
    :try_start_7
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p0

    :try_start_8
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception p0

    .line 415
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 416
    throw p0

    .line 415
    :catch_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    return-void
.end method

.method public static ֫(I)Z
    .locals 1

    .line 251
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ᩷ܿ;->ܳ(Ll/ܿ᩷ܿ;)I

    move-result v0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۜ()Ll/ܳ᩷ܿ;
    .locals 2

    .line 643
    sget-object v0, Ll/ۜ᩷ܿ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩷ܿ;

    const-string v1, "Language registry is not loading"

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public static ۧ(Ll/ܶۜܿ;)Ljava/lang/String;
    .locals 4

    .line 260
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v0

    .line 261
    invoke-static {v0}, Ll/ܿ᩷ܿ;->᩻(Ll/ܿ᩷ܿ;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 262
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p0, :cond_0

    .line 263
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "INTERNAL:"

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 266
    :cond_1
    invoke-virtual {p0}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 280
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 267
    invoke-static {v0, v2}, Ll/ܿ᩷ܿ;->ۧ(Ll/ܿ᩷ܿ;Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object v0

    if-ne v0, p0, :cond_2

    return-object v1

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ()Ll/۟ۜܿ;
    .locals 1

    .line 637
    sget-object v0, Ll/ۜ᩷ܿ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩷ܿ;

    if-eqz v0, :cond_0

    .line 638
    invoke-static {v0}, Ll/ܳ᩷ܿ;->ᩳ(Ll/ܳ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ᩷ܿ;->ܿ(Ll/ܿ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)Ll/ܰۜܿ;
    .locals 12

    .line 983
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    .line 985
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object v0

    .line 986
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v2

    const v3, 0xffff

    const-wide/16 v4, 0x0

    if-ne v2, v3, :cond_2

    .line 988
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v2

    .line 989
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v6

    cmp-long v0, v6, v4

    if-nez v0, :cond_1

    .line 280
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 302
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 303
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 302
    invoke-static {p0, v0}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܺ֡ܿ;

    move-result-object p0

    .line 303
    invoke-virtual {p0}, Ll/ܺ֡ܿ;->getName()Ljava/lang/String;

    move-result-object p0

    .line 302
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 996
    invoke-static {v0}, Ll/ܰۜܿ;->֫(Ljava/lang/String;)Ll/ܰۜܿ;

    move-result-object p0

    return-object p0

    .line 994
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Custom language tombstone is in the wrong slot"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 990
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Trailing bytes in custom language tombstone"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 998
    :cond_2
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    .line 999
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x1006

    if-ne v2, v7, :cond_3

    .line 1001
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    if-ne v3, v7, :cond_3

    const/4 v7, 0x1

    goto :goto_0

    :cond_3
    const/4 v7, 0x0

    .line 1004
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v6}, Ll/᩵ۖܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 1013
    :try_start_2
    invoke-static {}, Ll/ۜ᩷ܿ;->ۧ()Ll/۟ۜܿ;

    move-result-object v9

    .line 1012
    invoke-static {v9, v8}, Ll/ۜ᩷ܿ;->֫(Ll/۟ۜܿ;Ljava/lang/String;)I

    move-result v8
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    if-nez v7, :cond_5

    const/16 v9, 0x1008

    if-ne v2, v9, :cond_5

    if-ne v3, v8, :cond_5

    .line 1017
    :try_start_3
    invoke-static {v1, v0}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;Ll/۬ۜܽ;)Ll/ۢܺܿ;

    move-result-object v2

    check-cast v2, Ll/ܶۜܿ;

    .line 1018
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v9

    cmp-long v11, v9, v4

    if-nez v11, :cond_4

    .line 1208
    new-instance v4, Ll/᩷ܺܿ;

    invoke-direct {v4}, Ll/᩷ܺܿ;-><init>()V

    invoke-virtual {v2, v4}, Ll/ܶۜܿ;->֫(Ll/᩷ܺܿ;)V

    .line 1209
    invoke-virtual {v2}, Ll/ܶۜܿ;->ۧ()V

    .line 1023
    invoke-static {v2}, Ll/᩺ܺܿ;->ۧ(Ll/ܶۜܿ;)Ll/᩺ܺܿ;

    .line 1025
    new-instance v4, Ll/ۤۜܿ;

    invoke-direct {v4, v6}, Ll/ۤۜܿ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ll/ܶۜܿ;->֫(Ljava/util/concurrent/Callable;)V

    .line 1026
    invoke-virtual {v2, v8}, Ll/ܶۜܿ;->ۧ(I)V

    .line 1027
    invoke-static {v2}, Ll/ܰۜܿ;->֫(Ll/ܶۜܿ;)Ll/ܰۜܿ;

    move-result-object p0

    return-object p0

    .line 1019
    :cond_4
    new-instance v2, Ljava/io/IOException;

    const-string v4, "Trailing bytes in custom language cache"

    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 1036
    :catch_0
    :cond_5
    :try_start_4
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Ll/ۢ᩷ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 1045
    :try_start_5
    invoke-static {p0, v6, v0}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ܶۜܿ;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 1051
    :catch_1
    :try_start_6
    new-instance p0, Ll/ۤۜܿ;

    invoke-direct {p0, v6}, Ll/ۤۜܿ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ll/ܶۜܿ;->֫(Ljava/util/concurrent/Callable;)V

    .line 1052
    invoke-static {v0}, Ll/ܰۜܿ;->֫(Ll/ܶۜܿ;)Ll/ܰۜܿ;

    move-result-object p0

    return-object p0

    :catch_2
    move-exception p0

    if-eqz v7, :cond_6

    .line 1039
    invoke-static {v0, v6, v3, p0}, Ll/ۜ᩷ܿ;->֫(Ll/۬ۜܽ;Ljava/lang/String;ILjava/lang/Exception;)Ll/ܶۜܿ;

    move-result-object p0

    invoke-static {p0}, Ll/ܰۜܿ;->֫(Ll/ܶۜܿ;)Ll/ܰۜܿ;

    move-result-object p0

    return-object p0

    .line 1042
    :cond_6
    throw p0

    :catch_3
    move-exception p0

    if-eqz v7, :cond_7

    .line 1007
    invoke-static {v0, v6, v3, p0}, Ll/ۜ᩷ܿ;->֫(Ll/۬ۜܽ;Ljava/lang/String;ILjava/lang/Exception;)Ll/ܶۜܿ;

    move-result-object p0

    invoke-static {p0}, Ll/ܰۜܿ;->֫(Ll/ܶۜܿ;)Ll/ܰۜܿ;

    move-result-object p0

    return-object p0

    .line 1010
    :cond_7
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    :catch_4
    :cond_8
    return-object v1
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ܿۜܿ;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_c

    .line 1225
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    .line 1228
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "#BUILT_IN_CSS_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "#BUILT_IN_HTML_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "#BUILT_IN_JAVA_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "#BUILT_IN_TS_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_4
    const-string v1, "#BUILT_IN_XML_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_5
    const-string v1, "#BUILT_IN_JSON_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_6
    const-string v1, "#BUILT_IN_MTSX_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_7
    const-string v1, "#BUILT_IN_JS_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_8
    const-string v1, "#BUILT_IN_LUA_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_0

    :cond_9
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_9
    const-string v1, "#BUILT_IN_SMALI_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_0

    :cond_a
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_a
    const-string v1, "#BUILT_IN_PYTHON_FORMATTER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_0

    :cond_b
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 1252
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v2, "Unknown built-in code formatter: "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-object v0

    .line 1236
    :pswitch_0
    sget-object p0, Ll/ܿۜܿ;->֫:Ll/ܿۜܿ;

    return-object p0

    .line 1238
    :pswitch_1
    sget-object p0, Ll/ܿۜܿ;->ۧ:Ll/ܿۜܿ;

    return-object p0

    .line 1250
    :pswitch_2
    sget-object p0, Ll/ܿۜܿ;->ܽ:Ll/ܿۜܿ;

    return-object p0

    .line 1242
    :pswitch_3
    sget-object p0, Ll/ܿۜܿ;->ۢ:Ll/ܿۜܿ;

    return-object p0

    .line 1246
    :pswitch_4
    sget-object p0, Ll/ܿۜܿ;->ۡ:Ll/ܿۜܿ;

    return-object p0

    .line 1244
    :pswitch_5
    sget-object p0, Ll/ܿۜܿ;->ܿ:Ll/ܿۜܿ;

    return-object p0

    .line 1234
    :pswitch_6
    sget-object p0, Ll/ܿۜܿ;->᩻:Ll/ܿۜܿ;

    return-object p0

    .line 1240
    :pswitch_7
    sget-object p0, Ll/ܿۜܿ;->ᩳ:Ll/ܿۜܿ;

    return-object p0

    .line 1230
    :pswitch_8
    sget-object p0, Ll/ܿۜܿ;->ܳ:Ll/ܿۜܿ;

    return-object p0

    .line 1248
    :pswitch_9
    sget-object p0, Ll/ܿۜܿ;->᩷:Ll/ܿۜܿ;

    return-object p0

    .line 1232
    :pswitch_a
    sget-object p0, Ll/ܿۜܿ;->ۜ:Ll/ܿۜܿ;

    return-object p0

    :cond_c
    :goto_1
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x67f92afa -> :sswitch_a
        -0x61dc2356 -> :sswitch_9
        -0x3efe594a -> :sswitch_8
        -0xcf51087 -> :sswitch_7
        -0xb5d7ea -> :sswitch_6
        0x8dd8ffa -> :sswitch_5
        0x37f10137 -> :sswitch_4
        0x44293083 -> :sswitch_3
        0x48d52a80 -> :sswitch_2
        0x4a9b2d57 -> :sswitch_1
        0x7dad23cb -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۧ(Ljava/io/InputStream;)V
    .locals 10

    .line 679
    invoke-static {}, Ll/ۜ᩷ܿ;->ۜ()Ll/ܳ᩷ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ܳ᩷ܿ;->ᩳ(Ll/ܳ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v0

    .line 680
    invoke-static {v0}, Ll/۟ۜܿ;->ܽ(Ll/۟ۜܿ;)Ll/ۙ᩷ܿ;

    move-result-object v1

    .line 681
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 682
    invoke-static {p0, v2}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    const-string v2, "init/styles.mtsx"

    .line 681
    invoke-static {v2, p0}, Ll/᩵ۖܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 683
    invoke-static {v0, p0}, Ll/۟ۜܿ;->ۧ(Ll/۟ۜܿ;Ljava/lang/String;)V

    .line 684
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v3, "syntax/styles.cache"

    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩸ۧ()Ll/ܺ֡ܿ;

    move-result-object v0

    .line 685
    invoke-virtual {v0}, Ll/ܺ֡ܿ;->ۤ()Z

    move-result v3

    const/4 v4, 0x0

    const/16 v5, 0x1008

    if-eqz v3, :cond_0

    .line 687
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object v3

    .line 688
    invoke-virtual {v3}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v6

    if-ne v6, v5, :cond_0

    .line 689
    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v7

    if-ne v6, v7, :cond_0

    .line 690
    invoke-virtual {v3}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 691
    invoke-virtual {v3}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v6

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_3

    .line 693
    invoke-virtual {v3}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v8

    .line 694
    invoke-static {v3}, Ll/᩸᩷ܿ;->֫(Ll/۬ۜܽ;)Ll/᩸᩷ܿ;

    move-result-object v9

    .line 695
    invoke-virtual {v1, v8, v9}, Ll/ۙ᩷ܿ;->֫(Ljava/lang/String;Ll/᩸᩷ܿ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 703
    :catch_0
    :cond_0
    invoke-virtual {v1}, Ll/ۙ᩷ܿ;->֫()V

    .line 704
    new-instance v3, Ll/ܳۨۢ;

    new-instance v6, Ll/ۨܿ֡;

    .line 23
    new-instance v7, Ll/֡᩹ᩳ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-direct {v6, p0, v7}, Ll/ۨܿ֡;-><init>(Ljava/lang/CharSequence;Ljava/lang/Runnable;)V

    .line 704
    invoke-direct {v3, v6}, Ll/ܳۨۢ;-><init>(Ll/ۨܿ֡;)V

    .line 705
    new-instance v6, Ll/֫ܳ֡;

    invoke-direct {v6, v3}, Ll/֫ܳ֡;-><init>(Ll/᩻ܳ֡;)V

    .line 706
    new-instance v3, Ll/ܳܰۢ;

    invoke-direct {v3, v6}, Ll/ܳܰۢ;-><init>(Ll/֫ܳ֡;)V

    .line 707
    new-instance v6, Ll/ܽ᩷ܿ;

    invoke-direct {v6, v2}, Ll/ܽ᩷ܿ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 708
    invoke-virtual {v3}, Ll/ܳܰۢ;->ۚۧ()Ll/ᩳܰۢ;

    move-result-object v2

    .line 213
    const-class v3, Ll/ۖۨۢ;

    invoke-virtual {v2, v3}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 708
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۨۢ;

    const/16 v6, 0x2e

    .line 1222
    invoke-virtual {v3, v6, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v6

    .line 710
    invoke-static {v6}, Ll/ܶۜܿ;->ܽ(Ll/ۘ᩷֡;)Ljava/lang/String;

    move-result-object v6

    .line 711
    invoke-static {v3}, Ll/ܶۜܿ;->֫(Ll/ۖۨۢ;)Ll/᩸᩷ܿ;

    move-result-object v3

    invoke-virtual {v1, v6, v3}, Ll/ۙ᩷ܿ;->֫(Ljava/lang/String;Ll/᩸᩷ܿ;)V

    goto :goto_1

    .line 713
    :cond_1
    new-instance v2, Ll/ۤۜܽ;

    invoke-direct {v2}, Ll/ۤۜܽ;-><init>()V

    .line 714
    invoke-virtual {v2, v5}, Ll/ۤۜܽ;->ۡ(I)V

    .line 715
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 716
    invoke-virtual {v2, p0}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 718
    invoke-virtual {v1}, Ll/ۙ᩷ܿ;->ܽ()I

    move-result p0

    invoke-virtual {v2, p0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 719
    invoke-virtual {v1}, Ll/ۙ᩷ܿ;->ۧ()Ll/ᩴۚᩴ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩴۚᩴ;->iterator()Ll/۫֡ᩴ;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۜᩴ;

    .line 720
    invoke-interface {v1}, Ll/ۨۜᩴ;->֫()I

    move-result v3

    invoke-static {v3}, Ll/ۙ᩷ܿ;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 721
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸᩷ܿ;

    invoke-virtual {v1, v2}, Ll/᩸᩷ܿ;->֫(Ll/ۤۜܽ;)V

    goto :goto_2

    .line 724
    :cond_2
    :try_start_1
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_3
    return-void
.end method

.method public static ܳ()Ljava/util/List;
    .locals 1

    .line 1188
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ᩷ܿ;->ۜ(Ll/ܿ᩷ܿ;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static ܽ()Ljava/util/List;
    .locals 3

    .line 1197
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ᩷ܿ;->ۧ(Ll/ܿ᩷ܿ;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/۫ۜܿ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/۫ۜܿ;-><init>(I)V

    .line 1198
    invoke-static {v1}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 1199
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static ܽ(Ljava/lang/String;)Ll/ۜۜܿ;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 1298
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 1301
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "#BUILT_IN_JSON_SHRINKER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v1, "#BUILT_IN_HTML_SHRINKER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v1, "#BUILT_IN_CSS_SHRINKER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v1, "#BUILT_IN_JS_SHRINKER#"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 1311
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v2, "Unknown built-in code shrinker: "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-object v0

    .line 1309
    :pswitch_0
    sget-object p0, Ll/ۜۜܿ;->ᩳ:Ll/ۜۜܿ;

    return-object p0

    .line 1305
    :pswitch_1
    sget-object p0, Ll/ۜۜܿ;->ۧ:Ll/ۜۜܿ;

    return-object p0

    .line 1303
    :pswitch_2
    sget-object p0, Ll/ۜۜܿ;->֫:Ll/ۜۜܿ;

    return-object p0

    .line 1307
    :pswitch_3
    sget-object p0, Ll/ۜۜܿ;->ܽ:Ll/ۜۜܿ;

    return-object p0

    :cond_5
    :goto_1
    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x6f004853 -> :sswitch_3
        -0x5a034ee5 -> :sswitch_2
        -0x325eb9f1 -> :sswitch_1
        -0x23f97cf4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static declared-synchronized ܽ(Ll/ܶۜܿ;)Z
    .locals 6

    .line 2
    const-class v0, Ll/ۜ᩷ܿ;

    .line 3
    monitor-enter v0

    .line 591
    :try_start_0
    invoke-virtual {p0}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    .line 280
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 593
    sget-object v3, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v4, "syntax/custom"

    invoke-virtual {v3, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 594
    invoke-static {v3, v1}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܺ֡ܿ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 946
    :try_start_1
    new-instance v3, Ll/ۤۜܽ;

    invoke-direct {v3}, Ll/ۤۜܽ;-><init>()V

    const v4, 0xffff

    .line 947
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->ۡ(I)V

    .line 948
    invoke-virtual {v3, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 949
    invoke-static {v1, v3}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ۤۜܽ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 601
    :try_start_2
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v3

    .line 602
    new-instance v4, Ll/ܳ᩷ܿ;

    invoke-direct {v4, v3}, Ll/ܳ᩷ܿ;-><init>(Ll/ܿ᩷ܿ;)V

    .line 603
    invoke-static {v4}, Ll/ܳ᩷ܿ;->ܽ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v5

    invoke-static {v3}, Ll/ܿ᩷ܿ;->ᩳ(Ll/ܿ᩷ܿ;)Ljava/util/Map;

    move-result-object v3

    check-cast v5, Ljava/util/HashMap;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 604
    invoke-static {v4}, Ll/ܳ᩷ܿ;->ܽ(Ll/ܳ᩷ܿ;)Ljava/util/Map;

    move-result-object v3

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 606
    :try_start_3
    new-instance v2, Ll/ܿ᩷ܿ;

    invoke-direct {v2, v4}, Ll/ܿ᩷ܿ;-><init>(Ll/ܳ᩷ܿ;)V

    invoke-static {v2}, Ll/ۜ᩷ܿ;->֫(Ll/ܿ᩷ܿ;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 p0, 0x1

    .line 615
    :try_start_4
    invoke-static {p0}, Ll/ۖ֨ܿ;->֫(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 616
    monitor-exit v0

    return p0

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    .line 609
    :goto_0
    :try_start_5
    invoke-virtual {p0}, Ll/ܶۜܿ;->ۡ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, p0}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ܶۜܿ;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    :catch_2
    move-exception p0

    .line 611
    :try_start_6
    invoke-virtual {v2, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 613
    :goto_1
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 599
    :catch_3
    monitor-exit v0

    const/4 p0, 0x0

    return p0

    :catchall_0
    move-exception p0

    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p0
.end method

.method public static ܿ(Ljava/lang/String;)Ll/ܶۜܿ;
    .locals 5

    const-string v0, "TEMPORARY:"

    .line 1106
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0xa

    .line 1107
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 1101
    :try_start_0
    sget-object v0, Ll/ܽ֡ܿ;->ۢ:Ll/ܶ᩵ܿ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".mtsx.bin"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 1087
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object p0

    .line 1088
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v0

    const/16 v1, 0x1008

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 1091
    :cond_0
    new-instance v0, Ll/ܶۜܿ;

    invoke-direct {v0, p0}, Ll/ܶۜܿ;-><init>(Ll/۬ۜܽ;)V

    .line 1092
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p0, v1, v3

    if-nez p0, :cond_1

    .line 1208
    new-instance p0, Ll/᩷ܺܿ;

    invoke-direct {p0}, Ll/᩷ܺܿ;-><init>()V

    invoke-virtual {v0, p0}, Ll/ܶۜܿ;->֫(Ll/᩷ܺܿ;)V

    .line 1209
    invoke-virtual {v0}, Ll/ܶۜܿ;->ۧ()V

    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_2

    return-object p0

    .line 1093
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Trailing bytes in temporary language cache"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    const-string p0, "Text"

    :cond_3
    const-string v0, "INTERNAL:"

    .line 1118
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1119
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ᩷ܿ;->᩻(Ll/ܿ᩷ܿ;)Ljava/util/Map;

    move-result-object v0

    const/16 v1, 0x9

    .line 1121
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 280
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 1119
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶۜܿ;

    return-object p0

    .line 280
    :cond_4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 1124
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v0

    invoke-static {v0, p0}, Ll/ܿ᩷ܿ;->ۧ(Ll/ܿ᩷ܿ;Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ()Ll/᩸᩷ܿ;
    .locals 1

    .line 1167
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ᩷ܿ;->ܿ(Ll/ܿ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v0

    invoke-static {v0}, Ll/۟ۜܿ;->ۧ(Ll/۟ۜܿ;)Ll/᩸᩷ܿ;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ()Ljava/util/ArrayList;
    .locals 2

    .line 1193
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/ܿ᩷ܿ;->ܽ(Ll/ܿ᩷ܿ;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static ᩳ(Ljava/lang/String;)Ll/ܶۜܿ;
    .locals 8

    .line 1139
    invoke-static {}, Ll/ۜ᩷ܿ;->֫()Ll/ܿ᩷ܿ;

    move-result-object v0

    const-string v1, "."

    .line 1140
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    return-object v2

    .line 1143
    :cond_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 280
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 1144
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1

    return-object v2

    .line 1146
    :cond_1
    invoke-static {v0, v4}, Ll/ܿ᩷ܿ;->֫(Ll/ܿ᩷ܿ;Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object v2

    if-nez v2, :cond_2

    const-string v6, ".bak"

    .line 1148
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    add-int/lit8 v4, v1, -0x1

    const/16 v6, 0x2e

    .line 1149
    invoke-virtual {p0, v6, v4}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v4

    if-eq v4, v3, :cond_2

    .line 1151
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 280
    invoke-virtual {p0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 1152
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v7, :cond_2

    .line 1153
    invoke-static {v0, p0}, Ll/ܿ᩷ܿ;->֫(Ll/ܿ᩷ܿ;Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v2
.end method

.method public static declared-synchronized ᩻()V
    .locals 9

    .line 2
    const-class v0, Ll/ۜ᩷ܿ;

    .line 3
    monitor-enter v0

    .line 420
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۧ()Landroid/content/res/AssetManager;

    move-result-object v1

    .line 424
    sget-object v2, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v3, "syntax/online"

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩸ۧ()Ll/ܺ֡ܿ;

    move-result-object v2

    .line 425
    invoke-virtual {v2}, Ll/ܺ֡ܿ;->֨֫()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    const-string v3, "init/styles.mtsx"

    .line 426
    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩸ۧ()Ll/ܺ֡ܿ;

    move-result-object v3

    const-string v5, "init/builtins.mtsx"

    .line 427
    invoke-virtual {v2, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩸ۧ()Ll/ܺ֡ܿ;

    move-result-object v5

    const-string v6, "VERSION"

    .line 428
    invoke-virtual {v2, v6}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩸ۧ()Ll/ܺ֡ܿ;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v7, -0x1

    .line 431
    :try_start_1
    invoke-virtual {v6}, Ll/ܺ֡ܿ;->ۤ()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 432
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object v6

    invoke-virtual {v6}, Ll/۬ۜܽ;->readInt()I

    move-result v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    const/16 v6, 0xe

    if-le v7, v6, :cond_2

    const/4 v6, 0x1

    .line 413
    :try_start_2
    invoke-virtual {v2, v6}, Ll/ܺ֡ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v6

    .line 437
    invoke-static {v6}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v6

    new-instance v7, Ll/᩸ۜܿ;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Ll/᩸ۜܿ;-><init>(I)V

    .line 438
    invoke-interface {v6, v7}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v6

    .line 439
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v7

    invoke-interface {v6, v7}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 441
    :try_start_3
    invoke-virtual {v3}, Ll/ܺ֡ܿ;->۠֫()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v5}, Ll/ܺ֡ܿ;->۠֫()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1

    .line 444
    new-instance v7, Ll/᩶ۜܿ;

    invoke-direct {v7, v3, v5, v6, v1}, Ll/᩶ۜܿ;-><init>(Ll/ܺ֡ܿ;Ll/ܺ֡ܿ;Ljava/util/List;Landroid/content/res/AssetManager;)V

    invoke-static {v7}, Ll/ۜ᩷ܿ;->֫(Ll/᩻᩷ܿ;)Ll/ܿ᩷ܿ;

    move-result-object v4

    goto :goto_1

    .line 442
    :cond_1
    new-instance v3, Ljava/io/IOException;

    const-string v5, "Incomplete online syntax package"

    invoke-direct {v3, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v3

    :try_start_4
    const-string v5, "online_bad"

    .line 469
    invoke-virtual {v2, v5}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 470
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->۬()Z

    .line 471
    invoke-virtual {v2, v5}, Ll/ܺ֡ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    const-string v2, "_error.log"

    .line 472
    invoke-virtual {v5, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v3}, Ll/ۘ۫ۡ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catch_1
    nop

    :cond_2
    :goto_1
    if-nez v4, :cond_4

    .line 480
    :try_start_5
    new-instance v2, Ll/ۙۜܿ;

    invoke-direct {v2, v1}, Ll/ۙۜܿ;-><init>(Landroid/content/res/AssetManager;)V

    invoke-static {v2}, Ll/ۜ᩷ܿ;->֫(Ll/᩻᩷ܿ;)Ll/ܿ᩷ܿ;

    move-result-object v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catch_2
    move-exception v1

    .line 502
    :try_start_6
    instance-of v2, v1, Ljava/lang/RuntimeException;

    if-eqz v2, :cond_3

    .line 503
    check-cast v1, Ljava/lang/RuntimeException;

    throw v1

    .line 504
    :cond_3
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 508
    :cond_4
    :goto_2
    invoke-static {v4}, Ll/ۜ᩷ܿ;->֫(Ll/ܿ᩷ܿ;)V

    .line 509
    invoke-static {v4}, Ll/ܿ᩷ܿ;->֫(Ll/ܿ᩷ܿ;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 510
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶۜܿ;

    invoke-virtual {v3}, Ll/ܶۜܿ;->ۘ()Z

    move-result v3

    if-nez v3, :cond_5

    .line 511
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/16 v3, 0x2e

    .line 512
    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-nez v3, :cond_5

    .line 513
    invoke-static {v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    .line 517
    invoke-static {v1}, Ll/ۖ֨ܿ;->֫(Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 522
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw v1
.end method
