.class public final Ll/֫۬ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܺۗᩴ;
.implements Ll/ۗۗᩴ;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic b:I = 0x0

.field public static final serialVersionUID:J = -0x51d949b44ef9efL


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 154
    new-instance v0, Ll/ۙۙᩴ;

    invoke-direct {v0}, Ll/ۙۙᩴ;-><init>()V

    sget-object v1, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    const/16 v2, 0xa

    sget-object v3, Ll/᩻ۙᩴ;->EXCEEDS_PAD:Ll/᩻ۙᩴ;

    const/4 v4, 0x4

    .line 155
    invoke-virtual {v0, v1, v4, v2, v3}, Ll/ۙۙᩴ;->m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    .line 2203
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    .line 2224
    sget-object v2, Ll/ܿۙᩴ;->SMART:Ll/ܿۙᩴ;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Ll/ۙۙᩴ;->q(Ljava/util/Locale;Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 325
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 326
    iput p1, p0, Ll/֫۬ᩴ;->a:I

    return-void
.end method

.method public static V(I)Ll/֫۬ᩴ;
    .locals 3

    .line 226
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Ll/ᩴۗᩴ;->T(J)V

    .line 227
    new-instance v0, Ll/֫۬ᩴ;

    invoke-direct {v0, p0}, Ll/֫۬ᩴ;-><init>(I)V

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1111
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1101
    new-instance v0, Ll/᩷ۗᩴ;

    const/16 v1, 0xb

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

    .line 785
    invoke-virtual {p0, p1, p2, p3}, Ll/֫۬ᩴ;->W(JLl/ۘۗᩴ;)Ll/֫۬ᩴ;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ll/֫۬ᩴ;->W(JLl/ۘۗᩴ;)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ll/֫۬ᩴ;->W(JLl/ۘۗᩴ;)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final G(Ll/ۤۗᩴ;)J
    .locals 3

    .line 497
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_5

    .line 498
    sget-object v0, Ll/ۢۗᩴ;->a:[I

    move-object v1, p1

    check-cast v1, Ll/ᩴۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    .line 501
    iget p1, p0, Ll/֫۬ᩴ;->a:I

    if-ge p1, v1, :cond_0

    const/4 v1, 0x0

    :cond_0
    int-to-long v0, v1

    return-wide v0

    .line 503
    :cond_1
    new-instance v0, Ll/ۨۗᩴ;

    const-string v1, "Unsupported field: "

    .line 0
    invoke-static {v1, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 503
    throw v0

    .line 500
    :cond_2
    iget p1, p0, Ll/֫۬ᩴ;->a:I

    int-to-long v0, p1

    return-wide v0

    .line 499
    :cond_3
    iget p1, p0, Ll/֫۬ᩴ;->a:I

    if-ge p1, v1, :cond_4

    rsub-int/lit8 p1, p1, 0x1

    :cond_4
    int-to-long v0, p1

    return-wide v0

    .line 505
    :cond_5
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 1

    .line 823
    sget-object v0, Ll/ۛۗᩴ;->b:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_0

    .line 824
    sget-object p1, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    return-object p1

    .line 825
    :cond_0
    sget-object v0, Ll/ۛۗᩴ;->c:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_1

    .line 826
    sget-object p1, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    return-object p1

    .line 828
    :cond_1
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->c(Ll/ۖۗᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final W(JLl/ۘۗᩴ;)Ll/֫۬ᩴ;
    .locals 2

    .line 709
    instance-of v0, p3, Ll/ۡۗᩴ;

    if-eqz v0, :cond_5

    .line 710
    sget-object v0, Ll/ۢۗᩴ;->b:[I

    move-object v1, p3

    check-cast v1, Ll/ۡۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 715
    sget-object p3, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-virtual {p0, p3}, Ll/֫۬ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3}, Ll/֫۬ᩴ;->Y(JLl/ۤۗᩴ;)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1

    .line 717
    :cond_0
    new-instance p1, Ll/ۨۗᩴ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unsupported unit: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 717
    throw p1

    :cond_1
    const/16 p3, 0x3e8

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 714
    invoke-virtual {p0, p1, p2}, Ll/֫۬ᩴ;->X(J)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 p3, 0x64

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 713
    invoke-virtual {p0, p1, p2}, Ll/֫۬ᩴ;->X(J)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1

    :cond_3
    const/16 p3, 0xa

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 712
    invoke-virtual {p0, p1, p2}, Ll/֫۬ᩴ;->X(J)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1

    .line 711
    :cond_4
    invoke-virtual {p0, p1, p2}, Ll/֫۬ᩴ;->X(J)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1

    .line 719
    :cond_5
    invoke-interface {p3, p0, p1, p2}, Ll/ۘۗᩴ;->m(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/֫۬ᩴ;

    return-object p1
.end method

.method public final X(J)Ll/֫۬ᩴ;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-object p0

    .line 735
    :cond_0
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    iget v1, p0, Ll/֫۬ᩴ;->a:I

    int-to-long v1, v1

    add-long/2addr v1, p1

    .line 669
    iget-object p1, v0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {p1, v1, v2, v0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p1

    .line 735
    invoke-static {p1}, Ll/֫۬ᩴ;->V(I)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final Y(JLl/ۤۗᩴ;)Ll/֫۬ᩴ;
    .locals 4

    .line 620
    instance-of v0, p3, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_5

    .line 621
    move-object v0, p3

    check-cast v0, Ll/ᩴۗᩴ;

    .line 622
    invoke-virtual {v0, p1, p2}, Ll/ᩴۗᩴ;->T(J)V

    .line 623
    sget-object v1, Ll/ۢۗᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    .line 626
    sget-object p3, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-virtual {p0, p3}, Ll/֫۬ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v2

    cmp-long p3, v2, p1

    if-nez p3, :cond_0

    return-object p0

    :cond_0
    iget p1, p0, Ll/֫۬ᩴ;->a:I

    sub-int/2addr v1, p1

    invoke-static {v1}, Ll/֫۬ᩴ;->V(I)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1

    .line 628
    :cond_1
    new-instance p1, Ll/ۨۗᩴ;

    const-string p2, "Unsupported field: "

    .line 0
    invoke-static {p2, p3}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 628
    throw p1

    :cond_2
    long-to-int p2, p1

    .line 625
    invoke-static {p2}, Ll/֫۬ᩴ;->V(I)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1

    .line 624
    :cond_3
    iget p3, p0, Ll/֫۬ᩴ;->a:I

    if-ge p3, v1, :cond_4

    const-wide/16 v0, 0x1

    sub-long p1, v0, p1

    :cond_4
    long-to-int p2, p1

    invoke-static {p2}, Ll/֫۬ᩴ;->V(I)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1

    .line 630
    :cond_5
    invoke-interface {p3, p0, p1, p2}, Ll/ۤۗᩴ;->G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/֫۬ᩴ;

    return-object p1
.end method

.method public final bridge synthetic c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 135
    invoke-virtual {p0, p1, p2, p3}, Ll/֫۬ᩴ;->Y(JLl/ۤۗᩴ;)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 135
    check-cast p1, Ll/֫۬ᩴ;

    .line 1024
    iget v0, p0, Ll/֫۬ᩴ;->a:I

    iget p1, p1, Ll/֫۬ᩴ;->a:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final bridge synthetic d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 135
    invoke-virtual {p0, p1, p2, p3}, Ll/֫۬ᩴ;->W(JLl/ۘۗᩴ;)Ll/֫۬ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 1

    .line 369
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_0

    .line 370
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/ᩴۗᩴ;->YEAR_OF_ERA:Ll/ᩴۗᩴ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 372
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

    .line 1061
    :cond_0
    instance-of v1, p1, Ll/֫۬ᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 1062
    iget v1, p0, Ll/֫۬ᩴ;->a:I

    check-cast p1, Ll/֫۬ᩴ;

    iget p1, p1, Ll/֫۬ᩴ;->a:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J
    .locals 4

    .line 250
    instance-of v0, p1, Ll/֫۬ᩴ;

    if-eqz v0, :cond_0

    .line 251
    check-cast p1, Ll/֫۬ᩴ;

    goto :goto_0

    :cond_0
    const-string v0, "temporal"

    .line 253
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 255
    :try_start_0
    sget-object v0, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    invoke-static {p1}, Ll/ܺ᩶ᩴ;->r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۙ᩹ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 256
    invoke-static {p1}, Ll/ᩴ᩹ᩴ;->X(Ll/ۖۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    .line 258
    :cond_1
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v0

    invoke-static {v0}, Ll/֫۬ᩴ;->V(I)Ll/֫۬ᩴ;

    move-result-object p1
    :try_end_0
    .catch Ll/ܺ᩹ᩴ; {:try_start_0 .. :try_end_0} :catch_0

    .line 915
    :goto_0
    instance-of v0, p2, Ll/ۡۗᩴ;

    if-eqz v0, :cond_7

    .line 916
    iget v0, p1, Ll/֫۬ᩴ;->a:I

    int-to-long v0, v0

    iget v2, p0, Ll/֫۬ᩴ;->a:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    .line 917
    sget-object v2, Ll/ۢۗᩴ;->b:[I

    move-object v3, p2

    check-cast v3, Ll/ۡۗᩴ;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_6

    const/4 v3, 0x2

    if-eq v2, v3, :cond_5

    const/4 v3, 0x3

    if-eq v2, v3, :cond_4

    const/4 v3, 0x4

    if-eq v2, v3, :cond_3

    const/4 v0, 0x5

    if-ne v2, v0, :cond_2

    .line 922
    sget-object p2, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-virtual {p1, p2}, Ll/֫۬ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    invoke-virtual {p0, p2}, Ll/֫۬ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide p1

    sub-long/2addr v0, p1

    return-wide v0

    .line 924
    :cond_2
    new-instance p1, Ll/ۨۗᩴ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported unit: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 924
    throw p1

    :cond_3
    const-wide/16 p1, 0x3e8

    .line 921
    div-long/2addr v0, p1

    return-wide v0

    :cond_4
    const-wide/16 p1, 0x64

    .line 920
    div-long/2addr v0, p1

    return-wide v0

    :cond_5
    const-wide/16 p1, 0xa

    .line 919
    div-long/2addr v0, p1

    :cond_6
    return-wide v0

    .line 926
    :cond_7
    invoke-interface {p2, p0, p1}, Ll/ۘۗᩴ;->l(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)J

    move-result-wide p1

    return-wide p1

    :catch_0
    move-exception p2

    .line 260
    new-instance v0, Ll/ܺ᩹ᩴ;

    .line 261
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to obtain Year from TemporalAccessor: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " of type "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 98
    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 261
    throw v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1074
    iget v0, p0, Ll/֫۬ᩴ;->a:I

    return v0
.end method

.method public final l(Ll/ۤۗᩴ;)I
    .locals 3

    .line 469
    invoke-virtual {p0, p1}, Ll/֫۬ᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object v0

    invoke-virtual {p0, p1}, Ll/֫۬ᩴ;->G(Ll/ۤۗᩴ;)J

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

    .line 574
    check-cast p1, Ll/֫۬ᩴ;

    return-object p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 4

    .line 435
    sget-object v0, Ll/ᩴۗᩴ;->YEAR_OF_ERA:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_1

    .line 436
    iget p1, p0, Ll/֫۬ᩴ;->a:I

    const-wide/16 v0, 0x1

    if-gtz p1, :cond_0

    const-wide/32 v2, 0x3b9aca00

    goto :goto_0

    :cond_0
    const-wide/32 v2, 0x3b9ac9ff

    :goto_0
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 438
    :cond_1
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 3

    .line 859
    invoke-static {p1}, Ll/ܺ᩶ᩴ;->r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;

    move-result-object v0

    sget-object v1, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    invoke-interface {v0, v1}, Ll/ۖ᩶ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 862
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    iget v1, p0, Ll/֫۬ᩴ;->a:I

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1

    .line 860
    :cond_0
    new-instance p1, Ll/ܺ᩹ᩴ;

    const-string v0, "Adjustment only supported on ISO date-time"

    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1085
    iget v0, p0, Ll/֫۬ᩴ;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
