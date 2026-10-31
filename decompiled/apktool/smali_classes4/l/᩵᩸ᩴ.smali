.class public final Ll/᩵᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Z

.field public final b:[Ll/ܳ۠ᩴ;

.field public final c:I

.field public final d:Ljava/util/ArrayDeque;

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 57
    const-class v0, Ll/᩵᩸ᩴ;

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;I)V
    .locals 4

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/᩵᩸ᩴ;->d:Ljava/util/ArrayDeque;

    .line 179
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ۠ᩴ;

    .line 181
    sget-object v2, Ll/ۜ᩸ᩴ;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 184
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Should not get here"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    if-ltz p2, :cond_3

    .line 190
    iput-boolean v1, p0, Ll/᩵᩸ᩴ;->a:Z

    if-eqz v1, :cond_2

    new-array p1, v0, [Ll/ܳ۠ᩴ;

    goto :goto_1

    :cond_2
    new-array p1, v3, [Ll/ܳ۠ᩴ;

    .line 192
    sget-object v1, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v1, p1, v0

    :goto_1
    iput-object p1, p0, Ll/᩵᩸ᩴ;->b:[Ll/ܳ۠ᩴ;

    .line 193
    iput p2, p0, Ll/᩵᩸ᩴ;->c:I

    return-void

    .line 188
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'maxDepth\' is negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(Ll/᩷۠ᩴ;)Ll/ܶ۠ᩴ;
    .locals 4

    .line 205
    const-class v0, Ll/ܶ۠ᩴ;

    .line 219
    :try_start_0
    iget-object v1, p0, Ll/᩵᩸ᩴ;->b:[Ll/ܳ۠ᩴ;

    invoke-static {p1, v0, v1}, Ll/ܿ۠ᩴ;->readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    .line 221
    iget-boolean v2, p0, Ll/᩵᩸ᩴ;->a:Z

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [Ll/ܳ۠ᩴ;

    .line 225
    sget-object v2, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, v0, v1}, Ll/ܿ۠ᩴ;->readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;

    move-result-object p1

    return-object p1

    .line 222
    :cond_0
    throw v1
.end method

.method public final close()V
    .locals 1

    .line 419
    iget-boolean v0, p0, Ll/᩵᩸ᩴ;->e:Z

    if-nez v0, :cond_2

    .line 420
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/᩵᩸ᩴ;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 389
    iget-object v0, p0, Ll/᩵᩸ᩴ;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 390
    iget-object v0, p0, Ll/᩵᩸ᩴ;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ᩸ᩴ;

    .line 90
    :try_start_0
    iget-object v0, v0, Ll/ۢ᩸ᩴ;->c:Ljava/nio/file/DirectoryStream;

    .line 392
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 423
    iput-boolean v0, p0, Ll/᩵᩸ᩴ;->e:Z

    :cond_2
    return-void
.end method

.method public final d()Ll/ܺ᩸ᩴ;
    .locals 5

    .line 334
    iget-object v0, p0, Ll/᩵᩸ᩴ;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ᩸ᩴ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 102
    :cond_0
    iget-boolean v2, v0, Ll/ۢ᩸ᩴ;->e:Z

    if-nez v2, :cond_2

    .line 94
    iget-object v2, v0, Ll/ۢ᩸ᩴ;->d:Ljava/util/Iterator;

    .line 348
    :try_start_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 349
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷۠ᩴ;
    :try_end_0
    .catch Ljava/nio/file/DirectoryIteratorException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v3, v1

    goto :goto_1

    :catch_0
    move-exception v2

    .line 352
    invoke-virtual {v2}, Ljava/nio/file/DirectoryIteratorException;->getCause()Ljava/io/IOException;

    move-result-object v2

    move-object v3, v2

    move-object v2, v1

    goto :goto_1

    :cond_2
    move-object v2, v1

    move-object v3, v2

    :goto_1
    if-nez v2, :cond_4

    .line 90
    :try_start_1
    iget-object v2, v0, Ll/ۢ᩸ᩴ;->c:Ljava/nio/file/DirectoryStream;

    .line 360
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v2

    if-nez v3, :cond_3

    move-object v3, v2

    goto :goto_2

    .line 365
    :cond_3
    invoke-virtual {v3, v2}, Ljava/io/IOException;->addSuppressed(Ljava/lang/Throwable;)V

    .line 368
    :goto_2
    iget-object v2, p0, Ll/᩵᩸ᩴ;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 369
    new-instance v2, Ll/ܺ᩸ᩴ;

    sget-object v4, Ll/ۘ᩸ᩴ;->END_DIRECTORY:Ll/ۘ᩸ᩴ;

    .line 82
    iget-object v0, v0, Ll/ۢ᩸ᩴ;->a:Ll/᩷۠ᩴ;

    .line 145
    invoke-direct {v2, v4, v0, v1, v3}, Ll/ܺ᩸ᩴ;-><init>(Ll/ۘ᩸ᩴ;Ll/᩷۠ᩴ;Ll/ܶ۠ᩴ;Ljava/io/IOException;)V

    return-object v2

    :cond_4
    const/4 v3, 0x1

    .line 373
    invoke-virtual {p0, v2, v3}, Ll/᩵᩸ᩴ;->e(Ll/᩷۠ᩴ;Z)Ll/ܺ᩸ᩴ;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2
.end method

.method public final e(Ll/᩷۠ᩴ;Z)Ll/ܺ᩸ᩴ;
    .locals 6

    const/4 v0, 0x0

    .line 276
    :try_start_0
    invoke-virtual {p0, p1}, Ll/᩵᩸ᩴ;->b(Ll/᩷۠ᩴ;)Ll/ܶ۠ᩴ;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_3

    .line 286
    iget-object v2, p0, Ll/᩵᩸ᩴ;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    move-result v2

    .line 287
    iget v3, p0, Ll/᩵᩸ᩴ;->c:I

    if-ge v2, v3, :cond_5

    invoke-interface {v1}, Ll/ܶ۠ᩴ;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    .line 292
    :cond_0
    iget-boolean v2, p0, Ll/᩵᩸ᩴ;->a:Z

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ll/ܶ۠ᩴ;->fileKey()Ljava/lang/Object;

    move-result-object v2

    .line 239
    iget-object v3, p0, Ll/᩵᩸ᩴ;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۢ᩸ᩴ;

    .line 86
    iget-object v5, v4, Ll/ۢ᩸ᩴ;->b:Ljava/lang/Object;

    if-eqz v2, :cond_2

    if-eqz v5, :cond_2

    .line 242
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 82
    :cond_2
    :try_start_1
    iget-object v4, v4, Ll/ۢ᩸ᩴ;->a:Ll/᩷۠ᩴ;

    .line 248
    invoke-static {p1, v4}, Ll/ܿ۠ᩴ;->isSameFile(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)Z

    move-result v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v4, :cond_1

    .line 293
    :goto_1
    new-instance p2, Ll/ܺ᩸ᩴ;

    sget-object v1, Ll/ۘ᩸ᩴ;->ENTRY:Ll/ۘ᩸ᩴ;

    new-instance v2, Ljava/nio/file/FileSystemLoopException;

    .line 294
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/nio/file/FileSystemLoopException;-><init>(Ljava/lang/String;)V

    .line 145
    invoke-direct {p2, v1, p1, v0, v2}, Ll/ܺ᩸ᩴ;-><init>(Ll/ۘ᩸ᩴ;Ll/᩷۠ᩴ;Ll/ܶ۠ᩴ;Ljava/io/IOException;)V

    return-object p2

    :catch_0
    nop

    goto :goto_0

    .line 300
    :cond_3
    :try_start_2
    invoke-static {p1}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;)Ljava/nio/file/DirectoryStream;

    move-result-object p2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1

    .line 310
    iget-object v2, p0, Ll/᩵᩸ᩴ;->d:Ljava/util/ArrayDeque;

    new-instance v3, Ll/ۢ᩸ᩴ;

    invoke-interface {v1}, Ll/ܶ۠ᩴ;->fileKey()Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v3, p1, v4, p2}, Ll/ۢ᩸ᩴ;-><init>(Ll/᩷۠ᩴ;Ljava/lang/Object;Ljava/nio/file/DirectoryStream;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 311
    new-instance p2, Ll/ܺ᩸ᩴ;

    sget-object v2, Ll/ۘ᩸ᩴ;->START_DIRECTORY:Ll/ۘ᩸ᩴ;

    .line 141
    invoke-direct {p2, v2, p1, v1, v0}, Ll/ܺ᩸ᩴ;-><init>(Ll/ۘ᩸ᩴ;Ll/᩷۠ᩴ;Ll/ܶ۠ᩴ;Ljava/io/IOException;)V

    return-object p2

    :catch_1
    move-exception p1

    if-eqz p2, :cond_4

    goto :goto_3

    .line 306
    :cond_4
    throw p1

    :catch_2
    move-exception p2

    .line 302
    new-instance v1, Ll/ܺ᩸ᩴ;

    sget-object v2, Ll/ۘ᩸ᩴ;->ENTRY:Ll/ۘ᩸ᩴ;

    .line 145
    invoke-direct {v1, v2, p1, v0, p2}, Ll/ܺ᩸ᩴ;-><init>(Ll/ۘ᩸ᩴ;Ll/᩷۠ᩴ;Ll/ܶ۠ᩴ;Ljava/io/IOException;)V

    return-object v1

    .line 288
    :cond_5
    :goto_2
    new-instance p2, Ll/ܺ᩸ᩴ;

    sget-object v2, Ll/ۘ᩸ᩴ;->ENTRY:Ll/ۘ᩸ᩴ;

    .line 141
    invoke-direct {p2, v2, p1, v1, v0}, Ll/ܺ᩸ᩴ;-><init>(Ll/ۘ᩸ᩴ;Ll/᩷۠ᩴ;Ll/ܶ۠ᩴ;Ljava/io/IOException;)V

    return-object p2

    :catch_3
    move-exception p1

    if-eqz p2, :cond_6

    :goto_3
    return-object v0

    .line 282
    :cond_6
    throw p1

    :catch_4
    move-exception p2

    .line 278
    new-instance v1, Ll/ܺ᩸ᩴ;

    sget-object v2, Ll/ۘ᩸ᩴ;->ENTRY:Ll/ۘ᩸ᩴ;

    .line 145
    invoke-direct {v1, v2, p1, v0, p2}, Ll/ܺ᩸ᩴ;-><init>(Ll/ۘ᩸ᩴ;Ll/᩷۠ᩴ;Ll/ܶ۠ᩴ;Ljava/io/IOException;)V

    return-object v1
.end method
