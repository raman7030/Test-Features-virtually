.class public final Ll/᩶۫;
.super Ljava/lang/Object;
.source "U9SU"


# direct methods
.method public static ֫(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 132
    invoke-static {p0, p1}, Ll/᩸۫;->ۧ(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    .line 107
    invoke-static {p0}, Ll/᩸۫;->֫(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/net/Uri;)Z
    .locals 3

    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_1

    .line 82
    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p0

    .line 83
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    const-string v0, "tree"

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v2

    .line 85
    :cond_1
    invoke-static {p0}, Ll/᩹۫;->֫(Landroid/net/Uri;)Z

    move-result p0

    return p0
.end method
