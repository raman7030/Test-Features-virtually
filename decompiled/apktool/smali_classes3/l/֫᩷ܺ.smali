.class public final Ll/֫᩷ܺ;
.super Ll/ܿ᩷ܺ;
.source "3BHY"


# instance fields
.field public final ܳ:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Ll/֫ۜܺ;)V
    .locals 2

    const-string v0, "string_ids"

    const/4 v1, 0x4

    .line 40
    invoke-direct {p0, v0, p1, v1}, Ll/ۛۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;I)V

    .line 47
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Ll/֫᩷ܺ;->ܳ:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬ܺܺ;)I
    .locals 1

    if-eqz p1, :cond_1

    .line 165
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 167
    iget-object v0, p0, Ll/֫᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ۜܺ;

    if-eqz p1, :cond_0

    .line 173
    invoke-virtual {p1}, Ll/ܺۜܺ;->ܿ()I

    move-result p1

    return p1

    .line 170
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 162
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "string == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;
    .locals 1

    if-eqz p1, :cond_1

    .line 67
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 69
    iget-object v0, p0, Ll/֫᩷ܺ;->ܳ:Ljava/util/TreeMap;

    check-cast p1, Ll/۬ܺܺ;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۜܺ;

    if-eqz p1, :cond_0

    return-object p1

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cst == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۢ()V
    .locals 3

    .line 183
    iget-object v0, p0, Ll/֫᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ۜܺ;

    .line 184
    invoke-virtual {v2, v1}, Ll/ܺۜܺ;->֫(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/۬ܺܺ;)V
    .locals 3

    .line 116
    new-instance v1, Ll/۟ۜܺ;

    invoke-direct {v1, p1}, Ll/۟ۜܺ;-><init>(Ll/۬ܺܺ;)V

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 130
    :try_start_0
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۜ()V

    .line 132
    invoke-virtual {v1}, Ll/۟ۜܺ;->getValue()Ll/۬ܺܺ;

    move-result-object p1

    .line 133
    iget-object v2, p0, Ll/֫᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v2, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ۜܺ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    .line 136
    monitor-exit v0

    return-void

    .line 139
    :cond_0
    :try_start_1
    iget-object v2, p0, Ll/֫᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ܽ(Ll/ᩳᩴܺ;)V
    .locals 5

    .line 84
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 86
    iget-object v0, p0, Ll/֫᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {p0}, Ll/ۛۜܺ;->ܽ()I

    move-result v1

    .line 89
    :goto_0
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 90
    invoke-static {v0}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "string_ids_size: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 91
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "string_ids_off:  "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v3, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 94
    :cond_1
    invoke-virtual {p1, v0}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 95
    invoke-virtual {p1, v1}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method

.method public final ᩳ()Ljava/util/Collection;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/֫᩷ܺ;->ܳ:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
