.class public final Ll/᩷ۜܺ;
.super Ll/ܺۜܺ;
.source "U4WH"


# virtual methods
.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 41
    sget-object v0, Ll/ۘۜܺ;->ܿ֫:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 11

    .line 65
    invoke-virtual {p1}, Ll/֫ۜܺ;->ۢ()Ll/ۙۜܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۜܺ;->ܽ()I

    move-result v0

    .line 66
    invoke-virtual {p1}, Ll/֫ۜܺ;->ۜ()Ll/ۙۜܺ;

    move-result-object v1

    .line 67
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩷()Ll/ۙۜܺ;

    move-result-object v2

    .line 68
    invoke-virtual {v1}, Ll/ۛۜܺ;->ܽ()I

    move-result v1

    .line 69
    invoke-virtual {v2}, Ll/ۛۜܺ;->ܽ()I

    move-result v3

    .line 70
    invoke-virtual {v2}, Ll/ۙۜܺ;->᩷()I

    move-result v2

    add-int/2addr v2, v3

    sub-int/2addr v2, v1

    .line 72
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܿ()Ll/ۢܿܺ;

    move-result-object v3

    .line 76
    iget v3, v3, Ll/ۢܿܺ;->ܽ:I

    const/16 v4, 0x18

    const-string v5, "039"

    const/16 v6, 0x1c

    if-lt v3, v6, :cond_0

    goto :goto_0

    :cond_0
    const/16 v7, 0x2710

    if-lt v3, v7, :cond_1

    const-string v5, "040"

    goto :goto_0

    :cond_1
    if-lt v3, v6, :cond_2

    goto :goto_0

    :cond_2
    const/16 v5, 0x1a

    if-lt v3, v5, :cond_3

    const-string v5, "038"

    goto :goto_0

    :cond_3
    if-lt v3, v4, :cond_4

    const-string v5, "037"

    goto :goto_0

    :cond_4
    const-string v5, "035"

    :goto_0
    const-string v3, "dex\n"

    const-string v6, "\u0000"

    .line 0
    invoke-static {v3, v5, v6}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 74
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v5

    const v6, 0x12345678

    const/16 v7, 0x70

    const/16 v8, 0x8

    const/4 v9, 0x4

    if-eqz v5, :cond_5

    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, "magic: "

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v10, Ll/۬ܺܺ;

    invoke-direct {v10, v3}, Ll/۬ܺܺ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ll/۬ܺܺ;->ۚ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v8, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    const-string v5, "checksum"

    .line 76
    invoke-virtual {p2, v9, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    const/16 v5, 0x14

    const-string v10, "signature"

    .line 77
    invoke-virtual {p2, v5, v10}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 79
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩻()I

    move-result v5

    invoke-static {v5}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v5

    const-string v10, "file_size:       "

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 78
    invoke-virtual {p2, v9, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 80
    invoke-static {v7}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v5

    const-string v10, "header_size:     "

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v9, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 81
    invoke-static {v6}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v5

    const-string v10, "endian_tag:      "

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v9, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    const-string v5, "link_size:       0"

    .line 82
    invoke-virtual {p2, v9, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    const-string v5, "link_off:        0"

    .line 83
    invoke-virtual {p2, v9, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 84
    invoke-static {v0}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v5

    const-string v10, "map_off:         "

    invoke-virtual {v10, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v9, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    :cond_5
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v8, :cond_6

    .line 89
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-virtual {p2, v10}, Ll/ᩳᩴܺ;->ᩳ(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 93
    :cond_6
    invoke-virtual {p2, v4}, Ll/ᩳᩴܺ;->᩷(I)V

    .line 95
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩻()I

    move-result v3

    invoke-virtual {p2, v3}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 96
    invoke-virtual {p2, v7}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 97
    invoke-virtual {p2, v6}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 103
    invoke-virtual {p2, v8}, Ll/ᩳᩴܺ;->᩷(I)V

    .line 105
    invoke-virtual {p2, v0}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 108
    invoke-virtual {p1}, Ll/֫ۜܺ;->ᩴ()Ll/֫᩷ܺ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/֫᩷ܺ;->ܽ(Ll/ᩳᩴܺ;)V

    .line 109
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/ܽ᩷ܺ;->ܽ(Ll/ᩳᩴܺ;)V

    .line 110
    invoke-virtual {p1}, Ll/֫ۜܺ;->ۖ()Ll/ۤۜܺ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/ۤۜܺ;->ܽ(Ll/ᩳᩴܺ;)V

    .line 111
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܳ()Ll/ۜۜܺ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/ۜۜܺ;->ܽ(Ll/ᩳᩴܺ;)V

    .line 112
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܺ()Ll/᩸ۜܺ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/᩸ۜܺ;->ܽ(Ll/ᩳᩴܺ;)V

    .line 113
    invoke-virtual {p1}, Ll/֫ۜܺ;->ᩳ()Ll/۬᩻ܺ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/۬᩻ܺ;->ܽ(Ll/ᩳᩴܺ;)V

    .line 115
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 116
    invoke-static {v2}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "data_size:       "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v9, p1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 117
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "data_off:        "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v9, p1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 120
    :cond_7
    invoke-virtual {p2, v2}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 121
    invoke-virtual {p2, v1}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/16 v0, 0x70

    return v0
.end method
