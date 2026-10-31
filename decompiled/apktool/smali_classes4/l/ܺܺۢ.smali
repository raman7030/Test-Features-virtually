.class public final Ll/ܺܺۢ;
.super Ljava/lang/Object;
.source "O75M"


# direct methods
.method public static ֫(Ljava/lang/String;IJ[BI)Ll/֡ܺۢ;
    .locals 6

    .line 283
    invoke-static {p0}, Ll/ܺܺۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 284
    invoke-static {p1}, Ll/ܺܺۢ;->֫(I)V

    const-wide/16 v1, 0x0

    cmp-long p0, p2, v1

    if-ltz p0, :cond_1

    if-lez p5, :cond_0

    .line 294
    invoke-static {}, Ll/᩷ۖۢ;->֫()V

    .line 296
    invoke-virtual {p4}, [B->clone()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, [B

    move v1, p1

    move-wide v2, p2

    move v5, p5

    invoke-static/range {v0 .. v5}, Lbin/mt/radare2/Radare2Native;->nativeDisassemble(Ljava/lang/String;IJ[BI)Ljava/lang/String;

    move-result-object p0

    .line 295
    invoke-static {p0}, Ll/᩻ۖۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Ll/֡ܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/֡ܺۢ;

    move-result-object p0

    return-object p0

    .line 292
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "maxInstructions must be positive"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 286
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "address must be non-negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;JZZ)Ll/ۘܺۢ;
    .locals 3

    .line 268
    invoke-static {p0}, Ll/ܺܺۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 272
    invoke-static {}, Ll/᩷ۖۢ;->֫()V

    .line 274
    invoke-static {p0, p1, p2, p3, p4}, Lbin/mt/radare2/Radare2Native;->nativeMapAddress(Ljava/lang/String;JZZ)Ljava/lang/String;

    move-result-object p0

    .line 273
    invoke-static {p0}, Ll/᩻ۖۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Ll/ۘܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۘܺۢ;

    move-result-object p0

    return-object p0

    .line 270
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "address must be non-negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ll/ۙܺۢ;
    .locals 0

    .line 38
    invoke-static {p0}, Ll/ܺܺۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 39
    invoke-static {}, Ll/᩷ۖۢ;->֫()V

    .line 40
    invoke-static {p0, p1}, Ll/ۙܺۢ;->֫(Ljava/lang/String;Z)Ll/ۙܺۢ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۛܺۢ;
    .locals 0

    .line 28
    invoke-static {p0}, Ll/ܺܺۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 29
    invoke-static {}, Ll/᩷ۖۢ;->֫()V

    .line 31
    invoke-static {p0}, Lbin/mt/radare2/Radare2Native;->nativeInspectElfSummary(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 30
    invoke-static {p0}, Ll/᩻ۖۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Ll/ۛܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۛܺۢ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JZIIJIIILjava/util/List;)Ll/ܺۖۢ;
    .locals 15

    .line 192
    invoke-static {p0}, Ll/ܺܺۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 193
    invoke-static/range {p1 .. p1}, Ll/ܺܺۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 194
    invoke-static/range {p3 .. p3}, Ll/ۘۢܽ;->֫(Ljava/lang/String;)V

    .line 195
    invoke-static/range {p14 .. p14}, Ll/ۖۖۢ;->֫(Ljava/lang/Iterable;)I

    move-result v14

    move-object/from16 v3, p3

    .line 196
    invoke-static {v14, v3}, Ll/ۘۢܽ;->֫(ILjava/lang/String;)V

    if-lez p2, :cond_7

    const-wide/16 v4, 0x0

    cmp-long v2, p4, v4

    if-ltz v2, :cond_6

    if-ltz p7, :cond_5

    if-ltz p8, :cond_4

    cmp-long v2, p9, v4

    if-ltz v2, :cond_3

    if-ltz p11, :cond_2

    if-lez p12, :cond_1

    if-lez p13, :cond_0

    .line 221
    invoke-static {}, Ll/᩷ۖۢ;->֫()V

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move-wide/from16 v9, p9

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    .line 223
    invoke-static/range {v0 .. v14}, Lbin/mt/radare2/Radare2Native;->nativeFindXrefs(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JZIIJIIII)Ljava/lang/String;

    move-result-object v0

    .line 222
    invoke-static {v0}, Ll/᩻ۖۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/ܺۖۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ܺۖۢ;

    move-result-object v0

    return-object v0

    .line 219
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "limit must be positive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 216
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxScanBytes must be positive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 213
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "relocationIndex must be non-negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "byteOffsetInRange must be non-negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 207
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "rangeIndex must be non-negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "phaseIndex must be non-negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 201
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "targetVirtualAddress must be non-negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 198
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bits must be positive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/String;JZLjava/lang/String;IIII)Ll/ܿۖۢ;
    .locals 9

    move v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    .line 235
    invoke-static {p0}, Ll/ܺܺۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 236
    invoke-static {p4}, Ll/ܺܺۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 237
    invoke-static {p5}, Ll/ܺܺۢ;->֫(I)V

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_3

    const/16 v1, 0x10

    if-lt v6, v1, :cond_2

    const/high16 v1, 0x10000

    if-gt v6, v1, :cond_2

    const/4 v1, 0x1

    if-lt v7, v1, :cond_1

    const/16 v2, 0x1000

    if-gt v7, v2, :cond_1

    if-lt v8, v1, :cond_0

    const/16 v1, 0x2710

    if-gt v8, v1, :cond_0

    .line 250
    invoke-static {}, Ll/᩷ۖۢ;->֫()V

    move-wide v1, p1

    move v3, p3

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    .line 252
    invoke-static/range {v0 .. v8}, Lbin/mt/radare2/Radare2Native;->nativeAnalyzeFunctionCfg(Ljava/lang/String;JZLjava/lang/String;IIII)Ljava/lang/String;

    move-result-object v0

    .line 251
    invoke-static {v0}, Ll/᩻ۖۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/ܿۖۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ܿۖۢ;

    move-result-object v0

    return-object v0

    .line 248
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxInstructions must be in 1..10000"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 245
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxBlocks must be in 1..4096"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 242
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxAnalysisBytes must be in 16..65536"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 239
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "address must be non-negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/String;IJLjava/lang/String;)Ll/ᩴܺۢ;
    .locals 3

    .line 303
    invoke-static {p0}, Ll/ܺܺۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 304
    invoke-static {p1}, Ll/ܺܺۢ;->֫(I)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    if-eqz p4, :cond_1

    .line 311
    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 314
    invoke-static {}, Ll/᩷ۖۢ;->֫()V

    .line 316
    invoke-static {p0, p1, p2, p3, p4}, Lbin/mt/radare2/Radare2Native;->nativeAssemble(Ljava/lang/String;IJLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 315
    invoke-static {p0}, Ll/᩻ۖۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ᩴܺۢ;

    move-result-object p0

    return-object p0

    .line 312
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "source must not be empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 309
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "source is null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 306
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "address must be non-negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIII)Ll/᩸ܺۢ;
    .locals 7

    .line 88
    invoke-static {p0}, Ll/ܺܺۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 89
    invoke-static {p1}, Ll/ܶܺۢ;->ۧ(Ljava/lang/String;)V

    if-eqz p2, :cond_6

    if-ltz p4, :cond_5

    if-lez p5, :cond_4

    const/4 p0, -0x1

    if-lt p6, p0, :cond_3

    if-ltz p6, :cond_1

    if-gt p4, p6, :cond_0

    goto :goto_0

    .line 103
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "offset must not exceed knownTotalCount"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 105
    :cond_1
    :goto_0
    invoke-static {}, Ll/᩷ۖۢ;->֫()V

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    .line 107
    invoke-static/range {v0 .. v6}, Lbin/mt/radare2/Radare2Native;->nativeReadElfItems(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIII)Ljava/lang/String;

    move-result-object p0

    .line 106
    invoke-static {p0}, Ll/᩻ۖۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Ll/᩸ܺۢ;->֫(Lbin/mt/json/JSONObject;)Ll/᩸ܺۢ;

    move-result-object p0

    .line 109
    iget p1, p0, Ll/᩸ܺۢ;->ᩳ:I

    iget p2, p0, Ll/᩸ܺۢ;->ܿ:I

    if-gt p1, p2, :cond_2

    return-object p0

    .line 110
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "offset must not exceed totalCount"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 100
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "knownTotalCount must be -1 or non-negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 97
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "limit must be positive"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 94
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "offset must be non-negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 91
    :cond_6
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "namePrefix is null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(I)V
    .locals 1

    const/16 v0, 0x10

    if-eq p0, v0, :cond_1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_1

    const/16 v0, 0x40

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 343
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "bits must be 16, 32, or 64"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    .line 334
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 335
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 336
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "arch must not be empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 332
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "arch is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    .line 323
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 324
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 327
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 325
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "path must point to a readable file"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 321
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "path is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
