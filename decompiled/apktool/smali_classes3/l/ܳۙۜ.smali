.class public final Ll/ܳۙۜ;
.super Ljava/lang/Object;
.source "96ZB"


# static fields
.field public static final ܽ:Ll/ܳۙۜ;

.field public static final ᩳ:Ljava/util/Set;


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 13
    new-instance v0, Ll/ܳۙۜ;

    .line 14
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܳۙۜ;-><init>(Ljava/util/Map;Z)V

    sput-object v0, Ll/ܳۙۜ;->ܽ:Ll/ܳۙۜ;

    const/4 v0, 0x6

    new-array v1, v0, [Ljava/lang/Object;

    const-string v3, "range"

    aput-object v3, v1, v2

    const-string v3, "accept-encoding"

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const-string v3, "content-length"

    const/4 v4, 0x2

    aput-object v3, v1, v4

    const-string v3, "transfer-encoding"

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const-string v3, "if-none-match"

    const/4 v4, 0x4

    aput-object v3, v1, v4

    const-string v3, "if-modified-since"

    const/4 v4, 0x5

    aput-object v3, v1, v4

    .line 0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, v1, v2

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "duplicate element: "

    invoke-static {v4, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 15
    sput-object v0, Ll/ܳۙۜ;->ᩳ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Z)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ll/ܳۙۜ;->ۧ:Ljava/util/Map;

    .line 25
    iput-boolean p2, p0, Ll/ܳۙۜ;->֫:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 94
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x9

    const/16 v3, 0x20

    if-ge v1, v0, :cond_1

    .line 95
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v4, v3, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v2, :cond_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-le v0, v1, :cond_3

    add-int/lit8 v4, v0, -0x1

    .line 98
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v5, v3, :cond_2

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v2, :cond_3

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 101
    :cond_3
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ll/ܳۙۜ;
    .locals 11

    .line 31
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    new-instance v1, Ljava/util/TreeSet;

    sget-object v2, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v1, v2}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 35
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-gt v4, v6, :cond_f

    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v4, v6, :cond_0

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0xa

    if-eq v6, v7, :cond_0

    goto/16 :goto_5

    :cond_0
    if-le v4, v5, :cond_1

    add-int/lit8 v6, v4, -0x1

    .line 40
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0xd

    if-ne v6, v7, :cond_1

    add-int/lit8 v6, v4, -0x1

    goto :goto_1

    :cond_1
    move v6, v4

    .line 43
    :goto_1
    invoke-virtual {p0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ܳۙۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 44
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_e

    const/16 v6, 0x3a

    .line 45
    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ltz v6, :cond_d

    .line 49
    invoke-virtual {v5, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/ܳۙۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 78
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_c

    const/4 v8, 0x0

    .line 81
    :goto_2
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v8, v9, :cond_6

    .line 82
    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x61

    if-lt v9, v10, :cond_2

    const/16 v10, 0x7a

    if-le v9, v10, :cond_5

    :cond_2
    const/16 v10, 0x41

    if-lt v9, v10, :cond_3

    const/16 v10, 0x5a

    if-le v9, v10, :cond_5

    :cond_3
    const/16 v10, 0x30

    if-lt v9, v10, :cond_4

    const/16 v10, 0x39

    if-le v9, v10, :cond_5

    :cond_4
    const-string v10, "!#$%&\'*+-.^_`|~"

    .line 84
    invoke-virtual {v10, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    if-ltz v9, :cond_c

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 53
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ܳۙۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    .line 54
    :goto_3
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v6, v8, :cond_9

    .line 55
    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x20

    if-ge v8, v9, :cond_7

    const/16 v9, 0x9

    if-ne v8, v9, :cond_8

    :cond_7
    const/16 v9, 0x7f

    if-eq v8, v9, :cond_8

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 58
    :cond_8
    new-instance p0, Ll/ᩳۙۜ;

    sget-object p1, Ll/ܿۙۜ;->ۗ:Ll/ܿۙۜ;

    invoke-direct {p0, v2, p1}, Ll/ᩳۙۜ;-><init>(ILl/ܿۙۜ;)V

    throw p0

    .line 61
    :cond_9
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    sget-object v8, Ll/ܳۙۜ;->ᩳ:Ljava/util/Set;

    invoke-interface {v8, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    .line 64
    invoke-virtual {v1, v7}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 67
    invoke-interface {v0, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 65
    :cond_a
    new-instance p0, Ll/ᩳۙۜ;

    sget-object p1, Ll/ܿۙۜ;->᩹:Ll/ܿۙۜ;

    invoke-direct {p0, v2, p1}, Ll/ᩳۙۜ;-><init>(ILl/ܿۙۜ;)V

    throw p0

    .line 62
    :cond_b
    new-instance p0, Ll/ᩳۙۜ;

    sget-object p1, Ll/ܿۙۜ;->۬:Ll/ܿۙۜ;

    invoke-direct {p0, v2, p1}, Ll/ᩳۙۜ;-><init>(ILl/ܿۙۜ;)V

    throw p0

    .line 51
    :cond_c
    new-instance p0, Ll/ᩳۙۜ;

    sget-object p1, Ll/ܿۙۜ;->ۙ:Ll/ܿۙۜ;

    invoke-direct {p0, v2, p1}, Ll/ᩳۙۜ;-><init>(ILl/ܿۙۜ;)V

    throw p0

    .line 47
    :cond_d
    new-instance p0, Ll/ᩳۙۜ;

    sget-object p1, Ll/ܿۙۜ;->᩶:Ll/ܿۙۜ;

    invoke-direct {p0, v2, p1}, Ll/ᩳۙۜ;-><init>(ILl/ܿۙۜ;)V

    throw p0

    :cond_e
    :goto_4
    add-int/lit8 v5, v4, 0x1

    add-int/lit8 v2, v2, 0x1

    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 72
    :cond_f
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_10

    if-nez p1, :cond_10

    .line 73
    sget-object p0, Ll/ܳۙۜ;->ܽ:Ll/ܳۙۜ;

    return-object p0

    :cond_10
    new-instance p0, Ll/ܳۙۜ;

    invoke-direct {p0, v0, p1}, Ll/ܳۙۜ;-><init>(Ljava/util/Map;Z)V

    return-object p0
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 109
    iget-boolean v0, p0, Ll/ܳۙۜ;->֫:Z

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 4

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    iget-object v1, p0, Ll/ܳۙۜ;->ۧ:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_0

    const/16 v3, 0xa

    .line 118
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    :cond_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 122
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/util/Map;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ܳۙۜ;->ۧ:Ljava/util/Map;

    return-object v0
.end method
