.class public final enum Lcom/amazonaws/util/AWSServiceMetrics;
.super Ljava/lang/Enum;
.source "AWSServiceMetrics.java"

# interfaces
.implements Lcom/amazonaws/metrics/MetricType;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final enum ᩶:Lcom/amazonaws/util/AWSServiceMetrics;

.field public static final synthetic ᩹:[Lcom/amazonaws/util/AWSServiceMetrics;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 32
    new-instance v0, Lcom/amazonaws/util/AWSServiceMetrics;

    const-string v1, "HttpClient"

    const-string v2, "HttpClientGetConnectionTime"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/amazonaws/util/AWSServiceMetrics;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/amazonaws/util/AWSServiceMetrics;->᩶:Lcom/amazonaws/util/AWSServiceMetrics;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/amazonaws/util/AWSServiceMetrics;

    aput-object v0, v1, v3

    .line 27
    sput-object v1, Lcom/amazonaws/util/AWSServiceMetrics;->᩹:[Lcom/amazonaws/util/AWSServiceMetrics;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    iput-object p3, p0, Lcom/amazonaws/util/AWSServiceMetrics;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/util/AWSServiceMetrics;
    .locals 1

    .line 27
    const-class v0, Lcom/amazonaws/util/AWSServiceMetrics;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/util/AWSServiceMetrics;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/util/AWSServiceMetrics;
    .locals 1

    .line 27
    sget-object v0, Lcom/amazonaws/util/AWSServiceMetrics;->᩹:[Lcom/amazonaws/util/AWSServiceMetrics;

    invoke-virtual {v0}, [Lcom/amazonaws/util/AWSServiceMetrics;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/util/AWSServiceMetrics;

    return-object v0
.end method


# virtual methods
.method public ֫()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/amazonaws/util/AWSServiceMetrics;->᩸:Ljava/lang/String;

    return-object v0
.end method
