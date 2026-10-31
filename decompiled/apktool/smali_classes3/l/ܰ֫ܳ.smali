.class public final Ll/ܰ֫ܳ;
.super Ljava/lang/Object;
.source "A70P"


# direct methods
.method public static bridge synthetic ֫(I)I
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܰ֫ܳ;->ܽ(I)I

    move-result p0

    return p0
.end method

.method public static ֫(IJ[II)I
    .locals 4

    :goto_0
    if-ge p0, p4, :cond_1

    add-int v0, p0, p4

    ushr-int/lit8 v0, v0, 0x1

    .line 243
    aget v1, p3, v0

    int-to-long v1, v1

    cmp-long v3, v1, p1

    if-gez v3, :cond_0

    add-int/lit8 p0, v0, 0x1

    goto :goto_0

    :cond_0
    move p4, v0

    goto :goto_0

    :cond_1
    return p0
.end method

.method public static ֫(J)J
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_2

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, p0, v2

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    const-wide/32 v2, 0xffff

    add-long/2addr p0, v2

    const-wide/32 v2, 0x10000

    .line 51
    div-long/2addr p0, v2

    cmp-long v2, p0, v0

    if-nez v2, :cond_1

    return-wide v0

    :cond_1
    const-wide/16 v0, 0x2

    mul-long p0, p0, v0

    const-wide/16 v0, 0x1

    sub-long/2addr p0, v0

    const-wide/16 v0, 0x30

    mul-long p0, p0, v0

    return-wide p0

    :cond_2
    :goto_0
    const-wide p0, 0x7fffffffffffffffL

    return-wide p0
.end method

.method public static bridge synthetic ֫(JJ)J
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ܰ֫ܳ;->ۧ(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ֫(Ll/۫֫ܳ;I)Ll/ۨ֫ܳ;
    .locals 7

    const-string v0, "offset="

    if-nez p0, :cond_1

    if-nez p1, :cond_0

    .line 440
    sget-object p0, Ll/ۨ֫ܳ;->ܽ:Ll/ۨ֫ܳ;

    return-object p0

    .line 438
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 438
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 436
    :cond_1
    iget-object v1, p0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    iget-boolean v2, p0, Ll/۫֫ܳ;->᩷:Z

    iget-object v3, p0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    iget v4, p0, Ll/۫֫ܳ;->ܳ:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-nez p1, :cond_2

    .line 443
    new-instance p1, Ll/ۨ֫ܳ;

    invoke-direct {p1, v6, p0, v5}, Ll/ۨ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;I)V

    return-object p1

    :cond_2
    if-ne p1, v4, :cond_3

    .line 446
    new-instance p1, Ll/ۨ֫ܳ;

    invoke-direct {p1, p0, v6, v5}, Ll/ۨ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;I)V

    return-object p1

    :cond_3
    if-ltz p1, :cond_8

    if-gt p1, v4, :cond_8

    .line 451
    invoke-virtual {p0}, Ll/۫֫ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 452
    invoke-virtual {p0}, Ll/۫֫ܳ;->֫()Z

    move-result v0

    if-nez v0, :cond_4

    .line 453
    new-instance p0, Ll/ۨ֫ܳ;

    invoke-static {p1, v2}, Ll/ܰ֫ܳ;->֫(IZ)Ll/۫֫ܳ;

    move-result-object v0

    sub-int/2addr v4, p1

    .line 454
    invoke-static {v4, v2}, Ll/ܰ֫ܳ;->֫(IZ)Ll/۫֫ܳ;

    move-result-object p1

    invoke-direct {p0, v0, p1, v5}, Ll/ۨ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;I)V

    return-object p0

    .line 456
    :cond_4
    new-instance v0, Ll/ۨ֫ܳ;

    invoke-static {p0, v5, p1}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;II)Ll/۫֫ܳ;

    move-result-object v1

    sub-int/2addr v4, p1

    .line 457
    invoke-static {p0, p1, v4}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;II)Ll/۫֫ܳ;

    move-result-object p0

    invoke-direct {v0, v1, p0, v5}, Ll/ۨ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;I)V

    return-object v0

    .line 459
    :cond_5
    iget p0, v1, Ll/۫֫ܳ;->ܳ:I

    if-ge p1, p0, :cond_6

    .line 460
    invoke-static {v1, p1}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I)Ll/ۨ֫ܳ;

    move-result-object p0

    .line 461
    new-instance p1, Ll/ۨ֫ܳ;

    invoke-static {p0}, Ll/ۨ֫ܳ;->֫(Ll/ۨ֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    invoke-static {p0}, Ll/ۨ֫ܳ;->ۧ(Ll/ۨ֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {p0, v3}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-direct {p1, v0, p0, v5}, Ll/ۨ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;I)V

    return-object p1

    :cond_6
    if-ne p1, p0, :cond_7

    .line 464
    new-instance p0, Ll/ۨ֫ܳ;

    invoke-direct {p0, v1, v3, v5}, Ll/ۨ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;I)V

    return-object p0

    :cond_7
    sub-int/2addr p1, p0

    .line 466
    invoke-static {v3, p1}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I)Ll/ۨ֫ܳ;

    move-result-object p0

    .line 467
    new-instance p1, Ll/ۨ֫ܳ;

    invoke-static {p0}, Ll/ۨ֫ܳ;->֫(Ll/ۨ֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    invoke-static {p0}, Ll/ۨ֫ܳ;->ۧ(Ll/ۨ֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-direct {p1, v0, p0, v5}, Ll/ۨ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;I)V

    return-object p1

    .line 449
    :cond_8
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 449
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(IZ)Ll/۫֫ܳ;
    .locals 9

    .line 622
    new-instance v8, Ll/۫֫ܳ;

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, v8

    move v4, p0

    move v6, p1

    move v7, p1

    invoke-direct/range {v0 .. v7}, Ll/۫֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;[JIIZZ)V

    return-object v8
.end method

.method public static bridge synthetic ֫(I[J)Ll/۫֫ܳ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->ܽ(I[J)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫֫ܳ;)Ll/۫֫ܳ;
    .locals 5

    .line 510
    iget-object v0, p0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    iget-object v1, p0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    .line 618
    :cond_0
    iget v3, v0, Ll/۫֫ܳ;->ᩳ:I

    :goto_0
    if-nez v1, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    iget v4, v1, Ll/۫֫ܳ;->ᩳ:I

    :goto_1
    sub-int/2addr v3, v4

    const/4 v4, 0x1

    if-le v3, v4, :cond_5

    .line 513
    iget-object p0, v0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    if-nez p0, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    .line 618
    :cond_2
    iget v3, p0, Ll/۫֫ܳ;->ᩳ:I

    .line 513
    :goto_2
    iget-object v0, v0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    if-nez v0, :cond_3

    goto :goto_3

    .line 618
    :cond_3
    iget v2, v0, Ll/۫֫ܳ;->ᩳ:I

    :goto_3
    if-lt v3, v2, :cond_4

    .line 514
    invoke-static {v0, v1}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0

    .line 517
    :cond_4
    iget-object v2, v0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    invoke-static {p0, v2}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    iget-object v0, v0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    invoke-static {v0, v1}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0

    :cond_5
    const/4 v4, -0x1

    if-ge v3, v4, :cond_9

    .line 521
    iget-object p0, v1, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    if-nez p0, :cond_6

    const/4 v3, 0x0

    goto :goto_4

    .line 618
    :cond_6
    iget v3, p0, Ll/۫֫ܳ;->ᩳ:I

    .line 521
    :goto_4
    iget-object v1, v1, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    if-nez v1, :cond_7

    goto :goto_5

    .line 618
    :cond_7
    iget v2, v1, Ll/۫֫ܳ;->ᩳ:I

    :goto_5
    if-lt v3, v2, :cond_8

    .line 522
    invoke-static {v0, v1}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    invoke-static {v0, p0}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0

    .line 525
    :cond_8
    iget-object v2, v1, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    invoke-static {v0, v2}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    iget-object v1, v1, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    invoke-static {v1, p0}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    :cond_9
    return-object p0
.end method

.method public static ֫(Ll/۫֫ܳ;II)Ll/۫֫ܳ;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 29
    :cond_0
    iget v0, p0, Ll/۫֫ܳ;->ܳ:I

    .line 104
    :goto_0
    invoke-static {v0, p1, p2}, Ll/ۡܽܳ;->ܽ(III)V

    if-nez p2, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 108
    :cond_1
    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I)Ll/ۨ֫ܳ;

    move-result-object p0

    .line 109
    invoke-static {p0}, Ll/ۨ֫ܳ;->ۧ(Ll/ۨ֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {p0, p2}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I)Ll/ۨ֫ܳ;

    move-result-object p0

    invoke-static {p0}, Ll/ۨ֫ܳ;->֫(Ll/ۨ֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫֫ܳ;III)Ll/۫֫ܳ;
    .locals 3

    if-nez p0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 29
    :cond_0
    iget v0, p0, Ll/۫֫ܳ;->ܳ:I

    :goto_0
    if-ltz p1, :cond_2

    if-lt p2, p1, :cond_2

    if-gt p2, v0, :cond_2

    if-ltz p3, :cond_2

    sub-int v0, p2, p1

    const/4 v1, 0x1

    if-ne v0, p3, :cond_1

    if-eqz p3, :cond_1

    .line 119
    filled-new-array {p1}, [I

    move-result-object p1

    invoke-static {p0, p1, v1, p3}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;[III)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0

    .line 121
    :cond_1
    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I)Ll/ۨ֫ܳ;

    move-result-object p0

    .line 122
    invoke-static {p0}, Ll/ۨ֫ܳ;->ۧ(Ll/ۨ֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    sub-int/2addr p2, p1

    invoke-static {v0, p2}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I)Ll/ۨ֫ܳ;

    move-result-object p1

    .line 123
    invoke-static {p0}, Ll/ۨ֫ܳ;->֫(Ll/ۨ֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {p3, v1}, Ll/ܰ֫ܳ;->ۧ(IZ)Ll/۫֫ܳ;

    move-result-object p2

    invoke-static {p0, p2}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {p1}, Ll/ۨ֫ܳ;->ۧ(Ll/ۨ֫ܳ;)Ll/۫֫ܳ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0

    .line 115
    :cond_2
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, ", end="

    const-string v1, ", replacementLength="

    const-string v2, "start="

    .line 0
    invoke-static {v2, p1, v0, v1, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 115
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/۫֫ܳ;I[IIII)Ll/۫֫ܳ;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v1, p4

    int-to-long v2, v7

    .line 149
    iget v4, v0, Ll/۫֫ܳ;->ܳ:I

    iget-object v9, v0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    int-to-long v4, v4

    add-long v10, v4, v2

    move/from16 v12, p5

    int-to-long v13, v12

    sub-long v4, v2, v13

    const-wide/16 v15, 0x1

    add-long/2addr v4, v15

    move/from16 v6, p3

    .line 150
    invoke-static {v6, v4, v5, v8, v1}, Ll/ܰ֫ܳ;->֫(IJ[II)I

    move-result v6

    .line 152
    invoke-static {v6, v10, v11, v8, v1}, Ll/ܰ֫ܳ;->֫(IJ[II)I

    move-result v5

    if-ge v6, v5, :cond_7

    .line 153
    invoke-virtual/range {p0 .. p0}, Ll/۫֫ܳ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Ll/۫֫ܳ;->᩷:Z

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 156
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/۫֫ܳ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_2

    .line 157
    iget-object v1, v0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v6

    move v10, v5

    move v11, v6

    move/from16 v6, p5

    invoke-static/range {v1 .. v6}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I[IIII)Ll/۫֫ܳ;

    move-result-object v13

    .line 159
    iget-object v1, v0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    iget v2, v9, Ll/۫֫ܳ;->ܳ:I

    add-int/2addr v2, v7

    move v4, v11

    invoke-static/range {v1 .. v6}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I[IIII)Ll/۫֫ܳ;

    move-result-object v1

    if-ne v13, v9, :cond_1

    .line 161
    iget-object v2, v0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    if-ne v1, v2, :cond_1

    goto/16 :goto_2

    .line 164
    :cond_1
    invoke-static {v13, v1}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    return-object v0

    :cond_2
    move v9, v6

    move v6, v5

    .line 167
    invoke-virtual/range {p0 .. p0}, Ll/۫֫ܳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 168
    iget-object v1, v0, Ll/۫֫ܳ;->ۧ:[J

    invoke-virtual {v1}, [J->clone()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, [J

    .line 169
    iget v3, v0, Ll/۫֫ܳ;->ܳ:I

    move-object v1, v10

    move/from16 v2, p1

    move-object/from16 v4, p2

    move v5, v9

    move/from16 v7, p5

    invoke-static/range {v1 .. v7}, Ll/ܰ֫ܳ;->֫([JII[IIII)V

    .line 171
    iget v0, v0, Ll/۫֫ܳ;->ܳ:I

    invoke-static {v0, v10}, Ll/ܰ֫ܳ;->ܽ(I[J)Ll/۫֫ܳ;

    move-result-object v0

    return-object v0

    .line 174
    :cond_3
    aget v0, v8, v9

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v5, v6, -0x1

    .line 175
    aget v1, v8, v5

    int-to-long v4, v1

    add-long/2addr v4, v13

    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    int-to-long v0, v0

    const-wide/32 v17, 0x10000

    .line 177
    div-long v0, v0, v17

    mul-long v0, v0, v17

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/32 v19, 0xffff

    add-long v4, v4, v19

    .line 179
    div-long v4, v4, v17

    mul-long v4, v4, v17

    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const/4 v7, 0x0

    cmp-long v19, v2, v0

    if-gez v19, :cond_4

    sub-long v2, v0, v2

    long-to-int v3, v2

    .line 185
    invoke-static {v3, v7}, Ll/ܰ֫ܳ;->ۧ(IZ)Ll/۫֫ܳ;

    move-result-object v2

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    move-object v3, v2

    :goto_1
    cmp-long v2, v0, v4

    if-gez v2, :cond_5

    .line 189
    div-long v19, v0, v17

    add-long v19, v19, v15

    mul-long v7, v19, v17

    .line 191
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    sub-long/2addr v7, v0

    long-to-int v8, v7

    .line 192
    invoke-static {v8}, Ll/ܰ֫ܳ;->ܽ(I)I

    move-result v2

    new-array v7, v2, [J

    sub-long v19, v0, v13

    move-object/from16 p1, v3

    add-long v2, v19, v15

    move-object/from16 v15, p2

    .line 193
    invoke-static {v9, v2, v3, v15, v6}, Ll/ܰ֫ܳ;->֫(IJ[II)I

    move-result v3

    move-wide/from16 p3, v4

    int-to-long v4, v8

    add-long/2addr v4, v0

    .line 195
    invoke-static {v3, v4, v5, v15, v6}, Ll/ܰ֫ܳ;->֫(IJ[II)I

    move-result v16

    long-to-int v1, v0

    move-object v0, v7

    move v2, v8

    move/from16 v21, v3

    move/from16 v22, v9

    move-object/from16 v9, p1

    move-object/from16 v3, p2

    move-wide/from16 v23, p3

    move-wide/from16 v25, v4

    move/from16 v4, v21

    move/from16 v5, v16

    move/from16 v16, v6

    move/from16 v6, p5

    .line 197
    invoke-static/range {v0 .. v6}, Ll/ܰ֫ܳ;->֫([JII[IIII)V

    .line 199
    invoke-static {v8, v7}, Ll/ܰ֫ܳ;->ܽ(I[J)Ll/۫֫ܳ;

    move-result-object v0

    invoke-static {v9, v0}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object v3

    move-object v8, v15

    move/from16 v6, v16

    move/from16 v9, v22

    move-wide/from16 v4, v23

    move-wide/from16 v0, v25

    const/4 v7, 0x0

    const-wide/16 v15, 0x1

    goto :goto_1

    :cond_5
    move-object v9, v3

    move-wide/from16 v23, v4

    cmp-long v0, v23, v10

    if-gez v0, :cond_6

    sub-long v10, v10, v23

    long-to-int v0, v10

    const/4 v1, 0x0

    .line 203
    invoke-static {v0, v1}, Ll/ܰ֫ܳ;->ۧ(IZ)Ll/۫֫ܳ;

    move-result-object v0

    invoke-static {v9, v0}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    return-object v0

    :cond_6
    return-object v9

    :cond_7
    :goto_2
    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫֫ܳ;[III)Ll/۫֫ܳ;
    .locals 8

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 29
    :cond_0
    iget v1, p0, Ll/۫֫ܳ;->ܳ:I

    :goto_0
    if-lez p3, :cond_4

    if-ltz p2, :cond_4

    .line 131
    array-length v2, p1

    if-gt p2, v2, :cond_4

    const/4 v2, -0x1

    :goto_1
    if-ge v0, p2, :cond_2

    .line 136
    aget v3, p1, v0

    int-to-long v4, v3

    int-to-long v6, p3

    add-long/2addr v4, v6

    if-ltz v3, :cond_1

    if-lt v3, v2, :cond_1

    int-to-long v6, v1

    cmp-long v2, v4, v6

    if-gtz v2, :cond_1

    long-to-int v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 139
    :cond_1
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string p1, "Invalid dirty match offset "

    .line 0
    invoke-static {v3, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 139
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    if-nez p2, :cond_3

    return-object p0

    :cond_3
    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, p1

    move v4, p2

    move v5, p3

    .line 143
    invoke-static/range {v0 .. v5}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I[IIII)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0

    .line 132
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid dirty batch"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(II[J)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ܰ֫ܳ;->ۧ(II[J)V

    return-void
.end method

.method public static ֫(Ll/۫֫ܳ;I[ZI)V
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 29
    :cond_0
    iget v1, p0, Ll/۫֫ܳ;->ܳ:I

    .line 56
    :goto_0
    invoke-static {v1, p1, p3}, Ll/ۡܽܳ;->ܽ(III)V

    .line 57
    array-length v1, p2

    invoke-static {v1, v0, p3}, Ll/ۡܽܳ;->ۧ(III)V

    if-nez p3, :cond_1

    return-void

    .line 61
    :cond_1
    invoke-static {p0, p1, p2, v0, p3}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I[ZII)V

    return-void
.end method

.method public static ֫(Ll/۫֫ܳ;I[ZII)V
    .locals 10

    .line 65
    invoke-virtual {p0}, Ll/۫֫ܳ;->ۧ()Z

    move-result v0

    iget-object v1, p0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    .line 66
    invoke-virtual {p0}, Ll/۫֫ܳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    iget-object p0, p0, Ll/۫֫ܳ;->ۧ:[J

    add-int/2addr p4, p1

    :goto_0
    if-ge p1, p4, :cond_5

    and-int/lit8 v0, p1, 0x3f

    sub-int v1, p4, p1

    rsub-int/lit8 v2, v0, 0x40

    .line 94
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    ushr-int/lit8 v2, p1, 0x6

    .line 95
    aget-wide v2, p0, v2

    ushr-long/2addr v2, v0

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v1, :cond_1

    add-int/lit8 v4, p3, 0x1

    const-wide/16 v5, 0x1

    shl-long/2addr v5, v0

    and-long/2addr v5, v2

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-eqz v9, :cond_0

    const/4 v5, 0x1

    goto :goto_2

    :cond_0
    const/4 v5, 0x0

    .line 97
    :goto_2
    aput-boolean v5, p2, p3

    add-int/lit8 v0, v0, 0x1

    move p3, v4

    goto :goto_1

    :cond_1
    add-int/2addr p1, v1

    goto :goto_0

    :cond_2
    add-int/2addr p4, p3

    .line 69
    iget-boolean p0, p0, Ll/۫֫ܳ;->᩷:Z

    invoke-static {p2, p3, p4, p0}, Ljava/util/Arrays;->fill([ZIIZ)V

    return-void

    .line 73
    :cond_3
    iget v0, v1, Ll/۫֫ܳ;->ܳ:I

    if-ge p1, v0, :cond_4

    sub-int/2addr v0, p1

    .line 75
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 76
    invoke-static {v1, p1, p2, p3, v0}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I[ZII)V

    add-int/2addr p3, v0

    sub-int/2addr p4, v0

    goto :goto_3

    :cond_4
    sub-int v2, p1, v0

    :goto_3
    if-lez p4, :cond_5

    .line 84
    iget-object p0, p0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    invoke-static {p0, v2, p2, p3, p4}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;I[ZII)V

    :cond_5
    return-void
.end method

.method public static ֫([JII[IIII)V
    .locals 6

    int-to-long v0, p1

    int-to-long v2, p2

    add-long/2addr v0, v2

    :goto_0
    if-ge p4, p5, :cond_1

    .line 214
    aget p2, p3, p4

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 215
    aget v2, p3, p4

    int-to-long v2, v2

    int-to-long v4, p6

    add-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    if-ge p2, v3, :cond_0

    sub-int/2addr p2, p1

    sub-int/2addr v3, p1

    .line 218
    invoke-static {p2, v3, p0}, Ll/ܰ֫ܳ;->ۧ(II[J)V

    :cond_0
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۧ(I)I
    .locals 1

    if-lez p0, :cond_0

    const/high16 v0, 0x10000

    if-gt p0, v0, :cond_0

    .line 295
    invoke-static {p0}, Ll/ܰ֫ܳ;->ܽ(I)I

    move-result p0

    return p0

    .line 293
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid dirty bitmap length"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(JJ)J
    .locals 3

    add-long/2addr p2, p0

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_1

    cmp-long v0, p2, p0

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    return-wide p2

    :cond_1
    :goto_0
    const-wide p0, 0x7fffffffffffffffL

    return-wide p0
.end method

.method public static ۧ(IZ)Ll/۫֫ܳ;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 25
    :cond_0
    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->֫(IZ)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/۫֫ܳ;II)Ll/۫֫ܳ;
    .locals 8

    .line 572
    invoke-static {p2}, Ll/ܰ֫ܳ;->ܽ(I)I

    move-result v0

    new-array v0, v0, [J

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    .line 574
    iget-object v2, p0, Ll/۫֫ܳ;->ۧ:[J

    add-int v3, p1, v1

    invoke-static {v3, v2}, Ll/ܰ֫ܳ;->ۧ(I[J)Z

    move-result v2

    if-eqz v2, :cond_0

    ushr-int/lit8 v2, v1, 0x6

    .line 575
    aget-wide v3, v0, v2

    and-int/lit8 v5, v1, 0x3f

    const-wide/16 v6, 0x1

    shl-long v5, v6, v5

    or-long/2addr v3, v5

    aput-wide v3, v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 578
    :cond_1
    invoke-static {p2, v0}, Ll/ܰ֫ܳ;->ܽ(I[J)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;
    .locals 9

    .line 626
    new-instance v8, Ll/۫֫ܳ;

    iget v0, p0, Ll/۫֫ܳ;->ܳ:I

    iget v1, p1, Ll/۫֫ܳ;->ܳ:I

    int-to-long v2, v0

    int-to-long v0, v1

    add-long/2addr v2, v0

    long-to-int v4, v2

    int-to-long v0, v4

    cmp-long v5, v2, v0

    if-nez v5, :cond_2

    iget v0, p0, Ll/۫֫ܳ;->ᩳ:I

    iget v1, p1, Ll/۫֫ܳ;->ᩳ:I

    .line 627
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v5, v0, 0x1

    iget-boolean v0, p0, Ll/۫֫ܳ;->֫:Z

    if-nez v0, :cond_1

    iget-boolean v0, p1, Ll/۫֫ܳ;->֫:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v7, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    const/4 v7, 0x1

    :goto_1
    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Ll/۫֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;[JIIZZ)V

    return-object v8

    .line 0
    :cond_2
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0
.end method

.method public static ۧ(II[J)V
    .locals 8

    ushr-int/lit8 v0, p0, 0x6

    add-int/lit8 p1, p1, -0x1

    ushr-int/lit8 v1, p1, 0x6

    and-int/lit8 p0, p0, 0x3f

    const-wide/16 v2, -0x1

    shl-long v4, v2, p0

    and-int/lit8 p0, p1, 0x3f

    rsub-int/lit8 p0, p0, 0x3f

    ushr-long p0, v2, p0

    if-ne v0, v1, :cond_0

    .line 230
    aget-wide v1, p2, v0

    and-long/2addr p0, v4

    or-long/2addr p0, v1

    aput-wide p0, p2, v0

    return-void

    .line 233
    :cond_0
    aget-wide v6, p2, v0

    or-long/2addr v4, v6

    aput-wide v4, p2, v0

    add-int/lit8 v0, v0, 0x1

    .line 234
    invoke-static {p2, v0, v1, v2, v3}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 235
    aget-wide v2, p2, v1

    or-long/2addr p0, v2

    aput-wide p0, p2, v1

    return-void
.end method

.method public static ۧ(Ll/۫֫ܳ;)V
    .locals 0

    .line 360
    invoke-static {p0}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;)Ll/۬֫ܳ;

    return-void
.end method

.method public static ۧ(I[J)Z
    .locals 4

    ushr-int/lit8 v0, p0, 0x6

    .line 610
    aget-wide v0, p1, v0

    and-int/lit8 p0, p0, 0x3f

    const-wide/16 v2, 0x1

    shl-long p0, v2, p0

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-eqz v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܳ(Ll/۫֫ܳ;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 43
    :cond_0
    iget-wide v0, p0, Ll/۫֫ܳ;->᩻:J

    return-wide v0
.end method

.method public static ܽ(I)I
    .locals 0

    add-int/lit8 p0, p0, 0x3f

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method

.method public static ܽ(I[J)Ll/۫֫ܳ;
    .locals 17

    move/from16 v4, p0

    move-object/from16 v3, p1

    if-lez v4, :cond_7

    const/high16 v0, 0x10000

    if-gt v4, v0, :cond_7

    .line 583
    array-length v0, v3

    .line 584
    invoke-static/range {p0 .. p0}, Ll/ܰ֫ܳ;->ܽ(I)I

    move-result v1

    if-ne v0, v1, :cond_7

    and-int/lit8 v0, v4, 0x3f

    const-wide/16 v1, 0x1

    const/4 v5, 0x1

    if-eqz v0, :cond_0

    .line 589
    array-length v6, v3

    sub-int/2addr v6, v5

    aget-wide v7, v3, v6

    shl-long v9, v1, v0

    sub-long/2addr v9, v1

    and-long/2addr v7, v9

    aput-wide v7, v3, v6

    :cond_0
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    .line 593
    :goto_0
    array-length v10, v3

    if-ge v7, v10, :cond_4

    .line 594
    array-length v10, v3

    sub-int/2addr v10, v5

    if-ne v7, v10, :cond_1

    if-eqz v0, :cond_1

    shl-long v10, v1, v0

    sub-long/2addr v10, v1

    goto :goto_1

    :cond_1
    const-wide/16 v10, -0x1

    .line 596
    :goto_1
    aget-wide v12, v3, v7

    const-wide/16 v14, 0x0

    cmp-long v16, v12, v14

    if-eqz v16, :cond_2

    const/4 v14, 0x1

    goto :goto_2

    :cond_2
    const/4 v14, 0x0

    :goto_2
    or-int/2addr v8, v14

    cmp-long v14, v12, v10

    if-nez v14, :cond_3

    const/4 v10, 0x1

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    and-int/2addr v9, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_4
    if-nez v8, :cond_5

    .line 601
    invoke-static {v4, v6}, Ll/ܰ֫ܳ;->֫(IZ)Ll/۫֫ܳ;

    move-result-object v0

    return-object v0

    :cond_5
    if-eqz v9, :cond_6

    .line 604
    invoke-static {v4, v5}, Ll/ܰ֫ܳ;->֫(IZ)Ll/۫֫ܳ;

    move-result-object v0

    return-object v0

    .line 606
    :cond_6
    new-instance v8, Ll/۫֫ܳ;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x1

    move-object v0, v8

    move-object/from16 v3, p1

    move/from16 v4, p0

    invoke-direct/range {v0 .. v7}, Ll/۫֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;[JIIZZ)V

    return-object v8

    .line 585
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid dirty bitmap"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;
    .locals 5

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    :cond_1
    move-object v0, p0

    .line 564
    :goto_0
    invoke-virtual {v0}, Ll/۫֫ܳ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_2

    .line 565
    iget-object v0, v0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    goto :goto_0

    :cond_2
    move-object v1, p1

    .line 557
    :goto_1
    invoke-virtual {v1}, Ll/۫֫ܳ;->ۧ()Z

    move-result v2

    if-nez v2, :cond_3

    .line 558
    iget-object v1, v1, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    goto :goto_1

    .line 479
    :cond_3
    invoke-virtual {v0}, Ll/۫֫ܳ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Ll/۫֫ܳ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-boolean v0, v0, Ll/۫֫ܳ;->᩷:Z

    iget-boolean v1, v1, Ll/۫֫ܳ;->᩷:Z

    if-eq v0, v1, :cond_4

    goto :goto_2

    .line 483
    :cond_4
    invoke-static {p0}, Ll/ܰ֫ܳ;->ܿ(Ll/۫֫ܳ;)Ll/ۤ֫ܳ;

    move-result-object p0

    .line 484
    invoke-static {p1}, Ll/ܰ֫ܳ;->ᩳ(Ll/۫֫ܳ;)Ll/ۤ֫ܳ;

    move-result-object p1

    .line 485
    invoke-static {p0}, Ll/ۤ֫ܳ;->֫(Ll/ۤ֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    iget v0, v0, Ll/۫֫ܳ;->ܳ:I

    int-to-long v0, v0

    invoke-static {p1}, Ll/ۤ֫ܳ;->֫(Ll/ۤ֫ܳ;)Ll/۫֫ܳ;

    move-result-object v2

    iget v2, v2, Ll/۫֫ܳ;->ܳ:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_5

    long-to-int v1, v0

    .line 489
    invoke-static {p0}, Ll/ۤ֫ܳ;->֫(Ll/ۤ֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    iget-boolean v0, v0, Ll/۫֫ܳ;->᩷:Z

    invoke-static {v1, v0}, Ll/ܰ֫ܳ;->֫(IZ)Ll/۫֫ܳ;

    move-result-object v0

    .line 490
    invoke-static {p0}, Ll/ۤ֫ܳ;->ۧ(Ll/ۤ֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {p0, v0}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {p1}, Ll/ۤ֫ܳ;->ۧ(Ll/ۤ֫ܳ;)Ll/۫֫ܳ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0

    .line 487
    :cond_5
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string p1, "Dirty length overflow"

    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 481
    :cond_6
    :goto_2
    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->ᩳ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/۫֫ܳ;)Ll/۬֫ܳ;
    .locals 26

    move-object/from16 v0, p0

    if-nez v0, :cond_0

    .line 365
    new-instance v10, Ll/۬֫ܳ;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Ll/۬֫ܳ;-><init>(IIZZZJJ)V

    return-object v10

    .line 364
    :cond_0
    iget-object v1, v0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    iget-object v2, v0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    iget v3, v0, Ll/۫֫ܳ;->ᩳ:I

    iget-wide v4, v0, Ll/۫֫ܳ;->᩻:J

    iget-wide v6, v0, Ll/۫֫ܳ;->ܽ:J

    iget-boolean v8, v0, Ll/۫֫ܳ;->֫:Z

    iget v9, v0, Ll/۫֫ܳ;->ܳ:I

    iget-object v10, v0, Ll/۫֫ܳ;->ۧ:[J

    .line 367
    invoke-virtual/range {p0 .. p0}, Ll/۫֫ܳ;->ۧ()Z

    move-result v11

    const-wide/16 v12, 0x30

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eqz v11, :cond_e

    if-lez v9, :cond_d

    if-ne v3, v15, :cond_d

    .line 371
    invoke-virtual/range {p0 .. p0}, Ll/۫֫ܳ;->֫()Z

    move-result v1

    const-wide/16 v2, 0x0

    if-nez v1, :cond_3

    .line 372
    iget-boolean v1, v0, Ll/۫֫ܳ;->᩷:Z

    if-ne v8, v1, :cond_2

    cmp-long v8, v6, v2

    if-nez v8, :cond_1

    cmp-long v2, v4, v12

    if-nez v2, :cond_1

    .line 378
    new-instance v2, Ll/۬֫ܳ;

    iget v0, v0, Ll/۫֫ܳ;->ܳ:I

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x30

    const/16 v17, 0x1

    move-object/from16 v16, v2

    move/from16 v18, v0

    move/from16 v19, v1

    move/from16 v20, v1

    move/from16 v21, v1

    invoke-direct/range {v16 .. v25}, Ll/۬֫ܳ;-><init>(IIZZZJJ)V

    return-object v2

    .line 376
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid uniform dirty budget"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 373
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid uniform dirty leaf"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const/high16 v1, 0x10000

    if-gt v9, v1, :cond_c

    .line 381
    array-length v1, v10

    .line 382
    invoke-static {v9}, Ll/ܰ֫ܳ;->ܽ(I)I

    move-result v11

    if-ne v1, v11, :cond_c

    iget-boolean v1, v0, Ll/۫֫ܳ;->᩷:Z

    if-nez v1, :cond_c

    and-int/lit8 v1, v9, 0x3f

    if-eqz v1, :cond_5

    .line 387
    array-length v9, v10

    sub-int/2addr v9, v15

    aget-wide v16, v10, v9

    ushr-long v16, v16, v1

    cmp-long v9, v16, v2

    if-nez v9, :cond_4

    goto :goto_0

    .line 388
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Dirty bitmap has trailing bits"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 390
    :cond_5
    :goto_0
    invoke-static {v14, v10}, Ll/ܰ֫ܳ;->ۧ(I[J)Z

    move-result v9

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    .line 393
    :goto_1
    array-length v12, v10

    if-ge v11, v12, :cond_9

    .line 394
    array-length v12, v10

    sub-int/2addr v12, v15

    if-ne v11, v12, :cond_6

    if-eqz v1, :cond_6

    const-wide/16 v12, 0x1

    shl-long v19, v12, v1

    sub-long v19, v19, v12

    goto :goto_2

    :cond_6
    const-wide/16 v19, -0x1

    .line 396
    :goto_2
    aget-wide v12, v10, v11

    cmp-long v21, v12, v2

    if-eqz v21, :cond_7

    const/16 v21, 0x1

    goto :goto_3

    :cond_7
    const/16 v21, 0x0

    :goto_3
    or-int v14, v14, v21

    cmp-long v21, v12, v19

    if-nez v21, :cond_8

    const/4 v12, 0x1

    goto :goto_4

    :cond_8
    const/4 v12, 0x0

    :goto_4
    and-int v16, v16, v12

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_9
    if-eqz v14, :cond_b

    if-nez v16, :cond_b

    if-eqz v8, :cond_b

    .line 403
    array-length v1, v10

    int-to-long v1, v1

    const-wide/16 v11, 0x8

    mul-long v11, v11, v1

    const-wide/16 v1, 0x30

    add-long v13, v1, v11

    cmp-long v1, v6, v11

    if-nez v1, :cond_a

    cmp-long v1, v4, v13

    if-nez v1, :cond_a

    .line 408
    new-instance v1, Ll/۬֫ܳ;

    iget v4, v0, Ll/۫֫ܳ;->ܳ:I

    add-int/lit8 v0, v4, -0x1

    .line 409
    invoke-static {v0, v10}, Ll/ܰ֫ܳ;->ۧ(I[J)Z

    move-result v7

    const/4 v3, 0x1

    const/4 v5, 0x1

    move-object v2, v1

    move v6, v9

    move-wide v8, v11

    move-wide v10, v13

    invoke-direct/range {v2 .. v11}, Ll/۬֫ܳ;-><init>(IIZZZJJ)V

    return-object v1

    .line 406
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid bitmap dirty budget"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 401
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Dirty bitmap was not canonicalized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 384
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid bitmap dirty leaf"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 369
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid dirty leaf"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 411
    :cond_e
    invoke-static {v2}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;)Ll/۬֫ܳ;

    move-result-object v0

    .line 412
    invoke-static {v1}, Ll/ܰ֫ܳ;->ܽ(Ll/۫֫ܳ;)Ll/۬֫ܳ;

    move-result-object v11

    .line 413
    invoke-static {v0}, Ll/۬֫ܳ;->ᩳ(Ll/۬֫ܳ;)I

    move-result v12

    invoke-static {v11}, Ll/۬֫ܳ;->ᩳ(Ll/۬֫ܳ;)I

    move-result v13

    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v12

    add-int/2addr v12, v15

    .line 414
    invoke-static {v0}, Ll/۬֫ܳ;->ܳ(Ll/۬֫ܳ;)I

    move-result v13

    invoke-static {v11}, Ll/۬֫ܳ;->ܳ(Ll/۬֫ܳ;)I

    move-result v14

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    int-to-long v1, v13

    int-to-long v13, v14

    add-long/2addr v1, v13

    long-to-int v13, v1

    int-to-long v14, v13

    cmp-long v19, v1, v14

    if-nez v19, :cond_16

    .line 415
    invoke-static {v0}, Ll/۬֫ܳ;->֫(Ll/۬֫ܳ;)Z

    move-result v1

    if-nez v1, :cond_10

    invoke-static {v11}, Ll/۬֫ܳ;->֫(Ll/۬֫ܳ;)Z

    move-result v1

    if-eqz v1, :cond_f

    goto :goto_5

    :cond_f
    const/4 v1, 0x0

    goto :goto_6

    :cond_10
    :goto_5
    const/4 v1, 0x1

    .line 416
    :goto_6
    invoke-static {v0}, Ll/۬֫ܳ;->ۧ(Ll/۬֫ܳ;)J

    move-result-wide v14

    move-wide/from16 v19, v4

    invoke-static {v11}, Ll/۬֫ܳ;->ۧ(Ll/۬֫ܳ;)J

    move-result-wide v4

    invoke-static {v14, v15, v4, v5}, Ll/ܰ֫ܳ;->ۧ(JJ)J

    move-result-wide v22

    .line 417
    invoke-static {v0}, Ll/۬֫ܳ;->᩻(Ll/۬֫ܳ;)J

    move-result-wide v4

    invoke-static {v11}, Ll/۬֫ܳ;->᩻(Ll/۬֫ܳ;)J

    move-result-wide v14

    .line 418
    invoke-static {v4, v5, v14, v15}, Ll/ܰ֫ܳ;->ۧ(JJ)J

    move-result-wide v4

    const-wide/16 v14, 0x30

    .line 417
    invoke-static {v14, v15, v4, v5}, Ll/ܰ֫ܳ;->ۧ(JJ)J

    move-result-wide v24

    if-ne v3, v12, :cond_15

    if-ne v9, v13, :cond_15

    if-ne v8, v1, :cond_15

    if-nez v10, :cond_15

    cmp-long v2, v6, v22

    if-nez v2, :cond_15

    cmp-long v2, v19, v24

    if-nez v2, :cond_15

    .line 419
    invoke-static {v0}, Ll/۬֫ܳ;->ᩳ(Ll/۬֫ܳ;)I

    move-result v2

    invoke-static {v11}, Ll/۬֫ܳ;->ᩳ(Ll/۬֫ܳ;)I

    move-result v3

    sub-int/2addr v2, v3

    .line 422
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v3, 0x1

    if-gt v2, v3, :cond_15

    move-object/from16 v2, v17

    .line 564
    :goto_7
    invoke-virtual {v2}, Ll/۫֫ܳ;->ۧ()Z

    move-result v3

    if-nez v3, :cond_11

    .line 565
    iget-object v2, v2, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    goto :goto_7

    :cond_11
    move-object/from16 v3, v16

    .line 557
    :goto_8
    invoke-virtual {v3}, Ll/۫֫ܳ;->ۧ()Z

    move-result v4

    if-nez v4, :cond_12

    .line 558
    iget-object v3, v3, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    goto :goto_8

    .line 427
    :cond_12
    invoke-virtual {v2}, Ll/۫֫ܳ;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual {v3}, Ll/۫֫ܳ;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_14

    iget-boolean v2, v2, Ll/۫֫ܳ;->᩷:Z

    iget-boolean v3, v3, Ll/۫֫ܳ;->᩷:Z

    if-eq v2, v3, :cond_13

    goto :goto_9

    .line 429
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Adjacent dirty runs were not merged"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 431
    :cond_14
    :goto_9
    new-instance v2, Ll/۬֫ܳ;

    invoke-static {v0}, Ll/۬֫ܳ;->ܽ(Ll/۬֫ܳ;)Z

    move-result v20

    invoke-static {v11}, Ll/۬֫ܳ;->ܿ(Ll/۬֫ܳ;)Z

    move-result v21

    move-object/from16 v16, v2

    move/from16 v17, v12

    move/from16 v18, v13

    move/from16 v19, v1

    invoke-direct/range {v16 .. v25}, Ll/۬֫ܳ;-><init>(IIZZZJJ)V

    return-object v2

    .line 423
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid dirty AVL branch"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 0
    :cond_16
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0
.end method

.method public static ܿ(Ll/۫֫ܳ;)Ll/ۤ֫ܳ;
    .locals 3

    .line 531
    invoke-virtual {p0}, Ll/۫֫ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 532
    new-instance v0, Ll/ۤ֫ܳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۤ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;)V

    return-object v0

    .line 534
    :cond_0
    iget-object v0, p0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    invoke-static {v0}, Ll/ܰ֫ܳ;->ܿ(Ll/۫֫ܳ;)Ll/ۤ֫ܳ;

    move-result-object v0

    .line 535
    new-instance v1, Ll/ۤ֫ܳ;

    iget-object p0, p0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    invoke-static {v0}, Ll/ۤ֫ܳ;->ۧ(Ll/ۤ֫ܳ;)Ll/۫֫ܳ;

    move-result-object v2

    invoke-static {p0, v2}, Ll/ܰ֫ܳ;->ᩳ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {v0}, Ll/ۤ֫ܳ;->֫(Ll/ۤ֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ll/ۤ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;)V

    return-object v1
.end method

.method public static ᩳ(Ll/۫֫ܳ;)Ll/ۤ֫ܳ;
    .locals 3

    .line 539
    invoke-virtual {p0}, Ll/۫֫ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 540
    new-instance v0, Ll/ۤ֫ܳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۤ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;)V

    return-object v0

    .line 542
    :cond_0
    iget-object v0, p0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    invoke-static {v0}, Ll/ܰ֫ܳ;->ᩳ(Ll/۫֫ܳ;)Ll/ۤ֫ܳ;

    move-result-object v0

    .line 543
    new-instance v1, Ll/ۤ֫ܳ;

    invoke-static {v0}, Ll/ۤ֫ܳ;->ۧ(Ll/ۤ֫ܳ;)Ll/۫֫ܳ;

    move-result-object v2

    iget-object p0, p0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    invoke-static {v2, p0}, Ll/ܰ֫ܳ;->ᩳ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {v0}, Ll/ۤ֫ܳ;->֫(Ll/ۤ֫ܳ;)Ll/۫֫ܳ;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ll/ۤ֫ܳ;-><init>(Ll/۫֫ܳ;Ll/۫֫ܳ;)V

    return-object v1
.end method

.method public static ᩳ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;
    .locals 3

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    .line 500
    :cond_1
    iget v0, p0, Ll/۫֫ܳ;->ᩳ:I

    iget v1, p1, Ll/۫֫ܳ;->ᩳ:I

    add-int/lit8 v2, v1, 0x1

    if-le v0, v2, :cond_2

    .line 501
    iget-object v0, p0, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    iget-object p0, p0, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->ᩳ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {p0}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-le v1, v0, :cond_3

    .line 504
    iget-object v0, p1, Ll/۫֫ܳ;->ܿ:Ll/۫֫ܳ;

    invoke-static {p0, v0}, Ll/ܰ֫ܳ;->ᩳ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    iget-object p1, p1, Ll/۫֫ܳ;->ۜ:Ll/۫֫ܳ;

    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    invoke-static {p0}, Ll/ܰ֫ܳ;->֫(Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0

    .line 506
    :cond_3
    invoke-static {p0, p1}, Ll/ܰ֫ܳ;->ۧ(Ll/۫֫ܳ;Ll/۫֫ܳ;)Ll/۫֫ܳ;

    move-result-object p0

    return-object p0
.end method
