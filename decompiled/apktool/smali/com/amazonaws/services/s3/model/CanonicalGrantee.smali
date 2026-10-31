.class public Lcom/amazonaws/services/s3/model/CanonicalGrantee;
.super Ljava/lang/Object;
.source "CanonicalGrantee.java"

# interfaces
.implements Lcom/amazonaws/services/s3/model/Grantee;
.implements Ljava/io/Serializable;


# instance fields
.field public ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/CanonicalGrantee;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 109
    instance-of v0, p1, Lcom/amazonaws/services/s3/model/CanonicalGrantee;

    if-eqz v0, :cond_0

    .line 110
    check-cast p1, Lcom/amazonaws/services/s3/model/CanonicalGrantee;

    .line 111
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CanonicalGrantee;->᩸:Ljava/lang/String;

    iget-object p1, p1, Lcom/amazonaws/services/s3/model/CanonicalGrantee;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CanonicalGrantee;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/CanonicalGrantee;->᩸:Ljava/lang/String;

    return-void
.end method
