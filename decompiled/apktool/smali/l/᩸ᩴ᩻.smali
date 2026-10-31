.class public final Ll/᩸ᩴ᩻;
.super Ljava/lang/Object;
.source "Y89V"

# interfaces
.implements Ll/ۖ֡᩻;


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ll/ᩴۡ᩵;

.field public final ᩹:Ll/۫֡᩻;


# direct methods
.method public constructor <init>(Ll/۫֡᩻;Ll/ᩴۡ᩵;Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/᩸ᩴ᩻;->᩹:Ll/۫֡᩻;

    .line 32
    iput-object p2, p0, Ll/᩸ᩴ᩻;->᩸:Ll/ᩴۡ᩵;

    .line 33
    iput-object p3, p0, Ll/᩸ᩴ᩻;->᩶:Ljava/lang/String;

    return-void
.end method

.method private ᩳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "/"

    .line 173
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Ll/᩸ᩴ᩻;->᩶:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 0
    invoke-static {v2, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {v2, v0, p1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;JJ)Ljava/io/InputStream;
    .locals 0

    .line 35
    invoke-virtual {p0, p2, p3, p1}, Ll/᩸ᩴ᩻;->ۧ(JLjava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(JLjava/lang/String;)Ljava/io/OutputStream;
    .locals 0

    .line 144
    iget-object p1, p0, Ll/᩸ᩴ᩻;->᩸:Ll/ᩴۡ᩵;

    invoke-direct {p0, p3}, Ll/᩸ᩴ᩻;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/ᩴۡ᩵;->get(Ljava/lang/String;)Ll/۬ۚ᩵;

    move-result-object p1

    .line 2093
    new-instance p2, Ll/ۛۚ᩵;

    invoke-direct {p2, p1}, Ll/ۛۚ᩵;-><init>(Ll/۬ۚ᩵;)V

    return-object p2
.end method

.method public final ֫(Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/᩸ᩴ᩻;->᩶:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/᩸ᩴ᩻;->᩸:Ll/ᩴۡ᩵;

    invoke-interface {v2, v1}, Ll/ᩴۡ᩵;->get(Ljava/lang/String;)Ll/۬ۚ᩵;

    move-result-object v1

    .line 44
    :try_start_0
    invoke-virtual {v1}, Ll/۬ۚ᩵;->֫()Ll/ۚۡ᩵;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 45
    :goto_0
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 46
    new-instance v3, Ll/ۗ᩵᩻;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۤۡ᩵;

    invoke-direct {v3, v4}, Ll/ۗ᩵᩻;-><init>(Ll/ۤۡ᩵;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 48
    :cond_0
    :try_start_2
    invoke-interface {v2}, Ll/ۚۡ᩵;->close()V

    .line 49
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_1

    .line 50
    new-instance p1, Ll/ܿܰܽ;

    const/4 v2, 0x1

    invoke-direct {p1, v2}, Ll/ܿܰܽ;-><init>(I)V

    invoke-static {v0, p1}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 52
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->trimToSize()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 54
    invoke-virtual {v1}, Ll/۬ۚ᩵;->close()V

    return-object v0

    :catchall_0
    move-exception p1

    .line 44
    :try_start_3
    invoke-interface {v2}, Ll/ۚۡ᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 43
    :try_start_5
    invoke-virtual {v1}, Ll/۬ۚ᩵;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final ֫()Ll/۫֡᩻;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/᩸ᩴ᩻;->᩹:Ll/۫֡᩻;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 69
    invoke-direct {p0, p1}, Ll/᩸ᩴ᩻;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩸ᩴ᩻;->᩸:Ll/ᩴۡ᩵;

    invoke-interface {v0, p1}, Ll/ᩴۡ᩵;->get(Ljava/lang/String;)Ll/۬ۚ᩵;

    move-result-object p1

    invoke-direct {p0, p2}, Ll/᩸ᩴ᩻;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2}, Ll/ᩴۡ᩵;->get(Ljava/lang/String;)Ll/۬ۚ᩵;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۬ۚ᩵;->֫(Ll/ۤۡ᩵;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Z)V
    .locals 0

    .line 64
    iget-object p2, p0, Ll/᩸ᩴ᩻;->᩸:Ll/ᩴۡ᩵;

    invoke-direct {p0, p1}, Ll/᩸ᩴ᩻;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ll/ᩴۡ᩵;->get(Ljava/lang/String;)Ll/۬ۚ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/۬ۚ᩵;->delete()V

    return-void
.end method

.method public final ۧ(JLjava/lang/String;)Ljava/io/InputStream;
    .locals 3

    .line 117
    iget-object v0, p0, Ll/᩸ᩴ᩻;->᩸:Ll/ᩴۡ᩵;

    invoke-direct {p0, p3}, Ll/᩸ᩴ᩻;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p3}, Ll/ᩴۡ᩵;->get(Ljava/lang/String;)Ll/۬ۚ᩵;

    move-result-object p3

    .line 2069
    new-instance v0, Ll/ۤۚ᩵;

    invoke-direct {v0, p3}, Ll/ۤۚ᩵;-><init>(Ll/۬ۚ᩵;)V

    const-wide/16 v1, 0x0

    cmp-long p3, p1, v1

    if-lez p3, :cond_1

    .line 118
    invoke-virtual {v0, p1, p2}, Ll/ۤۚ᩵;->skip(J)J

    move-result-wide v1

    cmp-long p3, v1, p1

    if-nez p3, :cond_0

    goto :goto_0

    .line 119
    :cond_0
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 120
    new-instance p1, Ljava/io/IOException;

    const-string p2, "SmbFileInputStream skip failed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 163
    :cond_1
    :goto_0
    new-instance p1, Ll/ܶᩴ᩻;

    invoke-direct {p1, v0}, Ll/ܶᩴ᩻;-><init>(Ljava/io/InputStream;)V

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;)Ll/֨᩷᩻;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/᩸ᩴ᩻;->᩸:Ll/ᩴۡ᩵;

    invoke-direct {p0, p1}, Ll/᩸ᩴ᩻;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/ᩴۡ᩵;->get(Ljava/lang/String;)Ll/۬ۚ᩵;

    move-result-object p1

    .line 2117
    new-instance v0, Ll/ۧ֨᩵;

    invoke-direct {v0, p1}, Ll/ۧ֨᩵;-><init>(Ll/۬ۚ᩵;)V

    .line 81
    new-instance p1, Ll/۠ᩴ᩻;

    invoke-direct {p1, v0}, Ll/۠ᩴ᩻;-><init>(Ll/۫ۡ᩵;)V

    return-object p1
.end method

.method public final ܽ(JLjava/lang/String;)V
    .locals 8

    .line 59
    iget-object v0, p0, Ll/᩸ᩴ᩻;->᩸:Ll/ᩴۡ᩵;

    invoke-direct {p0, p3}, Ll/᩸ᩴ᩻;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p3}, Ll/ᩴۡ᩵;->get(Ljava/lang/String;)Ll/۬ۚ᩵;

    move-result-object v1

    move-wide v2, p1

    move-wide v4, p1

    move-wide v6, p1

    invoke-virtual/range {v1 .. v7}, Ll/۬ۚ᩵;->֫(JJJ)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 74
    iget-object v0, p0, Ll/᩸ᩴ᩻;->᩸:Ll/ᩴۡ᩵;

    invoke-direct {p0, p1}, Ll/᩸ᩴ᩻;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/ᩴۡ᩵;->get(Ljava/lang/String;)Ll/۬ۚ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/۬ۚ᩵;->ۜ()V

    return-void
.end method
