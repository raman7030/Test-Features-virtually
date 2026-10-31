.class public final Ll/ۚܰۢ;
.super Ljava/lang/Object;
.source "N6PY"


# direct methods
.method public static ֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;
    .locals 3

    .line 225
    new-instance v0, Ll/ᩴܰۢ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2, p1}, Ll/ᩴܰۢ;-><init>(Ll/֡ܰۢ;IILjava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ۖܰۢ;)Ll/᩵ܰۢ;
    .locals 3

    .line 94
    new-instance v0, Ll/᩷ܰۢ;

    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 101
    new-instance v1, Ll/ۨܿ֡;

    new-instance v2, Ll/ۜܰۢ;

    invoke-direct {v2, p1}, Ll/ۜܰۢ;-><init>(Ll/ۖܰۢ;)V

    invoke-direct {v1, p0, v2}, Ll/ۨܿ֡;-><init>(Ljava/lang/CharSequence;Ljava/lang/Runnable;)V

    .line 113
    new-instance p0, Ll/ۢܰۢ;

    new-instance v2, Ll/ۘܰۢ;

    invoke-direct {v2, v1, p1}, Ll/ۘܰۢ;-><init>(Ll/ۨܿ֡;Ll/ۖܰۢ;)V

    invoke-direct {p0, v2, p1}, Ll/ۢܰۢ;-><init>(Ll/᩺ܿ֡;Ll/ۖܰۢ;)V

    .line 102
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ۢ()V

    .line 103
    invoke-virtual {p0, v0}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 134
    new-instance v1, Ll/ۡܰۢ;

    invoke-direct {v1, p0, p1}, Ll/ۡܰۢ;-><init>(Ll/֨ܳ֡;Ll/ۖܰۢ;)V

    .line 105
    invoke-virtual {v1}, Ll/֫ܳ֡;->ܽ()V

    .line 154
    new-instance p0, Ll/ܺܰۢ;

    invoke-direct {p0, v1, p1}, Ll/ܺܰۢ;-><init>(Ll/֫ܳ֡;Ll/ۖܰۢ;)V

    .line 107
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ۢ()V

    .line 108
    invoke-virtual {p0, v0}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 109
    new-instance p1, Ll/᩵ܰۢ;

    invoke-virtual {v1}, Ll/֫ܳ֡;->ᩳ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ll/֨ܿۡ;->֫ۧ()Ll/ۜ֫ۡ;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/᩵ܰۢ;-><init>(Ljava/util/ArrayList;Ll/ۜ֫ۡ;)V

    return-object p1
.end method

.method public static ֫(Ljava/lang/CharSequence;ZILl/ۖܰۢ;Ll/ᩴ᩷ܿ;)V
    .locals 4

    .line 69
    invoke-static {p0, p3}, Ll/ۚܰۢ;->֫(Ljava/lang/CharSequence;Ll/ۖܰۢ;)Ll/᩵ܰۢ;

    move-result-object v0

    .line 70
    new-instance v1, Ll/۬ܿۡ;

    invoke-static {v0}, Ll/᩵ܰۢ;->ۧ(Ll/᩵ܰۢ;)Ljava/util/List;

    move-result-object v2

    invoke-static {v0}, Ll/᩵ܰۢ;->֫(Ll/᩵ܰۢ;)Ll/ۡܳ֡;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3, p3}, Ll/۬ܿۡ;-><init>(Ljava/lang/CharSequence;Ljava/util/List;Ll/ۡܳ֡;Ll/ۖܰۢ;)V

    const/16 v2, 0x10

    .line 71
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v2, 0x1

    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-virtual {v1, p1, p2, p4}, Ll/۬ܿۡ;->֫(ZILl/ᩴ᩷ܿ;)V

    .line 73
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/high16 p2, 0x100000

    if-gt p1, p2, :cond_d

    .line 74
    invoke-virtual {p3}, Ll/ۖܰۢ;->֫()V

    .line 75
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 p2, 0x0

    :goto_1
    if-eqz p1, :cond_3

    .line 76
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p2, v1, :cond_3

    and-int/lit16 p1, p2, 0x3ff

    if-nez p1, :cond_1

    .line 77
    invoke-virtual {p3}, Ll/ۖܰۢ;->֫()V

    .line 78
    :cond_1
    invoke-interface {p4, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne p1, v1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    return-void

    .line 83
    :cond_4
    :try_start_0
    invoke-static {p4, p3}, Ll/ۚܰۢ;->֫(Ljava/lang/CharSequence;Ll/ۖܰۢ;)Ll/᩵ܰۢ;

    move-result-object p0
    :try_end_0
    .catch Ll/ᩴܰۢ; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 191
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 192
    invoke-static {v0}, Ll/᩵ܰۢ;->֫(Ll/᩵ܰۢ;)Ll/ۡܳ֡;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 193
    invoke-static {p0}, Ll/᩵ܰۢ;->֫(Ll/᩵ܰۢ;)Ll/ۡܳ֡;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 194
    :cond_5
    :goto_3
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_a

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_a

    .line 195
    invoke-virtual {p3}, Ll/ۖܰۢ;->֫()V

    .line 196
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܺ᩷֡;

    .line 197
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/ܺ᩷֡;

    .line 198
    instance-of v0, p0, Ll/ۡܳ֡;

    if-eqz v0, :cond_7

    move-object v0, p0

    check-cast v0, Ll/ۡܳ֡;

    instance-of v1, p4, Ll/ۡܳ֡;

    if-eqz v1, :cond_7

    check-cast p4, Ll/ۡܳ֡;

    .line 199
    invoke-virtual {v0}, Ll/᩵ܳ֡;->ۧ()I

    move-result p0

    invoke-virtual {p4}, Ll/᩵ܳ֡;->ۧ()I

    move-result v1

    if-ne p0, v1, :cond_6

    invoke-virtual {v0}, Ll/ۡܳ֡;->getChildCount()I

    move-result p0

    invoke-virtual {p4}, Ll/ۡܳ֡;->getChildCount()I

    move-result v1

    if-ne p0, v1, :cond_6

    .line 202
    invoke-virtual {v0}, Ll/ۡܳ֡;->getChildCount()I

    move-result p0

    sub-int/2addr p0, v2

    :goto_4
    if-ltz p0, :cond_5

    .line 203
    invoke-virtual {v0, p0}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 204
    invoke-virtual {p4, p0}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 p0, p0, -0x1

    goto :goto_4

    .line 200
    :cond_6
    sget-object p0, Ll/֡ܰۢ;->᩹:Ll/֡ܰۢ;

    const-string p1, "Syntax structure changed during formatting"

    invoke-static {p0, p1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object p0

    throw p0

    .line 206
    :cond_7
    instance-of v0, p0, Ll/ۘ᩷֡;

    if-eqz v0, :cond_9

    check-cast p0, Ll/ۘ᩷֡;

    instance-of v0, p4, Ll/ۘ᩷֡;

    if-eqz v0, :cond_9

    check-cast p4, Ll/ۘ᩷֡;

    .line 207
    invoke-interface {p0}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object p0

    .line 208
    invoke-interface {p4}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object p4

    .line 209
    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result v0

    invoke-interface {p4}, Ll/֡ܳ֡;->getType()I

    move-result v1

    if-ne v0, v1, :cond_8

    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result v0

    invoke-static {v0}, Ll/ۚܰۢ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {p0}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p4}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    goto/16 :goto_3

    .line 210
    :cond_8
    sget-object p0, Ll/֡ܰۢ;->᩹:Ll/֡ܰۢ;

    const-string p1, "Token content changed during formatting"

    invoke-static {p0, p1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object p0

    throw p0

    .line 213
    :cond_9
    sget-object p0, Ll/֡ܰۢ;->᩹:Ll/֡ܰۢ;

    const-string p1, "Syntax node changed during formatting"

    invoke-static {p0, p1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object p0

    throw p0

    .line 216
    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_b

    .line 90
    invoke-virtual {p3}, Ll/ۖܰۢ;->֫()V

    return-void

    .line 216
    :cond_b
    sget-object p0, Ll/֡ܰۢ;->᩹:Ll/֡ܰۢ;

    const-string p1, "Syntax length changed"

    invoke-static {p0, p1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object p0

    throw p0

    :catch_0
    move-exception p0

    .line 86
    iget-object p1, p0, Ll/ᩴܰۢ;->᩶:Ll/֡ܰۢ;

    sget-object p2, Ll/֡ܰۢ;->ۗ:Ll/֡ܰۢ;

    if-eq p1, p2, :cond_c

    throw p0

    .line 87
    :cond_c
    sget-object p1, Ll/֡ܰۢ;->᩹:Ll/֡ܰۢ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Formatted output could not be parsed: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object p0

    throw p0

    .line 73
    :cond_d
    sget-object p0, Ll/֡ܰۢ;->ۙ:Ll/֡ܰۢ;

    const-string p1, "Formatted source length limit exceeded"

    invoke-static {p0, p1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/lang/CharSequence;ZILl/ᩴ᩷ܿ;)V
    .locals 4

    .line 48
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_3

    .line 49
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/high16 v1, 0x100000

    if-gt v0, v1, :cond_2

    .line 50
    new-instance v0, Ll/ۖܰۢ;

    invoke-direct {v0}, Ll/ۖܰۢ;-><init>()V

    .line 53
    :try_start_0
    invoke-static {p0, p1, p2, v0, p3}, Ll/ۚܰۢ;->֫(Ljava/lang/CharSequence;ZILl/ۖܰۢ;Ll/ᩴ᩷ܿ;)V
    :try_end_0
    .catch Ll/ᩴܰۢ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    move-exception v1

    .line 55
    :try_start_1
    iget-object v2, v1, Ll/ᩴܰۢ;->᩶:Ll/֡ܰۢ;

    sget-object v3, Ll/֡ܰۢ;->ۗ:Ll/֡ܰۢ;

    if-ne v2, v3, :cond_0

    .line 56
    invoke-static {p0, p1, p2, v0, p3}, Ll/ܶܿۡ;->֫(Ljava/lang/CharSequence;ZILl/ۖܰۢ;Ll/ᩴ᩷ܿ;)V

    return-void

    .line 55
    :cond_0
    throw v1
    :try_end_1
    .catch Ll/ᩴܰۢ; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/StackOverflowError; {:try_start_1 .. :try_end_1} :catch_1

    .line 63
    :catch_1
    sget-object p0, Ll/֡ܰۢ;->ۙ:Ll/֡ܰۢ;

    const-string p1, "Parser stack limit exceeded"

    invoke-static {p0, p1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object p0

    throw p0

    :catch_2
    move-exception p0

    .line 59
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p0, Ljava/lang/InterruptedException;

    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    throw p0

    .line 60
    :cond_1
    throw p0

    .line 49
    :cond_2
    sget-object p0, Ll/֡ܰۢ;->ۙ:Ll/֡ܰۢ;

    const-string p1, "Source length limit exceeded"

    invoke-static {p0, p1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object p0

    throw p0

    .line 48
    :cond_3
    new-instance p0, Ljava/lang/InterruptedException;

    invoke-direct {p0}, Ljava/lang/InterruptedException;-><init>()V

    throw p0
.end method

.method public static ֫(I)Z
    .locals 1

    const/16 v0, 0x66

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
