.class public final synthetic Ll/۠֨ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static toPath(Ljava/io/File;)Ll/᩷۠ᩴ;
    .locals 2

    .line 2301
    invoke-static {}, Ll/֫۠ᩴ;->getDefault()Ll/۟֨ᩴ;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, p0, v1}, Ll/۟֨ᩴ;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    return-object p0
.end method
