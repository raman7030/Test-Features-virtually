.class public final Ll/۫ۛۢ;
.super Ljava/lang/Object;
.source "M6O6"


# direct methods
.method public static ֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;
    .locals 3

    .line 179
    new-instance v0, Ll/֡ۤۢ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2, p1}, Ll/֡ۤۢ;-><init>(Ll/᩵ۤۢ;IILjava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ۙۛۢ;)Ll/֫ܳ֡;
    .locals 3

    .line 83
    new-instance v0, Ll/֨ۤۢ;

    new-instance v1, Ll/᩷ۤۢ;

    new-instance v2, Ll/ۗۛۢ;

    invoke-direct {v2, p0, p1}, Ll/ۗۛۢ;-><init>(Ljava/lang/CharSequence;Ll/ۙۛۢ;)V

    invoke-direct {v1, v2}, Ll/᩷ۤۢ;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v0, v1}, Ll/֨ۤۢ;-><init>(Ll/᩷ۤۢ;)V

    .line 84
    invoke-virtual {v0}, Ll/ᩴܳ֡;->ۢ()V

    .line 73
    new-instance p0, Ll/᩸ۛۢ;

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    invoke-virtual {v0, p0}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 86
    new-instance p0, Ll/᩹ۛۢ;

    invoke-direct {p0, v0, p1}, Ll/᩹ۛۢ;-><init>(Ll/֨ۤۢ;Ll/ۙۛۢ;)V

    .line 98
    invoke-virtual {p0}, Ll/֫ܳ֡;->ܽ()V

    .line 100
    invoke-virtual {p0}, Ll/֫ܳ֡;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Ll/֫ܳ֡;->᩻(I)Ll/֡ܳ֡;

    move-result-object p1

    invoke-interface {p1}, Ll/֡ܳ֡;->getType()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-object p0

    .line 101
    :cond_0
    sget-object p0, Ll/᩵ۤۢ;->᩶:Ll/᩵ۤۢ;

    const-string p1, "Token count limit exceeded"

    invoke-static {p0, p1}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/util/List;Ll/ᩴ᩷ܿ;Ljava/util/List;Ll/ۙۛۢ;)V
    .locals 10

    .line 152
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v1, v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "Token count changed"

    if-eqz v3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܳ֡;

    .line 153
    invoke-virtual {p4}, Ll/ۙۛۢ;->֫()V

    .line 154
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v5

    const/16 v6, 0x41

    if-ne v5, v6, :cond_0

    goto :goto_0

    .line 155
    :cond_0
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_1

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳ֡;

    invoke-interface {v5}, Ll/֡ܳ֡;->getType()I

    move-result v5

    if-ne v5, v6, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 156
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v5

    if-eq v2, v5, :cond_9

    add-int/lit8 v4, v2, 0x1

    .line 157
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܳ֡;

    .line 158
    invoke-interface {v3}, Ll/֡ܳ֡;->ܿ()I

    move-result v5

    invoke-interface {v3}, Ll/֡ܳ֡;->ᩳ()I

    move-result v6

    sub-int/2addr v5, v6

    add-int/lit8 v5, v5, 0x1

    .line 159
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v6

    invoke-interface {v2}, Ll/֡ܳ֡;->getType()I

    move-result v7

    const-string v8, "Token content changed"

    if-ne v6, v7, :cond_8

    invoke-interface {v2}, Ll/֡ܳ֡;->ܿ()I

    move-result v6

    invoke-interface {v2}, Ll/֡ܳ֡;->ᩳ()I

    move-result v7

    sub-int/2addr v6, v7

    add-int/lit8 v6, v6, 0x1

    if-ne v5, v6, :cond_8

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_4

    and-int/lit16 v7, v6, 0x3ff

    if-nez v7, :cond_2

    .line 163
    invoke-virtual {p4}, Ll/ۙۛۢ;->֫()V

    .line 164
    :cond_2
    invoke-interface {v3}, Ll/֡ܳ֡;->ᩳ()I

    move-result v7

    add-int/2addr v7, v6

    invoke-interface {p0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-interface {v2}, Ll/֡ܳ֡;->ᩳ()I

    move-result v9

    add-int/2addr v9, v6

    invoke-interface {p2, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-ne v7, v9, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 165
    :cond_3
    sget-object p0, Ll/᩵ۤۢ;->᩹:Ll/᩵ۤۢ;

    invoke-static {p0, v8}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0

    :cond_4
    if-eqz v0, :cond_7

    .line 168
    invoke-static {v3}, Ll/ۨۛۢ;->֫(Ll/֡ܳ֡;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-static {v0}, Ll/ۨۛۢ;->֫(Ll/֡ܳ֡;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 169
    :cond_5
    invoke-interface {v0}, Ll/֡ܳ֡;->ܿ()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-interface {v3}, Ll/֡ܳ֡;->ᩳ()I

    move-result v5

    invoke-static {v0, v5, p0}, Ll/ۨۛۢ;->֫(IILjava/lang/CharSequence;)Z

    move-result v0

    .line 170
    invoke-interface {v1}, Ll/֡ܳ֡;->ܿ()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v2}, Ll/֡ܳ֡;->ᩳ()I

    move-result v5

    invoke-static {v1, v5, p2}, Ll/ۨۛۢ;->֫(IILjava/lang/CharSequence;)Z

    move-result v1

    if-ne v0, v1, :cond_6

    goto :goto_3

    .line 171
    :cond_6
    sget-object p0, Ll/᩵ۤۢ;->᩹:Ll/᩵ۤۢ;

    const-string p1, "Comment ownership changed"

    invoke-static {p0, p1}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0

    :cond_7
    :goto_3
    move-object v1, v2

    move-object v0, v3

    move v2, v4

    goto/16 :goto_0

    .line 160
    :cond_8
    sget-object p0, Ll/᩵ۤۢ;->᩹:Ll/᩵ۤۢ;

    invoke-static {p0, v8}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0

    .line 156
    :cond_9
    sget-object p0, Ll/᩵ۤۢ;->᩹:Ll/᩵ۤۢ;

    invoke-static {p0, v4}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0

    .line 175
    :cond_a
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p0

    if-ne v2, p0, :cond_b

    return-void

    :cond_b
    sget-object p0, Ll/᩵ۤۢ;->᩹:Ll/᩵ۤۢ;

    invoke-static {p0, v4}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ljava/lang/String;Ll/ۙۛۢ;Ll/ᩴ᩷ܿ;)V
    .locals 9

    .line 60
    invoke-static {p0, p3}, Ll/۫ۛۢ;->ۧ(Ljava/lang/CharSequence;Ll/ۙۛۢ;)Ll/۬ۛۢ;

    move-result-object v0

    .line 61
    new-instance v8, Ll/ۨۛۢ;

    invoke-static {v0}, Ll/۬ۛۢ;->ۧ(Ll/۬ۛۢ;)Ljava/util/List;

    move-result-object v3

    invoke-static {v0}, Ll/۬ۛۢ;->֫(Ll/۬ۛۢ;)Ll/ۡۛۢ;

    move-result-object v4

    move-object v1, v8

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Ll/ۨۛۢ;-><init>(Ljava/lang/CharSequence;Ljava/util/List;Ll/ۡۛۢ;Ll/ۗ᩶ۢ;Ljava/lang/String;Ll/ۙۛۢ;)V

    invoke-virtual {v8, p4}, Ll/ۨۛۢ;->֫(Ll/ᩴ᩷ܿ;)V

    .line 64
    :try_start_0
    invoke-static {p4, p3}, Ll/۫ۛۢ;->ۧ(Ljava/lang/CharSequence;Ll/ۙۛۢ;)Ll/۬ۛۢ;

    move-result-object p1
    :try_end_0
    .catch Ll/֡ۤۢ; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 133
    invoke-static {v0}, Ll/۬ۛۢ;->֫(Ll/۬ۛۢ;)Ll/ۡۛۢ;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    invoke-static {p1}, Ll/۬ۛۢ;->֫(Ll/۬ۛۢ;)Ll/ۡۛۢ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 134
    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 135
    invoke-virtual {p3}, Ll/ۙۛۢ;->֫()V

    .line 136
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺ᩷֡;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺ᩷֡;

    .line 137
    invoke-interface {v2}, Ll/ܺ᩷֡;->getChildCount()I

    move-result v4

    invoke-interface {v3}, Ll/ܺ᩷֡;->getChildCount()I

    move-result v5

    if-ne v4, v5, :cond_3

    instance-of v4, v2, Ll/ۡܳ֡;

    if-eqz v4, :cond_1

    .line 138
    move-object v5, v2

    check-cast v5, Ll/ۡܳ֡;

    instance-of v6, v3, Ll/ۡܳ֡;

    if-eqz v6, :cond_3

    move-object v6, v3

    check-cast v6, Ll/ۡܳ֡;

    invoke-virtual {v5}, Ll/᩵ܳ֡;->ۧ()I

    move-result v5

    invoke-virtual {v6}, Ll/᩵ܳ֡;->ۧ()I

    move-result v6

    if-ne v5, v6, :cond_3

    :cond_1
    if-nez v4, :cond_2

    instance-of v4, v3, Ll/ۡܳ֡;

    if-nez v4, :cond_3

    .line 142
    :cond_2
    invoke-interface {v2}, Ll/ܺ᩷֡;->getChildCount()I

    move-result v4

    :goto_0
    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_0

    invoke-interface {v2, v4}, Ll/ܺ᩷֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ll/ܺ᩷֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    .line 140
    :cond_3
    sget-object p0, Ll/᩵ۤۢ;->᩹:Ll/᩵ۤۢ;

    const-string p1, "Syntax structure changed during formatting"

    invoke-static {p0, p1}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0

    .line 144
    :cond_4
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 145
    invoke-static {v0}, Ll/۬ۛۢ;->ۧ(Ll/۬ۛۢ;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1}, Ll/۬ۛۢ;->ۧ(Ll/۬ۛۢ;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p2, p4, p1, p3}, Ll/۫ۛۢ;->֫(Ljava/lang/CharSequence;Ljava/util/List;Ll/ᩴ᩷ܿ;Ljava/util/List;Ll/ۙۛۢ;)V

    return-void

    .line 144
    :cond_5
    sget-object p0, Ll/᩵ۤۢ;->᩹:Ll/᩵ۤۢ;

    const-string p1, "Syntax length changed"

    invoke-static {p0, p1}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0

    :catch_0
    move-exception p0

    .line 66
    iget-object p1, p0, Ll/֡ۤۢ;->᩶:Ll/᩵ۤۢ;

    sget-object p2, Ll/᩵ۤۢ;->ۙ:Ll/᩵ۤۢ;

    if-eq p1, p2, :cond_6

    throw p0

    .line 67
    :cond_6
    sget-object p0, Ll/᩵ۤۢ;->᩹:Ll/᩵ۤۢ;

    const-string p1, "Formatted output could not be parsed"

    invoke-static {p0, p1}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ll/ᩴ᩷ܿ;)V
    .locals 7

    .line 30
    :try_start_0
    new-instance v0, Ll/ۙۛۢ;

    invoke-direct {v0}, Ll/ۙۛۢ;-><init>()V

    .line 31
    invoke-virtual {v0}, Ll/ۙۛۢ;->֫()V

    .line 32
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/high16 v2, 0x100000

    if-gt v1, v2, :cond_3

    .line 33
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_2

    .line 35
    invoke-static {p0, v0}, Ll/ۨۛۢ;->֫(Ljava/lang/CharSequence;Ll/ۙۛۢ;)Ljava/lang/String;

    move-result-object v1

    .line 36
    invoke-virtual {p2}, Ll/ᩴ᩷ܿ;->֫()Ll/ᩴ᩷ܿ;

    move-result-object v2
    :try_end_0
    .catch Ll/ۜۤۢ; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v3, 0x0

    .line 38
    :try_start_1
    invoke-static {p0, p1, v1, v0, v2}, Ll/۫ۛۢ;->֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ljava/lang/String;Ll/ۙۛۢ;Ll/ᩴ᩷ܿ;)V
    :try_end_1
    .catch Ll/֡ۤۢ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 40
    :try_start_2
    iget-object v5, v4, Ll/֡ۤۢ;->᩶:Ll/᩵ۤۢ;

    sget-object v6, Ll/᩵ۤۢ;->ۙ:Ll/᩵ۤۢ;

    if-ne v5, v6, :cond_1

    .line 41
    invoke-virtual {v2, v3}, Ll/ᩴ᩷ܿ;->ۧ(I)V

    .line 42
    invoke-static {p0, p1, v1, v0, v2}, Ll/ܶۛۢ;->֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ljava/lang/String;Ll/ۙۛۢ;Ll/ᩴ᩷ܿ;)V

    .line 45
    :goto_0
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-ge v3, p0, :cond_0

    .line 46
    invoke-virtual {v0}, Ll/ۙۛۢ;->֫()V

    .line 47
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p0

    add-int/lit16 p1, v3, 0x1000

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-virtual {p2, v3, p0, v2}, Ll/ᩴ᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    move v3, p1

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v0}, Ll/ۙۛۢ;->֫()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    :try_start_3
    invoke-virtual {v2}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_3
    .catch Ll/ۜۤۢ; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/StackOverflowError; {:try_start_3 .. :try_end_3} :catch_1

    return-void

    .line 40
    :cond_1
    :try_start_4
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 36
    :goto_1
    :try_start_5
    invoke-virtual {v2}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_6
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    .line 33
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Output must be empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 32
    :cond_3
    sget-object p0, Ll/᩵ۤۢ;->᩶:Ll/᩵ۤۢ;

    const-string p1, "Source length limit exceeded"

    invoke-static {p0, p1}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0
    :try_end_6
    .catch Ll/ۜۤۢ; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/StackOverflowError; {:try_start_6 .. :try_end_6} :catch_1

    .line 54
    :catch_1
    sget-object p0, Ll/᩵ۤۢ;->᩶:Ll/᩵ۤۢ;

    const-string p1, "Parser stack limit exceeded"

    invoke-static {p0, p1}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object p0

    throw p0

    .line 52
    :catch_2
    new-instance p0, Ljava/lang/InterruptedException;

    const-string p1, "Code formatting cancelled"

    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ljava/lang/CharSequence;Ll/ۙۛۢ;)Ll/۬ۛۢ;
    .locals 1

    .line 107
    invoke-static {p0, p1}, Ll/۫ۛۢ;->֫(Ljava/lang/CharSequence;Ll/ۙۛۢ;)Ll/֫ܳ֡;

    move-result-object p0

    .line 108
    new-instance v0, Ll/᩶ۛۢ;

    invoke-direct {v0, p0, p1}, Ll/᩶ۛۢ;-><init>(Ll/֫ܳ֡;Ll/ۙۛۢ;)V

    .line 125
    invoke-virtual {v0}, Ll/ᩴܳ֡;->ۢ()V

    .line 73
    new-instance p1, Ll/᩸ۛۢ;

    .line 20
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 126
    invoke-virtual {v0, p1}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 127
    new-instance p1, Ll/۬ۛۢ;

    invoke-virtual {p0}, Ll/֫ܳ֡;->ᩳ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {v0}, Ll/ۚۛۢ;->᩻֫()Ll/ۡۛۢ;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Ll/۬ۛۢ;-><init>(Ljava/util/ArrayList;Ll/ۡۛۢ;)V

    return-object p1
.end method
