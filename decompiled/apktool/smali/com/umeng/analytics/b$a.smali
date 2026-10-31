.class public Lcom/umeng/analytics/b$a;
.super Ljava/lang/Object;
.source "A69W"


# static fields
.field public static final a:Lcom/umeng/analytics/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 121
    new-instance v0, Lcom/umeng/analytics/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/analytics/b;-><init>(Lcom/umeng/analytics/b$1;)V

    sput-object v0, Lcom/umeng/analytics/b$a;->a:Lcom/umeng/analytics/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/umeng/analytics/b;
    .locals 1

    .line 120
    sget-object v0, Lcom/umeng/analytics/b$a;->a:Lcom/umeng/analytics/b;

    return-object v0
.end method
