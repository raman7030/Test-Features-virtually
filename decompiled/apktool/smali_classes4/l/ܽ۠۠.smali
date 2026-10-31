.class public final Ll/ܽ۠۠;
.super Ll/ᩳ۠۠;
.source "G3L1"

# interfaces
.implements Ljava/io/Closeable;
.implements Ll/ۜ֡֨;


# instance fields
.field public ۗ:Ljava/util/Stack;

.field public ۙ:Ljava/util/LinkedHashMap;

.field public ᩶:Ljava/util/EnumSet;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 5

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    sget-object v0, Ll/ᩳ۠۠;->᩸:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 297
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Ll/ܽ۠۠;->ۗ:Ljava/util/Stack;

    .line 302
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ܽ۠۠;->ۙ:Ljava/util/LinkedHashMap;

    .line 130
    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v0

    const-string v1, "debug.completionDeps"

    .line 131
    invoke-virtual {v0, v1}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 132
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    const-string v4, "file="

    .line 133
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x5

    .line 134
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/ܽ۠۠;->᩹:Ljava/lang/String;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 138
    :cond_1
    invoke-static {v0}, Ll/ܰ֨۠;->֫([Ljava/lang/String;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/ܽ۠۠;->᩶:Ljava/util/EnumSet;

    .line 140
    invoke-static {p1}, Ll/ۙۡ۠;->֫(Ll/ۗ֨۠;)Ll/ۙۡ۠;

    move-result-object p1

    .line 141
    iget-object v0, p1, Ll/ۙۡ۠;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v1, Ll/ۖܶ۠;

    invoke-direct {v1, p0, v0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    .line 141
    iput-object v1, p1, Ll/ۙۡ۠;->ܳ:Ll/ۖܶ۠;

    return-void
.end method

.method public static ۧ(Ll/ۗ֨۠;)V
    .locals 2

    .line 121
    new-instance v0, Ll/ۛ֨۠;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ll/ᩳ۠۠;->᩸:Ll/ۙ֨۠;

    invoke-virtual {p0, v1, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ll/᩶֨۠;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 337
    sget-object v0, Ll/ܰ֨۠;->ۙ:Ll/ܰ֨۠;

    iget-object v1, p0, Ll/ܽ۠۠;->᩶:Ljava/util/EnumSet;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Ll/ܽ۠۠;->ۙ:Ljava/util/LinkedHashMap;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 339
    new-instance v0, Ll/ۧ۠۠;

    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 339
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Ll/ᩴ۠۠;->֫(Ljava/util/Collection;Ljava/lang/StringBuilder;)V

    .line 341
    :cond_0
    sget-object v0, Ll/ܰ֨۠;->᩶:Ll/ܰ֨۠;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 343
    new-instance v0, Ll/۟֨۠;

    sget-object v4, Ll/ۨ֨۠;->ۙ:Ll/ۨ֨۠;

    invoke-direct {v0, p0, v4}, Ll/۟֨۠;-><init>(Ll/ܽ۠۠;Ll/ۨ֨۠;)V

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Ll/ᩴ۠۠;->֫(Ljava/util/Collection;Ljava/lang/StringBuilder;)V

    .line 345
    :cond_1
    sget-object v0, Ll/ܰ֨۠;->ۗ:Ll/ܰ֨۠;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 347
    new-instance v0, Ll/۟֨۠;

    sget-object v1, Ll/ۨ֨۠;->᩶:Ll/ۨ֨۠;

    invoke-direct {v0, p0, v1}, Ll/۟֨۠;-><init>(Ll/ܽ۠۠;Ll/ۨ֨۠;)V

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ll/ᩴ۠۠;->֫(Ljava/util/Collection;Ljava/lang/StringBuilder;)V

    .line 349
    :cond_2
    iget-object v0, p0, Ll/ܽ۠۠;->᩹:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 351
    new-instance v1, Ljava/io/FileWriter;

    invoke-direct {v1, v0}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V

    .line 352
    :try_start_0
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v2, "CompletionDeps"

    const-string v3, ""

    invoke-static {v0, v2, v3}, Ll/ۚ۠۠;->֫(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 353
    invoke-virtual {v1}, Ljava/io/Writer;->close()V

    return-void

    :catchall_0
    move-exception v0

    .line 351
    :try_start_1
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0

    :cond_3
    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 332
    iget-object v0, p0, Ll/ܽ۠۠;->ۗ:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ۛ֡֨;)V
    .locals 2

    .line 359
    move-object v0, p1

    check-cast v0, Ll/ܳ֡֨;

    sget-object v1, Ll/۫֨۠;->ۤ:Ll/۫֨۠;

    invoke-virtual {p0, v0, v1}, Ll/ܽ۠۠;->֫(Ll/ܳ֡֨;Ll/۫֨۠;)V

    .line 360
    invoke-virtual {p0}, Ll/ܽ۠۠;->֫()V

    .line 361
    iput-object p0, p1, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    return-void
.end method

.method public final ֫(Ll/ܳ֡֨;Ll/۫֨۠;)V
    .locals 4

    .line 306
    new-instance v0, Ll/᩺֨۠;

    invoke-direct {v0, p1}, Ll/᩺֨۠;-><init>(Ll/ܳ֡֨;)V

    .line 316
    iget-object v1, p0, Ll/ܽ۠۠;->ۙ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫۠۠;

    if-nez v2, :cond_0

    .line 318
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v0

    .line 322
    :cond_0
    iget-object v1, p0, Ll/ܽ۠۠;->ۗ:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 323
    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫۠۠;

    .line 197
    iget-object v3, v3, Ll/֫۠۠;->᩹:Ljava/util/EnumMap;

    invoke-virtual {v3, p2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 198
    invoke-interface {p2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 199
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 326
    :cond_1
    invoke-virtual {v1, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    if-ne v0, v2, :cond_2

    .line 308
    iput-object p0, p1, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    :cond_2
    return-void
.end method

.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
