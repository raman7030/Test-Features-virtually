.class public abstract Ll/ۡۡ֡;
.super Ljava/lang/Object;
.source "92JU"

# interfaces
.implements Ljava/io/FileFilter;
.implements Ljava/io/FilenameFilter;
.implements Ll/ۢ۠ᩴ;
.implements Ll/ᩳ۠ᩴ;


# instance fields
.field public final ᩸:Ll/ܽ۠ᩴ;

.field public final ᩹:Ll/ܽ۠ᩴ;


# direct methods
.method public constructor <init>(Ll/ܽ۠ᩴ;Ll/ܽ۠ᩴ;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Ll/ۡۡ֡;->᩸:Ll/ܽ۠ᩴ;

    .line 74
    iput-object p2, p0, Ll/ۡۡ֡;->᩹:Ll/ܽ۠ᩴ;

    return-void
.end method


# virtual methods
.method public abstract accept(Ljava/io/File;)Z
.end method

.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "name"

    .line 98
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/ۡۡ֡;->accept(Ljava/io/File;)Z

    move-result p1

    return p1
.end method

.method public final matches(Ll/᩷۠ᩴ;)Z
    .locals 1

    .line 99
    move-object v0, p0

    check-cast v0, Ll/ܺۡ֡;

    invoke-virtual {v0, p1}, Ll/ܺۡ֡;->֫(Ll/᩷۠ᩴ;)Ll/ܽ۠ᩴ;

    move-result-object p1

    sget-object v0, Ll/ܽ۠ᩴ;->TERMINATE:Ll/ܽ۠ᩴ;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final postVisitDirectory(Ljava/lang/Object;Ljava/io/IOException;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 42
    check-cast p1, Ll/᩷۠ᩴ;

    .line 149
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1
.end method

.method public final preVisitDirectory(Ljava/lang/Object;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 42
    check-cast p1, Ll/᩷۠ᩴ;

    .line 154
    invoke-virtual {p0, p1}, Ll/ۡۡ֡;->֫(Ll/᩷۠ᩴ;)Ll/ܽ۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 174
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final visitFile(Ljava/lang/Object;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 42
    check-cast p1, Ll/᩷۠ᩴ;

    .line 179
    invoke-virtual {p0, p1}, Ll/ۡۡ֡;->֫(Ll/᩷۠ᩴ;)Ll/ܽ۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final visitFileFailed(Ljava/lang/Object;Ljava/io/IOException;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 42
    check-cast p1, Ll/᩷۠ᩴ;

    .line 184
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1
.end method

.method public abstract ֫(Ll/᩷۠ᩴ;)Ll/ܽ۠ᩴ;
.end method

.method public final ֫(Z)Ll/ܽ۠ᩴ;
    .locals 0

    if-eqz p1, :cond_0

    .line 164
    iget-object p1, p0, Ll/ۡۡ֡;->᩸:Ll/ܽ۠ᩴ;

    return-object p1

    :cond_0
    iget-object p1, p0, Ll/ۡۡ֡;->᩹:Ll/ܽ۠ᩴ;

    return-object p1
.end method
