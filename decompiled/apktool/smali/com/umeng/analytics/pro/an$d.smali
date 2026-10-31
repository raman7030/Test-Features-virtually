.class public Lcom/umeng/analytics/pro/an$d;
.super Ljava/lang/Object;
.source "O5QW"

# interfaces
.implements Lcom/umeng/analytics/pro/cd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/analytics/pro/an$1;)V
    .locals 0

    .line 903
    invoke-direct {p0}, Lcom/umeng/analytics/pro/an$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/umeng/analytics/pro/an$c;
    .locals 2

    .line 906
    new-instance v0, Lcom/umeng/analytics/pro/an$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/an$c;-><init>(Lcom/umeng/analytics/pro/an$1;)V

    return-object v0
.end method

.method public synthetic b()Lcom/umeng/analytics/pro/cc;
    .locals 1

    .line 903
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/an$d;->a()Lcom/umeng/analytics/pro/an$c;

    move-result-object v0

    return-object v0
.end method
