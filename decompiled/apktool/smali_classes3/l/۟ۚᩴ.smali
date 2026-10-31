.class public final Ll/۟ۚᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܽܶᩴ;


# static fields
.field public static final b:Ljava/util/Set;


# instance fields
.field public final a:Ll/᩷۠ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const-string v7, "isSymbolicLink"

    const-string v8, "isOther"

    const-string v0, "size"

    const-string v1, "creationTime"

    const-string v2, "lastAccessTime"

    const-string v3, "lastModifiedTime"

    const-string v4, "fileKey"

    const-string v5, "isDirectory"

    const-string v6, "isRegularFile"

    .line 56
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    .line 57
    sget-object v1, Ll/ۘ֨ᩴ;->a:Ljava/nio/charset/Charset;

    .line 100
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x9

    if-ge v2, v3, :cond_0

    .line 101
    aget-object v3, v0, v2

    .line 102
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 57
    :cond_0
    sput-object v1, Ll/۟ۚᩴ;->b:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ll/᩷۠ᩴ;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/۟ۚᩴ;->a:Ll/᩷۠ᩴ;

    return-void
.end method


# virtual methods
.method public final a(Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;)V
    .locals 3

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    iget-object p2, p0, Ll/۟ۚᩴ;->a:Ll/᩷۠ᩴ;

    invoke-interface {p2}, Ll/᩷۠ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object p3

    invoke-virtual {p3}, Ll/۟֨ᩴ;->provider()Ll/۬᩸ᩴ;

    move-result-object p3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ۨ֨ᩴ;

    sget-object v1, Ll/ۨ֨ᩴ;->WRITE:Ll/ۨ֨ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p3, p2, v0}, Ll/۬᩸ᩴ;->checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V

    .line 56
    invoke-interface {p2}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p3

    .line 57
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0}, Ll/ۙ۠ᩴ;->to(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ljava/io/File;->setLastModified(J)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return-void

    .line 59
    :cond_1
    new-instance p1, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "File.setLastModified did not succeed on "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    const-string v0, "basic"

    return-object v0
.end method

.method public final readAttributes()Ll/ܶ۠ᩴ;
    .locals 15

    .line 43
    iget-object v0, p0, Ll/۟ۚᩴ;->a:Ll/᩷۠ᩴ;

    invoke-interface {v0}, Ll/᩷۠ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟֨ᩴ;->provider()Ll/۬᩸ᩴ;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ll/ۨ֨ᩴ;

    invoke-virtual {v1, v0, v2}, Ll/۬᩸ᩴ;->checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V

    .line 44
    invoke-interface {v0}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v1, v2, v3}, Ll/ۙ۠ᩴ;->from(JLjava/util/concurrent/TimeUnit;)Ll/ۙ۠ᩴ;

    move-result-object v7

    .line 46
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v8

    .line 47
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v9

    .line 136
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    move-object v2, v0

    goto :goto_0

    .line 139
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v1

    .line 140
    new-instance v2, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 142
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v2}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/lit8 v1, v1, 0x1

    move v10, v1

    goto :goto_1

    :catch_0
    const/4 v1, 0x0

    const/4 v10, 0x0

    .line 49
    :goto_1
    new-instance v1, Ll/֫֨ᩴ;

    if-nez v8, :cond_1

    if-nez v9, :cond_1

    if-nez v10, :cond_1

    const/4 v2, 0x1

    const/4 v11, 0x1

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    const/4 v11, 0x0

    .line 57
    :goto_2
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v12

    .line 61
    invoke-virtual {v0}, Ljava/io/File;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-object v4, v1

    move-object v5, v7

    move-object v6, v7

    invoke-direct/range {v4 .. v14}, Ll/֫֨ᩴ;-><init>(Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;ZZZZJLjava/lang/Object;)V

    return-object v1
.end method
