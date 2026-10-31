.class public final Ll/᩹۬ܳ;
.super Ljava/lang/Object;
.source "87AH"


# static fields
.field public static final ܽ:Ll/᩹۬ܳ;


# instance fields
.field public final ֫:J

.field public final ۧ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 12
    new-instance v0, Ll/᩹۬ܳ;

    const-wide/16 v1, -0x1

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Ll/᩹۬ܳ;-><init>(JJ)V

    sput-object v0, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 3

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const-wide/16 p1, -0x1

    .line 18
    :cond_0
    iput-wide p1, p0, Ll/᩹۬ܳ;->֫:J

    cmp-long p1, p3, v0

    if-gtz p1, :cond_1

    move-wide p3, v0

    .line 19
    :cond_1
    iput-wide p3, p0, Ll/᩹۬ܳ;->ۧ:J

    return-void
.end method

.method public static ֫(JJ)Ll/᩹۬ܳ;
    .locals 1

    .line 26
    new-instance v0, Ll/᩹۬ܳ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/᩹۬ܳ;-><init>(JJ)V

    .line 27
    invoke-virtual {v0}, Ll/᩹۬ܳ;->ܽ()Z

    move-result p0

    if-eqz p0, :cond_0

    return-object v0

    :cond_0
    sget-object p0, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Ll/᩹۬ܳ;
    .locals 4

    if-nez p0, :cond_0

    .line 46
    sget-object p0, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    .line 51
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 52
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    :catch_0
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    const-wide/16 v2, 0x0

    .line 62
    :goto_0
    invoke-static {v0, v1, v2, v3}, Ll/᩹۬ܳ;->֫(JJ)Ll/᩹۬ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩳۜܳ;)Ll/᩹۬ܳ;
    .locals 4

    if-nez p0, :cond_0

    .line 35
    sget-object p0, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    return-object p0

    .line 37
    :cond_0
    invoke-interface {p0}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, -0x1

    .line 38
    :goto_0
    invoke-interface {p0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll/᩹۬ܳ;->֫(JJ)Ll/᩹۬ܳ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 69
    iget-wide v0, p0, Ll/᩹۬ܳ;->֫:J

    return-wide v0
.end method

.method public final ۧ()J
    .locals 2

    .line 76
    iget-wide v0, p0, Ll/᩹۬ܳ;->ۧ:J

    return-wide v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 97
    invoke-virtual {p0}, Ll/᩹۬ܳ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/᩹۬ܳ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ()Z
    .locals 5

    .line 90
    iget-wide v0, p0, Ll/᩹۬ܳ;->ۧ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 5

    .line 83
    iget-wide v0, p0, Ll/᩹۬ܳ;->֫:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
