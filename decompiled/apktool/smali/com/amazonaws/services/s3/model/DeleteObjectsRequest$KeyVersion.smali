.class public Lcom/amazonaws/services/s3/model/DeleteObjectsRequest$KeyVersion;
.super Ljava/lang/Object;
.source "DeleteObjectsRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 339
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 340
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest$KeyVersion;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest$KeyVersion;->᩸:Ljava/lang/String;

    return-object v0
.end method
