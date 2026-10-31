.class public Lcom/amazonaws/SDKGlobalConfiguration;
.super Ljava/lang/Object;
.source "SDKGlobalConfiguration.java"


# static fields
.field public static final ֫:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 134
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/amazonaws/SDKGlobalConfiguration;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public static ֫()J
    .locals 2

    .line 165
    sget-object v0, Lcom/amazonaws/SDKGlobalConfiguration;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public static ֫(J)V
    .locals 1

    .line 144
    sget-object v0, Lcom/amazonaws/SDKGlobalConfiguration;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method
