.class public final Ll/ܿۤۢ;
.super Ljava/lang/Object;
.source "F6QC"


# static fields
.field public static final ۡ:Ljava/util/Set;

.field public static final ۢ:Ljava/util/Set;


# instance fields
.field public final ֫:Z

.field public final ۜ:Z

.field public final ۧ:Z

.field public final ܳ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ll/ۗ᩶ۢ;

.field public final ᩳ:Ljava/lang/String;

.field public final ᩷:Ljava/lang/CharSequence;

.field public final ᩻:Ll/᩻ۤۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 48

    const-string v46, "base"

    const-string v47, "template"

    const-string v0, "html"

    const-string v1, "head"

    const-string v2, "body"

    const-string v3, "address"

    const-string v4, "article"

    const-string v5, "aside"

    const-string v6, "blockquote"

    const-string v7, "div"

    const-string v8, "dl"

    const-string v9, "dt"

    const-string v10, "dd"

    const-string v11, "fieldset"

    const-string v12, "figcaption"

    const-string v13, "figure"

    const-string v14, "footer"

    const-string v15, "form"

    const-string v16, "h1"

    const-string v17, "h2"

    const-string v18, "h3"

    const-string v19, "h4"

    const-string v20, "h5"

    const-string v21, "h6"

    const-string v22, "header"

    const-string v23, "hgroup"

    const-string v24, "hr"

    const-string v25, "li"

    const-string v26, "main"

    const-string v27, "menu"

    const-string v28, "nav"

    const-string v29, "ol"

    const-string v30, "p"

    const-string v31, "pre"

    const-string v32, "section"

    const-string v33, "table"

    const-string v34, "thead"

    const-string v35, "tbody"

    const-string v36, "tfoot"

    const-string v37, "tr"

    const-string v38, "td"

    const-string v39, "th"

    const-string v40, "ul"

    const-string v41, "script"

    const-string v42, "style"

    const-string v43, "title"

    const-string v44, "meta"

    const-string v45, "link"

    .line 27
    filled-new-array/range {v0 .. v47}, [Ljava/lang/String;

    move-result-object v0

    .line 0
    new-instance v1, Ljava/util/HashSet;

    const/16 v2, 0x30

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

    .line 27
    sput-object v0, Ll/ܿۤۢ;->ۢ:Ljava/util/Set;

    const/4 v0, 0x7

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "script"

    aput-object v2, v1, v3

    const-string v2, "style"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "title"

    const/4 v4, 0x2

    aput-object v2, v1, v4

    const-string v2, "meta"

    const/4 v4, 0x3

    aput-object v2, v1, v4

    const-string v2, "link"

    const/4 v4, 0x4

    aput-object v2, v1, v4

    const-string v2, "base"

    const/4 v4, 0x5

    aput-object v2, v1, v4

    const-string v2, "template"

    const/4 v4, 0x6

    aput-object v2, v1, v4

    .line 0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(I)V

    :goto_1
    if-ge v3, v0, :cond_3

    aget-object v4, v1, v3

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v4, v5}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 32
    sput-object v0, Ll/ܿۤۢ;->ۡ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ll/᩸۫ۢ;Z)V
    .locals 3

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿۤۢ;->ܳ:Ljava/util/ArrayList;

    .line 45
    iput-object p1, p0, Ll/ܿۤۢ;->᩷:Ljava/lang/CharSequence;

    .line 46
    new-instance v0, Ll/᩻ۤۢ;

    invoke-direct {v0, p1}, Ll/᩻ۤۢ;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Ll/ܿۤۢ;->᩻:Ll/᩻ۤۢ;

    .line 47
    iput-object p2, p0, Ll/ܿۤۢ;->ܿ:Ll/ۗ᩶ۢ;

    .line 48
    iput-boolean p4, p0, Ll/ܿۤۢ;->ۧ:Z

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p4, :cond_0

    .line 49
    invoke-virtual {p3}, Ll/᩸۫ۢ;->֫()Ll/ܶ۫ۢ;

    move-result-object p4

    sget-object v2, Ll/ܶ۫ۢ;->᩶:Ll/ܶ۫ۢ;

    if-ne p4, v2, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    iput-boolean p4, p0, Ll/ܿۤۢ;->ۜ:Z

    .line 50
    invoke-virtual {p3}, Ll/᩸۫ۢ;->֫()Ll/ܶ۫ۢ;

    move-result-object p3

    sget-object p4, Ll/ܶ۫ۢ;->᩶:Ll/ܶ۫ۢ;

    if-ne p3, p4, :cond_1

    const/4 p3, 0x1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    iput-boolean p3, p0, Ll/ܿۤۢ;->֫:Z

    .line 51
    invoke-static {p1}, Ll/᩷ۤۢ;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܿۤۢ;->ᩳ:Ljava/lang/String;

    .line 52
    invoke-virtual {p2}, Ll/ۗ᩶ۢ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "\t"

    goto :goto_3

    :cond_2
    invoke-virtual {p2}, Ll/ۗ᩶ۢ;->֫()I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    if-ltz p1, :cond_7

    if-eqz p1, :cond_6

    const-string p2, " "

    if-ne p1, v1, :cond_3

    move-object p1, p2

    goto :goto_3

    :cond_3
    const p3, 0x7fffffff

    .line 0
    div-int/2addr p3, p1

    if-gt v1, p3, :cond_5

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_2
    if-ge v0, p1, :cond_4

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_5
    new-instance p2, Ljava/lang/OutOfMemoryError;

    const-string p3, "Repeating 1 bytes String "

    const-string p4, " times will produce a String exceeding maximum size."

    invoke-static {p1, p3, p4}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    const-string p1, ""

    .line 52
    :goto_3
    iput-object p1, p0, Ll/ܿۤۢ;->ܽ:Ljava/lang/String;

    return-void

    .line 0
    :cond_7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "count is negative: "

    invoke-static {p1, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private ֫()V
    .locals 10

    .line 147
    new-instance v0, Ll/ۗ۫ۢ;

    invoke-direct {v0}, Ll/ۗ۫ۢ;-><init>()V

    .line 148
    iget-object v1, p0, Ll/ܿۤۢ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۤۢ;

    .line 149
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 152
    iget-object v3, v2, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    iget v4, v2, Ll/ᩳۤۢ;->᩸:I

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    iget-boolean v6, v2, Ll/ᩳۤۢ;->ᩳ:Z

    if-eqz v6, :cond_2

    .line 153
    iget-boolean v6, v2, Ll/ᩳۤۢ;->ܽ:Z

    if-eqz v6, :cond_1

    invoke-virtual {v0, v3}, Ll/ۗ۫ۢ;->֫(Ljava/lang/String;)Ll/ۙ۫ۢ;

    move-result-object v3

    goto :goto_1

    .line 154
    :cond_1
    iget-object v6, v2, Ll/ᩳۤۢ;->᩶:Ljava/util/HashMap;

    iget-boolean v7, v2, Ll/ᩳۤۢ;->ۚ:Z

    invoke-virtual {v0, v3, v6, v7, v2}, Ll/ۗ۫ۢ;->֫(Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Object;)Ll/ۙ۫ۢ;

    move-result-object v3

    .line 155
    :goto_1
    iget-boolean v6, v2, Ll/ᩳۤۢ;->ܽ:Z

    if-eqz v6, :cond_3

    if-eqz v3, :cond_3

    .line 156
    iget-object v6, v3, Ll/ۙ۫ۢ;->ۜ:Ljava/lang/Object;

    check-cast v6, Ll/ᩳۤۢ;

    iput-object v2, v6, Ll/ᩳۤۢ;->᩻:Ll/ᩳۤۢ;

    .line 157
    iput-object v6, v2, Ll/ᩳۤۢ;->ۡ:Ll/ᩳۤۢ;

    goto :goto_2

    :cond_2
    move-object v3, v5

    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    .line 160
    iget-boolean v6, v2, Ll/ᩳۤۢ;->ܽ:Z

    if-nez v6, :cond_4

    iget-object v6, v3, Ll/ۙ۫ۢ;->ܳ:Ll/ۙ۫ۢ;

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ll/ۗ۫ۢ;->֫()Ll/ۙ۫ۢ;

    move-result-object v6

    :goto_3
    if-eqz v3, :cond_5

    .line 161
    iget-boolean v7, v2, Ll/ᩳۤۢ;->ܽ:Z

    if-nez v7, :cond_5

    iget v7, v3, Ll/ۙ۫ۢ;->֫:I

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Ll/ۗ۫ۢ;->ۧ()I

    move-result v7

    :goto_4
    iput v7, v2, Ll/ᩳۤۢ;->ܿ:I

    if-nez v6, :cond_6

    goto :goto_5

    .line 162
    :cond_6
    iget-object v5, v6, Ll/ۙ۫ۢ;->ۜ:Ljava/lang/Object;

    check-cast v5, Ll/ᩳۤۢ;

    :goto_5
    iput-object v5, v2, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v3, :cond_7

    .line 163
    iget v9, v3, Ll/ۙ۫ۢ;->ܿ:I

    if-eqz v9, :cond_8

    goto :goto_6

    :cond_7
    if-eqz v6, :cond_8

    .line 164
    iget v9, v6, Ll/ۙ۫ۢ;->ܿ:I

    if-eqz v9, :cond_8

    :goto_6
    const/4 v9, 0x1

    goto :goto_7

    :cond_8
    const/4 v9, 0x0

    :goto_7
    iput-boolean v9, v2, Ll/ᩳۤۢ;->ۜ:Z

    if-eqz v3, :cond_9

    .line 165
    iget-boolean v3, v3, Ll/ۙ۫ۢ;->᩻:Z

    if-nez v3, :cond_a

    :cond_9
    if-eqz v6, :cond_b

    iget-boolean v3, v6, Ll/ۙ۫ۢ;->᩻:Z

    if-eqz v3, :cond_b

    :cond_a
    const/4 v3, 0x1

    goto :goto_8

    :cond_b
    const/4 v3, 0x0

    :goto_8
    iput-boolean v3, v2, Ll/ᩳۤۢ;->֡:Z

    .line 167
    iget-boolean v6, v2, Ll/ᩳۤۢ;->ᩴ:Z

    if-nez v6, :cond_e

    if-eqz v5, :cond_c

    iget-boolean v5, v5, Ll/ᩳۤۢ;->֡:Z

    if-nez v5, :cond_e

    :cond_c
    iget-object v5, v2, Ll/ᩳۤۢ;->ۡ:Ll/ᩳۤۢ;

    if-eqz v5, :cond_d

    iget-boolean v5, v5, Ll/ᩳۤۢ;->֡:Z

    if-eqz v5, :cond_d

    goto :goto_9

    :cond_d
    const/4 v5, 0x0

    goto :goto_a

    :cond_e
    :goto_9
    const/4 v5, 0x1

    :goto_a
    or-int/2addr v3, v5

    iput-boolean v3, v2, Ll/ᩳۤۢ;->֡:Z

    const/16 v3, 0x8

    if-ne v4, v3, :cond_f

    .line 169
    new-instance v3, Ll/۬۬ۡ;

    iget v5, v2, Ll/ᩳۤۢ;->֨:I

    iget v6, v2, Ll/ᩳۤۢ;->۠:I

    iget-object v9, p0, Ll/ܿۤۢ;->᩷:Ljava/lang/CharSequence;

    invoke-direct {v3, v5, v6, v9}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    invoke-static {v3}, Ll/ܿۤۢ;->֫(Ll/۬۬ۡ;)Z

    move-result v3

    if-eqz v3, :cond_f

    const/4 v7, 0x1

    :cond_f
    iput-boolean v7, v2, Ll/ᩳۤۢ;->ۙ:Z

    .line 170
    iget-object v3, v2, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    if-nez v3, :cond_0

    iget-object v2, v2, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-eqz v2, :cond_0

    const/4 v3, 0x2

    if-eq v4, v3, :cond_0

    if-eq v4, v8, :cond_0

    if-nez v7, :cond_0

    .line 172
    iput-boolean v8, v2, Ll/ᩳۤۢ;->ܶ:Z

    goto/16 :goto_0

    :cond_10
    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ll/᩸۫ۢ;ZLl/ᩴ᩷ܿ;)V
    .locals 1

    .line 66
    :try_start_0
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 67
    new-instance v0, Ll/ܿۤۢ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ܿۤۢ;-><init>(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ll/᩸۫ۢ;Z)V

    .line 68
    invoke-direct {v0}, Ll/ܿۤۢ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 69
    invoke-direct {v0}, Ll/ܿۤۢ;->֫()V

    .line 70
    invoke-direct {v0}, Ll/ܿۤۢ;->ۧ()V

    .line 71
    invoke-direct {v0, p4}, Ll/ܿۤۢ;->֫(Ll/ᩴ᩷ܿ;)V

    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p4, p0}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 73
    :goto_0
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V
    :try_end_0
    .catch Ll/ۜۤۢ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 77
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Source nesting exceeds formatter limit"

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 75
    :catch_1
    new-instance p0, Ljava/lang/InterruptedException;

    const-string p1, "Code transformation cancelled"

    invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(Ll/ᩴ᩷ܿ;)V
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 191
    :goto_0
    iget-object v4, v1, Ll/ܿۤۢ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget-object v6, v1, Ll/ܿۤۢ;->ᩳ:Ljava/lang/String;

    iget-boolean v7, v1, Ll/ܿۤۢ;->ۜ:Z

    iget-object v8, v1, Ll/ܿۤۢ;->᩷:Ljava/lang/CharSequence;

    if-ge v2, v5, :cond_52

    .line 192
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۤۢ;

    .line 193
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 194
    iget v9, v5, Ll/ᩳۤۢ;->֨:I

    iget v10, v5, Ll/ᩳۤۢ;->۠:I

    if-le v9, v3, :cond_0

    invoke-virtual {v0, v3, v9, v8}, Ll/ᩴ᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 195
    :cond_0
    new-instance v3, Ll/۬۬ۡ;

    iget v9, v5, Ll/ᩳۤۢ;->֨:I

    invoke-direct {v3, v9, v10, v8}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    const-string v9, "count is negative: "

    const-string v15, ""

    const-string v11, " times will produce a String exceeding maximum size."

    const-string v12, " bytes String "

    const-string v13, "Repeating "

    .line 196
    iget-object v14, v1, Ll/ܿۤۢ;->ܽ:Ljava/lang/String;

    if-eqz v7, :cond_a

    invoke-direct {v1, v2}, Ll/ܿۤۢ;->֫(I)Z

    move-result v17

    if-eqz v17, :cond_a

    .line 197
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v17

    move/from16 v18, v10

    move/from16 v10, v17

    :goto_1
    if-lez v10, :cond_1

    move-object/from16 v17, v8

    add-int/lit8 v8, v10, -0x1

    .line 198
    invoke-interface {v0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ll/۫۫ۢ;->֫(C)Z

    move-result v8

    if-eqz v8, :cond_2

    add-int/lit8 v10, v10, -0x1

    move-object/from16 v8, v17

    goto :goto_1

    :cond_1
    move-object/from16 v17, v8

    .line 199
    :cond_2
    invoke-virtual {v0, v10}, Ll/ᩴ᩷ܿ;->ۧ(I)V

    .line 200
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_9

    invoke-virtual {v0, v6}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    move-result-object v8

    iget v10, v5, Ll/ᩳۤۢ;->᩷:I

    if-ltz v10, :cond_8

    .line 0
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v19

    if-eqz v10, :cond_7

    if-nez v19, :cond_3

    goto :goto_3

    :cond_3
    move-object/from16 v20, v6

    const/4 v6, 0x1

    if-ne v10, v6, :cond_4

    move-object v6, v14

    move-object/from16 v21, v15

    goto :goto_4

    :cond_4
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v6

    move-object/from16 v21, v15

    const v16, 0x7fffffff

    div-int v15, v16, v10

    if-gt v6, v15, :cond_6

    new-instance v6, Ljava/lang/StringBuilder;

    mul-int v15, v19, v10

    invoke-direct {v6, v15}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v10, :cond_5

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/OutOfMemoryError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    move-object/from16 v20, v6

    move-object/from16 v21, v15

    move-object/from16 v6, v21

    .line 200
    :goto_4
    invoke-virtual {v8, v6}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto :goto_6

    .line 0
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v10, v9}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    move-object/from16 v20, v6

    :goto_5
    move-object/from16 v21, v15

    goto :goto_6

    :cond_a
    move-object/from16 v20, v6

    move-object/from16 v17, v8

    move/from16 v18, v10

    goto :goto_5

    :goto_6
    if-eqz v7, :cond_b

    .line 202
    iget-boolean v6, v5, Ll/ᩳۤۢ;->ۙ:Z

    if-eqz v6, :cond_b

    add-int/lit8 v6, v2, 0x1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v6, v8, :cond_b

    .line 203
    invoke-direct {v1, v6}, Ll/ܿۤۢ;->֫(I)Z

    move-result v6

    if-eqz v6, :cond_b

    iget-boolean v6, v5, Ll/ᩳۤۢ;->֡:Z

    if-eqz v6, :cond_c

    .line 204
    :cond_b
    iget-boolean v6, v5, Ll/ᩳۤۢ;->ۘ:Z

    if-eqz v6, :cond_d

    invoke-virtual {v0, v3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    :cond_c
    move/from16 v19, v2

    goto/16 :goto_22

    .line 205
    :cond_d
    iget v6, v5, Ll/ᩳۤۢ;->᩸:I

    iget-boolean v8, v1, Ll/ܿۤۢ;->֫:Z

    const/4 v10, 0x1

    if-ne v6, v10, :cond_40

    iget-object v10, v5, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-eqz v10, :cond_40

    .line 354
    iget-boolean v4, v5, Ll/ᩳۤۢ;->֡:Z

    if-nez v4, :cond_3e

    iget-boolean v4, v10, Ll/ᩳۤۢ;->᩹:Z

    if-eqz v4, :cond_3e

    iget-object v4, v10, Ll/ᩳۤۢ;->᩻:Ll/ᩳۤۢ;

    if-nez v4, :cond_e

    goto/16 :goto_21

    .line 426
    :cond_e
    iget-object v4, v10, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    iget-object v6, v10, Ll/ᩳۤۢ;->᩶:Ljava/util/HashMap;

    const-string v15, "script"

    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    move/from16 v19, v2

    const-string v2, "json"

    const/16 v22, 0x2

    move-object/from16 v23, v9

    const-string v9, "css"

    move-object/from16 v24, v9

    const-string v9, "style"

    const/16 v25, 0x0

    if-nez v4, :cond_f

    iget-object v4, v10, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    move-object/from16 v26, v11

    move-object/from16 v28, v12

    move-object/from16 v22, v13

    move-object/from16 v27, v21

    goto/16 :goto_f

    :cond_f
    const-string v4, "type"

    move-object/from16 v26, v11

    move-object/from16 v11, v21

    .line 427
    invoke-static {v6, v4, v11}, Ll/ܰ۬ᩴ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Ljava/lang/String;

    move-object/from16 v27, v11

    .line 428
    iget-object v11, v10, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    const-string v4, "language"

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    .line 429
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_10

    new-instance v11, Ljava/lang/StringBuilder;

    move-object/from16 v28, v12

    const-string v12, "text/"

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    goto :goto_7

    :cond_10
    move-object/from16 v28, v12

    .line 430
    :goto_7
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/۫۫ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v11, 0x26

    .line 432
    invoke-virtual {v4, v11}, Ljava/lang/String;->indexOf(I)I

    move-result v11

    if-gez v11, :cond_25

    const/16 v11, 0x7b

    invoke-virtual {v4, v11}, Ljava/lang/String;->indexOf(I)I

    move-result v11

    if-gez v11, :cond_25

    const-string v11, "src"

    invoke-virtual {v6, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    goto/16 :goto_e

    .line 433
    :cond_11
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    const-string v11, "js"

    if-eqz v6, :cond_13

    iget-object v4, v10, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    goto :goto_9

    :cond_12
    :goto_8
    move-object/from16 v21, v11

    move-object/from16 v22, v13

    goto/16 :goto_d

    .line 434
    :cond_13
    iget-object v6, v10, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    const-string v6, "module"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    goto :goto_8

    .line 435
    :cond_14
    iget-object v6, v10, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    const-string v6, "importmap"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    move-object/from16 v22, v13

    goto/16 :goto_c

    :cond_15
    const/16 v6, 0x3b

    .line 436
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ltz v6, :cond_16

    const/4 v12, 0x0

    .line 437
    invoke-virtual {v4, v12, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 438
    :cond_16
    iget-object v6, v10, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    const-string v6, "text/css"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_25

    :goto_9
    move-object/from16 v22, v13

    move-object/from16 v4, v24

    goto/16 :goto_10

    :cond_17
    const/16 v6, 0x2f

    .line 439
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-gez v6, :cond_18

    goto/16 :goto_e

    :cond_18
    const/4 v9, 0x0

    .line 441
    invoke-virtual {v4, v9, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x3

    const/4 v15, 0x0

    move-object/from16 v21, v11

    new-array v11, v12, [Ljava/lang/Object;

    const-string v29, "text"

    aput-object v29, v11, v15

    const-string v15, "application"

    const/16 v29, 0x1

    aput-object v15, v11, v29

    const-string v15, "dojo"

    aput-object v15, v11, v22

    .line 0
    new-instance v15, Ljava/util/HashSet;

    invoke-direct {v15, v12}, Ljava/util/HashSet;-><init>(I)V

    const/16 v22, 0x0

    move-object/from16 v22, v13

    const/4 v13, 0x0

    :goto_a
    if-ge v13, v12, :cond_1a

    aget-object v12, v11, v13

    invoke-static {v12}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v15, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_19

    add-int/lit8 v13, v13, 0x1

    const/4 v12, 0x3

    goto :goto_a

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "duplicate element: "

    invoke-static {v12, v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-static {v15}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v11

    .line 442
    invoke-interface {v11, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1b

    goto/16 :goto_f

    :cond_1b
    add-int/lit8 v6, v6, 0x1

    .line 443
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v6, "x-"

    .line 444
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1c

    const/4 v6, 0x2

    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 445
    :cond_1c
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v9, -0x1

    sparse-switch v6, :sswitch_data_0

    goto :goto_b

    :sswitch_0
    const-string v6, "livescript"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    goto :goto_b

    :cond_1d
    const/4 v9, 0x7

    goto :goto_b

    :sswitch_1
    const-string v6, "javascript"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    goto :goto_b

    :cond_1e
    const/4 v9, 0x6

    goto :goto_b

    :sswitch_2
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    goto :goto_b

    :cond_1f
    const/4 v9, 0x5

    goto :goto_b

    :sswitch_3
    const-string v6, "ld+json"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_20

    goto :goto_b

    :cond_20
    const/4 v9, 0x4

    goto :goto_b

    :sswitch_4
    const-string v6, "ecmascript"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    goto :goto_b

    :cond_21
    const/4 v9, 0x3

    goto :goto_b

    :sswitch_5
    const-string v6, "method"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_22

    goto :goto_b

    :cond_22
    const/4 v9, 0x2

    goto :goto_b

    :sswitch_6
    const-string v6, "jscript"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_23

    goto :goto_b

    :cond_23
    const/4 v9, 0x1

    goto :goto_b

    :sswitch_7
    const-string v6, "aspect"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_24

    goto :goto_b

    :cond_24
    const/4 v9, 0x0

    :goto_b
    packed-switch v9, :pswitch_data_0

    goto :goto_f

    :goto_c
    :pswitch_0
    move-object v4, v2

    goto :goto_10

    :goto_d
    :pswitch_1
    move-object/from16 v4, v21

    goto :goto_10

    :cond_25
    :goto_e
    move-object/from16 v22, v13

    :goto_f
    move-object/from16 v4, v25

    :goto_10
    if-nez v4, :cond_26

    .line 360
    invoke-virtual {v0, v3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto/16 :goto_22

    .line 363
    :cond_26
    invoke-static {v3}, Ll/ܿۤۢ;->֫(Ll/۬۬ۡ;)Z

    move-result v6

    if-eqz v6, :cond_27

    if-nez v8, :cond_3f

    .line 364
    invoke-virtual {v0, v3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto/16 :goto_22

    .line 367
    :cond_27
    iget-boolean v6, v1, Ll/ܿۤۢ;->ۧ:Z

    if-eqz v6, :cond_28

    goto :goto_13

    :cond_28
    if-eqz v7, :cond_29

    iget v5, v10, Ll/ᩳۤۢ;->᩷:I

    const/4 v8, 0x1

    add-int/2addr v5, v8

    goto :goto_11

    :cond_29
    const/4 v8, 0x1

    iget v5, v5, Ll/ᩳۤۢ;->ܿ:I

    :goto_11
    if-ltz v5, :cond_3d

    .line 0
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v9

    if-eqz v5, :cond_2e

    if-nez v9, :cond_2a

    goto :goto_13

    :cond_2a
    if-ne v5, v8, :cond_2b

    move-object v5, v14

    goto :goto_14

    :cond_2b
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v8

    const v11, 0x7fffffff

    div-int/2addr v11, v5

    if-gt v8, v11, :cond_2d

    new-instance v8, Ljava/lang/StringBuilder;

    mul-int v9, v9, v5

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v9, 0x0

    :goto_12
    if-ge v9, v5, :cond_2c

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    goto :goto_12

    :cond_2c
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_14

    :cond_2d
    new-instance v0, Ljava/lang/OutOfMemoryError;

    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v3, v22

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v3, v28

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v3, v26

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    :goto_13
    move-object/from16 v5, v27

    .line 369
    :goto_14
    invoke-virtual/range {p1 .. p1}, Ll/ᩴ᩷ܿ;->֫()Ll/ᩴ᩷ܿ;

    move-result-object v8

    move-object/from16 v9, v24

    .line 370
    :try_start_0
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_30

    if-eqz v6, :cond_2f

    .line 40
    new-instance v12, Ll/ۗ᩶ۢ;

    const/4 v2, 0x0

    invoke-direct {v12, v2, v2}, Ll/ۗ᩶ۢ;-><init>(IZ)V

    sget-object v13, Ll/۫᩶ۢ;->ᩳ:Ll/۫᩶ۢ;

    sget-object v2, Ll/۬᩶ۢ;->ۙ:Ll/۬᩶ۢ;

    const/4 v15, 0x1

    move-object/from16 v4, v27

    move-object v11, v3

    move-object v9, v14

    move-object v14, v2

    move-object/from16 v21, v4

    move-object/from16 v16, v8

    invoke-static/range {v11 .. v16}, Ll/ۖۙۢ;->֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ll/۫᩶ۢ;Ll/۬᩶ۢ;ZLl/ᩴ᩷ܿ;)V

    move-object/from16 v4, v20

    goto :goto_17

    :cond_2f
    move-object v9, v14

    move-object/from16 v21, v27

    .line 372
    iget-object v12, v1, Ll/ܿۤۢ;->ܿ:Ll/ۗ᩶ۢ;

    new-instance v13, Ll/۫᩶ۢ;

    move-object/from16 v2, v20

    invoke-direct {v13, v5, v2}, Ll/۫᩶ۢ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    sget-object v14, Ll/۬᩶ۢ;->ۙ:Ll/۬᩶ۢ;

    const/4 v15, 0x0

    move-object v11, v3

    move-object/from16 v16, v8

    invoke-static/range {v11 .. v16}, Ll/ۖۙۢ;->֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ll/۫᩶ۢ;Ll/۬᩶ۢ;ZLl/ᩴ᩷ܿ;)V

    move-object v4, v2

    goto :goto_17

    :cond_30
    move-object v9, v14

    move-object/from16 v15, v20

    move-object/from16 v21, v27

    .line 374
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_31

    sget-object v2, Ll/ᩴۙۢ;->᩶:Ll/ᩴۙۢ;

    :goto_15
    move-object v12, v2

    goto :goto_16

    :cond_31
    sget-object v2, Ll/ᩴۙۢ;->᩹:Ll/ᩴۙۢ;

    goto :goto_15

    :goto_16
    if-eqz v6, :cond_32

    .line 29
    new-instance v13, Ll/ۗ᩶ۢ;

    const/4 v2, 0x0

    invoke-direct {v13, v2, v2}, Ll/ۗ᩶ۢ;-><init>(IZ)V

    sget-object v14, Ll/᩵ۙۢ;->ᩳ:Ll/᩵ۙۢ;

    const/4 v2, 0x1

    move-object v11, v3

    move-object v4, v15

    move v15, v2

    move-object/from16 v16, v8

    invoke-static/range {v11 .. v16}, Ll/ۤ۬ۢ;->֫(Ljava/lang/CharSequence;Ll/ᩴۙۢ;Ll/ۗ᩶ۢ;Ll/᩵ۙۢ;ZLl/ᩴ᩷ܿ;)V

    goto :goto_17

    :cond_32
    move-object v4, v15

    .line 376
    iget-object v13, v1, Ll/ܿۤۢ;->ܿ:Ll/ۗ᩶ۢ;

    new-instance v14, Ll/᩵ۙۢ;

    invoke-direct {v14, v5, v4}, Ll/᩵ۙۢ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v15, 0x0

    move-object v11, v3

    move-object/from16 v16, v8

    .line 24
    invoke-static/range {v11 .. v16}, Ll/ۤ۬ۢ;->֫(Ljava/lang/CharSequence;Ll/ᩴۙۢ;Ll/ۗ᩶ۢ;Ll/᩵ۙۢ;ZLl/ᩴ᩷ܿ;)V

    .line 379
    :goto_17
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {v3}, Ll/۬۬ۡ;->length()I

    move-result v5

    if-ne v2, v5, :cond_33

    const/4 v2, 0x1

    goto :goto_18

    :cond_33
    const/4 v2, 0x0

    :goto_18
    const/4 v5, 0x0

    :goto_19
    if-eqz v2, :cond_36

    .line 380
    invoke-virtual {v3}, Ll/۬۬ۡ;->length()I

    move-result v11

    if-ge v5, v11, :cond_36

    and-int/lit16 v2, v5, 0x3ff

    if-nez v2, :cond_34

    .line 381
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 382
    :cond_34
    invoke-interface {v8, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {v3, v5}, Ll/۬۬ۡ;->charAt(I)C

    move-result v11

    if-ne v2, v11, :cond_35

    const/4 v2, 0x1

    goto :goto_1a

    :cond_35
    const/4 v2, 0x0

    :goto_1a
    add-int/lit8 v5, v5, 0x1

    goto :goto_19

    :cond_36
    if-eqz v2, :cond_37

    .line 384
    invoke-virtual {v0, v3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto/16 :goto_1f

    :cond_37
    if-eqz v6, :cond_38

    move-object v2, v8

    goto :goto_1e

    .line 385
    :cond_38
    new-instance v2, Ll/ܽۤۢ;

    const/4 v5, 0x1

    .line 386
    invoke-static {v8, v5}, Ll/ܿۤۢ;->֫(Ll/ᩴ᩷ܿ;Z)Z

    move-result v5

    if-eqz v5, :cond_39

    move-object/from16 v15, v21

    goto :goto_1b

    :cond_39
    move-object v15, v4

    :goto_1b
    const/4 v5, 0x0

    .line 387
    invoke-static {v8, v5}, Ll/ܿۤۢ;->֫(Ll/ᩴ᩷ܿ;Z)Z

    move-result v5

    if-eqz v5, :cond_3a

    move-object/from16 v4, v21

    goto :goto_1d

    :cond_3a
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v7, :cond_3b

    iget v4, v10, Ll/ᩳۤۢ;->᩷:I

    goto :goto_1c

    :cond_3b
    iget v4, v10, Ll/ᩳۤۢ;->ܿ:I

    :goto_1c
    invoke-static {v4, v9}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_1d
    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/CharSequence;

    const/4 v6, 0x0

    aput-object v15, v5, v6

    const/4 v6, 0x1

    aput-object v8, v5, v6

    const/4 v6, 0x2

    aput-object v4, v5, v6

    invoke-direct {v2, v5}, Ll/ܽۤۢ;-><init>([Ljava/lang/CharSequence;)V

    .line 388
    :goto_1e
    new-instance v4, Ll/۬۬ۡ;

    iget-object v5, v10, Ll/ᩳۤۢ;->᩻:Ll/ᩳۤۢ;

    iget v6, v5, Ll/ᩳۤۢ;->֨:I

    iget v5, v5, Ll/ᩳۤۢ;->۠:I

    move-object/from16 v9, v17

    invoke-direct {v4, v6, v5, v9}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    .line 389
    new-instance v5, Ll/ܽۤۢ;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/CharSequence;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    const/4 v7, 0x1

    aput-object v4, v6, v7

    invoke-direct {v5, v6}, Ll/ܽۤۢ;-><init>([Ljava/lang/CharSequence;)V

    iget-object v4, v10, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    invoke-static {v5, v4}, Ll/۫۫ۢ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-eq v4, v5, :cond_3c

    invoke-virtual {v0, v3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto :goto_1f

    .line 390
    :cond_3c
    invoke-virtual {v0, v2}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 391
    :goto_1f
    invoke-virtual {v8}, Ll/ᩴ᩷ܿ;->close()V

    goto :goto_22

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 369
    :try_start_1
    invoke-virtual {v8}, Ll/ᩴ᩷ܿ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_20

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_20
    throw v2

    .line 0
    :cond_3d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    move-object/from16 v2, v23

    invoke-static {v5, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3e
    :goto_21
    move/from16 v19, v2

    .line 355
    invoke-virtual {v0, v3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    :cond_3f
    :goto_22
    move/from16 v2, v19

    goto/16 :goto_27

    :cond_40
    move/from16 v19, v2

    .line 206
    iget-object v2, v5, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    const/16 v7, 0x20

    if-eqz v2, :cond_46

    iget-boolean v2, v5, Ll/ᩳۤۢ;->᩹:Z

    if-eqz v2, :cond_46

    iget-boolean v2, v5, Ll/ᩳۤۢ;->֡:Z

    if-nez v2, :cond_46

    .line 337
    iget-boolean v2, v5, Ll/ᩳۤۢ;->ܽ:Z

    iget-object v3, v5, Ll/ᩳۤۢ;->֫:Ljava/util/ArrayList;

    if-eqz v2, :cond_41

    const-string v2, "</"

    goto :goto_23

    :cond_41
    const-string v2, "<"

    :goto_23
    invoke-virtual {v0, v2}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    move-result-object v2

    iget-object v4, v5, Ll/ᩳۤۢ;->ܺ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 338
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_42
    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_43

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫ۤۢ;

    .line 339
    invoke-virtual {v0, v7}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    iget-object v6, v4, Ll/֫ۤۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    .line 340
    iget-boolean v6, v4, Ll/֫ۤۢ;->֫:Z

    if-eqz v6, :cond_42

    const/16 v6, 0x3d

    invoke-virtual {v0, v6}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    iget-object v4, v4, Ll/֫ۤۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto :goto_24

    .line 342
    :cond_43
    iget-boolean v2, v5, Ll/ᩳۤۢ;->ۚ:Z

    if-eqz v2, :cond_45

    .line 344
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_44

    const/4 v2, 0x1

    .line 0
    invoke-static {v3, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 345
    check-cast v2, Ll/֫ۤۢ;

    iget-object v2, v2, Ll/֫ۤۢ;->ܽ:Ljava/lang/String;

    if-eqz v2, :cond_44

    const/4 v3, 0x0

    .line 346
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x27

    if-eq v4, v5, :cond_44

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_44

    invoke-virtual {v0, v7}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    :cond_44
    const-string v2, "/>"

    .line 348
    invoke-virtual {v0, v2}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    goto :goto_22

    :cond_45
    const/16 v2, 0x3e

    .line 349
    invoke-virtual {v0, v2}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    goto/16 :goto_22

    :cond_46
    if-eqz v8, :cond_50

    const/16 v2, 0x8

    if-ne v6, v2, :cond_50

    .line 207
    iget-boolean v2, v5, Ll/ᩳۤۢ;->֡:Z

    if-nez v2, :cond_50

    iget-object v2, v5, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-eqz v2, :cond_47

    iget-boolean v2, v2, Ll/ᩳۤۢ;->᩹:Z

    if-eqz v2, :cond_50

    :cond_47
    move/from16 v2, v19

    .line 225
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۤۢ;

    .line 226
    invoke-static {v3}, Ll/ܿۤۢ;->֫(Ll/۬۬ۡ;)Z

    move-result v6

    if-eqz v6, :cond_4c

    .line 227
    iget-object v3, v5, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-nez v3, :cond_48

    if-eqz v2, :cond_51

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v3, v6, :cond_48

    goto/16 :goto_27

    :cond_48
    add-int/lit8 v3, v2, 0x1

    .line 228
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v3, v6, :cond_4b

    .line 229
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۤۢ;

    iget v6, v6, Ll/ᩳۤۢ;->ۧ:I

    const/4 v8, 0x1

    if-ne v6, v8, :cond_49

    goto/16 :goto_27

    .line 230
    :cond_49
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۤۢ;

    .line 231
    iget-boolean v6, v3, Ll/ᩳۤۢ;->᩹:Z

    if-eqz v6, :cond_4b

    iget-boolean v6, v3, Ll/ᩳۤۢ;->֡:Z

    if-nez v6, :cond_4b

    sget-object v6, Ll/ܿۤۢ;->ۢ:Ljava/util/Set;

    iget-object v8, v3, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4b

    if-lez v2, :cond_4a

    .line 233
    iget-boolean v6, v3, Ll/ᩳۤۢ;->ܽ:Z

    if-eqz v6, :cond_4a

    iget-object v3, v3, Ll/ᩳۤۢ;->ۡ:Ll/ᩳۤۢ;

    add-int/lit8 v6, v2, -0x1

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-ne v3, v6, :cond_4a

    goto :goto_27

    :cond_4a
    if-lez v2, :cond_4b

    add-int/lit8 v3, v2, -0x1

    .line 234
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۤۢ;

    iget v3, v3, Ll/ᩳۤۢ;->᩸:I

    const/4 v4, 0x4

    if-ne v3, v4, :cond_4b

    iget-object v3, v5, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-nez v3, :cond_4b

    goto :goto_27

    .line 238
    :cond_4b
    invoke-virtual {v0, v7}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    goto :goto_27

    :cond_4c
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 242
    :goto_25
    invoke-virtual {v3}, Ll/۬۬ۡ;->length()I

    move-result v6

    if-ge v4, v6, :cond_51

    and-int/lit16 v6, v4, 0x3ff

    if-nez v6, :cond_4d

    .line 243
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 244
    :cond_4d
    invoke-virtual {v3, v4}, Ll/۬۬ۡ;->charAt(I)C

    move-result v6

    .line 245
    invoke-static {v6}, Ll/۫۫ۢ;->֫(C)Z

    move-result v8

    if-eqz v8, :cond_4f

    if-nez v5, :cond_4e

    .line 246
    invoke-virtual {v0, v7}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    :cond_4e
    const/4 v5, 0x1

    goto :goto_26

    .line 249
    :cond_4f
    invoke-virtual {v0, v6}, Ll/ᩴ᩷ܿ;->append(C)Ll/ᩴ᩷ܿ;

    const/4 v5, 0x0

    :goto_26
    add-int/lit8 v4, v4, 0x1

    goto :goto_25

    :cond_50
    move/from16 v2, v19

    .line 209
    invoke-virtual {v0, v3}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    :cond_51
    :goto_27
    add-int/lit8 v2, v2, 0x1

    move/from16 v3, v18

    goto/16 :goto_0

    :cond_52
    move-object v2, v6

    move-object v9, v8

    .line 213
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v3, v5, :cond_53

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-virtual {v0, v3, v5, v9}, Ll/ᩴ᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    :cond_53
    if-eqz v7, :cond_55

    .line 214
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_55

    const/4 v3, 0x1

    .line 0
    invoke-static {v4, v3}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v3

    .line 215
    check-cast v3, Ll/ᩳۤۢ;

    .line 216
    iget-boolean v5, v3, Ll/ᩳۤۢ;->ۙ:Z

    if-eqz v5, :cond_54

    iget v5, v3, Ll/ᩳۤۢ;->᩵:I

    if-ltz v5, :cond_54

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۤۢ;

    .line 217
    :cond_54
    iget-boolean v4, v3, Ll/ᩳۤۢ;->ܳ:Z

    if-eqz v4, :cond_55

    iget-boolean v4, v3, Ll/ᩳۤۢ;->ܽ:Z

    if-eqz v4, :cond_55

    iget-object v4, v3, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    const-string v5, "html"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_55

    iget-boolean v3, v3, Ll/ᩳۤۢ;->֡:Z

    if-nez v3, :cond_55

    .line 218
    invoke-virtual {v0, v2}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    :cond_55
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x53f0eba8 -> :sswitch_7
        -0x4ec5a64b -> :sswitch_6
        -0x403a2f1f -> :sswitch_5
        -0x388d1203 -> :sswitch_4
        -0x1aa82e5 -> :sswitch_3
        0x31ece8 -> :sswitch_2
        0xb43d96d -> :sswitch_1
        0x699320b7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private ֫(I)Z
    .locals 4

    .line 331
    iget-object v0, p0, Ll/ܿۤۢ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۤۢ;

    .line 332
    iget v1, v1, Ll/ᩳۤۢ;->ۧ:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    if-lez p1, :cond_0

    sub-int/2addr p1, v2

    .line 333
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۤۢ;

    iget-boolean p1, p1, Ll/ᩳۤۢ;->ۙ:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v2
.end method

.method public static ֫(Ll/۬۬ۡ;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 460
    :goto_0
    invoke-virtual {p0}, Ll/۬۬ۡ;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    and-int/lit16 v2, v1, 0x3ff

    if-nez v2, :cond_0

    .line 461
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 462
    :cond_0
    invoke-virtual {p0, v1}, Ll/۬۬ۡ;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ll/۫۫ۢ;->֫(C)Z

    move-result v2

    if-nez v2, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private ֫(Ll/ᩳۤۢ;)Z
    .locals 5

    .line 326
    iget v0, p1, Ll/ᩳۤۢ;->֨:I

    iget v1, p1, Ll/ᩳۤۢ;->᩸:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const-string v1, "<!doctype"

    iget-object v2, p0, Ll/ܿۤۢ;->᩷:Ljava/lang/CharSequence;

    const/4 v3, 0x1

    const/16 v4, 0x9

    invoke-static {v2, v3, v0, v1, v4}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget p1, p1, Ll/ᩳۤۢ;->۠:I

    add-int/2addr v0, v4

    if-le p1, v0, :cond_0

    sub-int/2addr p1, v3

    .line 327
    invoke-interface {v2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    const/16 v0, 0x3e

    if-ne p1, v0, :cond_0

    return v3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ֫(Ll/ᩴ᩷ܿ;Z)Z
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 417
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_0
    if-ltz v2, :cond_5

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 418
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0xd

    if-eq v3, v4, :cond_4

    const/16 v4, 0xa

    if-ne v3, v4, :cond_1

    goto :goto_2

    .line 420
    :cond_1
    invoke-static {v3}, Ll/۫۫ۢ;->֫(C)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    if-eqz p1, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, -0x1

    :goto_1
    add-int/2addr v2, v3

    goto :goto_0

    :cond_4
    :goto_2
    return v0

    :cond_5
    :goto_3
    return v1
.end method

.method private ۧ()V
    .locals 13

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 258
    :goto_0
    iget-object v3, p0, Ll/ܿۤۢ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ge v2, v4, :cond_9

    .line 259
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 260
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۤۢ;

    .line 261
    iput v0, v3, Ll/ᩳۤۢ;->᩵:I

    .line 262
    iget-object v4, v3, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    if-eqz v4, :cond_4

    iget-boolean v6, v3, Ll/ᩳۤۢ;->ۜ:Z

    if-nez v6, :cond_4

    iget-boolean v6, v3, Ll/ᩳۤۢ;->᩹:Z

    if-eqz v6, :cond_4

    iget-boolean v6, v3, Ll/ᩳۤۢ;->ܽ:Z

    if-eqz v6, :cond_0

    iget-object v4, v3, Ll/ᩳۤۢ;->ۡ:Ll/ᩳۤۢ;

    if-eqz v4, :cond_4

    iget-boolean v4, v4, Ll/ᩳۤۢ;->ܳ:Z

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_0
    const-string v6, "html"

    .line 264
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v3, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-eqz v4, :cond_3

    :cond_1
    iget-object v4, v3, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    const-string v7, "head"

    .line 265
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v3, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    const-string v7, "body"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_2
    iget-object v4, v3, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-eqz v4, :cond_3

    iget-boolean v7, v4, Ll/ᩳۤۢ;->ܳ:Z

    if-eqz v7, :cond_4

    iget-object v4, v4, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    .line 266
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    :goto_1
    const/4 v4, 0x1

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    iput-boolean v4, v3, Ll/ᩳۤۢ;->ܳ:Z

    if-eqz v4, :cond_5

    goto :goto_3

    .line 267
    :cond_5
    iget-boolean v4, v3, Ll/ᩳۤۢ;->ܽ:Z

    if-eqz v4, :cond_6

    iget-object v4, v3, Ll/ᩳۤۢ;->ۡ:Ll/ᩳۤۢ;

    if-eqz v4, :cond_6

    .line 268
    iget v4, v4, Ll/ᩳۤۢ;->᩷:I

    goto :goto_4

    :cond_6
    iget-object v4, v3, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-nez v4, :cond_7

    :goto_3
    const/4 v4, 0x0

    goto :goto_4

    :cond_7
    iget v4, v4, Ll/ᩳۤۢ;->᩷:I

    add-int/2addr v4, v5

    :goto_4
    iput v4, v3, Ll/ᩳۤۢ;->᩷:I

    .line 269
    iget-boolean v3, v3, Ll/ᩳۤۢ;->ۙ:Z

    if-nez v3, :cond_8

    move v0, v2

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_9
    const/4 v0, 0x0

    .line 271
    :goto_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_2b

    .line 272
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 273
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۤۢ;

    .line 280
    iget-boolean v4, v2, Ll/ᩳۤۢ;->ۙ:Z

    if-nez v4, :cond_29

    iget-boolean v4, v2, Ll/ᩳۤۢ;->ۘ:Z

    if-eqz v4, :cond_a

    iget-object v4, v2, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    if-eqz v4, :cond_29

    iget-boolean v4, v2, Ll/ᩳۤۢ;->֡:Z

    if-nez v4, :cond_29

    :cond_a
    iget-boolean v4, v2, Ll/ᩳۤۢ;->ۜ:Z

    if-nez v4, :cond_29

    iget-object v4, v2, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-eqz v4, :cond_b

    iget-boolean v4, v4, Ll/ᩳۤۢ;->֡:Z

    if-eqz v4, :cond_b

    goto/16 :goto_9

    .line 282
    :cond_b
    iget v4, v2, Ll/ᩳۤۢ;->᩵:I

    if-gez v4, :cond_c

    const/4 v4, 0x0

    goto :goto_6

    :cond_c
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۤۢ;

    :goto_6
    if-eqz v4, :cond_d

    .line 284
    iget-boolean v6, v4, Ll/ᩳۤۢ;->ۘ:Z

    if-eqz v6, :cond_d

    iget-object v6, v4, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    if-eqz v6, :cond_29

    iget-boolean v6, v4, Ll/ᩳۤۢ;->֡:Z

    if-eqz v6, :cond_d

    goto/16 :goto_9

    .line 285
    :cond_d
    iget v6, v2, Ll/ᩳۤۢ;->᩸:I

    const/4 v7, 0x4

    if-ne v6, v7, :cond_e

    iget-object v4, v2, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-nez v4, :cond_29

    invoke-direct {p0, v2}, Ll/ܿۤۢ;->֫(Ll/ᩳۤۢ;)Z

    move-result v4

    if-eqz v4, :cond_29

    goto/16 :goto_8

    .line 286
    :cond_e
    iget-object v8, v2, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    if-eqz v8, :cond_10

    iget-boolean v9, v2, Ll/ᩳۤۢ;->᩹:Z

    if-eqz v9, :cond_29

    iget-boolean v9, v2, Ll/ᩳۤۢ;->ܽ:Z

    if-eqz v9, :cond_f

    iget-object v10, v2, Ll/ᩳۤۢ;->ۡ:Ll/ᩳۤۢ;

    if-eqz v10, :cond_29

    :cond_f
    if-eqz v9, :cond_10

    iget-boolean v9, v2, Ll/ᩳۤۢ;->֡:Z

    if-eqz v9, :cond_10

    goto/16 :goto_9

    .line 288
    :cond_10
    iget-boolean v9, v2, Ll/ᩳۤۢ;->ܳ:Z

    if-eqz v9, :cond_11

    goto/16 :goto_8

    .line 289
    :cond_11
    iget-object v9, v2, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-eqz v9, :cond_12

    iget-boolean v10, v9, Ll/ᩳۤۢ;->ܶ:Z

    if-eqz v10, :cond_12

    goto/16 :goto_9

    :cond_12
    const/4 v10, 0x2

    .line 290
    sget-object v11, Ll/ܿۤۢ;->ۢ:Ljava/util/Set;

    if-ne v6, v10, :cond_14

    if-eqz v9, :cond_13

    .line 291
    iget-object v6, v9, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    invoke-interface {v11, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    goto/16 :goto_9

    :cond_13
    if-eqz v4, :cond_28

    .line 292
    invoke-direct {p0, v4}, Ll/ܿۤۢ;->ۧ(Ll/ᩳۤۢ;)Z

    move-result v4

    if-eqz v4, :cond_2a

    goto/16 :goto_8

    :cond_14
    if-eqz v8, :cond_29

    .line 296
    iget-boolean v6, v2, Ll/ᩳۤۢ;->ܽ:Z

    if-eqz v6, :cond_15

    iget-object v6, v2, Ll/ᩳۤۢ;->ۡ:Ll/ᩳۤۢ;

    iget-boolean v6, v6, Ll/ᩳۤۢ;->ܶ:Z

    if-eqz v6, :cond_15

    goto/16 :goto_9

    :cond_15
    if-nez v4, :cond_16

    .line 297
    invoke-interface {v11, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    goto/16 :goto_a

    .line 298
    :cond_16
    iget v6, v4, Ll/ᩳۤۢ;->᩸:I

    if-ne v6, v5, :cond_17

    goto/16 :goto_9

    .line 299
    :cond_17
    iget-object v12, v4, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    if-nez v12, :cond_24

    if-eq v6, v10, :cond_24

    if-eq v6, v7, :cond_24

    .line 303
    iget-object v6, v4, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-eqz v6, :cond_29

    if-eq v6, v9, :cond_29

    iget-boolean v8, v6, Ll/ᩳۤۢ;->֡:Z

    if-nez v8, :cond_29

    iget-object v6, v6, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    .line 302
    invoke-interface {v11, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_29

    iget-boolean v6, v2, Ll/ᩳۤۢ;->ܽ:Z

    if-nez v6, :cond_28

    iget-object v4, v4, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    iget-object v4, v4, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    iget-object v6, v2, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    const-string v8, "p"

    .line 178
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v11, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1a

    const/4 v8, 0x5

    new-array v9, v8, [Ljava/lang/Object;

    const-string v11, "script"

    aput-object v11, v9, v1

    const-string v11, "style"

    aput-object v11, v9, v5

    const-string v11, "meta"

    aput-object v11, v9, v10

    const-string v10, "link"

    const/4 v11, 0x3

    aput-object v10, v9, v11

    const-string v10, "base"

    aput-object v10, v9, v7

    .line 0
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v8}, Ljava/util/HashSet;-><init>(I)V

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v8, :cond_19

    aget-object v11, v9, v10

    invoke-static {v11}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_18

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "duplicate element: "

    invoke-static {v11, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    invoke-static {v7}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v7

    .line 178
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_28

    :cond_1a
    const-string v7, "li"

    .line 179
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1b

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_1b
    const-string v7, "dt"

    .line 180
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "dd"

    if-nez v8, :cond_1c

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1d

    :cond_1c
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_1d
    const-string v7, "option"

    .line 181
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "optgroup"

    if-eqz v8, :cond_1e

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    .line 182
    :cond_1e
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1f

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_1f
    const-string v7, "tr"

    .line 183
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_20

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_20
    const-string v7, "td"

    .line 184
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "th"

    if-nez v8, :cond_21

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_22

    :cond_21
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_22
    const-string v7, "thead"

    .line 185
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-string v8, "tfoot"

    const-string v9, "tbody"

    if-nez v7, :cond_23

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_23

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    .line 186
    :cond_23
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_28

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_29

    goto :goto_8

    .line 305
    :cond_24
    iget-object v6, v2, Ll/ᩳۤۢ;->ۡ:Ll/ᩳۤۢ;

    if-ne v6, v4, :cond_25

    goto :goto_9

    .line 306
    :cond_25
    invoke-interface {v11, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_26

    .line 307
    invoke-direct {p0, v4}, Ll/ܿۤۢ;->ۧ(Ll/ᩳۤۢ;)Z

    move-result v4

    if-eqz v4, :cond_2a

    goto :goto_8

    .line 310
    :cond_26
    iget-object v6, v2, Ll/ᩳۤۢ;->ۖ:Ll/ᩳۤۢ;

    if-eqz v6, :cond_29

    iget-boolean v7, v6, Ll/ᩳۤۢ;->ܳ:Z

    if-nez v7, :cond_27

    iget-object v6, v6, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    const/16 v7, 0x3a

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ltz v6, :cond_29

    .line 311
    :cond_27
    invoke-direct {p0, v4}, Ll/ܿۤۢ;->ۧ(Ll/ᩳۤۢ;)Z

    move-result v4

    if-eqz v4, :cond_2a

    :cond_28
    :goto_8
    const/4 v10, 0x1

    goto :goto_a

    :cond_29
    :goto_9
    const/4 v10, 0x0

    .line 274
    :cond_2a
    :goto_a
    iput v10, v2, Ll/ᩳۤۢ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_5

    :cond_2b
    return-void
.end method

.method private ۧ(Ll/ᩳۤۢ;)Z
    .locals 4

    .line 318
    iget-boolean v0, p1, Ll/ᩳۤۢ;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ᩳۤۢ;->ۡ:Ll/ᩳۤۢ;

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 319
    :goto_0
    iget-object v1, p1, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-boolean v3, p1, Ll/ᩳۤۢ;->᩹:Z

    if-eqz v3, :cond_1

    sget-object v3, Ll/ܿۤۢ;->ۢ:Ljava/util/Set;

    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Ll/ܿۤۢ;->ۡ:Ljava/util/Set;

    iget-object v3, p1, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    .line 320
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_1

    iget v0, v0, Ll/ᩳۤۢ;->ۧ:I

    if-eq v0, v2, :cond_3

    :cond_1
    iget v0, p1, Ll/ᩳۤۢ;->᩸:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget v1, p1, Ll/ᩳۤۢ;->ۧ:I

    if-eq v1, v2, :cond_3

    :cond_2
    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 322
    invoke-direct {p0, p1}, Ll/ܿۤۢ;->֫(Ll/ᩳۤۢ;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    return v2

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method private ܽ()Z
    .locals 18

    move-object/from16 v0, p0

    .line 82
    new-instance v1, Ll/۬۫ۢ;

    new-instance v2, Ll/᩷ۤۢ;

    iget-object v3, v0, Ll/ܿۤۢ;->᩻:Ll/᩻ۤۢ;

    invoke-virtual {v3}, Ll/᩻ۤۢ;->֫()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-direct {v2, v4}, Ll/᩷ۤۢ;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v1, v2}, Ll/۬۫ۢ;-><init>(Ll/᩷ۤۢ;)V

    .line 83
    invoke-virtual {v1}, Ll/ᩴܳ֡;->ۢ()V

    .line 84
    new-instance v2, Ll/ۧۤۢ;

    iget-object v4, v0, Ll/ܿۤۢ;->᩷:Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-direct {v2, v1, v4}, Ll/ۧۤۢ;-><init>(Ll/۬۫ۢ;I)V

    .line 85
    invoke-virtual {v2}, Ll/֫ܳ֡;->ܽ()V

    .line 86
    invoke-virtual {v1}, Ll/۫۫ۢ;->ᩴ()Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    goto :goto_1

    .line 87
    :cond_0
    new-instance v1, Ll/۟۫ۢ;

    invoke-direct {v1, v2}, Ll/۟۫ۢ;-><init>(Ll/֫ܳ֡;)V

    .line 88
    invoke-virtual {v1}, Ll/ᩴܳ֡;->ۢ()V

    .line 89
    invoke-virtual {v1}, Ll/۟۫ۢ;->᩸()Ll/ۛ۫ۢ;

    move-result-object v1

    .line 103
    const-class v2, Ll/ۨ۫ۢ;

    invoke-virtual {v1, v2}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    .line 89
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v5, 0x1

    if-eqz v2, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ۫ۢ;

    .line 90
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 91
    new-instance v6, Ll/ᩳۤۢ;

    .line 322
    iget-object v7, v2, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    .line 91
    invoke-interface {v7}, Ll/֡ܳ֡;->ᩳ()I

    move-result v7

    .line 328
    iget-object v8, v2, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    .line 91
    invoke-interface {v8}, Ll/֡ܳ֡;->ܿ()I

    move-result v8

    add-int/2addr v8, v5

    .line 322
    iget-object v9, v2, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    .line 92
    invoke-interface {v9}, Ll/֡ܳ֡;->getType()I

    move-result v9

    invoke-direct {v6, v7, v8, v9}, Ll/ᩳۤۢ;-><init>(III)V

    .line 93
    iget v7, v6, Ll/ᩳۤۢ;->֨:I

    iget v8, v6, Ll/ᩳۤۢ;->۠:I

    invoke-virtual {v3, v7, v8}, Ll/᩻ۤۢ;->֫(II)Z

    move-result v7

    iput-boolean v7, v6, Ll/ᩳۤۢ;->ۘ:Z

    .line 153
    const-class v7, Ll/᩺۫ۢ;

    invoke-virtual {v2, v7, v4}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v2

    check-cast v2, Ll/᩺۫ۢ;

    if-eqz v2, :cond_1f

    const/16 v7, 0xe

    .line 249
    invoke-virtual {v2, v7, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v8

    .line 96
    invoke-interface {v8}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v8

    .line 98
    invoke-interface {v8}, Ll/֡ܳ֡;->ᩳ()I

    move-result v9

    invoke-interface {v8}, Ll/֡ܳ֡;->ܿ()I

    move-result v8

    add-int/2addr v8, v5

    invoke-virtual {v3, v9, v8}, Ll/᩻ۤۢ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_1

    :goto_1
    return v4

    .line 249
    :cond_1
    invoke-virtual {v2, v7, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v8

    .line 99
    invoke-interface {v8}, Ll/ܺ᩷֡;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/۫۫ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v6, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    .line 249
    invoke-virtual {v2, v7, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v8

    .line 100
    invoke-interface {v8}, Ll/ܺ᩷֡;->getText()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v6, Ll/ᩳۤۢ;->ܺ:Ljava/lang/String;

    const/4 v8, 0x6

    .line 251
    invoke-virtual {v2, v8, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v8

    if-eqz v8, :cond_2

    const/4 v8, 0x1

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    .line 101
    :goto_2
    iput-boolean v8, v6, Ll/ᩳۤۢ;->ܽ:Z

    const/16 v8, 0xa

    .line 259
    invoke-virtual {v2, v8, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v8

    if-eqz v8, :cond_3

    const/4 v8, 0x1

    goto :goto_3

    :cond_3
    const/4 v8, 0x0

    .line 102
    :goto_3
    iput-boolean v8, v6, Ll/ᩳۤۢ;->ۚ:Z

    const/16 v8, 0xb

    .line 258
    invoke-virtual {v2, v8, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v8

    if-nez v8, :cond_5

    .line 103
    iget-boolean v8, v6, Ll/ᩳۤۢ;->ۚ:Z

    if-eqz v8, :cond_4

    goto :goto_4

    :cond_4
    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    :goto_4
    const/4 v8, 0x1

    :goto_5
    iput-boolean v8, v6, Ll/ᩳۤۢ;->ᩳ:Z

    .line 104
    iput-boolean v8, v6, Ll/ᩳۤۢ;->᩹:Z

    .line 253
    const-class v8, Ll/ܰ۫ۢ;

    invoke-virtual {v2, v8}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 105
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    iget-object v9, v6, Ll/ᩳۤۢ;->֫:Ljava/util/ArrayList;

    if-eqz v8, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܰ۫ۢ;

    .line 333
    const-class v10, Ll/ۤ۫ۢ;

    invoke-virtual {v8, v10, v4}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v10

    check-cast v10, Ll/ۤ۫ۢ;

    .line 322
    iget-object v11, v8, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    .line 107
    invoke-interface {v11}, Ll/֡ܳ֡;->ᩳ()I

    move-result v11

    .line 328
    iget-object v12, v8, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    .line 107
    invoke-interface {v12}, Ll/֡ܳ֡;->ܿ()I

    move-result v12

    add-int/2addr v12, v5

    invoke-virtual {v3, v11, v12}, Ll/᩻ۤۢ;->֫(II)Z

    move-result v11

    const/16 v12, 0x13

    if-eqz v11, :cond_d

    .line 109
    iget-boolean v11, v6, Ll/ᩳۤۢ;->ᩴ:Z

    if-eqz v10, :cond_b

    .line 461
    invoke-virtual {v10, v12, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v12

    if-eqz v12, :cond_b

    .line 451
    invoke-virtual {v10, v7, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v12

    .line 110
    invoke-interface {v12}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v12

    invoke-interface {v12}, Ll/֡ܳ֡;->ᩳ()I

    move-result v12

    .line 451
    invoke-virtual {v10, v7, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v13

    .line 111
    invoke-interface {v13}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v13

    invoke-interface {v13}, Ll/֡ܳ֡;->ܿ()I

    move-result v13

    add-int/2addr v13, v5

    .line 110
    invoke-virtual {v3, v12, v13}, Ll/᩻ۤۢ;->֫(II)Z

    move-result v5

    if-nez v5, :cond_b

    iget-object v5, v6, Ll/ᩳۤۢ;->ۢ:Ljava/lang/String;

    .line 451
    invoke-virtual {v10, v7, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v7

    .line 112
    invoke-interface {v7}, Ll/ܺ᩷֡;->getText()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/۫۫ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v13, "style"

    .line 139
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_b

    const-string v15, "xml:space"

    invoke-virtual {v7, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_b

    const-string v15, "xmlns"

    .line 140
    invoke-virtual {v7, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_b

    const-string v15, "xmlns:"

    invoke-virtual {v7, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_b

    const-string v15, "script"

    .line 141
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    const-string v14, "type"

    if-eqz v15, :cond_8

    const/4 v15, 0x3

    new-array v12, v15, [Ljava/lang/Object;

    .line 0
    aput-object v14, v12, v4

    const-string v4, "language"

    const/16 v17, 0x1

    aput-object v4, v12, v17

    const-string v4, "src"

    const/16 v16, 0x2

    aput-object v4, v12, v16

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v15}, Ljava/util/HashSet;-><init>(I)V

    const/16 v16, 0x0

    move-object/from16 v16, v1

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v15, :cond_7

    aget-object v15, v12, v1

    invoke-static {v15}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_6

    add-int/lit8 v1, v1, 0x1

    const/4 v15, 0x3

    goto :goto_7

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "duplicate element: "

    invoke-static {v15, v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static {v4}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 141
    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_8

    :cond_8
    move-object/from16 v16, v1

    .line 142
    :goto_8
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_9
    const-string v1, "annotation-xml"

    .line 143
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "encoding"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_9

    :cond_a
    const/4 v1, 0x0

    goto :goto_a

    :cond_b
    move-object/from16 v16, v1

    :cond_c
    :goto_9
    const/4 v1, 0x1

    :goto_a
    or-int/2addr v1, v11

    .line 112
    iput-boolean v1, v6, Ll/ᩳۤۢ;->ᩴ:Z

    goto :goto_b

    :cond_d
    move-object/from16 v16, v1

    :goto_b
    if-nez v10, :cond_e

    const/16 v1, 0xc

    const/4 v4, 0x0

    .line 335
    invoke-virtual {v8, v1, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v1

    if-nez v1, :cond_1b

    .line 115
    iput-boolean v4, v6, Ll/ᩳۤۢ;->᩹:Z

    goto/16 :goto_11

    :cond_e
    const/16 v1, 0xe

    const/4 v4, 0x0

    .line 451
    invoke-virtual {v10, v1, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v1

    .line 118
    invoke-interface {v1}, Ll/ܺ᩷֡;->getText()Ljava/lang/String;

    move-result-object v1

    const/16 v5, 0x13

    .line 461
    invoke-virtual {v10, v5, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v7

    if-eqz v7, :cond_f

    invoke-virtual {v10, v5, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v5

    .line 119
    invoke-interface {v5}, Ll/ܺ᩷֡;->getText()Ljava/lang/String;

    move-result-object v5

    goto :goto_c

    :cond_f
    const/16 v5, 0x14

    .line 462
    invoke-virtual {v10, v5, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v7

    if-eqz v7, :cond_10

    invoke-virtual {v10, v5, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v5

    .line 120
    invoke-interface {v5}, Ll/ܺ᩷֡;->getText()Ljava/lang/String;

    move-result-object v5

    goto :goto_c

    :cond_10
    const/4 v5, 0x0

    :goto_c
    const/16 v7, 0xd

    .line 452
    invoke-virtual {v10, v7, v4}, Ll/ۡܳ֡;->֫(II)Ll/ۘ᩷֡;

    move-result-object v4

    if-eqz v4, :cond_11

    const/4 v4, 0x1

    goto :goto_d

    :cond_11
    const/4 v4, 0x0

    :goto_d
    if-eqz v4, :cond_12

    if-eqz v5, :cond_14

    :cond_12
    const/16 v7, 0x7b

    .line 122
    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-gez v7, :cond_14

    const/16 v7, 0x25

    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-ltz v7, :cond_13

    goto :goto_e

    :cond_13
    const/4 v7, 0x0

    goto :goto_f

    :cond_14
    :goto_e
    const/4 v7, 0x0

    iput-boolean v7, v6, Ll/ᩳۤۢ;->᩹:Z

    :goto_f
    const/16 v8, 0x22

    const/16 v10, 0x27

    if-eqz v5, :cond_17

    .line 123
    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-eq v11, v10, :cond_15

    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v11, v8, :cond_17

    .line 124
    :cond_15
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v12, 0x2

    if-lt v11, v12, :cond_16

    const/4 v11, 0x1

    .line 0
    invoke-static {v11, v5}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v11

    .line 124
    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-eq v11, v12, :cond_17

    :cond_16
    iput-boolean v7, v6, Ll/ᩳۤۢ;->᩹:Z

    .line 125
    :cond_17
    new-instance v7, Ll/֫ۤۢ;

    invoke-direct {v7, v1, v5, v4}, Ll/֫ۤۢ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    invoke-static {v1}, Ll/۫۫ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v5, :cond_18

    const-string v5, ""

    goto :goto_10

    .line 454
    :cond_18
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v7, 0x1

    if-le v4, v7, :cond_1a

    const/4 v4, 0x0

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v9, v10, :cond_19

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v9, v8, :cond_1a

    .line 0
    :cond_19
    invoke-static {v7, v5}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v8

    .line 455
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v8, v4, :cond_1a

    .line 0
    invoke-static {v7, v7, v5}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 127
    :cond_1a
    :goto_10
    iget-object v4, v6, Ll/ᩳۤۢ;->᩶:Ljava/util/HashMap;

    invoke-static {v4, v1, v5}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v4, 0x0

    :cond_1b
    :goto_11
    const/4 v5, 0x1

    const/16 v7, 0xe

    move-object/from16 v1, v16

    goto/16 :goto_6

    :cond_1c
    move-object/from16 v16, v1

    .line 129
    iget-boolean v1, v6, Ll/ᩳۤۢ;->ܽ:Z

    if-eqz v1, :cond_1e

    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1d

    iget-boolean v1, v6, Ll/ᩳۤۢ;->ۚ:Z

    if-eqz v1, :cond_1e

    :cond_1d
    const/4 v1, 0x0

    iput-boolean v1, v6, Ll/ᩳۤۢ;->᩹:Z

    .line 130
    :cond_1e
    iget-boolean v1, v6, Ll/ᩳۤۢ;->ۘ:Z

    if-eqz v1, :cond_20

    iget-boolean v1, v6, Ll/ᩳۤۢ;->᩹:Z

    if-nez v1, :cond_20

    const/4 v1, 0x1

    iput-boolean v1, v6, Ll/ᩳۤۢ;->ᩴ:Z

    goto :goto_12

    :cond_1f
    move-object/from16 v16, v1

    .line 132
    :cond_20
    :goto_12
    iget-object v1, v0, Ll/ܿۤۢ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    move-object/from16 v1, v16

    goto/16 :goto_0

    :cond_21
    const/4 v1, 0x1

    return v1
.end method
