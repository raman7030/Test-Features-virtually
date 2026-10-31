.class public final Ll/ۜۨᩳ;
.super Ljava/lang/Object;
.source "X68P"


# direct methods
.method public static ֫(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;)Ll/ۤۤ;
    .locals 6

    .line 7560
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    iget-object v1, p0, Ll/۬ۜܽ;->᩸:[B

    const v2, -0xedca186

    .line 7563
    :try_start_0
    invoke-virtual {p0, v2}, Ll/۬ۜܽ;->֫(I)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    const/4 v1, 0x4

    .line 89
    invoke-virtual {p0, v1}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 7565
    invoke-static {p0, v3}, Ll/ۜۨᩳ;->֫(Ll/۬ۜܽ;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7566
    invoke-static {p0, p1}, Ll/ۜۨᩳ;->ܽ(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p1

    .line 89
    invoke-virtual {p0, v1}, Ll/۬ۜܽ;->skipBytes(I)V

    goto :goto_0

    :cond_0
    const-string p1, ""

    .line 7571
    :goto_0
    invoke-static {p0, v1}, Ll/ۜۨᩳ;->֫(Ll/۬ۜܽ;I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7572
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_1
    const-string v1, "\n"

    goto :goto_5

    .line 7577
    :cond_2
    invoke-static {p0, p1}, Ll/ۜۨᩳ;->ܽ(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0x1c

    .line 7578
    invoke-virtual {p0, v2}, Ll/۬ۜܽ;->skipBytes(I)V

    const/4 v2, 0x3

    .line 7579
    invoke-virtual {p0, v2}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 7580
    array-length v2, v1

    invoke-static {p0, v2}, Ll/۫ۨᩳ;->֫(Ll/۬ۜܽ;I)V

    .line 7581
    array-length v1, v1

    invoke-static {p0, v1}, Ll/۫ۨᩳ;->֫(Ll/۬ۜܽ;I)V

    const v1, -0x5d7d9e7d

    .line 60
    invoke-virtual {p0, v1}, Ll/۬ۜܽ;->֫(I)Z

    move-result v2

    const/16 v4, 0x8

    if-nez v2, :cond_3

    goto :goto_2

    .line 63
    :cond_3
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_4

    .line 65
    invoke-virtual {p0, v4}, Ll/۬ۜܽ;->skipBytes(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 60
    :cond_4
    :goto_2
    invoke-virtual {p0, v1}, Ll/۬ۜܽ;->֫(I)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_4

    .line 63
    :cond_5
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v1

    :goto_3
    if-ge v3, v1, :cond_6

    .line 65
    invoke-virtual {p0, v4}, Ll/۬ۜܽ;->skipBytes(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 7584
    :cond_6
    :goto_4
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    .line 84
    :goto_5
    new-instance v2, Ll/ۤۤ;

    invoke-direct {v2, p1, v1}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v0, v0

    .line 7588
    invoke-virtual {p0, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    return-object v2

    :catchall_0
    move-exception p1

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    .line 7589
    throw p1
.end method

.method public static ֫(Ll/۬ۜܽ;)V
    .locals 7

    .line 7593
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    iget-object v1, p0, Ll/۬ۜܽ;->᩸:[B

    const v2, -0xedca186

    .line 7595
    :try_start_0
    invoke-virtual {p0, v2}, Ll/۬ۜܽ;->֫(I)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x4

    if-eqz v3, :cond_1

    .line 89
    invoke-virtual {p0, v5}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 7597
    invoke-static {p0, v4}, Ll/ۜۨᩳ;->֫(Ll/۬ۜܽ;I)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    int-to-long v0, v0

    .line 7622
    invoke-virtual {p0, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    return-void

    .line 89
    :cond_0
    :try_start_1
    invoke-virtual {p0, v5}, Ll/۬ۜܽ;->skipBytes(I)V

    goto :goto_2

    .line 7602
    :cond_1
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܽ()I

    move-result v3

    const v6, -0x7d8c8e8

    if-ne v3, v6, :cond_2

    .line 89
    invoke-virtual {p0, v5}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 46
    invoke-virtual {p0, v4}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 217
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    :goto_0
    invoke-virtual {p0, v3}, Ll/۬ۜܽ;->skipBytes(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    goto :goto_0

    :goto_1
    const/16 v3, 0x14

    .line 7607
    invoke-virtual {p0, v3}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 7609
    :goto_2
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v3

    add-int/2addr v3, v5

    invoke-static {v3, v1}, Ll/ܺܰۡ;->֫(I[B)I

    move-result v3

    .line 7610
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v4

    invoke-static {v4, v3, v1}, Ll/ܺܰۡ;->֫(II[B)V

    int-to-long v3, v0

    .line 7611
    invoke-virtual {p0, v3, v4}, Ll/۬ۜܽ;->seek(J)V

    .line 7612
    invoke-virtual {p0, v2}, Ll/۬ۜܽ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 89
    invoke-virtual {p0, v5}, Ll/۬ۜܽ;->skipBytes(I)V

    const/16 v2, 0xa

    .line 7614
    invoke-static {p0, v2}, Ll/ۜۨᩳ;->֫(Ll/۬ۜܽ;I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 7615
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v2

    const/16 v5, 0x8

    .line 7616
    invoke-virtual {p0, v5}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 7617
    invoke-virtual {p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v5

    .line 7618
    invoke-static {v5, v6, v2, v1}, Ll/ܺܰۡ;->֫(JI[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7622
    :cond_3
    invoke-virtual {p0, v3, v4}, Ll/۬ۜܽ;->seek(J)V

    return-void

    :catchall_0
    move-exception v1

    int-to-long v2, v0

    invoke-virtual {p0, v2, v3}, Ll/۬ۜܽ;->seek(J)V

    .line 7623
    throw v1
.end method

.method public static ֫(Ll/۬ۜܽ;I)Z
    .locals 3

    .line 7640
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    .line 7642
    :goto_0
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 7643
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    if-ne v1, p1, :cond_0

    const/4 p0, 0x1

    return p0

    .line 7647
    :cond_0
    invoke-virtual {p0, v2}, Ll/۬ۜܽ;->skipBytes(I)V

    goto :goto_0

    :cond_1
    int-to-long v0, v0

    .line 7652
    invoke-virtual {p0, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 2

    .line 7540
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    const v1, -0xedca186

    .line 7542
    :try_start_0
    invoke-virtual {p0, v1}, Ll/۬ۜܽ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    .line 89
    invoke-virtual {p0, v1}, Ll/۬ۜܽ;->skipBytes(I)V

    const/4 v1, 0x0

    .line 7544
    invoke-static {p0, v1}, Ll/ۜۨᩳ;->֫(Ll/۬ۜܽ;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7545
    invoke-static {p0, p1}, Ll/ۜۨᩳ;->ܽ(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    goto :goto_0

    .line 7549
    :cond_1
    invoke-static {p0, p1}, Ll/ۜۨᩳ;->ܽ(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    int-to-long v0, v0

    .line 7551
    invoke-virtual {p0, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    return-object p1

    :catchall_0
    move-exception p1

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    .line 7552
    throw p1
.end method

.method public static ܽ(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 3

    .line 7627
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܽ()I

    move-result v0

    const v1, -0x1dcdacac

    if-ne v0, v1, :cond_0

    invoke-static {p0, p1}, Ll/ۛ֫ܿ;->֫(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 7628
    :cond_0
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܽ()I

    move-result v0

    const v1, -0x1cccb2ac

    const v2, -0x1dcdb2ac

    if-eq v0, v2, :cond_4

    if-ne v0, v1, :cond_1

    goto :goto_1

    .line 7629
    :cond_1
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܽ()I

    move-result v0

    const v1, -0x7d8c8e8

    if-ne v0, v1, :cond_3

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    .line 7630
    :cond_2
    new-instance v0, Ll/᩻ۨᩳ;

    invoke-direct {v0, p1}, Ll/᩻ۨᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    move-object p1, v0

    :goto_0
    invoke-static {p0, p1}, Ll/۬᩶ᩳ;->֫(Ll/۬ۜܽ;Ll/۟᩹ᩳ;)Ll/ۗ᩶ᩳ;

    move-result-object p0

    .line 7633
    invoke-virtual {p0}, Ll/ۗ᩶ᩳ;->ܽ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 7635
    :cond_3
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 137
    :cond_4
    :goto_1
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܽ()I

    move-result p1

    if-ne p1, v2, :cond_5

    new-instance p1, Ljava/lang/String;

    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    long-to-int v2, v1

    add-int/2addr v0, v2

    invoke-static {p0, v0}, Ll/֡۟ᩳ;->֫(Ll/۬ۜܽ;I)[C

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    return-object p1

    .line 138
    :cond_5
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    if-ne p1, v1, :cond_6

    .line 139
    invoke-static {p0}, Ll/᩻۬ᩳ;->֫(Ll/۬ۜܽ;)Ll/ܳ۬ᩳ;

    move-result-object p0

    :try_start_0
    invoke-virtual {p0}, Ll/ܳ۬ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {p1}, Ll/۬᩹ᩳ;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1}, Ll/۬᩹ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p0}, Ll/ܳ۬ᩳ;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-virtual {p1}, Ll/۬᩹ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_5
    invoke-virtual {p0}, Ll/ܳ۬ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1

    .line 138
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid memory session state"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
