.class public final Ll/ܳ᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/Iterator;
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Ll/᩵᩸ᩴ;

.field public b:Ll/ܺ᩸ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 50
    const-class v0, Ll/ܳ᩸ᩴ;

    return-void
.end method

.method public varargs constructor <init>(Ll/᩷۠ᩴ;[Ll/ۧ۠ᩴ;)V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance v0, Ll/᩵᩸ᩴ;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    const v1, 0x7fffffff

    invoke-direct {v0, p2, v1}, Ll/᩵᩸ᩴ;-><init>(Ljava/util/Collection;I)V

    iput-object v0, p0, Ll/ܳ᩸ᩴ;->a:Ll/᩵᩸ᩴ;

    .line 319
    iget-boolean p2, v0, Ll/᩵᩸ᩴ;->e:Z

    if-nez p2, :cond_1

    const/4 p2, 0x0

    .line 322
    invoke-virtual {v0, p1, p2}, Ll/᩵᩸ᩴ;->e(Ll/᩷۠ᩴ;Z)Ll/ܺ᩸ᩴ;

    move-result-object p1

    .line 71
    iput-object p1, p0, Ll/ܳ᩸ᩴ;->b:Ll/ܺ᩸ᩴ;

    .line 161
    iget-object p1, p1, Ll/ܺ᩸ᩴ;->d:Ljava/io/IOException;

    if-nez p1, :cond_0

    return-void

    .line 78
    :cond_0
    throw p1

    .line 320
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 82
    iget-object v0, p0, Ll/ܳ᩸ᩴ;->b:Ll/ܺ᩸ᩴ;

    if-nez v0, :cond_2

    .line 83
    iget-object v0, p0, Ll/ܳ᩸ᩴ;->a:Ll/᩵᩸ᩴ;

    invoke-virtual {v0}, Ll/᩵᩸ᩴ;->d()Ll/ܺ᩸ᩴ;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 161
    iget-object v1, v0, Ll/ܺ᩸ᩴ;->d:Ljava/io/IOException;

    if-nez v1, :cond_1

    .line 149
    iget-object v1, v0, Ll/ܺ᩸ᩴ;->a:Ll/ۘ᩸ᩴ;

    .line 90
    sget-object v2, Ll/ۘ᩸ᩴ;->END_DIRECTORY:Ll/ۘ᩸ᩴ;

    if-eq v1, v2, :cond_0

    .line 91
    iput-object v0, p0, Ll/ܳ᩸ᩴ;->b:Ll/ܺ᩸ᩴ;

    return-void

    .line 94
    :cond_0
    iget-object v0, p0, Ll/ܳ᩸ᩴ;->a:Ll/᩵᩸ᩴ;

    invoke-virtual {v0}, Ll/᩵᩸ᩴ;->d()Ll/ܺ᩸ᩴ;

    move-result-object v0

    goto :goto_0

    .line 87
    :cond_1
    new-instance v0, Ljava/io/UncheckedIOException;

    invoke-direct {v0, v1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_2
    return-void
.end method

.method public final close()V
    .locals 1

    .line 121
    iget-object v0, p0, Ll/ܳ᩸ᩴ;->a:Ll/᩵᩸ᩴ;

    invoke-virtual {v0}, Ll/᩵᩸ᩴ;->close()V

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ܳ᩸ᩴ;->a:Ll/᩵᩸ᩴ;

    .line 411
    iget-boolean v0, v0, Ll/᩵᩸ᩴ;->e:Z

    if-nez v0, :cond_1

    .line 103
    invoke-virtual {p0}, Ll/ܳ᩸ᩴ;->b()V

    .line 104
    iget-object v0, p0, Ll/ܳ᩸ᩴ;->b:Ll/ܺ᩸ᩴ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 102
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 109
    iget-object v0, p0, Ll/ܳ᩸ᩴ;->a:Ll/᩵᩸ᩴ;

    .line 411
    iget-boolean v0, v0, Ll/᩵᩸ᩴ;->e:Z

    if-nez v0, :cond_1

    .line 111
    invoke-virtual {p0}, Ll/ܳ᩸ᩴ;->b()V

    .line 112
    iget-object v0, p0, Ll/ܳ᩸ᩴ;->b:Ll/ܺ᩸ᩴ;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 115
    iput-object v1, p0, Ll/ܳ᩸ᩴ;->b:Ll/ܺ᩸ᩴ;

    return-object v0

    .line 113
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 110
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
