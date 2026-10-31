.class public Ll/ᩳۨۖ;
.super Ll/۠֫ۘ;
.source "X9J0"


# direct methods
.method public constructor <init>(Ll/֡֫ۘ;)V
    .locals 1

    .line 39
    new-instance v0, Ll/᩻ۨۖ;

    invoke-direct {v0}, Ll/᩻ۨۖ;-><init>()V

    invoke-direct {p0, v0, p1}, Ll/۠֫ۘ;-><init>(Ll/ۚ֫ۘ;Ll/֡֫ۘ;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 35
    new-instance v0, Ll/᩻ۨۖ;

    invoke-direct {v0}, Ll/᩻ۨۖ;-><init>()V

    invoke-direct {p0, v0, p1}, Ll/۠֫ۘ;-><init>(Ll/ۚ֫ۘ;[B)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    invoke-virtual {v1}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " with message id << "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    invoke-virtual {v1}, Ll/᩻ۨۖ;->ۜ()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " >>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Z
    .locals 5

    .line 60
    invoke-virtual {p0}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ܳ()J

    move-result-wide v0

    sget-object v2, Ll/֫ۨۖ;->᩶:Ll/֫ۨۖ;

    invoke-static {v0, v1, v2}, Ll/ܶܰۖ;->֫(JLl/᩸ܰۖ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v0

    sget-object v2, Ll/۟۫ۖ;->ۘۧ:Ll/۟۫ۖ;

    invoke-virtual {v2}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ܿ()Ll/ᩳۨۖ;
    .locals 2

    .line 77
    invoke-virtual {p0}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->᩷()I

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    new-instance v0, Ll/ᩳۨۖ;

    iget-object v1, p0, Ll/۠֫ۘ;->֫:Ll/֡֫ۘ;

    invoke-direct {v0, v1}, Ll/ᩳۨۖ;-><init>(Ll/֡֫ۘ;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 5

    .line 67
    invoke-virtual {p0}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۜ()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p0}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object v0

    sget-object v1, Ll/᩺ۛۖ;->۟:Ll/᩺ۛۖ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
