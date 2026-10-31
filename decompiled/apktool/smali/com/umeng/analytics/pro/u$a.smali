.class public Lcom/umeng/analytics/pro/u$a;
.super Ljava/lang/Object;
.source "X4HS"


# static fields
.field public static final a:Lcom/umeng/analytics/pro/u;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 69
    new-instance v0, Lcom/umeng/analytics/pro/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/u;-><init>(Lcom/umeng/analytics/pro/u$1;)V

    sput-object v0, Lcom/umeng/analytics/pro/u$a;->a:Lcom/umeng/analytics/pro/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/umeng/analytics/pro/u;
    .locals 1

    .line 68
    sget-object v0, Lcom/umeng/analytics/pro/u$a;->a:Lcom/umeng/analytics/pro/u;

    return-object v0
.end method
