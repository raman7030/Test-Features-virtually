.class public final Ll/ۘۨۚ;
.super Ll/᩶ۗۚ;
.source "H7CX"


# instance fields
.field public ۜ:Ll/ܺۨۚ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/᩹ۗۚ;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Ll/᩶ۗۚ;-><init>(Ll/᩹ۗۚ;)V

    return-void
.end method


# virtual methods
.method public final ֫(J)J
    .locals 1

    .line 96
    invoke-virtual {p0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    check-cast v0, Ll/ۚۗۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    return-wide p1
.end method

.method public final varargs ֫(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 71
    invoke-virtual {p0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    check-cast v0, Ll/ۚۗۚ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۚۗۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 81
    invoke-virtual {p0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    check-cast v0, Ll/ۚۗۚ;

    const-wide/32 v1, 0x7fffffff

    invoke-virtual {v0, v1, v2, p1, p2}, Ll/ۚۗۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/᩻۬ۚ;)V
    .locals 3

    .line 55
    :try_start_0
    invoke-super {p0, p1}, Ll/᩶ۗۚ;->֫(Ll/᩻۬ۚ;)V

    .line 56
    new-instance v0, Ll/ܺۨۚ;

    invoke-virtual {p0}, Ll/᩶ۗۚ;->֫()Ljava/io/DataInputStream;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ܺۨۚ;-><init>(Ll/ۘۨۚ;Ljava/io/DataInputStream;)V

    iput-object v0, p0, Ll/ۘۨۚ;->ۜ:Ll/ܺۨۚ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Cannot read {0}"

    .line 58
    invoke-virtual {p0, p1, v1}, Ll/ۘۨۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    throw v0
.end method

.method public final ۘ()J
    .locals 2

    .line 139
    iget-object v0, p0, Ll/ۘۨۚ;->ۜ:Ll/ܺۨۚ;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-wide v0, v0, Ll/ܳ۬ۚ;->ܽ:J

    return-wide v0
.end method

.method public final varargs ۧ(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 66
    invoke-virtual {p0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    check-cast v0, Ll/ۚۗۚ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۚۗۚ;->ۧ(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs ܳ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 112
    invoke-virtual {p0, p1, p2}, Ll/ۘۨۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    new-instance p1, Ljava/lang/Error;

    invoke-direct {p1}, Ljava/lang/Error;-><init>()V

    throw p1
.end method

.method public final varargs ܽ(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 125
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 126
    new-instance p1, Ljava/lang/Error;

    invoke-direct {p1}, Ljava/lang/Error;-><init>()V

    throw p1
.end method

.method public final varargs ܿ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 76
    invoke-virtual {p0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    check-cast v0, Ll/ۚۗۚ;

    const-wide/32 v1, 0x7fffffff

    invoke-virtual {v0, v1, v2, p1, p2}, Ll/ۚۗۚ;->ۧ(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
