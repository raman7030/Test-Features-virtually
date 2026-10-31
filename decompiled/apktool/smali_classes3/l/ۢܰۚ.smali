.class public final synthetic Ll/ۢܰۚ;
.super Ljava/lang/Object;
.source "64JA"

# interfaces
.implements Ll/ۛܰۚ;


# instance fields
.field public final synthetic ֫:Ll/ۨܰۚ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨܰۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܰۚ;->֫:Ll/ۨܰۚ;

    return-void
.end method


# virtual methods
.method public final get()Ll/֨᩺ۚ;
    .locals 8

    .line 2026
    iget-object v0, p0, Ll/ۢܰۚ;->֫:Ll/ۨܰۚ;

    iget-object v1, v0, Ll/֫ܰۚ;->ܽ:Ll/ۜ۟ۚ;

    iget-object v2, v1, Ll/ۜ۟ۚ;->۠:Ll/ܶۨۚ;

    sget-object v3, Ll/ܶۨۚ;->᩵ܽ:Ll/ܶۨۚ;

    const-string v4, ""

    const/4 v5, 0x0

    if-ne v2, v3, :cond_1

    move-object v1, v4

    .line 2028
    :goto_0
    iget-object v2, v0, Ll/֫ܰۚ;->ܽ:Ll/ۜ۟ۚ;

    iget-object v2, v2, Ll/ۜ۟ۚ;->۠:Ll/ܶۨۚ;

    invoke-virtual {v2}, Ll/ܶۨۚ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 0
    invoke-static {v4, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 2029
    iget-object v2, v0, Ll/֫ܰۚ;->ܽ:Ll/ۜ۟ۚ;

    iget-object v2, v2, Ll/ۜ۟ۚ;->ۢ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 2030
    iget-object v1, v0, Ll/֫ܰۚ;->ܽ:Ll/ۜ۟ۚ;

    invoke-virtual {v1}, Ll/ۜ۟ۚ;->֫()V

    .line 2035
    iget-object v1, v0, Ll/֫ܰۚ;->ܽ:Ll/ۜ۟ۚ;

    iget-object v2, v1, Ll/ۜ۟ۚ;->۠:Ll/ܶۨۚ;

    sget-object v3, Ll/ܶۨۚ;->ᩳܽ:Ll/ܶۨۚ;

    if-ne v2, v3, :cond_2

    .line 2036
    iget-object v2, v0, Ll/֫ܰۚ;->֫:Ll/ۘۨۚ;

    iget-wide v6, v1, Ll/ۜ۟ۚ;->ᩴ:J

    const-string v1, "Forward slash \"/\" expected instead of dot \".\". The dot is replaced by \"/\""

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v2, v6, v7, v1, v3}, Ll/ۘۨۚ;->ۧ(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 2038
    iget-object v1, v0, Ll/֫ܰۚ;->ܽ:Ll/ۜ۟ۚ;

    invoke-virtual {v1}, Ll/ۜ۟ۚ;->֫()V

    const-string v1, "/"

    goto :goto_0

    .line 2032
    :cond_0
    iget-object v1, v0, Ll/֫ܰۚ;->֫:Ll/ۘۨۚ;

    iget-object v2, v0, Ll/֫ܰۚ;->ܽ:Ll/ۜ۟ۚ;

    iget-wide v2, v2, Ll/ۜ۟ۚ;->ᩴ:J

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "\""

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ll/֫ܰۚ;->ܽ:Ll/ۜ۟ۚ;

    iget-object v0, v0, Ll/ۜ۟ۚ;->۠:Ll/ܶۨۚ;

    .line 0
    invoke-static {v0, v4, v6}, Ll/᩸ܳۡ;->֫(Ll/ܶۨۚ;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v5

    const-string v0, "Either name or Constant Pool index expected, got {0}"

    invoke-static {v1, v2, v3, v0, v4}, Ll/᩵۫ۡ;->֫(Ll/ۘۨۚ;JLjava/lang/String;[Ljava/lang/Object;)Ll/۫ۗۚ;

    move-result-object v0

    .line 2033
    throw v0

    .line 2043
    :cond_1
    sget-object v0, Ll/ܶۨۚ;->ܺۧ:Ll/ܶۨۚ;

    if-ne v2, v0, :cond_2

    .line 2044
    iget v5, v1, Ll/ۜ۟ۚ;->ܺ:I

    .line 2045
    invoke-virtual {v1}, Ll/ۜ۟ۚ;->֫()V

    .line 2047
    :cond_2
    new-instance v0, Ll/֨᩺ۚ;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 35
    invoke-direct {v0, v1, v4}, Ll/ۜۗۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
