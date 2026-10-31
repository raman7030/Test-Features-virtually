.class public final Lcom/amazonaws/regions/Region;
.super Ljava/lang/Object;
.source "Region.java"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ljava/lang/String;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/regions/Region;->ᩳ:Ljava/util/HashMap;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/regions/Region;->֫:Ljava/util/HashMap;

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/regions/Region;->ۧ:Ljava/util/HashMap;

    .line 47
    iput-object p1, p0, Lcom/amazonaws/regions/Region;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 197
    instance-of v0, p1, Lcom/amazonaws/regions/Region;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 200
    :cond_0
    check-cast p1, Lcom/amazonaws/regions/Region;

    .line 80
    iget-object v0, p0, Lcom/amazonaws/regions/Region;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Lcom/amazonaws/regions/Region;->ܽ:Ljava/lang/String;

    .line 201
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/amazonaws/regions/Region;->ܽ:Ljava/lang/String;

    .line 206
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/amazonaws/regions/Region;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ljava/util/HashMap;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/amazonaws/regions/Region;->֫:Ljava/util/HashMap;

    return-object v0
.end method

.method public final ۧ()Ljava/util/HashMap;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/amazonaws/regions/Region;->ۧ:Ljava/util/HashMap;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/amazonaws/regions/Region;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Ljava/util/HashMap;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/amazonaws/regions/Region;->ᩳ:Ljava/util/HashMap;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 2

    const-string v0, "s3"

    .line 118
    iget-object v1, p0, Lcom/amazonaws/regions/Region;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
