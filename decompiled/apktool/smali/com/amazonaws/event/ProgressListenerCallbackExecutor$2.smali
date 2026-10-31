.class public Lcom/amazonaws/event/ProgressListenerCallbackExecutor$2;
.super Ljava/lang/Object;
.source "ProgressListenerCallbackExecutor.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

.field public final synthetic ᩹:Lcom/amazonaws/event/ProgressEvent;


# direct methods
.method public constructor <init>(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;Lcom/amazonaws/event/ProgressEvent;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/event/ProgressListenerCallbackExecutor$2;->᩸:Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

    iput-object p2, p0, Lcom/amazonaws/event/ProgressListenerCallbackExecutor$2;->᩹:Lcom/amazonaws/event/ProgressEvent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/amazonaws/event/ProgressListenerCallbackExecutor$2;->᩸:Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

    invoke-static {v0}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;)Lcom/amazonaws/event/ProgressListener;

    move-result-object v0

    iget-object v1, p0, Lcom/amazonaws/event/ProgressListenerCallbackExecutor$2;->᩹:Lcom/amazonaws/event/ProgressEvent;

    invoke-interface {v0, v1}, Lcom/amazonaws/event/ProgressListener;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    return-void
.end method
