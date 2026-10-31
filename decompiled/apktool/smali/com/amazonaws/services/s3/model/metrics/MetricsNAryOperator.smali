.class public abstract Lcom/amazonaws/services/s3/model/metrics/MetricsNAryOperator;
.super Lcom/amazonaws/services/s3/model/metrics/MetricsFilterPredicate;
.source "MetricsNAryOperator.java"


# instance fields
.field public final ᩸:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilterPredicate;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/metrics/MetricsNAryOperator;->᩸:Ljava/util/List;

    return-void
.end method
