.class public Lcom/amazonaws/services/s3/model/BucketWebsiteConfiguration;
.super Ljava/lang/Object;
.source "BucketWebsiteConfiguration.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ᩸:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/BucketWebsiteConfiguration;->᩸:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/LinkedList;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/BucketWebsiteConfiguration;->᩸:Ljava/util/LinkedList;

    return-object v0
.end method
