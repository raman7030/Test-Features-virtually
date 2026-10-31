.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$2;
.super Ljava/lang/Object;
.source "TransferStatusUpdater.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;


# direct methods
.method public constructor <init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;ILcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;)V
    .locals 0

    .line 231
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$2;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$2;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;

    invoke-interface {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;->ܽ()V

    return-void
.end method
