.class public final Ll/᩸۫;
.super Ljava/lang/Object;
.source "U9SU"


# direct methods
.method public static ֫(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 280
    invoke-static {p0, p1, p2}, Landroid/provider/DocumentsContract;->renameDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 272
    invoke-static {p0, p1, p2, p3}, Landroid/provider/DocumentsContract;->createDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 266
    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->buildChildDocumentsUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 261
    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->buildChildDocumentsUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    .line 246
    invoke-static {p0}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 256
    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 251
    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->buildTreeDocumentUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method
