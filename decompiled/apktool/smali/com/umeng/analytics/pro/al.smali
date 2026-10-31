.class public Lcom/umeng/analytics/pro/al;
.super Ljava/lang/Object;
.source "A4OF"


# static fields
.field public static final a:Ljava/lang/String; = "OpenId"

.field public static b:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    if-nez p0, :cond_0

    move-object p0, v0

    :cond_0
    if-nez p1, :cond_1

    move-object p1, v0

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const-string p0, "%s:%s"

    .line 64
    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 15
    sget-boolean v0, Lcom/umeng/analytics/pro/al;->b:Z

    if-eqz v0, :cond_0

    .line 16
    invoke-static {p0, p1}, Lcom/umeng/analytics/pro/al;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static a(Z)V
    .locals 0

    .line 11
    sput-boolean p0, Lcom/umeng/analytics/pro/al;->b:Z

    return-void
.end method

.method public static varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 21
    sget-boolean v0, Lcom/umeng/analytics/pro/al;->b:Z

    if-eqz v0, :cond_0

    .line 22
    invoke-static {p0, p1}, Lcom/umeng/analytics/pro/al;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static varargs c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 28
    sget-boolean v0, Lcom/umeng/analytics/pro/al;->b:Z

    if-eqz v0, :cond_0

    .line 29
    invoke-static {p0, p1}, Lcom/umeng/analytics/pro/al;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static varargs d(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 34
    sget-boolean v0, Lcom/umeng/analytics/pro/al;->b:Z

    if-eqz v0, :cond_0

    .line 35
    invoke-static {p0, p1}, Lcom/umeng/analytics/pro/al;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static varargs e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const-string p0, ""

    return-object p0

    .line 44
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-nez p0, :cond_1

    const-string p0, "-"

    .line 45
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_4

    .line 47
    array-length p0, p1

    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 49
    array-length v3, p1

    if-ge v2, v3, :cond_3

    .line 50
    aget-object v3, p1, v1

    aget-object v4, p1, v2

    invoke-static {v3, v4}, Lcom/umeng/analytics/pro/al;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, p0, -0x1

    if-ge v2, v3, :cond_2

    const-string v2, ","

    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 56
    :cond_3
    array-length p0, p1

    add-int/lit8 p0, p0, -0x1

    if-ne v1, p0, :cond_4

    .line 57
    aget-object p0, p1, v1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
