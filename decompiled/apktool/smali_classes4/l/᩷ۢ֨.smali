.class public final Ll/᩷ۢ֨;
.super Ljava/lang/Object;
.source "D4TB"


# static fields
.field public static final ֫:Ll/ۢۢ֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 13
    new-instance v0, Ll/ۢۢ֨;

    .line 21
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;

    invoke-direct {v1}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;-><init>()V

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/RejectedExecutionHandler;)V

    .line 13
    sput-object v0, Ll/᩷ۢ֨;->֫:Ll/ۢۢ֨;

    return-void
.end method

.method public static synthetic ֫()Ll/ۢۢ֨;
    .locals 1

    .line 12
    sget-object v0, Ll/᩷ۢ֨;->֫:Ll/ۢۢ֨;

    return-object v0
.end method
