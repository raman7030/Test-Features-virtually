.class public Lcom/amazonaws/services/s3/model/Grant;
.super Ljava/lang/Object;
.source "Grant.java"


# instance fields
.field public ֫:Lcom/amazonaws/services/s3/model/Grantee;

.field public ۧ:Lcom/amazonaws/services/s3/model/Permission;


# direct methods
.method public constructor <init>(Lcom/amazonaws/services/s3/model/Grantee;Lcom/amazonaws/services/s3/model/Permission;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/Grant;->֫:Lcom/amazonaws/services/s3/model/Grantee;

    .line 40
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/Grant;->ۧ:Lcom/amazonaws/services/s3/model/Permission;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 86
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 88
    :cond_2
    check-cast p1, Lcom/amazonaws/services/s3/model/Grant;

    iget-object v2, p1, Lcom/amazonaws/services/s3/model/Grant;->֫:Lcom/amazonaws/services/s3/model/Grantee;

    .line 89
    iget-object v3, p0, Lcom/amazonaws/services/s3/model/Grant;->֫:Lcom/amazonaws/services/s3/model/Grantee;

    if-nez v3, :cond_3

    if-eqz v2, :cond_4

    return v1

    .line 92
    :cond_3
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    .line 94
    :cond_4
    iget-object v2, p0, Lcom/amazonaws/services/s3/model/Grant;->ۧ:Lcom/amazonaws/services/s3/model/Permission;

    iget-object p1, p1, Lcom/amazonaws/services/s3/model/Grant;->ۧ:Lcom/amazonaws/services/s3/model/Permission;

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 71
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/Grant;->֫:Lcom/amazonaws/services/s3/model/Grantee;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/lit8 v1, v1, 0x1f

    mul-int/lit8 v1, v1, 0x1f

    .line 72
    iget-object v2, p0, Lcom/amazonaws/services/s3/model/Grant;->ۧ:Lcom/amazonaws/services/s3/model/Permission;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Grant [grantee="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/Grant;->֫:Lcom/amazonaws/services/s3/model/Grantee;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", permission="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/Grant;->ۧ:Lcom/amazonaws/services/s3/model/Permission;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
