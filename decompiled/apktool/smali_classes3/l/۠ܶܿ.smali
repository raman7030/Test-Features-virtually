.class public Ll/۠ܶܿ;
.super Landroid/provider/DocumentsProvider;
.source "N9SR"


# static fields
.field public static final ۫:[Ljava/lang/String;

.field public static final ۬:[Ljava/lang/String;


# instance fields
.field public ۗ:Ljava/io/File;

.field public ۙ:Ljava/lang/String;

.field public ᩶:Ljava/io/File;

.field public ᩸:Ljava/io/File;

.field public ᩹:Ljava/io/File;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const-string v5, "summary"

    const-string v6, "document_id"

    const-string v0, "root_id"

    const-string v1, "mime_types"

    const-string v2, "flags"

    const-string v3, "icon"

    const-string v4, "title"

    .line 34
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۠ܶܿ;->۫:[Ljava/lang/String;

    const-string v6, "_size"

    const-string v7, "mt_extras"

    const-string v1, "document_id"

    const-string v2, "mime_type"

    const-string v3, "_display_name"

    const-string v4, "last_modified"

    const-string v5, "flags"

    .line 44
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۠ܶܿ;->۬:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Landroid/provider/DocumentsProvider;-><init>()V

    return-void
.end method

.method private ֫(Ljava/lang/String;Z)Ljava/io/File;
    .locals 6

    .line 93
    iget-object v0, p0, Ll/۠ܶܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v1, " not found"

    if-eqz v0, :cond_9

    .line 94
    iget-object v0, p0, Ll/۠ܶܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "/"

    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 99
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 101
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    return-object v4

    :cond_1
    const/16 v2, 0x2f

    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v5, -0x1

    if-ne v2, v5, :cond_2

    const-string v2, ""

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 111
    invoke-virtual {v0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    add-int/2addr v2, v3

    .line 112
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    move-object v0, v5

    :goto_0
    const-string v3, "data"

    .line 115
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 116
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Ll/۠ܶܿ;->᩶:Ljava/io/File;

    invoke-direct {v4, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v3, "android_data"

    .line 117
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Ll/۠ܶܿ;->᩸:Ljava/io/File;

    if-eqz v3, :cond_4

    .line 118
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Ll/۠ܶܿ;->᩸:Ljava/io/File;

    invoke-direct {v4, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const-string v3, "android_obb"

    .line 119
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Ll/۠ܶܿ;->᩹:Ljava/io/File;

    if-eqz v3, :cond_5

    .line 120
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Ll/۠ܶܿ;->᩹:Ljava/io/File;

    invoke-direct {v4, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    const-string v3, "user_de_data"

    .line 121
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Ll/۠ܶܿ;->ۗ:Ljava/io/File;

    if-eqz v0, :cond_6

    .line 122
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Ll/۠ܶܿ;->ۗ:Ljava/io/File;

    invoke-direct {v4, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :cond_6
    :goto_1
    if-eqz v4, :cond_8

    if-eqz p2, :cond_7

    .line 129
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/system/Os;->lstat(Ljava/lang/String;)Landroid/system/StructStat;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    .line 131
    :catch_0
    new-instance p2, Ljava/io/FileNotFoundException;

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    return-object v4

    .line 125
    :cond_8
    new-instance p2, Ljava/io/FileNotFoundException;

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 96
    :cond_9
    new-instance p2, Ljava/io/FileNotFoundException;

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private ֫(Landroid/database/MatrixCursor;Ljava/lang/String;Ljava/io/File;)V
    .locals 11

    const-string v0, "|"

    const/4 v1, 0x0

    .line 427
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    if-nez p3, :cond_0

    .line 84
    invoke-direct {p0, p2, v3}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object p3

    :cond_0
    const-string v3, "flags"

    const-string v4, "last_modified"

    const-string v5, "mime_type"

    const-string v6, "_size"

    const-string v7, "_display_name"

    const-string v8, "document_id"

    if-nez p3, :cond_1

    .line 422
    invoke-virtual {p1}, Landroid/database/MatrixCursor;->newRow()Landroid/database/MatrixCursor$RowBuilder;

    move-result-object p1

    .line 423
    iget-object p2, p0, Ll/۠ܶܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v8, p2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 424
    iget-object p2, p0, Ll/۠ܶܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v7, p2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    const-wide/16 p2, 0x0

    .line 425
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, v6, p2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    const-string p2, "vnd.android.document/directory"

    .line 426
    invoke-virtual {p1, v5, p2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 427
    invoke-virtual {p1, v4, v2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 428
    invoke-virtual {p1, v3, v2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    return-void

    .line 433
    :cond_1
    invoke-virtual {p3}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 434
    invoke-virtual {p3}, Ljava/io/File;->canWrite()Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x8

    goto :goto_0

    .line 437
    :cond_2
    invoke-virtual {p3}, Ljava/io/File;->canWrite()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x2

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    .line 441
    :goto_0
    invoke-virtual {p3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v9}, Ljava/io/File;->canWrite()Z

    move-result v9

    if-eqz v9, :cond_4

    or-int/lit8 v2, v2, 0x44

    .line 445
    :cond_4
    invoke-virtual {p3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    .line 448
    iget-object v10, p0, Ll/۠ܶܿ;->᩶:Ljava/io/File;

    invoke-virtual {v10}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const-string v10, "data"

    goto :goto_1

    .line 450
    :cond_5
    iget-object v10, p0, Ll/۠ܶܿ;->᩸:Ljava/io/File;

    if-eqz v10, :cond_6

    invoke-virtual {v10}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const-string v10, "android_data"

    goto :goto_1

    .line 452
    :cond_6
    iget-object v10, p0, Ll/۠ܶܿ;->᩹:Ljava/io/File;

    if-eqz v10, :cond_7

    invoke-virtual {v10}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const-string v10, "android_obb"

    goto :goto_1

    .line 454
    :cond_7
    iget-object v10, p0, Ll/۠ܶܿ;->ۗ:Ljava/io/File;

    if-eqz v10, :cond_8

    invoke-virtual {v10}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const-string v10, "user_de_data"

    goto :goto_1

    .line 457
    :cond_8
    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    const/4 v1, 0x1

    .line 460
    :goto_1
    invoke-virtual {p1}, Landroid/database/MatrixCursor;->newRow()Landroid/database/MatrixCursor$RowBuilder;

    move-result-object p1

    .line 461
    invoke-virtual {p1, v8, p2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 462
    invoke-virtual {p1, v7, v10}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 463
    invoke-virtual {p3}, Ljava/io/File;->length()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, v6, p2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 464
    invoke-static {p3}, Ll/۠ܶܿ;->ۧ(Ljava/io/File;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v5, p2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 465
    invoke-virtual {p3}, Ljava/io/File;->lastModified()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, v4, p2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 466
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, v3, p2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    const-string p2, "mt_path"

    .line 467
    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    if-eqz v1, :cond_a

    .line 470
    :try_start_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 471
    invoke-static {v9}, Landroid/system/Os;->lstat(Ljava/lang/String;)Landroid/system/StructStat;

    move-result-object p3

    .line 472
    iget v1, p3, Landroid/system/StructStat;->st_mode:I

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 473
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p3, Landroid/system/StructStat;->st_uid:I

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 474
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p3, Landroid/system/StructStat;->st_gid:I

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 475
    iget p3, p3, Landroid/system/StructStat;->st_mode:I

    const v1, 0xf000

    and-int/2addr p3, v1

    const v1, 0xa000

    if-ne p3, v1, :cond_9

    .line 476
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Landroid/system/Os;->readlink(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    const-string p3, "mt_extras"

    .line 478
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_a
    return-void
.end method

.method public static ֫(Ljava/io/File;)Z
    .locals 5

    .line 259
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 274
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/system/Os;->lstat(Ljava/lang/String;)Landroid/system/StructStat;

    move-result-object v0

    .line 276
    iget v0, v0, Landroid/system/StructStat;->st_mode:I
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    const v1, 0xf000

    and-int/2addr v0, v1

    const v1, 0xa000

    if-ne v0, v1, :cond_0

    goto :goto_1

    :catch_0
    nop

    .line 260
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 262
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    .line 263
    invoke-static {v4}, Ll/۠ܶܿ;->֫(Ljava/io/File;)Z

    move-result v4

    if-nez v4, :cond_1

    return v2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 269
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/io/File;)Ljava/lang/String;
    .locals 1

    .line 326
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "vnd.android.document/directory"

    return-object p0

    .line 329
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2e

    .line 330
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-ltz v0, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 332
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 333
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    const-string p0, "application/octet-stream"

    return-object p0
.end method


# virtual methods
.method public final attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 3

    .line 65
    invoke-super {p0, p1, p2}, Landroid/provider/DocumentsProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/۠ܶܿ;->ۙ:Ljava/lang/String;

    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    iput-object p2, p0, Ll/۠ܶܿ;->᩶:Ljava/io/File;

    .line 68
    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    const-string v0, "/data/user/"

    .line 69
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "/data/user_de/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v2, 0xb

    .line 0
    invoke-static {v2, p2, v1}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 70
    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/۠ܶܿ;->ۗ:Ljava/io/File;

    :cond_0
    const/4 p2, 0x0

    .line 72
    invoke-virtual {p1, p2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 74
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    iput-object p2, p0, Ll/۠ܶܿ;->᩸:Ljava/io/File;

    .line 76
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getObbDir()Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Ll/۠ܶܿ;->᩹:Ljava/io/File;

    return-void
.end method

.method public final call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 8

    const-string v0, "message"

    const-string v1, "result"

    const-string v2, "Unsupported method: "

    .line 342
    invoke-super {p0, p1, p2, p3}, Landroid/provider/DocumentsProvider;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    :cond_0
    const-string p2, "mt:"

    .line 346
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 349
    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const/4 v3, 0x0

    :try_start_0
    const-string v4, "uri"

    .line 351
    invoke-virtual {p3, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/net/Uri;

    .line 352
    invoke-virtual {v4}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v4

    .line 353
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x4

    const/4 v7, 0x1

    if-lt v5, v6, :cond_2

    const/4 v5, 0x3

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    :cond_2
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    :goto_0
    check-cast v4, Ljava/lang/String;

    .line 354
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v6, -0x620f2f0b

    if-eq v5, v6, :cond_7

    const v6, 0xcc82212

    if-eq v5, v6, :cond_5

    const v6, 0x6621b52e

    if-eq v5, v6, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v5, "mt:setLastModified"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 84
    invoke-direct {p0, v4, v7}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_4

    .line 358
    invoke-virtual {p2, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto/16 :goto_2

    :cond_4
    const-string v2, "time"

    .line 360
    invoke-virtual {p3, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 361
    invoke-virtual {p1, v4, v5}, Ljava/io/File;->setLastModified(J)Z

    move-result p1

    invoke-virtual {p2, v1, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto/16 :goto_2

    :cond_5
    const-string v5, "mt:createSymlink"

    .line 354
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 382
    invoke-direct {p0, v4, v3}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_6

    .line 384
    invoke-virtual {p2, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_2

    :cond_6
    const-string v2, "path"

    .line 386
    invoke-virtual {p3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 388
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Landroid/system/Os;->symlink(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    invoke-virtual {p2, v1, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    :try_end_1
    .catch Landroid/system/ErrnoException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :catch_0
    move-exception p1

    .line 391
    :try_start_2
    invoke-virtual {p2, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 392
    invoke-virtual {p1}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    const-string v5, "mt:setPermissions"

    .line 354
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 84
    invoke-direct {p0, v4, v7}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_8

    .line 368
    invoke-virtual {p2, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_2

    :cond_8
    const-string v2, "permissions"

    .line 370
    invoke-virtual {p3, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 372
    :try_start_3
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3}, Landroid/system/Os;->chmod(Ljava/lang/String;I)V

    .line 373
    invoke-virtual {p2, v1, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    :try_end_3
    .catch Landroid/system/ErrnoException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2

    :catch_1
    move-exception p1

    .line 375
    :try_start_4
    invoke-virtual {p2, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 376
    invoke-virtual {p1}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 398
    :cond_9
    :goto_1
    invoke-virtual {p2, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 399
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    .line 403
    invoke-virtual {p2, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 404
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-object p2
.end method

.method public final createDocument(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "/"

    const/4 v1, 0x1

    .line 84
    invoke-direct {p0, p1, v1}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 228
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v3, 0x2

    .line 230
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 231
    new-instance v2, Ljava/io/File;

    const-string v4, " ("

    .line 0
    invoke-static {p3, v4}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    .line 231
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move v3, v5

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v1, "vnd.android.document/directory"

    .line 235
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 236
    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    move-result p2

    goto :goto_1

    .line 238
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    move-result p2

    :goto_1
    if-eqz p2, :cond_3

    .line 241
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :goto_3
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 247
    :catch_0
    :cond_3
    new-instance p2, Ljava/io/FileNotFoundException;

    const-string v0, "Failed to create document in "

    const-string v1, " with name "

    .line 0
    invoke-static {v0, p1, v1, p3}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 247
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final deleteDocument(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    .line 84
    invoke-direct {p0, p1, v0}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 253
    invoke-static {v0}, Ll/۠ܶܿ;->֫(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 254
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    const-string v1, "Failed to delete document "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getDocumentType(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 84
    invoke-direct {p0, p1, v0}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "vnd.android.document/directory"

    return-object p1

    .line 317
    :cond_0
    invoke-static {p1}, Ll/۠ܶܿ;->ۧ(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final isChildDocument(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 322
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final moveDocument(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 p2, 0x1

    .line 84
    invoke-direct {p0, p1, p2}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, p3, p2}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object p2

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    .line 306
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 307
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p1, "/"

    .line 308
    invoke-virtual {p3, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 0
    invoke-static {p3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p3, p1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 308
    :goto_0
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 311
    :cond_1
    new-instance p2, Ljava/io/FileNotFoundException;

    const-string v0, "Filed to move document "

    const-string v1, " to "

    .line 0
    invoke-static {v0, p1, v1, p3}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 311
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final onCreate()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final openDocument(Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    const/4 p3, 0x0

    .line 193
    invoke-direct {p0, p1, p3}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 202
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p1, "rwt"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x5

    goto :goto_1

    :sswitch_1
    const-string p1, "wt"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x4

    goto :goto_1

    :sswitch_2
    const-string p1, "wa"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p3, 0x3

    goto :goto_1

    :sswitch_3
    const-string p1, "rw"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p3, 0x2

    goto :goto_1

    :sswitch_4
    const-string p1, "w"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 p3, 0x1

    goto :goto_1

    :sswitch_5
    const-string p1, "r"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    const/4 p3, -0x1

    :cond_5
    :goto_1
    packed-switch p3, :pswitch_data_0

    .line 215
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "Invalid mode: "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const/high16 p1, 0x3c000000    # 0.0078125f

    goto :goto_2

    :pswitch_1
    const/high16 p1, 0x2a000000

    goto :goto_2

    :pswitch_2
    const/high16 p1, 0x38000000

    goto :goto_2

    :pswitch_3
    const/high16 p1, 0x2c000000

    goto :goto_2

    :pswitch_4
    const/high16 p1, 0x10000000

    .line 198
    :goto_2
    invoke-static {v0, p1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    return-object p1

    .line 195
    :cond_6
    new-instance p2, Ljava/io/FileNotFoundException;

    const-string p3, " not found"

    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2

    :sswitch_data_0
    .sparse-switch
        0x72 -> :sswitch_5
        0x77 -> :sswitch_4
        0xe45 -> :sswitch_3
        0xeca -> :sswitch_2
        0xedd -> :sswitch_1
        0x1bacf -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public final queryChildDocuments(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 6

    const-string p3, "/"

    .line 162
    invoke-virtual {p1, p3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 0
    invoke-static {v2, v1, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 165
    :cond_0
    new-instance v0, Landroid/database/MatrixCursor;

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    sget-object p2, Ll/۠ܶܿ;->۬:[Ljava/lang/String;

    :goto_0
    invoke-direct {v0, p2}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    .line 84
    invoke-direct {p0, p1, v2}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object p2

    if-nez p2, :cond_4

    const-string p2, "/data"

    .line 168
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Ll/۠ܶܿ;->᩶:Ljava/io/File;

    invoke-direct {p0, v0, p2, p3}, Ll/۠ܶܿ;->֫(Landroid/database/MatrixCursor;Ljava/lang/String;Ljava/io/File;)V

    .line 169
    iget-object p2, p0, Ll/۠ܶܿ;->᩸:Ljava/io/File;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "/android_data"

    .line 170
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Ll/۠ܶܿ;->᩸:Ljava/io/File;

    invoke-direct {p0, v0, p2, p3}, Ll/۠ܶܿ;->֫(Landroid/database/MatrixCursor;Ljava/lang/String;Ljava/io/File;)V

    .line 172
    :cond_2
    iget-object p2, p0, Ll/۠ܶܿ;->᩹:Ljava/io/File;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p2, "/android_obb"

    .line 173
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Ll/۠ܶܿ;->᩹:Ljava/io/File;

    invoke-direct {p0, v0, p2, p3}, Ll/۠ܶܿ;->֫(Landroid/database/MatrixCursor;Ljava/lang/String;Ljava/io/File;)V

    .line 175
    :cond_3
    iget-object p2, p0, Ll/۠ܶܿ;->ۗ:Ljava/io/File;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_5

    const-string p2, "/user_de_data"

    .line 176
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/۠ܶܿ;->ۗ:Ljava/io/File;

    invoke-direct {p0, v0, p1, p2}, Ll/۠ܶܿ;->֫(Landroid/database/MatrixCursor;Ljava/lang/String;Ljava/io/File;)V

    return-object v0

    .line 179
    :cond_4
    invoke-virtual {p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 184
    array-length v2, p2

    :goto_1
    if-ge v1, v2, :cond_5

    aget-object v3, p2, v1

    .line 0
    invoke-static {p1, p3}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 185
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v0, v4, v3}, Ll/۠ܶܿ;->֫(Landroid/database/MatrixCursor;Ljava/lang/String;Ljava/io/File;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    return-object v0

    .line 182
    :cond_6
    new-instance p2, Ljava/io/FileNotFoundException;

    const-string p3, "Failed to list directory "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final queryDocument(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 155
    new-instance v0, Landroid/database/MatrixCursor;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Ll/۠ܶܿ;->۬:[Ljava/lang/String;

    :goto_0
    invoke-direct {v0, p2}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 156
    invoke-direct {p0, v0, p1, p2}, Ll/۠ܶܿ;->֫(Landroid/database/MatrixCursor;Ljava/lang/String;Ljava/io/File;)V

    return-object v0
.end method

.method public final queryRoots([Ljava/lang/String;)Landroid/database/Cursor;
    .locals 5

    .line 139
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 140
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 141
    new-instance v2, Landroid/database/MatrixCursor;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll/۠ܶܿ;->۫:[Ljava/lang/String;

    :goto_0
    invoke-direct {v2, p1}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    .line 142
    invoke-virtual {v2}, Landroid/database/MatrixCursor;->newRow()Landroid/database/MatrixCursor$RowBuilder;

    move-result-object p1

    const-string v3, "root_id"

    .line 143
    iget-object v4, p0, Ll/۠ܶܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v3, v4}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    const-string v3, "document_id"

    .line 144
    iget-object v4, p0, Ll/۠ܶܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v3, v4}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    const-string v3, "summary"

    .line 145
    iget-object v4, p0, Ll/۠ܶܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v3, v4}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    const/16 v3, 0x11

    .line 146
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "flags"

    invoke-virtual {p1, v4, v3}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    const-string v3, "title"

    .line 147
    invoke-virtual {p1, v3, v1}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    const-string v1, "mime_types"

    const-string v3, "*/*"

    .line 148
    invoke-virtual {p1, v1, v3}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 149
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "icon"

    invoke-virtual {p1, v1, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    return-object v2
.end method

.method public final removeDocument(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 285
    invoke-virtual {p0, p1}, Ll/۠ܶܿ;->deleteDocument(Ljava/lang/String;)V

    return-void
.end method

.method public final renameDocument(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    .line 84
    invoke-direct {p0, p1, v0}, Ll/۠ܶܿ;->֫(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 292
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 293
    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    const/16 v1, 0x2f

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v0

    .line 295
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 298
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    const-string v1, "Failed to rename document "

    const-string v2, " to "

    .line 0
    invoke-static {v1, p1, v2, p2}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 298
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
