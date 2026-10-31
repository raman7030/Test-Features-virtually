.class public abstract synthetic Ll/ܺ᩶ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static a(Ljava/util/function/DoubleConsumer;Ljava/util/function/DoubleConsumer;)Ll/۠ۛᩴ;
    .locals 1

    .line 64
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    new-instance v0, Ll/۠ۛᩴ;

    invoke-direct {v0, p0, p1}, Ll/۠ۛᩴ;-><init>(Ljava/util/function/DoubleConsumer;Ljava/util/function/DoubleConsumer;)V

    return-object v0
.end method

.method public static b(Ll/۠ۨᩴ;Ljava/util/function/Consumer;)V
    .locals 2

    .line 827
    instance-of v0, p1, Ljava/util/function/DoubleConsumer;

    if-eqz v0, :cond_0

    .line 828
    check-cast p1, Ljava/util/function/DoubleConsumer;

    invoke-interface {p0, p1}, Ll/۠ۨᩴ;->forEachRemaining(Ljava/util/function/DoubleConsumer;)V

    return-void

    .line 831
    :cond_0
    sget-boolean v0, Ll/ܺۨᩴ;->a:Z

    if-nez v0, :cond_1

    .line 834
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۨ۫ᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ۨ۫ᩴ;-><init>(Ljava/util/function/Consumer;I)V

    invoke-interface {p0, v0}, Ll/۠ۨᩴ;->forEachRemaining(Ljava/util/function/DoubleConsumer;)V

    return-void

    .line 832
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)"

    invoke-static {p0, p1}, Ll/ܺۨᩴ;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static c(Ll/ۘ᩶ᩴ;Ll/ۤۗᩴ;)I
    .locals 1

    .line 209
    sget-object v0, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    .line 210
    invoke-interface {p0}, Ll/ۘ᩶ᩴ;->getValue()I

    move-result p0

    return p0

    .line 212
    :cond_0
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->a(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)I

    move-result p0

    return p0
.end method

.method public static d(Ll/ۘ᩶ᩴ;Ll/ۤۗᩴ;)J
    .locals 1

    .line 239
    sget-object v0, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    .line 240
    invoke-interface {p0}, Ll/ۘ᩶ᩴ;->getValue()I

    move-result p0

    int-to-long p0, p0

    return-wide p0

    .line 241
    :cond_0
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-nez v0, :cond_1

    .line 244
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide p0

    return-wide p0

    .line 242
    :cond_1
    new-instance p0, Ll/ۨۗᩴ;

    const-string v0, "Unsupported field: "

    .line 0
    invoke-static {v0, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {p0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 242
    throw p0
.end method

.method public static e(Ll/ۘ᩶ᩴ;Ll/ۤۗᩴ;)Z
    .locals 1

    .line 146
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_0

    .line 147
    sget-object p0, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    if-ne p1, p0, :cond_1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 149
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static f(Ll/ۘ᩶ᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 1

    .line 269
    sget-object v0, Ll/ۛۗᩴ;->c:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_0

    .line 270
    sget-object p0, Ll/ۡۗᩴ;->ERAS:Ll/ۡۗᩴ;

    return-object p0

    .line 272
    :cond_0
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->c(Ll/ۖۗᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ll/۠ۨᩴ;Ljava/util/function/Consumer;)Z
    .locals 2

    .line 803
    instance-of v0, p1, Ljava/util/function/DoubleConsumer;

    if-eqz v0, :cond_0

    .line 804
    check-cast p1, Ljava/util/function/DoubleConsumer;

    invoke-interface {p0, p1}, Ll/۠ۨᩴ;->tryAdvance(Ljava/util/function/DoubleConsumer;)Z

    move-result p0

    return p0

    .line 807
    :cond_0
    sget-boolean v0, Ll/ܺۨᩴ;->a:Z

    if-nez v0, :cond_1

    .line 810
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۨ۫ᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ۨ۫ᩴ;-><init>(Ljava/util/function/Consumer;I)V

    invoke-interface {p0, v0}, Ll/۠ۨᩴ;->tryAdvance(Ljava/util/function/DoubleConsumer;)Z

    move-result p0

    return p0

    .line 808
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)"

    invoke-static {p0, p1}, Ll/ܺۨᩴ;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static h(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .locals 9

    const-string v0, "UTC"

    .line 129
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    .line 130
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1, p2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 131
    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 132
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    .line 133
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    long-to-int v5, p0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v3, 0x7e0

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v2, p2

    .line 135
    invoke-virtual/range {v2 .. v8}, Ljava/util/Calendar;->set(IIIIII)V

    .line 136
    invoke-virtual {p2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    .line 137
    invoke-virtual {v1, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .locals 9

    const-string v0, "UTC"

    .line 70
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    .line 71
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1, p2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 72
    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 73
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    .line 74
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    long-to-int v4, p0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p2

    .line 75
    invoke-virtual/range {v2 .. v8}, Ljava/util/Calendar;->set(IIIIII)V

    .line 76
    invoke-virtual {p2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    .line 77
    invoke-virtual {v1, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/util/Optional;)Ll/ܽ۫ᩴ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/util/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 26
    invoke-virtual {p0}, Ljava/util/Optional;->get()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object p0

    return-object p0

    .line 28
    :cond_1
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/util/OptionalDouble;)Ll/ۙ۫ᩴ;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 45
    :cond_0
    invoke-virtual {p0}, Ljava/util/OptionalDouble;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    invoke-virtual {p0}, Ljava/util/OptionalDouble;->getAsDouble()D

    move-result-wide v0

    .line 113
    new-instance p0, Ll/ۙ۫ᩴ;

    invoke-direct {p0, v0, v1}, Ll/ۙ۫ᩴ;-><init>(D)V

    return-object p0

    .line 48
    :cond_1
    sget-object p0, Ll/ۙ۫ᩴ;->c:Ll/ۙ۫ᩴ;

    return-object p0
.end method

.method public static l(Ljava/util/OptionalInt;)Ll/ᩳ۫ᩴ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 85
    :cond_0
    invoke-virtual {p0}, Ljava/util/OptionalInt;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    invoke-virtual {p0}, Ljava/util/OptionalInt;->getAsInt()I

    move-result p0

    .line 113
    new-instance v0, Ll/ᩳ۫ᩴ;

    invoke-direct {v0, p0}, Ll/ᩳ۫ᩴ;-><init>(I)V

    return-object v0

    .line 88
    :cond_1
    sget-object p0, Ll/ᩳ۫ᩴ;->c:Ll/ᩳ۫ᩴ;

    return-object p0
.end method

.method public static m(Ljava/util/OptionalLong;)Ll/۫۫ᩴ;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 65
    :cond_0
    invoke-virtual {p0}, Ljava/util/OptionalLong;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    invoke-virtual {p0}, Ljava/util/OptionalLong;->getAsLong()J

    move-result-wide v0

    .line 113
    new-instance p0, Ll/۫۫ᩴ;

    invoke-direct {p0, v0, v1}, Ll/۫۫ᩴ;-><init>(J)V

    return-object p0

    .line 68
    :cond_1
    sget-object p0, Ll/۫۫ᩴ;->c:Ll/۫۫ᩴ;

    return-object p0
.end method

.method public static n(Ll/ܽ۫ᩴ;)Ljava/util/Optional;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16
    invoke-virtual {p0}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p0

    return-object p0

    .line 18
    :cond_1
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static o(Ll/ۙ۫ᩴ;)Ljava/util/OptionalDouble;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 139
    :cond_0
    iget-boolean v0, p0, Ll/ۙ۫ᩴ;->a:Z

    if-eqz v0, :cond_2

    if-eqz v0, :cond_1

    .line 130
    iget-wide v0, p0, Ll/ۙ۫ᩴ;->b:D

    .line 36
    invoke-static {v0, v1}, Ljava/util/OptionalDouble;->of(D)Ljava/util/OptionalDouble;

    move-result-object p0

    return-object p0

    .line 128
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string v0, "No value present"

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 38
    :cond_2
    invoke-static {}, Ljava/util/OptionalDouble;->empty()Ljava/util/OptionalDouble;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ll/ᩳ۫ᩴ;)Ljava/util/OptionalInt;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 139
    :cond_0
    iget-boolean v0, p0, Ll/ᩳ۫ᩴ;->a:Z

    if-eqz v0, :cond_2

    if-eqz v0, :cond_1

    .line 130
    iget p0, p0, Ll/ᩳ۫ᩴ;->b:I

    .line 76
    invoke-static {p0}, Ljava/util/OptionalInt;->of(I)Ljava/util/OptionalInt;

    move-result-object p0

    return-object p0

    .line 128
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string v0, "No value present"

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 78
    :cond_2
    invoke-static {}, Ljava/util/OptionalInt;->empty()Ljava/util/OptionalInt;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ll/۫۫ᩴ;)Ljava/util/OptionalLong;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 139
    :cond_0
    iget-boolean v0, p0, Ll/۫۫ᩴ;->a:Z

    if-eqz v0, :cond_2

    if-eqz v0, :cond_1

    .line 130
    iget-wide v0, p0, Ll/۫۫ᩴ;->b:J

    .line 56
    invoke-static {v0, v1}, Ljava/util/OptionalLong;->of(J)Ljava/util/OptionalLong;

    move-result-object p0

    return-object p0

    .line 128
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string v0, "No value present"

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 58
    :cond_2
    invoke-static {}, Ljava/util/OptionalLong;->empty()Ljava/util/OptionalLong;

    move-result-object p0

    return-object p0
.end method

.method public static r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;
    .locals 1

    const-string v0, "temporal"

    .line 183
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 184
    sget-object v0, Ll/ۛۗᩴ;->b:Ll/ۡ֨ᩴ;

    invoke-interface {p0, v0}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ᩶ᩴ;

    .line 185
    sget-object v0, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNullElse(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖ᩶ᩴ;

    return-object p0
.end method

.method public static s(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    const-string v0, "null"

    if-eqz p0, :cond_0

    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    move-object p0, v0

    .line 105
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz p1, :cond_3

    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, p1

    .line 106
    :cond_3
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    add-int v2, v1, p1

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [C

    const/4 v3, 0x0

    .line 107
    invoke-virtual {p0, v3, v1, v2, v3}, Ljava/lang/String;->getChars(II[CI)V

    const/16 p0, 0x3d

    .line 108
    aput-char p0, v2, v1

    add-int/lit8 v1, v1, 0x1

    .line 109
    invoke-virtual {v0, v3, p1, v2, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 110
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static t(Ljava/lang/String;)Ll/ۖ᩶ᩴ;
    .locals 4

    .line 255
    sget-object v0, Ll/ۙ᩹ᩴ;->a:Ll/ۧۤᩴ;

    const-string v0, "id"

    .line 277
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 306
    :goto_0
    sget-object v0, Ll/ۙ᩹ᩴ;->a:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩶ᩴ;

    if-nez v1, :cond_0

    .line 308
    sget-object v1, Ll/ۙ᩹ᩴ;->b:Ll/ۧۤᩴ;

    invoke-virtual {v1, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩶ᩴ;

    :cond_0
    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    const-string v1, "ISO"

    .line 184
    invoke-virtual {v0, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    .line 188
    sget-object v0, Ll/᩵᩶ᩴ;->l:Ll/᩵᩶ᩴ;

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "Hijrah-umalqura"

    invoke-static {v0, v2}, Ll/ۙ᩹ᩴ;->n(Ll/ۖ᩶ᩴ;Ljava/lang/String;)Ll/ۖ᩶ᩴ;

    .line 189
    sget-object v0, Ll/᩹᩶ᩴ;->c:Ll/᩹᩶ᩴ;

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "Japanese"

    invoke-static {v0, v2}, Ll/ۙ᩹ᩴ;->n(Ll/ۖ᩶ᩴ;Ljava/lang/String;)Ll/ۖ᩶ᩴ;

    .line 190
    sget-object v0, Ll/ۗ᩹ᩴ;->c:Ll/ۗ᩹ᩴ;

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "Minguo"

    invoke-static {v0, v2}, Ll/ۙ᩹ᩴ;->n(Ll/ۖ᩶ᩴ;Ljava/lang/String;)Ll/ۖ᩶ᩴ;

    .line 191
    sget-object v0, Ll/ᩳ᩶ᩴ;->c:Ll/ᩳ᩶ᩴ;

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "ThaiBuddhist"

    invoke-static {v0, v2}, Ll/ۙ᩹ᩴ;->n(Ll/ۖ᩶ᩴ;Ljava/lang/String;)Ll/ۖ᩶ᩴ;

    .line 195
    const-class v0, Ll/ۙ᩹ᩴ;

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ll/ۙ᩹ᩴ;

    .line 196
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ᩹ᩴ;

    .line 197
    invoke-interface {v2}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object v3

    .line 198
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 145
    invoke-interface {v2}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۙ᩹ᩴ;->n(Ll/ۖ᩶ᩴ;Ljava/lang/String;)Ll/ۖ᩶ᩴ;

    goto :goto_1

    .line 207
    :cond_3
    sget-object v0, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, Ll/ۙ᩹ᩴ;->n(Ll/ۖ᩶ᩴ;Ljava/lang/String;)Ll/ۖ᩶ᩴ;

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 196
    new-instance v0, Ljava/util/ServiceConfigurationError;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 289
    :cond_4
    const-class v0, Ll/ۖ᩶ᩴ;

    invoke-static {v0}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;)Ljava/util/ServiceLoader;

    move-result-object v0

    .line 290
    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ᩶ᩴ;

    .line 291
    invoke-interface {v1}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-interface {v1}, Ll/ۖ᩶ᩴ;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_6
    return-object v1

    .line 295
    :cond_7
    new-instance v0, Ll/ܺ᩹ᩴ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown chronology: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public characteristics()I
    .locals 1

    const/16 v0, 0x4040

    return v0
.end method

.method public estimateSize()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 850
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 845
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return p1
.end method

.method public trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
