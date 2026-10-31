.class public Ll/᩹ۙ;
.super Landroid/content/ContentProvider;
.source "3650"


# static fields
.field public static final ۗ:Ljava/io/File;

.field public static final ۙ:[Ljava/lang/String;

.field public static final ۬:Ljava/util/HashMap;


# instance fields
.field public final ᩶:Ljava/lang/Object;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ll/ܶۙ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "_display_name"

    const-string v1, "_size"

    .line 358
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩹ۙ;->ۙ:[Ljava/lang/String;

    .line 377
    new-instance v0, Ljava/io/File;

    const-string v1, "/"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/᩹ۙ;->ۗ:Ljava/io/File;

    .line 380
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/᩹ۙ;->۬:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 399
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    .line 382
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩹ۙ;->᩶:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 983
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v1

    const/16 v2, 0x2f

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-static {v0, v1, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method private ֫()Ll/ܶۙ;
    .locals 3

    .line 666
    iget-object v0, p0, Ll/᩹ۙ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 667
    :try_start_0
    iget-object v1, p0, Ll/᩹ۙ;->᩸:Ljava/lang/String;

    const-string v2, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?"

    if-eqz v1, :cond_1

    .line 670
    iget-object v1, p0, Ll/᩹ۙ;->᩹:Ll/ܶۙ;

    if-nez v1, :cond_0

    .line 671
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Ll/᩹ۙ;->᩸:Ljava/lang/String;

    invoke-static {v1, v2}, Ll/᩹ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)Ll/ܶۙ;

    move-result-object v1

    iput-object v1, p0, Ll/᩹ۙ;->᩹:Ll/ܶۙ;

    .line 673
    :cond_0
    iget-object v1, p0, Ll/᩹ۙ;->᩹:Ll/ܶۙ;

    monitor-exit v0

    return-object v1

    .line 147
    :cond_1
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 674
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;)Ll/ܶۙ;
    .locals 3

    .line 683
    sget-object v1, Ll/᩹ۙ;->۬:Ljava/util/HashMap;

    move-object v0, v1

    monitor-enter v0

    .line 684
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶۙ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    .line 687
    :try_start_1
    invoke-static {p0, p1}, Ll/᩹ۙ;->ۧ(Landroid/content/Context;Ljava/lang/String;)Ll/᩸ۙ;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 695
    :try_start_2
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception p0

    .line 692
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"

    invoke-direct {p1, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 689
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"

    invoke-direct {p1, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 697
    :cond_0
    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static ۧ(Landroid/content/Context;Ljava/lang/String;)Ll/᩸ۙ;
    .locals 7

    .line 733
    new-instance v0, Ll/᩸ۙ;

    invoke-direct {v0}, Ll/᩸ۙ;-><init>()V

    .line 735
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v2, 0x80

    .line 736
    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 716
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v2, "android.support.FILE_PROVIDER_PATHS"

    .line 715
    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageItemInfo;->loadXmlMetaData(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 741
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_9

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 743
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "name"

    const/4 v3, 0x0

    .line 745
    invoke-interface {p1, v3, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "path"

    .line 746
    invoke-interface {p1, v3, v4}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "root-path"

    .line 749
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    .line 750
    sget-object v3, Ll/᩹ۙ;->ۗ:Ljava/io/File;

    goto :goto_1

    :cond_1
    const-string v5, "files-path"

    .line 751
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 752
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    goto :goto_1

    :cond_2
    const-string v5, "cache-path"

    .line 753
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 754
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v3

    goto :goto_1

    :cond_3
    const-string v5, "external-path"

    .line 755
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 756
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    goto :goto_1

    :cond_4
    const-string v5, "external-files-path"

    .line 757
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 417
    invoke-virtual {p0, v3}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    move-result-object v1

    .line 759
    array-length v5, v1

    if-lez v5, :cond_7

    .line 760
    aget-object v3, v1, v6

    goto :goto_1

    :cond_5
    const-string v5, "external-cache-path"

    .line 762
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 466
    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDirs()[Ljava/io/File;

    move-result-object v1

    .line 764
    array-length v5, v1

    if-lez v5, :cond_7

    .line 765
    aget-object v3, v1, v6

    goto :goto_1

    :cond_6
    const-string v5, "external-media-path"

    .line 768
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 769
    invoke-static {p0}, Ll/۠ۙ;->֫(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v1

    .line 770
    array-length v5, v1

    if-lez v5, :cond_7

    .line 771
    aget-object v3, v1, v6

    :cond_7
    :goto_1
    if-eqz v3, :cond_0

    .line 776
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v1

    .line 961
    aget-object v1, v1, v6

    if-eqz v1, :cond_8

    .line 963
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v3, v4

    .line 776
    :cond_8
    invoke-virtual {v0, v3, v2}, Ll/᩸ۙ;->֫(Ljava/io/File;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_9
    return-object v0

    .line 718
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Missing android.support.FILE_PROVIDER_PATHS meta-data"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 706
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Couldn\'t find meta-data for provider with authority "

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 706
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 1

    .line 423
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    .line 426
    iget-boolean p1, p2, Landroid/content/pm/ProviderInfo;->exported:Z

    if-nez p1, :cond_1

    .line 431
    iget-boolean p1, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z

    if-eqz p1, :cond_0

    .line 435
    iget-object p1, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    const-string p2, ";"

    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    aget-object p1, p1, p2

    .line 436
    iget-object p2, p0, Ll/᩹ۙ;->᩶:Ljava/lang/Object;

    move-object v0, p2

    monitor-enter v0

    .line 437
    :try_start_0
    iput-object p1, p0, Ll/᩹ۙ;->᩸:Ljava/lang/String;

    .line 438
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 439
    sget-object p2, Ll/᩹ۙ;->۬:Ljava/util/HashMap;

    move-object v0, p2

    monitor-enter v0

    .line 440
    :try_start_1
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 438
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 432
    :cond_0
    new-instance p1, Ljava/lang/SecurityException;

    const-string p2, "Provider must grant uri permissions"

    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 429
    :cond_1
    new-instance p1, Ljava/lang/SecurityException;

    const-string p2, "Provider must not be exported"

    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    .line 634
    invoke-direct {p0}, Ll/᩹ۙ;->֫()Ll/ܶۙ;

    move-result-object p2

    invoke-interface {p2, p1}, Ll/ܶۙ;->֫(Landroid/net/Uri;)Ljava/io/File;

    move-result-object p1

    .line 635
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p1

    return p1
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    .line 575
    invoke-direct {p0}, Ll/᩹ۙ;->֫()Ll/ܶۙ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ܶۙ;->֫(Landroid/net/Uri;)Ljava/io/File;

    move-result-object p1

    .line 577
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 579
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 580
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const-string p1, "application/octet-stream"

    return-object p1
.end method

.method public final getTypeAnonymous(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    const-string p1, "application/octet-stream"

    return-object p1
.end method

.method public final insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 0

    .line 606
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "No external inserts"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onCreate()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    .line 658
    invoke-direct {p0}, Ll/᩹ۙ;->֫()Ll/ܶۙ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ܶۙ;->֫(Landroid/net/Uri;)Ljava/io/File;

    move-result-object p1

    const-string v0, "r"

    .line 936
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 p2, 0x10000000

    goto :goto_1

    :cond_0
    const-string v0, "w"

    .line 938
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "wt"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "wa"

    .line 942
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 p2, 0x2a000000

    goto :goto_1

    :cond_2
    const-string v0, "rw"

    .line 946
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/high16 p2, 0x38000000

    goto :goto_1

    :cond_3
    const-string v0, "rwt"

    .line 949
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/high16 p2, 0x3c000000    # 0.0078125f

    goto :goto_1

    .line 954
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid mode: "

    .line 0
    invoke-static {v0, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 954
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_0
    const/high16 p2, 0x2c000000

    .line 660
    :goto_1
    invoke-static {p1, p2}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    return-object p1
.end method

.method public final query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 7

    .line 534
    invoke-direct {p0}, Ll/᩹ۙ;->֫()Ll/ܶۙ;

    move-result-object p3

    invoke-interface {p3, p1}, Ll/ܶۙ;->֫(Landroid/net/Uri;)Ljava/io/File;

    move-result-object p3

    const-string p4, "displayName"

    .line 535
    invoke-virtual {p1, p4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p2, :cond_0

    .line 538
    sget-object p2, Ll/᩹ۙ;->ۙ:[Ljava/lang/String;

    .line 541
    :cond_0
    array-length p4, p2

    new-array p4, p4, [Ljava/lang/String;

    .line 542
    array-length p5, p2

    new-array p5, p5, [Ljava/lang/Object;

    .line 544
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    aget-object v4, p2, v2

    const-string v5, "_display_name"

    .line 545
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 546
    aput-object v5, p4, v3

    add-int/lit8 v4, v3, 0x1

    if-nez p1, :cond_1

    .line 547
    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, p1

    :goto_1
    aput-object v5, p5, v3

    goto :goto_2

    :cond_2
    const-string v5, "_size"

    .line 548
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 549
    aput-object v5, p4, v3

    add-int/lit8 v4, v3, 0x1

    .line 550
    invoke-virtual {p3}, Ljava/io/File;->length()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, p5, v3

    :goto_2
    move v3, v4

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 970
    :cond_4
    new-array p1, v3, [Ljava/lang/String;

    .line 971
    invoke-static {p4, v1, p1, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 976
    new-array p2, v3, [Ljava/lang/Object;

    .line 977
    invoke-static {p5, v1, p2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 557
    new-instance p3, Landroid/database/MatrixCursor;

    const/4 p4, 0x1

    invoke-direct {p3, p1, p4}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    .line 558
    invoke-virtual {p3, p2}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    return-object p3
.end method

.method public final update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    .line 616
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "No external updates"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
