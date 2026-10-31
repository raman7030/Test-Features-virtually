.class public final Ll/ܽ᩶ۡ;
.super Ll/ܳ᩶ۡ;
.source "TBJQ"


# static fields
.field public static final ۡ:Ljava/util/logging/Logger;


# instance fields
.field public ۜ:Ll/֫᩶ۡ;

.field public ۢ:Ll/֫᩶ۡ;

.field public ᩷:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "SvgLeafNode"

    .line 47
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ܽ᩶ۡ;->ۡ:Ljava/util/logging/Logger;

    return-void
.end method

.method private ܳ(Ljava/lang/String;)D
    .locals 6

    .line 157
    iget-object v0, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    if-eqz p1, :cond_1

    :try_start_0
    const-string v2, "%"

    .line 160
    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 161
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    div-double/2addr v2, v4

    goto :goto_0

    .line 163
    :cond_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    move-wide v2, v0

    :goto_0
    const-wide/16 v4, 0x0

    .line 169
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final ֫()Ll/ܳ᩶ۡ;
    .locals 4

    .line 63
    new-instance v0, Ll/ܽ᩶ۡ;

    iget-object v1, p0, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    .line 186
    iget-object v2, p0, Ll/ܳ᩶ۡ;->ܽ:Ljava/lang/String;

    .line 57
    iget-object v3, p0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    invoke-direct {v0, v3, v1, v2}, Ll/ܳ᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 282
    iget-object v1, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ll/ܳ᩶ۡ;->֫(Ljava/util/HashMap;)V

    .line 283
    iget-object v1, p0, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    invoke-virtual {v1}, Ll/֡᩶ۡ;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩶ۡ;

    iput-object v1, v0, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    .line 70
    iget-object v1, p0, Ll/ܽ᩶ۡ;->᩷:Ljava/lang/String;

    iput-object v1, v0, Ll/ܽ᩶ۡ;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/io/OutputStreamWriter;Ljava/lang/String;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 253
    iget-object v3, v0, Ll/ܽ᩶ۡ;->᩷:Ljava/lang/String;

    if-eqz v3, :cond_18

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_b

    .line 257
    :cond_0
    iget-object v3, v0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    const-string v4, "fill"

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "stroke"

    .line 258
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 259
    sget-object v8, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "fill color "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ll/ܽ᩶ۡ;->ۡ:Ljava/util/logging/Logger;

    invoke-virtual {v10, v8, v9}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    const-string v9, "none"

    .line 260
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    const-string v11, "#00000000"

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_0

    :cond_1
    const/4 v11, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v11, 0x1

    :goto_1
    if-eqz v7, :cond_4

    .line 261
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v7, 0x1

    :goto_3
    if-eqz v11, :cond_5

    if-eqz v7, :cond_5

    goto/16 :goto_b

    .line 267
    :cond_5
    invoke-virtual/range {p1 .. p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v9, "<path"

    .line 268
    invoke-virtual {v1, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v9, "\n"

    .line 269
    invoke-virtual {v1, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v11, "    "

    if-nez v5, :cond_6

    .line 270
    iget-object v5, v0, Ll/ܽ᩶ۡ;->ۜ:Ll/֫᩶ۡ;

    if-nez v5, :cond_6

    const-string v5, "Adding default fill color"

    .line 271
    invoke-virtual {v10, v8, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 272
    invoke-virtual/range {p1 .. p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 273
    invoke-virtual {v1, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v5, "android:fillColor=\"#FF000000\""

    .line 274
    invoke-virtual {v1, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 275
    invoke-virtual {v1, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_6
    if-nez v7, :cond_7

    const-string v5, "stroke-width"

    .line 278
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    iget-object v5, v0, Ll/ܽ᩶ۡ;->ۢ:Ll/֫᩶ۡ;

    if-nez v5, :cond_7

    const-string v5, "Adding default stroke width"

    .line 280
    invoke-virtual {v10, v8, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 281
    invoke-virtual/range {p1 .. p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 282
    invoke-virtual {v1, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v5, "android:strokeWidth=\"1\""

    .line 283
    invoke-virtual {v1, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 284
    invoke-virtual {v1, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 288
    :cond_7
    invoke-virtual/range {p1 .. p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 289
    invoke-virtual {v1, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 290
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "android:pathData=\""

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v0, Ll/ܽ᩶ۡ;->᩷:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\""

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v5, "opacity"

    .line 140
    invoke-direct {v0, v5}, Ll/ܽ᩶ۡ;->ܳ(Ljava/lang/String;)D

    move-result-wide v12

    const-string v8, "fill-opacity"

    .line 141
    invoke-direct {v0, v8}, Ll/ܽ᩶ۡ;->ܳ(Ljava/lang/String;)D

    move-result-wide v14

    const-string v10, "stroke-opacity"

    .line 142
    invoke-direct {v0, v10}, Ll/ܽ᩶ۡ;->ܳ(Ljava/lang/String;)D

    move-result-wide v16

    mul-double v14, v14, v12

    .line 173
    invoke-static {v14, v15}, Ll/᩻֡ۚ;->֫(D)Ljava/lang/String;

    move-result-object v14

    const-string v15, "1"

    .line 174
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_8

    .line 175
    invoke-virtual {v3, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 177
    :cond_8
    invoke-virtual {v3, v8, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    mul-double v16, v16, v12

    .line 173
    invoke-static/range {v16 .. v17}, Ll/᩻֡ۚ;->֫(D)Ljava/lang/String;

    move-result-object v8

    .line 174
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    .line 175
    invoke-virtual {v3, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 177
    :cond_9
    invoke-virtual {v3, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    :goto_5
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 83
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 84
    sget-object v10, Ll/ۛ᩹ۡ;->ᩳ:Ll/ۢ۬ܺ;

    invoke-virtual {v10, v8}, Ll/ۢ۬ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 85
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_a

    goto :goto_6

    .line 88
    :cond_a
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const-string v12, "#000000"

    .line 89
    invoke-virtual {v0, v5, v12}, Ll/ܳ᩶ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_f

    .line 92
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    :cond_b
    const-string v12, "url(#"

    .line 126
    invoke-virtual {v5, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_c

    const-string v12, ")"

    invoke-virtual {v5, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_c

    const/4 v12, 0x5

    const/4 v13, 0x1

    .line 0
    invoke-static {v13, v12, v5}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 181
    iget-object v13, v0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    .line 128
    invoke-virtual {v13, v12}, Ll/ۢ᩶ۡ;->ܽ(Ljava/lang/String;)Ll/ܳ᩶ۡ;

    move-result-object v12

    .line 129
    instance-of v13, v12, Ll/֫᩶ۡ;

    if-eqz v13, :cond_c

    .line 130
    check-cast v12, Ll/֫᩶ۡ;

    goto :goto_7

    :cond_c
    const/4 v12, 0x0

    :goto_7
    if-eqz v12, :cond_e

    .line 95
    invoke-virtual {v12}, Ll/֫᩶ۡ;->֫()Ll/֫᩶ۡ;

    move-result-object v5

    .line 96
    invoke-virtual {v5, v0}, Ll/֫᩶ۡ;->֫(Ll/ܽ᩶ۡ;)V

    .line 97
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    .line 98
    sget-object v8, Ll/۟᩹ۡ;->᩹:Ll/۟᩹ۡ;

    invoke-virtual {v5, v8}, Ll/֫᩶ۡ;->֫(Ll/۟᩹ۡ;)V

    .line 99
    iput-object v5, v0, Ll/ܽ᩶ۡ;->ۜ:Ll/֫᩶ۡ;

    goto :goto_6

    .line 101
    :cond_d
    sget-object v8, Ll/۟᩹ۡ;->᩶:Ll/۟᩹ۡ;

    invoke-virtual {v5, v8}, Ll/֫᩶ۡ;->֫(Ll/۟᩹ۡ;)V

    .line 102
    iput-object v5, v0, Ll/ܽ᩶ۡ;->ۢ:Ll/֫᩶ۡ;

    goto/16 :goto_6

    :cond_e
    const-string v8, "px"

    .line 108
    invoke-virtual {v5, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_10

    .line 109
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, -0x2

    const/4 v12, 0x0

    invoke-virtual {v5, v12, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    goto :goto_8

    :cond_f
    move-object v5, v12

    .line 114
    :cond_10
    :goto_8
    invoke-virtual {v1, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 115
    invoke-virtual/range {p1 .. p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v1, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 117
    invoke-virtual {v1, v10}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v8, "=\""

    .line 118
    invoke-virtual {v1, v8}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 119
    invoke-virtual {v1, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v1, v7}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto/16 :goto_6

    .line 202
    :cond_11
    iget-object v3, v0, Ll/ܽ᩶ۡ;->ۜ:Ll/֫᩶ۡ;

    if-nez v3, :cond_13

    iget-object v3, v0, Ll/ܽ᩶ۡ;->ۢ:Ll/֫᩶ۡ;

    if-eqz v3, :cond_12

    goto :goto_9

    :cond_12
    const/16 v3, 0x2f

    .line 293
    invoke-virtual {v1, v3}, Ljava/io/OutputStreamWriter;->write(I)V

    :cond_13
    :goto_9
    const/16 v3, 0x3e

    .line 295
    invoke-virtual {v1, v3}, Ljava/io/OutputStreamWriter;->write(I)V

    .line 296
    invoke-virtual {v1, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 298
    iget-object v3, v0, Ll/ܽ᩶ۡ;->ۜ:Ll/֫᩶ۡ;

    const-string v4, "  "

    if-eqz v3, :cond_14

    .line 0
    invoke-static {v2, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 299
    invoke-virtual {v3, v1, v5}, Ll/֫᩶ۡ;->֫(Ljava/io/OutputStreamWriter;Ljava/lang/String;)V

    .line 301
    :cond_14
    iget-object v3, v0, Ll/ܽ᩶ۡ;->ۢ:Ll/֫᩶ۡ;

    if-eqz v3, :cond_15

    .line 0
    invoke-static {v2, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 302
    invoke-virtual {v3, v1, v4}, Ll/֫᩶ۡ;->֫(Ljava/io/OutputStreamWriter;Ljava/lang/String;)V

    .line 202
    :cond_15
    iget-object v3, v0, Ll/ܽ᩶ۡ;->ۜ:Ll/֫᩶ۡ;

    if-nez v3, :cond_17

    iget-object v3, v0, Ll/ܽ᩶ۡ;->ۢ:Ll/֫᩶ۡ;

    if-eqz v3, :cond_16

    goto :goto_a

    :cond_16
    return-void

    .line 305
    :cond_17
    :goto_a
    invoke-virtual/range {p1 .. p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v2, "</path>"

    .line 306
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 307
    invoke-virtual {v1, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_18
    :goto_b
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 183
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 183
    iget-object v1, p0, Ll/ܽ᩶ۡ;->᩷:Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, " null pathData "

    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    iget-object v1, p0, Ll/ܳ᩶ۡ;->ܽ:Ljava/lang/String;

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, " null name "

    :goto_1
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 183
    sget-object v1, Ll/ܽ᩶ۡ;->ۡ:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/֡᩶ۡ;)V
    .locals 9

    .line 222
    iget-object v0, p0, Ll/ܳ᩶ۡ;->ᩳ:Ll/֡᩶ۡ;

    invoke-virtual {v0, p1}, Ll/֡᩶ۡ;->ܽ(Ll/֡᩶ۡ;)V

    .line 223
    iget-object p1, p0, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    invoke-virtual {v0, p1}, Ll/֡᩶ۡ;->֫(Ll/֡᩶ۡ;)V

    const-string p1, "vector-effect"

    .line 225
    iget-object v1, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "non-scaling-stroke"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 226
    invoke-virtual {v0}, Ll/֡᩶ۡ;->ܽ()I

    move-result p1

    and-int/lit8 p1, p1, 0x6

    if-eqz p1, :cond_1

    const-string p1, "stroke-width"

    .line 227
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 234
    :try_start_0
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    .line 235
    invoke-virtual {v0}, Ll/֡᩶ۡ;->֫()D

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmpl-double v8, v4, v6

    if-eqz v8, :cond_0

    .line 237
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    mul-double v2, v2, v4

    .line 238
    iget-object v4, p0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    invoke-virtual {v4, v2, v3}, Ll/ۢ᩶ۡ;->֫(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    :cond_0
    invoke-virtual {v0}, Ll/֡᩶ۡ;->ܽ()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_1

    const-string p1, "Scaling of the stroke width is approximate"

    .line 241
    invoke-virtual {p0, p1}, Ll/ܳ᩶ۡ;->ܽ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public final ۧ(Ll/֡᩶ۡ;)V
    .locals 3

    .line 207
    iget-object v0, p0, Ll/ܽ᩶ۡ;->᩷:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 211
    :cond_0
    iget-object v0, p0, Ll/ܽ᩶ۡ;->᩷:Ljava/lang/String;

    sget-object v1, Ll/۬᩹ۡ;->᩶:Ll/۬᩹ۡ;

    invoke-static {v0, v1}, Ll/۫᩹ۡ;->֫(Ljava/lang/String;Ll/۬᩹ۡ;)[Ll/ۖ᩶ۡ;

    move-result-object v0

    .line 212
    iget-object v1, p0, Ll/ܳ᩶ۡ;->ᩳ:Ll/֡᩶ۡ;

    invoke-virtual {v1, p1}, Ll/֡᩶ۡ;->ۧ(Ll/֡᩶ۡ;)V

    .line 213
    invoke-static {v0}, Ll/ۖ᩶ۡ;->֫([Ll/ۖ᩶ۡ;)Z

    move-result p1

    .line 214
    invoke-virtual {v1}, Ll/֡᩶ۡ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz p1, :cond_2

    .line 215
    :cond_1
    invoke-static {v1, v0}, Ll/ۖ᩶ۡ;->֫(Ll/֡᩶ۡ;[Ll/ۖ᩶ۡ;)V

    .line 217
    :cond_2
    iget-object p1, p0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    invoke-static {v0, p1}, Ll/ۖ᩶ۡ;->֫([Ll/ۖ᩶ۡ;Ll/ۢ᩶ۡ;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ᩶ۡ;->᩷:Ljava/lang/String;

    :cond_3
    :goto_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 0

    .line 188
    iput-object p1, p0, Ll/ܽ᩶ۡ;->᩷:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ܽ᩶ۡ;->᩷:Ljava/lang/String;

    return-object v0
.end method
