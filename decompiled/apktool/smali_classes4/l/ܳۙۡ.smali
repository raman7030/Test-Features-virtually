.class public final Ll/ܳۙۡ;
.super Ll/ۖ᩹ۢ;
.source "81UA"

# interfaces
.implements Ll/ۡ۬ۡ;
.implements Ll/ۖ۬ۡ;


# instance fields
.field public final ۧ:Ll/ۤۜܽ;

.field public final ܽ:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x2

    .line 14
    invoke-direct {p0, v0}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 22
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    iput-object v0, p0, Ll/ܳۙۡ;->ۧ:Ll/ۤۜܽ;

    .line 23
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Ll/ܳۙۡ;->ܽ:Ljava/util/LinkedHashMap;

    const v1, 0x4025b06

    .line 26
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method private ܽ(Ljava/lang/String;)I
    .locals 2

    .line 112
    iget-object v0, p0, Ll/ܳۙۡ;->ܽ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 114
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 115
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method


# virtual methods
.method public final ֫(Ljava/io/OutputStream;)V
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ܳۙۡ;->ۧ:Ll/ۤۜܽ;

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->֫(Ljava/io/OutputStream;)V

    return-void
.end method

.method public final ֫(Ll/ۗۗۡ;)V
    .locals 5

    .line 31
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܳ()Ljava/lang/String;

    move-result-object v0

    .line 33
    invoke-static {p1}, Ll/۟᩶ۡ;->ܽ(Ll/ۗۗۡ;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    move-object v1, v0

    .line 37
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 49
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܽ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ۗۡ;

    .line 50
    invoke-static {v3}, Ll/ۢۙۡ;->ۧ(Ll/۫ۗۡ;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 51
    invoke-virtual {v3}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 54
    :cond_2
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܿ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۗۡ;

    .line 55
    invoke-static {v3}, Ll/ۢۙۡ;->ۧ(Ll/۫ۗۡ;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 56
    invoke-virtual {v3}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_4
    return-void

    :cond_5
    :goto_0
    const/4 v2, 0x1

    .line 40
    iget-object v3, p0, Ll/ܳۙۡ;->ۧ:Ll/ۤۜܽ;

    invoke-virtual {v3, v2}, Ll/ۤۜܽ;->writeByte(I)V

    .line 41
    invoke-direct {p0, v0}, Ll/ܳۙۡ;->ܽ(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 42
    invoke-direct {p0, v1}, Ll/ܳۙۡ;->ܽ(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 44
    invoke-virtual {p1, p0}, Ll/᩶ۗۡ;->֫(Ll/ۖ۬ۡ;)V

    .line 45
    invoke-virtual {p1, p0}, Ll/᩶ۗۡ;->ۧ(Ll/ۖ۬ۡ;)V

    return-void
.end method

.method public final ֫(Ll/ۗۗۡ;Ll/ۤۗۡ;)V
    .locals 3

    .line 79
    invoke-static {p2}, Ll/ۢۙۡ;->ۧ(Ll/۫ۗۡ;)Ljava/lang/String;

    move-result-object p1

    .line 80
    invoke-virtual {p2}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_0

    move-object p1, v0

    .line 83
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x3

    .line 86
    iget-object v2, p0, Ll/ܳۙۡ;->ۧ:Ll/ۤۜܽ;

    invoke-virtual {v2, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 87
    invoke-virtual {p2}, Ll/ۙۗۡ;->ܽ()Ll/ܽۙۡ;

    move-result-object p2

    .line 121
    invoke-virtual {p2}, Ll/ܽۙۡ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Ll/ܳۙۡ;->ܽ(Ljava/lang/String;)I

    move-result p2

    .line 87
    invoke-virtual {v2, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 88
    invoke-direct {p0, v0}, Ll/ܳۙۡ;->ܽ(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v2, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 89
    invoke-direct {p0, p1}, Ll/ܳۙۡ;->ܽ(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v2, p1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public final ֫(Ll/ۗۗۡ;Ll/۬ۗۡ;)V
    .locals 3

    .line 64
    invoke-static {p2}, Ll/ۢۙۡ;->ۧ(Ll/۫ۗۡ;)Ljava/lang/String;

    move-result-object p1

    .line 65
    invoke-virtual {p2}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_0

    .line 67
    invoke-virtual {p2}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    .line 68
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x2

    .line 71
    iget-object v2, p0, Ll/ܳۙۡ;->ۧ:Ll/ۤۜܽ;

    invoke-virtual {v2, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 72
    invoke-virtual {p2}, Ll/ۙۗۡ;->ܽ()Ll/ܽۙۡ;

    move-result-object p2

    .line 121
    invoke-virtual {p2}, Ll/ܽۙۡ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Ll/ܳۙۡ;->ܽ(Ljava/lang/String;)I

    move-result p2

    .line 72
    invoke-virtual {v2, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 73
    invoke-direct {p0, v0}, Ll/ܳۙۡ;->ܽ(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v2, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 74
    invoke-direct {p0, p1}, Ll/ܳۙۡ;->ܽ(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v2, p1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public final ܳ()V
    .locals 7

    .line 93
    iget-object v0, p0, Ll/ܳۙۡ;->ۧ:Ll/ۤۜܽ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 94
    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v2

    .line 95
    iget-object v3, p0, Ll/ܳۙۡ;->ܽ:Ljava/util/LinkedHashMap;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v4

    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 97
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    add-int/lit8 v5, v1, 0x1

    .line 98
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v1, v6, :cond_0

    .line 101
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    move v1, v5

    goto :goto_0

    .line 99
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 103
    :cond_1
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    const v1, 0x4025b06

    .line 104
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method
