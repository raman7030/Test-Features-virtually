.class public final Ll/᩺ۤ֨;
.super Ll/᩷֨֨;
.source "M43N"


# instance fields
.field public final synthetic ᩸:Ll/ۜۨ֨;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 616
    iput-object p1, p0, Ll/᩺ۤ֨;->᩸:Ll/ۜۨ֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 616
    check-cast p2, Ljava/lang/Void;

    .line 619
    new-instance p2, Ll/֨֨֨;

    .line 1084
    iget-object v0, p0, Ll/᩺ۤ֨;->᩸:Ll/ۜۨ֨;

    iget-boolean v1, v0, Ll/ۜۨ֨;->֫:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/ۜۨ֨;->᩻:Ll/۟ۤ֨;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Ll/ۜۨ֨;->᩷:Ll/ܰۤ֨;

    .line 619
    :goto_0
    iget-object v0, v0, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    invoke-direct {p2, p1, v1, v0}, Ll/֨֨֨;-><init>(Ll/ۡ֨֨;Ll/ۚ֨֨;Ll/ۛ᩸֨;)V

    .line 620
    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide v2, 0x800000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    .line 621
    invoke-virtual {p2}, Ll/֨֨֨;->ۨ֫()V

    :cond_1
    return-object p2
.end method
