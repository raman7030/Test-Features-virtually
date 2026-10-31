.class public abstract Lcom/amazonaws/services/s3/model/analytics/AnalyticsNAryOperator;
.super Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilterPredicate;
.source "AnalyticsNAryOperator.java"


# instance fields
.field public final ᩸:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilterPredicate;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsNAryOperator;->᩸:Ljava/util/List;

    return-void
.end method
