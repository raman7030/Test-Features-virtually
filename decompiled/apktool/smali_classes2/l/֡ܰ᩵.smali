.class public final Ll/֡ܰ᩵;
.super Ljava/lang/Object;
.source "R3LO"

# interfaces
.implements Ll/ۖۢܽ;


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 115
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x46

    if-eq v1, v2, :cond_b

    const/16 v2, 0x4c

    const/4 v3, 0x1

    if-eq v1, v2, :cond_9

    const/16 v2, 0x53

    if-eq v1, v2, :cond_8

    const/16 v2, 0x56

    if-eq v1, v2, :cond_7

    const/16 v2, 0x49

    if-eq v1, v2, :cond_6

    const/16 v2, 0x4a

    if-eq v1, v2, :cond_5

    const/16 v2, 0x5a

    if-eq v1, v2, :cond_4

    const/16 v2, 0x5b

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    .line 151
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0

    :pswitch_0
    const-string p0, "double"

    return-object p0

    :pswitch_1
    const-string p0, "char"

    return-object p0

    :pswitch_2
    const-string p0, "byte"

    return-object p0

    .line 140
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v3, v1, :cond_2

    .line 141
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 145
    :cond_2
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/֡ܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    if-ge v0, v3, :cond_3

    const-string p0, "[]"

    .line 147
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 149
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    const-string p0, "boolean"

    return-object p0

    :cond_5
    const-string p0, "long"

    return-object p0

    :cond_6
    const-string p0, "int"

    return-object p0

    :cond_7
    const-string p0, "void"

    return-object p0

    :cond_8
    const-string p0, "short"

    return-object p0

    :cond_9
    const/16 v0, 0x2f

    .line 135
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-gez v0, :cond_a

    const/4 v0, 0x1

    goto :goto_3

    :cond_a
    add-int/2addr v0, v3

    .line 0
    :goto_3
    invoke-static {v3, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_b
    const-string p0, "float"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 35
    invoke-static {p0}, Ll/ۨܽ֡;->ᩳ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۨܽ֡;->֫()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Basic "

    .line 36
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩵֫ۚ;)Z
    .locals 8

    const/4 v0, 0x1

    if-nez p0, :cond_0

    goto :goto_5

    .line 34
    :cond_0
    invoke-interface {p0}, Ll/᩵֫ۚ;->᩻()I

    move-result v1

    invoke-interface {p0}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺֫ۚ;

    .line 40
    invoke-interface {v4}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v5

    iget v5, v5, Ll/֨ۗ֡;->۬:I

    const/4 v6, 0x3

    if-ne v5, v6, :cond_1

    .line 41
    move-object v5, v4

    check-cast v5, Ll/ۧۧۚ;

    .line 42
    invoke-interface {v5}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v5

    check-cast v5, Ll/ۚܽۚ;

    .line 43
    invoke-interface {v4}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v6

    .line 47
    sget-object v7, Ll/֨ۗ֡;->֡ᩳ:Ll/֨ۗ֡;

    if-eq v6, v7, :cond_5

    sget-object v7, Ll/֨ۗ֡;->ۚᩳ:Ll/֨ۗ֡;

    if-ne v6, v7, :cond_2

    goto :goto_3

    .line 43
    :cond_2
    sget-object v4, Ll/֨ۗ֡;->֨ᩳ:Ll/֨ۗ֡;

    if-eq v6, v4, :cond_4

    sget-object v4, Ll/֨ۗ֡;->۠ᩳ:Ll/֨ۗ֡;

    if-ne v6, v4, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v4, 0x1

    .line 48
    :goto_2
    sget-object v6, Ll/ܿۜۚ;->֫:Ll/ᩴܶܺ;

    .line 90
    invoke-interface {v5}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v5

    invoke-static {v5, v4}, Ll/ܿۜۚ;->֫(Ljava/util/List;Z)I

    move-result v4

    goto :goto_4

    .line 46
    :cond_5
    :goto_3
    check-cast v4, Ll/ۜۧۚ;

    invoke-interface {v4}, Ll/ۜۧۚ;->᩻()I

    move-result v4

    :goto_4
    if-le v4, v3, :cond_1

    move v3, v4

    goto :goto_0

    :cond_6
    const/4 p0, 0x5

    if-le v3, p0, :cond_8

    if-gt v3, v1, :cond_7

    goto :goto_5

    :cond_7
    return v2

    :cond_8
    :goto_5
    return v0
.end method


# virtual methods
.method public ֫(Ll/ܺܺܽ;)V
    .locals 0

    .line 15
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨ᩷ܽ;

    invoke-virtual {p1}, Ll/ۨ᩷ܽ;->toString()Ljava/lang/String;

    return-void
.end method
