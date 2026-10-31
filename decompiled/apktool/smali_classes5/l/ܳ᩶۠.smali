.class public Ll/ܳ᩶۠;
.super Ljava/lang/Object;
.source "W2ZW"

# interfaces
.implements Ll/ᩳ᩶۠;


# instance fields
.field public final ֫:Ll/ܽ᩶۠;

.field public final ۧ:Ljava/net/URI;


# direct methods
.method public constructor <init>(Ljava/net/URI;Ll/ܽ᩶۠;)V
    .locals 2

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    invoke-virtual {p1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 68
    iput-object p1, p0, Ll/ܳ᩶۠;->ۧ:Ljava/net/URI;

    .line 69
    iput-object p2, p0, Ll/ܳ᩶۠;->֫:Ll/ܽ᩶۠;

    return-void

    .line 67
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "URI must have a path: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final delete()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܳ᩶۠;->ۧ:Ljava/net/URI;

    .line 77
    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    iget-object v1, p0, Ll/ܳ᩶۠;->ۧ:Ljava/net/URI;

    .line 213
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toUri()Ljava/net/URI;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܳ᩶۠;->ۧ:Ljava/net/URI;

    return-object v0
.end method

.method public final ֫()Ll/ܽ᩶۠;
    .locals 1

    .line 173
    iget-object v0, p0, Ll/ܳ᩶۠;->֫:Ll/ܽ᩶۠;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z
    .locals 1

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 191
    iget-object v0, p2, Ll/ܽ᩶۠;->᩸:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 173
    iget-object v0, p0, Ll/ܳ᩶۠;->֫:Ll/ܽ᩶۠;

    .line 192
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 193
    iget-object p2, p0, Ll/ܳ᩶۠;->ۧ:Ljava/net/URI;

    invoke-virtual {p2}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 194
    invoke-virtual {p2}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object p2

    const-string v0, "/"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ljava/io/InputStream;
    .locals 1

    .line 87
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ܽ()Ljava/io/Writer;
    .locals 1

    .line 144
    new-instance v0, Ljava/io/OutputStreamWriter;

    .line 97
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ܿ()Ljava/io/OutputStream;
    .locals 1

    .line 97
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ᩳ()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method
