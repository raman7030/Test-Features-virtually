.class public final Ll/᩶ۚ᩻;
.super Ljava/lang/Object;
.source "C9QS"

# interfaces
.implements Ll/ۡ֨᩻;


# instance fields
.field public ֫:J

.field public final synthetic ۧ:Ll/ۙۚ᩻;

.field public ܽ:J

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ۙۚ᩻;Ll/ܰۚ᩻;)V
    .locals 0

    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۚ᩻;->ۧ:Ll/ۙۚ᩻;

    .line 303
    invoke-virtual {p2}, Ll/ܰۚ᩻;->ܽ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩶ۚ᩻;->ܽ:J

    const-wide/16 p1, 0x0

    .line 304
    iput-wide p1, p0, Ll/᩶ۚ᩻;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 5

    .line 309
    iget-wide v0, p0, Ll/᩶ۚ᩻;->֫:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩶ۚ᩻;->֫:J

    .line 310
    iget-object p1, p0, Ll/᩶ۚ᩻;->ۧ:Ll/ۙۚ᩻;

    invoke-static {p1}, Ll/ۙۚ᩻;->ۧ(Ll/ۙۚ᩻;)Z

    move-result v0

    iget-wide v1, p0, Ll/᩶ۚ᩻;->ܽ:J

    if-eqz v0, :cond_0

    .line 311
    iget-wide v3, p0, Ll/᩶ۚ᩻;->֫:J

    invoke-virtual {p1, v3, v4, v1, v2}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    return-void

    .line 313
    :cond_0
    iget-wide v3, p0, Ll/᩶ۚ᩻;->֫:J

    invoke-virtual {p1, v3, v4, v1, v2}, Ll/᩹ܶۢ;->ܽ(JJ)V

    .line 314
    invoke-static {p1}, Ll/ۙۚ᩻;->֫(Ll/ۙۚ᩻;)Ll/ܶ۬ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷۫ܳ;->ܿ()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩶ۚ᩻;->֫:J

    add-long/2addr v0, v2

    invoke-static {p1}, Ll/ۙۚ᩻;->֫(Ll/ۙۚ᩻;)Ll/ܶ۬ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷۫ܳ;->ۜ()J

    move-result-wide v2

    invoke-virtual {p1, v0, v1, v2, v3}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 4

    .line 320
    iget-boolean v0, p0, Ll/᩶ۚ᩻;->ᩳ:Z

    iget-object v1, p0, Ll/᩶ۚ᩻;->ۧ:Ll/ۙۚ᩻;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 321
    iput-boolean v0, p0, Ll/᩶ۚ᩻;->ᩳ:Z

    .line 322
    invoke-static {v1}, Ll/ۙۚ᩻;->֫(Ll/ۙۚ᩻;)Ll/ܶ۬ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷۫ܳ;->᩻()I

    move-result v2

    const v3, 0x7f120b49

    if-le v2, v0, :cond_0

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 651
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    .line 323
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/ۙۚ᩻;->֫(Ll/ۙۚ᩻;)Ll/ܶ۬ܳ;

    move-result-object v2

    .line 324
    invoke-virtual {v2}, Ll/᩷۫ܳ;->ᩳ()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/ۙۚ᩻;->֫(Ll/ۙۚ᩻;)Ll/ܶ۬ܳ;

    move-result-object v2

    .line 325
    invoke-virtual {v2}, Ll/᩷۫ܳ;->᩻()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 323
    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    goto :goto_0

    .line 327
    :cond_0
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 330
    :cond_1
    :goto_0
    invoke-static {v1}, Ll/ۙۚ᩻;->ۧ(Ll/ۙۚ᩻;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 331
    invoke-virtual {v1, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void

    .line 333
    :cond_2
    invoke-virtual {v1, p1}, Ll/᩹ܶۢ;->ܺ(I)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 339
    iget-object v0, p0, Ll/᩶ۚ᩻;->ۧ:Ll/ۙۚ᩻;

    .line 301
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    return v0
.end method
