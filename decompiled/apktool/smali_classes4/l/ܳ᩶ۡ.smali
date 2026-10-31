.class public abstract Ll/ܳ᩶ۡ;
.super Ljava/lang/Object;
.source "RBJL"


# static fields
.field public static final ᩻:Ljava/util/logging/Logger;


# instance fields
.field public final ֫:Lorg/w3c/dom/Element;

.field public ۧ:Ll/֡᩶ۡ;

.field public final ܳ:Ljava/util/HashMap;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ll/ۢ᩶ۡ;

.field public ᩳ:Ll/֡᩶ۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "SvgNode"

    .line 44
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ܳ᩶ۡ;->᩻:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V
    .locals 4

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    .line 66
    new-instance v0, Ll/֡᩶ۡ;

    invoke-direct {v0}, Ll/֡᩶ۡ;-><init>()V

    iput-object v0, p0, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    .line 70
    new-instance v0, Ll/֡᩶ۡ;

    invoke-direct {v0}, Ll/֡᩶ۡ;-><init>()V

    iput-object v0, p0, Ll/ܳ᩶ۡ;->ᩳ:Ll/֡᩶ۡ;

    .line 76
    iput-object p3, p0, Ll/ܳ᩶ۡ;->ܽ:Ljava/lang/String;

    .line 77
    iput-object p1, p0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    .line 78
    iput-object p2, p0, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    .line 80
    invoke-interface {p2}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object p1

    .line 81
    invoke-interface {p1}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result p2

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_2

    .line 84
    invoke-interface {p1, p3}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v0

    .line 85
    invoke-interface {v0}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v1

    .line 86
    invoke-interface {v0}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v0

    .line 88
    sget-object v2, Ll/ۛ᩹ۡ;->ᩳ:Ll/ۢ۬ܺ;

    invoke-virtual {v2, v1}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 89
    invoke-direct {p0, v1, v0}, Ll/ܳ᩶ۡ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v2, "transform"

    .line 92
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 93
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ll/ܳ᩶ۡ;->᩻:Ljava/util/logging/Logger;

    invoke-virtual {v3, v2, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 94
    invoke-virtual {p0, v0}, Ll/ܳ᩶ۡ;->ᩳ(Ljava/lang/String;)V

    :cond_1
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private ܽ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "fill-rule"

    .line 228
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "clip-rule"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const-string v0, "nonzero"

    .line 229
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p2, "nonZero"

    goto :goto_0

    :cond_1
    const-string v0, "evenodd"

    .line 231
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p2, "evenOdd"

    .line 235
    :cond_2
    :goto_0
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v1, ">>>> PROP "

    const-string v2, " = "

    .line 0
    invoke-static {v1, p1, v2, p2}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 235
    sget-object v2, Ll/ܳ᩶ۡ;->᩻:Ljava/util/logging/Logger;

    invoke-virtual {v2, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    const-string v0, "url("

    .line 236
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "stroke"

    if-eqz v0, :cond_3

    const-string v0, "fill"

    .line 237
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string p1, "Unsupported URL value: "

    .line 238
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_3
    const-string v0, "stroke-width"

    .line 242
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    if-eqz v0, :cond_4

    const-string v0, "0"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 243
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    :cond_4
    invoke-virtual {v2, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 299
    :try_start_0
    invoke-static {p1}, Ll/᩺᩹ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string v0, "Unsupported color format \""

    const-string v1, "\""

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 301
    invoke-virtual {p0, p1}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;)V

    return-object p2
.end method

.method public abstract ֫()Ll/ܳ᩶ۡ;
.end method

.method public ֫(Ll/ۖ֡ᩳ;)Ll/ܿ᩶ۡ;
    .locals 0

    .line 214
    iget-object p1, p1, Ll/ۖ֡ᩳ;->᩹:Ljava/lang/Object;

    check-cast p1, Ljava/util/EnumMap;

    invoke-static {p1, p0}, Ll/ۨ᩹ۡ;->֫(Ljava/util/EnumMap;Ll/ܳ᩶ۡ;)Ll/ܿ᩶ۡ;

    move-result-object p1

    return-object p1
.end method

.method public abstract ֫(Ljava/io/OutputStreamWriter;Ljava/lang/String;)V
.end method

.method public abstract ֫(Ljava/lang/String;)V
.end method

.method public final ֫(Ljava/util/HashMap;)V
    .locals 4

    .line 254
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 255
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 256
    iget-object v2, p0, Ll/ܳ᩶ۡ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 257
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public abstract ֫(Ll/֡᩶ۡ;)V
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 307
    iget-object v0, p0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    iget-object v1, p0, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    invoke-virtual {v0, p1, v1}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V

    return-void
.end method

.method public ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 249
    invoke-direct {p0, p1, p2}, Ll/ܳ᩶ۡ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public abstract ۧ(Ll/֡᩶ۡ;)V
.end method

.method public abstract ۧ()Z
.end method

.method public ܽ()V
    .locals 0

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 3

    .line 311
    iget-object v0, p0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    sget-object v1, Ll/᩷᩶ۡ;->᩶:Ll/᩷᩶ۡ;

    iget-object v2, p0, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    invoke-virtual {v0, p1, v2, v1}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;Ll/᩷᩶ۡ;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 23

    const-string v0, ","

    const-string v1, " "

    move-object/from16 v2, p1

    .line 102
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "[()]"

    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 105
    :goto_0
    array-length v3, v0

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    if-ge v2, v3, :cond_14

    .line 106
    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v5, v2, 0x1

    aget-object v5, v0, v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\\s+"

    .line 166
    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 167
    array-length v6, v5

    const/4 v7, 0x0

    if-nez v6, :cond_0

    move-object v8, v7

    goto :goto_2

    .line 172
    :cond_0
    new-array v8, v6, [F

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v6, :cond_1

    .line 174
    aget-object v10, v5, v9

    invoke-static {v10}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v10

    aput v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-nez v8, :cond_2

    :goto_3
    move/from16 v22, v2

    goto/16 :goto_8

    .line 119
    :cond_2
    array-length v5, v8

    .line 120
    new-instance v6, Ll/֡᩶ۡ;

    invoke-direct {v6}, Ll/֡᩶ۡ;-><init>()V

    const-string v9, "matrix"

    .line 122
    invoke-virtual {v9, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    const/4 v10, 0x2

    const/4 v11, 0x3

    if-eqz v9, :cond_5

    const/4 v3, 0x6

    if-eq v5, v3, :cond_3

    goto :goto_3

    .line 126
    :cond_3
    aget v3, v8, v1

    float-to-double v12, v3

    aget v3, v8, v4

    float-to-double v3, v3

    aget v5, v8, v10

    float-to-double v14, v5

    aget v5, v8, v11

    float-to-double v10, v5

    const/4 v5, 0x4

    aget v5, v8, v5

    move/from16 v22, v2

    float-to-double v1, v5

    const/4 v5, 0x5

    aget v5, v8, v5

    float-to-double v7, v5

    move-object v9, v6

    move-wide/from16 v16, v10

    move-wide v10, v12

    move-wide v12, v3

    move-wide/from16 v18, v1

    move-wide/from16 v20, v7

    invoke-virtual/range {v9 .. v21}, Ll/֡᩶ۡ;->֫(DDDDDD)V

    :cond_4
    :goto_4
    const/4 v1, 0x0

    goto/16 :goto_9

    :cond_5
    move/from16 v22, v2

    const-string v1, "translate"

    .line 128
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const-wide/16 v12, 0x0

    if-eqz v1, :cond_8

    if-eq v5, v4, :cond_6

    if-eq v5, v10, :cond_6

    goto/16 :goto_8

    :cond_6
    const/4 v1, 0x0

    .line 133
    aget v2, v8, v1

    float-to-double v1, v2

    if-ne v5, v10, :cond_7

    aget v3, v8, v4

    float-to-double v12, v3

    :cond_7
    invoke-virtual {v6, v1, v2, v12, v13}, Ll/֡᩶ۡ;->ܽ(DD)V

    goto :goto_4

    :cond_8
    const-string v1, "scale"

    .line 134
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    if-eq v5, v4, :cond_9

    if-eq v5, v10, :cond_9

    goto/16 :goto_8

    :cond_9
    const/4 v1, 0x0

    .line 139
    aget v2, v8, v1

    float-to-double v1, v2

    if-ne v5, v10, :cond_a

    goto :goto_5

    :cond_a
    const/4 v4, 0x0

    :goto_5
    aget v3, v8, v4

    float-to-double v3, v3

    invoke-virtual {v6, v1, v2, v3, v4}, Ll/֡᩶ۡ;->֫(DD)V

    goto :goto_4

    :cond_b
    const-string v1, "rotate"

    .line 140
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    if-eq v5, v4, :cond_c

    if-eq v5, v11, :cond_c

    goto :goto_8

    :cond_c
    const/4 v1, 0x0

    .line 144
    aget v2, v8, v1

    float-to-double v1, v2

    .line 145
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    if-ne v5, v11, :cond_d

    .line 146
    aget v3, v8, v4

    float-to-double v3, v3

    goto :goto_6

    :cond_d
    move-wide v3, v12

    :goto_6
    if-ne v5, v11, :cond_e

    .line 147
    aget v5, v8, v10

    float-to-double v7, v5

    move-wide v14, v7

    goto :goto_7

    :cond_e
    move-wide v14, v12

    :goto_7
    move-object v9, v6

    move-wide v10, v1

    move-wide v12, v3

    .line 144
    invoke-virtual/range {v9 .. v15}, Ll/֡᩶ۡ;->֫(DDD)V

    goto :goto_4

    :cond_f
    const-string v1, "skewX"

    .line 148
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    if-eq v5, v4, :cond_10

    goto :goto_8

    :cond_10
    const/4 v1, 0x0

    .line 154
    aget v2, v8, v1

    float-to-double v1, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->tan(D)D

    move-result-wide v1

    invoke-virtual {v6, v1, v2, v12, v13}, Ll/֡᩶ۡ;->ۧ(DD)V

    goto/16 :goto_4

    :cond_11
    const-string v1, "skewY"

    .line 155
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    if-eq v5, v4, :cond_12

    :goto_8
    const/4 v1, 0x0

    goto :goto_a

    :cond_12
    const/4 v1, 0x0

    .line 159
    aget v2, v8, v1

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->tan(D)D

    move-result-wide v2

    invoke-virtual {v6, v12, v13, v2, v3}, Ll/֡᩶ۡ;->ۧ(DD)V

    :goto_9
    move-object v7, v6

    :goto_a
    move-object/from16 v2, p0

    if-eqz v7, :cond_13

    .line 108
    iget-object v3, v2, Ll/ܳ᩶ۡ;->ۧ:Ll/֡᩶ۡ;

    invoke-virtual {v3, v7}, Ll/֡᩶ۡ;->֫(Ll/֡᩶ۡ;)V

    :cond_13
    add-int/lit8 v3, v22, 0x2

    move v2, v3

    goto/16 :goto_0

    :cond_14
    move-object/from16 v2, p0

    return-void
.end method
