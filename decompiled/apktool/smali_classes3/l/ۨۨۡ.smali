.class public final Ll/ۨۨۡ;
.super Ljava/lang/Object;
.source "E5JO"


# instance fields
.field public ֫:[B

.field public ۜ:Ljava/util/ArrayList;

.field public final ۡ:Ljava/util/HashSet;

.field public ۢ:Ll/۠ᩴᩴ;

.field public ۧ:Z

.field public ܳ:Z

.field public ܽ:Z

.field public ܿ:Ljava/lang/Boolean;

.field public final ᩳ:Ljava/util/HashSet;

.field public ᩷:Ll/۬ܿܽ;

.field public ᩻:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;Ll/۬ܿܽ;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 54
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iput-object v3, v0, Ll/ۨۨۡ;->ᩳ:Ljava/util/HashSet;

    .line 41
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    iput-object v4, v0, Ll/ۨۨۡ;->ۡ:Ljava/util/HashSet;

    .line 52
    new-instance v5, Ll/۠ᩴᩴ;

    invoke-direct {v5}, Ll/۠ᩴᩴ;-><init>()V

    iput-object v5, v0, Ll/ۨۨۡ;->ۢ:Ll/۠ᩴᩴ;

    .line 55
    iput-object v2, v0, Ll/ۨۨۡ;->᩷:Ll/۬ܿܽ;

    .line 56
    new-instance v5, Ll/ۤۨۡ;

    invoke-direct {v5}, Ll/ۤۨۡ;-><init>()V

    .line 57
    invoke-virtual {v5, v1, v2}, Ll/ۤۨۡ;->֫(Ljava/io/ByteArrayInputStream;Ll/۫᩻ܽ;)V

    const/4 v6, 0x0

    .line 134
    :cond_0
    invoke-virtual {v5}, Ll/ۤۨۡ;->next()I

    move-result v7

    const/4 v8, -0x1

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eq v7, v10, :cond_2

    if-ne v7, v9, :cond_0

    .line 136
    invoke-virtual {v5}, Ll/ۤۨۡ;->᩻()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    invoke-virtual {v5}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v7, :cond_0

    .line 139
    invoke-virtual {v5, v9}, Ll/ۤۨۡ;->ܽ(I)I

    move-result v10

    .line 140
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 141
    invoke-virtual {v5, v9}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v11

    if-ne v10, v8, :cond_1

    if-lez v11, :cond_1

    const/4 v6, 0x1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    const-string v4, "http://schemas.android.com/apk/res"

    const-string v7, "http://schemas.android.com/apk/res/android"

    if-nez v6, :cond_3

    const/4 v3, 0x0

    goto/16 :goto_4

    .line 152
    :cond_3
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    iput-object v6, v0, Ll/ۨۨۡ;->᩻:Ljava/util/HashMap;

    .line 153
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, Ll/ۨۨۡ;->ۜ:Ljava/util/ArrayList;

    .line 613
    iget-object v6, v0, Ll/ۨۨۡ;->᩷:Ll/۬ܿܽ;

    invoke-virtual {v6, v7}, Ll/᩷ܿܽ;->֫(Ljava/lang/String;)I

    move-result v9

    if-ne v9, v8, :cond_4

    .line 615
    invoke-virtual {v6}, Ll/۬ܿܽ;->size()I

    move-result v9

    .line 616
    invoke-virtual {v6, v7}, Ll/۬ܿܽ;->ۧ(Ljava/lang/String;)V

    .line 613
    :cond_4
    iget-object v6, v0, Ll/ۨۨۡ;->᩷:Ll/۬ܿܽ;

    const-string v11, "android"

    invoke-virtual {v6, v11}, Ll/᩷ܿܽ;->֫(Ljava/lang/String;)I

    move-result v12

    if-ne v12, v8, :cond_5

    .line 615
    invoke-virtual {v6}, Ll/۬ܿܽ;->size()I

    move-result v12

    .line 616
    invoke-virtual {v6, v11}, Ll/۬ܿܽ;->ۧ(Ljava/lang/String;)V

    .line 158
    :cond_5
    new-instance v6, Ll/ۛۨۡ;

    invoke-direct {v6, v9, v12}, Ll/ۛۨۡ;-><init>(II)V

    .line 159
    iget-object v11, v0, Ll/ۨۨۡ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v11, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    iget-object v11, v0, Ll/ۨۨۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 162
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    const/4 v11, 0x0

    .line 166
    :goto_1
    invoke-virtual/range {p2 .. p2}, Ll/۬ܿܽ;->size()I

    move-result v12

    if-ge v6, v12, :cond_b

    if-ne v6, v9, :cond_6

    goto :goto_3

    .line 169
    :cond_6
    invoke-virtual {v2, v6}, Ll/۬ܿܽ;->getItem(I)Ll/ۗܿܽ;

    move-result-object v12

    .line 170
    invoke-virtual {v12}, Ll/ۗܿܽ;->᩺֫()Z

    move-result v13

    if-eqz v13, :cond_7

    goto :goto_3

    .line 172
    :cond_7
    invoke-virtual {v12}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v12

    .line 173
    invoke-virtual {v12, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    add-int/lit8 v11, v11, 0x1

    const-string v13, "app"

    if-ne v11, v10, :cond_8

    goto :goto_2

    .line 0
    :cond_8
    invoke-static {v11, v13}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 613
    :goto_2
    iget-object v14, v0, Ll/ۨۨۡ;->᩷:Ll/۬ܿܽ;

    invoke-virtual {v14, v13}, Ll/᩷ܿܽ;->֫(Ljava/lang/String;)I

    move-result v15

    if-ne v15, v8, :cond_9

    .line 615
    invoke-virtual {v14}, Ll/۬ܿܽ;->size()I

    move-result v15

    .line 616
    invoke-virtual {v14, v13}, Ll/۬ܿܽ;->ۧ(Ljava/lang/String;)V

    .line 177
    :cond_9
    new-instance v13, Ll/ۛۨۡ;

    invoke-direct {v13, v6, v15}, Ll/ۛۨۡ;-><init>(II)V

    .line 178
    iget-object v14, v0, Ll/ۨۨۡ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v14, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    iget-object v12, v0, Ll/ۨۨۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 181
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_b
    const/4 v3, 0x1

    .line 58
    :goto_4
    iput-boolean v3, v0, Ll/ۨۨۡ;->ܽ:Z

    .line 60
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->reset()V

    .line 61
    invoke-virtual {v5, v1, v2}, Ll/ۤۨۡ;->֫(Ljava/io/ByteArrayInputStream;Ll/۫᩻ܽ;)V

    .line 104
    :cond_c
    invoke-virtual {v5}, Ll/ۤۨۡ;->next()I

    move-result v3

    const-string v6, "manifest"

    if-eq v3, v10, :cond_e

    const/4 v8, 0x2

    if-ne v3, v8, :cond_c

    .line 106
    invoke-virtual {v5}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 107
    invoke-virtual {v5}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v3

    const/4 v8, 0x0

    :goto_5
    if-ge v8, v3, :cond_e

    .line 109
    invoke-virtual {v5, v8}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v9

    const-string v11, "package"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/4 v3, 0x1

    goto :goto_6

    :cond_d
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_e
    const/4 v3, 0x0

    .line 62
    :goto_6
    iput-boolean v3, v0, Ll/ۨۨۡ;->ܳ:Z

    .line 64
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->reset()V

    .line 65
    invoke-virtual {v5, v1, v2}, Ll/ۤۨۡ;->֫(Ljava/io/ByteArrayInputStream;Ll/۫᩻ܽ;)V

    .line 122
    iget-object v3, v0, Ll/ۨۨۡ;->ۢ:Ll/۠ᩴᩴ;

    :cond_f
    :goto_7
    invoke-virtual {v5}, Ll/ۤۨۡ;->next()I

    move-result v8

    if-eq v8, v10, :cond_10

    const/4 v9, 0x2

    if-ne v8, v9, :cond_f

    .line 124
    invoke-virtual {v5}, Ll/ۤۨۡ;->ܳ()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    .line 125
    invoke-virtual {v3, v9, v8}, Ll/۫ۘᩴ;->֫(ILjava/lang/String;)I

    move-result v9

    add-int/2addr v9, v10

    .line 126
    invoke-virtual {v3, v9, v8}, Ll/۠ᩴᩴ;->֫(ILjava/lang/Object;)I

    goto :goto_7

    .line 68
    :cond_10
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->reset()V

    .line 69
    invoke-virtual {v5, v1, v2}, Ll/ۤۨۡ;->֫(Ljava/io/ByteArrayInputStream;Ll/۫᩻ܽ;)V

    .line 71
    iput-boolean v10, v0, Ll/ۨۨۡ;->ۧ:Z

    .line 72
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    .line 521
    new-instance v3, Ljava/util/Stack;

    invoke-direct {v3}, Ljava/util/Stack;-><init>()V

    .line 75
    :goto_8
    invoke-virtual {v5}, Ll/ۤۨۡ;->next()I

    move-result v8

    if-eq v8, v10, :cond_5d

    .line 194
    iget-boolean v9, v0, Ll/ۨۨۡ;->ܽ:Z

    iget-object v10, v0, Ll/ۨۨۡ;->ᩳ:Ljava/util/HashSet;

    invoke-virtual {v5}, Ll/ۤۨۡ;->ۖ()Ll/۫᩻ܽ;

    move-result-object v11

    const/4 v12, 0x3

    const/4 v13, 0x2

    if-eq v8, v13, :cond_13

    if-eq v8, v12, :cond_12

    const/4 v9, 0x4

    if-eq v8, v9, :cond_11

    goto/16 :goto_b

    .line 484
    :cond_11
    iget-boolean v8, v0, Ll/ۨۨۡ;->ܳ:Z

    if-nez v8, :cond_1b

    .line 485
    invoke-virtual {v5}, Ll/ۤۨۡ;->ᩳ()I

    move-result v8

    if-ltz v8, :cond_1b

    .line 486
    invoke-interface {v11}, Ll/۫᩻ܽ;->size()I

    move-result v10

    if-ge v8, v10, :cond_1b

    .line 487
    invoke-virtual {v1, v9}, Ll/ۤۜܽ;->writeByte(I)V

    .line 488
    invoke-virtual {v1, v8}, Ll/ۤۜܽ;->ܽ(I)V

    goto/16 :goto_b

    .line 478
    :cond_12
    invoke-virtual {v1, v12}, Ll/ۤۜܽ;->writeByte(I)V

    .line 532
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩳۡᩴ;

    invoke-interface {v8}, Ll/ᩳۡᩴ;->֡()I

    move-result v8

    .line 479
    invoke-virtual {v1, v8}, Ll/ۤۜܽ;->ܽ(I)V

    .line 536
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩳۡᩴ;

    invoke-interface {v8}, Ll/ᩳۡᩴ;->֨()I

    move-result v8

    .line 480
    invoke-virtual {v1, v8}, Ll/ۤۜܽ;->ܽ(I)V

    .line 528
    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    goto/16 :goto_b

    .line 197
    :cond_13
    invoke-virtual {v5}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v8

    sget v12, Ll/۬᩻ܽ;->֫:I

    .line 9
    sget-object v12, Ll/۫᩻ܽ;->֫:Ljava/lang/String;

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5c

    .line 198
    invoke-virtual {v5}, Ll/ۤۨۡ;->getNamespace()Ljava/lang/String;

    move-result-object v8

    .line 9
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5c

    .line 199
    invoke-virtual {v5}, Ll/ۤۨۡ;->getPrefix()Ljava/lang/String;

    move-result-object v8

    .line 9
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    goto/16 :goto_26

    .line 203
    :cond_14
    invoke-virtual {v5}, Ll/ۤۨۡ;->ܳ()Ljava/lang/String;

    move-result-object v8

    .line 204
    iget-object v12, v0, Ll/ۨۨۡ;->ܿ:Ljava/lang/Boolean;

    if-nez v12, :cond_15

    .line 205
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    iput-object v12, v0, Ll/ۨۨۡ;->ܿ:Ljava/lang/Boolean;

    .line 207
    :cond_15
    iget-object v12, v0, Ll/ۨۨۡ;->ܿ:Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    const/16 v13, 0x7a

    const/16 v14, 0x61

    if-eqz v12, :cond_1c

    .line 208
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v12

    const/16 v15, 0x32

    if-gt v12, v15, :cond_1a

    .line 558
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_16

    goto :goto_a

    :cond_16
    const/4 v15, 0x0

    :goto_9
    if-ge v15, v12, :cond_1c

    .line 563
    invoke-virtual {v8, v15}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lt v2, v14, :cond_17

    if-le v2, v13, :cond_19

    :cond_17
    const/16 v13, 0x30

    if-lt v2, v13, :cond_18

    const/16 v13, 0x39

    if-le v2, v13, :cond_19

    :cond_18
    const/16 v13, 0x2d

    if-eq v2, v13, :cond_19

    const/16 v13, 0x3a

    if-ne v2, v13, :cond_1a

    :cond_19
    add-int/lit8 v15, v15, 0x1

    const/16 v13, 0x7a

    move-object/from16 v2, p2

    goto :goto_9

    .line 209
    :cond_1a
    :goto_a
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v9, "skipTag: "

    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 210
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 214
    invoke-static {v5}, Ll/ۨۨۡ;->֫(Ll/ۤۨۡ;)V

    :cond_1b
    :goto_b
    move-object/from16 v21, v3

    move-object/from16 v16, v4

    move-object/from16 v17, v6

    move-object v6, v0

    move-object v0, v1

    goto/16 :goto_27

    .line 218
    :cond_1c
    iget-object v2, v0, Ll/ۨۨۡ;->ܿ:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1d

    sget-object v2, Ll/ܰۨۡ;->֫:Ll/ۛ۬ܺ;

    invoke-interface {v2, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    const-string v2, "dist:"

    invoke-virtual {v8, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1d

    const/4 v2, 0x1

    goto :goto_c

    :cond_1d
    const/4 v2, 0x0

    :goto_c
    if-eqz v2, :cond_1e

    .line 220
    sget-object v12, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "UnknownManifestTag: "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 221
    sget-object v12, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 225
    iget-object v12, v0, Ll/ۨۨۡ;->ۢ:Ll/۠ᩴᩴ;

    const/4 v13, 0x0

    invoke-virtual {v12, v13, v8}, Ll/۫ۘᩴ;->֫(ILjava/lang/String;)I

    move-result v12

    const/16 v13, 0xa

    if-gt v12, v13, :cond_1e

    const/4 v2, 0x0

    .line 229
    :cond_1e
    invoke-virtual {v5}, Ll/ۤۨۡ;->᩻()I

    move-result v12

    invoke-virtual {v5}, Ll/ۤۨۡ;->ᩳ()I

    move-result v13

    .line 524
    new-instance v14, Ll/ܽۡᩴ;

    invoke-direct {v14, v12, v13}, Ll/ܽۡᩴ;-><init>(II)V

    invoke-virtual {v3, v14}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    invoke-virtual {v1}, Ll/ۤۜܽ;->size()I

    move-result v12

    const/4 v13, 0x2

    .line 232
    invoke-virtual {v1, v13}, Ll/ۤۜܽ;->writeByte(I)V

    .line 234
    invoke-virtual {v5}, Ll/ۤۨۡ;->᩻()I

    move-result v13

    invoke-virtual {v1, v13}, Ll/ۤۜܽ;->ܽ(I)V

    .line 235
    invoke-virtual {v5}, Ll/ۤۨۡ;->ᩳ()I

    move-result v13

    invoke-virtual {v1, v13}, Ll/ۤۜܽ;->ܽ(I)V

    .line 238
    invoke-virtual {v5}, Ll/ۤۨۡ;->ᩳ()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v13, "uses-permission"

    .line 239
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v9, :cond_20

    .line 241
    iget-boolean v13, v0, Ll/ۨۨۡ;->ۧ:Z

    if-eqz v13, :cond_20

    const/4 v13, 0x0

    .line 242
    iput-boolean v13, v0, Ll/ۨۨۡ;->ۧ:Z

    .line 243
    iget-object v13, v0, Ll/ۨۨۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v13

    invoke-virtual {v1, v13}, Ll/ۤۜܽ;->ܽ(I)V

    .line 244
    iget-object v13, v0, Ll/ۨۨۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_d
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1f

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۛۨۡ;

    .line 245
    iget v15, v14, Ll/ۛۨۡ;->֫:I

    invoke-virtual {v1, v15}, Ll/ۤۜܽ;->ܽ(I)V

    .line 246
    iget v14, v14, Ll/ۛۨۡ;->ۧ:I

    invoke-virtual {v1, v14}, Ll/ۤۜܽ;->ܽ(I)V

    goto :goto_d

    :cond_1f
    move-object/from16 v16, v4

    move-object/from16 v17, v6

    move/from16 v18, v9

    goto/16 :goto_12

    .line 249
    :cond_20
    invoke-virtual {v5}, Ll/ۤۨۡ;->getDepth()I

    move-result v13

    add-int/lit8 v13, v13, -0x1

    invoke-virtual {v5, v13}, Ll/ۤۨۡ;->getNamespaceCount(I)I

    move-result v13

    .line 250
    invoke-virtual {v5}, Ll/ۤۨۡ;->getDepth()I

    move-result v14

    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->getNamespaceCount(I)I

    move-result v14

    .line 252
    new-instance v15, Ll/ܺۢᩴ;

    invoke-direct {v15}, Ll/ܺۢᩴ;-><init>()V

    :goto_e
    if-eq v13, v14, :cond_28

    move-object/from16 v16, v4

    .line 254
    invoke-virtual {v5, v13}, Ll/ۤۨۡ;->ۜ(I)I

    move-result v4

    move-object/from16 v17, v6

    .line 255
    invoke-virtual {v5, v13}, Ll/ۤۨۡ;->᩷(I)I

    move-result v6

    if-ltz v4, :cond_26

    move/from16 p1, v14

    .line 256
    invoke-interface {v11}, Ll/۫᩻ܽ;->size()I

    move-result v14

    if-ge v4, v14, :cond_25

    if-ltz v6, :cond_25

    invoke-interface {v11}, Ll/۫᩻ܽ;->size()I

    move-result v14

    if-lt v6, v14, :cond_21

    goto :goto_f

    .line 259
    :cond_21
    iget-object v14, v0, Ll/ۨۨۡ;->ۡ:Ljava/util/HashSet;

    move/from16 v18, v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_22

    goto :goto_10

    .line 262
    :cond_22
    invoke-virtual {v15, v4}, Ll/ۤܿᩴ;->contains(I)Z

    move-result v9

    if-eqz v9, :cond_23

    goto :goto_10

    .line 265
    :cond_23
    invoke-virtual {v5, v13}, Ll/ۤۨۡ;->getNamespacePrefix(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_27

    invoke-virtual {v5, v13}, Ll/ۤۨۡ;->getNamespaceUri(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_24

    goto :goto_10

    .line 268
    :cond_24
    invoke-virtual {v15, v4}, Ll/ܺۢᩴ;->add(I)Z

    .line 269
    invoke-virtual {v15, v6}, Ll/ܺۢᩴ;->add(I)Z

    goto :goto_10

    :cond_25
    :goto_f
    move/from16 v18, v9

    goto :goto_10

    :cond_26
    move/from16 v18, v9

    move/from16 p1, v14

    :cond_27
    :goto_10
    add-int/lit8 v13, v13, 0x1

    move/from16 v14, p1

    move-object/from16 v4, v16

    move-object/from16 v6, v17

    move/from16 v9, v18

    goto :goto_e

    :cond_28
    move-object/from16 v16, v4

    move-object/from16 v17, v6

    move/from16 v18, v9

    .line 271
    invoke-virtual {v15}, Ll/ܺۢᩴ;->size()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    invoke-virtual {v1, v4}, Ll/ۤۜܽ;->ܽ(I)V

    const/4 v4, 0x0

    .line 272
    :goto_11
    invoke-virtual {v15}, Ll/ܺۢᩴ;->size()I

    move-result v6

    if-ge v4, v6, :cond_29

    .line 273
    invoke-virtual {v15, v4}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v6

    .line 274
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 275
    invoke-virtual {v1, v6}, Ll/ۤۜܽ;->ܽ(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    .line 281
    :cond_29
    :goto_12
    invoke-virtual {v5}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v4

    .line 282
    new-instance v6, Ll/ܺۢᩴ;

    invoke-direct {v6, v4}, Ll/ܺۢᩴ;-><init>(I)V

    .line 283
    new-instance v9, Ll/ᩴۢᩴ;

    invoke-direct {v9}, Ll/ᩴۢᩴ;-><init>()V

    .line 284
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 286
    iget-object v14, v0, Ll/ۨۨۡ;->ܿ:Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    const-string v15, ":"

    if-eqz v14, :cond_3f

    const/4 v14, 0x0

    const/16 v19, 0x0

    :goto_13
    if-eq v14, v4, :cond_3e

    .line 288
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->᩻(I)I

    move-result v20

    packed-switch v20, :pswitch_data_0

    packed-switch v20, :pswitch_data_1

    packed-switch v20, :pswitch_data_2

    move-object/from16 v23, v1

    move-object/from16 v21, v3

    move/from16 p1, v8

    move-object/from16 v20, v10

    goto/16 :goto_19

    :pswitch_0
    move-object/from16 v20, v10

    .line 291
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->֫(I)I

    move-result v10

    if-ltz v10, :cond_3c

    .line 292
    invoke-interface {v11}, Ll/۫᩻ܽ;->size()I

    move-result v0

    if-lt v10, v0, :cond_2a

    goto :goto_14

    .line 295
    :cond_2a
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2b

    :goto_14
    goto/16 :goto_18

    .line 298
    :cond_2b
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    sget-object v10, Ll/۫᩻ܽ;->֫:Ljava/lang/String;

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2c

    goto :goto_15

    .line 302
    :cond_2c
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    goto :goto_15

    .line 306
    :cond_2d
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->getAttributePrefix(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2e

    :goto_15
    move-object/from16 v23, v1

    move-object/from16 v21, v3

    move/from16 p1, v8

    move/from16 v24, v12

    goto/16 :goto_17

    .line 310
    :cond_2e
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v0

    if-nez v0, :cond_36

    .line 312
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v10

    move/from16 p1, v8

    .line 313
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v8

    .line 314
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v21

    if-eqz v21, :cond_33

    move-object/from16 v21, v3

    .line 576
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2f

    move-object/from16 v23, v1

    goto/16 :goto_19

    :cond_2f
    const/16 v22, 0x0

    move-object/from16 v23, v1

    const/4 v1, 0x0

    :goto_16
    if-ge v1, v3, :cond_34

    move/from16 v22, v3

    .line 581
    invoke-virtual {v8, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    move/from16 v24, v12

    const/16 v12, 0x61

    if-lt v3, v12, :cond_30

    const/16 v12, 0x7a

    if-le v3, v12, :cond_32

    :cond_30
    const/16 v12, 0x41

    if-lt v3, v12, :cond_31

    const/16 v12, 0x5a

    if-le v3, v12, :cond_32

    :cond_31
    const/16 v12, 0x30

    if-lt v3, v12, :cond_3d

    const/16 v12, 0x39

    if-gt v3, v12, :cond_3d

    :cond_32
    add-int/lit8 v1, v1, 0x1

    move/from16 v3, v22

    move/from16 v12, v24

    goto :goto_16

    :cond_33
    move-object/from16 v23, v1

    move-object/from16 v21, v3

    :cond_34
    move/from16 v24, v12

    .line 317
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_35

    goto/16 :goto_1a

    .line 320
    :cond_35
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    goto :goto_1a

    :cond_36
    move-object/from16 v23, v1

    move-object/from16 v21, v3

    move/from16 p1, v8

    move/from16 v24, v12

    .line 324
    :cond_37
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->᩻(I)I

    move-result v1

    const/4 v3, 0x3

    if-ne v1, v3, :cond_39

    .line 325
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v1

    .line 9
    sget-object v3, Ll/۫᩻ܽ;->֫:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_38

    :goto_17
    const/4 v0, 0x1

    const/16 v19, 0x1

    goto :goto_1a

    .line 329
    :cond_38
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->ܳ(I)I

    move-result v1

    if-ltz v1, :cond_3d

    .line 330
    invoke-interface {v11}, Ll/۫᩻ܽ;->size()I

    move-result v3

    if-lt v1, v3, :cond_39

    goto :goto_1a

    :cond_39
    if-eqz v2, :cond_3a

    .line 334
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->᩻(I)I

    move-result v1

    const/4 v3, 0x3

    if-ne v1, v3, :cond_3a

    .line 335
    invoke-virtual {v5, v14}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0x100

    if-le v1, v3, :cond_3a

    goto :goto_1a

    :cond_3a
    if-eqz v0, :cond_3b

    .line 339
    invoke-virtual {v9, v0}, Ll/ᩴۢᩴ;->add(I)Z

    move-result v0

    if-nez v0, :cond_3b

    goto :goto_1a

    .line 342
    :cond_3b
    invoke-virtual {v6, v14}, Ll/ܺۢᩴ;->add(I)Z

    goto :goto_1a

    :cond_3c
    :goto_18
    move-object/from16 v23, v1

    move-object/from16 v21, v3

    move/from16 p1, v8

    :goto_19
    move/from16 v24, v12

    :cond_3d
    :goto_1a
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    move/from16 v8, p1

    move-object/from16 v10, v20

    move-object/from16 v3, v21

    move-object/from16 v1, v23

    move/from16 v12, v24

    goto/16 :goto_13

    :cond_3e
    move-object/from16 v23, v1

    move-object/from16 v21, v3

    move/from16 p1, v8

    move-object/from16 v20, v10

    move/from16 v24, v12

    goto/16 :goto_1e

    :cond_3f
    move-object/from16 v23, v1

    move-object/from16 v21, v3

    move/from16 p1, v8

    move-object/from16 v20, v10

    move/from16 v24, v12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v19, 0x0

    :goto_1b
    if-eq v0, v4, :cond_49

    .line 346
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->᩻(I)I

    move-result v1

    packed-switch v1, :pswitch_data_3

    packed-switch v1, :pswitch_data_4

    packed-switch v1, :pswitch_data_5

    goto/16 :goto_1d

    .line 349
    :pswitch_1
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->֫(I)I

    move-result v1

    if-ltz v1, :cond_48

    .line 350
    invoke-interface {v11}, Ll/۫᩻ܽ;->size()I

    move-result v3

    if-lt v1, v3, :cond_40

    goto/16 :goto_1d

    .line 353
    :cond_40
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_41

    goto :goto_1d

    .line 356
    :cond_41
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    .line 9
    sget-object v3, Ll/۫᩻ܽ;->֫:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_42

    goto :goto_1c

    .line 360
    :cond_42
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    goto :goto_1c

    .line 364
    :cond_43
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->getAttributePrefix(I)Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_44

    goto :goto_1c

    .line 368
    :cond_44
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->᩻(I)I

    move-result v1

    const/4 v8, 0x3

    if-ne v1, v8, :cond_45

    .line 369
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    :goto_1c
    const/16 v19, 0x1

    goto :goto_1d

    .line 374
    :cond_45
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v1

    if-nez v1, :cond_46

    .line 376
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v1

    .line 377
    invoke-virtual {v5, v0}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v3

    .line 378
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_47

    goto :goto_1d

    .line 381
    :cond_46
    invoke-virtual {v9, v1}, Ll/ᩴۢᩴ;->add(I)Z

    move-result v1

    if-nez v1, :cond_47

    goto :goto_1d

    .line 384
    :cond_47
    invoke-virtual {v6, v0}, Ll/ܺۢᩴ;->add(I)Z

    :cond_48
    :goto_1d
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_1b

    :cond_49
    :goto_1e
    if-nez v2, :cond_4a

    if-eqz v19, :cond_4c

    .line 387
    :cond_4a
    invoke-virtual {v6}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4c

    move-object/from16 v0, v23

    move/from16 v1, v24

    .line 388
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(I)V

    .line 389
    invoke-static {v5}, Ll/ۨۨۡ;->֫(Ll/ۤۨۡ;)V

    .line 528
    :goto_1f
    invoke-virtual/range {v21 .. v21}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    :cond_4b
    move-object/from16 v6, p0

    goto/16 :goto_27

    :cond_4c
    move-object/from16 v0, v23

    move/from16 v1, v24

    const v2, 0x1010003

    if-eqz p1, :cond_52

    const/4 v3, 0x0

    .line 152
    invoke-virtual {v6, v3}, Ll/ܺۢᩴ;->listIterator(I)Ll/ܶۡᩴ;

    move-result-object v3

    .line 394
    :cond_4d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_52

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 395
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v5, v8}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v8

    if-ne v8, v2, :cond_4d

    .line 396
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v5, v3}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v3

    .line 541
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_4e

    goto :goto_21

    :cond_4e
    const/4 v8, 0x0

    :goto_20
    if-ge v8, v4, :cond_51

    .line 546
    invoke-virtual {v3, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x4e00

    if-lt v9, v10, :cond_50

    const v10, 0x9fa5

    if-le v9, v10, :cond_4f

    goto :goto_21

    :cond_4f
    add-int/lit8 v8, v8, 0x1

    goto :goto_20

    :cond_50
    :goto_21
    const/16 v4, 0x6211

    .line 398
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v8, -0x1

    if-ne v4, v8, :cond_51

    const/16 v4, 0x5e72

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ne v4, v8, :cond_51

    const/16 v4, 0x5988

    .line 399
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ne v4, v8, :cond_51

    const/16 v4, 0x6b7b

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ne v4, v8, :cond_51

    const/16 v4, 0x4f60

    .line 400
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ne v4, v8, :cond_51

    const/16 v4, 0x5c4c

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ne v4, v8, :cond_51

    const v4, 0x8349

    .line 401
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ne v4, v8, :cond_51

    const/16 v4, 0x64cd

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-eq v3, v8, :cond_52

    .line 402
    :cond_51
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(I)V

    .line 403
    invoke-static {v5}, Ll/ۨۨۡ;->֫(Ll/ۤۨۡ;)V

    goto/16 :goto_1f

    .line 411
    :cond_52
    invoke-virtual {v6}, Ll/ܺۢᩴ;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܽ(I)V

    const/4 v1, 0x0

    .line 152
    invoke-virtual {v6, v1}, Ll/ܺۢᩴ;->listIterator(I)Ll/ܶۡᩴ;

    move-result-object v1

    .line 413
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v18, :cond_56

    .line 415
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Ll/ۤۨۡ;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v4

    .line 416
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_54

    .line 417
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v5, v6}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v6

    if-lez v6, :cond_54

    ushr-int/lit8 v4, v6, 0x18

    const/4 v6, 0x1

    if-ne v4, v6, :cond_53

    move-object/from16 v6, p0

    move-object v4, v7

    goto :goto_23

    :cond_53
    move-object/from16 v6, p0

    move-object/from16 v4, v16

    goto :goto_23

    :cond_54
    move-object/from16 v6, p0

    .line 427
    :goto_23
    iget-object v8, v6, Ll/ۨۨۡ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v8, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۨۡ;

    if-eqz v4, :cond_55

    .line 429
    iget v8, v4, Ll/ۛۨۡ;->֫:I

    invoke-virtual {v0, v8}, Ll/ۤۜܽ;->ܽ(I)V

    .line 430
    iget v4, v4, Ll/ۛۨۡ;->ۧ:I

    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->ܽ(I)V

    goto :goto_24

    :cond_55
    const/4 v4, -0x1

    .line 432
    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->ܽ(I)V

    .line 433
    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->ܽ(I)V

    goto :goto_24

    :cond_56
    move-object/from16 v6, p0

    .line 436
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Ll/ۤۨۡ;->ܽ(I)I

    move-result v4

    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->ܽ(I)V

    .line 437
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Ll/ۤۨۡ;->ۧ(I)I

    move-result v4

    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->ܽ(I)V

    .line 439
    :goto_24
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v4

    .line 440
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v5, v8}, Ll/ۤۨۡ;->᩻(I)I

    move-result v8

    .line 441
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v5, v9}, Ll/ۤۨۡ;->ᩳ(I)I

    move-result v9

    .line 442
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-virtual {v5, v10}, Ll/ۤۨۡ;->ܳ(I)I

    move-result v10

    const/high16 v11, 0x1010000

    const/4 v12, 0x3

    if-ne v4, v11, :cond_57

    if-ne v8, v12, :cond_57

    const-string v11, "@(android:)?([0-9a-fA-F]{7,8})"

    .line 445
    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {v5, v12}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v11

    .line 446
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    move-result v12

    if-eqz v12, :cond_57

    const/4 v8, 0x2

    .line 448
    invoke-virtual {v11, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v9, 0x10

    invoke-static {v8, v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    const/4 v8, 0x1

    const/4 v10, -0x1

    .line 452
    :cond_57
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v5, v11}, Ll/ۤۨۡ;->֫(I)I

    move-result v11

    invoke-virtual {v0, v11}, Ll/ۤۜܽ;->ܽ(I)V

    .line 453
    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 454
    invoke-virtual {v0, v8}, Ll/ۤۜܽ;->writeByte(I)V

    .line 455
    invoke-virtual {v0, v9}, Ll/ۤۜܽ;->writeInt(I)V

    .line 456
    invoke-virtual {v0, v10}, Ll/ۤۜܽ;->ܽ(I)V

    .line 458
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v5, v9}, Ll/ۤۨۡ;->֫(I)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v11, v20

    invoke-virtual {v11, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz p1, :cond_58

    if-ne v4, v2, :cond_5b

    .line 462
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_58
    const/4 v4, 0x1

    if-eq v8, v4, :cond_59

    goto :goto_25

    .line 468
    :cond_59
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Ll/ۤۨۡ;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5b

    .line 469
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v5, v3}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "layout"

    .line 470
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5a

    const-string v4, "style"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5b

    :cond_5a
    const/4 v3, -0x1

    if-eq v10, v3, :cond_5b

    .line 472
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_5b
    :goto_25
    move-object/from16 v20, v11

    goto/16 :goto_22

    :cond_5c
    :goto_26
    move-object/from16 v21, v3

    move-object/from16 v16, v4

    move-object/from16 v17, v6

    move-object v6, v0

    move-object v0, v1

    .line 200
    invoke-static {v5}, Ll/ۨۨۡ;->֫(Ll/ۤۨۡ;)V

    :goto_27
    const/4 v10, 0x1

    move-object/from16 v2, p2

    move-object v1, v0

    move-object v0, v6

    move-object/from16 v4, v16

    move-object/from16 v6, v17

    move-object/from16 v3, v21

    goto/16 :goto_8

    :cond_5d
    move-object v6, v0

    move-object v0, v1

    .line 78
    invoke-virtual {v5}, Ll/ۤۨۡ;->close()V

    .line 79
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v1

    .line 81
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual/range {p2 .. p2}, Ll/۬ܿܽ;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    invoke-virtual/range {p2 .. p2}, Ll/᩷ܿܽ;->ۧ()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_28
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ᩻ܽ;

    .line 83
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 84
    iget-object v7, v6, Ll/ۨۨۡ;->ᩳ:Ljava/util/HashSet;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5e

    invoke-interface {v4}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v7, 0xc8

    if-ge v5, v7, :cond_5e

    .line 85
    invoke-interface {v4}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_28

    .line 87
    :cond_5e
    invoke-interface {v4}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_28

    :cond_5f
    const-wide/16 v3, 0x0

    .line 89
    invoke-virtual {v0, v3, v4}, Ll/ۤۜܽ;->seek(J)V

    const v3, 0x12345678

    .line 90
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 91
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 93
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_29
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_60

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 94
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 95
    array-length v4, v3

    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->ܽ(I)V

    .line 44
    array-length v4, v3

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5, v4}, Ll/ۤۜܽ;->write([BII)V

    goto :goto_29

    .line 98
    :cond_60
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->write([B)V

    .line 99
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    iput-object v0, v6, Ll/ۨۨۡ;->֫:[B

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x10
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x10
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1c
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static ֫(Ll/ۤۨۡ;)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 593
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v2

    if-eq v2, v0, :cond_2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, -0x1

    if-nez v1, :cond_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()[B
    .locals 1

    .line 188
    iget-object v0, p0, Ll/ۨۨۡ;->֫:[B

    return-object v0
.end method
