.class public Lcom/umeng/analytics/pro/ae;
.super Ljava/lang/Object;
.source "TBKN"

# interfaces
.implements Lcom/umeng/analytics/pro/z;


# static fields
.field public static final a:I = 0x1


# instance fields
.field public b:Ll/ܰܳ֨;

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/ae;->c:Z

    .line 21
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/ae;->d:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    if-nez p1, :cond_0

    goto :goto_1

    .line 28
    :cond_0
    iget-boolean v0, p0, Lcom/umeng/analytics/pro/ae;->c:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    .line 29
    new-instance v0, Ll/ܰܳ֨;

    invoke-direct {v0}, Ll/ܰܳ֨;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/ae;->b:Ll/ܰܳ֨;

    .line 30
    invoke-virtual {v0, p1}, Ll/ܰܳ֨;->֫(Landroid/content/Context;)I

    move-result p1

    if-ne p1, v2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 31
    :goto_0
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/ae;->d:Z

    .line 32
    iput-boolean v2, p0, Lcom/umeng/analytics/pro/ae;->c:Z

    .line 35
    :cond_2
    iget-boolean p1, p0, Lcom/umeng/analytics/pro/ae;->d:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v3, "isSupported"

    aput-object v3, v0, v1

    aput-object p1, v0, v2

    const-string p1, "getOAID"

    invoke-static {p1, v0}, Lcom/umeng/analytics/pro/al;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    iget-boolean p1, p0, Lcom/umeng/analytics/pro/ae;->d:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/umeng/analytics/pro/ae;->b:Ll/ܰܳ֨;

    invoke-virtual {p1}, Ll/ܰܳ֨;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 37
    iget-object p1, p0, Lcom/umeng/analytics/pro/ae;->b:Ll/ܰܳ֨;

    invoke-virtual {p1}, Ll/ܰܳ֨;->֫()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method
