.class public Lcom/umeng/analytics/pro/bp;
.super Ljava/lang/Object;
.source "A5J0"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:B

.field public final c:S


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, ""

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0, v0, v1, v1}, Lcom/umeng/analytics/pro/bp;-><init>(Ljava/lang/String;BS)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;BS)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/umeng/analytics/pro/bp;->a:Ljava/lang/String;

    .line 33
    iput-byte p2, p0, Lcom/umeng/analytics/pro/bp;->b:B

    .line 34
    iput-short p3, p0, Lcom/umeng/analytics/pro/bp;->c:S

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/bp;)Z
    .locals 2

    .line 46
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bp;->b:B

    iget-byte v1, p1, Lcom/umeng/analytics/pro/bp;->b:B

    if-ne v0, v1, :cond_0

    iget-short v0, p0, Lcom/umeng/analytics/pro/bp;->c:S

    iget-short p1, p1, Lcom/umeng/analytics/pro/bp;->c:S

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<TField name:\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/umeng/analytics/pro/bp;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/umeng/analytics/pro/bp;->b:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " field-id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/umeng/analytics/pro/bp;->c:S

    const-string v2, ">"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
