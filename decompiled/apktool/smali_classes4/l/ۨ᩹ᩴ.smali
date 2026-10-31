.class public abstract Ll/ۨ᩹ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/۬᩹ᩴ;
.implements Ll/ܺۗᩴ;
.implements Ll/ۗۗᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x572fb054bf61a0b8L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/۬᩹ᩴ;
    .locals 3

    .line 162
    check-cast p1, Ll/۬᩹ᩴ;

    .line 163
    invoke-interface {p1}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ۖ᩶ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 164
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-interface {p0}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Chronology mismatch, expected: "

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


# virtual methods
.method public B(Ll/ۗۗᩴ;)Ll/۬᩹ᩴ;
    .locals 1

    .line 428
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    .line 190
    invoke-interface {p1, p0}, Ll/ۗۗᩴ;->s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    .line 428
    invoke-static {v0, p1}, Ll/ۨ᩹ᩴ;->V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic C(JLl/ۡۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 143
    invoke-virtual {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public H()J
    .locals 2

    .line 673
    sget-object v0, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    invoke-interface {p0, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public I(Ll/۟ۙᩴ;)Ll/ܰ᩹ᩴ;
    .locals 1

    .line 174
    new-instance v0, Ll/ܽ᩶ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ܽ᩶ᩴ;-><init>(Ll/۬᩹ᩴ;Ll/۟ۙᩴ;)V

    return-object v0
.end method

.method public K()Ll/ۘ᩶ᩴ;
    .locals 2

    .line 326
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    sget-object v1, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    .line 0
    invoke-static {p0, v1}, Ll/ۛۗᩴ;->a(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)I

    move-result v1

    .line 326
    invoke-interface {v0, v1}, Ll/ۖ᩶ᩴ;->y(I)Ll/ۘ᩶ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public N(Ll/۫ۗᩴ;)Ll/۬᩹ᩴ;
    .locals 1

    .line 452
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    .line 262
    invoke-interface {p1, p0}, Ll/۫ۗᩴ;->l(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    .line 452
    invoke-static {v0, p1}, Ll/ۨ᩹ᩴ;->V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public Q()I
    .locals 1

    .line 363
    invoke-interface {p0}, Ll/۬᩹ᩴ;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x16e

    return v0

    :cond_0
    const/16 v0, 0x16d

    return v0
.end method

.method public final synthetic R(Ll/۬᩹ᩴ;)I
    .locals 0

    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->b(Ll/۬᩹ᩴ;Ll/۬᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public final synthetic T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->g(Ll/۬᩹ᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final W(Ll/۬᩹ᩴ;)J
    .locals 10

    .line 401
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    sget-object v1, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {v0, v1}, Ll/ۖ᩶ᩴ;->v(Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object v0

    .line 253
    iget-wide v0, v0, Ll/᩺ۗᩴ;->d:J

    const-wide/16 v2, 0xc

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 405
    sget-object v0, Ll/ᩴۗᩴ;->PROLEPTIC_MONTH:Ll/ᩴۗᩴ;

    invoke-interface {p0, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v1

    const-wide/16 v3, 0x20

    mul-long v1, v1, v3

    sget-object v5, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    .line 0
    invoke-static {p0, v5}, Ll/ۛۗᩴ;->a(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v1, v6

    .line 406
    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v6

    mul-long v6, v6, v3

    invoke-interface {p1, v5}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result p1

    int-to-long v8, p1

    add-long/2addr v6, v8

    sub-long/2addr v6, v1

    .line 407
    div-long/2addr v6, v3

    return-wide v6

    .line 403
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ChronoLocalDateImpl only supports Chronologies with 12 months per year"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract X(J)Ll/۬᩹ᩴ;
.end method

.method public abstract Y(J)Ll/۬᩹ᩴ;
.end method

.method public abstract Z(J)Ll/۬᩹ᩴ;
.end method

.method public c(JLl/ۤۗᩴ;)Ll/۬᩹ᩴ;
    .locals 1

    .line 439
    instance-of v0, p3, Ll/ᩴۗᩴ;

    if-nez v0, :cond_0

    .line 442
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {p3, p0, p1, p2}, Ll/ۤۗᩴ;->G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۨ᩹ᩴ;->V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 440
    :cond_0
    new-instance p1, Ll/ۨۗᩴ;

    const-string p2, "Unsupported field: "

    .line 0
    invoke-static {p2, p3}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 440
    throw p1
.end method

.method public bridge synthetic c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 143
    invoke-virtual {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->c(JLl/ۤۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 241
    check-cast p1, Ll/۬᩹ᩴ;

    invoke-virtual {p0, p1}, Ll/ۨ᩹ᩴ;->R(Ll/۬᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;
    .locals 3

    .line 199
    instance-of v0, p3, Ll/ۡۗᩴ;

    const-string v1, "Unsupported unit: "

    if-eqz v0, :cond_0

    .line 200
    move-object v0, p3

    check-cast v0, Ll/ۡۗᩴ;

    .line 201
    sget-object v2, Ll/ۤ᩹ᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    packed-switch v0, :pswitch_data_0

    .line 211
    new-instance p1, Ll/ۨۗᩴ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 211
    throw p1

    .line 209
    :pswitch_0
    sget-object p3, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-interface {p0, p3}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->c(JLl/ۤۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_1
    const/16 p3, 0x3e8

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 208
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩹ᩴ;->Z(J)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_2
    const/16 p3, 0x64

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 207
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩹ᩴ;->Z(J)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_3
    const/16 p3, 0xa

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 206
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩹ᩴ;->Z(J)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 205
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩹ᩴ;->Z(J)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 204
    :pswitch_5
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩹ᩴ;->Y(J)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_6
    const/4 p3, 0x7

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 203
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩹ᩴ;->X(J)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 202
    :pswitch_7
    invoke-virtual {p0, p1, p2}, Ll/ۨ᩹ᩴ;->X(J)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    :cond_0
    if-nez v0, :cond_1

    .line 465
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {p3, p0, p1, p2}, Ll/ۘۗᩴ;->m(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۨ᩹ᩴ;->V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 463
    :cond_1
    new-instance p1, Ll/ۨۗᩴ;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 463
    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 143
    invoke-virtual {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(Ll/ۤۗᩴ;)Z
    .locals 0

    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->f(Ll/۬᩹ᩴ;Ll/ۤۗᩴ;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 415
    :cond_0
    instance-of v1, p1, Ll/۬᩹ᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 416
    check-cast p1, Ll/۬᩹ᩴ;

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->b(Ll/۬᩹ᩴ;Ll/۬᩹ᩴ;)I

    move-result p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J
    .locals 2

    const-string v0, "endExclusive"

    .line 377
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 378
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ۖ᩶ᩴ;->E(Ll/ۖۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    .line 379
    instance-of v0, p2, Ll/ۡۗᩴ;

    if-eqz v0, :cond_0

    .line 380
    sget-object v0, Ll/ۤ᩹ᩴ;->a:[I

    move-object v1, p2

    check-cast v1, Ll/ۡۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 390
    new-instance p1, Ll/ۨۗᩴ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported unit: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 390
    throw p1

    .line 388
    :pswitch_0
    sget-object p2, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-interface {p1, p2}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    invoke-interface {p0, p2}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide p1

    sub-long/2addr v0, p1

    return-wide v0

    .line 387
    :pswitch_1
    invoke-virtual {p0, p1}, Ll/ۨ᩹ᩴ;->W(Ll/۬᩹ᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0x2ee0

    div-long/2addr p1, v0

    return-wide p1

    .line 386
    :pswitch_2
    invoke-virtual {p0, p1}, Ll/ۨ᩹ᩴ;->W(Ll/۬᩹ᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0x4b0

    div-long/2addr p1, v0

    return-wide p1

    .line 385
    :pswitch_3
    invoke-virtual {p0, p1}, Ll/ۨ᩹ᩴ;->W(Ll/۬᩹ᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0x78

    div-long/2addr p1, v0

    return-wide p1

    .line 384
    :pswitch_4
    invoke-virtual {p0, p1}, Ll/ۨ᩹ᩴ;->W(Ll/۬᩹ᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0xc

    div-long/2addr p1, v0

    return-wide p1

    .line 383
    :pswitch_5
    invoke-virtual {p0, p1}, Ll/ۨ᩹ᩴ;->W(Ll/۬᩹ᩴ;)J

    move-result-wide p1

    return-wide p1

    .line 397
    :pswitch_6
    invoke-interface {p1}, Ll/۬᩹ᩴ;->H()J

    move-result-wide p1

    invoke-virtual {p0}, Ll/ۨ᩹ᩴ;->H()J

    move-result-wide v0

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x7

    .line 382
    div-long/2addr p1, v0

    return-wide p1

    .line 397
    :pswitch_7
    invoke-interface {p1}, Ll/۬᩹ᩴ;->H()J

    move-result-wide p1

    invoke-virtual {p0}, Ll/ۨ᩹ᩴ;->H()J

    move-result-wide v0

    sub-long/2addr p1, v0

    return-wide p1

    :cond_0
    const-string v0, "unit"

    .line 392
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 393
    invoke-interface {p2, p0, p1}, Ll/ۘۗᩴ;->l(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)J

    move-result-wide p1

    return-wide p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public hashCode()I
    .locals 5

    .line 423
    invoke-virtual {p0}, Ll/ۨ᩹ᩴ;->H()J

    move-result-wide v0

    .line 424
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/ۖ᩶ᩴ;->hashCode()I

    move-result v2

    const/16 v3, 0x20

    ushr-long v3, v0, v3

    xor-long/2addr v0, v3

    long-to-int v1, v0

    xor-int v0, v2, v1

    return v0
.end method

.method public final synthetic l(Ll/ۤۗᩴ;)I
    .locals 0

    invoke-static {p0, p1}, Ll/ۛۗᩴ;->a(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic m(Ll/ᩴ᩹ᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 143
    invoke-virtual {p0, p1}, Ll/ۨ᩹ᩴ;->B(Ll/ۗۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public synthetic n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 0

    invoke-static {p0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->a(Ll/۬᩹ᩴ;Ll/ܺۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 430
    sget-object v0, Ll/ᩴۗᩴ;->YEAR_OF_ERA:Ll/ᩴۗᩴ;

    invoke-interface {p0, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    .line 431
    sget-object v2, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p0, v2}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v2

    .line 432
    sget-object v4, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    invoke-interface {p0, v4}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v4

    .line 433
    new-instance v6, Ljava/lang/StringBuilder;

    const/16 v7, 0x1e

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 434
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v7

    invoke-interface {v7}, Ll/ۖ᩶ᩴ;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " "

    .line 435
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    invoke-virtual {p0}, Ll/ۨ᩹ᩴ;->K()Ll/ۘ᩶ᩴ;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 437
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "-"

    const-string v1, "-0"

    const-wide/16 v7, 0xa

    cmp-long v9, v2, v7

    if-gez v9, :cond_0

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object v9, v0

    .line 439
    :goto_0
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    cmp-long v2, v4, v7

    if-gez v2, :cond_1

    move-object v0, v1

    .line 440
    :cond_1
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 441
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 3

    .line 341
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    sget-object v1, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p0, v1}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Ll/ۖ᩶ᩴ;->S(J)Z

    move-result v0

    return v0
.end method

.method public w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;
    .locals 1

    .line 486
    invoke-interface {p0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-static {p0, p1, p2, p3}, Ll/ۛۗᩴ;->b(Ll/ܺۗᩴ;JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۨ᩹ᩴ;->V(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1
.end method
