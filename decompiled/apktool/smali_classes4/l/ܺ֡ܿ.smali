.class public Ll/ܺ֡ܿ;
.super Ll/ܶ᩵ܿ;
.source "A16O"


# static fields
.field public static final ۤ:Z


# instance fields
.field public final ۗ:Ljava/io/File;

.field public ۫:Ljava/lang/String;

.field public final ۬:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 40
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "huawei"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    sput-boolean v0, Ll/ܺ֡ܿ;->ۤ:Z

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x0

    .line 49
    invoke-direct {p0, p1, v0}, Ll/ܺ֡ܿ;-><init>(Ljava/io/File;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Z)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ll/ܶ᩵ܿ;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    .line 54
    iput-boolean p2, p0, Ll/ܺ֡ܿ;->۬:Z

    return-void
.end method

.method private ۗۧ()Z
    .locals 6

    .line 225
    invoke-direct {p0}, Ll/ܺ֡ܿ;->᩶ۧ()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 227
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lbin/mt/plus/Features3;->delete(Ljava/lang/String;[B)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    return v3

    .line 230
    :cond_0
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v2

    invoke-interface {v2}, Ll/֡᩶ܿ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    .line 233
    :try_start_0
    invoke-static {v1}, Ll/ۗ᩶ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object v2

    .line 234
    invoke-virtual {v2}, Ll/᩵᩶ܿ;->ۜ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 235
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 236
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write([B)V

    const/16 v5, 0x2f

    .line 237
    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 238
    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write([B)V

    .line 239
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/᩵᩶ܿ;->ۧ([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    invoke-virtual {v2}, Ll/᩵᩶ܿ;->ᩴ()V

    return v3

    :catchall_0
    move-exception v0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/᩵᩶ܿ;->ᩴ()V

    .line 248
    :cond_1
    throw v0

    :catch_0
    if-eqz v2, :cond_3

    .line 246
    :cond_2
    invoke-virtual {v2}, Ll/᩵᩶ܿ;->ᩴ()V

    :cond_3
    return v1
.end method

.method private ᩶ۧ()[B
    .locals 9

    .line 297
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 299
    invoke-static {v0}, Ll/ۡ۠ۘ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 302
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/plus/Features3;->listGarbledFileNames(Ljava/lang/String;)[[B

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_4

    aget-object v5, v1, v4

    .line 303
    invoke-static {v5}, Lbin/mt/plus/Features3;->newStringUTF([B)Ljava/lang/String;

    move-result-object v6

    .line 304
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    .line 307
    :cond_1
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-ne v7, v8, :cond_3

    .line 308
    new-instance v7, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-direct {v7, v6}, Ljava/lang/String;-><init>([B)V

    .line 309
    new-instance v6, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/lang/String;-><init>([B)V

    .line 310
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_1
    return-object v5

    :cond_2
    move-object v0, v6

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object v2
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getParent()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡֫()Z
    .locals 2

    .line 335
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ֨֫()Z
    .locals 1

    .line 330
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    return v0
.end method

.method public final ֨ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫(Ll/ۜ᩵ܿ;)Ll/᩷᩵ܿ;
    .locals 1

    .line 403
    new-instance v0, Ll/ۡ֡ܿ;

    invoke-direct {v0, p0, p1}, Ll/᩷᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ll/ۜ᩵ܿ;)V

    return-object v0
.end method

.method public final ֫(J)Z
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 353
    :cond_0
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0, p1, p2}, Ljava/io/File;->setLastModified(J)Z

    move-result p1

    return p1
.end method

.method public final ֫֫()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۗ()Z
    .locals 1

    .line 72
    :try_start_0
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ()Z
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    return v0
.end method

.method public final ۚ()Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Ll/ܺ֡ܿ;->۬:Z

    if-nez v0, :cond_0

    .line 373
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֡()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۚۧ()Z
    .locals 1

    .line 501
    iget-boolean v0, p0, Ll/ܺ֡ܿ;->۬:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۛ֫()J
    .locals 2

    .line 345
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۜ(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    .line 486
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-static {p1}, Ll/ܳ᩸ܿ;->ۖ(Ljava/lang/String;)I

    move-result p1

    invoke-static {v0, p1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    return-object p1
.end method

.method public final ۜۧ()Ljava/nio/channels/FileChannel;
    .locals 3

    .line 475
    new-instance v0, Ljava/io/RandomAccessFile;

    iget-object v1, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    const-string v2, "r"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0}, Ll/ᩴۖܽ;->֫(Ljava/io/RandomAccessFile;)Ljava/nio/channels/FileChannel;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Z
    .locals 1

    .line 393
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v0

    return v0
.end method

.method public final ۠֫()Z
    .locals 1

    .line 325
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    return v0
.end method

.method public final ۢۧ()Ljava/io/InputStream;
    .locals 2

    .line 465
    new-instance v0, Ll/ܶۖܽ;

    iget-object v1, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-direct {v0, v1}, Ll/ܶۖܽ;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public final ۤ()Z
    .locals 1

    .line 320
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method public ۧ(Z)Ljava/util/List;
    .locals 2

    .line 437
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    .line 439
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 440
    :cond_0
    invoke-static {v0}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩻֡ܿ;

    invoke-direct {v1, p1}, Ll/᩻֡ܿ;-><init>(Z)V

    .line 441
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۜ֡ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۜ֡ܿ;-><init>(I)V

    .line 442
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/᩷֡ܿ;

    invoke-direct {v0, v1}, Ll/᩷֡ܿ;-><init>(I)V

    .line 443
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 450
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final ۧ(Ll/ܶ᩵ܿ;)Z
    .locals 8

    .line 201
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v0

    .line 202
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩷()Ll/ܺ֡ܿ;

    move-result-object v1

    iget-object v1, v1, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 203
    :goto_0
    invoke-virtual {p0, p1}, Ll/ܺ֡ܿ;->ܽ(Ll/ܶ᩵ܿ;)J

    move-result-wide v2

    .line 204
    iget-object p1, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {p1, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 259
    invoke-direct {p0}, Ll/ܺ֡ܿ;->᩶ۧ()[B

    move-result-object p1

    const/4 v4, 0x0

    if-eqz p1, :cond_4

    .line 261
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1, v0}, Lbin/mt/plus/Features3;->rename(Ljava/lang/String;[BLjava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    .line 264
    :cond_1
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v5

    invoke-interface {v5}, Ll/֡᩶ܿ;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, 0x0

    .line 267
    :try_start_0
    invoke-static {v4}, Ll/ۗ᩶ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object v5

    .line 268
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ۜ()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 269
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 270
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->getBytes()[B

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/io/OutputStream;->write([B)V

    const/16 v7, 0x2f

    .line 271
    invoke-virtual {v6, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 272
    invoke-virtual {v6, p1}, Ljava/io/OutputStream;->write([B)V

    .line 273
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v5, p1, v0}, Ll/᩵᩶ܿ;->֫([B[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ᩴ()V

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ᩴ()V

    return v4

    :catchall_0
    move-exception p1

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ᩴ()V

    .line 282
    :cond_3
    throw p1

    :catch_0
    if-eqz v5, :cond_4

    .line 280
    invoke-virtual {v5}, Ll/᩵᩶ܿ;->ᩴ()V

    :cond_4
    return v4

    :cond_5
    :goto_1
    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-gez p1, :cond_6

    goto :goto_2

    .line 39
    :cond_6
    :try_start_1
    invoke-virtual {v1, v2, v3}, Ljava/io/File;->setLastModified(J)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz p1, :cond_7

    goto :goto_2

    .line 46
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_2

    .line 43
    :catch_1
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public ۧ(Ll/ܿۖ᩷;)Z
    .locals 4

    .line 506
    invoke-virtual {p0}, Ll/ܺ֡ܿ;->ۚۧ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 509
    :cond_0
    invoke-static {p0, p1}, Ll/᩸֡ܿ;->֫(Ll/ܺ֡ܿ;Ll/ܿۖ᩷;)Ll/᩸֡ܿ;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 513
    :cond_1
    invoke-virtual {p1}, Ll/᩸֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 514
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 515
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۙ()Z

    move-result v3

    if-nez v3, :cond_2

    :goto_0
    return v1

    .line 518
    :cond_2
    invoke-virtual {p0, v0}, Ll/ܺ֡ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 519
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    return v1

    .line 522
    :cond_3
    invoke-virtual {p1}, Ll/᩸֡ܿ;->ۘ()Z

    move-result p1

    if-nez p1, :cond_4

    .line 523
    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 524
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    return v1

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method public final ۫()Z
    .locals 5

    .line 174
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    const/4 v1, 0x1

    :try_start_0
    sget-boolean v2, Ll/ܺ֡ܿ;->ۤ:Z

    if-eqz v2, :cond_0

    .line 175
    invoke-static {v0}, Ll/ۢ᩵ܿ;->ۧ(Ljava/io/File;)Z

    move-result v2

    goto :goto_0

    .line 177
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v2

    :goto_0
    if-nez v2, :cond_1

    .line 179
    invoke-direct {p0}, Ll/ܺ֡ܿ;->ۗۧ()Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :catch_0
    const/4 v2, 0x0

    :cond_1
    :goto_1
    if-nez v2, :cond_2

    .line 185
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v3

    invoke-interface {v3}, Ll/֡᩶ܿ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 186
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 188
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "/data/media/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 190
    :try_start_1
    invoke-static {v0}, Ll/᩶᩶ܿ;->ܽ(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    :cond_2
    move v1, v2

    :goto_2
    return v1
.end method

.method public final ۬()Z
    .locals 5

    .line 121
    sget-boolean v0, Ll/ܺ֡ܿ;->ۤ:Z

    iget-object v1, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 122
    invoke-static {v1}, Ll/ۢ᩵ܿ;->֫(Ljava/io/File;)Z

    move-result v0

    goto :goto_0

    .line 124
    :cond_0
    invoke-static {v1}, Ll/ܺۢ֡;->ܽ(Ljava/io/File;)Z

    move-result v0

    :goto_0
    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 126
    invoke-direct {p0}, Ll/ܺ֡ܿ;->ۗۧ()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v0, 0x1

    :cond_1
    if-nez v0, :cond_2

    .line 129
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v3

    invoke-interface {v3}, Ll/֡᩶ܿ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 130
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 132
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "/data/media/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 134
    :try_start_0
    invoke-static {v1}, Ll/᩶᩶ܿ;->ܽ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    :cond_2
    return v0
.end method

.method public final ܰ֫()Ljava/util/List;
    .locals 3

    .line 455
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 457
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 458
    :cond_0
    invoke-static {v0}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۢ֡ܿ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۢ֡ܿ;-><init>(I)V

    .line 459
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 460
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final ܶ()Z
    .locals 1

    .line 388
    iget-boolean v0, p0, Ll/ܺ֡ܿ;->۬:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ܺ֫()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ll/ܶ᩵ܿ;)J
    .locals 3

    .line 213
    iget-boolean v0, p0, Ll/ܺ֡ܿ;->۬:Z

    const-wide/16 v1, -0x1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩷()Ll/ܺ֡ܿ;

    move-result-object p1

    iget-boolean p1, p1, Ll/ܺ֡ܿ;->۬:Z

    if-nez p1, :cond_0

    .line 214
    iget-object p1, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    .line 25
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbin/mt/plus/Features3;->֫(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    .line 27
    :catch_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-wide v1
.end method

.method public final ܽ(Z)Ljava/io/OutputStream;
    .locals 2

    .line 470
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public final ܿ֫()Ljava/lang/String;
    .locals 2

    .line 365
    iget-object v0, p0, Ll/ܺ֡ܿ;->۫:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 66
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 367
    invoke-static {v0}, Lbin/mt/plus/Features3;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    .line 371
    :cond_0
    iput-object v0, p0, Ll/ܺ֡ܿ;->۫:Ljava/lang/String;

    .line 373
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x0

    :cond_2
    return-object v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 383
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v0

    return v0
.end method

.method public final ᩶֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩷(Ljava/lang/String;)Ll/ۖۖܽ;
    .locals 1

    .line 480
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-static {v0, p1}, Ll/֡ۖܽ;->֫(Ljava/io/File;Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷()Ll/ܺ֡ܿ;
    .locals 0

    return-object p0
.end method

.method public final ᩹()Ll/ۤ᩵ܿ;
    .locals 1

    .line 89
    new-instance v0, Ll/ۘ֡ܿ;

    invoke-direct {v0, p0}, Ll/ۘ֡ܿ;-><init>(Ll/ܺ֡ܿ;)V

    return-object v0
.end method

.method public final ᩺()Ll/ܶ᩵ܿ;
    .locals 3

    .line 60
    new-instance v0, Ll/ܺ֡ܿ;

    iget-object v1, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v1

    iget-boolean v2, p0, Ll/ܺ֡ܿ;->۬:Z

    invoke-direct {v0, v1, v2}, Ll/ܺ֡ܿ;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public final ᩺֫()J
    .locals 2

    .line 340
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method
