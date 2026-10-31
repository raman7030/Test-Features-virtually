.class public final Ll/᩻᩵ܿ;
.super Ljava/lang/Object;
.source "KBJN"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;

.field public static final ۧ:Ll/ۖ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^/mnt/user/(\\d+)/emulated/(\\d+)"

    .line 28
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩻᩵ܿ;->֫:Ljava/util/regex/Pattern;

    .line 29
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    sput-object v0, Ll/᩻᩵ܿ;->ۧ:Ll/ۖ᩵;

    return-void
.end method

.method public static ֫(Landroid/net/Uri;)Ljava/lang/String;
    .locals 14

    .line 33
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/qauxv/tmp/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_d

    :cond_0
    const-string v0, "/storage"

    const-string v2, "/proc/self/fd/"

    const/4 v3, 0x2

    const/4 v4, 0x1

    .line 76
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v5

    const-string v6, "r"

    invoke-virtual {v5, p0, v6}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/os/ParcelFileDescriptor;->getFd()I

    move-result v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/system/Os;->readlink(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "/mnt/user/"

    .line 78
    invoke-virtual {v2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 81
    sget-object v6, Ll/᩻᩵ܿ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 82
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 84
    invoke-virtual {v6, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 85
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/util/regex/Matcher;->end(I)I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const-string v0, "/"

    .line 89
    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    .line 92
    :goto_0
    :try_start_2
    invoke-virtual {v5}, Landroid/os/ParcelFileDescriptor;->close()V

    goto :goto_3

    :cond_2
    invoke-virtual {v5}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catchall_0
    move-exception v0

    if-eqz v5, :cond_3

    .line 76
    :try_start_3
    invoke-virtual {v5}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :goto_2
    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_5

    const-string p0, "/memfd:"

    .line 40
    invoke-virtual {v2, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_4

    :cond_4
    invoke-static {v2}, Ll/᩻᩵ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_4
    return-object v1

    .line 0
    :cond_5
    const-class v0, Ll/᩻᩵ܿ;

    monitor-enter v0

    .line 135
    :try_start_5
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-nez v2, :cond_6

    .line 137
    monitor-exit v0

    goto/16 :goto_9

    .line 139
    :cond_6
    :try_start_6
    sget-object v5, Ll/᩻᩵ܿ;->ۧ:Ll/ۖ᩵;

    .line 369
    invoke-virtual {v5, v2, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 139
    check-cast v5, Ll/ܳ᩵ܿ;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v5, :cond_7

    .line 143
    :try_start_7
    iget-object v6, v5, Ll/ܳ᩵ܿ;->ۨ:Ljava/lang/String;

    invoke-static {v6}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v6
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_5

    :catch_1
    move-object v6, v1

    :goto_5
    if-eqz v6, :cond_8

    .line 147
    :try_start_8
    iget-wide v7, v5, Ll/ܳ᩵ܿ;->ۛ:J

    iget-wide v9, v6, Landroid/content/pm/PackageInfo;->lastUpdateTime:J
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    cmp-long v11, v7, v9

    if-ltz v11, :cond_8

    .line 148
    monitor-exit v0

    goto/16 :goto_a

    :cond_7
    move-object v6, v1

    .line 151
    :cond_8
    :try_start_9
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x80

    invoke-virtual {v5, v7, v8}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-nez v5, :cond_9

    .line 153
    monitor-exit v0

    goto/16 :goto_9

    :cond_9
    if-eqz v6, :cond_a

    .line 155
    :try_start_a
    iget-object v7, v6, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iget-object v8, v5, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    if-nez v7, :cond_b

    .line 157
    :cond_a
    :try_start_b
    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    invoke-static {v6}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v6
    :try_end_b
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 162
    :cond_b
    :try_start_c
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v7

    const-string v8, "android.support.FILE_PROVIDER_PATHS"

    invoke-virtual {v5, v7, v8}, Landroid/content/pm/PackageItemInfo;->loadXmlMetaData(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/res/XmlResourceParser;

    move-result-object v7
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    if-nez v7, :cond_c

    .line 164
    monitor-exit v0

    goto/16 :goto_9

    .line 167
    :cond_c
    :try_start_d
    new-instance v8, Ll/ܳ᩵ܿ;

    .line 227
    invoke-direct {v8}, Ll/ۖ᩵;-><init>()V

    .line 228
    iget-object v9, v6, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v9, v8, Ll/ܳ᩵ܿ;->ۨ:Ljava/lang/String;

    .line 229
    iget-wide v9, v6, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    iput-wide v9, v8, Ll/ܳ᩵ܿ;->ۛ:J

    .line 169
    :cond_d
    :goto_6
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v6

    if-eq v6, v4, :cond_16

    if-ne v6, v3, :cond_d

    .line 171
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v9, "name"

    .line 173
    invoke-interface {v7, v1, v9}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "path"

    .line 174
    invoke-interface {v7, v1, v10}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "root-path"

    .line 178
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const/4 v12, 0x0

    if-eqz v11, :cond_e

    .line 179
    new-instance v6, Ljava/io/File;

    const-string v11, "/"

    invoke-direct {v6, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto/16 :goto_8

    :cond_e
    const-string v11, "files-path"

    .line 180
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    .line 181
    new-instance v6, Ljava/io/File;

    iget-object v11, v5, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v11, v11, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    const-string v13, "files"

    invoke-direct {v6, v11, v13}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    :cond_f
    const-string v11, "cache-path"

    .line 182
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    .line 183
    new-instance v6, Ljava/io/File;

    iget-object v11, v5, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v11, v11, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    const-string v13, "cache"

    invoke-direct {v6, v11, v13}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    :cond_10
    const-string v11, "external-path"

    .line 184
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_11

    .line 185
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v6

    goto :goto_8

    :cond_11
    const-string v11, "external-files-path"

    .line 186
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_12

    .line 187
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v6

    .line 417
    invoke-virtual {v6, v1}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    move-result-object v6

    .line 188
    array-length v11, v6

    if-lez v11, :cond_14

    .line 189
    aget-object v6, v6, v12

    goto :goto_7

    :cond_12
    const-string v11, "external-cache-path"

    .line 192
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    .line 193
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v6

    .line 466
    invoke-virtual {v6}, Landroid/content/Context;->getExternalCacheDirs()[Ljava/io/File;

    move-result-object v6

    .line 194
    array-length v11, v6

    if-lez v11, :cond_14

    .line 195
    aget-object v6, v6, v12

    goto :goto_7

    :cond_13
    const-string v11, "external-media-path"

    .line 198
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    .line 199
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;

    move-result-object v6

    .line 200
    array-length v11, v6

    if-lez v11, :cond_14

    .line 201
    aget-object v6, v6, v12

    :goto_7
    const/4 v12, 0x1

    goto :goto_8

    :cond_14
    move-object v6, v1

    :goto_8
    if-eqz v6, :cond_d

    if-eqz v12, :cond_15

    .line 207
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 208
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v5, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v6, v11, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 209
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v6, v11

    .line 211
    :cond_15
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v6, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 212
    invoke-virtual {v8, v9, v11}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_6

    .line 216
    :cond_16
    sget-object v3, Ll/᩻᩵ܿ;->ۧ:Ll/ۖ᩵;

    invoke-virtual {v3, v2, v8}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_2
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 217
    monitor-exit v0

    move-object v5, v8

    goto :goto_a

    .line 219
    :catch_2
    monitor-exit v0

    goto :goto_9

    .line 159
    :catch_3
    monitor-exit v0

    :goto_9
    move-object v5, v1

    :goto_a
    if-nez v5, :cond_17

    goto/16 :goto_b

    .line 103
    :cond_17
    invoke-virtual {p0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x2f

    .line 105
    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    .line 106
    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    add-int/2addr v2, v4

    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 369
    invoke-virtual {v5, v3, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 109
    check-cast v2, Ljava/io/File;

    if-nez v2, :cond_18

    .line 111
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to find configured root for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_b

    .line 114
    :cond_18
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    const-string v3, "/."

    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_19

    .line 115
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    :cond_19
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 120
    :try_start_e
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object p0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_4

    .line 126
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1a

    .line 127
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v0, "Resolved path jumped beyond configured root"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_b

    .line 131
    :cond_1a
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    goto :goto_c

    .line 122
    :catch_4
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to resolve canonical path for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_b
    move-object p0, v1

    :goto_c
    if-eqz p0, :cond_1b

    .line 44
    invoke-static {p0}, Ll/᩻᩵ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1b
    :goto_d
    return-object v1

    :catchall_2
    move-exception p0

    .line 159
    :try_start_f
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 53
    invoke-static {}, Ll/ܿ֡ܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "\u200bAndroid"

    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_1

    goto :goto_0

    .line 60
    :cond_1
    invoke-static {p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "\u200bAndroid/"

    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_0
    return-object p0

    .line 68
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Android"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x8

    .line 0
    invoke-static {v0, p0, v1}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
