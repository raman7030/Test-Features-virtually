.class public Ll/ܿ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# instance fields
.field public ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܿ᩸ۘ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܶۘ;Ljava/lang/String;)V
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ܿ᩸ۘ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ֫(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 8

    .line 224
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "-->canHandleUrl---url = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.JsBridge"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    goto :goto_0

    .line 228
    :cond_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 229
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v3, "jsbridge"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "/#"

    .line 233
    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "/"

    invoke-virtual {p2, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 234
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v2, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 235
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v3, 0x6

    if-ge p2, v3, :cond_2

    :goto_0
    return v0

    :cond_2
    const/4 p2, 0x2

    .line 239
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 v3, 0x3

    .line 240
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 252
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    const/4 v6, 0x4

    invoke-virtual {v2, v6, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v2

    .line 255
    new-instance v4, Ll/۬ܶۘ;

    const-wide/16 v6, 0x4

    invoke-direct {v4, p1, v6, v7}, Ll/۬ܶۘ;-><init>(Landroid/webkit/WebView;J)V

    .line 199
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v6, "getResult---objName = "

    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " methodName = "

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    :goto_1
    if-ge v0, p1, :cond_3

    .line 204
    :try_start_0
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "UTF-8"

    invoke-static {v6, v7}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v0, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 209
    :cond_3
    iget-object p1, p0, Ll/ܿ᩸ۘ;->֫:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫ܶۘ;

    if-eqz p1, :cond_4

    const-string p2, "call----"

    .line 212
    invoke-static {v1, p2}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    invoke-virtual {p1, v3, v2, v4}, Ll/۫ܶۘ;->֫(Ljava/lang/String;Ljava/util/List;Ll/۬ܶۘ;)V

    goto :goto_2

    :cond_4
    const-string p1, "not call----objName NOT FIND"

    .line 215
    invoke-static {v1, p1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    invoke-virtual {v4}, Ll/۬ܶۘ;->ۧ()V

    :goto_2
    return v5
.end method
