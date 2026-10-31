.class public final Ll/֨ۧ֡;
.super Ll/ܶ۟᩵;
.source "I4F9"


# instance fields
.field public final synthetic ᩶:Ll/ۤۧ֡;

.field public final synthetic ᩹:Ll/᩸ۧ֡;


# direct methods
.method public varargs constructor <init>(Ll/᩸ۧ֡;[Ljava/lang/Object;Ll/ۤۧ֡;)V
    .locals 0

    .line 739
    iput-object p1, p0, Ll/֨ۧ֡;->᩹:Ll/᩸ۧ֡;

    iput-object p3, p0, Ll/֨ۧ֡;->᩶:Ll/ۤۧ֡;

    const-string p1, "OkHttp %s stream %d"

    invoke-direct {p0, p1, p2}, Ll/ܶ۟᩵;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 742
    iget-object v0, p0, Ll/֨ۧ֡;->᩶:Ll/ۤۧ֡;

    iget-object v1, p0, Ll/֨ۧ֡;->᩹:Ll/᩸ۧ֡;

    iget-object v1, v1, Ll/᩸ۧ֡;->᩶:Ll/᩹ۧ֡;

    :try_start_0
    iget-object v2, v1, Ll/᩹ۧ֡;->ܰ:Ll/֡ۧ֡;

    invoke-virtual {v2, v0}, Ll/֡ۧ֡;->֫(Ll/ۤۧ֡;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    .line 744
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Http2Connection.Listener failure for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x4

    invoke-virtual {v3, v4, v1, v2}, Ll/ᩴܽ֡;->֫(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 746
    :try_start_1
    sget-object v1, Ll/ܰ֫֡;->ܰ:Ll/ܰ֫֡;

    invoke-virtual {v0, v1}, Ll/ۤۧ֡;->֫(Ll/ܰ֫֡;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
