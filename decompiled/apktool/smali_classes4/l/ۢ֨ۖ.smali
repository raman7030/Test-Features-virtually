.class public final Ll/ۢ֨ۖ;
.super Ljava/lang/Object;
.source "P9QE"

# interfaces
.implements Ll/ۡ֡ۖ;


# static fields
.field public static final ۙ:Ll/ۢ֨ۖ;

.field public static final ᩶:Ll/᩷֨ۖ;

.field public static final synthetic ᩹:I


# instance fields
.field public final ᩸:Ljava/util/TreeMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 66
    new-instance v0, Ll/ۢ֨ۖ;

    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    invoke-direct {v0, v1}, Ll/ۢ֨ۖ;-><init>(Ljava/util/TreeMap;)V

    sput-object v0, Ll/ۢ֨ۖ;->ۙ:Ll/ۢ֨ۖ;

    .line 1051
    new-instance v0, Ll/᩷֨ۖ;

    .line 1034
    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    .line 1051
    sput-object v0, Ll/ۢ֨ۖ;->᩶:Ll/᩷֨ۖ;

    return-void
.end method

.method public constructor <init>(Ljava/util/TreeMap;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/TreeMap;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Ll/ۢ֨ۖ;-><init>(Ljava/util/TreeMap;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۢ֨ۖ;)Ljava/util/TreeMap;
    .locals 0

    .line 35
    iget-object p0, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    return-object p0
.end method

.method public static ܽ()Ll/ۢ֨ۖ;
    .locals 1

    .line 58
    sget-object v0, Ll/ۢ֨ۖ;->ۙ:Ll/ۢ֨ۖ;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 74
    :cond_0
    instance-of v1, p1, Ll/ۢ֨ۖ;

    if-eqz v1, :cond_1

    check-cast p1, Ll/ۢ֨ۖ;

    iget-object p1, p1, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    iget-object v1, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 63
    sget-object v0, Ll/ۢ֨ۖ;->ۙ:Ll/ۢ֨ۖ;

    return-object v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 1055
    sget-object v0, Ll/ۢ֨ۖ;->᩶:Ll/᩷֨ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 4

    .line 177
    iget-object v0, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 178
    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 179
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜ֨ۖ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Ll/ۜ֨ۖ;->֫(I)I

    move-result v1

    add-int/2addr v2, v1

    goto :goto_0

    :cond_0
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 79
    iget-object v0, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 83
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 48
    invoke-static {}, Ll/ܳ֨ۖ;->֫()Ll/ܳ֨ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 48
    invoke-static {}, Ll/ܳ֨ۖ;->֫()Ll/ܳ֨ۖ;

    move-result-object v0

    .line 266
    invoke-virtual {v0, p0}, Ll/ܳ֨ۖ;->֫(Ll/ۢ֨ۖ;)V

    return-object v0
.end method

.method public final toByteArray()[B
    .locals 3

    .line 143
    :try_start_0
    invoke-virtual {p0}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v0

    new-array v1, v0, [B

    .line 144
    sget v2, Ll/ܳ᩷ۖ;->ۧ:I

    .line 105
    new-instance v2, Ll/ܽ᩷ۖ;

    invoke-direct {v2, v1, v0}, Ll/ܽ᩷ۖ;-><init>([BI)V

    .line 145
    invoke-virtual {p0, v2}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    .line 921
    invoke-virtual {v2}, Ll/ܽ᩷ۖ;->֫()I

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    .line 922
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 149
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Serializing to a byte array threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final toByteString()Ll/ۛۜۖ;
    .locals 3

    .line 127
    :try_start_0
    invoke-virtual {p0}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v0

    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    .line 1230
    new-instance v1, Ll/ۗۜۖ;

    invoke-direct {v1, v0}, Ll/ۗۜۖ;-><init>(I)V

    .line 128
    invoke-virtual {v1}, Ll/ۗۜۖ;->ۧ()Ll/ܳ᩷ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    .line 129
    invoke-virtual {v1}, Ll/ۗۜۖ;->֫()Ll/ۛۜۖ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 131
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Serializing to a ByteString threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 117
    sget v0, Ll/ۨۚۖ;->֫:I

    .line 103
    invoke-static {}, Ll/ۤۚۖ;->֫()Ll/ۤۚۖ;

    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Ll/ۤۚۖ;->֫(Ll/ۢ֨ۖ;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 3

    .line 105
    iget-object v0, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 106
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ֨ۖ;

    .line 107
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v1, p1}, Ll/ۜ֨ۖ;->ۧ(ILl/ܳ᩷ۖ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final ֫(Ll/ۜ۠ۖ;)V
    .locals 3

    .line 209
    move-object v0, p1

    check-cast v0, Ll/᩻᩷ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    sget-object v0, Ll/᩻۠ۖ;->᩹:Ll/᩻۠ۖ;

    .line 209
    sget-object v1, Ll/᩻۠ۖ;->᩶:Ll/᩻۠ۖ;

    iget-object v2, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    if-ne v0, v1, :cond_0

    .line 211
    invoke-virtual {v2}, Ljava/util/TreeMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 212
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ֨ۖ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1, p1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;ILl/ۜ۠ۖ;)V

    goto :goto_0

    .line 216
    :cond_0
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 217
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ֨ۖ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1, p1}, Ll/ۜ֨ۖ;->֫(Ll/ۜ֨ۖ;ILl/ۜ۠ۖ;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ܳ᩷ۖ;)V
    .locals 3

    .line 187
    iget-object v0, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 188
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ֨ۖ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v1, p1}, Ll/ۜ֨ۖ;->֫(ILl/ܳ᩷ۖ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(I)Z
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()I
    .locals 4

    .line 225
    iget-object v0, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 226
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜ֨ۖ;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Ll/ۜ֨ۖ;->ۧ(I)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final ۧ(Ll/ۜ۠ۖ;)V
    .locals 3

    .line 194
    move-object v0, p1

    check-cast v0, Ll/᩻᩷ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    sget-object v0, Ll/᩻۠ۖ;->᩹:Ll/᩻۠ۖ;

    .line 194
    sget-object v1, Ll/᩻۠ۖ;->᩶:Ll/᩻۠ۖ;

    iget-object v2, p0, Ll/ۢ֨ۖ;->᩸:Ljava/util/TreeMap;

    if-ne v0, v1, :cond_0

    .line 196
    invoke-virtual {v2}, Ljava/util/TreeMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 197
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ֨ۖ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v1, p1}, Ll/ۜ֨ۖ;->֫(ILl/ۜ۠ۖ;)V

    goto :goto_0

    .line 201
    :cond_0
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 202
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ֨ۖ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v1, p1}, Ll/ۜ֨ۖ;->֫(ILl/ۜ۠ۖ;)V

    goto :goto_1

    :cond_1
    return-void
.end method
