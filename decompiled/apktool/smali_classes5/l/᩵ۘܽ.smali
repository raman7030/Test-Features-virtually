.class public final Ll/᩵ۘܽ;
.super Ll/ۡۘܽ;
.source "81EW"


# static fields
.field public static final ۜ:Ll/֡ۛۡ;

.field public static final ۢ:Ll/֡ۛۡ;

.field public static final ᩷:Ll/֡ۛۡ;


# instance fields
.field public final ܳ:Ljava/util/ArrayList;

.field public final ܿ:Ljava/util/ArrayList;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Ll/֡ۛۡ;

    const/16 v1, 0x2710

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/᩵ۘܽ;->ۜ:Ll/֡ۛۡ;

    .line 28
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/᩵ۘܽ;->᩷:Ll/֡ۛۡ;

    .line 163
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0}, Ll/֡ۛۡ;-><init>()V

    sput-object v0, Ll/᩵ۘܽ;->ۢ:Ll/֡ۛۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 68
    invoke-direct {p0}, Ll/ۡۘܽ;-><init>()V

    .line 37
    sget-object v0, Ll/᩵ۘܽ;->ۜ:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    :cond_0
    iput-object v0, p0, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    .line 51
    sget-object v0, Ll/᩵ۘܽ;->᩷:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    :cond_1
    iput-object v0, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۘܽ;)Ljava/util/Iterator;
    .locals 2

    .line 234
    iget-object p0, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/ܺۘܽ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܺۘܽ;-><init>(I)V

    .line 235
    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/ۖۘܽ;

    invoke-direct {v0, v1}, Ll/ۖۘܽ;-><init>(I)V

    .line 236
    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    .line 237
    invoke-interface {p0}, Ll/۫ۨᩴ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/᩵ۘܽ;Ljava/lang/String;)Ljava/util/Iterator;
    .locals 2

    .line 241
    iget-object p0, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/ܺۘܽ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܺۘܽ;-><init>(I)V

    .line 242
    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/ۖۘܽ;

    invoke-direct {v0, v1}, Ll/ۖۘܽ;-><init>(I)V

    .line 243
    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/ۘۘܽ;

    invoke-direct {v0, p1}, Ll/ۘۘܽ;-><init>(Ljava/lang/String;)V

    .line 244
    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    .line 245
    invoke-interface {p0}, Ll/۫ۨᩴ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/Reader;Z)Ll/᩵ۘܽ;
    .locals 1

    .line 88
    new-instance v0, Ll/۟ۖܽ;

    invoke-direct {v0}, Ll/۟ۖܽ;-><init>()V

    .line 89
    invoke-virtual {v0, p0}, Ll/۟ۖܽ;->֫(Ljava/io/Reader;)V

    .line 94
    invoke-static {v0, p1}, Ll/ۚۘܽ;->֫(Ll/۟ۖܽ;Z)Ll/ۚۘܽ;

    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 96
    new-instance p0, Ll/᩵ۘܽ;

    invoke-direct {p0}, Ll/᩵ۘܽ;-><init>()V

    return-object p0

    :cond_0
    const/4 p1, 0x0

    .line 98
    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩵ۘܽ;

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ll/᩵ۘܽ;
    .locals 1

    .line 84
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1}, Ll/᩵ۘܽ;->֫(Ljava/io/Reader;Z)Ll/᩵ۘܽ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/᩵ۘܽ;
    .locals 6

    .line 106
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 107
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܽ()I

    move-result v1

    const/4 v2, 0x0

    const v3, -0x7d8c7b6b

    if-ne v1, v3, :cond_1

    .line 108
    invoke-static {p0, v3}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 109
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۙ()I

    move-result v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 111
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v5

    .line 112
    invoke-virtual {v0, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 114
    :cond_0
    invoke-static {p0, v3}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    goto :goto_2

    :cond_1
    const v1, -0x7d8c7b6a

    .line 116
    invoke-static {p0, v1}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 117
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۙ()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    .line 119
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    .line 120
    invoke-virtual {v0, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 122
    :cond_2
    invoke-static {p0, v1}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 125
    :goto_2
    new-instance v1, Ll/᩵ۘܽ;

    invoke-direct {v1}, Ll/᩵ۘܽ;-><init>()V

    .line 96
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result v3

    const/16 v4, 0xf

    if-ne v3, v4, :cond_3

    .line 127
    invoke-virtual {v1, p0, v0}, Ll/᩵ۘܽ;->֫(Ll/۬ۜܽ;Landroid/util/SparseArray;)V

    return-object v1

    .line 98
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 99
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const-string v0, "Expected: 0x%02x, got: 0x%02x"

    .line 98
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۖ()V
    .locals 1

    .line 64
    sget-object v0, Ll/᩵ۘܽ;->ۜ:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ܽ()V

    .line 65
    sget-object v0, Ll/᩵ۘܽ;->᩷:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ܽ()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    .line 318
    const-class v2, Ll/᩵ۘܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 320
    :cond_1
    check-cast p1, Ll/᩵ۘܽ;

    .line 322
    iget-object v2, p0, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    iget-object v3, p1, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    .line 324
    :cond_2
    iget-object v2, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    iget-object v3, p1, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    .line 326
    :cond_3
    iget-object v2, p0, Ll/᩵ۘܽ;->᩻:Ljava/lang/String;

    iget-object p1, p1, Ll/᩵ۘܽ;->᩻:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    if-nez p1, :cond_5

    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 331
    iget-object v0, p0, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 332
    iget-object v1, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 333
    iget-object v0, p0, Ll/᩵ۘܽ;->᩻:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 306
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "XmlNode{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩵ۘܽ;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', line="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۡۘܽ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", column="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۡۘܽ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۡۘܽ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۡۘܽ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ᩴۘܽ;
    .locals 5

    .line 281
    iget-object v0, p0, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 282
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۘܽ;

    .line 283
    iget-object v4, v3, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 8

    .line 166
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 167
    sget-object v1, Ll/᩵ۘܽ;->ۢ:Ll/֡ۛۡ;

    invoke-virtual {v1}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤۜܽ;

    if-nez v2, :cond_0

    .line 169
    new-instance v2, Ll/ۤۜܽ;

    invoke-direct {v2}, Ll/ۤۜܽ;-><init>()V

    goto :goto_0

    .line 171
    :cond_0
    invoke-virtual {v2}, Ll/ۤۜܽ;->ᩳ()V

    :goto_0
    const/16 v3, 0xf

    .line 174
    invoke-virtual {v2, v3}, Ll/ۤۜܽ;->writeByte(I)V

    .line 175
    invoke-virtual {p0, v2, v0}, Ll/᩵ۘܽ;->֫(Ll/ۤۜܽ;Ljava/util/HashMap;)V

    const v3, -0x7d8c7b6a

    .line 177
    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 178
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v4

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 179
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v4

    new-array v5, v4, [Ljava/lang/String;

    .line 180
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 181
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    aput-object v6, v5, v7

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v4, :cond_2

    .line 183
    aget-object v7, v5, v6

    .line 184
    invoke-virtual {p1, v7}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 186
    :cond_2
    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 187
    invoke-virtual {v2}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v3

    invoke-virtual {v2}, Ll/ۤۜܽ;->size()I

    move-result v4

    invoke-virtual {p1, v3, v0, v4}, Ll/ۤۜܽ;->write([BII)V

    .line 188
    invoke-virtual {v1, v2}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;Ljava/util/HashMap;)V
    .locals 7

    .line 339
    iget-object v0, p0, Ll/᩵ۘܽ;->᩻:Ljava/lang/String;

    invoke-static {p1, p2, v0}, Ll/ۡۘܽ;->֫(Ll/ۤۜܽ;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 340
    iget v0, p0, Ll/ۡۘܽ;->ܽ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 341
    iget v0, p0, Ll/ۡۘܽ;->֫:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 342
    iget v0, p0, Ll/ۡۘܽ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 343
    iget v0, p0, Ll/ۡۘܽ;->ۧ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 344
    iget-object v0, p0, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 345
    iget-object v1, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 346
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    .line 347
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩴۘܽ;

    .line 348
    iget-object v6, v5, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    invoke-static {p1, p2, v6}, Ll/ۡۘܽ;->֫(Ll/ۤۜܽ;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 349
    iget-object v6, v5, Ll/ᩴۘܽ;->ܳ:Ljava/lang/String;

    invoke-static {p1, p2, v6}, Ll/ۡۘܽ;->֫(Ll/ۤۜܽ;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 350
    iget v6, v5, Ll/ᩴۘܽ;->ᩳ:I

    invoke-virtual {p1, v6}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 351
    iget v6, v5, Ll/ᩴۘܽ;->ۧ:I

    invoke-virtual {p1, v6}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 352
    iget v6, v5, Ll/ᩴۘܽ;->ܿ:I

    invoke-virtual {p1, v6}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 353
    iget v6, v5, Ll/ᩴۘܽ;->ܽ:I

    invoke-virtual {p1, v6}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 354
    iget v6, v5, Ll/ᩴۘܽ;->᩷:I

    invoke-virtual {p1, v6}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 355
    iget v6, v5, Ll/ᩴۘܽ;->᩻:I

    invoke-virtual {p1, v6}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 356
    iget v6, v5, Ll/ᩴۘܽ;->ۢ:I

    invoke-virtual {p1, v6}, Ll/ۤۜܽ;->ᩳ(I)V

    .line 357
    iget v5, v5, Ll/ᩴۘܽ;->ۜ:I

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->ᩳ(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 359
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_1
    if-ge v3, v0, :cond_2

    .line 360
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡۘܽ;

    .line 361
    invoke-virtual {v2}, Ll/ۡۘܽ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0xf

    goto :goto_2

    :cond_1
    const/16 v4, 0xf0

    :goto_2
    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->writeByte(I)V

    .line 362
    invoke-virtual {v2, p1, p2}, Ll/ۡۘܽ;->֫(Ll/ۤۜܽ;Ljava/util/HashMap;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ֫(Ll/۬ۜܽ;Landroid/util/SparseArray;)V
    .locals 8

    .line 71
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    iput-object v0, p0, Ll/᩵ۘܽ;->᩻:Ljava/lang/String;

    .line 369
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    iput v0, p0, Ll/ۡۘܽ;->ܽ:I

    .line 370
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    iput v0, p0, Ll/ۡۘܽ;->֫:I

    .line 371
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    iput v0, p0, Ll/ۡۘܽ;->ᩳ:I

    .line 372
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    iput v0, p0, Ll/ۡۘܽ;->ۧ:I

    .line 373
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v0

    .line 374
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v1

    .line 375
    iget-object v2, p0, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 376
    iget-object v3, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 377
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_0

    .line 379
    new-instance v6, Ll/ᩴۘܽ;

    invoke-direct {v6}, Ll/ᩴۘܽ;-><init>()V

    .line 71
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v7

    invoke-virtual {p2, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    iput-object v7, v6, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    .line 71
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v7

    invoke-virtual {p2, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    iput-object v7, v6, Ll/ᩴۘܽ;->ܳ:Ljava/lang/String;

    .line 382
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v7

    iput v7, v6, Ll/ᩴۘܽ;->ᩳ:I

    .line 383
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v7

    iput v7, v6, Ll/ᩴۘܽ;->ۧ:I

    .line 384
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v7

    iput v7, v6, Ll/ᩴۘܽ;->ܿ:I

    .line 385
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v7

    iput v7, v6, Ll/ᩴۘܽ;->ܽ:I

    .line 386
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v7

    iput v7, v6, Ll/ᩴۘܽ;->᩷:I

    .line 387
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v7

    iput v7, v6, Ll/ᩴۘܽ;->᩻:I

    .line 388
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v7

    iput v7, v6, Ll/ᩴۘܽ;->ۢ:I

    .line 389
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۙ()I

    move-result v7

    iput v7, v6, Ll/ᩴۘܽ;->ۜ:I

    .line 390
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 392
    :cond_0
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    :goto_1
    if-ge v4, v1, :cond_3

    .line 394
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/16 v2, 0xf

    if-ne v0, v2, :cond_1

    .line 397
    new-instance v0, Ll/᩵ۘܽ;

    invoke-direct {v0}, Ll/᩵ۘܽ;-><init>()V

    goto :goto_2

    :cond_1
    const/16 v2, 0xf0

    if-ne v0, v2, :cond_2

    .line 399
    new-instance v0, Ll/֨ۘܽ;

    invoke-direct {v0}, Ll/֨ۘܽ;-><init>()V

    .line 403
    :goto_2
    invoke-virtual {v0, p1, p2}, Ll/ۡۘܽ;->֫(Ll/۬ۜܽ;Landroid/util/SparseArray;)V

    .line 404
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 401
    :cond_2
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1

    :cond_3
    return-void
.end method

.method public final ۜ()Ljava/util/ArrayList;
    .locals 1

    .line 230
    iget-object v0, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۡ()Z
    .locals 4

    .line 262
    iget-object v0, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡۘܽ;

    .line 29
    invoke-virtual {v0}, Ll/ۡۘܽ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    :goto_0
    return v2
.end method

.method public final ۢ()Ll/֨ۘܽ;
    .locals 3

    .line 266
    iget-object v0, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 267
    new-instance v0, Ll/֨ۘܽ;

    invoke-direct {v0}, Ll/֨ۘܽ;-><init>()V

    const-string v1, ""

    .line 268
    iput-object v1, v0, Ll/֨ۘܽ;->ܿ:Ljava/lang/CharSequence;

    .line 269
    iget v1, p0, Ll/ۡۘܽ;->ܽ:I

    iput v1, v0, Ll/ۡۘܽ;->ܽ:I

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 272
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡۘܽ;

    .line 273
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    .line 29
    invoke-virtual {v1}, Ll/ۡۘܽ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v1}, Ll/ۡۘܽ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 35
    check-cast v1, Ll/֨ۘܽ;

    return-object v1

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 276
    :cond_2
    new-instance v0, Ll/֫ۘܽ;

    const-string v2, "Expected text"

    invoke-direct {v0, v2, v1}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ۡۘܽ;)V

    throw v0
.end method

.method public final ۧ(Ljava/lang/String;)Ll/ᩴۘܽ;
    .locals 2

    .line 291
    invoke-virtual {p0, p1}, Ll/᩵ۘܽ;->֫(Ljava/lang/String;)Ll/ᩴۘܽ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 295
    :cond_0
    new-instance v0, Ll/֫ۘܽ;

    const-string v1, "Attribute required: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ۡۘܽ;)V

    throw v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܺ()V
    .locals 5

    .line 73
    iget-object v0, p0, Ll/᩵ۘܽ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 74
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡۘܽ;

    .line 75
    invoke-virtual {v3}, Ll/ۡۘܽ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 76
    invoke-virtual {v3}, Ll/ۡۘܽ;->֫()Ll/᩵ۘܽ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩵ۘܽ;->ܺ()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 45
    :cond_1
    iget-object v1, p0, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 46
    sget-object v2, Ll/᩵ۘܽ;->ۜ:Ll/֡ۛۡ;

    invoke-virtual {v2, v1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 60
    sget-object v1, Ll/᩵ۘܽ;->᩷:Ll/֡ۛۡ;

    invoke-virtual {v1, v0}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 222
    iget-object v0, p0, Ll/᩵ۘܽ;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ljava/util/ArrayList;
    .locals 1

    .line 226
    iget-object v0, p0, Ll/᩵ۘܽ;->ܿ:Ljava/util/ArrayList;

    return-object v0
.end method
