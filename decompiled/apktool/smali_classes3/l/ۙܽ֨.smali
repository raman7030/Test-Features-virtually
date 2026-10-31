.class public final Ll/ۙܽ֨;
.super Ll/ۚܽ֨;
.source "V6B4"


# direct methods
.method public varargs constructor <init>(Ll/֡۬ۚ;Ll/᩸۬ۚ;Ll/֫۬ۚ;[Ljava/lang/String;)V
    .locals 8

    .line 34
    invoke-direct {p0, p1, p2}, Ll/֨ۗۚ;-><init>(Ll/֡۬ۚ;Ll/᩸۬ۚ;)V

    .line 73
    iget-object p1, p0, Ll/ۛۗۚ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    iget-object p1, p0, Ll/ۛۗۚ;->ۧ:Ljava/util/ArrayList;

    const-string p2, "-lvt"

    const-string p3, "-lnt"

    const-string v0, "-drop"

    iget-object v1, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    const/4 v2, 0x1

    :try_start_0
    invoke-static {}, Ll/ۧܿ֨;->ܽ()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 159
    :goto_0
    array-length v5, p4

    if-ge v4, v5, :cond_8

    .line 160
    aget-object v5, p4, v4

    .line 161
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v7, "-"

    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    :try_start_1
    const-string v6, "-best-effort"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 204
    sget-object v5, Ll/֫ܿ֨;->ۙ:Ll/֫ܿ֨;

    invoke-static {v5}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    goto/16 :goto_2

    :sswitch_1
    const-string v6, "-table"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 211
    sget-object v5, Ll/֫ܿ֨;->ۘ֫:Ll/֫ܿ֨;

    invoke-static {v5}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    goto/16 :goto_2

    :sswitch_2
    const-string v6, "-dls"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 198
    move-object v5, v1

    check-cast v5, Ll/֡ܽ֨;

    new-instance v6, Ll/۠۬ۚ;

    invoke-direct {v6}, Ll/۠۬ۚ;-><init>()V

    invoke-virtual {v5, v6}, Ll/᩶ۗۚ;->֫(Ll/۠۬ۚ;)V

    goto/16 :goto_2

    :sswitch_3
    const-string v6, "-pc"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 179
    sget-object v5, Ll/֫ܿ֨;->ܺ֫:Ll/֫ܿ֨;

    invoke-static {v5}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    goto/16 :goto_2

    :sswitch_4
    const-string v6, "-nc"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 182
    sget-object v5, Ll/֫ܿ֨;->ۡ֫:Ll/֫ܿ֨;

    invoke-static {v5}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    goto/16 :goto_2

    :sswitch_5
    const-string v6, "-hx"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 185
    sget-object v5, Ll/֫ܿ֨;->֫֫:Ll/֫ܿ֨;

    invoke-static {v5}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    goto/16 :goto_2

    :sswitch_6
    const-string v6, "-gg"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 207
    invoke-static {}, Ll/ۧܿ֨;->ᩳ()V

    .line 208
    sget-object v5, Ll/֫ܿ֨;->۟:Ll/֫ܿ֨;

    invoke-static {v5}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    goto/16 :goto_2

    :sswitch_7
    const-string v6, "-w"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 194
    move-object v5, v1

    check-cast v5, Ll/֡ܽ֨;

    invoke-virtual {v5}, Ll/᩶ۗۚ;->ۡ()V

    .line 195
    sget-object v5, Ll/ܺ۬ۚ;->᩹:Ll/ܺ۬ۚ;

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {p0, v5, v4, p4}, Ll/ۛۗۚ;->֫(Ll/ܺ۬ۚ;I[Ljava/lang/String;)V

    goto/16 :goto_2

    :sswitch_8
    const-string v6, "-v"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 166
    sget-object v5, Ll/֫ܿ֨;->᩵֫:Ll/֫ܿ֨;

    invoke-static {v5}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    .line 167
    move-object v5, v1

    check-cast v5, Ll/֡ܽ֨;

    invoke-virtual {v5}, Ll/᩶ۗۚ;->ۖ()V

    goto/16 :goto_2

    :sswitch_9
    const-string v6, "-t"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 173
    sget-object v5, Ll/֫ܿ֨;->᩵֫:Ll/֫ܿ֨;

    invoke-static {v5}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    .line 174
    sget-object v5, Ll/֫ܿ֨;->ᩴ֫:Ll/֫ܿ֨;

    invoke-static {v5}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    .line 175
    move-object v5, v1

    check-cast v5, Ll/֡ܽ֨;

    invoke-virtual {v5}, Ll/᩶ۗۚ;->ۖ()V

    .line 176
    move-object v5, v1

    check-cast v5, Ll/֡ܽ֨;

    invoke-virtual {v5}, Ll/᩶ۗۚ;->ܺ()V

    goto/16 :goto_2

    :sswitch_a
    const-string v6, "-g"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 163
    invoke-static {}, Ll/ۧܿ֨;->ᩳ()V

    goto/16 :goto_2

    :sswitch_b
    const-string v6, "-f"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 188
    sget-object v5, Ll/ܺ۬ۚ;->᩶:Ll/ܺ۬ۚ;

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {p0, v5, v4, p4}, Ll/ۛۗۚ;->֫(Ll/ܺ۬ۚ;I[Ljava/lang/String;)V

    goto/16 :goto_2

    :sswitch_c
    const-string v6, "-d"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 191
    sget-object v5, Ll/ܺ۬ۚ;->᩹:Ll/ܺ۬ۚ;

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {p0, v5, v4, p4}, Ll/ۛۗۚ;->֫(Ll/ܺ۬ۚ;I[Ljava/lang/String;)V

    goto/16 :goto_2

    .line 161
    :sswitch_d
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 201
    invoke-virtual {p0}, Ll/ۛۗۚ;->֫()V

    goto/16 :goto_2

    :sswitch_e
    const-string v6, "-sysinfo"

    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 170
    sget-object v5, Ll/֫ܿ֨;->ۖ֫:Ll/֫ܿ֨;

    invoke-static {v5}, Ll/ۧܿ֨;->֫(Ll/֫ܿ֨;)V

    goto :goto_2

    .line 214
    :cond_0
    :goto_1
    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 215
    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    const-string v6, "DROP"

    .line 216
    sget-object v7, Ll/֫ܿ֨;->ۤ:Ll/֫ܿ֨;

    invoke-direct {p0, v0, v5, v6, v7}, Ll/ۙܽ֨;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֫ܿ֨;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_2

    .line 217
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 219
    :cond_2
    invoke-virtual {v5, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    const-string v6, "LINE_NUMBER_TABLE"

    .line 220
    sget-object v7, Ll/֫ܿ֨;->ܽ֫:Ll/֫ܿ֨;

    invoke-direct {p0, p3, v5, v6, v7}, Ll/ۙܽ֨;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֫ܿ֨;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    .line 221
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 223
    :cond_4
    invoke-virtual {v5, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    const-string v6, "LOCAL_VARIABLE"

    .line 224
    sget-object v7, Ll/֫ܿ֨;->᩻֫:Ll/֫ܿ֨;

    invoke-direct {p0, p2, v5, v6, v7}, Ll/ۙܽ֨;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֫ܿ֨;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_2

    .line 225
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 228
    :cond_6
    move-object p1, v1

    check-cast p1, Ll/֡ܽ֨;

    const-string p2, "Invalid option: {0}"

    new-array p3, v2, [Ljava/lang/Object;

    aput-object v5, p3, v3

    invoke-virtual {p1, p2, p3}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 232
    :cond_7
    new-instance v6, Ll/ܽ۬ۚ;

    invoke-direct {v6, v5}, Ll/ܽ۬ۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/2addr v4, v2

    goto/16 :goto_0

    .line 236
    :cond_8
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    return-void

    .line 238
    :cond_9
    move-object p1, v1

    check-cast p1, Ll/֡ܽ֨;

    const-string p2, "No input files specified."

    new-array p3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, p2, p3}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 242
    :catch_0
    check-cast v1, Ll/֡ܽ֨;

    invoke-virtual {v1}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object p1

    check-cast p1, Ll/ܶۗۚ;

    invoke-virtual {p1}, Ll/ܶۗۚ;->ܽ()V

    .line 243
    invoke-static {v2}, Ljava/lang/System;->exit(I)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x24fe27d2 -> :sswitch_e
        0x2d -> :sswitch_d
        0x5d7 -> :sswitch_c
        0x5d9 -> :sswitch_b
        0x5da -> :sswitch_a
        0x5e7 -> :sswitch_9
        0x5e9 -> :sswitch_8
        0x5ea -> :sswitch_7
        0xb5cd -> :sswitch_6
        0xb5fd -> :sswitch_5
        0xb6a2 -> :sswitch_4
        0xb6e0 -> :sswitch_3
        0x15f99e -> :sswitch_2
        0x535a4fc1 -> :sswitch_1
        0x66259ea8 -> :sswitch_0
    .end sparse-switch
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֫ܿ֨;)Z
    .locals 8

    .line 259
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    .line 0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const-string v3, "Not implemented yet: {0}"

    const/4 v4, 0x1

    iget-object v5, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    if-ge v2, v0, :cond_7

    invoke-virtual {p2, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v7

    if-nez v7, :cond_6

    const-string v0, "^[:=-]+.*"

    .line 266
    invoke-virtual {p2, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 267
    invoke-virtual {p2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, ","

    .line 268
    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 269
    :goto_1
    array-length v2, p2

    if-ge v0, v2, :cond_4

    .line 270
    aget-object v2, p2, v0

    invoke-static {p3, v2}, Ll/֫ܿ֨;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/֫ܿ֨;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 271
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_2

    .line 274
    :cond_0
    invoke-virtual {v2}, Ll/֫ܿ֨;->ۧ()Z

    move-result v6

    if-nez v6, :cond_1

    .line 275
    check-cast v5, Ll/֡ܽ֨;

    aget-object p2, p2, v0

    const-string p3, ":"

    .line 0
    invoke-static {p1, p3, p2}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v4, [Ljava/lang/Object;

    aput-object p1, p2, v1

    .line 275
    invoke-virtual {v5, v3, p2}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 278
    :cond_1
    invoke-virtual {v2}, Ll/֫ܿ֨;->֫()V

    .line 279
    invoke-virtual {v2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 272
    :cond_3
    :goto_2
    check-cast v5, Ll/֡ܽ֨;

    aget-object p2, p2, v0

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    aput-object p2, p3, v1

    aput-object p1, p3, v4

    const-string p1, "Invalid parameter \"{0}\" of option: {1}"

    invoke-virtual {v5, p1, p3}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    :cond_4
    :goto_3
    return v4

    .line 284
    :cond_5
    check-cast v5, Ll/֡ܽ֨;

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v4, [Ljava/lang/Object;

    aput-object p1, p2, v1

    invoke-virtual {v5, v3, p2}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 0
    :cond_6
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v2, v3

    goto/16 :goto_0

    .line 261
    :cond_7
    invoke-virtual {p4}, Ll/֫ܿ֨;->ۧ()Z

    move-result p2

    if-nez p2, :cond_8

    .line 262
    check-cast v5, Ll/֡ܽ֨;

    const-string p2, ":all"

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v4, [Ljava/lang/Object;

    aput-object p1, p2, v1

    invoke-virtual {v5, v3, p2}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 265
    :cond_8
    invoke-virtual {p4}, Ll/֫ܿ֨;->֫()V

    return v4
.end method


# virtual methods
.method public final declared-synchronized ۧ()I
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 112
    :try_start_0
    iget-object v1, p0, Ll/ۛۗۚ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩻۬ۚ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 115
    :try_start_1
    iget-object v7, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v7, Ll/֡ܽ֨;

    invoke-virtual {v7, v4}, Ll/᩶ۗۚ;->֫(Ll/᩻۬ۚ;)V

    .line 116
    new-instance v7, Ll/᩷ۧ֨;

    iget-object v8, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v8, Ll/֡ܽ֨;

    invoke-direct {v7, v8}, Ll/᩷ۧ֨;-><init>(Ll/᩶ۗۚ;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/ClassFormatError; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 160
    :try_start_2
    iget-boolean v6, v7, Ll/ۢܽ֨;->ۙ:Z

    if-nez v6, :cond_1

    iget-boolean v6, v7, Ll/ۢܽ֨;->ۤ:Z

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v6, 0x1

    .line 117
    :goto_2
    invoke-interface {v4, v6}, Ll/᩻۬ۚ;->֫(Z)Ll/᩻۬ۚ;

    .line 118
    iget-object v6, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    invoke-static {v6}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v6

    invoke-interface {v4, v6}, Ll/᩻۬ۚ;->֫(Ll/ܽ۫ᩴ;)Ljava/io/DataInputStream;

    move-result-object v6
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/ClassFormatError; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 119
    :try_start_3
    invoke-interface {v4}, Ll/᩻۬ۚ;->getName()Ljava/lang/String;

    move-result-object v8

    new-array v9, v2, [Ljava/lang/String;

    invoke-static {v8, v9}, Ll/ۡ۠ᩴ;->get(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v8

    invoke-virtual {v7, v6, v8}, Ll/᩷ۧ֨;->֫(Ljava/io/DataInputStream;Ll/᩷۠ᩴ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 120
    :try_start_4
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 121
    iget-object v6, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v6, Ll/֡ܽ֨;

    new-instance v8, Ll/᩶ܽ֨;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v6, v8}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 122
    iget-object v6, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v6, Ll/֡ܽ֨;

    invoke-virtual {v6}, Ll/᩶ۗۚ;->᩻()Ll/֨۬ۚ;

    move-result-object v6

    iget-object v8, v7, Ll/᩷ۧ֨;->ܺۧ:Ljava/lang/String;

    const-string v9, ".jasm"

    invoke-static {v9}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v9

    iget-object v10, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    invoke-interface {v6, v8, v9, v10}, Ll/֨۬ۚ;->֫(Ljava/lang/String;Ll/ܽ۫ᩴ;Ll/᩶ۗۚ;)V

    .line 123
    invoke-virtual {v7}, Ll/᩷ۧ֨;->ۧ()V

    .line 124
    iget-object v6, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v6, Ll/֡ܽ֨;

    invoke-virtual {v6}, Ll/᩶ۗۚ;->᩻()Ll/֨۬ۚ;

    move-result-object v6

    iget-object v8, v7, Ll/᩷ۧ֨;->ܺۧ:Ljava/lang/String;

    invoke-interface {v6, v8}, Ll/֨۬ۚ;->ۧ(Ljava/lang/String;)V

    .line 125
    iget-object v6, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v6, Ll/֡ܽ֨;

    invoke-virtual {v6}, Ll/᩶ۗۚ;->ܽ()Ll/ܶ۬ۚ;

    move-result-object v6

    invoke-interface {v6}, Ll/֨۬ۚ;->flush()V

    .line 126
    iget-object v6, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v6, Ll/֡ܽ֨;

    invoke-virtual {v6}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v6

    check-cast v6, Ll/ܶۗۚ;

    invoke-virtual {v6, v3, v4}, Ll/ܶۗۚ;->֫(ILl/᩻۬ۚ;)I

    move-result v6

    add-int/2addr v3, v6

    .line 127
    iget-object v6, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v6, Ll/֡ܽ֨;

    invoke-virtual {v6}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v6

    check-cast v6, Ll/ܶۗۚ;

    invoke-virtual {v6}, Ll/ܶۗۚ;->ܽ()V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/ClassFormatError; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto/16 :goto_0

    :catchall_0
    move-exception v1

    .line 118
    :try_start_5
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v6

    :try_start_6
    invoke-virtual {v1, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_8
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/ClassFormatError; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catch_0
    move-exception v1

    move-object v6, v7

    goto :goto_5

    :catch_1
    move-exception v1

    move-object v6, v7

    goto :goto_6

    :catch_2
    move-exception v1

    goto :goto_4

    :catch_3
    move-exception v1

    :goto_4
    move-object v6, v7

    goto :goto_7

    :catch_4
    move-exception v1

    .line 144
    :goto_5
    :try_start_7
    invoke-virtual {v6}, Ll/᩷ۧ֨;->᩹()V

    .line 145
    iget-object v2, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v2, Ll/֡ܽ֨;

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->֫(Ljava/lang/Throwable;)V

    .line 146
    iget-object v2, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v2, Ll/֡ܽ֨;

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->ۧ(Ljava/lang/Throwable;)V

    .line 147
    iget-object v1, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v1, Ll/֡ܽ֨;

    invoke-virtual {v1}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v1

    check-cast v1, Ll/ܶۗۚ;

    invoke-virtual {v1, v3, v4}, Ll/ܶۗۚ;->֫(ILl/᩻۬ۚ;)I

    move-result v1

    goto :goto_8

    :catch_5
    move-exception v1

    .line 139
    :goto_6
    invoke-virtual {v6}, Ll/᩷ۧ֨;->᩹()V

    .line 140
    iget-object v2, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v2, Ll/֡ܽ֨;

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->֫(Ljava/lang/Throwable;)V

    .line 141
    iget-object v2, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v2, Ll/֡ܽ֨;

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->ۧ(Ljava/lang/Throwable;)V

    .line 142
    iget-object v1, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v1, Ll/֡ܽ֨;

    invoke-virtual {v1}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v1

    check-cast v1, Ll/ܶۗۚ;

    invoke-virtual {v1, v3, v4}, Ll/ܶۗۚ;->֫(ILl/᩻۬ۚ;)I

    move-result v1

    goto :goto_8

    :catch_6
    move-exception v1

    goto :goto_7

    :catch_7
    move-exception v1

    .line 134
    :goto_7
    invoke-virtual {v6}, Ll/᩷ۧ֨;->᩹()V

    .line 135
    iget-object v2, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v2, Ll/֡ܽ֨;

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->֫(Ljava/lang/Throwable;)V

    .line 136
    iget-object v2, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v2, Ll/֡ܽ֨;

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->ۧ(Ljava/lang/Throwable;)V

    .line 137
    iget-object v1, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v1, Ll/֡ܽ֨;

    invoke-virtual {v1}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v1

    check-cast v1, Ll/ܶۗۚ;

    invoke-virtual {v1, v3, v4}, Ll/ܶۗۚ;->֫(ILl/᩻۬ۚ;)I

    move-result v1

    :goto_8
    add-int/2addr v3, v1

    goto :goto_9

    :catch_8
    move-exception v1

    .line 130
    iget-object v3, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v3, Ll/֡ܽ֨;

    invoke-virtual {v3, v1}, Ll/᩶ۗۚ;->ۧ(Ljava/lang/Throwable;)V

    .line 131
    iget-object v1, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v1, Ll/֡ܽ֨;

    const-string v3, "No such file: {0}"

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v2

    invoke-virtual {v1, v3, v5}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x1

    const/4 v3, 0x1

    .line 149
    :goto_9
    iget-object v1, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    check-cast v1, Ll/֡ܽ֨;

    invoke-virtual {v1}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v1

    check-cast v1, Ll/ܶۗۚ;

    invoke-virtual {v1}, Ll/ܶۗۚ;->ܽ()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 152
    :cond_2
    monitor-exit v0

    return v3

    :catchall_2
    move-exception v1

    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v1
.end method
