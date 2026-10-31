.class public Lcom/amazonaws/services/s3/model/Tag;
.super Ljava/lang/Object;
.source "Tag.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/Tag;->᩸:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/Tag;->᩹:Ljava/lang/String;

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

    if-eqz p1, :cond_5

    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 100
    :cond_1
    check-cast p1, Lcom/amazonaws/services/s3/model/Tag;

    iget-object v2, p1, Lcom/amazonaws/services/s3/model/Tag;->᩹:Ljava/lang/String;

    iget-object p1, p1, Lcom/amazonaws/services/s3/model/Tag;->᩸:Ljava/lang/String;

    .line 102
    iget-object v3, p0, Lcom/amazonaws/services/s3/model/Tag;->᩸:Ljava/lang/String;

    if-eqz v3, :cond_2

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_3

    :goto_0
    return v1

    .line 105
    :cond_3
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/Tag;->᩹:Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    if-nez v2, :cond_5

    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 111
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/Tag;->᩸:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 112
    iget-object v2, p0, Lcom/amazonaws/services/s3/model/Tag;->᩹:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/Tag;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/Tag;->᩹:Ljava/lang/String;

    return-object v0
.end method
