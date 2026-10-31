.class public final Ll/ۧܳܳ;
.super Ljava/lang/Object;
.source "A6LD"


# static fields
.field public static final ֫:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 106
    new-instance v0, Ll/ۗᩴ֡;

    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 123
    new-instance v1, Ll/᩵ᩴ֡;

    .line 54
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v2, Ll/֫᩵֡;

    .line 29
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x3

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v1, 0x2

    aput-object v2, v4, v1

    .line 0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge v5, v3, :cond_0

    aget-object v2, v4, v5

    invoke-static {v2, v1, v2, v5, v0}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v5

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 45
    sput-object v0, Ll/ۧܳܳ;->֫:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ljava/util/TreeMap;I)I
    .locals 0

    .line 283
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/TreeMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 284
    :cond_0
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "markdown-preview/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    .line 117
    :try_start_0
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p0, p1}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    .line 118
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_1

    .line 116
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
.end method

.method public static ֫(Ll/ܰܿܳ;Ljava/lang/String;ZLandroid/content/res/AssetManager;Ljava/io/BufferedWriter;Ljava/lang/String;)V
    .locals 50

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    .line 86
    invoke-virtual/range {p0 .. p0}, Ll/ܰܿܳ;->ۧ()Ljava/lang/String;

    move-result-object v2

    .line 123
    sget-object v3, Ll/ۧܳܳ;->֫:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const v5, 0xf4240

    if-gt v4, v5, :cond_24

    .line 126
    :try_start_0
    new-instance v4, Ll/ۙܿܳ;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    invoke-direct {v4, v5}, Ll/ۙܿܳ;-><init>(I)V

    .line 75
    new-instance v5, Ll/ܰۚ֡;

    invoke-direct {v5}, Ll/ܰۚ֡;-><init>()V

    .line 127
    invoke-virtual {v5, v3}, Ll/ܰۚ֡;->֫(Ljava/lang/Iterable;)V

    new-instance v6, Ll/ܶܿܳ;

    invoke-direct {v6, v2}, Ll/ܶܿܳ;-><init>(Ljava/lang/String;)V

    .line 128
    invoke-virtual {v5, v6}, Ll/ܰۚ֡;->֫(Ll/ܺ֨֡;)V

    .line 129
    invoke-virtual {v5, v4}, Ll/ܰۚ֡;->֫(Ll/ܳ֨֡;)V

    new-instance v6, Ll/۬ܿܳ;

    invoke-direct {v6, v4}, Ll/۬ܿܳ;-><init>(Ll/ۙܿܳ;)V

    .line 130
    invoke-virtual {v5, v6}, Ll/ܰۚ֡;->֫(Ll/۬ܿܳ;)V

    sget-object v4, Ll/ۛۚ֡;->᩶:Ll/ۛۚ֡;

    .line 142
    invoke-virtual {v5, v4}, Ll/ܰۚ֡;->֫(Ll/ۛۚ֡;)V

    invoke-virtual {v5}, Ll/ܰۚ֡;->֫()Ll/֫֨֡;

    move-result-object v4

    invoke-virtual {v4, v2}, Ll/֫֨֡;->֫(Ljava/lang/String;)Ll/֡ۚ֡;

    move-result-object v2
    :try_end_0
    .catch Ll/۟ܿܳ; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v2

    :goto_0
    if-eqz v6, :cond_4

    add-int/lit8 v5, v5, 0x1

    const v7, 0x186a0

    if-gt v5, v7, :cond_3

    .line 306
    invoke-virtual {v6}, Ll/֡ۚ֡;->֫()Ll/֡ۚ֡;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v6}, Ll/֡ۚ֡;->֫()Ll/֡ۚ֡;

    move-result-object v6

    goto :goto_0

    :cond_0
    :goto_1
    if-eq v6, v2, :cond_1

    .line 307
    invoke-virtual {v6}, Ll/֡ۚ֡;->ܽ()Ll/֡ۚ֡;

    move-result-object v7

    if-nez v7, :cond_1

    invoke-virtual {v6}, Ll/֡ۚ֡;->ᩳ()Ll/֡ۚ֡;

    move-result-object v6

    goto :goto_1

    :cond_1
    if-ne v6, v2, :cond_2

    const/4 v6, 0x0

    goto :goto_0

    .line 308
    :cond_2
    invoke-virtual {v6}, Ll/֡ۚ֡;->ܽ()Ll/֡ۚ֡;

    move-result-object v6

    goto :goto_0

    .line 305
    :cond_3
    new-instance v0, Ll/֫ܳܳ;

    invoke-direct {v0}, Ll/֫ܳܳ;-><init>()V

    throw v0

    .line 147
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "data-mt-"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "-kind"

    .line 0
    invoke-static {v5, v6}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 149
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 150
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    new-instance v9, Ljava/util/TreeMap;

    invoke-direct {v9}, Ljava/util/TreeMap;-><init>()V

    .line 52
    new-instance v10, Ll/۬֨֡;

    invoke-direct {v10}, Ll/۬֨֡;-><init>()V

    .line 218
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۖᩴ֡;

    .line 219
    instance-of v12, v11, Ll/۫֨֡;

    if-eqz v12, :cond_5

    .line 220
    check-cast v11, Ll/۫֨֡;

    .line 221
    invoke-interface {v11, v10}, Ll/۫֨֡;->֫(Ll/۬֨֡;)V

    goto :goto_2

    .line 152
    :cond_6
    invoke-virtual {v10}, Ll/۬֨֡;->ۧ()V

    new-instance v3, Ll/۫ܿܳ;

    invoke-direct {v3, v6, v5, v7}, Ll/۫ܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 153
    invoke-virtual {v10, v3}, Ll/۬֨֡;->֫(Ll/۫ܿܳ;)V

    new-instance v3, Ll/ۤܿܳ;

    invoke-direct {v3, v6, v9, v8}, Ll/ۤܿܳ;-><init>(Ljava/lang/String;Ljava/util/TreeMap;Ljava/lang/StringBuilder;)V

    .line 171
    invoke-virtual {v10, v3}, Ll/۬֨֡;->֫(Ll/ۙ֨֡;)V

    .line 200
    invoke-virtual {v10}, Ll/۬֨֡;->֫()Ll/ۛ֨֡;

    move-result-object v3

    .line 201
    invoke-virtual {v3, v2, v8}, Ll/ۛ֨֡;->֫(Ll/֡ۚ֡;Ljava/lang/StringBuilder;)V

    const-string v2, "https://markdown.invalid/"

    .line 202
    invoke-static {v2}, Ll/֨֡ۚ;->ۖ(Ljava/lang/String;)Ll/֨֡ۚ;

    move-result-object v2

    .line 250
    new-instance v3, Ll/ۧ֨ۚ;

    new-instance v10, Ll/ܿۚۚ;

    invoke-direct {v10}, Ll/ܿۚۚ;-><init>()V

    invoke-direct {v3, v10}, Ll/ۧ֨ۚ;-><init>(Ll/֡ܶۚ;)V

    .line 204
    invoke-virtual {v3}, Ll/ۧ֨ۚ;->ᩳ()V

    .line 205
    invoke-virtual {v2}, Ll/֨֡ۚ;->ᩴ֫()Ll/᩶֡ۚ;

    move-result-object v10

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Ll/֨֡ۚ;->ᩴ֫()Ll/᩶֡ۚ;

    move-result-object v11

    invoke-virtual {v2}, Ll/᩶֡ۚ;->ܽ()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v8, v11, v12}, Ll/ۧ֨ۚ;->֫(Ljava/lang/String;Ll/᩶֡ۚ;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v10, v4, v3}, Ll/᩶֡ۚ;->֫(ILjava/util/List;)V

    .line 1286
    new-instance v3, Ll/ۧ᩸ۚ;

    invoke-direct {v3}, Ll/ۧ᩸ۚ;-><init>()V

    invoke-static {v3, v2}, Ll/ۨܶۚ;->֫(Ll/᩷᩹ۚ;Ll/᩶֡ۚ;)Ll/֫᩸ۚ;

    move-result-object v3

    .line 206
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩶֡ۚ;

    .line 207
    invoke-virtual {v4, v5}, Ll/ۨ֡ۚ;->ᩳ(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_3

    .line 208
    :cond_7
    invoke-virtual {v4}, Ll/ۨ֡ۚ;->᩹()Ll/֫ۚۚ;

    move-result-object v8

    invoke-virtual {v8}, Ll/֫ۚۚ;->ܽ()Ll/۟֡ۚ;

    move-result-object v8

    invoke-virtual {v8}, Ll/۟֡ۚ;->֫()I

    move-result v8

    invoke-static {v9, v8}, Ll/ۧܳܳ;->֫(Ljava/util/TreeMap;I)I

    move-result v8

    if-gez v8, :cond_8

    goto :goto_3

    .line 210
    :cond_8
    invoke-virtual {v4}, Ll/᩶֡ۚ;->ۨ()Ll/֫ۚۚ;

    move-result-object v10

    invoke-virtual {v10}, Ll/֫ۚۚ;->֫()Ll/۟֡ۚ;

    move-result-object v10

    invoke-virtual {v10}, Ll/۟֡ۚ;->֫()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    invoke-static {v9, v10}, Ll/ۧܳܳ;->֫(Ljava/util/TreeMap;I)I

    move-result v10

    if-ge v10, v8, :cond_9

    .line 211
    invoke-virtual {v4}, Ll/ۨ֡ۚ;->᩹()Ll/֫ۚۚ;

    move-result-object v10

    invoke-virtual {v10}, Ll/֫ۚۚ;->֫()Ll/۟֡ۚ;

    move-result-object v10

    invoke-virtual {v10}, Ll/۟֡ۚ;->֫()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    invoke-static {v9, v10}, Ll/ۧܳܳ;->֫(Ljava/util/TreeMap;I)I

    move-result v10

    .line 212
    :cond_9
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, ":"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 226
    invoke-virtual {v4, v5, v8}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    goto :goto_3

    .line 153
    :cond_a
    new-instance v3, Ll/۫ܶۚ;

    invoke-direct {v3}, Ll/۫ܶۚ;-><init>()V

    const-string v48, "u"

    const-string v49, "ul"

    const-string v8, "a"

    const-string v9, "b"

    const-string v10, "blockquote"

    const-string v11, "br"

    const-string v12, "caption"

    const-string v13, "cite"

    const-string v14, "code"

    const-string v15, "col"

    const-string v16, "colgroup"

    const-string v17, "dd"

    const-string v18, "div"

    const-string v19, "dl"

    const-string v20, "dt"

    const-string v21, "em"

    const-string v22, "h1"

    const-string v23, "h2"

    const-string v24, "h3"

    const-string v25, "h4"

    const-string v26, "h5"

    const-string v27, "h6"

    const-string v28, "i"

    const-string v29, "img"

    const-string v30, "li"

    const-string v31, "ol"

    const-string v32, "p"

    const-string v33, "pre"

    const-string v34, "q"

    const-string v35, "small"

    const-string v36, "span"

    const-string v37, "strike"

    const-string v38, "strong"

    const-string v39, "sub"

    const-string v40, "sup"

    const-string v41, "table"

    const-string v42, "tbody"

    const-string v43, "td"

    const-string v44, "tfoot"

    const-string v45, "th"

    const-string v46, "thead"

    const-string v47, "tr"

    filled-new-array/range {v8 .. v49}, [Ljava/lang/String;

    move-result-object v4

    .line 154
    invoke-virtual {v3, v4}, Ll/۫ܶۚ;->֫([Ljava/lang/String;)V

    const-string v4, "href"

    const-string v8, "title"

    filled-new-array {v4, v8}, [Ljava/lang/String;

    move-result-object v9

    const-string v10, "a"

    .line 161
    invoke-virtual {v3, v10, v9}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v9, "cite"

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v11

    const-string v12, "blockquote"

    .line 162
    invoke-virtual {v3, v12, v11}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v11, "span"

    const-string v13, "width"

    filled-new-array {v11, v13}, [Ljava/lang/String;

    move-result-object v14

    const-string v15, "col"

    .line 163
    invoke-virtual {v3, v15, v14}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v14, "colgroup"

    filled-new-array {v11, v13}, [Ljava/lang/String;

    move-result-object v15

    .line 164
    invoke-virtual {v3, v14, v15}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v20, "title"

    const-string v21, "width"

    const-string v16, "align"

    const-string v17, "alt"

    const-string v18, "height"

    const-string v19, "src"

    filled-new-array/range {v16 .. v21}, [Ljava/lang/String;

    move-result-object v14

    const-string v15, "img"

    .line 165
    invoke-virtual {v3, v15, v14}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v14, "start"

    const-string v0, "type"

    filled-new-array {v14, v0}, [Ljava/lang/String;

    move-result-object v14

    const-string v1, "ol"

    .line 166
    invoke-virtual {v3, v1, v14}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    const-string v14, "q"

    .line 167
    invoke-virtual {v3, v14, v1}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "summary"

    filled-new-array {v1, v13}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 p0, v8

    const-string v8, "table"

    .line 168
    invoke-virtual {v3, v8, v1}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "colspan"

    const-string v8, "rowspan"

    move-object/from16 v16, v11

    const-string v11, "abbr"

    move-object/from16 v17, v7

    const-string v7, "axis"

    filled-new-array {v11, v7, v1, v8, v13}, [Ljava/lang/String;

    move-result-object v1

    const-string v7, "td"

    .line 169
    invoke-virtual {v3, v7, v1}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v22, "scope"

    const-string v23, "width"

    const-string v18, "abbr"

    const-string v19, "axis"

    const-string v20, "colspan"

    const-string v21, "rowspan"

    filled-new-array/range {v18 .. v23}, [Ljava/lang/String;

    move-result-object v1

    const-string v8, "th"

    .line 170
    invoke-virtual {v3, v8, v1}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "ul"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v11

    .line 173
    invoke-virtual {v3, v1, v11}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "mailto"

    const-string v11, "ftp"

    const-string v13, "http"

    move-object/from16 v18, v2

    const-string v2, "https"

    filled-new-array {v11, v13, v2, v1}, [Ljava/lang/String;

    move-result-object v1

    .line 175
    invoke-virtual {v3, v10, v4, v1}, Ll/۫ܶۚ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    filled-new-array {v13, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 176
    invoke-virtual {v3, v12, v9, v1}, Ll/۫ܶۚ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    filled-new-array {v13, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 177
    invoke-virtual {v3, v9, v9, v1}, Ll/۫ܶۚ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "src"

    filled-new-array {v13, v2}, [Ljava/lang/String;

    move-result-object v11

    .line 178
    invoke-virtual {v3, v15, v1, v11}, Ll/۫ܶۚ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    filled-new-array {v13, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 179
    invoke-virtual {v3, v14, v9, v1}, Ll/۫ܶۚ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v25, "summary"

    const-string v26, "input"

    const-string v19, "div"

    const-string v20, "span"

    const-string v21, "del"

    const-string v22, "s"

    const-string v23, "hr"

    const-string v24, "details"

    .line 214
    filled-new-array/range {v19 .. v26}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/۫ܶۚ;->֫([Ljava/lang/String;)V

    const-string v1, ":all"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v2

    .line 215
    invoke-virtual {v3, v1, v2}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "open"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "details"

    invoke-virtual {v3, v2, v1}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "align"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v2

    .line 216
    invoke-virtual {v3, v8, v2}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v7, v2}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v2, "checked"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v7, "input"

    .line 217
    invoke-virtual {v3, v7, v2}, Ll/۫ܶۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v2, "checkbox"

    invoke-virtual {v3, v0, v2}, Ll/۫ܶۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "disabled"

    .line 218
    invoke-virtual {v3, v0, v0}, Ll/۫ܶۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "#"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 219
    invoke-virtual {v3, v10, v4, v0}, Ll/۫ܶۚ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/۫ܶۚ;->֫()V

    .line 220
    new-instance v0, Ll/᩸ܶۚ;

    invoke-direct {v0, v3}, Ll/᩸ܶۚ;-><init>(Ll/۫ܶۚ;)V

    move-object/from16 v2, v18

    invoke-virtual {v0, v2}, Ll/᩸ܶۚ;->֫(Ll/֨֡ۚ;)Ll/֨֡ۚ;

    move-result-object v0

    .line 221
    invoke-virtual {v0}, Ll/֨֡ۚ;->֡֫()Ll/֡֡ۚ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֡֡ۚ;->ۜ()V

    const-string v2, "th[align],td[align]"

    .line 223
    invoke-virtual {v0, v2}, Ll/᩶֡ۚ;->ۢ(Ljava/lang/String;)Ll/֫᩸ۚ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶֡ۚ;

    .line 224
    invoke-virtual {v3, v1}, Ll/ۨ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v8, "left"

    .line 225
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    const-string v8, "center"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    const-string v8, "right"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_5

    .line 226
    :cond_b
    invoke-virtual {v3, v1}, Ll/᩶֡ۚ;->᩷(Ljava/lang/String;)V

    goto :goto_4

    :cond_c
    :goto_5
    invoke-virtual {v3, v1, v4}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    goto :goto_4

    .line 1078
    :cond_d
    invoke-static {v6}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 1079
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 1081
    new-instance v2, Ll/ܽ᩸ۚ;

    invoke-direct {v2, v1}, Ll/ܽ᩸ۚ;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v0}, Ll/ۨܶۚ;->֫(Ll/᩷᩹ۚ;Ll/᩶֡ۚ;)Ll/֫᩸ۚ;

    move-result-object v1

    .line 228
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶֡ۚ;

    .line 229
    invoke-virtual {v2, v6}, Ll/ۨ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 230
    invoke-virtual {v2, v6}, Ll/᩶֡ۚ;->᩷(Ljava/lang/String;)V

    const-string v4, "data-mt-render"

    .line 226
    invoke-virtual {v2, v4, v3}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    .line 233
    invoke-virtual {v2}, Ll/᩶֡ۚ;->ۘ֫()Ljava/lang/String;

    move-result-object v4

    .line 234
    invoke-virtual {v2}, Ll/᩶֡ۚ;->ܳ()V

    invoke-virtual {v2, v4}, Ll/᩶֡ۚ;->ܺ(Ljava/lang/String;)V

    const-string v4, "inline-math"

    .line 235
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    move-object/from16 v4, v16

    goto :goto_7

    :cond_e
    const-string v4, "div"

    :goto_7
    invoke-virtual {v2, v4}, Ll/᩶֡ۚ;->ۡ(Ljava/lang/String;)V

    const-string v4, "mt-"

    .line 236
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩶֡ۚ;->ܳ(Ljava/lang/String;)V

    goto :goto_6

    .line 1078
    :cond_f
    invoke-static {v5}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 1079
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 1081
    new-instance v2, Ll/ܽ᩸ۚ;

    invoke-direct {v2, v1}, Ll/ܽ᩸ۚ;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v0}, Ll/ۨܶۚ;->֫(Ll/᩷᩹ۚ;Ll/᩶֡ۚ;)Ll/֫᩸ۚ;

    move-result-object v1

    .line 238
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶֡ۚ;

    .line 239
    invoke-virtual {v2, v5}, Ll/ۨ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x3a

    .line 240
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    .line 241
    invoke-virtual {v2, v5}, Ll/᩶֡ۚ;->᩷(Ljava/lang/String;)V

    const/4 v6, 0x0

    .line 242
    invoke-virtual {v3, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v8, "data-source-start"

    .line 226
    invoke-virtual {v2, v8, v6}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    add-int/lit8 v4, v4, 0x1

    .line 243
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v6, "data-source-end"

    .line 226
    invoke-virtual {v2, v6, v4}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    .line 244
    invoke-virtual {v2}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v4

    const-string v9, "pre"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    move-object/from16 v4, v17

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_14

    const-string v9, "code"

    .line 447
    invoke-static {v9, v2}, Ll/ۘ᩹ۚ;->֫(Ljava/lang/String;Ll/᩶֡ۚ;)Ll/᩶֡ۚ;

    move-result-object v2

    if-eqz v2, :cond_14

    .line 247
    invoke-virtual {v2}, Ll/᩶֡ۚ;->ۘ֫()Ljava/lang/String;

    move-result-object v9

    .line 248
    invoke-virtual {v2}, Ll/᩶֡ۚ;->ܳ()V

    .line 249
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 251
    :goto_9
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v12

    if-gt v10, v12, :cond_14

    .line 252
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v10, v12, :cond_10

    invoke-virtual {v9, v10}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0xa

    if-eq v12, v13, :cond_10

    move-object/from16 v12, v16

    goto :goto_c

    :cond_10
    if-gt v10, v11, :cond_12

    .line 253
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v10, v12, :cond_11

    goto :goto_a

    :cond_11
    move-object/from16 v12, v16

    goto :goto_b

    :cond_12
    :goto_a
    move-object/from16 v12, v16

    .line 254
    invoke-virtual {v2, v12}, Ll/᩶֡ۚ;->᩻(Ljava/lang/String;)Ll/᩶֡ۚ;

    move-result-object v13

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    .line 226
    invoke-virtual {v13, v8, v14}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    .line 255
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    .line 226
    invoke-virtual {v13, v6, v14}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    .line 255
    invoke-virtual {v9, v11, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11}, Ll/᩶֡ۚ;->ܺ(Ljava/lang/String;)V

    .line 257
    :goto_b
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v10, v11, :cond_13

    .line 712
    new-instance v11, Ll/ۧۚۚ;

    const-string v13, "\n"

    invoke-direct {v11, v13}, Ll/ۧۚۚ;-><init>(Ljava/lang/String;)V

    .line 713
    invoke-virtual {v2, v11}, Ll/᩶֡ۚ;->ܽ(Ll/ۨ֡ۚ;)V

    :cond_13
    add-int/lit8 v11, v10, 0x1

    add-int/lit8 v3, v3, 0x1

    :goto_c
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v16, v12

    goto :goto_9

    :cond_14
    move-object/from16 v12, v16

    goto :goto_d

    :cond_15
    move-object/from16 v12, v16

    move-object/from16 v4, v17

    :goto_d
    move-object/from16 v17, v4

    move-object/from16 v16, v12

    goto/16 :goto_8

    .line 264
    :cond_16
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 265
    invoke-virtual {v0, v7}, Ll/᩶֡ۚ;->ۢ(Ljava/lang/String;)Ll/֫᩸ۚ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_17
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶֡ۚ;

    .line 266
    invoke-virtual {v3}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object v4

    if-eqz v4, :cond_18

    .line 267
    invoke-virtual {v4}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v5

    const-string v6, "p"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-virtual {v4}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object v4

    :cond_18
    if-eqz v4, :cond_17

    .line 268
    invoke-virtual {v4}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v5

    const-string v6, "li"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_17

    const-string v5, "task-list-item"

    .line 269
    invoke-virtual {v4, v5}, Ll/᩶֡ۚ;->ܳ(Ljava/lang/String;)V

    const-string v4, "task-list-item-checkbox"

    .line 270
    invoke-virtual {v3, v4}, Ll/᩶֡ۚ;->ܳ(Ljava/lang/String;)V

    goto :goto_e

    :cond_19
    const-string v2, "h1,h2,h3,h4,h5,h6"

    .line 273
    invoke-virtual {v0, v2}, Ll/᩶֡ۚ;->ۢ(Ljava/lang/String;)Ll/֫᩸ۚ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶֡ۚ;

    .line 274
    invoke-virtual {v3}, Ll/᩶֡ۚ;->ۢ֫()Ljava/lang/String;

    move-result-object v4

    .line 289
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 290
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v6, 0x0

    .line 291
    :cond_1a
    :goto_10
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_1d

    .line 292
    invoke-virtual {v4, v6}, Ljava/lang/String;->codePointAt(I)I

    move-result v7

    .line 293
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v8

    add-int/2addr v6, v8

    .line 294
    invoke-static {v7}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result v8

    if-nez v8, :cond_1c

    const/16 v8, 0x5f

    if-eq v7, v8, :cond_1c

    const/16 v8, 0x2d

    if-ne v7, v8, :cond_1b

    goto :goto_11

    .line 295
    :cond_1b
    invoke-static {v7}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_10

    .line 294
    :cond_1c
    :goto_11
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    goto :goto_10

    .line 297
    :cond_1d
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-nez v4, :cond_1e

    const-string v4, "section"

    goto :goto_12

    :cond_1e
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_12
    const/4 v5, 0x1

    move-object v6, v4

    .line 275
    :goto_13
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1f

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "-"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_13

    .line 214
    :cond_1f
    invoke-static {v6}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    const-string v4, "id"

    .line 226
    invoke-virtual {v3, v4, v6}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    goto :goto_f

    :cond_20
    const-string v1, "[data-mt-render]"

    .line 87
    invoke-virtual {v0, v1}, Ll/᩶֡ۚ;->ۢ(Ljava/lang/String;)Ll/֫᩸ۚ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    .line 88
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "<!doctype html><html data-theme=\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "light"

    const-string v5, "dark"

    if-eqz p2, :cond_21

    move-object v6, v5

    goto :goto_14

    :cond_21
    move-object v6, v4

    :goto_14
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\"><head><meta charset=\"utf-8\"><title>"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v6, Ll/᩶֡ۚ;

    move-object/from16 v7, p0

    invoke-direct {v6, v7}, Ll/᩶֡ۚ;-><init>(Ljava/lang/String;)V

    move-object/from16 v7, p1

    .line 91
    invoke-virtual {v6, v7}, Ll/᩶֡ۚ;->ܺ(Ljava/lang/String;)V

    invoke-virtual {v6}, Ll/᩶֡ۚ;->ܰ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "</title><meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"><meta http-equiv=\"Content-Security-Policy\" content=\"default-src \'none\'; img-src https: http: data:; font-src https://cdn.bootcdn.net/ajax/libs/KaTeX/0.16.47/fonts/; style-src \'self\' \'unsafe-inline\'; script-src \'unsafe-inline\' \'nonce-"

    const-string v7, "\'; base-uri \'none\'; form-action \'none\'\"><style nonce=\""

    .line 0
    invoke-static {v3, v6, v2, v7, v2}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "\">"

    .line 91
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v7, p4

    .line 90
    invoke-virtual {v7, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 96
    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    :goto_15
    const/4 v5, 0x2

    if-ge v4, v5, :cond_22

    aget-object v5, v3, v4

    const-string v8, "github-markdown-"

    const-string v9, ".css"

    .line 0
    invoke-static {v8, v5, v9}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v9, p3

    .line 97
    invoke-static {v9, v8}, Ll/ۧܳܳ;->֫(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "html[data-theme=\""

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\"] .markdown-body"

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v10, ".markdown-body"

    .line 98
    invoke-virtual {v8, v10, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 97
    invoke-virtual {v7, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_15

    :cond_22
    move-object/from16 v9, p3

    const-string v3, "preview.css"

    .line 100
    invoke-static {v9, v3}, Ll/ۧܳܳ;->֫(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 101
    new-instance v3, Ll/᩶֡ۚ;

    const-string v4, "article"

    invoke-direct {v3, v4}, Ll/᩶֡ۚ;-><init>(Ljava/lang/String;)V

    const-string v4, "markdown-body"

    invoke-virtual {v3, v4}, Ll/᩶֡ۚ;->ܳ(Ljava/lang/String;)V

    const-string v4, "data-render-error"

    move-object/from16 v5, p5

    .line 226
    invoke-virtual {v3, v4, v5}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    .line 102
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "</style></head><body><article"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/᩶֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܺ֡ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ">"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v0}, Ll/֨֡ۚ;->ᩴ֫()Ll/᩶֡ۚ;

    move-result-object v0

    invoke-virtual {v0, v7}, Ll/᩶֡ۚ;->֫(Ljava/lang/Appendable;)V

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "</article><script nonce=\""

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, "preview.js"

    .line 105
    invoke-static {v9, v0}, Ll/ۧܳܳ;->֫(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v0, "</script>"

    .line 106
    invoke-virtual {v7, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    if-nez v1, :cond_23

    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "<script nonce=\""

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "enhance.js"

    .line 109
    invoke-static {v9, v1}, Ll/ۧܳܳ;->֫(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 110
    invoke-virtual {v7, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_23
    const-string v0, "</body></html>"

    .line 112
    invoke-virtual {v7, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void

    .line 144
    :catch_0
    new-instance v0, Ll/֫ܳܳ;

    invoke-direct {v0}, Ll/֫ܳܳ;-><init>()V

    throw v0

    .line 123
    :cond_24
    new-instance v0, Ll/֫ܳܳ;

    invoke-direct {v0}, Ll/֫ܳܳ;-><init>()V

    throw v0
.end method
