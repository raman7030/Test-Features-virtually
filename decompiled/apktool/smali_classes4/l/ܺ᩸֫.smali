.class public final Ll/ܺ᩸֫;
.super Ljava/lang/Object;
.source "M74O"

# interfaces
.implements Ll/᩸ܶ֫;


# static fields
.field public static final ۡ:Ljava/util/HashSet;


# instance fields
.field public final ֫:Ljava/io/File;

.field public ۜ:Z

.field public ۢ:J

.field public final ۧ:Ll/ܿ᩸֫;

.field public final ܳ:Ljava/util/HashMap;

.field public final ܽ:Ll/᩷᩸֫;

.field public ܿ:Ll/۠ܶ֫;

.field public final ᩳ:Ll/ۛܶ֫;

.field public final ᩷:Z

.field public final ᩻:Ljava/util/Random;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 65
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Ll/ܺ᩸֫;->ۡ:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ll/᩷᩸֫;Ll/᩷۠֫;)V
    .locals 4

    .line 196
    new-instance v1, Ll/ܿ᩸֫;

    invoke-direct {v1, p3, p1}, Ll/ܿ᩸֫;-><init>(Ll/᩷۠֫;Ljava/io/File;)V

    .line 206
    new-instance v2, Ll/ۛܶ֫;

    invoke-direct {v2, p3}, Ll/ۛܶ֫;-><init>(Ll/᩷۠֫;)V

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    const-class p3, Ll/ܺ᩸֫;

    move-object v0, p3

    monitor-enter v0

    .line 817
    :try_start_0
    sget-object p3, Ll/ܺ᩸֫;->ۡ:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz p3, :cond_0

    .line 219
    iput-object p1, p0, Ll/ܺ᩸֫;->֫:Ljava/io/File;

    .line 220
    iput-object p2, p0, Ll/ܺ᩸֫;->ܽ:Ll/᩷᩸֫;

    .line 221
    iput-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    .line 222
    iput-object v2, p0, Ll/ܺ᩸֫;->ᩳ:Ll/ۛܶ֫;

    .line 223
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ܺ᩸֫;->ܳ:Ljava/util/HashMap;

    .line 224
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Ll/ܺ᩸֫;->᩻:Ljava/util/Random;

    const/4 p1, 0x1

    .line 225
    iput-boolean p1, p0, Ll/ܺ᩸֫;->᩷:Z

    const-wide/16 p1, -0x1

    .line 226
    iput-wide p1, p0, Ll/ܺ᩸֫;->ۢ:J

    .line 229
    new-instance p1, Landroid/os/ConditionVariable;

    invoke-direct {p1}, Landroid/os/ConditionVariable;-><init>()V

    .line 230
    new-instance p2, Ll/ۡ᩸֫;

    invoke-direct {p2, p0, p1}, Ll/ۡ᩸֫;-><init>(Ll/ܺ᩸֫;Landroid/os/ConditionVariable;)V

    .line 239
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 240
    invoke-virtual {p1}, Landroid/os/ConditionVariable;->block()V

    return-void

    .line 216
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Another SimpleCache instance uses the folder: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :catchall_0
    move-exception p1

    .line 817
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ljava/lang/String;Ll/ۖ᩸֫;)Ll/ۖ᩸֫;
    .locals 9

    .line 636
    iget-boolean v0, p0, Ll/ܺ᩸֫;->᩷:Z

    if-nez v0, :cond_0

    return-object p2

    .line 639
    :cond_0
    iget-object v0, p2, Ll/᩺ܶ֫;->᩸:Ljava/io/File;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    .line 640
    iget-wide v3, p2, Ll/᩺ܶ֫;->ۗ:J

    .line 641
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 643
    iget-object v1, p0, Ll/ܺ᩸֫;->ᩳ:Ll/ۛܶ֫;

    if-eqz v1, :cond_1

    move-wide v5, v7

    .line 645
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Ll/ۛܶ֫;->֫(Ljava/lang/String;JJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Failed to update index with new touch timestamp."

    .line 647
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    .line 654
    :goto_1
    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    .line 655
    invoke-virtual {v1, p1}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    invoke-virtual {p1, p2, v7, v8, v0}, Ll/֫᩸֫;->֫(Ll/ۖ᩸֫;JZ)Ll/ۖ᩸֫;

    move-result-object p1

    .line 757
    iget-object v0, p0, Ll/ܺ᩸֫;->ܳ:Ljava/util/HashMap;

    iget-object v1, p2, Ll/᩺ܶ֫;->᩶:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 759
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_2
    if-ltz v1, :cond_2

    .line 760
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶܶ֫;

    invoke-interface {v2, p0, p2, p1}, Ll/ܶܶ֫;->֫(Ll/ܺ᩸֫;Ll/᩺ܶ֫;Ll/᩺ܶ֫;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    .line 763
    :cond_2
    iget-object v0, p0, Ll/ܺ᩸֫;->ܽ:Ll/᩷᩸֫;

    invoke-virtual {v0, p0, p2, p1}, Ll/᩷᩸֫;->֫(Ll/ܺ᩸֫;Ll/᩺ܶ֫;Ll/᩺ܶ֫;)V

    return-object p1
.end method

.method public static bridge synthetic ֫(Ll/ܺ᩸֫;)Ll/۫ܶ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ᩸֫;->ܽ:Ll/᩷᩸֫;

    return-object p0
.end method

.method public static ֫(Ljava/io/File;)V
    .locals 2

    .line 809
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 810
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to create cache directory: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 811
    invoke-static {p0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    .line 812
    new-instance v0, Ll/۠ܶ֫;

    .line 84
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 812
    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method private ֫(Ljava/io/File;Z[Ljava/io/File;Ljava/util/Map;)V
    .locals 9

    if-eqz p3, :cond_7

    .line 588
    array-length v0, p3

    if-nez v0, :cond_0

    goto :goto_4

    .line 597
    :cond_0
    array-length p1, p3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_8

    aget-object v8, p3, v1

    .line 598
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    if-eqz p2, :cond_1

    const/16 v3, 0x2e

    .line 599
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 600
    invoke-virtual {v8}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    invoke-direct {p0, v8, v0, v2, p4}, Ll/ܺ᩸֫;->֫(Ljava/io/File;Z[Ljava/io/File;Ljava/util/Map;)V

    goto :goto_3

    :cond_1
    if-eqz p2, :cond_2

    const-string v3, "cached_content_index.exi"

    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, ".uid"

    .line 603
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    if-eqz p4, :cond_3

    .line 610
    invoke-interface {p4, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤܶ֫;

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_4

    .line 612
    iget-wide v3, v2, Ll/ۤܶ֫;->ۧ:J

    .line 613
    iget-wide v5, v2, Ll/ۤܶ֫;->֫:J

    goto :goto_2

    :cond_4
    const-wide/16 v2, -0x1

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v5, v4

    move-wide v3, v2

    .line 616
    :goto_2
    iget-object v7, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    move-object v2, v8

    .line 617
    invoke-static/range {v2 .. v7}, Ll/ۖ᩸֫;->֫(Ljava/io/File;JJLl/ܿ᩸֫;)Ll/ۖ᩸֫;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 619
    invoke-direct {p0, v2}, Ll/ܺ᩸֫;->֫(Ll/ۖ᩸֫;)V

    goto :goto_3

    .line 621
    :cond_5
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    :cond_6
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    :goto_4
    if-nez p2, :cond_8

    .line 593
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_8
    return-void
.end method

.method private ֫(Ll/ۖ᩸֫;)V
    .locals 3

    .line 693
    iget-object v0, p1, Ll/᩺ܶ֫;->᩶:Ljava/lang/String;

    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v1, v0}, Ll/ܿ᩸֫;->ۧ(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/֫᩸֫;->֫(Ll/ۖ᩸֫;)V

    .line 747
    iget-object v1, p0, Ll/ܺ᩸֫;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 749
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    .line 750
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶܶ֫;

    invoke-interface {v2, p0, p1}, Ll/ܶܶ֫;->֫(Ll/ܺ᩸֫;Ll/᩺ܶ֫;)V

    goto :goto_0

    .line 753
    :cond_0
    iget-object v0, p0, Ll/ܺ᩸֫;->ܽ:Ll/᩷᩸֫;

    invoke-virtual {v0, p0, p1}, Ll/᩷᩸֫;->֫(Ll/ܺ᩸֫;Ll/᩺ܶ֫;)V

    return-void
.end method

.method public static ۧ(Ljava/io/File;)J
    .locals 5

    .line 791
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    .line 792
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    :goto_0
    const/16 v2, 0x10

    .line 794
    invoke-static {v0, v1, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v2

    .line 795
    new-instance v3, Ljava/io/File;

    const-string v4, ".uid"

    .line 0
    invoke-static {v2, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 795
    invoke-direct {v3, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 796
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    move-result p0

    if-eqz p0, :cond_1

    return-wide v0

    .line 798
    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to create UID file: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/ܺ᩸֫;)V
    .locals 12

    .line 519
    iget-object v0, p0, Ll/ܺ᩸֫;->ᩳ:Ll/ۛܶ֫;

    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    iget-object v2, p0, Ll/ܺ᩸֫;->֫:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 521
    :try_start_0
    invoke-static {v2}, Ll/ܺ᩸֫;->֫(Ljava/io/File;)V
    :try_end_0
    .catch Ll/۠ܶ֫; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 523
    iput-object v0, p0, Ll/ܺ᩸֫;->ܿ:Ll/۠ܶ֫;

    goto/16 :goto_5

    .line 528
    :cond_0
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    if-nez v3, :cond_1

    .line 530
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to list cache directory files: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 531
    invoke-static {v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    .line 532
    new-instance v1, Ll/۠ܶ֫;

    .line 84
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 532
    iput-object v1, p0, Ll/ܺ᩸֫;->ܿ:Ll/۠ܶ֫;

    return-void

    .line 773
    :cond_1
    array-length v4, v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    const-wide/16 v7, -0x1

    if-ge v6, v4, :cond_3

    aget-object v9, v3, v6

    .line 774
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v11, ".uid"

    .line 775
    invoke-virtual {v10, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x2e

    .line 804
    :try_start_1
    invoke-virtual {v10, v11}, Ljava/lang/String;->indexOf(I)I

    move-result v11

    invoke-virtual {v10, v5, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0x10

    invoke-static {v10, v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v4
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 780
    :catch_1
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Malformed UID file: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    .line 781
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    move-wide v4, v7

    .line 536
    :goto_2
    iput-wide v4, p0, Ll/ܺ᩸֫;->ۢ:J

    cmp-long v6, v4, v7

    if-nez v6, :cond_4

    .line 539
    :try_start_2
    invoke-static {v2}, Ll/ܺ᩸֫;->ۧ(Ljava/io/File;)J

    move-result-wide v4

    iput-wide v4, p0, Ll/ܺ᩸֫;->ۢ:J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    .line 541
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Failed to create cache UID: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 542
    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 543
    new-instance v2, Ll/۠ܶ֫;

    .line 92
    invoke-direct {v2, v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 543
    iput-object v2, p0, Ll/ܺ᩸֫;->ܿ:Ll/۠ܶ֫;

    goto :goto_5

    .line 549
    :cond_4
    :goto_3
    :try_start_3
    iget-wide v4, p0, Ll/ܺ᩸֫;->ۢ:J

    invoke-virtual {v1, v4, v5}, Ll/ܿ᩸֫;->֫(J)V

    const/4 v4, 0x1

    if-eqz v0, :cond_5

    .line 551
    iget-wide v5, p0, Ll/ܺ᩸֫;->ۢ:J

    invoke-virtual {v0, v5, v6}, Ll/ۛܶ֫;->֫(J)V

    .line 552
    invoke-virtual {v0}, Ll/ۛܶ֫;->֫()Ljava/util/HashMap;

    move-result-object v5

    .line 553
    invoke-direct {p0, v2, v4, v3, v5}, Ll/ܺ᩸֫;->֫(Ljava/io/File;Z[Ljava/io/File;Ljava/util/Map;)V

    .line 554
    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ۛܶ֫;->֫(Ljava/util/Set;)V

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    .line 556
    invoke-direct {p0, v2, v4, v3, v0}, Ll/ܺ᩸֫;->֫(Ljava/io/File;Z[Ljava/io/File;Ljava/util/Map;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 565
    :goto_4
    invoke-virtual {v1}, Ll/ܿ᩸֫;->ۧ()V

    .line 567
    :try_start_4
    invoke-virtual {v1}, Ll/ܿ᩸֫;->ܽ()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_5

    :catch_3
    move-exception p0

    const-string v0, "Storing index file failed"

    .line 569
    invoke-static {v0, p0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :catch_4
    move-exception v0

    .line 559
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Failed to initialize cache indices: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 560
    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 561
    new-instance v2, Ll/۠ܶ֫;

    .line 92
    invoke-direct {v2, v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 561
    iput-object v2, p0, Ll/ܺ᩸֫;->ܿ:Ll/۠ܶ֫;

    :goto_5
    return-void
.end method

.method private ܽ()V
    .locals 9

    .line 723
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 724
    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v1}, Ll/ܿ᩸֫;->֫()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫᩸֫;

    .line 725
    invoke-virtual {v2}, Ll/֫᩸֫;->ۧ()Ljava/util/TreeSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ܶ֫;

    .line 726
    iget-object v4, v3, Ll/᩺ܶ֫;->᩸:Ljava/io/File;

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v4

    iget-wide v6, v3, Ll/᩺ܶ֫;->ۗ:J

    cmp-long v8, v4, v6

    if-eqz v8, :cond_1

    .line 727
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 731
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 732
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ܶ֫;

    invoke-direct {p0, v2}, Ll/ܺ᩸֫;->ܽ(Ll/᩺ܶ֫;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static declared-synchronized ܽ(Ljava/io/File;)V
    .locals 2

    .line 2
    const-class v0, Ll/ܺ᩸֫;

    .line 3
    monitor-enter v0

    .line 821
    :try_start_0
    sget-object v1, Ll/ܺ᩸֫;->ۡ:Ljava/util/HashSet;

    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 822
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private ܽ(Ll/᩺ܶ֫;)V
    .locals 4

    .line 699
    iget-object v0, p1, Ll/᩺ܶ֫;->᩶:Ljava/lang/String;

    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v1, v0}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 700
    invoke-virtual {v0, p1}, Ll/֫᩸֫;->֫(Ll/᩺ܶ֫;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    .line 704
    :cond_0
    iget-object v2, p0, Ll/ܺ᩸֫;->ᩳ:Ll/ۛܶ֫;

    if-eqz v2, :cond_1

    .line 705
    iget-object v3, p1, Ll/᩺ܶ֫;->᩸:Ljava/io/File;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    .line 707
    :try_start_0
    invoke-virtual {v2, v3}, Ll/ۛܶ֫;->֫(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v2, "Failed to remove file index entry for: "

    .line 0
    invoke-static {v2, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 714
    :cond_1
    :goto_0
    iget-object v0, v0, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ll/ܿ᩸֫;->ܽ(Ljava/lang/String;)V

    .line 737
    iget-object v0, p0, Ll/ܺ᩸֫;->ܳ:Ljava/util/HashMap;

    iget-object v1, p1, Ll/᩺ܶ֫;->᩶:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 739
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    .line 740
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶܶ֫;

    invoke-interface {v2, p1}, Ll/ܶܶ֫;->֫(Ll/᩺ܶ֫;)V

    goto :goto_1

    .line 743
    :cond_2
    iget-object v0, p0, Ll/ܺ᩸֫;->ܽ:Ll/᩷᩸֫;

    invoke-virtual {v0, p1}, Ll/᩷᩸֫;->֫(Ll/᩺ܶ֫;)V

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(Ljava/lang/String;JJ)Ljava/io/File;
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 372
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 373
    invoke-virtual {p0}, Ll/ܺ᩸֫;->֫()V

    .line 375
    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v1, p1}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    invoke-virtual {p1, p2, p3, p4, p5}, Ll/֫᩸֫;->ܽ(JJ)Z

    move-result v1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 378
    iget-object v1, p0, Ll/ܺ᩸֫;->֫:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 381
    iget-object v1, p0, Ll/ܺ᩸֫;->֫:Ljava/io/File;

    invoke-static {v1}, Ll/ܺ᩸֫;->֫(Ljava/io/File;)V

    .line 382
    invoke-direct {p0}, Ll/ܺ᩸֫;->ܽ()V

    .line 384
    :cond_0
    iget-object v1, p0, Ll/ܺ᩸֫;->ܽ:Ll/᩷᩸֫;

    invoke-virtual {v1, p0, p4, p5}, Ll/᩷᩸֫;->֫(Ll/ܺ᩸֫;J)V

    .line 386
    new-instance v2, Ljava/io/File;

    iget-object p4, p0, Ll/ܺ᩸֫;->֫:Ljava/io/File;

    iget-object p5, p0, Ll/ܺ᩸֫;->᩻:Ljava/util/Random;

    const/16 v1, 0xa

    invoke-virtual {p5, v1}, Ljava/util/Random;->nextInt(I)I

    move-result p5

    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p5

    invoke-direct {v2, p4, p5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 387
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p4

    if-nez p4, :cond_1

    .line 388
    invoke-static {v2}, Ll/ܺ᩸֫;->֫(Ljava/io/File;)V

    .line 390
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 391
    iget v3, p1, Ll/֫᩸֫;->ۧ:I

    move-wide v4, p2

    invoke-static/range {v2 .. v7}, Ll/ۖ᩸֫;->֫(Ljava/io/File;IJJ)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;)Ll/ۜ᩸֫;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 513
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 514
    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    .line 335
    invoke-virtual {v1, p1}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 336
    invoke-virtual {p1}, Ll/֫᩸֫;->֫()Ll/ۜ᩸֫;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Ll/ۜ᩸֫;->ܽ:Ll/ۜ᩸֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 514
    :goto_0
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 249
    :try_start_0
    iget-object v1, p0, Ll/ܺ᩸֫;->ܿ:Ll/۠ܶ֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 252
    monitor-exit v0

    return-void

    .line 250
    :cond_0
    :try_start_1
    throw v1

    :catchall_0
    move-exception v1

    .line 252
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ljava/io/File;J)V
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 397
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 398
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 399
    monitor-exit v0

    return-void

    :cond_0
    const-wide/16 v3, 0x0

    cmp-long v1, p2, v3

    if-nez v1, :cond_1

    .line 402
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 403
    monitor-exit v0

    return-void

    .line 406
    :cond_1
    :try_start_2
    iget-object v8, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, p1

    move-wide v4, p2

    .line 89
    invoke-static/range {v3 .. v8}, Ll/ۖ᩸֫;->֫(Ljava/io/File;JJLl/ܿ᩸֫;)Ll/ۖ᩸֫;

    move-result-object p2

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    iget-object p3, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    iget-object v1, p2, Ll/᩺ܶ֫;->᩶:Ljava/lang/String;

    invoke-virtual {p3, v1}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object p3

    .line 155
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    iget-wide v3, p2, Ll/᩺ܶ֫;->۬:J

    iget-wide v5, p2, Ll/᩺ܶ֫;->ۗ:J

    invoke-virtual {p3, v3, v4, v5, v6}, Ll/֫᩸֫;->ܽ(JJ)Z

    move-result v1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 412
    invoke-virtual {p3}, Ll/֫᩸֫;->֫()Ll/ۜ᩸֫;

    move-result-object p3

    invoke-static {p3}, Ll/۬᩵ᩳ;->֫(Ll/ܳ᩸֫;)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long p3, v3, v5

    if-eqz p3, :cond_3

    .line 414
    iget-wide v5, p2, Ll/᩺ܶ֫;->۬:J

    iget-wide v7, p2, Ll/᩺ܶ֫;->ۗ:J

    add-long/2addr v5, v7

    cmp-long p3, v5, v3

    if-gtz p3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    .line 417
    :cond_3
    iget-object p3, p0, Ll/ܺ᩸֫;->ᩳ:Ll/ۛܶ֫;

    if-eqz p3, :cond_4

    .line 418
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 420
    :try_start_3
    iget-object v1, p0, Ll/ܺ᩸֫;->ᩳ:Ll/ۛܶ֫;

    iget-wide v3, p2, Ll/᩺ܶ֫;->ۗ:J

    iget-wide v5, p2, Ll/᩺ܶ֫;->ۙ:J

    invoke-virtual/range {v1 .. v6}, Ll/ۛܶ֫;->֫(Ljava/lang/String;JJ)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 422
    :try_start_4
    new-instance p2, Ll/۠ܶ֫;

    .line 88
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 422
    throw p2

    .line 425
    :cond_4
    :goto_1
    invoke-direct {p0, p2}, Ll/ܺ᩸֫;->֫(Ll/ۖ᩸֫;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 427
    :try_start_5
    iget-object p1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {p1}, Ll/ܿ᩸֫;->ܽ()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 431
    :try_start_6
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 432
    monitor-exit v0

    return-void

    :catch_1
    move-exception p1

    .line 429
    :try_start_7
    new-instance p2, Ll/۠ܶ֫;

    .line 88
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 429
    throw p2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;Ll/᩻᩸֫;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 500
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 501
    invoke-virtual {p0}, Ll/ܺ᩸֫;->֫()V

    .line 503
    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v1, p1, p2}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;Ll/᩻᩸֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 505
    :try_start_1
    iget-object p1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {p1}, Ll/ܿ᩸֫;->ܽ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 509
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    .line 507
    :try_start_2
    new-instance p2, Ll/۠ܶ֫;

    .line 88
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 507
    throw p2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/᩺ܶ֫;)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 436
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 437
    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    iget-object v2, p1, Ll/᩺ܶ֫;->᩶:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    iget-wide v2, p1, Ll/᩺ܶ֫;->۬:J

    invoke-virtual {v1, v2, v3}, Ll/֫᩸֫;->֫(J)V

    .line 439
    iget-object p1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    iget-object v1, v1, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ܿ᩸֫;->ܽ(Ljava/lang/String;)V

    .line 440
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 441
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ljava/lang/String;JJ)J
    .locals 15

    move-object v14, p0

    .line 1
    monitor-enter v14

    const-wide/16 v0, -0x1

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, p4, v0

    if-nez v4, :cond_0

    move-wide v0, v2

    goto :goto_0

    :cond_0
    add-long v0, p4, p2

    :goto_0
    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-gez v6, :cond_1

    goto :goto_1

    :cond_1
    move-wide v2, v0

    :goto_1
    move-wide/from16 v0, p2

    move-wide v12, v4

    :goto_2
    cmp-long v6, v0, v2

    if-gez v6, :cond_3

    sub-long v10, v2, v0

    move-object v6, p0

    move-object/from16 v7, p1

    move-wide v8, v0

    .line 485
    :try_start_0
    invoke-virtual/range {v6 .. v11}, Ll/ܺ᩸֫;->ᩳ(Ljava/lang/String;JJ)J

    move-result-wide v6

    cmp-long v8, v6, v4

    if-lez v8, :cond_2

    add-long/2addr v12, v6

    goto :goto_3

    :cond_2
    neg-long v6, v6

    :goto_3
    add-long/2addr v0, v6

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 493
    monitor-exit v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 494
    :cond_3
    monitor-exit v14

    return-wide v12
.end method

.method public final declared-synchronized ۧ(Ljava/lang/String;)Ljava/util/TreeSet;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 306
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 307
    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v1, p1}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 308
    invoke-virtual {p1}, Ll/֫᩸֫;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 310
    :cond_0
    new-instance v1, Ljava/util/TreeSet;

    invoke-virtual {p1}, Ll/֫᩸֫;->ۧ()Ljava/util/TreeSet;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    goto :goto_1

    .line 309
    :cond_1
    :goto_0
    new-instance v1, Ljava/util/TreeSet;

    invoke-direct {v1}, Ljava/util/TreeSet;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 308
    :goto_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 261
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    .line 262
    monitor-exit v0

    return-void

    .line 264
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ܺ᩸֫;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 265
    invoke-direct {p0}, Ll/ܺ᩸֫;->ܽ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v1, 0x1

    .line 267
    :try_start_2
    iget-object v2, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v2}, Ll/ܿ᩸֫;->ܽ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 271
    :goto_0
    :try_start_3
    iget-object v2, p0, Ll/ܺ᩸֫;->֫:Ljava/io/File;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_4
    const-string v3, "Storing index file failed"

    .line 269
    invoke-static {v3, v2}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 271
    :goto_1
    :try_start_5
    invoke-static {v2}, Ll/ܺ᩸֫;->ܽ(Ljava/io/File;)V

    .line 272
    iput-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 274
    monitor-exit v0

    return-void

    .line 271
    :goto_2
    :try_start_6
    iget-object v3, p0, Ll/ܺ᩸֫;->֫:Ljava/io/File;

    invoke-static {v3}, Ll/ܺ᩸֫;->ܽ(Ljava/io/File;)V

    .line 272
    iput-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    .line 273
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v1
.end method

.method public final declared-synchronized ۧ(Ll/᩺ܶ֫;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 453
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 454
    invoke-direct {p0, p1}, Ll/ܺ᩸֫;->ܽ(Ll/᩺ܶ֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 455
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܳ(Ljava/lang/String;JJ)Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 459
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 460
    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v1, p1}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 461
    invoke-virtual {p1, p2, p3, p4, p5}, Ll/֫᩸֫;->֫(JJ)J

    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long p3, p1, p4

    if-ltz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܽ(Ljava/lang/String;JJ)Ll/᩺ܶ֫;
    .locals 15

    move-object v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v11, p2

    move-object v14, p0

    .line 1
    monitor-enter v14

    .line 350
    :try_start_0
    iget-boolean v2, v1, Ll/ܺ᩸֫;->ۜ:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    .line 351
    invoke-virtual {p0}, Ll/ܺ᩸֫;->֫()V

    .line 671
    iget-object v2, v1, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v2, v0}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object v2

    if-nez v2, :cond_0

    .line 73
    new-instance v13, Ll/ۖ᩸֫;

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, 0x0

    move-object v2, v13

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    .line 191
    invoke-direct/range {v2 .. v10}, Ll/᩺ܶ֫;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    goto :goto_1

    :cond_0
    move-wide/from16 v3, p4

    .line 676
    :goto_0
    invoke-virtual {v2, v11, v12, v3, v4}, Ll/֫᩸֫;->ۧ(JJ)Ll/ۖ᩸֫;

    move-result-object v13

    .line 677
    iget-boolean v5, v13, Ll/᩺ܶ֫;->᩹:Z

    if-eqz v5, :cond_1

    iget-object v5, v13, Ll/᩺ܶ֫;->᩸:Ljava/io/File;

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v5

    iget-wide v7, v13, Ll/᩺ܶ֫;->ۗ:J

    cmp-long v9, v5, v7

    if-eqz v9, :cond_1

    .line 680
    invoke-direct {p0}, Ll/ܺ᩸֫;->ܽ()V

    goto :goto_0

    .line 355
    :cond_1
    :goto_1
    iget-boolean v2, v13, Ll/᩺ܶ֫;->᩹:Z

    if-eqz v2, :cond_2

    .line 357
    invoke-direct {p0, v0, v13}, Ll/ܺ᩸֫;->֫(Ljava/lang/String;Ll/ۖ᩸֫;)Ll/ۖ᩸֫;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v14

    return-object v0

    .line 360
    :cond_2
    :try_start_1
    iget-object v2, v1, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v2, v0}, Ll/ܿ᩸֫;->ۧ(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object v0

    .line 361
    iget-wide v2, v13, Ll/᩺ܶ֫;->ۗ:J

    invoke-virtual {v0, v11, v12, v2, v3}, Ll/֫᩸֫;->ᩳ(JJ)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    .line 363
    monitor-exit v14

    return-object v13

    .line 367
    :cond_3
    monitor-exit v14

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized ܽ(Ljava/lang/String;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 445
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 446
    invoke-virtual {p0, p1}, Ll/ܺ᩸֫;->ۧ(Ljava/lang/String;)Ljava/util/TreeSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ܶ֫;

    .line 447
    invoke-direct {p0, v1}, Ll/ܺ᩸֫;->ܽ(Ll/᩺ܶ֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 449
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܿ(Ljava/lang/String;JJ)Ll/᩺ܶ֫;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 328
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 329
    invoke-virtual {p0}, Ll/ܺ᩸֫;->֫()V

    .line 332
    :goto_0
    invoke-virtual/range {p0 .. p5}, Ll/ܺ᩸֫;->ܽ(Ljava/lang/String;JJ)Ll/᩺ܶ֫;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 334
    monitor-exit v0

    return-object v1

    .line 341
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 343
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ᩳ(Ljava/lang/String;JJ)J
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 466
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩸֫;->ۜ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    const-wide/16 v1, -0x1

    cmp-long v3, p4, v1

    if-nez v3, :cond_0

    const-wide p4, 0x7fffffffffffffffL

    .line 470
    :cond_0
    iget-object v1, p0, Ll/ܺ᩸֫;->ۧ:Ll/ܿ᩸֫;

    invoke-virtual {v1, p1}, Ll/ܿ᩸֫;->֫(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 471
    invoke-virtual {p1, p2, p3, p4, p5}, Ll/֫᩸֫;->֫(JJ)J

    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    neg-long p1, p4

    :goto_0
    monitor-exit v0

    return-wide p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
