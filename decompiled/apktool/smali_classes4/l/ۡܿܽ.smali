.class public final Ll/ۡܿܽ;
.super Ll/ۡᩳܽ;
.source "64SD"


# instance fields
.field public final ۙ:Ll/۬ܿܽ;

.field public final ᩶:Ljava/util/ArrayList;

.field public ᩹:Ll/ۢܿܽ;


# direct methods
.method public constructor <init>(Ll/ۢܿܽ;)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ll/ۡᩳܽ;-><init>()V

    .line 44
    new-instance v0, Ll/۬ܿܽ;

    invoke-direct {v0}, Ll/۬ܿܽ;-><init>()V

    iput-object v0, p0, Ll/ۡܿܽ;->ۙ:Ll/۬ܿܽ;

    .line 45
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ۡܿܽ;->᩶:Ljava/util/ArrayList;

    .line 46
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۡܿܽ;->᩹:Ll/ۢܿܽ;

    const/4 p1, 0x1

    .line 47
    invoke-virtual {v0, p1}, Ll/۬ܿܽ;->֫(Z)V

    return-void
.end method

.method public static ֫(Ll/ۡᩳܽ;Ll/ۢܿܽ;)Ll/ۡܿܽ;
    .locals 12

    .line 97
    new-instance v0, Ll/ۡܿܽ;

    invoke-direct {v0, p1}, Ll/ۡܿܽ;-><init>(Ll/ۢܿܽ;)V

    .line 98
    invoke-interface {p0}, Ll/ۢ᩻ܽ;->᩻ۧ()Ll/۫᩻ܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/۫᩻ܽ;->֫()Z

    move-result p1

    iget-object v1, v0, Ll/ۡܿܽ;->ۙ:Ll/۬ܿܽ;

    invoke-virtual {v1, p1}, Ll/۬ܿܽ;->֫(Z)V

    .line 99
    invoke-interface {p0}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩻ܽ;

    .line 100
    invoke-interface {p1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v2

    invoke-interface {p1}, Ll/ۘ᩻ܽ;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ll/ۡܿܽ;->֫(ILjava/lang/String;)Ll/۠ܿܽ;

    move-result-object v2

    .line 101
    invoke-interface {p1}, Ll/ۘ᩻ܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/۠ܿܽ;->֫(Ll/ۤܽܽ;)V

    .line 102
    invoke-interface {p1}, Ll/ۘ᩻ܽ;->۠ۧ()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ᩻ܽ;

    .line 103
    invoke-interface {v4}, Ll/ۡ᩻ܽ;->᩻()I

    move-result v5

    invoke-interface {v4}, Ll/ۡ᩻ܽ;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v5, v4}, Ll/۠ܿܽ;->֫(ILjava/lang/String;)V

    goto :goto_0

    .line 105
    :cond_1
    invoke-interface {p1}, Ll/ۘ᩻ܽ;->֡֫()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺ᩻ܽ;

    .line 106
    invoke-interface {v4}, Ll/ܺ᩻ܽ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4}, Ll/ܺ᩻ܽ;->ᩴۧ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Ll/۠ܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/֡ܿܽ;

    move-result-object v5

    .line 107
    invoke-interface {v4}, Ll/ܺ᩻ܽ;->ܶ֫()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۖ᩻ܽ;

    .line 108
    invoke-interface {v6}, Ll/ۖ᩻ܽ;->ܺ()I

    move-result v7

    new-instance v8, Ll/ܺۢᩴ;

    invoke-interface {v6}, Ll/ۖ᩻ܽ;->ۙ֫()Ll/֨ۡᩴ;

    move-result-object v6

    invoke-direct {v8, v6}, Ll/ܺۢᩴ;-><init>(Ll/֨ۡᩴ;)V

    invoke-virtual {v5, v7, v8}, Ll/֡ܿܽ;->֫(ILl/ܺۢᩴ;)V

    goto :goto_1

    .line 111
    :cond_3
    invoke-interface {p1}, Ll/ۘ᩻ܽ;->᩹()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩴ᩻ܽ;

    .line 112
    invoke-virtual {v2}, Ll/۠ܿܽ;->ۜ()Ll/ܶܿܽ;

    move-result-object v5

    .line 113
    invoke-interface {v4}, Ll/ᩴ᩻ܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵᩻ܽ;

    .line 114
    invoke-interface {v6}, Ll/᩵᩻ܽ;->ᩴ֫()I

    move-result v7

    invoke-interface {v6}, Ll/᩵᩻ܽ;->ᩳۧ()I

    move-result v6

    invoke-virtual {v5, v7, v6}, Ll/ܶܿܽ;->֫(II)V

    goto :goto_2

    .line 117
    :cond_5
    invoke-interface {p1}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡᩻ܽ;

    .line 118
    invoke-interface {v3}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v6

    invoke-virtual {v2, v6, v5}, Ll/۠ܿܽ;->ۧ(ILjava/lang/String;)Ll/᩶ܿܽ;

    move-result-object v5

    .line 143
    invoke-interface {v3}, Ll/֡᩻ܽ;->᩷()I

    move-result v6

    invoke-virtual {v5, v6}, Ll/᩶ܿܽ;->ᩳ(I)V

    .line 144
    new-instance v6, Ll/ᩴ᩵;

    invoke-direct {v6}, Ll/ᩴ᩵;-><init>()V

    .line 145
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v3}, Ll/֡᩻ܽ;->ۜ֫()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    invoke-interface {v3}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۜ᩻ܽ;

    .line 147
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 149
    :cond_7
    new-instance v3, Ll/۟᩵ܿ;

    const/4 v8, 0x1

    invoke-direct {v3, v8}, Ll/۟᩵ܿ;-><init>(I)V

    invoke-static {v3}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v7, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 150
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۜ᩻ܽ;

    .line 151
    invoke-interface {v7}, Ll/ۜ᩻ܽ;->ۘۧ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_4

    .line 154
    :cond_9
    invoke-interface {v7}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v8

    invoke-virtual {v5, v8}, Ll/᩶ܿܽ;->֫(Ll/᩸ܽܽ;)Ll/ۖܿܽ;

    move-result-object v8

    .line 155
    invoke-interface {v7}, Ll/ۜ᩻ܽ;->ۚ֫()Z

    move-result v9

    invoke-virtual {v8, v9}, Ll/ۖܿܽ;->ۧ(Z)V

    .line 156
    invoke-interface {v7}, Ll/ۜ᩻ܽ;->᩷ۧ()Z

    move-result v9

    invoke-virtual {v8, v9}, Ll/ۖܿܽ;->֫(Z)V

    .line 157
    invoke-interface {v7}, Ll/ۜ᩻ܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩷᩻ܽ;

    .line 158
    invoke-interface {v9}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v10

    invoke-interface {v9}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v10, v11, v4}, Ll/᩶ܿܽ;->֫(ILjava/lang/String;Z)V

    .line 159
    invoke-interface {v9}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v10

    invoke-virtual {v8, v10}, Ll/ۖܿܽ;->֫(I)Ll/ᩴܿܽ;

    move-result-object v10

    invoke-virtual {v10, v9}, Ll/ᩴܿܽ;->֫(Ll/᩷᩻ܽ;)V

    goto :goto_5

    .line 121
    :cond_a
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 122
    invoke-virtual {v2}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩶ܿܽ;

    .line 123
    invoke-virtual {v5}, Ll/᩶ܿܽ;->ۜ֫()I

    move-result v6

    sub-int/2addr v6, v4

    :goto_7
    if-ltz v6, :cond_d

    .line 124
    invoke-virtual {v5, v6}, Ll/᩶ܿܽ;->ܿ(I)Ll/ۖܿܽ;

    move-result-object v7

    .line 125
    invoke-virtual {v7}, Ll/ۜᩳܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_c

    .line 126
    invoke-virtual {v5, v6}, Ll/᩶ܿܽ;->᩻(I)V

    :cond_c
    add-int/lit8 v6, v6, -0x1

    goto :goto_7

    .line 129
    :cond_d
    invoke-virtual {v5}, Ll/᩶ܿܽ;->ۜ֫()I

    move-result v6

    if-nez v6, :cond_b

    .line 130
    invoke-virtual {v5}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 133
    :cond_e
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 134
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/۠ܿܽ;->֫(I)V

    goto :goto_8

    .line 137
    :cond_f
    invoke-virtual {v1}, Ll/۬ܿܽ;->ᩳ()V

    return-object v0
.end method

.method public static ֫(Ll/ۢܿܽ;)Ll/ۡܿܽ;
    .locals 1

    .line 55
    new-instance v0, Ll/ۡܿܽ;

    invoke-direct {v0, p0}, Ll/ۡܿܽ;-><init>(Ll/ۢܿܽ;)V

    return-object v0
.end method

.method public static ֫([B)Ll/ۡܿܽ;
    .locals 1

    .line 63
    sget-object v0, Ll/ۢܿܽ;->᩶:Ll/ۢܿܽ;

    invoke-static {p0, v0}, Ll/ۡܿܽ;->֫([BLl/ۢܿܽ;)Ll/ۡܿܽ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([BLl/ۢܿܽ;)Ll/ۡܿܽ;
    .locals 1

    .line 83
    new-instance v0, Ll/᩺᩻ܽ;

    invoke-direct {v0, p0}, Ll/᩺᩻ܽ;-><init>([B)V

    invoke-static {v0, p1}, Ll/ۡܿܽ;->֫(Ll/ۡᩳܽ;Ll/ۢܿܽ;)Ll/ۡܿܽ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩵()Ll/ۡܿܽ;
    .locals 2

    .line 51
    sget-object v0, Ll/ۢܿܽ;->᩶:Ll/ۢܿܽ;

    .line 55
    new-instance v1, Ll/ۡܿܽ;

    invoke-direct {v1, v0}, Ll/ۡܿܽ;-><init>(Ll/ۢܿܽ;)V

    return-object v1
.end method


# virtual methods
.method public final ֫(ILjava/lang/String;)Ll/۠ܿܽ;
    .locals 5

    .line 177
    iget-object v0, p0, Ll/ۡܿܽ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ܿܽ;

    .line 178
    invoke-virtual {v2}, Ll/۠ᩳܽ;->᩻()I

    move-result v3

    if-eq v3, p1, :cond_1

    goto :goto_0

    .line 181
    :cond_1
    invoke-virtual {v2}, Ll/۠ᩳܽ;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 183
    :cond_2
    sget-object v3, Ll/ۢܿܽ;->ۙ:Ll/ۢܿܽ;

    iget-object v4, p0, Ll/ۡܿܽ;->᩹:Ll/ۢܿܽ;

    if-ne v4, v3, :cond_3

    :goto_1
    return-object v2

    .line 185
    :cond_3
    sget-object v3, Ll/ۢܿܽ;->᩶:Ll/ۢܿܽ;

    if-eq v4, v3, :cond_4

    .line 188
    sget-object v2, Ll/ۢܿܽ;->᩹:Ll/ۢܿܽ;

    if-ne v4, v2, :cond_0

    goto :goto_2

    .line 187
    :cond_4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2}, Ll/۠ᩳܽ;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    const/4 p1, 0x2

    aput-object p2, v1, p1

    .line 17
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "There is already a package with id of 0x%02x, named \"%s\" not \"%s\""

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 194
    :cond_5
    :goto_2
    new-instance v1, Ll/۠ܿܽ;

    invoke-direct {v1, p0, p1, p2}, Ll/۠ܿܽ;-><init>(Ll/ۡܿܽ;ILjava/lang/String;)V

    .line 195
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public final ֫(Ljava/io/OutputStream;)V
    .locals 2

    .line 222
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    const/4 v1, 0x0

    .line 236
    invoke-virtual {p0, v0, v1}, Ll/ۡܿܽ;->֫(Ll/ۙۜܽ;Ll/᩵ۛۡ;)V

    .line 224
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->֫(Ljava/io/OutputStream;)V

    return-void
.end method

.method public final ֫(Ll/ۙۜܽ;Ll/᩵ۛۡ;)V
    .locals 6

    .line 240
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 287
    invoke-virtual {p0}, Ll/ۡᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v1

    .line 242
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܿܽ;

    .line 243
    new-instance v4, Ll/ۨܿܽ;

    invoke-direct {v4, v3}, Ll/ۨܿܽ;-><init>(Ll/۠ܿܽ;)V

    .line 244
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    iget-object v3, v4, Ll/ۨܿܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    .line 248
    invoke-interface {p1, v1}, Ll/ۙۜܽ;->֫(S)V

    const/16 v1, 0xc

    .line 249
    invoke-interface {p1, v1}, Ll/ۙۜܽ;->֫(S)V

    .line 252
    invoke-interface {p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v3

    .line 253
    invoke-interface {p1}, Ll/ۙۜܽ;->᩷ܽ()V

    .line 255
    invoke-interface {p1, v2}, Ll/ۙۜܽ;->writeInt(I)V

    .line 271
    iget-object v1, p0, Ll/ۡܿܽ;->ۙ:Ll/۬ܿܽ;

    const/4 v2, 0x1

    .line 258
    invoke-virtual {v1, p1, v2, p2}, Ll/۬ܿܽ;->֫(Ll/ۙۜܽ;ZLl/᩵ۛۡ;)V

    .line 259
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨܿܽ;

    .line 260
    iget-object v2, v1, Ll/ۨܿܽ;->ۧ:Ll/۠ܿܽ;

    invoke-virtual {v2, p1, p2, v1}, Ll/۠ܿܽ;->֫(Ll/ۙۜܽ;Ll/᩵ۛۡ;Ll/ۨܿܽ;)V

    goto :goto_1

    .line 263
    :cond_1
    invoke-interface {p1}, Ll/ۙۜܽ;->getPosition()J

    move-result-wide v0

    .line 264
    invoke-interface {p1, v3, v4}, Ll/ۙۜܽ;->seek(J)V

    sub-long v2, v0, v3

    const-wide/16 v4, 0x4

    add-long/2addr v2, v4

    long-to-int p2, v2

    .line 265
    invoke-interface {p1, p2}, Ll/ۙۜܽ;->writeInt(I)V

    .line 266
    invoke-interface {p1, v0, v1}, Ll/ۙۜܽ;->seek(J)V

    return-void
.end method

.method public final ۚ()I
    .locals 1

    .line 277
    iget-object v0, p0, Ll/ۡܿܽ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۜ()V
    .locals 4

    const/4 v0, 0x0

    .line 295
    :goto_0
    iget-object v1, p0, Ll/ۡܿܽ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 296
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ܿܽ;

    invoke-virtual {v2}, Ll/۠ᩳܽ;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "bin.mt.plus.TranslationData"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 297
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۡ()V
    .locals 3

    .line 214
    iget-object v0, p0, Ll/ۡܿܽ;->ۙ:Ll/۬ܿܽ;

    invoke-virtual {v0}, Ll/۬ܿܽ;->ܳ()V

    .line 287
    invoke-virtual {p0}, Ll/ۡᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v1

    .line 215
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ܿܽ;

    .line 216
    invoke-virtual {v2}, Ll/۠ܿܽ;->۬()V

    goto :goto_0

    .line 218
    :cond_0
    invoke-virtual {v0}, Ll/۬ܿܽ;->᩻()V

    return-void
.end method

.method public final bridge synthetic ۢ(I)Ll/ۘ᩻ܽ;
    .locals 0

    .line 38
    invoke-virtual {p0, p1}, Ll/ۡܿܽ;->ۢ(I)Ll/۠ܿܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ۢ(I)Ll/۠ܿܽ;
    .locals 1

    .line 282
    iget-object v0, p0, Ll/ۡܿܽ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ܿܽ;

    return-object p1
.end method

.method public final ۧ()Ll/۠ܿܽ;
    .locals 4

    const/4 v0, 0x0

    .line 306
    :goto_0
    iget-object v1, p0, Ll/ۡܿܽ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 307
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ܿܽ;

    invoke-virtual {v2}, Ll/۠ᩳܽ;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "bin.mt.plus.TranslationData"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 308
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܿܽ;

    return-object v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܳ()Ll/᩵ۛۡ;
    .locals 10

    .line 271
    iget-object v0, p0, Ll/ۡܿܽ;->ۙ:Ll/۬ܿܽ;

    .line 228
    invoke-virtual {v0}, Ll/۬ܿܽ;->ܿ()I

    move-result v0

    .line 287
    invoke-virtual {p0}, Ll/ۡᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v1

    .line 229
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ܿܽ;

    .line 230
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 47
    invoke-virtual {v2}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶ܿܽ;

    .line 48
    invoke-virtual {v6}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v7

    .line 49
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    if-nez v8, :cond_0

    const/4 v8, 0x1

    goto :goto_2

    .line 50
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/lit8 v8, v8, 0x1

    .line 51
    :goto_2
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v3, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 53
    invoke-virtual {v6}, Ll/᩶ܿܽ;->᩵()I

    move-result v6

    add-int/2addr v4, v6

    goto :goto_1

    :cond_1
    const/4 v2, 0x3

    .line 55
    invoke-static {v5, v2, v4, v0}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v0

    goto :goto_0

    .line 232
    :cond_2
    new-instance v1, Ll/᩵ۛۡ;

    int-to-long v2, v0

    invoke-direct {v1, v2, v3}, Ll/᩵ۛۡ;-><init>(J)V

    return-object v1
.end method

.method public final ᩻ۧ()Ll/۫᩻ܽ;
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ۡܿܽ;->ۙ:Ll/۬ܿܽ;

    return-object v0
.end method

.method public final ᩻ۧ()Ll/۬ܿܽ;
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ۡܿܽ;->ۙ:Ll/۬ܿܽ;

    return-object v0
.end method
