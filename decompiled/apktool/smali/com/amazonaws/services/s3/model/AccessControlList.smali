.class public Lcom/amazonaws/services/s3/model/AccessControlList;
.super Ljava/lang/Object;
.source "AccessControlList.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;


# static fields
.field public static final serialVersionUID:J = 0x70575c947c762418L


# instance fields
.field public ᩶:Lcom/amazonaws/services/s3/model/Owner;

.field public ᩸:Ljava/util/LinkedList;

.field public ᩹:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 74
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    .line 244
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 247
    :cond_2
    check-cast p1, Lcom/amazonaws/services/s3/model/AccessControlList;

    .line 249
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    if-nez v0, :cond_3

    .line 250
    iget-object v0, p1, Lcom/amazonaws/services/s3/model/AccessControlList;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    if-eqz v0, :cond_4

    goto :goto_0

    .line 253
    :cond_3
    iget-object v1, p1, Lcom/amazonaws/services/s3/model/AccessControlList;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/model/Owner;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 257
    :cond_4
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩹:Ljava/util/HashSet;

    if-nez v0, :cond_5

    .line 258
    iget-object v0, p1, Lcom/amazonaws/services/s3/model/AccessControlList;->᩹:Ljava/util/HashSet;

    if-eqz v0, :cond_6

    goto :goto_0

    .line 261
    :cond_5
    iget-object v1, p1, Lcom/amazonaws/services/s3/model/AccessControlList;->᩹:Ljava/util/HashSet;

    invoke-interface {v0, v1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    .line 265
    :cond_6
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩸:Ljava/util/LinkedList;

    if-nez v0, :cond_7

    .line 266
    iget-object p1, p1, Lcom/amazonaws/services/s3/model/AccessControlList;->᩸:Ljava/util/LinkedList;

    if-eqz p1, :cond_8

    goto :goto_0

    .line 269
    :cond_7
    iget-object p1, p1, Lcom/amazonaws/services/s3/model/AccessControlList;->᩸:Ljava/util/LinkedList;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_8
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 229
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/Owner;->hashCode()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 230
    iget-object v2, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩹:Ljava/util/HashSet;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-interface {v2}, Ljava/util/Set;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 231
    iget-object v2, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩸:Ljava/util/LinkedList;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 281
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AccessControlList [owner="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", grants="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/AccessControlList;->֫()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/List;
    .locals 2

    .line 196
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩹:Ljava/util/HashSet;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩸:Ljava/util/LinkedList;

    if-nez v1, :cond_0

    goto :goto_0

    .line 197
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Both grant set and grant list cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩸:Ljava/util/LinkedList;

    if-nez v1, :cond_3

    if-nez v0, :cond_2

    .line 212
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩸:Ljava/util/LinkedList;

    goto :goto_1

    .line 214
    :cond_2
    new-instance v0, Ljava/util/LinkedList;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩹:Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩸:Ljava/util/LinkedList;

    const/4 v0, 0x0

    .line 215
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩹:Ljava/util/HashSet;

    .line 219
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩸:Ljava/util/LinkedList;

    return-object v0
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/Owner;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method

.method public final ۧ()Lcom/amazonaws/services/s3/model/Owner;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AccessControlList;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    return-object v0
.end method
