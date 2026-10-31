.class public final Ll/ۤ۬ۢ;
.super Ljava/lang/Object;
.source "46PA"


# direct methods
.method public static ֫(Ljava/lang/CharSequence;Ll/ᩴۙۢ;Ll/᩵ۙۢ;)Ll/֡۫ۢ;
    .locals 6

    const/4 v0, 0x0

    .line 54
    invoke-static {p0, p1, p2, v0}, Ll/ۤ۬ۢ;->֫(Ljava/lang/CharSequence;Ll/ᩴۙۢ;Ll/᩵ۙۢ;Ll/ᩳ۫ۢ;)Ll/۫۬ۢ;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 55
    sget-object v2, Ll/ᩴۙۢ;->᩶:Ll/ᩴۙۢ;

    if-eq p1, v2, :cond_3

    iget-object v2, v1, Ll/۫۬ۢ;->ᩳ:Ll/֫ܳ֡;

    invoke-virtual {v2}, Ll/֫ܳ֡;->ᩳ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Ll/ᩳ۫ۢ;->֫(Ljava/util/ArrayList;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 57
    iget-object v1, v1, Ll/۫۬ۢ;->֫:Ll/ᩳ۫ۢ;

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x3

    if-ge v2, v3, :cond_2

    .line 61
    invoke-static {p0, p1, p2, v1}, Ll/ۤ۬ۢ;->֫(Ljava/lang/CharSequence;Ll/ᩴۙۢ;Ll/᩵ۙۢ;Ll/ᩳ۫ۢ;)Ll/۫۬ۢ;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 63
    :cond_0
    iget-object v4, v3, Ll/۫۬ۢ;->֫:Ll/ᩳ۫ۢ;

    .line 64
    iget-object v5, v3, Ll/۫۬ۢ;->ᩳ:Ll/֫ܳ֡;

    invoke-virtual {v5}, Ll/֫ܳ֡;->ᩳ()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ll/ᩳ۫ۢ;->֫(Ll/ᩳ۫ۢ;Ljava/util/ArrayList;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v3

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move-object v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    move-object v1, v0

    :cond_3
    :goto_2
    if-nez v1, :cond_4

    return-object v0

    .line 46
    :cond_4
    iget-object p0, v1, Ll/۫۬ۢ;->ۧ:Ll/֡۫ۢ;

    .line 47
    iget-object p1, v1, Ll/۫۬ۢ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ll/֡۫ۢ;->֫(Ljava/util/List;)V

    .line 48
    iget-object p1, p0, Ll/֡۫ۢ;->ܳ:Ll/ᩳ۫ۢ;

    invoke-virtual {p0, p1}, Ll/֡۫ۢ;->֫(Ll/ᩳ۫ۢ;)V

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ᩴۙۢ;Ll/᩵ۙۢ;Ll/ᩳ۫ۢ;)Ll/۫۬ۢ;
    .locals 11

    .line 74
    new-instance v0, Ll/ᩴ۫ۢ;

    invoke-direct {v0, p0}, Ll/ᩴ۫ۢ;-><init>(Ljava/lang/CharSequence;)V

    .line 75
    new-instance v1, Ll/֡ۙۢ;

    invoke-direct {v1, v0}, Ll/֡ۙۢ;-><init>(Ll/᩺ܿ֡;)V

    .line 76
    new-instance v2, Ll/֨۫ۢ;

    invoke-direct {v2, v1, v0}, Ll/֨۫ۢ;-><init>(Ll/֡ۙۢ;Ll/ᩴ۫ۢ;)V

    invoke-virtual {v1, v2}, Ll/᩻ܳ֡;->֫(Ll/ۚܳ֡;)V

    .line 77
    sget-object v0, Ll/ᩴۙۢ;->᩶:Ll/ᩴۙۢ;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p1, v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v1, v4}, Ll/۠ۙۢ;->֫(Z)V

    .line 78
    invoke-virtual {v1, p3}, Ll/۠ۙۢ;->֫(Ll/ᩳ۫ۢ;)V

    .line 79
    invoke-virtual {v1}, Ll/ᩴܳ֡;->ۢ()V

    .line 80
    new-instance v4, Ll/۬۬ۢ;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-direct {v4, v1, v5}, Ll/۬۬ۢ;-><init>(Ll/֡ۙۢ;I)V

    .line 81
    invoke-virtual {v4}, Ll/֫ܳ֡;->ܽ()V

    .line 82
    new-instance v1, Ll/֡۫ۢ;

    invoke-virtual {p2}, Ll/᩵ۙۢ;->ܽ()I

    move-result v9

    move-object v5, v1

    move-object v6, p0

    move-object v7, v4

    move-object v8, p1

    move-object v10, p3

    invoke-direct/range {v5 .. v10}, Ll/֡۫ۢ;-><init>(Ljava/lang/CharSequence;Ll/֫ܳ֡;Ll/ᩴۙۢ;ILl/ᩳ۫ۢ;)V

    if-ne p1, v0, :cond_1

    .line 83
    new-instance p0, Ll/֫۫ۢ;

    invoke-direct {p0, v4}, Ll/֫۫ۢ;-><init>(Ll/֫ܳ֡;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ll/ۙ۬ۢ;

    invoke-direct {p0, v4}, Ll/ۙ۬ۢ;-><init>(Ll/֫ܳ֡;)V

    .line 84
    :goto_1
    new-instance p2, Ll/ۡ۫ۢ;

    .line 50
    new-instance v5, Ll/᩻۫ۢ;

    invoke-virtual {p0}, Ll/ᩴܳ֡;->ܽ()Ll/᩸ܳ֡;

    move-result-object v6

    invoke-direct {v5, v6}, Ll/᩻۫ۢ;-><init>(Ll/᩸ܳ֡;)V

    invoke-direct {p2, p0, v5}, Ll/ۡ۫ۢ;-><init>(Ll/ۗ۬ۢ;Ll/᩻۫ۢ;)V

    .line 84
    invoke-virtual {p0, p2}, Ll/ᩴܳ֡;->֫(Ll/ۨܳ֡;)V

    .line 85
    sget-object p2, Ll/ᩴۙۢ;->ۙ:Ll/ᩴۙۢ;

    if-ne p1, p2, :cond_2

    const/4 p2, 0x1

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    :goto_2
    invoke-virtual {p0, p2}, Ll/ۗ۬ۢ;->֫(Z)V

    .line 86
    invoke-virtual {p0, p3}, Ll/ۗ۬ۢ;->֫(Ll/ᩳ۫ۢ;)V

    .line 87
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ۢ()V

    .line 88
    invoke-virtual {p0, v1}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 89
    new-instance p2, Ll/ܳ۫ۢ;

    .line 10
    invoke-direct {p2}, Ll/ܽܳ֡;-><init>()V

    .line 89
    invoke-virtual {p0, p2}, Ll/ۢܳ֡;->֫(Ll/ܽܳ֡;)V

    if-eq p1, v0, :cond_3

    .line 90
    invoke-virtual {v4}, Ll/֫ܳ֡;->ᩳ()Ljava/util/ArrayList;

    move-result-object p2

    invoke-static {p2}, Ll/ᩳ۫ۢ;->֫(Ljava/util/ArrayList;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x1

    goto :goto_3

    :cond_3
    const/4 p2, 0x0

    .line 91
    :goto_3
    new-instance v5, Ll/ܿ۫ۢ;

    if-ne p1, v0, :cond_4

    const/4 p1, 0x1

    goto :goto_4

    :cond_4
    const/4 p1, 0x0

    :goto_4
    if-nez p3, :cond_5

    if-nez p2, :cond_6

    :cond_5
    const/4 v2, 0x1

    :cond_6
    invoke-direct {v5, p1, v2, p2}, Ll/ܿ۫ۢ;-><init>(ZZZ)V

    .line 92
    invoke-virtual {p0}, Ll/ۢܳ֡;->ۚ()V

    .line 93
    invoke-virtual {p0, v5}, Ll/ۢܳ֡;->֫(Ll/ۖ᩷֡;)V

    .line 95
    :try_start_0
    instance-of p1, p0, Ll/֫۫ۢ;

    if-eqz p1, :cond_7

    check-cast p0, Ll/֫۫ۢ;

    invoke-virtual {p0}, Ll/֫۫ۢ;->᩻֫()V

    goto :goto_6

    .line 98
    :cond_7
    :goto_5
    invoke-virtual {v4, v3}, Ll/֫ܳ֡;->ۧ(I)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_8

    .line 99
    invoke-virtual {v4}, Ll/֫ܳ֡;->index()I

    move-result p1

    .line 100
    move-object p2, p0

    check-cast p2, Ll/ۙ۬ۢ;

    invoke-virtual {p2}, Ll/ۙ۬ۢ;->۠ۧ()V

    .line 101
    invoke-virtual {v4}, Ll/֫ܳ֡;->index()I

    move-result p2

    if-ne p2, p1, :cond_7

    invoke-virtual {v4}, Ll/֫ܳ֡;->ۧ()V
    :try_end_0
    .catch Ll/᩵۫ۢ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 108
    :cond_8
    :goto_6
    new-instance p0, Ll/۫۬ۢ;

    invoke-direct {p0, v4, v1, v5}, Ll/۫۬ۢ;-><init>(Ll/֫ܳ֡;Ll/֡۫ۢ;Ll/ܿ۫ۢ;)V

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ᩴۙۢ;Ll/ۗ᩶ۢ;Ll/᩵ۙۢ;ZLl/ᩴ᩷ܿ;)V
    .locals 6

    .line 31
    :try_start_0
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 32
    invoke-static {p0, p1, p3}, Ll/ۤ۬ۢ;->֫(Ljava/lang/CharSequence;Ll/ᩴۙۢ;Ll/᩵ۙۢ;)Ll/֡۫ۢ;

    move-result-object v1

    if-nez v1, :cond_0

    .line 33
    invoke-virtual {p5, p0}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void

    .line 34
    :cond_0
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 35
    new-instance p0, Ll/ܺ۫ۢ;

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Ll/ܺ۫ۢ;-><init>(Ll/֡۫ۢ;Ll/ۗ᩶ۢ;Ll/᩵ۙۢ;ZLl/ᩴ᩷ܿ;)V

    invoke-virtual {p0}, Ll/ܺ۫ۢ;->֫()V
    :try_end_0
    .catch Ll/ۘ۫ۢ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 39
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Source nesting exceeds formatter limit"

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 37
    :catch_1
    new-instance p0, Ljava/lang/InterruptedException;

    const-string p1, "Code transformation cancelled"

    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
