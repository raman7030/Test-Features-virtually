.class public abstract Ll/᩹ܰᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static a(JJJ)J
    .locals 5

    const-wide/16 v0, 0x0

    const-wide/16 v2, -0x1

    cmp-long v4, p0, v0

    if-ltz v4, :cond_0

    sub-long/2addr p0, p2

    .line 53
    invoke-static {p0, p1, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    invoke-static {v2, v3, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    return-wide p0

    :cond_0
    return-wide v2
.end method

.method public static b(Ll/ۡ֫᩵;Ll/ܶ۫ᩴ;JJ)Ll/ܶ۫ᩴ;
    .locals 6

    .line 80
    invoke-static {p2, p3, p4, p5}, Ll/᩹ܰᩴ;->c(JJ)J

    move-result-wide v4

    .line 81
    sget-object p4, Ll/֫ܰᩴ;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p5

    aget p4, p4, p5

    const/4 p5, 0x1

    if-eq p4, p5, :cond_3

    const/4 p5, 0x2

    if-eq p4, p5, :cond_2

    const/4 p5, 0x3

    if-eq p4, p5, :cond_1

    const/4 p5, 0x4

    if-ne p4, p5, :cond_0

    .line 92
    new-instance p0, Ll/ܳܳ᩵;

    move-object v1, p1

    check-cast v1, Ll/۠ۨᩴ;

    move-object v0, p0

    move-wide v2, p2

    .line 871
    invoke-direct/range {v0 .. v5}, Ll/ۗ᩺ᩴ;-><init>(Ll/֨۫ᩴ;JJ)V

    return-object p0

    .line 95
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Unknown shape "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 89
    :cond_1
    new-instance p0, Ll/ᩴ᩺ᩴ;

    move-object v1, p1

    check-cast v1, Ll/֡۫ᩴ;

    move-object v0, p0

    move-wide v2, p2

    .line 847
    invoke-direct/range {v0 .. v5}, Ll/ۗ᩺ᩴ;-><init>(Ll/֨۫ᩴ;JJ)V

    return-object p0

    .line 86
    :cond_2
    new-instance p0, Ll/֡ܳ᩵;

    move-object v1, p1

    check-cast v1, Ll/ᩴ۫ᩴ;

    move-object v0, p0

    move-wide v2, p2

    .line 823
    invoke-direct/range {v0 .. v5}, Ll/ۗ᩺ᩴ;-><init>(Ll/֨۫ᩴ;JJ)V

    return-object p0

    .line 83
    :cond_3
    new-instance p0, Ll/ܽܰᩴ;

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Ll/ܽܰᩴ;-><init>(Ll/ܶ۫ᩴ;JJ)V

    return-object p0
.end method

.method public static c(JJ)J
    .locals 5

    const-wide v0, 0x7fffffffffffffffL

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-ltz v4, :cond_0

    add-long/2addr p0, p2

    goto :goto_0

    :cond_0
    move-wide p0, v0

    :goto_0
    cmp-long p2, p0, v2

    if-ltz p2, :cond_1

    return-wide p0

    :cond_1
    return-wide v0
.end method

.method public static d(J)I
    .locals 4

    .line 544
    sget v0, Ll/۟۟ᩴ;->t:I

    const-wide/16 v1, -0x1

    cmp-long v3, p0, v1

    if-eqz v3, :cond_0

    sget p0, Ll/۟۟ᩴ;->u:I

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    or-int/2addr p0, v0

    return p0
.end method

.method public static e(Ll/ۚ᩺ᩴ;JJ)Ll/᩶᩺ᩴ;
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 448
    new-instance v0, Ll/᩶᩺ᩴ;

    .line 449
    invoke-static {p3, p4}, Ll/᩹ܰᩴ;->d(J)I

    move-result v5

    move-object v3, v0

    move-object v4, p0

    move-wide v6, p1

    move-wide v8, p3

    invoke-direct/range {v3 .. v9}, Ll/᩶᩺ᩴ;-><init>(Ll/ۚ᩺ᩴ;IJJ)V

    return-object v0

    .line 446
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Skip must be non-negative: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(Ll/ۛ᩺ᩴ;JJ)Ll/۬ܿ᩵;
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 230
    new-instance v0, Ll/۬ܿ᩵;

    .line 231
    invoke-static {p3, p4}, Ll/᩹ܰᩴ;->d(J)I

    move-result v5

    move-object v3, v0

    move-object v4, p0

    move-wide v6, p1

    move-wide v8, p3

    invoke-direct/range {v3 .. v9}, Ll/۬ܿ᩵;-><init>(Ll/ۛ᩺ᩴ;IJJ)V

    return-object v0

    .line 228
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Skip must be non-negative: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Ll/᩵֫᩵;JJ)Ll/ᩴܳ᩵;
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 339
    new-instance v0, Ll/ᩴܳ᩵;

    .line 340
    invoke-static {p3, p4}, Ll/᩹ܰᩴ;->d(J)I

    move-result v5

    move-object v3, v0

    move-object v4, p0

    move-wide v6, p1

    move-wide v8, p3

    invoke-direct/range {v3 .. v9}, Ll/ᩴܳ᩵;-><init>(Ll/᩵֫᩵;IJJ)V

    return-object v0

    .line 337
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Skip must be non-negative: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static h(Ll/ۨ֫᩵;JJ)Ll/ܿܿ᩵;
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 114
    new-instance v0, Ll/ܿܿ᩵;

    .line 115
    invoke-static {p3, p4}, Ll/᩹ܰᩴ;->d(J)I

    move-result v5

    move-object v3, v0

    move-object v4, p0

    move-wide v6, p1

    move-wide v8, p3

    invoke-direct/range {v3 .. v9}, Ll/ܿܿ᩵;-><init>(Ll/ۨ֫᩵;IJJ)V

    return-object v0

    .line 112
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Skip must be non-negative: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
