.class public Lcom/amazonaws/http/ExecutionContext;
.super Ljava/lang/Object;
.source "ExecutionContext.java"


# instance fields
.field public final ֫:Lcom/amazonaws/util/AWSRequestMetrics;

.field public ۧ:Lcom/amazonaws/auth/AWSCredentials;

.field public final ܽ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;Z)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lcom/amazonaws/http/ExecutionContext;->ܽ:Ljava/util/List;

    if-eqz p2, :cond_0

    .line 65
    new-instance p1, Lcom/amazonaws/util/AWSRequestMetricsFullSupport;

    invoke-direct {p1}, Lcom/amazonaws/util/AWSRequestMetricsFullSupport;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/amazonaws/util/AWSRequestMetrics;

    invoke-direct {p1}, Lcom/amazonaws/util/AWSRequestMetrics;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/amazonaws/http/ExecutionContext;->֫:Lcom/amazonaws/util/AWSRequestMetrics;

    return-void
.end method


# virtual methods
.method public final ֫()Lcom/amazonaws/util/AWSRequestMetrics;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/amazonaws/http/ExecutionContext;->֫:Lcom/amazonaws/util/AWSRequestMetrics;

    return-object v0
.end method

.method public final ֫(Lcom/amazonaws/auth/AWSCredentials;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/amazonaws/http/ExecutionContext;->ۧ:Lcom/amazonaws/auth/AWSCredentials;

    return-void
.end method

.method public final ۧ()Lcom/amazonaws/auth/AWSCredentials;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/amazonaws/http/ExecutionContext;->ۧ:Lcom/amazonaws/auth/AWSCredentials;

    return-object v0
.end method

.method public final ܽ()Ljava/util/List;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/amazonaws/http/ExecutionContext;->ܽ:Ljava/util/List;

    return-object v0
.end method
