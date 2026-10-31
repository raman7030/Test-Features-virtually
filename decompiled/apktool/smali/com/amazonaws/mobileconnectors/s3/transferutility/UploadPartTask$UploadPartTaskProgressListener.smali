.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;
.super Ljava/lang/Object;
.source "UploadPartTask.java"

# interfaces
.implements Lcom/amazonaws/event/ProgressListener;


# instance fields
.field public ֫:J

.field public final synthetic ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;

.field public final ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;


# direct methods
.method public constructor <init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;

    .line 131
    iput-object p2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/event/ProgressEvent;)V
    .locals 4

    const/16 v0, 0x20

    .line 136
    invoke-virtual {p1}, Lcom/amazonaws/event/ProgressEvent;->ۧ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 138
    invoke-static {}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->֫()Lcom/amazonaws/logging/Log;

    move-result-object p1

    const-string v0, "Reset Event triggered. Resetting the bytesCurrent to 0."

    invoke-interface {p1, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    .line 140
    iput-wide v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;->֫:J

    goto :goto_0

    .line 142
    :cond_0
    iget-wide v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;->֫:J

    invoke-virtual {p1}, Lcom/amazonaws/event/ProgressEvent;->֫()J

    move-result-wide v2

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;->֫:J

    .line 144
    :goto_0
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;->ۧ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;

    .line 145
    invoke-static {p1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;->֫(Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;)Lcom/amazonaws/services/s3/model/UploadPartRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۢ()I

    move-result p1

    iget-wide v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;->֫:J

    .line 144
    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask$UploadPartTaskProgressListener;->ܽ:Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;

    invoke-virtual {v2, p1, v0, v1}, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadTask$UploadTaskProgressListener;->֫(IJ)V

    return-void
.end method
