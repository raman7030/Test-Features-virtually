.class public final Ll/᩷֨ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final a:Ljava/nio/file/DirectoryStream$Filter;

.field public final b:[Ljava/io/File;

.field public c:I

.field public final synthetic d:Ll/ۢ֨ᩴ;


# direct methods
.method public constructor <init>(Ll/ۢ֨ᩴ;Ll/᩷۠ᩴ;Ljava/nio/file/DirectoryStream$Filter;)V
    .locals 0

    .line 413
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷֨ᩴ;->d:Ll/ۢ֨ᩴ;

    const/4 p1, 0x0

    .line 411
    iput p1, p0, Ll/᩷֨ᩴ;->c:I

    .line 416
    invoke-interface {p2}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p2

    if-nez p2, :cond_0

    new-array p2, p1, [Ljava/io/File;

    .line 417
    :cond_0
    iput-object p2, p0, Ll/᩷֨ᩴ;->b:[Ljava/io/File;

    .line 418
    iput-object p3, p0, Ll/᩷֨ᩴ;->a:Ljava/nio/file/DirectoryStream$Filter;

    return-void
.end method


# virtual methods
.method public final a()Ll/ܺ֨ᩴ;
    .locals 5

    .line 434
    :cond_0
    iget v0, p0, Ll/᩷֨ᩴ;->c:I

    iget-object v1, p0, Ll/᩷֨ᩴ;->b:[Ljava/io/File;

    array-length v2, v1

    if-lt v0, v2, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 437
    iput v2, p0, Ll/᩷֨ᩴ;->c:I

    aget-object v0, v1, v0

    .line 438
    new-instance v1, Ll/ܺ֨ᩴ;

    iget-object v2, p0, Ll/᩷֨ᩴ;->d:Ll/ۢ֨ᩴ;

    .line 60
    iget-object v2, v2, Ll/ۢ֨ᩴ;->g:Ll/ܳ֨ᩴ;

    .line 438
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Ll/᩷֨ᩴ;->d:Ll/ۢ֨ᩴ;

    .line 60
    iget-object v4, v3, Ll/ۢ֨ᩴ;->e:Ljava/lang/String;

    iget-object v3, v3, Ll/ۢ֨ᩴ;->f:Ljava/lang/String;

    .line 438
    invoke-direct {v1, v2, v0, v4, v3}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    :try_start_0
    iget-object v0, p0, Ll/᩷֨ᩴ;->a:Ljava/nio/file/DirectoryStream$Filter;

    invoke-interface {v0, v1}, Ljava/nio/file/DirectoryStream$Filter;->accept(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    return-object v1

    :catch_0
    move-exception v0

    .line 443
    new-instance v1, Ljava/nio/file/DirectoryIteratorException;

    invoke-direct {v1, v0}, Ljava/nio/file/DirectoryIteratorException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final hasNext()Z
    .locals 2

    .line 423
    invoke-virtual {p0}, Ll/᩷֨ᩴ;->a()Ll/ܺ֨ᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 424
    iget v0, p0, Ll/᩷֨ᩴ;->c:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Ll/᩷֨ᩴ;->c:I

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 407
    invoke-virtual {p0}, Ll/᩷֨ᩴ;->a()Ll/ܺ֨ᩴ;

    move-result-object v0

    return-object v0
.end method
