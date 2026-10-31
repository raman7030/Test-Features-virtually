.class public final Ll/ܳܿ֨;
.super Ll/ۨܽ֨;
.source "S7FD"


# static fields
.field public static final synthetic ᩷ۧ:I


# instance fields
.field public ۜۧ:I

.field public ᩻ۧ:I


# virtual methods
.method public final ֫(Ljava/io/DataInputStream;Ll/ۙ۬ۚ;I)Z
    .locals 4

    .line 104
    sget-object v0, Ll/ۙ۬ۚ;->۠֫:Ll/ۙ۬ۚ;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    .line 105
    iget-object p2, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    .line 106
    iget-object p2, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Signature"

    aput-object v3, v2, v1

    const-string v1, "record_component_info"

    aput-object v1, v2, v0

    const-string v1, "There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used."

    invoke-virtual {p2, v1, v2}, Ll/᩶ۗۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :cond_0
    new-instance p2, Ll/ۜܿ֨;

    iget-object v1, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v1, Ll/᩷ۧ֨;

    invoke-direct {p2, v1}, Ll/ۜܿ֨;-><init>(Ll/᩷ۧ֨;)V

    invoke-virtual {p2, p3, p1}, Ll/ۜܿ֨;->֫(ILjava/io/DataInputStream;)V

    iput-object p2, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    return v0

    :cond_1
    return v1
.end method

.method public final ۧ(II)V
    .locals 11

    .line 136
    iget-object p1, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 68
    iget-boolean p1, p1, Ll/ۢܽ֨;->۬:Z

    if-nez p1, :cond_0

    .line 136
    iget-boolean p1, p0, Ll/ۢܽ֨;->ᩴ֫:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 138
    :goto_0
    iget-object v1, p0, Ll/ۨܽ֨;->ܿۧ:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۨܽ֨;->ۨ֫:Ljava/util/ArrayList;

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/util/List;

    aput-object v1, v4, p2

    aput-object v2, v4, v0

    invoke-virtual {p0, v4}, Ll/ۨܽ֨;->֫([Ljava/util/List;)V

    .line 139
    iget-object v1, p0, Ll/ۨܽ֨;->ܳۧ:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۨܽ֨;->᩺֫:Ljava/util/ArrayList;

    new-array v4, v3, [Ljava/util/List;

    aput-object v1, v4, p2

    aput-object v2, v4, v0

    invoke-virtual {p0, v4}, Ll/ۨܽ֨;->֫([Ljava/util/List;)V

    .line 141
    invoke-virtual {p0}, Ll/ۢܽ֨;->ۡ()I

    move-result p2

    invoke-virtual {p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v1, p2

    sub-int/2addr v1, v3

    .line 143
    invoke-virtual {p0}, Ll/ۨܽ֨;->᩸()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/ۢܽ֨;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    sget-object v2, Ll/ܶۨۚ;->᩻ۧ:Ll/ܶۨۚ;

    invoke-virtual {v2}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 142
    invoke-virtual {p0, v1, p2}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 144
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    const-string p2, ":"

    goto :goto_1

    :cond_1
    const-string p2, ";"

    :goto_1
    move-object v7, p2

    .line 145
    iget v8, p0, Ll/ܳܿ֨;->ۜۧ:I

    iget v9, p0, Ll/ܳܿ֨;->᩻ۧ:I

    const/4 v10, -0x1

    const/4 v6, 0x0

    move-object v4, p0

    .line 144
    invoke-virtual/range {v4 .. v10}, Ll/ۨܽ֨;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;III)V

    if-eqz p1, :cond_2

    .line 149
    invoke-virtual {p0}, Ll/ۢܽ֨;->ܳ()I

    move-result p1

    add-int/2addr p1, v3

    sub-int/2addr v1, p1

    .line 150
    iget-object p1, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    invoke-virtual {p1, v1}, Ll/ۜܿ֨;->ۡ(I)V

    .line 260
    invoke-virtual {p1, v0}, Ll/ۢܽ֨;->ᩳ(I)V

    invoke-virtual {p1, v0}, Ll/ۢܽ֨;->ᩳ(I)V

    .line 394
    iget p2, p0, Ll/ۢܽ֨;->᩶:I

    .line 151
    invoke-virtual {p0}, Ll/ۢܽ֨;->᩻()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    sub-int/2addr p2, v0

    sub-int/2addr p2, v3

    .line 398
    iput p2, p1, Ll/ۢܽ֨;->᩶:I

    .line 152
    iget-object p1, p0, Ll/ۨܽ֨;->ᩳۧ:Ll/ۜܿ֨;

    invoke-virtual {p1}, Ll/ۢܽ֨;->ۧ()V

    :cond_2
    return-void
.end method

.method public final ۧ(Ljava/io/DataInputStream;)V
    .locals 8

    .line 120
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    iput v0, p0, Ll/ܳܿ֨;->ۜۧ:I

    .line 121
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    iput v0, p0, Ll/ܳܿ֨;->᩻ۧ:I

    .line 122
    iget-object v0, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    iget v1, p0, Ll/ܳܿ֨;->ۜۧ:I

    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v2, Ll/᩷ۧ֨;

    iget-object v2, v2, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v3, p0, Ll/ܳܿ֨;->ۜۧ:I

    new-instance v4, Ll/᩹᩻ܽ;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Ll/᩹᩻ܽ;-><init>(I)V

    invoke-virtual {v2, v3, v4}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Ll/ܳܿ֨;->᩻ۧ:I

    .line 125
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v4, Ll/᩷ۧ֨;

    iget-object v4, v4, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v6, p0, Ll/ܳܿ֨;->᩻ۧ:I

    new-instance v7, Ll/᩹᩻ܽ;

    invoke-direct {v7, v5}, Ll/᩹᩻ܽ;-><init>(I)V

    invoke-virtual {v4, v6, v7}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v1, 0x1

    aput-object v2, v6, v1

    const/4 v1, 0x2

    aput-object v3, v6, v1

    aput-object v4, v6, v5

    const-string v1, "RecordComponent: name[%d]=%s descriptor[%d]=%s"

    .line 19
    invoke-static {v1, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/Object;

    .line 122
    invoke-virtual {v0, v1, v2}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    invoke-virtual {p0, p1}, Ll/ۨܽ֨;->֫(Ljava/io/DataInputStream;)V

    return-void
.end method

.method public final ᩳ(II)V
    .locals 0

    .line 159
    invoke-virtual {p0, p1, p2}, Ll/ܳܿ֨;->ۧ(II)V

    return-void
.end method
