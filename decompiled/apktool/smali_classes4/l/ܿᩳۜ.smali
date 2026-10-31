.class public final Ll/ܿᩳۜ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ֫:I

.field public ۧ:I

.field public final ܽ:Ljava/util/ArrayList;

.field public final ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;II)V
    .locals 0

    .line 2004
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2005
    iput-object p1, p0, Ll/ܿᩳۜ;->ܽ:Ljava/util/ArrayList;

    .line 2006
    iput p2, p0, Ll/ܿᩳۜ;->ܿ:I

    .line 2007
    iput p3, p0, Ll/ܿᩳۜ;->֫:I

    return-void
.end method

.method private ֫(ILl/ܳᩳۜ;)Z
    .locals 1

    .line 2067
    iget-object v0, p0, Ll/ܿᩳۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2068
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    iget v0, p0, Ll/ܿᩳۜ;->֫:I

    if-lt p2, v0, :cond_0

    const/4 p2, 0x1

    add-int/2addr p1, p2

    .line 2070
    iput p1, p0, Ll/ܿᩳۜ;->ۧ:I

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫(Ll/ܳܳܽ;Ll/᩻ᩳۜ;Ll/ۜ᩻ܽ;Ll/֨᩻ܽ;Ljava/lang/String;Ljava/util/HashSet;)Z
    .locals 9

    .line 2030
    iget v0, p0, Ll/ܿᩳۜ;->ᩳ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ܿᩳۜ;->ᩳ:I

    .line 2031
    iget v1, p0, Ll/ܿᩳۜ;->ܿ:I

    if-ge v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2034
    :cond_0
    invoke-static {p3}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v3

    .line 2035
    invoke-interface {p4}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v1

    invoke-static {p1, p3, v1}, Ll/ۡᩳۜ;->֫(Ll/ܳܳܽ;Ll/ۜ᩻ܽ;I)Ll/֡ܽۜ;

    move-result-object p3

    .line 2036
    invoke-static {p1, p4}, Ll/ۡᩳۜ;->֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;)Ll/᩵ܽۜ;

    move-result-object p1

    .line 2037
    invoke-static {p4, p1, p6}, Ll/ۡᩳۜ;->֫(Ll/֨᩻ܽ;Ll/᩵ܽۜ;Ljava/util/HashSet;)Ljava/lang/String;

    move-result-object v8

    .line 2038
    new-instance p1, Ll/ܳᩳۜ;

    invoke-virtual {p2}, Ll/᩻ᩳۜ;->֫()Ll/۬ܽۜ;

    move-result-object v2

    .line 2081
    iget-object p2, p3, Ll/֡ܽۜ;->֫:Ljava/lang/String;

    const-string p4, "item key="

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p6

    if-nez p6, :cond_2

    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_1

    goto :goto_0

    :cond_1
    const-string p6, " ("

    const-string v1, ")"

    .line 0
    invoke-static {p4, p2, p6, p5, v1}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 2082
    :cond_2
    :goto_0
    invoke-virtual {p4, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_1
    move-object v5, p2

    .line 2039
    iget-object v6, p3, Ll/֡ܽۜ;->֫:Ljava/lang/String;

    iget-object v7, p3, Ll/֡ܽۜ;->ۧ:Ljava/lang/String;

    const-string v4, "reference"

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Ll/ܳᩳۜ;-><init>(Ll/۬ܽۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2040
    invoke-direct {p0, v0, p1}, Ll/ܿᩳۜ;->֫(ILl/ܳᩳۜ;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ܳܳܽ;Ll/᩻ᩳۜ;Ll/ۜ᩻ܽ;Ll/֨᩻ܽ;ZLjava/lang/String;Ljava/util/HashSet;)Z
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    .line 2049
    iget v3, v0, Ll/ܿᩳۜ;->ᩳ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v0, Ll/ܿᩳۜ;->ᩳ:I

    .line 2050
    iget v4, v0, Ll/ܿᩳۜ;->ܿ:I

    const/4 v5, 0x0

    if-ge v3, v4, :cond_0

    return v5

    .line 2053
    :cond_0
    invoke-static/range {p3 .. p3}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v8

    const/4 v4, 0x0

    if-eqz p5, :cond_1

    .line 2054
    invoke-interface/range {p4 .. p4}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v6

    move-object/from16 v7, p3

    invoke-static {v1, v7, v6}, Ll/ۡᩳۜ;->֫(Ll/ܳܳܽ;Ll/ۜ᩻ܽ;I)Ll/֡ܽۜ;

    move-result-object v6

    goto :goto_0

    :cond_1
    new-instance v6, Ll/֡ܽۜ;

    invoke-direct {v6, v4, v5}, Ll/֡ܽۜ;-><init>(Ljava/lang/String;I)V

    .line 2055
    :goto_0
    invoke-static {v1, v2}, Ll/ۡᩳۜ;->֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;)Ll/᩵ܽۜ;

    move-result-object v1

    move-object/from16 v7, p7

    .line 2056
    invoke-static {v2, v1, v7}, Ll/ۡᩳۜ;->֫(Ll/֨᩻ܽ;Ll/᩵ܽۜ;Ljava/util/HashSet;)Ljava/lang/String;

    move-result-object v2

    .line 2057
    new-instance v14, Ll/ܳᩳۜ;

    invoke-virtual/range {p2 .. p2}, Ll/᩻ᩳۜ;->֫()Ll/۬ܽۜ;

    move-result-object v7

    .line 2091
    iget-object v9, v1, Ll/᩵ܽۜ;->֫:Ljava/lang/String;

    iget-object v1, v1, Ll/᩵ܽۜ;->ᩳ:Ljava/lang/String;

    if-nez v9, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_2

    .line 219
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v9

    const/16 v10, 0x12c

    invoke-static {v5, v9, v10, v1}, Ll/۠ۨ᩻;->֫(IIILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    move-object v10, v1

    goto :goto_1

    :cond_2
    move-object/from16 v10, p6

    :goto_1
    if-eqz p5, :cond_3

    .line 2058
    iget-object v1, v6, Ll/֡ܽۜ;->֫:Ljava/lang/String;

    move-object v11, v1

    goto :goto_2

    :cond_3
    move-object v11, v4

    :goto_2
    if-eqz p5, :cond_4

    .line 2059
    iget-object v1, v6, Ll/֡ܽۜ;->ۧ:Ljava/lang/String;

    move-object v12, v1

    goto :goto_3

    :cond_4
    move-object v12, v4

    :goto_3
    if-eqz p5, :cond_5

    move-object v13, v2

    goto :goto_4

    :cond_5
    move-object v13, v4

    :goto_4
    const-string v9, "reference"

    move-object v6, v14

    invoke-direct/range {v6 .. v13}, Ll/ܳᩳۜ;-><init>(Ll/۬ܽۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2060
    invoke-direct {p0, v3, v14}, Ll/ܿᩳۜ;->֫(ILl/ܳᩳۜ;)Z

    move-result v1

    return v1
.end method

.method public final ֫(Ll/᩻ᩳۜ;Ll/ۜ᩻ܽ;Ljava/lang/String;)Z
    .locals 9

    .line 2014
    iget v0, p0, Ll/ܿᩳۜ;->ᩳ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ܿᩳۜ;->ᩳ:I

    .line 2015
    iget v1, p0, Ll/ܿᩳۜ;->ܿ:I

    if-ge v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2018
    :cond_0
    invoke-static {p2}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v3

    .line 2019
    new-instance p2, Ll/ܳᩳۜ;

    invoke-virtual {p1}, Ll/᩻ᩳۜ;->֫()Ll/۬ܽۜ;

    move-result-object v2

    const-string p1, "parent="

    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v4, "parent_reference"

    const/4 v6, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v8}, Ll/ܳᩳۜ;-><init>(Ll/۬ܽۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2021
    invoke-direct {p0, v0, p2}, Ll/ܿᩳۜ;->֫(ILl/ܳᩳۜ;)Z

    move-result p1

    return p1
.end method
