.class public final Ll/ۜܽ֨;
.super Ll/ۨܽ֨;
.source "R7DK"

# interfaces
.implements Ll/ۗܽ֨;


# instance fields
.field public ۜۧ:I

.field public ᩷ۧ:I

.field public ᩻ۧ:I


# virtual methods
.method public final ֫(I)V
    .locals 0

    .line 225
    iput p1, p0, Ll/ۢܽ֨;->᩺:I

    return-void
.end method

.method public final ֫(Ljava/io/DataInputStream;Ll/ۙ۬ۚ;I)Z
    .locals 7

    .line 61
    sget-object v0, Ll/᩻ܽ֨;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    const-string v1, "There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used."

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq p2, v3, :cond_9

    if-eq p2, v2, :cond_0

    return v0

    :cond_0
    if-eq p3, v2, :cond_2

    .line 71
    iget-boolean p2, p0, Ll/ۢܽ֨;->᩹:Z

    const-string v4, "{0}: Invalid attribute length #{1}"

    if-eqz p2, :cond_1

    .line 72
    iget-object p2, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    sget-object v5, Ll/ۙ۬ۚ;->ۛ:Ll/ۙ۬ۚ;

    invoke-virtual {v5}, Ll/ۙ۬ۚ;->ܿ()Ljava/lang/String;

    move-result-object v5

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array v6, v2, [Ljava/lang/Object;

    aput-object v5, v6, v0

    aput-object p3, v6, v3

    invoke-virtual {p2, v4, v6}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 74
    :cond_1
    new-instance p1, Ll/ۙۗۚ;

    iget-object p2, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {p2}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object p2

    sget-object v1, Ll/ۙ۬ۚ;->ۛ:Ll/ۙ۬ۚ;

    .line 75
    invoke-virtual {v1}, Ll/ۙ۬ۚ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v0

    aput-object p3, v2, v3

    invoke-direct {p1, p2, v4, v2}, Ll/ۙۗۚ;-><init>(Ll/ܰۗۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1

    .line 78
    :cond_2
    :goto_0
    sget-object p2, Ll/ۙ۬ۚ;->ۛ:Ll/ۙ۬ۚ;

    invoke-virtual {p0, p2}, Ll/ۨܽ֨;->֫(Ll/ۙ۬ۚ;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    if-le p3, v3, :cond_3

    .line 79
    iget-object p3, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    .line 80
    invoke-virtual {p2}, Ll/ۙ۬ۚ;->ܿ()Ljava/lang/String;

    move-result-object p2

    sget-object v4, Ll/ۗ۬ۚ;->ۗ:Ll/ۗ۬ۚ;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Object;

    aput-object p2, v5, v0

    aput-object v4, v5, v3

    .line 79
    invoke-virtual {p3, v1, v5}, Ll/᩶ۗۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    :cond_3
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result p1

    iput p1, p0, Ll/ۜܽ֨;->᩷ۧ:I

    .line 83
    iget-object p2, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {p2, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result p1

    if-nez p1, :cond_4

    .line 84
    iget-object p1, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    iget p2, p0, Ll/ۜܽ֨;->᩷ۧ:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p2, p3, v0

    const-string p2, "The constantvalue_index \"{0}\" is not a valid index into the constant_pool table."

    invoke-virtual {p1, p2, p3}, Ll/᩶ۗۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    return v3

    .line 86
    :cond_4
    iget-object p1, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget p2, p0, Ll/ۜܽ֨;->᩷ۧ:I

    const/4 p3, 0x5

    new-array p3, p3, [Ll/۫ۧ֨;

    sget-object v1, Ll/۫ۧ֨;->ܰ:Ll/۫ۧ֨;

    aput-object v1, p3, v0

    sget-object v1, Ll/۫ۧ֨;->᩺:Ll/۫ۧ֨;

    aput-object v1, p3, v3

    sget-object v1, Ll/۫ۧ֨;->ۤ:Ll/۫ۧ֨;

    aput-object v1, p3, v2

    sget-object v1, Ll/۫ۧ֨;->ۧ֫:Ll/۫ۧ֨;

    const/4 v2, 0x3

    aput-object v1, p3, v2

    sget-object v1, Ll/۫ۧ֨;->ۢ֫:Ll/۫ۧ֨;

    const/4 v2, 0x4

    aput-object v1, p3, v2

    .line 552
    invoke-virtual {p1, p2}, Ll/ۤۧ֨;->֨(I)Ll/ۗۧ֨;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 554
    iget-object p1, p1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {p1, p3}, Ll/۫ۧ֨;->֫([Ll/۫ۧ֨;)Z

    move-result p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_8

    .line 87
    iget-object p1, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget p2, p0, Ll/ۜܽ֨;->᩷ۧ:I

    .line 560
    invoke-virtual {p1, p2}, Ll/ۤۧ֨;->֨(I)Ll/ۗۧ֨;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 562
    iget-object p1, p1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_7

    const-string p1, "unknown"

    goto :goto_3

    .line 88
    :cond_7
    invoke-virtual {p1}, Ll/۫ۧ֨;->֫()Ljava/lang/String;

    move-result-object p1

    .line 89
    :goto_3
    iget-object p2, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p1, p3, v0

    const-string p1, "The constant_pool entry \"{0}\" is not of an appropriate type for the field."

    invoke-virtual {p2, p1, p3}, Ll/᩶ۗۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_8
    return v3

    .line 63
    :cond_9
    iget-object p2, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    if-eqz p2, :cond_a

    .line 64
    iget-object p2, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    sget-object v4, Ll/ۙ۬ۚ;->۠֫:Ll/ۙ۬ۚ;

    .line 65
    invoke-virtual {v4}, Ll/ۙ۬ۚ;->ܿ()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/ۗ۬ۚ;->ۗ:Ll/ۗ۬ۚ;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v0

    aput-object v5, v2, v3

    .line 64
    invoke-virtual {p2, v1, v2}, Ll/᩶ۗۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :cond_a
    new-instance p2, Ll/ۜܿ֨;

    iget-object v0, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v0, Ll/᩷ۧ֨;

    invoke-direct {p2, v0}, Ll/ۜܿ֨;-><init>(Ll/᩷ۧ֨;)V

    invoke-virtual {p2, p3, p1}, Ll/ۜܿ֨;->֫(ILjava/io/DataInputStream;)V

    iput-object p2, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    return v3
.end method

.method public final ۜ(I)V
    .locals 3

    .line 100
    iget-object v0, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v0, Ll/᩷ۧ֨;

    iget-object v0, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    .line 101
    iget-object v0, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    const-string p1, "The value of the attribute_name_index #{0} item is not a valid index into the constant_pool table. The attribute is ignored."

    invoke-virtual {v0, p1, v2}, Ll/᩶ۗۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 103
    :cond_0
    iget-object v0, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    const-string p1, "The attribute_name_index #{0} refers to an unknown attribute name. The attribute is ignored."

    invoke-virtual {v0, p1, v2}, Ll/᩶ۗۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final ۧ(II)V
    .locals 15

    move-object v7, p0

    .line 132
    iget-object v0, v7, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    const/4 v1, 0x0

    const/4 v8, 0x1

    if-eqz v0, :cond_0

    .line 68
    iget-boolean v0, v0, Ll/ۢܽ֨;->۬:Z

    if-nez v0, :cond_0

    .line 132
    iget-boolean v0, v7, Ll/ۢܽ֨;->ᩴ֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v9, 0x0

    .line 134
    :goto_0
    iget-object v0, v7, Ll/ۨܽ֨;->ܿۧ:Ljava/util/ArrayList;

    iget-object v2, v7, Ll/ۨܽ֨;->ۨ֫:Ljava/util/ArrayList;

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/util/List;

    aput-object v0, v4, v1

    aput-object v2, v4, v8

    invoke-virtual {p0, v4}, Ll/ۨܽ֨;->֫([Ljava/util/List;)V

    .line 135
    iget-object v0, v7, Ll/ۨܽ֨;->ܳۧ:Ljava/util/ArrayList;

    iget-object v2, v7, Ll/ۨܽ֨;->᩺֫:Ljava/util/ArrayList;

    new-array v4, v3, [Ljava/util/List;

    aput-object v0, v4, v1

    aput-object v2, v4, v8

    invoke-virtual {p0, v4}, Ll/ۨܽ֨;->֫([Ljava/util/List;)V

    .line 136
    sget-object v0, Ll/ۙ۬ۚ;->۬֫:Ll/ۙ۬ۚ;

    invoke-virtual {p0, v0}, Ll/ۨܽ֨;->֫(Ll/ۙ۬ۚ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x3

    if-lez v2, :cond_1

    .line 137
    invoke-virtual {p0, v0}, Ll/ۨܽ֨;->֫(Ll/ۙ۬ۚ;)Ljava/util/List;

    move-result-object v0

    .line 138
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸֫֨;

    .line 141
    invoke-virtual {v2}, Ll/᩸֫֨;->ᩳ()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2}, Ll/᩸֫֨;->ܽ()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2}, Ll/᩸֫֨;->֫()Ljava/lang/String;

    move-result-object v2

    new-array v10, v4, [Ljava/lang/Object;

    aput-object v5, v10, v1

    aput-object v6, v10, v8

    aput-object v2, v10, v3

    const-string v2, "// Ignored unrecognized attribute: { u2 #%d; u4 %d; u1[ %s ]; }"

    .line 19
    invoke-static {v2, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 139
    invoke-virtual {p0, v2}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const/4 v0, 0x4

    const/4 v2, 0x5

    const/4 v5, 0x0

    .line 145
    iget-boolean v6, v7, Ll/ۢܽ֨;->֫֫:Z

    const/4 v10, -0x1

    if-nez v6, :cond_5

    iget v11, v7, Ll/ۜܽ֨;->᩷ۧ:I

    if-eq v11, v10, :cond_5

    iget-object v12, v7, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    new-array v13, v2, [Ll/۫ۧ֨;

    sget-object v14, Ll/۫ۧ֨;->ܰ:Ll/۫ۧ֨;

    aput-object v14, v13, v1

    sget-object v14, Ll/۫ۧ֨;->᩺:Ll/۫ۧ֨;

    aput-object v14, v13, v8

    sget-object v14, Ll/۫ۧ֨;->ۤ:Ll/۫ۧ֨;

    aput-object v14, v13, v3

    sget-object v14, Ll/۫ۧ֨;->ۧ֫:Ll/۫ۧ֨;

    aput-object v14, v13, v4

    sget-object v14, Ll/۫ۧ֨;->ۢ֫:Ll/۫ۧ֨;

    aput-object v14, v13, v0

    .line 552
    invoke-virtual {v12, v11}, Ll/ۤۧ֨;->֨(I)Ll/ۗۧ֨;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 554
    iget-object v0, v0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v0, v13}, Ll/۫ۧ֨;->֫([Ll/۫ۧ֨;)Z

    move-result v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_5

    .line 147
    iget-object v0, v7, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v11, v7, Ll/ۜܽ֨;->᩷ۧ:I

    .line 560
    invoke-virtual {v0, v11}, Ll/ۤۧ֨;->֨(I)Ll/ۗۧ֨;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 562
    iget-object v0, v0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    goto :goto_3

    :cond_3
    move-object v0, v5

    :goto_3
    if-nez v0, :cond_4

    const-string v0, "unknown"

    goto :goto_4

    .line 148
    :cond_4
    invoke-virtual {v0}, Ll/۫ۧ֨;->֫()Ljava/lang/String;

    move-result-object v0

    .line 149
    :goto_4
    iget-object v11, v7, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    iget v12, v7, Ll/ۜܽ֨;->᩷ۧ:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    new-array v13, v3, [Ljava/lang/Object;

    aput-object v12, v13, v1

    aput-object v0, v13, v8

    const-string v0, "Unrecognized constantvalue_index: #{0} [ {1} ]"

    invoke-virtual {v11, v0, v13}, Ll/᩶ۗۚ;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v11, "// "

    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    :cond_5
    const/4 v0, 0x4

    .line 152
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۢܽ֨;->ۜ()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v12, v7, Ll/ۨܽ֨;->ۙ֫:I

    sget-object v13, Ll/᩶۬ۚ;->۫:Ll/᩶۬ۚ;

    .line 153
    invoke-static {v12, v13}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    invoke-virtual {p0}, Ll/ۨܽ֨;->᩸()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    sget-object v12, Ll/ܶۨۚ;->ܿܽ:Ll/ܶۨۚ;

    invoke-virtual {v12}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v12, 0x20

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 158
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    move-result v12

    invoke-virtual {p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v13

    mul-int/lit8 v13, v13, 0x2

    sub-int/2addr v12, v13

    sget-object v13, Ll/֨۟ۚ;->ۜ֫:Ll/֨۟ۚ;

    invoke-virtual {v13}, Ll/֨۟ۚ;->᩻()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    invoke-virtual {p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v14

    add-int/2addr v14, v13

    invoke-static {v12, v14}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 160
    iget v13, v7, Ll/ۜܽ֨;->᩷ۧ:I

    if-eq v13, v10, :cond_8

    if-nez v6, :cond_7

    if-eq v13, v10, :cond_7

    .line 173
    iget-object v5, v7, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    new-array v2, v2, [Ll/۫ۧ֨;

    sget-object v6, Ll/۫ۧ֨;->ܰ:Ll/۫ۧ֨;

    aput-object v6, v2, v1

    sget-object v6, Ll/۫ۧ֨;->᩺:Ll/۫ۧ֨;

    aput-object v6, v2, v8

    sget-object v6, Ll/۫ۧ֨;->ۤ:Ll/۫ۧ֨;

    aput-object v6, v2, v3

    sget-object v3, Ll/۫ۧ֨;->ۧ֫:Ll/۫ۧ֨;

    aput-object v3, v2, v4

    sget-object v3, Ll/۫ۧ֨;->ۢ֫:Ll/۫ۧ֨;

    aput-object v3, v2, v0

    .line 552
    invoke-virtual {v5, v13}, Ll/ۤۧ֨;->֨(I)Ll/ۗۧ֨;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 554
    iget-object v0, v0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v0, v2}, Ll/۫ۧ֨;->֫([Ll/۫ۧ֨;)Z

    move-result v1

    :cond_6
    if-nez v1, :cond_7

    const-string v0, ""

    goto :goto_5

    .line 178
    :cond_7
    iget-object v0, v7, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v0, Ll/᩷ۧ֨;

    iget-object v0, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v1, v7, Ll/ۜܽ֨;->᩷ۧ:I

    invoke-virtual {v0, v1}, Ll/ۤۧ֨;->ۜ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    move-object v2, v0

    goto :goto_6

    :cond_8
    move-object v2, v5

    :goto_6
    if-eqz v9, :cond_9

    const-string v0, ":"

    goto :goto_7

    :cond_9
    const-string v0, ";"

    :goto_7
    move-object v3, v0

    .line 161
    iget v4, v7, Ll/ۜܽ֨;->᩻ۧ:I

    iget v5, v7, Ll/ۜܽ֨;->ۜۧ:I

    iget v6, v7, Ll/ۜܽ֨;->᩷ۧ:I

    move-object v0, p0

    move-object v1, v11

    .line 159
    invoke-virtual/range {v0 .. v6}, Ll/ۨܽ֨;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;III)V

    if-eqz v9, :cond_a

    .line 165
    iget-object v0, v7, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    invoke-virtual {v0, v12}, Ll/ۜܿ֨;->ۡ(I)V

    .line 260
    invoke-virtual {v0, v8}, Ll/ۢܽ֨;->ᩳ(I)V

    .line 167
    invoke-virtual {p0}, Ll/ۜܽ֨;->ܿ()I

    move-result v1

    invoke-virtual {p0}, Ll/ۢܽ֨;->᩻()I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    .line 398
    iput v1, v0, Ll/ۢܽ֨;->᩶:I

    .line 168
    iget-object v0, v7, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    invoke-virtual {v0}, Ll/ۢܽ֨;->ۧ()V

    :cond_a
    return-void
.end method

.method public final ܿ()I
    .locals 3

    .line 394
    iget v0, p0, Ll/ۢܽ֨;->᩶:I

    .line 214
    iget v1, p0, Ll/ۢܽ֨;->᩺:I

    invoke-virtual {p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 3

    .line 193
    iget-boolean v0, p0, Ll/ۢܽ֨;->֫֫:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/ۢܽ֨;->ܺ֫:Z

    if-nez v0, :cond_2

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨܽ֨;->ۙ֫:I

    sget-object v2, Ll/᩶۬ۚ;->۫:Ll/᩶۬ۚ;

    invoke-static {v1, v2}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    invoke-virtual {p0}, Ll/ۨܽ֨;->᩸()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    sget-object v1, Ll/ܶۨۚ;->ܿܽ:Ll/ܶۨۚ;

    invoke-virtual {v1}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    iget v1, p0, Ll/ۜܽ֨;->᩻ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۜܽ֨;->ۜۧ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    iget-object v2, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    if-eqz v2, :cond_0

    .line 68
    iget-boolean v2, v2, Ll/ۢܽ֨;->۬:Z

    if-eqz v2, :cond_0

    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    invoke-virtual {v1}, Ll/ۜܿ֨;->ۙ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    :cond_0
    iget v1, p0, Ll/ۜܽ֨;->᩷ۧ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    const-string v1, " = #"

    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۜܽ֨;->᩷ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_1
    const/16 v1, 0x3b

    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 207
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v0, ""

    .line 220
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public final ᩳ(II)V
    .locals 0

    .line 189
    invoke-virtual {p0, p1, p2}, Ll/ۜܽ֨;->ۧ(II)V

    return-void
.end method
