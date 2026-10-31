.class public final Ll/ۗۧۧ;
.super Ll/᩸֫ۧ;
.source "Q8S7"


# static fields
.field public static final ܳ֫:Ll/ۧ᩵֫;


# instance fields
.field public ֫֫:Ll/᩶ۧۧ;

.field public final ۟:[Ll/ۘۧۧ;

.field public final ۧ֫:Ljava/util/ArrayList;

.field public final ܰ:Ljava/util/ArrayList;

.field public ܽ֫:I

.field public final ܿ֫:[Ll/ۙ᩵֫;

.field public ᩳ֫:[[J

.field public final ᩺:Ll/ᩳ᩸ۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 82
    new-instance v0, Ll/᩹ᩴ֫;

    invoke-direct {v0}, Ll/᩹ᩴ֫;-><init>()V

    const-string v1, "MergingMediaSource"

    .line 83
    invoke-virtual {v0, v1}, Ll/᩹ᩴ֫;->֫(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/᩹ᩴ֫;->֫()Ll/ۧ᩵֫;

    move-result-object v0

    sput-object v0, Ll/ۗۧۧ;->ܳ֫:Ll/ۧ᩵֫;

    return-void
.end method

.method public varargs constructor <init>([Ll/ۘۧۧ;)V
    .locals 4

    .line 136
    new-instance v0, Ll/ᩳ᩸ۡ;

    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 159
    invoke-direct {p0}, Ll/᩸֫ۧ;-><init>()V

    .line 162
    iput-object p1, p0, Ll/ۗۧۧ;->۟:[Ll/ۘۧۧ;

    .line 163
    iput-object v0, p0, Ll/ۗۧۧ;->᩺:Ll/ᩳ᩸ۡ;

    .line 164
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۗۧۧ;->ۧ֫:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 165
    iput v0, p0, Ll/ۗۧۧ;->ܽ֫:I

    .line 166
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۗۧۧ;->ܰ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 167
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 168
    iget-object v2, p0, Ll/ۗۧۧ;->ܰ:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 170
    :cond_0
    array-length p1, p1

    new-array p1, p1, [Ll/ۙ᩵֫;

    iput-object p1, p0, Ll/ۗۧۧ;->ܿ֫:[Ll/ۙ᩵֫;

    new-array p1, v0, [[J

    .line 171
    iput-object p1, p0, Ll/ۗۧۧ;->ᩳ֫:[[J

    .line 172
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 173
    invoke-static {}, Ll/᩶ۤܺ;->֫()Ll/᩹ۤܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩹ۤܺ;->֫()Ll/ܶۤܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶۤܺ;->ܽ()Ll/ۗ۫ܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ۢۧۧ;
    .locals 11

    .line 209
    iget-object v0, p0, Ll/ۗۧۧ;->۟:[Ll/ۘۧۧ;

    array-length v1, v0

    new-array v2, v1, [Ll/ۢۧۧ;

    .line 210
    iget-object v3, p0, Ll/ۗۧۧ;->ܿ֫:[Ll/ۙ᩵֫;

    const/4 v4, 0x0

    aget-object v5, v3, v4

    iget-object v6, p1, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v5, v6}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v5

    :goto_0
    if-ge v4, v1, :cond_0

    .line 212
    aget-object v6, v3, v4

    invoke-virtual {v6, v5}, Ll/ۙ᩵֫;->֫(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p1, v6}, Ll/ܺۧۧ;->֫(Ljava/lang/Object;)Ll/ܺۧۧ;

    move-result-object v6

    .line 213
    aget-object v7, v0, v4

    iget-object v8, p0, Ll/ۗۧۧ;->ᩳ֫:[[J

    aget-object v8, v8, v5

    aget-wide v9, v8, v4

    sub-long v8, p3, v9

    .line 214
    invoke-interface {v7, v6, p2, v8, v9}, Ll/ۘۧۧ;->֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ۢۧۧ;

    move-result-object v7

    aput-object v7, v2, v4

    .line 216
    iget-object v7, p0, Ll/ۗۧۧ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    new-instance v8, Ll/ۙۧۧ;

    aget-object v9, v2, v4

    invoke-direct {v8, v6, v9}, Ll/ۙۧۧ;-><init>(Ll/ܺۧۧ;Ll/ۢۧۧ;)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 218
    :cond_0
    new-instance p1, Ll/᩹ۧۧ;

    iget-object p2, p0, Ll/ۗۧۧ;->ᩳ֫:[[J

    aget-object p2, p2, v5

    iget-object p3, p0, Ll/ۗۧۧ;->᩺:Ll/ᩳ᩸ۡ;

    invoke-direct {p1, p3, p2, v2}, Ll/᩹ۧۧ;-><init>(Ll/ᩳ᩸ۡ;[J[Ll/ۢۧۧ;)V

    return-object p1
.end method

.method public final ֫()Ll/ۧ᩵֫;
    .locals 2

    .line 178
    iget-object v0, p0, Ll/ۗۧۧ;->۟:[Ll/ۘۧۧ;

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll/ۘۧۧ;->֫()Ll/ۧ᩵֫;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ll/ۗۧۧ;->ܳ֫:Ll/ۧ᩵֫;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ll/ܺۧۧ;)Ll/ܺۧۧ;
    .locals 4

    .line 54
    check-cast p1, Ljava/lang/Integer;

    .line 303
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Ll/ۗۧۧ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 304
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 305
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙۧۧ;

    invoke-static {v3}, Ll/ۙۧۧ;->ۧ(Ll/ۙۧۧ;)Ll/ܺۧۧ;

    move-result-object v3

    invoke-virtual {v3, p2}, Ll/ܺۧۧ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 306
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙۧۧ;

    invoke-static {p1}, Ll/ۙۧۧ;->ۧ(Ll/ۙۧۧ;)Ll/ܺۧۧ;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۢ֫ۧ;Ll/ۙ᩵֫;)V
    .locals 6

    .line 54
    check-cast p1, Ljava/lang/Integer;

    .line 272
    iget-object v0, p0, Ll/ۗۧۧ;->֫֫:Ll/᩶ۧۧ;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 275
    :cond_0
    iget v0, p0, Ll/ۗۧۧ;->ܽ֫:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 276
    invoke-virtual {p3}, Ll/ۙ᩵֫;->֫()I

    move-result v0

    iput v0, p0, Ll/ۗۧۧ;->ܽ֫:I

    goto :goto_0

    .line 277
    :cond_1
    invoke-virtual {p3}, Ll/ۙ᩵֫;->֫()I

    move-result v0

    iget v1, p0, Ll/ۗۧۧ;->ܽ֫:I

    if-eq v0, v1, :cond_2

    .line 278
    new-instance p1, Ll/᩶ۧۧ;

    .line 76
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 278
    iput-object p1, p0, Ll/ۗۧۧ;->֫֫:Ll/᩶ۧۧ;

    return-void

    .line 281
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ۗۧۧ;->ᩳ֫:[[J

    array-length v0, v0

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۗۧۧ;->ܿ֫:[Ll/ۙ᩵֫;

    if-nez v0, :cond_3

    .line 282
    iget v0, p0, Ll/ۗۧۧ;->ܽ֫:I

    array-length v3, v2

    const/4 v4, 0x2

    new-array v4, v4, [I

    const/4 v5, 0x1

    aput v3, v4, v5

    aput v0, v4, v1

    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[J

    iput-object v0, p0, Ll/ۗۧۧ;->ᩳ֫:[[J

    .line 284
    :cond_3
    iget-object v0, p0, Ll/ۗۧۧ;->ۧ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 285
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aput-object p3, v2, p1

    .line 286
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 290
    aget-object p1, v2, v1

    .line 295
    invoke-virtual {p0, p1}, Ll/ۢ֫ۧ;->֫(Ll/ۙ᩵֫;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 2

    .line 193
    invoke-super {p0, p1}, Ll/᩸֫ۧ;->֫(Ll/֡ܶ֫;)V

    const/4 p1, 0x0

    .line 194
    :goto_0
    iget-object v0, p0, Ll/ۗۧۧ;->۟:[Ll/ۘۧۧ;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 195
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aget-object v0, v0, p1

    invoke-virtual {p0, v1, v0}, Ll/᩸֫ۧ;->֫(Ljava/lang/Object;Ll/ۘۧۧ;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۢۧۧ;)V
    .locals 6

    .line 245
    check-cast p1, Ll/᩹ۧۧ;

    const/4 v0, 0x0

    .line 246
    :goto_0
    iget-object v1, p0, Ll/ۗۧۧ;->۟:[Ll/ۘۧۧ;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 247
    iget-object v2, p0, Ll/ۗۧۧ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 248
    invoke-virtual {p1, v0}, Ll/᩹ۧۧ;->֫(I)Ll/ۢۧۧ;

    move-result-object v3

    const/4 v4, 0x0

    .line 249
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 250
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙۧۧ;

    invoke-static {v5}, Ll/ۙۧۧ;->֫(Ll/ۙۧۧ;)Ll/ۢۧۧ;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 251
    invoke-interface {v2, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 255
    :cond_1
    :goto_2
    aget-object v1, v1, v0

    invoke-virtual {p1, v0}, Ll/᩹ۧۧ;->֫(I)Ll/ۢۧۧ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ۘۧۧ;->֫(Ll/ۢۧۧ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۧ᩵֫;)V
    .locals 2

    .line 188
    iget-object v0, p0, Ll/ۗۧۧ;->۟:[Ll/ۘۧۧ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0, p1}, Ll/ۘۧۧ;->֫(Ll/ۧ᩵֫;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 201
    iget-object v0, p0, Ll/ۗۧۧ;->֫֫:Ll/᩶ۧۧ;

    if-nez v0, :cond_0

    .line 204
    invoke-super {p0}, Ll/᩸֫ۧ;->ۧ()V

    return-void

    .line 202
    :cond_0
    throw v0
.end method

.method public final ᩷()V
    .locals 2

    .line 261
    invoke-super {p0}, Ll/᩸֫ۧ;->᩷()V

    .line 262
    iget-object v0, p0, Ll/ۗۧۧ;->ܿ֫:[Ll/ۙ᩵֫;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, -0x1

    .line 263
    iput v0, p0, Ll/ۗۧۧ;->ܽ֫:I

    .line 264
    iput-object v1, p0, Ll/ۗۧۧ;->֫֫:Ll/᩶ۧۧ;

    .line 265
    iget-object v0, p0, Ll/ۗۧۧ;->ۧ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 266
    iget-object v1, p0, Ll/ۗۧۧ;->۟:[Ll/ۘۧۧ;

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method
