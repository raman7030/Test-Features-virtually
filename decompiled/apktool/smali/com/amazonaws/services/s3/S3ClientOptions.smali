.class public Lcom/amazonaws/services/s3/S3ClientOptions;
.super Ljava/lang/Object;
.source "S3ClientOptions.java"


# instance fields
.field public ֫:Z


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 216
    iput-boolean v0, p0, Lcom/amazonaws/services/s3/S3ClientOptions;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 392
    iput-boolean p1, p0, Lcom/amazonaws/services/s3/S3ClientOptions;->֫:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 288
    iget-boolean v0, p0, Lcom/amazonaws/services/s3/S3ClientOptions;->֫:Z

    return v0
.end method
