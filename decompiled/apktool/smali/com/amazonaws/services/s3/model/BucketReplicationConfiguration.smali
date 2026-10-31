.class public Lcom/amazonaws/services/s3/model/BucketReplicationConfiguration;
.super Ljava/lang/Object;
.source "BucketReplicationConfiguration.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ᩸:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/BucketReplicationConfiguration;->᩸:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lcom/amazonaws/services/s3/model/ReplicationRule;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 119
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    .line 127
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/BucketReplicationConfiguration;->᩸:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 124
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Replication rule cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 120
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Rule id cannot be null or empty."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
