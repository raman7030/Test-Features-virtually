.class public Lcom/umeng/analytics/pro/au;
.super Lcom/umeng/analytics/pro/bb;
.source "746V"


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:I = 0x4

.field public static final f:I = 0x5

.field public static final g:I = 0x6

.field public static final h:I = 0x7

.field public static final j:Lcom/umeng/analytics/pro/bz;

.field public static final k:Lcom/umeng/analytics/pro/bp;

.field public static final l:Lcom/umeng/analytics/pro/bp;

.field public static final m:J = 0x1L


# instance fields
.field public i:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 34
    new-instance v0, Lcom/umeng/analytics/pro/bz;

    const-string v1, "TApplicationException"

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/bz;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/umeng/analytics/pro/au;->j:Lcom/umeng/analytics/pro/bz;

    .line 35
    new-instance v0, Lcom/umeng/analytics/pro/bp;

    const/16 v1, 0xb

    const/4 v2, 0x1

    const-string v3, "message"

    invoke-direct {v0, v3, v1, v2}, Lcom/umeng/analytics/pro/bp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/au;->k:Lcom/umeng/analytics/pro/bp;

    .line 36
    new-instance v0, Lcom/umeng/analytics/pro/bp;

    const/16 v1, 0x8

    const/4 v2, 0x2

    const-string v3, "type"

    invoke-direct {v0, v3, v1, v2}, Lcom/umeng/analytics/pro/bp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/au;->l:Lcom/umeng/analytics/pro/bp;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Lcom/umeng/analytics/pro/bb;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput v0, p0, Lcom/umeng/analytics/pro/au;->i:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/umeng/analytics/pro/bb;-><init>()V

    .line 57
    iput p1, p0, Lcom/umeng/analytics/pro/au;->i:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 61
    invoke-direct {p0, p2}, Lcom/umeng/analytics/pro/bb;-><init>(Ljava/lang/String;)V

    .line 62
    iput p1, p0, Lcom/umeng/analytics/pro/au;->i:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/bb;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 49
    iput p1, p0, Lcom/umeng/analytics/pro/au;->i:I

    return-void
.end method

.method public static a(Lcom/umeng/analytics/pro/bu;)Lcom/umeng/analytics/pro/au;
    .locals 5

    .line 75
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bu;->j()Lcom/umeng/analytics/pro/bz;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 81
    :goto_0
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bu;->l()Lcom/umeng/analytics/pro/bp;

    move-result-object v2

    .line 82
    iget-byte v3, v2, Lcom/umeng/analytics/pro/bp;->b:B

    if-nez v3, :cond_0

    .line 106
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bu;->k()V

    .line 108
    new-instance p0, Lcom/umeng/analytics/pro/au;

    invoke-direct {p0, v1, v0}, Lcom/umeng/analytics/pro/au;-><init>(ILjava/lang/String;)V

    return-object p0

    .line 85
    :cond_0
    iget-short v2, v2, Lcom/umeng/analytics/pro/bp;->c:S

    const/4 v4, 0x1

    if-eq v2, v4, :cond_3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    .line 101
    invoke-static {p0, v3}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    if-ne v3, v2, :cond_2

    .line 95
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bu;->w()I

    move-result v1

    goto :goto_1

    .line 97
    :cond_2
    invoke-static {p0, v3}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :cond_3
    const/16 v2, 0xb

    if-ne v3, v2, :cond_4

    .line 88
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bu;->z()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 90
    :cond_4
    invoke-static {p0, v3}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    .line 104
    :goto_1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bu;->m()V

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 70
    iget v0, p0, Lcom/umeng/analytics/pro/au;->i:I

    return v0
.end method

.method public b(Lcom/umeng/analytics/pro/bu;)V
    .locals 1

    .line 112
    sget-object v0, Lcom/umeng/analytics/pro/au;->j:Lcom/umeng/analytics/pro/bz;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bz;)V

    .line 113
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 114
    sget-object v0, Lcom/umeng/analytics/pro/au;->k:Lcom/umeng/analytics/pro/bp;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 115
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Ljava/lang/String;)V

    .line 116
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 118
    :cond_0
    sget-object v0, Lcom/umeng/analytics/pro/au;->l:Lcom/umeng/analytics/pro/bp;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 119
    iget v0, p0, Lcom/umeng/analytics/pro/au;->i:I

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(I)V

    .line 120
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 121
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->d()V

    .line 122
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->b()V

    return-void
.end method
