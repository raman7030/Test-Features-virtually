.class public Ll/۠ᩳܺ;
.super Ljava/lang/Object;
.source "QBE0"


# virtual methods
.method public ֫(Ll/᩹ᩳܺ;ILjava/lang/String;II)Ll/۫ᩳܺ;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ll/᩹ᩳܺ;II)Ll/᩻ܽܺ;
    .locals 11

    if-eqz p1, :cond_2

    if-ltz p2, :cond_1

    const/4 v0, 0x4

    if-ge p2, v0, :cond_1

    const/4 v0, 0x0

    .line 92
    :try_start_0
    invoke-virtual {p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v1

    .line 93
    invoke-virtual {p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v2

    .line 94
    invoke-virtual {v1, p3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v3

    add-int/lit8 v4, p3, 0x2

    .line 95
    invoke-virtual {v1, v4}, Ll/ۧᩴܺ;->ۧ(I)I

    move-result v10

    .line 97
    invoke-virtual {v2, v3}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v1

    check-cast v1, Ll/۬ܺܺ;
    :try_end_0
    .catch Ll/᩺ᩳܺ; {:try_start_0 .. :try_end_0} :catch_1

    .line 106
    :try_start_1
    invoke-virtual {v1}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v9, p3, 0x6

    move-object v5, p0

    move-object v6, p1

    move v7, p2

    invoke-virtual/range {v5 .. v10}, Ll/۠ᩳܺ;->֫(Ll/᩹ᩳܺ;ILjava/lang/String;II)Ll/۫ᩳܺ;

    move-result-object p1
    :try_end_1
    .catch Ll/᩺ᩳܺ; {:try_start_1 .. :try_end_1} :catch_0

    check-cast p1, Ll/᩻ܽܺ;

    return-object p1

    :catch_0
    move-exception p1

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 109
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "...while parsing "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v0, :cond_0

    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    const-string v0, ""

    :goto_1
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "attribute at offset "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    invoke-static {p3}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 109
    invoke-virtual {p1, p2}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    .line 112
    throw p1

    .line 86
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bad context"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 82
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "cf == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
