.class public final Ll/ۤᩴܺ;
.super Ljava/lang/Object;
.source "9B7W"


# instance fields
.field public final ֫:Ll/ۢ۬ܺ;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 3

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 91
    invoke-static {}, Ll/ۢ۬ܺ;->᩻()Ll/ۜ۬ܺ;

    move-result-object v0

    .line 92
    check-cast p1, Ll/ۢ۬ܺ;

    .line 67
    invoke-virtual {p1}, Ll/ۢ۬ܺ;->entrySet()Ll/ۛ۬ܺ;

    move-result-object p1

    .line 92
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 93
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ᩴܺ;

    invoke-virtual {v1}, Ll/᩺ᩴܺ;->֫()Ll/֫᩵ܺ;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    goto :goto_0

    .line 616
    :cond_0
    invoke-virtual {v0}, Ll/ۜ۬ܺ;->ۧ()Ll/ۢ۬ܺ;

    move-result-object p1

    .line 95
    iput-object p1, p0, Ll/ۤᩴܺ;->֫:Ll/ۢ۬ܺ;

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;)Ll/ۤᩴܺ;
    .locals 3

    .line 68
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 78
    new-instance p0, Ll/ۜ᩵ܺ;

    invoke-direct {p0, v0}, Ll/ۜ᩵ܺ;-><init>(Ljava/io/BufferedReader;)V

    .line 64
    :try_start_0
    new-instance v0, Ll/۫ᩴܺ;

    invoke-direct {v0}, Ll/۫ᩴܺ;-><init>()V

    .line 80
    invoke-virtual {p0, v0}, Ll/ۜ᩵ܺ;->֫(Ll/۫ᩴܺ;)V

    .line 81
    invoke-virtual {v0}, Ll/۫ᩴܺ;->֫()Ll/ۤᩴܺ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    invoke-virtual {p0}, Ll/ۜ᩵ܺ;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    .line 78
    :try_start_1
    invoke-virtual {p0}, Ll/ۜ᩵ܺ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 204
    instance-of v0, p1, Ll/ۤᩴܺ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۤᩴܺ;

    iget-object p1, p1, Ll/ۤᩴܺ;->֫:Ll/ۢ۬ܺ;

    .line 205
    iget-object v0, p0, Ll/ۤᩴܺ;->֫:Ll/ۢ۬ܺ;

    invoke-virtual {v0, p1}, Ll/ۢ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 210
    iget-object v0, p0, Ll/ۤᩴܺ;->֫:Ll/ۢ۬ܺ;

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 182
    :try_start_0
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 170
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۤᩴܺ;->֫:Ll/ۢ۬ܺ;

    .line 171
    invoke-virtual {v2}, Ll/ۢ۬ܺ;->values()Ll/᩺ۗܺ;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 172
    new-instance v2, Ll/۠ۗ᩻;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ll/۠ۗ᩻;-><init>(I)V

    invoke-static {v2}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 173
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫᩵ܺ;

    .line 174
    invoke-virtual {v2, v0}, Ll/֫᩵ܺ;->֫(Ljava/io/StringWriter;)V

    goto :goto_0

    .line 184
    :cond_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/HashMap;
    .locals 4

    .line 140
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Ll/ۤᩴܺ;->֫:Ll/ۢ۬ܺ;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 141
    invoke-virtual {v1}, Ll/ۢ۬ܺ;->entrySet()Ll/ۛ۬ܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 142
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫᩵ܺ;

    iget-object v2, v2, Ll/֫᩵ܺ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method
