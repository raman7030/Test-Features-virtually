.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$3;
.super Ljava/lang/Object;
.source "TransferStatusUpdater.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;


# direct methods
.method public constructor <init>(Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;IJJ)V
    .locals 0

    .line 286
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$3;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferStatusUpdater$3;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;

    invoke-interface {v0}, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;->֫()V

    return-void
.end method
