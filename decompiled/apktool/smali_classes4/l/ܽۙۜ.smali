.class public final Ll/ܽۙۜ;
.super Ljava/lang/Object;
.source "Z70F"

# interfaces
.implements Ll/ܶ۠֫;


# static fields
.field public static final ۗ:Ljava/util/Set;


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ll/ܳۙۜ;

.field public final ᩹:Ll/ۤ۠֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x5

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "user-agent"

    aput-object v3, v1, v2

    const-string v3, "referer"

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const-string v3, "origin"

    const/4 v4, 0x2

    aput-object v3, v1, v4

    const-string v3, "accept"

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const-string v3, "accept-language"

    const/4 v4, 0x4

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

    .line 20
    sput-object v0, Ll/ܽۙۜ;->ۗ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ܳۙۜ;)V
    .locals 6

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p2, p0, Ll/ܽۙۜ;->᩸:Ll/ܳۙۜ;

    .line 31
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܽۙۜ;->֫(Ljava/net/URL;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۙۜ;->ۙ:Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    new-instance v0, Ll/ۤ۠֫;

    invoke-direct {v0}, Ll/ۤ۠֫;-><init>()V

    iput-object v0, p0, Ll/ܽۙۜ;->᩹:Ll/ۤ۠֫;

    .line 36
    invoke-virtual {p2}, Ll/ܳۙۜ;->ܽ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    .line 37
    iput-object p1, p0, Ll/ܽۙۜ;->᩶:Ljava/lang/String;

    return-void

    .line 62
    :cond_0
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ll/ܳۙۜ;->֫()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 64
    new-instance v1, Ljava/util/TreeMap;

    sget-object v2, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v1, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 65
    invoke-virtual {p2}, Ll/ܳۙۜ;->ܽ()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 66
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

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

    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3a

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 67
    invoke-static {v0, v2}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-static {p1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p1

    .line 39
    iput-object p1, p0, Ll/ܽۙۜ;->᩶:Ljava/lang/String;

    .line 40
    iget-object p1, p0, Ll/ܽۙۜ;->᩹:Ll/ۤ۠֫;

    invoke-virtual {p2}, Ll/ܳۙۜ;->ܽ()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۤ۠֫;->֫(Ljava/util/Map;)V

    new-instance p2, Ll/ܰܶۜ;

    invoke-direct {p2, p0}, Ll/ܰܶۜ;-><init>(Ljava/lang/Object;)V

    .line 41
    invoke-virtual {p1, p2}, Ll/ۤ۠֫;->֫(Ll/ܰܶۜ;)V

    return-void

    :catch_0
    move-exception p1

    .line 33
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid stream source URL"

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static ֫(Ljava/net/URL;)Ljava/lang/String;
    .locals 4

    .line 75
    invoke-virtual {p0}, Ljava/net/URL;->getPort()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/net/URL;->getDefaultPort()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/net/URL;->getPort()I

    move-result v0

    .line 76
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    invoke-virtual {p0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x3a

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/net/URL;Ljava/util/AbstractMap;)Ljava/util/Map;
    .locals 3

    .line 47
    iget-object v0, p0, Ll/ܽۙۜ;->᩸:Ll/ܳۙۜ;

    invoke-virtual {v0}, Ll/ܳۙۜ;->֫()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/ܽۙۜ;->ۙ:Ljava/lang/String;

    invoke-static {p1}, Ll/ܽۙۜ;->֫(Ljava/net/URL;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 50
    :cond_0
    new-instance p1, Ljava/util/TreeMap;

    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {p1, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 51
    invoke-virtual {p1, p2}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 52
    invoke-virtual {v0}, Ll/ܳۙۜ;->ܽ()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 53
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ܽۙۜ;->ۗ:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 54
    invoke-virtual {p1, v0}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object p1

    :cond_3
    :goto_1
    return-object p2
.end method

.method public final ֫()Ll/᩸۠֫;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ܽۙۜ;->᩹:Ll/ۤ۠֫;

    invoke-virtual {v0}, Ll/ۤ۠֫;->֫()Ll/۟۠֫;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܽۙۜ;->᩶:Ljava/lang/String;

    return-object v0
.end method
