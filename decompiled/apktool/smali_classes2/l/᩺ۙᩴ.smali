.class public final Ll/᩺ۙᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܺۗᩴ;
.implements Ll/ۗۗᩴ;
.implements Ll/ܰ᩹ᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final c:Ll/᩺ۙᩴ;

.field public static final d:Ll/᩺ۙᩴ;

.field public static final serialVersionUID:J = 0x56266aa6a95fff2eL


# instance fields
.field public final a:Ll/ᩴ᩹ᩴ;

.field public final b:Ll/۟ۙᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 144
    sget-object v0, Ll/ᩴ᩹ᩴ;->d:Ll/ᩴ᩹ᩴ;

    sget-object v1, Ll/۟ۙᩴ;->e:Ll/۟ۙᩴ;

    invoke-static {v0, v1}, Ll/᩺ۙᩴ;->Y(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v0

    sput-object v0, Ll/᩺ۙᩴ;->c:Ll/᩺ۙᩴ;

    .line 151
    sget-object v0, Ll/ᩴ᩹ᩴ;->e:Ll/ᩴ᩹ᩴ;

    sget-object v1, Ll/۟ۙᩴ;->f:Ll/۟ۙᩴ;

    invoke-static {v0, v1}, Ll/᩺ۙᩴ;->Y(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v0

    sput-object v0, Ll/᩺ۙᩴ;->d:Ll/᩺ۙᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)V
    .locals 0

    .line 502
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 503
    iput-object p1, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 504
    iput-object p2, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    return-void
.end method

.method public static W(Ll/ۖۗᩴ;)Ll/᩺ۙᩴ;
    .locals 5

    .line 448
    instance-of v0, p0, Ll/᩺ۙᩴ;

    if-eqz v0, :cond_0

    .line 449
    check-cast p0, Ll/᩺ۙᩴ;

    return-object p0

    .line 450
    :cond_0
    instance-of v0, p0, Ll/֨᩹ᩴ;

    if-eqz v0, :cond_1

    .line 451
    check-cast p0, Ll/֨᩹ᩴ;

    .line 1028
    iget-object p0, p0, Ll/֨᩹ᩴ;->a:Ll/᩺ۙᩴ;

    return-object p0

    .line 452
    :cond_1
    instance-of v0, p0, Ll/᩵᩹ᩴ;

    if-eqz v0, :cond_2

    .line 453
    check-cast p0, Ll/᩵᩹ᩴ;

    .line 715
    iget-object p0, p0, Ll/᩵᩹ᩴ;->a:Ll/᩺ۙᩴ;

    return-object p0

    .line 456
    :cond_2
    :try_start_0
    invoke-static {p0}, Ll/ᩴ᩹ᩴ;->X(Ll/ۖۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    .line 457
    invoke-static {p0}, Ll/۟ۙᩴ;->X(Ll/ۖۗᩴ;)Ll/۟ۙᩴ;

    move-result-object v1

    .line 458
    new-instance v2, Ll/᩺ۙᩴ;

    invoke-direct {v2, v0, v1}, Ll/᩺ۙᩴ;-><init>(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)V
    :try_end_0
    .catch Ll/ܺ᩹ᩴ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v0

    .line 460
    new-instance v1, Ll/ܺ᩹ᩴ;

    .line 461
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to obtain LocalDateTime from TemporalAccessor: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 98
    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 461
    throw v1
.end method

.method public static Y(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;
    .locals 1

    const-string v0, "date"

    .line 374
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "time"

    .line 375
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 376
    new-instance v0, Ll/᩺ۙᩴ;

    invoke-direct {v0, p0, p1}, Ll/᩺ۙᩴ;-><init>(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)V

    return-object v0
.end method

.method public static Z(JILl/ᩳ۬ᩴ;)Ll/᩺ۙᩴ;
    .locals 5

    const-string v0, "offset"

    .line 417
    invoke-static {p3, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 418
    sget-object v0, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Ll/ᩴۗᩴ;->T(J)V

    .line 474
    iget p2, p3, Ll/ᩳ۬ᩴ;->b:I

    int-to-long p2, p2

    add-long/2addr p0, p2

    const p2, 0x15180

    int-to-long p2, p2

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide v3

    invoke-static {p0, p1, p2, p3}, Ll/᩺ۚᩴ;->O(JJ)J

    move-result-wide p0

    long-to-int p1, p0

    .line 422
    invoke-static {v3, v4}, Ll/ᩴ᩹ᩴ;->i0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p0

    int-to-long p1, p1

    const-wide/32 v3, 0x3b9aca00

    mul-long p1, p1, v3

    add-long/2addr p1, v1

    .line 423
    invoke-static {p1, p2}, Ll/۟ۙᩴ;->a0(J)Ll/۟ۙᩴ;

    move-result-object p1

    .line 424
    new-instance p2, Ll/᩺ۙᩴ;

    invoke-direct {p2, p0, p1}, Ll/᩺ۙᩴ;-><init>(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)V

    return-object p2
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1999
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1989
    new-instance v0, Ll/᩷ۗᩴ;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0}, Ll/᩷ۗᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final C(JLl/ۡۗᩴ;)Ll/ܺۗᩴ;
    .locals 3

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 1395
    invoke-virtual {p0, p1, p2, p3}, Ll/᩺ۙᩴ;->a0(JLl/ۘۗᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ll/᩺ۙᩴ;->a0(JLl/ۘۗᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ll/᩺ۙᩴ;->a0(JLl/ۘۗᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final D(Ll/ۚ᩹ᩴ;)Ll/᩹᩹ᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 293
    invoke-static {p0, p1, v0}, Ll/֨᩹ᩴ;->W(Ll/᩺ۙᩴ;Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;)Ll/֨᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final G(Ll/ۤۗᩴ;)J
    .locals 2

    .line 718
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 719
    move-object v0, p1

    check-cast v0, Ll/ᩴۗᩴ;

    .line 720
    invoke-virtual {v0}, Ll/ᩴۗᩴ;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 722
    :cond_1
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final L(Ll/ܰ᩹ᩴ;)I
    .locals 1

    .line 1820
    instance-of v0, p1, Ll/᩺ۙᩴ;

    if-eqz v0, :cond_0

    .line 1821
    check-cast p1, Ll/᩺ۙᩴ;

    invoke-virtual {p0, p1}, Ll/᩺ۙᩴ;->V(Ll/᩺ۙᩴ;)I

    move-result p1

    return p1

    .line 1823
    :cond_0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->c(Ll/ܰ᩹ᩴ;Ll/ܰ᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public final T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 1

    .line 1596
    sget-object v0, Ll/ۛۗᩴ;->f:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_0

    .line 1597
    iget-object p1, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    return-object p1

    .line 1599
    :cond_0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->h(Ll/ܰ᩹ᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final V(Ll/᩺ۙᩴ;)I
    .locals 2

    .line 1827
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 736
    iget-object v1, p1, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 1827
    invoke-virtual {v0, v1}, Ll/ᩴ᩹ᩴ;->V(Ll/ᩴ᩹ᩴ;)I

    move-result v0

    if-nez v0, :cond_0

    .line 1829
    iget-object v0, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    .line 832
    iget-object p1, p1, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    .line 1829
    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->V(Ll/۟ۙᩴ;)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public final X(Ll/ܰ᩹ᩴ;)Z
    .locals 5

    .line 1886
    instance-of v0, p1, Ll/᩺ۙᩴ;

    if-eqz v0, :cond_0

    .line 1887
    check-cast p1, Ll/᩺ۙᩴ;

    invoke-virtual {p0, p1}, Ll/᩺ۙᩴ;->V(Ll/᩺ۙᩴ;)I

    move-result p1

    if-gez p1, :cond_1

    goto :goto_0

    .line 736
    :cond_0
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 553
    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v0

    .line 554
    invoke-interface {p1}, Ll/ܰ᩹ᩴ;->f()Ll/۬᩹ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/۬᩹ᩴ;->H()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-ltz v4, :cond_2

    if-nez v4, :cond_1

    .line 832
    iget-object v0, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    .line 556
    invoke-virtual {v0}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v0

    invoke-interface {p1}, Ll/ܰ᩹ᩴ;->b()Ll/۟ۙᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final a()Ll/ۖ᩶ᩴ;
    .locals 1

    .line 193
    invoke-virtual {p0}, Ll/᩺ۙᩴ;->f()Ll/۬᩹ᩴ;

    move-result-object v0

    check-cast v0, Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final a0(JLl/ۘۗᩴ;)Ll/᩺ۙᩴ;
    .locals 21

    move-object/from16 v10, p0

    move-wide/from16 v8, p1

    move-object/from16 v0, p3

    .line 1183
    instance-of v1, v0, Ll/ۡۗᩴ;

    if-eqz v1, :cond_0

    .line 1184
    move-object v1, v0

    check-cast v1, Ll/ۡۗᩴ;

    .line 1185
    sget-object v2, Ll/ۨۙᩴ;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    .line 1194
    iget-object v1, v10, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v1, v8, v9, v0}, Ll/ᩴ᩹ᩴ;->k0(JLl/ۘۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    iget-object v1, v10, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v10, v0, v1}, Ll/᩺ۙᩴ;->e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-wide/16 v0, 0x100

    .line 1192
    div-long v2, v8, v0

    .line 1286
    iget-object v4, v10, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v4, v2, v3}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object v2

    .line 1287
    iget-object v3, v10, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v10, v2, v3}, Ll/᩺ۙᩴ;->e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v11

    .line 1192
    rem-long v0, v8, v0

    const-wide/16 v2, 0xc

    mul-long v13, v0, v2

    .line 1301
    iget-object v12, v11, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v15, 0x0

    invoke-virtual/range {v11 .. v20}, Ll/᩺ۙᩴ;->c0(Ll/ᩴ᩹ᩴ;JJJJ)Ll/᩺ۙᩴ;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v1, v10, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    const-wide/16 v6, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v4, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    move-wide v8, v11

    invoke-virtual/range {v0 .. v9}, Ll/᩺ۙᩴ;->c0(Ll/ᩴ᩹ᩴ;JJJJ)Ll/᩺ۙᩴ;

    move-result-object v0

    return-object v0

    .line 1314
    :pswitch_2
    iget-object v1, v10, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    const-wide/16 v6, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v4, p1

    move-wide v8, v11

    invoke-virtual/range {v0 .. v9}, Ll/᩺ۙᩴ;->c0(Ll/ᩴ᩹ᩴ;JJJJ)Ll/᩺ۙᩴ;

    move-result-object v0

    return-object v0

    .line 1189
    :pswitch_3
    invoke-virtual/range {p0 .. p2}, Ll/᩺ۙᩴ;->b0(J)Ll/᩺ۙᩴ;

    move-result-object v0

    return-object v0

    :pswitch_4
    const-wide/32 v0, 0x5265c00

    .line 1188
    div-long v2, v8, v0

    .line 1286
    iget-object v4, v10, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v4, v2, v3}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object v2

    .line 1287
    iget-object v3, v10, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v10, v2, v3}, Ll/᩺ۙᩴ;->e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v11

    .line 1188
    rem-long v0, v8, v0

    const-wide/32 v2, 0xf4240

    mul-long v19, v0, v2

    .line 1340
    iget-object v12, v11, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v13, 0x0

    invoke-virtual/range {v11 .. v20}, Ll/᩺ۙᩴ;->c0(Ll/ᩴ᩹ᩴ;JJJJ)Ll/᩺ۙᩴ;

    move-result-object v0

    return-object v0

    :pswitch_5
    const-wide v0, 0x141dd76000L

    .line 1187
    div-long v2, v8, v0

    .line 1286
    iget-object v4, v10, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v4, v2, v3}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object v2

    .line 1287
    iget-object v3, v10, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v10, v2, v3}, Ll/᩺ۙᩴ;->e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v11

    .line 1187
    rem-long v0, v8, v0

    const-wide/16 v2, 0x3e8

    mul-long v19, v0, v2

    .line 1340
    iget-object v12, v11, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v13, 0x0

    invoke-virtual/range {v11 .. v20}, Ll/᩺ۙᩴ;->c0(Ll/ᩴ᩹ᩴ;JJJJ)Ll/᩺ۙᩴ;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v1, v10, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v8, p1

    invoke-virtual/range {v0 .. v9}, Ll/᩺ۙᩴ;->c0(Ll/ᩴ᩹ᩴ;JJJJ)Ll/᩺ۙᩴ;

    move-result-object v0

    return-object v0

    .line 1196
    :cond_0
    invoke-interface {v0, v10, v8, v9}, Ll/ۘۗᩴ;->m(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object v0

    check-cast v0, Ll/᩺ۙᩴ;

    return-object v0

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

.method public final b()Ll/۟ۙᩴ;
    .locals 1

    .line 832
    iget-object v0, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    return-object v0
.end method

.method public final b0(J)Ll/᩺ۙᩴ;
    .locals 10

    .line 1327
    iget-object v1, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    const-wide/16 v4, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p0

    move-wide v6, p1

    invoke-virtual/range {v0 .. v9}, Ll/᩺ۙᩴ;->c0(Ll/ᩴ᩹ᩴ;JJJJ)Ll/᩺ۙᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 135
    invoke-virtual {p0, p1, p2, p3}, Ll/᩺ۙᩴ;->d0(JLl/ۤۗᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final c0(Ll/ᩴ᩹ᩴ;JJJJ)Ll/᩺ۙᩴ;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    or-long v2, p2, p4

    or-long v2, v2, p6

    or-long v2, v2, p8

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 1555
    iget-object v2, v0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0, v1, v2}, Ll/᩺ۙᩴ;->e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v1

    return-object v1

    :cond_0
    const-wide v2, 0x4e94914f0000L

    .line 1557
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

    const/4 v10, 0x1

    int-to-long v10, v10

    mul-long v12, v12, v10

    .line 1562
    rem-long v14, p8, v2

    rem-long v6, p6, v6

    const-wide/32 v16, 0x3b9aca00

    mul-long v6, v6, v16

    add-long/2addr v6, v14

    rem-long v4, p4, v4

    const-wide v14, 0xdf8475800L

    mul-long v4, v4, v14

    add-long/2addr v4, v6

    rem-long v6, p2, v8

    const-wide v8, 0x34630b8a000L

    mul-long v6, v6, v8

    add-long/2addr v6, v4

    .line 1566
    iget-object v4, v0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v4}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v4

    mul-long v6, v6, v10

    add-long/2addr v6, v4

    .line 1568
    invoke-static {v6, v7, v2, v3}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide v8

    add-long/2addr v8, v12

    .line 1569
    invoke-static {v6, v7, v2, v3}, Ll/᩺ۚᩴ;->O(JJ)J

    move-result-wide v2

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    .line 1570
    iget-object v2, v0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    goto :goto_0

    :cond_1
    invoke-static {v2, v3}, Ll/۟ۙᩴ;->a0(J)Ll/۟ۙᩴ;

    move-result-object v2

    .line 1571
    :goto_0
    invoke-virtual {v1, v8, v9}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ll/᩺ۙᩴ;->e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v1

    return-object v1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 135
    check-cast p1, Ll/ܰ᩹ᩴ;

    invoke-virtual {p0, p1}, Ll/᩺ۙᩴ;->L(Ll/ܰ᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 135
    invoke-virtual {p0, p1, p2, p3}, Ll/᩺ۙᩴ;->a0(JLl/ۘۗᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final d0(JLl/ۤۗᩴ;)Ll/᩺ۙᩴ;
    .locals 2

    .line 965
    instance-of v0, p3, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 966
    move-object v0, p3

    check-cast v0, Ll/ᩴۗᩴ;

    .line 967
    invoke-virtual {v0}, Ll/ᩴۗᩴ;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 968
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    iget-object v1, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v1, p1, p2, p3}, Ll/۟ۙᩴ;->j0(JLl/ۤۗᩴ;)Ll/۟ۙᩴ;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ll/᩺ۙᩴ;->e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    return-object p1

    .line 970
    :cond_0
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->q0(JLl/ۤۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    iget-object p2, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {p0, p1, p2}, Ll/᩺ۙᩴ;->e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    return-object p1

    .line 973
    :cond_1
    invoke-interface {p3, p0, p1, p2}, Ll/ۤۗᩴ;->G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/᩺ۙᩴ;

    return-object p1
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 1

    .line 575
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_0

    .line 576
    check-cast p1, Ll/ᩴۗᩴ;

    .line 577
    invoke-virtual {p1}, Ll/ᩴۗᩴ;->isDateBased()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ll/ᩴۗᩴ;->V()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 579
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

.method public final e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;
    .locals 1

    .line 516
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    if-ne v0, p2, :cond_0

    return-object p0

    .line 519
    :cond_0
    new-instance v0, Ll/᩺ۙᩴ;

    invoke-direct {v0, p1, p2}, Ll/᩺ۙᩴ;-><init>(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1936
    :cond_0
    instance-of v1, p1, Ll/᩺ۙᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 1937
    check-cast p1, Ll/᩺ۙᩴ;

    .line 1938
    iget-object v1, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    iget-object v3, p1, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v1, v3}, Ll/ᩴ᩹ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    iget-object p1, p1, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v1, p1}, Ll/۟ۙᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f()Ll/۬᩹ᩴ;
    .locals 1

    .line 736
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    return-object v0
.end method

.method public final g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J
    .locals 8

    .line 1683
    invoke-static {p1}, Ll/᩺ۙᩴ;->W(Ll/ۖۗᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    .line 1684
    instance-of v0, p2, Ll/ۡۗᩴ;

    if-eqz v0, :cond_6

    .line 1685
    move-object v0, p2

    check-cast v0, Ll/ۡۗᩴ;

    .line 254
    sget-object v1, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    const-wide/16 v2, 0x1

    if-gez v1, :cond_2

    .line 1686
    iget-object v1, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    iget-object v4, p1, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1662
    invoke-virtual {v4}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v4

    invoke-virtual {v1}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-nez v1, :cond_0

    .line 1688
    iget-object v0, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    iget-object p1, p1, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1, p2}, Ll/۟ۙᩴ;->g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J

    move-result-wide p1

    return-wide p1

    .line 1690
    :cond_0
    iget-object p1, p1, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {p1}, Ll/۟ۙᩴ;->h0()J

    move-result-wide p1

    iget-object v6, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v6}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v6

    sub-long/2addr p1, v6

    const-wide v6, 0x4e94914f0000L

    if-lez v1, :cond_1

    sub-long/2addr v4, v2

    add-long/2addr p1, v6

    goto :goto_0

    :cond_1
    add-long/2addr v4, v2

    sub-long/2addr p1, v6

    .line 1698
    :goto_0
    sget-object v1, Ll/ۨۙᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/4 v0, 0x2

    int-to-long v0, v0

    .line 0
    invoke-static {v4, v5, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v4

    const-wide v0, 0x274a48a78000L

    .line 1724
    div-long/2addr p1, v0

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x18

    int-to-long v0, v0

    .line 0
    invoke-static {v4, v5, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v4

    const-wide v0, 0x34630b8a000L

    .line 1720
    div-long/2addr p1, v0

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x5a0

    int-to-long v0, v0

    .line 0
    invoke-static {v4, v5, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v4

    const-wide v0, 0xdf8475800L

    .line 1716
    div-long/2addr p1, v0

    goto :goto_1

    :pswitch_3
    const v0, 0x15180

    int-to-long v0, v0

    .line 0
    invoke-static {v4, v5, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v4

    const-wide/32 v0, 0x3b9aca00

    .line 1712
    div-long/2addr p1, v0

    goto :goto_1

    :pswitch_4
    const-wide/32 v0, 0x5265c00

    .line 1707
    invoke-static {v4, v5, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v4

    const-wide/32 v0, 0xf4240

    .line 1708
    div-long/2addr p1, v0

    goto :goto_1

    :pswitch_5
    const-wide v0, 0x141dd76000L

    .line 1703
    invoke-static {v4, v5, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v4

    const-wide/16 v0, 0x3e8

    .line 1704
    div-long/2addr p1, v0

    goto :goto_1

    .line 1700
    :pswitch_6
    invoke-static {v4, v5, v6, v7}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v4

    .line 1727
    :goto_1
    invoke-static {v4, v5, p1, p2}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    return-wide p1

    .line 1729
    :cond_2
    iget-object v0, p1, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 1730
    iget-object v1, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2055
    invoke-virtual {v0, v1}, Ll/ᩴ᩹ᩴ;->V(Ll/ᩴ᩹ᩴ;)I

    move-result v1

    if-lez v1, :cond_4

    goto :goto_2

    .line 729
    :cond_3
    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v4

    invoke-virtual {v1}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v6

    cmp-long v1, v4, v6

    if-lez v1, :cond_4

    .line 1730
    :goto_2
    iget-object v1, p1, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    iget-object v4, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    .line 1563
    invoke-virtual {v1, v4}, Ll/۟ۙᩴ;->V(Ll/۟ۙᩴ;)I

    move-result v1

    if-gez v1, :cond_4

    const-wide/16 v1, -0x1

    .line 1535
    invoke-virtual {v0, v1, v2}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    goto :goto_3

    .line 1732
    :cond_4
    iget-object v1, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, v1}, Ll/ᩴ᩹ᩴ;->c0(Ll/۬᩹ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object p1, p1, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    iget-object v1, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    .line 1551
    invoke-virtual {p1, v1}, Ll/۟ۙᩴ;->V(Ll/۟ۙᩴ;)I

    move-result p1

    if-lez p1, :cond_5

    .line 1733
    invoke-virtual {v0, v2, v3}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    .line 1735
    :cond_5
    :goto_3
    iget-object p1, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p1, v0, p2}, Ll/ᩴ᩹ᩴ;->g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J

    move-result-wide p1

    return-wide p1

    .line 1737
    :cond_6
    invoke-interface {p2, p0, p1}, Ll/ۘۗᩴ;->l(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)J

    move-result-wide p1

    return-wide p1

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

    .line 1950
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->hashCode()I

    move-result v0

    iget-object v1, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v1}, Ll/۟ۙᩴ;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final l(Ll/ۤۗᩴ;)I
    .locals 1

    .line 686
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 687
    move-object v0, p1

    check-cast v0, Ll/ᩴۗᩴ;

    .line 688
    invoke-virtual {v0}, Ll/ᩴۗᩴ;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->l(Ll/ۤۗᩴ;)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩹ᩴ;->l(Ll/ۤۗᩴ;)I

    move-result p1

    return p1

    .line 690
    :cond_1
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->a(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final m(Ll/ᩴ᩹ᩴ;)Ll/ܺۗᩴ;
    .locals 1

    .line 920
    iget-object v0, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {p0, p1, v0}, Ll/᩺ۙᩴ;->e0(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 1

    .line 649
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 650
    move-object v0, p1

    check-cast v0, Ll/ᩴۗᩴ;

    .line 651
    invoke-virtual {v0}, Ll/ᩴۗᩴ;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    invoke-static {v0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 651
    :cond_0
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩹ᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 653
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
    invoke-virtual {p0}, Ll/᩺ۙᩴ;->f()Ll/۬᩹ᩴ;

    move-result-object v1

    check-cast v1, Ll/ᩴ᩹ᩴ;

    invoke-virtual {v1}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    sget-object v0, Ll/ᩴۗᩴ;->NANO_OF_DAY:Ll/ᩴۗᩴ;

    .line 387
    invoke-virtual {p0}, Ll/᩺ۙᩴ;->b()Ll/۟ۙᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1972
    iget-object v0, p0, Ll/᩺ۙᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩺ۙᩴ;->b:Ll/۟ۙᩴ;

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
