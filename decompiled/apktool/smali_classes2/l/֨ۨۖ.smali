.class public final Ll/֨ۨۖ;
.super Ll/ۧۧۘ;
.source "29JK"


# instance fields
.field public ᩶:J

.field public final ᩹:Ll/᩺ۛۖ;


# direct methods
.method public constructor <init>(JLl/᩺ۛۖ;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 42
    invoke-direct {p0, p4, p5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    iput-wide p1, p0, Ll/֨ۨۖ;->᩶:J

    .line 35
    iput-object p3, p0, Ll/֨ۨۖ;->᩹:Ll/᩺ۛۖ;

    return-void
.end method

.method public constructor <init>(Ll/᩻ۨۖ;Ljava/lang/String;)V
    .locals 2

    .line 38
    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/֨ۨۖ;->᩶:J

    .line 41
    invoke-virtual {p1}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۨۖ;->᩹:Ll/᩺ۛۖ;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 5

    .line 51
    iget-wide v0, p0, Ll/֨ۨۖ;->᩶:J

    invoke-static {v0, v1}, Ll/۟۫ۖ;->ᩳ(J)Ll/۟۫ۖ;

    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-super {p0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const-string v0, "%s (0x%08x): %s"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/᩺ۛۖ;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/֨ۨۖ;->᩹:Ll/᩺ۛۖ;

    return-object v0
.end method

.method public final ۧ()J
    .locals 2

    .line 55
    iget-wide v0, p0, Ll/֨ۨۖ;->᩶:J

    return-wide v0
.end method
