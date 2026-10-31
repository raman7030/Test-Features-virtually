.class public final Ll/ܰۗᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ۤۗᩴ;


# static fields
.field public static final f:Ll/᩺ۗᩴ;

.field public static final g:Ll/᩺ۗᩴ;

.field public static final h:Ll/᩺ۗᩴ;

.field public static final i:Ll/᩺ۗᩴ;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ll/۟ۗᩴ;

.field public final c:Ll/ۘۗᩴ;

.field public final d:Ll/ۘۗᩴ;

.field public final e:Ll/᩺ۗᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    const-wide/16 v0, 0x1

    const-wide/16 v2, 0x7

    .line 768
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object v0

    sput-object v0, Ll/ܰۗᩴ;->f:Ll/᩺ۗᩴ;

    const-wide/16 v3, 0x4

    const-wide/16 v5, 0x6

    const-wide/16 v7, 0x0

    move-wide v1, v7

    .line 769
    invoke-static/range {v1 .. v6}, Ll/᩺ۗᩴ;->g(JJJ)Ll/᩺ۗᩴ;

    move-result-object v0

    sput-object v0, Ll/ܰۗᩴ;->g:Ll/᩺ۗᩴ;

    const-wide/16 v3, 0x34

    const-wide/16 v11, 0x36

    move-wide v9, v3

    .line 770
    invoke-static/range {v7 .. v12}, Ll/᩺ۗᩴ;->g(JJJ)Ll/᩺ۗᩴ;

    move-result-object v0

    sput-object v0, Ll/ܰۗᩴ;->h:Ll/᩺ۗᩴ;

    const-wide/16 v5, 0x35

    const-wide/16 v1, 0x1

    .line 147
    invoke-static/range {v1 .. v6}, Ll/᩺ۗᩴ;->g(JJJ)Ll/᩺ۗᩴ;

    move-result-object v0

    .line 771
    sput-object v0, Ll/ܰۗᩴ;->i:Ll/᩺ۗᩴ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/۟ۗᩴ;Ll/ۘۗᩴ;Ll/ۘۗᩴ;Ll/᩺ۗᩴ;)V
    .locals 0

    .line 760
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 761
    iput-object p1, p0, Ll/ܰۗᩴ;->a:Ljava/lang/String;

    .line 762
    iput-object p2, p0, Ll/ܰۗᩴ;->b:Ll/۟ۗᩴ;

    .line 763
    iput-object p3, p0, Ll/ܰۗᩴ;->c:Ll/ۘۗᩴ;

    .line 764
    iput-object p4, p0, Ll/ܰۗᩴ;->d:Ll/ۘۗᩴ;

    .line 765
    iput-object p5, p0, Ll/ܰۗᩴ;->e:Ll/᩺ۗᩴ;

    return-void
.end method

.method public static a(II)I
    .locals 0

    add-int/lit8 p0, p0, 0x7

    add-int/lit8 p1, p1, -0x1

    add-int/2addr p1, p0

    .line 904
    div-int/lit8 p1, p1, 0x7

    return p1
.end method


# virtual methods
.method public final C(Ll/ۖۗᩴ;)J
    .locals 3

    .line 775
    sget-object v0, Ll/ۡۗᩴ;->WEEKS:Ll/ۡۗᩴ;

    iget-object v1, p0, Ll/ܰۗᩴ;->d:Ll/ۘۗᩴ;

    if-ne v1, v0, :cond_0

    .line 776
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result p1

    goto :goto_0

    .line 777
    :cond_0
    sget-object v0, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    if-ne v1, v0, :cond_1

    .line 802
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v0

    .line 803
    sget-object v1, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    invoke-interface {p1, v1}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result p1

    .line 804
    invoke-virtual {p0, p1, v0}, Ll/ܰۗᩴ;->h(II)I

    move-result v0

    .line 805
    invoke-static {v0, p1}, Ll/ܰۗᩴ;->a(II)I

    move-result p1

    goto :goto_0

    .line 779
    :cond_1
    sget-object v0, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    if-ne v1, v0, :cond_2

    .line 809
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v0

    .line 810
    sget-object v1, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v1}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result p1

    .line 811
    invoke-virtual {p0, p1, v0}, Ll/ܰۗᩴ;->h(II)I

    move-result v0

    .line 812
    invoke-static {v0, p1}, Ll/ܰۗᩴ;->a(II)I

    move-result p1

    goto :goto_0

    .line 781
    :cond_2
    sget-object v0, Ll/۟ۗᩴ;->h:Ll/᩸ۗᩴ;

    if-ne v1, v0, :cond_3

    .line 782
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->d(Ll/ۖۗᩴ;)I

    move-result p1

    goto :goto_0

    .line 783
    :cond_3
    sget-object v0, Ll/ۡۗᩴ;->FOREVER:Ll/ۡۗᩴ;

    if-ne v1, v0, :cond_4

    .line 784
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->c(Ll/ۖۗᩴ;)I

    move-result p1

    :goto_0
    int-to-long v0, p1

    return-wide v0

    .line 786
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "unreachable, rangeUnit: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", this: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;
    .locals 4

    .line 911
    iget-object v0, p0, Ll/ܰۗᩴ;->e:Ll/᩺ۗᩴ;

    invoke-virtual {v0, p2, p3, p0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v0

    .line 912
    invoke-interface {p1, p0}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p1

    .line 917
    :cond_0
    iget-object v2, p0, Ll/ܰۗᩴ;->d:Ll/ۘۗᩴ;

    sget-object v3, Ll/ۡۗᩴ;->FOREVER:Ll/ۡۗᩴ;

    if-ne v2, v3, :cond_1

    .line 0
    iget-object v0, p0, Ll/ܰۗᩴ;->b:Ll/۟ۗᩴ;

    iget-object v1, v0, Ll/۟ۗᩴ;->c:Ll/ܰۗᩴ;

    .line 920
    invoke-interface {p1, v1}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v1

    .line 0
    iget-object v0, v0, Ll/۟ۗᩴ;->e:Ll/ܰۗᩴ;

    .line 921
    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v0

    .line 922
    invoke-static {p1}, Ll/ܺ᩶ᩴ;->r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;

    move-result-object p1

    long-to-int p3, p2

    invoke-virtual {p0, p1, p3, v0, v1}, Ll/ܰۗᩴ;->e(Ll/ۖ᩶ᩴ;III)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    :cond_1
    sub-int/2addr v0, v1

    int-to-long p2, v0

    .line 925
    iget-object v0, p0, Ll/ܰۗᩴ;->c:Ll/ۘۗᩴ;

    invoke-interface {p1, p2, p3, v0}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll/ۖۗᩴ;)I
    .locals 2

    .line 791
    iget-object v0, p0, Ll/ܰۗᩴ;->b:Ll/۟ۗᩴ;

    .line 407
    iget-object v0, v0, Ll/۟ۗᩴ;->a:Ll/᩸᩹ᩴ;

    .line 791
    invoke-virtual {v0}, Ll/᩸᩹ᩴ;->getValue()I

    move-result v0

    .line 792
    sget-object v1, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    invoke-interface {p1, v1}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result p1

    sub-int/2addr p1, v0

    .line 793
    invoke-static {p1}, Ll/ۛۗᩴ;->e(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final c(Ll/ۖۗᩴ;)I
    .locals 6

    .line 822
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v0

    .line 823
    sget-object v1, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v1}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v1

    .line 824
    sget-object v2, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v2}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v3

    .line 825
    invoke-virtual {p0, v3, v0}, Ll/ܰۗᩴ;->h(II)I

    move-result v0

    .line 826
    invoke-static {v0, v3}, Ll/ܰۗᩴ;->a(II)I

    move-result v3

    if-nez v3, :cond_0

    add-int/lit8 v1, v1, -0x1

    return v1

    .line 833
    :cond_0
    invoke-interface {p1, v2}, Ll/ۖۗᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    .line 253
    iget-wide v4, p1, Ll/᩺ۗᩴ;->d:J

    long-to-int p1, v4

    .line 835
    iget-object v2, p0, Ll/ܰۗᩴ;->b:Ll/۟ۗᩴ;

    .line 421
    iget v2, v2, Ll/۟ۗᩴ;->b:I

    add-int/2addr p1, v2

    .line 835
    invoke-static {v0, p1}, Ll/ܰۗᩴ;->a(II)I

    move-result p1

    if-lt v3, p1, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    return v1
.end method

.method public final d(Ll/ۖۗᩴ;)I
    .locals 4

    .line 853
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v0

    .line 854
    sget-object v1, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v1}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v2

    .line 855
    invoke-virtual {p0, v2, v0}, Ll/ܰۗᩴ;->h(II)I

    move-result v0

    .line 856
    invoke-static {v0, v2}, Ll/ܰۗᩴ;->a(II)I

    move-result v3

    if-nez v3, :cond_0

    .line 860
    invoke-static {p1}, Ll/ܺ᩶ᩴ;->r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ۖ᩶ᩴ;->E(Ll/ۖۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    int-to-long v0, v2

    .line 861
    sget-object v2, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/۬᩹ᩴ;->w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    .line 862
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->d(Ll/ۖۗᩴ;)I

    move-result p1

    return p1

    :cond_0
    const/16 v2, 0x32

    if-le v3, v2, :cond_1

    .line 866
    invoke-interface {p1, v1}, Ll/ۖۗᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    .line 253
    iget-wide v1, p1, Ll/᩺ۗᩴ;->d:J

    long-to-int p1, v1

    .line 868
    iget-object v1, p0, Ll/ܰۗᩴ;->b:Ll/۟ۗᩴ;

    .line 421
    iget v1, v1, Ll/۟ۗᩴ;->b:I

    add-int/2addr p1, v1

    .line 868
    invoke-static {v0, p1}, Ll/ܰۗᩴ;->a(II)I

    move-result p1

    if-lt v3, p1, :cond_1

    sub-int/2addr v3, p1

    add-int/lit8 v3, v3, 0x1

    :cond_1
    return v3
.end method

.method public final e(Ll/ۖ᩶ᩴ;III)Ll/۬᩹ᩴ;
    .locals 3

    const/4 v0, 0x1

    .line 741
    invoke-interface {p1, p2, v0, v0}, Ll/ۖ᩶ᩴ;->M(III)Ll/۬᩹ᩴ;

    move-result-object p1

    .line 742
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result p2

    .line 743
    invoke-virtual {p0, v0, p2}, Ll/ܰۗᩴ;->h(II)I

    move-result p2

    .line 746
    invoke-interface {p1}, Ll/۬᩹ᩴ;->Q()I

    move-result v1

    .line 747
    iget-object v2, p0, Ll/ܰۗᩴ;->b:Ll/۟ۗᩴ;

    .line 421
    iget v2, v2, Ll/۟ۗᩴ;->b:I

    add-int/2addr v1, v2

    .line 747
    invoke-static {p2, v1}, Ll/ܰۗᩴ;->a(II)I

    move-result v1

    sub-int/2addr v1, v0

    .line 748
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    neg-int p2, p2

    sub-int/2addr p4, v0

    add-int/2addr p4, p2

    sub-int/2addr p3, v0

    mul-int/lit8 p3, p3, 0x7

    add-int/2addr p3, p4

    int-to-long p2, p3

    .line 751
    sget-object p4, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {p1, p2, p3, p4}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ll/ۖۗᩴ;Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;
    .locals 3

    .line 1128
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v0

    .line 1129
    invoke-interface {p1, p2}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v1

    invoke-virtual {p0, v1, v0}, Ll/ܰۗᩴ;->h(II)I

    move-result v0

    .line 1130
    invoke-interface {p1, p2}, Ll/ۖۗᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    .line 217
    iget-wide v1, p1, Ll/᩺ۗᩴ;->a:J

    long-to-int p2, v1

    .line 1131
    invoke-static {v0, p2}, Ll/ܰۗᩴ;->a(II)I

    move-result p2

    int-to-long v1, p2

    .line 253
    iget-wide p1, p1, Ll/᩺ۗᩴ;->d:J

    long-to-int p2, p1

    .line 1132
    invoke-static {v0, p2}, Ll/ܰۗᩴ;->a(II)I

    move-result p1

    int-to-long p1, p1

    .line 1131
    invoke-static {v1, v2, p1, p2}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;
    .locals 6

    .line 1141
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1142
    sget-object p1, Ll/ܰۗᩴ;->h:Ll/᩺ۗᩴ;

    return-object p1

    .line 1144
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v1

    .line 1145
    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v2

    .line 1146
    invoke-virtual {p0, v2, v1}, Ll/ܰۗᩴ;->h(II)I

    move-result v1

    .line 1147
    invoke-static {v1, v2}, Ll/ܰۗᩴ;->a(II)I

    move-result v3

    if-nez v3, :cond_1

    .line 1151
    invoke-static {p1}, Ll/ܺ᩶ᩴ;->r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ۖ᩶ᩴ;->E(Ll/ۖۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    add-int/lit8 v2, v2, 0x7

    int-to-long v0, v2

    .line 1152
    sget-object v2, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/۬᩹ᩴ;->w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    .line 1153
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->g(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 1156
    :cond_1
    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object v0

    .line 253
    iget-wide v4, v0, Ll/᩺ۗᩴ;->d:J

    long-to-int v0, v4

    .line 1158
    iget-object v4, p0, Ll/ܰۗᩴ;->b:Ll/۟ۗᩴ;

    .line 421
    iget v4, v4, Ll/۟ۗᩴ;->b:I

    add-int/2addr v4, v0

    .line 1158
    invoke-static {v1, v4}, Ll/ܰۗᩴ;->a(II)I

    move-result v1

    if-lt v3, v1, :cond_2

    .line 1162
    invoke-static {p1}, Ll/ܺ᩶ᩴ;->r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;

    move-result-object v1

    invoke-interface {v1, p1}, Ll/ۖ᩶ᩴ;->E(Ll/ۖۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x8

    int-to-long v0, v0

    .line 1163
    sget-object v2, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    .line 1164
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->g(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    :cond_2
    add-int/lit8 v1, v1, -0x1

    int-to-long v0, v1

    const-wide/16 v2, 0x1

    .line 1166
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final h(II)I
    .locals 2

    sub-int/2addr p1, p2

    .line 886
    invoke-static {p1}, Ll/ۛۗᩴ;->e(I)I

    move-result p1

    neg-int p2, p1

    add-int/lit8 v0, p1, 0x1

    .line 888
    iget-object v1, p0, Ll/ܰۗᩴ;->b:Ll/۟ۗᩴ;

    .line 421
    iget v1, v1, Ll/۟ۗᩴ;->b:I

    if-le v0, v1, :cond_0

    rsub-int/lit8 p1, p1, 0x7

    return p1

    :cond_0
    return p2
.end method

.method public final isDateBased()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l(Ll/ۖۗᩴ;)Z
    .locals 2

    .line 1088
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1089
    sget-object v0, Ll/ۡۗᩴ;->WEEKS:Ll/ۡۗᩴ;

    iget-object v1, p0, Ll/ܰۗᩴ;->d:Ll/ۘۗᩴ;

    if-ne v1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1091
    :cond_0
    sget-object v0, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    if-ne v1, v0, :cond_1

    .line 1092
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result p1

    return p1

    .line 1093
    :cond_1
    sget-object v0, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    if-ne v1, v0, :cond_2

    .line 1094
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result p1

    return p1

    .line 1095
    :cond_2
    sget-object v0, Ll/۟ۗᩴ;->h:Ll/᩸ۗᩴ;

    if-ne v1, v0, :cond_3

    .line 1096
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result p1

    return p1

    .line 1097
    :cond_3
    sget-object v0, Ll/ۡۗᩴ;->FOREVER:Ll/ۡۗᩴ;

    if-ne v1, v0, :cond_4

    .line 1098
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result p1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final m(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;
    .locals 3

    .line 1106
    sget-object v0, Ll/ۡۗᩴ;->WEEKS:Ll/ۡۗᩴ;

    iget-object v1, p0, Ll/ܰۗᩴ;->d:Ll/ۘۗᩴ;

    if-ne v1, v0, :cond_0

    .line 1107
    iget-object p1, p0, Ll/ܰۗᩴ;->e:Ll/᩺ۗᩴ;

    return-object p1

    .line 1108
    :cond_0
    sget-object v0, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    if-ne v1, v0, :cond_1

    .line 1109
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    invoke-virtual {p0, p1, v0}, Ll/ܰۗᩴ;->f(Ll/ۖۗᩴ;Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 1110
    :cond_1
    sget-object v0, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    if-ne v1, v0, :cond_2

    .line 1111
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-virtual {p0, p1, v0}, Ll/ܰۗᩴ;->f(Ll/ۖۗᩴ;Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 1112
    :cond_2
    sget-object v0, Ll/۟ۗᩴ;->h:Ll/᩸ۗᩴ;

    if-ne v1, v0, :cond_3

    .line 1113
    invoke-virtual {p0, p1}, Ll/ܰۗᩴ;->g(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 1114
    :cond_3
    sget-object p1, Ll/ۡۗᩴ;->FOREVER:Ll/ۡۗᩴ;

    if-ne v1, p1, :cond_4

    .line 1115
    sget-object p1, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    .line 669
    iget-object p1, p1, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    return-object p1

    .line 1117
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "unreachable, rangeUnit: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", this: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Ljava/util/Map;Ll/ܽۙᩴ;Ll/ܿۙᩴ;)Ll/ۖۗᩴ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 932
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 933
    invoke-static {v3, v4}, Ll/᩺ۚᩴ;->y(J)I

    move-result v5

    .line 937
    sget-object v6, Ll/ۡۗᩴ;->WEEKS:Ll/ۡۗᩴ;

    const/4 v7, 0x0

    iget-object v8, v0, Ll/ܰۗᩴ;->e:Ll/᩺ۗᩴ;

    iget-object v9, v0, Ll/ܰۗᩴ;->b:Ll/۟ۗᩴ;

    const/4 v10, 0x1

    iget-object v11, v0, Ll/ܰۗᩴ;->d:Ll/ۘۗᩴ;

    if-ne v11, v6, :cond_0

    .line 938
    invoke-virtual {v8, v3, v4, v0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v2

    .line 407
    iget-object v3, v9, Ll/۟ۗᩴ;->a:Ll/᩸᩹ᩴ;

    .line 939
    invoke-virtual {v3}, Ll/᩸᩹ᩴ;->getValue()I

    move-result v3

    sub-int/2addr v3, v10

    sub-int/2addr v2, v10

    add-int/2addr v2, v3

    .line 940
    invoke-static {v2}, Ll/ۛۗᩴ;->e(I)I

    move-result v2

    add-int/2addr v2, v10

    int-to-long v2, v2

    .line 941
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 942
    sget-object v4, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v7

    .line 947
    :cond_0
    sget-object v3, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_6

    .line 950
    :cond_1
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    .line 669
    iget-object v4, v3, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {v4, v12, v13, v3}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v4

    .line 407
    iget-object v12, v9, Ll/۟ۗᩴ;->a:Ll/᩸᩹ᩴ;

    .line 797
    invoke-virtual {v12}, Ll/᩸᩹ᩴ;->getValue()I

    move-result v12

    sub-int/2addr v4, v12

    .line 798
    invoke-static {v4}, Ll/ۛۗᩴ;->e(I)I

    move-result v4

    add-int/2addr v4, v10

    .line 954
    invoke-static/range {p2 .. p2}, Ll/ܺ᩶ᩴ;->r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;

    move-result-object v12

    .line 955
    sget-object v13, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    invoke-interface {v1, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    .line 956
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    .line 669
    iget-object v6, v13, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {v6, v14, v15, v13}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v6

    .line 957
    sget-object v9, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    if-ne v11, v9, :cond_5

    sget-object v14, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {v1, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_5

    .line 958
    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    move-object/from16 v16, v8

    int-to-long v7, v5

    .line 975
    sget-object v5, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-ne v2, v5, :cond_2

    const/4 v5, 0x1

    .line 976
    invoke-interface {v12, v6, v5, v5}, Ll/ۖ᩶ᩴ;->M(III)Ll/۬᩹ᩴ;

    move-result-object v2

    const-wide/16 v5, 0x1

    invoke-static {v10, v11, v5, v6}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide v5

    invoke-interface {v2, v5, v6, v9}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v2

    .line 802
    invoke-virtual {v0, v2}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v5

    .line 803
    sget-object v6, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    invoke-interface {v2, v6}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v6

    .line 804
    invoke-virtual {v0, v6, v5}, Ll/ܰۗᩴ;->h(II)I

    move-result v5

    .line 805
    invoke-static {v5, v6}, Ll/ܰۗᩴ;->a(II)I

    move-result v5

    int-to-long v5, v5

    .line 977
    invoke-static {v7, v8, v5, v6}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide v5

    .line 978
    invoke-virtual {v0, v2}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v7

    sub-int/2addr v4, v7

    const/4 v7, 0x7

    int-to-long v7, v7

    .line 0
    invoke-static {v5, v6, v7, v8}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v5

    int-to-long v7, v4

    .line 979
    invoke-static {v5, v6, v7, v8}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide v4

    sget-object v6, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {v2, v4, v5, v6}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v2

    goto :goto_1

    .line 669
    :cond_2
    iget-object v5, v14, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {v5, v10, v11, v14}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v5

    const/4 v9, 0x1

    .line 982
    invoke-interface {v12, v6, v5, v9}, Ll/ۖ᩶ᩴ;->M(III)Ll/۬᩹ᩴ;

    move-result-object v5

    move-object/from16 v9, v16

    .line 983
    invoke-virtual {v9, v7, v8, v0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v6

    int-to-long v6, v6

    .line 802
    invoke-virtual {v0, v5}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v8

    .line 803
    sget-object v9, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    invoke-interface {v5, v9}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v9

    .line 804
    invoke-virtual {v0, v9, v8}, Ll/ܰۗᩴ;->h(II)I

    move-result v8

    .line 805
    invoke-static {v8, v9}, Ll/ܰۗᩴ;->a(II)I

    move-result v8

    int-to-long v8, v8

    sub-long/2addr v6, v8

    long-to-int v7, v6

    .line 985
    invoke-virtual {v0, v5}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v6

    sub-int/2addr v4, v6

    mul-int/lit8 v7, v7, 0x7

    add-int/2addr v7, v4

    int-to-long v6, v7

    .line 986
    sget-object v4, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {v5, v6, v7, v4}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v4

    .line 987
    sget-object v5, Ll/ܿۙᩴ;->STRICT:Ll/ܿۙᩴ;

    if-ne v2, v5, :cond_4

    invoke-interface {v4, v14}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v5

    cmp-long v2, v5, v10

    if-nez v2, :cond_3

    goto :goto_0

    .line 988
    :cond_3
    new-instance v1, Ll/ܺ᩹ᩴ;

    const-string v2, "Strict mode rejected resolved date as it is in a different month"

    invoke-direct {v1, v2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_0
    move-object v2, v4

    .line 991
    :goto_1
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 992
    invoke-interface {v1, v13}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 993
    invoke-interface {v1, v14}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 994
    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :cond_5
    move-object v9, v8

    .line 961
    sget-object v8, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    if-ne v11, v8, :cond_e

    int-to-long v7, v5

    const/4 v5, 0x1

    .line 1000
    invoke-interface {v12, v6, v5, v5}, Ll/ۖ᩶ᩴ;->M(III)Ll/۬᩹ᩴ;

    move-result-object v5

    .line 1001
    sget-object v10, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-ne v2, v10, :cond_6

    .line 809
    invoke-virtual {v0, v5}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v2

    .line 810
    sget-object v6, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {v5, v6}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v6

    .line 811
    invoke-virtual {v0, v6, v2}, Ll/ܰۗᩴ;->h(II)I

    move-result v2

    .line 812
    invoke-static {v2, v6}, Ll/ܰۗᩴ;->a(II)I

    move-result v2

    int-to-long v9, v2

    .line 1002
    invoke-static {v7, v8, v9, v10}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide v6

    .line 1003
    invoke-virtual {v0, v5}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v2

    sub-int/2addr v4, v2

    const/4 v2, 0x7

    int-to-long v8, v2

    .line 0
    invoke-static {v6, v7, v8, v9}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v6

    int-to-long v8, v4

    .line 1004
    invoke-static {v6, v7, v8, v9}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide v6

    sget-object v2, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {v5, v6, v7, v2}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v2

    goto :goto_3

    .line 1006
    :cond_6
    invoke-virtual {v9, v7, v8, v0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v7

    int-to-long v7, v7

    .line 809
    invoke-virtual {v0, v5}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v9

    .line 810
    sget-object v10, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {v5, v10}, Ll/ۖۗᩴ;->l(Ll/ۤۗᩴ;)I

    move-result v10

    .line 811
    invoke-virtual {v0, v10, v9}, Ll/ܰۗᩴ;->h(II)I

    move-result v9

    .line 812
    invoke-static {v9, v10}, Ll/ܰۗᩴ;->a(II)I

    move-result v9

    int-to-long v9, v9

    sub-long/2addr v7, v9

    long-to-int v8, v7

    .line 1008
    invoke-virtual {v0, v5}, Ll/ܰۗᩴ;->b(Ll/ۖۗᩴ;)I

    move-result v7

    sub-int/2addr v4, v7

    mul-int/lit8 v8, v8, 0x7

    add-int/2addr v8, v4

    int-to-long v7, v8

    .line 1009
    sget-object v4, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {v5, v7, v8, v4}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v4

    .line 1010
    sget-object v5, Ll/ܿۙᩴ;->STRICT:Ll/ܿۙᩴ;

    if-ne v2, v5, :cond_8

    invoke-interface {v4, v13}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v7

    int-to-long v5, v6

    cmp-long v2, v7, v5

    if-nez v2, :cond_7

    goto :goto_2

    .line 1011
    :cond_7
    new-instance v1, Ll/ܺ᩹ᩴ;

    const-string v2, "Strict mode rejected resolved date as it is in a different year"

    invoke-direct {v1, v2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_2
    move-object v2, v4

    .line 1014
    :goto_3
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1015
    invoke-interface {v1, v13}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1016
    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    .line 964
    :cond_9
    sget-object v5, Ll/۟ۗᩴ;->h:Ll/᩸ۗᩴ;

    if-eq v11, v5, :cond_a

    sget-object v5, Ll/ۡۗᩴ;->FOREVER:Ll/ۡۗᩴ;

    if-ne v11, v5, :cond_e

    .line 0
    :cond_a
    iget-object v5, v9, Ll/۟ۗᩴ;->f:Ll/ܰۗᩴ;

    .line 965
    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 0
    iget-object v5, v9, Ll/۟ۗᩴ;->e:Ll/ܰۗᩴ;

    .line 966
    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 0
    iget-object v5, v9, Ll/۟ۗᩴ;->f:Ll/ܰۗᩴ;

    .line 1082
    iget-object v7, v5, Ll/ܰۗᩴ;->e:Ll/᩺ۗᩴ;

    .line 1023
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 0
    iget-object v5, v9, Ll/۟ۗᩴ;->f:Ll/ܰۗᩴ;

    .line 1022
    invoke-virtual {v7, v10, v11, v5}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v5

    .line 1025
    sget-object v7, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-ne v2, v7, :cond_b

    const/4 v7, 0x1

    .line 1026
    invoke-virtual {v0, v12, v5, v7, v4}, Ll/ܰۗᩴ;->e(Ll/ۖ᩶ᩴ;III)Ll/۬᩹ᩴ;

    move-result-object v2

    .line 0
    iget-object v4, v9, Ll/۟ۗᩴ;->e:Ll/ܰۗᩴ;

    .line 1027
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-wide/16 v7, 0x1

    .line 1028
    invoke-static {v4, v5, v7, v8}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide v4

    .line 1029
    invoke-interface {v2, v4, v5, v6}, Ll/۬᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v2

    goto :goto_5

    .line 0
    :cond_b
    iget-object v6, v9, Ll/۟ۗᩴ;->e:Ll/ܰۗᩴ;

    .line 1082
    iget-object v7, v6, Ll/ܰۗᩴ;->e:Ll/᩺ۗᩴ;

    .line 1032
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 0
    iget-object v6, v9, Ll/۟ۗᩴ;->e:Ll/ܰۗᩴ;

    .line 1031
    invoke-virtual {v7, v10, v11, v6}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v6

    .line 1033
    invoke-virtual {v0, v12, v5, v6, v4}, Ll/ܰۗᩴ;->e(Ll/ۖ᩶ᩴ;III)Ll/۬᩹ᩴ;

    move-result-object v4

    .line 1034
    sget-object v6, Ll/ܿۙᩴ;->STRICT:Ll/ܿۙᩴ;

    if-ne v2, v6, :cond_d

    invoke-virtual {v0, v4}, Ll/ܰۗᩴ;->c(Ll/ۖۗᩴ;)I

    move-result v2

    if-ne v2, v5, :cond_c

    goto :goto_4

    .line 1035
    :cond_c
    new-instance v1, Ll/ܺ᩹ᩴ;

    const-string v2, "Strict mode rejected resolved date as it is in a different week-based-year"

    invoke-direct {v1, v2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    :goto_4
    move-object v2, v4

    .line 1038
    :goto_5
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    iget-object v4, v9, Ll/۟ۗᩴ;->f:Ll/ܰۗᩴ;

    .line 1039
    invoke-interface {v1, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    iget-object v4, v9, Ll/۟ۗᩴ;->e:Ll/ܰۗᩴ;

    .line 1040
    invoke-interface {v1, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1041
    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :cond_e
    :goto_6
    return-object v7
.end method

.method public final s()Ll/᩺ۗᩴ;
    .locals 1

    .line 1082
    iget-object v0, p0, Ll/ܰۗᩴ;->e:Ll/᩺ۗᩴ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1172
    iget-object v0, p0, Ll/ܰۗᩴ;->b:Ll/۟ۗᩴ;

    invoke-virtual {v0}, Ll/۟ۗᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܰۗᩴ;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
