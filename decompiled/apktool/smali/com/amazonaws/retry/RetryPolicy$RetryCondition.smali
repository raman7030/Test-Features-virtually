.class public interface abstract Lcom/amazonaws/retry/RetryPolicy$RetryCondition;
.super Ljava/lang/Object;
.source "RetryPolicy.java"


# static fields
.field public static final ֫:Lcom/amazonaws/retry/RetryPolicy$RetryCondition;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 145
    new-instance v0, Lcom/amazonaws/retry/RetryPolicy$RetryCondition$1;

    invoke-direct {v0}, Lcom/amazonaws/retry/RetryPolicy$RetryCondition$1;-><init>()V

    sput-object v0, Lcom/amazonaws/retry/RetryPolicy$RetryCondition;->֫:Lcom/amazonaws/retry/RetryPolicy$RetryCondition;

    return-void
.end method


# virtual methods
.method public abstract ֫(Lcom/amazonaws/AmazonClientException;I)Z
.end method
