.class public Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;
.super Ljava/lang/Object;
.source "SSEAwsKeyManagementParams.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 39
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;->᩸:Ljava/lang/String;

    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "AWS Key Management System Key id cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;->᩸:Ljava/lang/String;

    return-object v0
.end method
