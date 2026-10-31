.class public final Ll/ۜۧ֡;
.super Ll/ܶ۟᩵;
.source "I4F9"


# instance fields
.field public final synthetic ۙ:J

.field public final synthetic ᩶:I

.field public final synthetic ᩹:Ll/᩹ۧ֡;


# direct methods
.method public varargs constructor <init>(Ll/᩹ۧ֡;[Ljava/lang/Object;IJ)V
    .locals 0

    .line 360
    iput-object p1, p0, Ll/ۜۧ֡;->᩹:Ll/᩹ۧ֡;

    iput p3, p0, Ll/ۜۧ֡;->᩶:I

    iput-wide p4, p0, Ll/ۜۧ֡;->ۙ:J

    const-string p1, "OkHttp Window Update %s stream %d"

    invoke-direct {p0, p1, p2}, Ll/ܶ۟᩵;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 363
    iget-object v0, p0, Ll/ۜۧ֡;->᩹:Ll/᩹ۧ֡;

    :try_start_0
    iget-object v1, v0, Ll/᩹ۧ֡;->ۢ֫:Ll/ۛۧ֡;

    iget v2, p0, Ll/ۜۧ֡;->᩶:I

    iget-wide v3, p0, Ll/ۜۧ֡;->ۙ:J

    invoke-virtual {v1, v2, v3, v4}, Ll/ۛۧ֡;->֫(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 365
    :catch_0
    invoke-static {v0}, Ll/᩹ۧ֡;->֫(Ll/᩹ۧ֡;)V

    return-void
.end method
