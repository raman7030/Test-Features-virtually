.class public abstract Lcom/amazonaws/AmazonWebServiceRequest;
.super Ljava/lang/Object;
.source "AmazonWebServiceRequest.java"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ᩸:Lcom/amazonaws/event/ProgressListener;

.field public final ᩹:Lcom/amazonaws/RequestClientOptions;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lcom/amazonaws/RequestClientOptions;

    invoke-direct {v0}, Lcom/amazonaws/RequestClientOptions;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/AmazonWebServiceRequest;->᩹:Lcom/amazonaws/RequestClientOptions;

    return-void
.end method


# virtual methods
.method public clone()Lcom/amazonaws/AmazonWebServiceRequest;
    .locals 3

    .line 216
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/AmazonWebServiceRequest;

    .line 217
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 220
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Got a CloneNotSupportedException from Object.clone() even though we\'re Cloneable!"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lcom/amazonaws/AmazonWebServiceRequest;->clone()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v0

    return-object v0
.end method

.method public ֫()Lcom/amazonaws/event/ProgressListener;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/amazonaws/AmazonWebServiceRequest;->᩸:Lcom/amazonaws/event/ProgressListener;

    return-object v0
.end method

.method public ֫(Lcom/amazonaws/event/ProgressListener;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/amazonaws/AmazonWebServiceRequest;->᩸:Lcom/amazonaws/event/ProgressListener;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/PutObjectRequest;)V
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/amazonaws/AmazonWebServiceRequest;->᩸:Lcom/amazonaws/event/ProgressListener;

    .line 132
    iput-object v0, p1, Lcom/amazonaws/AmazonWebServiceRequest;->᩸:Lcom/amazonaws/event/ProgressListener;

    return-void
.end method

.method public final ܽ()Lcom/amazonaws/RequestClientOptions;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/amazonaws/AmazonWebServiceRequest;->᩹:Lcom/amazonaws/RequestClientOptions;

    return-object v0
.end method
