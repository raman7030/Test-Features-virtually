.class public abstract Ll/ۛ۬ܺ;
.super Ll/᩺ۗܺ;
.source "5608"

# interfaces
.implements Ljava/util/Set;
.implements Ll/ۡ۫ᩴ;


# static fields
.field public static final serialVersionUID:J = 0xdecafL

.field public static final synthetic ᩶:I


# instance fields
.field public transient ᩹:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 341
    invoke-direct {p0}, Ll/᩺ۗܺ;-><init>()V

    return-void
.end method

.method public static copyOf(Ljava/util/Collection;)Ll/ۛ۬ܺ;
    .locals 2

    .line 275
    instance-of v0, p0, Ll/ۛ۬ܺ;

    if-eqz v0, :cond_0

    instance-of v0, p0, Ljava/util/SortedSet;

    if-nez v0, :cond_0

    .line 277
    move-object v0, p0

    check-cast v0, Ll/ۛ۬ܺ;

    .line 278
    invoke-virtual {v0}, Ll/᩺ۗܺ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 282
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    .line 283
    array-length v0, p0

    invoke-static {v0, p0}, Ll/ۛ۬ܺ;->ܽ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static of()Ll/ۛ۬ܺ;
    .locals 1

    .line 79
    sget-object v0, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۛ۬ܺ;
    .locals 3

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    .line 97
    invoke-static {v0, v1}, Ll/ۛ۬ܺ;->ܽ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 414
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(I)I
    .locals 6

    const/4 v0, 0x2

    .line 236
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const v0, 0x2ccccccc

    const/4 v1, 0x1

    if-ge p0, v0, :cond_1

    add-int/lit8 v0, p0, -0x1

    .line 240
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    shl-int/2addr v0, v1

    :goto_0
    int-to-double v1, v0

    const-wide v3, 0x3fe6666666666666L    # 0.7

    mul-double v1, v1, v3

    int-to-double v3, p0

    cmpg-double v5, v1, v3

    if-gez v5, :cond_0

    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    if-ge p0, v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    const-string p0, "collection too large"

    .line 248
    invoke-static {p0, v1}, Ll/ۘܶܺ;->֫(Ljava/lang/String;Z)V

    return v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۛ۬ܺ;
    .locals 3

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    .line 106
    invoke-static {v0, v1}, Ll/ۛ۬ܺ;->ܽ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ll/ۛ۬ܺ;
    .locals 5
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 138
    array-length v0, p6

    const v1, 0x7ffffff9

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "the total number of elements must fit in an int"

    invoke-static {v1, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/String;Z)V

    .line 141
    array-length v0, p6

    const/4 v1, 0x6

    add-int/2addr v0, v1

    new-array v4, v0, [Ljava/lang/Object;

    .line 142
    aput-object p0, v4, v3

    .line 143
    aput-object p1, v4, v2

    const/4 p0, 0x2

    .line 144
    aput-object p2, v4, p0

    const/4 p0, 0x3

    .line 145
    aput-object p3, v4, p0

    const/4 p0, 0x4

    .line 146
    aput-object p4, v4, p0

    const/4 p0, 0x5

    .line 147
    aput-object p5, v4, p0

    .line 148
    array-length p0, p6

    invoke-static {p6, v3, v4, v1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 149
    invoke-static {v0, v4}, Ll/ۛ۬ܺ;->ܽ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/Iterator;)Ll/ۛ۬ܺ;
    .locals 2

    .line 312
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    sget-object p0, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    return-object p0

    .line 315
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 316
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 88
    new-instance p0, Ll/᩸ۛܺ;

    invoke-direct {p0, v0}, Ll/᩸ۛܺ;-><init>(Ljava/lang/Object;)V

    return-object p0

    .line 319
    :cond_1
    new-instance v1, Ll/۫۬ܺ;

    invoke-direct {v1}, Ll/۫۬ܺ;-><init>()V

    invoke-virtual {v1, v0}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    .line 575
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 576
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    goto :goto_0

    .line 319
    :cond_2
    invoke-virtual {v1}, Ll/۫۬ܺ;->֫()Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩴۗ֡;)Ll/ۛ۬ܺ;
    .locals 1

    .line 88
    new-instance v0, Ll/᩸ۛܺ;

    invoke-direct {v0, p0}, Ll/᩸ۛܺ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ֫([Ljava/lang/Object;)Ll/ۛ۬ܺ;
    .locals 2

    .line 331
    array-length v0, p0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 337
    array-length v0, p0

    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    invoke-static {v0, p0}, Ll/ۛ۬ܺ;->ܽ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 335
    aget-object p0, p0, v0

    .line 88
    new-instance v0, Ll/᩸ۛܺ;

    invoke-direct {v0, p0}, Ll/᩸ۛܺ;-><init>(Ljava/lang/Object;)V

    return-object v0

    .line 79
    :cond_1
    sget-object p0, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    return-object p0
.end method

.method public static synthetic ۧ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;
    .locals 0

    .line 54
    invoke-static {p0, p1}, Ll/ۛ۬ܺ;->ܽ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ܽ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;
    .locals 13

    if-eqz p0, :cond_8

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_7

    .line 177
    invoke-static {p0}, Ll/ۛ۬ܺ;->֫(I)I

    move-result v2

    .line 178
    new-array v8, v2, [Ljava/lang/Object;

    add-int/lit8 v5, v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v3, p0, :cond_3

    .line 183
    aget-object v7, p1, v3

    if-eqz v7, :cond_2

    .line 184
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v9

    .line 185
    invoke-static {v9}, Ll/ۗۗܺ;->֫(I)I

    move-result v10

    :goto_1
    and-int v11, v10, v5

    .line 187
    aget-object v12, v8, v11

    if-nez v12, :cond_0

    add-int/lit8 v10, v6, 0x1

    .line 190
    aput-object v7, p1, v6

    .line 191
    aput-object v7, v8, v11

    add-int/2addr v4, v9

    move v6, v10

    goto :goto_2

    .line 194
    :cond_0
    invoke-virtual {v12, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 233
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "at index "

    .line 0
    invoke-static {v3, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 233
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const/4 v3, 0x0

    .line 199
    invoke-static {p1, v6, p0, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    if-ne v6, v1, :cond_4

    .line 204
    aget-object p0, p1, v0

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    new-instance p1, Ll/᩸ۛܺ;

    invoke-direct {p1, p0}, Ll/᩸ۛܺ;-><init>(Ljava/lang/Object;)V

    return-object p1

    .line 206
    :cond_4
    invoke-static {v6}, Ll/ۛ۬ܺ;->֫(I)I

    move-result p0

    div-int/lit8 v2, v2, 0x2

    if-ge p0, v2, :cond_5

    .line 208
    invoke-static {v6, p1}, Ll/ۛ۬ܺ;->ܽ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0

    .line 211
    :cond_5
    array-length p0, p1

    shr-int/lit8 v0, p0, 0x1

    shr-int/lit8 p0, p0, 0x2

    add-int/2addr v0, p0

    if-ge v6, v0, :cond_6

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    :cond_6
    move-object v7, p1

    .line 212
    new-instance p0, Ll/᩷ۛܺ;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Ll/᩷ۛܺ;-><init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object p0

    .line 172
    :cond_7
    aget-object p0, p1, v0

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    new-instance p1, Ll/᩸ۛܺ;

    invoke-direct {p1, p0}, Ll/᩸ۛܺ;-><init>(Ljava/lang/Object;)V

    return-object p1

    .line 79
    :cond_8
    sget-object p0, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    return-object p0
.end method

.method public static ᩷()Ll/ۛ۬ܺ;
    .locals 4

    const/4 v0, 0x5

    new-array v1, v0, [Ljava/lang/Object;

    .line 124
    sget-object v2, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ll/ۛ۬ܺ;->ܽ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 353
    :cond_0
    instance-of v0, p1, Ll/ۛ۬ܺ;

    if-eqz v0, :cond_1

    .line 354
    invoke-virtual {p0}, Ll/ۛ۬ܺ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ll/ۛ۬ܺ;

    .line 355
    invoke-virtual {v0}, Ll/ۛ۬ܺ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 356
    invoke-virtual {p0}, Ll/ۛ۬ܺ;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 359
    :cond_1
    invoke-static {p0, p1}, Ll/ܶۛܺ;->֫(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 364
    invoke-static {p0}, Ll/ܶۛܺ;->֫(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 52
    invoke-virtual {p0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 409
    new-instance v0, Ll/ۤ۬ܺ;

    invoke-virtual {p0}, Ll/᩺ۗܺ;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۤ۬ܺ;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public ۜ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/۟ۗܺ;

    return v0
.end method

.method public ۧ()Ll/ܳ۬ܺ;
    .locals 1

    .line 376
    iget-object v0, p0, Ll/ۛ۬ܺ;->᩹:Ll/ܳ۬ܺ;

    if-nez v0, :cond_0

    .line 377
    invoke-virtual {p0}, Ll/ۛ۬ܺ;->᩻()Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ۬ܺ;->᩹:Ll/ܳ۬ܺ;

    :cond_0
    return-object v0
.end method

.method public ᩻()Ll/ܳ۬ܺ;
    .locals 2

    .line 381
    invoke-virtual {p0}, Ll/᩺ۗܺ;->toArray()[Ljava/lang/Object;

    move-result-object v0

    sget v1, Ll/ܳ۬ܺ;->᩹:I

    .line 353
    array-length v1, v0

    invoke-static {v1, v0}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method
