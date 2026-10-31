.class public final Ll/۬ۨۜ;
.super Ll/᩺ۨۜ;
.source "66M9"


# instance fields
.field public final synthetic ֫:Ljava/io/File;

.field public final synthetic ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p2, p0, Ll/۬ۨۜ;->ۧ:Ljava/lang/String;

    iput-object p1, p0, Ll/۬ۨۜ;->֫:Ljava/io/File;

    invoke-direct {p0}, Ll/᩺ۨۜ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۜ()Ljava/io/File;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/۬ۨۜ;->֫:Ljava/io/File;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/۬ۨۜ;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ljava/io/InputStream;
    .locals 2

    .line 113
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Ll/۬ۨۜ;->֫:Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public final ᩵()Ll/ۨۨۜ;
    .locals 8

    .line 118
    iget-object v0, p0, Ll/۬ۨۜ;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 120
    new-instance v1, Ll/ۨۨۜ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "file:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Ll/ۨۨۜ;-><init>(Ljava/lang/String;JJ)V

    return-object v1

    .line 119
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    const-string v1, "Image source is not a regular file"

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/۬ۨۜ;->ۧ:Ljava/lang/String;

    return-object v0
.end method
