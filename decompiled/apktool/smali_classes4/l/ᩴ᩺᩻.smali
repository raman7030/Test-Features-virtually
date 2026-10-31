.class public final Ll/ᩴ᩺᩻;
.super Ljava/lang/Object;
.source "W7A7"


# instance fields
.field public ֡:Ljava/util/HashMap;

.field public final ֨:Ljava/lang/Object;

.field public ֫:I

.field public ۖ:Ljava/util/HashSet;

.field public ۘ:Z

.field public final ۚ:Ll/ܶ᩵ܿ;

.field public final ۜ:Ljava/lang/Object;

.field public ۠:Ll/᩻᩺᩻;

.field public ۡ:Z

.field public final ۢ:Ll/ܶ᩵ܿ;

.field public ۧ:Ljava/lang/String;

.field public ܳ:Z

.field public final ܶ:Ljava/lang/Object;

.field public final ܺ:Ll/ܶ᩵ܿ;

.field public final ܽ:Ll/ܶ᩵ܿ;

.field public final ܿ:Ll/ܶ᩵ܿ;

.field public ᩳ:Z

.field public ᩴ:Z

.field public final ᩵:Ll/ܶ᩵ܿ;

.field public final ᩷:Ljava/util/HashMap;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩺᩻;->ܶ:Ljava/lang/Object;

    .line 54
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩺᩻;->ۜ:Ljava/lang/Object;

    .line 55
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩺᩻;->᩷:Ljava/util/HashMap;

    .line 57
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    .line 58
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩺᩻;->ۖ:Ljava/util/HashSet;

    const/4 v0, -0x1

    .line 65
    iput v0, p0, Ll/ᩴ᩺᩻;->֫:I

    .line 75
    iput-object p1, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    const-string v0, "x"

    .line 76
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ᩺᩻;->ۚ:Ll/ܶ᩵ܿ;

    const-string v0, "y"

    .line 77
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ᩺᩻;->᩵:Ll/ܶ᩵ܿ;

    const-string v0, "f"

    .line 78
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ᩺᩻;->ܺ:Ll/ܶ᩵ܿ;

    const-string v0, "complete.json"

    .line 79
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ᩺᩻;->ܽ:Ll/ܶ᩵ܿ;

    const-string v0, "complete.json.tmp"

    .line 80
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩺᩻;->ܿ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴ᩺᩻;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺᩻;->ۜ:Ljava/lang/Object;

    return-object p0
.end method

.method public static ֫(Ljava/util/List;)Ljava/lang/String;
    .locals 8

    .line 798
    :try_start_0
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 800
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ᩺᩻;

    .line 801
    iget-object v1, v1, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 802
    array-length v2, v1

    ushr-int/lit8 v3, v2, 0x18

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    ushr-int/lit8 v4, v2, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    ushr-int/lit8 v5, v2, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    const/4 v6, 0x4

    new-array v6, v6, [B

    const/4 v7, 0x0

    aput-byte v3, v6, v7

    const/4 v3, 0x1

    aput-byte v4, v6, v3

    const/4 v3, 0x2

    aput-byte v5, v6, v3

    const/4 v3, 0x3

    aput-byte v2, v6, v3

    .line 807
    invoke-virtual {v0, v6}, Ljava/security/MessageDigest;->update([B)V

    .line 808
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    goto :goto_0

    .line 810
    :cond_0
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 812
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ֫(Ll/ᩴ᩺᩻;I)Ll/ܶ᩵ܿ;
    .locals 0

    .line 793
    iget-object p0, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method private ֫(IIILandroid/util/SparseLongArray;)V
    .locals 2

    if-ltz p2, :cond_3

    if-lez p3, :cond_3

    .line 568
    invoke-virtual {p4, p1}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 571
    invoke-virtual {p4, v0}, Landroid/util/SparseLongArray;->valueAt(I)J

    move-result-wide v0

    goto :goto_0

    .line 793
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 574
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 577
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0

    .line 578
    invoke-virtual {p4, p1, v0, v1}, Landroid/util/SparseLongArray;->put(IJ)V

    :goto_0
    int-to-long p1, p2

    int-to-long p3, p3

    add-long/2addr p1, p3

    cmp-long p3, p1, v0

    if-gtz p3, :cond_1

    return-void

    .line 581
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Smali cache offset exceeds data file"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 575
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Missing smali cache data file"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 566
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid smali cache offset"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ljava/util/HashSet;)V
    .locals 5

    .line 539
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ܺ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 542
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    .line 543
    new-instance v1, Ll/ۘ᩺᩻;

    .line 999
    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 544
    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 545
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ll/ۘ᩺᩻;->position()I

    move-result v3

    array-length v4, v0

    if-ge v3, v4, :cond_1

    .line 546
    invoke-static {v2}, Ll/۫ۜᩳ;->֫(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 548
    :cond_1
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p1

    .line 544
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catch Ljava/io/EOFException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 549
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Damaged smali failure record"

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private ֫(Ll/ۖ᩺᩻;Ll/᩺ۖܽ;Ll/۬ۜᩳ;Ll/ۢ᩺᩻;)V
    .locals 6

    .line 624
    iget v1, p1, Ll/ۖ᩺᩻;->֫:I

    :goto_0
    if-eqz p4, :cond_0

    .line 642
    invoke-virtual {p4, v1}, Ll/ۢ᩺᩻;->֫(I)[B

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 670
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 671
    :try_start_0
    iget-object v2, p0, Ll/ᩴ᩺᩻;->᩷:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/Reference;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 673
    monitor-exit v0

    move-object v0, v3

    goto :goto_1

    .line 675
    :cond_1
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    if-eqz v2, :cond_2

    if-eqz p4, :cond_2

    .line 677
    invoke-virtual {p4, v1, v2}, Ll/ۢ᩺᩻;->֫(I[B)V

    .line 679
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    if-nez p4, :cond_4

    .line 652
    invoke-direct {p0, v1, v3}, Ll/ᩴ᩺᩻;->֫(ILl/ۢ᩺᩻;)[B

    move-result-object v0

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 654
    invoke-static {p4, v1, v0}, Ll/ۢ᩺᩻;->֫(Ll/ۢ᩺᩻;IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 656
    :try_start_1
    invoke-direct {p0, v1, p4}, Ll/ᩴ᩺᩻;->֫(ILl/ۢ᩺᩻;)[B

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 658
    invoke-static {v1, p4}, Ll/ۢ᩺᩻;->֫(ILl/ۢ᩺᩻;)V

    :goto_2
    if-eqz p4, :cond_7

    .line 625
    iget v1, p1, Ll/ۖ᩺᩻;->ܽ:I

    int-to-long v1, v1

    iget v3, p1, Ll/ۖ᩺᩻;->ۧ:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    array-length v3, v0

    int-to-long v3, v3

    cmp-long v5, v1, v3

    if-lez v5, :cond_7

    .line 627
    iget v1, p1, Ll/ۖ᩺᩻;->֫:I

    :cond_5
    const/4 v0, 0x1

    .line 688
    invoke-static {p4, v1, v0}, Ll/ۢ᩺᩻;->֫(Ll/ۢ᩺᩻;IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 690
    :try_start_2
    invoke-direct {p0, v1, p4}, Ll/ᩴ᩺᩻;->֫(ILl/ۢ᩺᩻;)[B

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 692
    invoke-static {v1, p4}, Ll/ۢ᩺᩻;->֫(ILl/ۢ᩺᩻;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    invoke-static {v1, p4}, Ll/ۢ᩺᩻;->֫(ILl/ۢ᩺᩻;)V

    .line 693
    throw p1

    .line 695
    :cond_6
    invoke-static {v1, p4}, Ll/ۢ᩺᩻;->ۧ(ILl/ۢ᩺᩻;)V

    .line 696
    invoke-virtual {p4, v1}, Ll/ۢ᩺᩻;->֫(I)[B

    move-result-object v0

    if-eqz v0, :cond_5

    .line 629
    :cond_7
    :goto_3
    iget p4, p1, Ll/ۖ᩺᩻;->ܽ:I

    int-to-long v1, p4

    iget p1, p1, Ll/ۖ᩺᩻;->ۧ:I

    int-to-long v3, p1

    add-long/2addr v1, v3

    array-length v3, v0

    int-to-long v3, v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_8

    .line 632
    invoke-virtual {p3, p4, p1, v0}, Ll/۬ۜᩳ;->֫(II[B)V

    .line 633
    invoke-virtual {p3}, Ll/۬ۜᩳ;->ܳ()[B

    move-result-object p1

    invoke-virtual {p3}, Ll/۬ۜᩳ;->᩻()I

    move-result p3

    invoke-static {p1, p3, p2}, Ll/ۛۖܽ;->֫([BILl/᩺ۖܽ;)V

    return-void

    .line 630
    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Smali cache data range is invalid"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 658
    invoke-static {v1, p4}, Ll/ۢ᩺᩻;->֫(ILl/ۢ᩺᩻;)V

    .line 659
    throw p1

    .line 661
    :cond_9
    invoke-static {v1, p4}, Ll/ۢ᩺᩻;->ۧ(ILl/ۢ᩺᩻;)V

    goto/16 :goto_0

    :catchall_2
    move-exception p1

    .line 680
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1
.end method

.method private ֫(Ll/ܶ᩵ܿ;ZLjava/util/HashMap;Landroid/util/SparseLongArray;)V
    .locals 7

    .line 519
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 522
    :cond_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object p1

    .line 523
    new-instance v0, Ll/ۘ᩺᩻;

    .line 999
    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 524
    :try_start_0
    new-instance v1, Ljava/io/DataInputStream;

    invoke-direct {v1, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 525
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ll/ۘ᩺᩻;->position()I

    move-result v2

    array-length v3, p1

    if-ge v2, v3, :cond_3

    if-eqz p2, :cond_1

    .line 157
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 554
    :cond_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    if-ltz v2, :cond_2

    const/high16 v3, 0x100000

    if-gt v2, v3, :cond_2

    .line 558
    new-array v2, v2, [B

    .line 559
    invoke-virtual {v1, v2}, Ljava/io/DataInputStream;->readFully([B)V

    .line 560
    new-instance v3, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object v2, v3

    .line 527
    :goto_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v3

    .line 528
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v4

    .line 529
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v5

    .line 530
    invoke-direct {p0, v3, v4, v5, p4}, Ll/ᩴ᩺᩻;->֫(IIILandroid/util/SparseLongArray;)V

    .line 531
    new-instance v6, Ll/ۖ᩺᩻;

    invoke-direct {v6, v3, v4, v5}, Ll/ۖ᩺᩻;-><init>(III)V

    invoke-virtual {p3, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 556
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid smali record name length"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 533
    :cond_3
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p1

    .line 524
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_4
    .catch Ljava/io/EOFException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 534
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Damaged smali offset record"

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private ֫(ILl/ۢ᩺᩻;)[B
    .locals 5

    .line 793
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 707
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v1

    .line 708
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 709
    :try_start_0
    iget-object v2, p0, Ll/ᩴ᩺᩻;->᩷:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ljava/lang/ref/SoftReference;

    invoke-direct {v4, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 710
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_0

    .line 712
    invoke-static {p2}, Ll/ۢ᩺᩻;->֫(Ll/ۢ᩺᩻;)V

    .line 713
    invoke-virtual {p2, p1, v1}, Ll/ۢ᩺᩻;->֫(I[B)V

    :cond_0
    return-object v1

    :catchall_0
    move-exception p1

    .line 710
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ۖ()Ll/ۡ᩺᩻;
    .locals 5

    .line 488
    :try_start_0
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ܺ()V

    .line 489
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-static {}, Ll/᩷᩺᩻;->֫()Ll/᩷᩺᩻;

    move-result-object v2

    .line 1057
    new-instance v3, Ll/ۡ᩺᩻;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0, v1, v2}, Ll/ۡ᩺᩻;-><init>(ZLjava/util/HashMap;Ljava/util/HashSet;Ll/᩷᩺᩻;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    .line 1064
    :catch_0
    new-instance v0, Ll/ۡ᩺᩻;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-static {}, Ll/᩷᩺᩻;->֫()Ll/᩷᩺᩻;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ۡ᩺᩻;-><init>(ZLjava/util/HashMap;Ljava/util/HashSet;Ll/᩷᩺᩻;)V

    return-object v0
.end method

.method private ۜ()Z
    .locals 5

    .line 420
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 421
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ᩴ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 423
    :try_start_1
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 425
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 426
    monitor-exit v0

    return v2

    .line 429
    :cond_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-eqz v1, :cond_1

    .line 430
    monitor-exit v0

    return v2

    .line 432
    :cond_1
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۘ:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    .line 433
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    xor-int/2addr v1, v3

    monitor-exit v0

    return v1

    .line 435
    :cond_2
    iput-boolean v3, p0, Ll/ᩴ᩺᩻;->ᩴ:Z

    .line 436
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 440
    :try_start_3
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۢ()Ll/ۡ᩺᩻;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :goto_1
    move-object v1, v0

    goto :goto_2

    .line 442
    :catch_1
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۖ()Ll/ۡ᩺᩻;

    move-result-object v0

    goto :goto_1

    .line 445
    :goto_2
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 446
    :try_start_4
    iput-boolean v2, p0, Ll/ᩴ᩺᩻;->ᩴ:Z

    .line 447
    iget-boolean v4, v1, Ll/ۡ᩺᩻;->ᩳ:Z

    if-eqz v4, :cond_3

    .line 448
    iput-boolean v3, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    .line 449
    iput-boolean v2, p0, Ll/ᩴ᩺᩻;->᩻:Z

    .line 450
    iput-boolean v3, p0, Ll/ᩴ᩺᩻;->ۘ:Z

    .line 451
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->᩻()V

    goto :goto_3

    .line 453
    :cond_3
    iget-object v4, v1, Ll/ۡ᩺᩻;->ܳ:Ljava/util/HashMap;

    iput-object v4, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    .line 454
    iget-object v4, v1, Ll/ۡ᩺᩻;->ܿ:Ljava/util/HashSet;

    iput-object v4, p0, Ll/ᩴ᩺᩻;->ۖ:Ljava/util/HashSet;

    .line 455
    iget-boolean v4, v1, Ll/ۡ᩺᩻;->ܽ:Z

    iput-boolean v4, p0, Ll/ᩴ᩺᩻;->ᩳ:Z

    .line 456
    iget v4, v1, Ll/ۡ᩺᩻;->֫:I

    iput v4, p0, Ll/ᩴ᩺᩻;->֫:I

    .line 457
    iget-object v1, v1, Ll/ۡ᩺᩻;->ۧ:Ljava/lang/String;

    iput-object v1, p0, Ll/ᩴ᩺᩻;->ۧ:Ljava/lang/String;

    .line 458
    iput-boolean v3, p0, Ll/ᩴ᩺᩻;->ۘ:Z

    .line 459
    iput-boolean v2, p0, Ll/ᩴ᩺᩻;->᩻:Z

    .line 460
    iput-boolean v2, p0, Ll/ᩴ᩺᩻;->ܳ:Z

    .line 462
    :goto_3
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 463
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v1, :cond_4

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-nez v1, :cond_4

    const/4 v2, 0x1

    :cond_4
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    .line 464
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 436
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method

.method private ۡ()V
    .locals 5

    .line 731
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ܶ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 733
    :try_start_0
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ܺ()V

    .line 734
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 735
    :try_start_1
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->᩻()V

    .line 736
    iput-boolean v3, p0, Ll/ᩴ᩺᩻;->ۘ:Z

    .line 737
    iput-boolean v2, p0, Ll/ᩴ᩺᩻;->᩻:Z

    .line 738
    iput-boolean v2, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    .line 739
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    goto :goto_1

    .line 741
    :catch_0
    :try_start_3
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 742
    :try_start_4
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->᩻()V

    .line 743
    iput-boolean v3, p0, Ll/ᩴ᩺᩻;->ۘ:Z

    .line 744
    iput-boolean v2, p0, Ll/ᩴ᩺᩻;->᩻:Z

    .line 745
    iput-boolean v3, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    .line 746
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 748
    :goto_0
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    return-void

    :catchall_2
    move-exception v2

    .line 746
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    throw v2

    .line 748
    :goto_1
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw v1
.end method

.method private ۢ()Ll/ۡ᩺᩻;
    .locals 9

    .line 468
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 469
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 470
    new-instance v2, Landroid/util/SparseLongArray;

    invoke-direct {v2}, Landroid/util/SparseLongArray;-><init>()V

    .line 499
    :try_start_0
    iget-object v3, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    invoke-static {v3}, Ll/۫ۜᩳ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    .line 473
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ܺ()V

    .line 474
    invoke-static {}, Ll/᩷᩺᩻;->֫()Ll/᩷᩺᩻;

    move-result-object v2

    .line 1057
    new-instance v3, Ll/ۡ᩺᩻;

    invoke-direct {v3, v4, v0, v1, v2}, Ll/ۡ᩺᩻;-><init>(ZLjava/util/HashMap;Ljava/util/HashSet;Ll/᩷᩺᩻;)V

    return-object v3

    .line 476
    :cond_0
    iget-object v3, p0, Ll/ᩴ᩺᩻;->ۚ:Ll/ܶ᩵ܿ;

    const/4 v5, 0x1

    invoke-direct {p0, v3, v5, v0, v2}, Ll/ᩴ᩺᩻;->֫(Ll/ܶ᩵ܿ;ZLjava/util/HashMap;Landroid/util/SparseLongArray;)V

    .line 477
    iget-object v3, p0, Ll/ᩴ᩺᩻;->᩵:Ll/ܶ᩵ܿ;

    invoke-direct {p0, v3, v4, v0, v2}, Ll/ᩴ᩺᩻;->֫(Ll/ܶ᩵ܿ;ZLjava/util/HashMap;Landroid/util/SparseLongArray;)V

    .line 478
    invoke-direct {p0, v1}, Ll/ᩴ᩺᩻;->֫(Ljava/util/HashSet;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 586
    iget-object v2, p0, Ll/ᩴ᩺᩻;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    iget-object v6, p0, Ll/ᩴ᩺᩻;->ܽ:Ll/ܶ᩵ܿ;

    if-eqz v3, :cond_2

    .line 587
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    .line 588
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 589
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۬()Z

    .line 591
    :cond_1
    invoke-static {}, Ll/᩷᩺᩻;->֫()Ll/᩷᩺᩻;

    move-result-object v2

    goto :goto_2

    .line 593
    :cond_2
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-nez v2, :cond_3

    .line 594
    invoke-static {}, Ll/᩷᩺᩻;->֫()Ll/᩷᩺᩻;

    move-result-object v2

    goto :goto_2

    .line 597
    :cond_3
    :try_start_1
    new-instance v2, Lbin/mt/json/JSONObject;

    new-instance v3, Ljava/lang/String;

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v7

    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v7, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {v2, v3}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v3, "schemaVersion"

    const/4 v7, -0x1

    .line 598
    invoke-virtual {v2, v3, v7}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    if-ne v3, v5, :cond_7

    const-string v3, "outputVersion"

    .line 599
    invoke-virtual {v2, v3, v7}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    if-eq v3, v5, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "candidateCount"

    .line 603
    invoke-virtual {v2, v3, v7}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    const-string v7, "candidateDigest"

    const/4 v8, 0x0

    .line 604
    invoke-virtual {v2, v7, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-ltz v3, :cond_6

    if-eqz v2, :cond_6

    .line 605
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_0

    .line 609
    :cond_5
    new-instance v7, Ll/᩷᩺᩻;

    invoke-direct {v7, v3, v2, v5}, Ll/᩷᩺᩻;-><init>(ILjava/lang/String;Z)V

    move-object v2, v7

    goto :goto_2

    .line 606
    :cond_6
    :goto_0
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۬()Z

    .line 607
    invoke-static {}, Ll/᩷᩺᩻;->֫()Ll/᩷᩺᩻;

    move-result-object v2

    goto :goto_2

    .line 600
    :cond_7
    :goto_1
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۬()Z

    .line 601
    invoke-static {}, Ll/᩷᩺᩻;->֫()Ll/᩷᩺᩻;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 611
    :catch_0
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۬()Z

    .line 612
    invoke-static {}, Ll/᩷᩺᩻;->֫()Ll/᩷᩺᩻;

    move-result-object v2

    .line 1057
    :goto_2
    new-instance v3, Ll/ۡ᩺᩻;

    invoke-direct {v3, v4, v0, v1, v2}, Ll/ۡ᩺᩻;-><init>(ZLjava/util/HashMap;Ljava/util/HashSet;Ll/᩷᩺᩻;)V

    return-object v3

    .line 480
    :catch_1
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۖ()Ll/ۡ᩺᩻;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴ᩺᩻;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺᩻;->᩷:Ljava/util/HashMap;

    return-object p0
.end method

.method private ۧ(Ljava/util/List;)Z
    .locals 2

    .line 404
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ᩺᩻;

    .line 405
    iget-object v0, v0, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    .line 406
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ᩴ᩺᩻;->ۖ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private ܺ()V
    .locals 3

    .line 780
    iget-object v0, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    if-eqz v0, :cond_0

    .line 781
    invoke-virtual {v0}, Ll/᩻᩺᩻;->֫()V

    const/4 v0, 0x0

    .line 782
    iput-object v0, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    .line 753
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 754
    :try_start_0
    iget-object v1, p0, Ll/ᩴ᩺᩻;->᩷:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 755
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 756
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 759
    :cond_1
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    const/4 v1, 0x1

    .line 413
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 760
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 761
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    .line 762
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unable to delete smali cache file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 514
    :cond_4
    :goto_1
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/۫ۜᩳ;->ۧ(Ll/ܶ᩵ܿ;)V

    return-void

    :catchall_0
    move-exception v1

    .line 755
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static bridge synthetic ܽ(Ll/ᩴ᩺᩻;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺᩻;->ܺ:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ᩴ᩺᩻;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺᩻;->ۚ:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴ᩺᩻;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩺᩻;->᩵:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method private ᩷()Z
    .locals 2

    .line 414
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 415
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 416
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private ᩻()V
    .locals 2

    .line 768
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    .line 769
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩺᩻;->ۖ:Ljava/util/HashSet;

    const/4 v0, 0x0

    .line 770
    iput-boolean v0, p0, Ll/ᩴ᩺᩻;->ᩳ:Z

    .line 771
    iput-boolean v0, p0, Ll/ᩴ᩺᩻;->ܳ:Z

    const/4 v0, -0x1

    .line 772
    iput v0, p0, Ll/ᩴ᩺᩻;->֫:I

    const/4 v0, 0x0

    .line 773
    iput-object v0, p0, Ll/ᩴ᩺᩻;->ۧ:Ljava/lang/String;

    .line 774
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ۜ:Ljava/lang/Object;

    monitor-enter v0

    .line 775
    :try_start_0
    iget-object v1, p0, Ll/ᩴ᩺᩻;->᩷:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 776
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/۬ۜᩳ;)Ll/ܺ᩺᩻;
    .locals 4

    .line 88
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    invoke-virtual {p0}, Ll/ᩴ᩺᩻;->ۧ()Z

    move-result p1

    invoke-static {p1}, Ll/ܺ᩺᩻;->֫(Z)Ll/ܺ᩺᩻;

    move-result-object p1

    return-object p1

    .line 91
    :cond_0
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۜ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 92
    invoke-virtual {p0}, Ll/ᩴ᩺᩻;->ۧ()Z

    move-result p1

    invoke-static {p1}, Ll/ܺ᩺᩻;->֫(Z)Ll/ܺ᩺᩻;

    move-result-object p1

    return-object p1

    .line 95
    :cond_1
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 96
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    const/4 v2, 0x0

    if-nez v1, :cond_4

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-eqz v1, :cond_2

    goto :goto_0

    .line 99
    :cond_2
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖ᩺᩻;

    .line 100
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_3

    .line 102
    invoke-static {v2}, Ll/ܺ᩺᩻;->֫(Z)Ll/ܺ᩺᩻;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 v0, 0x1

    .line 617
    :try_start_1
    new-instance v1, Ll/᩺ۖܽ;

    invoke-direct {v1}, Ll/᩺ۖܽ;-><init>()V

    const/4 v3, 0x0

    .line 618
    invoke-direct {p0, p1, v1, p2, v3}, Ll/ᩴ᩺᩻;->֫(Ll/ۖ᩺᩻;Ll/᩺ۖܽ;Ll/۬ۜᩳ;Ll/ۢ᩺᩻;)V

    .line 619
    invoke-virtual {v1}, Ll/᩺ۖܽ;->toString()Ljava/lang/String;

    move-result-object p1

    .line 838
    new-instance p2, Ll/ܺ᩺᩻;

    invoke-direct {p2, p1, v0, v2}, Ll/ܺ᩺᩻;-><init>(Ljava/lang/String;ZZ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p2

    .line 108
    :catch_0
    invoke-virtual {p0}, Ll/ᩴ᩺᩻;->ᩳ()V

    .line 109
    invoke-static {v0}, Ll/ܺ᩺᩻;->֫(Z)Ll/ܺ᩺᩻;

    move-result-object p1

    return-object p1

    .line 97
    :cond_4
    :goto_0
    :try_start_2
    invoke-static {v2}, Ll/ܺ᩺᩻;->֫(Z)Ll/ܺ᩺᩻;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 100
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ll/᩺ۖܽ;Ll/۬ۜᩳ;Ll/ۢ᩺᩻;)Ll/ܺ᩺᩻;
    .locals 3

    .line 142
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    invoke-virtual {p0}, Ll/ᩴ᩺᩻;->ۧ()Z

    move-result p1

    invoke-static {p1}, Ll/ܺ᩺᩻;->֫(Z)Ll/ܺ᩺᩻;

    move-result-object p1

    return-object p1

    .line 145
    :cond_0
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۜ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 146
    invoke-virtual {p0}, Ll/ᩴ᩺᩻;->ۧ()Z

    move-result p1

    invoke-static {p1}, Ll/ܺ᩺᩻;->֫(Z)Ll/ܺ᩺᩻;

    move-result-object p1

    return-object p1

    .line 149
    :cond_1
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 150
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    const/4 v2, 0x0

    if-nez v1, :cond_4

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-eqz v1, :cond_2

    goto :goto_0

    .line 153
    :cond_2
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖ᩺᩻;

    .line 154
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_3

    .line 156
    invoke-static {v2}, Ll/ܺ᩺᩻;->֫(Z)Ll/ܺ᩺᩻;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 v0, 0x1

    .line 159
    :try_start_1
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ᩴ᩺᩻;->֫(Ll/ۖ᩺᩻;Ll/᩺ۖܽ;Ll/۬ۜᩳ;Ll/ۢ᩺᩻;)V

    .line 838
    new-instance p1, Ll/ܺ᩺᩻;

    const/4 p3, 0x0

    invoke-direct {p1, p3, v0, v2}, Ll/ܺ᩺᩻;-><init>(Ljava/lang/String;ZZ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    .line 162
    :catch_0
    invoke-virtual {p2}, Ll/᩺ۖܽ;->ܽ()V

    .line 166
    invoke-static {v0}, Ll/ܺ᩺᩻;->֫(Z)Ll/ܺ᩺᩻;

    move-result-object p1

    return-object p1

    .line 151
    :cond_4
    :goto_0
    :try_start_2
    invoke-static {v2}, Ll/ܺ᩺᩻;->֫(Z)Ll/ܺ᩺᩻;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 154
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫()V
    .locals 2

    .line 350
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ܶ:Ljava/lang/Object;

    monitor-enter v0

    .line 780
    :try_start_0
    iget-object v1, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    if-eqz v1, :cond_0

    .line 781
    invoke-virtual {v1}, Ll/᩻᩺᩻;->֫()V

    const/4 v1, 0x0

    .line 782
    iput-object v1, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    .line 352
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 4

    .line 243
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۜ()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 246
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 247
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v1, :cond_7

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-nez v1, :cond_7

    iget-object v1, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Ll/ᩴ᩺᩻;->ۖ:Ljava/util/HashSet;

    .line 248
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    .line 251
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 252
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ܶ:Ljava/lang/Object;

    monitor-enter v0

    .line 253
    :try_start_1
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 254
    :try_start_2
    iget-boolean v3, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v3, :cond_6

    iget-boolean v3, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-nez v3, :cond_6

    iget-object v3, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, p0, Ll/ᩴ᩺᩻;->ۖ:Ljava/util/HashSet;

    .line 255
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    .line 258
    :cond_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 719
    :try_start_3
    iget-object v1, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    if-nez v1, :cond_3

    .line 720
    iget-object v1, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 721
    new-instance v1, Ll/᩻᩺᩻;

    invoke-direct {v1, p0}, Ll/᩻᩺᩻;-><init>(Ll/ᩴ᩺᩻;)V

    iput-object v1, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    .line 723
    :cond_3
    iget-object v1, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    .line 260
    invoke-virtual {v1, p1}, Ll/᩻᩺᩻;->֫(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 265
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 266
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 267
    :try_start_5
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v1, :cond_5

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-nez v1, :cond_5

    iget-object v1, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    .line 270
    :cond_4
    iget-object v1, p0, Ll/ᩴ᩺᩻;->ۖ:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    .line 271
    monitor-exit v0

    return p1

    .line 268
    :cond_5
    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    .line 272
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1

    .line 727
    :catch_0
    :try_start_6
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۡ()V

    .line 263
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_1
    return v2

    .line 256
    :cond_6
    :goto_2
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    return v2

    :catchall_1
    move-exception p1

    .line 258
    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw p1

    :catchall_2
    move-exception p1

    .line 265
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    throw p1

    .line 249
    :cond_7
    :goto_3
    :try_start_b
    monitor-exit v0

    return v2

    :catchall_3
    move-exception p1

    .line 251
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    throw p1
.end method

.method public final ֫(Ljava/util/ArrayList;)Z
    .locals 4

    .line 291
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۜ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 294
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 397
    :try_start_0
    iget-boolean v2, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v2, :cond_1

    iget-boolean v2, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-nez v2, :cond_1

    iget-boolean v2, p0, Ll/ᩴ᩺᩻;->ᩳ:Z

    if-eqz v2, :cond_1

    iget v2, p0, Ll/ᩴ᩺᩻;->֫:I

    .line 398
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v2, v3, :cond_1

    .line 399
    invoke-static {p1}, Ll/ᩴ᩺᩻;->֫(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ll/ᩴ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 400
    invoke-direct {p0, p1}, Ll/ᩴ᩺᩻;->ۧ(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    .line 295
    :cond_1
    iput-boolean v1, p0, Ll/ᩴ᩺᩻;->ܳ:Z

    .line 296
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    .line 297
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ۜ᩺᩻;
    .locals 2

    .line 174
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    sget-object p1, Ll/ۜ᩺᩻;->ۗ:Ll/ۜ᩺᩻;

    return-object p1

    .line 177
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 178
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v1, :cond_4

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-eqz v1, :cond_1

    goto :goto_0

    .line 181
    :cond_1
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 182
    sget-object p1, Ll/ۜ᩺᩻;->ۙ:Ll/ۜ᩺᩻;

    monitor-exit v0

    return-object p1

    .line 184
    :cond_2
    iget-object v1, p0, Ll/ᩴ᩺᩻;->ۖ:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 185
    sget-object p1, Ll/ۜ᩺᩻;->᩹:Ll/ۜ᩺᩻;

    monitor-exit v0

    return-object p1

    .line 187
    :cond_3
    sget-object p1, Ll/ۜ᩺᩻;->᩶:Ll/ۜ᩺᩻;

    monitor-exit v0

    return-object p1

    .line 179
    :cond_4
    :goto_0
    sget-object p1, Ll/ۜ᩺᩻;->ۗ:Ll/ۜ᩺᩻;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 188
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ(Ljava/util/ArrayList;)V
    .locals 8

    .line 304
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 307
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ܶ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v2, 0x0

    .line 780
    :try_start_0
    iget-object v1, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    if-eqz v1, :cond_1

    .line 781
    invoke-virtual {v1}, Ll/᩻᩺᩻;->֫()V

    .line 782
    iput-object v2, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    .line 310
    :cond_1
    iget-object v1, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 311
    invoke-static {p1}, Ll/ᩴ᩺᩻;->֫(Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    .line 312
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 313
    :try_start_1
    iget-boolean v4, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v4, :cond_8

    iget-boolean v4, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-nez v4, :cond_8

    invoke-direct {p0, p1}, Ll/ᩴ᩺᩻;->ۧ(Ljava/util/List;)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_2

    .line 317
    :cond_2
    iget-object v4, p0, Ll/ᩴ᩺᩻;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, p0, Ll/ᩴ᩺᩻;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    .line 318
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v3, "Unable to delete stale complete temp file"

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 320
    :cond_4
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "schemaVersion"

    const/4 v6, 0x1

    .line 321
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "outputVersion"

    .line 322
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "candidateCount"

    .line 323
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual {v4, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "candidateDigest"

    .line 324
    invoke-virtual {v4, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 325
    iget-object v5, p0, Ll/ᩴ᩺᩻;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    invoke-virtual {v5, v4}, Ll/ܶ᩵ܿ;->֫([B)V

    .line 326
    iget-object v4, p0, Ll/ᩴ᩺᩻;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, p0, Ll/ᩴ᩺᩻;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_1

    .line 327
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string v3, "Unable to replace complete file"

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 329
    :cond_6
    :goto_1
    iget-object v4, p0, Ll/ᩴ᩺᩻;->ܿ:Ll/ܶ᩵ܿ;

    iget-object v5, p0, Ll/ᩴ᩺᩻;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v4, v5}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 332
    iput-boolean v6, p0, Ll/ᩴ᩺᩻;->ᩳ:Z

    .line 333
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Ll/ᩴ᩺᩻;->֫:I

    .line 334
    iput-object v3, p0, Ll/ᩴ᩺᩻;->ۧ:Ljava/lang/String;

    .line 335
    iput-boolean v6, p0, Ll/ᩴ᩺᩻;->ܳ:Z

    .line 336
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    .line 330
    :cond_7
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string v3, "Unable to publish complete file"

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 314
    :cond_8
    :goto_2
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    .line 337
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p1

    goto :goto_4

    .line 780
    :catch_0
    :try_start_7
    iget-object p1, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    if-eqz p1, :cond_9

    .line 781
    invoke-virtual {p1}, Ll/᩻᩺᩻;->֫()V

    .line 782
    iput-object v2, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    .line 787
    :cond_9
    iget-object p1, p0, Ll/ᩴ᩺᩻;->ܿ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 788
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 341
    :cond_a
    monitor-exit v0

    :goto_3
    return-void

    .line 343
    :goto_4
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw p1
.end method

.method public final ۧ()Z
    .locals 2

    .line 373
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 374
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 375
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ(Ljava/lang/String;Ll/۬ۜᩳ;)Z
    .locals 4

    .line 196
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۜ()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 199
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 200
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v1, :cond_8

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-nez v1, :cond_8

    iget-object v1, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_3

    .line 203
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 204
    invoke-virtual {p2}, Ll/۬ۜᩳ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 206
    invoke-virtual {p0, p1}, Ll/ᩴ᩺᩻;->֫(Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 210
    :cond_2
    :try_start_1
    invoke-virtual {p2}, Ll/۬ۜᩳ;->֫()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 215
    iget-object v0, p0, Ll/ᩴ᩺᩻;->ܶ:Ljava/lang/Object;

    monitor-enter v0

    .line 216
    :try_start_2
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 217
    :try_start_3
    iget-boolean v3, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v3, :cond_7

    iget-boolean v3, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-nez v3, :cond_7

    iget-object v3, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    .line 220
    :cond_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 719
    :try_start_4
    iget-object v1, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    if-nez v1, :cond_4

    .line 720
    iget-object v1, p0, Ll/ᩴ᩺᩻;->ۢ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 721
    new-instance v1, Ll/᩻᩺᩻;

    invoke-direct {v1, p0}, Ll/᩻᩺᩻;-><init>(Ll/ᩴ᩺᩻;)V

    iput-object v1, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    .line 723
    :cond_4
    iget-object v1, p0, Ll/ᩴ᩺᩻;->۠:Ll/᩻᩺᩻;

    .line 223
    invoke-virtual {v1, p1, p2}, Ll/᩻᩺᩻;->֫(Ljava/lang/String;Ll/۬ۜᩳ;)Ll/ۖ᩺᩻;

    move-result-object p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 228
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 229
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 230
    :try_start_6
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v1, :cond_6

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-nez v1, :cond_6

    iget-object v1, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_0

    .line 233
    :cond_5
    iget-object v1, p0, Ll/ᩴ᩺᩻;->֡:Ljava/util/HashMap;

    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    iget-object p2, p0, Ll/ᩴ᩺᩻;->ۖ:Ljava/util/HashSet;

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    .line 235
    monitor-exit v0

    return p1

    .line 231
    :cond_6
    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    .line 236
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1

    .line 727
    :catch_0
    :try_start_7
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۡ()V

    .line 226
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_1
    return v2

    .line 218
    :cond_7
    :goto_2
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    return v2

    :catchall_1
    move-exception p1

    .line 220
    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :try_start_b
    throw p1

    :catchall_2
    move-exception p1

    .line 228
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    throw p1

    :catch_1
    return v2

    .line 201
    :cond_8
    :goto_3
    :try_start_c
    monitor-exit v0

    return v2

    :catchall_3
    move-exception p1

    .line 203
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    throw p1
.end method

.method public final ܳ()Z
    .locals 2

    .line 391
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 392
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۘ:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ܳ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 393
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()Z
    .locals 2

    .line 382
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 383
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 384
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܿ()V
    .locals 2

    .line 279
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 280
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 283
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    invoke-direct {p0}, Ll/ᩴ᩺᩻;->ۡ()V

    return-void

    .line 281
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 283
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩳ()V
    .locals 2

    .line 359
    iget-object v0, p0, Ll/ᩴ᩺᩻;->֨:Ljava/lang/Object;

    monitor-enter v0

    .line 360
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->ۡ:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 363
    iput-boolean v1, p0, Ll/ᩴ᩺᩻;->᩻:Z

    const/4 v1, 0x0

    .line 364
    iput-boolean v1, p0, Ll/ᩴ᩺᩻;->ܳ:Z

    .line 365
    monitor-exit v0

    return-void

    .line 361
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 366
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
