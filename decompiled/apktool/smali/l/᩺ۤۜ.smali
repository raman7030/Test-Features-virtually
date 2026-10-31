.class public final Ll/᩺ۤۜ;
.super Ljava/lang/Object;
.source "77HF"


# direct methods
.method public static ֫(Ljava/lang/String;)J
    .locals 9

    .line 152
    invoke-static {}, Ll/᩺ۤۜ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    .line 154
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨۤۜ;

    .line 155
    iget-object v5, v2, Ll/ۨۤۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 156
    iget-wide v5, v2, Ll/ۨۤۜ;->ᩳ:J

    cmp-long p0, v5, v3

    if-lez p0, :cond_1

    iget-wide v7, v2, Ll/ۨۤۜ;->֫:J

    cmp-long p0, v5, v7

    if-gtz p0, :cond_1

    .line 157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Ll/ۨۤۜ;->ۧ:J

    .line 158
    invoke-static {v0}, Ll/᩺ۤۜ;->֫(Ljava/util/ArrayList;)V

    .line 159
    iget-wide v0, v2, Ll/ۨۤۜ;->ᩳ:J

    return-wide v0

    :cond_1
    return-wide v3
.end method

.method public static ֫()Ljava/util/ArrayList;
    .locals 13

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 200
    :try_start_0
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "vpp"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[B)[B

    move-result-object v1

    .line 201
    invoke-static {v1}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object v1

    const v2, 0x65451254

    .line 202
    invoke-virtual {v1, v2}, Ll/۬ۜܽ;->֫(I)Z

    .line 203
    invoke-virtual {v1}, Ll/۬ۜܽ;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 55
    new-instance v12, Ll/ۨۤۜ;

    .line 56
    invoke-virtual {v1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v5

    .line 57
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    .line 58
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v8

    .line 59
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v10

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Ll/ۨۤۜ;-><init>(Ljava/lang/String;JJJ)V

    .line 205
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 209
    :catch_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;JJ)V
    .locals 11

    const-wide/32 v0, 0x2bf20

    cmp-long v2, p3, v0

    if-gez v2, :cond_0

    return-void

    :cond_0
    const-wide/16 v0, 0x1388

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    .line 80
    invoke-static {p0}, Ll/᩺ۤۜ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_1
    sub-long v0, p3, p1

    const-wide/16 v2, 0x2710

    cmp-long v4, v0, v2

    if-gez v4, :cond_2

    .line 86
    invoke-static {p0}, Ll/᩺ۤۜ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 91
    :cond_2
    invoke-static {}, Ll/᩺ۤۜ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨۤۜ;

    .line 96
    iget-object v3, v2, Ll/ۨۤۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    .line 102
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    if-eqz v2, :cond_5

    .line 106
    iput-wide p1, v2, Ll/ۨۤۜ;->ᩳ:J

    .line 107
    iput-wide p3, v2, Ll/ۨۤۜ;->֫:J

    .line 108
    iput-wide v9, v2, Ll/ۨۤۜ;->ۧ:J

    goto :goto_1

    .line 111
    :cond_5
    new-instance v1, Ll/ۨۤۜ;

    move-object v3, v1

    move-object v4, p0

    move-wide v5, p1

    move-wide v7, p3

    invoke-direct/range {v3 .. v10}, Ll/ۨۤۜ;-><init>(Ljava/lang/String;JJJ)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/16 p1, 0x64

    if-gt p0, p1, :cond_6

    goto :goto_3

    .line 243
    :cond_6
    new-instance p0, Ll/ۛۤۜ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 246
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-le p0, p1, :cond_7

    const/4 p0, 0x1

    .line 0
    invoke-static {v0, p0}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_2

    .line 118
    :cond_7
    :goto_3
    invoke-static {v0}, Ll/᩺ۤۜ;->֫(Ljava/util/ArrayList;)V

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 4

    const v0, 0x65451254

    .line 0
    invoke-static {v0}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v0

    .line 223
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 224
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۤۜ;

    .line 48
    iget-object v2, v1, Ll/ۨۤۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 49
    iget-wide v2, v1, Ll/ۨۤۜ;->ᩳ:J

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 50
    iget-wide v2, v1, Ll/ۨۤۜ;->֫:J

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 51
    iget-wide v1, v1, Ll/ۨۤۜ;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    goto :goto_0

    .line 227
    :cond_0
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    const-string v1, "vpp"

    .line 228
    invoke-virtual {v0}, Ll/ۤۜܽ;->ۖ()[B

    move-result-object v0

    invoke-interface {p0, v1, v0}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[B)Ll/۬ۤۡ;

    move-result-object p0

    .line 229
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 3

    .line 174
    invoke-static {}, Ll/᩺ۤۜ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    .line 178
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 179
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨۤۜ;

    iget-object v2, v2, Ll/ۨۤۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 180
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 187
    invoke-static {v0}, Ll/᩺ۤۜ;->֫(Ljava/util/ArrayList;)V

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
