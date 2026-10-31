.class public final Ll/ܿۡ֡;
.super Ll/ܽۡ֡;
.source "Y7JO"


# instance fields
.field public final ۤ:[Ljava/lang/String;

.field public final ۫:Z

.field public final ۬:[Ll/ܳ۠ᩴ;


# direct methods
.method public varargs constructor <init>(Ll/ܰۢ֡;[Ll/ܳ۠ᩴ;[Ll/ᩳۡ֡;[Ljava/lang/String;)V
    .locals 1

    .line 200
    new-instance v0, Ll/ۧۡ֡;

    .line 134
    invoke-direct {v0}, Ll/֫ۡ֡;-><init>()V

    .line 200
    invoke-virtual {v0, p1}, Ll/֫ۡ֡;->֫(Ll/ܰۢ֡;)V

    invoke-direct {p0, v0}, Ll/ܽۡ֡;-><init>(Ll/ۧۡ֡;)V

    .line 84
    invoke-virtual {p4}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 85
    invoke-static {p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 86
    iput-object p1, p0, Ll/ܿۡ֡;->ۤ:[Ljava/lang/String;

    .line 87
    invoke-static {p3}, Ll/ۢۡ֡;->֫([Ll/ᩳۡ֡;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܿۡ֡;->۫:Z

    if-nez p2, :cond_0

    .line 1392
    sget-object p1, Ll/ܳۡ֡;->ᩳ:[Ll/ܳ۠ᩴ;

    invoke-virtual {p1}, [Ll/ܳ۠ᩴ;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ܳ۠ᩴ;

    goto :goto_0

    .line 89
    :cond_0
    invoke-virtual {p2}, [Ll/ܳ۠ᩴ;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ܳ۠ᩴ;

    :goto_0
    iput-object p1, p0, Ll/ܿۡ֡;->۬:[Ll/ܳ۠ᩴ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 117
    :cond_0
    invoke-super {p0, p1}, Ll/ܽۡ֡;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 120
    :cond_1
    const-class v1, Ll/ܿۡ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 123
    :cond_2
    check-cast p1, Ll/ܿۡ֡;

    .line 124
    iget-boolean v1, p0, Ll/ܿۡ֡;->۫:Z

    iget-boolean v3, p1, Ll/ܿۡ֡;->۫:Z

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Ll/ܿۡ֡;->ۤ:[Ljava/lang/String;

    iget-object p1, p1, Ll/ܿۡ֡;->ۤ:[Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 130
    invoke-super {p0}, Ll/ܽۡ֡;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 131
    iget-object v1, p0, Ll/ܿۡ֡;->ۤ:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 132
    iget-boolean v1, p0, Ll/ܿۡ֡;->۫:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final bridge synthetic postVisitDirectory(Ljava/lang/Object;Ljava/io/IOException;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 37
    check-cast p1, Ll/᩷۠ᩴ;

    invoke-virtual {p0, p1, p2}, Ll/ܿۡ֡;->֫(Ll/᩷۠ᩴ;Ljava/io/IOException;)V

    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1
.end method

.method public final bridge synthetic preVisitDirectory(Ljava/lang/Object;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 37
    check-cast p1, Ll/᩷۠ᩴ;

    invoke-virtual {p0, p1, p2}, Ll/ܿۡ֡;->֫(Ll/᩷۠ᩴ;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final visitFile(Ljava/lang/Object;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 2

    .line 37
    check-cast p1, Ll/᩷۠ᩴ;

    .line 109
    sget-object v0, Ll/ܳۡ֡;->֫:[Ll/ᩳۡ֡;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 1007
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    .line 1008
    invoke-interface {v1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    .line 109
    :cond_1
    iget-object v1, p0, Ll/ܿۡ֡;->ۤ:[Ljava/lang/String;

    invoke-static {v1, v0}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_4

    .line 154
    iget-object v0, p0, Ll/ܿۡ֡;->۬:[Ll/ܳ۠ᩴ;

    invoke-static {p1, v0}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 155
    iget-boolean v1, p0, Ll/ܿۡ֡;->۫:Z

    if-eqz v1, :cond_2

    .line 156
    invoke-static {p1, v0}, Ll/ܳۡ֡;->ۧ(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)V

    .line 158
    :cond_2
    invoke-static {p1}, Ll/ܿ۠ᩴ;->deleteIfExists(Ll/᩷۠ᩴ;)Z

    .line 161
    :cond_3
    invoke-static {p1}, Ll/ܿ۠ᩴ;->isSymbolicLink(Ll/᩷۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 164
    :try_start_0
    invoke-static {p1}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    :catch_0
    :cond_4
    invoke-virtual {p0, p2}, Ll/ܽۡ֡;->֫(Ll/ܶ۠ᩴ;)V

    .line 171
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    .line 37
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 146
    invoke-super {p0, p1, p2}, Ll/ܽۡ֡;->֫(Ll/᩷۠ᩴ;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;

    .line 109
    sget-object p2, Ll/ܳۡ֡;->֫:[Ll/ᩳۡ֡;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 1007
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    if-eqz p1, :cond_1

    .line 1008
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p2

    .line 109
    :cond_1
    iget-object p1, p0, Ll/ܿۡ֡;->ۤ:[Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_2

    .line 147
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1

    :cond_2
    sget-object p1, Ll/ܽ۠ᩴ;->SKIP_SUBTREE:Ll/ܽ۠ᩴ;

    return-object p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;Ljava/io/IOException;)V
    .locals 2

    .line 138
    sget-object v0, Ll/ܳۡ֡;->֫:[Ll/ᩳۡ֡;

    .line 1159
    invoke-static {p1}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;)Ljava/nio/file/DirectoryStream;

    move-result-object v0

    .line 1160
    :try_start_0
    invoke-interface {v0}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1161
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    if-nez v1, :cond_0

    .line 139
    invoke-static {p1}, Ll/ܿ۠ᩴ;->deleteIfExists(Ll/᩷۠ᩴ;)Z

    .line 141
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܽۡ֡;->֫(Ll/᩷۠ᩴ;Ljava/io/IOException;)V

    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_1

    .line 1159
    :try_start_1
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
.end method
