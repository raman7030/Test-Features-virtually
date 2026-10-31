.class public final Ll/ۗܳ۠;
.super Ll/۫ܳ۠;
.source "U7M7"


# instance fields
.field public final ᩻:Ll/᩷۠ᩴ;


# direct methods
.method public constructor <init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V
    .locals 0

    .line 164
    invoke-direct {p0, p1, p2}, Ll/۫ܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;)V

    .line 165
    iput-object p3, p0, Ll/ۗܳ۠;->᩻:Ll/᩷۠ᩴ;

    return-void
.end method

.method public constructor <init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;I)V
    .locals 0

    .line 164
    invoke-direct {p0, p1, p2}, Ll/۫ܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;)V

    .line 165
    iput-object p3, p0, Ll/ۗܳ۠;->᩻:Ll/᩷۠ᩴ;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 2

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۗܳ۠;->᩻:Ll/᩷۠ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JarFileObject["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗܳ۠;->᩻:Ll/᩷۠ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toUri()Ljava/net/URI;
    .locals 6

    .line 185
    iget-object v0, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "jar:"

    .line 202
    iget-object v2, p0, Ll/ۗܳ۠;->᩻:Ll/᩷۠ᩴ;

    invoke-interface {v2}, Ll/᩷۠ᩴ;->toUri()Ljava/net/URI;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URI;->normalize()Ljava/net/URI;

    move-result-object v2

    const-string v3, "/"

    .line 203
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "!"

    goto :goto_0

    :cond_0
    const-string v3, "!/"

    .line 206
    :goto_0
    :try_start_0
    new-instance v4, Ljava/net/URI;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    :catch_0
    move-exception v1

    .line 208
    new-instance v4, Ll/᩶ܳ۠;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 551
    invoke-direct {v4, v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 208
    throw v4
.end method

.method public final ֫(Ljava/util/Collection;)Ljava/lang/String;
    .locals 1

    .line 177
    iget-object p1, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ᩴ;->getRootDirectories()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷۠ᩴ;

    .line 178
    invoke-interface {v0, p1}, Ll/᩷۠ᩴ;->relativize(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/۫ܳ۠;->֫(Ll/᩷۠ᩴ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/۫ܳ۠;
    .locals 3

    .line 195
    new-instance v0, Ll/ۗܳ۠;

    iget-object v1, p0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    .line 196
    invoke-interface {v1, p1}, Ll/᩷۠ᩴ;->resolveSibling(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    iget-object v1, p0, Ll/ۗܳ۠;->᩻:Ll/᩷۠ᩴ;

    iget-object v2, p0, Ll/۫ܳ۠;->֫:Ll/᩷ܿ۠;

    invoke-direct {v0, v2, p1, v1}, Ll/ۗܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V

    return-object v0
.end method
