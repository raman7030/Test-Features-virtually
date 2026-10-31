.class public final Ll/ۘ᩸ۢ;
.super Ljava/lang/Object;
.source "Y9AZ"


# direct methods
.method public static ֫()Ll/ۖ᩸ۢ;
    .locals 6

    .line 59
    invoke-static {}, Ll/᩵ܶ᩷;->ܽ()Ll/᩵ܶ᩷;

    move-result-object v0

    const-string v1, "term_ex_info_v3"

    const/4 v2, 0x0

    .line 132
    invoke-virtual {v0, v1, v2}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    :try_start_0
    new-instance v1, Ll/ۖ᩸ۢ;

    invoke-direct {v1}, Ll/ۖ᩸ۢ;-><init>()V

    .line 65
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-direct {v3, v0}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "v"

    .line 66
    invoke-virtual {v3, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Ll/ۖ᩸ۢ;->ᩳ:I

    const-string v0, "n"

    .line 67
    invoke-virtual {v3, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ll/ۖ᩸ۢ;->ܿ:Ljava/lang/String;

    .line 68
    iget-object v0, v1, Ll/ۖ᩸ۢ;->֫:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lbin/mt/json/JSONArray;->getLong(I)J

    move-result-wide v4

    iput-wide v4, v1, Ll/ۖ᩸ۢ;->ܽ:J

    .line 69
    iget-object v0, v1, Ll/ۖ᩸ۢ;->֫:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ll/ۖ᩸ۢ;->ۧ:Ljava/lang/String;
    :try_end_0
    .catch Lbin/mt/json/JSONParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    :goto_0
    return-object v2
.end method

.method public static ֫(Ll/ۖ᩸ۢ;Ll/ۗܺ᩷;Ljava/lang/Runnable;)V
    .locals 5

    .line 110
    sget-object v0, Ll/ܽ֡ܿ;->֫:Ll/ܶ᩵ܿ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "termex_v"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ۖ᩸ۢ;->ᩳ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۖ᩸ۢ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".apk"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 124
    sget-boolean v1, Ll/֫᩸ۢ;->ۧ:Z

    if-nez v1, :cond_0

    :try_start_0
    const-string v1, "bin.mt.termex"

    .line 66
    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_0

    .line 127
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 1321
    :try_start_1
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object v3

    .line 1316
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v4

    invoke-static {v3, v4}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/io/InputStream;)V

    .line 1317
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-static {v3}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v3

    .line 129
    iget-object v4, p0, Ll/ۖ᩸ۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 130
    iget v3, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v3, p0, Ll/ۖ᩸ۢ;->ᩳ:I

    .line 131
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v1, p0, Ll/ۖ᩸ۢ;->ܿ:Ljava/lang/String;

    .line 132
    invoke-static {p1, v2, p0, p2}, Ll/ۘ᩸ۢ;->ۧ(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ll/ۖ᩸ۢ;Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    nop

    .line 140
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1321
    :try_start_2
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object v1

    .line 1316
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/io/InputStream;)V

    .line 1317
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-static {v1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v1

    .line 142
    iget-object v2, p0, Ll/ۖ᩸ۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 143
    invoke-static {p1, v0, p0, p2}, Ll/ۘ᩸ۢ;->ۧ(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ll/ۖ᩸ۢ;Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    .line 150
    :catch_2
    :cond_1
    new-instance v1, Ll/᩷᩸ۢ;

    invoke-direct {v1, p1, v0, p0, p2}, Ll/᩷᩸ۢ;-><init>(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ll/ۖ᩸ۢ;Ljava/lang/Runnable;)V

    .line 214
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    :goto_1
    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/lang/Runnable;Z)V
    .locals 7

    .line 81
    invoke-static {}, Ll/ۘ᩸ۢ;->֫()Ll/ۖ᩸ۢ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 83
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 87
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "term_ex_skip"

    const/4 v3, -0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iget v2, v0, Ll/ۖ᩸ۢ;->ᩳ:I

    if-ne v1, v2, :cond_1

    .line 88
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 92
    :cond_1
    invoke-static {}, Ll/֫᩸ۢ;->ۧ()Ll/۟ܶۢ;

    move-result-object v1

    if-nez v1, :cond_2

    const v1, 0x7f120a37

    goto :goto_0

    .line 97
    :cond_2
    iget v1, v1, Ll/۟ܶۢ;->ܿ:I

    iget v2, v0, Ll/ۖ᩸ۢ;->ᩳ:I

    if-ge v1, v2, :cond_3

    const v1, 0x7f120a38

    .line 104
    :goto_0
    iget-object v2, v0, Ll/ۖ᩸ۢ;->ܿ:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, v0, Ll/ۖ᩸ۢ;->ܽ:J

    invoke-static {v4, v5}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "B"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Ll/ۖ᩸ۢ;->֫:Ljava/lang/String;

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    const/4 v2, 0x2

    aput-object v4, v5, v2

    const v2, 0x7f120a39

    invoke-static {v2, v5}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 105
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    const v4, 0x7f120a36

    .line 106
    invoke-virtual {v3, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    .line 108
    invoke-virtual {v3, v6}, Ll/᩵ۚۢ;->֫(Z)V

    new-instance v1, Ll/ۧ᩸ۢ;

    invoke-direct {v1, v0, p0, p1}, Ll/ۧ᩸ۢ;-><init>(Ll/ۖ᩸ۢ;Ll/ۗܺ᩷;Ljava/lang/Runnable;)V

    const p0, 0x7f12070a

    .line 109
    invoke-virtual {v3, p0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p0, Ll/ܽ᩸ۢ;

    invoke-direct {p0, p2, v0, p1}, Ll/ܽ᩸ۢ;-><init>(ZLl/ۖ᩸ۢ;Ljava/lang/Runnable;)V

    const p1, 0x7f12015e

    .line 113
    invoke-virtual {v3, p1, p0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 120
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 100
    :cond_3
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ll/ۖ᩸ۢ;Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ۘ᩸ۢ;->ۧ(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ll/ۖ᩸ۢ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ll/۟ܶۢ;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    const/4 v0, 0x0

    .line 391
    :try_start_0
    iget-object v1, p0, Ll/۟ܶۢ;->ᩳ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v2, p0, Ll/۟ܶۢ;->֫:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 393
    :try_start_1
    new-instance v1, Ll/ᩳܰۡ;

    invoke-direct {v1, v2}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 394
    :try_start_2
    invoke-static {v1}, Ll/ۘ᩸ۢ;->ᩳ(Ll/ᩳܰۡ;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۟ܶۢ;->ᩳ:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 396
    :cond_0
    :goto_0
    :try_start_3
    sget-object p0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v3, "term/.exhash"

    invoke-virtual {p0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 397
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v3, :cond_1

    .line 399
    :try_start_4
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz p0, :cond_1

    .line 411
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catch_0
    nop

    :cond_1
    if-nez v0, :cond_2

    .line 407
    :try_start_5
    new-instance p0, Ll/ᩳܰۡ;

    invoke-direct {p0, v2}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;)V

    move-object v0, p0

    .line 409
    :cond_2
    invoke-static {v0, v1}, Ll/ۘ᩸ۢ;->֫(Ll/ᩳܰۡ;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 411
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_1
    move-exception p0

    move-object v1, v0

    :goto_1
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 412
    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ᩳܰۡ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, v0}, Ll/ۘ᩸ۢ;->֫(Ll/ᩳܰۡ;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/ᩳܰۡ;Ljava/lang/String;)V
    .locals 10

    .line 416
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v1, "term"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 417
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 418
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 419
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ۘ᩸ۢ;->ܽ(Ll/ᩳܰۡ;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "lib/"

    .line 0
    invoke-static {v3, v4, v5}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 420
    invoke-virtual {p0}, Ll/ᩳܰۡ;->ۖ()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x7

    const/4 v7, 0x0

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩺ۡ;

    .line 421
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "assets/"

    .line 422
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 423
    invoke-virtual {v8, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 424
    :cond_1
    invoke-virtual {v8, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 425
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x4

    invoke-virtual {v8, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 429
    :goto_1
    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x2f

    .line 430
    invoke-virtual {v6, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v8, -0x1

    if-eq v5, v8, :cond_2

    .line 432
    invoke-virtual {v6, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 434
    :cond_2
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 436
    :cond_3
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 437
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۬()Z

    .line 438
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, ">> Delete: "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_2

    .line 440
    :cond_4
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 441
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 442
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩺ۡ;

    const-string v4, ".rename"

    .line 443
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 0
    invoke-static {v6, v7, v3}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_5
    const-string v4, ".link"

    .line 445
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/4 v4, 0x5

    .line 0
    invoke-static {v4, v7, v3}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 447
    new-instance v4, Ljava/lang/String;

    const/4 v5, 0x0

    .line 1757
    invoke-virtual {p0, v2, v5}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v2

    .line 447
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v2, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v4, "-n "

    .line 448
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, 0x3

    .line 449
    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 451
    :cond_6
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/system/Os;->symlink(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, ">> Symlink: "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " > "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_3

    .line 455
    :cond_7
    :goto_4
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, ">> Extract: "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 456
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 457
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 458
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۛ()V

    goto/16 :goto_3

    .line 460
    :cond_8
    invoke-virtual {p0, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v3, v2}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V

    goto/16 :goto_3

    :cond_9
    if-eqz p1, :cond_a

    const-string p0, ".exhash"

    .line 464
    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V

    :cond_a
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ᩳܰۡ;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۘ᩸ۢ;->ܽ(Ll/ᩳܰۡ;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ll/ۖ᩸ۢ;Ljava/lang/Runnable;)V
    .locals 9

    .line 231
    sget-boolean v0, Ll/֫᩸ۢ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 309
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p2

    const v0, 0x7f120a36

    invoke-virtual {p2, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f120a3d

    .line 310
    invoke-virtual {p2, v0}, Ll/᩵ۚۢ;->֫(I)V

    const/4 v0, 0x0

    .line 311
    invoke-virtual {p2, v0}, Ll/᩵ۚۢ;->֫(Z)V

    const v0, 0x7f120151

    const/4 v1, 0x0

    .line 312
    invoke-virtual {p2, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/ᩳ᩸ۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p3}, Ll/ᩳ᩸ۢ;-><init>(ILjava/lang/Object;)V

    const v1, 0x7f12015e

    .line 313
    invoke-virtual {p2, v1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 314
    invoke-virtual {p2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p2

    .line 337
    new-instance v0, Ll/ۢ᩸ۢ;

    invoke-direct {v0}, Ll/ۢ᩸ۢ;-><init>()V

    .line 338
    new-instance v1, Ll/ܺ᩸ۢ;

    invoke-direct {v1, p2, p0, v0, p3}, Ll/ܺ᩸ۢ;-><init>(Ll/֡ۚۢ;Ll/ۗܺ᩷;Ll/ۢ᩸ۢ;Ljava/lang/Runnable;)V

    .line 357
    invoke-virtual {p0}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 358
    new-instance v2, Ll/ܿ᩸ۢ;

    invoke-direct {v2, p0, v1}, Ll/ܿ᩸ۢ;-><init>(Ll/ۗܺ᩷;Ll/ܳۡ֫;)V

    invoke-virtual {p2, v2}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 360
    invoke-virtual {p2}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    new-instance v8, Ll/ܳ᩸ۢ;

    move-object v2, v8

    move-object v3, v0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Ll/ܳ᩸ۢ;-><init>(Ll/ۢ᩸ۢ;Ll/֡ۚۢ;Ljava/lang/Runnable;Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    sget-object v1, Ll/᩷֨ܿ;->֫:Ll/ۚۡ֫;

    new-instance v2, Ll/᩻᩸ۢ;

    invoke-direct {v2, v0, p2, p3}, Ll/᩻᩸ۢ;-><init>(Ll/ۢ᩸ۢ;Ll/֡ۚۢ;Ljava/lang/Runnable;)V

    invoke-virtual {v1, p2, v2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    const-string p2, "bin.mt.termex"

    .line 384
    invoke-static {p0, p1, p2}, Ll/᩷֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    return-void

    .line 235
    :cond_0
    new-instance v0, Ll/ۡ᩸ۢ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۡ᩸ۢ;-><init>(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ll/ۖ᩸ۢ;Ljava/lang/Runnable;)V

    .line 303
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static ܽ(Ll/ᩳܰۡ;)Ljava/lang/String;
    .locals 8

    .line 218
    new-instance v0, Ll/᩻ܰۡ;

    .line 9
    invoke-virtual {p0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/֨᩺ۡ;-><init>(Ljava/util/Collection;)V

    const-string p0, "lib/"

    .line 218
    invoke-virtual {v0, p0}, Ll/֨᩺ۡ;->ۧ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۗۢۡ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ۗۢۡ;-><init>(I)V

    .line 219
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۜ᩸ۢ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۜ᩸ۢ;-><init>(I)V

    .line 220
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 221
    invoke-static {}, Ll/᩺ۨᩴ;->toSet()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 222
    sget-object v1, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const-string v5, "/"

    if-ge v4, v2, :cond_1

    aget-object v6, v1, v4

    .line 223
    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 0
    invoke-static {p0, v6, v5}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 227
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object p0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    aget-object p0, p0, v3

    .line 0
    invoke-static {v0, p0, v5}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ll/ᩳܰۡ;)Ljava/lang/String;
    .locals 6

    .line 469
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object v0

    .line 470
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ۘ᩸ۢ;->ܽ(Ll/ᩳܰۡ;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "lib/"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [B

    .line 472
    invoke-virtual {p0}, Ll/ᩳܰۡ;->ۖ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩺ۡ;

    .line 473
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "assets/"

    .line 474
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 475
    :cond_1
    invoke-static {v0, v4}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 476
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    const v3, 0x1e240

    .line 477
    invoke-static {v5, v3, v2}, Ll/ܺܰۡ;->֫(II[B)V

    goto :goto_1

    .line 479
    :cond_2
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->ۜ()I

    move-result v3

    invoke-static {v5, v3, v2}, Ll/ܺܰۡ;->֫(II[B)V

    .line 481
    :goto_1
    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->update([B)V

    goto :goto_0

    .line 484
    :cond_3
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
