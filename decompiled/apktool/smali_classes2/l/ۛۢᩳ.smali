.class public Ll/ۛۢᩳ;
.super Landroid/content/ContextWrapper;
.source "D1X2"


# static fields
.field public static final ܳ֫:Landroid/os/Handler;

.field public static final ܿ֫:Ll/۫ۢᩳ;

.field public static final synthetic ᩳ֫:I


# instance fields
.field public final ֡:Ljava/io/File;

.field public final ֨:Landroid/content/pm/Signature;

.field public final ֫:Ljava/io/File;

.field public final ֫֫:Ljava/io/File;

.field public final ۖ:Ll/ۤۢᩳ;

.field public final ۗ:Ljava/io/File;

.field public final ۘ:Ljava/io/File;

.field public final ۙ:Ljava/io/File;

.field public final ۚ:Ll/ۧۤᩴ;

.field public final ۛ:Ljava/io/File;

.field public final ۜ:Ljava/io/File;

.field public final ۟:Ljava/lang/String;

.field public final ۠:Ljava/io/File;

.field public final ۡ:Z

.field public ۢ:Ll/ۛۢᩳ;

.field public final ۤ:Ljava/io/File;

.field public final ۧ:Landroid/content/pm/ApplicationInfo;

.field public final ۧ֫:Ljava/io/File;

.field public final ۨ:Ljava/io/File;

.field public final ۫:Ljava/io/File;

.field public final ۬:Ljava/io/File;

.field public final ܰ:Ljava/io/File;

.field public final ܳ:Landroid/content/ContentResolver;

.field public final ܶ:Ljava/io/File;

.field public final ܺ:Ljava/io/File;

.field public ܽ:Landroid/content/Context;

.field public final ܽ֫:Ll/۟ۢᩳ;

.field public final ܿ:Ll/ۨۢᩳ;

.field public final ᩳ:Landroid/content/res/AssetManager;

.field public final ᩴ:Ll/ܰۢᩳ;

.field public final ᩵:Landroid/content/res/Resources;

.field public final ᩶:Ljava/io/File;

.field public final ᩷:Ljava/io/File;

.field public final ᩸:Ljava/io/File;

.field public final ᩹:Ljava/io/File;

.field public final ᩺:Ljava/io/File;

.field public ᩻:Ll/ۛۢᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 65
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll/ۛۢᩳ;->ܳ֫:Landroid/os/Handler;

    .line 66
    new-instance v0, Ll/۫ۢᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۛۢᩳ;->ܿ֫:Ll/۫ۢᩳ;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Landroid/content/pm/Signature;Ll/ۨۢᩳ;Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    .locals 9

    .line 191
    invoke-static {p1, p2}, Ll/ۤۢᩳ;->֫(Landroid/content/Context;Ljava/io/File;)Ll/ۤۢᩳ;

    move-result-object v1

    const/4 v8, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Ll/ۛۢᩳ;-><init>(Ll/ۤۢᩳ;Ljava/io/File;Landroid/content/pm/Signature;Ll/ۨۢᩳ;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ll/ۤۢᩳ;Ljava/io/File;Landroid/content/pm/Signature;Ll/ۨۢᩳ;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Z)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p7

    move/from16 v0, p8

    const-string v5, "arm64-v8a"

    const/4 v6, 0x0

    .line 204
    invoke-direct {v1, v6}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 104
    new-instance v6, Ll/ۧۤᩴ;

    invoke-direct {v6}, Ll/ۧۤᩴ;-><init>()V

    iput-object v6, v1, Ll/ۛۢᩳ;->ۚ:Ll/ۧۤᩴ;

    move-object/from16 v6, p1

    .line 205
    iput-object v6, v1, Ll/ۛۢᩳ;->ۖ:Ll/ۤۢᩳ;

    .line 206
    iput-object v3, v1, Ll/ۛۢᩳ;->ܿ:Ll/ۨۢᩳ;

    .line 207
    iput-object v2, v1, Ll/ۛۢᩳ;->֨:Landroid/content/pm/Signature;

    .line 208
    iput-boolean v0, v1, Ll/ۛۢᩳ;->ۡ:Z

    .line 209
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v7

    iput-object v7, v1, Ll/ۛۢᩳ;->֫:Ljava/io/File;

    .line 210
    invoke-virtual/range {p5 .. p5}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v8

    iput-object v8, v1, Ll/ۛۢᩳ;->ۘ:Ljava/io/File;

    .line 211
    invoke-virtual/range {p6 .. p6}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v8

    iput-object v8, v1, Ll/ۛۢᩳ;->֡:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 213
    new-instance v0, Ljava/io/File;

    const-string v9, "device_protected"

    invoke-direct {v0, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v8

    .line 214
    :cond_0
    iput-object v8, v1, Ll/ۛۢᩳ;->ۜ:Ljava/io/File;

    .line 215
    new-instance v0, Ljava/io/File;

    const-string v9, "files"

    invoke-direct {v0, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, v1, Ll/ۛۢᩳ;->ܺ:Ljava/io/File;

    .line 216
    new-instance v10, Ljava/io/File;

    const-string v11, "no_backup"

    invoke-direct {v10, v8, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 217
    new-instance v12, Ljava/io/File;

    const-string v13, "cache"

    invoke-direct {v12, v8, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 218
    new-instance v14, Ljava/io/File;

    const-string v15, "code_cache"

    invoke-direct {v14, v8, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 219
    new-instance v6, Ljava/io/File;

    const-string v2, "obb"

    invoke-direct {v6, v8, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 220
    new-instance v3, Ljava/io/File;

    move-object/from16 p2, v2

    const-string v2, "databases"

    invoke-direct {v3, v8, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v3, v1, Ll/ۛۢᩳ;->᩷:Ljava/io/File;

    move-object/from16 p5, v2

    .line 221
    new-instance v2, Ljava/io/File;

    move-object/from16 p6, v15

    const-string v15, "shared_prefs"

    invoke-direct {v2, v8, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 222
    invoke-static {v8}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 223
    invoke-static {v0}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 224
    invoke-static {v10}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 225
    invoke-static {v12}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 226
    invoke-static {v14}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 227
    invoke-static {v6}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 228
    invoke-static {v3}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 229
    invoke-static {v2}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 231
    invoke-static/range {p1 .. p1}, Ll/ۤۢᩳ;->ܽ(Ll/ۤۢᩳ;)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 232
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iput-object v0, v1, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    .line 233
    iget v3, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v6, 0x800000

    or-int/2addr v3, v6

    iput v3, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 234
    iget-object v3, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 235
    new-instance v0, Ljava/io/File;

    const-string v6, "-1/base.apk"

    const-string v8, "/data/app/"

    .line 0
    invoke-static {v8, v3, v6}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 235
    invoke-direct {v0, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, v1, Ll/ۛۢᩳ;->۠:Ljava/io/File;

    .line 568
    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v10, 0x0

    .line 569
    :try_start_0
    new-instance v12, Ljava/util/zip/ZipFile;

    invoke-direct {v12, v7}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 570
    :try_start_1
    invoke-virtual {v12}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/zip/ZipEntry;

    .line 571
    invoke-virtual {v7}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v14

    if-eqz v14, :cond_1

    goto :goto_0

    .line 574
    :cond_1
    invoke-virtual {v7}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v14, "lib/"

    .line 575
    invoke-virtual {v7, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_2

    goto :goto_0

    :cond_2
    const/16 v14, 0x2f

    const/4 v15, 0x4

    .line 578
    invoke-virtual {v7, v14, v15}, Ljava/lang/String;->indexOf(II)I

    move-result v14

    if-gt v14, v15, :cond_3

    goto :goto_0

    .line 582
    :cond_3
    invoke-virtual {v7, v15, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 610
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v14

    const/4 v15, -0x1

    sparse-switch v14, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_4

    goto :goto_1

    :cond_4
    const/4 v15, 0x6

    goto :goto_1

    :sswitch_1
    const-string v14, "armeabi-v7a"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    goto :goto_1

    :cond_5
    const/4 v15, 0x5

    goto :goto_1

    :sswitch_2
    const-string v14, "mips"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    goto :goto_1

    :cond_6
    const/4 v15, 0x4

    goto :goto_1

    :sswitch_3
    const-string v14, "x86"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7

    goto :goto_1

    :cond_7
    const/4 v15, 0x3

    goto :goto_1

    :sswitch_4
    const-string v14, "armeabi"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_8

    goto :goto_1

    :cond_8
    const/4 v15, 0x2

    goto :goto_1

    :sswitch_5
    const-string v14, "x86_64"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_9

    goto :goto_1

    :cond_9
    const/4 v15, 0x1

    goto :goto_1

    :sswitch_6
    const-string v14, "mips64"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_a

    goto :goto_1

    :cond_a
    const/4 v15, 0x0

    :goto_1
    packed-switch v15, :pswitch_data_0

    goto/16 :goto_0

    .line 584
    :pswitch_0
    :try_start_2
    invoke-interface {v6, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    .line 587
    :cond_b
    :try_start_3
    invoke-virtual {v12}, Ljava/util/zip/ZipFile;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v7, v0

    .line 569
    :try_start_4
    invoke-virtual {v12}, Ljava/util/zip/ZipFile;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v12, v0

    :try_start_5
    invoke-virtual {v7, v12}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v7
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    nop

    :goto_3
    if-eqz v4, :cond_c

    .line 589
    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    move-object v0, v4

    goto :goto_5

    .line 592
    :cond_c
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    .line 593
    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    array-length v4, v0

    const/4 v5, 0x0

    :goto_4
    if-ge v5, v4, :cond_e

    aget-object v7, v0, v5

    .line 594
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    move-object v0, v7

    goto :goto_5

    :cond_d
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 598
    :cond_e
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_5

    .line 600
    :cond_f
    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    array-length v4, v0

    if-lez v4, :cond_10

    .line 601
    aget-object v0, v0, v10

    goto :goto_5

    :cond_10
    move-object v0, v5

    .line 236
    :goto_5
    iput-object v0, v1, Ll/ۛۢᩳ;->۟:Ljava/lang/String;

    .line 237
    new-instance v4, Ljava/io/File;

    const-string v5, "-1/lib/"

    .line 0
    invoke-static {v8, v3, v5, v0}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 237
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 238
    new-instance v0, Ljava/io/File;

    const-string v5, "/data/data/"

    .line 0
    invoke-static {v5, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 238
    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, v1, Ll/ۛۢᩳ;->᩶:Ljava/io/File;

    .line 239
    new-instance v5, Ljava/io/File;

    const-string v6, "/data/user/0/"

    .line 0
    invoke-static {v6, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 239
    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v5, v1, Ll/ۛۢᩳ;->᩹:Ljava/io/File;

    .line 240
    new-instance v6, Ljava/io/File;

    const-string v7, "/data/user_de/0/"

    .line 0
    invoke-static {v7, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 240
    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v6, v1, Ll/ۛۢᩳ;->᩺:Ljava/io/File;

    .line 241
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v0, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->ܰ:Ljava/io/File;

    .line 242
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v0, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->֫֫:Ljava/io/File;

    .line 243
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v0, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->ܶ:Ljava/io/File;

    .line 244
    new-instance v7, Ljava/io/File;

    move-object/from16 v8, p6

    invoke-direct {v7, v0, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->᩸:Ljava/io/File;

    .line 245
    new-instance v7, Ljava/io/File;

    move-object/from16 v12, p2

    invoke-direct {v7, v0, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->ۧ֫:Ljava/io/File;

    .line 246
    new-instance v7, Ljava/io/File;

    move-object/from16 v14, p5

    invoke-direct {v7, v0, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->ۙ:Ljava/io/File;

    .line 247
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->ۤ:Ljava/io/File;

    .line 248
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->ۛ:Ljava/io/File;

    .line 249
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->ۗ:Ljava/io/File;

    .line 250
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->۬:Ljava/io/File;

    .line 251
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->ۨ:Ljava/io/File;

    .line 252
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v7, v1, Ll/ۛۢᩳ;->۫:Ljava/io/File;

    .line 253
    iget-object v7, v1, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v8

    iput v8, v7, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 254
    iget-object v7, v1, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iput-object v3, v7, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 255
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v7, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 256
    iget-object v4, v1, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iget-object v7, v1, Ll/ۛۢᩳ;->۠:Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 257
    iget-object v4, v1, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iget-object v7, v1, Ll/ۛۢᩳ;->۠:Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 259
    iget-object v4, v1, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    .line 629
    iget-boolean v7, v1, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v7, :cond_11

    move-object v0, v6

    .line 259
    :cond_11
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 260
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v0, v4, :cond_12

    .line 261
    iget-object v0, v1, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Landroid/content/pm/ApplicationInfo;->deviceProtectedDataDir:Ljava/lang/String;

    .line 262
    iget-object v0, v1, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    const-string v4, "credentialProtectedDataDir"

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 638
    :try_start_6
    const-class v6, Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v6, 0x1

    .line 639
    invoke-virtual {v4, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 640
    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_6

    :catchall_2
    nop

    .line 264
    :cond_12
    :goto_6
    iget-object v0, v1, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    move-object/from16 v4, p4

    invoke-virtual {v4, v0}, Ll/ۨۢᩳ;->֫(Landroid/content/pm/ApplicationInfo;)V

    if-eqz p3, :cond_13

    const/4 v0, 0x1

    new-array v4, v0, [Landroid/content/pm/Signature;

    aput-object p3, v4, v10

    .line 267
    iput-object v4, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    goto :goto_7

    :cond_13
    const/4 v0, 0x1

    .line 270
    :goto_7
    const-class v4, Landroid/content/res/AssetManager;

    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/res/AssetManager;

    iput-object v5, v1, Ll/ۛۢᩳ;->ᩳ:Landroid/content/res/AssetManager;

    .line 271
    new-array v6, v0, [Ljava/lang/Class;

    const-class v7, Ljava/lang/String;

    aput-object v7, v6, v10

    const-string v7, "addAssetPath"

    invoke-virtual {v4, v7, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    iget-object v6, v1, Ll/ۛۢᩳ;->֫:Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v6, v0, v10

    invoke-virtual {v4, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    new-instance v0, Landroid/content/res/Resources;

    .line 274
    invoke-static/range {p1 .. p1}, Ll/ۤۢᩳ;->ۧ(Ll/ۤۢᩳ;)Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 275
    invoke-static/range {p1 .. p1}, Ll/ۤۢᩳ;->֫(Ll/ۤۢᩳ;)Landroid/content/res/Configuration;

    move-result-object v6

    invoke-direct {v0, v5, v4, v6}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    iput-object v0, v1, Ll/ۛۢᩳ;->᩵:Landroid/content/res/Resources;

    .line 276
    new-instance v4, Ll/ܰۢᩳ;

    iget-object v5, v1, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    invoke-direct {v4, v2, v5, v0, v3}, Ll/ܰۢᩳ;-><init>(Landroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Landroid/content/res/Resources;Ljava/lang/String;)V

    iput-object v4, v1, Ll/ۛۢᩳ;->ᩴ:Ll/ܰۢᩳ;

    .line 277
    new-instance v0, Ll/᩺ۢᩳ;

    .line 27
    invoke-direct {v0, v1}, Landroid/content/ContentResolver;-><init>(Landroid/content/Context;)V

    .line 277
    iput-object v0, v1, Ll/ۛۢᩳ;->ܳ:Landroid/content/ContentResolver;

    .line 278
    new-instance v0, Ll/۟ۢᩳ;

    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 278
    iput-object v0, v1, Ll/ۛۢᩳ;->ܽ֫:Ll/۟ۢᩳ;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x40038063 -> :sswitch_6
        -0x300b59d9 -> :sswitch_5
        -0x2c0bb1c1 -> :sswitch_4
        0x1c976 -> :sswitch_3
        0x33249f -> :sswitch_2
        0x8ab4d72 -> :sswitch_1
        0x5553f3ec -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Landroid/content/pm/PackageInfo;)Landroid/content/pm/PackageInfo;
    .locals 8

    .line 650
    new-instance v0, Landroid/content/pm/PackageInfo;

    invoke-direct {v0}, Landroid/content/pm/PackageInfo;-><init>()V

    .line 651
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 652
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/content/pm/ApplicationInfo;

    iget-object v3, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-direct {v1, v3}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V

    :goto_0
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 653
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    invoke-static {v1}, Ll/ۛۢᩳ;->֫([Landroid/content/pm/ActivityInfo;)[Landroid/content/pm/ActivityInfo;

    move-result-object v1

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    .line 654
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    invoke-static {v1}, Ll/ۛۢᩳ;->֫([Landroid/content/pm/ActivityInfo;)[Landroid/content/pm/ActivityInfo;

    move-result-object v1

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    .line 655
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    const/4 v3, 0x0

    if-nez v1, :cond_1

    move-object v4, v2

    goto :goto_3

    .line 750
    :cond_1
    array-length v4, v1

    new-array v4, v4, [Landroid/content/pm/ServiceInfo;

    const/4 v5, 0x0

    .line 751
    :goto_1
    array-length v6, v1

    if-ge v5, v6, :cond_3

    .line 752
    aget-object v6, v1, v5

    if-nez v6, :cond_2

    move-object v6, v2

    goto :goto_2

    :cond_2
    new-instance v6, Landroid/content/pm/ServiceInfo;

    aget-object v7, v1, v5

    invoke-direct {v6, v7}, Landroid/content/pm/ServiceInfo;-><init>(Landroid/content/pm/ServiceInfo;)V

    :goto_2
    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 655
    :cond_3
    :goto_3
    iput-object v4, v0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 656
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    if-nez v1, :cond_4

    move-object v4, v2

    goto :goto_6

    .line 764
    :cond_4
    array-length v4, v1

    new-array v4, v4, [Landroid/content/pm/ProviderInfo;

    const/4 v5, 0x0

    .line 765
    :goto_4
    array-length v6, v1

    if-ge v5, v6, :cond_6

    .line 766
    aget-object v6, v1, v5

    if-nez v6, :cond_5

    move-object v6, v2

    goto :goto_5

    :cond_5
    new-instance v6, Landroid/content/pm/ProviderInfo;

    aget-object v7, v1, v5

    invoke-direct {v6, v7}, Landroid/content/pm/ProviderInfo;-><init>(Landroid/content/pm/ProviderInfo;)V

    :goto_5
    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 656
    :cond_6
    :goto_6
    iput-object v4, v0, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    .line 657
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    if-nez v1, :cond_7

    move-object v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, [Landroid/content/pm/PermissionInfo;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/content/pm/PermissionInfo;

    :goto_7
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    .line 658
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-nez v1, :cond_8

    move-object v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    :goto_8
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 659
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    if-nez v1, :cond_9

    move-object v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    :goto_9
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    .line 660
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->gids:[I

    if-nez v1, :cond_a

    move-object v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    :goto_a
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->gids:[I

    .line 661
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-nez v1, :cond_b

    move-object v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, [Landroid/content/pm/Signature;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/content/pm/Signature;

    :goto_b
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 662
    iget-wide v4, p0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iput-wide v4, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 663
    iget-wide v4, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    iput-wide v4, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 664
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    .line 665
    iget v1, p0, Landroid/content/pm/PackageInfo;->sharedUserLabel:I

    iput v1, v0, Landroid/content/pm/PackageInfo;->sharedUserLabel:I

    .line 666
    iget v1, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 667
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 677
    const-class v1, Landroid/content/pm/PackageInfo;

    const-string v4, "signingInfo"

    .line 712
    :try_start_0
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 713
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    const-string v4, "baseRevisionCode"

    .line 723
    :try_start_1
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 724
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v5

    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :try_start_2
    const-string v4, "getLongVersionCode"

    .line 688
    invoke-virtual {v1, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_c

    .line 690
    :catchall_2
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    int-to-long v4, p0

    :goto_c
    :try_start_3
    const-string p0, "setLongVersionCode"

    const/4 v2, 0x1

    new-array v6, v2, [Ljava/lang/Class;

    .line 700
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v7, v6, v3

    invoke-virtual {v1, p0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    invoke-virtual {p0, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_d

    :catchall_3
    long-to-int p0, v4

    .line 702
    iput p0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    :goto_d
    return-object v0
.end method

.method public static ֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .line 1435
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    .line 1436
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v1

    .line 1437
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 1438
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    .line 1439
    invoke-virtual {v0, v1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    :cond_0
    return-object v0

    :catch_0
    nop

    :cond_1
    if-nez p1, :cond_2

    const-string p1, ""

    goto :goto_0

    .line 1444
    :cond_2
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    .line 1445
    :goto_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/SecurityException;
    .locals 2

    .line 1408
    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "Decryptor context denied: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ljava/io/File;)V
    .locals 1

    .line 1423
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1425
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ljava/lang/Runnable;)V
    .locals 1

    .line 66
    sget-object v0, Ll/ۛۢᩳ;->ܳ֫:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static ֫([Landroid/content/pm/ActivityInfo;)[Landroid/content/pm/ActivityInfo;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 736
    :cond_0
    array-length v1, p0

    new-array v1, v1, [Landroid/content/pm/ActivityInfo;

    const/4 v2, 0x0

    .line 737
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_2

    .line 738
    aget-object v3, p0, v2

    if-nez v3, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    new-instance v3, Landroid/content/pm/ActivityInfo;

    aget-object v4, p0, v2

    invoke-direct {v3, v4}, Landroid/content/pm/ActivityInfo;-><init>(Landroid/content/pm/ActivityInfo;)V

    :goto_1
    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method


# virtual methods
.method public final bindIsolatedService(Landroid/content/Intent;ILjava/lang/String;Ljava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z
    .locals 0

    const-string p1, "bindIsolatedService"

    .line 946
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final bindService(Landroid/content/Intent;ILjava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z
    .locals 0

    const-string p1, "bindService"

    .line 934
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final bindService(Landroid/content/Intent;Landroid/content/Context$BindServiceFlags;Ljava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z
    .locals 0

    const-string p1, "bindService"

    .line 940
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    .locals 0

    const-string p1, "bindService"

    .line 923
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;Landroid/content/Context$BindServiceFlags;)Z
    .locals 0

    const-string p1, "bindService"

    .line 929
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public bindServiceAsUser(Landroid/content/Intent;Landroid/content/ServiceConnection;ILandroid/os/Handler;Landroid/os/UserHandle;)Z
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "bindServiceAsUser"

    .line 1233
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public bindServiceAsUser(Landroid/content/Intent;Landroid/content/ServiceConnection;ILandroid/os/UserHandle;)Z
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "bindServiceAsUser"

    .line 1228
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public bindServiceAsUser(Landroid/content/Intent;Landroid/content/ServiceConnection;Landroid/content/Context$BindServiceFlags;Landroid/os/Handler;Landroid/os/UserHandle;)Z
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "bindServiceAsUser"

    .line 1243
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public bindServiceAsUser(Landroid/content/Intent;Landroid/content/ServiceConnection;Landroid/content/Context$BindServiceFlags;Landroid/os/UserHandle;)Z
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "bindServiceAsUser"

    .line 1238
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public canLoadUnsafeResources()Z
    .locals 1
    .annotation build Ll/ۙᩳ;
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public final checkCallingOrSelfPermission(Ljava/lang/String;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public final checkCallingOrSelfUriPermission(Landroid/net/Uri;I)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public final checkCallingOrSelfUriPermissions(Ljava/util/List;I)[I
    .locals 0

    .line 1402
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [I

    const/4 p2, -0x1

    .line 1403
    invoke-static {p1, p2}, Ljava/util/Arrays;->fill([II)V

    return-object p1
.end method

.method public final checkCallingPermission(Ljava/lang/String;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public final checkCallingUriPermission(Landroid/net/Uri;I)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public final checkCallingUriPermissions(Ljava/util/List;I)[I
    .locals 0

    .line 1402
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [I

    const/4 p2, -0x1

    .line 1403
    invoke-static {p1, p2}, Ljava/util/Arrays;->fill([II)V

    return-object p1
.end method

.method public final checkContentUriPermissionFull(Landroid/net/Uri;III)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public final checkPermission(Ljava/lang/String;II)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public checkPermission(Ljava/lang/String;IILandroid/os/IBinder;)I
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const/4 p1, -0x1

    return p1
.end method

.method public final checkSelfPermission(Ljava/lang/String;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public final checkUriPermission(Landroid/net/Uri;III)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public checkUriPermission(Landroid/net/Uri;IIILandroid/os/IBinder;)I
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const/4 p1, -0x1

    return p1
.end method

.method public final checkUriPermission(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;III)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public final checkUriPermissions(Ljava/util/List;III)[I
    .locals 0

    .line 1402
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [I

    const/4 p2, -0x1

    .line 1403
    invoke-static {p1, p2}, Ljava/util/Arrays;->fill([II)V

    return-object p1
.end method

.method public final clearWallpaper()V
    .locals 0

    return-void
.end method

.method public createApplicationContext(Landroid/content/pm/ApplicationInfo;I)Landroid/content/Context;
    .locals 1
    .annotation build Ll/ۙᩳ;
    .end annotation

    if-eqz p1, :cond_0

    .line 382
    iget-object p2, p0, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 1338
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-object p0

    .line 1341
    :cond_0
    new-instance p2, Landroid/content/pm/PackageManager$NameNotFoundException;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    :goto_0
    invoke-direct {p2, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final createAttributionContext(Ljava/lang/String;)Landroid/content/Context;
    .locals 0

    return-object p0
.end method

.method public final createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;
    .locals 0

    return-object p0
.end method

.method public final createContext(Landroid/content/ContextParams;)Landroid/content/Context;
    .locals 0

    return-object p0
.end method

.method public final createContextForSplit(Ljava/lang/String;)Landroid/content/Context;
    .locals 0

    .line 1103
    new-instance p1, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-direct {p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V

    throw p1
.end method

.method public createCredentialProtectedStorageContext()Landroid/content/Context;
    .locals 10
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 1352
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 1355
    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->᩻:Ll/ۛۢᩳ;

    if-nez v0, :cond_1

    .line 1357
    :try_start_0
    new-instance v0, Ll/ۛۢᩳ;

    iget-object v2, p0, Ll/ۛۢᩳ;->ۖ:Ll/ۤۢᩳ;

    iget-object v3, p0, Ll/ۛۢᩳ;->֫:Ljava/io/File;

    iget-object v4, p0, Ll/ۛۢᩳ;->֨:Landroid/content/pm/Signature;

    iget-object v5, p0, Ll/ۛۢᩳ;->ܿ:Ll/ۨۢᩳ;

    iget-object v6, p0, Ll/ۛۢᩳ;->ۘ:Ljava/io/File;

    iget-object v7, p0, Ll/ۛۢᩳ;->֡:Ljava/io/File;

    iget-object v8, p0, Ll/ۛۢᩳ;->۟:Ljava/lang/String;

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Ll/ۛۢᩳ;-><init>(Ll/ۤۢᩳ;Ljava/io/File;Landroid/content/pm/Signature;Ll/ۨۢᩳ;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Z)V

    iput-object v0, p0, Ll/ۛۢᩳ;->᩻:Ll/ۛۢᩳ;

    .line 1367
    iput-object p0, v0, Ll/ۛۢᩳ;->ۢ:Ll/ۛۢᩳ;

    .line 1368
    iget-object v1, p0, Ll/ۛۢᩳ;->ܽ:Landroid/content/Context;

    if-eqz v1, :cond_1

    .line 1369
    iput-object v1, v0, Ll/ۛۢᩳ;->ܽ:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :goto_0
    return-object p0

    .line 1375
    :cond_1
    :goto_1
    iget-object v0, p0, Ll/ۛۢᩳ;->᩻:Ll/ۛۢᩳ;

    return-object v0
.end method

.method public final createDeviceContext(I)Landroid/content/Context;
    .locals 0

    return-object p0
.end method

.method public final createDeviceProtectedStorageContext()Landroid/content/Context;
    .locals 10

    .line 1153
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1156
    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->ۢ:Ll/ۛۢᩳ;

    if-nez v0, :cond_1

    .line 1158
    :try_start_0
    new-instance v0, Ll/ۛۢᩳ;

    iget-object v2, p0, Ll/ۛۢᩳ;->ۖ:Ll/ۤۢᩳ;

    iget-object v3, p0, Ll/ۛۢᩳ;->֫:Ljava/io/File;

    iget-object v4, p0, Ll/ۛۢᩳ;->֨:Landroid/content/pm/Signature;

    iget-object v5, p0, Ll/ۛۢᩳ;->ܿ:Ll/ۨۢᩳ;

    iget-object v6, p0, Ll/ۛۢᩳ;->ۘ:Ljava/io/File;

    iget-object v7, p0, Ll/ۛۢᩳ;->֡:Ljava/io/File;

    iget-object v8, p0, Ll/ۛۢᩳ;->۟:Ljava/lang/String;

    const/4 v9, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Ll/ۛۢᩳ;-><init>(Ll/ۤۢᩳ;Ljava/io/File;Landroid/content/pm/Signature;Ll/ۨۢᩳ;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Z)V

    iput-object v0, p0, Ll/ۛۢᩳ;->ۢ:Ll/ۛۢᩳ;

    .line 1168
    iput-object p0, v0, Ll/ۛۢᩳ;->᩻:Ll/ۛۢᩳ;

    .line 1169
    iget-object v1, p0, Ll/ۛۢᩳ;->ܽ:Landroid/content/Context;

    if-eqz v1, :cond_1

    .line 1170
    iput-object v1, v0, Ll/ۛۢᩳ;->ܽ:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :goto_0
    return-object p0

    .line 1176
    :cond_1
    :goto_1
    iget-object v0, p0, Ll/ۛۢᩳ;->ۢ:Ll/ۛۢᩳ;

    return-object v0
.end method

.method public final createDisplayContext(Landroid/view/Display;)Landroid/content/Context;
    .locals 0

    return-object p0
.end method

.method public final createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
    .locals 0

    .line 382
    iget-object p2, p0, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 1095
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-object p0

    .line 1098
    :cond_0
    new-instance p2, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-direct {p2, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public createPackageContextAsUser(Ljava/lang/String;ILandroid/os/UserHandle;)Landroid/content/Context;
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 1346
    invoke-virtual {p0, p1, p2}, Ll/ۛۢᩳ;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    return-object p0
.end method

.method public final createWindowContext(ILandroid/os/Bundle;)Landroid/content/Context;
    .locals 0

    return-object p0
.end method

.method public final createWindowContext(Landroid/view/Display;ILandroid/os/Bundle;)Landroid/content/Context;
    .locals 0

    return-object p0
.end method

.method public final databaseList()[Ljava/lang/String;
    .locals 1

    .line 550
    iget-object v0, p0, Ll/ۛۢᩳ;->᩷:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final deleteDatabase(Ljava/lang/String;)Z
    .locals 4

    .line 559
    iget-object v0, p0, Ll/ۛۢᩳ;->᩷:Ljava/io/File;

    invoke-static {v0}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 560
    invoke-static {v0, p1}, Ll/ۛۢᩳ;->֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 535
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    .line 536
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-journal"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    or-int/2addr v0, v1

    .line 537
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-wal"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    or-int/2addr v0, v1

    .line 538
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-shm"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public final deleteFile(Ljava/lang/String;)Z
    .locals 1

    .line 432
    iget-object v0, p0, Ll/ۛۢᩳ;->ܺ:Ljava/io/File;

    invoke-static {v0, p1}, Ll/ۛۢᩳ;->֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p1

    return p1
.end method

.method public final deleteSharedPreferences(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 1415
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string p1, "default"

    .line 412
    :cond_1
    iget-object v0, p0, Ll/ۛۢᩳ;->ۚ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final enforceCallingOrSelfPermission(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p1, "enforceCallingOrSelfPermission"

    .line 1010
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final enforceCallingOrSelfUriPermission(Landroid/net/Uri;ILjava/lang/String;)V
    .locals 0

    const-string p1, "enforceCallingOrSelfUriPermission"

    .line 1085
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final enforceCallingPermission(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p1, "enforceCallingPermission"

    .line 1005
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final enforceCallingUriPermission(Landroid/net/Uri;ILjava/lang/String;)V
    .locals 0

    const-string p1, "enforceCallingUriPermission"

    .line 1080
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final enforcePermission(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    const-string p1, "enforcePermission"

    .line 1000
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final enforceUriPermission(Landroid/net/Uri;IIILjava/lang/String;)V
    .locals 0

    const-string p1, "enforceUriPermission"

    .line 1075
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final enforceUriPermission(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V
    .locals 0

    const-string p1, "enforceUriPermission"

    .line 1090
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final fileList()[Ljava/lang/String;
    .locals 1

    .line 504
    iget-object v0, p0, Ll/ۛۢᩳ;->ܺ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final getApplicationContext()Landroid/content/Context;
    .locals 1

    .line 339
    iget-object v0, p0, Ll/ۛۢᩳ;->ܽ:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    .locals 1

    .line 387
    iget-object v0, p0, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    return-object v0
.end method

.method public final getAssets()Landroid/content/res/AssetManager;
    .locals 1

    .line 298
    iget-object v0, p0, Ll/ۛۢᩳ;->ᩳ:Landroid/content/res/AssetManager;

    return-object v0
.end method

.method public final getAttributionSource()Landroid/content/AttributionSource;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getAttributionTag()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBaseContext()Landroid/content/Context;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBasePackageName()Ljava/lang/String;
    .locals 1
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 382
    iget-object v0, p0, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCacheDir()Ljava/io/File;
    .locals 1

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    .line 478
    iget-object v0, p0, Ll/ۛۢᩳ;->ۗ:Ljava/io/File;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->ܶ:Ljava/io/File;

    return-object v0
.end method

.method public final getClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 377
    iget-object v0, p0, Ll/ۛۢᩳ;->ܿ:Ll/ۨۢᩳ;

    return-object v0
.end method

.method public final getCodeCacheDir()Ljava/io/File;
    .locals 1

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    .line 483
    iget-object v0, p0, Ll/ۛۢᩳ;->۬:Ljava/io/File;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->᩸:Ljava/io/File;

    return-object v0
.end method

.method public final getContentResolver()Landroid/content/ContentResolver;
    .locals 1

    .line 313
    iget-object v0, p0, Ll/ۛۢᩳ;->ܳ:Landroid/content/ContentResolver;

    return-object v0
.end method

.method public final getDataDir()Ljava/io/File;
    .locals 1

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    .line 442
    iget-object v0, p0, Ll/ۛۢᩳ;->᩺:Ljava/io/File;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->᩶:Ljava/io/File;

    return-object v0
.end method

.method public final getDatabasePath(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 544
    iget-object v0, p0, Ll/ۛۢᩳ;->᩷:Ljava/io/File;

    invoke-static {v0}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛۢᩳ;->۫:Ljava/io/File;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->ۙ:Ljava/io/File;

    .line 545
    :goto_0
    invoke-static {v0, p1}, Ll/ۛۢᩳ;->֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public final getDir(Ljava/lang/String;I)Ljava/io/File;
    .locals 0

    const-string p2, "app_"

    .line 0
    invoke-static {p2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 511
    iget-object p2, p0, Ll/ۛۢᩳ;->ۜ:Ljava/io/File;

    invoke-static {p2, p1}, Ll/ۛۢᩳ;->֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    .line 512
    invoke-static {p2}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 629
    iget-boolean p2, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Ll/ۛۢᩳ;->᩺:Ljava/io/File;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ll/ۛۢᩳ;->᩶:Ljava/io/File;

    .line 513
    :goto_0
    invoke-static {p2, p1}, Ll/ۛۢᩳ;->֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public getDisplay()Landroid/view/Display;
    .locals 1
    .annotation build Ll/ۙᩳ;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getExternalCacheDir()Ljava/io/File;
    .locals 1

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    .line 489
    iget-object v0, p0, Ll/ۛۢᩳ;->ۗ:Ljava/io/File;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->ܶ:Ljava/io/File;

    return-object v0
.end method

.method public final getExternalCacheDirs()[Ljava/io/File;
    .locals 3

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛۢᩳ;->ۗ:Ljava/io/File;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->ܶ:Ljava/io/File;

    :goto_0
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/io/File;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;
    .locals 0

    .line 629
    iget-boolean p1, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz p1, :cond_0

    .line 458
    iget-object p1, p0, Ll/ۛۢᩳ;->ۤ:Ljava/io/File;

    return-object p1

    :cond_0
    iget-object p1, p0, Ll/ۛۢᩳ;->ܰ:Ljava/io/File;

    return-object p1
.end method

.method public final getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;
    .locals 2

    .line 629
    iget-boolean p1, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۛۢᩳ;->ۤ:Ljava/io/File;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/ۛۢᩳ;->ܰ:Ljava/io/File;

    :goto_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/io/File;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-object v0
.end method

.method public final getExternalMediaDirs()[Ljava/io/File;
    .locals 3

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛۢᩳ;->ۤ:Ljava/io/File;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->ܰ:Ljava/io/File;

    :goto_0
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/io/File;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛۢᩳ;->ۤ:Ljava/io/File;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->ܰ:Ljava/io/File;

    .line 437
    :goto_0
    invoke-static {v0, p1}, Ll/ۛۢᩳ;->֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public final getFilesDir()Ljava/io/File;
    .locals 1

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    .line 447
    iget-object v0, p0, Ll/ۛۢᩳ;->ۤ:Ljava/io/File;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->ܰ:Ljava/io/File;

    return-object v0
.end method

.method public final getMainExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    .line 324
    sget-object v0, Ll/ۛۢᩳ;->ܿ֫:Ll/۫ۢᩳ;

    return-object v0
.end method

.method public final getMainLooper()Landroid/os/Looper;
    .locals 1

    .line 318
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public final getNoBackupFilesDir()Ljava/io/File;
    .locals 1

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    .line 452
    iget-object v0, p0, Ll/ۛۢᩳ;->ۛ:Ljava/io/File;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->֫֫:Ljava/io/File;

    return-object v0
.end method

.method public final getObbDir()Ljava/io/File;
    .locals 1

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    .line 468
    iget-object v0, p0, Ll/ۛۢᩳ;->ۨ:Ljava/io/File;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->ۧ֫:Ljava/io/File;

    return-object v0
.end method

.method public final getObbDirs()[Ljava/io/File;
    .locals 3

    .line 629
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛۢᩳ;->ۨ:Ljava/io/File;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->ۧ֫:Ljava/io/File;

    :goto_0
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/io/File;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public getOpPackageName()Ljava/lang/String;
    .locals 1
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 382
    iget-object v0, p0, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPackageCodePath()Ljava/lang/String;
    .locals 1

    .line 397
    iget-object v0, p0, Ll/ۛۢᩳ;->۠:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getPackageManager()Landroid/content/pm/PackageManager;
    .locals 1

    .line 308
    iget-object v0, p0, Ll/ۛۢᩳ;->ᩴ:Ll/ܰۢᩳ;

    return-object v0
.end method

.method public final getPackageName()Ljava/lang/String;
    .locals 1

    .line 382
    iget-object v0, p0, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPackageResourcePath()Ljava/lang/String;
    .locals 1

    .line 392
    iget-object v0, p0, Ll/ۛۢᩳ;->۠:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPreloadsFileCache()Ljava/io/File;
    .locals 1
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 1202
    invoke-virtual {p0}, Ll/ۛۢᩳ;->getCacheDir()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 303
    iget-object v0, p0, Ll/ۛۢᩳ;->᩵:Landroid/content/res/Resources;

    return-object v0
.end method

.method public final getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    .locals 1

    if-eqz p1, :cond_0

    .line 1415
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    :cond_0
    const-string p1, "default"

    .line 402
    :cond_1
    new-instance p2, Ll/ۧ᩵᩷;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Ll/ۧ᩵᩷;-><init>(I)V

    iget-object v0, p0, Ll/ۛۢᩳ;->ۚ:Ll/ۧۤᩴ;

    invoke-static {v0, p1, p2}, Ll/ᩳۤᩴ;->computeIfAbsent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/SharedPreferences;

    return-object p1
.end method

.method public final getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "window"

    .line 965
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 966
    iget-object p1, p0, Ll/ۛۢᩳ;->ܽ֫:Ll/۟ۢᩳ;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getSystemServiceName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1

    .line 975
    const-class v0, Landroid/view/WindowManager;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "window"

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getTheme()Landroid/content/res/Resources$Theme;
    .locals 1

    .line 372
    iget-object v0, p0, Ll/ۛۢᩳ;->᩵:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    return-object v0
.end method

.method public final grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V
    .locals 0

    const-string p1, "grantUriPermission"

    .line 1015
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public isCredentialProtectedStorage()Z
    .locals 1
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 1390
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isDeviceProtectedStorage()Z
    .locals 1

    .line 1182
    iget-boolean v0, p0, Ll/ۛۢᩳ;->ۡ:Z

    return v0
.end method

.method public final isRestricted()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final moveDatabaseFrom(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final moveSharedPreferencesFrom(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 2

    .line 417
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Ll/ۛۢᩳ;->ܺ:Ljava/io/File;

    invoke-static {v1, p1}, Ll/ۛۢᩳ;->֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public final openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    .locals 2

    .line 422
    iget-object v0, p0, Ll/ۛۢᩳ;->ܺ:Ljava/io/File;

    invoke-static {v0, p1}, Ll/ۛۢᩳ;->֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 423
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 425
    invoke-static {v0}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 427
    :cond_0
    new-instance v0, Ljava/io/FileOutputStream;

    const v1, 0x8000

    and-int/2addr p2, v1

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-direct {v0, p1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public final openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    .line 559
    iget-object p2, p0, Ll/ۛۢᩳ;->᩷:Ljava/io/File;

    invoke-static {p2}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 560
    invoke-static {p2, p1}, Ll/ۛۢᩳ;->֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 518
    invoke-static {p1, p3}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    return-object p1
.end method

.method public final openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;Landroid/database/DatabaseErrorHandler;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    .line 559
    iget-object p2, p0, Ll/ۛۢᩳ;->᩷:Ljava/io/File;

    invoke-static {p2}, Ll/ۛۢᩳ;->֫(Ljava/io/File;)V

    .line 560
    invoke-static {p2, p1}, Ll/ۛۢᩳ;->֫(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 523
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Landroid/database/DatabaseErrorHandler;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    return-object p1
.end method

.method public final registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    .locals 0

    const-string p1, "registerReceiver"

    .line 879
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;
    .locals 0

    const-string p1, "registerReceiver"

    .line 885
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    .locals 0

    const-string p1, "registerReceiver"

    .line 891
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;
    .locals 0

    const-string p1, "registerReceiver"

    .line 897
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public registerReceiverAsUser(Landroid/content/BroadcastReceiver;Landroid/os/UserHandle;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "registerReceiverAsUser"

    .line 1308
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public reloadSharedPreferences()Ljava/lang/String;
    .locals 1
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 382
    iget-object v0, p0, Ll/ۛۢᩳ;->ۧ:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public final removeStickyBroadcast(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public final removeStickyBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;)V
    .locals 0

    return-void
.end method

.method public final revokeSelfPermissionsOnKill(Ljava/util/Collection;)V
    .locals 0

    const-string p1, "revokeSelfPermissionsOnKill"

    .line 1030
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final revokeUriPermission(Landroid/net/Uri;I)V
    .locals 0

    const-string p1, "revokeUriPermission"

    .line 1020
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final revokeUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V
    .locals 0

    const-string p1, "revokeUriPermission"

    .line 1025
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendBroadcast(Landroid/content/Intent;)V
    .locals 0

    const-string p1, "sendBroadcast"

    .line 815
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V
    .locals 0

    const-string p1, "sendBroadcast"

    .line 820
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendBroadcast(Landroid/content/Intent;Ljava/lang/String;I)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendBroadcast"

    .line 1263
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendBroadcast(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendBroadcast"

    .line 1258
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;)V
    .locals 0

    const-string p1, "sendBroadcastAsUser"

    .line 835
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;Ljava/lang/String;)V
    .locals 0

    const-string p1, "sendBroadcastAsUser"

    .line 840
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;Ljava/lang/String;I)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendBroadcastAsUser"

    .line 1285
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendBroadcastAsUser"

    .line 1280
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendBroadcastAsUserMultiplePermissions(Landroid/content/Intent;Landroid/os/UserHandle;[Ljava/lang/String;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendBroadcastAsUserMultiplePermissions"

    .line 1253
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendBroadcastMultiplePermissions(Landroid/content/Intent;[Ljava/lang/String;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendBroadcastMultiplePermissions"

    .line 1248
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V
    .locals 0

    const-string p1, "sendOrderedBroadcast"

    .line 825
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;ILandroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendOrderedBroadcast"

    .line 1275
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    const-string p1, "sendOrderedBroadcast"

    .line 830
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendOrderedBroadcast"

    .line 1270
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendOrderedBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;Ljava/lang/String;ILandroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendOrderedBroadcastAsUser"

    .line 1291
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendOrderedBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;Ljava/lang/String;ILandroid/os/Bundle;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendOrderedBroadcastAsUser"

    .line 1298
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendOrderedBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;Ljava/lang/String;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    const-string p1, "sendOrderedBroadcastAsUser"

    .line 845
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendStickyBroadcast(Landroid/content/Intent;)V
    .locals 0

    const-string p1, "sendStickyBroadcast"

    .line 850
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendStickyBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;)V
    .locals 0

    const-string p1, "sendStickyBroadcastAsUser"

    .line 864
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public sendStickyBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;Landroid/os/Bundle;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "sendStickyBroadcastAsUser"

    .line 1303
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendStickyOrderedBroadcast(Landroid/content/Intent;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    const-string p1, "sendStickyOrderedBroadcast"

    .line 855
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final sendStickyOrderedBroadcastAsUser(Landroid/content/Intent;Landroid/os/UserHandle;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    const-string p1, "sendStickyOrderedBroadcastAsUser"

    .line 869
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final setTheme(I)V
    .locals 0

    return-void
.end method

.method public final setWallpaper(Landroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method public final setWallpaper(Ljava/io/InputStream;)V
    .locals 0

    return-void
.end method

.method public final startActivities([Landroid/content/Intent;)V
    .locals 0

    const-string p1, "startActivities"

    .line 795
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 0

    const-string p1, "startActivities"

    .line 800
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public startActivitiesAsUser([Landroid/content/Intent;Landroid/os/Bundle;Landroid/os/UserHandle;)I
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "startActivitiesAsUser"

    .line 1223
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final startActivity(Landroid/content/Intent;)V
    .locals 0

    const-string p1, "startActivity"

    .line 785
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 0

    const-string p1, "startActivity"

    .line 790
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public startActivityAsUser(Landroid/content/Intent;Landroid/os/Bundle;Landroid/os/UserHandle;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "startActivityAsUser"

    .line 1213
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public startActivityAsUser(Landroid/content/Intent;Landroid/os/UserHandle;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "startActivityAsUser"

    .line 1207
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public startActivityForResult(Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "startActivityForResult"

    .line 1218
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 0

    const-string p1, "startForegroundService"

    .line 913
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public startForegroundServiceAsUser(Landroid/content/Intent;Landroid/os/UserHandle;)Landroid/content/ComponentName;
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "startForegroundServiceAsUser"

    .line 1313
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final startInstrumentation(Landroid/content/ComponentName;Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 0

    const-string p1, "startInstrumentation"

    .line 960
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final startIntentSender(Landroid/content/IntentSender;Landroid/content/Intent;III)V
    .locals 0

    const-string p1, "startIntentSender"

    .line 805
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final startIntentSender(Landroid/content/IntentSender;Landroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 0

    const-string p1, "startIntentSender"

    .line 810
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 0

    const-string p1, "startService"

    .line 907
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public startServiceAsUser(Landroid/content/Intent;Landroid/os/UserHandle;)Landroid/content/ComponentName;
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const-string p1, "startServiceAsUser"

    .line 1318
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final stopService(Landroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public stopServiceAsUser(Landroid/content/Intent;Landroid/os/UserHandle;)Z
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public final unbindService(Landroid/content/ServiceConnection;)V
    .locals 0

    return-void
.end method

.method public final unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    .locals 0

    return-void
.end method

.method public updateDisplay(I)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    return-void
.end method

.method public final updateServiceGroup(Landroid/content/ServiceConnection;II)V
    .locals 0

    const-string p1, "updateServiceGroup"

    .line 951
    invoke-static {p1}, Ll/ۛۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final ֫()Ljava/io/File;
    .locals 1

    .line 354
    iget-object v0, p0, Ll/ۛۢᩳ;->᩹:Ljava/io/File;

    return-object v0
.end method

.method public final ֫(Landroid/content/Context;)V
    .locals 1

    .line 328
    iput-object p1, p0, Ll/ۛۢᩳ;->ܽ:Landroid/content/Context;

    .line 329
    iget-object v0, p0, Ll/ۛۢᩳ;->ۢ:Ll/ۛۢᩳ;

    if-eqz v0, :cond_0

    .line 330
    iput-object p1, v0, Ll/ۛۢᩳ;->ܽ:Landroid/content/Context;

    .line 332
    :cond_0
    iget-object v0, p0, Ll/ۛۢᩳ;->᩻:Ll/ۛۢᩳ;

    if-eqz v0, :cond_1

    .line 333
    iput-object p1, v0, Ll/ۛۢᩳ;->ܽ:Landroid/content/Context;

    :cond_1
    return-void
.end method

.method public final ۧ()Ljava/io/File;
    .locals 1

    .line 362
    iget-object v0, p0, Ll/ۛۢᩳ;->᩺:Ljava/io/File;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 293
    iget-object v0, p0, Ll/ۛۢᩳ;->۟:Ljava/lang/String;

    return-object v0
.end method
