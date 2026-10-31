.class public abstract Ll/ۖۧ֫;
.super Ljava/lang/Object;
.source "P57G"


# direct methods
.method public static ֫(Landroid/app/Application;Landroid/net/Uri;)Ll/ۖۧ֫;
    .locals 2

    .line 133
    invoke-static {p1}, Ll/᩶۫;->֫(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 69
    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 96
    invoke-static {p1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_2

    .line 142
    invoke-static {p1, v0}, Ll/᩶۫;->֫(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 147
    new-instance p1, Ll/ۘۧ֫;

    invoke-direct {p1, p0, v0}, Ll/ۘۧ֫;-><init>(Landroid/app/Application;Landroid/net/Uri;)V

    return-object p1

    .line 144
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to build documentUri from a tree: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 138
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Could not get document ID from Uri: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract ֫()Ljava/lang/String;
.end method
