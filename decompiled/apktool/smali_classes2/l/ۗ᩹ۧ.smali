.class public final Ll/ۗ᩹ۧ;
.super Ljava/lang/Object;
.source "J9LL"


# direct methods
.method public static ֫(Ljava/io/File;)Z
    .locals 4

    .line 58
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    .line 59
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 64
    :cond_0
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v3, p0, v1

    .line 65
    invoke-static {v3}, Ll/ۗ᩹ۧ;->֫(Ljava/io/File;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2

    .line 70
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    return v1
.end method
