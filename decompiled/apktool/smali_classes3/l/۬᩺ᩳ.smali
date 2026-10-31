.class public final Ll/۬᩺ᩳ;
.super Ljava/lang/Object;
.source "H6NE"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ljava/lang/Runnable;

.field public ۙ:J

.field public final ۛ:Ljava/util/function/Supplier;

.field public ۟:J

.field public ۤ:J

.field public ۨ:Ll/ۗ᩹ᩳ;

.field public ۫:J

.field public final ۬:[C

.field public final ܰ:Ll/۟᩸ᩳ;

.field public ᩶:I

.field public ᩸:Ljava/lang/StringBuilder;

.field public ᩹:I

.field public final ᩺:Ll/ۛ᩺ᩳ;


# direct methods
.method public constructor <init>(Ll/ۛ᩺ᩳ;Ll/۟᩸ᩳ;Ljava/lang/Runnable;Ljava/util/function/Supplier;)V
    .locals 1

    .line 215
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [C

    .line 212
    iput-object v0, p0, Ll/۬᩺ᩳ;->۬:[C

    .line 216
    iput-object p1, p0, Ll/۬᩺ᩳ;->᩺:Ll/ۛ᩺ᩳ;

    .line 217
    iput-object p2, p0, Ll/۬᩺ᩳ;->ܰ:Ll/۟᩸ᩳ;

    .line 218
    iput-object p3, p0, Ll/۬᩺ᩳ;->ۗ:Ljava/lang/Runnable;

    .line 219
    iput-object p4, p0, Ll/۬᩺ᩳ;->ۛ:Ljava/util/function/Supplier;

    return-void
.end method

.method private ֫(Ll/ۗ᩹ᩳ;Ljava/lang/CharSequence;II)V
    .locals 2

    :goto_0
    if-ge p3, p4, :cond_0

    .line 291
    iget-object v0, p0, Ll/۬᩺ᩳ;->ۗ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/16 v0, 0x2000

    sub-int v1, p4, p3

    .line 292
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, p3

    .line 293
    invoke-virtual {p1, p2, p3, v0}, Ll/ۗ᩹ᩳ;->append(Ljava/lang/CharSequence;II)V

    move p3, v0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 349
    iget-object v0, p0, Ll/۬᩺ᩳ;->ۨ:Ll/ۗ᩹ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۗ᩹ᩳ;->close()V

    :cond_0
    return-void
.end method

.method public final finish()V
    .locals 30

    move-object/from16 v1, p0

    .line 298
    iget-object v0, v1, Ll/۬᩺ᩳ;->ܰ:Ll/۟᩸ᩳ;

    invoke-virtual {v0}, Ll/۟᩸ᩳ;->length()I

    move-result v2

    int-to-long v2, v2

    iget-object v4, v1, Ll/۬᩺ᩳ;->᩺:Ll/ۛ᩺ᩳ;

    invoke-static {v4}, Ll/ۛ᩺ᩳ;->ۧ(Ll/ۛ᩺ᩳ;)J

    move-result-wide v5

    add-long/2addr v2, v5

    const-wide/16 v5, 0x0

    cmp-long v7, v2, v5

    if-ltz v7, :cond_a

    const-wide/32 v7, 0x7fffffff

    cmp-long v9, v2, v7

    if-gtz v9, :cond_a

    .line 271
    iget-object v2, v1, Ll/۬᩺ᩳ;->᩸:Ljava/lang/StringBuilder;

    if-nez v2, :cond_0

    goto :goto_0

    .line 272
    :cond_0
    new-instance v3, Ll/ۤ᩺ᩳ;

    iget v7, v1, Ll/۬᩺ᩳ;->᩶:I

    iget v8, v1, Ll/۬᩺ᩳ;->᩹:I

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v7, v8, v2}, Ll/ۤ᩺ᩳ;-><init>(IILjava/lang/String;)V

    invoke-virtual {v1, v3}, Ll/۬᩺ᩳ;->֫(Ll/ۤ᩺ᩳ;)V

    const/4 v2, 0x0

    .line 273
    iput-object v2, v1, Ll/۬᩺ᩳ;->᩸:Ljava/lang/StringBuilder;

    .line 301
    :goto_0
    iget-object v2, v1, Ll/۬᩺ᩳ;->ۨ:Ll/ۗ᩹ᩳ;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/ۗ᩹ᩳ;->finish()Ll/۬᩹ᩳ;

    move-result-object v2

    invoke-static {v4, v2}, Ll/ۛ᩺ᩳ;->֫(Ll/ۛ᩺ᩳ;Ll/۬᩹ᩳ;)V

    .line 302
    :cond_1
    invoke-static {v4}, Ll/ۛ᩺ᩳ;->ܿ(Ll/ۛ᩺ᩳ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x200

    if-le v2, v3, :cond_9

    .line 307
    iget-object v2, v1, Ll/۬᩺ᩳ;->ۗ:Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 308
    invoke-static {v4}, Ll/ۛ᩺ᩳ;->ܿ(Ll/ۛ᩺ᩳ;)Ljava/util/ArrayList;

    move-result-object v7

    const/4 v8, 0x0

    .line 309
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۤ᩺ᩳ;

    iget v9, v9, Ll/ۤ᩺ᩳ;->ᩳ:I

    const/4 v10, 0x1

    .line 0
    invoke-static {v7, v10}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v10

    .line 310
    check-cast v10, Ll/ۤ᩺ᩳ;

    iget v10, v10, Ll/ۤ᩺ᩳ;->֫:I

    int-to-long v10, v10

    int-to-long v12, v9

    sub-long/2addr v10, v12

    iget-wide v14, v1, Ll/۬᩺ᩳ;->۟:J

    add-long/2addr v10, v14

    const-wide/16 v14, 0x1ff

    add-long/2addr v10, v14

    const-wide/16 v14, 0x200

    .line 311
    div-long/2addr v10, v14

    const-wide/32 v14, 0x10000

    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    .line 312
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/16 v3, 0x2000

    .line 313
    invoke-static {v3}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v3

    .line 314
    iget-object v14, v1, Ll/۬᩺ᩳ;->ۛ:Ljava/util/function/Supplier;

    invoke-interface {v14}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۗ᩹ᩳ;

    .line 317
    :try_start_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const-wide/16 v15, -0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-wide/from16 v17, v5

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v5, v21

    check-cast v5, Ll/ۤ᩺ᩳ;

    .line 318
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 320
    iget v6, v5, Ll/ۤ᩺ᩳ;->ᩳ:I

    move-object/from16 v21, v7

    iget v7, v5, Ll/ۤ᩺ᩳ;->ۧ:I

    move-object/from16 v24, v4

    move-object/from16 v25, v5

    int-to-long v4, v6

    sub-long/2addr v4, v12

    add-long v4, v4, v17

    div-long/2addr v4, v9

    cmp-long v26, v4, v15

    if-eqz v26, :cond_3

    const-wide/16 v22, 0x0

    cmp-long v26, v15, v22

    if-ltz v26, :cond_2

    .line 322
    new-instance v15, Ll/ۤ᩺ᩳ;

    invoke-virtual {v14}, Ll/ۗ᩹ᩳ;->length()I

    move-result v16

    move-wide/from16 v26, v4

    sub-int v4, v16, v8

    move/from16 v5, v20

    move-wide/from16 v28, v9

    move/from16 v9, v19

    move-wide/from16 v19, v28

    invoke-direct {v15, v9, v5, v8, v4}, Ll/ۤ᩺ᩳ;-><init>(IIII)V

    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    move-wide/from16 v26, v4

    move-wide/from16 v19, v9

    .line 325
    :goto_2
    invoke-virtual {v14}, Ll/ۗ᩹ᩳ;->length()I

    move-result v4

    move v8, v4

    move v5, v6

    move v9, v5

    move-wide/from16 v15, v26

    goto :goto_3

    :cond_3
    move/from16 v5, v20

    const-wide/16 v22, 0x0

    move-wide/from16 v28, v9

    move/from16 v9, v19

    move-wide/from16 v19, v28

    :goto_3
    if-ge v5, v6, :cond_4

    .line 329
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 330
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v4

    sub-int v10, v6, v5

    invoke-static {v4, v10}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int/2addr v4, v5

    .line 331
    invoke-virtual {v3}, Ljava/nio/CharBuffer;->array()[C

    move-result-object v10

    move/from16 v26, v6

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v4, v10, v6}, Ll/۟᩸ᩳ;->getChars(II[CI)V

    sub-int v5, v4, v5

    .line 332
    invoke-virtual {v14, v3, v6, v5}, Ll/ۗ᩹ᩳ;->append(Ljava/lang/CharSequence;II)V

    move v5, v4

    move/from16 v6, v26

    goto :goto_3

    .line 335
    :cond_4
    invoke-static/range {v24 .. v24}, Ll/ۛ᩺ᩳ;->ᩳ(Ll/ۛ᩺ᩳ;)Ll/۬᩹ᩳ;

    move-result-object v4

    if-nez v4, :cond_5

    move-object/from16 v4, v25

    iget-object v5, v4, Ll/ۤ᩺ᩳ;->ܿ:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v1, v14, v5, v6, v7}, Ll/۬᩺ᩳ;->֫(Ll/ۗ᩹ᩳ;Ljava/lang/CharSequence;II)V

    goto :goto_4

    :cond_5
    move-object/from16 v4, v25

    .line 336
    invoke-static/range {v24 .. v24}, Ll/ۛ᩺ᩳ;->ᩳ(Ll/ۛ᩺ᩳ;)Ll/۬᩹ᩳ;

    move-result-object v5

    iget v6, v4, Ll/ۤ᩺ᩳ;->ܽ:I

    add-int v10, v6, v7

    invoke-direct {v1, v14, v5, v6, v10}, Ll/۬᩺ᩳ;->֫(Ll/ۗ᩹ᩳ;Ljava/lang/CharSequence;II)V

    .line 337
    :goto_4
    iget v4, v4, Ll/ۤ᩺ᩳ;->֫:I

    int-to-long v5, v7

    add-long v17, v17, v5

    move-object/from16 v7, v21

    move-wide/from16 v5, v22

    move-wide/from16 v28, v19

    move/from16 v20, v4

    move/from16 v19, v9

    move-wide/from16 v9, v28

    move-object/from16 v4, v24

    goto/16 :goto_1

    :cond_6
    move-object/from16 v24, v4

    move/from16 v9, v19

    move/from16 v5, v20

    .line 340
    new-instance v0, Ll/ۤ᩺ᩳ;

    invoke-virtual {v14}, Ll/ۗ᩹ᩳ;->length()I

    move-result v3

    sub-int/2addr v3, v8

    invoke-direct {v0, v9, v5, v8, v3}, Ll/ۤ᩺ᩳ;-><init>(IIII)V

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 342
    invoke-static/range {v24 .. v24}, Ll/ۛ᩺ᩳ;->ᩳ(Ll/ۛ᩺ᩳ;)Ll/۬᩹ᩳ;

    move-result-object v0

    .line 343
    invoke-virtual {v14}, Ll/ۗ᩹ᩳ;->finish()Ll/۬᩹ᩳ;

    move-result-object v2

    move-object/from16 v3, v24

    invoke-static {v3, v2}, Ll/ۛ᩺ᩳ;->֫(Ll/ۛ᩺ᩳ;Ll/۬᩹ᩳ;)V

    .line 344
    invoke-static {v3, v11}, Ll/ۛ᩺ᩳ;->֫(Ll/ۛ᩺ᩳ;Ljava/util/ArrayList;)V

    if-eqz v0, :cond_7

    .line 345
    invoke-virtual {v0}, Ll/۬᩹ᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    :cond_7
    invoke-virtual {v14}, Ll/ۗ᩹ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    if-eqz v14, :cond_8

    .line 314
    :try_start_1
    invoke-virtual {v14}, Ll/ۗ᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_5
    throw v2

    :cond_9
    return-void

    .line 299
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Replacement result is too large"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(IILjava/lang/CharSequence;)V
    .locals 7

    .line 222
    iget-object v0, p0, Ll/۬᩺ᩳ;->᩺:Ll/ۛ᩺ᩳ;

    invoke-static {v0}, Ll/ۛ᩺ᩳ;->֫(Ll/ۛ᩺ᩳ;)I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0, p1}, Ll/ۛ᩺ᩳ;->ۧ(Ll/ۛ᩺ᩳ;I)V

    .line 223
    :cond_0
    invoke-static {v0}, Ll/ۛ᩺ᩳ;->֫(Ll/ۛ᩺ᩳ;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ll/ۛ᩺ᩳ;->֫(Ll/ۛ᩺ᩳ;I)V

    .line 224
    invoke-static {v0, p2}, Ll/ۛ᩺ᩳ;->ܽ(Ll/ۛ᩺ᩳ;I)V

    .line 225
    invoke-static {v0}, Ll/ۛ᩺ᩳ;->ۧ(Ll/ۛ᩺ᩳ;)J

    move-result-wide v1

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    int-to-long v3, v3

    sub-int v5, p2, p1

    int-to-long v5, v5

    sub-long/2addr v3, v5

    add-long/2addr v3, v1

    invoke-static {v0, v3, v4}, Ll/ۛ᩺ᩳ;->֫(Ll/ۛ᩺ᩳ;J)V

    if-ne p1, p2, :cond_1

    .line 226
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 227
    :cond_1
    iget-wide v1, p0, Ll/۬᩺ᩳ;->ۤ:J

    int-to-long v3, p2

    int-to-long v5, p1

    sub-long/2addr v3, v5

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    add-long/2addr v3, v1

    iput-wide v3, p0, Ll/۬᩺ᩳ;->ۤ:J

    .line 228
    invoke-static {v0}, Ll/ۛ᩺ᩳ;->ܽ(Ll/ۛ᩺ᩳ;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v0}, Ll/ۛ᩺ᩳ;->֫(Ll/ۛ᩺ᩳ;)I

    move-result v1

    const/16 v2, 0x80

    if-gt v1, v2, :cond_2

    iget-wide v1, p0, Ll/۬᩺ᩳ;->ۤ:J

    const-wide/32 v3, 0x10000

    cmp-long v5, v1, v3

    if-gtz v5, :cond_2

    .line 229
    invoke-static {v0}, Ll/ۛ᩺ᩳ;->ܿ(Ll/ۛ᩺ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ll/ۤ᩺ᩳ;

    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v1, p1, p2, p3}, Ll/ۤ᩺ᩳ;-><init>(IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 232
    :cond_2
    invoke-static {v0}, Ll/ۛ᩺ᩳ;->ܽ(Ll/ۛ᩺ᩳ;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 233
    invoke-static {v0}, Ll/ۛ᩺ᩳ;->ܳ(Ll/ۛ᩺ᩳ;)V

    .line 234
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۛ᩺ᩳ;->ܿ(Ll/ۛ᩺ᩳ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 235
    invoke-static {v0}, Ll/ۛ᩺ᩳ;->ܿ(Ll/ۛ᩺ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 236
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ᩺ᩳ;

    iget v2, v1, Ll/ۤ᩺ᩳ;->ᩳ:I

    iget v3, v1, Ll/ۤ᩺ᩳ;->֫:I

    iget-object v1, v1, Ll/ۤ᩺ᩳ;->ܿ:Ljava/lang/String;

    invoke-virtual {p0, v2, v3, v1}, Ll/۬᩺ᩳ;->ۧ(IILjava/lang/CharSequence;)V

    goto :goto_0

    .line 238
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Ll/۬᩺ᩳ;->ۧ(IILjava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ll/ۤ᩺ᩳ;)V
    .locals 9

    .line 276
    iget-wide v0, p0, Ll/۬᩺ᩳ;->۟:J

    iget v2, p1, Ll/ۤ᩺ᩳ;->ۧ:I

    int-to-long v3, v2

    add-long/2addr v0, v3

    iput-wide v0, p0, Ll/۬᩺ᩳ;->۟:J

    .line 277
    iget-object v3, p0, Ll/۬᩺ᩳ;->ۨ:Ll/ۗ᩹ᩳ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, p0, Ll/۬᩺ᩳ;->᩺:Ll/ۛ᩺ᩳ;

    if-nez v3, :cond_0

    const-wide/32 v7, 0x80000

    cmp-long v3, v0, v7

    if-lez v3, :cond_0

    .line 278
    iget-object v0, p0, Ll/۬᩺ᩳ;->ۛ:Ljava/util/function/Supplier;

    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩹ᩳ;

    iput-object v0, p0, Ll/۬᩺ᩳ;->ۨ:Ll/ۗ᩹ᩳ;

    .line 279
    invoke-static {v6}, Ll/ۛ᩺ᩳ;->ܿ(Ll/ۛ᩺ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ᩺ᩳ;

    .line 285
    iget-object v3, p0, Ll/۬᩺ᩳ;->ۨ:Ll/ۗ᩹ᩳ;

    invoke-virtual {v3}, Ll/ۗ᩹ᩳ;->length()I

    move-result v3

    iput v3, v1, Ll/ۤ᩺ᩳ;->ܽ:I

    .line 286
    iget-object v3, p0, Ll/۬᩺ᩳ;->ۨ:Ll/ۗ᩹ᩳ;

    iget-object v7, v1, Ll/ۤ᩺ᩳ;->ܿ:Ljava/lang/String;

    iget v8, v1, Ll/ۤ᩺ᩳ;->ۧ:I

    invoke-direct {p0, v3, v7, v5, v8}, Ll/۬᩺ᩳ;->֫(Ll/ۗ᩹ᩳ;Ljava/lang/CharSequence;II)V

    .line 287
    iput-object v4, v1, Ll/ۤ᩺ᩳ;->ܿ:Ljava/lang/String;

    goto :goto_0

    .line 281
    :cond_0
    iget-object v0, p0, Ll/۬᩺ᩳ;->ۨ:Ll/ۗ᩹ᩳ;

    if-eqz v0, :cond_1

    .line 285
    invoke-virtual {v0}, Ll/ۗ᩹ᩳ;->length()I

    move-result v0

    iput v0, p1, Ll/ۤ᩺ᩳ;->ܽ:I

    .line 286
    iget-object v0, p0, Ll/۬᩺ᩳ;->ۨ:Ll/ۗ᩹ᩳ;

    iget-object v1, p1, Ll/ۤ᩺ᩳ;->ܿ:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v5, v2}, Ll/۬᩺ᩳ;->֫(Ll/ۗ᩹ᩳ;Ljava/lang/CharSequence;II)V

    .line 287
    iput-object v4, p1, Ll/ۤ᩺ᩳ;->ܿ:Ljava/lang/String;

    .line 282
    :cond_1
    invoke-static {v6}, Ll/ۛ᩺ᩳ;->ܿ(Ll/ۛ᩺ᩳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(IILjava/lang/CharSequence;)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 241
    iget-object v3, v0, Ll/۬᩺ᩳ;->ۗ:Ljava/lang/Runnable;

    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 242
    iget-object v3, v0, Ll/۬᩺ᩳ;->᩸:Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    iget v3, v0, Ll/۬᩺ᩳ;->᩹:I

    sub-int v3, v1, v3

    :goto_0
    int-to-long v5, v2

    int-to-long v7, v1

    sub-long v7, v5, v7

    .line 243
    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->length()I

    move-result v9

    int-to-long v9, v9

    add-long/2addr v7, v9

    .line 244
    iget-object v9, v0, Ll/۬᩺ᩳ;->᩸:Ljava/lang/StringBuilder;

    if-eqz v9, :cond_3

    const/16 v10, 0x100

    if-gt v3, v10, :cond_1

    iget v10, v0, Ll/۬᩺ᩳ;->᩶:I

    int-to-long v10, v10

    sub-long/2addr v5, v10

    const-wide/32 v10, 0x10000

    cmp-long v12, v5, v10

    if-gtz v12, :cond_1

    .line 245
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    int-to-long v5, v5

    int-to-long v12, v3

    add-long/2addr v5, v12

    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    int-to-long v14, v3

    add-long/2addr v5, v14

    cmp-long v3, v5, v10

    if-gtz v3, :cond_1

    iget-wide v5, v0, Ll/۬᩺ᩳ;->۫:J

    add-long/2addr v5, v12

    iget-wide v9, v0, Ll/۬᩺ᩳ;->ۙ:J

    add-long/2addr v9, v7

    const-wide/16 v11, 0x4

    mul-long v9, v9, v11

    cmp-long v3, v5, v9

    if-lez v3, :cond_3

    .line 271
    :cond_1
    iget-object v3, v0, Ll/۬᩺ᩳ;->᩸:Ljava/lang/StringBuilder;

    if-nez v3, :cond_2

    goto :goto_1

    .line 272
    :cond_2
    new-instance v5, Ll/ۤ᩺ᩳ;

    iget v6, v0, Ll/۬᩺ᩳ;->᩶:I

    iget v9, v0, Ll/۬᩺ᩳ;->᩹:I

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v6, v9, v3}, Ll/ۤ᩺ᩳ;-><init>(IILjava/lang/String;)V

    invoke-virtual {v0, v5}, Ll/۬᩺ᩳ;->֫(Ll/ۤ᩺ᩳ;)V

    const/4 v3, 0x0

    .line 273
    iput-object v3, v0, Ll/۬᩺ᩳ;->᩸:Ljava/lang/StringBuilder;

    .line 249
    :cond_3
    :goto_1
    iget-object v3, v0, Ll/۬᩺ᩳ;->᩸:Ljava/lang/StringBuilder;

    if-nez v3, :cond_6

    sub-int v3, v2, v1

    const/high16 v5, 0x10000

    if-gt v3, v5, :cond_5

    .line 251
    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v3, v5, :cond_4

    goto :goto_2

    .line 255
    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v3, v0, Ll/۬᩺ᩳ;->᩸:Ljava/lang/StringBuilder;

    .line 256
    iput v1, v0, Ll/۬᩺ᩳ;->᩶:I

    .line 257
    iput v1, v0, Ll/۬᩺ᩳ;->᩹:I

    const-wide/16 v5, 0x0

    .line 258
    iput-wide v5, v0, Ll/۬᩺ᩳ;->ۙ:J

    iput-wide v5, v0, Ll/۬᩺ᩳ;->۫:J

    goto :goto_3

    .line 252
    :cond_5
    :goto_2
    new-instance v3, Ll/ۤ᩺ᩳ;

    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v1, v2, v4}, Ll/ۤ᩺ᩳ;-><init>(IILjava/lang/String;)V

    invoke-virtual {v0, v3}, Ll/۬᩺ᩳ;->֫(Ll/ۤ᩺ᩳ;)V

    return-void

    .line 260
    :cond_6
    :goto_3
    iget v3, v0, Ll/۬᩺ᩳ;->᩹:I

    sub-int v5, v1, v3

    if-eqz v5, :cond_7

    .line 262
    iget-object v6, v0, Ll/۬᩺ᩳ;->ܰ:Ll/۟᩸ᩳ;

    iget-object v9, v0, Ll/۬᩺ᩳ;->۬:[C

    invoke-virtual {v6, v3, v1, v9, v4}, Ll/۟᩸ᩳ;->getChars(II[CI)V

    .line 263
    iget-object v1, v0, Ll/۬᩺ᩳ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9, v4, v5}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 265
    :cond_7
    iget-object v1, v0, Ll/۬᩺ᩳ;->᩸:Ljava/lang/StringBuilder;

    move-object/from16 v3, p3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 266
    iget-wide v3, v0, Ll/۬᩺ᩳ;->۫:J

    int-to-long v5, v5

    add-long/2addr v3, v5

    iput-wide v3, v0, Ll/۬᩺ᩳ;->۫:J

    .line 267
    iget-wide v3, v0, Ll/۬᩺ᩳ;->ۙ:J

    add-long/2addr v3, v7

    iput-wide v3, v0, Ll/۬᩺ᩳ;->ۙ:J

    .line 268
    iput v2, v0, Ll/۬᩺ᩳ;->᩹:I

    return-void
.end method
