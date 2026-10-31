.class public Lcom/amazonaws/http/HttpResponse$Builder;
.super Ljava/lang/Object;
.source "HttpResponse.java"


# instance fields
.field public ֫:Ljava/io/InputStream;

.field public final ۧ:Ljava/util/HashMap;

.field public ܽ:I

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/http/HttpResponse$Builder;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫()Lcom/amazonaws/http/HttpResponse;
    .locals 5

    .line 178
    new-instance v0, Lcom/amazonaws/http/HttpResponse;

    iget-object v1, p0, Lcom/amazonaws/http/HttpResponse$Builder;->ᩳ:Ljava/lang/String;

    iget v2, p0, Lcom/amazonaws/http/HttpResponse$Builder;->ܽ:I

    iget-object v3, p0, Lcom/amazonaws/http/HttpResponse$Builder;->ۧ:Ljava/util/HashMap;

    .line 179
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lcom/amazonaws/http/HttpResponse$Builder;->֫:Ljava/io/InputStream;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amazonaws/http/HttpResponse;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/io/InputStream;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 144
    iput p1, p0, Lcom/amazonaws/http/HttpResponse$Builder;->ܽ:I

    return-void
.end method

.method public final ֫(Ljava/io/InputStream;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/amazonaws/http/HttpResponse$Builder;->֫:Ljava/io/InputStream;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/amazonaws/http/HttpResponse$Builder;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/amazonaws/http/HttpResponse$Builder;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
