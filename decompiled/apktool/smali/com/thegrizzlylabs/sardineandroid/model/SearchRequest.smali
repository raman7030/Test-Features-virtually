.class public Lcom/thegrizzlylabs/sardineandroid/model/SearchRequest;
.super Ljava/lang/Object;
.source "SearchRequest.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field public language:Ljava/lang/String;

.field public query:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "davbasic"

    .line 30
    iput-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/SearchRequest;->language:Ljava/lang/String;

    const-string v0, ""

    .line 31
    iput-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/SearchRequest;->query:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/SearchRequest;->language:Ljava/lang/String;

    .line 36
    iput-object p2, p0, Lcom/thegrizzlylabs/sardineandroid/model/SearchRequest;->query:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getLanguage()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/SearchRequest;->language:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuery()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/SearchRequest;->query:Ljava/lang/String;

    return-object v0
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/SearchRequest;->language:Ljava/lang/String;

    return-void
.end method

.method public setQuery(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/SearchRequest;->query:Ljava/lang/String;

    return-void
.end method
