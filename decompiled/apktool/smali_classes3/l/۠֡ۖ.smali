.class public final Ll/۠֡ۖ;
.super Ljava/lang/Object;
.source "59PG"


# direct methods
.method public static ֫(Ll/ۡۜۖ;Ljava/util/Map;)I
    .locals 6

    .line 65
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->۠()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ᩴ()Z

    move-result v0

    .line 67
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 68
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۖۖ;

    .line 69
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v0, :cond_0

    .line 71
    invoke-virtual {v3}, Ll/֡ۖۖ;->ۙ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 72
    invoke-virtual {v3}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v4

    sget-object v5, Ll/᩵ۖۖ;->۟:Ll/᩵ۖۖ;

    if-ne v4, v5, :cond_0

    .line 73
    invoke-virtual {v3}, Ll/֡ۖۖ;->۟֫()Z

    move-result v4

    if-nez v4, :cond_0

    .line 75
    invoke-virtual {v3}, Ll/֡ۖۖ;->getNumber()I

    move-result v3

    check-cast v2, Ll/᩻֡ۖ;

    const/4 v4, 0x1

    .line 657
    invoke-static {v4}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result v4

    const/4 v5, 0x2

    mul-int/lit8 v4, v4, 0x2

    .line 658
    invoke-static {v5, v3}, Ll/ܳ᩷ۖ;->᩻(II)I

    move-result v3

    add-int/2addr v3, v4

    const/4 v4, 0x3

    .line 659
    invoke-static {v4, v2}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v2

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    goto :goto_0

    .line 77
    :cond_0
    invoke-static {v3, v2}, Ll/᩵ۘۖ;->ۧ(Ll/ᩴۘۖ;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    .line 81
    :cond_1
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p0

    if-eqz v0, :cond_2

    .line 83
    invoke-virtual {p0}, Ll/ۢ֨ۖ;->ۧ()I

    move-result p0

    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {p0}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result p0

    :goto_1
    add-int/2addr p0, v1

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ll/֡ۖۖ;I)Ljava/lang/String;
    .locals 1

    .line 136
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result p0

    if-eqz p0, :cond_0

    const/16 p0, 0x28

    .line 138
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/֡ۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 140
    :cond_0
    invoke-virtual {p1}, Ll/֡ۖۖ;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const/4 p0, -0x1

    if-eq p2, p0, :cond_1

    const/16 p0, 0x5b

    .line 143
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    const/16 p0, 0x2e

    .line 145
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/List;)Ljava/lang/String;
    .locals 3

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_0

    const-string v2, ", "

    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۘ֡ۖ;)Ljava/util/ArrayList;
    .locals 2

    .line 184
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, ""

    .line 185
    invoke-static {p0, v1, v0}, Ll/۠֡ۖ;->֫(Ll/ۘ֡ۖ;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static ֫(Ll/ۘ֡ۖ;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 6

    .line 151
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖۖ;

    .line 152
    invoke-virtual {v1}, Ll/֡ۖۖ;->ۛ()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0, v1}, Ll/ۘ֡ۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 153
    invoke-virtual {v1}, Ll/֡ۖۖ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 158
    :cond_1
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getAllFields()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 159
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۖۖ;

    .line 160
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 162
    invoke-virtual {v2}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v3

    sget-object v4, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v3, v4, :cond_2

    .line 163
    invoke-virtual {v2}, Ll/֡ۖۖ;->۟֫()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 165
    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 166
    check-cast v4, Ll/ۘ֡ۖ;

    add-int/lit8 v5, v3, 0x1

    .line 167
    invoke-static {p1, v2, v3}, Ll/۠֡ۖ;->֫(Ljava/lang/String;Ll/֡ۖۖ;I)Ljava/lang/String;

    move-result-object v3

    .line 166
    invoke-static {v4, v3, p2}, Ll/۠֡ۖ;->֫(Ll/ۘ֡ۖ;Ljava/lang/String;Ljava/util/ArrayList;)V

    move v3, v5

    goto :goto_2

    .line 170
    :cond_3
    invoke-interface {p0, v2}, Ll/ۘ֡ۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 171
    check-cast v1, Ll/ۘ֡ۖ;

    const/4 v3, -0x1

    .line 172
    invoke-static {p1, v2, v3}, Ll/۠֡ۖ;->֫(Ljava/lang/String;Ll/֡ۖۖ;I)Ljava/lang/String;

    move-result-object v2

    .line 171
    invoke-static {v1, v2, p2}, Ll/۠֡ۖ;->֫(Ll/ۘ֡ۖ;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public static ֫(Ll/ۡۜۖ;Ljava/util/Map;Ll/ܳ᩷ۖ;)V
    .locals 5

    .line 32
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->۠()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ᩴ()Z

    move-result v0

    .line 41
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 42
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۖۖ;

    .line 43
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {v2}, Ll/֡ۖۖ;->ۙ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 46
    invoke-virtual {v2}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v3

    sget-object v4, Ll/᩵ۖۖ;->۟:Ll/᩵ۖۖ;

    if-ne v3, v4, :cond_0

    .line 47
    invoke-virtual {v2}, Ll/֡ۖۖ;->۟֫()Z

    move-result v3

    if-nez v3, :cond_0

    .line 48
    invoke-virtual {v2}, Ll/֡ۖۖ;->getNumber()I

    move-result v2

    check-cast v1, Ll/᩻֡ۖ;

    invoke-virtual {p2, v2, v1}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۡ֡ۖ;)V

    goto :goto_0

    .line 50
    :cond_0
    invoke-static {v2, v1, p2}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;Ll/ܳ᩷ۖ;)V

    goto :goto_0

    .line 54
    :cond_1
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p0

    if-eqz v0, :cond_2

    .line 56
    invoke-virtual {p0, p2}, Ll/ۢ֨ۖ;->֫(Ll/ܳ᩷ۖ;)V

    return-void

    .line 58
    :cond_2
    invoke-virtual {p0, p2}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public static ֫(Ll/۟ۜۖ;Ll/ܳ֨ۖ;Ll/ᩳۘۖ;Ll/ᩳۖۖ;Ll/֨֡ۖ;I)Z
    .locals 9

    .line 1109
    invoke-virtual {p3}, Ll/ᩳۖۖ;->۠()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ᩴ()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_7

    const/16 v0, 0xb

    if-ne p5, v0, :cond_7

    move-object p5, v2

    .line 1305
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ll/۟ۜۖ;->ܶ()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    if-ne v0, v4, :cond_2

    .line 1311
    invoke-virtual {p0}, Ll/۟ۜۖ;->᩸()I

    move-result v1

    if-eqz v1, :cond_0

    .line 1318
    instance-of v0, p2, Ll/֫ۘۖ;

    if-eqz v0, :cond_0

    .line 1319
    move-object p5, p2

    check-cast p5, Ll/֫ۘۖ;

    .line 1320
    invoke-interface {p4, p5, p3, v1}, Ll/֨֡ۖ;->֫(Ll/֫ۘۖ;Ll/ᩳۖۖ;I)Ll/۟ۖۖ;

    move-result-object p5

    goto :goto_0

    :cond_2
    const/16 v4, 0x1a

    if-ne v0, v4, :cond_4

    if-eqz v1, :cond_3

    if-eqz p5, :cond_3

    .line 1326
    sget-object v0, Ll/ᩳۘۖ;->ۧ:Ll/ᩳۘۖ;

    .line 1335
    :cond_3
    invoke-virtual {p0}, Ll/۟ۜۖ;->ܳ()Ll/ۛۜۖ;

    move-result-object v2

    goto :goto_0

    .line 1338
    :cond_4
    invoke-virtual {p0, v0}, Ll/۟ۜۖ;->ᩳ(I)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_1
    const/16 p3, 0xc

    .line 1343
    invoke-virtual {p0, p3}, Ll/۟ۜۖ;->֫(I)V

    if-eqz v2, :cond_19

    if-eqz v1, :cond_19

    if-eqz p5, :cond_6

    .line 1365
    iget-object p0, p5, Ll/۟ۖۖ;->ۧ:Ll/֡ۖۖ;

    iget-object p1, p5, Ll/۟ۖۖ;->֫:Ll/᩻֡ۖ;

    .line 1366
    invoke-interface {p4, p0}, Ll/֨֡ۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result p3

    if-nez p3, :cond_5

    .line 1368
    sget-object p3, Ll/ᩳۘۖ;->ۧ:Ll/ᩳۘۖ;

    .line 1376
    new-instance p3, Ll/ۡ᩵ۖ;

    invoke-direct {p3, p1, p2, v2}, Ll/ۡ᩵ۖ;-><init>(Ll/᩻֡ۖ;Ll/ᩳۘۖ;Ll/ۛۜۖ;)V

    .line 1377
    invoke-interface {p4, p0, p3}, Ll/֨֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return v3

    .line 1371
    :cond_5
    invoke-interface {p4, v2, p2, p0, p1}, Ll/֨֡ۖ;->֫(Ll/ۛۜۖ;Ll/ᩳۘۖ;Ll/֡ۖۖ;Ll/᩻֡ۖ;)Ll/᩻֡ۖ;

    move-result-object p1

    .line 1373
    invoke-interface {p4, p0, p1}, Ll/֨֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return v3

    :cond_6
    if-eqz p1, :cond_19

    .line 1352
    sget p0, Ll/ۜ֨ۖ;->ܳ:I

    .line 663
    invoke-static {}, Ll/᩻֨ۖ;->ۧ()Ll/᩻֨ۖ;

    move-result-object p0

    .line 1352
    invoke-virtual {p0, v2}, Ll/᩻֨ۖ;->֫(Ll/ۛۜۖ;)V

    invoke-virtual {p0}, Ll/᩻֨ۖ;->֫()Ll/ۜ֨ۖ;

    move-result-object p0

    .line 1351
    invoke-virtual {p1, v1, p0}, Ll/ܳ֨ۖ;->֫(ILl/ۜ֨ۖ;)V

    return v3

    :cond_7
    and-int/lit8 v0, p5, 0x7

    ushr-int/lit8 v4, p5, 0x3

    .line 1121
    invoke-virtual {p3, v4}, Ll/ᩳۖۖ;->ۧ(I)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 1127
    instance-of v5, p2, Ll/֫ۘۖ;

    if-eqz v5, :cond_b

    .line 1128
    move-object v5, p2

    check-cast v5, Ll/֫ۘۖ;

    .line 1129
    invoke-interface {p4, v5, p3, v4}, Ll/֨֡ۖ;->֫(Ll/֫ۘۖ;Ll/ᩳۖۖ;I)Ll/۟ۖۖ;

    move-result-object p3

    if-nez p3, :cond_8

    goto :goto_2

    .line 1133
    :cond_8
    iget-object v2, p3, Ll/۟ۖۖ;->ۧ:Ll/֡ۖۖ;

    .line 1134
    iget-object p3, p3, Ll/۟ۖۖ;->֫:Ll/᩻֡ۖ;

    if-nez p3, :cond_c

    .line 1136
    invoke-virtual {v2}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v5

    sget-object v6, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-eq v5, v6, :cond_9

    goto :goto_3

    .line 1137
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Message-typed extension lacked default instance: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1138
    invoke-virtual {v2}, Ll/֡ۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1144
    :cond_a
    invoke-interface {p4}, Ll/֨֡ۖ;->֫()Ll/ۚ֡ۖ;

    move-result-object v5

    sget-object v6, Ll/ۚ֡ۖ;->᩶:Ll/ۚ֡ۖ;

    if-ne v5, v6, :cond_b

    .line 1145
    invoke-virtual {p3, v4}, Ll/ᩳۖۖ;->֫(I)Ll/֡ۖۖ;

    move-result-object p3

    move-object v8, v2

    move-object v2, p3

    move-object p3, v8

    goto :goto_3

    :cond_b
    :goto_2
    move-object p3, v2

    :cond_c
    :goto_3
    const/4 v5, 0x2

    if-nez v2, :cond_d

    goto :goto_4

    .line 1155
    :cond_d
    invoke-virtual {v2}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v6

    sget v7, Ll/᩵ۘۖ;->ᩳ:I

    .line 475
    invoke-virtual {v6}, Ll/۟֨ۖ;->ۧ()I

    move-result v6

    if-ne v0, v6, :cond_e

    const/4 v0, 0x0

    goto :goto_5

    .line 1157
    :cond_e
    invoke-virtual {v2}, Ll/֡ۖۖ;->ۤ()Z

    move-result v6

    if-eqz v6, :cond_f

    .line 1159
    invoke-virtual {v2}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    if-ne v0, v5, :cond_f

    const/4 v0, 0x1

    goto :goto_5

    :cond_f
    :goto_4
    const/4 v0, 0x0

    const/4 v1, 0x1

    :goto_5
    if-eqz v1, :cond_11

    if-eqz p1, :cond_10

    .line 1167
    invoke-virtual {p1, p5, p0}, Ll/ܳ֨ۖ;->֫(ILl/۟ۜۖ;)Z

    move-result p0

    return p0

    .line 1169
    :cond_10
    invoke-virtual {p0, p5}, Ll/۟ۜۖ;->ᩳ(I)Z

    move-result p0

    return p0

    :cond_11
    if-eqz v0, :cond_17

    .line 1174
    invoke-virtual {p0}, Ll/۟ۜۖ;->ۘ()I

    move-result p2

    .line 1175
    invoke-virtual {p0, p2}, Ll/۟ۜۖ;->ܽ(I)I

    move-result p2

    .line 1176
    invoke-virtual {v2}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object p3

    sget-object p5, Ll/۟֨ۖ;->۫:Ll/۟֨ۖ;

    if-ne p3, p5, :cond_15

    .line 1177
    :cond_12
    :goto_6
    invoke-virtual {p0}, Ll/۟ۜۖ;->ۧ()I

    move-result p3

    if-lez p3, :cond_16

    .line 1178
    invoke-virtual {p0}, Ll/۟ۜۖ;->ۜ()I

    move-result p3

    .line 1179
    invoke-virtual {v2}, Ll/֡ۖۖ;->ۨ()Z

    move-result p5

    if-eqz p5, :cond_14

    .line 1180
    invoke-virtual {v2}, Ll/֡ۖۖ;->ۚ()Ll/ۢۖۖ;

    move-result-object p5

    invoke-virtual {p5, p3}, Ll/ۢۖۖ;->֫(I)Ll/ۖۖۖ;

    move-result-object p5

    if-nez p5, :cond_13

    if-eqz p1, :cond_12

    .line 1185
    invoke-virtual {p1, v4, p3}, Ll/ܳ֨ۖ;->֫(II)V

    goto :goto_6

    .line 1188
    :cond_13
    invoke-interface {p4, v2, p5}, Ll/֨֡ۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    goto :goto_6

    .line 1192
    :cond_14
    invoke-virtual {v2}, Ll/֡ۖۖ;->ۚ()Ll/ۢۖۖ;

    move-result-object p5

    invoke-virtual {p5, p3}, Ll/ۢۖۖ;->ۧ(I)Ll/ۖۖۖ;

    move-result-object p3

    .line 1191
    invoke-interface {p4, v2, p3}, Ll/֨֡ۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    goto :goto_6

    .line 1196
    :cond_15
    :goto_7
    invoke-virtual {p0}, Ll/۟ۜۖ;->ۧ()I

    move-result p1

    if-lez p1, :cond_16

    .line 1199
    invoke-virtual {v2}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object p1

    invoke-interface {p4, v2}, Ll/֨֡ۖ;->֫(Ll/֡ۖۖ;)Ll/ܿ۠ۖ;

    move-result-object p3

    .line 1198
    invoke-static {p0, p1, p3}, Ll/ܳ۠ۖ;->֫(Ll/۟ۜۖ;Ll/۟֨ۖ;Ll/ܿ۠ۖ;)Ljava/lang/Object;

    move-result-object p1

    .line 1200
    invoke-interface {p4, v2, p1}, Ll/֨֡ۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    goto :goto_7

    .line 1203
    :cond_16
    invoke-virtual {p0, p2}, Ll/۟ۜۖ;->ۧ(I)V

    return v3

    .line 1206
    :cond_17
    sget-object p5, Ll/ᩴ֡ۖ;->֫:[I

    invoke-virtual {v2}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p5, p5, v0

    if-eq p5, v3, :cond_1e

    if-eq p5, v5, :cond_1d

    const/4 p2, 0x3

    if-eq p5, p2, :cond_18

    .line 1236
    invoke-virtual {v2}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object p1

    invoke-interface {p4, v2}, Ll/֨֡ۖ;->֫(Ll/֡ۖۖ;)Ll/ܿ۠ۖ;

    move-result-object p2

    .line 1235
    invoke-static {p0, p1, p2}, Ll/ܳ۠ۖ;->֫(Ll/۟ۜۖ;Ll/۟֨ۖ;Ll/ܿ۠ۖ;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_8

    .line 1218
    :cond_18
    invoke-virtual {p0}, Ll/۟ۜۖ;->ۜ()I

    move-result p0

    .line 1219
    invoke-virtual {v2}, Ll/֡ۖۖ;->ۨ()Z

    move-result p2

    if-eqz p2, :cond_1b

    .line 1220
    invoke-virtual {v2}, Ll/֡ۖۖ;->ۚ()Ll/ۢۖۖ;

    move-result-object p2

    invoke-virtual {p2, p0}, Ll/ۢۖۖ;->֫(I)Ll/ۖۖۖ;

    move-result-object p2

    if-nez p2, :cond_1a

    if-eqz p1, :cond_19

    .line 1225
    invoke-virtual {p1, v4, p0}, Ll/ܳ֨ۖ;->֫(II)V

    :cond_19
    return v3

    :cond_1a
    move-object p0, p2

    goto :goto_8

    .line 1230
    :cond_1b
    invoke-virtual {v2}, Ll/֡ۖۖ;->ۚ()Ll/ۢۖۖ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/ۢۖۖ;->ۧ(I)Ll/ۖۖۖ;

    move-result-object p0

    .line 1240
    :goto_8
    invoke-virtual {v2}, Ll/֡ۖۖ;->۟֫()Z

    move-result p1

    if-eqz p1, :cond_1c

    .line 1241
    invoke-interface {p4, v2, p0}, Ll/֨֡ۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return v3

    .line 1243
    :cond_1c
    invoke-interface {p4, v2, p0}, Ll/֨֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return v3

    .line 1214
    :cond_1d
    invoke-interface {p4, p0, p2, v2, p3}, Ll/֨֡ۖ;->֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;Ll/֡ۖۖ;Ll/᩻֡ۖ;)V

    return v3

    .line 1209
    :cond_1e
    invoke-interface {p4, p0, p2, v2, p3}, Ll/֨֡ۖ;->ۧ(Ll/۟ۜۖ;Ll/ᩳۘۖ;Ll/֡ۖۖ;Ll/᩻֡ۖ;)V

    return v3
.end method
