.class public Lcom/amazonaws/http/HttpRequest;
.super Ljava/lang/Object;
.source "HttpRequest.java"


# instance fields
.field public final ֫:Ljava/io/InputStream;

.field public final ۧ:Ljava/util/Map;

.field public ܽ:Z

.field public ܿ:Ljava/net/URI;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/net/URI;Ljava/util/HashMap;Ljava/io/InputStream;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    sget-object v0, Lcom/amazonaws/util/StringUtils;->֫:Ljava/nio/charset/Charset;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 253
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, ""

    goto :goto_0

    .line 256
    :cond_1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 59
    :goto_0
    iput-object p1, p0, Lcom/amazonaws/http/HttpRequest;->ᩳ:Ljava/lang/String;

    .line 60
    iput-object p2, p0, Lcom/amazonaws/http/HttpRequest;->ܿ:Ljava/net/URI;

    .line 62
    invoke-static {p3}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/http/HttpRequest;->ۧ:Ljava/util/Map;

    .line 63
    iput-object p4, p0, Lcom/amazonaws/http/HttpRequest;->֫:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/io/InputStream;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/amazonaws/http/HttpRequest;->֫:Ljava/io/InputStream;

    return-object v0
.end method

.method public final ֫(Z)V
    .locals 0

    .line 135
    iput-boolean p1, p0, Lcom/amazonaws/http/HttpRequest;->ܽ:Z

    return-void
.end method

.method public final ۧ()J
    .locals 4

    const-wide/16 v0, 0x0

    .line 119
    iget-object v2, p0, Lcom/amazonaws/http/HttpRequest;->ۧ:Ljava/util/Map;

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    const-string v3, "Content-Length"

    .line 122
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 123
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 126
    :cond_1
    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :cond_2
    :goto_0
    return-wide v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 130
    iget-boolean v0, p0, Lcom/amazonaws/http/HttpRequest;->ܽ:Z

    return v0
.end method

.method public final ܽ()Ljava/util/Map;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/amazonaws/http/HttpRequest;->ۧ:Ljava/util/Map;

    return-object v0
.end method

.method public final ܿ()Ljava/net/URI;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/amazonaws/http/HttpRequest;->ܿ:Ljava/net/URI;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/amazonaws/http/HttpRequest;->ᩳ:Ljava/lang/String;

    return-object v0
.end method
