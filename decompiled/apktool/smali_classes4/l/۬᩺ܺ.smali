.class public final Ll/۬᩺ܺ;
.super Ll/۫᩺ܺ;
.source "T61X"


# direct methods
.method public static ֫(BBBB)I
    .locals 0

    shl-int/lit8 p0, p0, 0x18

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p0, p1

    and-int/lit16 p1, p2, 0xff

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    and-int/lit16 p1, p3, 0xff

    or-int/2addr p0, p1

    return p0
.end method

.method public static ֫(III[I)I
    .locals 1

    :goto_0
    if-ge p1, p2, :cond_1

    .line 167
    aget v0, p3, p1

    if-ne v0, p0, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(J)I
    .locals 4

    long-to-int v0, p0

    int-to-long v1, v0

    cmp-long v3, v1, p0

    if-nez v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Out of range: %s"

    .line 97
    invoke-static {p0, p1, v2, v1}, Ll/ۘܶܺ;->֫(JLjava/lang/String;Z)V

    return v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 18

    move-object/from16 v0, p0

    .line 902
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 408
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2d

    if-ne v3, v4, :cond_1

    const/4 v1, 0x1

    .line 410
    :cond_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v1, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v1, 0x1

    .line 413
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ll/ۤ᩺ܺ;->֫(C)I

    move-result v4

    if-ltz v4, :cond_9

    const/16 v5, 0xa

    if-lt v4, v5, :cond_3

    goto :goto_1

    :cond_3
    neg-int v4, v4

    int-to-long v6, v4

    int-to-long v8, v5

    const-wide/high16 v10, -0x8000000000000000L

    .line 419
    div-long v12, v10, v8

    .line 421
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_6

    add-int/lit8 v4, v3, 0x1

    .line 422
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ll/ۤ᩺ܺ;->֫(C)I

    move-result v3

    if-ltz v3, :cond_9

    if-ge v3, v5, :cond_9

    cmp-long v14, v6, v12

    if-gez v14, :cond_4

    goto :goto_1

    :cond_4
    mul-long v6, v6, v8

    int-to-long v14, v3

    add-long v16, v14, v10

    cmp-long v3, v6, v16

    if-gez v3, :cond_5

    goto :goto_1

    :cond_5
    sub-long/2addr v6, v14

    move v3, v4

    goto :goto_0

    :cond_6
    if-eqz v1, :cond_7

    .line 434
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_2

    :cond_7
    cmp-long v0, v6, v10

    if-nez v0, :cond_8

    goto :goto_1

    :cond_8
    neg-long v0, v6

    .line 438
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_2

    :cond_9
    :goto_1
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_b

    .line 847
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v1

    int-to-long v5, v1

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    goto :goto_3

    .line 850
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_b
    :goto_3
    return-object v2
.end method

.method public static varargs ֫([I)Ljava/util/List;
    .locals 3

    .line 660
    array-length v0, p0

    if-nez v0, :cond_0

    .line 661
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 663
    :cond_0
    new-instance v0, Ll/ۗ᩺ܺ;

    const/4 v1, 0x0

    .line 673
    array-length v2, p0

    invoke-direct {v0, v1, v2, p0}, Ll/ۗ᩺ܺ;-><init>(II[I)V

    return-object v0
.end method

.method public static ֫(Ljava/util/Collection;)[I
    .locals 4

    .line 628
    instance-of v0, p0, Ll/ۗ᩺ܺ;

    if-eqz v0, :cond_0

    .line 629
    check-cast p0, Ll/ۗ᩺ܺ;

    .line 798
    iget-object v0, p0, Ll/ۗ᩺ܺ;->᩸:[I

    iget v1, p0, Ll/ۗ᩺ܺ;->᩶:I

    iget p0, p0, Ll/ۗ᩺ܺ;->᩹:I

    invoke-static {v0, v1, p0}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object p0

    return-object p0

    .line 632
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    .line 633
    array-length v0, p0

    .line 634
    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 637
    aget-object v3, p0, v2

    .line 902
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static ۧ(J)I
    .locals 3

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p0, v0

    if-lez v2, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    const-wide/32 v0, -0x80000000

    cmp-long v2, p0, v0

    if-gez v2, :cond_1

    const/high16 p0, -0x80000000

    return p0

    :cond_1
    long-to-int p1, p0

    return p1
.end method
