.class public Lcom/amazonaws/event/ProgressEvent;
.super Ljava/lang/Object;
.source "ProgressEvent.java"


# instance fields
.field public ֫:J

.field public ۧ:I


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-wide p1, p0, Lcom/amazonaws/event/ProgressEvent;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 101
    iget-wide v0, p0, Lcom/amazonaws/event/ProgressEvent;->֫:J

    return-wide v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 123
    iput p1, p0, Lcom/amazonaws/event/ProgressEvent;->ۧ:I

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 112
    iget v0, p0, Lcom/amazonaws/event/ProgressEvent;->ۧ:I

    return v0
.end method
