.class public final Ll/ܶ֫֡;
.super Ll/֡۟᩵;
.source "C4FW"


# instance fields
.field public final ᩶:Ll/ۛܽ֡;

.field public final ᩸:J

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLl/ۛܽ֡;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ll/֡۟᩵;-><init>()V

    .line 34
    iput-object p1, p0, Ll/ܶ֫֡;->᩹:Ljava/lang/String;

    .line 35
    iput-wide p2, p0, Ll/ܶ֫֡;->᩸:J

    .line 36
    iput-object p4, p0, Ll/ܶ֫֡;->᩶:Ll/ۛܽ֡;

    return-void
.end method


# virtual methods
.method public final ܳ()Ll/ܰܰ᩵;
    .locals 2

    const/4 v0, 0x0

    .line 40
    iget-object v1, p0, Ll/ܶ֫֡;->᩹:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 106
    :try_start_0
    invoke-static {v1}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 44
    iget-wide v0, p0, Ll/ܶ֫֡;->᩸:J

    return-wide v0
.end method

.method public final ᩻()Ll/ۛܽ֡;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ܶ֫֡;->᩶:Ll/ۛܽ֡;

    return-object v0
.end method
