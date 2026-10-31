.class public final Ll/ܳܿܳ;
.super Ljava/lang/Object;
.source "K6ZG"


# instance fields
.field public ֫:I

.field public ۧ:Z

.field public final ܳ:Ljava/lang/String;

.field public ܽ:Z

.field public final ܿ:Ll/ܿܿܳ;

.field public final ᩳ:Ll/᩻ܿܳ;

.field public ᩻:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;)V
    .locals 5

    .line 37
    sget-object v0, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "__mt_inspector_settings_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "-"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܳܿܳ;->ܳ:Ljava/lang/String;

    .line 43
    iput-object p1, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    .line 44
    new-instance v2, Ll/᩻ܿܳ;

    invoke-direct {v2, v0}, Ll/᩻ܿܳ;-><init>(Ll/۫ۤۡ;)V

    iput-object v2, p0, Ll/ܳܿܳ;->ᩳ:Ll/᩻ܿܳ;

    .line 45
    new-instance v0, Ll/ܿܿܳ;

    invoke-direct {v0, v2}, Ll/ܿܿܳ;-><init>(Ll/᩻ܿܳ;)V

    iput-object v0, p0, Ll/ܳܿܳ;->ܿ:Ll/ܿܿܳ;

    .line 46
    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "\')return false;try{var bridge=window[\'"

    const-string v1, "\'],encode=JSON.stringify;var mount="

    const-string v2, "(function(){var root=document.documentElement;if(!root||root[\'__mt_html_inspector_7d26a6c9__request\']!==\'"

    .line 0
    invoke-static {v2, p1, v0, p5, v1}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p5

    const-string v0, "eruda.js"

    .line 188
    invoke-virtual {p0, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    .line 189
    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p0, v0}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    .line 190
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_0
    const-string p0, ";root[\'__mt_html_inspector_7d26a6c9__\']=mount("

    const-string v1, ","

    .line 0
    invoke-static {p5, v0, p0, p2, v1}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ",function(command){try{return bridge.update(\'"

    invoke-virtual {p5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\',encode(command))===true;}catch(error){return false;}});delete root[\'__mt_html_inspector_7d26a6c9__request\'];return true;}catch(error){return false;}})()"

    .line 0
    invoke-static {p5, p1, p0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_1

    .line 188
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
.end method

.method public static synthetic ֫(ILandroid/content/res/AssetManager;Ll/ܳܿܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 85
    :try_start_0
    iget-object v5, p2, Ll/ܳܿܳ;->ܳ:Ljava/lang/String;

    move-object v0, p1

    move-object v1, p3

    move-object v2, p4

    move v3, p6

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Ll/ܳܿܳ;->֫(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object p3

    new-instance p4, Ll/ܽܿܳ;

    invoke-direct {p4, p2, p0, p1}, Ll/ܽܿܳ;-><init>(Ll/ܳܿܳ;ILjava/lang/String;)V

    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 87
    :catch_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object p1

    new-instance p3, Ll/ۧܿܳ;

    invoke-direct {p3, p2, p0}, Ll/ۧܿܳ;-><init>(Ll/ܳܿܳ;I)V

    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static ֫(Ll/ܳܿܳ;I)V
    .locals 1

    .line 156
    iget-object v0, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ܳܿܳ;->֫:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 162
    iput-boolean p1, p0, Ll/ܳܿܳ;->ܽ:Z

    .line 163
    iput-boolean p1, p0, Ll/ܳܿܳ;->ۧ:Z

    .line 165
    iget-object p0, p0, Ll/ܳܿܳ;->ܿ:Ll/ܿܿܳ;

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ll/ܿܿܳ;->֫(Ll/ܿܿܳ;Ljava/lang/String;)V

    const p0, 0x7f120711

    .line 166
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܳܿܳ;ILjava/lang/String;)V
    .locals 1

    const-string v0, "true"

    .line 93
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    .line 156
    iget-object v0, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ܳܿܳ;->֫:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 162
    iput-boolean p1, p0, Ll/ܳܿܳ;->ܽ:Z

    .line 163
    iput-boolean p2, p0, Ll/ܳܿܳ;->ۧ:Z

    if-nez p2, :cond_0

    .line 165
    iget-object p0, p0, Ll/ܳܿܳ;->ܿ:Ll/ܿܿܳ;

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ll/ܿܿܳ;->֫(Ll/ܿܿܳ;Ljava/lang/String;)V

    const p0, 0x7f120711

    .line 166
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܳܿܳ;ILl/۟ۤᩳ;Ljava/lang/String;)V
    .locals 1

    .line 156
    iget-object v0, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    iget p0, p0, Ll/ܳܿܳ;->֫:I

    if-ne p0, p1, :cond_0

    const-string p0, "true"

    .line 119
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 120
    invoke-virtual {p2}, Ll/۟ۤᩳ;->run()V

    :cond_0
    return-void
.end method

.method public static ۧ(ILandroid/content/res/AssetManager;Ll/ܳܿܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    .line 156
    iget-object v0, p2, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    iget v0, p2, Ll/ܳܿܳ;->֫:I

    if-ne v0, p0, :cond_1

    const-string v0, "true"

    .line 75
    invoke-virtual {v0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_0

    const/4 p0, 0x0

    .line 76
    iput-boolean p0, p2, Ll/ܳܿܳ;->ܽ:Z

    const/4 p0, 0x1

    .line 77
    iput-boolean p0, p2, Ll/ܳܿܳ;->ۧ:Z

    return-void

    .line 80
    :cond_0
    iget-object p5, p2, Ll/ܳܿܳ;->ܿ:Ll/ܿܿܳ;

    invoke-static {p5, p3}, Ll/ܿܿܳ;->֫(Ll/ܿܿܳ;Ljava/lang/String;)V

    .line 81
    iget-object p5, p2, Ll/ܳܿܳ;->ᩳ:Ll/᩻ܿܳ;

    invoke-virtual {p5}, Ll/᩻ܿܳ;->֫()Lorg/json/JSONObject;

    move-result-object p5

    invoke-virtual {p5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    .line 82
    sget-object p5, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v8, Ll/֫ܿܳ;

    move-object v0, v8

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v7, p6

    invoke-direct/range {v0 .. v7}, Ll/֫ܿܳ;-><init>(ILandroid/content/res/AssetManager;Ll/ܳܿܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p5, v8}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public static ۧ(Ll/ܳܿܳ;ILjava/lang/String;)V
    .locals 2

    .line 156
    iget-object v0, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    iget v1, p0, Ll/ܳܿܳ;->֫:I

    if-ne v1, p1, :cond_0

    .line 92
    new-instance v1, Ll/ᩳܿܳ;

    invoke-direct {v1, p0, p1}, Ll/ᩳܿܳ;-><init>(Ll/ܳܿܳ;I)V

    invoke-virtual {v0, p2, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 128
    invoke-virtual {p0}, Ll/ܳܿܳ;->ۧ()V

    .line 129
    iget-object v0, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/ܳܿܳ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    .line 130
    iput-object v0, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    return-void
.end method

.method public final ֫(Z)V
    .locals 10

    .line 59
    iget-object v0, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ܳܿܳ;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p0, Ll/ܳܿܳ;->ܽ:Z

    .line 63
    iget v3, p0, Ll/ܳܿܳ;->֫:I

    .line 64
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    .line 65
    iget-object v0, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v5

    .line 67
    iget-object v0, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Ll/ۢۤۡ;->֫(Landroid/content/res/Resources;)Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "(function(){var root=document.documentElement;if(!root)return false;var state=root[\'__mt_html_inspector_7d26a6c9__\'];if(state){state.show();return true;}root[\'__mt_html_inspector_7d26a6c9__request\']=\'"

    const-string v1, "\';return false;})()"

    .line 0
    invoke-static {v0, v4, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 71
    iget-object v8, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    new-instance v9, Ll/۟ᩳܳ;

    move-object v1, v9

    move-object v2, p0

    move v7, p1

    invoke-direct/range {v1 .. v7}, Ll/۟ᩳܳ;-><init>(Ll/ܳܿܳ;ILjava/lang/String;Landroid/content/res/AssetManager;Ljava/lang/String;Z)V

    invoke-virtual {v8, v0, v9}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/۟ۤᩳ;)Z
    .locals 4

    .line 102
    iget-boolean v0, p0, Ll/ܳܿܳ;->ܽ:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 104
    iget p1, p0, Ll/ܳܿܳ;->֫:I

    add-int/2addr p1, v2

    iput p1, p0, Ll/ܳܿܳ;->֫:I

    .line 105
    iput-boolean v1, p0, Ll/ܳܿܳ;->ܽ:Z

    .line 107
    iput-boolean v2, p0, Ll/ܳܿܳ;->ۧ:Z

    .line 108
    iget-object p1, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    const-string v0, "(function(){var root=document.documentElement;delete root[\'__mt_html_inspector_7d26a6c9__request\'];var state=root[\'__mt_html_inspector_7d26a6c9__\'];if(state)state.hide();})()"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return v2

    .line 113
    :cond_0
    iget-object v0, p0, Ll/ܳܿܳ;->᩻:Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    iget-boolean v3, p0, Ll/ܳܿܳ;->ۧ:Z

    if-nez v3, :cond_1

    goto :goto_0

    .line 116
    :cond_1
    iget v1, p0, Ll/ܳܿܳ;->֫:I

    .line 117
    new-instance v3, Ll/ܰᩳܳ;

    invoke-direct {v3, p0, v1, p1}, Ll/ܰᩳܳ;-><init>(Ll/ܳܿܳ;ILl/۟ۤᩳ;)V

    const-string p1, "(function(){var state=document.documentElement[\'__mt_html_inspector_7d26a6c9__\'];return !!(state&&state.hide());})()"

    invoke-virtual {v0, p1, v3}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final ۧ()V
    .locals 2

    .line 51
    iget v0, p0, Ll/ܳܿܳ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܳܿܳ;->֫:I

    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Ll/ܳܿܳ;->ܽ:Z

    .line 53
    iput-boolean v0, p0, Ll/ܳܿܳ;->ۧ:Z

    .line 54
    iget-object v0, p0, Ll/ܳܿܳ;->ܿ:Ll/ܿܿܳ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ܿܿܳ;->֫(Ll/ܿܿܳ;Ljava/lang/String;)V

    return-void
.end method
