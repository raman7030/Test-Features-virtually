.class public final Ll/᩺᩺᩵;
.super Ll/֡۟᩵;
.source "V4E2"


# instance fields
.field public final ۙ:Ll/֫֫֡;

.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ll/ۛܽ֡;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֫֫֡;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 744
    invoke-direct {p0}, Ll/֡۟᩵;-><init>()V

    .line 745
    iput-object p1, p0, Ll/᩺᩺᩵;->ۙ:Ll/֫֫֡;

    .line 746
    iput-object p2, p0, Ll/᩺᩺᩵;->᩶:Ljava/lang/String;

    .line 747
    iput-object p3, p0, Ll/᩺᩺᩵;->᩹:Ljava/lang/String;

    const/4 p2, 0x1

    .line 749
    invoke-virtual {p1, p2}, Ll/֫֫֡;->֫(I)Ll/֨ᩳ֡;

    move-result-object p2

    .line 750
    new-instance p3, Ll/ۨ᩺᩵;

    invoke-direct {p3, p2, p1}, Ll/ۨ᩺᩵;-><init>(Ll/֨ᩳ֡;Ll/֫֫֡;)V

    invoke-static {p3}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object p1

    iput-object p1, p0, Ll/᩺᩺᩵;->᩸:Ll/ۛܽ֡;

    return-void
.end method


# virtual methods
.method public final ܳ()Ll/ܰܰ᩵;
    .locals 2

    const/4 v0, 0x0

    .line 759
    iget-object v1, p0, Ll/᩺᩺᩵;->᩶:Ljava/lang/String;

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
    .locals 3

    const-wide/16 v0, -0x1

    .line 764
    :try_start_0
    iget-object v2, p0, Ll/᩺᩺᩵;->᩹:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-wide v0
.end method

.method public final ᩻()Ll/ۛܽ֡;
    .locals 1

    .line 771
    iget-object v0, p0, Ll/᩺᩺᩵;->᩸:Ll/ۛܽ֡;

    return-object v0
.end method
