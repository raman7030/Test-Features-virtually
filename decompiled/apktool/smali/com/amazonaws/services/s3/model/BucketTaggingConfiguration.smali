.class public Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;
.super Ljava/lang/Object;
.source "BucketTaggingConfiguration.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;->᩸:Ljava/util/ArrayList;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 153
    new-instance v0, Ljava/lang/StringBuffer;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 155
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TagSets: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    iget-object v2, p0, Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;->᩸:Ljava/util/ArrayList;

    .line 155
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "}"

    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 157
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/ArrayList;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;->᩸:Ljava/util/ArrayList;

    return-object v0
.end method
