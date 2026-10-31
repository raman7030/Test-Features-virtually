.class public Lcom/umeng/analytics/vshelper/PageNameMonitor$a;
.super Ljava/lang/Object;
.source "PageNameMonitor.java"


# static fields
.field public static final a:Lcom/umeng/analytics/vshelper/PageNameMonitor;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 14
    new-instance v0, Lcom/umeng/analytics/vshelper/PageNameMonitor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/analytics/vshelper/PageNameMonitor;-><init>(Lcom/umeng/analytics/vshelper/PageNameMonitor$1;)V

    sput-object v0, Lcom/umeng/analytics/vshelper/PageNameMonitor$a;->a:Lcom/umeng/analytics/vshelper/PageNameMonitor;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/umeng/analytics/vshelper/PageNameMonitor;
    .locals 1

    .line 13
    sget-object v0, Lcom/umeng/analytics/vshelper/PageNameMonitor$a;->a:Lcom/umeng/analytics/vshelper/PageNameMonitor;

    return-object v0
.end method
