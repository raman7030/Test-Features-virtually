.class public final Ll/ܶۙᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܳۙᩴ;


# instance fields
.field public final a:Ll/ۤۗᩴ;

.field public final b:Ll/᩷ۙᩴ;

.field public final c:Ll/ܰ᩶ᩴ;

.field public volatile d:Ll/ۖۙᩴ;


# direct methods
.method public constructor <init>(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;Ll/ܰ᩶ᩴ;)V
    .locals 0

    .line 3309
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3311
    iput-object p1, p0, Ll/ܶۙᩴ;->a:Ll/ۤۗᩴ;

    .line 3312
    iput-object p2, p0, Ll/ܶۙᩴ;->b:Ll/᩷ۙᩴ;

    .line 3313
    iput-object p3, p0, Ll/ܶۙᩴ;->c:Ll/ܰ᩶ᩴ;

    return-void
.end method


# virtual methods
.method public final l(Ll/ۤۙᩴ;Ljava/lang/StringBuilder;)Z
    .locals 10

    .line 3318
    iget-object v0, p0, Ll/ܶۙᩴ;->a:Ll/ۤۗᩴ;

    invoke-virtual {p1, v0}, Ll/ۤۙᩴ;->a(Ll/ۤۗᩴ;)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p1, Ll/ۤۙᩴ;->b:Ll/ۛ᩶ᩴ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 238
    :cond_0
    iget-object v2, p1, Ll/ۤۙᩴ;->a:Ll/ۖۗᩴ;

    .line 3323
    sget-object v3, Ll/ۛۗᩴ;->b:Ll/ۡ֨ᩴ;

    invoke-interface {v2, v3}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll/ۖ᩶ᩴ;

    if-eqz v4, :cond_2

    .line 3324
    sget-object v2, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    if-ne v4, v2, :cond_1

    goto :goto_0

    .line 3327
    :cond_1
    iget-object v3, p0, Ll/ܶۙᩴ;->c:Ll/ܰ᩶ᩴ;

    iget-object v5, p0, Ll/ܶۙᩴ;->a:Ll/ۤۗᩴ;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v8, p0, Ll/ܶۙᩴ;->b:Ll/᩷ۙᩴ;

    .line 1437
    iget-object v9, v1, Ll/ۛ᩶ᩴ;->b:Ljava/util/Locale;

    .line 3327
    invoke-virtual/range {v3 .. v9}, Ll/ܰ᩶ᩴ;->b(Ll/ۖ᩶ᩴ;Ll/ۤۗᩴ;JLl/᩷ۙᩴ;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 3325
    :cond_2
    :goto_0
    iget-object v2, p0, Ll/ܶۙᩴ;->c:Ll/ܰ᩶ᩴ;

    iget-object v3, p0, Ll/ܶۙᩴ;->a:Ll/ۤۗᩴ;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v0, p0, Ll/ܶۙᩴ;->b:Ll/᩷ۙᩴ;

    .line 1437
    iget-object v6, v1, Ll/ۛ᩶ᩴ;->b:Ljava/util/Locale;

    move-object v1, v2

    move-object v2, v3

    move-wide v3, v4

    move-object v5, v0

    .line 3325
    invoke-virtual/range {v1 .. v6}, Ll/ܰ᩶ᩴ;->c(Ll/ۤۗᩴ;JLl/᩷ۙᩴ;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const/4 v1, 0x1

    if-nez v0, :cond_4

    .line 3380
    iget-object v0, p0, Ll/ܶۙᩴ;->d:Ll/ۖۙᩴ;

    if-nez v0, :cond_3

    .line 3381
    new-instance v0, Ll/ۖۙᩴ;

    iget-object v2, p0, Ll/ܶۙᩴ;->a:Ll/ۤۗᩴ;

    const/16 v3, 0x13

    sget-object v4, Ll/᩻ۙᩴ;->NORMAL:Ll/᩻ۙᩴ;

    invoke-direct {v0, v2, v1, v3, v4}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    iput-object v0, p0, Ll/ܶۙᩴ;->d:Ll/ۖۙᩴ;

    .line 3383
    :cond_3
    iget-object v0, p0, Ll/ܶۙᩴ;->d:Ll/ۖۙᩴ;

    .line 3330
    invoke-virtual {v0, p1, p2}, Ll/ۖۙᩴ;->l(Ll/ۤۙᩴ;Ljava/lang/StringBuilder;)Z

    move-result p1

    return p1

    .line 3332
    :cond_4
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v1
.end method

.method public final m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I
    .locals 14

    move-object v0, p0

    move-object v7, p1

    move/from16 v8, p3

    .line 3338
    iget-object v1, v0, Ll/ܶۙᩴ;->c:Ll/ܰ᩶ᩴ;

    iget-object v9, v0, Ll/ܶۙᩴ;->a:Ll/ۤۗᩴ;

    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ltz v8, :cond_a

    if-gt v8, v2, :cond_a

    .line 270
    iget-boolean v2, v7, Ll/ۗۙᩴ;->c:Z

    iget-object v3, v7, Ll/ۗۙᩴ;->a:Ll/ۛ᩶ᩴ;

    if-eqz v2, :cond_0

    .line 3342
    iget-object v2, v0, Ll/ܶۙᩴ;->b:Ll/᩷ۙᩴ;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 167
    :goto_0
    invoke-virtual {p1}, Ll/ۗۙᩴ;->c()Ll/ܽۙᩴ;

    move-result-object v4

    iget-object v4, v4, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    if-nez v4, :cond_1

    .line 169
    iget-object v4, v7, Ll/ۗۙᩴ;->a:Ll/ۛ᩶ᩴ;

    .line 1501
    iget-object v4, v4, Ll/ۛ᩶ᩴ;->e:Ll/ۖ᩶ᩴ;

    if-nez v4, :cond_1

    .line 171
    sget-object v4, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    :cond_1
    move-object v10, v4

    if-eqz v10, :cond_3

    .line 3345
    sget-object v4, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    if-ne v10, v4, :cond_2

    goto :goto_1

    .line 1437
    :cond_2
    iget-object v3, v3, Ll/ۛ᩶ᩴ;->b:Ljava/util/Locale;

    .line 3348
    invoke-virtual {v1, v10, v9, v2, v3}, Ll/ܰ᩶ᩴ;->d(Ll/ۖ᩶ᩴ;Ll/ۤۗᩴ;Ll/᩷ۙᩴ;Ljava/util/Locale;)Ljava/util/Iterator;

    move-result-object v1

    goto :goto_2

    .line 1437
    :cond_3
    :goto_1
    iget-object v3, v3, Ll/ۛ᩶ᩴ;->b:Ljava/util/Locale;

    .line 3346
    invoke-virtual {v1, v9, v2, v3}, Ll/ܰ᩶ᩴ;->e(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;Ljava/util/Locale;)Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    move-object v11, v1

    if-eqz v11, :cond_8

    .line 3351
    :cond_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 3352
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Ljava/util/Map$Entry;

    .line 3353
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Ljava/lang/String;

    const/4 v3, 0x0

    .line 3354
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v6

    move-object v1, p1

    move-object v2, v13

    move-object/from16 v4, p2

    move/from16 v5, p3

    invoke-virtual/range {v1 .. v6}, Ll/ۗۙᩴ;->g(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 3355
    iget-object v2, v0, Ll/ܶۙᩴ;->a:Ll/ۤۗᩴ;

    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v1

    add-int v6, v1, v8

    move-object v1, p1

    move/from16 v5, p3

    invoke-virtual/range {v1 .. v6}, Ll/ۗۙᩴ;->f(Ll/ۤۗᩴ;JII)I

    move-result v1

    return v1

    .line 3358
    :cond_5
    sget-object v1, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    if-ne v9, v1, :cond_7

    .line 270
    iget-boolean v1, v7, Ll/ۗۙᩴ;->c:Z

    if-nez v1, :cond_7

    .line 3360
    invoke-interface {v10}, Ll/ۖ᩶ᩴ;->x()Ljava/util/List;

    move-result-object v1

    .line 3361
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Ll/ۘ᩶ᩴ;

    .line 3362
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v3, 0x0

    .line 3363
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v6

    move-object v1, p1

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    invoke-virtual/range {v1 .. v6}, Ll/ۗۙᩴ;->g(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 3364
    iget-object v2, v0, Ll/ܶۙᩴ;->a:Ll/ۤۗᩴ;

    invoke-interface {v10}, Ll/ۘ᩶ᩴ;->getValue()I

    move-result v1

    int-to-long v3, v1

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v1

    add-int v6, v1, v8

    move-object v1, p1

    move/from16 v5, p3

    invoke-virtual/range {v1 .. v6}, Ll/ۗۙᩴ;->f(Ll/ۤۗᩴ;JII)I

    move-result v1

    return v1

    .line 270
    :cond_7
    iget-boolean v1, v7, Ll/ۗۙᩴ;->c:Z

    if-eqz v1, :cond_8

    not-int v1, v8

    return v1

    .line 3380
    :cond_8
    iget-object v1, v0, Ll/ܶۙᩴ;->d:Ll/ۖۙᩴ;

    if-nez v1, :cond_9

    .line 3381
    new-instance v1, Ll/ۖۙᩴ;

    iget-object v2, v0, Ll/ܶۙᩴ;->a:Ll/ۤۗᩴ;

    const/16 v3, 0x13

    sget-object v4, Ll/᩻ۙᩴ;->NORMAL:Ll/᩻ۙᩴ;

    const/4 v5, 0x1

    invoke-direct {v1, v2, v5, v3, v4}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    iput-object v1, v0, Ll/ܶۙᩴ;->d:Ll/ۖۙᩴ;

    .line 3383
    :cond_9
    iget-object v1, v0, Ll/ܶۙᩴ;->d:Ll/ۖۙᩴ;

    move-object/from16 v2, p2

    .line 3372
    invoke-virtual {v1, p1, v2, v8}, Ll/ۖۙᩴ;->m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I

    move-result v1

    return v1

    .line 3340
    :cond_a
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 3388
    sget-object v0, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    const-string v1, ")"

    const-string v2, "Text("

    iget-object v3, p0, Ll/ܶۙᩴ;->a:Ll/ۤۗᩴ;

    iget-object v4, p0, Ll/ܶۙᩴ;->b:Ll/᩷ۙᩴ;

    if-ne v4, v0, :cond_0

    .line 3389
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3391
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
