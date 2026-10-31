.class public final Ll/۫۬ۘ;
.super Ll/ۗ۬ۘ;
.source "590I"


# static fields
.field public static final ۜ:Ljava/util/Set;

.field public static final ᩷:Ljava/util/Set;

.field public static final ᩻:Ljava/util/Set;


# instance fields
.field public ֫:Ll/᩸۬ۘ;

.field public final ۧ:Ll/ᩴ۬ۘ;

.field public final ܳ:Ll/֫۫ۘ;

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:Z

.field public ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 37

    .line 58
    new-instance v0, Ljava/util/HashSet;

    const-string v31, "tt"

    const-string v32, "var"

    const-string v1, "a"

    const-string v2, "abbr"

    const-string v3, "acronym"

    const-string v4, "b"

    const-string v5, "bdo"

    const-string v6, "big"

    const-string v7, "br"

    const-string v8, "button"

    const-string v9, "cite"

    const-string v10, "code"

    const-string v11, "dfn"

    const-string v12, "em"

    const-string v13, "i"

    const-string v14, "img"

    const-string v15, "input"

    const-string v16, "kbd"

    const-string v17, "label"

    const-string v18, "map"

    const-string v19, "object"

    const-string v20, "q"

    const-string v21, "samp"

    const-string v22, "script"

    const-string v23, "select"

    const-string v24, "small"

    const-string v25, "span"

    const-string v26, "strong"

    const-string v27, "sub"

    const-string v28, "sup"

    const-string v29, "textarea"

    const-string v30, "time"

    filled-new-array/range {v1 .. v32}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/۫۬ۘ;->ۜ:Ljava/util/Set;

    .line 74
    new-instance v0, Ljava/util/HashSet;

    const-string v14, "track"

    const-string v15, "wbr"

    const-string v1, "area"

    const-string v2, "base"

    const-string v3, "br"

    const-string v4, "col"

    const-string v5, "embed"

    const-string v6, "hr"

    const-string v7, "img"

    const-string v8, "input"

    const-string v9, "keygen"

    const-string v10, "link"

    const-string v11, "meta"

    const-string v12, "param"

    const-string v13, "source"

    filled-new-array/range {v1 .. v15}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/۫۬ۘ;->᩷:Ljava/util/Set;

    .line 89
    new-instance v0, Ljava/util/HashSet;

    const-string v35, "ul"

    const-string v36, "video"

    const-string v1, "address"

    const-string v2, "article"

    const-string v3, "aside"

    const-string v4, "blockquote"

    const-string v5, "canvas"

    const-string v6, "dd"

    const-string v7, "div"

    const-string v8, "dl"

    const-string v9, "dt"

    const-string v10, "fieldset"

    const-string v11, "figcaption"

    const-string v12, "figure"

    const-string v13, "footer"

    const-string v14, "form"

    const-string v15, "h1"

    const-string v16, "h2"

    const-string v17, "h3"

    const-string v18, "h4"

    const-string v19, "h5"

    const-string v20, "h6"

    const-string v21, "header"

    const-string v22, "hgroup"

    const-string v23, "hr"

    const-string v24, "li"

    const-string v25, "main"

    const-string v26, "nav"

    const-string v27, "noscript"

    const-string v28, "ol"

    const-string v29, "output"

    const-string v30, "p"

    const-string v31, "pre"

    const-string v32, "section"

    const-string v33, "table"

    const-string v34, "tfoot"

    filled-new-array/range {v1 .. v36}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/۫۬ۘ;->᩻:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ll/ᩴ۬ۘ;Ll/֫۫ۘ;)V
    .locals 5

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/۫۬ۘ;->ܽ:Ljava/util/ArrayList;

    .line 108
    new-instance v0, Ll/᩸۬ۘ;

    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v3, 0x0

    const-string v4, ""

    invoke-direct {v0, v4, v1, v2, v3}, Ll/᩸۬ۘ;-><init>(Ljava/lang/String;ILjava/util/Map;Ll/᩸۬ۘ;)V

    .line 114
    iput-object v0, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    .line 126
    iput-object p1, p0, Ll/۫۬ۘ;->ۧ:Ll/ᩴ۬ۘ;

    .line 127
    iput-object p2, p0, Ll/۫۬ۘ;->ܳ:Ll/֫۫ۘ;

    return-void
.end method

.method public static ֫(Ll/֡۫ۘ;)Ljava/util/Map;
    .locals 4

    .line 451
    iget-object p0, p0, Ll/ۚ۫ۘ;->ۧ:Ll/ܳ۫ۘ;

    .line 452
    invoke-virtual {p0}, Ll/ܳ۫ۘ;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 455
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 456
    invoke-virtual {p0}, Ll/ܳ۫ۘ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳ۫ۘ;

    .line 457
    invoke-virtual {v0}, Ll/ᩳ۫ۘ;->getKey()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ll/ᩳ۫ۘ;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 459
    :cond_0
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 461
    :cond_1
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 227
    iget-object v0, p0, Ll/۫۬ۘ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 108
    new-instance v0, Ll/᩸۬ۘ;

    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v2, 0x0

    const-string v3, ""

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ll/᩸۬ۘ;-><init>(Ljava/lang/String;ILjava/util/Map;Ll/᩸۬ۘ;)V

    .line 228
    iput-object v0, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    return-void
.end method

.method public final ֫(Ll/ۙ۬ۘ;)V
    .locals 4

    .line 206
    iget-object v0, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    .line 207
    :goto_0
    iget-object v1, v0, Ll/᩸۬ۘ;->ܳ:Ll/᩸۬ۘ;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 215
    :cond_0
    invoke-virtual {v0}, Ll/᩸۬ۘ;->ᩳ()Ljava/util/List;

    move-result-object v0

    .line 216
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 217
    check-cast p1, Ll/ۛ۬ۘ;

    invoke-virtual {p1, v0}, Ll/ۛ۬ۘ;->֫(Ljava/util/List;)V

    goto :goto_1

    .line 219
    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    check-cast p1, Ll/ۛ۬ۘ;

    invoke-virtual {p1, v0}, Ll/ۛ۬ۘ;->֫(Ljava/util/List;)V

    .line 108
    :goto_1
    new-instance p1, Ll/᩸۬ۘ;

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v1, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    invoke-direct {p1, v2, v3, v0, v1}, Ll/᩸۬ۘ;-><init>(Ljava/lang/String;ILjava/util/Map;Ll/᩸۬ۘ;)V

    .line 222
    iput-object p1, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    return-void
.end method

.method public final ֫(Ll/ᩳۙۘ;Ljava/lang/String;)V
    .locals 13

    .line 138
    new-instance v0, Ll/ܶ۫ۘ;

    new-instance v1, Ll/ۜ۫ۘ;

    invoke-direct {v1, p2}, Ll/ۜ۫ۘ;-><init>(Ljava/lang/String;)V

    .line 28
    new-instance p2, Ll/ۢ۫ۘ;

    const/4 v2, 0x0

    .line 15
    invoke-direct {p2, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    invoke-direct {v0, v1, p2}, Ll/ܶ۫ۘ;-><init>(Ll/ۜ۫ۘ;Ll/ۢ۫ۘ;)V

    .line 142
    :goto_0
    invoke-virtual {v0}, Ll/ܶ۫ۘ;->᩻()Ll/۠۫ۘ;

    move-result-object p2

    .line 143
    iget-object v1, p2, Ll/۠۫ۘ;->֫:Ll/֨۫ۘ;

    .line 145
    sget-object v3, Ll/֨۫ۘ;->ۗ:Ll/֨۫ۘ;

    if-ne v3, v1, :cond_0

    return-void

    .line 149
    :cond_0
    sget-object v3, Ll/۬۬ۘ;->֫:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    iget-object v3, p0, Ll/۫۬ۘ;->ۧ:Ll/ᩴ۬ۘ;

    const/16 v4, 0xa

    const-string v5, "p"

    sget-object v6, Ll/۫۬ۘ;->᩻:Ljava/util/Set;

    const-string v7, "pre"

    iget-object v8, p0, Ll/۫۬ۘ;->ܽ:Ljava/util/ArrayList;

    sget-object v9, Ll/۫۬ۘ;->ۜ:Ljava/util/Set;

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eq v1, v11, :cond_12

    if-eq v1, v10, :cond_8

    const/4 v3, 0x3

    if-eq v1, v3, :cond_1

    goto/16 :goto_e

    .line 176
    :cond_1
    move-object v1, p2

    check-cast v1, Ll/ܺ۫ۘ;

    .line 372
    iget-boolean v3, p0, Ll/۫۬ۘ;->ᩳ:Z

    if-eqz v3, :cond_2

    .line 373
    invoke-virtual {v1}, Ll/ܺ۫ۘ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 19
    :try_start_0
    invoke-virtual {p1, v1}, Ll/ᩳۙۘ;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_e

    :catch_0
    move-exception p1

    .line 21
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 419
    :cond_2
    iget-boolean v3, p0, Ll/۫۬ۘ;->ܿ:Z

    if-eqz v3, :cond_4

    .line 439
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_3

    add-int/lit8 v3, v3, -0x1

    .line 441
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v4, v3, :cond_3

    .line 442
    invoke-static {p1, v4}, Ll/᩷۬ۘ;->֫(Ljava/lang/Appendable;C)V

    .line 421
    :cond_3
    iput-boolean v2, p0, Ll/۫۬ۘ;->ܿ:Z

    .line 376
    :cond_4
    invoke-virtual {v1}, Ll/ܺ۫ۘ;->ۧ()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Ll/۫۬ۘ;->ܳ:Ll/֫۫ۘ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    .line 39
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    const/16 v7, 0x20

    if-ge v5, v4, :cond_7

    .line 41
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 43
    invoke-static {v8}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v9

    if-eqz v9, :cond_5

    const/4 v6, 0x1

    goto :goto_2

    :cond_5
    if-eqz v6, :cond_6

    .line 50
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_6

    add-int/lit8 v6, v6, -0x1

    .line 52
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v6

    if-nez v6, :cond_6

    .line 53
    invoke-static {p1, v7}, Ll/᩷۬ۘ;->֫(Ljava/lang/Appendable;C)V

    .line 58
    :cond_6
    invoke-static {p1, v8}, Ll/᩷۬ۘ;->֫(Ljava/lang/Appendable;C)V

    const/4 v6, 0x0

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_7
    if-eqz v6, :cond_23

    .line 63
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v3, v1, :cond_23

    .line 64
    invoke-static {p1, v7}, Ll/᩷۬ۘ;->֫(Ljava/lang/Appendable;C)V

    goto/16 :goto_e

    .line 165
    :cond_8
    move-object v1, p2

    check-cast v1, Ll/᩵۫ۘ;

    .line 167
    iget-object v10, v1, Ll/ۚ۫ۘ;->ܿ:Ljava/lang/String;

    .line 427
    invoke-interface {v9, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    .line 265
    iget-object v1, v1, Ll/ۚ۫ۘ;->ܿ:Ljava/lang/String;

    .line 394
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v11

    :goto_3
    const/4 v5, -0x1

    if-le v4, v5, :cond_a

    .line 395
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹۬ۘ;

    .line 396
    iget-object v6, v5, Ll/᩶۬ۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    iget v6, v5, Ll/᩶۬ۘ;->ۧ:I

    if-gez v6, :cond_9

    goto :goto_4

    :cond_9
    add-int/lit8 v4, v4, -0x1

    goto :goto_3

    :cond_a
    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_23

    .line 470
    iget v1, v5, Ll/᩶۬ۘ;->ᩳ:I

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ne v1, v4, :cond_b

    .line 476
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Ll/ᩴ۬ۘ;->֫(Ll/ܶ۬ۘ;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 19
    :try_start_1
    invoke-virtual {p1, v1}, Ll/ᩳۙۘ;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    move-exception p1

    .line 21
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 274
    :cond_b
    :goto_5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 66
    invoke-virtual {v5}, Ll/᩶۬ۘ;->isClosed()Z

    move-result v3

    if-nez v3, :cond_23

    .line 67
    iput v1, v5, Ll/᩶۬ۘ;->ۧ:I

    goto/16 :goto_e

    .line 336
    :cond_c
    iget-object v1, v1, Ll/ۚ۫ۘ;->ܿ:Ljava/lang/String;

    .line 408
    iget-object v8, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    :goto_6
    if-eqz v8, :cond_d

    .line 410
    iget-object v9, v8, Ll/᩶۬ۘ;->ܽ:Ljava/lang/String;

    .line 411
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    invoke-virtual {v8}, Ll/᩶۬ۘ;->isClosed()Z

    move-result v9

    if-nez v9, :cond_d

    .line 412
    iget-object v8, v8, Ll/᩸۬ۘ;->ܳ:Ll/᩸۬ۘ;

    goto :goto_6

    :cond_d
    if-eqz v8, :cond_23

    .line 339
    iget v9, v8, Ll/᩶۬ۘ;->ᩳ:I

    .line 341
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    .line 342
    iput-boolean v2, p0, Ll/۫۬ۘ;->ᩳ:Z

    .line 470
    :cond_e
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ne v9, v7, :cond_f

    .line 476
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Ll/ᩴ۬ۘ;->֫(Ll/ܶ۬ۘ;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 19
    :try_start_2
    invoke-virtual {p1, v3}, Ll/ᩳۙۘ;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    :catch_2
    move-exception p1

    .line 21
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 350
    :cond_f
    :goto_7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-virtual {v8, v3}, Ll/᩸۬ۘ;->֫(I)V

    .line 41
    iget v3, v8, Ll/᩶۬ۘ;->ۧ:I

    if-ne v9, v3, :cond_10

    goto :goto_8

    .line 354
    :cond_10
    iget-object v3, v8, Ll/᩶۬ۘ;->ܽ:Ljava/lang/String;

    .line 435
    invoke-interface {v6, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    .line 354
    iput-boolean v3, p0, Ll/۫۬ۘ;->ܿ:Z

    .line 357
    :goto_8
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 358
    invoke-static {p1, v4}, Ll/᩷۬ۘ;->֫(Ljava/lang/Appendable;C)V

    .line 361
    :cond_11
    iget-object v1, v8, Ll/᩸۬ۘ;->ܳ:Ll/᩸۬ۘ;

    iput-object v1, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    goto/16 :goto_e

    .line 153
    :cond_12
    move-object v1, p2

    check-cast v1, Ll/֡۫ۘ;

    .line 155
    iget-object v12, v1, Ll/ۚ۫ۘ;->ܿ:Ljava/lang/String;

    .line 427
    invoke-interface {v9, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    .line 155
    sget-object v12, Ll/۫۬ۘ;->᩷:Ljava/util/Set;

    if-eqz v9, :cond_18

    .line 236
    iget-object v5, v1, Ll/ۚ۫ۘ;->ܿ:Ljava/lang/String;

    .line 238
    new-instance v6, Ll/᩹۬ۘ;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    invoke-static {v1}, Ll/۫۬ۘ;->֫(Ll/֡۫ۘ;)Ljava/util/Map;

    move-result-object v9

    .line 61
    invoke-direct {v6, v9, v7, v5}, Ll/᩶۬ۘ;-><init>(Ljava/util/Map;ILjava/lang/String;)V

    .line 419
    iget-boolean v7, p0, Ll/۫۬ۘ;->ܿ:Z

    if-eqz v7, :cond_14

    .line 439
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-lez v7, :cond_13

    add-int/lit8 v7, v7, -0x1

    .line 441
    invoke-interface {p1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-eq v4, v7, :cond_13

    .line 442
    invoke-static {p1, v4}, Ll/᩷۬ۘ;->֫(Ljava/lang/Appendable;C)V

    .line 421
    :cond_13
    iput-boolean v2, p0, Ll/۫۬ۘ;->ܿ:Z

    .line 431
    :cond_14
    invoke-interface {v12, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    .line 242
    iget-boolean v1, v1, Ll/ۚ۫ۘ;->᩷:Z

    if-eqz v1, :cond_17

    .line 245
    :cond_15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Ll/ᩴ۬ۘ;->֫(Ll/ܶ۬ۘ;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_16

    .line 247
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_16

    .line 19
    :try_start_3
    invoke-virtual {p1, v1}, Ll/ᩳۙۘ;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_9

    :catch_3
    move-exception p1

    .line 21
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 254
    :cond_16
    :goto_9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 66
    invoke-virtual {v6}, Ll/᩶۬ۘ;->isClosed()Z

    move-result v3

    if-nez v3, :cond_17

    .line 67
    iput v1, v6, Ll/᩶۬ۘ;->ۧ:I

    .line 257
    :cond_17
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    .line 283
    :cond_18
    iget-object v8, v1, Ll/ۚ۫ۘ;->ܿ:Ljava/lang/String;

    .line 289
    iget-object v9, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    iget-object v9, v9, Ll/᩶۬ۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_19

    .line 292
    iget-object v5, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v9

    invoke-virtual {v5, v9}, Ll/᩸۬ۘ;->֫(I)V

    .line 293
    invoke-static {p1, v4}, Ll/᩷۬ۘ;->֫(Ljava/lang/Appendable;C)V

    .line 294
    iget-object v5, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    iget-object v5, v5, Ll/᩸۬ۘ;->ܳ:Ll/᩸۬ۘ;

    iput-object v5, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    goto :goto_a

    :cond_19
    const-string v5, "li"

    .line 295
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    iget-object v9, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    iget-object v9, v9, Ll/᩶۬ۘ;->ܽ:Ljava/lang/String;

    .line 296
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1a

    .line 298
    iget-object v5, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v9

    invoke-virtual {v5, v9}, Ll/᩸۬ۘ;->֫(I)V

    .line 299
    iget-object v5, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    iget-object v5, v5, Ll/᩸۬ۘ;->ܳ:Ll/᩸۬ۘ;

    iput-object v5, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    .line 435
    :cond_1a
    :goto_a
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1b

    .line 303
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    iput-boolean v5, p0, Ll/۫۬ۘ;->ᩳ:Z

    .line 439
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_1d

    add-int/lit8 v5, v5, -0x1

    .line 441
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eq v4, v5, :cond_1d

    .line 442
    invoke-static {p1, v4}, Ll/᩷۬ۘ;->֫(Ljava/lang/Appendable;C)V

    goto :goto_b

    .line 419
    :cond_1b
    iget-boolean v5, p0, Ll/۫۬ۘ;->ܿ:Z

    if-eqz v5, :cond_1d

    .line 439
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_1c

    add-int/lit8 v5, v5, -0x1

    .line 441
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eq v4, v5, :cond_1c

    .line 442
    invoke-static {p1, v4}, Ll/᩷۬ۘ;->֫(Ljava/lang/Appendable;C)V

    .line 421
    :cond_1c
    iput-boolean v2, p0, Ll/۫۬ۘ;->ܿ:Z

    .line 309
    :cond_1d
    :goto_b
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 311
    invoke-static {v1}, Ll/۫۬ۘ;->֫(Ll/֡۫ۘ;)Ljava/util/Map;

    move-result-object v5

    iget-object v6, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    .line 117
    new-instance v7, Ll/᩸۬ۘ;

    invoke-direct {v7, v8, v4, v5, v6}, Ll/᩸۬ۘ;-><init>(Ljava/lang/String;ILjava/util/Map;Ll/᩸۬ۘ;)V

    .line 431
    invoke-interface {v12, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    .line 313
    iget-boolean v1, v1, Ll/ۚ۫ۘ;->᩷:Z

    if-eqz v1, :cond_1e

    goto :goto_c

    :cond_1e
    const/4 v11, 0x0

    :cond_1f
    :goto_c
    if-eqz v11, :cond_21

    .line 315
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, Ll/ᩴ۬ۘ;->֫(Ll/ܶ۬ۘ;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_20

    .line 317
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_20

    .line 19
    :try_start_4
    invoke-virtual {p1, v1}, Ll/ᩳۙۘ;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_d

    :catch_4
    move-exception p1

    .line 21
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 320
    :cond_20
    :goto_d
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {v7, v1}, Ll/᩸۬ۘ;->֫(I)V

    .line 381
    :cond_21
    iget-object v1, v6, Ll/᩸۬ۘ;->ܿ:Ljava/util/ArrayList;

    if-nez v1, :cond_22

    .line 383
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 384
    iput-object v1, v6, Ll/᩸۬ۘ;->ܿ:Ljava/util/ArrayList;

    .line 386
    :cond_22
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v11, :cond_23

    .line 328
    iput-object v7, p0, Ll/۫۬ۘ;->֫:Ll/᩸۬ۘ;

    .line 182
    :cond_23
    :goto_e
    invoke-virtual {p2}, Ll/۠۫ۘ;->֫()Ll/۠۫ۘ;

    goto/16 :goto_0
.end method

.method public final ۧ(Ll/ۙ۬ۘ;)V
    .locals 2

    .line 188
    iget-object v0, p0, Ll/۫۬ۘ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 196
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast p1, Ll/ۤ۬ۘ;

    invoke-virtual {p1, v1}, Ll/ۤ۬ۘ;->֫(Ljava/util/List;)V

    .line 197
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void

    .line 199
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    check-cast p1, Ll/ۤ۬ۘ;

    invoke-virtual {p1, v0}, Ll/ۤ۬ۘ;->֫(Ljava/util/List;)V

    return-void
.end method
