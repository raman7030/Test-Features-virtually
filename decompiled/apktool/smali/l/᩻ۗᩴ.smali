.class public final Ll/᩻ۗᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܺۗᩴ;
.implements Ll/ۗۗᩴ;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic c:I = 0x0

.field public static final serialVersionUID:J = 0x64d0affdfec1386cL


# instance fields
.field public final a:Ll/۟ۙᩴ;

.field public final b:Ll/ᩳ۬ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 128
    sget-object v0, Ll/۟ۙᩴ;->e:Ll/۟ۙᩴ;

    sget-object v1, Ll/ᩳ۬ᩴ;->h:Ll/ᩳ۬ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    new-instance v2, Ll/᩻ۗᩴ;

    invoke-direct {v2, v0, v1}, Ll/᩻ۗᩴ;-><init>(Ll/۟ۙᩴ;Ll/ᩳ۬ᩴ;)V

    .line 136
    sget-object v0, Ll/۟ۙᩴ;->f:Ll/۟ۙᩴ;

    sget-object v1, Ll/ᩳ۬ᩴ;->g:Ll/ᩳ۬ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    new-instance v2, Ll/᩻ۗᩴ;

    invoke-direct {v2, v0, v1}, Ll/᩻ۗᩴ;-><init>(Ll/۟ۙᩴ;Ll/ᩳ۬ᩴ;)V

    return-void
.end method

.method public constructor <init>(Ll/۟ۙᩴ;Ll/ᩳ۬ᩴ;)V
    .locals 1

    .line 337
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "time"

    .line 338
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ۙᩴ;

    iput-object p1, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    const-string p1, "offset"

    .line 339
    invoke-static {p2, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳ۬ᩴ;

    iput-object p1, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1424
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1414
    new-instance v0, Ll/᩷ۗᩴ;

    const/16 v1, 0x9

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

    .line 993
    invoke-virtual {p0, p1, p2, p3}, Ll/᩻ۗᩴ;->V(JLl/ۘۗᩴ;)Ll/᩻ۗᩴ;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ll/᩻ۗᩴ;->V(JLl/ۘۗᩴ;)Ll/᩻ۗᩴ;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ll/᩻ۗᩴ;->V(JLl/ۘۗᩴ;)Ll/᩻ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final G(Ll/ۤۗᩴ;)J
    .locals 2

    .line 530
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 531
    sget-object v0, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    .line 532
    iget-object p1, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    .line 474
    iget p1, p1, Ll/ᩳ۬ᩴ;->b:I

    int-to-long v0, p1

    return-wide v0

    .line 534
    :cond_0
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 536
    :cond_1
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 3

    .line 1079
    sget-object v0, Ll/ۛۗᩴ;->d:Ll/ۡ֨ᩴ;

    if-eq p1, v0, :cond_7

    sget-object v0, Ll/ۛۗᩴ;->e:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_0

    goto :goto_2

    .line 1081
    :cond_0
    sget-object v0, Ll/ۛۗᩴ;->a:Ll/ۡ֨ᩴ;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v2, Ll/ۛۗᩴ;->b:Ll/ۡ֨ᩴ;

    if-ne p1, v2, :cond_2

    const/4 v1, 0x1

    :cond_2
    or-int/2addr v0, v1

    if-nez v0, :cond_6

    sget-object v0, Ll/ۛۗᩴ;->f:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_3

    goto :goto_1

    .line 1083
    :cond_3
    sget-object v0, Ll/ۛۗᩴ;->g:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_4

    .line 1084
    iget-object p1, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    return-object p1

    .line 1085
    :cond_4
    sget-object v0, Ll/ۛۗᩴ;->c:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_5

    .line 1086
    sget-object p1, Ll/ۡۗᩴ;->NANOS:Ll/ۡۗᩴ;

    return-object p1

    .line 1090
    :cond_5
    invoke-virtual {p1, p0}, Ll/ۡ֨ᩴ;->h(Ll/ۖۗᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return-object p1

    .line 1080
    :cond_7
    :goto_2
    iget-object p1, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    return-object p1
.end method

.method public final V(JLl/ۘۗᩴ;)Ll/᩻ۗᩴ;
    .locals 1

    .line 879
    instance-of v0, p3, Ll/ۡۗᩴ;

    if-eqz v0, :cond_0

    .line 880
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/۟ۙᩴ;->b0(JLl/ۘۗᩴ;)Ll/۟ۙᩴ;

    move-result-object p1

    iget-object p2, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-virtual {p0, p1, p2}, Ll/᩻ۗᩴ;->X(Ll/۟ۙᩴ;Ll/ᩳ۬ᩴ;)Ll/᩻ۗᩴ;

    move-result-object p1

    return-object p1

    .line 882
    :cond_0
    invoke-interface {p3, p0, p1, p2}, Ll/ۘۗᩴ;->m(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/᩻ۗᩴ;

    return-object p1
.end method

.method public final W()J
    .locals 6

    .line 1230
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v0}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v0

    .line 1231
    iget-object v2, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    .line 474
    iget v2, v2, Ll/ᩳ۬ᩴ;->b:I

    int-to-long v2, v2

    const-wide/32 v4, 0x3b9aca00

    mul-long v2, v2, v4

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final X(Ll/۟ۙᩴ;Ll/ᩳ۬ᩴ;)Ll/᩻ۗᩴ;
    .locals 1

    .line 349
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-virtual {v0, p2}, Ll/ᩳ۬ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 352
    :cond_0
    new-instance v0, Ll/᩻ۗᩴ;

    invoke-direct {v0, p1, p2}, Ll/᩻ۗᩴ;-><init>(Ll/۟ۙᩴ;Ll/ᩳ۬ᩴ;)V

    return-object v0
.end method

.method public final c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;
    .locals 2

    .line 728
    instance-of v0, p3, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 729
    sget-object v0, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    if-ne p3, v0, :cond_0

    .line 730
    check-cast p3, Ll/ᩴۗᩴ;

    .line 731
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    .line 669
    iget-object v1, p3, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {v1, p1, p2, p3}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p1

    .line 731
    invoke-static {p1}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ll/᩻ۗᩴ;->X(Ll/۟ۙᩴ;Ll/ᩳ۬ᩴ;)Ll/᩻ۗᩴ;

    move-result-object p1

    return-object p1

    .line 733
    :cond_0
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/۟ۙᩴ;->j0(JLl/ۤۗᩴ;)Ll/۟ۙᩴ;

    move-result-object p1

    iget-object p2, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-virtual {p0, p1, p2}, Ll/᩻ۗᩴ;->X(Ll/۟ۙᩴ;Ll/ᩳ۬ᩴ;)Ll/᩻ۗᩴ;

    move-result-object p1

    return-object p1

    .line 735
    :cond_1
    invoke-interface {p3, p0, p1, p2}, Ll/ۤۗᩴ;->G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/᩻ۗᩴ;

    return-object p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 118
    check-cast p1, Ll/᩻ۗᩴ;

    .line 1286
    iget-object v0, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    iget-object v1, p1, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-virtual {v0, v1}, Ll/ᩳ۬ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1287
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    iget-object p1, p1, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->V(Ll/۟ۙᩴ;)I

    move-result p1

    return p1

    .line 1289
    :cond_0
    invoke-virtual {p0}, Ll/᩻ۗᩴ;->W()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/᩻ۗᩴ;->W()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-nez v0, :cond_1

    .line 1291
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    iget-object p1, p1, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->V(Ll/۟ۙᩴ;)I

    move-result p1

    return p1

    :cond_1
    return v0
.end method

.method public final bridge synthetic d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 118
    invoke-virtual {p0, p1, p2, p3}, Ll/᩻ۗᩴ;->V(JLl/ۘۗᩴ;)Ll/᩻ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 1

    .line 396
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_0

    .line 397
    move-object v0, p1

    check-cast v0, Ll/ᩴۗᩴ;

    invoke-virtual {v0}, Ll/ᩴۗᩴ;->V()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 399
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
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1361
    :cond_0
    instance-of v1, p1, Ll/᩻ۗᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 1362
    check-cast p1, Ll/᩻ۗᩴ;

    .line 1363
    iget-object v1, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    iget-object v3, p1, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v1, v3}, Ll/۟ۙᩴ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    iget-object p1, p1, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-virtual {v1, p1}, Ll/ᩳ۬ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J
    .locals 4

    .line 287
    instance-of v0, p1, Ll/᩻ۗᩴ;

    if-eqz v0, :cond_0

    .line 288
    check-cast p1, Ll/᩻ۗᩴ;

    goto :goto_0

    .line 291
    :cond_0
    :try_start_0
    invoke-static {p1}, Ll/۟ۙᩴ;->X(Ll/ۖۗᩴ;)Ll/۟ۙᩴ;

    move-result-object v0

    .line 292
    invoke-static {p1}, Ll/ᩳ۬ᩴ;->b0(Ll/ۖۗᩴ;)Ll/ᩳ۬ᩴ;

    move-result-object v1

    .line 293
    new-instance v2, Ll/᩻ۗᩴ;

    invoke-direct {v2, v0, v1}, Ll/᩻ۗᩴ;-><init>(Ll/۟ۙᩴ;Ll/ᩳ۬ᩴ;)V
    :try_end_0
    .catch Ll/ܺ᩹ᩴ; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v2

    .line 1179
    :goto_0
    instance-of v0, p2, Ll/ۡۗᩴ;

    if-eqz v0, :cond_1

    .line 1180
    invoke-virtual {p1}, Ll/᩻ۗᩴ;->W()J

    move-result-wide v0

    invoke-virtual {p0}, Ll/᩻ۗᩴ;->W()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 1181
    sget-object p1, Ll/ܳۗᩴ;->a:[I

    move-object v2, p2

    check-cast v2, Ll/ۡۗᩴ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget p1, p1, v2

    packed-switch p1, :pswitch_data_0

    .line 1190
    new-instance p1, Ll/ۨۗᩴ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported unit: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 1190
    throw p1

    :pswitch_0
    const-wide p1, 0x274a48a78000L

    .line 1188
    div-long/2addr v0, p1

    return-wide v0

    :pswitch_1
    const-wide p1, 0x34630b8a000L

    .line 1187
    div-long/2addr v0, p1

    return-wide v0

    :pswitch_2
    const-wide p1, 0xdf8475800L

    .line 1186
    div-long/2addr v0, p1

    return-wide v0

    :pswitch_3
    const-wide/32 p1, 0x3b9aca00

    .line 1185
    div-long/2addr v0, p1

    return-wide v0

    :pswitch_4
    const-wide/32 p1, 0xf4240

    .line 1184
    div-long/2addr v0, p1

    return-wide v0

    :pswitch_5
    const-wide/16 p1, 0x3e8

    .line 1183
    div-long/2addr v0, p1

    :pswitch_6
    return-wide v0

    .line 1192
    :cond_1
    invoke-interface {p2, p0, p1}, Ll/ۘۗᩴ;->l(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)J

    move-result-wide p1

    return-wide p1

    :catch_0
    move-exception p2

    .line 295
    new-instance v0, Ll/ܺ᩹ᩴ;

    .line 296
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to obtain OffsetTime from TemporalAccessor: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " of type "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 98
    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 296
    throw v0

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

    .line 1375
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v0}, Ll/۟ۙᩴ;->hashCode()I

    move-result v0

    iget-object v1, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    .line 736
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final l(Ll/ۤۗᩴ;)I
    .locals 0

    .line 502
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->a(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final m(Ll/ᩴ᩹ᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 1592
    invoke-static {p1, p0}, Ll/᩺ۚᩴ;->a(Ll/۬᩹ᩴ;Ll/ܺۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    .line 688
    check-cast p1, Ll/᩻ۗᩴ;

    return-object p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 1

    .line 464
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_1

    .line 465
    sget-object v0, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    .line 466
    check-cast p1, Ll/ᩴۗᩴ;

    .line 669
    iget-object p1, p1, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    return-object p1

    .line 468
    :cond_0
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    invoke-static {v0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 470
    :cond_1
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->m(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 3

    .line 1121
    sget-object v0, Ll/ᩴۗᩴ;->NANO_OF_DAY:Ll/ᩴۗᩴ;

    iget-object v1, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    .line 1122
    invoke-virtual {v1}, Ll/۟ۙᩴ;->h0()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    sget-object v0, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    iget-object v1, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    .line 474
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    int-to-long v1, v1

    .line 1123
    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1397
    iget-object v0, p0, Ll/᩻ۗᩴ;->a:Ll/۟ۙᩴ;

    invoke-virtual {v0}, Ll/۟ۙᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ۗᩴ;->b:Ll/ᩳ۬ᩴ;

    .line 747
    iget-object v1, v1, Ll/ᩳ۬ᩴ;->c:Ljava/lang/String;

    .line 1397
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
