.class public final Ll/ۨ᩹ᩳ;
.super Ljava/lang/Object;
.source "H6V3"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Ll/᩶᩹ᩳ;

.field public final ᩳ:Ll/᩸۬ᩳ;


# direct methods
.method public constructor <init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p4, p0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    .line 24
    iput-object p1, p0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    .line 25
    iput p2, p0, Ll/ۨ᩹ᩳ;->֫:I

    .line 26
    iput p3, p0, Ll/ۨ᩹ᩳ;->ۧ:I

    return-void
.end method

.method private ֫(Ll/᩶᩹ᩳ;ILjava/lang/Object;)Ll/ۛ᩹ᩳ;
    .locals 12

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 205
    new-instance p1, Ll/ۛ᩹ᩳ;

    invoke-direct {p1, v0, v0}, Ll/ۛ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;)V

    return-object p1

    :cond_0
    if-nez p2, :cond_1

    .line 206
    new-instance p2, Ll/ۛ᩹ᩳ;

    invoke-direct {p2, v0, p1}, Ll/ۛ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;)V

    return-object p2

    .line 207
    :cond_1
    iget v1, p1, Ll/᩶᩹ᩳ;->ۧ:I

    if-ne p2, v1, :cond_2

    new-instance p2, Ll/ۛ᩹ᩳ;

    invoke-direct {p2, p1, v0}, Ll/ۛ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;)V

    return-object p2

    .line 208
    :cond_2
    instance-of v0, p1, Ll/᩸᩹ᩳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 209
    new-instance v0, Ll/᩺᩹ᩳ;

    iget-object v2, p0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget v3, p1, Ll/᩶᩹ᩳ;->ۧ:I

    invoke-direct {v0, v2, v3}, Ll/᩺᩹ᩳ;-><init>(Ll/᩸۬ᩳ;I)V

    .line 210
    :try_start_0
    invoke-virtual {v0}, Ll/᩺᩹ᩳ;->֫()[C

    move-result-object v2

    .line 211
    move-object v3, p1

    check-cast v3, Ll/᩸᩹ᩳ;

    iget v4, p1, Ll/᩶᩹ᩳ;->ۧ:I

    invoke-virtual {v3, v2, v4, v1}, Ll/᩸᩹ᩳ;->֫([CII)V

    .line 212
    new-instance v1, Ll/ۛ᩹ᩳ;

    new-instance v3, Ll/᩸᩹ᩳ;

    iget v6, p0, Ll/ۨ᩹ᩳ;->֫:I

    iget-object v10, p0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    const/4 v8, 0x0

    move-object v4, v3

    move-object v5, p3

    move-object v7, v2

    move v9, p2

    invoke-direct/range {v4 .. v10}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;I[CIILl/᩸۬ᩳ;)V

    new-instance v11, Ll/᩸᩹ᩳ;

    iget v6, p0, Ll/ۨ᩹ᩳ;->֫:I

    iget p1, p1, Ll/᩶᩹ᩳ;->ۧ:I

    sub-int v9, p1, p2

    iget-object v10, p0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    move-object v4, v11

    move-object v5, p3

    move-object v7, v2

    move v8, p2

    invoke-direct/range {v4 .. v10}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;I[CIILl/᩸۬ᩳ;)V

    invoke-direct {v1, v3, v11}, Ll/ۛ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    invoke-virtual {v0}, Ll/᩺᩹ᩳ;->close()V

    return-object v1

    :catchall_0
    move-exception p1

    .line 209
    :try_start_1
    invoke-virtual {v0}, Ll/᩺᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 216
    :cond_3
    check-cast p1, Ll/᩻᩹ᩳ;

    iget-object p1, p1, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    const/4 v0, 0x0

    .line 218
    :goto_1
    aget-object v2, p1, v0

    iget v3, v2, Ll/᩶᩹ᩳ;->ۧ:I

    if-le p2, v3, :cond_4

    add-int/lit8 v0, v0, 0x1

    sub-int/2addr p2, v3

    goto :goto_1

    .line 219
    :cond_4
    invoke-direct {p0, v2, p2, p3}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;ILjava/lang/Object;)Ll/ۛ᩹ᩳ;

    move-result-object p2

    .line 220
    invoke-static {p1, v1, v0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/᩶᩹ᩳ;

    invoke-static {p3, v1}, Ll/ۨ᩹ᩳ;->֫(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)Ll/᩶᩹ᩳ;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    .line 221
    array-length v2, p1

    invoke-static {p1, v0, v2}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩶᩹ᩳ;

    invoke-static {p3, p1}, Ll/ۨ᩹ᩳ;->֫(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)Ll/᩶᩹ᩳ;

    move-result-object p1

    .line 222
    new-instance v0, Ll/ۛ᩹ᩳ;

    iget-object v2, p2, Ll/ۛ᩹ᩳ;->֫:Ll/᩶᩹ᩳ;

    invoke-direct {p0, v1, v2, p3}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;Ljava/lang/Object;)Ll/᩶᩹ᩳ;

    move-result-object v1

    iget-object p2, p2, Ll/ۛ᩹ᩳ;->ۧ:Ll/᩶᩹ᩳ;

    invoke-direct {p0, p2, p1, p3}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;Ljava/lang/Object;)Ll/᩶᩹ᩳ;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/ۛ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;)V

    return-object v0
.end method

.method public static ֫(IILl/᩸۬ᩳ;)Ll/ۨ᩹ᩳ;
    .locals 2

    .line 31
    new-instance v0, Ll/ۨ᩹ᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1, p2}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)Ll/᩶᩹ᩳ;
    .locals 2

    .line 226
    array-length v0, p1

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 227
    :cond_0
    array-length v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 p0, 0x0

    aget-object p0, p1, p0

    return-object p0

    :cond_1
    new-instance v0, Ll/᩻᩹ᩳ;

    invoke-direct {v0, p0, p1}, Ll/᩻᩹ᩳ;-><init>(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)V

    return-object v0
.end method

.method private ֫(Ll/᩶᩹ᩳ;II[CILjava/lang/Object;Z)Ll/᩶᩹ᩳ;
    .locals 12

    move-object v0, p1

    move v2, p2

    move v3, p3

    move-object/from16 v8, p6

    .line 172
    instance-of v1, v0, Ll/᩸᩹ᩳ;

    if-eqz v1, :cond_2

    .line 173
    iget v1, v0, Ll/᩶᩹ᩳ;->ۧ:I

    sub-int v4, v3, v2

    sub-int/2addr v1, v4

    add-int v1, v1, p5

    move-object v9, p0

    .line 174
    iget v4, v9, Ll/ۨ᩹ᩳ;->֫:I

    if-gt v1, v4, :cond_6

    if-nez p7, :cond_0

    div-int/lit8 v4, v4, 0x2

    if-lt v1, v4, :cond_6

    :cond_0
    if-nez v1, :cond_1

    goto :goto_2

    .line 175
    :cond_1
    check-cast v0, Ll/᩸᩹ᩳ;

    move-object/from16 v1, p6

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    invoke-virtual/range {v0 .. v5}, Ll/᩸᩹ᩳ;->֫(Ljava/lang/Object;II[CI)Ll/᩸᩹ᩳ;

    move-result-object v0

    return-object v0

    :cond_2
    move-object v9, p0

    .line 177
    move-object v10, v0

    check-cast v10, Ll/᩻᩹ᩳ;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v11, 0x0

    .line 179
    :goto_0
    iget-object v1, v10, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v4, v1

    if-ge v11, v4, :cond_9

    .line 180
    aget-object v4, v1, v11

    .line 181
    iget v5, v4, Ll/᩶᩹ᩳ;->ۧ:I

    add-int/2addr v5, v0

    if-lt v2, v5, :cond_4

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ne v11, v1, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v11, v11, 0x1

    move v0, v5

    goto :goto_0

    :cond_4
    :goto_1
    if-le v3, v5, :cond_5

    goto :goto_2

    :cond_5
    sub-int/2addr v2, v0

    sub-int/2addr v3, v0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, v4

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    .line 183
    invoke-direct/range {v0 .. v7}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;II[CILjava/lang/Object;Z)Ll/᩶᩹ᩳ;

    move-result-object v0

    if-nez v0, :cond_7

    :cond_6
    :goto_2
    const/4 v0, 0x0

    return-object v0

    .line 185
    :cond_7
    iget-object v1, v10, Ll/᩶᩹ᩳ;->ᩳ:Ljava/lang/Object;

    if-ne v1, v8, :cond_8

    goto :goto_3

    :cond_8
    new-instance v1, Ll/᩻᩹ᩳ;

    iget-object v2, v10, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    invoke-virtual {v2}, [Ll/᩶᩹ᩳ;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/᩶᩹ᩳ;

    invoke-direct {v1, v8, v2}, Ll/᩻᩹ᩳ;-><init>(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)V

    move-object v10, v1

    .line 186
    :goto_3
    iget-object v1, v10, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    aput-object v0, v1, v11

    .line 187
    invoke-virtual {v10}, Ll/᩻᩹ᩳ;->֫()V

    return-object v10

    .line 192
    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method private ֫(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;Ljava/lang/Object;)Ll/᩶᩹ᩳ;
    .locals 0

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    if-nez p2, :cond_1

    return-object p1

    .line 233
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ll/ۨ᩹ᩳ;->ۧ(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;Ljava/lang/Object;)[Ll/᩶᩹ᩳ;

    move-result-object p1

    .line 234
    invoke-static {p3, p1}, Ll/ۨ᩹ᩳ;->֫(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)Ll/᩶᩹ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public static ֫(III)V
    .locals 4

    if-ltz p0, :cond_0

    if-lt p1, p0, :cond_0

    if-gt p1, p2, :cond_0

    return-void

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ".."

    const-string v2, "/"

    const-string v3, "Invalid text range: "

    .line 0
    invoke-static {v3, p0, v1, v2, p1}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 53
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ(III)V
    .locals 2

    int-to-long v0, p0

    int-to-long p0, p1

    sub-long/2addr v0, p0

    int-to-long p0, p2

    add-long/2addr v0, p0

    const-wide/32 p0, 0x7fffffff

    cmp-long p2, v0, p0

    if-gtz p2, :cond_0

    const-wide/16 p0, 0x0

    cmp-long p2, v0, p0

    if-ltz p2, :cond_0

    return-void

    .line 60
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Text exceeds UTF-16 coordinate limit"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ۧ(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;Ljava/lang/Object;)[Ll/᩶᩹ᩳ;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v9, p3

    .line 239
    iget v3, v0, Ll/᩶᩹ᩳ;->֫:I

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-nez v3, :cond_2

    iget v4, v2, Ll/᩶᩹ᩳ;->֫:I

    if-nez v4, :cond_2

    .line 240
    iget v3, v0, Ll/᩶᩹ᩳ;->ۧ:I

    iget v4, v2, Ll/᩶᩹ᩳ;->ۧ:I

    add-int v13, v3, v4

    .line 242
    iget v5, v1, Ll/ۨ᩹ᩳ;->֫:I

    if-le v13, v5, :cond_0

    div-int/2addr v5, v10

    if-lt v3, v5, :cond_0

    if-lt v4, v5, :cond_0

    new-array v3, v10, [Ll/᩶᩹ᩳ;

    aput-object v0, v3, v12

    aput-object v2, v3, v11

    return-object v3

    .line 245
    :cond_0
    new-instance v14, Ll/᩺᩹ᩳ;

    iget-object v3, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    invoke-direct {v14, v3, v13}, Ll/᩺᩹ᩳ;-><init>(Ll/᩸۬ᩳ;I)V

    .line 246
    :try_start_0
    invoke-virtual {v14}, Ll/᩺᩹ᩳ;->֫()[C

    move-result-object v15

    .line 247
    move-object v3, v0

    check-cast v3, Ll/᩸᩹ᩳ;

    iget v4, v0, Ll/᩶᩹ᩳ;->ۧ:I

    invoke-virtual {v3, v15, v4, v12}, Ll/᩸᩹ᩳ;->֫([CII)V

    .line 248
    move-object v3, v2

    check-cast v3, Ll/᩸᩹ᩳ;

    iget v2, v2, Ll/᩶᩹ᩳ;->ۧ:I

    iget v0, v0, Ll/᩶᩹ᩳ;->ۧ:I

    invoke-virtual {v3, v15, v2, v0}, Ll/᩸᩹ᩳ;->֫([CII)V

    .line 249
    iget v4, v1, Ll/ۨ᩹ᩳ;->֫:I

    if-gt v13, v4, :cond_1

    new-instance v0, Ll/᩸᩹ᩳ;

    iget-object v8, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    const/4 v6, 0x0

    move-object v2, v0

    move-object/from16 v3, p3

    move-object v5, v15

    move v7, v13

    invoke-direct/range {v2 .. v8}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;I[CIILl/᩸۬ᩳ;)V

    new-array v2, v11, [Ll/᩶᩹ᩳ;

    aput-object v0, v2, v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    invoke-virtual {v14}, Ll/᩺᩹ᩳ;->close()V

    return-object v2

    .line 250
    :cond_1
    :try_start_1
    div-int/lit8 v0, v13, 0x2

    .line 251
    new-instance v16, Ll/᩸᩹ᩳ;

    iget-object v8, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    const/4 v6, 0x0

    move-object/from16 v2, v16

    move-object/from16 v3, p3

    move-object v5, v15

    move v7, v0

    invoke-direct/range {v2 .. v8}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;I[CIILl/᩸۬ᩳ;)V

    new-instance v17, Ll/᩸᩹ᩳ;

    iget v4, v1, Ll/ۨ᩹ᩳ;->֫:I

    sub-int v7, v13, v0

    iget-object v8, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    move-object/from16 v2, v17

    move-object/from16 v3, p3

    move-object v5, v15

    move v6, v0

    invoke-direct/range {v2 .. v8}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;I[CIILl/᩸۬ᩳ;)V

    new-array v0, v10, [Ll/᩶᩹ᩳ;

    aput-object v16, v0, v12

    aput-object v17, v0, v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 253
    invoke-virtual {v14}, Ll/᩺᩹ᩳ;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 245
    :try_start_2
    invoke-virtual {v14}, Ll/᩺᩹ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2

    .line 256
    :cond_2
    iget v4, v2, Ll/᩶᩹ᩳ;->֫:I

    if-ne v3, v4, :cond_3

    .line 257
    check-cast v0, Ll/᩻᩹ᩳ;

    iget-object v0, v0, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    .line 258
    check-cast v2, Ll/᩻᩹ᩳ;

    iget-object v2, v2, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    .line 259
    array-length v3, v0

    array-length v4, v2

    add-int/2addr v3, v4

    new-array v3, v3, [Ll/᩶᩹ᩳ;

    .line 260
    array-length v4, v0

    invoke-static {v0, v12, v3, v12, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 261
    array-length v0, v0

    array-length v4, v2

    invoke-static {v2, v12, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    :cond_3
    if-le v3, v4, :cond_4

    .line 263
    check-cast v0, Ll/᩻᩹ᩳ;

    iget-object v0, v0, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    .line 264
    array-length v3, v0

    sub-int/2addr v3, v11

    aget-object v3, v0, v3

    invoke-direct {v1, v3, v2, v9}, Ll/ۨ᩹ᩳ;->ۧ(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;Ljava/lang/Object;)[Ll/᩶᩹ᩳ;

    move-result-object v2

    .line 265
    array-length v3, v0

    sub-int/2addr v3, v11

    array-length v4, v2

    add-int/2addr v3, v4

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ll/᩶᩹ᩳ;

    .line 266
    array-length v0, v0

    sub-int/2addr v0, v11

    array-length v4, v2

    invoke-static {v2, v12, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 268
    :cond_4
    check-cast v2, Ll/᩻᩹ᩳ;

    iget-object v2, v2, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    .line 269
    aget-object v3, v2, v12

    invoke-direct {v1, v0, v3, v9}, Ll/ۨ᩹ᩳ;->ۧ(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;Ljava/lang/Object;)[Ll/᩶᩹ᩳ;

    move-result-object v0

    .line 270
    array-length v3, v0

    array-length v4, v2

    add-int/2addr v3, v4

    sub-int/2addr v3, v11

    new-array v3, v3, [Ll/᩶᩹ᩳ;

    .line 271
    array-length v4, v0

    invoke-static {v0, v12, v3, v12, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 272
    array-length v0, v0

    array-length v4, v2

    sub-int/2addr v4, v11

    invoke-static {v2, v11, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 274
    :goto_1
    array-length v0, v3

    iget v2, v1, Ll/ۨ᩹ᩳ;->ۧ:I

    if-gt v0, v2, :cond_5

    new-instance v0, Ll/᩻᩹ᩳ;

    invoke-direct {v0, v9, v3}, Ll/᩻᩹ᩳ;-><init>(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)V

    new-array v2, v11, [Ll/᩶᩹ᩳ;

    aput-object v0, v2, v12

    return-object v2

    .line 275
    :cond_5
    array-length v0, v3

    div-int/2addr v0, v10

    .line 276
    new-instance v2, Ll/᩻᩹ᩳ;

    invoke-static {v3, v12, v0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ll/᩶᩹ᩳ;

    invoke-direct {v2, v9, v4}, Ll/᩻᩹ᩳ;-><init>(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)V

    new-instance v4, Ll/᩻᩹ᩳ;

    array-length v5, v3

    .line 277
    invoke-static {v3, v0, v5}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩶᩹ᩳ;

    invoke-direct {v4, v9, v0}, Ll/᩻᩹ᩳ;-><init>(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)V

    new-array v0, v10, [Ll/᩶᩹ᩳ;

    aput-object v2, v0, v12

    aput-object v4, v0, v11

    return-object v0
.end method


# virtual methods
.method public final ֫(I)C
    .locals 6

    .line 281
    iget-object v0, p0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    .line 282
    :cond_0
    :goto_0
    instance-of v1, v0, Ll/᩻᩹ᩳ;

    if-eqz v1, :cond_2

    .line 283
    move-object v1, v0

    check-cast v1, Ll/᩻᩹ᩳ;

    iget-object v1, v1, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 284
    iget v5, v4, Ll/᩶᩹ᩳ;->ۧ:I

    if-ge p1, v5, :cond_1

    move-object v0, v4

    goto :goto_0

    :cond_1
    sub-int/2addr p1, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 291
    :cond_2
    check-cast v0, Ll/᩸᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩹ᩳ;->֫(I)C

    move-result p1

    return p1
.end method

.method public final ֫()I
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget v0, v0, Ll/᩶᩹ᩳ;->֫:I

    return v0
.end method

.method public final ֫(IILjava/lang/CharSequence;)Ll/ۤ᩹ᩳ;
    .locals 7

    sub-int v0, p2, p1

    .line 106
    iget-object v1, p0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    const/4 v2, 0x0

    iget v3, p0, Ll/ۨ᩹ᩳ;->֫:I

    if-gt v0, v3, :cond_4

    .line 107
    new-instance v3, Ll/᩺᩹ᩳ;

    invoke-direct {v3, v1, v0}, Ll/᩺᩹ᩳ;-><init>(Ll/᩸۬ᩳ;I)V

    .line 109
    :try_start_0
    invoke-virtual {v3}, Ll/᩺᩹ᩳ;->֫()[C

    move-result-object v1

    .line 110
    instance-of v4, p3, Ll/۬᩹ᩳ;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    .line 111
    check-cast p3, Ll/۬᩹ᩳ;

    invoke-virtual {p3, p1, p2, v1, v5}, Ll/۬᩹ᩳ;->getChars(II[CI)V

    goto :goto_1

    .line 112
    :cond_0
    instance-of v4, p3, Ljava/lang/String;

    if-eqz v4, :cond_1

    check-cast p3, Ljava/lang/String;

    .line 113
    invoke-virtual {p3, p1, p2, v1, v5}, Ljava/lang/String;->getChars(II[CI)V

    goto :goto_1

    .line 114
    :cond_1
    instance-of p2, p3, Ljava/nio/CharBuffer;

    if-eqz p2, :cond_2

    move-object p2, p3

    check-cast p2, Ljava/nio/CharBuffer;

    invoke-virtual {p2}, Ljava/nio/CharBuffer;->hasArray()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 116
    invoke-virtual {p2}, Ljava/nio/CharBuffer;->array()[C

    move-result-object p3

    invoke-virtual {p2}, Ljava/nio/CharBuffer;->arrayOffset()I

    move-result v4

    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    move-result p2

    add-int/2addr v4, p2

    add-int/2addr v4, p1

    invoke-static {p3, v4, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    :cond_2
    :goto_0
    if-ge v5, v0, :cond_3

    add-int p2, p1, v5

    .line 118
    invoke-interface {p3, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p2

    aput-char p2, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 120
    :cond_3
    :goto_1
    new-instance p1, Ll/ۤ᩹ᩳ;

    invoke-direct {p1, v1, v2, v0, v3}, Ll/ۤ᩹ᩳ;-><init>([CLl/᩶᩹ᩳ;ILl/᩺᩹ᩳ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 122
    :goto_2
    invoke-virtual {v3}, Ll/᩺᩹ᩳ;->close()V

    .line 123
    throw p1

    .line 126
    :cond_4
    instance-of v4, p3, Ll/۬᩹ᩳ;

    if-eqz v4, :cond_5

    .line 127
    move-object v4, p3

    check-cast v4, Ll/۬᩹ᩳ;

    .line 128
    invoke-virtual {v4}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v5

    .line 129
    iget v6, v5, Ll/ۨ᩹ᩳ;->֫:I

    if-ne v6, v3, :cond_5

    iget v3, v5, Ll/ۨ᩹ᩳ;->ۧ:I

    iget v6, p0, Ll/ۨ᩹ᩳ;->ۧ:I

    if-ne v3, v6, :cond_5

    iget-object v3, v5, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-ne v3, v1, :cond_5

    .line 130
    new-instance p3, Ll/ۤ᩹ᩳ;

    invoke-virtual {v4}, Ll/۬᩹ᩳ;->֫()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v4}, Ll/۬᩹ᩳ;->֫()I

    move-result p1

    add-int/2addr p1, p2

    invoke-virtual {v5, v1, p1}, Ll/ۨ᩹ᩳ;->֫(II)Ll/ۨ᩹ᩳ;

    move-result-object p1

    iget-object p1, p1, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    invoke-direct {p3, v2, p1, v0, v2}, Ll/ۤ᩹ᩳ;-><init>([CLl/᩶᩹ᩳ;ILl/᩺᩹ᩳ;)V

    return-object p3

    .line 133
    :cond_5
    new-instance v1, Ll/ۤ᩹ᩳ;

    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2, p3, v3}, Ll/ۨ᩹ᩳ;->֫(IILjava/lang/CharSequence;Ljava/lang/Object;)Ll/ۨ᩹ᩳ;

    move-result-object p1

    iget-object p1, p1, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    invoke-direct {v1, v2, p1, v0, v2}, Ll/ۤ᩹ᩳ;-><init>([CLl/᩶᩹ᩳ;ILl/᩺᩹ᩳ;)V

    return-object v1
.end method

.method public final ֫(II)Ll/ۨ᩹ᩳ;
    .locals 3

    .line 196
    invoke-virtual {p0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    invoke-static {p1, p2, v0}, Ll/ۨ᩹ᩳ;->֫(III)V

    if-nez p1, :cond_0

    .line 197
    invoke-virtual {p0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    if-ne p2, v0, :cond_0

    return-object p0

    .line 198
    :cond_0
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 199
    iget-object v1, p0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    invoke-direct {p0, v1, p1, v0}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;ILjava/lang/Object;)Ll/ۛ᩹ᩳ;

    move-result-object v1

    .line 200
    new-instance v2, Ll/ۨ᩹ᩳ;

    iget-object v1, v1, Ll/ۛ᩹ᩳ;->ۧ:Ll/᩶᩹ᩳ;

    sub-int/2addr p2, p1

    invoke-direct {p0, v1, p2, v0}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;ILjava/lang/Object;)Ll/ۛ᩹ᩳ;

    move-result-object p1

    iget-object p1, p1, Ll/ۛ᩹ᩳ;->֫:Ll/᩶᩹ᩳ;

    iget p2, p0, Ll/ۨ᩹ᩳ;->ۧ:I

    iget-object v0, p0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget v1, p0, Ll/ۨ᩹ᩳ;->֫:I

    invoke-direct {v2, p1, v1, p2, v0}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    return-object v2
.end method

.method public final ֫(IILjava/lang/CharSequence;Ljava/lang/Object;)Ll/ۨ᩹ᩳ;
    .locals 22

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    const/4 v4, 0x0

    .line 66
    iget-object v5, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget v6, v1, Ll/ۨ᩹ᩳ;->ۧ:I

    iget v7, v1, Ll/ۨ᩹ᩳ;->֫:I

    if-ne v0, v2, :cond_0

    new-instance v0, Ll/ۨ᩹ᩳ;

    invoke-direct {v0, v4, v7, v6, v5}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    return-object v0

    :cond_0
    sub-int/2addr v2, v0

    .line 69
    div-int/lit8 v8, v7, 0x8

    sub-int v8, v7, v8

    if-gt v2, v7, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    int-to-long v9, v2

    int-to-long v11, v8

    add-long/2addr v9, v11

    const-wide/16 v13, 0x1

    sub-long/2addr v9, v13

    .line 71
    div-long/2addr v9, v11

    long-to-int v8, v9

    div-int/lit8 v9, v7, 0x2

    div-int v9, v2, v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 72
    :goto_0
    div-int v9, v2, v8

    rem-int/2addr v2, v8

    .line 73
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    new-instance v11, Ll/᩺᩹ᩳ;

    invoke-direct {v11, v5, v7}, Ll/᩺᩹ᩳ;-><init>(Ll/᩸۬ᩳ;I)V

    .line 75
    :try_start_0
    instance-of v12, v3, Ll/۬᩹ᩳ;

    if-eqz v12, :cond_2

    move-object v4, v3

    check-cast v4, Ll/۬᩹ᩳ;

    invoke-virtual {v4, v0}, Ll/۬᩹ᩳ;->ۧ(I)Ll/᩷᩹ᩳ;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 76
    :cond_2
    :try_start_1
    invoke-virtual {v11}, Ll/᩺᩹ᩳ;->֫()[C

    move-result-object v15

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v8, :cond_8

    if-ge v14, v2, :cond_3

    const/4 v13, 0x1

    goto :goto_2

    :cond_3
    const/4 v13, 0x0

    :goto_2
    add-int/2addr v13, v9

    if-eqz v4, :cond_4

    .line 79
    invoke-virtual {v4, v15, v12, v13}, Ll/᩷᩹ᩳ;->֫([CII)V

    move/from16 p2, v2

    move/from16 v19, v8

    goto :goto_4

    .line 80
    :cond_4
    instance-of v12, v3, Ljava/lang/String;

    if-eqz v12, :cond_5

    move-object v12, v3

    check-cast v12, Ljava/lang/String;

    move/from16 p2, v2

    add-int v2, v0, v13

    move/from16 v19, v8

    const/4 v8, 0x0

    invoke-virtual {v12, v0, v2, v15, v8}, Ljava/lang/String;->getChars(II[CI)V

    goto :goto_4

    :cond_5
    move/from16 p2, v2

    move/from16 v19, v8

    .line 81
    instance-of v2, v3, Ljava/nio/CharBuffer;

    if-eqz v2, :cond_6

    move-object v2, v3

    check-cast v2, Ljava/nio/CharBuffer;

    invoke-virtual {v2}, Ljava/nio/CharBuffer;->hasArray()Z

    move-result v8

    if-eqz v8, :cond_6

    .line 82
    invoke-virtual {v2}, Ljava/nio/CharBuffer;->array()[C

    move-result-object v8

    invoke-virtual {v2}, Ljava/nio/CharBuffer;->arrayOffset()I

    move-result v12

    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v12, v2

    add-int/2addr v12, v0

    const/4 v2, 0x0

    invoke-static {v8, v12, v15, v2, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_3
    if-ge v2, v13, :cond_7

    add-int v8, v0, v2

    .line 83
    invoke-interface {v3, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    aput-char v8, v15, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 84
    :cond_7
    :goto_4
    new-instance v2, Ll/᩸᩹ᩳ;

    iget v8, v1, Ll/ۨ᩹ᩳ;->֫:I

    iget-object v12, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    const/16 v16, 0x0

    move-object/from16 v18, v12

    move-object v12, v2

    move/from16 v20, v13

    move-object/from16 v13, p4

    move/from16 v21, v14

    move v14, v8

    move-object v8, v15

    move/from16 v17, v20

    invoke-direct/range {v12 .. v18}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;I[CIILl/᩸۬ᩳ;)V

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int v0, v0, v20

    add-int/lit8 v14, v21, 0x1

    const/4 v12, 0x0

    move/from16 v2, p2

    move-object v15, v8

    move/from16 v8, v19

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_8
    const/4 v0, 0x0

    if-eqz v4, :cond_9

    .line 87
    :try_start_2
    invoke-virtual {v4}, Ll/᩷᩹ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_9
    invoke-virtual {v11}, Ll/᩺᩹ᩳ;->close()V

    .line 88
    :goto_5
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_c

    .line 89
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v2, v6

    sub-int/2addr v2, v3

    div-int/2addr v2, v6

    .line 90
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    div-int/2addr v3, v2

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v4

    rem-int/2addr v4, v2

    .line 91
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v9, 0x0

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v2, :cond_b

    if-ge v11, v4, :cond_a

    const/4 v12, 0x1

    goto :goto_7

    :cond_a
    const/4 v12, 0x0

    :goto_7
    add-int/2addr v12, v3

    .line 95
    new-instance v13, Ll/᩻᩹ᩳ;

    add-int/2addr v12, v9

    invoke-virtual {v10, v9, v12}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v9

    new-array v14, v0, [Ll/᩶᩹ᩳ;

    invoke-interface {v9, v14}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Ll/᩶᩹ᩳ;

    move-object/from16 v14, p4

    invoke-direct {v13, v14, v9}, Ll/᩻᩹ᩳ;-><init>(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)V

    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    move v9, v12

    goto :goto_6

    :cond_b
    move-object/from16 v14, p4

    move-object v10, v8

    goto :goto_5

    .line 100
    :cond_c
    new-instance v2, Ll/ۨ᩹ᩳ;

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶᩹ᩳ;

    invoke-direct {v2, v0, v7, v6, v5}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    return-object v2

    :goto_8
    move-object v2, v0

    if-eqz v4, :cond_d

    .line 74
    :try_start_3
    invoke-virtual {v4}, Ll/᩷᩹ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_4
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_d
    :goto_9
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_5
    invoke-virtual {v11}, Ll/᩺᩹ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_a

    :catchall_3
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v2
.end method

.method public final ֫(IILl/ۤ᩹ᩳ;Ljava/lang/Object;)Ll/ۨ᩹ᩳ;
    .locals 17

    move-object/from16 v8, p0

    move/from16 v9, p1

    move/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    if-ne v9, v10, :cond_0

    .line 138
    iget v0, v11, Ll/ۤ᩹ᩳ;->᩹:I

    if-nez v0, :cond_0

    return-object v8

    .line 139
    :cond_0
    iget-object v0, v11, Ll/ۤ᩹ᩳ;->᩶:Ll/᩶᩹ᩳ;

    .line 140
    iget-object v4, v11, Ll/ۤ᩹ᩳ;->᩸:[C

    iget-object v13, v8, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    iget-object v14, v8, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget v15, v8, Ll/ۨ᩹ᩳ;->ۧ:I

    iget v7, v8, Ll/ۨ᩹ᩳ;->֫:I

    if-eqz v4, :cond_4

    if-eqz v13, :cond_1

    .line 142
    iget v5, v11, Ll/ۤ᩹ᩳ;->᩹:I

    const/16 v16, 0x1

    move-object/from16 v0, p0

    move-object v1, v13

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v6, p4

    move v10, v7

    move/from16 v7, v16

    invoke-direct/range {v0 .. v7}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;II[CILjava/lang/Object;Z)Ll/᩶᩹ᩳ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 143
    new-instance v1, Ll/ۨ᩹ᩳ;

    invoke-direct {v1, v0, v10, v15, v14}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    return-object v1

    :cond_1
    move v10, v7

    .line 145
    :cond_2
    iget v5, v11, Ll/ۤ᩹ᩳ;->᩹:I

    if-nez v5, :cond_3

    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    new-instance v7, Ll/᩸᩹ᩳ;

    iget-object v3, v11, Ll/ۤ᩹ᩳ;->᩸:[C

    const/4 v4, 0x0

    iget-object v6, v8, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget v2, v8, Ll/ۨ᩹ᩳ;->֫:I

    move-object v0, v7

    move-object/from16 v1, p4

    invoke-direct/range {v0 .. v6}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;I[CIILl/᩸۬ᩳ;)V

    goto :goto_0

    :cond_4
    move v10, v7

    .line 147
    :goto_0
    invoke-direct {v8, v13, v9, v12}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;ILjava/lang/Object;)Ll/ۛ᩹ᩳ;

    move-result-object v1

    .line 148
    iget-object v2, v1, Ll/ۛ᩹ᩳ;->ۧ:Ll/᩶᩹ᩳ;

    move v3, v10

    sub-int v4, p2, v9

    invoke-direct {v8, v2, v4, v12}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;ILjava/lang/Object;)Ll/ۛ᩹ᩳ;

    move-result-object v2

    .line 149
    new-instance v4, Ll/ۨ᩹ᩳ;

    iget-object v1, v1, Ll/ۛ᩹ᩳ;->֫:Ll/᩶᩹ᩳ;

    invoke-direct {v8, v1, v0, v12}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;Ljava/lang/Object;)Ll/᩶᩹ᩳ;

    move-result-object v0

    iget-object v1, v2, Ll/ۛ᩹ᩳ;->ۧ:Ll/᩶᩹ᩳ;

    invoke-direct {v8, v0, v1, v12}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;Ljava/lang/Object;)Ll/᩶᩹ᩳ;

    move-result-object v0

    invoke-direct {v4, v0, v3, v15, v14}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    return-object v4
.end method

.method public final ֫(Ll/ۨ᩹ᩳ;)Ll/ۨ᩹ᩳ;
    .locals 6

    .line 44
    iget-object v0, p1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget-object v1, p0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-ne v1, v0, :cond_0

    iget v0, p1, Ll/ۨ᩹ᩳ;->֫:I

    iget v2, p0, Ll/ۨ᩹ᩳ;->֫:I

    if-ne v2, v0, :cond_0

    iget v0, p1, Ll/ۨ᩹ᩳ;->ۧ:I

    iget v3, p0, Ll/ۨ᩹ᩳ;->ۧ:I

    if-ne v3, v0, :cond_0

    .line 47
    invoke-virtual {p0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    const/4 v4, 0x0

    invoke-virtual {p1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v5

    invoke-static {v0, v4, v5}, Ll/ۨ᩹ᩳ;->ۧ(III)V

    .line 48
    new-instance v0, Ll/ۨ᩹ᩳ;

    iget-object p1, p1, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    new-instance v4, Ljava/lang/Object;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v5, p0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    invoke-direct {p0, v5, p1, v4}, Ll/ۨ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;Ll/᩶᩹ᩳ;Ljava/lang/Object;)Ll/᩶᩹ᩳ;

    move-result-object p1

    invoke-direct {v0, p1, v2, v3, v1}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    return-object v0

    .line 45
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Text fragments belong to different stores"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()I
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Ll/᩶᩹ᩳ;->ۧ:I

    return v0
.end method

.method public final ۧ(Ll/ۨ᩹ᩳ;)Z
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    iget-object p1, p1, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()I
    .locals 1

    .line 35
    iget-object v0, p0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Ll/᩶᩹ᩳ;->ܽ:I

    return v0
.end method
