.class public final Ll/ۨᩴ֡;
.super Ll/᩺ᩴ֡;
.source "S6LQ"


# instance fields
.field public final ֫:Ll/᩶֨֡;

.field public final ۧ:Ll/ۨ֨֡;


# direct methods
.method public constructor <init>(Ll/᩶֨֡;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-interface {p1}, Ll/᩶֨֡;->֫()Ll/ۨ֨֡;

    move-result-object v0

    iput-object v0, p0, Ll/ۨᩴ֡;->ۧ:Ll/ۨ֨֡;

    .line 16
    iput-object p1, p0, Ll/ۨᩴ֡;->֫:Ll/᩶֨֡;

    return-void
.end method

.method private ۧ(Ll/֡ۚ֡;)V
    .locals 2

    .line 91
    invoke-virtual {p1}, Ll/֡ۚ֡;->֫()Ll/֡ۚ֡;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_0

    .line 93
    invoke-virtual {p1}, Ll/֡ۚ֡;->ܽ()Ll/֡ۚ֡;

    move-result-object v0

    .line 94
    iget-object v1, p0, Ll/ۨᩴ֡;->֫:Ll/᩶֨֡;

    invoke-interface {v1, p1}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۚ֡;)V
    .locals 8

    .line 22
    instance-of v0, p1, Ll/֨ᩴ֡;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۨᩴ֡;->֫:Ll/᩶֨֡;

    iget-object v3, p0, Ll/ۨᩴ֡;->ۧ:Ll/ۨ֨֡;

    if-eqz v0, :cond_0

    .line 23
    check-cast p1, Ll/֨ᩴ֡;

    .line 21
    invoke-virtual {v3}, Ll/ۨ֨֡;->֫()V

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v4, "table"

    .line 66
    invoke-interface {v2, p1, v4, v0}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 33
    invoke-virtual {v3, v4, v0, v1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 23
    invoke-direct {p0, p1}, Ll/ۨᩴ֡;->ۧ(Ll/֡ۚ֡;)V

    const-string p1, "/table"

    .line 24
    invoke-virtual {v3, p1}, Ll/ۨ֨֡;->ܽ(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v3}, Ll/ۨ֨֡;->֫()V

    return-void

    .line 24
    :cond_0
    instance-of v0, p1, Ll/᩹ᩴ֡;

    if-eqz v0, :cond_1

    .line 25
    check-cast p1, Ll/᩹ᩴ֡;

    .line 30
    invoke-virtual {v3}, Ll/ۨ֨֡;->֫()V

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v4, "thead"

    .line 66
    invoke-interface {v2, p1, v4, v0}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 33
    invoke-virtual {v3, v4, v0, v1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 32
    invoke-direct {p0, p1}, Ll/ۨᩴ֡;->ۧ(Ll/֡ۚ֡;)V

    const-string p1, "/thead"

    .line 33
    invoke-virtual {v3, p1}, Ll/ۨ֨֡;->ܽ(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v3}, Ll/ۨ֨֡;->֫()V

    return-void

    .line 26
    :cond_1
    instance-of v0, p1, Ll/۠ᩴ֡;

    if-eqz v0, :cond_2

    .line 27
    check-cast p1, Ll/۠ᩴ֡;

    .line 39
    invoke-virtual {v3}, Ll/ۨ֨֡;->֫()V

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v4, "tbody"

    .line 66
    invoke-interface {v2, p1, v4, v0}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 33
    invoke-virtual {v3, v4, v0, v1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 41
    invoke-direct {p0, p1}, Ll/ۨᩴ֡;->ۧ(Ll/֡ۚ֡;)V

    const-string p1, "/tbody"

    .line 42
    invoke-virtual {v3, p1}, Ll/ۨ֨֡;->ܽ(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v3}, Ll/ۨ֨֡;->֫()V

    return-void

    .line 28
    :cond_2
    instance-of v0, p1, Ll/᩶ᩴ֡;

    if-eqz v0, :cond_3

    .line 29
    check-cast p1, Ll/᩶ᩴ֡;

    .line 48
    invoke-virtual {v3}, Ll/ۨ֨֡;->֫()V

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v4, "tr"

    .line 66
    invoke-interface {v2, p1, v4, v0}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 33
    invoke-virtual {v3, v4, v0, v1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 50
    invoke-direct {p0, p1}, Ll/ۨᩴ֡;->ۧ(Ll/֡ۚ֡;)V

    const-string p1, "/tr"

    .line 51
    invoke-virtual {v3, p1}, Ll/ۨ֨֡;->ܽ(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v3}, Ll/ۨ֨֡;->֫()V

    return-void

    .line 30
    :cond_3
    instance-of v0, p1, Ll/᩸ᩴ֡;

    if-eqz v0, :cond_a

    .line 31
    check-cast p1, Ll/᩸ᩴ֡;

    .line 57
    invoke-virtual {p1}, Ll/᩸ᩴ֡;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "th"

    goto :goto_0

    :cond_4
    const-string v0, "td"

    .line 58
    :goto_0
    invoke-virtual {v3}, Ll/ۨ֨֡;->֫()V

    .line 70
    invoke-virtual {p1}, Ll/᩸ᩴ֡;->᩷()Ll/ܶᩴ֡;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 72
    invoke-virtual {p1}, Ll/᩸ᩴ֡;->᩷()Ll/ܶᩴ֡;

    move-result-object v4

    .line 79
    sget-object v5, Ll/ۛᩴ֡;->֫:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    const/4 v6, 0x1

    if-eq v5, v6, :cond_7

    const/4 v7, 0x2

    if-eq v5, v7, :cond_6

    const/4 v7, 0x3

    if-ne v5, v7, :cond_5

    const-string v4, "right"

    goto :goto_1

    .line 87
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown alignment: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const-string v4, "center"

    goto :goto_1

    :cond_7
    const-string v4, "left"

    .line 0
    :goto_1
    new-instance v5, Ljava/util/AbstractMap$SimpleEntry;

    const-string v7, "align"

    invoke-direct {v5, v7, v4}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-array v4, v6, [Ljava/util/Map$Entry;

    aput-object v5, v4, v1

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5, v6}, Ljava/util/HashMap;-><init>(I)V

    aget-object v4, v4, v1

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_8

    invoke-static {v5}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    .line 71
    invoke-interface {v2, p1, v0, v4}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    goto :goto_2

    .line 0
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "duplicate key: "

    invoke-static {v6, v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 74
    invoke-interface {v2, p1, v0, v4}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    .line 33
    :goto_2
    invoke-virtual {v3, v0, v2, v1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 60
    invoke-direct {p0, p1}, Ll/ۨᩴ֡;->ۧ(Ll/֡ۚ֡;)V

    const-string p1, "/"

    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/ۨ֨֡;->ܽ(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v3}, Ll/ۨ֨֡;->֫()V

    :cond_a
    return-void
.end method

.method public final ۧ()Ljava/util/Set;
    .locals 6

    const/4 v0, 0x5

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 0
    const-class v3, Ll/֨ᩴ֡;

    aput-object v3, v1, v2

    const-class v3, Ll/᩹ᩴ֡;

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const-class v3, Ll/۠ᩴ֡;

    const/4 v4, 0x2

    aput-object v3, v1, v4

    const-class v3, Ll/᩶ᩴ֡;

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const-class v3, Ll/᩸ᩴ֡;

    const/4 v4, 0x4

    aput-object v3, v1, v4

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

    return-object v0
.end method
