.class public final Ll/᩵᩶᩻;
.super Ll/ܰܺܳ;
.source "K8B6"


# instance fields
.field public ۗ:Ll/᩻ܰۡ;

.field public ۙ:Ljava/util/Map;

.field public final ۬:Ljava/util/ArrayList;

.field public ᩶:Ljava/util/Map;

.field public ᩹:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ll/ܰܺܳ;-><init>()V

    .line 35
    iput-object p1, p0, Ll/᩵᩶᩻;->۬:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;
    .locals 2

    .line 73
    check-cast p2, Ll/۫᩶᩻;

    invoke-virtual {p2}, Ll/۫᩶᩻;->ܽ()Ll/ۗ᩺ۡ;

    move-result-object p1

    .line 74
    iget-object p2, p0, Ll/᩵᩶᩻;->᩶:Ljava/util/Map;

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܶ᩵ܿ;

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    new-instance v0, Ljava/io/BufferedInputStream;

    const/4 v1, 0x0

    invoke-static {p1, p2, v1, v1, v1}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;[BLjava/lang/String;Ll/֡ۛۡ;)Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 2

    .line 102
    iget-object p2, p0, Ll/᩵᩶᩻;->᩹:Ljava/util/List;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 103
    invoke-virtual {p0, p2}, Ll/᩵᩶᩻;->֫(Z)V

    .line 105
    :cond_0
    iget-object p2, p0, Ll/᩵᩶᩻;->ۗ:Ll/᩻ܰۡ;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/֨᩺ۡ;->ۧ(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 106
    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 107
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩺ۡ;

    .line 108
    new-instance v1, Ll/۫᩶᩻;

    invoke-direct {v1, v0}, Ll/۫᩶᩻;-><init>(Ll/ۗ᩺ۡ;)V

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method public final ֫(Ljava/lang/String;)Ll/ᩳۜܳ;
    .locals 2

    const/4 v0, 0x1

    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 82
    iget-object v0, p0, Ll/᩵᩶᩻;->ۙ:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 83
    invoke-virtual {p0, v0}, Ll/᩵᩶᩻;->֫(Z)V

    .line 85
    :cond_0
    iget-object v0, p0, Ll/᩵᩶᩻;->ۙ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩺ۡ;

    if-nez v0, :cond_1

    const-string v1, "/"

    .line 86
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 87
    iget-object v0, p0, Ll/᩵᩶᩻;->ۗ:Ll/᩻ܰۡ;

    invoke-virtual {v0, p1}, Ll/֨᩺ۡ;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ll/ۗ᩺ۡ;

    :cond_1
    if-nez v0, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 89
    :cond_2
    new-instance p1, Ll/۫᩶᩻;

    invoke-direct {p1, v0}, Ll/۫᩶᩻;-><init>(Ll/ۗ᩺ۡ;)V

    return-object p1
.end method

.method public final ֫(Ljava/security/MessageDigest;)V
    .locals 2

    const-string v0, "multi-unix-zip"

    .line 94
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 95
    iget-object v0, p0, Ll/᩵᩶᩻;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 96
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 0

    .line 45
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Z)V
    .locals 7

    .line 50
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 52
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 53
    iget-object v2, p0, Ll/᩵᩶᩻;->۬:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵ܿ;

    .line 54
    new-instance v4, Ll/ᩳܰۡ;

    invoke-direct {v4, v3}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 55
    :try_start_0
    invoke-virtual {v4}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v5

    .line 56
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 57
    invoke-virtual {v4}, Ll/ᩳܰۡ;->ۘ()Ljava/util/Map;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 58
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗ᩺ۡ;

    .line 59
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 61
    :cond_0
    invoke-virtual {v4}, Ll/ᩳܰۡ;->close()V

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 54
    :try_start_1
    invoke-virtual {v4}, Ll/ᩳܰۡ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    .line 63
    :cond_1
    sget-object v2, Ll/ᩳܰۡ;->ܳ֫:Ll/۫᩺ۡ;

    invoke-static {p1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 64
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Ll/᩵᩶᩻;->᩹:Ljava/util/List;

    .line 65
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩶᩻;->ۙ:Ljava/util/Map;

    .line 66
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩶᩻;->᩶:Ljava/util/Map;

    .line 67
    new-instance v0, Ll/᩻ܰۡ;

    .line 13
    invoke-direct {v0, p1}, Ll/֨᩺ۡ;-><init>(Ljava/util/Collection;)V

    .line 67
    iput-object v0, p0, Ll/᩵᩶᩻;->ۗ:Ll/᩻ܰۡ;

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const-string v0, "multi-unix-zip"

    return-object v0
.end method
