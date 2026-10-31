.class public final Ll/᩻ۧ֡;
.super Ll/ܶ۟᩵;
.source "I4F9"


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:Ll/ܰ֫֡;

.field public final synthetic ᩹:Ll/᩹ۧ֡;


# direct methods
.method public varargs constructor <init>(Ll/᩹ۧ֡;[Ljava/lang/Object;ILl/ܰ֫֡;)V
    .locals 0

    .line 339
    iput-object p1, p0, Ll/᩻ۧ֡;->᩹:Ll/᩹ۧ֡;

    iput p3, p0, Ll/᩻ۧ֡;->ۙ:I

    iput-object p4, p0, Ll/᩻ۧ֡;->᩶:Ll/ܰ֫֡;

    const-string p1, "OkHttp %s stream %d"

    invoke-direct {p0, p1, p2}, Ll/ܶ۟᩵;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 342
    iget-object v0, p0, Ll/᩻ۧ֡;->᩹:Ll/᩹ۧ֡;

    :try_start_0
    iget v1, p0, Ll/᩻ۧ֡;->ۙ:I

    iget-object v2, p0, Ll/᩻ۧ֡;->᩶:Ll/ܰ֫֡;

    .line 354
    iget-object v3, v0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    invoke-virtual {v3, v1, v2}, Ll/ۛۧ֡;->֫(ILl/ܰ֫֡;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 526
    :catch_0
    :try_start_1
    sget-object v1, Ll/ܰ֫֡;->ܰ:Ll/ܰ֫֡;

    invoke-virtual {v0, v1, v1}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;Ll/ܰ֫֡;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
