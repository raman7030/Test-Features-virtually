.class public final Ll/ᩴܶܿ;
.super Ljava/lang/Object;
.source "I9S8"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/lang/Iterable;

.field public static final ܳ:Ljava/util/List;

.field public static final ܽ:Ljava/util/ArrayList;

.field public static ܿ:Ll/ۚۡ֫;

.field public static final ᩳ:Ljava/util/ArrayList;

.field public static final ᩻:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/ᩴܶܿ;->ᩳ:Ljava/util/ArrayList;

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Ll/ᩴܶܿ;->ܽ:Ljava/util/ArrayList;

    .line 53
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    sput-object v2, Ll/ᩴܶܿ;->᩻:Ljava/util/List;

    .line 54
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    sput-object v2, Ll/ᩴܶܿ;->ܳ:Ljava/util/List;

    .line 55
    invoke-static {v0, v1}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v1

    sput-object v1, Ll/ᩴܶܿ;->ۧ:Ljava/lang/Iterable;

    .line 56
    new-instance v1, Ll/ۚۡ֫;

    invoke-direct {v1}, Ll/ۚۡ֫;-><init>()V

    sput-object v1, Ll/ᩴܶܿ;->ܿ:Ll/ۚۡ֫;

    .line 59
    sget-object v1, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    const-string v2, "utsd"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "c"

    const-string v4, "b"

    const-string v5, "a"

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    .line 62
    :try_start_0
    new-instance v7, Lbin/mt/json/JSONArray;

    invoke-direct {v7, v1}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 78
    invoke-virtual {v7}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v1, :cond_0

    .line 80
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 81
    invoke-virtual {v9, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    .line 82
    invoke-virtual {v9, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 83
    invoke-virtual {v9, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 84
    new-instance v12, Ll/ۘܶܿ;

    invoke-direct {v12, v10, v11, v9}, Ll/ۘܶܿ;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lbin/mt/json/JSONParseException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :catch_0
    nop

    .line 67
    :cond_0
    sget-object v0, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    const-string v1, "utsd_h"

    invoke-interface {v0, v1, v3}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 70
    :try_start_1
    new-instance v1, Lbin/mt/json/JSONArray;

    invoke-direct {v1, v0}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    sget-object v0, Ll/ᩴܶܿ;->ܽ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    :goto_1
    if-ge v6, v3, :cond_1

    .line 80
    invoke-virtual {v1, v6}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 81
    invoke-virtual {v7, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 82
    invoke-virtual {v7, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 83
    invoke-virtual {v7, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 84
    new-instance v10, Ll/ۘܶܿ;

    invoke-direct {v10, v8, v9, v7}, Ll/ۘܶܿ;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lbin/mt/json/JSONParseException; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catch_1
    :cond_1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/util/List;)Lbin/mt/json/JSONArray;
    .locals 6

    .line 89
    new-instance v1, Lbin/mt/json/JSONArray;

    invoke-direct {v1}, Lbin/mt/json/JSONArray;-><init>()V

    .line 90
    const-class v0, Ll/ᩴܶܿ;

    monitor-enter v0

    .line 91
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘܶܿ;

    .line 92
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-direct {v3}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v4, "a"

    .line 93
    iget-object v5, v2, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v4, "b"

    .line 94
    iget-object v5, v2, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v4, "c"

    .line 95
    iget-object v2, v2, Ll/ۘܶܿ;->ܿ:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 96
    invoke-virtual {v1, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 98
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۘܶܿ;
    .locals 4

    .line 142
    const-class v0, Ll/ᩴܶܿ;

    monitor-enter v0

    .line 143
    :try_start_0
    sget-object v1, Ll/ᩴܶܿ;->ۧ:Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘܶܿ;

    .line 144
    iget-object v3, v2, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 145
    monitor-exit v0

    return-object v2

    .line 148
    :cond_1
    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/io/File;)Ll/ۡܶܿ;
    .locals 8

    .line 299
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/storage/"

    .line 323
    invoke-static {v1, v0}, Ll/ۢܺ֡;->ۧ(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/16 v1, 0x2f

    const/16 v3, 0x9

    .line 327
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/16 v4, 0x12

    if-ne v1, v4, :cond_1

    .line 331
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x13

    .line 332
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v4, -0x1

    if-ne v1, v4, :cond_2

    .line 334
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v0, ""

    goto :goto_0

    :cond_2
    move-object v0, v2

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_4

    .line 337
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v4, v3, :cond_4

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2d

    if-eq v3, v4, :cond_3

    goto :goto_1

    .line 340
    :cond_3
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    :goto_1
    move-object v0, v2

    :goto_2
    if-nez v0, :cond_5

    return-object v2

    :cond_5
    const/4 v1, 0x0

    .line 303
    aget-object v1, v0, v1

    const/4 v3, 0x1

    .line 304
    aget-object v4, v0, v3

    .line 305
    const-class v0, Ll/ᩴܶܿ;

    monitor-enter v0

    .line 306
    :try_start_0
    sget-object v5, Ll/ᩴܶܿ;->ۧ:Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘܶܿ;

    .line 307
    iget-object v7, v6, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 308
    invoke-virtual {v6, v4, v3}, Ll/ۘܶܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 309
    iget-object v2, v6, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    invoke-static {v2, v1}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 131
    invoke-virtual {v1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    const-string v3, ".MTDataFilesProvider"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 311
    new-instance v2, Ll/۬ܶܿ;

    .line 37
    invoke-direct {v2, p0, v1, v6}, Ll/ۡܶܿ;-><init>(Ljava/io/File;Landroid/net/Uri;Ll/ۘܶܿ;)V

    .line 311
    monitor-exit v0

    return-object v2

    .line 313
    :cond_7
    new-instance v2, Ll/ۡܶܿ;

    invoke-direct {v2, p0, v1, v6}, Ll/ۡܶܿ;-><init>(Ljava/io/File;Landroid/net/Uri;Ll/ۘܶܿ;)V

    monitor-exit v0

    return-object v2

    .line 317
    :cond_8
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic ֫()V
    .locals 0

    .line 0
    invoke-static {}, Ll/ᩴܶܿ;->ܳ()V

    return-void
.end method

.method public static ֫(I)V
    .locals 3

    .line 246
    const-class v0, Ll/ᩴܶܿ;

    monitor-enter v0

    .line 247
    :try_start_0
    sget-object v1, Ll/ᩴܶܿ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۘܶܿ;

    invoke-virtual {p0}, Ll/ۘܶܿ;->ۧ()V

    .line 248
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    new-instance p0, Ll/ۖܶܿ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ll/ᩴܶܿ;

    const-wide/16 v1, 0x1f4

    invoke-static {p0, v0, v1, v2}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void

    :catchall_0
    move-exception p0

    .line 248
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(II)V
    .locals 2

    .line 236
    const-class v0, Ll/ᩴܶܿ;

    monitor-enter v0

    .line 237
    :try_start_0
    sget-object v1, Ll/ᩴܶܿ;->ᩳ:Ljava/util/ArrayList;

    invoke-static {p0, p1, v1}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 238
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    new-instance p0, Ll/ۖܶܿ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class p1, Ll/ᩴܶܿ;

    const-wide/16 v0, 0x1f4

    invoke-static {p0, p1, v0, v1}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void

    :catchall_0
    move-exception p0

    .line 238
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Landroid/net/Uri;)V
    .locals 7

    .line 165
    invoke-static {p0}, Ll/᩶۫;->ۧ(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    .line 170
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 172
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 173
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update([B)V

    .line 174
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "%08X"

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x4

    const/16 v2, 0x2d

    .line 175
    invoke-virtual {v1, v0, v2}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 176
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 177
    invoke-static {v1}, Ll/ᩴܶܿ;->ܽ(Ljava/lang/String;)Ll/ۘܶܿ;

    move-result-object v3

    if-eqz v3, :cond_1

    :goto_0
    return-void

    .line 131
    :cond_1
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    const-string v5, ".MTDataFilesProvider"

    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 184
    invoke-static {p0}, Ll/ᩴܶܿ;->ۧ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    .line 186
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 187
    invoke-virtual {v5, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 188
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v3, v5}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_3

    .line 194
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "content://com.termux"

    .line 195
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v6, "home"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v3, "Termux Home"

    :cond_3
    if-nez v3, :cond_4

    .line 201
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v3

    invoke-static {v3, p0}, Ll/ۖۧ֫;->֫(Landroid/app/Application;Landroid/net/Uri;)Ll/ۖۧ֫;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۖۧ֫;->֫()Ljava/lang/String;

    move-result-object v3

    :cond_4
    if-nez v3, :cond_5

    .line 204
    invoke-static {p0}, Ll/ܳܶܿ;->ܽ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    .line 206
    :cond_5
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x18

    if-lt v5, v6, :cond_7

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v6, 0x9

    if-ne v5, v6, :cond_7

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v2, :cond_7

    const-string v0, "storage"

    .line 204
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 207
    instance-of v2, v0, Landroid/os/storage/StorageManager;

    if-eqz v2, :cond_7

    check-cast v0, Landroid/os/storage/StorageManager;

    .line 209
    :try_start_1
    invoke-virtual {v0}, Landroid/os/storage/StorageManager;->getStorageVolumes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/Object;)Landroid/os/storage/StorageVolume;

    move-result-object v2

    .line 210
    invoke-virtual {v2}, Landroid/os/storage/StorageVolume;->getUuid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 211
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/os/storage/StorageVolume;->getDescription(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 219
    :catch_1
    :cond_7
    const-class v0, Ll/ᩴܶܿ;

    monitor-enter v0

    .line 220
    :try_start_2
    sget-object v2, Ll/ᩴܶܿ;->ᩳ:Ljava/util/ArrayList;

    new-instance v5, Ll/ۘܶܿ;

    invoke-direct {v5, p0, v1, v3}, Ll/ۘܶܿ;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    sget-object p0, Ll/ᩴܶܿ;->ܽ:Ljava/util/ArrayList;

    new-instance v2, Ll/ܺܶܿ;

    invoke-direct {v2, v1, v4}, Ll/ܺܶܿ;-><init>(Ljava/lang/String;I)V

    invoke-static {p0, v2}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 222
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 223
    invoke-static {}, Ll/ᩴܶܿ;->ܳ()V

    .line 224
    sget-object p0, Ll/ᩴܶܿ;->ܿ:Ll/ۚۡ֫;

    sget-object v0, Ll/ᩴܶܿ;->᩻:Ljava/util/List;

    invoke-virtual {p0, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    .line 222
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static ֫(Lbin/mt/plus/Main;Ll/֨᩸ܳ;)V
    .locals 1

    .line 103
    sget-object v0, Ll/ᩴܶܿ;->ܿ:Ll/ۚۡ֫;

    invoke-virtual {v0, p0, p1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public static ֫(Ljava/util/Set;)V
    .locals 4

    .line 263
    const-class v0, Ll/ᩴܶܿ;

    monitor-enter v0

    .line 264
    :try_start_0
    sget-object v1, Ll/ᩴܶܿ;->ۧ:Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 265
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘܶܿ;

    .line 266
    iget-object v3, v2, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    invoke-interface {p0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 267
    invoke-virtual {v2}, Ll/ۘܶܿ;->ۧ()V

    .line 268
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 271
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    invoke-static {}, Ll/ᩴܶܿ;->ܳ()V

    .line 273
    sget-object p0, Ll/ᩴܶܿ;->ܿ:Ll/ۚۡ֫;

    sget-object v0, Ll/ᩴܶܿ;->᩻:Ljava/util/List;

    invoke-virtual {p0, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    .line 271
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۧ(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    .line 135
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/16 v1, 0x14

    .line 0
    invoke-static {v1, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۘܶܿ;
    .locals 4

    .line 120
    sget-object v0, Ll/ᩴܶܿ;->ۧ:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘܶܿ;

    .line 121
    iget-object v2, v1, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    .line 131
    invoke-virtual {v2}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    const-string v3, ".MTDataFilesProvider"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 122
    iget-object v2, v1, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    invoke-static {v2}, Ll/ᩴܶܿ;->ۧ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ()V
    .locals 2

    .line 228
    invoke-static {}, Ll/ᩴܶܿ;->ܳ()V

    .line 229
    sget-object v0, Ll/ᩴܶܿ;->ܿ:Ll/ۚۡ֫;

    sget-object v1, Ll/ᩴܶܿ;->᩻:Ljava/util/List;

    invoke-virtual {v0, v1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public static ۧ(I)V
    .locals 3

    .line 256
    const-class v0, Ll/ᩴܶܿ;

    monitor-enter v0

    .line 257
    :try_start_0
    sget-object v1, Ll/ᩴܶܿ;->ܽ:Ljava/util/ArrayList;

    sget-object v2, Ll/ᩴܶܿ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۘܶܿ;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    new-instance p0, Ll/ۖܶܿ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ll/ᩴܶܿ;

    const-wide/16 v1, 0x1f4

    invoke-static {p0, v0, v1, v2}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void

    :catchall_0
    move-exception p0

    .line 258
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ܳ()V
    .locals 5

    .line 2
    const-class v0, Ll/ᩴܶܿ;

    .line 3
    monitor-enter v0

    .line 282
    :try_start_0
    const-class v1, Ll/ᩴܶܿ;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 283
    :try_start_1
    sget-object v2, Ll/ᩴܶܿ;->ᩳ:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ᩴܶܿ;->֫(Ljava/util/List;)Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v2

    .line 284
    sget-object v3, Ll/ᩴܶܿ;->ܽ:Ljava/util/ArrayList;

    invoke-static {v3}, Ll/ᩴܶܿ;->֫(Ljava/util/List;)Lbin/mt/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v3

    .line 285
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    :try_start_2
    sget-object v1, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v4, "utsd"

    .line 287
    invoke-interface {v1, v4, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "utsd_h"

    .line 288
    invoke-interface {v1, v2, v3}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    .line 289
    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 290
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    .line 285
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public static ܽ()Ljava/lang/Iterable;
    .locals 1

    .line 115
    sget-object v0, Ll/ᩴܶܿ;->ۧ:Ljava/lang/Iterable;

    return-object v0
.end method

.method public static ܽ(Ljava/lang/String;)Ll/ۘܶܿ;
    .locals 4

    .line 154
    const-class v0, Ll/ᩴܶܿ;

    monitor-enter v0

    .line 155
    :try_start_0
    sget-object v1, Ll/ᩴܶܿ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘܶܿ;

    .line 156
    iget-object v3, v2, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 157
    monitor-exit v0

    return-object v2

    .line 160
    :cond_1
    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ܿ()Ljava/util/List;
    .locals 1

    .line 107
    sget-object v0, Ll/ᩴܶܿ;->᩻:Ljava/util/List;

    return-object v0
.end method

.method public static ᩳ()Ljava/util/List;
    .locals 1

    .line 111
    sget-object v0, Ll/ᩴܶܿ;->ܳ:Ljava/util/List;

    return-object v0
.end method
