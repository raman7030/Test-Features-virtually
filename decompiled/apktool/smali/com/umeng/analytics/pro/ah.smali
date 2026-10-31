.class public Lcom/umeng/analytics/pro/ah;
.super Ljava/lang/Object;
.source "PBLB"

# interfaces
.implements Lcom/umeng/analytics/pro/z;


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/ah;->a:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 25
    :try_start_0
    iget-boolean v2, p0, Lcom/umeng/analytics/pro/ah;->a:Z

    if-nez v2, :cond_0

    .line 1
    sget-object v2, Ll/᩵ܳ֨;->֫:Ll/֡ܳ֨;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Ll/֡ܳ֨;->ۧ(Landroid/content/Context;)Z

    move-result v2

    sput-boolean v2, Ll/ۘܳ֨;->ۧ:Z

    const/4 v2, 0x1

    .line 3
    sput-boolean v2, Ll/ۘܳ֨;->֫:Z

    .line 27
    iput-boolean v2, p0, Lcom/umeng/analytics/pro/ah;->a:Z

    .line 1
    :cond_0
    sget-boolean v2, Ll/ۘܳ֨;->֫:Z

    if-eqz v2, :cond_2

    .line 2
    sget-boolean v2, Ll/ۘܳ֨;->ۧ:Z

    if-nez v2, :cond_1

    const-string p1, "\u5f53\u524d\u8bbe\u5907\u4e0d\u652f\u6301\u83b7\u53d6OAID"

    .line 30
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V

    return-object v0

    .line 35
    :cond_1
    invoke-static {p1}, Ll/֨ۙ᩵;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v2, "SDK Need Init First!"

    invoke-direct {p1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string p1, "\u672a\u68c0\u6d4b\u5230\u60a8\u96c6\u6210OAID SDK\u5305"

    .line 40
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V

    return-object v0
.end method
