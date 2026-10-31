.class public final Ll/ۗ᩺᩻;
.super Ljava/lang/Object;
.source "X785"


# instance fields
.field public ֫:Ljava/lang/String;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۗ᩺᩻;->ۧ:Ljava/util/ArrayList;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۗ᩺᩻;->ܽ:Ljava/util/ArrayList;

    .line 31
    invoke-static {p1}, Ll/ᩳ᩺᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 108
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 109
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 132
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v1, v5, :cond_8

    .line 133
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_2

    :cond_0
    const/16 v6, 0x27

    const/16 v7, 0x22

    if-nez v3, :cond_4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    if-ne v5, v7, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    if-ne v5, v6, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/16 v6, 0x23

    if-ne v5, v6, :cond_7

    .line 153
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_1
    const/16 v8, 0x5c

    if-ne v5, v8, :cond_5

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    if-eqz v3, :cond_6

    if-ne v5, v7, :cond_6

    const/4 v3, 0x0

    goto :goto_2

    :cond_6
    if-eqz v4, :cond_7

    if-ne v5, v6, :cond_7

    const/4 v4, 0x0

    :cond_7
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_8
    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗ᩺᩻;
    .locals 14

    .line 38
    new-instance v0, Ll/ۗ᩺᩻;

    invoke-direct {v0, p0}, Ll/ۗ᩺᩻;-><init>(Ljava/lang/String;)V

    .line 39
    invoke-static {p1}, Ll/۠ۨ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "\n"

    const/4 v1, -0x1

    invoke-virtual {p0, p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, p1

    move-object v4, v3

    .line 42
    :goto_0
    array-length v5, p0

    iget-object v6, v0, Ll/ۗ᩺᩻;->ܽ:Ljava/util/ArrayList;

    if-ge v2, v5, :cond_b

    add-int/lit8 v5, v2, 0x1

    .line 44
    aget-object v2, p0, v2

    invoke-static {v2}, Ll/ۗ᩺᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    if-eqz v4, :cond_0

    const-string v6, ".end method"

    .line 46
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 47
    iput v5, v4, Ll/᩶᩺᩻;->ܽ:I

    move-object v4, p1

    goto/16 :goto_1

    :cond_0
    const-string v7, ".method"

    const-string v8, ".field"

    const-string v9, ".implements"

    const-string v10, ".source"

    const-string v11, ".super"

    const-string v12, ".class"

    if-eqz v3, :cond_3

    const-string v13, ".end field"

    .line 53
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    .line 54
    iput v5, v3, Ll/᩶᩺᩻;->ܽ:I

    move-object v3, p1

    goto/16 :goto_1

    .line 95
    :cond_1
    invoke-static {v2, v12}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_2

    .line 96
    invoke-static {v2, v11}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_2

    .line 97
    invoke-static {v2, v10}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_2

    .line 98
    invoke-static {v2, v9}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_2

    .line 99
    invoke-static {v2, v8}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_2

    .line 100
    invoke-static {v2, v7}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_a

    .line 61
    :cond_2
    iget v13, v3, Ll/᩶᩺᩻;->ۜ:I

    iput v13, v3, Ll/᩶᩺᩻;->ܽ:I

    move-object v3, p1

    .line 65
    :cond_3
    invoke-static {v2, v12}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_4

    .line 66
    iput-object v2, v0, Ll/ۗ᩺᩻;->֫:Ljava/lang/String;

    goto :goto_1

    .line 67
    :cond_4
    invoke-static {v2, v11}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_5

    .line 68
    iput-object v11, v0, Ll/ۗ᩺᩻;->ܿ:Ljava/lang/String;

    goto :goto_1

    .line 69
    :cond_5
    invoke-static {v2, v10}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_7

    .line 119
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v6, 0x2

    if-lt v2, v6, :cond_6

    invoke-virtual {v10, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v6, 0x22

    if-ne v2, v6, :cond_6

    const/4 v2, 0x1

    .line 0
    invoke-static {v2, v10}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v7

    if-ne v7, v6, :cond_6

    invoke-static {v2, v2, v10}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 605
    sget-object v6, Ll/ۤۘ֡;->ᩳ:Ll/ۛۘ֡;

    invoke-virtual {v6, v2}, Ll/ۨۘ֡;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    .line 70
    :cond_6
    iput-object v10, v0, Ll/ۗ᩺᩻;->ᩳ:Ljava/lang/String;

    goto :goto_1

    .line 71
    :cond_7
    invoke-static {v2, v9}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_8

    .line 72
    iget-object v2, v0, Ll/ۗ᩺᩻;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 73
    :cond_8
    invoke-static {v2, v8}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_9

    .line 74
    invoke-static {v5, v2}, Ll/᩶᩺᩻;->֫(ILjava/lang/String;)Ll/᩶᩺᩻;

    move-result-object v3

    .line 75
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 76
    :cond_9
    invoke-static {v2, v7}, Ll/ۗ᩺᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_a

    .line 77
    invoke-static {v5, v2}, Ll/᩶᩺᩻;->ܽ(ILjava/lang/String;)Ll/᩶᩺᩻;

    move-result-object v4

    .line 78
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_1
    move v2, v5

    goto/16 :goto_0

    :cond_b
    if-eqz v3, :cond_c

    .line 82
    iget p1, v3, Ll/᩶᩺᩻;->ۜ:I

    iput p1, v3, Ll/᩶᩺᩻;->ܽ:I

    :cond_c
    if-eqz v4, :cond_d

    .line 85
    array-length p0, p0

    iput p0, v4, Ll/᩶᩺᩻;->ܽ:I

    .line 87
    :cond_d
    new-instance p0, Ll/᩺᩺ۡ;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ll/᩺᩺ۡ;-><init>(I)V

    invoke-static {v6, p0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/᩶᩺᩻;
    .locals 4

    .line 164
    iget-object v0, p0, Ll/ۗ᩺᩻;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶᩺᩻;

    const-string v2, "method"

    .line 165
    iget-object v3, v1, Ll/᩶᩺᩻;->ᩳ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Ll/᩶᩺᩻;->᩻:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
