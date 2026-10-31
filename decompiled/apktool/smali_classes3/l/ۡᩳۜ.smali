.class public final Ll/ۡᩳۜ;
.super Ljava/lang/Object;
.source "G7AI"


# static fields
.field public static final ܳ:[C


# instance fields
.field public ֫:Ljava/lang/ref/SoftReference;

.field public final ۧ:Ljava/lang/Object;

.field public ܽ:Ljava/lang/ref/SoftReference;

.field public final ܿ:Ll/᩵ᩳۜ;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789abcdef"

    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Ll/ۡᩳۜ;->ܳ:[C

    return-void
.end method

.method public constructor <init>(Ll/᩵ᩳۜ;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۡᩳۜ;->ۧ:Ljava/lang/Object;

    .line 61
    iput-object p1, p0, Ll/ۡᩳۜ;->ܿ:Ll/᩵ᩳۜ;

    .line 62
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۡᩳۜ;->ᩳ:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ll/᩵ᩳۜ;Ljava/util/ArrayList;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۡᩳۜ;->ۧ:Ljava/lang/Object;

    .line 69
    iput-object p1, p0, Ll/ۡᩳۜ;->ܿ:Ll/᩵ᩳۜ;

    .line 70
    invoke-static {p2}, Ll/ۘᩳۜ;->֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ۡᩳۜ;->ᩳ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 628
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string v0, "default"

    .line 630
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, -0x1

    return p0

    .line 632
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x1

    return p0

    .line 635
    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ֫(Ll/֨᩻ܽ;)I
    .locals 2

    .line 1569
    invoke-interface {p0}, Ll/֨᩻ܽ;->ۖ()I

    move-result v0

    .line 1570
    invoke-interface {p0}, Ll/֨᩻ܽ;->getValue()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0

    .line 1575
    :cond_2
    :goto_1
    invoke-interface {p0}, Ll/֨᩻ܽ;->getValue()I

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/lang/String;)J
    .locals 10

    const-wide/16 v0, -0x1

    if-eqz p0, :cond_6

    .line 765
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_6

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v7, "0x"

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    const-wide/16 v2, 0x0

    const/4 v4, 0x2

    .line 769
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_5

    .line 770
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x30

    if-lt v5, v6, :cond_1

    const/16 v6, 0x39

    if-gt v5, v6, :cond_1

    add-int/lit8 v5, v5, -0x30

    goto :goto_1

    :cond_1
    const/16 v6, 0x61

    if-lt v5, v6, :cond_2

    const/16 v6, 0x66

    if-gt v5, v6, :cond_2

    add-int/lit8 v5, v5, -0x57

    goto :goto_1

    :cond_2
    const/16 v6, 0x41

    if-lt v5, v6, :cond_3

    const/16 v6, 0x46

    if-gt v5, v6, :cond_3

    add-int/lit8 v5, v5, -0x37

    goto :goto_1

    :cond_3
    const/4 v5, -0x1

    :goto_1
    if-gez v5, :cond_4

    return-wide v0

    :cond_4
    const/4 v6, 0x4

    shl-long/2addr v2, v6

    int-to-long v5, v5

    or-long/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    return-wide v2

    :cond_6
    :goto_2
    return-wide v0
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 5

    const/16 v0, 0xa

    new-array v0, v0, [C

    const/16 v1, 0x30

    const/4 v2, 0x0

    aput-char v1, v0, v2

    const/4 v1, 0x1

    const/16 v3, 0x78

    aput-char v3, v0, v1

    :goto_0
    const/16 v1, 0x8

    if-ge v2, v1, :cond_0

    add-int/lit8 v1, v2, 0x2

    mul-int/lit8 v3, v2, 0x4

    rsub-int/lit8 v3, v3, 0x1c

    ushr-int v3, p0, v3

    and-int/lit8 v3, v3, 0xf

    .line 738
    sget-object v4, Ll/ۡᩳۜ;->ܳ:[C

    aget-char v3, v4, v3

    aput-char v3, v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 740
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/֨᩻ܽ;Ll/᩵ܽۜ;Ljava/util/HashSet;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۡᩳۜ;->֫(Ll/֨᩻ܽ;Ll/᩵ܽۜ;Ljava/util/Set;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֨᩻ܽ;Ll/᩵ܽۜ;Ljava/util/Set;)Ljava/lang/String;
    .locals 1

    .line 1501
    iget-object v0, p1, Ll/᩵ܽۜ;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1504
    :cond_0
    invoke-interface {p0}, Ll/֨᩻ܽ;->ۖ()I

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "null_value"

    return-object p0

    :cond_1
    const/4 v0, 0x3

    if-ne p0, v0, :cond_4

    .line 1508
    iget-boolean p0, p1, Ll/᩵ܽۜ;->ܽ:Z

    if-eqz p0, :cond_2

    const-string p0, "styled_text"

    return-object p0

    .line 1511
    :cond_2
    iget-object p0, p1, Ll/᩵ܽۜ;->ۧ:Ljava/lang/String;

    if-eqz p0, :cond_3

    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "file_path"

    return-object p0

    :cond_3
    const-string p0, "text"

    return-object p0

    :cond_4
    const/4 p1, 0x1

    if-eq p0, p1, :cond_e

    const/4 p1, 0x7

    if-ne p0, p1, :cond_5

    goto :goto_3

    :cond_5
    const/4 p1, 0x2

    if-eq p0, p1, :cond_d

    const/16 p1, 0x8

    if-ne p0, p1, :cond_6

    goto :goto_2

    :cond_6
    const/16 p1, 0x12

    if-ne p0, p1, :cond_7

    const-string p0, "boolean"

    return-object p0

    :cond_7
    const/16 p1, 0x1c

    if-lt p0, p1, :cond_8

    const/16 p1, 0x1f

    if-gt p0, p1, :cond_8

    const-string p0, "color"

    return-object p0

    :cond_8
    const/4 p1, 0x5

    if-ne p0, p1, :cond_9

    const-string p0, "dimension"

    return-object p0

    :cond_9
    const/4 p1, 0x6

    if-ne p0, p1, :cond_a

    const-string p0, "fraction"

    return-object p0

    :cond_a
    const/4 p1, 0x4

    if-eq p0, p1, :cond_c

    const/16 p1, 0x10

    if-eq p0, p1, :cond_c

    const/16 p1, 0x11

    if-ne p0, p1, :cond_b

    goto :goto_1

    :cond_b
    :goto_0
    const-string p0, "unparsed"

    return-object p0

    :cond_c
    :goto_1
    const-string p0, "number"

    return-object p0

    :cond_d
    :goto_2
    const-string p0, "attribute"

    return-object p0

    :cond_e
    :goto_3
    const-string p0, "reference"

    return-object p0
.end method

.method public static ֫(Ljava/lang/Iterable;)Ljava/util/ArrayList;
    .locals 2

    .line 582
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 583
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜ᩻ܽ;

    .line 584
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 586
    :cond_0
    new-instance p0, Ll/ۖܽۜ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static bridge synthetic ֫(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۡᩳۜ;->֫(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/ۡᩳܽ;)Ljava/util/HashMap;
    .locals 8

    .line 345
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 346
    iget-object v1, p0, Ll/ۡᩳۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘᩳۜ;

    .line 348
    invoke-virtual {v2}, Ll/ۘᩳۜ;->֫()Z

    move-result v3

    iget-object v4, v2, Ll/ۘᩳۜ;->ۢ:Ljava/lang/String;

    iget v5, v2, Ll/ۘᩳۜ;->ܳ:I

    if-eqz v3, :cond_0

    goto :goto_0

    .line 349
    :cond_0
    invoke-static {p1, v5, v4}, Ll/ۡᩳۜ;->ۧ(Ll/ۢ᩻ܽ;ILjava/lang/String;)Ll/ۜ᩻ܽ;

    move-result-object v3

    if-eqz v3, :cond_1

    const v6, 0xffff

    and-int/2addr v6, v5

    .line 350
    invoke-interface {v3, v6}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 354
    invoke-static {v5, v4}, Ll/ۡᩳۜ;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v2, v2, Ll/ۘᩳۜ;->ܽ:[B

    .line 355
    invoke-static {v3, v6, v2}, Ll/᩻ܽۜ;->֫(Ll/ۜ᩻ܽ;I[B)Ll/ᩳܽۜ;

    move-result-object v2

    .line 354
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const-string p1, "RESOURCE_PATCH_CORRUPT"

    const-string v0, "Resource patch target is missing from base resources.arsc."

    .line 351
    invoke-static {p1, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_2
    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ܳܳܽ;Ll/ۜ᩻ܽ;I)Ll/֡ܽۜ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۡᩳۜ;->ۧ(Ll/ܳܳܽ;Ll/ۜ᩻ܽ;I)Ll/֡ܽۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۘ᩻ܽ;I)Ll/֡᩻ܽ;
    .locals 2

    .line 656
    invoke-interface {p0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩻ܽ;

    .line 657
    invoke-interface {v0}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v1

    if-ne v1, p1, :cond_0

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(ILl/ۢ᩻ܽ;)Ll/ۘ᩻ܽ;
    .locals 2

    .line 643
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    .line 644
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    if-ne v1, p0, :cond_0

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۢ᩻ܽ;ILjava/lang/String;)Ll/ۜ᩻ܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۡᩳۜ;->ۧ(Ll/ۢ᩻ܽ;ILjava/lang/String;)Ll/ۜ᩻ܽ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩵ᩳۜ;)Ll/ۡᩳۜ;
    .locals 1

    .line 97
    new-instance v0, Ll/ۡᩳۜ;

    invoke-direct {v0, p0}, Ll/ۡᩳۜ;-><init>(Ll/᩵ᩳۜ;)V

    .line 338
    invoke-direct {v0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    return-object v0
.end method

.method public static ֫(Ll/᩵ᩳۜ;Ljava/util/ArrayList;)Ll/ۡᩳۜ;
    .locals 1

    .line 108
    new-instance v0, Ll/ۡᩳۜ;

    invoke-direct {v0, p0, p1}, Ll/ۡᩳۜ;-><init>(Ll/᩵ᩳۜ;Ljava/util/ArrayList;)V

    .line 338
    invoke-direct {v0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    return-object v0
.end method

.method public static ֫(Ll/ᩴܽۜ;Ll/֨᩻ܽ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/HashMap;Ll/᩶ᩳۜ;)Ll/ۧᩳۜ;
    .locals 19

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v7, p8

    move-object/from16 v15, p9

    .line 1458
    iget-object v1, v6, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    move/from16 v2, p5

    .line 1459
    invoke-static {v1, v0, v2}, Ll/ۡᩳۜ;->֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;I)Ll/᩵ܽۜ;

    move-result-object v8

    iget-object v1, v8, Ll/᩵ܽۜ;->֫:Ljava/lang/String;

    move-object/from16 v5, p7

    .line 1460
    invoke-static {v0, v8, v5}, Ll/ۡᩳۜ;->֫(Ll/֨᩻ܽ;Ll/᩵ܽۜ;Ljava/util/Set;)Ljava/lang/String;

    move-result-object v9

    const-string v2, "null_value"

    .line 1461
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2382
    new-instance v16, Ll/ۧᩳۜ;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object v4, v9

    move-object v9, v10

    move-object v10, v11

    move-object/from16 v11, v17

    move-object/from16 v15, p9

    invoke-direct/range {v0 .. v15}, Ll/ۧᩳۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܰܽۜ;Ljava/util/ArrayList;ZILl/᩶ᩳۜ;)V

    return-object v16

    :cond_0
    const-string v2, "unparsed"

    .line 1464
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1466
    new-instance v16, Ll/ۧᩳۜ;

    if-eqz v1, :cond_2

    .line 1491
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 219
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x12c

    invoke-static {v0, v2, v3, v1}, Ll/۠ۨ᩻;->֫(IIILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v7, 0x0

    .line 1467
    :goto_1
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object v4, v9

    move-object v9, v10

    move-object v10, v11

    move-object/from16 v11, v17

    move-object/from16 v15, p9

    invoke-direct/range {v0 .. v15}, Ll/ۧᩳۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܰܽۜ;Ljava/util/ArrayList;ZILl/᩶ᩳۜ;)V

    return-object v16

    .line 1470
    :cond_3
    iget-object v11, v8, Ll/᩵ܽۜ;->ᩳ:Ljava/lang/String;

    .line 1471
    invoke-static/range {p1 .. p1}, Ll/ۡᩳۜ;->֫(Ll/֨᩻ܽ;)I

    move-result v12

    if-nez v12, :cond_4

    const/4 v13, 0x0

    goto :goto_2

    .line 727
    :cond_4
    invoke-static {v12}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    :goto_2
    const-string v0, "file_path"

    .line 1473
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v8, Ll/᩵ܽۜ;->ۧ:Ljava/lang/String;

    move-object v14, v0

    goto :goto_3

    :cond_5
    const/4 v14, 0x0

    :goto_3
    const/4 v0, 0x1

    move/from16 v1, p6

    if-ne v1, v0, :cond_8

    if-eqz v12, :cond_8

    .line 727
    invoke-static {v12}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\n"

    move-object/from16 v4, p4

    .line 0
    invoke-static {v4, v0, v3}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v7, :cond_6

    .line 1658
    invoke-virtual {v7, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1659
    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰܽۜ;

    move-object v12, v0

    move-object/from16 p1, v13

    goto :goto_5

    .line 1677
    :cond_6
    :try_start_0
    new-instance v1, Ll/᩸ܽۜ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    move-object v10, v1

    move-object/from16 v1, p0

    move-object/from16 p1, v13

    move-object v13, v2

    move v2, v12

    move-object/from16 v4, p4

    move-object/from16 v5, p7

    :try_start_1
    invoke-direct/range {v0 .. v5}, Ll/᩸ܽۜ;-><init>(Ll/ᩴܽۜ;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    .line 1679
    new-instance v0, Ll/ۘܽۜ;

    invoke-direct {v0, v10}, Ll/ۘܽۜ;-><init>(Ll/᩸ܽۜ;)V

    invoke-static {v6, v12, v0}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;ILl/ۗܽۜ;)V

    .line 1680
    invoke-virtual {v10}, Ll/᩸ܽۜ;->֫()Ll/ܰܽۜ;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_0
    move-object/from16 p1, v13

    move-object v13, v2

    :catch_1
    const/4 v0, 0x0

    :goto_4
    if-eqz v7, :cond_7

    .line 1664
    invoke-virtual {v7, v13, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    move-object v12, v0

    goto :goto_5

    :cond_8
    move-object/from16 p1, v13

    const/4 v12, 0x0

    .line 1479
    :goto_5
    new-instance v16, Ll/ۧᩳۜ;

    const-string v0, "styled_text"

    .line 1480
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    iget-boolean v6, v8, Ll/᩵ܽۜ;->ܿ:Z

    if-nez v15, :cond_9

    const/4 v8, 0x0

    goto :goto_6

    .line 1481
    :cond_9
    iget-object v0, v15, Ll/᩶ᩳۜ;->ᩳ:Ljava/lang/String;

    move-object v8, v0

    :goto_6
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object v4, v9

    move-object v7, v11

    move-object v9, v14

    move-object/from16 v10, p1

    move-object v11, v12

    move-object v12, v13

    move/from16 v13, v17

    move/from16 v14, v18

    move-object/from16 v15, p9

    invoke-direct/range {v0 .. v15}, Ll/ۧᩳۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܰܽۜ;Ljava/util/ArrayList;ZILl/᩶ᩳۜ;)V

    return-object v16
.end method

.method public static bridge synthetic ֫(Ll/ᩴܽۜ;Ll/֨᩻ܽ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Ll/ۧᩳۜ;
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    .line 0
    invoke-static/range {v0 .. v9}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/֨᩻ܽ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/HashMap;Ll/᩶ᩳۜ;)Ll/ۧᩳۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;IIIILjava/util/Set;Ljava/util/HashMap;)Ll/ۧᩳۜ;
    .locals 31

    move-object/from16 v0, p2

    move/from16 v1, p4

    move/from16 v2, p5

    move-object/from16 v13, p0

    .line 1420
    iget-object v14, v13, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    .line 1421
    invoke-static/range {p1 .. p1}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v18

    .line 1422
    invoke-interface/range {p2 .. p2}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v15

    const/16 v17, 0x0

    if-nez v15, :cond_1

    if-ltz v1, :cond_0

    .line 1425
    invoke-static {v14, v0, v1}, Ll/ܰᩳۜ;->֫(Ll/ܳܳܽ;Ll/᩷᩻ܽ;I)Ll/᩶ᩳۜ;

    move-result-object v0

    move-object/from16 v30, v0

    goto :goto_0

    :cond_0
    move-object/from16 v30, v17

    .line 2382
    :goto_0
    new-instance v0, Ll/ۧᩳۜ;

    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-string v19, "null_value"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object v15, v0

    move-object/from16 v16, v17

    invoke-direct/range {v15 .. v30}, Ll/ۧᩳۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܰܽۜ;Ljava/util/ArrayList;ZILl/᩶ᩳۜ;)V

    return-object v0

    :cond_1
    if-ltz v1, :cond_2

    .line 1428
    invoke-static {v14, v0, v1}, Ll/ܰᩳۜ;->֫(Ll/ܳܳܽ;Ll/᩷᩻ܽ;I)Ll/᩶ᩳۜ;

    move-result-object v1

    move-object/from16 v30, v1

    goto :goto_1

    :cond_2
    move-object/from16 v30, v17

    .line 1429
    :goto_1
    invoke-static/range {p2 .. p2}, Ll/ۡᩳۜ;->ᩳ(Ll/᩷᩻ܽ;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    .line 1430
    invoke-interface {v0, v3}, Ll/᩷᩻ܽ;->getValue(I)Ll/֨᩻ܽ;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v4, v18

    move/from16 v5, p3

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, v30

    invoke-static/range {v0 .. v9}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/֨᩻ܽ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/HashMap;Ll/᩶ᩳۜ;)Ll/ۧᩳۜ;

    move-result-object v0

    return-object v0

    .line 1433
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1435
    invoke-interface/range {p2 .. p2}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v12, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ll/֨᩻ܽ;

    if-ge v12, v2, :cond_4

    .line 1437
    invoke-interface {v4}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v3

    move-object/from16 v11, p1

    invoke-static {v14, v11, v3}, Ll/ۡᩳۜ;->ۧ(Ll/ܳܳܽ;Ll/ۜ᩻ܽ;I)Ll/֡ܽۜ;

    move-result-object v3

    .line 1438
    iget-object v5, v3, Ll/֡ܽۜ;->֫:Ljava/lang/String;

    iget-object v6, v3, Ll/֡ܽۜ;->ۧ:Ljava/lang/String;

    const/16 v16, 0x0

    move-object/from16 v3, p0

    move-object/from16 v7, v18

    move/from16 v8, p3

    move/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move/from16 v17, v12

    move-object/from16 v12, v16

    invoke-static/range {v3 .. v12}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/֨᩻ܽ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/HashMap;Ll/᩶ᩳۜ;)Ll/ۧᩳۜ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    move/from16 v17, v12

    :goto_3
    add-int/lit8 v12, v17, 0x1

    goto :goto_2

    :cond_5
    if-le v15, v2, :cond_6

    const/4 v0, 0x1

    const/16 v28, 0x1

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    const/16 v28, 0x0

    .line 2393
    :goto_4
    new-instance v0, Ll/ۧᩳۜ;

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v19, "item_list"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move v2, v15

    move-object v15, v0

    move-object/from16 v27, v1

    move/from16 v29, v2

    invoke-direct/range {v15 .. v30}, Ll/ۧᩳۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܰܽۜ;Ljava/util/ArrayList;ZILl/᩶ᩳۜ;)V

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;)Ll/᩵ܽۜ;
    .locals 1

    const/16 v0, 0x12c

    .line 0
    invoke-static {p0, p1, v0}, Ll/ۡᩳۜ;->֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;I)Ll/᩵ܽۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;I)Ll/᩵ܽۜ;
    .locals 9

    .line 1540
    :try_start_0
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۖ()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1541
    invoke-interface {p1}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object p0

    .line 1542
    invoke-interface {p0}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object p1

    .line 1543
    invoke-interface {p0}, Ll/ۗ᩻ܽ;->᩺֫()Z

    move-result p0

    move v8, p0

    goto :goto_0

    .line 1545
    :cond_0
    invoke-static {p0, p1}, Ll/ۢܳܽ;->֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;)Ljava/lang/CharSequence;

    move-result-object p1

    .line 1546
    instance-of p0, p1, Ll/ۗ᩻ܽ;

    if-eqz p0, :cond_1

    check-cast p1, Ll/ۗ᩻ܽ;

    .line 1547
    invoke-interface {p1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object p0

    .line 1548
    invoke-interface {p1}, Ll/ۗ᩻ܽ;->᩺֫()Z

    move-result p1

    move v8, p1

    move-object p1, p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    const/4 v8, 0x0

    .line 1551
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/۠ۨ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-gtz p2, :cond_2

    .line 1553
    new-instance p0, Ll/᩵ܽۜ;

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v3, p0

    move-object v4, v6

    invoke-direct/range {v3 .. v8}, Ll/᩵ܽۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object p0

    .line 212
    :cond_2
    invoke-static {v2, p2, v6}, Ll/۠ۨ᩻;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 1556
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {v4, v2, p0}, Ljava/lang/String;->codePointCount(II)I

    move-result p0

    .line 1557
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v6, v2, p1}, Ljava/lang/String;->codePointCount(II)I

    move-result p1

    if-ge p0, p1, :cond_3

    const/4 p0, 0x1

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 p0, 0x0

    const/4 v7, 0x0

    .line 1558
    :goto_1
    new-instance p0, Ll/᩵ܽۜ;

    const/4 v5, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Ll/᩵ܽۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 1560
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    const-string p0, "Failed to format resource value"

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    :goto_2
    move-object v2, p0

    .line 1561
    new-instance p0, Ll/᩵ܽۜ;

    const/4 v5, 0x0

    const/4 v3, 0x0

    const-string v1, ""

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/᩵ܽۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Ll/᩷᩻ܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۡᩳۜ;->ۧ(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Ll/᩷᩻ܽ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩴܽۜ;ILl/ۗܽۜ;)V
    .locals 3

    .line 364
    iget-object v0, p0, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    invoke-virtual {v0}, Ll/ܳܳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    ushr-int/lit8 v1, p1, 0x18

    and-int/lit16 v1, v1, 0xff

    .line 365
    invoke-static {v1, v0}, Ll/ۡᩳۜ;->֫(ILl/ۢ᩻ܽ;)Ll/ۘ᩻ܽ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    ushr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 369
    invoke-static {v0, v1}, Ll/ۡᩳۜ;->֫(Ll/ۘ᩻ܽ;I)Ll/֡᩻ܽ;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const v1, 0xffff

    and-int/2addr p1, v1

    .line 374
    invoke-interface {v0}, Ll/֡᩻ܽ;->ܽۧ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜ᩻ܽ;

    .line 375
    invoke-interface {v1, p1}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    .line 378
    :cond_3
    invoke-interface {v1, p1}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 380
    invoke-static {p0, v1, v2}, Ll/ۡᩳۜ;->ۧ(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Ll/᩷᩻ܽ;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Ll/ۗܽۜ;->֫(Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public static ֫(Ll/ᩴܽۜ;Ll/ۤܽۜ;)V
    .locals 10

    .line 389
    iget-object v0, p0, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    invoke-virtual {v0}, Ll/ܳܳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    .line 390
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 391
    invoke-interface {v0}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ᩻ܽ;

    .line 392
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v3

    .line 393
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 396
    :cond_1
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 397
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡᩻ܽ;

    .line 398
    invoke-interface {v4}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v5

    .line 399
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    .line 414
    :cond_3
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 415
    invoke-interface {v4}, Ll/֡᩻ܽ;->ܽۧ()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۜ᩻ܽ;

    .line 416
    invoke-interface {v6}, Ll/ۜ᩻ܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷᩻ܽ;

    .line 417
    invoke-interface {v8}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v9

    .line 418
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_2

    .line 421
    :cond_6
    invoke-static {p0, v6, v8}, Ll/ۡᩳۜ;->ۧ(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Ll/᩷᩻ܽ;

    move-result-object v8

    invoke-static {v8}, Ll/ۡᩳۜ;->ܿ(Ll/᩷᩻ܽ;)Ll/۬ܽۜ;

    move-result-object v8

    invoke-interface {p1, v8}, Ll/ۤܽۜ;->֫(Ll/۬ܽۜ;)Z

    move-result v8

    if-eqz v8, :cond_5

    :cond_7
    return-void
.end method

.method public static ֫(Ll/ᩴܽۜ;Ll/۬ܽۜ;Ll/۫ܽۜ;Ll/ۙܽۜ;)V
    .locals 3

    .line 537
    iget-object v0, p0, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    invoke-virtual {v0}, Ll/ܳܳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    .line 538
    iget v1, p1, Ll/۬ܽۜ;->ܽ:I

    iget v2, p1, Ll/۬ܽۜ;->֫:I

    invoke-static {v1, v0}, Ll/ۡᩳۜ;->֫(ILl/ۢ᩻ܽ;)Ll/ۘ᩻ܽ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 542
    :cond_0
    iget p1, p1, Ll/۬ܽۜ;->᩻:I

    invoke-static {v0, p1}, Ll/ۡᩳۜ;->֫(Ll/ۘ᩻ܽ;I)Ll/֡᩻ܽ;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    if-nez p3, :cond_2

    .line 547
    invoke-interface {p1}, Ll/֡᩻ܽ;->ܽۧ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Ll/ۡᩳۜ;->֫(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p3, p1}, Ll/ۙܽۜ;->֫(Ll/֡᩻ܽ;)Ljava/util/ArrayList;

    move-result-object p1

    .line 548
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۜ᩻ܽ;

    .line 549
    invoke-interface {p3, v2}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 552
    :cond_4
    invoke-interface {p3, v2}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_1

    .line 556
    :cond_5
    invoke-static {p0, p3, v0}, Ll/ۡᩳۜ;->ۧ(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Ll/᩷᩻ܽ;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Ll/۫ܽۜ;->֫(Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Z

    move-result p3

    if-eqz p3, :cond_3

    :cond_6
    :goto_2
    return-void
.end method

.method public static ֫(ILjava/lang/String;)Z
    .locals 4

    .line 797
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 800
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x1

    if-ge v0, v1, :cond_4

    if-nez v0, :cond_1

    const/16 v1, 0x30

    goto :goto_1

    :cond_1
    if-ne v0, v3, :cond_2

    const/16 v1, 0x78

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v0, -0x2

    mul-int/lit8 v1, v1, 0x4

    rsub-int/lit8 v1, v1, 0x1c

    ushr-int v1, p0, v1

    and-int/lit8 v1, v1, 0xf

    .line 807
    sget-object v3, Ll/ۡᩳۜ;->ܳ:[C

    aget-char v1, v3, v1

    .line 809
    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v1, :cond_3

    .line 810
    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v1

    if-eq v3, v1, :cond_3

    :goto_2
    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return v3
.end method

.method public static ֫(Ll/ۡᩳۜ;Ll/֫ᩳۜ;ILl/᩻ۜۜ;ZLl/ᩴܽۜ;Ll/ۧܿۜ;Ljava/lang/String;Ljava/util/HashSet;Ll/ۙܽۜ;ILjava/util/ArrayList;ILl/۬ܽۜ;)Z
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v7, p6

    move-object/from16 v4, p7

    move-object/from16 v8, p13

    .line 5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    iget v1, v0, Ll/֫ᩳۜ;->֫:I

    add-int/lit8 v12, v1, 0x1

    iput v12, v0, Ll/֫ᩳۜ;->֫:I

    const/4 v13, 0x0

    move/from16 v2, p2

    if-ge v1, v2, :cond_0

    goto/16 :goto_3

    :cond_0
    move-object/from16 v3, p3

    .line 695
    iget-object v1, v3, Ll/᩻ۜۜ;->ܺ:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v8, v1}, Ll/۬ܽۜ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_1
    if-eqz p4, :cond_2

    .line 517
    new-instance v9, Ll/ᩳᩳۜ;

    move-object v1, v9

    move-object/from16 v2, p5

    move-object/from16 v3, p3

    move-object/from16 v4, p7

    move-object/from16 v5, p13

    move-object/from16 v6, p8

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v7}, Ll/ᩳᩳۜ;-><init>(Ll/ᩴܽۜ;Ll/᩻ۜۜ;Ljava/lang/String;Ll/۬ܽۜ;Ljava/util/HashSet;Ll/ۧܿۜ;)V

    .line 519
    new-instance v1, Ll/ܺܽۜ;

    invoke-direct {v1, v9}, Ll/ܺܽۜ;-><init>(Ll/ᩳᩳۜ;)V

    move-object/from16 v3, p9

    invoke-static {v2, v8, v1, v3}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/۬ܽۜ;Ll/۫ܽۜ;Ll/ۙܽۜ;)V

    .line 520
    iget-object v1, v9, Ll/ᩳᩳۜ;->ܿ:Ll/᩻᩷ۜ;

    goto/16 :goto_2

    :cond_2
    const-string v1, "resource_table_id"

    .line 491
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_4

    .line 669
    iget v2, v8, Ll/۬ܽۜ;->ܿ:I

    move/from16 v3, p10

    if-eq v2, v3, :cond_3

    move-object v5, v9

    goto :goto_0

    .line 727
    :cond_3
    invoke-static {v2}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object v2

    .line 673
    new-instance v3, Ll/֫ܿۜ;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    invoke-direct {v3, v1, v13, v5, v2}, Ll/֫ܿۜ;-><init>(Ljava/lang/String;IILjava/lang/CharSequence;)V

    move-object v5, v3

    :goto_0
    if-eqz v5, :cond_6

    .line 719
    new-instance v14, Ll/᩻᩷ۜ;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v2, "resource"

    const-string v6, "id"

    const/4 v7, 0x0

    const/4 v15, 0x0

    move-object v1, v14

    move-object/from16 v3, p7

    move-object v4, v6

    move-object v6, v7

    move-object/from16 v7, p13

    move-object v8, v9

    move-object v9, v15

    invoke-direct/range {v1 .. v11}, Ll/᩻᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֫ܿۜ;Ljava/lang/String;Ll/۬ܽۜ;Ll/ܽᩳۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    const-string v1, "resource_table_name"

    .line 496
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 683
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v8, Ll/۬ܽۜ;->ܳ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v8, Ll/۬ܽۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "resource_table_type_name"

    invoke-virtual {v7, v2, v5}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v2

    if-eqz v2, :cond_5

    move-object v5, v2

    goto :goto_1

    .line 688
    :cond_5
    invoke-virtual {v7, v3, v1}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/֫ܿۜ;

    move-result-object v1

    move-object v5, v1

    :goto_1
    if-eqz v5, :cond_6

    .line 719
    new-instance v14, Ll/᩻᩷ۜ;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v2, "resource"

    const-string v6, "name"

    const/4 v7, 0x0

    const/4 v15, 0x0

    move-object v1, v14

    move-object/from16 v3, p7

    move-object v4, v6

    move-object v6, v7

    move-object/from16 v7, p13

    move-object v8, v9

    move-object v9, v15

    invoke-direct/range {v1 .. v11}, Ll/᩻᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֫ܿۜ;Ljava/lang/String;Ll/۬ܽۜ;Ll/ܽᩳۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    move-object v1, v9

    :goto_2
    if-eqz v1, :cond_7

    move-object/from16 v2, p11

    .line 233
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    invoke-virtual/range {p11 .. p11}, Ljava/util/ArrayList;->size()I

    move-result v1

    move/from16 v2, p12

    if-lt v1, v2, :cond_7

    const/4 v1, 0x1

    .line 235
    iput-boolean v1, v0, Ll/֫ᩳۜ;->ۧ:Z

    .line 236
    iput v12, v0, Ll/֫ᩳۜ;->ܽ:I

    return v1

    :cond_7
    :goto_3
    return v13
.end method

.method public static bridge synthetic ֫(Ll/᩷᩻ܽ;)Z
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۡᩳۜ;->ᩳ(Ll/᩷᩻ܽ;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۧ(ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۡᩳۜ;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 747
    invoke-static {p0, p1}, Ll/ۡᩳۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    .line 727
    invoke-static {p0}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ܳܳܽ;Ll/ۜ᩻ܽ;I)Ll/֡ܽۜ;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne p2, v2, :cond_0

    .line 1585
    new-instance p0, Ll/֡ܽۜ;

    invoke-direct {p0, v1, v0}, Ll/֡ܽۜ;-><init>(Ljava/lang/String;I)V

    return-object p0

    :cond_0
    const-string v3, "style"

    if-ne p2, v2, :cond_1

    goto :goto_0

    .line 1606
    :cond_1
    invoke-interface {p1}, Ll/ۜ᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v2

    invoke-interface {v2}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۖᩳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, p2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x0

    .line 1614
    :goto_1
    invoke-interface {p1}, Ll/ۜ᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v4

    invoke-interface {v4}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۖᩳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "plurals"

    .line 1615
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const v3, 0x1000004

    sub-int v3, p2, v3

    if-ltz v3, :cond_4

    const/4 v4, 0x6

    if-ge v3, v4, :cond_4

    .line 1618
    sget-object p0, Ll/֨᩻ܽ;->ܳ:[Ljava/lang/String;

    aget-object v1, p0, v3

    goto :goto_4

    .line 1620
    :cond_3
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1621
    invoke-virtual {p0}, Ll/ܳܳܽ;->ۧ()Ll/ܿᩳܽ;

    move-result-object v3

    invoke-virtual {v3, p2}, Ll/ܿᩳܽ;->ۧ(I)Ll/ܽᩳܽ;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 1623
    iget v0, v3, Ll/ܽᩳܽ;->֫:I

    ushr-int/lit8 v0, v0, 0x18

    and-int/lit16 v0, v0, 0xff

    .line 1624
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ll/ۜ᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result p1

    invoke-virtual {p0, p1, v0}, Ll/ܳܳܽ;->֫(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, v3, Ll/ܽᩳܽ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    .line 1628
    :cond_4
    invoke-interface {p1}, Ll/ۜ᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Ll/ܳܳܽ;->ۧ(II)Ljava/lang/String;

    move-result-object p0

    .line 1636
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v3, 0x8

    if-eq p1, v3, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    if-ge v0, v3, :cond_7

    mul-int/lit8 p1, v0, 0x4

    rsub-int/lit8 p1, p1, 0x1c

    ushr-int p1, p2, p1

    and-int/lit8 p1, p1, 0xf

    .line 1640
    sget-object v4, Ll/ۡᩳۜ;->ܳ:[C

    aget-char p1, v4, p1

    .line 1641
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v4, p1, :cond_6

    :goto_3
    move-object v1, p0

    goto :goto_4

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1589
    :cond_7
    :goto_4
    new-instance p0, Ll/֡ܽۜ;

    if-nez v1, :cond_8

    .line 727
    invoke-static {p2}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object v1

    .line 1589
    :cond_8
    invoke-direct {p0, v1, v2}, Ll/֡ܽۜ;-><init>(Ljava/lang/String;I)V

    return-object p0
.end method

.method public static ۧ(Ll/ۢ᩻ܽ;ILjava/lang/String;)Ll/ۜ᩻ܽ;
    .locals 2

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    .line 607
    invoke-static {v0, p0}, Ll/ۡᩳۜ;->֫(ILl/ۢ᩻ܽ;)Ll/ۘ᩻ܽ;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    ushr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 611
    invoke-static {p0, v0}, Ll/ۡᩳۜ;->֫(Ll/ۘ᩻ܽ;I)Ll/֡᩻ܽ;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const v0, 0xffff

    and-int/2addr p1, v0

    .line 616
    invoke-interface {p0}, Ll/֡᩻ܽ;->ܽۧ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜ᩻ܽ;

    .line 617
    invoke-static {v0}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0, p1}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩷᩻ܽ;)Ll/۬ܽۜ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۡᩳۜ;->ܿ(Ll/᩷᩻ܽ;)Ll/۬ܽۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Ll/᩷᩻ܽ;
    .locals 1

    .line 594
    iget-object v0, p0, Ll/ᩴܽۜ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 597
    :cond_0
    iget-object p0, p0, Ll/ᩴܽۜ;->ܽ:Ljava/util/HashMap;

    invoke-interface {p2}, Ll/᩷᩻ܽ;->ۧ֫()I

    move-result v0

    invoke-static {p1}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۡᩳۜ;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷᩻ܽ;

    if-nez p0, :cond_1

    :goto_0
    return-object p2

    :cond_1
    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 754
    invoke-static {p0}, Ll/ۡᩳۜ;->֫(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    const-string v0, "Invalid "

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 822
    :cond_0
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    :goto_0
    const-string v1, "0x00000000..0xffffffff"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 823
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "0x7f010000"

    invoke-virtual {v2, p1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 821
    invoke-static {v0, p1, p0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 756
    throw p0

    :cond_1
    long-to-int p0, v0

    return p0
.end method

.method public static ܽ(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 602
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 727
    invoke-static {p0}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object p0

    .line 602
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0xa

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/᩷᩻ܽ;)Ljava/lang/String;
    .locals 1

    .line 1409
    invoke-interface {p0}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, Ll/ۡᩳۜ;->ᩳ(Ll/᩷᩻ܽ;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, "item_list"

    return-object p0

    :cond_0
    const-string p0, "single_value"

    return-object p0
.end method

.method public static ܿ(Ll/᩷᩻ܽ;)Ll/۬ܽۜ;
    .locals 8

    .line 477
    invoke-interface {p0}, Ll/᩷᩻ܽ;->ۧ֫()I

    move-result v2

    .line 478
    invoke-interface {p0}, Ll/᩷᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    .line 479
    invoke-interface {p0}, Ll/᩷᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v1

    .line 480
    new-instance v7, Ll/۬ܽۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v3

    .line 481
    invoke-interface {v1}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v5

    invoke-interface {p0}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result p0

    move-object v0, v7

    move-object v1, v4

    move v4, v5

    move v5, p0

    invoke-direct/range {v0 .. v6}, Ll/۬ܽۜ;-><init>(Ljava/lang/String;IIIILjava/lang/String;)V

    return-object v7
.end method

.method private ܿ()Ll/ᩴܽۜ;
    .locals 5

    .line 311
    iget-object v0, p0, Ll/ۡᩳۜ;->ܽ:Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    .line 312
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴܽۜ;

    if-eqz v0, :cond_0

    return-object v0

    .line 317
    :cond_0
    iget-object v0, p0, Ll/ۡᩳۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 318
    :try_start_0
    iget-object v1, p0, Ll/ۡᩳۜ;->ܽ:Ljava/lang/ref/SoftReference;

    if-eqz v1, :cond_1

    .line 319
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴܽۜ;

    if-eqz v1, :cond_1

    .line 321
    monitor-exit v0

    return-object v1

    .line 324
    :cond_1
    iget-object v1, p0, Ll/ۡᩳۜ;->ܿ:Ll/᩵ᩳۜ;

    invoke-virtual {v1}, Ll/᩵ᩳۜ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v1

    .line 325
    iget-object v2, p0, Ll/ۡᩳۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v1

    goto :goto_0

    .line 326
    :cond_2
    new-instance v2, Ll/۠ᩳۜ;

    iget-object v3, p0, Ll/ۡᩳۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v2, v1, v3}, Ll/۠ᩳۜ;-><init>(Ll/ۢ᩻ܽ;Ljava/util/ArrayList;)V

    .line 327
    :goto_0
    new-instance v3, Ll/ܳܳܽ;

    invoke-direct {v3, v2}, Ll/ܳܳܽ;-><init>(Ll/ۢ᩻ܽ;)V

    .line 328
    new-instance v4, Ll/ᩴܽۜ;

    invoke-direct {p0, v2}, Ll/ۡᩳۜ;->֫(Ll/ۡᩳܽ;)Ljava/util/HashMap;

    move-result-object v2

    invoke-direct {v4, v3, v2, v1}, Ll/ᩴܽۜ;-><init>(Ll/ܳܳܽ;Ljava/util/HashMap;Ll/᩺᩻ܽ;)V

    .line 329
    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, v4}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Ll/ۡᩳۜ;->ܽ:Ljava/lang/ref/SoftReference;

    .line 330
    monitor-exit v0

    return-object v4

    :catchall_0
    move-exception v1

    .line 331
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ᩳ(Ll/᩷᩻ܽ;)Z
    .locals 3

    .line 1401
    invoke-interface {p0}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 1402
    invoke-interface {p0, v1}, Ll/᩷᩻ܽ;->getValue(I)Ll/֨᩻ܽ;

    move-result-object p0

    invoke-interface {p0}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    return v2

    :cond_0
    return v1
.end method


# virtual methods
.method public final ֫(IILjava/lang/String;Ljava/util/HashSet;)Ll/ۛܽۜ;
    .locals 8

    .line 118
    invoke-direct {p0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    move-result-object v0

    .line 119
    new-instance v1, Ll/ۨܽۜ;

    invoke-direct {v1, p3, p1, p2}, Ll/ۨܽۜ;-><init>(Ljava/lang/String;II)V

    .line 120
    new-instance p1, Ll/ۜܽۜ;

    invoke-direct {p1, v1}, Ll/ۜܽۜ;-><init>(Ll/ۨܽۜ;)V

    invoke-static {v0, p1}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/ۤܽۜ;)V

    .line 1219
    iget-object p1, v1, Ll/ۨܽۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    iget p3, v1, Ll/ۨܽۜ;->ܽ:I

    add-int v6, p2, p3

    .line 1220
    new-instance p2, Ll/ۛܽۜ;

    iget v4, v1, Ll/ۨܽۜ;->ܿ:I

    iget v5, v1, Ll/ۨܽۜ;->ܳ:I

    const/4 p3, 0x1

    if-ge v6, v5, :cond_0

    const/4 v1, 0x1

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v7, 0x0

    :goto_0
    move-object v2, p2

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Ll/ۛܽۜ;-><init>(Ljava/util/ArrayList;IIIZ)V

    .line 122
    new-instance v1, Ll/ۙܽۜ;

    invoke-direct {v1}, Ll/ۙܽۜ;-><init>()V

    .line 123
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬ܽۜ;

    .line 568
    new-instance v3, Ll/᩷ᩳۜ;

    invoke-direct {v3}, Ll/᩷ᩳۜ;-><init>()V

    .line 569
    new-instance v4, Ll/ۢܽۜ;

    invoke-direct {v4, v3, v0, p4}, Ll/ۢܽۜ;-><init>(Ll/᩷ᩳۜ;Ll/ᩴܽۜ;Ljava/util/HashSet;)V

    invoke-static {v0, v2, v4, v1}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/۬ܽۜ;Ll/۫ܽۜ;Ll/ۙܽۜ;)V

    .line 573
    invoke-virtual {v3}, Ll/᩷ᩳۜ;->֫()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    iput v4, v2, Ll/۬ܽۜ;->᩷:I

    .line 1934
    iget-object v4, v3, Ll/᩷ᩳۜ;->ۧ:Ljava/util/LinkedHashSet;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-le v5, p3, :cond_1

    const-string v4, "mixed"

    goto :goto_2

    :cond_1
    const-string v5, "item_list"

    .line 1937
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v4, v5

    goto :goto_2

    :cond_2
    const-string v4, "single_value"

    .line 574
    :goto_2
    iput-object v4, v2, Ll/۬ܽۜ;->ۜ:Ljava/lang/String;

    .line 1946
    iget-object v3, v3, Ll/᩷ᩳۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_3
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۧᩳۜ;

    const-string v6, "default"

    .line 1947
    iget-object v7, v5, Ll/ۧᩳۜ;->֨:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v4, v5

    goto :goto_4

    :cond_4
    if-eqz v4, :cond_5

    .line 1950
    iget-object v6, v5, Ll/ۧᩳۜ;->֨:Ljava/lang/String;

    iget-object v7, v4, Ll/ۧᩳۜ;->֨:Ljava/lang/String;

    invoke-static {v6, v7}, Ll/ۡᩳۜ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    if-gez v6, :cond_3

    :cond_5
    move-object v4, v5

    goto :goto_3

    .line 575
    :cond_6
    :goto_4
    iput-object v4, v2, Ll/۬ܽۜ;->ᩳ:Ll/ۧᩳۜ;

    goto :goto_1

    :cond_7
    return-object p2
.end method

.method public final ֫(Ljava/lang/String;IIILjava/util/HashSet;)Ll/ۜᩳۜ;
    .locals 31

    move/from16 v0, p2

    .line 251
    invoke-direct/range {p0 .. p0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    move-result-object v1

    const-string v2, "locator"

    move-object/from16 v11, p1

    .line 252
    invoke-static {v11, v2}, Ll/ۡᩳۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 253
    new-instance v12, Ll/ۙܽۜ;

    invoke-direct {v12}, Ll/ۙܽۜ;-><init>()V

    .line 1252
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1265
    iget-object v14, v1, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    .line 433
    invoke-virtual {v14}, Ll/ܳܳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v3

    .line 434
    new-instance v15, Ljava/util/HashSet;

    invoke-direct {v15}, Ljava/util/HashSet;-><init>()V

    .line 435
    invoke-interface {v3}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v3, 0x0

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘ᩻ܽ;

    .line 436
    invoke-interface {v4}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v5

    .line 437
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v15, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    .line 440
    :cond_0
    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 441
    invoke-interface {v4}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ll/֡᩻ܽ;

    .line 442
    invoke-interface {v9}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v4

    .line 443
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    .line 458
    :cond_1
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 459
    invoke-interface {v9}, Ll/֡᩻ܽ;->ܽۧ()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_2
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ll/ۜ᩻ܽ;

    .line 460
    invoke-interface {v7}, Ll/ۜ᩻ܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    move v6, v3

    :goto_3
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷᩻ܽ;

    .line 461
    invoke-interface {v3}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v4

    .line 462
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v20, v6, 0x1

    if-ge v6, v0, :cond_4

    :cond_3
    move-object/from16 v23, v1

    move-object/from16 v29, v7

    move-object/from16 v30, v8

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    goto/16 :goto_10

    :cond_4
    if-ne v6, v0, :cond_5

    move/from16 v4, p3

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    .line 1285
    :goto_4
    new-instance v5, Ll/ܿᩳۜ;

    const/4 v0, 0x0

    .line 1286
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    move/from16 v4, p4

    invoke-direct {v5, v13, v0, v4}, Ll/ܿᩳۜ;-><init>(Ljava/util/ArrayList;II)V

    .line 1287
    new-instance v0, Ll/᩻ᩳۜ;

    invoke-direct {v0, v1, v7, v3}, Ll/᩻ᩳۜ;-><init>(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)V

    .line 1288
    invoke-interface {v3}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v3

    .line 1289
    invoke-virtual {v12, v9}, Ll/ۙܽۜ;->֫(Ll/֡᩻ܽ;)Ljava/util/ArrayList;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v21

    move-object v4, v11

    :goto_5
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_3

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v11, v22

    check-cast v11, Ll/ۜ᩻ܽ;

    .line 1290
    invoke-interface {v11, v3}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v22

    if-nez v22, :cond_6

    move/from16 v22, v6

    goto :goto_6

    :cond_6
    move/from16 v22, v6

    .line 1293
    invoke-interface {v11, v3}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v6

    if-nez v6, :cond_7

    :goto_6
    move-object/from16 v23, v1

    move/from16 v27, v3

    move-object v3, v5

    move-object/from16 v29, v7

    move-object/from16 v30, v8

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    goto/16 :goto_f

    .line 1297
    :cond_7
    invoke-static {v1, v11, v6}, Ll/ۡᩳۜ;->ۧ(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Ll/᩷᩻ܽ;

    move-result-object v6

    move-object/from16 v23, v1

    .line 1966
    invoke-interface {v6}, Ll/᩷᩻ܽ;->getParent()I

    move-result v1

    if-eqz v1, :cond_8

    if-ne v1, v2, :cond_8

    .line 1968
    invoke-virtual {v5, v0, v11, v4}, Ll/ܿᩳۜ;->֫(Ll/᩻ᩳۜ;Ll/ۜ᩻ܽ;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    move-object v3, v5

    goto/16 :goto_c

    .line 1409
    :cond_8
    invoke-interface {v6}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v1

    if-lez v1, :cond_9

    invoke-static {v6}, Ll/ۡᩳۜ;->ᩳ(Ll/᩷᩻ܽ;)Z

    move-result v1

    if-nez v1, :cond_9

    const/4 v1, 0x1

    goto :goto_7

    :cond_9
    const/4 v1, 0x0

    .line 1973
    :goto_7
    invoke-interface {v6}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v24

    move-object/from16 v25, v4

    :goto_8
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v26, v4

    check-cast v26, Ll/֨᩻ܽ;

    if-eqz v2, :cond_c

    if-eqz v1, :cond_c

    .line 1975
    invoke-interface/range {v26 .. v26}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v4

    const/4 v6, -0x1

    if-ne v4, v6, :cond_a

    move/from16 v27, v3

    goto :goto_9

    .line 1606
    :cond_a
    invoke-interface {v11}, Ll/ۜ᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v6

    invoke-interface {v6}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ۖᩳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move/from16 v27, v3

    const-string v3, "style"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_a

    :cond_b
    :goto_9
    const/4 v4, 0x0

    :goto_a
    if-ne v4, v2, :cond_d

    move-object v3, v5

    move-object v4, v14

    move-object v6, v5

    move-object v5, v0

    move-object/from16 v28, v6

    move-object v6, v11

    move-object/from16 v29, v7

    move-object/from16 v7, v26

    move-object/from16 v30, v8

    move-object/from16 v8, v25

    move-object/from16 v25, v9

    move-object/from16 v9, p5

    .line 1976
    invoke-virtual/range {v3 .. v9}, Ll/ܿᩳۜ;->֫(Ll/ܳܳܽ;Ll/᩻ᩳۜ;Ll/ۜ᩻ܽ;Ll/֨᩻ܽ;Ljava/lang/String;Ljava/util/HashSet;)Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_b

    :cond_c
    move/from16 v27, v3

    :cond_d
    move-object/from16 v28, v5

    move-object/from16 v29, v7

    move-object/from16 v30, v8

    move-object/from16 v25, v9

    :cond_e
    if-eqz v2, :cond_10

    .line 1980
    invoke-static/range {v26 .. v26}, Ll/ۡᩳۜ;->֫(Ll/֨᩻ܽ;)I

    move-result v3

    if-ne v3, v2, :cond_10

    move-object/from16 v3, v28

    move-object v4, v14

    move-object v5, v0

    move-object v6, v11

    move-object/from16 v7, v26

    move v8, v1

    move-object/from16 v9, p1

    move-object/from16 v26, v10

    move-object/from16 v10, p5

    .line 1981
    invoke-virtual/range {v3 .. v10}, Ll/ܿᩳۜ;->֫(Ll/ܳܳܽ;Ll/᩻ᩳۜ;Ll/ۜ᩻ܽ;Ll/֨᩻ܽ;ZLjava/lang/String;Ljava/util/HashSet;)Z

    move-result v3

    if-eqz v3, :cond_f

    :goto_b
    move-object/from16 v3, v28

    .line 1302
    :goto_c
    iget v0, v3, Ll/ܿᩳۜ;->ۧ:I

    const/4 v1, 0x1

    move/from16 v3, v20

    move/from16 v6, v22

    goto/16 :goto_11

    :cond_f
    :goto_d
    move-object/from16 v3, v28

    goto :goto_e

    :cond_10
    move-object/from16 v26, v10

    goto :goto_d

    :goto_e
    move-object v5, v3

    move-object/from16 v9, v25

    move-object/from16 v10, v26

    move/from16 v3, v27

    move-object/from16 v7, v29

    move-object/from16 v8, v30

    move-object/from16 v25, p1

    goto/16 :goto_8

    :cond_11
    move/from16 v27, v3

    move-object v3, v5

    move-object/from16 v29, v7

    move-object/from16 v30, v8

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    move-object/from16 v4, p1

    :goto_f
    move-object/from16 v11, p1

    move-object v5, v3

    move/from16 v6, v22

    move-object/from16 v1, v23

    move-object/from16 v9, v25

    move-object/from16 v10, v26

    move/from16 v3, v27

    move-object/from16 v7, v29

    move-object/from16 v8, v30

    goto/16 :goto_5

    :goto_10
    move-object/from16 v11, p1

    move/from16 v0, p2

    move/from16 v6, v20

    move-object/from16 v1, v23

    move-object/from16 v9, v25

    move-object/from16 v10, v26

    move-object/from16 v7, v29

    move-object/from16 v8, v30

    goto/16 :goto_3

    :cond_12
    move/from16 v22, v6

    move-object/from16 v11, p1

    move/from16 v0, p2

    move/from16 v3, v22

    goto/16 :goto_2

    :cond_13
    move-object/from16 v11, p1

    move/from16 v0, p2

    goto/16 :goto_1

    :cond_14
    move-object/from16 v11, p1

    move/from16 v0, p2

    goto/16 :goto_0

    :cond_15
    const/4 v6, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1313
    :goto_11
    new-instance v2, Ll/ۜᩳۜ;

    if-eqz v1, :cond_16

    move v3, v6

    :cond_16
    if-eqz v1, :cond_17

    goto :goto_12

    :cond_17
    const/4 v0, 0x0

    .line 1315
    :goto_12
    invoke-direct {v2, v3, v0, v13, v1}, Ll/ۜᩳۜ;-><init>(IILjava/util/ArrayList;Z)V

    return-object v2
.end method

.method public final ֫(Ll/᩻ۜۜ;Ljava/lang/String;ILjava/util/HashSet;I)Ll/۟ܽۜ;
    .locals 18

    move-object/from16 v4, p1

    move-object/from16 v8, p2

    move/from16 v3, p3

    .line 194
    iget-object v0, v4, Ll/᩻ۜۜ;->᩷:Ll/ܽܿۜ;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    if-gtz p5, :cond_0

    .line 196
    new-instance v0, Ll/۟ܽۜ;

    invoke-direct {v0, v14, v3, v1}, Ll/۟ܽۜ;-><init>(Ljava/util/ArrayList;IZ)V

    return-object v0

    :cond_0
    const-string v1, "resource_table_id"

    .line 199
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    const-string v1, "literal"

    .line 200
    iget-object v5, v0, Ll/ܽܿۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 201
    new-instance v0, Ll/۟ܽۜ;

    invoke-direct {v0, v14, v3, v2}, Ll/۟ܽۜ;-><init>(Ljava/util/ArrayList;IZ)V

    return-object v0

    .line 203
    :cond_1
    iget-object v1, v4, Ll/᩻ۜۜ;->ۡ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۡᩳۜ;->֫(Ljava/lang/String;)J

    move-result-wide v5

    const-wide/16 v9, 0x0

    cmp-long v1, v5, v9

    if-gez v1, :cond_2

    .line 205
    new-instance v0, Ll/۟ܽۜ;

    invoke-direct {v0, v14, v3, v2}, Ll/۟ܽۜ;-><init>(Ljava/util/ArrayList;IZ)V

    return-object v0

    :cond_2
    long-to-int v1, v5

    move v11, v1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    const/4 v11, 0x0

    .line 211
    :goto_0
    invoke-direct/range {p0 .. p0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    move-result-object v15

    .line 212
    invoke-virtual {v0}, Ll/ܽܿۜ;->֫()Ll/ۧܿۜ;

    move-result-object v7

    const-string v0, "resource_table_value"

    .line 213
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "resource_table_file_path"

    .line 214
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    const/4 v5, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v0, 0x1

    const/4 v5, 0x1

    :goto_2
    if-eqz v5, :cond_6

    .line 215
    new-instance v0, Ll/ۙܽۜ;

    invoke-direct {v0}, Ll/ۙܽۜ;-><init>()V

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    move-object v10, v0

    .line 216
    new-instance v13, Ll/֫ᩳۜ;

    .line 1235
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 217
    new-instance v12, Ll/ۡܽۜ;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object v2, v13

    move/from16 v3, p3

    move-object/from16 v4, p1

    move-object v6, v15

    move-object/from16 v8, p2

    move-object/from16 v9, p4

    move-object/from16 v16, v15

    move-object v15, v12

    move-object v12, v14

    move-object/from16 v17, v14

    move-object v14, v13

    move/from16 v13, p5

    invoke-direct/range {v0 .. v13}, Ll/ۡܽۜ;-><init>(Ll/ۡᩳۜ;Ll/֫ᩳۜ;ILl/᩻ۜۜ;ZLl/ᩴܽۜ;Ll/ۧܿۜ;Ljava/lang/String;Ljava/util/HashSet;Ll/ۙܽۜ;ILjava/util/ArrayList;I)V

    move-object/from16 v0, v16

    invoke-static {v0, v15}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/ۤܽۜ;)V

    .line 242
    new-instance v0, Ll/۟ܽۜ;

    iget-boolean v1, v14, Ll/֫ᩳۜ;->ۧ:Z

    if-eqz v1, :cond_7

    .line 243
    iget v2, v14, Ll/֫ᩳۜ;->ܽ:I

    goto :goto_4

    :cond_7
    iget v2, v14, Ll/֫ᩳۜ;->֫:I

    :goto_4
    move-object/from16 v3, v17

    invoke-direct {v0, v3, v2, v1}, Ll/۟ܽۜ;-><init>(Ljava/util/ArrayList;IZ)V

    return-object v0
.end method

.method public final ֫()Ll/۫ܽܽ;
    .locals 4

    .line 264
    iget-object v0, p0, Ll/ۡᩳۜ;->֫:Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    .line 265
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ܽܽ;

    if-eqz v0, :cond_0

    return-object v0

    .line 270
    :cond_0
    iget-object v0, p0, Ll/ۡᩳۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 271
    :try_start_0
    iget-object v1, p0, Ll/ۡᩳۜ;->֫:Ljava/lang/ref/SoftReference;

    if-eqz v1, :cond_1

    .line 272
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ܽܽ;

    if-eqz v1, :cond_1

    .line 274
    monitor-exit v0

    return-object v1

    .line 338
    :cond_1
    invoke-direct {p0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    .line 278
    new-instance v2, Ll/۫ܽܽ;

    invoke-virtual {v1}, Ll/ܳܳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v3

    invoke-virtual {v1}, Ll/ܳܳܽ;->ۧ()Ll/ܿᩳܽ;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ll/۫ܽܽ;-><init>(Ll/ۢ᩻ܽ;Ll/ܿᩳܽ;)V

    .line 279
    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Ll/ۡᩳۜ;->֫:Ljava/lang/ref/SoftReference;

    .line 280
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 281
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/util/ArrayList;)Ll/᩹ܽۜ;
    .locals 4

    .line 301
    invoke-direct {p0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    move-result-object v0

    .line 302
    new-instance v1, Ll/۠ᩳۜ;

    iget-object v2, v0, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    invoke-virtual {v2}, Ll/ܳܳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ll/۠ᩳۜ;-><init>(Ll/ۢ᩻ܽ;Ljava/util/ArrayList;)V

    .line 303
    new-instance p1, Ll/᩹ܽۜ;

    new-instance v2, Ll/ᩴܽۜ;

    new-instance v3, Ll/ܳܳܽ;

    invoke-direct {v3, v1}, Ll/ܳܳܽ;-><init>(Ll/ۢ᩻ܽ;)V

    iget-object v1, v0, Ll/ᩴܽۜ;->ܽ:Ljava/util/HashMap;

    iget-object v0, v0, Ll/ᩴܽۜ;->֫:Ll/᩺᩻ܽ;

    invoke-direct {v2, v3, v1, v0}, Ll/ᩴܽۜ;-><init>(Ll/ܳܳܽ;Ljava/util/HashMap;Ll/᩺᩻ܽ;)V

    invoke-direct {p1, v2}, Ll/᩹ܽۜ;-><init>(Ll/ᩴܽۜ;)V

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;IIIILjava/util/HashSet;)Ll/᩺ܽۜ;
    .locals 13

    .line 169
    invoke-direct {p0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    move-result-object v10

    const-string v0, "locator"

    move-object v1, p1

    .line 170
    invoke-static {p1, v0}, Ll/ۡᩳۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    .line 171
    new-instance v12, Ll/ܶܽۜ;

    const/4 v4, 0x1

    move-object v0, v12

    move-object v1, v10

    move v2, v11

    move-object v3, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Ll/ܶܽۜ;-><init>(Ll/ᩴܽۜ;ILjava/lang/String;IIIIILjava/util/HashSet;)V

    .line 173
    new-instance v0, Ll/᩷ܽۜ;

    invoke-direct {v0, v12}, Ll/᩷ܽۜ;-><init>(Ll/ܶܽۜ;)V

    invoke-static {v10, v11, v0}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;ILl/ۗܽۜ;)V

    .line 174
    iget-object v0, v12, Ll/ܶܽۜ;->ܽ:Ll/۬ܽۜ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 177
    :cond_0
    invoke-virtual {v12}, Ll/ܶܽۜ;->֫()Ljava/util/ArrayList;

    move-result-object v3

    .line 178
    iget-object v0, v12, Ll/ܶܽۜ;->ܽ:Ll/۬ܽۜ;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, v0, Ll/۬ܽۜ;->᩷:I

    move-object v0, p2

    .line 179
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 180
    new-instance v9, Ll/᩺ܽۜ;

    iget-object v2, v12, Ll/ܶܽۜ;->ܽ:Ll/۬ܽۜ;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v9

    move-object v8, p2

    invoke-direct/range {v1 .. v8}, Ll/᩺ܽۜ;-><init>(Ll/۬ܽۜ;Ljava/util/ArrayList;Ljava/util/ArrayList;IZILjava/lang/String;)V

    return-object v9

    .line 183
    :cond_1
    invoke-virtual {v12}, Ll/ܶܽۜ;->ۧ()V

    .line 184
    new-instance v9, Ll/᩺ܽۜ;

    iget-object v2, v12, Ll/ܶܽۜ;->ܽ:Ll/۬ܽۜ;

    iget-object v4, v12, Ll/ܶܽۜ;->ۖ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    iget v7, v12, Ll/ܶܽۜ;->ۢ:I

    move-object v1, v9

    move-object v8, p2

    invoke-direct/range {v1 .. v8}, Ll/᩺ܽۜ;-><init>(Ll/۬ܽۜ;Ljava/util/ArrayList;Ljava/util/ArrayList;IZILjava/lang/String;)V

    return-object v9
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/HashSet;)Ll/᩺ܽۜ;
    .locals 13

    .line 137
    invoke-direct {p0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    move-result-object v10

    const-string v0, "locator"

    .line 138
    invoke-static {p1, v0}, Ll/ۡᩳۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    .line 139
    new-instance v11, Ll/ܶܽۜ;

    const-string v12, "default"

    const/16 v4, 0x14

    const/16 v5, 0x1000

    const v6, 0x8000

    const/16 v7, 0x32

    const/4 v8, 0x0

    move-object v0, v11

    move-object v1, v10

    move v2, p1

    move-object v3, v12

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Ll/ܶܽۜ;-><init>(Ll/ᩴܽۜ;ILjava/lang/String;IIIIILjava/util/HashSet;)V

    .line 142
    new-instance p2, Ll/᩷ܽۜ;

    invoke-direct {p2, v11}, Ll/᩷ܽۜ;-><init>(Ll/ܶܽۜ;)V

    invoke-static {v10, p1, p2}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;ILl/ۗܽۜ;)V

    .line 143
    iget-object p1, v11, Ll/ܶܽۜ;->ܽ:Ll/۬ܽۜ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 146
    :cond_0
    invoke-virtual {v11}, Ll/ܶܽۜ;->֫()Ljava/util/ArrayList;

    move-result-object v2

    .line 147
    iget-object p1, v11, Ll/ܶܽۜ;->ܽ:Ll/۬ܽۜ;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p2

    iput p2, p1, Ll/۬ܽۜ;->᩷:I

    const-string p1, "*"

    .line 1869
    iget-object p2, v11, Ll/ܶܽۜ;->ܳ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 150
    :cond_1
    invoke-static {v12}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {v2}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object p2

    .line 151
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "default"

    const-string v3, "variant"

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Resource variant not found"

    .line 149
    invoke-static {v1, v3, p1, p2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 152
    iget-object p2, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v0, "availableVariants"

    invoke-static {v2}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 153
    throw p1

    .line 155
    :cond_2
    :goto_0
    invoke-virtual {v11}, Ll/ܶܽۜ;->ۧ()V

    .line 156
    iget-object v3, v11, Ll/ܶܽۜ;->ۖ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 157
    iget v6, v11, Ll/ܶܽۜ;->ۢ:I

    if-ge v4, v6, :cond_3

    const/4 p1, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    const/4 v5, 0x0

    .line 158
    :goto_1
    new-instance p1, Ll/᩺ܽۜ;

    iget-object v1, v11, Ll/ܶܽۜ;->ܽ:Ll/۬ܽۜ;

    move-object v0, p1

    move-object v7, v12

    invoke-direct/range {v0 .. v7}, Ll/᩺ܽۜ;-><init>(Ll/۬ܽۜ;Ljava/util/ArrayList;Ljava/util/ArrayList;IZILjava/lang/String;)V

    return-object p1
.end method

.method public final ۧ()Ll/᩹ܽۜ;
    .locals 2

    .line 295
    new-instance v0, Ll/᩹ܽۜ;

    invoke-direct {p0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩹ܽۜ;-><init>(Ll/ᩴܽۜ;)V

    return-object v0
.end method

.method public final ܽ()Ll/ܺᩳۜ;
    .locals 1

    .line 338
    invoke-direct {p0}, Ll/ۡᩳۜ;->ܿ()Ll/ᩴܽۜ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩴܽۜ;->ۧ:Ll/ܳܳܽ;

    .line 288
    invoke-static {v0}, Ll/ܰᩳۜ;->֫(Ll/ܳܳܽ;)Ll/ܺᩳۜ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/util/ArrayList;
    .locals 2

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۡᩳۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method
