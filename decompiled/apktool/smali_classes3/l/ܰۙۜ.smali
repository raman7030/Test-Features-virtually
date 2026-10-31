.class public final Ll/ܰۙۜ;
.super Ljava/lang/Object;
.source "P7FQ"


# direct methods
.method public static ֫(Ljava/lang/String;)I
    .locals 5

    .line 80
    invoke-static {}, Ll/ܰۙۜ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۙۜ;

    .line 82
    iget-object v3, v2, Ll/᩺ۙۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 83
    iget p0, v2, Ll/᩺ۙۜ;->ۧ:I

    if-ltz p0, :cond_1

    .line 84
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Ll/᩺ۙۜ;->֫:J

    .line 85
    invoke-static {v0}, Ll/ܰۙۜ;->֫(Ljava/util/ArrayList;)V

    .line 86
    iget p0, v2, Ll/᩺ۙۜ;->ۧ:I

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫()Ljava/util/ArrayList;
    .locals 9

    .line 110
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 112
    :try_start_0
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "vats"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[B)[B

    move-result-object v1

    if-eqz v1, :cond_1

    .line 113
    array-length v2, v1

    if-nez v2, :cond_0

    goto :goto_1

    .line 116
    :cond_0
    invoke-static {v1}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object v1

    const v2, 0x65451256

    .line 117
    invoke-virtual {v1, v2}, Ll/۬ۜܽ;->֫(I)Z

    .line 118
    invoke-virtual {v1}, Ll/۬ۜܽ;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 41
    new-instance v4, Ll/᩺ۙۜ;

    .line 42
    invoke-virtual {v1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v5

    .line 43
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    .line 44
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Ll/᩺ۙۜ;-><init>(Ljava/lang/String;IJ)V

    .line 120
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0

    .line 124
    :catch_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-object v0
.end method

.method public static ֫(ILjava/lang/String;)V
    .locals 5

    if-gez p0, :cond_0

    .line 54
    invoke-static {p1}, Ll/ܰۙۜ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 57
    :cond_0
    invoke-static {}, Ll/ܰۙۜ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۙۜ;

    .line 60
    iget-object v3, v2, Ll/᩺ۙۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 65
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    if-eqz v2, :cond_3

    .line 67
    iput p0, v2, Ll/᩺ۙۜ;->ۧ:I

    .line 68
    iput-wide v3, v2, Ll/᩺ۙۜ;->֫:J

    goto :goto_1

    .line 70
    :cond_3
    new-instance v1, Ll/᩺ۙۜ;

    invoke-direct {v1, p1, p0, v3, v4}, Ll/᩺ۙۜ;-><init>(Ljava/lang/String;IJ)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/16 p1, 0x64

    if-gt p0, p1, :cond_4

    goto :goto_3

    .line 145
    :cond_4
    new-instance p0, Ll/ۨۙۜ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 146
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-le p0, p1, :cond_5

    const/4 p0, 0x1

    .line 0
    invoke-static {v0, p0}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_2

    .line 73
    :cond_5
    :goto_3
    invoke-static {v0}, Ll/ܰۙۜ;->֫(Ljava/util/ArrayList;)V

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 3

    const v0, 0x65451256

    .line 0
    invoke-static {v0}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v0

    .line 132
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 133
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۙۜ;

    .line 35
    iget-object v2, v1, Ll/᩺ۙۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 36
    iget v2, v1, Ll/᩺ۙۜ;->ۧ:I

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 37
    iget-wide v1, v1, Ll/᩺ۙۜ;->֫:J

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    goto :goto_0

    .line 136
    :cond_0
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    const-string v1, "vats"

    .line 137
    invoke-virtual {v0}, Ll/ۤۜܽ;->ۖ()[B

    move-result-object v0

    invoke-interface {p0, v1, v0}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[B)Ll/۬ۤۡ;

    move-result-object p0

    .line 138
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 3

    .line 95
    invoke-static {}, Ll/ܰۙۜ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    .line 97
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 98
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۙۜ;

    iget-object v2, v2, Ll/᩺ۙۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 99
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 105
    invoke-static {v0}, Ll/ܰۙۜ;->֫(Ljava/util/ArrayList;)V

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
