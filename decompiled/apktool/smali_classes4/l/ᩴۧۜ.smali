.class public final Ll/ᩴۧۜ;
.super Ljava/lang/Object;
.source "P764"


# direct methods
.method public static ֫(Ll/ۙۜۜ;)Z
    .locals 4

    .line 148
    iget-object v0, p0, Ll/ۙۜۜ;->ۢ:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-wide v0, p0, Ll/ۙۜۜ;->᩷:J

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-gez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/ۙۜۜ;Ljava/lang/String;J)Z
    .locals 1

    .line 153
    iget-object v0, p0, Ll/ۙۜۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide p0, p0, Ll/ۙۜۜ;->᩷:J

    cmp-long v0, p0, p2

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/᩻᩷ۜ;)Z
    .locals 20

    move-object/from16 v0, p0

    .line 26
    iget-object v1, v0, Ll/᩻᩷ۜ;->ۜ:Ljava/lang/String;

    iget-object v2, v0, Ll/᩻᩷ۜ;->ۡ:Ll/ۙۜۜ;

    iget-object v3, v0, Ll/᩻᩷ۜ;->ۖ:Ljava/lang/String;

    const-string v4, "native_symbol"

    .line 29
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "file_offset"

    const-string v6, "virtual"

    const-wide/16 v7, 0x0

    if-eqz v4, :cond_e

    if-eqz v2, :cond_d

    .line 48
    iget-wide v3, v2, Ll/ۙۜۜ;->ܽ:J

    iget-wide v9, v2, Ll/ۙۜۜ;->֫:J

    iget-object v11, v2, Ll/ۙۜۜ;->ܳ:Ljava/lang/String;

    iget-object v14, v2, Ll/ۙۜۜ;->ۧ:Ljava/lang/String;

    iget-object v15, v2, Ll/ۙۜۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_d

    cmp-long v16, v9, v7

    if-ltz v16, :cond_d

    .line 49
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v9

    const/16 v10, 0x1000

    if-gt v9, v10, :cond_d

    const-string v9, "imports"

    .line 91
    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    const-string v12, "relocations"

    const-string v13, "entries"

    if-nez v10, :cond_0

    const-string v10, "symbols"

    .line 92
    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_0

    .line 93
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_0

    .line 94
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    .line 98
    :cond_0
    iget v10, v2, Ll/ۙۜۜ;->᩻:I

    cmp-long v19, v3, v7

    if-ltz v19, :cond_2

    const-wide/32 v17, 0x7fffffff

    cmp-long v19, v3, v17

    if-lez v19, :cond_1

    goto :goto_0

    :cond_1
    const/16 v17, 0x1

    long-to-int v7, v3

    if-ne v10, v7, :cond_d

    goto :goto_1

    :cond_2
    :goto_0
    const/16 v17, 0x1

    if-gez v10, :cond_d

    .line 108
    :goto_1
    iget-wide v7, v2, Ll/ۙۜۜ;->ۜ:J

    iget-boolean v10, v2, Ll/ۙۜۜ;->ᩳ:Z

    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    if-eqz v10, :cond_5

    if-nez v16, :cond_5

    .line 109
    invoke-static {v2}, Ll/ᩴۧۜ;->֫(Ll/ۙۜۜ;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    .line 111
    :cond_3
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    if-nez v10, :cond_5

    if-nez v16, :cond_5

    const-wide/16 v3, 0x0

    cmp-long v5, v7, v3

    if-ltz v5, :cond_4

    .line 114
    invoke-static {v2, v6, v7, v8}, Ll/ᩴۧۜ;->֫(Ll/ۙۜۜ;Ljava/lang/String;J)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    .line 116
    :cond_4
    invoke-static {v2}, Ll/ᩴۧۜ;->֫(Ll/ۙۜۜ;)Z

    move-result v2

    if-eqz v2, :cond_5

    :goto_2
    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    goto :goto_3

    :cond_6
    if-eqz v10, :cond_7

    .line 119
    invoke-static {v2}, Ll/ᩴۧۜ;->֫(Ll/ۙۜۜ;)Z

    move-result v2

    goto :goto_3

    :cond_7
    const-wide/16 v9, 0x0

    cmp-long v12, v7, v9

    if-ltz v12, :cond_8

    .line 122
    invoke-static {v2, v6, v7, v8}, Ll/ᩴۧۜ;->֫(Ll/ۙۜۜ;Ljava/lang/String;J)Z

    move-result v2

    goto :goto_3

    :cond_8
    cmp-long v6, v3, v9

    if-ltz v6, :cond_9

    .line 126
    invoke-static {v2, v5, v3, v4}, Ll/ᩴۧۜ;->֫(Ll/ۙۜۜ;Ljava/lang/String;J)Z

    move-result v2

    goto :goto_3

    .line 129
    :cond_9
    invoke-static {v2}, Ll/ᩴۧۜ;->֫(Ll/ۙۜۜ;)Z

    move-result v2

    :goto_3
    if-nez v2, :cond_a

    goto :goto_5

    :cond_a
    const-string v2, ".name"

    .line 59
    invoke-virtual {v15, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ".demangledName"

    .line 60
    invoke-virtual {v15, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 61
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_4

    .line 63
    :cond_b
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    .line 64
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 65
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    move-object v11, v14

    .line 70
    :goto_4
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 71
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_5

    .line 74
    :cond_c
    iget-object v0, v0, Ll/᩻᩷ۜ;->ۘ:Ll/֫ܿۜ;

    if-eqz v0, :cond_15

    .line 87
    iget-object v0, v0, Ll/֫ܿۜ;->ۜ:Ljava/lang/String;

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_b

    :cond_d
    :goto_5
    const/4 v10, 0x0

    goto :goto_a

    :cond_e
    const-wide/32 v7, 0x7fffffff

    const/16 v17, 0x1

    const/4 v10, 0x0

    const-string v0, "native_string"

    .line 32
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    if-eqz v2, :cond_14

    const-string v0, "strings.text"

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-wide v0, v2, Ll/ۙۜۜ;->֫:J

    const-wide/16 v3, 0x0

    cmp-long v9, v0, v3

    if-ltz v9, :cond_14

    .line 98
    iget-wide v0, v2, Ll/ۙۜۜ;->ܽ:J

    iget v9, v2, Ll/ۙۜۜ;->᩻:I

    cmp-long v11, v0, v3

    if-ltz v11, :cond_10

    cmp-long v3, v0, v7

    if-lez v3, :cond_f

    goto :goto_6

    :cond_f
    long-to-int v3, v0

    if-ne v9, v3, :cond_11

    goto :goto_7

    :cond_10
    :goto_6
    if-gez v9, :cond_11

    :goto_7
    const/4 v3, 0x1

    goto :goto_8

    :cond_11
    const/4 v3, 0x0

    :goto_8
    if-eqz v3, :cond_14

    const-wide/16 v3, 0x0

    cmp-long v7, v0, v3

    if-ltz v7, :cond_12

    .line 137
    invoke-static {v2, v5, v0, v1}, Ll/ᩴۧۜ;->֫(Ll/ۙۜۜ;Ljava/lang/String;J)Z

    move-result v0

    goto :goto_9

    .line 140
    :cond_12
    iget-wide v0, v2, Ll/ۙۜۜ;->ۜ:J

    cmp-long v5, v0, v3

    if-ltz v5, :cond_13

    .line 141
    invoke-static {v2, v6, v0, v1}, Ll/ᩴۧۜ;->֫(Ll/ۙۜۜ;Ljava/lang/String;J)Z

    move-result v0

    goto :goto_9

    .line 144
    :cond_13
    invoke-static {v2}, Ll/ᩴۧۜ;->֫(Ll/ۙۜۜ;)Z

    move-result v0

    :goto_9
    if-eqz v0, :cond_14

    goto :goto_b

    :cond_14
    :goto_a
    return v10

    :cond_15
    :goto_b
    return v17
.end method
