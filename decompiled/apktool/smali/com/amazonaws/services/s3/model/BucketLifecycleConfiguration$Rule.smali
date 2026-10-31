.class public Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;
.super Ljava/lang/Object;
.source "BucketLifecycleConfiguration.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ᩸:Ljava/util/ArrayList;

.field public ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$NoncurrentVersionTransition;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 480
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;->᩸:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 481
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;->᩸:Ljava/util/ArrayList;

    .line 483
    :cond_0
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 476
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "NoncurrentVersionTransition cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 435
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;->᩹:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 436
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;->᩹:Ljava/util/ArrayList;

    .line 438
    :cond_0
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 432
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Transition cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
