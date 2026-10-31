.class public final Ll/۬᩻ܺ;
.super Ll/ܿ᩷ܺ;
.source "DBCG"


# instance fields
.field public final ܳ:Ljava/util/TreeMap;

.field public ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/֫ۜܺ;)V
    .locals 2

    const-string v0, "class_defs"

    const/4 v1, 0x4

    .line 40
    invoke-direct {p0, v0, p1, v1}, Ll/ۛۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;I)V

    .line 53
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Ll/۬᩻ܺ;->ܳ:Ljava/util/TreeMap;

    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Ll/۬᩻ܺ;->᩻:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(IILl/۟ܺܺ;)I
    .locals 4

    .line 167
    iget-object v0, p0, Ll/۬᩻ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0, p3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩻ܺ;

    if-eqz v0, :cond_4

    .line 169
    invoke-virtual {v0}, Ll/ܺۜܺ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-ltz p2, :cond_3

    add-int/lit8 p2, p2, -0x1

    .line 179
    invoke-virtual {v0}, Ll/ۗ᩻ܺ;->ۜܽ()Ll/۫ܺܺ;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 181
    invoke-virtual {p3}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object p3

    .line 182
    invoke-direct {p0, p1, p2, p3}, Ll/۬᩻ܺ;->֫(IILl/۟ܺܺ;)I

    move-result p1

    .line 185
    :cond_1
    invoke-virtual {v0}, Ll/ۗ᩻ܺ;->ܳ֫()Ll/ۧۖܺ;

    move-result-object p3

    .line 186
    invoke-interface {p3}, Ll/ۧۖܺ;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 188
    invoke-interface {p3, v2}, Ll/ۧۖܺ;->getType(I)Ll/۟ܺܺ;

    move-result-object v3

    invoke-direct {p0, p1, p2, v3}, Ll/۬᩻ܺ;->֫(IILl/۟ܺܺ;)I

    move-result p1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 191
    :cond_2
    invoke-virtual {v0, p1}, Ll/ܺۜܺ;->֫(I)V

    .line 192
    iget-object p2, p0, Ll/۬᩻ܺ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    return p1

    .line 174
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "class circularity with "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return p1
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩻ܺ;)V
    .locals 3

    .line 120
    :try_start_0
    invoke-virtual {p1}, Ll/ۗ᩻ܺ;->ۢ()Ll/۫ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۜ()V

    .line 128
    iget-object v1, p0, Ll/۬᩻ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 132
    invoke-virtual {v1, v0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 129
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "already added: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 123
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "clazz == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۢ()V
    .locals 5

    .line 140
    iget-object v0, p0, Ll/۬᩻ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v1

    .line 143
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Ll/۬᩻ܺ;->᩻:Ljava/util/ArrayList;

    .line 151
    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܺܺ;

    sub-int v4, v1, v2

    .line 152
    invoke-direct {p0, v2, v4, v3}, Ll/۬᩻ܺ;->֫(IILl/۟ܺܺ;)I

    move-result v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ(Ll/ᩳᩴܺ;)V
    .locals 5

    .line 96
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 98
    iget-object v0, p0, Ll/۬᩻ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p0}, Ll/ۛۜܺ;->ܽ()I

    move-result v1

    .line 101
    :goto_0
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 102
    invoke-static {v0}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "class_defs_size: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 103
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "class_defs_off:  "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v3, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 106
    :cond_1
    invoke-virtual {p1, v0}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 107
    invoke-virtual {p1, v1}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method

.method public final ᩳ()Ljava/util/Collection;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/۬᩻ܺ;->᩻:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    return-object v0

    .line 66
    :cond_0
    iget-object v0, p0, Ll/۬᩻ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
