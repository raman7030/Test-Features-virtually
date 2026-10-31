.class public final Lcom/amazonaws/metrics/AwsSdkMetrics$1;
.super Ljava/lang/Object;
.source "AwsSdkMetrics.java"

# interfaces
.implements Lcom/amazonaws/auth/AWSCredentialsProvider;


# instance fields
.field public final synthetic ֫:Lcom/amazonaws/auth/PropertiesCredentials;


# direct methods
.method public constructor <init>(Lcom/amazonaws/auth/PropertiesCredentials;)V
    .locals 0

    .line 641
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$1;->֫:Lcom/amazonaws/auth/PropertiesCredentials;

    return-void
.end method


# virtual methods
.method public final ֫()Lcom/amazonaws/auth/AWSCredentials;
    .locals 1

    .line 648
    iget-object v0, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$1;->֫:Lcom/amazonaws/auth/PropertiesCredentials;

    return-object v0
.end method
