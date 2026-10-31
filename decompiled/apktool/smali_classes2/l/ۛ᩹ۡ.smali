.class public final Ll/ۛ᩹ۡ;
.super Ljava/lang/Object;
.source "ZBIL"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;

.field public static final ۧ:Ll/ۢ۬ܺ;

.field public static final ܽ:Ljava/util/logging/Logger;

.field public static final ܿ:Ll/ۛ۬ܺ;

.field public static final ᩳ:Ll/ۢ۬ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 71

    const-string v0, "Svg2Vector"

    .line 60
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ۛ᩹ۡ;->ܽ:Ljava/util/logging/Logger;

    .line 95
    invoke-static {}, Ll/ۢ۬ܺ;->᩻()Ll/ۜ۬ܺ;

    move-result-object v0

    const-string v1, "clip"

    const-string v2, "android:clip"

    .line 96
    invoke-virtual {v0, v1, v2}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "clip-rule"

    const-string v2, ""

    .line 97
    invoke-virtual {v0, v1, v2}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "fill"

    const-string v3, "android:fillColor"

    .line 98
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "fill-rule"

    const-string v3, "android:fillType"

    .line 99
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "fill-opacity"

    const-string v3, "android:fillAlpha"

    .line 100
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "opacity"

    .line 101
    invoke-virtual {v0, v1, v2}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "stroke"

    const-string v3, "android:strokeColor"

    .line 102
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "stroke-opacity"

    const-string v3, "android:strokeAlpha"

    .line 103
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "stroke-linejoin"

    const-string v3, "android:strokeLineJoin"

    .line 104
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "stroke-linecap"

    const-string v3, "android:strokeLineCap"

    .line 105
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "stroke-width"

    const-string v3, "android:strokeWidth"

    .line 106
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    .line 107
    invoke-virtual {v0}, Ll/ۜ۬ܺ;->֫()Ll/ۢ۬ܺ;

    move-result-object v0

    sput-object v0, Ll/ۛ᩹ۡ;->ᩳ:Ll/ۢ۬ܺ;

    .line 110
    invoke-static {}, Ll/ۢ۬ܺ;->᩻()Ll/ۜ۬ܺ;

    move-result-object v0

    const-string v1, "x1"

    const-string v3, "android:startX"

    .line 111
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "y1"

    const-string v3, "android:startY"

    .line 112
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "x2"

    const-string v3, "android:endX"

    .line 113
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "y2"

    const-string v3, "android:endY"

    .line 114
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "cx"

    const-string v3, "android:centerX"

    .line 115
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "cy"

    const-string v3, "android:centerY"

    .line 116
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "r"

    const-string v3, "android:gradientRadius"

    .line 117
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "spreadMethod"

    const-string v3, "android:tileMode"

    .line 118
    invoke-virtual {v0, v1, v3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "gradientUnits"

    .line 119
    invoke-virtual {v0, v1, v2}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "gradientTransform"

    .line 120
    invoke-virtual {v0, v1, v2}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    const-string v1, "gradientType"

    const-string v2, "android:type"

    .line 121
    invoke-virtual {v0, v1, v2}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    .line 122
    invoke-virtual {v0}, Ll/ۜ۬ܺ;->֫()Ll/ۢ۬ܺ;

    move-result-object v0

    sput-object v0, Ll/ۛ᩹ۡ;->ۧ:Ll/ۢ۬ܺ;

    const-string v62, "script"

    const-string v63, "view"

    const-string v1, "a"

    const-string v2, "glyph"

    const-string v3, "marker"

    const-string v4, "missing-glyph"

    const-string v5, "pattern"

    const-string v6, "switch"

    const-string v7, "symbol"

    const-string v8, "feBlend"

    const-string v9, "feColorMatrix"

    const-string v10, "feComponentTransfer"

    const-string v11, "feComposite"

    const-string v12, "feConvolveMatrix"

    const-string v13, "feDiffuseLighting"

    const-string v14, "feDisplacementMap"

    const-string v15, "feFlood"

    const-string v16, "feFuncA"

    const-string v17, "feFuncB"

    const-string v18, "feFuncG"

    const-string v19, "feFuncR"

    const-string v20, "feGaussianBlur"

    const-string v21, "feImage"

    const-string v22, "feMerge"

    const-string v23, "feMergeNode"

    const-string v24, "feMorphology"

    const-string v25, "feOffset"

    const-string v26, "feSpecularLighting"

    const-string v27, "feTile"

    const-string v28, "feTurbulence"

    const-string v29, "font"

    const-string v30, "font-face"

    const-string v31, "font-face-format"

    const-string v32, "font-face-name"

    const-string v33, "font-face-src"

    const-string v34, "font-face-uri"

    const-string v35, "hkern"

    const-string v36, "vkern"

    const-string v37, "stop"

    const-string v38, "ellipse"

    const-string v39, "image"

    const-string v40, "text"

    const-string v41, "feDistantLight"

    const-string v42, "fePointLight"

    const-string v43, "feSpotLight"

    const-string v44, "symbol"

    const-string v45, "altGlyph"

    const-string v46, "altGlyphDef"

    const-string v47, "altGlyphItem"

    const-string v48, "glyph"

    const-string v49, "glyphRef"

    const-string v50, "textPath"

    const-string v51, "text"

    const-string v52, "tref"

    const-string v53, "tspan"

    const-string v54, "altGlyph"

    const-string v55, "textPath"

    const-string v56, "tref"

    const-string v57, "tspan"

    const-string v58, "color-profile"

    const-string v59, "cursor"

    const-string v60, "filter"

    const-string v61, "foreignObject"

    .line 125
    filled-new-array/range {v1 .. v63}, [Ljava/lang/String;

    move-result-object v70

    const-string v64, "animate"

    const-string v65, "animateColor"

    const-string v66, "animateMotion"

    const-string v67, "animateTransform"

    const-string v68, "mpath"

    const-string v69, "set"

    invoke-static/range {v64 .. v70}, Ll/ۛ۬ܺ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object v0

    sput-object v0, Ll/ۛ᩹ۡ;->ܿ:Ll/ۛ۬ܺ;

    const-string v0, "[\\s,]+"

    .line 207
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۛ᩹ۡ;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/io/ByteArrayOutputStream;)Ljava/lang/String;
    .locals 10

    .line 1250
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object p0

    .line 211
    new-instance v1, Ll/ۢ᩶ۡ;

    invoke-direct {v1}, Ll/ۢ᩶ۡ;-><init>()V

    .line 212
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 213
    invoke-virtual {v1, v0, v2, p0}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Ljava/util/ArrayList;[B)Lorg/w3c/dom/Document;

    move-result-object p0

    .line 214
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    .line 215
    invoke-virtual {v1, v2, v3}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V

    goto :goto_0

    :cond_0
    const-string v0, "svg"

    .line 219
    invoke-interface {p0, v0}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object p0

    .line 220
    invoke-interface {p0}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_15

    const/4 v0, 0x0

    .line 223
    invoke-interface {p0, v0}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object p0

    check-cast p0, Lorg/w3c/dom/Element;

    .line 224
    invoke-virtual {v1, p0}, Ll/ۢ᩶ۡ;->֫(Lorg/w3c/dom/Element;)V

    .line 226
    invoke-virtual {v1}, Ll/ۢ᩶ۡ;->᩷()[F

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "Missing \"viewBox\" in <svg> element"

    .line 227
    invoke-virtual {v1, v0, p0}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V

    goto/16 :goto_9

    .line 231
    :cond_1
    new-instance v0, Ll/ۧ᩶ۡ;

    const-string v3, "root"

    invoke-direct {v0, v1, p0, v3}, Ll/ۧ᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 232
    invoke-virtual {v1, v0}, Ll/ۢ᩶ۡ;->ۧ(Ll/ۧ᩶ۡ;)V

    .line 235
    invoke-static {v1, v0, p0}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ۧ᩶ۡ;Lorg/w3c/dom/Element;)V

    .line 238
    invoke-virtual {v1}, Ll/ۢ᩶ۡ;->᩻()Ljava/util/HashSet;

    move-result-object p0

    .line 239
    :cond_2
    invoke-virtual {p0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 240
    new-instance v0, Ll/ۤ᩹ۡ;

    invoke-direct {v0, v1}, Ll/ۤ᩹ۡ;-><init>(Ll/ۢ᩶ۡ;)V

    invoke-static {p0, v0}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 276
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 277
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 278
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧ᩶ۡ;

    .line 191
    iget-object v4, v4, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    const-string v5, "id"

    .line 280
    invoke-interface {v4, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 281
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "href"

    .line 282
    invoke-interface {v4, v6}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 283
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_4

    const-string v6, "xlink:href"

    .line 284
    invoke-interface {v4, v6}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 286
    :cond_4
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_3

    .line 676
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    const-string v6, ""

    goto :goto_2

    :cond_5
    invoke-virtual {v6, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 287
    :goto_2
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 293
    :cond_6
    :goto_3
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_a

    .line 294
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 295
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 296
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 297
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    :goto_4
    if-eqz v4, :cond_7

    .line 298
    invoke-virtual {p0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 300
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object v9, v5

    move-object v5, v4

    move-object v4, v9

    goto :goto_4

    :cond_7
    if-eqz v4, :cond_9

    .line 304
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/w3c/dom/Node;

    .line 316
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v7, v5

    .line 319
    :goto_5
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, " -> "

    .line 320
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 327
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Circular dependency of <use> nodes: "

    .line 0
    invoke-static {v6, v5}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 306
    invoke-virtual {v1, v5, v4}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V

    goto :goto_6

    :cond_8
    const-string v8, " (line "

    .line 324
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/w3c/dom/Node;

    .line 289
    invoke-static {v8}, Ll/ۙ᩶ۡ;->֫(Lorg/w3c/dom/Node;)Ll/ۗ᩶ۡ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ۗ᩶ۡ;->֫()I

    move-result v8

    add-int/2addr v8, v2

    .line 324
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ")"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 308
    :cond_9
    :goto_6
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4, p0}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    goto/16 :goto_3

    .line 249
    :cond_a
    invoke-virtual {v1}, Ll/ۢ᩶ۡ;->ۜ()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 250
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳ᩶ۡ;

    .line 251
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v5}, Ll/ۢ᩶ۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ll/ۛ᩹ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    goto :goto_7

    .line 259
    :cond_c
    invoke-virtual {v1}, Ll/ۢ᩶ۡ;->ܽ()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_d
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 262
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩶ۡ;

    .line 263
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Pair;

    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ll/ۧ᩶ۡ;

    .line 264
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v4, :cond_d

    if-nez v0, :cond_e

    goto :goto_8

    :cond_e
    const/16 v5, 0x23

    .line 720
    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    add-int/2addr v5, v2

    const/16 v6, 0x29

    .line 721
    invoke-virtual {v0, v6, v5}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    if-gez v6, :cond_f

    .line 723
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    .line 725
    :cond_f
    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10

    goto :goto_8

    .line 696
    :cond_10
    invoke-virtual {v1, v0}, Ll/ۢ᩶ۡ;->ܽ(Ljava/lang/String;)Ll/ܳ᩶ۡ;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_8

    .line 700
    :cond_11
    check-cast v0, Ll/ۨ᩹ۡ;

    invoke-virtual {v0}, Ll/ۨ᩹ۡ;->֫()Ll/ۨ᩹ۡ;

    move-result-object v0

    .line 73
    iget-object v4, v4, Ll/ۧ᩶ۡ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v5

    if-ltz v5, :cond_12

    .line 79
    invoke-virtual {v4, v5, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 704
    invoke-virtual {v0, v3}, Ll/ۨ᩹ۡ;->ܽ(Ll/ܳ᩶ۡ;)V

    .line 705
    invoke-virtual {v0}, Ll/ۨ᩹ۡ;->ᩳ()V

    goto :goto_8

    .line 75
    :cond_12
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The child being replaced doesn\'t belong to this group"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 267
    :cond_13
    invoke-virtual {v1}, Ll/ۢ᩶ۡ;->ۧ()V

    .line 268
    invoke-virtual {v1}, Ll/ۢ᩶ۡ;->ۖ()V

    .line 269
    invoke-virtual {v1}, Ll/ۢ᩶ۡ;->֫()V

    .line 1251
    :goto_9
    invoke-virtual {v1}, Ll/ۢ᩶ۡ;->ܿ()Z

    move-result p0

    if-eqz p0, :cond_14

    .line 1235
    invoke-virtual {v1, p1}, Ll/ۢ᩶ۡ;->֫(Ljava/io/ByteArrayOutputStream;)V

    .line 1254
    :cond_14
    invoke-virtual {v1}, Ll/ۢ᩶ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 221
    :cond_15
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Not a proper SVG file"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۢ᩶ۡ;Ll/֫᩶ۡ;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 191
    iget-object v2, v1, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    .line 444
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v3

    .line 445
    invoke-interface {v3}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 447
    invoke-interface {v3, v5}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v6

    .line 448
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v7

    .line 449
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v6

    .line 450
    sget-object v8, Ll/ۛ᩹ۡ;->ۧ:Ll/ۢ۬ܺ;

    invoke-virtual {v8, v7}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 451
    invoke-virtual {v1, v7, v6}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 454
    :cond_1
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v2

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    .line 458
    :goto_1
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v6

    if-ge v3, v6, :cond_c

    .line 459
    invoke-interface {v2, v3}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v6

    .line 460
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "stop"

    .line 461
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    .line 462
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v7

    const-string v8, "rgb(0,0,0)"

    const-string v9, "1"

    const/4 v10, 0x0

    .line 467
    :goto_2
    invoke-interface {v7}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v11

    if-ge v10, v11, :cond_9

    .line 468
    invoke-interface {v7, v10}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v11

    .line 469
    invoke-interface {v11}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v12

    .line 470
    invoke-interface {v11}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v11

    .line 472
    :try_start_0
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v13
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4

    const-string v14, "stop-opacity"

    const-string v15, "stop-color"

    const/16 v16, 0x1

    sparse-switch v13, :sswitch_data_0

    :cond_2
    move-object/from16 v17, v2

    move-object/from16 v18, v7

    goto :goto_3

    :sswitch_0
    :try_start_1
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    move-object/from16 v17, v2

    move-object/from16 v18, v7

    move-object v8, v11

    :cond_3
    :goto_3
    move v7, v3

    goto/16 :goto_b

    :sswitch_1
    const-string v13, "style"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    const-string v13, ";"

    .line 486
    invoke-virtual {v11, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4

    move-object/from16 v17, v2

    .line 487
    :try_start_2
    array-length v2, v13
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_5

    const/16 v18, 0x0

    move-object/from16 v18, v7

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v2, :cond_6

    move/from16 v19, v2

    :try_start_3
    aget-object v2, v13, v7
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    move-object/from16 v20, v8

    :try_start_4
    const-string v8, ":"

    .line 488
    invoke-virtual {v2, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2

    move-object/from16 v21, v9

    .line 489
    :try_start_5
    array-length v9, v8

    move-object/from16 v22, v13

    const/4 v13, 0x2

    if-ne v9, v13, :cond_5

    .line 490
    invoke-virtual {v2, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 491
    aget-object v8, v8, v16

    goto :goto_5

    .line 492
    :cond_4
    invoke-virtual {v2, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 493
    aget-object v9, v8, v16
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0

    move-object/from16 v8, v20

    goto :goto_6

    :cond_5
    move-object/from16 v8, v20

    :goto_5
    move-object/from16 v9, v21

    :goto_6
    add-int/lit8 v7, v7, 0x1

    move/from16 v2, v19

    move-object/from16 v13, v22

    goto :goto_4

    :catch_0
    :goto_7
    move v7, v3

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    goto/16 :goto_a

    :catch_1
    move-object/from16 v20, v8

    :catch_2
    move-object/from16 v21, v9

    goto :goto_7

    :cond_6
    move-object/from16 v20, v8

    move-object/from16 v21, v9

    goto :goto_3

    :sswitch_2
    move-object/from16 v17, v2

    move-object/from16 v18, v7

    :try_start_6
    const-string v2, "offset"

    .line 472
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "%"

    .line 525
    invoke-virtual {v11, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 526
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v7, 0x0

    invoke-virtual {v11, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v13

    const-wide/high16 v15, 0x4059000000000000L    # 100.0

    div-double/2addr v13, v15

    goto :goto_8

    .line 528
    :cond_7
    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v13
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_3

    :goto_8
    move v7, v3

    const-wide/16 v2, 0x0

    .line 531
    :try_start_7
    invoke-static {v13, v14, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    invoke-static {v13, v14, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    .line 532
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    move-wide v4, v2

    goto :goto_b

    :catch_3
    :goto_9
    move v7, v3

    goto :goto_a

    :sswitch_3
    move-object/from16 v17, v2

    move-object/from16 v18, v7

    move v7, v3

    .line 472
    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_6

    if-eqz v2, :cond_8

    move-object v9, v11

    goto :goto_b

    :catch_4
    move-object/from16 v17, v2

    :catch_5
    move-object/from16 v18, v7

    goto :goto_9

    :catch_6
    :goto_a
    const-string v2, "=\""

    const-string v3, "\""

    const-string v13, "Invalid attribute value: "

    .line 0
    invoke-static {v13, v12, v2, v11, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 502
    invoke-virtual {v0, v2, v6}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V

    :cond_8
    :goto_b
    add-int/lit8 v10, v10, 0x1

    move v3, v7

    move-object/from16 v2, v17

    move-object/from16 v7, v18

    goto/16 :goto_2

    :cond_9
    move-object/from16 v17, v2

    move v7, v3

    .line 505
    invoke-virtual {v0, v4, v5}, Ll/ۢ᩶ۡ;->֫(D)Ljava/lang/String;

    move-result-object v2

    const-string v3, "#000000"

    .line 506
    invoke-virtual {v1, v8, v3}, Ll/ܳ᩶ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    move-object v8, v3

    .line 510
    :cond_a
    invoke-virtual {v1, v8, v2, v9}, Ll/֫᩶ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_c

    :cond_b
    move-object/from16 v17, v2

    move v7, v3

    :goto_c
    add-int/lit8 v3, v7, 0x1

    move-object/from16 v2, v17

    goto/16 :goto_1

    :cond_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x52bc3ec0 -> :sswitch_3
        -0x3cc89b6d -> :sswitch_2
        0x68b1db1 -> :sswitch_1
        0x6dcdc1d8 -> :sswitch_0
    .end sparse-switch
.end method

.method public static ֫(Ll/ۢ᩶ۡ;Ll/ۧ᩶ۡ;Lorg/w3c/dom/Element;)V
    .locals 64

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 335
    invoke-interface/range {p2 .. p2}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v2

    const/4 v3, 0x0

    move-object v4, v0

    move-object v5, v1

    .line 337
    :goto_0
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v6

    if-ge v3, v6, :cond_6f

    .line 338
    invoke-interface {v2, v3}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v6

    .line 339
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_6e

    .line 340
    invoke-interface {v6}, Lorg/w3c/dom/Node;->hasChildNodes()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-interface {v6}, Lorg/w3c/dom/Node;->hasAttributes()Z

    move-result v7

    if-nez v7, :cond_0

    goto/16 :goto_45

    .line 344
    :cond_0
    check-cast v6, Lorg/w3c/dom/Element;

    .line 345
    invoke-interface {v6}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v7

    .line 347
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    const-string v9, "polyline"

    const-string v10, "style"

    const-string v11, "rect"

    const-string v12, "path"

    const-string v13, "line"

    const-string v14, "g"

    const-string v15, "polygon"

    move-object/from16 v16, v2

    const-string v2, "circle"

    const-string v1, "ellipse"

    const-string v0, "mask"

    const/16 v17, -0x1

    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v8, "clipPath"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v17, 0xe

    goto/16 :goto_1

    :sswitch_1
    const-string v8, "radialGradient"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v17, 0xd

    goto/16 :goto_1

    :sswitch_2
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v17, 0xc

    goto/16 :goto_1

    :sswitch_3
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v17, 0xb

    goto/16 :goto_1

    :sswitch_4
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v17, 0xa

    goto/16 :goto_1

    :sswitch_5
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v17, 0x9

    goto/16 :goto_1

    :sswitch_6
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v17, 0x8

    goto :goto_1

    :sswitch_7
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_1

    :cond_8
    const/16 v17, 0x7

    goto :goto_1

    :sswitch_8
    const-string v8, "defs"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_1

    :cond_9
    const/16 v17, 0x6

    goto :goto_1

    :sswitch_9
    const-string v8, "use"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_1

    :cond_a
    const/16 v17, 0x5

    goto :goto_1

    :sswitch_a
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_1

    :cond_b
    const/16 v17, 0x4

    goto :goto_1

    :sswitch_b
    invoke-virtual {v7, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_1

    :cond_c
    const/16 v17, 0x3

    goto :goto_1

    :sswitch_c
    const-string v8, "linearGradient"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_1

    :cond_d
    const/16 v17, 0x2

    goto :goto_1

    :sswitch_d
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto :goto_1

    :cond_e
    const/16 v17, 0x1

    goto :goto_1

    :sswitch_e
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_1

    :cond_f
    const/16 v17, 0x0

    :goto_1
    const-string v8, "."

    move-object/from16 v18, v1

    const-string v1, "class"

    move-object/from16 v19, v13

    const-string v13, "clip-path"

    const-string v20, ""

    move-object/from16 v21, v9

    const-string v9, "gradientType"

    move-object/from16 v22, v15

    const-string v15, "child"

    packed-switch v17, :pswitch_data_0

    move-object/from16 v12, p1

    move/from16 v23, v3

    move-object/from16 v28, v5

    const-string v0, "id"

    .line 420
    invoke-interface {v6, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6c

    .line 422
    invoke-virtual {v4, v0}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;)V

    goto/16 :goto_44

    .line 410
    :pswitch_0
    new-instance v0, Ll/֫᩶ۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v4, v6, v1}, Ll/֫᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 412
    invoke-static {v4, v0}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ܳ᩶ۡ;)V

    .line 413
    invoke-static {v4, v0}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/֫᩶ۡ;)V

    const-string v1, "radial"

    .line 414
    invoke-virtual {v0, v9, v1}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    invoke-virtual {v4}, Ll/ۢ᩶ۡ;->ۡ()V

    goto/16 :goto_a

    .line 568
    :pswitch_1
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v0

    .line 569
    invoke-interface {v0}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v1

    const/4 v2, 0x0

    move-object/from16 v6, v20

    :goto_2
    if-ge v2, v1, :cond_12

    .line 572
    invoke-interface {v0, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v7

    .line 573
    invoke-interface {v7}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v8

    const/4 v9, 0x4

    if-eq v8, v9, :cond_10

    const/4 v8, 0x1

    if-ne v1, v8, :cond_11

    .line 574
    :cond_10
    invoke-interface {v7}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v6

    :cond_11
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 577
    :cond_12
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1a

    const-string v0, "\\}"

    .line 579
    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 580
    array-length v1, v0

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v1, :cond_1a

    aget-object v6, v0, v2

    const-string v7, "\\{"

    .line 582
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 583
    array-length v7, v6

    const/4 v8, 0x2

    if-ge v7, v8, :cond_13

    goto :goto_6

    :cond_13
    const/4 v7, 0x0

    .line 587
    aget-object v8, v6, v7

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    .line 588
    aget-object v6, v6, v8

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    const-string v8, ","

    .line 590
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 591
    array-length v8, v7

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_15

    aget-object v10, v7, v9

    .line 593
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 595
    invoke-virtual {v4, v10}, Ll/ۢ᩶ۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_14

    .line 597
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v13, 0x3b

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    goto :goto_5

    :cond_14
    move-object v11, v6

    .line 599
    :goto_5
    invoke-virtual {v4, v10, v11}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_15
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 388
    :pswitch_2
    new-instance v0, Ll/ۨ᩹ۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v4, v6, v1}, Ll/ۨ᩹ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 390
    invoke-static {v4, v0}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ܳ᩶ۡ;)V

    .line 391
    invoke-static {v4, v0, v6}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ۧ᩶ۡ;Lorg/w3c/dom/Element;)V

    goto/16 :goto_a

    .line 381
    :pswitch_3
    new-instance v0, Ll/ۧ᩶ۡ;

    .line 0
    invoke-static {v3, v15}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 381
    invoke-direct {v0, v4, v6, v1}, Ll/ۧ᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 382
    invoke-static {v4, v0, v6}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ۧ᩶ۡ;Lorg/w3c/dom/Element;)V

    goto/16 :goto_a

    .line 373
    :pswitch_4
    new-instance v0, Ll/ۧ᩶ۡ;

    .line 0
    invoke-static {v3, v15}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 373
    invoke-direct {v0, v4, v6, v1}, Ll/ۧ᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 374
    invoke-static {v4, v0}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ܳ᩶ۡ;)V

    .line 375
    invoke-virtual {v5, v0}, Ll/ۧ᩶ۡ;->֫(Ll/ܳ᩶ۡ;)V

    .line 376
    invoke-virtual {v4, v0}, Ll/ۢ᩶ۡ;->֫(Ll/ۧ᩶ۡ;)V

    goto/16 :goto_a

    .line 364
    :pswitch_5
    new-instance v2, Ll/ۧ᩶ۡ;

    .line 0
    invoke-static {v3, v15}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 364
    invoke-direct {v2, v4, v6, v7}, Ll/ۧ᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 365
    invoke-virtual {v5, v2}, Ll/ۧ᩶ۡ;->֫(Ll/ܳ᩶ۡ;)V

    .line 366
    invoke-static {v4, v2}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ܳ᩶ۡ;)V

    .line 191
    iget-object v7, v2, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    .line 543
    invoke-interface {v7}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v7

    .line 544
    invoke-interface {v7}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v9

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v9, :cond_19

    .line 546
    invoke-interface {v7, v10}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v11

    .line 547
    invoke-interface {v11}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v12

    .line 548
    invoke-interface {v11}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v11

    .line 549
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_17

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_16

    goto :goto_8

    .line 553
    :cond_16
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_18

    .line 554
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_18

    .line 555
    invoke-virtual {v8, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v2, v11}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    goto :goto_9

    .line 550
    :cond_17
    :goto_8
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_18

    .line 551
    invoke-virtual {v4, v2, v5, v11}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ll/ۧ᩶ۡ;Ljava/lang/String;)V

    :cond_18
    :goto_9
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    .line 368
    :cond_19
    invoke-static {v4, v2, v6}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ۧ᩶ۡ;Lorg/w3c/dom/Element;)V

    goto :goto_a

    .line 400
    :pswitch_6
    new-instance v0, Ll/֫᩶ۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v4, v6, v1}, Ll/֫᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 402
    invoke-static {v4, v0}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ܳ᩶ۡ;)V

    .line 403
    invoke-static {v4, v0}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/֫᩶ۡ;)V

    const-string v1, "linear"

    .line 404
    invoke-virtual {v0, v9, v1}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    invoke-virtual {v4}, Ll/ۢ᩶ۡ;->ۡ()V

    :cond_1a
    :goto_a
    move-object/from16 v12, p1

    :goto_b
    move/from16 v23, v3

    move-object v1, v5

    goto/16 :goto_46

    .line 355
    :pswitch_7
    new-instance v9, Ll/ܽ᩶ۡ;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 57
    invoke-direct {v9, v4, v6, v7}, Ll/ܳ᩶ۡ;-><init>(Ll/ۢ᩶ۡ;Lorg/w3c/dom/Element;Ljava/lang/String;)V

    .line 356
    invoke-static {v4, v9}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ܳ᩶ۡ;)V

    .line 357
    invoke-virtual {v5, v9}, Ll/ۧ᩶ۡ;->֫(Ll/ܳ᩶ۡ;)V

    .line 736
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getParentNode()Lorg/w3c/dom/Node;

    move-result-object v7

    .line 740
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v17, 0x0

    move/from16 v23, v3

    .line 743
    :goto_c
    sget-object v3, Ll/ۛ᩹ۡ;->ܽ:Ljava/util/logging/Logger;

    move-object/from16 v24, v2

    if-eqz v7, :cond_1e

    invoke-interface {v7}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 745
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    move-object/from16 v25, v14

    const-string v14, "Printing current parent"

    invoke-virtual {v3, v2, v14}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 746
    invoke-static {v7}, Ll/ۛ᩹ۡ;->֫(Lorg/w3c/dom/Node;)V

    .line 748
    invoke-interface {v7}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v14

    .line 749
    invoke-interface {v14, v10}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v26

    if-eqz v26, :cond_1c

    move-object/from16 v27, v11

    .line 752
    invoke-interface/range {v26 .. v26}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v11, 0x3b

    .line 753
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 754
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v26, v15

    .line 755
    new-instance v15, Ljava/lang/StringBuilder;

    move-object/from16 v28, v5

    const-string v5, "styleContent is :"

    invoke-direct {v15, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "at number group "

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v2, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    const-string v5, "display:none"

    .line 756
    invoke-virtual {v11, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1b

    const-string v5, "Found none style, skip the whole group"

    .line 757
    invoke-virtual {v3, v2, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    move-object/from16 v20, v11

    goto :goto_e

    :cond_1b
    const/4 v5, 0x1

    move-object/from16 v20, v11

    const/16 v17, 0x1

    goto :goto_d

    :cond_1c
    move-object/from16 v28, v5

    move-object/from16 v27, v11

    move-object/from16 v26, v15

    :goto_d
    const-string v5, "display"

    .line 765
    invoke-interface {v14, v5}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v5

    if-eqz v5, :cond_1d

    const-string v11, "none"

    .line 766
    invoke-interface {v5}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1d

    const-string v5, "Found display:none style, skip the whole group"

    .line 767
    invoke-virtual {v3, v2, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :goto_e
    const/4 v2, 0x1

    goto :goto_f

    .line 771
    :cond_1d
    invoke-interface {v7}, Lorg/w3c/dom/Node;->getParentNode()Lorg/w3c/dom/Node;

    move-result-object v7

    move-object/from16 v2, v24

    move-object/from16 v14, v25

    move-object/from16 v15, v26

    move-object/from16 v11, v27

    move-object/from16 v5, v28

    goto/16 :goto_c

    :cond_1e
    move-object/from16 v28, v5

    move-object/from16 v27, v11

    const/4 v2, 0x0

    :goto_f
    move-object/from16 v5, v20

    if-eqz v2, :cond_1f

    move-object/from16 v12, p1

    move-object/from16 v5, v28

    goto/16 :goto_43

    .line 779
    :cond_1f
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v7, "Print current item"

    invoke-virtual {v3, v2, v7}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 780
    invoke-static {v6}, Ll/ۛ᩹ۡ;->֫(Lorg/w3c/dom/Node;)V

    if-eqz v17, :cond_20

    .line 782
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_20

    .line 783
    invoke-static {v9, v5}, Ll/ۛ᩹ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    .line 786
    :cond_20
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    sget-object v7, Ll/ۛ᩹ۡ;->ᩳ:Ll/ۢ۬ܺ;

    if-eqz v5, :cond_27

    .line 1175
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v11, "Path found "

    invoke-direct {v5, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v6}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v2, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 1177
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v2

    const/4 v5, 0x1

    if-ne v2, v5, :cond_27

    .line 1178
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v2

    .line 1179
    invoke-interface {v2}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v5

    const/4 v11, 0x0

    :goto_10
    if-ge v11, v5, :cond_27

    .line 1182
    invoke-interface {v2, v11}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v12

    .line 1183
    invoke-interface {v12}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v14

    .line 1184
    invoke-interface {v12}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v12

    .line 1185
    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_21

    .line 1186
    invoke-static {v9, v12}, Ll/ۛ᩹ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    goto :goto_11

    .line 1187
    :cond_21
    invoke-virtual {v7, v14}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_23

    .line 1188
    invoke-virtual {v9, v14, v12}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_22
    :goto_11
    move-object/from16 v14, v28

    goto :goto_13

    .line 1189
    :cond_23
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_26

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_24

    goto :goto_12

    :cond_24
    const-string v15, "d"

    .line 1191
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_25

    const-string v14, "(\\d)-"

    .line 1192
    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v14

    invoke-virtual {v14, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v12

    const-string v14, "$1,-"

    invoke-virtual {v12, v14}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 1193
    invoke-virtual {v9, v12}, Ll/ܽ᩶ۡ;->ܿ(Ljava/lang/String;)V

    goto :goto_11

    .line 1194
    :cond_25
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_22

    const-string v14, "path."

    .line 0
    invoke-static {v14, v12}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 1195
    invoke-virtual {v4, v9, v14}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    .line 0
    invoke-static {v8, v12}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 1196
    invoke-virtual {v4, v9, v12}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    goto :goto_11

    :cond_26
    :goto_12
    move-object/from16 v14, v28

    .line 1190
    invoke-virtual {v4, v9, v14, v12}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ll/ۧ᩶ۡ;Ljava/lang/String;)V

    :goto_13
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v28, v14

    goto :goto_10

    :cond_27
    move-object/from16 v14, v28

    .line 790
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v5, v27

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v5, "ry"

    const-string v11, "rx"

    const-string v12, "opacity:0;"

    if-eqz v2, :cond_3b

    .line 907
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v15, Ljava/lang/StringBuilder;

    move-object/from16 v28, v14

    const-string v14, "Rect found"

    invoke-direct {v15, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v6}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v2, v14}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 909
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v2

    const/4 v14, 0x1

    if-ne v2, v14, :cond_3b

    .line 917
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v2

    .line 918
    invoke-interface {v2}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v14

    const-wide/16 v25, 0x0

    const-wide/high16 v29, 0x7ff8000000000000L    # Double.NaN

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-wide/from16 v33, v25

    move-wide/from16 v35, v33

    move-wide/from16 v42, v35

    move-wide/from16 v44, v42

    move-wide/from16 v31, v29

    :goto_14
    if-ge v15, v14, :cond_34

    .line 921
    invoke-interface {v2, v15}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v20

    move-object/from16 v27, v2

    .line 922
    invoke-interface/range {v20 .. v20}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v2

    move/from16 v37, v14

    .line 923
    invoke-interface/range {v20 .. v20}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v14

    .line 925
    :try_start_0
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_2a

    .line 926
    invoke-static {v9, v14}, Ll/ۛ᩹ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    .line 927
    invoke-virtual {v14, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_28

    const/16 v17, 0x1

    :cond_28
    :goto_15
    move-object/from16 v20, v0

    :cond_29
    :goto_16
    move-object/from16 v46, v5

    :goto_17
    move-object/from16 v0, v28

    goto/16 :goto_1a

    .line 930
    :cond_2a
    invoke-virtual {v7, v2}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_2b

    .line 931
    invoke-virtual {v9, v2, v14}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_15

    .line 932
    :cond_2b
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-nez v20, :cond_33

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v20, :cond_2c

    goto/16 :goto_19

    :cond_2c
    move-object/from16 v20, v0

    :try_start_1
    const-string v0, "x"

    .line 934
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 935
    invoke-virtual {v4, v14}, Ll/ۢ᩶ۡ;->ܿ(Ljava/lang/String;)D

    move-result-wide v42

    goto :goto_16

    :cond_2d
    const-string v0, "y"

    .line 936
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 937
    invoke-virtual {v4, v14}, Ll/ۢ᩶ۡ;->ܳ(Ljava/lang/String;)D

    move-result-wide v44

    goto :goto_16

    .line 938
    :cond_2e
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 939
    invoke-virtual {v4, v14}, Ll/ۢ᩶ۡ;->ܿ(Ljava/lang/String;)D

    move-result-wide v33

    goto :goto_16

    .line 940
    :cond_2f
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 941
    invoke-virtual {v4, v14}, Ll/ۢ᩶ۡ;->ܳ(Ljava/lang/String;)D

    move-result-wide v35

    goto :goto_16

    :cond_30
    const-string v0, "width"

    .line 942
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 943
    invoke-virtual {v4, v14}, Ll/ۢ᩶ۡ;->ܿ(Ljava/lang/String;)D

    move-result-wide v29

    goto :goto_16

    :cond_31
    const-string v0, "height"

    .line 944
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_32

    .line 945
    invoke-virtual {v4, v14}, Ll/ۢ᩶ۡ;->ܳ(Ljava/lang/String;)D

    move-result-wide v31

    goto :goto_16

    .line 946
    :cond_32
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_29

    .line 947
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2

    move-object/from16 v46, v5

    :try_start_2
    const-string v5, "rect."

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v9, v0}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    .line 948
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v9, v0}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_17

    :catch_0
    :goto_18
    move-object/from16 v0, v28

    goto :goto_1b

    :cond_33
    :goto_19
    move-object/from16 v20, v0

    move-object/from16 v46, v5

    move-object/from16 v0, v28

    .line 933
    :try_start_3
    invoke-virtual {v4, v9, v0, v14}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ll/ۧ᩶ۡ;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    :goto_1a
    move-object/from16 v28, v0

    move-object/from16 v47, v11

    goto :goto_1c

    :catch_1
    move-object/from16 v20, v0

    :catch_2
    move-object/from16 v46, v5

    goto :goto_18

    :catch_3
    :goto_1b
    const-string v5, "=\""

    move-object/from16 v28, v0

    const-string v0, "\""

    move-object/from16 v47, v11

    const-string v11, "Invalid attribute value: "

    .line 0
    invoke-static {v11, v2, v5, v14, v0}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 952
    invoke-virtual {v4, v0, v6}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V

    :goto_1c
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, v20

    move-object/from16 v2, v27

    move/from16 v14, v37

    move-object/from16 v5, v46

    move-object/from16 v11, v47

    goto/16 :goto_14

    :cond_34
    move-object/from16 v20, v0

    move-object/from16 v46, v5

    move-object/from16 v47, v11

    if-nez v17, :cond_3a

    .line 957
    invoke-static/range {v42 .. v43}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_3a

    .line 958
    invoke-static/range {v44 .. v45}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_3a

    .line 959
    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_3a

    .line 960
    invoke-static/range {v31 .. v32}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_3a

    .line 961
    new-instance v0, Ll/ۙ᩹ۡ;

    invoke-direct {v0}, Ll/ۙ᩹ۡ;-><init>()V

    cmpg-double v2, v33, v25

    if-gtz v2, :cond_35

    cmpg-double v2, v35, v25

    if-gtz v2, :cond_35

    move-wide/from16 v4, v42

    move-wide/from16 v14, v44

    .line 964
    invoke-virtual {v0, v4, v5, v14, v15}, Ll/ۙ᩹ۡ;->ۧ(DD)V

    move-wide/from16 v4, v29

    .line 965
    invoke-virtual {v0, v4, v5}, Ll/ۙ᩹ۡ;->֫(D)V

    move-wide/from16 v14, v31

    .line 966
    invoke-virtual {v0, v14, v15}, Ll/ۙ᩹ۡ;->ܽ(D)V

    neg-double v4, v4

    .line 967
    invoke-virtual {v0, v4, v5}, Ll/ۙ᩹ۡ;->֫(D)V

    move-object/from16 v30, v1

    move-object/from16 v42, v7

    move-object/from16 v17, v8

    move-object/from16 v44, v9

    move-object/from16 v43, v10

    move-object/from16 v29, v12

    move-object/from16 v31, v13

    goto/16 :goto_20

    :cond_35
    move-wide/from16 v4, v42

    move-wide/from16 v14, v44

    cmpl-double v2, v35, v25

    if-nez v2, :cond_36

    move-wide/from16 v35, v33

    goto :goto_1d

    :cond_36
    cmpl-double v2, v33, v25

    if-nez v2, :cond_37

    move-wide/from16 v33, v35

    :cond_37
    :goto_1d
    const-wide/high16 v25, 0x4000000000000000L    # 2.0

    div-double v27, v29, v25

    cmpl-double v2, v33, v27

    if-lez v2, :cond_38

    goto :goto_1e

    :cond_38
    move-wide/from16 v27, v33

    :goto_1e
    div-double v25, v31, v25

    cmpl-double v2, v35, v25

    if-lez v2, :cond_39

    goto :goto_1f

    :cond_39
    move-wide/from16 v25, v35

    :goto_1f
    move-object v11, v1

    add-double v1, v4, v27

    .line 979
    invoke-virtual {v0, v1, v2, v14, v15}, Ll/ۙ᩹ۡ;->ۧ(DD)V

    move-object/from16 v42, v7

    move-object/from16 v17, v8

    add-double v7, v4, v29

    move-object/from16 v30, v11

    move-object/from16 v29, v12

    sub-double v11, v7, v27

    .line 980
    invoke-virtual {v0, v11, v12, v14, v15}, Ll/ۙ᩹ۡ;->֫(DD)V

    move-object/from16 v44, v9

    move-object/from16 v43, v10

    add-double v9, v14, v25

    move-object/from16 v48, v0

    move-wide/from16 v49, v27

    move-wide/from16 v51, v25

    move-wide/from16 v53, v7

    move-wide/from16 v55, v9

    .line 981
    invoke-virtual/range {v48 .. v56}, Ll/ۙ᩹ۡ;->֫(DDDD)V

    move-wide/from16 v57, v9

    add-double v9, v14, v31

    move-object/from16 v31, v13

    move-wide/from16 v59, v14

    sub-double v13, v9, v25

    .line 982
    invoke-virtual {v0, v7, v8, v13, v14}, Ll/ۙ᩹ۡ;->֫(DD)V

    move-wide/from16 v53, v11

    move-wide/from16 v55, v9

    .line 984
    invoke-virtual/range {v48 .. v56}, Ll/ۙ᩹ۡ;->֫(DDDD)V

    .line 985
    invoke-virtual {v0, v1, v2, v9, v10}, Ll/ۙ᩹ۡ;->֫(DD)V

    move-object/from16 v33, v0

    move-wide/from16 v34, v27

    move-wide/from16 v36, v25

    move-wide/from16 v38, v4

    move-wide/from16 v40, v13

    .line 987
    invoke-virtual/range {v33 .. v41}, Ll/ۙ᩹ۡ;->֫(DDDD)V

    move-wide/from16 v7, v57

    .line 988
    invoke-virtual {v0, v4, v5, v7, v8}, Ll/ۙ᩹ۡ;->֫(DD)V

    move-wide/from16 v38, v1

    move-wide/from16 v40, v59

    .line 989
    invoke-virtual/range {v33 .. v41}, Ll/ۙ᩹ۡ;->֫(DDDD)V

    .line 991
    :goto_20
    invoke-virtual {v0}, Ll/ۙ᩹ۡ;->֫()V

    .line 992
    invoke-virtual {v0}, Ll/ۙ᩹ۡ;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v44

    invoke-virtual {v1, v0}, Ll/ܽ᩶ۡ;->ܿ(Ljava/lang/String;)V

    goto :goto_22

    :cond_3a
    move-object/from16 v30, v1

    move-object/from16 v42, v7

    move-object/from16 v17, v8

    move-object v1, v9

    move-object/from16 v43, v10

    :goto_21
    move-object/from16 v29, v12

    move-object/from16 v31, v13

    goto :goto_22

    :cond_3b
    move-object/from16 v20, v0

    move-object/from16 v30, v1

    move-object/from16 v46, v5

    move-object/from16 v42, v7

    move-object/from16 v17, v8

    move-object v1, v9

    move-object/from16 v43, v10

    move-object/from16 v47, v11

    goto :goto_21

    .line 794
    :goto_22
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "cy"

    const-string v4, "cx"

    if-eqz v0, :cond_47

    .line 1005
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "circle found"

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v6}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v0, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 1007
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v0

    const/4 v5, 0x1

    if-ne v0, v5, :cond_47

    .line 1012
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v0

    .line 1013
    invoke-interface {v0}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_23
    if-ge v9, v5, :cond_45

    .line 1016
    invoke-interface {v0, v9}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v13

    .line 1017
    invoke-interface {v13}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v14

    .line 1018
    invoke-interface {v13}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v15, v43

    .line 1019
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_3d

    .line 1020
    invoke-static {v1, v13}, Ll/ۛ᩹ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    move-object/from16 v14, v29

    .line 1021
    invoke-virtual {v13, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_3c

    const/4 v8, 0x1

    :cond_3c
    move-object/from16 v25, v0

    move-object v0, v14

    move-object/from16 v12, v42

    goto :goto_24

    :cond_3d
    move-object/from16 v25, v0

    move-object/from16 v0, v29

    move-object/from16 v12, v42

    .line 1024
    invoke-virtual {v12, v14}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_3e

    .line 1025
    invoke-virtual {v1, v14, v13}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_24
    move-object/from16 v14, p1

    move-object/from16 v29, v0

    move-object/from16 v27, v2

    move/from16 v26, v5

    move-object/from16 v61, v18

    move-object/from16 v0, v30

    move-object/from16 v5, v31

    move-object/from16 v2, p0

    move-object/from16 v63, v20

    move-object/from16 v20, v4

    move-object/from16 v4, v63

    goto/16 :goto_2a

    :cond_3e
    move/from16 v26, v5

    move-object/from16 v5, v31

    .line 1026
    invoke-virtual {v14, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v27

    if-nez v27, :cond_44

    move-object/from16 v29, v0

    move-object/from16 v0, v20

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_3f

    move-object/from16 v27, v2

    move-object/from16 v20, v4

    move-object/from16 v14, v17

    move-object/from16 v2, p0

    move-object v4, v0

    move-object/from16 v0, v30

    goto/16 :goto_29

    .line 1028
    :cond_3f
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_40

    .line 1029
    invoke-static {v13}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v10

    goto :goto_25

    .line 1030
    :cond_40
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_41

    .line 1031
    invoke-static {v13}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v11

    :goto_25
    move-object/from16 v20, v0

    goto :goto_26

    :cond_41
    move-object/from16 v20, v0

    const-string v0, "r"

    .line 1032
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_42

    .line 1033
    invoke-static {v13}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    :goto_26
    move-object/from16 v27, v2

    move-object/from16 v14, v17

    move-object/from16 v0, v30

    :goto_27
    move-object/from16 v2, p0

    move-object/from16 v63, v20

    move-object/from16 v20, v4

    move-object/from16 v4, v63

    goto :goto_28

    :cond_42
    move-object/from16 v0, v30

    .line 1034
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_43

    const-string v14, "circle."

    .line 0
    invoke-static {v14, v13}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v27, v2

    move-object/from16 v2, p0

    move-object/from16 v63, v20

    move-object/from16 v20, v4

    move-object/from16 v4, v63

    .line 1035
    invoke-virtual {v2, v1, v14}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    move-object/from16 v14, v17

    .line 0
    invoke-static {v14, v13}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 1036
    invoke-virtual {v2, v1, v13}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    goto :goto_28

    :cond_43
    move-object/from16 v27, v2

    move-object/from16 v14, v17

    goto :goto_27

    :goto_28
    move-object/from16 v17, v14

    move-object/from16 v61, v18

    move-object/from16 v14, p1

    goto :goto_2a

    :cond_44
    move-object/from16 v29, v0

    move-object/from16 v27, v2

    move-object/from16 v14, v17

    move-object/from16 v0, v30

    move-object/from16 v2, p0

    move-object/from16 v63, v20

    move-object/from16 v20, v4

    move-object/from16 v4, v63

    :goto_29
    move-object/from16 v17, v14

    move-object/from16 v61, v18

    move-object/from16 v14, p1

    .line 1027
    invoke-virtual {v2, v1, v14, v13}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ll/ۧ᩶ۡ;Ljava/lang/String;)V

    :goto_2a
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v30, v0

    move-object/from16 v31, v5

    move-object/from16 v42, v12

    move-object/from16 v43, v15

    move-object/from16 v0, v25

    move/from16 v5, v26

    move-object/from16 v2, v27

    move-object/from16 v18, v61

    move-object/from16 v63, v20

    move-object/from16 v20, v4

    move-object/from16 v4, v63

    goto/16 :goto_23

    :cond_45
    move-object/from16 v14, p1

    move-object/from16 v27, v2

    move-object/from16 v61, v18

    move-object/from16 v0, v30

    move-object/from16 v5, v31

    move-object/from16 v12, v42

    move-object/from16 v15, v43

    move-object/from16 v2, p0

    move-object/from16 v63, v20

    move-object/from16 v20, v4

    move-object/from16 v4, v63

    const/high16 v9, 0x40000000    # 2.0f

    if-nez v8, :cond_46

    .line 1040
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-nez v8, :cond_46

    invoke-static {v11}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-nez v8, :cond_46

    .line 1042
    new-instance v8, Ll/ۙ᩹ۡ;

    invoke-direct {v8}, Ll/ۙ᩹ۡ;-><init>()V

    float-to-double v13, v10

    float-to-double v10, v11

    .line 1043
    invoke-virtual {v8, v13, v14, v10, v11}, Ll/ۙ᩹ۡ;->ۧ(DD)V

    neg-float v10, v7

    float-to-double v10, v10

    .line 1044
    invoke-virtual {v8, v10, v11}, Ll/ۙ᩹ۡ;->ۧ(D)V

    float-to-double v10, v7

    mul-float v13, v7, v9

    float-to-double v13, v13

    const/16 v25, 0x1

    move-object/from16 v30, v8

    move-wide/from16 v31, v10

    move-wide/from16 v33, v10

    move-wide/from16 v35, v13

    move/from16 v37, v25

    .line 1045
    invoke-virtual/range {v30 .. v37}, Ll/ۙ᩹ۡ;->֫(DDDZ)V

    const/high16 v13, -0x40000000    # -2.0f

    mul-float v7, v7, v13

    float-to-double v13, v7

    move-wide/from16 v35, v13

    .line 1046
    invoke-virtual/range {v30 .. v37}, Ll/ۙ᩹ۡ;->֫(DDDZ)V

    .line 1047
    invoke-virtual {v8}, Ll/ۙ᩹ۡ;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ll/ܽ᩶ۡ;->ܿ(Ljava/lang/String;)V

    :cond_46
    const/high16 v7, -0x40000000    # -2.0f

    goto :goto_2b

    :cond_47
    move-object/from16 v27, v2

    move-object/from16 v61, v18

    move-object/from16 v0, v30

    move-object/from16 v5, v31

    move-object/from16 v12, v42

    move-object/from16 v15, v43

    move-object/from16 v2, p0

    move-object/from16 v63, v20

    move-object/from16 v20, v4

    move-object/from16 v4, v63

    const/high16 v7, -0x40000000    # -2.0f

    const/high16 v9, 0x40000000    # 2.0f

    :goto_2b
    const/4 v13, 0x0

    .line 798
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v10, v22

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_48

    .line 799
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v11, v21

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_52

    .line 854
    :cond_48
    sget-object v8, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v14, "Polyline or Polygon found"

    invoke-direct {v11, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v6}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3, v8, v11}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 855
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v8

    const/4 v11, 0x1

    if-ne v8, v11, :cond_52

    .line 856
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v8

    .line 857
    invoke-interface {v8}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v11

    const/4 v14, 0x0

    move/from16 v18, v7

    move-object v7, v2

    :goto_2c
    if-ge v14, v11, :cond_51

    move/from16 v21, v11

    .line 860
    invoke-interface {v8, v14}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v11

    move-object/from16 v22, v8

    .line 861
    invoke-interface {v11}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v8

    move/from16 v24, v9

    .line 862
    invoke-interface {v11}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v9

    .line 864
    :try_start_4
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_49

    .line 865
    invoke-static {v1, v9}, Ll/ۛ᩹ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    goto :goto_2d

    .line 866
    :cond_49
    invoke-virtual {v12, v8}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_4a

    .line 867
    invoke-virtual {v1, v8, v9}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2d
    move-object/from16 v28, v4

    move-object/from16 v31, v5

    move-object/from16 v42, v12

    move/from16 v25, v13

    move/from16 v26, v14

    move-object/from16 v43, v15

    move-object/from16 v5, v17

    goto/16 :goto_32

    .line 868
    :cond_4a
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v25

    if-nez v25, :cond_50

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v25
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_b
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_b

    if-eqz v25, :cond_4b

    goto/16 :goto_34

    :cond_4b
    move/from16 v25, v13

    :try_start_5
    const-string v13, "points"

    .line 870
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_a
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_a

    if-eqz v7, :cond_4e

    .line 871
    :try_start_6
    new-instance v7, Ll/ۙ᩹ۡ;

    invoke-direct {v7}, Ll/ۙ᩹ۡ;-><init>()V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_7

    .line 872
    :try_start_7
    sget-object v13, Ll/ۛ᩹ۡ;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v13, v9}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v9

    const/4 v13, 0x0

    .line 873
    aget-object v26, v9, v13

    invoke-static/range {v26 .. v26}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v13

    const/16 v26, 0x1

    .line 874
    aget-object v26, v9, v26
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_6

    move-object/from16 v28, v4

    :try_start_8
    invoke-static/range {v26 .. v26}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_5

    move/from16 v26, v14

    move-object/from16 v43, v15

    float-to-double v14, v13

    move-object/from16 v42, v12

    move/from16 v30, v13

    float-to-double v12, v4

    .line 875
    :try_start_9
    invoke-virtual {v7, v14, v15, v12, v13}, Ll/ۙ᩹ۡ;->ۧ(DD)V

    const/4 v12, 0x2

    move/from16 v13, v30

    .line 876
    :goto_2e
    array-length v14, v9

    if-ge v12, v14, :cond_4c

    .line 877
    aget-object v14, v9, v12

    invoke-static {v14}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v14

    add-int/lit8 v15, v12, 0x1

    .line 878
    aget-object v15, v9, v15

    invoke-static {v15}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v15
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_4

    sub-float v13, v14, v13

    move/from16 v30, v14

    float-to-double v13, v13

    sub-float v4, v15, v4

    move-object/from16 v31, v5

    float-to-double v4, v4

    .line 879
    :try_start_a
    invoke-virtual {v7, v13, v14, v4, v5}, Ll/ۙ᩹ۡ;->ܽ(DD)V

    add-int/lit8 v12, v12, 0x2

    move v4, v15

    move/from16 v13, v30

    move-object/from16 v5, v31

    goto :goto_2e

    :cond_4c
    move-object/from16 v31, v5

    .line 883
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4d

    .line 884
    invoke-virtual {v7}, Ll/ۙ᩹ۡ;->֫()V

    .line 886
    :cond_4d
    invoke-virtual {v7}, Ll/ۙ᩹ۡ;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/ܽ᩶ۡ;->ܿ(Ljava/lang/String;)V

    goto :goto_30

    :catch_4
    move-object/from16 v31, v5

    goto :goto_33

    :catch_5
    :goto_2f
    move-object/from16 v31, v5

    move-object/from16 v42, v12

    move/from16 v26, v14

    move-object/from16 v43, v15

    goto :goto_33

    :catch_6
    move-object/from16 v28, v4

    goto :goto_2f

    :catch_7
    move-object/from16 v28, v4

    goto :goto_2f

    :cond_4e
    move-object/from16 v28, v4

    move-object/from16 v31, v5

    move-object/from16 v42, v12

    move/from16 v26, v14

    move-object/from16 v43, v15

    .line 887
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4f

    .line 888
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_a
    .catch Ljava/lang/NumberFormatException; {:try_start_a .. :try_end_a} :catch_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_a .. :try_end_a} :catch_8

    move-object/from16 v5, v17

    :try_start_b
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v1, v4}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    .line 889
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 890
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 889
    invoke-virtual {v2, v1, v4}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/NumberFormatException; {:try_start_b .. :try_end_b} :catch_9
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_b .. :try_end_b} :catch_9

    goto :goto_31

    :cond_4f
    :goto_30
    move-object/from16 v5, v17

    :goto_31
    move-object v7, v2

    :goto_32
    move-object/from16 v12, p1

    goto :goto_37

    :catch_8
    :goto_33
    move-object/from16 v5, v17

    :catch_9
    move-object/from16 v12, p1

    move-object v7, v2

    goto :goto_36

    :catch_a
    move-object/from16 v28, v4

    move-object/from16 v31, v5

    move-object/from16 v42, v12

    goto :goto_35

    :cond_50
    :goto_34
    move-object/from16 v28, v4

    move-object/from16 v31, v5

    move-object/from16 v42, v12

    move/from16 v25, v13

    move/from16 v26, v14

    move-object/from16 v43, v15

    move-object/from16 v5, v17

    move-object/from16 v12, p1

    .line 869
    :try_start_c
    invoke-virtual {v7, v1, v12, v9}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ll/ۧ᩶ۡ;Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/NumberFormatException; {:try_start_c .. :try_end_c} :catch_c
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_c .. :try_end_c} :catch_c

    goto :goto_37

    :catch_b
    move-object/from16 v28, v4

    move-object/from16 v31, v5

    move-object/from16 v42, v12

    move/from16 v25, v13

    :goto_35
    move/from16 v26, v14

    move-object/from16 v43, v15

    move-object/from16 v5, v17

    move-object/from16 v12, p1

    :catch_c
    :goto_36
    const-string v4, "Invalid value of \""

    const-string v9, "\" attribute"

    .line 0
    invoke-static {v4, v8, v9}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 893
    invoke-virtual {v7, v4, v11}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V

    :goto_37
    add-int/lit8 v14, v26, 0x1

    move-object/from16 v17, v5

    move/from16 v11, v21

    move-object/from16 v8, v22

    move/from16 v9, v24

    move/from16 v13, v25

    move-object/from16 v4, v28

    move-object/from16 v5, v31

    move-object/from16 v12, v42

    move-object/from16 v15, v43

    goto/16 :goto_2c

    :cond_51
    move-object/from16 v28, v4

    move-object/from16 v31, v5

    move/from16 v24, v9

    move-object/from16 v42, v12

    move/from16 v25, v13

    move-object/from16 v43, v15

    move-object/from16 v5, v17

    move-object/from16 v12, p1

    goto :goto_38

    :cond_52
    move-object/from16 v28, v4

    move-object/from16 v31, v5

    move/from16 v18, v7

    move/from16 v24, v9

    move-object/from16 v42, v12

    move/from16 v25, v13

    move-object/from16 v43, v15

    move-object/from16 v5, v17

    move-object/from16 v12, p1

    move-object v7, v2

    .line 803
    :goto_38
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v8, v19

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5e

    .line 1118
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "line found"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v6}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v4, v8}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 1120
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v4

    const/4 v8, 0x1

    if-ne v4, v8, :cond_5e

    .line 1126
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v4

    .line 1127
    invoke-interface {v4}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_39
    if-ge v10, v8, :cond_5d

    .line 1130
    invoke-interface {v4, v10}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v17

    .line 1131
    invoke-interface/range {v17 .. v17}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v2

    move-object/from16 p2, v4

    .line 1132
    invoke-interface/range {v17 .. v17}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v4

    move/from16 v17, v8

    move-object/from16 v8, v43

    .line 1133
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_54

    .line 1134
    invoke-static {v1, v4}, Ll/ۛ᩹ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    move-object/from16 v2, v29

    .line 1135
    invoke-virtual {v4, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_53

    const/4 v9, 0x1

    :cond_53
    move-object/from16 v62, v2

    move-object/from16 v43, v8

    goto/16 :goto_3b

    :cond_54
    move-object/from16 v43, v8

    move-object/from16 v62, v29

    move-object/from16 v8, v42

    .line 1138
    invoke-virtual {v8, v2}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_55

    .line 1139
    invoke-virtual {v1, v2, v4}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v42, v8

    goto/16 :goto_3b

    :cond_55
    move-object/from16 v42, v8

    move-object/from16 v8, v31

    .line 1140
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_5b

    move-object/from16 v31, v8

    move-object/from16 v8, v28

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_56

    move-object/from16 v28, v8

    goto :goto_3a

    :cond_56
    move-object/from16 v28, v8

    const-string v8, "x1"

    .line 1142
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_57

    .line 1143
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    move v11, v2

    goto :goto_3b

    :cond_57
    const-string v8, "y1"

    .line 1144
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_58

    .line 1145
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    move v13, v2

    goto :goto_3b

    :cond_58
    const-string v8, "x2"

    .line 1146
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_59

    .line 1147
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    move v14, v2

    goto :goto_3b

    :cond_59
    const-string v8, "y2"

    .line 1148
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5a

    .line 1149
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    move v15, v2

    goto :goto_3b

    .line 1150
    :cond_5a
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5c

    const-string v2, "line."

    .line 0
    invoke-static {v2, v4}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1151
    invoke-virtual {v7, v1, v2}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    .line 0
    invoke-static {v5, v4}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1152
    invoke-virtual {v7, v1, v2}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    goto :goto_3b

    :cond_5b
    move-object/from16 v31, v8

    .line 1141
    :goto_3a
    invoke-virtual {v7, v1, v12, v4}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ll/ۧ᩶ۡ;Ljava/lang/String;)V

    :cond_5c
    :goto_3b
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, p0

    move-object/from16 v4, p2

    move/from16 v8, v17

    move-object/from16 v29, v62

    goto/16 :goto_39

    :cond_5d
    move-object/from16 v62, v29

    if-nez v9, :cond_5f

    .line 1157
    invoke-static {v11}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_5f

    .line 1158
    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_5f

    .line 1159
    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_5f

    .line 1160
    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_5f

    .line 1162
    new-instance v2, Ll/ۙ᩹ۡ;

    invoke-direct {v2}, Ll/ۙ᩹ۡ;-><init>()V

    float-to-double v8, v11

    float-to-double v10, v13

    .line 1163
    invoke-virtual {v2, v8, v9, v10, v11}, Ll/ۙ᩹ۡ;->ۧ(DD)V

    float-to-double v8, v14

    float-to-double v10, v15

    .line 1164
    invoke-virtual {v2, v8, v9, v10, v11}, Ll/ۙ᩹ۡ;->֫(DD)V

    .line 1165
    invoke-virtual {v2}, Ll/ۙ᩹ۡ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܽ᩶ۡ;->ܿ(Ljava/lang/String;)V

    goto :goto_3c

    :cond_5e
    move-object/from16 v62, v29

    .line 807
    :cond_5f
    :goto_3c
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, v61

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6b

    .line 1060
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "ellipse found"

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v6}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 1062
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_6b

    .line 1068
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v2

    .line 1069
    invoke-interface {v2}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v3

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    :goto_3d
    if-ge v4, v3, :cond_6a

    .line 1072
    invoke-interface {v2, v4}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v14

    .line 1073
    invoke-interface {v14}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v15

    .line 1074
    invoke-interface {v14}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v14

    move-object/from16 p2, v2

    move-object/from16 v2, v43

    .line 1075
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_61

    .line 1076
    invoke-static {v1, v14}, Ll/ۛ᩹ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    move-object/from16 v15, v62

    .line 1077
    invoke-virtual {v14, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_60

    const/4 v9, 0x1

    :cond_60
    move-object/from16 v43, v2

    move-object/from16 v17, v15

    :goto_3e
    move-object/from16 v2, v46

    goto/16 :goto_42

    :cond_61
    move-object/from16 v43, v2

    move-object/from16 v2, v42

    move-object/from16 v17, v62

    .line 1080
    invoke-virtual {v2, v15}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_62

    .line 1081
    invoke-virtual {v1, v15, v14}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v42, v2

    :goto_3f
    move-object/from16 v2, v47

    goto :goto_40

    :cond_62
    move-object/from16 v42, v2

    move-object/from16 v2, v31

    .line 1082
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_68

    move-object/from16 v31, v2

    move-object/from16 v2, v28

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_63

    move-object/from16 v28, v2

    goto :goto_41

    :cond_63
    move-object/from16 v28, v2

    move-object/from16 v2, v20

    .line 1084
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_64

    .line 1085
    invoke-static {v14}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v8

    move-object/from16 v20, v2

    goto :goto_3f

    :cond_64
    move-object/from16 v20, v2

    move-object/from16 v2, v27

    .line 1086
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_65

    .line 1087
    invoke-static {v14}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v10

    move-object/from16 v27, v2

    goto :goto_3f

    :cond_65
    move-object/from16 v27, v2

    move-object/from16 v2, v47

    .line 1088
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_66

    .line 1089
    invoke-static {v14}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v11

    :goto_40
    move-object/from16 v47, v2

    goto :goto_3e

    :cond_66
    move-object/from16 v47, v2

    move-object/from16 v2, v46

    .line 1090
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_67

    .line 1091
    invoke-static {v14}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v13

    goto :goto_42

    .line 1092
    :cond_67
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_69

    const-string v15, "ellipse."

    .line 0
    invoke-static {v15, v14}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 1093
    invoke-virtual {v7, v1, v15}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    .line 0
    invoke-static {v5, v14}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 1094
    invoke-virtual {v7, v1, v14}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    goto :goto_42

    :cond_68
    move-object/from16 v31, v2

    :goto_41
    move-object/from16 v2, v46

    .line 1083
    invoke-virtual {v7, v1, v12, v14}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ll/ۧ᩶ۡ;Ljava/lang/String;)V

    :cond_69
    :goto_42
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v46, v2

    move-object/from16 v62, v17

    move-object/from16 v2, p2

    goto/16 :goto_3d

    :cond_6a
    if-nez v9, :cond_6b

    .line 1098
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6b

    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6b

    cmpl-float v0, v11, v25

    if-lez v0, :cond_6b

    cmpl-float v0, v13, v25

    if-lez v0, :cond_6b

    .line 1100
    new-instance v0, Ll/ۙ᩹ۡ;

    invoke-direct {v0}, Ll/ۙ᩹ۡ;-><init>()V

    sub-float/2addr v8, v11

    float-to-double v2, v8

    float-to-double v4, v10

    .line 1101
    invoke-virtual {v0, v2, v3, v4, v5}, Ll/ۙ᩹ۡ;->ۧ(DD)V

    float-to-double v2, v11

    float-to-double v4, v13

    mul-float v9, v11, v24

    float-to-double v8, v9

    const/4 v10, 0x0

    move-object/from16 v25, v0

    move-wide/from16 v26, v2

    move-wide/from16 v28, v4

    move-wide/from16 v30, v8

    move/from16 v32, v10

    .line 1102
    invoke-virtual/range {v25 .. v32}, Ll/ۙ᩹ۡ;->֫(DDDZ)V

    mul-float v11, v11, v18

    float-to-double v8, v11

    move-wide/from16 v30, v8

    .line 1103
    invoke-virtual/range {v25 .. v32}, Ll/ۙ᩹ۡ;->֫(DDDZ)V

    .line 1104
    invoke-virtual {v0}, Ll/ۙ᩹ۡ;->֫()V

    .line 1105
    invoke-virtual {v0}, Ll/ۙ᩹ۡ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܽ᩶ۡ;->ܿ(Ljava/lang/String;)V

    .line 812
    :cond_6b
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v1, v0}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    move-object v4, v7

    move-object v5, v12

    .line 359
    :goto_43
    invoke-virtual {v4}, Ll/ۢ᩶ۡ;->ܺ()V

    goto :goto_47

    .line 426
    :cond_6c
    :goto_44
    sget-object v0, Ll/ۛ᩹ۡ;->ܿ:Ll/ۛ۬ܺ;

    invoke-interface {v0, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6d

    const-string v0, "<"

    const-string v1, "> is not supported"

    .line 0
    invoke-static {v0, v7, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 427
    invoke-virtual {v4, v0, v6}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V

    :cond_6d
    move-object/from16 v1, v28

    .line 431
    invoke-static {v4, v1, v6}, Ll/ۛ᩹ۡ;->֫(Ll/ۢ᩶ۡ;Ll/ۧ᩶ۡ;Lorg/w3c/dom/Element;)V

    goto :goto_46

    :cond_6e
    :goto_45
    move-object v12, v1

    move-object/from16 v16, v2

    goto/16 :goto_b

    :goto_46
    move-object v5, v1

    :goto_47
    add-int/lit8 v3, v23, 0x1

    move-object/from16 v0, p0

    move-object v1, v12

    move-object/from16 v2, v16

    goto/16 :goto_0

    :cond_6f
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x62bbe422 -> :sswitch_e
        -0x51134330 -> :sswitch_d
        -0x36a20a8b -> :sswitch_c
        -0x17b1aac6 -> :sswitch_b
        0x67 -> :sswitch_a
        0x1c587 -> :sswitch_9
        0x2efd0e -> :sswitch_8
        0x32aff4 -> :sswitch_7
        0x3306ec -> :sswitch_6
        0x346425 -> :sswitch_5
        0x3559e4 -> :sswitch_4
        0x68b1db1 -> :sswitch_3
        0x217e81c0 -> :sswitch_2
        0x2d80366f -> :sswitch_1
        0x36b25395 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_7
        :pswitch_7
        :pswitch_1
        :pswitch_7
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public static ֫(Ll/ۢ᩶ۡ;Ll/ܳ᩶ۡ;)V
    .locals 2

    const-string v0, "id"

    .line 275
    iget-object v1, p1, Ll/ܳ᩶ۡ;->֫:Lorg/w3c/dom/Element;

    invoke-interface {v1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 612
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 613
    invoke-virtual {p0, p1, v0}, Ll/ۢ᩶ۡ;->ۧ(Ll/ܳ᩶ۡ;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V
    .locals 6

    .line 1203
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Style found is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ۛ᩹ۡ;->ܽ:Ljava/util/logging/Logger;

    invoke-virtual {v2, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    if-eqz p1, :cond_4

    const-string v0, ";"

    .line 1205
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 1206
    array-length v0, p1

    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_4

    .line 1207
    aget-object v1, p1, v0

    const-string v2, ":"

    .line 1208
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 1209
    array-length v2, v1

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    const/4 v2, 0x0

    aget-object v2, v1, v2

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    .line 1210
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 1211
    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 1212
    sget-object v5, Ll/ۛ᩹ۡ;->ᩳ:Ll/ۢ۬ܺ;

    invoke-virtual {v5, v2}, Ll/ۢ۬ܺ;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 1213
    invoke-virtual {p0, v2, v4}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v5, "opacity"

    .line 1214
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "fill-opacity"

    .line 1217
    aget-object v1, v1, v3

    invoke-virtual {p0, v5, v1}, Ll/ܳ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    const-string v1, "clip-path"

    .line 1222
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "mask"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 181
    :cond_3
    iget-object v1, p0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    .line 1223
    invoke-virtual {v1, p0}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;)Ll/ۧ᩶ۡ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 181
    iget-object v2, p0, Ll/ܳ᩶ۡ;->ܿ:Ll/ۢ᩶ۡ;

    .line 1225
    invoke-virtual {v2, p0, v1, v4}, Ll/ۢ᩶ۡ;->֫(Ll/ܳ᩶ۡ;Ll/ۧ᩶ۡ;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public static ֫(Lorg/w3c/dom/Node;)V
    .locals 6

    .line 816
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " nodeName=\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ll/ۛ᩹ۡ;->ܽ:Ljava/util/logging/Logger;

    invoke-virtual {v3, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 818
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getNamespaceURI()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 820
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " uri=\""

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 823
    :cond_0
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getPrefix()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 826
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " pre=\""

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 829
    :cond_1
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getLocalName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 831
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " local=\""

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 834
    :cond_2
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v4, " nodeValue="

    .line 836
    invoke-virtual {v3, v0, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 837
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string p0, "[WS]"

    .line 839
    invoke-virtual {v3, v0, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void

    .line 841
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, v0, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_4
    return-void
.end method
