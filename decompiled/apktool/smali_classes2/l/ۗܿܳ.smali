.class public final Ll/ۗܿܳ;
.super Ljava/lang/Object;
.source "46LH"


# instance fields
.field public final ֫:Landroid/content/res/AssetManager;


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/ۗܿܳ;->֫:Landroid/content/res/AssetManager;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 11

    const-string v0, "markdown-preview/"

    const-string v1, "/_mt_markdown_vendor_/"

    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x16

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    const-string v1, "katex.min.css"

    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "Not Found"

    const/16 v3, 0x194

    if-nez v1, :cond_1

    const-string v1, "katex.min.js"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 23
    invoke-static {v3, v2}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v1, ".js"

    .line 25
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "application/javascript"

    goto :goto_1

    :cond_2
    const-string v1, "text/css"

    :goto_1
    move-object v5, v1

    .line 27
    :try_start_0
    new-instance v1, Landroid/webkit/WebResourceResponse;

    const-string v6, "UTF-8"

    const-string v8, "OK"

    .line 28
    invoke-static {}, Ll/ܺ۫᩷;->֫()Ljava/util/Map;

    move-result-object v9

    iget-object v4, p0, Ll/ۗܿܳ;->֫:Landroid/content/res/AssetManager;

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-virtual {v4, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v10

    const/16 v7, 0xc8

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 31
    :catch_0
    invoke-static {v3, v2}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method
