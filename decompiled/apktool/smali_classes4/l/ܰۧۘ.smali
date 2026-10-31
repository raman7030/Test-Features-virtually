.class public final Ll/ܰۧۘ;
.super Ll/᩺ۧۘ;
.source "Z9CP"


# static fields
.field public static final ᩳ:Ll/֫᩻֨;


# instance fields
.field public final ۧ:Ll/ۢۧۘ;

.field public final ܽ:Ll/۟ۛۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 48
    const-class v0, Ll/ܰۧۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܰۧۘ;->ᩳ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/۟ۛۖ;Ll/ۢۧۘ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ܰۧۘ;->ܽ:Ll/۟ۛۖ;

    .line 54
    iput-object p2, p0, Ll/ܰۧۘ;->ۧ:Ll/ۢۧۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳۨۖ;)V
    .locals 6

    .line 59
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۜ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Ll/ܰۧۘ;->ۧ:Ll/ۢۧۘ;

    invoke-virtual {v1, v0}, Ll/ۢۧۘ;->֫(Ljava/lang/Long;)Ll/ᩴۧۘ;

    move-result-object v0

    .line 63
    :try_start_0
    iget-object v2, p0, Ll/ܰۧۘ;->ܽ:Ll/۟ۛۖ;

    invoke-virtual {v0}, Ll/ᩴۧۘ;->ᩳ()Ll/֨֫ۘ;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p1}, Ll/۟ۛۖ;->֫(Ll/֨֫ۘ;Ll/ᩳۨۖ;)Ll/ܽۨۖ;

    move-result-object p1
    :try_end_0
    .catch Ll/۬ܰۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۜ()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۢۧۘ;->ۧ(Ljava/lang/Long;)Ll/ᩴۧۘ;

    move-result-object v0

    .line 72
    invoke-virtual {p1}, Ll/ܽۨۖ;->᩻()Z

    move-result v1

    .line 73
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v2

    check-cast v2, Ll/᩻ۨۖ;

    invoke-virtual {v2}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object v2

    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v3

    check-cast v3, Ll/᩻ۨۖ;

    invoke-virtual {v3}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v3

    .line 86
    sget-object v5, Ll/᩺ۛۖ;->ܽ֫:Ll/᩺ۛۖ;

    if-ne v2, v5, :cond_0

    .line 87
    sget-object v1, Ll/۟۫ۖ;->᩹ۧ:Ll/۟۫ۖ;

    invoke-virtual {v1}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v1

    cmp-long v5, v3, v1

    if-eqz v5, :cond_1

    sget-object v1, Ll/۟۫ۖ;->ܿ֫:Ll/۟۫ۖ;

    .line 88
    invoke-virtual {v1}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v1

    cmp-long v5, v3, v1

    if-nez v5, :cond_2

    goto :goto_0

    .line 90
    :cond_0
    sget-object v5, Ll/᩺ۛۖ;->ۜ֫:Ll/᩺ۛۖ;

    if-ne v2, v5, :cond_3

    .line 91
    sget-object v1, Ll/۟۫ۖ;->᩹ۧ:Ll/۟۫ۖ;

    invoke-virtual {v1}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v1

    cmp-long v5, v3, v1

    if-nez v5, :cond_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 74
    instance-of v1, p1, Ll/ᩴ᩺ۖ;

    .line 78
    :cond_4
    invoke-virtual {v0}, Ll/ᩴۧۘ;->ܿ()Ll/ܿ۟ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܿ۟ۖ;->֫(Ll/ܽۨۖ;)V

    return-void

    :catch_0
    move-exception v0

    .line 65
    sget-object v1, Ll/ܰۧۘ;->ᩳ:Ll/֫᩻֨;

    const-string v2, "Failed to deserialize SMB2 Packet Data of {}"

    invoke-interface {v1, p1, v2}, Ll/֫᩻֨;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    new-instance p1, Ll/ۖ۟ۖ;

    const-string v1, "Unable to deserialize SMB2 Packet Data."

    .line 43
    invoke-direct {p1, v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    throw p1
.end method
