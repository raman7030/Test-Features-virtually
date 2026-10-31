.class public final Ll/ۚ᩶۠;
.super Ll/۟֨ᩴ;
.source "47LN"


# instance fields
.field public final ۗ:Ll/ᩳܰۡ;

.field public final ۙ:Ll/ۗ᩺ۡ;

.field public final ᩶:Ll/֨᩶۠;

.field public volatile ᩸:Z

.field public final ᩹:Ll/᩻ܰۡ;


# direct methods
.method public constructor <init>(Ll/֨᩶۠;Ll/᩷۠ᩴ;)V
    .locals 2

    .line 41
    invoke-direct {p0}, Ll/۟֨ᩴ;-><init>()V

    .line 38
    new-instance v0, Ll/ۗ᩺ۡ;

    const-string v1, "/"

    invoke-direct {v0, v1}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۚ᩶۠;->ۙ:Ll/ۗ᩺ۡ;

    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Ll/ۚ᩶۠;->᩸:Z

    .line 42
    iput-object p1, p0, Ll/ۚ᩶۠;->᩶:Ll/֨᩶۠;

    .line 43
    new-instance p1, Ll/ᩳܰۡ;

    invoke-interface {p2}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ᩳܰۡ;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ll/ۚ᩶۠;->ۗ:Ll/ᩳܰۡ;

    .line 44
    new-instance p2, Ll/᩻ܰۡ;

    .line 9
    invoke-virtual {p1}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/֨᩺ۡ;-><init>(Ljava/util/Collection;)V

    .line 44
    iput-object p2, p0, Ll/ۚ᩶۠;->᩹:Ll/᩻ܰۡ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚ᩶۠;)Ll/᩻ܰۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ᩶۠;->᩹:Ll/᩻ܰۡ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 54
    iget-boolean v0, p0, Ll/ۚ᩶۠;->᩸:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Ll/ۚ᩶۠;->᩸:Z

    .line 56
    iget-object v0, p0, Ll/ۚ᩶۠;->ۗ:Ll/ᩳܰۡ;

    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    :cond_0
    return-void
.end method

.method public final getFileStores()Ljava/lang/Iterable;
    .locals 2

    .line 82
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "getFileStores"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final varargs getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;
    .locals 5

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    array-length p1, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    aget-object v2, p2, v1

    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v3

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_0

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 95
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 99
    :cond_1
    new-instance p1, Ll/۠᩶۠;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p0, p2}, Ll/۠᩶۠;-><init>(Ll/ۚ᩶۠;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getPathMatcher(Ljava/lang/String;)Ll/ۢ۠ᩴ;
    .locals 1

    .line 104
    invoke-static {}, Ll/֫۠ᩴ;->getDefault()Ll/۟֨ᩴ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟֨ᩴ;->getPathMatcher(Ljava/lang/String;)Ll/ۢ۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final getRootDirectories()Ljava/lang/Iterable;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "/"

    .line 77
    invoke-virtual {p0, v1, v0}, Ll/ۚ᩶۠;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getSeparator()Ljava/lang/String;
    .locals 1

    const-string v0, "/"

    return-object v0
.end method

.method public final getUserPrincipalLookupService()Ll/۫۠ᩴ;
    .locals 1

    .line 223
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final isOpen()Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Ll/ۚ᩶۠;->᩸:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isReadOnly()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final newWatchService()Ll/ۚ۠ᩴ;
    .locals 1

    .line 228
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final provider()Ll/۬᩸ᩴ;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۚ᩶۠;->᩶:Ll/֨᩶۠;

    return-object v0
.end method

.method public final supportedFileAttributeViews()Ljava/util/Set;
    .locals 1

    const-string v0, "basic"

    .line 87
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۠᩶۠;)Ljava/io/InputStream;
    .locals 3

    .line 216
    iget-boolean v0, p0, Ll/ۚ᩶۠;->᩸:Z

    if-nez v0, :cond_1

    .line 138
    invoke-virtual {p0, p1}, Ll/ۚ᩶۠;->ۧ(Ll/۠᩶۠;)Ll/ۗ᩺ۡ;

    move-result-object v0

    .line 139
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_0

    .line 142
    iget-object p1, p0, Ll/ۚ᩶۠;->ۗ:Ll/ᩳܰۡ;

    invoke-virtual {p1, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 140
    :cond_0
    new-instance v0, Ljava/nio/file/FileSystemException;

    .line 486
    iget-object p1, p1, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "Is a directory"

    .line 140
    invoke-direct {v0, p1, v1, v2}, Ljava/nio/file/FileSystemException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 217
    :cond_1
    new-instance p1, Ljava/nio/file/ClosedFileSystemException;

    invoke-direct {p1}, Ljava/nio/file/ClosedFileSystemException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/۠᩶۠;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;
    .locals 1

    .line 216
    iget-boolean v0, p0, Ll/ۚ᩶۠;->᩸:Z

    if-nez v0, :cond_0

    .line 147
    new-instance v0, Ll/֡᩶۠;

    invoke-direct {v0, p0, p2, p1}, Ll/֡᩶۠;-><init>(Ll/ۚ᩶۠;Ljava/nio/file/DirectoryStream$Filter;Ll/۠᩶۠;)V

    return-object v0

    .line 217
    :cond_0
    new-instance p1, Ljava/nio/file/ClosedFileSystemException;

    invoke-direct {p1}, Ljava/nio/file/ClosedFileSystemException;-><init>()V

    throw p1
.end method

.method public final varargs ֫(Ll/۠᩶۠;[Ll/ۨ֨ᩴ;)V
    .locals 4

    .line 216
    iget-boolean v0, p0, Ll/ۚ᩶۠;->᩸:Z

    if-nez v0, :cond_2

    .line 179
    invoke-virtual {p0, p1}, Ll/ۚ᩶۠;->ۧ(Ll/۠᩶۠;)Ll/ۗ᩺ۡ;

    .line 180
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p2, v1

    .line 181
    sget-object v3, Ll/ۨ֨ᩴ;->WRITE:Ll/ۨ֨ᩴ;

    if-eq v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 182
    :cond_0
    new-instance p2, Ljava/nio/file/AccessDeniedException;

    .line 486
    iget-object p1, p1, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "Read-only file system"

    .line 182
    invoke-direct {p2, p1, v0, v1}, Ljava/nio/file/AccessDeniedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p2

    :cond_1
    return-void

    .line 217
    :cond_2
    new-instance p1, Ljava/nio/file/ClosedFileSystemException;

    invoke-direct {p1}, Ljava/nio/file/ClosedFileSystemException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ll/۠᩶۠;)Ll/ۗ᩺ۡ;
    .locals 4

    .line 486
    iget-object v0, p1, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    const-string v1, "/"

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 111
    iget-object v0, p0, Ll/ۚ᩶۠;->ۙ:Ll/ۗ᩺ۡ;

    goto :goto_0

    .line 113
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 116
    :cond_1
    iget-object v2, p0, Ll/ۚ᩶۠;->ۗ:Ll/ᩳܰۡ;

    invoke-virtual {v2, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v3

    if-nez v3, :cond_3

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 119
    invoke-virtual {v2, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v1

    if-nez v1, :cond_2

    .line 121
    iget-object v1, p0, Ll/ۚ᩶۠;->᩹:Ll/᩻ܰۡ;

    invoke-virtual {v1, v0}, Ll/֨᩺ۡ;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩺ۡ;

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_0

    :cond_3
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_4

    return-object v0

    .line 131
    :cond_4
    new-instance v0, Ljava/nio/file/NoSuchFileException;

    .line 486
    iget-object p1, p1, Ll/ܺ᩶۠;->᩸:Ljava/lang/String;

    .line 131
    invoke-direct {v0, p1}, Ljava/nio/file/NoSuchFileException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
