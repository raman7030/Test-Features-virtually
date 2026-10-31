.class public final Ll/᩸ۙᩴ;
.super Ll/ۖۙᩴ;
.source "N673"


# instance fields
.field public final g:C

.field public final h:I


# direct methods
.method public constructor <init>(CIIII)V
    .locals 6

    const/4 v1, 0x0

    .line 4863
    sget-object v4, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    move-object v0, p0

    move v2, p3

    move v3, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;I)V

    .line 4864
    iput-char p1, p0, Ll/᩸ۙᩴ;->g:C

    .line 4865
    iput p2, p0, Ll/᩸ۙᩴ;->h:I

    return-void
.end method


# virtual methods
.method public final d()Ll/ۖۙᩴ;
    .locals 8

    .line 4875
    iget v0, p0, Ll/ۖۙᩴ;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-object p0

    .line 4878
    :cond_0
    new-instance v0, Ll/᩸ۙᩴ;

    iget v6, p0, Ll/ۖۙᩴ;->c:I

    const/4 v7, -0x1

    iget-char v3, p0, Ll/᩸ۙᩴ;->g:C

    iget v4, p0, Ll/᩸ۙᩴ;->h:I

    iget v5, p0, Ll/ۖۙᩴ;->b:I

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Ll/᩸ۙᩴ;-><init>(CIIII)V

    return-object v0
.end method

.method public final e(I)Ll/ۖۙᩴ;
    .locals 7

    .line 4889
    new-instance v6, Ll/᩸ۙᩴ;

    iget v0, p0, Ll/ۖۙᩴ;->e:I

    add-int v5, v0, p1

    iget-char v1, p0, Ll/᩸ۙᩴ;->g:C

    iget v2, p0, Ll/᩸ۙᩴ;->h:I

    iget v3, p0, Ll/ۖۙᩴ;->b:I

    iget v4, p0, Ll/ۖۙᩴ;->c:I

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/᩸ۙᩴ;-><init>(CIIII)V

    return-object v6
.end method

.method public final f(Ljava/util/Locale;)Ll/ۖۙᩴ;
    .locals 6

    .line 4911
    sget-object v0, Ll/۟ۗᩴ;->g:Ll/ۧۤᩴ;

    const-string v0, "locale"

    .line 296
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 297
    new-instance v0, Ljava/util/Locale;

    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object p1

    .line 302
    invoke-virtual {p1}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v0

    .line 303
    sget-object v1, Ll/᩸᩹ᩴ;->SUNDAY:Ll/᩸᩹ᩴ;

    add-int/lit8 v0, v0, -0x1

    int-to-long v2, v0

    const-wide/16 v4, 0x7

    .line 366
    rem-long/2addr v2, v4

    long-to-int v0, v2

    .line 367
    sget-object v2, Ll/᩸᩹ᩴ;->a:[Ll/᩸᩹ᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    add-int/lit8 v0, v0, 0x7

    add-int/2addr v0, v1

    rem-int/lit8 v0, v0, 0x7

    aget-object v0, v2, v0

    .line 305
    invoke-virtual {p1}, Ljava/util/Calendar;->getMinimalDaysInFirstWeek()I

    move-result p1

    .line 307
    invoke-static {v0, p1}, Ll/۟ۗᩴ;->a(Ll/᩸᩹ᩴ;I)Ll/۟ۗᩴ;

    move-result-object p1

    const/16 v0, 0x57

    .line 4913
    iget-char v1, p0, Ll/᩸ۙᩴ;->g:C

    if-eq v1, v0, :cond_5

    const/16 v0, 0x59

    if-eq v1, v0, :cond_2

    const/16 v0, 0x63

    if-eq v1, v0, :cond_1

    const/16 v0, 0x65

    if-eq v1, v0, :cond_1

    const/16 v0, 0x77

    if-ne v1, v0, :cond_0

    .line 585
    iget-object p1, p1, Ll/۟ۗᩴ;->e:Ll/ܰۗᩴ;

    goto :goto_1

    .line 4935
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unreachable"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 444
    :cond_1
    iget-object p1, p1, Ll/۟ۗᩴ;->c:Ll/ܰۗᩴ;

    goto :goto_1

    .line 627
    :cond_2
    iget-object v1, p1, Ll/۟ۗᩴ;->f:Ll/ܰۗᩴ;

    const/4 p1, 0x2

    .line 4916
    iget v2, p0, Ll/᩸ۙᩴ;->h:I

    if-ne v2, p1, :cond_3

    .line 4917
    new-instance p1, Ll/֨ۙᩴ;

    sget-object v4, Ll/֨ۙᩴ;->h:Ll/ᩴ᩹ᩴ;

    iget v5, p0, Ll/ۖۙᩴ;->e:I

    const/4 v2, 0x2

    const/4 v3, 0x2

    move-object v0, p1

    .line 0
    invoke-direct/range {v0 .. v5}, Ll/֨ۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/۬᩹ᩴ;I)V

    return-object p1

    .line 4920
    :cond_3
    new-instance p1, Ll/ۖۙᩴ;

    const/4 v0, 0x4

    if-ge v2, v0, :cond_4

    .line 4921
    sget-object v0, Ll/᩻ۙᩴ;->NORMAL:Ll/᩻ۙᩴ;

    goto :goto_0

    :cond_4
    sget-object v0, Ll/᩻ۙᩴ;->EXCEEDS_PAD:Ll/᩻ۙᩴ;

    :goto_0
    move-object v4, v0

    iget v5, p0, Ll/ۖۙᩴ;->e:I

    const/16 v3, 0x13

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;I)V

    return-object p1

    .line 490
    :cond_5
    iget-object p1, p1, Ll/۟ۗᩴ;->d:Ll/ܰۗᩴ;

    :goto_1
    move-object v1, p1

    .line 4937
    new-instance p1, Ll/ۖۙᩴ;

    sget-object v4, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    iget v5, p0, Ll/ۖۙᩴ;->e:I

    iget v2, p0, Ll/ۖۙᩴ;->b:I

    iget v3, p0, Ll/ۖۙᩴ;->c:I

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;I)V

    return-object p1
.end method

.method public final l(Ll/ۤۙᩴ;Ljava/lang/StringBuilder;)Z
    .locals 1

    .line 250
    iget-object v0, p1, Ll/ۤۙᩴ;->b:Ll/ۛ᩶ᩴ;

    .line 1437
    iget-object v0, v0, Ll/ۛ᩶ᩴ;->b:Ljava/util/Locale;

    .line 4895
    invoke-virtual {p0, v0}, Ll/᩸ۙᩴ;->f(Ljava/util/Locale;)Ll/ۖۙᩴ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ۖۙᩴ;->l(Ll/ۤۙᩴ;Ljava/lang/StringBuilder;)Z

    move-result p1

    return p1
.end method

.method public final m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I
    .locals 1

    .line 147
    iget-object v0, p1, Ll/ۗۙᩴ;->a:Ll/ۛ᩶ᩴ;

    .line 1437
    iget-object v0, v0, Ll/ۛ᩶ᩴ;->b:Ljava/util/Locale;

    .line 4900
    invoke-virtual {p0, v0}, Ll/᩸ۙᩴ;->f(Ljava/util/Locale;)Ll/ۖۙᩴ;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ll/ۖۙᩴ;->m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 4943
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Localized("

    .line 4944
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x59

    .line 4945
    iget v2, p0, Ll/᩸ۙᩴ;->h:I

    iget-char v3, p0, Ll/᩸ۙᩴ;->g:C

    if-ne v3, v1, :cond_3

    const/4 v1, 0x1

    if-ne v2, v1, :cond_0

    const-string v1, "WeekBasedYear"

    .line 4947
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    const/4 v1, 0x2

    if-ne v2, v1, :cond_1

    const-string v1, "ReducedValue(WeekBasedYear,2,2,2000-01-01)"

    .line 4949
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    const-string v1, "WeekBasedYear,"

    .line 4951
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",19,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x4

    if-ge v2, v1, :cond_2

    .line 4953
    sget-object v1, Ll/᩻ۙᩴ;->NORMAL:Ll/᩻ۙᩴ;

    goto :goto_0

    :cond_2
    sget-object v1, Ll/᩻ۙᩴ;->EXCEEDS_PAD:Ll/᩻ۙᩴ;

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    const/16 v1, 0x57

    if-eq v3, v1, :cond_6

    const/16 v1, 0x63

    if-eq v3, v1, :cond_5

    const/16 v1, 0x65

    if-eq v3, v1, :cond_5

    const/16 v1, 0x77

    if-eq v3, v1, :cond_4

    goto :goto_1

    :cond_4
    const-string v1, "WeekOfWeekBasedYear"

    .line 4962
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    const-string v1, "DayOfWeek"

    .line 4959
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    const-string v1, "WeekOfMonth"

    .line 4965
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, ","

    .line 4970
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4971
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_2
    const-string v1, ")"

    .line 4973
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4974
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
