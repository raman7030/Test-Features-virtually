.class public Lcom/amazonaws/event/ProgressReportingInputStream;
.super Lcom/amazonaws/internal/SdkFilterInputStream;
.source "ProgressReportingInputStream.java"


# instance fields
.field public ۙ:I

.field public ᩶:I

.field public ᩸:Z

.field public final ᩹:Lcom/amazonaws/event/ProgressListenerCallbackExecutor;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lcom/amazonaws/event/ProgressListenerCallbackExecutor;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 p1, 0x2000

    .line 42
    iput p1, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩶:I

    .line 72
    iput-object p2, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩹:Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 142
    iget v0, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    if-lez v0, :cond_0

    .line 143
    new-instance v1, Lcom/amazonaws/event/ProgressEvent;

    int-to-long v2, v0

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    iget-object v0, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩹:Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

    invoke-virtual {v0, v1}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    const/4 v0, 0x0

    .line 144
    iput v0, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    .line 146
    :cond_0
    invoke-super {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->close()V

    return-void
.end method

.method public final read()I
    .locals 7

    .line 112
    invoke-super {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    .line 113
    iget-object v2, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩹:Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    .line 150
    iget-boolean v1, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩸:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 153
    :cond_0
    new-instance v1, Lcom/amazonaws/event/ProgressEvent;

    iget v4, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    int-to-long v4, v4

    invoke-direct {v1, v4, v5}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    const/4 v4, 0x4

    .line 123
    iput v4, v1, Lcom/amazonaws/event/ProgressEvent;->ۧ:I

    .line 155
    iput v3, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    .line 156
    invoke-virtual {v2, v1}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    return v0

    .line 160
    :cond_1
    iget v1, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    .line 162
    iget v4, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩶:I

    if-lt v1, v4, :cond_2

    .line 163
    new-instance v4, Lcom/amazonaws/event/ProgressEvent;

    int-to-long v5, v1

    invoke-direct {v4, v5, v6}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    invoke-virtual {v2, v4}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    .line 164
    iput v3, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    :cond_2
    :goto_0
    return v0
.end method

.method public final read([BII)I
    .locals 4

    .line 132
    invoke-super {p0, p1, p2, p3}, Lcom/amazonaws/internal/SdkFilterInputStream;->read([BII)I

    move-result p1

    .line 133
    iget-object p2, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩹:Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

    const/4 p3, 0x0

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 150
    iget-boolean v1, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩸:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 153
    :cond_0
    new-instance v1, Lcom/amazonaws/event/ProgressEvent;

    iget v2, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    int-to-long v2, v2

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    const/4 v2, 0x4

    .line 123
    iput v2, v1, Lcom/amazonaws/event/ProgressEvent;->ۧ:I

    .line 155
    iput p3, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    .line 156
    invoke-virtual {p2, v1}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    :cond_1
    :goto_0
    if-eq p1, v0, :cond_2

    .line 160
    iget v0, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    .line 162
    iget v1, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩶:I

    if-lt v0, v1, :cond_2

    .line 163
    new-instance v1, Lcom/amazonaws/event/ProgressEvent;

    int-to-long v2, v0

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    invoke-virtual {p2, v1}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    .line 164
    iput p3, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    :cond_2
    return p1
.end method

.method public final reset()V
    .locals 3

    .line 123
    invoke-super {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->reset()V

    .line 124
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    iget v1, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    int-to-long v1, v1

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    const/16 v1, 0x20

    .line 123
    iput v1, v0, Lcom/amazonaws/event/ProgressEvent;->ۧ:I

    .line 126
    iget-object v1, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩹:Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

    invoke-virtual {v1, v0}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    const/4 v0, 0x0

    .line 127
    iput v0, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->ۙ:I

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    mul-int/lit16 p1, p1, 0x400

    .line 83
    iput p1, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩶:I

    return-void
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x1

    .line 95
    iput-boolean v0, p0, Lcom/amazonaws/event/ProgressReportingInputStream;->᩸:Z

    return-void
.end method
