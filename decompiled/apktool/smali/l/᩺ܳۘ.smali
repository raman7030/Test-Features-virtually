.class public final Ll/᩺ܳۘ;
.super Ljava/lang/Object;
.source "N1MQ"


# direct methods
.method public static ֫(IIII)Ll/֨۫ۡ;
    .locals 0

    sub-int/2addr p0, p2

    sub-int/2addr p0, p3

    sub-int/2addr p1, p2

    sub-int/2addr p1, p3

    const/4 p3, 0x0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    return-object p3

    :cond_0
    if-nez p0, :cond_1

    if-eqz p1, :cond_2

    .line 73
    :cond_1
    new-instance p3, Ll/ۛܳۘ;

    invoke-direct {p3, p2, p2, p0, p1}, Ll/ۛܳۘ;-><init>(IIII)V

    .line 75
    :cond_2
    new-instance p0, Ll/֨۫ۡ;

    invoke-direct {p0, p3}, Ll/֨۫ۡ;-><init>(Ll/ۛܳۘ;)V

    return-object p0
.end method

.method public static ֫([I[I)Ll/ۛܳۘ;
    .locals 7

    .line 127
    array-length v0, p0

    array-length v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 130
    aget v4, p0, v2

    aget v5, p1, v2

    if-eq v4, v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 137
    :cond_1
    :goto_1
    array-length v0, p0

    array-length v2, p1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v0, v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_2
    if-ge v2, v0, :cond_3

    .line 141
    array-length v5, p0

    sub-int/2addr v5, v2

    add-int/lit8 v5, v5, -0x1

    aget v5, p0, v5

    array-length v6, p1

    sub-int/2addr v6, v2

    add-int/lit8 v6, v6, -0x1

    aget v6, p1, v6

    if-eq v5, v6, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 58
    :cond_3
    :goto_3
    array-length v0, p0

    array-length v2, p1

    invoke-static {v0, v2, v3, v4}, Ll/᩺ܳۘ;->֫(IIII)Ll/֨۫ۡ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 59
    invoke-virtual {v0}, Ll/֨۫ۡ;->֫()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۛܳۘ;

    return-object p0

    :cond_4
    if-nez v3, :cond_5

    if-eqz v4, :cond_6

    :cond_5
    const/4 v1, 0x1

    :cond_6
    if-eqz v1, :cond_7

    .line 62
    array-length v0, p0

    sub-int/2addr v0, v4

    invoke-static {p0, v3, v0}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object p0

    :cond_7
    if-eqz v1, :cond_8

    .line 63
    array-length v0, p1

    sub-int/2addr v0, v4

    invoke-static {p1, v3, v0}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object p1

    .line 64
    :cond_8
    new-instance v0, Ll/ۨܳۘ;

    invoke-direct {v0, v3}, Ll/ۨܳۘ;-><init>(I)V

    invoke-static {p0, p1, v0}, Ll/᩺ܳۘ;->֫([I[ILl/ۨܳۘ;)Ll/ۛܳۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([I[ILl/ۨܳۘ;)Ll/ۛܳۘ;
    .locals 13

    .line 80
    new-instance v0, Ll/ۧ᩻ۘ;

    invoke-direct {v0}, Ll/ۧ᩻ۘ;-><init>()V

    .line 81
    invoke-virtual {v0, p0, p1}, Ll/ۧ᩻ۘ;->֫([I[I)[[I

    move-result-object v1

    const/4 v2, 0x0

    .line 83
    aget-object v4, v1, v2

    array-length v3, v4

    const/4 v12, 0x1

    if-nez v3, :cond_0

    aget-object v3, v1, v12

    array-length v3, v3

    if-nez v3, :cond_0

    .line 85
    array-length p0, p0

    array-length p1, p1

    invoke-virtual {p2, p0, p1}, Ll/ۨܳۘ;->֫(II)V

    .line 86
    invoke-virtual {p2}, Ll/ۨܳۘ;->֫()Ll/ۛܳۘ;

    move-result-object p0

    return-object p0

    .line 91
    :cond_0
    :try_start_0
    new-instance p0, Ll/۟ܳۘ;

    aget-object v5, v1, v12

    .line 43
    array-length v7, v4

    array-length v9, v5

    new-instance v10, Ljava/util/BitSet;

    array-length p1, v4

    invoke-direct {v10, p1}, Ljava/util/BitSet;-><init>(I)V

    new-instance v11, Ljava/util/BitSet;

    array-length p1, v5

    invoke-direct {v11, p1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v11}, Ll/۟ܳۘ;-><init>([I[IIIIILjava/util/BitSet;Ljava/util/BitSet;)V

    .line 92
    invoke-virtual {p0}, Ll/۟ܳۘ;->ۧ()V

    .line 93
    invoke-virtual {p0}, Ll/۟ܳۘ;->ܽ()[Ljava/util/BitSet;

    move-result-object p0
    :try_end_0
    .catch Ll/ܰܳۘ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 95
    :catch_0
    new-instance p0, Ll/֫᩻ۘ;

    aget-object p1, v1, v2

    aget-object v1, v1, v12

    invoke-direct {p0, p1, v1}, Ll/֫᩻ۘ;-><init>([I[I)V

    .line 96
    invoke-virtual {p0}, Ll/֫᩻ۘ;->֫()V

    .line 97
    invoke-virtual {p0}, Ll/֫᩻ۘ;->ۧ()[Ljava/util/BitSet;

    move-result-object p0

    .line 98
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Successful fallback to patience diff"

    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 101
    :goto_0
    invoke-virtual {v0, p0, p2}, Ll/ۧ᩻ۘ;->֫([Ljava/util/BitSet;Ll/ۨܳۘ;)V

    .line 102
    invoke-virtual {p2}, Ll/ۨܳۘ;->֫()Ll/ۛܳۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([Ljava/lang/Object;[Ljava/lang/Object;)Ll/ۛܳۘ;
    .locals 6

    .line 33
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 36
    :cond_0
    array-length v0, p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 106
    :cond_1
    array-length v0, p0

    array-length v2, p1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2
    if-ge v2, v0, :cond_3

    .line 109
    aget-object v4, p0, v2

    aget-object v5, p1, v2

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 116
    :cond_3
    :goto_3
    array-length v0, p0

    array-length v2, p1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v0, v3

    const/4 v2, 0x0

    :goto_4
    if-ge v1, v0, :cond_5

    .line 120
    array-length v4, p0

    sub-int/2addr v4, v1

    add-int/lit8 v4, v4, -0x1

    aget-object v4, p0, v4

    array-length v5, p1

    sub-int/2addr v5, v1

    add-int/lit8 v5, v5, -0x1

    aget-object v5, p1, v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 43
    :cond_5
    :goto_5
    array-length v0, p0

    array-length v1, p1

    invoke-static {v0, v1, v3, v2}, Ll/᩺ܳۘ;->֫(IIII)Ll/֨۫ۡ;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 44
    invoke-virtual {v0}, Ll/֨۫ۡ;->֫()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۛܳۘ;

    return-object p0

    .line 46
    :cond_6
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    mul-int/lit8 v1, v3, 0x2

    sub-int/2addr v0, v1

    mul-int/lit8 v1, v2, 0x2

    sub-int/2addr v0, v1

    .line 47
    new-instance v1, Ll/ۤܳۘ;

    invoke-direct {v1, v0}, Ll/ۤܳۘ;-><init>(I)V

    .line 48
    invoke-virtual {v1, v3, v2, p0}, Ll/ۤܳۘ;->֫(II[Ljava/lang/Object;)[I

    move-result-object p0

    .line 49
    invoke-virtual {v1, v3, v2, p1}, Ll/ۤܳۘ;->֫(II[Ljava/lang/Object;)[I

    move-result-object p1

    .line 50
    new-instance v0, Ll/ۨܳۘ;

    invoke-direct {v0, v3}, Ll/ۨܳۘ;-><init>(I)V

    invoke-static {p0, p1, v0}, Ll/᩺ܳۘ;->֫([I[ILl/ۨܳۘ;)Ll/ۛܳۘ;

    move-result-object p0

    return-object p0
.end method
