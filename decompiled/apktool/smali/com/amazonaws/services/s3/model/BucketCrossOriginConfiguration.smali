.class public Lcom/amazonaws/services/s3/model/BucketCrossOriginConfiguration;
.super Ljava/lang/Object;
.source "BucketCrossOriginConfiguration.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/BucketCrossOriginConfiguration;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/BucketCrossOriginConfiguration;->᩸:Ljava/util/ArrayList;

    return-object v0
.end method
