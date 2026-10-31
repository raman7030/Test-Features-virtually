.class public final Ll/֨ܶ֡;
.super Ljava/lang/Object;
.source "04UF"


# static fields
.field public static final ۖ:Ll/֨۫ۡ;

.field public static final ۘ:Ll/֡ۛۡ;

.field public static final ܺ:Ll/֨۫ۡ;


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۜ:Ll/᩹ܶ֡;

.field public final ۡ:Ll/᩺᩵ۚ;

.field public ۢ:Ll/ܶܶ֡;

.field public final ۧ:Ll/ۧۜۚ;

.field public final ܳ:Ll/᩵֫ۚ;

.field public final ܽ:Ljava/util/ArrayList;

.field public final ܿ:Ll/ᩴ֫ۚ;

.field public final ᩳ:Ll/ۚܶ֡;

.field public final ᩷:Ll/᩺᩵ۚ;

.field public final ᩻:Ll/ܳ۬ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 86
    new-instance v0, Ll/֨۫ۡ;

    invoke-direct {v0}, Ll/֨۫ۡ;-><init>()V

    sput-object v0, Ll/֨ܶ֡;->ۖ:Ll/֨۫ۡ;

    .line 87
    new-instance v0, Ll/֨۫ۡ;

    invoke-direct {v0}, Ll/֨۫ۡ;-><init>()V

    sput-object v0, Ll/֨ܶ֡;->ܺ:Ll/֨۫ۡ;

    .line 88
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0}, Ll/֡ۛۡ;-><init>()V

    sput-object v0, Ll/֨ܶ֡;->ۘ:Ll/֡ۛۡ;

    return-void
.end method

.method public constructor <init>(Ll/᩹ܶ֡;Ll/ᩴ֫ۚ;Ll/᩵֫ۚ;)V
    .locals 10

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    new-instance v0, Ll/ۚܶ֡;

    .line 699
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 697
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Ll/ۚܶ֡;->֫:Ljava/util/HashMap;

    .line 102
    iput-object v0, p0, Ll/֨ܶ֡;->ᩳ:Ll/ۚܶ֡;

    .line 140
    iput-object p1, p0, Ll/֨ܶ֡;->ۜ:Ll/᩹ܶ֡;

    .line 141
    iput-object p2, p0, Ll/֨ܶ֡;->ܿ:Ll/ᩴ֫ۚ;

    .line 142
    iput-object p3, p0, Ll/֨ܶ֡;->ܳ:Ll/᩵֫ۚ;

    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 147
    :try_start_0
    sget-object v1, Ll/֨ܶ֡;->ܺ:Ll/֨۫ۡ;

    invoke-virtual {v1}, Ll/֨۫ۡ;->ۧ()Ljava/util/ArrayList;

    move-result-object v2

    .line 148
    invoke-virtual {v1}, Ll/֨۫ۡ;->ۧ()Ljava/util/ArrayList;

    move-result-object v1

    .line 149
    invoke-interface {p3}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺֫ۚ;

    .line 150
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 153
    :cond_0
    iput-object v2, p0, Ll/֨ܶ֡;->ܽ:Ljava/util/ArrayList;

    .line 154
    iput-object v1, p0, Ll/֨ܶ֡;->֫:Ljava/util/ArrayList;

    .line 156
    invoke-interface {p2}, Ll/ᩴ֫ۚ;->getParameters()Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p3

    iput-object p3, p0, Ll/֨ܶ֡;->᩻:Ll/ܳ۬ܺ;

    .line 113
    sget-object p3, Ll/֨ܶ֡;->ۘ:Ll/֡ۛۡ;

    invoke-virtual {p3}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺᩵ۚ;

    if-nez v3, :cond_1

    .line 115
    new-instance v3, Ll/᩺᩵ۚ;

    invoke-direct {v3}, Ll/᩺᩵ۚ;-><init>()V

    goto :goto_1

    .line 117
    :cond_1
    invoke-virtual {v3}, Ll/᩺᩵ۚ;->֫()V

    .line 158
    :goto_1
    iput-object v3, p0, Ll/֨ܶ֡;->᩷:Ll/᩺᩵ۚ;

    .line 113
    invoke-virtual {p3}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩺᩵ۚ;

    if-nez p3, :cond_2

    .line 115
    new-instance p3, Ll/᩺᩵ۚ;

    invoke-direct {p3}, Ll/᩺᩵ۚ;-><init>()V

    goto :goto_2

    .line 117
    :cond_2
    invoke-virtual {p3}, Ll/᩺᩵ۚ;->֫()V

    .line 159
    :goto_2
    iput-object p3, p0, Ll/֨ܶ֡;->ۡ:Ll/᩺᩵ۚ;

    .line 160
    new-instance p3, Ll/ۧۜۚ;

    invoke-direct {p3, v2}, Ll/ۧۜۚ;-><init>(Ljava/util/ArrayList;)V

    iput-object p3, p0, Ll/֨ܶ֡;->ۧ:Ll/ۧۜۚ;

    .line 162
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v0

    invoke-virtual {p3, v3}, Ll/ۧۜۚ;->֫(I)I

    move-result p3

    .line 163
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺֫ۚ;

    invoke-interface {v3}, Ll/᩺֫ۚ;->ۚ()I

    move-result v3

    add-int/2addr p3, v3

    const/4 v3, 0x0

    .line 165
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_7

    .line 166
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺֫ۚ;

    .line 168
    invoke-interface {v4}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v5

    .line 169
    sget-object v6, Ll/֨ۗ֡;->᩹ܳ:Ll/֨ۗ֡;

    const/4 v7, -0x1

    if-ne v5, v6, :cond_4

    .line 171
    iget-object v6, p0, Ll/֨ܶ֡;->ۧ:Ll/ۧۜۚ;

    invoke-virtual {v6, v3}, Ll/ۧۜۚ;->֫(I)I

    move-result v6

    .line 172
    move-object v8, v4

    check-cast v8, Ll/۟֫ۚ;

    invoke-interface {v8}, Ll/۟֫ۚ;->ۖ()I

    move-result v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    add-int/2addr v8, v6

    .line 174
    :try_start_1
    sget-object v9, Ll/֨ۗ֡;->᩶ܳ:Ll/֨ۗ֡;

    invoke-virtual {p0, v8, v9}, Ll/֨ܶ֡;->֫(ILl/֨ۗ֡;)I

    move-result v8
    :try_end_1
    .catch Ll/֡ܶ֡; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    const/4 v9, 0x1

    goto :goto_4

    :catch_0
    const/4 v9, 0x0

    :goto_4
    if-eqz v9, :cond_6

    .line 179
    :try_start_2
    iget-object v9, p0, Ll/֨ܶ֡;->᩷:Ll/᩺᩵ۚ;

    invoke-virtual {v9, v8}, Ll/᩺᩵ۚ;->֫(I)I

    move-result v9

    if-eq v9, v7, :cond_3

    .line 180
    sget-object v7, Ll/֨ۗ֡;->᩶ܳ:Ll/֨ۗ֡;

    .line 181
    invoke-virtual {p0, v8, v7}, Ll/֨ܶ֡;->ۧ(ILl/֨ۗ֡;)Ll/᩺֫ۚ;

    move-result-object v7

    .line 183
    new-instance v8, Ll/ܶᩳۚ;

    check-cast v4, Ll/۟ۧۚ;

    .line 184
    invoke-interface {v4}, Ll/֫ۧۚ;->֫()I

    move-result v4

    sub-int v9, p3, v6

    invoke-direct {v8, v5, v4, v9}, Ll/ܶᩳۚ;-><init>(Ll/֨ۗ֡;II)V

    .line 183
    invoke-virtual {v1, v3, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 185
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    invoke-interface {v7}, Ll/᩺֫ۚ;->ۚ()I

    move-result v4

    add-int/2addr v4, p3

    goto :goto_5

    :cond_3
    move v4, p3

    move p3, v8

    .line 188
    :goto_5
    iget-object v5, p0, Ll/֨ܶ֡;->᩷:Ll/᩺᩵ۚ;

    invoke-virtual {v5, p3, v6}, Ll/᩺᩵ۚ;->֫(II)V

    goto :goto_8

    .line 190
    :cond_4
    sget-object v6, Ll/֨ۗ֡;->ܰ᩻:Ll/֨ۗ֡;

    if-ne v5, v6, :cond_6

    .line 192
    iget-object v6, p0, Ll/֨ܶ֡;->ۧ:Ll/ۧۜۚ;

    invoke-virtual {v6, v3}, Ll/ۧۜۚ;->֫(I)I

    move-result v6

    .line 193
    move-object v8, v4

    check-cast v8, Ll/۟֫ۚ;

    invoke-interface {v8}, Ll/۟֫ۚ;->ۖ()I

    move-result v8
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    add-int/2addr v8, v6

    .line 195
    :try_start_3
    sget-object v9, Ll/֨ۗ֡;->۟᩻:Ll/֨ۗ֡;

    invoke-virtual {p0, v8, v9}, Ll/֨ܶ֡;->֫(ILl/֨ۗ֡;)I

    move-result v8
    :try_end_3
    .catch Ll/֡ܶ֡; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    const/4 v9, 0x1

    goto :goto_6

    :catch_1
    const/4 v9, 0x0

    :goto_6
    if-eqz v9, :cond_6

    .line 202
    :try_start_4
    iget-object v9, p0, Ll/֨ܶ֡;->ۡ:Ll/᩺᩵ۚ;

    invoke-virtual {v9, v8}, Ll/᩺᩵ۚ;->֫(I)I

    move-result v9

    if-eq v9, v7, :cond_5

    .line 203
    sget-object v7, Ll/֨ۗ֡;->۟᩻:Ll/֨ۗ֡;

    .line 204
    invoke-virtual {p0, v8, v7}, Ll/֨ܶ֡;->ۧ(ILl/֨ۗ֡;)Ll/᩺֫ۚ;

    move-result-object v7

    .line 206
    new-instance v8, Ll/ܶᩳۚ;

    check-cast v4, Ll/۟ۧۚ;

    .line 207
    invoke-interface {v4}, Ll/֫ۧۚ;->֫()I

    move-result v4

    sub-int v9, p3, v6

    invoke-direct {v8, v5, v4, v9}, Ll/ܶᩳۚ;-><init>(Ll/֨ۗ֡;II)V

    .line 206
    invoke-virtual {v1, v3, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 208
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    invoke-interface {v7}, Ll/᩺֫ۚ;->ۚ()I

    move-result v4

    add-int/2addr v4, p3

    goto :goto_7

    :cond_5
    move v4, p3

    move p3, v8

    .line 211
    :goto_7
    iget-object v5, p0, Ll/֨ܶ֡;->ۡ:Ll/᩺᩵ۚ;

    invoke-virtual {v5, p3, v6}, Ll/᩺᩵ۚ;->֫(II)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :goto_8
    move p3, v4

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_3

    :cond_7
    return-void

    :catch_2
    move-exception p3

    .line 64
    :try_start_5
    invoke-static {p2, p1}, Ll/ܳۜۚ;->֫(Ll/ۚܽۚ;Z)Ljava/lang/String;

    move-result-object p2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p2, v0, p1

    const-string p1, "Error while processing method %s"

    .line 222
    invoke-static {p3, p1, v0}, Ll/ܶ᩵ۚ;->֫(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܶ᩵ۚ;

    move-result-object p1

    throw p1

    :catch_3
    const-string p2, "Error while processing method"

    new-array p1, p1, [Ljava/lang/Object;

    .line 220
    invoke-static {p3, p2, p1}, Ll/ܶ᩵ۚ;->֫(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܶ᩵ۚ;

    move-result-object p1

    throw p1
.end method

.method public static ֫(Ll/ۗ᩵ۚ;ILjava/util/Set;)V
    .locals 4

    .line 256
    invoke-static {p1}, Ll/ܺۗ֡;->ۜ(I)[Ll/ܺۗ֡;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x20

    if-ge v1, v0, :cond_0

    aget-object v3, p1, v1

    .line 257
    invoke-virtual {v3}, Ll/ܺۗ֡;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    .line 258
    invoke-virtual {p0, v2}, Ll/ۗ᩵ۚ;->write(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 260
    :cond_0
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴۗ֡;

    .line 261
    invoke-virtual {p2}, Ll/ᩴۗ֡;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    .line 262
    invoke-virtual {p0, v2}, Ll/ۗ᩵ۚ;->write(I)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ۗ᩵ۚ;Ll/ᩴ֫ۚ;Ljava/util/List;Ll/᩹ܶ֡;)V
    .locals 7

    .line 269
    sget-object v0, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-interface {p1}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ܺۗ֡;->֫(I)Z

    move-result p1

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    .line 271
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡֫ۚ;

    .line 272
    invoke-interface {v1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v2

    .line 273
    invoke-interface {v1}, Ll/֡֫ۚ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 274
    invoke-interface {v1}, Ll/֡֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v1

    .line 275
    iget-boolean v4, p3, Ll/᩹ܶ֡;->ܿ:Z

    if-eqz v4, :cond_0

    if-nez v3, :cond_1

    :cond_0
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v4

    if-eqz v4, :cond_3

    .line 276
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v4, 0x8

    const-string v5, ".param p"

    const/4 v6, 0x0

    .line 116
    invoke-virtual {p0, v5, v6, v4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 277
    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->ۧ(I)V

    if-eqz v3, :cond_2

    .line 279
    iget-boolean v4, p3, Ll/᩹ܶ֡;->ܿ:Z

    if-eqz v4, :cond_2

    const-string v4, ", "

    const/4 v5, 0x2

    .line 116
    invoke-virtual {p0, v4, v6, v5}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const/16 v4, 0x22

    .line 45
    invoke-virtual {p0, v4}, Ll/ۗ᩵ۚ;->write(I)V

    .line 46
    invoke-static {p0, v3}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, v4}, Ll/ۗ᩵ۚ;->write(I)V

    :cond_2
    const-string v3, "  # "

    const/4 v4, 0x4

    .line 116
    invoke-virtual {p0, v3, v6, v4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 284
    invoke-virtual {p0, v2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    const-string v3, "\n"

    .line 116
    invoke-virtual {p0, v3, v6, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 286
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    if-lez v3, :cond_3

    .line 287
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->ܽ()V

    .line 293
    invoke-static {p0, v1}, Ll/ᩴ۠֡;->֫(Ll/ۗ᩵ۚ;Ljava/util/Set;)V

    .line 294
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->֫()V

    const-string v1, ".end param\n"

    const/16 v3, 0xb

    .line 116
    invoke-virtual {p0, v1, v6, v3}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    :cond_3
    add-int/lit8 v1, p1, 0x1

    .line 300
    invoke-static {v2}, Ll/ۧ᩷ܽ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    add-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_4
    move p1, v1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public static ֫(Ll/ۗ᩵ۚ;Ll/ᩴ֫ۚ;Ll/᩹ܶ֡;)V
    .locals 5

    .line 228
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x8

    const-string v1, ".method "

    const/4 v2, 0x0

    .line 116
    invoke-virtual {p0, v1, v2, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 229
    invoke-interface {p1}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v0

    invoke-interface {p1}, Ll/ᩴ֫ۚ;->᩵()Ljava/util/Set;

    move-result-object v1

    invoke-static {p0, v0, v1}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;ILjava/util/Set;)V

    .line 230
    invoke-interface {p1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    const-string v0, "("

    const/4 v1, 0x1

    .line 116
    invoke-virtual {p0, v0, v2, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 232
    invoke-interface {p1}, Ll/ᩴ֫ۚ;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v0

    .line 375
    invoke-virtual {v0, v2}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v3

    .line 233
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡֫ۚ;

    .line 234
    invoke-interface {v4}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v3, ")"

    .line 116
    invoke-virtual {p0, v3, v2, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 237
    invoke-interface {p1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    const/16 v1, 0xa

    .line 238
    invoke-virtual {p0, v1}, Ll/ۗ᩵ۚ;->write(I)V

    .line 240
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->ܽ()V

    .line 241
    invoke-static {p0, p1, v0, p2}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;Ll/ᩴ֫ۚ;Ljava/util/List;Ll/᩹ܶ֡;)V

    .line 244
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    invoke-interface {p1}, Ll/ᩴ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ᩴ۠֡;->֫(Ll/ۗ᩵ۚ;Ljava/util/Set;)V

    .line 249
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->֫()V

    const-string p1, ".end method\n"

    const/16 p2, 0xc

    .line 116
    invoke-virtual {p0, p1, v2, p2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 435
    iget-object v0, p0, Ll/֨ܶ֡;->᩷:Ll/᩺᩵ۚ;

    invoke-virtual {v0, p1}, Ll/᩺᩵ۚ;->֫(I)I

    move-result p1

    return p1
.end method

.method public final ֫(ILl/֨ۗ֡;)I
    .locals 6

    .line 403
    iget-object v0, p0, Ll/֨ܶ֡;->ۧ:Ll/ۧۜۚ;

    const/4 v1, 0x1

    .line 57
    :try_start_0
    invoke-virtual {v0, p1, v1}, Ll/ۧۜۚ;->֫(IZ)I

    move-result v2
    :try_end_0
    .catch Ll/֫ۜۚ; {:try_start_0 .. :try_end_0} :catch_0

    .line 411
    iget-object v3, p0, Ll/֨ܶ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺֫ۚ;

    .line 412
    invoke-interface {v4}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v5

    if-eq v5, p2, :cond_1

    .line 414
    invoke-interface {v4}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v4

    sget-object v5, Ll/֨ۗ֡;->ۖܳ:Ll/֨ۗ֡;

    if-ne v4, v5, :cond_0

    add-int/2addr v2, v1

    .line 416
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_0

    .line 417
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺֫ۚ;

    .line 418
    invoke-interface {v1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    if-ne v1, p2, :cond_0

    .line 419
    invoke-virtual {v0, v2}, Ll/ۧۜۚ;->֫(I)I

    move-result p1

    return p1

    .line 423
    :cond_0
    new-instance p2, Ll/֡ܶ֡;

    invoke-direct {p2, p1}, Ll/֡ܶ֡;-><init>(I)V

    throw p2

    :cond_1
    return p1

    .line 405
    :catch_0
    new-instance p2, Ll/֡ܶ֡;

    invoke-direct {p2, p1}, Ll/֡ܶ֡;-><init>(I)V

    throw p2
.end method

.method public final ֫()Ll/ۚܶ֡;
    .locals 1

    .line 431
    iget-object v0, p0, Ll/֨ܶ֡;->ᩳ:Ll/ۚܶ֡;

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩵ۚ;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 308
    sget-object v2, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    iget-object v3, v0, Ll/֨ܶ֡;->ܿ:Ll/ᩴ֫ۚ;

    invoke-interface {v3}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v4

    invoke-virtual {v2, v4}, Ll/ܺۗ֡;->֫(I)Z

    move-result v2

    const/4 v4, 0x1

    xor-int/2addr v2, v4

    .line 312
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v5, 0x8

    const-string v6, ".method "

    const/4 v7, 0x0

    .line 116
    invoke-virtual {v1, v6, v7, v5}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 313
    invoke-interface {v3}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v5

    invoke-interface {v3}, Ll/ᩴ֫ۚ;->᩵()Ljava/util/Set;

    move-result-object v6

    invoke-static {v1, v5, v6}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;ILjava/util/Set;)V

    .line 314
    invoke-static {v1, v3, v4}, Ll/ܳۜۚ;->֫(Ljava/io/Writer;Ll/ۚܽۚ;Z)V

    .line 375
    iget-object v5, v0, Ll/֨ܶ֡;->᩻:Ll/ܳ۬ܺ;

    invoke-virtual {v5, v7}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v6

    .line 315
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡֫ۚ;

    add-int/lit8 v9, v2, 0x1

    .line 317
    invoke-interface {v8}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/ۧ᩷ܽ;->֫(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_0
    move v2, v9

    goto :goto_0

    :cond_1
    const/16 v6, 0xa

    .line 333
    invoke-virtual {v1, v6}, Ll/ۗ᩵ۚ;->write(I)V

    .line 335
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩵ۚ;->ܽ()V

    .line 336
    iget-object v8, v0, Ll/֨ܶ֡;->ۜ:Ll/᩹ܶ֡;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    iget-boolean v9, v8, Ll/᩹ܶ֡;->ۧ:Z

    iget-object v10, v0, Ll/֨ܶ֡;->ܳ:Ll/᩵֫ۚ;

    if-nez v9, :cond_2

    const-string v9, ".registers "

    const/16 v11, 0xb

    .line 116
    invoke-virtual {v1, v9, v7, v11}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 341
    invoke-interface {v10}, Ll/᩵֫ۚ;->᩻()I

    move-result v9

    invoke-virtual {v1, v9}, Ll/ۗ᩵ۚ;->ۧ(I)V

    .line 343
    :cond_2
    invoke-virtual {v1, v6}, Ll/ۗ᩵ۚ;->write(I)V

    .line 344
    invoke-static {v1, v3, v5, v8}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;Ll/ᩴ֫ۚ;Ljava/util/List;Ll/᩹ܶ֡;)V

    .line 346
    iget-object v5, v0, Ll/֨ܶ֡;->ۢ:Ll/ܶܶ֡;

    if-nez v5, :cond_3

    .line 347
    new-instance v5, Ll/ܶܶ֡;

    invoke-interface {v10}, Ll/᩵֫ۚ;->᩻()I

    move-result v9

    invoke-direct {v5, v8, v9, v2}, Ll/ܶܶ֡;-><init>(Ll/᩹ܶ֡;II)V

    iput-object v5, v0, Ll/֨ܶ֡;->ۢ:Ll/ܶܶ֡;

    .line 355
    :cond_3
    invoke-interface {v3}, Ll/ᩴ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ᩴ۠֡;->֫(Ll/ۗ᩵ۚ;Ljava/util/Set;)V

    .line 357
    invoke-virtual {v1, v6}, Ll/ۗ᩵ۚ;->write(I)V

    .line 443
    sget-object v2, Ll/֨ܶ֡;->ۖ:Ll/֨۫ۡ;

    invoke-virtual {v2}, Ll/֨۫ۡ;->ۧ()Ljava/util/ArrayList;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v9, 0x0

    .line 486
    :goto_1
    iget-object v11, v0, Ll/֨ܶ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v5, v12, :cond_6

    .line 487
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩺֫ۚ;

    .line 488
    iget-boolean v13, v8, Ll/᩹ܶ֡;->ᩳ:Z

    if-eqz v13, :cond_4

    invoke-interface {v12}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v13

    sget-object v14, Ll/֨ۗ֡;->ۖܳ:Ll/֨ۗ֡;

    if-ne v13, v14, :cond_4

    .line 489
    invoke-interface {v12}, Ll/᩺֫ۚ;->ۚ()I

    move-result v11

    goto :goto_2

    .line 493
    :cond_4
    invoke-static {v0, v9, v12}, Ll/ᩳܶ֡;->֫(Ll/֨ܶ֡;ILl/᩺֫ۚ;)Ll/ۧܶ֡;

    move-result-object v13

    .line 496
    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 499
    iget-boolean v13, v8, Ll/᩹ܶ֡;->ܽ:Z

    if-nez v13, :cond_5

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    sub-int/2addr v11, v4

    if-eq v5, v11, :cond_5

    .line 500
    invoke-static {v9}, Ll/᩵۠֡;->֫(I)Ll/᩵۠֡;

    move-result-object v11

    invoke-interface {v3, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 544
    :cond_5
    invoke-interface {v12}, Ll/᩺֫ۚ;->ۚ()I

    move-result v11

    :goto_2
    add-int/2addr v9, v11

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 615
    :cond_6
    invoke-interface {v10}, Ll/᩵֫ۚ;->ۜ()Ljava/util/List;

    move-result-object v5

    .line 616
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    if-nez v9, :cond_7

    goto/16 :goto_4

    .line 619
    :cond_7
    iget-boolean v9, v8, Ll/᩹ܶ֡;->᩻:Z

    if-eqz v9, :cond_8

    .line 620
    invoke-static {v5}, Ll/ᩳܺۚ;->֫(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v5

    .line 623
    :cond_8
    iget-object v9, v0, Ll/֨ܶ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v11

    sub-int/2addr v11, v4

    iget-object v12, v0, Ll/֨ܶ֡;->ۧ:Ll/ۧۜۚ;

    invoke-virtual {v12, v11}, Ll/ۧۜۚ;->֫(I)I

    move-result v11

    .line 0
    invoke-static {v9, v4}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v9

    .line 624
    check-cast v9, Ll/᩺֫ۚ;

    invoke-interface {v9}, Ll/᩺֫ۚ;->ۚ()I

    move-result v9

    add-int/2addr v9, v11

    .line 626
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۚ֫ۚ;

    .line 627
    invoke-interface {v11}, Ll/ۚ֫ۚ;->֫()I

    move-result v15

    .line 628
    invoke-interface {v11}, Ll/ۚ֫ۚ;->ܽ()I

    move-result v13

    add-int v14, v13, v15

    if-ge v15, v9, :cond_c

    if-gt v14, v9, :cond_b

    add-int/lit8 v13, v14, -0x1

    .line 647
    invoke-virtual {v12, v13, v7}, Ll/ۧۜۚ;->֫(IZ)I

    move-result v13

    .line 648
    invoke-virtual {v12, v13}, Ll/ۧۜۚ;->֫(I)I

    move-result v21

    .line 650
    invoke-interface {v11}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۖ֫ۚ;

    const/4 v13, 0x0

    .line 651
    invoke-interface {v7}, Ll/ۖ֫ۚ;->۟()I

    move-result v6

    if-ge v6, v9, :cond_a

    .line 658
    new-instance v13, Ll/֡۠֡;

    iget-object v4, v0, Ll/֨ܶ֡;->ᩳ:Ll/ۚܶ֡;

    .line 659
    invoke-interface {v7}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v17

    iget-object v7, v0, Ll/֨ܶ֡;->ۜ:Ll/᩹ܶ֡;

    move-object/from16 v22, v13

    move/from16 v23, v14

    move-object v14, v7

    move v7, v15

    move-object v15, v4

    move/from16 v16, v21

    move/from16 v18, v7

    move/from16 v19, v23

    move/from16 v20, v6

    invoke-direct/range {v13 .. v20}, Ll/֡۠֡;-><init>(Ll/᩹ܶ֡;Ll/ۚܶ֡;ILjava/lang/String;III)V

    move-object/from16 v4, v22

    .line 660
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    move v15, v7

    move/from16 v14, v23

    const/4 v4, 0x1

    const/16 v6, 0xa

    const/4 v7, 0x0

    goto :goto_3

    .line 653
    :cond_a
    new-instance v1, Ll/ܶ᩵ۚ;

    .line 654
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x1

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v13

    const/4 v2, 0x0

    const-string v4, "Exception handler offset %d is past the end of the code block."

    .line 46
    invoke-direct {v1, v2, v4, v3}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    throw v1

    :cond_b
    move/from16 v23, v14

    const/4 v1, 0x0

    .line 636
    new-instance v2, Ljava/lang/RuntimeException;

    .line 637
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    const-string v1, "Try end offset %d is past the end of the code block."

    .line 636
    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_c
    move v7, v15

    const/4 v1, 0x0

    .line 631
    new-instance v2, Ljava/lang/RuntimeException;

    .line 632
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v1

    const-string v1, "Try start offset %d is past the end of the code block."

    .line 631
    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_d
    :goto_4
    const/4 v4, 0x0

    .line 453
    iget-boolean v5, v8, Ll/᩹ܶ֡;->ܿ:Z

    if-eqz v5, :cond_e

    .line 666
    invoke-interface {v10}, Ll/᩵֫ۚ;->ۢ()Ljava/lang/Iterable;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۠֫ۚ;

    .line 667
    iget-object v7, v0, Ll/֨ܶ֡;->ۢ:Ll/ܶܶ֡;

    invoke-static {v7, v6}, Ll/᩸۠֡;->֫(Ll/ܶܶ֡;Ll/۠֫ۚ;)Ll/᩸۠֡;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 457
    :cond_e
    iget-boolean v5, v8, Ll/᩹ܶ֡;->᩷:Z

    iget-object v6, v0, Ll/֨ܶ֡;->ᩳ:Ll/ۚܶ֡;

    if-eqz v5, :cond_10

    .line 672
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 673
    new-instance v7, Ljava/util/ArrayList;

    .line 713
    iget-object v8, v6, Ll/ۚܶ֡;->֫:Ljava/util/HashMap;

    invoke-virtual {v8}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v8

    .line 673
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 676
    invoke-static {v7}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 678
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩵ܶ֡;

    .line 679
    invoke-virtual {v8}, Ll/᩵ܶ֡;->ۢ()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    if-nez v9, :cond_f

    .line 681
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 683
    :cond_f
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-virtual {v8, v10}, Ll/᩵ܶ֡;->֫(I)V

    .line 684
    invoke-virtual {v8}, Ll/᩵ܶ֡;->ۢ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/4 v10, 0x1

    add-int/2addr v9, v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v5, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 713
    :cond_10
    iget-object v4, v6, Ll/ۚܶ֡;->֫:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    .line 462
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v6

    add-int/2addr v6, v5

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 463
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵ܶ֡;

    .line 466
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 469
    :cond_11
    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 360
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠ܶ֡;

    .line 361
    invoke-virtual {v5, v1}, Ll/۠ܶ֡;->֫(Ll/ۗ᩵ۚ;)Z

    move-result v6

    if-eqz v6, :cond_12

    const/16 v6, 0xa

    .line 362
    invoke-virtual {v1, v6}, Ll/ۗ᩵ۚ;->write(I)V

    goto :goto_9

    :cond_12
    const/16 v6, 0xa

    .line 364
    :goto_9
    invoke-virtual {v5}, Ll/۠ܶ֡;->ܿ()V

    goto :goto_8

    .line 366
    :cond_13
    invoke-virtual {v2, v3}, Ll/֨۫ۡ;->֫(Ljava/util/ArrayList;)V

    .line 367
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩵ۚ;->֫()V

    const-string v2, ".end method\n"

    const/16 v3, 0xc

    const/4 v4, 0x0

    .line 116
    invoke-virtual {v1, v2, v4, v3}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    return-void
.end method

.method public final ۧ(I)I
    .locals 1

    .line 439
    iget-object v0, p0, Ll/֨ܶ֡;->ۡ:Ll/᩺᩵ۚ;

    invoke-virtual {v0, p1}, Ll/᩺᩵ۚ;->֫(I)I

    move-result p1

    return p1
.end method

.method public final ۧ(ILl/֨ۗ֡;)Ll/᩺֫ۚ;
    .locals 5

    .line 374
    :try_start_0
    iget-object v0, p0, Ll/֨ܶ֡;->ۧ:Ll/ۧۜۚ;

    const/4 v1, 0x1

    .line 57
    invoke-virtual {v0, p1, v1}, Ll/ۧۜۚ;->֫(IZ)I

    move-result v0
    :try_end_0
    .catch Ll/֫ۜۚ; {:try_start_0 .. :try_end_0} :catch_0

    .line 382
    iget-object v2, p0, Ll/֨ܶ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺֫ۚ;

    .line 383
    invoke-interface {v3}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v4

    if-eq v4, p2, :cond_1

    .line 385
    invoke-interface {v3}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v3

    sget-object v4, Ll/֨ۗ֡;->ۖܳ:Ll/֨ۗ֡;

    if-ne v3, v4, :cond_0

    add-int/2addr v0, v1

    .line 387
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 388
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺֫ۚ;

    .line 389
    invoke-interface {v0}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    if-ne v1, p2, :cond_0

    return-object v0

    .line 394
    :cond_0
    new-instance p2, Ll/֡ܶ֡;

    invoke-direct {p2, p1}, Ll/֡ܶ֡;-><init>(I)V

    throw p2

    :cond_1
    return-object v3

    .line 376
    :catch_0
    new-instance p2, Ll/֡ܶ֡;

    invoke-direct {p2, p1}, Ll/֡ܶ֡;-><init>(I)V

    throw p2
.end method

.method public final ۧ()V
    .locals 4

    .line 123
    iget-object v0, p0, Ll/֨ܶ֡;->᩷:Ll/᩺᩵ۚ;

    sget-object v1, Ll/֨ܶ֡;->ۘ:Ll/֡ۛۡ;

    invoke-virtual {v1, v0}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    .line 124
    iget-object v0, p0, Ll/֨ܶ֡;->ۡ:Ll/᩺᩵ۚ;

    invoke-virtual {v1, v0}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    .line 125
    iget-object v0, p0, Ll/֨ܶ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺֫ۚ;

    .line 126
    instance-of v3, v2, Ll/֫ܰ֡;

    if-eqz v3, :cond_1

    .line 127
    check-cast v2, Ll/֫ܰ֡;

    .line 104
    iget-object v3, v2, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v3, v2}, Ll/۬ۛ֡;->֫(Ll/֫ܰ֡;)V

    goto :goto_0

    .line 128
    :cond_1
    instance-of v3, v2, Ll/᩶᩺֡;

    if-eqz v3, :cond_2

    .line 129
    check-cast v2, Ll/᩶᩺֡;

    .line 83
    iget-object v3, v2, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v3, v2}, Ll/۬ۛ֡;->֫(Ll/᩶᩺֡;)V

    goto :goto_0

    .line 130
    :cond_2
    instance-of v3, v2, Ll/ۖ᩺֡;

    if-eqz v3, :cond_0

    .line 131
    check-cast v2, Ll/ۖ᩺֡;

    .line 53
    iget-object v3, v2, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v3, v2}, Ll/۬ۛ֡;->֫(Ll/ۖ᩺֡;)V

    goto :goto_0

    .line 134
    :cond_3
    iget-object v1, p0, Ll/֨ܶ֡;->֫:Ljava/util/ArrayList;

    sget-object v2, Ll/֨ܶ֡;->ܺ:Ll/֨۫ۡ;

    invoke-virtual {v2, v1}, Ll/֨۫ۡ;->֫(Ljava/util/ArrayList;)V

    .line 135
    invoke-virtual {v2, v0}, Ll/֨۫ۡ;->֫(Ljava/util/ArrayList;)V

    return-void
.end method
