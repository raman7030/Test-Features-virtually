.class public final Ll/ۨۧۢ;
.super Ljava/lang/Object;
.source "K1EG"


# direct methods
.method public static ֫(Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Ll/ۛۧۢ;Ll/۠۫᩷;)V
    .locals 1

    .line 34
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    .line 36
    :try_start_0
    invoke-static {p0, p1, p2, p3}, Ll/ۨۧۢ;->ۧ(Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Ll/ۛۧۢ;Ll/۠۫᩷;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    if-nez v0, :cond_0

    .line 39
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_0

    :cond_0
    const-string p2, "dex"

    .line 41
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 43
    :goto_0
    instance-of p1, p0, Ljava/io/IOException;

    if-nez p1, :cond_2

    .line 45
    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-eqz p1, :cond_1

    .line 46
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    .line 48
    :cond_1
    check-cast p0, Ljava/lang/Error;

    throw p0

    .line 44
    :cond_2
    check-cast p0, Ljava/io/IOException;

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 6

    .line 199
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 200
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2f

    if-ne v4, v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0xc

    if-lt v3, v4, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static ۧ(Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Ll/ۛۧۢ;Ll/۠۫᩷;)V
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "dex"

    .line 55
    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۬()Z

    .line 57
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۛ()V

    const-string v0, "config"

    .line 59
    invoke-virtual {v3, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 60
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 62
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v0, "data"

    .line 64
    invoke-virtual {v3, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 65
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 68
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v7}, Ljava/text/Collator;->getInstance(Ljava/util/Locale;)Ljava/text/Collator;

    move-result-object v7

    .line 69
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܶ᩵ܿ;

    .line 70
    new-instance v11, Ll/ۤ۬ܳ;

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v7, v12, v10}, Ll/ۤ۬ܳ;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v0, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 72
    :cond_0
    new-instance v7, Ll/ۤۧۢ;

    invoke-direct {v7, v0}, Ll/ۤۧۢ;-><init>(Ljava/util/HashMap;)V

    invoke-static {v7}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 73
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 74
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 75
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 76
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 79
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v11, 0x0

    move-object v11, v9

    const/4 v12, 0x0

    move-object v9, v8

    move-object v8, v7

    move-object v7, v0

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 80
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ll/ܶ᩵ܿ;

    .line 81
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 82
    new-instance v14, Ljava/util/HashSet;

    invoke-direct {v14, v8}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 83
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15, v9}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    move-object/from16 v16, v7

    .line 84
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    move-object/from16 v17, v8

    .line 86
    :try_start_0
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v8

    .line 87
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 617
    invoke-static {v2}, Ll/ۖۢ֡;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Ll/ۖۢ֡;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_a

    move-object/from16 v18, v11

    :try_start_1
    const-string v11, ".dex"

    .line 89
    invoke-virtual {v2, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_1

    .line 90
    invoke-virtual {v7, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    :cond_1
    invoke-virtual {v6, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v11

    .line 94
    invoke-virtual {v11, v8}, Ll/ܶ᩵ܿ;->֫([B)V

    .line 96
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v19, v7

    const-string v7, "smali/"

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 97
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 98
    new-instance v7, Ll/ۤۜܽ;

    invoke-direct {v7}, Ll/ۤۜܽ;-><init>()V

    .line 99
    invoke-static {v8}, Ll/۬ۛ֡;->֫([B)Ll/۬ۛ֡;

    move-result-object v8

    .line 100
    invoke-virtual {v8}, Ll/۬ۛ֡;->ۜ()I

    move-result v11
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9

    if-eqz v11, :cond_2

    :try_start_2
    const-string v11, "opt_has_api_mod"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v20, v3

    const/4 v3, 0x1

    .line 101
    :try_start_3
    invoke-virtual {v5, v11, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_2

    :catch_0
    move-exception v0

    move-object/from16 v20, v3

    goto/16 :goto_e

    :cond_2
    move-object/from16 v20, v3

    .line 103
    :goto_2
    invoke-virtual {v8, v1}, Ll/۬ۛ֡;->֫(Ljava/lang/Object;)V

    .line 104
    invoke-virtual {v8}, Ll/۬ۛ֡;->ܳ()I

    move-result v3

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v3, :cond_b

    move/from16 v21, v3

    .line 106
    invoke-virtual {v8, v11}, Ll/۬ۛ֡;->֫(I)I

    move-result v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8

    move-object/from16 v22, v5

    .line 107
    :try_start_4
    invoke-virtual {v8, v11}, Ll/۬ۛ֡;->ۘ(I)I

    move-result v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    move-object/from16 v23, v4

    .line 108
    :try_start_5
    invoke-virtual {v8, v3}, Ll/۬ۛ֡;->ܺ(I)Ljava/lang/String;

    move-result-object v4

    .line 109
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v24
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    move-object/from16 v25, v8

    const/4 v8, 0x1

    move-object/from16 v26, v9

    add-int/lit8 v9, v24, -0x1

    :try_start_6
    invoke-virtual {v4, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 110
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    const/16 v9, 0x2f

    if-eqz v8, :cond_a

    .line 111
    :try_start_7
    invoke-virtual {v4, v9}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v8

    add-int/lit8 v9, v8, 0x1

    move-object/from16 v24, v0

    .line 112
    invoke-virtual {v4, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    move-object/from16 v27, v10

    const/16 v10, 0x82

    const-wide v28, 0xffffffffL

    move/from16 v30, v12

    const/16 v12, 0x64

    if-gt v8, v10, :cond_5

    .line 113
    :try_start_8
    invoke-static {v4}, Ll/ۨۧۢ;->֫(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_5

    .line 128
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-le v8, v12, :cond_4

    const/4 v8, 0x0

    .line 129
    invoke-virtual {v4, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 130
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v12, 0x32

    invoke-virtual {v0, v8, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "_too_long_"

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    move-object v8, v13

    int-to-long v12, v0

    and-long v12, v12, v28

    :try_start_9
    invoke-static {v12, v13}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 131
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 132
    invoke-virtual {v15, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_7

    :cond_4
    move-object v8, v13

    goto/16 :goto_8

    :catch_1
    move-exception v0

    :goto_4
    move-object v8, v13

    goto/16 :goto_b

    :cond_5
    :goto_5
    move-object v8, v13

    .line 114
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    if-le v9, v12, :cond_6

    .line 115
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v10, 0x3c

    const/4 v12, 0x0

    invoke-virtual {v0, v12, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "_"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    int-to-long v12, v0

    and-long v12, v12, v28

    invoke-static {v12, v13}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 117
    :cond_6
    invoke-virtual {v14, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/4 v9, 0x1

    .line 119
    :goto_6
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v14, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    .line 122
    :cond_7
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 124
    :cond_8
    invoke-virtual {v14, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 125
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "# TOO_LONG_NAME/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 126
    invoke-virtual {v15, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_7
    move-object v4, v0

    .line 135
    :goto_8
    invoke-virtual {v7, v4}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    if-eqz v5, :cond_9

    const/high16 v0, -0x80000000

    or-int/2addr v0, v3

    .line 138
    invoke-virtual {v7, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 139
    invoke-virtual {v7, v5}, Ll/ۤۜܽ;->writeInt(I)V

    goto :goto_9

    .line 141
    :cond_9
    invoke-virtual {v7, v3}, Ll/ۤۜܽ;->writeInt(I)V

    :goto_9
    move-object/from16 v3, p2

    goto :goto_a

    :catch_2
    move-exception v0

    move-object/from16 v27, v10

    move/from16 v30, v12

    goto/16 :goto_4

    :cond_a
    move-object/from16 v24, v0

    move-object/from16 v27, v10

    move/from16 v30, v12

    move-object v8, v13

    const/16 v0, 0x2e

    .line 144
    invoke-virtual {v4, v9, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    move-object/from16 v3, p2

    .line 145
    :try_start_a
    invoke-virtual {v3, v2, v0}, Ll/ۛۧۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :goto_a
    add-int/lit8 v11, v11, 0x1

    move-object v13, v8

    move/from16 v3, v21

    move-object/from16 v5, v22

    move-object/from16 v4, v23

    move-object/from16 v0, v24

    move-object/from16 v8, v25

    move-object/from16 v9, v26

    move-object/from16 v10, v27

    move/from16 v12, v30

    goto/16 :goto_3

    :catch_3
    move-exception v0

    :goto_b
    move-object/from16 v3, p2

    goto/16 :goto_10

    :catch_4
    move-exception v0

    move-object/from16 v3, p2

    :goto_c
    move-object/from16 v27, v10

    move/from16 v30, v12

    move-object v8, v13

    goto/16 :goto_10

    :catch_5
    move-exception v0

    move-object/from16 v3, p2

    goto :goto_d

    :catch_6
    move-exception v0

    move-object/from16 v3, p2

    move-object/from16 v23, v4

    :goto_d
    move-object/from16 v26, v9

    goto :goto_c

    :cond_b
    move-object/from16 v3, p2

    move-object/from16 v24, v0

    move-object/from16 v23, v4

    move-object/from16 v22, v5

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    move/from16 v30, v12

    move-object v8, v13

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_list"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0, v7}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    const/4 v0, 0x1

    move-object/from16 v1, p3

    move-object v8, v14

    move-object v9, v15

    move-object/from16 v11, v19

    move-object/from16 v7, v24

    const/4 v12, 0x1

    goto/16 :goto_12

    :catch_7
    move-exception v0

    goto :goto_10

    :catch_8
    move-exception v0

    :goto_e
    move-object/from16 v3, p2

    move-object/from16 v23, v4

    move-object/from16 v22, v5

    goto :goto_d

    :catch_9
    move-exception v0

    move-object/from16 v20, v3

    move-object/from16 v23, v4

    move-object/from16 v22, v5

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    :goto_f
    move/from16 v30, v12

    goto/16 :goto_4

    :catch_a
    move-exception v0

    move-object/from16 v20, v3

    move-object/from16 v23, v4

    move-object/from16 v22, v5

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    move-object/from16 v18, v11

    goto :goto_f

    .line 155
    :goto_10
    new-instance v11, Ljava/io/IOException;

    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const v1, 0x7f1203a0

    invoke-static {v1, v4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v11, v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez v30, :cond_d

    .line 156
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_11

    .line 161
    :cond_c
    throw v11

    :cond_d
    :goto_11
    move-object/from16 v1, p3

    .line 157
    iget-object v0, v1, Ll/۠۫᩷;->᩸:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Ll/ܿۛ᩷;

    sget v0, Ll/ܿۛ᩷;->ۛۧ:I

    const/4 v0, 0x1

    new-array v2, v0, [Z

    const/4 v4, 0x0

    aput-boolean v4, v2, v4

    .line 887
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v5, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 888
    new-instance v0, Ll/ᩴ֨ۡ;

    const/4 v10, 0x1

    move-object v9, v0

    move-object v13, v2

    move-object v14, v5

    invoke-direct/range {v9 .. v14}, Ll/ᩴ֨ۡ;-><init>(ILjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 906
    :try_start_b
    invoke-virtual {v5}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_b

    .line 910
    aget-boolean v0, v2, v4

    if-eqz v0, :cond_e

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    move-object/from16 v11, v18

    move-object/from16 v9, v26

    move/from16 v12, v30

    :goto_12
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, v20

    move-object/from16 v5, v22

    move-object/from16 v4, v23

    move-object/from16 v10, v27

    goto/16 :goto_1

    .line 158
    :cond_e
    new-instance v0, Ll/۬ۛ᩷;

    .line 5
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 158
    throw v0

    :catch_b
    move-exception v0

    move-object v1, v0

    .line 908
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_f
    move-object/from16 v23, v4

    move-object/from16 v22, v5

    move-object/from16 v26, v9

    move-object/from16 v18, v11

    .line 165
    invoke-interface/range {v26 .. v26}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    .line 166
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 167
    invoke-interface/range {v26 .. v26}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 168
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 169
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_13

    :cond_10
    const-string v1, "map"

    move-object/from16 v2, v23

    .line 171
    invoke-virtual {v2, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V

    goto :goto_14

    :cond_11
    move-object/from16 v2, v23

    .line 173
    :goto_14
    invoke-interface/range {v18 .. v18}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    .line 174
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 175
    invoke-interface/range {v18 .. v18}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 176
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 177
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_15

    :cond_12
    const-string v1, "dex_name_map"

    .line 179
    invoke-virtual {v2, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V

    .line 181
    :cond_13
    invoke-virtual/range {v22 .. v22}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_14

    .line 182
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v3, v22

    .line 183
    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 184
    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    move-result-object v3

    .line 185
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    const-string v0, "options"

    .line 186
    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->֫([B)V

    goto :goto_16

    :cond_14
    const/4 v1, 0x0

    :goto_16
    move-object/from16 v2, p0

    .line 189
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    const-string v1, "resources.arsc"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 190
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_15

    const-string v1, "data/resources.arsc"

    move-object/from16 v2, p1

    .line 191
    invoke-virtual {v2, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 192
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۨ()V

    const/4 v2, 0x0

    .line 516
    invoke-virtual {v0, v1, v2, v2}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;Ll/ۚ᩸ܿ;)V

    :cond_15
    return-void
.end method
