.class public final Ll/ܽ᩶ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܰ᩹ᩴ;
.implements Ll/ܺۗᩴ;
.implements Ll/ۗۗᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x3f3a2d24660eebe2L


# instance fields
.field public final transient a:Ll/۬᩹ᩴ;

.field public final transient b:Ll/۟ۙᩴ;


# direct methods
.method public constructor <init>(Ll/۬᩹ᩴ;Ll/۟ۙᩴ;)V
    .locals 1

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "date"

    .line 203
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "time"

    .line 204
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 205
    iput-object p1, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    .line 206
    iput-object p2, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    return-void
.end method

.method public static V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/ܽ᩶ᩴ;
    .locals 3

    .line 188
    check-cast p1, Ll/ܽ᩶ᩴ;

    .line 229
    iget-object v0, p1, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    .line 193
    invoke-interface {v0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    .line 189
    invoke-interface {p0, v0}, Ll/ۖ᩶ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 190
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-interface {p0}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object p0

    .line 229
    iget-object p1, p1, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    .line 193
    invoke-interface {p1}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object p1

    .line 191
    invoke-interface {p1}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Chronology mismatch, required: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", actual: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 423
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 413
    new-instance v0, Ll/۟᩹ᩴ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/۟᩹ᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final C(JLl/ۡۗᩴ;)Ll/ܺۗᩴ;
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    .line 193
    invoke-interface {v0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    .line 319
    invoke-static {p0, p1, p2, p3}, Ll/ۛۗᩴ;->b(Ll/ܺۗᩴ;JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ܽ᩶ᩴ;->V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final D(Ll/ۚ᩹ᩴ;)Ll/᩹᩹ᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 366
    invoke-static {p1, v0, p0}, Ll/ۡ᩶ᩴ;->V(Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;Ll/ܽ᩶ᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final G(Ll/ۤۗᩴ;)J
    .locals 2

    .line 267
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 268
    move-object v0, p1

    check-cast v0, Ll/ᩴۗᩴ;

    .line 269
    invoke-virtual {v0}, Ll/ᩴۗᩴ;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    invoke-interface {v0, p1}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 271
    :cond_1
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic L(Ll/ܰ᩹ᩴ;)I
    .locals 0

    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->c(Ll/ܰ᩹ᩴ;Ll/ܰ᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public final synthetic T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->h(Ll/ܰ᩹ᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final W(JLl/ۘۗᩴ;)Ll/ܽ᩶ᩴ;
    .locals 21

    move-object/from16 v10, p0

    move-wide/from16 v8, p1

    move-object/from16 v0, p3

    .line 305
    instance-of v1, v0, Ll/ۡۗᩴ;

    if-eqz v1, :cond_0

    .line 306
    move-object v1, v0

    check-cast v1, Ll/ۡۗᩴ;

    .line 307
    sget-object v2, Ll/֫᩶ᩴ;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    .line 316
    iget-object v1, v10, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    invoke-interface {v1, v8, v9, v0}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v0

    iget-object v1, v10, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v10, v0, v1}, Ll/ܽ᩶ᩴ;->Z(Ll/ܺۗᩴ;Ll/۟ۙᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-wide/16 v0, 0x100

    .line 314
    div-long v2, v8, v0

    .line 322
    iget-object v4, v10, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    sget-object v5, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {v4, v2, v3, v5}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v2

    iget-object v3, v10, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v10, v2, v3}, Ll/ܽ᩶ᩴ;->Z(Ll/ܺۗᩴ;Ll/۟ۙᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object v11

    .line 314
    rem-long v0, v8, v0

    const-wide/16 v2, 0xc

    mul-long v13, v0, v2

    .line 326
    iget-object v12, v11, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v15, 0x0

    invoke-virtual/range {v11 .. v20}, Ll/ܽ᩶ᩴ;->X(Ll/۬᩹ᩴ;JJJJ)Ll/ܽ᩶ᩴ;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v1, v10, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    const-wide/16 v6, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v4, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    move-wide v8, v11

    invoke-virtual/range {v0 .. v9}, Ll/ܽ᩶ᩴ;->X(Ll/۬᩹ᩴ;JJJJ)Ll/ܽ᩶ᩴ;

    move-result-object v0

    return-object v0

    .line 330
    :pswitch_2
    iget-object v1, v10, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    const-wide/16 v6, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v4, p1

    move-wide v8, v11

    invoke-virtual/range {v0 .. v9}, Ll/ܽ᩶ᩴ;->X(Ll/۬᩹ᩴ;JJJJ)Ll/ܽ᩶ᩴ;

    move-result-object v0

    return-object v0

    .line 334
    :pswitch_3
    iget-object v1, v10, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    const-wide/16 v4, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v6, p1

    move-wide v8, v11

    invoke-virtual/range {v0 .. v9}, Ll/ܽ᩶ᩴ;->X(Ll/۬᩹ᩴ;JJJJ)Ll/ܽ᩶ᩴ;

    move-result-object v0

    return-object v0

    :pswitch_4
    const-wide/32 v0, 0x5265c00

    .line 310
    div-long v2, v8, v0

    .line 322
    iget-object v4, v10, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    sget-object v5, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {v4, v2, v3, v5}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v2

    iget-object v3, v10, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v10, v2, v3}, Ll/ܽ᩶ᩴ;->Z(Ll/ܺۗᩴ;Ll/۟ۙᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object v11

    .line 310
    rem-long v0, v8, v0

    const-wide/32 v2, 0xf4240

    mul-long v19, v0, v2

    .line 338
    iget-object v12, v11, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v13, 0x0

    invoke-virtual/range {v11 .. v20}, Ll/ܽ᩶ᩴ;->X(Ll/۬᩹ᩴ;JJJJ)Ll/ܽ᩶ᩴ;

    move-result-object v0

    return-object v0

    :pswitch_5
    const-wide v0, 0x141dd76000L

    .line 309
    div-long v2, v8, v0

    .line 322
    iget-object v4, v10, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    sget-object v5, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {v4, v2, v3, v5}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v2

    iget-object v3, v10, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v10, v2, v3}, Ll/ܽ᩶ᩴ;->Z(Ll/ܺۗᩴ;Ll/۟ۙᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object v11

    .line 309
    rem-long v0, v8, v0

    const-wide/16 v2, 0x3e8

    mul-long v19, v0, v2

    .line 338
    iget-object v12, v11, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v13, 0x0

    invoke-virtual/range {v11 .. v20}, Ll/ܽ᩶ᩴ;->X(Ll/۬᩹ᩴ;JJJJ)Ll/ܽ᩶ᩴ;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v1, v10, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v8, p1

    invoke-virtual/range {v0 .. v9}, Ll/ܽ᩶ᩴ;->X(Ll/۬᩹ᩴ;JJJJ)Ll/ܽ᩶ᩴ;

    move-result-object v0

    return-object v0

    .line 318
    :cond_0
    iget-object v1, v10, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    invoke-interface {v1}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v1

    invoke-interface {v0, v10, v8, v9}, Ll/ۘۗᩴ;->m(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ܽ᩶ᩴ;->V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final X(Ll/۬᩹ᩴ;JJJJ)Ll/ܽ᩶ᩴ;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    or-long v2, p2, p4

    or-long v2, v2, p6

    or-long v2, v2, p8

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 345
    iget-object v2, v0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0, v1, v2}, Ll/ܽ᩶ᩴ;->Z(Ll/ܺۗᩴ;Ll/۟ۙᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object v1

    return-object v1

    :cond_0
    const-wide v2, 0x4e94914f0000L

    .line 347
    div-long v4, p8, v2

    const-wide/32 v6, 0x15180

    div-long v8, p6, v6

    add-long/2addr v8, v4

    const-wide/16 v4, 0x5a0

    div-long v10, p4, v4

    add-long/2addr v10, v8

    const-wide/16 v8, 0x18

    div-long v12, p2, v8

    add-long/2addr v12, v10

    .line 351
    rem-long v10, p8, v2

    rem-long v6, p6, v6

    const-wide/32 v14, 0x3b9aca00

    mul-long v6, v6, v14

    add-long/2addr v6, v10

    rem-long v4, p4, v4

    const-wide v10, 0xdf8475800L

    mul-long v4, v4, v10

    add-long/2addr v4, v6

    rem-long v6, p2, v8

    const-wide v8, 0x34630b8a000L

    mul-long v6, v6, v8

    add-long/2addr v6, v4

    .line 355
    iget-object v4, v0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v4}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v4

    add-long/2addr v6, v4

    .line 357
    invoke-static {v6, v7, v2, v3}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide v8

    add-long/2addr v8, v12

    .line 358
    invoke-static {v6, v7, v2, v3}, Ll/᩺ۚᩴ;->O(JJ)J

    move-result-wide v2

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    .line 359
    iget-object v2, v0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    goto :goto_0

    :cond_1
    invoke-static {v2, v3}, Ll/۟ۙᩴ;->a0(J)Ll/۟ۙᩴ;

    move-result-object v2

    .line 360
    :goto_0
    sget-object v3, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {v1, v8, v9, v3}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ll/ܽ᩶ᩴ;->Z(Ll/ܺۗᩴ;Ll/۟ۙᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object v1

    return-object v1
.end method

.method public final Y(JLl/ۤۗᩴ;)Ll/ܽ᩶ᩴ;
    .locals 2

    .line 291
    instance-of v0, p3, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 292
    move-object v0, p3

    check-cast v0, Ll/ᩴۗᩴ;

    .line 293
    invoke-virtual {v0}, Ll/ᩴۗᩴ;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    iget-object v1, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v1, p1, p2, p3}, Ll/۟ۙᩴ;->j0(JLl/ۤۗᩴ;)Ll/۟ۙᩴ;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ll/ܽ᩶ᩴ;->Z(Ll/ܺۗᩴ;Ll/۟ۙᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object p1

    return-object p1

    .line 296
    :cond_0
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    invoke-interface {v0, p1, p2, p3}, Ll/۬᩹ᩴ;->c(JLl/ۤۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    iget-object p2, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {p0, p1, p2}, Ll/ܽ᩶ᩴ;->Z(Ll/ܺۗᩴ;Ll/۟ۙᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object p1

    return-object p1

    .line 299
    :cond_1
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    invoke-interface {v0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {p3, p0, p1, p2}, Ll/ۤۗᩴ;->G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ܽ᩶ᩴ;->V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final Z(Ll/ܺۗᩴ;Ll/۟ۙᩴ;)Ll/ܽ᩶ᩴ;
    .locals 2

    .line 218
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    if-ne v0, p1, :cond_0

    iget-object v1, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    if-ne v1, p2, :cond_0

    return-object p0

    .line 222
    :cond_0
    invoke-interface {v0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۨ᩹ᩴ;->V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    .line 223
    new-instance v0, Ll/ܽ᩶ᩴ;

    invoke-direct {v0, p1, p2}, Ll/ܽ᩶ᩴ;-><init>(Ll/۬᩹ᩴ;Ll/۟ۙᩴ;)V

    return-object v0
.end method

.method public final a()Ll/ۖ᩶ᩴ;
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    .line 193
    invoke-interface {v0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ll/۟ۙᩴ;
    .locals 1

    .line 234
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    return-object v0
.end method

.method public final bridge synthetic c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 100
    invoke-virtual {p0, p1, p2, p3}, Ll/ܽ᩶ᩴ;->Y(JLl/ۤۗᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 121
    check-cast p1, Ll/ܰ᩹ᩴ;

    invoke-virtual {p0, p1}, Ll/ܽ᩶ᩴ;->L(Ll/ܰ᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 100
    invoke-virtual {p0, p1, p2, p3}, Ll/ܽ᩶ᩴ;->W(JLl/ۘۗᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 1

    .line 240
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_0

    .line 241
    check-cast p1, Ll/ᩴۗᩴ;

    .line 242
    invoke-virtual {p1}, Ll/ᩴۗᩴ;->isDateBased()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ll/ᩴۗᩴ;->V()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 244
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 443
    :cond_0
    instance-of v1, p1, Ll/ܰ᩹ᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 444
    check-cast p1, Ll/ܰ᩹ᩴ;

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->c(Ll/ܰ᩹ᩴ;Ll/ܰ᩹ᩴ;)I

    move-result p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f()Ll/۬᩹ᩴ;
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    return-object v0
.end method

.method public final g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J
    .locals 6

    const-string v0, "endExclusive"

    .line 372
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 229
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    .line 193
    invoke-interface {v0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    .line 374
    invoke-interface {v0, p1}, Ll/ۖ᩶ᩴ;->J(Ll/ۖۗᩴ;)Ll/ܰ᩹ᩴ;

    move-result-object p1

    .line 375
    instance-of v0, p2, Ll/ۡۗᩴ;

    if-eqz v0, :cond_2

    .line 376
    move-object v0, p2

    check-cast v0, Ll/ۡۗᩴ;

    .line 254
    sget-object v1, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_0

    .line 377
    sget-object v1, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    invoke-interface {p1, v1}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v2

    iget-object v4, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    invoke-interface {v4, v1}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 378
    sget-object v1, Ll/֫᩶ᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/4 v0, 0x2

    goto :goto_0

    :pswitch_1
    const/16 v0, 0x18

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x5a0

    goto :goto_0

    :pswitch_3
    const v0, 0x15180

    :goto_0
    int-to-long v0, v0

    .line 0
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v2

    goto :goto_1

    :pswitch_4
    const-wide/32 v0, 0x5265c00

    .line 381
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v2

    goto :goto_1

    :pswitch_5
    const-wide v0, 0x141dd76000L

    .line 380
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v2

    goto :goto_1

    :pswitch_6
    const-wide v0, 0x4e94914f0000L

    .line 379
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v2

    .line 387
    :goto_1
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-interface {p1}, Ll/ܰ᩹ᩴ;->b()Ll/۟ۙᩴ;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Ll/۟ۙᩴ;->g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J

    move-result-wide p1

    invoke-static {v2, v3, p1, p2}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    return-wide p1

    .line 389
    :cond_0
    invoke-interface {p1}, Ll/ܰ᩹ᩴ;->f()Ll/۬᩹ᩴ;

    move-result-object v0

    .line 390
    invoke-interface {p1}, Ll/ܰ᩹ᩴ;->b()Ll/۟ۙᩴ;

    move-result-object p1

    iget-object v2, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    .line 1563
    invoke-virtual {p1, v2}, Ll/۟ۙᩴ;->V(Ll/۟ۙᩴ;)I

    move-result p1

    if-gez p1, :cond_1

    const-wide/16 v2, 0x1

    .line 391
    invoke-interface {v0, v2, v3, v1}, Ll/۬᩹ᩴ;->w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v0

    .line 393
    :cond_1
    iget-object p1, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    invoke-interface {p1, v0, p2}, Ll/۬᩹ᩴ;->g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J

    move-result-wide p1

    return-wide p1

    :cond_2
    const-string v0, "unit"

    .line 395
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 396
    invoke-interface {p2, p0, p1}, Ll/ۘۗᩴ;->l(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)J

    move-result-wide p1

    return-wide p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 2

    .line 229
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    .line 451
    invoke-interface {v0}, Ll/۬᩹ᩴ;->hashCode()I

    move-result v0

    .line 234
    iget-object v1, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    .line 451
    invoke-virtual {v1}, Ll/۟ۙᩴ;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final l(Ll/ۤۗᩴ;)I
    .locals 3

    .line 258
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 259
    move-object v0, p1

    check-cast v0, Ll/ᩴۗᩴ;

    .line 260
    invoke-virtual {v0}, Ll/ᩴۗᩴ;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->l(Ll/ۤۗᩴ;)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    invoke-interface {v0, p1}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result p1

    return p1

    .line 262
    :cond_1
    invoke-virtual {p0, p1}, Ll/ܽ᩶ᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object v0

    invoke-virtual {p0, p1}, Ll/ܽ᩶ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final m(Ll/ᩴ᩹ᩴ;)Ll/ܺۗᩴ;
    .locals 1

    .line 280
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {p0, p1, v0}, Ll/ܽ᩶ᩴ;->Z(Ll/ܺۗᩴ;Ll/۟ۙᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 1

    .line 249
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 250
    move-object v0, p1

    check-cast v0, Ll/ᩴۗᩴ;

    .line 251
    invoke-virtual {v0}, Ll/ᩴۗᩴ;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    invoke-static {v0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 251
    :cond_0
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    invoke-interface {v0, p1}, Ll/ۖۗᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 253
    :cond_1
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->m(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic r(Ll/ᩳ۬ᩴ;)J
    .locals 2

    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->j(Ll/ܰ᩹ᩴ;Ll/ᩳ۬ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 3

    .line 385
    sget-object v0, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    .line 386
    invoke-virtual {p0}, Ll/ܽ᩶ᩴ;->f()Ll/۬᩹ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/۬᩹ᩴ;->H()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    sget-object v0, Ll/ᩴۗᩴ;->NANO_OF_DAY:Ll/ᩴۗᩴ;

    .line 387
    invoke-virtual {p0}, Ll/ܽ᩶ᩴ;->b()Ll/۟ۙᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 229
    iget-object v0, p0, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    .line 456
    invoke-interface {v0}, Ll/۬᩹ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    .line 234
    iget-object v1, p0, Ll/ܽ᩶ᩴ;->b:Ll/۟ۙᩴ;

    .line 456
    invoke-virtual {v1}, Ll/۟ۙᩴ;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "T"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
