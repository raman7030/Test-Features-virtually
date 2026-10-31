.class public final Ll/ܽ᩸֫;
.super Ljava/lang/Object;
.source "Z754"

# interfaces
.implements Ll/ᩳ᩸֫;


# instance fields
.field public final ֫:Ll/۟֡֫;

.field public ۧ:Ll/ۢ᩸֫;

.field public ܽ:Z

.field public final ܿ:Ljavax/crypto/spec/SecretKeySpec;

.field public final ᩳ:Ljavax/crypto/Cipher;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 508
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 524
    iput-object v0, p0, Ll/ܽ᩸֫;->ᩳ:Ljavax/crypto/Cipher;

    .line 525
    iput-object v0, p0, Ll/ܽ᩸֫;->ܿ:Ljavax/crypto/spec/SecretKeySpec;

    .line 527
    new-instance v0, Ll/۟֡֫;

    invoke-direct {v0, p1}, Ll/۟֡֫;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Ll/ܽ᩸֫;->֫:Ll/۟֡֫;

    return-void
.end method

.method public static ֫(Ll/֫᩸֫;I)I
    .locals 4

    .line 688
    iget v0, p0, Ll/֫᩸֫;->ۧ:I

    mul-int/lit8 v0, v0, 0x1f

    .line 689
    iget-object v1, p0, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    const/4 v0, 0x2

    if-ge p1, v0, :cond_0

    .line 691
    invoke-virtual {p0}, Ll/֫᩸֫;->֫()Ll/ۜ᩸֫;

    move-result-object p0

    invoke-static {p0}, Ll/۬᩵ᩳ;->֫(Ll/ܳ᩸֫;)J

    move-result-wide p0

    mul-int/lit8 v1, v1, 0x1f

    const/16 v0, 0x20

    ushr-long v2, p0, v0

    xor-long/2addr p0, v2

    long-to-int p1, p0

    add-int/2addr v1, p1

    return v1

    :cond_0
    mul-int/lit8 v1, v1, 0x1f

    .line 694
    invoke-virtual {p0}, Ll/֫᩸֫;->֫()Ll/ۜ᩸֫;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۜ᩸֫;->hashCode()I

    move-result p0

    add-int/2addr p0, v1

    return p0
.end method

.method public static ֫(ILjava/io/DataInputStream;)Ll/֫᩸֫;
    .locals 3

    .line 707
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 708
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    if-ge p0, v2, :cond_0

    .line 711
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide p0

    .line 712
    new-instance v2, Ll/᩻᩸֫;

    invoke-direct {v2}, Ll/᩻᩸֫;-><init>()V

    .line 713
    invoke-static {v2, p0, p1}, Ll/᩻᩸֫;->֫(Ll/᩻᩸֫;J)V

    .line 714
    sget-object p0, Ll/ۜ᩸֫;->ܽ:Ll/ۜ᩸֫;

    invoke-virtual {p0, v2}, Ll/ۜ᩸֫;->֫(Ll/᩻᩸֫;)Ll/ۜ᩸֫;

    move-result-object p0

    goto :goto_0

    .line 716
    :cond_0
    invoke-static {p1}, Ll/ܿ᩸֫;->֫(Ljava/io/DataInputStream;)Ll/ۜ᩸֫;

    move-result-object p0

    .line 718
    :goto_0
    new-instance p1, Ll/֫᩸֫;

    invoke-direct {p1, v0, v1, p0}, Ll/֫᩸֫;-><init>(ILjava/lang/String;Ll/ۜ᩸֫;)V

    return-object p1
.end method


# virtual methods
.method public final delete()V
    .locals 1

    .line 542
    iget-object v0, p0, Ll/ܽ᩸֫;->֫:Ll/۟֡֫;

    invoke-virtual {v0}, Ll/۟֡֫;->֫()V

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/util/HashMap;)V
    .locals 1

    .line 564
    iget-boolean v0, p0, Ll/ܽ᩸֫;->ܽ:Z

    if-nez v0, :cond_0

    return-void

    .line 567
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܽ᩸֫;->ۧ(Ljava/util/HashMap;)V

    return-void
.end method

.method public final ֫(Ljava/util/HashMap;Landroid/util/SparseArray;)V
    .locals 10

    .line 548
    iget-boolean v0, p0, Ll/ܽ᩸֫;->ܽ:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 582
    iget-object v0, p0, Ll/ܽ᩸֫;->֫:Ll/۟֡֫;

    invoke-virtual {v0}, Ll/۟֡֫;->ۧ()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 588
    :try_start_0
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ll/۟֡֫;->ܽ()Ljava/io/FileInputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 589
    new-instance v4, Ljava/io/DataInputStream;

    invoke-direct {v4, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 590
    :try_start_1
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    if-ltz v2, :cond_7

    const/4 v5, 0x2

    if-le v2, v5, :cond_1

    goto :goto_4

    .line 595
    :cond_1
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    move-result v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    and-int/2addr v6, v1

    if-eqz v6, :cond_3

    .line 597
    iget-object v6, p0, Ll/ܽ᩸֫;->ᩳ:Ljavax/crypto/Cipher;

    if-nez v6, :cond_2

    goto :goto_4

    :cond_2
    const/16 v7, 0x10

    :try_start_2
    new-array v7, v7, [B

    .line 601
    invoke-virtual {v4, v7}, Ljava/io/DataInputStream;->readFully([B)V

    .line 602
    new-instance v8, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v8, v7}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 604
    :try_start_3
    iget-object v7, p0, Ll/ܽ᩸֫;->ܿ:Ljavax/crypto/spec/SecretKeySpec;

    sget-object v9, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v6, v5, v7, v8}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_3
    .catch Ljava/security/InvalidKeyException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 608
    :try_start_4
    new-instance v5, Ljava/io/DataInputStream;

    new-instance v7, Ljavax/crypto/CipherInputStream;

    invoke-direct {v7, v3, v6}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    invoke-direct {v5, v7}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v4, v5

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 606
    :goto_0
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 613
    :cond_3
    :goto_1
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_2
    if-ge v5, v3, :cond_4

    .line 616
    invoke-static {v2, v4}, Ll/ܽ᩸֫;->֫(ILjava/io/DataInputStream;)Ll/֫᩸֫;

    move-result-object v7

    iget-object v8, v7, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    .line 617
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    iget v9, v7, Ll/֫᩸֫;->ۧ:I

    invoke-virtual {p2, v9, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 619
    invoke-static {v7, v2}, Ll/ܽ᩸֫;->֫(Ll/֫᩸֫;I)I

    move-result v7

    add-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 621
    :cond_4
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    .line 622
    invoke-virtual {v4}, Ljava/io/InputStream;->read()I

    move-result v3
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v5, -0x1

    if-ne v3, v5, :cond_5

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    if-ne v2, v6, :cond_7

    if-nez v1, :cond_6

    goto :goto_4

    .line 630
    :cond_6
    invoke-static {v4}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    return-void

    :cond_7
    :goto_4
    invoke-static {v4}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    goto :goto_7

    :catchall_0
    move-exception p1

    move-object v2, v4

    goto :goto_5

    :catch_2
    move-object v2, v4

    goto :goto_6

    :catchall_1
    move-exception p1

    :goto_5
    if-eqz v2, :cond_8

    invoke-static {v2}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    .line 632
    :cond_8
    throw p1

    :catch_3
    nop

    :goto_6
    if-eqz v2, :cond_9

    .line 630
    invoke-static {v2}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    .line 550
    :cond_9
    :goto_7
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 551
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 552
    invoke-virtual {v0}, Ll/۟֡֫;->֫()V

    return-void
.end method

.method public final ֫(Ll/֫᩸֫;)V
    .locals 0

    const/4 p1, 0x1

    .line 572
    iput-boolean p1, p0, Ll/ܽ᩸֫;->ܽ:Z

    return-void
.end method

.method public final ֫(Ll/֫᩸֫;Z)V
    .locals 0

    const/4 p1, 0x1

    .line 577
    iput-boolean p1, p0, Ll/ܽ᩸֫;->ܽ:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 537
    iget-object v0, p0, Ll/ܽ᩸֫;->֫:Ll/۟֡֫;

    invoke-virtual {v0}, Ll/۟֡֫;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ۧ(Ljava/util/HashMap;)V
    .locals 7

    .line 637
    iget-object v0, p0, Ll/ܽ᩸֫;->֫:Ll/۟֡֫;

    const/4 v1, 0x0

    .line 639
    :try_start_0
    invoke-virtual {v0}, Ll/۟֡֫;->ᩳ()Ljava/io/OutputStream;

    move-result-object v2

    .line 640
    iget-object v3, p0, Ll/ܽ᩸֫;->ۧ:Ll/ۢ᩸֫;

    if-nez v3, :cond_0

    .line 641
    new-instance v3, Ll/ۢ᩸֫;

    .line 33
    invoke-direct {v3, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 641
    iput-object v3, p0, Ll/ܽ᩸֫;->ۧ:Ll/ۢ᩸֫;

    goto :goto_0

    .line 643
    :cond_0
    invoke-virtual {v3, v2}, Ll/ۢ᩸֫;->֫(Ljava/io/OutputStream;)V

    .line 645
    :goto_0
    iget-object v2, p0, Ll/ܽ᩸֫;->ۧ:Ll/ۢ᩸֫;

    .line 646
    new-instance v3, Ljava/io/DataOutputStream;

    invoke-direct {v3, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x2

    .line 647
    :try_start_1
    invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    const/4 v2, 0x0

    .line 650
    invoke-virtual {v3, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 667
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 669
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v4, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫᩸֫;

    .line 729
    iget v6, v5, Ll/֫᩸֫;->ۧ:I

    invoke-virtual {v3, v6}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 730
    iget-object v6, v5, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 731
    invoke-virtual {v5}, Ll/֫᩸֫;->֫()Ll/ۜ᩸֫;

    move-result-object v6

    invoke-static {v6, v3}, Ll/ܿ᩸֫;->֫(Ll/ۜ᩸֫;Ljava/io/DataOutputStream;)V

    .line 671
    invoke-static {v5, v1}, Ll/ܽ᩸֫;->֫(Ll/֫᩸֫;I)I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_1

    .line 673
    :cond_1
    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 674
    invoke-virtual {v0, v3}, Ll/۟֡֫;->֫(Ljava/io/DataOutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 679
    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 559
    iput-boolean v2, p0, Ll/ܽ᩸֫;->ܽ:Z

    return-void

    :catchall_0
    move-exception p1

    move-object v1, v3

    goto :goto_2

    :catchall_1
    move-exception p1

    .line 679
    :goto_2
    invoke-static {v1}, Ll/ۘ֨֫;->֫(Ljava/io/Closeable;)V

    .line 680
    throw p1
.end method
