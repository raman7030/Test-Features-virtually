.class public final Ll/ۨۤۡ;
.super Ljava/lang/Object;
.source "G7TV"

# interfaces
.implements Ll/۫ۤۡ;


# static fields
.field public static final ܳ:Ll/ۛۤۡ;


# instance fields
.field public volatile ֫:Ljava/util/zip/CRC32;

.field public final ۧ:Ll/ۧۤᩴ;

.field public final ܽ:Ljava/io/File;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 582
    new-instance v0, Ll/ۛۤۡ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۛۤۡ;-><init>(I[B)V

    sput-object v0, Ll/ۨۤۡ;->ܳ:Ll/ۛۤۡ;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .line 42
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {}, Ll/ۙ᩸᩷;->֫()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->uid:I

    xor-int/2addr v0, v1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ۨۤۡ;->ܿ:Ljava/util/HashMap;

    .line 34
    new-instance v1, Ll/ۧۤᩴ;

    invoke-direct {v1}, Ll/ۧۤᩴ;-><init>()V

    iput-object v1, p0, Ll/ۨۤۡ;->ۧ:Ll/ۧۤᩴ;

    .line 35
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v1, p0, Ll/ۨۤۡ;->֫:Ljava/util/zip/CRC32;

    .line 46
    iput-object p1, p0, Ll/ۨۤۡ;->ܽ:Ljava/io/File;

    .line 47
    iput v0, p0, Ll/ۨۤۡ;->ᩳ:I

    return-void
.end method

.method public static bridge synthetic ֫()Ll/ۛۤۡ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۨۤۡ;->ܳ:Ll/ۛۤۡ;

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ۨۤۡ;)Ll/ۧۤᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۤۡ;->ۧ:Ll/ۧۤᩴ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۨۤۡ;Ljava/lang/String;)Ll/᩸۫ۡ;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۨۤۡ;->ۧ(Ljava/lang/String;)Ll/᩸۫ۡ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۨۤۡ;Ljava/lang/String;Ll/ۛۤۡ;[BLjava/util/zip/CRC32;)V
    .locals 7

    .line 549
    invoke-static {p2}, Ll/ۛۤۡ;->ۧ(Ll/ۛۤۡ;)I

    move-result v0

    .line 550
    invoke-static {p2}, Ll/ۛۤۡ;->֫(Ll/ۛۤۡ;)[B

    move-result-object p2

    .line 552
    array-length v1, p2

    add-int/lit8 v1, v1, 0x3

    .line 553
    array-length v2, p3

    if-ge v2, v1, :cond_0

    .line 554
    new-array p3, v1, [B

    .line 556
    :cond_0
    iget v2, p0, Ll/ۨۤۡ;->ᩳ:I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    xor-int/2addr v2, v3

    .line 558
    invoke-virtual {p4}, Ljava/util/zip/CRC32;->reset()V

    .line 559
    invoke-virtual {p4, v0}, Ljava/util/zip/CRC32;->update(I)V

    .line 560
    invoke-virtual {p4, p2}, Ljava/util/zip/CRC32;->update([B)V

    .line 561
    invoke-virtual {p4}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    long-to-int p4, v3

    xor-int/2addr v0, v2

    int-to-byte v0, v0

    const/4 v3, 0x2

    .line 564
    aput-byte v0, p3, v3

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 566
    :goto_0
    array-length v4, p2

    if-ge v3, v4, :cond_1

    add-int/lit8 v4, v3, 0x3

    .line 567
    aget-byte v5, p2, v3

    xor-int/2addr v5, v2

    int-to-byte v5, v5

    aput-byte v5, p3, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 570
    :cond_1
    invoke-static {v0, p4, p3}, Ll/ܺܰۡ;->ۧ(II[B)V

    .line 573
    invoke-direct {p0, p1}, Ll/ۨۤۡ;->ۧ(Ljava/lang/String;)Ll/᩸۫ۡ;

    move-result-object p0

    .line 214
    :try_start_0
    invoke-virtual {p0}, Ll/᩸۫ۡ;->᩻()Ljava/io/FileOutputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 215
    :try_start_1
    invoke-virtual {p1, p3, v0, v1}, Ljava/io/FileOutputStream;->write([BII)V

    .line 216
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 217
    invoke-virtual {p0, p1}, Ll/᩸۫ۡ;->ۧ(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    const/4 p1, 0x0

    .line 219
    :goto_1
    invoke-virtual {p0, p1}, Ll/᩸۫ۡ;->֫(Ljava/io/FileOutputStream;)V

    .line 220
    throw p2
.end method

.method public static bridge synthetic ۧ(Ll/ۨۤۡ;)Ljava/io/File;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۤۡ;->ܽ:Ljava/io/File;

    return-object p0
.end method

.method private declared-synchronized ۧ()Ljava/util/zip/CRC32;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 408
    :try_start_0
    iget-object v1, p0, Ll/ۨۤۡ;->֫:Ljava/util/zip/CRC32;

    if-eqz v1, :cond_0

    .line 409
    iget-object v1, p0, Ll/ۨۤۡ;->֫:Ljava/util/zip/CRC32;

    const/4 v2, 0x0

    .line 410
    iput-object v2, p0, Ll/ۨۤۡ;->֫:Ljava/util/zip/CRC32;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 411
    monitor-exit v0

    return-object v1

    .line 413
    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private ۧ(Ljava/lang/String;)Ll/᩸۫ۡ;
    .locals 5

    .line 434
    iget-object v0, p0, Ll/ۨۤۡ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸۫ۡ;

    if-eqz v1, :cond_0

    return-object v1

    .line 437
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    .line 438
    iget v1, p0, Ll/ۨۤۡ;->ᩳ:I

    array-length v2, p1

    xor-int/2addr v1, v2

    const/4 v2, 0x0

    .line 439
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_1

    .line 440
    aget-byte v3, p1, v2

    xor-int v4, v2, v1

    int-to-byte v4, v4

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 442
    :cond_1
    invoke-static {}, Ll/ۧ᩺ܺ;->ᩳ()Ll/ۧ᩺ܺ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۧ᩺ܺ;->֫([B)Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x3d

    const/16 v2, 0x31

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    .line 443
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xff

    if-gt v1, v2, :cond_2

    .line 446
    new-instance v1, Ll/᩸۫ۡ;

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Ll/ۨۤۡ;->ܽ:Ljava/io/File;

    invoke-direct {v2, v3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ll/᩸۫ۡ;-><init>(Ljava/io/File;)V

    .line 447
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    .line 444
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Key too long: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۧ(ILjava/lang/String;)[B
    .locals 2

    .line 456
    iget-object v0, p0, Ll/ۨۤۡ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۛۤۡ;

    if-nez v1, :cond_1

    move-object v0, p0

    .line 459
    monitor-enter v0

    .line 460
    :try_start_0
    iget-object v1, p0, Ll/ۨۤۡ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1, p2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۤۡ;

    if-nez v1, :cond_0

    .line 462
    invoke-direct {p0, p1, p2}, Ll/ۨۤۡ;->ܽ(ILjava/lang/String;)[B

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 464
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 466
    :cond_1
    :goto_0
    sget-object p2, Ll/ۨۤۡ;->ܳ:Ll/ۛۤۡ;

    if-ne v1, p2, :cond_2

    goto :goto_1

    .line 469
    :cond_2
    invoke-static {v1}, Ll/ۛۤۡ;->ۧ(Ll/ۛۤۡ;)I

    move-result p2

    if-ne p2, p1, :cond_3

    .line 470
    invoke-static {v1}, Ll/ۛۤۡ;->֫(Ll/ۛۤۡ;)[B

    move-result-object p1

    return-object p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private ܽ(ILjava/lang/String;)[B
    .locals 10

    .line 481
    iget v0, p0, Ll/ۨۤۡ;->ᩳ:I

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 485
    :try_start_0
    invoke-direct {p0, p2}, Ll/ۨۤۡ;->ۧ(Ljava/lang/String;)Ll/᩸۫ۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸۫ۡ;->ܳ()[B

    move-result-object v1

    .line 486
    array-length v2, v1

    const/4 v3, 0x3

    if-lt v2, v3, :cond_4

    const/4 v2, 0x2

    .line 487
    aget-byte v2, v1, v2

    xor-int/2addr v2, v0

    and-int/lit16 v2, v2, 0xff

    .line 488
    array-length v4, v1

    sub-int/2addr v4, v3

    new-array v3, v4, [B

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_0

    add-int/lit8 v7, v6, 0x3

    .line 490
    aget-byte v7, v1, v7

    xor-int/2addr v7, v0

    int-to-byte v7, v7

    aput-byte v7, v3, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 494
    :cond_0
    invoke-static {v5, v1}, Ll/ܺܰۡ;->ܽ(I[B)I

    move-result v1

    .line 495
    invoke-direct {p0}, Ll/ۨۤۡ;->ۧ()Ljava/util/zip/CRC32;

    move-result-object v5

    .line 496
    invoke-virtual {v5, v2}, Ljava/util/zip/CRC32;->update(I)V

    .line 497
    invoke-virtual {v5, v3}, Ljava/util/zip/CRC32;->update([B)V

    .line 498
    invoke-virtual {v5}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v6

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v7, v6

    move-object v0, p0

    .line 0
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 417
    :try_start_1
    iget-object v6, p0, Ll/ۨۤۡ;->֫:Ljava/util/zip/CRC32;

    if-nez v6, :cond_1

    .line 418
    invoke-virtual {v5}, Ljava/util/zip/CRC32;->reset()V

    .line 419
    iput-object v5, p0, Ll/ۨۤۡ;->֫:Ljava/util/zip/CRC32;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 421
    :cond_1
    :try_start_2
    monitor-exit v0

    if-eq v1, v7, :cond_2

    goto :goto_1

    :cond_2
    const/16 v0, 0x2800

    if-ge v4, v0, :cond_3

    .line 525
    iget-object v0, p0, Ll/ۨۤۡ;->ۧ:Ll/ۧۤᩴ;

    new-instance v1, Ll/ۛۤۡ;

    invoke-direct {v1, v2, v3}, Ll/ۛۤۡ;-><init>(I[B)V

    invoke-virtual {v0, p2, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_3
    if-ne v2, p1, :cond_4

    return-object v3

    :catchall_0
    move-exception p1

    .line 421
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 538
    :catch_0
    iget-object p1, p0, Ll/ۨۤۡ;->ۧ:Ll/ۧۤᩴ;

    sget-object v0, Ll/ۨۤۡ;->ܳ:Ll/ۛۤۡ;

    invoke-virtual {p1, p2, v0}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :catchall_1
    :cond_4
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final contains(Ljava/lang/String;)Z
    .locals 4

    .line 187
    iget-object v0, p0, Ll/ۨۤۡ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۛۤۡ;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_2

    move-object v0, p0

    .line 190
    monitor-enter v0

    .line 191
    :try_start_0
    iget-object v1, p0, Ll/ۨۤۡ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۤۡ;

    if-nez v1, :cond_1

    .line 193
    invoke-direct {p0, p1}, Ll/ۨۤۡ;->ۧ(Ljava/lang/String;)Ll/᩸۫ۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸۫ۡ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 194
    monitor-exit v0

    return v3

    .line 196
    :cond_0
    iget-object v1, p0, Ll/ۨۤۡ;->ۧ:Ll/ۧۤᩴ;

    sget-object v3, Ll/ۨۤۡ;->ܳ:Ll/ۛۤۡ;

    invoke-virtual {v1, p1, v3}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    monitor-exit v0

    return v2

    .line 199
    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 201
    :cond_2
    :goto_0
    sget-object p1, Ll/ۨۤۡ;->ܳ:Ll/ۛۤۡ;

    if-eq v1, p1, :cond_3

    return v3

    :cond_3
    return v2
.end method

.method public final edit()Ll/۬ۤۡ;
    .locals 1

    .line 211
    new-instance v0, Ll/ۤۤۡ;

    invoke-direct {v0, p0}, Ll/ۤۤۡ;-><init>(Ll/ۨۤۡ;)V

    return-object v0
.end method

.method public final getBoolean(Ljava/lang/String;Z)Z
    .locals 2

    const/16 v0, 0x11

    .line 452
    invoke-direct {p0, v0, p1}, Ll/ۨۤۡ;->ۧ(ILjava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_1

    .line 62
    array-length v0, p1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 65
    aget-byte p1, p1, p2

    if-eqz p1, :cond_1

    return v1

    :cond_1
    :goto_0
    return p2
.end method

.method public final getFloat(Ljava/lang/String;F)F
    .locals 2

    const/16 v0, 0x17

    .line 452
    invoke-direct {p0, v0, p1}, Ll/ۨۤۡ;->ۧ(ILjava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_1

    .line 116
    array-length v0, p1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 119
    invoke-static {p2, p1}, Ll/ܺܰۡ;->֫(I[B)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1

    :cond_1
    :goto_0
    return p2
.end method

.method public final getInt(Ljava/lang/String;I)I
    .locals 2

    const/16 v0, 0x15

    .line 452
    invoke-direct {p0, v0, p1}, Ll/ۨۤۡ;->ۧ(ILjava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_1

    .line 98
    array-length v0, p1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 101
    invoke-static {p2, p1}, Ll/ܺܰۡ;->֫(I[B)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    return p2
.end method

.method public final getLong(Ljava/lang/String;J)J
    .locals 2

    const/16 v0, 0x16

    .line 452
    invoke-direct {p0, v0, p1}, Ll/ۨۤۡ;->ۧ(ILjava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_1

    .line 107
    array-length v0, p1

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 110
    invoke-static {p2, p1}, Ll/ܺܰۡ;->ۧ(I[B)J

    move-result-wide p1

    return-wide p1

    :cond_1
    :goto_0
    return-wide p2
.end method

.method public final getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x10

    .line 452
    invoke-direct {p0, v0, p1}, Ll/ۨۤۡ;->ۧ(ILjava/lang/String;)[B

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    .line 56
    :cond_0
    new-instance p2, Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p2
.end method

.method public final ֫(BLjava/lang/String;)B
    .locals 2

    const/16 v0, 0x12

    .line 452
    invoke-direct {p0, v0, p2}, Ll/ۨۤۡ;->ۧ(ILjava/lang/String;)[B

    move-result-object p2

    if-eqz p2, :cond_1

    .line 71
    array-length v0, p2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 74
    aget-byte p1, p2, p1

    :cond_1
    :goto_0
    return p1
.end method

.method public final ֫(ILjava/lang/String;)Z
    .locals 0

    .line 206
    invoke-direct {p0, p1, p2}, Ll/ۨۤۡ;->ۧ(ILjava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ljava/lang/String;[B)[B
    .locals 1

    const/16 v0, 0x19

    .line 452
    invoke-direct {p0, v0, p1}, Ll/ۨۤۡ;->ۧ(ILjava/lang/String;)[B

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    .line 137
    :cond_0
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)[I
    .locals 4

    const/16 v0, 0x1a

    .line 452
    invoke-direct {p0, v0, p1}, Ll/ۨۤۡ;->ۧ(ILjava/lang/String;)[B

    move-result-object p1

    if-eqz p1, :cond_2

    .line 143
    array-length v0, p1

    rem-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    goto :goto_1

    .line 146
    :cond_0
    array-length v0, p1

    div-int/lit8 v0, v0, 0x4

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    mul-int/lit8 v3, v2, 0x4

    .line 148
    invoke-static {v3, p1}, Ll/ܺܰۡ;->֫(I[B)I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 3

    const/16 v0, 0x1b

    .line 452
    invoke-direct {p0, v0, p1}, Ll/ۨۤۡ;->ۧ(ILjava/lang/String;)[B

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    .line 159
    :cond_0
    new-instance p2, Ll/۬ۜܽ;

    invoke-direct {p2, p1}, Ll/۬ۜܽ;-><init>([B)V

    .line 160
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p1

    new-array v0, p1, [Ljava/lang/String;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    .line 162
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
