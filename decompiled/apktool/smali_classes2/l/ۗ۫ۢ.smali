.class public final Ll/ۗ۫ۢ;
.super Ljava/lang/Object;
.source "F6OC"


# static fields
.field public static final ۜ:Ljava/util/Set;

.field public static final ۧ:Ljava/util/Set;

.field public static final ܳ:Ljava/util/Set;

.field public static final ܽ:Ljava/util/Set;

.field public static final ܿ:Ljava/util/Set;

.field public static final ᩳ:Ljava/util/Set;

.field public static final ᩷:Ljava/util/Set;

.field public static final ᩻:Ljava/util/Set;


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 92

    const-string v12, "track"

    const-string v13, "wbr"

    const-string v0, "area"

    const-string v1, "base"

    const-string v2, "br"

    const-string v3, "col"

    const-string v4, "embed"

    const-string v5, "hr"

    const-string v6, "img"

    const-string v7, "input"

    const-string v8, "link"

    const-string v9, "meta"

    const-string v10, "param"

    const-string v11, "source"

    .line 12
    filled-new-array/range {v0 .. v13}, [Ljava/lang/String;

    move-result-object v0

    .line 0
    new-instance v1, Ljava/util/HashSet;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const-string v5, "duplicate element: "

    if-ge v4, v2, :cond_1

    aget-object v6, v0, v4

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 12
    sput-object v0, Ll/ۗ۫ۢ;->᩷:Ljava/util/Set;

    const/16 v0, 0x9

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "pre"

    aput-object v2, v1, v3

    const-string v2, "textarea"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "title"

    const/4 v6, 0x2

    aput-object v2, v1, v6

    const-string v2, "xmp"

    const/4 v7, 0x3

    aput-object v2, v1, v7

    const-string v2, "iframe"

    const/4 v8, 0x4

    aput-object v2, v1, v8

    const-string v2, "noembed"

    const/4 v9, 0x5

    aput-object v2, v1, v9

    const-string v2, "noframes"

    const/4 v10, 0x6

    aput-object v2, v1, v10

    const-string v2, "noscript"

    const/4 v11, 0x7

    aput-object v2, v1, v11

    const-string v2, "plaintext"

    const/16 v12, 0x8

    aput-object v2, v1, v12

    .line 0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(I)V

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v0, :cond_3

    aget-object v14, v1, v13

    invoke-static {v14}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v14, v5}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 14
    sput-object v1, Ll/ۗ۫ۢ;->ᩳ:Ljava/util/Set;

    const-string v55, "ul"

    const-string v56, "var"

    const-string v13, "b"

    const-string v14, "big"

    const-string v15, "blockquote"

    const-string v16, "body"

    const-string v17, "br"

    const-string v18, "center"

    const-string v19, "code"

    const-string v20, "dd"

    const-string v21, "div"

    const-string v22, "dl"

    const-string v23, "dt"

    const-string v24, "em"

    const-string v25, "embed"

    const-string v26, "h1"

    const-string v27, "h2"

    const-string v28, "h3"

    const-string v29, "h4"

    const-string v30, "h5"

    const-string v31, "h6"

    const-string v32, "head"

    const-string v33, "hr"

    const-string v34, "i"

    const-string v35, "img"

    const-string v36, "li"

    const-string v37, "listing"

    const-string v38, "menu"

    const-string v39, "meta"

    const-string v40, "nobr"

    const-string v41, "ol"

    const-string v42, "p"

    const-string v43, "pre"

    const-string v44, "ruby"

    const-string v45, "s"

    const-string v46, "small"

    const-string v47, "span"

    const-string v48, "strong"

    const-string v49, "strike"

    const-string v50, "sub"

    const-string v51, "sup"

    const-string v52, "table"

    const-string v53, "tt"

    const-string v54, "u"

    .line 16
    filled-new-array/range {v13 .. v56}, [Ljava/lang/String;

    move-result-object v1

    .line 0
    new-instance v2, Ljava/util/HashSet;

    const/16 v13, 0x2c

    invoke-direct {v2, v13}, Ljava/util/HashSet;-><init>(I)V

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v13, :cond_5

    aget-object v15, v1, v14

    invoke-static {v15}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_4

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 16
    sput-object v1, Ll/ۗ۫ۢ;->ۧ:Ljava/util/Set;

    const-string v52, "ul"

    const-string v53, "xmp"

    const-string v13, "address"

    const-string v14, "article"

    const-string v15, "aside"

    const-string v16, "blockquote"

    const-string v17, "center"

    const-string v18, "details"

    const-string v19, "dialog"

    const-string v20, "dir"

    const-string v21, "div"

    const-string v22, "dl"

    const-string v23, "dt"

    const-string v24, "dd"

    const-string v25, "fieldset"

    const-string v26, "figcaption"

    const-string v27, "figure"

    const-string v28, "footer"

    const-string v29, "form"

    const-string v30, "h1"

    const-string v31, "h2"

    const-string v32, "h3"

    const-string v33, "h4"

    const-string v34, "h5"

    const-string v35, "h6"

    const-string v36, "header"

    const-string v37, "hgroup"

    const-string v38, "hr"

    const-string v39, "li"

    const-string v40, "listing"

    const-string v41, "main"

    const-string v42, "menu"

    const-string v43, "nav"

    const-string v44, "ol"

    const-string v45, "p"

    const-string v46, "plaintext"

    const-string v47, "pre"

    const-string v48, "search"

    const-string v49, "section"

    const-string v50, "summary"

    const-string v51, "table"

    .line 20
    filled-new-array/range {v13 .. v53}, [Ljava/lang/String;

    move-result-object v1

    .line 0
    new-instance v2, Ljava/util/HashSet;

    const/16 v13, 0x29

    invoke-direct {v2, v13}, Ljava/util/HashSet;-><init>(I)V

    const/4 v14, 0x0

    :goto_3
    if-ge v14, v13, :cond_7

    aget-object v15, v1, v14

    invoke-static {v15}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_6

    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 20
    sput-object v1, Ll/ۗ۫ۢ;->ܿ:Ljava/util/Set;

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "applet"

    aput-object v2, v1, v3

    const-string v2, "caption"

    aput-object v2, v1, v4

    const-string v2, "html"

    aput-object v2, v1, v6

    const-string v2, "table"

    aput-object v2, v1, v7

    const-string v2, "td"

    aput-object v2, v1, v8

    const-string v8, "th"

    aput-object v8, v1, v9

    const-string v9, "marquee"

    aput-object v9, v1, v10

    const-string v9, "object"

    aput-object v9, v1, v11

    const-string v9, "template"

    aput-object v9, v1, v12

    .line 0
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9, v0}, Ljava/util/HashSet;-><init>(I)V

    const/4 v10, 0x0

    :goto_4
    if-ge v10, v0, :cond_9

    aget-object v11, v1, v10

    invoke-static {v11}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v11, v5}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-static {v9}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 24
    sput-object v0, Ll/ۗ۫ۢ;->ܳ:Ljava/util/Set;

    const-string v90, "wbr"

    const-string v91, "xmp"

    const-string v9, "address"

    const-string v10, "applet"

    const-string v11, "area"

    const-string v12, "article"

    const-string v13, "aside"

    const-string v14, "base"

    const-string v15, "basefont"

    const-string v16, "bgsound"

    const-string v17, "blockquote"

    const-string v18, "body"

    const-string v19, "br"

    const-string v20, "button"

    const-string v21, "caption"

    const-string v22, "center"

    const-string v23, "col"

    const-string v24, "colgroup"

    const-string v25, "dd"

    const-string v26, "details"

    const-string v27, "dir"

    const-string v28, "div"

    const-string v29, "dl"

    const-string v30, "dt"

    const-string v31, "embed"

    const-string v32, "fieldset"

    const-string v33, "figcaption"

    const-string v34, "figure"

    const-string v35, "footer"

    const-string v36, "form"

    const-string v37, "frame"

    const-string v38, "frameset"

    const-string v39, "h1"

    const-string v40, "h2"

    const-string v41, "h3"

    const-string v42, "h4"

    const-string v43, "h5"

    const-string v44, "h6"

    const-string v45, "head"

    const-string v46, "header"

    const-string v47, "hgroup"

    const-string v48, "hr"

    const-string v49, "html"

    const-string v50, "iframe"

    const-string v51, "img"

    const-string v52, "input"

    const-string v53, "keygen"

    const-string v54, "li"

    const-string v55, "link"

    const-string v56, "listing"

    const-string v57, "main"

    const-string v58, "marquee"

    const-string v59, "menu"

    const-string v60, "meta"

    const-string v61, "nav"

    const-string v62, "noembed"

    const-string v63, "noframes"

    const-string v64, "noscript"

    const-string v65, "object"

    const-string v66, "ol"

    const-string v67, "p"

    const-string v68, "param"

    const-string v69, "plaintext"

    const-string v70, "pre"

    const-string v71, "script"

    const-string v72, "search"

    const-string v73, "section"

    const-string v74, "select"

    const-string v75, "source"

    const-string v76, "style"

    const-string v77, "summary"

    const-string v78, "table"

    const-string v79, "tbody"

    const-string v80, "td"

    const-string v81, "template"

    const-string v82, "textarea"

    const-string v83, "tfoot"

    const-string v84, "th"

    const-string v85, "thead"

    const-string v86, "title"

    const-string v87, "tr"

    const-string v88, "track"

    const-string v89, "ul"

    .line 25
    filled-new-array/range {v9 .. v91}, [Ljava/lang/String;

    move-result-object v0

    .line 0
    new-instance v1, Ljava/util/HashSet;

    const/16 v9, 0x53

    invoke-direct {v1, v9}, Ljava/util/HashSet;-><init>(I)V

    const/4 v9, 0x0

    :goto_5
    const/16 v10, 0x53

    if-ge v9, v10, :cond_b

    aget-object v10, v0, v9

    invoke-static {v10}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 25
    sput-object v0, Ll/ۗ۫ۢ;->ۜ:Ljava/util/Set;

    new-array v0, v6, [Ljava/lang/Object;

    aput-object v2, v0, v3

    aput-object v8, v0, v4

    .line 0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v6}, Ljava/util/HashSet;-><init>(I)V

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v6, :cond_d

    aget-object v8, v0, v2

    invoke-static {v8}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v8, v5}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 33
    sput-object v0, Ll/ۗ۫ۢ;->ܽ:Ljava/util/Set;

    new-array v0, v7, [Ljava/lang/Object;

    const-string v1, "thead"

    aput-object v1, v0, v3

    const-string v1, "tbody"

    aput-object v1, v0, v4

    const-string v1, "tfoot"

    aput-object v1, v0, v6

    .line 0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v7}, Ljava/util/HashSet;-><init>(I)V

    :goto_7
    if-ge v3, v7, :cond_f

    aget-object v2, v0, v3

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v2, v5}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 34
    sput-object v0, Ll/ۗ۫ۢ;->᩻:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۗ۫ۢ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(I)Ll/ۙ۫ۢ;
    .locals 3

    .line 142
    iget-object v0, p0, Ll/ۗ۫ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۫ۢ;

    .line 143
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-object v1
.end method

.method private ֫(ILjava/util/Set;)V
    .locals 13

    .line 125
    iget-object v0, p0, Ll/ۗ۫ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_11

    .line 126
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ۫ۢ;

    .line 127
    iget v4, v3, Ll/ۙ۫ۢ;->ܿ:I

    if-eqz v4, :cond_0

    goto/16 :goto_7

    .line 128
    :cond_0
    iget-object v3, v3, Ll/ۙ۫ۢ;->ᩳ:Ljava/lang/String;

    .line 129
    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-direct {p0, v1}, Ll/ۗ۫ۢ;->֫(I)Ll/ۙ۫ۢ;

    return-void

    :cond_1
    const/4 v4, 0x0

    if-eqz p1, :cond_d

    const/4 v5, 0x2

    const/4 v6, 0x3

    const-string v7, "duplicate element: "

    if-eq p1, v2, :cond_a

    const-string v8, "table"

    const-string v9, "template"

    const-string v10, "html"

    if-eq p1, v5, :cond_7

    const/4 v11, 0x4

    if-eq p1, v6, :cond_4

    const/4 v8, 0x5

    new-array v12, v8, [Ljava/lang/Object;

    aput-object v10, v12, v4

    const-string v10, "select"

    aput-object v10, v12, v2

    const-string v10, "datalist"

    aput-object v10, v12, v5

    aput-object v9, v12, v6

    const-string v5, "optgroup"

    aput-object v5, v12, v11

    .line 0
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v8}, Ljava/util/HashSet;-><init>(I)V

    :goto_1
    if-ge v4, v8, :cond_3

    aget-object v6, v12, v4

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v6, v7}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {v5}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v4

    .line 135
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    goto/16 :goto_6

    :cond_4
    new-array v12, v11, [Ljava/lang/Object;

    aput-object v10, v12, v4

    aput-object v8, v12, v2

    aput-object v9, v12, v5

    const-string v5, "tr"

    aput-object v5, v12, v6

    .line 0
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v11}, Ljava/util/HashSet;-><init>(I)V

    :goto_2
    if-ge v4, v11, :cond_6

    aget-object v6, v12, v4

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v6, v7}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {v5}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v4

    .line 134
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    goto/16 :goto_6

    :cond_7
    new-array v11, v6, [Ljava/lang/Object;

    aput-object v10, v11, v4

    aput-object v8, v11, v2

    aput-object v9, v11, v5

    .line 0
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(I)V

    :goto_3
    if-ge v4, v6, :cond_9

    aget-object v8, v11, v4

    invoke-static {v8}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v8, v7}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {v5}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v4

    .line 133
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_6

    .line 132
    :cond_a
    sget-object v8, Ll/ۗ۫ۢ;->ۜ:Ljava/util/Set;

    invoke-interface {v8, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_f

    new-array v8, v6, [Ljava/lang/Object;

    const-string v9, "address"

    aput-object v9, v8, v4

    const-string v9, "div"

    aput-object v9, v8, v2

    const-string v9, "p"

    aput-object v9, v8, v5

    .line 0
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(I)V

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v6, :cond_c

    aget-object v10, v8, v9

    invoke-static {v10}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v10, v7}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-static {v5}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v5

    .line 132
    invoke-interface {v5, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_5

    .line 131
    :cond_d
    sget-object v5, Ll/ۗ۫ۢ;->ܳ:Ljava/util/Set;

    invoke-interface {v5, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    const-string v5, "button"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    :cond_e
    :goto_5
    const/4 v4, 0x1

    :cond_f
    :goto_6
    if-eqz v4, :cond_10

    goto :goto_7

    :cond_10
    add-int/lit8 v1, v1, -0x1

    goto/16 :goto_0

    :cond_11
    :goto_7
    return-void
.end method

.method private ܽ()V
    .locals 2

    .line 148
    :goto_0
    invoke-virtual {p0}, Ll/ۗ۫ۢ;->֫()Ll/ۙ۫ۢ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 149
    invoke-virtual {p0}, Ll/ۗ۫ۢ;->֫()Ll/ۙ۫ۢ;

    move-result-object v0

    .line 150
    iget v1, v0, Ll/ۙ۫ۢ;->ܿ:I

    if-eqz v1, :cond_1

    iget-boolean v1, v0, Ll/ۙ۫ۢ;->ۧ:Z

    if-nez v1, :cond_1

    iget-boolean v0, v0, Ll/ۙ۫ۢ;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 151
    :cond_0
    iget-object v0, p0, Ll/ۗ۫ۢ;->֫:Ljava/util/ArrayList;

    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۙ۫ۢ;
    .locals 2

    .line 37
    iget-object v0, p0, Ll/ۗ۫ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 37
    check-cast v0, Ll/ۙ۫ۢ;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۙ۫ۢ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 83
    invoke-virtual/range {p0 .. p0}, Ll/ۗ۫ۢ;->֫()Ll/ۙ۫ۢ;

    move-result-object v2

    .line 84
    iget-object v3, v0, Ll/ۗ۫ۢ;->֫:Ljava/util/ArrayList;

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    iget v2, v2, Ll/ۙ۫ۢ;->ܿ:I

    if-eqz v2, :cond_4

    const-string v2, "p"

    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "br"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 86
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v4

    :goto_0
    if-ltz v2, :cond_4

    .line 87
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙ۫ۢ;

    .line 88
    iget v6, v5, Ll/ۙ۫ۢ;->ܿ:I

    if-nez v6, :cond_1

    goto :goto_2

    .line 89
    :cond_1
    iget-object v5, v5, Ll/ۙ۫ۢ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-direct {v0, v2}, Ll/ۗ۫ۢ;->֫(I)Ll/ۙ۫ۢ;

    move-result-object v1

    return-object v1

    :cond_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 85
    :cond_3
    :goto_1
    invoke-direct/range {p0 .. p0}, Ll/ۗ۫ۢ;->ܽ()V

    :cond_4
    :goto_2
    const-string v2, "table"

    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_6

    const-string v5, "tr"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    sget-object v5, Ll/ۗ۫ۢ;->ܽ:Ljava/util/Set;

    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    sget-object v5, Ll/ۗ۫ۢ;->᩻:Ljava/util/Set;

    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v5, 0x1

    :goto_4
    const/4 v7, 0x3

    const/4 v8, 0x2

    const-string v9, "template"

    const-string v10, "duplicate element: "

    if-nez v5, :cond_a

    .line 93
    sget-object v11, Ll/ۗ۫ۢ;->ܿ:Ljava/util/Set;

    invoke-interface {v11, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    const/4 v11, 0x5

    new-array v12, v11, [Ljava/lang/Object;

    const-string v13, "button"

    aput-object v13, v12, v6

    const-string v13, "applet"

    aput-object v13, v12, v4

    const-string v13, "object"

    aput-object v13, v12, v8

    const-string v13, "marquee"

    aput-object v13, v12, v7

    const/4 v13, 0x4

    aput-object v9, v12, v13

    .line 0
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13, v11}, Ljava/util/HashSet;-><init>(I)V

    const/4 v14, 0x0

    :goto_5
    if-ge v14, v11, :cond_8

    aget-object v15, v12, v14

    invoke-static {v15}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v13, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    add-int/lit8 v14, v14, 0x1

    goto :goto_5

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v15, v10}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    invoke-static {v13}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v11

    .line 93
    invoke-interface {v11, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_6

    :cond_9
    const/4 v11, 0x0

    goto :goto_7

    :cond_a
    :goto_6
    const/4 v11, 0x1

    .line 94
    :goto_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v12

    sub-int/2addr v12, v4

    :goto_8
    if-ltz v12, :cond_15

    .line 95
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۙ۫ۢ;

    .line 96
    iget v14, v13, Ll/ۙ۫ۢ;->ܿ:I

    iget-object v15, v13, Ll/ۙ۫ۢ;->ᩳ:Ljava/lang/String;

    if-nez v14, :cond_b

    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-direct {v0, v12}, Ll/ۗ۫ۢ;->֫(I)Ll/ۙ۫ۢ;

    move-result-object v1

    return-object v1

    .line 97
    :cond_b
    iget v14, v13, Ll/ۙ۫ۢ;->ܿ:I

    if-eqz v14, :cond_c

    .line 98
    iget-boolean v4, v13, Ll/ۙ۫ۢ;->ۧ:Z

    if-nez v4, :cond_15

    iget-boolean v4, v13, Ll/ۙ۫ۢ;->ܽ:Z

    if-eqz v4, :cond_14

    goto/16 :goto_b

    :cond_c
    if-eqz v11, :cond_13

    if-eqz v5, :cond_f

    new-array v13, v7, [Ljava/lang/Object;

    const-string v14, "html"

    .line 0
    aput-object v14, v13, v6

    aput-object v2, v13, v4

    aput-object v9, v13, v8

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v7}, Ljava/util/HashSet;-><init>(I)V

    const/4 v6, 0x0

    const/4 v14, 0x1

    :goto_9
    const/16 v16, 0x0

    if-ge v6, v7, :cond_e

    aget-object v7, v13, v6

    invoke-static {v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x3

    goto :goto_9

    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v7, v10}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    invoke-static {v4}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v4

    .line 102
    invoke-interface {v4, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    goto :goto_b

    :cond_f
    const/4 v14, 0x1

    const/16 v16, 0x0

    sget-object v4, Ll/ۗ۫ۢ;->ܳ:Ljava/util/Set;

    invoke-interface {v4, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    goto :goto_b

    :cond_10
    const-string v4, "li"

    .line 103
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    new-array v4, v8, [Ljava/lang/Object;

    const-string v6, "ul"

    .line 0
    aput-object v6, v4, v16

    const-string v6, "ol"

    aput-object v6, v4, v14

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v8}, Ljava/util/HashSet;-><init>(I)V

    const/4 v7, 0x0

    :goto_a
    if-ge v7, v8, :cond_12

    aget-object v13, v4, v7

    invoke-static {v13}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v13, v10}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    invoke-static {v6}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v4

    .line 103
    invoke-interface {v4, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    goto :goto_b

    .line 104
    :cond_13
    sget-object v4, Ll/ۗ۫ۢ;->ۜ:Ljava/util/Set;

    invoke-interface {v4, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    goto :goto_b

    :cond_14
    add-int/lit8 v12, v12, -0x1

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x3

    goto/16 :goto_8

    :cond_15
    :goto_b
    const/4 v1, 0x0

    return-object v1
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Object;)Ll/ۙ۫ۢ;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v1, p2

    .line 41
    invoke-virtual/range {p0 .. p0}, Ll/ۗ۫ۢ;->֫()Ll/ۙ۫ۢ;

    move-result-object v2

    const-string v3, "svg"

    const-string v4, "annotation-xml"

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eqz v2, :cond_1

    .line 44
    iget v7, v2, Ll/ۙ۫ۢ;->ܿ:I

    if-eqz v7, :cond_1

    iget-boolean v8, v2, Ll/ۙ۫ۢ;->ۧ:Z

    if-nez v8, :cond_1

    iget-boolean v8, v2, Ll/ۙ۫ۢ;->ܽ:Z

    if-eqz v8, :cond_0

    const-string v8, "mglyph"

    .line 43
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    const-string v8, "malignmark"

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    :cond_0
    if-ne v7, v5, :cond_2

    iget-object v2, v2, Ll/ۙ۫ۢ;->ᩳ:Ljava/lang/String;

    .line 44
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    const/4 v7, 0x0

    :cond_2
    if-eqz v7, :cond_4

    .line 46
    sget-object v2, Ll/ۗ۫ۢ;->ۧ:Ljava/util/Set;

    invoke-interface {v2, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "font"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "color"

    .line 47
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "face"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "size"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 48
    :cond_3
    invoke-direct/range {p0 .. p0}, Ll/ۗ۫ۢ;->ܽ()V

    const/4 v7, 0x0

    :cond_4
    const/4 v2, 0x4

    const/4 v8, 0x3

    const-string v9, "duplicate element: "

    const/4 v11, 0x1

    if-nez v7, :cond_16

    .line 111
    sget-object v12, Ll/ۗ۫ۢ;->ܿ:Ljava/util/Set;

    invoke-interface {v12, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    new-array v12, v11, [Ljava/lang/Object;

    const-string v13, "p"

    aput-object v13, v12, v6

    .line 0
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13, v11}, Ljava/util/HashSet;-><init>(I)V

    aget-object v12, v12, v6

    invoke-static {v12}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v13, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-static {v13}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v12

    .line 111
    invoke-direct {v0, v6, v12}, Ll/ۗ۫ۢ;->֫(ILjava/util/Set;)V

    goto :goto_0

    .line 0
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v12, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    :goto_0
    const-string v12, "li"

    .line 112
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    new-array v2, v11, [Ljava/lang/Object;

    aput-object v12, v2, v6

    .line 0
    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12, v11}, Ljava/util/HashSet;-><init>(I)V

    aget-object v2, v2, v6

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v12, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-static {v12}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    .line 112
    invoke-direct {v0, v11, v2}, Ll/ۗ۫ۢ;->֫(ILjava/util/Set;)V

    goto/16 :goto_3

    .line 0
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v2, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    const-string v12, "dt"

    .line 113
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    const-string v14, "dd"

    if-nez v13, :cond_11

    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    goto/16 :goto_1

    :cond_9
    const-string v12, "tr"

    .line 114
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    new-array v2, v11, [Ljava/lang/Object;

    aput-object v12, v2, v6

    .line 0
    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12, v11}, Ljava/util/HashSet;-><init>(I)V

    aget-object v2, v2, v6

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v12, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-static {v12}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    .line 114
    invoke-direct {v0, v5, v2}, Ll/ۗ۫ۢ;->֫(ILjava/util/Set;)V

    goto/16 :goto_3

    .line 0
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v2, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 115
    :cond_b
    sget-object v12, Ll/ۗ۫ۢ;->ܽ:Ljava/util/Set;

    invoke-interface {v12, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    invoke-direct {v0, v8, v12}, Ll/ۗ۫ۢ;->֫(ILjava/util/Set;)V

    goto/16 :goto_3

    .line 116
    :cond_c
    sget-object v12, Ll/ۗ۫ۢ;->᩻:Ljava/util/Set;

    invoke-interface {v12, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    invoke-direct {v0, v5, v12}, Ll/ۗ۫ۢ;->֫(ILjava/util/Set;)V

    goto/16 :goto_3

    :cond_d
    const-string v12, "option"

    .line 117
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    const-string v14, "optgroup"

    if-nez v13, :cond_e

    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_14

    :cond_e
    new-array v13, v11, [Ljava/lang/Object;

    aput-object v12, v13, v6

    .line 0
    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12, v11}, Ljava/util/HashSet;-><init>(I)V

    aget-object v13, v13, v6

    invoke-static {v13}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v12, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    invoke-static {v12}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v12

    .line 118
    invoke-direct {v0, v2, v12}, Ll/ۗ۫ۢ;->֫(ILjava/util/Set;)V

    .line 119
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_14

    new-array v12, v11, [Ljava/lang/Object;

    aput-object v14, v12, v6

    .line 0
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13, v11}, Ljava/util/HashSet;-><init>(I)V

    aget-object v6, v12, v6

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v13, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-static {v13}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v6

    .line 119
    invoke-direct {v0, v2, v6}, Ll/ۗ۫ۢ;->֫(ILjava/util/Set;)V

    goto :goto_3

    .line 0
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v6, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v13, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    :goto_1
    new-array v2, v5, [Ljava/lang/Object;

    aput-object v12, v2, v6

    aput-object v14, v2, v11

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v5}, Ljava/util/HashSet;-><init>(I)V

    const/4 v12, 0x0

    :goto_2
    if-ge v12, v5, :cond_13

    aget-object v13, v2, v12

    invoke-static {v13}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_12

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_12
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v13, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_13
    invoke-static {v6}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    .line 113
    invoke-direct {v0, v11, v2}, Ll/ۗ۫ۢ;->֫(ILjava/util/Set;)V

    .line 53
    :cond_14
    :goto_3
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    const/4 v2, 0x0

    const/4 v7, 0x1

    const/4 v12, 0x1

    goto :goto_4

    :cond_15
    const-string v2, "math"

    .line 54
    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    const/4 v2, 0x0

    const/4 v7, 0x2

    const/4 v12, 0x2

    goto :goto_4

    :cond_16
    const/4 v2, 0x0

    move v12, v7

    .line 56
    :goto_4
    invoke-virtual/range {p0 .. p0}, Ll/ۗ۫ۢ;->֫()Ll/ۙ۫ۢ;

    move-result-object v7

    if-ne v12, v11, :cond_19

    new-array v3, v8, [Ljava/lang/Object;

    const-string v6, "foreignobject"

    .line 0
    aput-object v6, v3, v2

    const-string v2, "desc"

    aput-object v2, v3, v11

    const-string v2, "title"

    aput-object v2, v3, v5

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v8}, Ljava/util/HashSet;-><init>(I)V

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v8, :cond_18

    aget-object v11, v3, v6

    invoke-static {v11}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_17

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_17
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v11, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_18
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    .line 57
    invoke-interface {v2, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    const/4 v2, 0x1

    goto :goto_6

    :cond_19
    const/4 v2, 0x0

    :goto_6
    const/16 v3, 0x26

    if-ne v12, v5, :cond_2c

    .line 58
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2c

    const-string v2, "encoding"

    const-string v4, ""

    .line 59
    invoke-static {v1, v2, v4}, Ll/ܰ۬ᩴ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 179
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v6, 0x0

    .line 180
    :goto_7
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v6, v11, :cond_29

    and-int/lit16 v11, v6, 0x3ff

    if-nez v11, :cond_1a

    .line 181
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 182
    :cond_1a
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-eq v11, v3, :cond_1b

    .line 183
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_e

    :cond_1b
    const-string v11, "&sol;"

    .line 184
    invoke-virtual {v2, v11, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_1c

    const/16 v11, 0x2f

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x4

    goto/16 :goto_e

    :cond_1c
    const-string v11, "&plus;"

    .line 185
    invoke-virtual {v2, v11, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_1d

    const/16 v11, 0x2b

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x5

    goto/16 :goto_e

    :cond_1d
    const-string v11, "&#"

    .line 186
    invoke-virtual {v2, v11, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v11

    if-nez v11, :cond_1e

    const/4 v2, 0x0

    const/4 v5, 0x3

    :goto_8
    const/4 v6, 0x1

    goto/16 :goto_f

    :cond_1e
    add-int/lit8 v11, v6, 0x2

    .line 189
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v11, v14, :cond_20

    invoke-virtual {v2, v11}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/4 v15, 0x3

    const/16 v8, 0x78

    if-eq v14, v8, :cond_1f

    invoke-virtual {v2, v11}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v14, 0x58

    if-ne v8, v14, :cond_21

    :cond_1f
    add-int/lit8 v11, v6, 0x3

    const/16 v6, 0x10

    goto :goto_9

    :cond_20
    const/4 v15, 0x3

    :cond_21
    const/16 v6, 0xa

    :goto_9
    const/4 v8, 0x0

    move v13, v11

    .line 194
    :goto_a
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v13, v14, :cond_26

    and-int/lit16 v14, v13, 0x3ff

    if-nez v14, :cond_22

    .line 195
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 196
    :cond_22
    invoke-virtual {v2, v13}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/16 v3, 0x7f

    if-gt v14, v3, :cond_23

    .line 197
    invoke-static {v14, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v14

    goto :goto_b

    :cond_23
    const/4 v14, -0x1

    :goto_b
    if-gez v14, :cond_24

    goto :goto_c

    :cond_24
    mul-int v8, v8, v6

    add-int/2addr v8, v14

    if-le v8, v3, :cond_25

    goto :goto_d

    :cond_25
    add-int/lit8 v13, v13, 0x1

    const/16 v3, 0x26

    goto :goto_a

    :cond_26
    :goto_c
    if-ne v13, v11, :cond_27

    :goto_d
    move v5, v15

    const/4 v2, 0x0

    goto :goto_8

    :cond_27
    int-to-char v3, v8

    .line 204
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 205
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v13, v3, :cond_28

    invoke-virtual {v2, v13}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v6, 0x3b

    if-ne v3, v6, :cond_28

    add-int/lit8 v13, v13, 0x1

    :cond_28
    add-int/lit8 v6, v13, -0x1

    :goto_e
    add-int/lit8 v6, v6, 0x1

    const/16 v3, 0x26

    goto/16 :goto_7

    :cond_29
    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v6, 0x1

    .line 208
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/۫۫ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x3

    :goto_f
    const-string v3, "text/html"

    .line 60
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    const-string v3, "application/xhtml+xml"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2a

    goto :goto_10

    :cond_2a
    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_11

    :cond_2b
    :goto_10
    const/4 v3, 0x1

    const/4 v4, 0x1

    :goto_11
    const/4 v8, 0x4

    goto :goto_12

    :cond_2c
    const/4 v8, 0x4

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x1

    move v4, v2

    const/4 v2, 0x0

    :goto_12
    if-eqz v7, :cond_2d

    .line 62
    iget-boolean v3, v7, Ll/ۙ۫ۢ;->᩻:Z

    if-nez v3, :cond_2f

    :cond_2d
    if-nez v12, :cond_2f

    sget-object v3, Ll/ۗ۫ۢ;->ᩳ:Ljava/util/Set;

    .line 63
    invoke-interface {v3, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2f

    const-string v3, "xml:space"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v11, "preserve"

    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2f

    const-string v3, "style"

    .line 64
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2e

    const/16 v3, 0x5c

    .line 77
    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-gez v3, :cond_2f

    const/16 v3, 0x26

    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-gez v3, :cond_2f

    .line 78
    invoke-static {v1}, Ll/۫۫ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "white-space"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2e

    goto :goto_13

    :cond_2e
    const/4 v1, 0x0

    const/4 v11, 0x0

    goto :goto_14

    :cond_2f
    :goto_13
    const/4 v1, 0x1

    const/4 v11, 0x1

    .line 65
    :goto_14
    new-instance v13, Ll/ۙ۫ۢ;

    const/4 v1, 0x2

    if-ne v12, v1, :cond_32

    const/4 v3, 0x5

    new-array v14, v3, [Ljava/lang/Object;

    const-string v15, "mi"

    .line 0
    aput-object v15, v14, v2

    const-string v2, "mo"

    aput-object v2, v14, v6

    const-string v2, "mn"

    aput-object v2, v14, v1

    const-string v1, "ms"

    aput-object v1, v14, v5

    const-string v1, "mtext"

    aput-object v1, v14, v8

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(I)V

    const/4 v2, 0x0

    :goto_15
    if-ge v2, v3, :cond_31

    aget-object v5, v14, v2

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_30

    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    :cond_30
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v5, v9}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_31
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 66
    invoke-interface {v1, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_32

    const/4 v1, 0x1

    const/4 v5, 0x1

    goto :goto_16

    :cond_32
    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 38
    :goto_16
    iget-object v14, v0, Ll/ۗ۫ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v8

    move-object v1, v13

    move-object/from16 v2, p1

    move v3, v12

    move v6, v11

    move-object/from16 v9, p4

    .line 67
    invoke-direct/range {v1 .. v9}, Ll/ۙ۫ۢ;-><init>(Ljava/lang/String;IZZZLl/ۙ۫ۢ;ILjava/lang/Object;)V

    if-nez v12, :cond_33

    .line 68
    sget-object v1, Ll/ۗ۫ۢ;->᩷:Ljava/util/Set;

    invoke-interface {v1, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_34

    goto :goto_17

    :cond_33
    if-nez p3, :cond_36

    .line 38
    :cond_34
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0x200

    if-ge v1, v2, :cond_35

    .line 70
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v13

    .line 69
    :cond_35
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Source nesting exceeds formatter limit"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_36
    :goto_17
    return-object v13
.end method

.method public final ۧ()I
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۗ۫ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
