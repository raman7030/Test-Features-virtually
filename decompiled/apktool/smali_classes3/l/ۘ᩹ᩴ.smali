.class public final Ll/ۘ᩹ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܺۗᩴ;
.implements Ll/ۗۗᩴ;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final EPOCH:Ll/ۘ᩹ᩴ;

.field public static final c:Ll/ۘ᩹ᩴ;

.field public static final d:Ll/ۘ᩹ᩴ;

.field public static final serialVersionUID:J = -0x93d170fdcc5dce4L


# instance fields
.field public final a:J

.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 213
    new-instance v0, Ll/ۘ᩹ᩴ;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3, v1}, Ll/ۘ᩹ᩴ;-><init>(JI)V

    sput-object v0, Ll/ۘ᩹ᩴ;->EPOCH:Ll/ۘ᩹ᩴ;

    const-wide v0, -0x701cefeb9bec00L

    .line 232
    invoke-static {v0, v1, v2, v3}, Ll/ۘ᩹ᩴ;->ofEpochSecond(JJ)Ll/ۘ᩹ᩴ;

    move-result-object v0

    sput-object v0, Ll/ۘ᩹ᩴ;->c:Ll/ۘ᩹ᩴ;

    const-wide v0, 0x701cd2fa9578ffL

    const-wide/32 v2, 0x3b9ac9ff

    .line 243
    invoke-static {v0, v1, v2, v3}, Ll/ۘ᩹ᩴ;->ofEpochSecond(JJ)Ll/ۘ᩹ᩴ;

    move-result-object v0

    sput-object v0, Ll/ۘ᩹ᩴ;->d:Ll/ۘ᩹ᩴ;

    return-void
.end method

.method public constructor <init>(JI)V
    .locals 0

    .line 424
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 425
    iput-wide p1, p0, Ll/ۘ᩹ᩴ;->a:J

    .line 426
    iput p3, p0, Ll/ۘ᩹ᩴ;->b:I

    return-void
.end method

.method public static V(JI)Ll/ۘ᩹ᩴ;
    .locals 5

    int-to-long v0, p2

    or-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 408
    sget-object p0, Ll/ۘ᩹ᩴ;->EPOCH:Ll/ۘ᩹ᩴ;

    return-object p0

    :cond_0
    const-wide v0, -0x701cefeb9bec00L

    cmp-long v2, p0, v0

    if-ltz v2, :cond_1

    const-wide v0, 0x701cd2fa9578ffL

    cmp-long v2, p0, v0

    if-gtz v2, :cond_1

    .line 413
    new-instance v0, Ll/ۘ᩹ᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۘ᩹ᩴ;-><init>(JI)V

    return-object v0

    .line 411
    :cond_1
    new-instance p0, Ll/ܺ᩹ᩴ;

    const-string p1, "Instant exceeds minimum or maximum instant"

    invoke-direct {p0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static W(Ll/ۖۗᩴ;)Ll/ۘ᩹ᩴ;
    .locals 5

    .line 368
    instance-of v0, p0, Ll/ۘ᩹ᩴ;

    if-eqz v0, :cond_0

    .line 369
    check-cast p0, Ll/ۘ᩹ᩴ;

    return-object p0

    :cond_0
    const-string v0, "temporal"

    .line 371
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 373
    :try_start_0
    sget-object v0, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    invoke-interface {p0, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    .line 374
    sget-object v2, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    invoke-interface {p0, v2}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v2

    int-to-long v2, v2

    .line 375
    invoke-static {v0, v1, v2, v3}, Ll/ۘ᩹ᩴ;->ofEpochSecond(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p0
    :try_end_0
    .catch Ll/ܺ᩹ᩴ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 377
    new-instance v1, Ll/ܺ᩹ᩴ;

    .line 378
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to obtain Instant from TemporalAccessor: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 98
    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 378
    throw v1
.end method

.method public static now()Ll/ۘ᩹ᩴ;
    .locals 1

    .line 273
    invoke-static {}, Ll/ۡ᩹ᩴ;->systemUTC()Ll/ۡ᩹ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡ᩹ᩴ;->instant()Ll/ۘ᩹ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public static ofEpochMilli(J)Ll/ۘ᩹ᩴ;
    .locals 4

    const/16 v0, 0x3e8

    int-to-long v0, v0

    .line 0
    invoke-static {p0, p1, v0, v1}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide v2

    invoke-static {p0, p1, v0, v1}, Ll/᩺ۚᩴ;->O(JJ)J

    move-result-wide p0

    long-to-int p1, p0

    const p0, 0xf4240

    mul-int p1, p1, p0

    .line 346
    invoke-static {v2, v3, p1}, Ll/ۘ᩹ᩴ;->V(JI)Ll/ۘ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ofEpochSecond(J)Ll/ۘ᩹ᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 304
    invoke-static {p0, p1, v0}, Ll/ۘ᩹ᩴ;->V(JI)Ll/ۘ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ofEpochSecond(JJ)Ll/ۘ᩹ᩴ;
    .locals 4

    const-wide/32 v0, 0x3b9aca00

    .line 328
    invoke-static {p2, p3, v0, v1}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide v2

    invoke-static {p0, p1, v2, v3}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p0

    .line 329
    invoke-static {p2, p3, v0, v1}, Ll/᩺ۚᩴ;->O(JJ)J

    move-result-wide p2

    long-to-int p3, p2

    .line 330
    invoke-static {p0, p1, p3}, Ll/ۘ᩹ᩴ;->V(JI)Ll/ۘ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1357
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1347
    new-instance v0, Ll/᩷ۗᩴ;

    const/4 v1, 0x2

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

    .line 979
    invoke-virtual {p0, p1, p2, p3}, Ll/ۘ᩹ᩴ;->Y(JLl/ۘۗᩴ;)Ll/ۘ᩹ᩴ;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ll/ۘ᩹ᩴ;->Y(JLl/ۘۗᩴ;)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ll/ۘ᩹ᩴ;->Y(JLl/ۘۗᩴ;)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final G(Ll/ۤۗᩴ;)J
    .locals 2

    .line 596
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_4

    .line 597
    sget-object v0, Ll/۫᩶ᩴ;->a:[I

    move-object v1, p1

    check-cast v1, Ll/ᩴۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 601
    iget-wide v0, p0, Ll/ۘ᩹ᩴ;->a:J

    return-wide v0

    .line 603
    :cond_0
    new-instance v0, Ll/ۨۗᩴ;

    const-string v1, "Unsupported field: "

    .line 0
    invoke-static {v1, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 603
    throw v0

    .line 600
    :cond_1
    iget p1, p0, Ll/ۘ᩹ᩴ;->b:I

    const v0, 0xf4240

    div-int/2addr p1, v0

    goto :goto_0

    .line 599
    :cond_2
    iget p1, p0, Ll/ۘ᩹ᩴ;->b:I

    div-int/lit16 p1, p1, 0x3e8

    goto :goto_0

    .line 598
    :cond_3
    iget p1, p0, Ll/ۘ᩹ᩴ;->b:I

    :goto_0
    int-to-long v0, p1

    return-wide v0

    .line 605
    :cond_4
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 1

    .line 1056
    sget-object v0, Ll/ۛۗᩴ;->c:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_0

    .line 1057
    sget-object p1, Ll/ۡۗᩴ;->NANOS:Ll/ۡۗᩴ;

    return-object p1

    .line 1060
    :cond_0
    sget-object v0, Ll/ۛۗᩴ;->b:Ll/ۡ֨ᩴ;

    if-eq p1, v0, :cond_2

    sget-object v0, Ll/ۛۗᩴ;->a:Ll/ۡ֨ᩴ;

    if-eq p1, v0, :cond_2

    .line 1061
    sget-object v0, Ll/ۛۗᩴ;->e:Ll/ۡ֨ᩴ;

    if-eq p1, v0, :cond_2

    sget-object v0, Ll/ۛۗᩴ;->d:Ll/ۡ֨ᩴ;

    if-eq p1, v0, :cond_2

    .line 1062
    sget-object v0, Ll/ۛۗᩴ;->f:Ll/ۡ֨ᩴ;

    if-eq p1, v0, :cond_2

    sget-object v0, Ll/ۛۗᩴ;->g:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 1065
    :cond_1
    invoke-virtual {p1, p0}, Ll/ۡ֨ᩴ;->h(Ll/ۖۗᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final X(JJ)Ll/ۘ᩹ᩴ;
    .locals 5

    or-long v0, p1, p3

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-object p0

    .line 925
    :cond_0
    iget-wide v0, p0, Ll/ۘ᩹ᩴ;->a:J

    invoke-static {v0, v1, p1, p2}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    const-wide/32 v0, 0x3b9aca00

    .line 926
    div-long v2, p3, v0

    invoke-static {p1, p2, v2, v3}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    .line 927
    rem-long/2addr p3, v0

    .line 928
    iget v0, p0, Ll/ۘ᩹ᩴ;->b:I

    int-to-long v0, v0

    add-long/2addr v0, p3

    .line 929
    invoke-static {p1, p2, v0, v1}, Ll/ۘ᩹ᩴ;->ofEpochSecond(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final Y(JLl/ۘۗᩴ;)Ll/ۘ᩹ᩴ;
    .locals 7

    .line 851
    instance-of v0, p3, Ll/ۡۗᩴ;

    if-eqz v0, :cond_0

    .line 852
    sget-object v0, Ll/۫᩶ᩴ;->b:[I

    move-object v1, p3

    check-cast v1, Ll/ۡۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const-wide/16 v1, 0x3e8

    const-wide/32 v3, 0xf4240

    const-wide/16 v5, 0x0

    packed-switch v0, :pswitch_data_0

    .line 862
    new-instance p1, Ll/ۨۗᩴ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unsupported unit: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 862
    throw p1

    :pswitch_0
    const p3, 0x15180

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 879
    invoke-virtual {p0, p1, p2, v5, v6}, Ll/ۘ᩹ᩴ;->X(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_1
    const p3, 0xa8c0

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 879
    invoke-virtual {p0, p1, p2, v5, v6}, Ll/ۘ᩹ᩴ;->X(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_2
    const/16 p3, 0xe10

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 879
    invoke-virtual {p0, p1, p2, v5, v6}, Ll/ۘ᩹ᩴ;->X(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_3
    const/16 p3, 0x3c

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 879
    invoke-virtual {p0, p1, p2, v5, v6}, Ll/ۘ᩹ᩴ;->X(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2, v5, v6}, Ll/ۘ᩹ᩴ;->X(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 893
    :pswitch_5
    div-long v5, p1, v1

    rem-long/2addr p1, v1

    mul-long p1, p1, v3

    invoke-virtual {p0, v5, v6, p1, p2}, Ll/ۘ᩹ᩴ;->X(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 854
    :pswitch_6
    div-long v5, p1, v3

    rem-long/2addr p1, v3

    mul-long p1, p1, v1

    invoke-virtual {p0, v5, v6, p1, p2}, Ll/ۘ᩹ᩴ;->X(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 907
    :pswitch_7
    invoke-virtual {p0, v5, v6, p1, p2}, Ll/ۘ᩹ᩴ;->X(JJ)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 864
    :cond_0
    invoke-interface {p3, p0, p1, p2}, Ll/ۘۗᩴ;->m(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/ۘ᩹ᩴ;

    return-object p1

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

.method public final Z(Ll/ۘ᩹ᩴ;)J
    .locals 9

    .line 1169
    iget-wide v0, p1, Ll/ۘ᩹ᩴ;->a:J

    iget-wide v2, p0, Ll/ۘ᩹ᩴ;->a:J

    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide v0

    .line 1170
    iget p1, p1, Ll/ۘ᩹ᩴ;->b:I

    iget v2, p0, Ll/ۘ᩹ᩴ;->b:I

    sub-int/2addr p1, v2

    int-to-long v2, p1

    const-wide/16 v4, 0x1

    const-wide/16 v6, 0x0

    cmp-long p1, v0, v6

    if-lez p1, :cond_0

    cmp-long v8, v2, v6

    if-gez v8, :cond_0

    sub-long/2addr v0, v4

    return-wide v0

    :cond_0
    if-gez p1, :cond_1

    cmp-long p1, v2, v6

    if-lez p1, :cond_1

    add-long/2addr v0, v4

    :cond_1
    return-wide v0
.end method

.method public atZone(Ll/ۚ᩹ᩴ;)Ll/֨᩹ᩴ;
    .locals 0

    .line 1213
    invoke-static {p0, p1}, Ll/֨᩹ᩴ;->ofInstant(Ll/ۘ᩹ᩴ;Ll/ۚ᩹ᩴ;)Ll/֨᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;
    .locals 2

    .line 705
    instance-of v0, p3, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_5

    .line 706
    move-object v0, p3

    check-cast v0, Ll/ᩴۗᩴ;

    .line 707
    invoke-virtual {v0, p1, p2}, Ll/ᩴۗᩴ;->T(J)V

    .line 708
    sget-object v1, Ll/۫᩶ᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 718
    iget-wide v0, p0, Ll/ۘ᩹ᩴ;->a:J

    cmp-long p3, p1, v0

    if-eqz p3, :cond_4

    iget p3, p0, Ll/ۘ᩹ᩴ;->b:I

    invoke-static {p1, p2, p3}, Ll/ۘ᩹ᩴ;->V(JI)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 720
    :cond_0
    new-instance p1, Ll/ۨۗᩴ;

    const-string p2, "Unsupported field: "

    .line 0
    invoke-static {p2, p3}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 720
    throw p1

    :cond_1
    long-to-int p2, p1

    const p1, 0xf4240

    mul-int p2, p2, p1

    .line 711
    iget p1, p0, Ll/ۘ᩹ᩴ;->b:I

    if-eq p2, p1, :cond_4

    iget-wide v0, p0, Ll/ۘ᩹ᩴ;->a:J

    invoke-static {v0, v1, p2}, Ll/ۘ᩹ᩴ;->V(JI)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    :cond_2
    long-to-int p2, p1

    mul-int/lit16 p2, p2, 0x3e8

    .line 715
    iget p1, p0, Ll/ۘ᩹ᩴ;->b:I

    if-eq p2, p1, :cond_4

    iget-wide v0, p0, Ll/ۘ᩹ᩴ;->a:J

    invoke-static {v0, v1, p2}, Ll/ۘ᩹ᩴ;->V(JI)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 717
    :cond_3
    iget p3, p0, Ll/ۘ᩹ᩴ;->b:I

    int-to-long v0, p3

    cmp-long p3, p1, v0

    if-eqz p3, :cond_4

    iget-wide v0, p0, Ll/ۘ᩹ᩴ;->a:J

    long-to-int p2, p1

    invoke-static {v0, v1, p2}, Ll/ۘ᩹ᩴ;->V(JI)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1

    :cond_4
    return-object p0

    .line 722
    :cond_5
    invoke-interface {p3, p0, p1, p2}, Ll/ۤۗᩴ;->G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/ۘ᩹ᩴ;

    return-object p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 207
    check-cast p1, Ll/ۘ᩹ᩴ;

    invoke-virtual {p0, p1}, Ll/ۘ᩹ᩴ;->compareTo(Ll/ۘ᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public compareTo(Ll/ۘ᩹ᩴ;)I
    .locals 4

    .line 1255
    iget-wide v0, p0, Ll/ۘ᩹ᩴ;->a:J

    iget-wide v2, p1, Ll/ۘ᩹ᩴ;->a:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 1259
    :cond_0
    iget v0, p0, Ll/ۘ᩹ᩴ;->b:I

    iget p1, p1, Ll/ۘ᩹ᩴ;->b:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final bridge synthetic d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 207
    invoke-virtual {p0, p1, p2, p3}, Ll/ۘ᩹ᩴ;->Y(JLl/ۘۗᩴ;)Ll/ۘ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 1

    .line 458
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_0

    .line 459
    sget-object v0, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/ᩴۗᩴ;->MICRO_OF_SECOND:Ll/ᩴۗᩴ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/ᩴۗᩴ;->MILLI_OF_SECOND:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 461
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
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1302
    :cond_0
    instance-of v1, p1, Ll/ۘ᩹ᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 1303
    check-cast p1, Ll/ۘ᩹ᩴ;

    .line 1304
    iget-wide v3, p0, Ll/ۘ᩹ᩴ;->a:J

    iget-wide v5, p1, Ll/ۘ᩹ᩴ;->a:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget v1, p0, Ll/ۘ᩹ᩴ;->b:I

    iget p1, p1, Ll/ۘ᩹ᩴ;->b:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J
    .locals 7

    .line 1144
    invoke-static {p1}, Ll/ۘ᩹ᩴ;->W(Ll/ۖۗᩴ;)Ll/ۘ᩹ᩴ;

    move-result-object p1

    .line 1145
    instance-of v0, p2, Ll/ۡۗᩴ;

    if-eqz v0, :cond_0

    .line 1146
    move-object v0, p2

    check-cast v0, Ll/ۡۗᩴ;

    .line 1147
    sget-object v1, Ll/۫᩶ᩴ;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const-wide/32 v1, 0x3b9aca00

    packed-switch v0, :pswitch_data_0

    .line 1157
    new-instance p1, Ll/ۨۗᩴ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported unit: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 1157
    throw p1

    .line 1155
    :pswitch_0
    invoke-virtual {p0, p1}, Ll/ۘ᩹ᩴ;->Z(Ll/ۘ᩹ᩴ;)J

    move-result-wide p1

    const-wide/32 v0, 0x15180

    div-long/2addr p1, v0

    return-wide p1

    .line 1154
    :pswitch_1
    invoke-virtual {p0, p1}, Ll/ۘ᩹ᩴ;->Z(Ll/ۘ᩹ᩴ;)J

    move-result-wide p1

    const-wide/32 v0, 0xa8c0

    div-long/2addr p1, v0

    return-wide p1

    .line 1153
    :pswitch_2
    invoke-virtual {p0, p1}, Ll/ۘ᩹ᩴ;->Z(Ll/ۘ᩹ᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0xe10

    div-long/2addr p1, v0

    return-wide p1

    .line 1152
    :pswitch_3
    invoke-virtual {p0, p1}, Ll/ۘ᩹ᩴ;->Z(Ll/ۘ᩹ᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0x3c

    div-long/2addr p1, v0

    return-wide p1

    .line 1151
    :pswitch_4
    invoke-virtual {p0, p1}, Ll/ۘ᩹ᩴ;->Z(Ll/ۘ᩹ᩴ;)J

    move-result-wide p1

    return-wide p1

    .line 1150
    :pswitch_5
    invoke-virtual {p1}, Ll/ۘ᩹ᩴ;->toEpochMilli()J

    move-result-wide p1

    invoke-virtual {p0}, Ll/ۘ᩹ᩴ;->toEpochMilli()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide p1

    return-wide p1

    .line 1163
    :pswitch_6
    iget-wide v3, p1, Ll/ۘ᩹ᩴ;->a:J

    iget-wide v5, p0, Ll/ۘ᩹ᩴ;->a:J

    invoke-static {v3, v4, v5, v6}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide v3

    .line 1164
    invoke-static {v3, v4, v1, v2}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v0

    .line 1165
    iget p1, p1, Ll/ۘ᩹ᩴ;->b:I

    iget p2, p0, Ll/ۘ᩹ᩴ;->b:I

    sub-int/2addr p1, p2

    int-to-long p1, p1

    invoke-static {v0, v1, p1, p2}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    const-wide/16 v0, 0x3e8

    .line 1149
    div-long/2addr p1, v0

    return-wide p1

    .line 1163
    :pswitch_7
    iget-wide v3, p1, Ll/ۘ᩹ᩴ;->a:J

    iget-wide v5, p0, Ll/ۘ᩹ᩴ;->a:J

    invoke-static {v3, v4, v5, v6}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide v3

    .line 1164
    invoke-static {v3, v4, v1, v2}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v0

    .line 1165
    iget p1, p1, Ll/ۘ᩹ᩴ;->b:I

    iget p2, p0, Ll/ۘ᩹ᩴ;->b:I

    sub-int/2addr p1, p2

    int-to-long p1, p1

    invoke-static {v0, v1, p1, p2}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    return-wide p1

    .line 1159
    :cond_0
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

.method public getEpochSecond()J
    .locals 2

    .line 619
    iget-wide v0, p0, Ll/ۘ᩹ᩴ;->a:J

    return-wide v0
.end method

.method public getNano()I
    .locals 1

    .line 632
    iget v0, p0, Ll/ۘ᩹ᩴ;->b:I

    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1317
    iget-wide v0, p0, Ll/ۘ᩹ᩴ;->a:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    iget v0, p0, Ll/ۘ᩹ᩴ;->b:I

    mul-int/lit8 v0, v0, 0x33

    add-int/2addr v0, v1

    return v0
.end method

.method public isAfter(Ll/ۘ᩹ᩴ;)Z
    .locals 0

    .line 1272
    invoke-virtual {p0, p1}, Ll/ۘ᩹ᩴ;->compareTo(Ll/ۘ᩹ᩴ;)I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final l(Ll/ۤۗᩴ;)I
    .locals 4

    .line 559
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_4

    .line 560
    sget-object v0, Ll/۫᩶ᩴ;->a:[I

    move-object v1, p1

    check-cast v1, Ll/ᩴۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 564
    :cond_0
    sget-object v0, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    iget-wide v1, p0, Ll/ۘ᩹ᩴ;->a:J

    .line 669
    iget-object v3, v0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {v3, v1, v2, v0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    .line 566
    :goto_0
    new-instance v0, Ll/ۨۗᩴ;

    const-string v1, "Unsupported field: "

    .line 0
    invoke-static {v1, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 566
    throw v0

    .line 563
    :cond_1
    iget p1, p0, Ll/ۘ᩹ᩴ;->b:I

    const v0, 0xf4240

    div-int/2addr p1, v0

    return p1

    .line 562
    :cond_2
    iget p1, p0, Ll/ۘ᩹ᩴ;->b:I

    div-int/lit16 p1, p1, 0x3e8

    return p1

    .line 561
    :cond_3
    iget p1, p0, Ll/ۘ᩹ᩴ;->b:I

    return p1

    .line 527
    :cond_4
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object v0

    .line 568
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final m(Ll/ᩴ᩹ᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 1592
    invoke-static {p1, p0}, Ll/᩺ۚᩴ;->a(Ll/۬᩹ᩴ;Ll/ܺۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    .line 656
    check-cast p1, Ll/ۘ᩹ᩴ;

    return-object p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 0

    .line 527
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 3

    .line 1095
    sget-object v0, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    iget-wide v1, p0, Ll/ۘ᩹ᩴ;->a:J

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    sget-object v0, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    iget v1, p0, Ll/ۘ᩹ᩴ;->b:I

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public toEpochMilli()J
    .locals 7

    .line 1232
    iget-wide v0, p0, Ll/ۘ᩹ᩴ;->a:J

    const-wide/16 v2, 0x0

    const v4, 0xf4240

    const/16 v5, 0x3e8

    cmp-long v6, v0, v2

    if-gez v6, :cond_0

    iget v2, p0, Ll/ۘ᩹ᩴ;->b:I

    if-lez v2, :cond_0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    int-to-long v2, v5

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v0

    .line 1234
    iget v2, p0, Ll/ۘ᩹ᩴ;->b:I

    div-int/2addr v2, v4

    sub-int/2addr v2, v5

    int-to-long v2, v2

    .line 1235
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_0
    int-to-long v2, v5

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v0

    .line 1238
    iget v2, p0, Ll/ۘ᩹ᩴ;->b:I

    div-int/2addr v2, v4

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1330
    sget-object v0, Ll/ۛ᩶ᩴ;->h:Ll/ۛ᩶ᩴ;

    invoke-virtual {v0, p0}, Ll/ۛ᩶ᩴ;->format(Ll/ۖۗᩴ;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
