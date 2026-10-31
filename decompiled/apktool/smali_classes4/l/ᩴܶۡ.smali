.class public final Ll/ᩴܶۡ;
.super Ljava/lang/Object;
.source "316P"


# static fields
.field public static final ֫:Ll/֨᩵;

.field public static final ۧ:Ll/ۗۛۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 34
    new-instance v0, Ll/֨᩵;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ll/֨᩵;-><init>(I)V

    sput-object v0, Ll/ᩴܶۡ;->֫:Ll/֨᩵;

    .line 38
    new-instance v0, Ll/ۗۛۡ;

    invoke-direct {v0}, Ll/ۗۛۡ;-><init>()V

    sput-object v0, Ll/ᩴܶۡ;->ۧ:Ll/ۗۛۡ;

    return-void
.end method

.method public static final ֫(Landroid/content/pm/ApplicationInfo;)I
    .locals 2

    .line 334
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 335
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    return p0

    .line 338
    :cond_0
    :try_start_0
    new-instance v0, Ll/ᩳܰۡ;

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v0, p0}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string p0, "AndroidManifest.xml"

    .line 339
    invoke-virtual {v0, p0}, Ll/ᩳܰۡ;->᩷(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object p0

    const/4 v1, 0x0

    .line 1757
    invoke-virtual {v0, p0, v1}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object p0

    .line 340
    invoke-static {p0}, Ll/ܶۨۡ;->ۧ([B)Ll/ܶۨۡ;

    move-result-object p0

    .line 341
    invoke-static {p0}, Ll/᩹ۨۡ;->֫(Ll/ܶۨۡ;)I

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return p0

    :catchall_0
    move-exception p0

    .line 338
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-static {v0, p0}, Ll/۟᩸᩵;->֫(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Ll/ܶ᩵ܿ;
    .locals 9

    const-wide/16 v0, -0x1

    :try_start_0
    const-string v2, "r"

    .line 1956
    invoke-virtual {p0, v2}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1958
    :try_start_1
    invoke-virtual {v2}, Ll/᩻ۖܽ;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x16

    sub-long v5, v3, v5

    const-wide/32 v7, 0x10015

    sub-long/2addr v3, v7

    const-wide/16 v7, 0x0

    .line 1961
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :goto_0
    cmp-long v7, v5, v3

    if-ltz v7, :cond_1

    .line 1963
    invoke-virtual {v2, v5, v6}, Ll/᩻ۖܽ;->seek(J)V

    .line 1964
    invoke-virtual {v2}, Ll/᩻ۖܽ;->readInt()I

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v8, 0x6054b50

    if-ne v7, v8, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v7, 0x1

    sub-long/2addr v5, v7

    goto :goto_0

    :cond_1
    move-wide v5, v0

    .line 1971
    :goto_1
    :try_start_2
    invoke-virtual {v2}, Ll/᩻ۖܽ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catchall_0
    move-exception v3

    .line 1956
    :try_start_3
    invoke-virtual {v2}, Ll/᩻ۖܽ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v3
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-wide v5, v0

    :goto_3
    cmp-long v2, v5, v0

    if-nez v2, :cond_2

    const/4 p0, 0x0

    return-object p0

    .line 255
    :cond_2
    :try_start_5
    sget-object v0, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Ll/ۖܶۡ;

    invoke-direct {v1, p0}, Ll/ۖܶۡ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    .line 326
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶ᩵ܿ;
    :try_end_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    .line 328
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    throw p0
.end method

.method public static final ֫()V
    .locals 5

    .line 201
    sget-object v0, Ll/ᩴܶۡ;->֫:Ll/֨᩵;

    invoke-virtual {v0}, Ll/֨᩵;->֫()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    .line 777
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 873
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Map$Entry;

    .line 202
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Ljava/lang/Integer;

    if-eqz v4, :cond_0

    .line 873
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1915
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 203
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/֨᩵;->ۧ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 4

    .line 207
    sget-object v0, Ll/ᩴܶۡ;->֫:Ll/֨᩵;

    invoke-virtual {v0, p0}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 208
    instance-of v2, v1, Ljava/lang/Integer;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 209
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    add-int/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    .line 211
    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 212
    :goto_0
    invoke-virtual {v0, p0, v1}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ۧ(Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;
    .locals 5

    .line 218
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 221
    :cond_0
    iget v0, p0, Landroid/content/pm/ApplicationInfo;->labelRes:I

    if-eqz v0, :cond_3

    .line 223
    :try_start_0
    new-instance v0, Ll/ᩳܰۡ;

    iget-object v1, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    new-instance v2, Ll/ܺܶۡ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ܺܶۡ;-><init>(I)V

    invoke-direct {v0, v1, v2}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;Ll/ܺܶۡ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v1, "resources.arsc"

    .line 227
    invoke-virtual {v0, v1}, Ll/ᩳܰۡ;->᩷(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v1

    const/4 v2, 0x0

    .line 1757
    invoke-virtual {v0, v1, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v1

    .line 228
    new-instance v2, Ll/᩺᩻ܽ;

    invoke-direct {v2, v1}, Ll/᩺᩻ܽ;-><init>([B)V

    .line 229
    new-instance v1, Ll/۫ܽܽ;

    .line 90
    invoke-direct {v1, v3, v2}, Ll/۫ܽܽ;-><init>(ILl/ۢ᩻ܽ;)V

    .line 230
    iget v2, p0, Landroid/content/pm/ApplicationInfo;->labelRes:I

    ushr-int/lit8 v3, v2, 0x18

    and-int/lit16 v3, v3, 0xff

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 251
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 253
    :cond_1
    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 254
    invoke-virtual {v1, v2, v3, v4}, Ll/۫ܽܽ;->֫(ILandroid/util/TypedValue;Z)V

    .line 255
    invoke-virtual {v3}, Landroid/util/TypedValue;->coerceToString()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v1, :cond_2

    .line 47
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    .line 234
    :cond_2
    :try_start_3
    sget-object v1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 47
    :try_start_4
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 225
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_6
    invoke-static {v0, v1}, Ll/۟᩸᩵;->֫(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    nop

    .line 239
    :cond_3
    :goto_1
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    if-eqz v0, :cond_4

    goto :goto_2

    .line 241
    :cond_4
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string p0, "packageName"

    invoke-static {v0, p0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object v0
.end method

.method public static final ۧ(Ll/ܶ᩵ܿ;)V
    .locals 5

    const-string v0, "file"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v1

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 43
    sget-object v0, Ll/ᩴܶۡ;->֫:Ll/֨᩵;

    invoke-virtual {v0, p0}, Ll/֨᩵;->ۧ(Ljava/lang/Object;)V

    .line 44
    invoke-static {p0}, Ll/۠۫ܽ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public static final ܽ(Ll/ܶ᩵ܿ;)Ll/ۘܶۡ;
    .locals 25

    move-object/from16 v0, p0

    .line 4
    sget-object v1, Ll/ᩴܶۡ;->ۧ:Ll/ۗۛۡ;

    const-string v2, "file"

    .line 9
    invoke-static {v0, v2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 55
    sget-object v3, Ll/ᩴܶۡ;->֫:Ll/֨᩵;

    invoke-virtual {v3, v2}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    .line 57
    instance-of v7, v4, Ljava/lang/Integer;

    if-eqz v7, :cond_1

    .line 58
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v7

    const/4 v8, 0x3

    if-le v7, v8, :cond_0

    goto/16 :goto_4

    .line 60
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    add-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 62
    :cond_1
    check-cast v4, Ll/ۘܶۡ;

    return-object v4

    .line 72
    :cond_2
    :goto_0
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 73
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩵ܿ;->֡()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 80
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v7

    move-object v8, v6

    goto :goto_1

    .line 82
    :cond_3
    invoke-static/range {p0 .. p0}, Ll/ᩴܶۡ;->֫(Ll/ܶ᩵ܿ;)Ll/ܶ᩵ܿ;

    move-result-object v7

    if-nez v7, :cond_4

    invoke-static {v2}, Ll/ᩴܶۡ;->֫(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    return-object v6

    .line 83
    :cond_4
    :try_start_1
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    move-object/from16 v24, v8

    move-object v8, v7

    move-object/from16 v7, v24

    :goto_1
    const/4 v9, 0x0

    .line 85
    :try_start_2
    invoke-virtual {v4, v7, v9}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v10

    if-nez v10, :cond_8

    .line 92
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v11

    invoke-static {v7, v11}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 94
    instance-of v11, v0, Ll/ܳ᩸ܿ;

    if-eqz v11, :cond_5

    goto :goto_2

    .line 96
    :cond_5
    instance-of v11, v0, Ll/ܺ֡ܿ;

    if-eqz v11, :cond_6

    const-string v11, "download"

    invoke-static {v7, v11, v5}, Ll/ۗۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_2

    .line 98
    :cond_6
    instance-of v5, v0, Ll/ۧ᩹ܿ;

    if-eqz v5, :cond_8

    move-object v5, v0

    check-cast v5, Ll/ۧ᩹ܿ;

    invoke-virtual {v5}, Ll/ۧ᩹ܿ;->֫ܽ()Z

    move-result v5

    if-nez v5, :cond_8

    const-string v5, "/data/"

    invoke-static {v7, v5}, Ll/ۗۙ᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 102
    :goto_2
    invoke-static/range {p0 .. p0}, Ll/ᩴܶۡ;->֫(Ll/ܶ᩵ܿ;)Ll/ܶ᩵ܿ;

    move-result-object v5

    if-nez v5, :cond_7

    invoke-static {v2}, Ll/ᩴܶۡ;->֫(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz v8, :cond_9

    .line 170
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->۬()Z

    return-object v6

    .line 103
    :cond_7
    :try_start_3
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v7

    .line 104
    invoke-virtual {v4, v7, v9}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v8, v5

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v6, v5

    goto/16 :goto_a

    :cond_8
    :goto_3
    if-nez v10, :cond_a

    .line 113
    :try_start_4
    invoke-static {v2}, Ll/ᩴܶۡ;->֫(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v8, :cond_9

    .line 170
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_9
    :goto_4
    return-object v6

    .line 114
    :cond_a
    :try_start_5
    iget-object v5, v10, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {v5}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 115
    iput-object v7, v5, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 116
    iput-object v7, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 118
    iget-object v12, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 119
    iget-object v6, v10, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v6, :cond_b

    const-string v6, "null"

    :cond_b
    move-object v14, v6

    .line 121
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1c

    if-lt v6, v7, :cond_c

    .line 122
    invoke-virtual {v10}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v6

    :goto_5
    move-wide v15, v6

    goto :goto_6

    .line 124
    :cond_c
    iget v6, v10, Landroid/content/pm/PackageInfo;->versionCode:I

    int-to-long v6, v6

    goto :goto_5

    .line 126
    :goto_6
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v17

    .line 128
    iget v0, v5, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 129
    invoke-static {v5}, Ll/ᩴܶۡ;->֫(Landroid/content/pm/ApplicationInfo;)I

    move-result v20

    .line 132
    invoke-static {v5}, Ll/ᩴܶۡ;->ۧ(Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;

    move-result-object v13

    .line 134
    invoke-virtual {v1, v12}, Ll/ۗۛۡ;->֫(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 136
    :try_start_6
    iget v6, v5, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v6, v12}, Ll/ۘ۠ۡ;->ۧ(ILjava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 138
    :try_start_7
    invoke-virtual {v5, v4}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 137
    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_7

    .line 140
    :catchall_1
    :try_start_8
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 139
    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 143
    :goto_7
    :try_start_9
    invoke-virtual {v1, v12}, Ll/ۗۛۡ;->ۧ(Ljava/lang/String;)V

    .line 179
    instance-of v1, v4, Landroid/graphics/drawable/BitmapDrawable;

    if-nez v1, :cond_d

    goto :goto_8

    .line 182
    :cond_d
    move-object v1, v4

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_e

    goto :goto_8

    .line 183
    :cond_e
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    .line 184
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    if-lez v6, :cond_15

    if-gtz v7, :cond_f

    goto :goto_8

    .line 188
    :cond_f
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v9

    const/16 v10, 0x200

    if-gt v9, v10, :cond_10

    goto :goto_8

    :cond_10
    const/high16 v10, 0x44000000    # 512.0f

    int-to-float v9, v9

    div-float/2addr v10, v9

    int-to-float v6, v6

    mul-float v6, v6, v10

    .line 1210
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    const-string v11, "Cannot round NaN value."

    if-nez v9, :cond_14

    :try_start_a
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    const/4 v9, 0x1

    if-ge v6, v9, :cond_11

    const/4 v6, 0x1

    :cond_11
    int-to-float v7, v7

    mul-float v7, v7, v10

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v10

    if-nez v10, :cond_13

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    if-ge v7, v9, :cond_12

    const/4 v7, 0x1

    .line 77
    :cond_12
    invoke-static {v1, v6, v7, v9}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 196
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v6

    .line 28
    new-instance v7, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v7, v6, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    move-object/from16 v22, v7

    goto :goto_9

    .line 1210
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    :goto_8
    move-object/from16 v22, v4

    .line 154
    :goto_9
    new-instance v1, Ll/ۘܶۡ;

    .line 155
    invoke-static {v12}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 164
    iget v5, v5, Landroid/content/pm/ApplicationInfo;->icon:I

    move-object v11, v1

    move/from16 v19, v0

    move-object/from16 v21, v4

    move/from16 v23, v5

    .line 154
    invoke-direct/range {v11 .. v23}, Ll/ۘܶۡ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;I)V

    .line 166
    invoke-virtual {v3, v2, v1}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    if-eqz v8, :cond_16

    .line 170
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_16
    return-object v1

    :catchall_2
    move-exception v0

    .line 143
    :try_start_b
    invoke-virtual {v1, v12}, Ll/ۗۛۡ;->ۧ(Ljava/lang/String;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :catchall_3
    move-exception v0

    move-object v6, v8

    goto :goto_a

    :catchall_4
    move-exception v0

    move-object v6, v7

    goto :goto_a

    :catchall_5
    move-exception v0

    :goto_a
    if-eqz v6, :cond_17

    .line 170
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_17
    throw v0
.end method
