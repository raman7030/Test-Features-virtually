.class public final Ll/ۚ᩷ܿ;
.super Ljava/lang/Object;
.source "R6ZZ"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/util/List;

.field public final ܽ:I

.field public final ܿ:Ljava/util/List;

.field public final ᩳ:Ll/ۨۘܽ;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;ILl/ۨۘܽ;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Ll/ۚ᩷ܿ;->ۧ:Ljava/util/List;

    .line 56
    iput-object p2, p0, Ll/ۚ᩷ܿ;->ܿ:Ljava/util/List;

    .line 57
    iput p3, p0, Ll/ۚ᩷ܿ;->֫:I

    .line 58
    iput-object p4, p0, Ll/ۚ᩷ܿ;->ᩳ:Ll/ۨۘܽ;

    const-string p1, ""

    .line 59
    invoke-virtual {p4, p1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۫ۘܽ;->groupCount()I

    move-result p1

    iput p1, p0, Ll/ۚ᩷ܿ;->ܽ:I

    return-void
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;)I
    .locals 3

    .line 282
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p0

    if-ltz p0, :cond_0

    if-lt v0, p0, :cond_0

    .line 283
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v1, 0x0

    .line 284
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1, p0, p2, v1, v2}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result p0

    if-eqz p0, :cond_0

    return v0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/util/List;Z)Ljava/lang/String;
    .locals 3

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 165
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    .line 166
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    if-eqz p1, :cond_0

    const-string v2, "(\\Qx\\E)"

    goto :goto_1

    :cond_0
    const-string v2, "(?:\\Qx\\E)"

    .line 167
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 170
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;I)Ll/ۚ᩷ܿ;
    .locals 9

    .line 39
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    if-ne v0, v1, :cond_8

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 44
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 45
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    const/16 v3, 0x8

    int-to-long v3, v3

    mul-long v0, v0, v3

    .line 274
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-wide/16 v5, 0x1000

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 275
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    int-to-long v7, v4

    add-long/2addr v0, v7

    cmp-long v4, v0, v5

    if-lez v4, :cond_2

    :cond_3
    cmp-long v3, v0, v5

    if-gtz v3, :cond_4

    goto :goto_2

    .line 47
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Dynamic regex template exceeds the size limit"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 149
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 150
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, v0}, Ll/ۜ᩷ܿ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    goto :goto_3

    .line 152
    :cond_6
    invoke-static {p0, v1}, Ll/ۚ᩷ܿ;->֫(Ljava/util/List;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    .line 153
    invoke-static {p0, v2}, Ll/ۚ᩷ܿ;->֫(Ljava/util/List;Z)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v1

    const-string v2, ""

    .line 154
    invoke-virtual {v0, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۫ۘܽ;->groupCount()I

    move-result v3

    .line 155
    invoke-virtual {v1, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۘܽ;->groupCount()I

    move-result v1

    .line 156
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, v3

    if-ne v1, v2, :cond_7

    .line 50
    :goto_3
    new-instance v1, Ll/ۚ᩷ܿ;

    invoke-direct {v1, p0, p1, p2, v0}, Ll/ۚ᩷ܿ;-><init>(Ljava/util/List;Ljava/util/List;ILl/ۨۘܽ;)V

    return-object v1

    .line 157
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "var() must appear in a regex atom position"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 40
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Regex template fragments and variables differ"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۨۘܽ;)Ll/ۚ᩷ܿ;
    .locals 4

    .line 32
    new-instance v0, Ll/ۚ᩷ܿ;

    .line 33
    invoke-virtual {p0}, Ll/ۨۘܽ;->pattern()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 34
    invoke-virtual {p0}, Ll/ۨۘܽ;->flags()I

    move-result v3

    invoke-direct {v0, v1, v2, v3, p0}, Ll/ۚ᩷ܿ;-><init>(Ljava/util/List;Ljava/util/List;ILl/ۨۘܽ;)V

    return-object v0
.end method

.method private ܽ(Ljava/lang/CharSequence;[I[I)V
    .locals 4

    .line 228
    array-length v0, p3

    iget-object v1, p0, Ll/ۚ᩷ܿ;->ܿ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_3

    array-length v0, p2

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_3

    .line 231
    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget v2, p3, v1

    if-ltz v2, :cond_1

    .line 232
    array-length v3, p2

    div-int/lit8 v3, v3, 0x2

    if-ge v2, v3, :cond_1

    shl-int/lit8 v2, v2, 0x1

    .line 236
    aget v3, p2, v2

    add-int/lit8 v2, v2, 0x1

    .line 237
    aget v2, p2, v2

    if-ltz v3, :cond_0

    if-lt v2, v3, :cond_0

    .line 238
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-gt v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 239
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid regex template binding range"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 233
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid regex template binding slot"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void

    .line 229
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid regex template bindings"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ᩳ(Ljava/lang/CharSequence;[I[I)I
    .locals 11

    .line 246
    invoke-direct {p0, p1, p2, p3}, Ll/ۚ᩷ܿ;->ܽ(Ljava/lang/CharSequence;[I[I)V

    .line 247
    array-length v0, p3

    int-to-long v0, v0

    const/16 v2, 0x8

    int-to-long v2, v2

    mul-long v0, v0, v2

    .line 249
    iget-object v2, p0, Ll/ۚ᩷ܿ;->ۧ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-wide/16 v4, 0x1000

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 250
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v6, v3

    add-long/2addr v0, v6

    cmp-long v3, v0, v4

    if-lez v3, :cond_0

    goto :goto_2

    .line 253
    :cond_1
    array-length v2, p3

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_6

    aget v6, p3, v3

    shl-int/lit8 v6, v6, 0x1

    .line 255
    aget v7, p2, v6

    add-int/lit8 v6, v6, 0x1

    .line 256
    aget v6, p2, v6

    sub-int v8, v6, v7

    int-to-long v8, v8

    add-long/2addr v0, v8

    cmp-long v8, v0, v4

    if-lez v8, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    add-int/lit8 v8, v7, 0x1

    if-ge v8, v6, :cond_5

    .line 260
    invoke-interface {p1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    const/16 v10, 0x5c

    if-ne v9, v10, :cond_4

    invoke-interface {p1, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    const/16 v10, 0x45

    if-ne v9, v10, :cond_4

    const/4 v7, 0x5

    int-to-long v9, v7

    add-long/2addr v0, v9

    cmp-long v7, v0, v4

    if-lez v7, :cond_3

    :goto_2
    const/4 p1, -0x1

    return p1

    :cond_3
    move v7, v8

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    long-to-int p1, v0

    return p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 120
    iget v0, p0, Ll/ۚ᩷ܿ;->֫:I

    return v0
.end method

.method public final ֫(Ljava/lang/CharSequence;[I[I)Ljava/lang/String;
    .locals 9

    .line 180
    invoke-direct {p0, p1, p2, p3}, Ll/ۚ᩷ܿ;->ᩳ(Ljava/lang/CharSequence;[I[I)I

    move-result v0

    if-ltz v0, :cond_3

    .line 184
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 185
    iget-object v0, p0, Ll/ۚ᩷ܿ;->ۧ:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    :goto_0
    array-length v3, p3

    if-ge v2, v3, :cond_2

    .line 187
    aget v3, p3, v2

    shl-int/lit8 v3, v3, 0x1

    .line 188
    aget v4, p2, v3

    add-int/lit8 v3, v3, 0x1

    aget v3, p2, v3

    const-string v5, "(?:\\Q"

    .line 289
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    if-ge v4, v3, :cond_1

    .line 291
    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x5c

    if-ne v5, v6, :cond_0

    add-int/lit8 v6, v4, 0x1

    if-ge v6, v3, :cond_0

    .line 292
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    const/16 v8, 0x45

    if-ne v7, v8, :cond_0

    const-string v4, "\\E\\\\E\\Q"

    .line 293
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v4, v6

    goto :goto_2

    .line 296
    :cond_0
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    const-string v3, "\\E)"

    .line 299
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    .line 189
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 191
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 182
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Expanded regex exceeds the size limit"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 126
    :goto_0
    iget-object v2, p0, Ll/ۚ᩷ܿ;->ۧ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_8

    .line 127
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 128
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    const-string v4, " + "

    if-nez v3, :cond_5

    if-eqz v1, :cond_0

    .line 129
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const/16 v1, 0x2f

    .line 303
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    .line 304
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v3, v5, :cond_4

    .line 305
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0xa

    if-eq v5, v6, :cond_3

    const/16 v6, 0xd

    if-eq v5, v6, :cond_2

    if-eq v5, v1, :cond_1

    .line 310
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    const-string v5, "\\/"

    .line 307
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    const-string v5, "\\r"

    .line 309
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    const-string v5, "\\n"

    .line 308
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 313
    :cond_4
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    .line 133
    :cond_5
    iget-object v2, p0, Ll/ۚ᩷ܿ;->ܿ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_7

    if-eqz v1, :cond_6

    .line 134
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    const-string v1, "var(\""

    .line 135
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 10
    invoke-static {v1}, Ll/ܰ᩵ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 135
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\")"

    .line 136
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_8
    if-nez v1, :cond_9

    const-string v0, "/(?=)/"

    .line 142
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 4

    .line 78
    iget v0, p0, Ll/ۚ᩷ܿ;->֫:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 79
    iget-object v0, p0, Ll/ۚ᩷ܿ;->ܿ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ۡ(I)V

    .line 80
    iget-object v1, p0, Ll/ۚ᩷ܿ;->ۧ:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 81
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 82
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 94
    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    add-int/lit8 v2, v2, 0x1

    .line 83
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/CharSequence;[I[I)Z
    .locals 11

    .line 199
    invoke-direct {p0, p2, p3, p4}, Ll/ۚ᩷ܿ;->ܽ(Ljava/lang/CharSequence;[I[I)V

    .line 200
    iget-object v0, p0, Ll/ۚ᩷ܿ;->ۧ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, p1, v2}, Ll/ۚ᩷ܿ;->֫(ILjava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v3, 0x0

    .line 202
    :cond_1
    array-length v4, p4

    const/4 v5, 0x1

    if-ge v3, v4, :cond_8

    const-string v4, "(?:\\Q"

    .line 203
    invoke-static {v2, p1, v4}, Ll/ۚ᩷ܿ;->֫(ILjava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_2

    goto :goto_2

    .line 205
    :cond_2
    aget v4, p4, v3

    shl-int/2addr v4, v5

    .line 206
    aget v6, p3, v4

    add-int/2addr v4, v5

    .line 207
    aget v4, p3, v4

    :goto_0
    if-ge v6, v4, :cond_6

    .line 209
    invoke-interface {p2, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    const/16 v8, 0x5c

    if-ne v7, v8, :cond_4

    add-int/lit8 v8, v6, 0x1

    if-ge v8, v4, :cond_4

    .line 210
    invoke-interface {p2, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    const/16 v10, 0x45

    if-ne v9, v10, :cond_4

    const-string v6, "\\E\\\\E\\Q"

    .line 211
    invoke-static {v2, p1, v6}, Ll/ۚ᩷ܿ;->֫(ILjava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_3

    goto :goto_2

    :cond_3
    move v6, v8

    goto :goto_1

    .line 214
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v2, v8, :cond_9

    add-int/lit8 v8, v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v7, :cond_5

    goto :goto_2

    :cond_5
    move v2, v8

    :goto_1
    add-int/2addr v6, v5

    goto :goto_0

    :cond_6
    const-string v4, "\\E)"

    .line 218
    invoke-static {v2, p1, v4}, Ll/ۚ᩷ܿ;->֫(ILjava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 220
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v2, p1, v4}, Ll/ۚ᩷ܿ;->֫(ILjava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_1

    goto :goto_2

    .line 223
    :cond_8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ne v2, p1, :cond_9

    return v5

    :cond_9
    :goto_2
    return v1
.end method

.method public final ۧ()I
    .locals 1

    .line 108
    iget v0, p0, Ll/ۚ᩷ܿ;->ܽ:I

    return v0
.end method

.method public final ۧ(Ljava/lang/CharSequence;[I[I)Z
    .locals 0

    .line 175
    invoke-direct {p0, p1, p2, p3}, Ll/ۚ᩷ܿ;->ᩳ(Ljava/lang/CharSequence;[I[I)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()Z
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ۚ᩷ܿ;->ܿ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܽ()Ll/ۨۘܽ;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۚ᩷ܿ;->ᩳ:Ll/ۨۘܽ;

    return-object v0
.end method

.method public final ܿ()Ljava/util/List;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ۚ᩷ܿ;->ܿ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩳ()Ll/۟ۘܽ;
    .locals 1

    .line 104
    invoke-virtual {p0}, Ll/ۚ᩷ܿ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll/۟ۘܽ;->ۜ:Ll/۟ۘܽ;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۚ᩷ܿ;->ᩳ:Ll/ۨۘܽ;

    invoke-virtual {v0}, Ll/ۨۘܽ;->ۧ()Ll/۟ۘܽ;

    move-result-object v0

    return-object v0
.end method
