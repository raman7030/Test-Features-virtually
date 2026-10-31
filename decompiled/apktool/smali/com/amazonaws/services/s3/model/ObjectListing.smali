.class public Lcom/amazonaws/services/s3/model/ObjectListing;
.super Ljava/lang/Object;
.source "ObjectListing.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۗ:Ljava/util/ArrayList;

.field public ۙ:Ljava/lang/String;

.field public ᩶:Z

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectListing;->ۗ:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectListing;->᩹:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectListing;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/ObjectListing;->᩸:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 334
    iput-boolean p1, p0, Lcom/amazonaws/services/s3/model/ObjectListing;->᩶:Z

    return-void
.end method

.method public final ۧ()Ljava/util/ArrayList;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectListing;->᩹:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/ObjectListing;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectListing;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 321
    iget-boolean v0, p0, Lcom/amazonaws/services/s3/model/ObjectListing;->᩶:Z

    return v0
.end method

.method public final ᩳ()Ljava/util/ArrayList;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectListing;->ۗ:Ljava/util/ArrayList;

    return-object v0
.end method
