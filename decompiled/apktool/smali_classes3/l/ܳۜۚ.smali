.class public final Ll/ܳۜۚ;
.super Ljava/lang/Object;
.source "54MI"


# direct methods
.method public static ֫(Ll/ۚܽۚ;Z)Ljava/lang/String;
    .locals 2

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    if-nez p1, :cond_0

    .line 70
    invoke-interface {p0}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "->"

    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    :cond_0
    invoke-interface {p0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x28

    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    invoke-interface {p0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const/16 p1, 0x29

    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    invoke-interface {p0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩴܽۚ;)Ljava/lang/String;
    .locals 4

    .line 183
    invoke-interface {p0}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 184
    invoke-interface {p0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p0

    .line 186
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v2

    add-int/lit8 v3, v3, 0x1

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 187
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3a

    .line 188
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 189
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩴܽۚ;Z)Ljava/lang/String;
    .locals 5

    .line 160
    invoke-interface {p0}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 161
    invoke-interface {p0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3a

    if-nez p1, :cond_0

    .line 163
    invoke-interface {p0}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object p0

    .line 165
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x3

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 166
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "->"

    .line 167
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 174
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, p1

    add-int/lit8 v3, v3, 0x1

    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 175
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 177
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/Writer;Ll/֡ܽۚ;)V
    .locals 3

    .line 96
    instance-of v0, p1, Ll/᩶ܰ֡;

    const/16 v1, 0x29

    const/16 v2, 0x28

    if-eqz v0, :cond_0

    .line 97
    check-cast p1, Ll/᩶ܰ֡;

    .line 98
    invoke-virtual {p0, v2}, Ljava/io/Writer;->write(I)V

    .line 99
    invoke-virtual {p1, p0}, Ll/᩶ܰ֡;->֫(Ljava/io/Writer;)V

    .line 100
    invoke-virtual {p0, v1}, Ljava/io/Writer;->write(I)V

    .line 101
    invoke-virtual {p1, p0}, Ll/᩶ܰ֡;->ۧ(Ljava/io/Writer;)V

    return-void

    .line 103
    :cond_0
    invoke-virtual {p0, v2}, Ljava/io/Writer;->write(I)V

    .line 104
    invoke-interface {p1}, Ll/֡ܽۚ;->ۘ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    .line 105
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {p0, v1}, Ljava/io/Writer;->write(I)V

    .line 108
    invoke-interface {p1}, Ll/֡ܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/io/Writer;Ll/ۚܽۚ;Z)V
    .locals 4

    .line 118
    instance-of v0, p1, Ll/ۗܰ֡;

    const/16 v1, 0x29

    const/16 v2, 0x28

    const-string v3, "->"

    if-eqz v0, :cond_1

    .line 119
    check-cast p1, Ll/ۗܰ֡;

    if-nez p2, :cond_0

    .line 121
    invoke-virtual {p1, p0}, Ll/ۗܰ֡;->֫(Ljava/io/Writer;)V

    .line 122
    invoke-virtual {p0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 124
    :cond_0
    invoke-virtual {p1, p0}, Ll/ۗܰ֡;->ۧ(Ljava/io/Writer;)V

    .line 125
    invoke-virtual {p0, v2}, Ljava/io/Writer;->write(I)V

    .line 126
    invoke-virtual {p1, p0}, Ll/ۗܰ֡;->ܽ(Ljava/io/Writer;)V

    .line 127
    invoke-virtual {p0, v1}, Ljava/io/Writer;->write(I)V

    .line 128
    invoke-virtual {p1, p0}, Ll/ۗܰ֡;->ᩳ(Ljava/io/Writer;)V

    return-void

    .line 129
    :cond_1
    instance-of v0, p1, Ll/ܽۨ֡;

    if-eqz v0, :cond_3

    .line 130
    check-cast p1, Ll/ܽۨ֡;

    if-nez p2, :cond_2

    .line 187
    iget-object p2, p1, Ll/ܽۨ֡;->᩹:Ll/۠ۛ֡;

    invoke-virtual {p2, p0}, Ll/۠ۛ֡;->֫(Ljava/io/Writer;)V

    .line 133
    invoke-virtual {p0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 135
    :cond_2
    invoke-virtual {p1, p0}, Ll/ܽۨ֡;->֫(Ljava/io/Writer;)V

    .line 136
    invoke-virtual {p0, v2}, Ljava/io/Writer;->write(I)V

    .line 137
    invoke-virtual {p1, p0}, Ll/ܽۨ֡;->ۧ(Ljava/io/Writer;)V

    .line 138
    invoke-virtual {p0, v1}, Ljava/io/Writer;->write(I)V

    .line 139
    invoke-virtual {p1, p0}, Ll/ܽۨ֡;->ܽ(Ljava/io/Writer;)V

    return-void

    :cond_3
    if-nez p2, :cond_4

    .line 142
    invoke-interface {p1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 143
    invoke-virtual {p0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 145
    :cond_4
    invoke-interface {p1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 146
    invoke-virtual {p0, v2}, Ljava/io/Writer;->write(I)V

    .line 147
    invoke-interface {p1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    .line 148
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_0

    .line 150
    :cond_5
    invoke-virtual {p0, v1}, Ljava/io/Writer;->write(I)V

    .line 151
    invoke-interface {p1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/io/Writer;Ll/ᩴܽۚ;Z)V
    .locals 3

    .line 199
    instance-of v0, p1, Ll/ܶܰ֡;

    const/16 v1, 0x3a

    const-string v2, "->"

    if-eqz v0, :cond_1

    .line 200
    check-cast p1, Ll/ܶܰ֡;

    if-nez p2, :cond_0

    .line 202
    invoke-virtual {p1, p0}, Ll/ܶܰ֡;->֫(Ljava/io/Writer;)V

    .line 203
    invoke-virtual {p0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 205
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܶܰ֡;->ۧ(Ljava/io/Writer;)V

    .line 206
    invoke-virtual {p0, v1}, Ljava/io/Writer;->write(I)V

    .line 207
    invoke-virtual {p1, p0}, Ll/ܶܰ֡;->ܽ(Ljava/io/Writer;)V

    return-void

    :cond_1
    if-nez p2, :cond_2

    .line 210
    invoke-interface {p1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 211
    invoke-virtual {p0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 213
    :cond_2
    invoke-interface {p1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 214
    invoke-virtual {p0, v1}, Ljava/io/Writer;->write(I)V

    .line 215
    invoke-interface {p1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/io/Writer;Ll/᩵ܽۚ;)V
    .locals 2

    .line 232
    invoke-interface {p1}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v0

    invoke-static {v0}, Ll/֡ۗ֡;->֫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v0, 0x40

    .line 233
    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(I)V

    .line 235
    invoke-interface {p1}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object p1

    .line 236
    instance-of v0, p1, Ll/ۚܽۚ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 237
    check-cast p1, Ll/ۚܽۚ;

    .line 113
    invoke-static {p0, p1, v1}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/ۚܽۚ;Z)V

    return-void

    .line 239
    :cond_0
    check-cast p1, Ll/ᩴܽۚ;

    .line 194
    invoke-static {p0, p1, v1}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/ᩴܽۚ;Z)V

    return-void
.end method
