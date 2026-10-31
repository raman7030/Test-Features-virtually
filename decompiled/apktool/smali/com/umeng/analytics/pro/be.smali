.class public Lcom/umeng/analytics/pro/be;
.super Ljava/lang/Object;
.source "G4R6"


# instance fields
.field public final a:Ljava/io/ByteArrayOutputStream;

.field public final b:Lcom/umeng/analytics/pro/cg;

.field public c:Lcom/umeng/analytics/pro/bu;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 57
    new-instance v0, Lcom/umeng/analytics/pro/bo$a;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bo$a;-><init>()V

    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/be;-><init>(Lcom/umeng/analytics/pro/bw;)V

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/bw;)V
    .locals 2

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/be;->a:Ljava/io/ByteArrayOutputStream;

    .line 46
    new-instance v1, Lcom/umeng/analytics/pro/cg;

    invoke-direct {v1, v0}, Lcom/umeng/analytics/pro/cg;-><init>(Ljava/io/OutputStream;)V

    iput-object v1, p0, Lcom/umeng/analytics/pro/be;->b:Lcom/umeng/analytics/pro/cg;

    .line 67
    invoke-interface {p1, v1}, Lcom/umeng/analytics/pro/bw;->a(Lcom/umeng/analytics/pro/ci;)Lcom/umeng/analytics/pro/bu;

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/analytics/pro/be;->c:Lcom/umeng/analytics/pro/bu;

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/av;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 96
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/be;->a(Lcom/umeng/analytics/pro/av;)[B

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 98
    :catch_0
    new-instance p1, Lcom/umeng/analytics/pro/bb;

    const-string v0, "JVM DOES NOT SUPPORT ENCODING: "

    .line 0
    invoke-static {v0, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 98
    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/bb;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/umeng/analytics/pro/av;)[B
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/umeng/analytics/pro/be;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 81
    iget-object v0, p0, Lcom/umeng/analytics/pro/be;->c:Lcom/umeng/analytics/pro/bu;

    invoke-interface {p1, v0}, Lcom/umeng/analytics/pro/av;->write(Lcom/umeng/analytics/pro/bu;)V

    .line 82
    iget-object p1, p0, Lcom/umeng/analytics/pro/be;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/umeng/analytics/pro/av;)Ljava/lang/String;
    .locals 1

    .line 111
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/be;->a(Lcom/umeng/analytics/pro/av;)[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    return-object v0
.end method
