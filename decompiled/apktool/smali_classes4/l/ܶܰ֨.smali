.class public final Ll/ܶܰ֨;
.super Ljava/lang/Object;
.source "T7LF"

# interfaces
.implements Ll/ۜ֡֨;


# instance fields
.field public final synthetic ᩸:Ll/ۗܰ֨;

.field public final synthetic ᩹:Ll/֨᩵۠;


# direct methods
.method public constructor <init>(Ll/ۗܰ֨;Ll/֨᩵۠;)V
    .locals 0

    .line 727
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶܰ֨;->᩸:Ll/ۗܰ֨;

    iput-object p2, p0, Ll/ܶܰ֨;->᩹:Ll/֨᩵۠;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 750
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SourceCompleter: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܶܰ֨;->᩹:Ll/֨᩵۠;

    iget-object v1, v1, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    invoke-interface {v1}, Ll/۟᩹۠;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۛ֡֨;)V
    .locals 7

    .line 730
    check-cast p1, Ll/֡֡֨;

    .line 731
    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v2, 0x10000000

    or-long/2addr v0, v2

    iput-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    .line 732
    new-instance v0, Ll/᩶ܰ֨;

    iget-object v1, p0, Ll/ܶܰ֨;->᩸:Ll/ۗܰ֨;

    invoke-direct {v0, v1}, Ll/᩶ܰ֨;-><init>(Ll/ۗܰ֨;)V

    .line 733
    invoke-static {v1}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v2

    iget-object v3, p0, Ll/ܶܰ֨;->᩹:Ll/֨᩵۠;

    iget-object v4, v3, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    invoke-virtual {v2, v4}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    move-result-object v2

    .line 734
    invoke-virtual {v3}, Ll/֨᩵۠;->ܳ֫()Ll/ۘ֡۠;

    move-result-object v3

    .line 735
    invoke-static {v1}, Ll/ۗܰ֨;->ᩳ(Ll/ۗܰ֨;)Ll/ᩳᩴ֨;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v3}, Ll/ᩳᩴ֨;->֫(Ll/ۗ۠۠;)Ll/ۗ۠۠;

    move-result-object v4

    const-wide/32 v5, -0x10000001

    .line 3046
    :try_start_0
    invoke-virtual {v0, v3}, Ll/᩶ܰ֨;->֫(Ll/ۘ֡۠;)V

    .line 739
    invoke-static {v1, p1}, Ll/ۗܰ֨;->ܽ(Ll/ۗܰ֨;Ll/֡֡֨;)V

    .line 740
    invoke-static {v1, v3}, Ll/ۗܰ֨;->֫(Ll/ۗܰ֨;Ll/ۘ֡۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 742
    invoke-static {v1}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    .line 743
    invoke-static {v1}, Ll/ۗܰ֨;->ᩳ(Ll/ۗܰ֨;)Ll/ᩳᩴ֨;

    move-result-object v0

    invoke-virtual {v0, v4}, Ll/ᩳᩴ֨;->֫(Ll/ۗ۠۠;)Ll/ۗ۠۠;

    .line 744
    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v0, v5

    iput-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    return-void

    :catchall_0
    move-exception v0

    .line 742
    invoke-static {v1}, Ll/ۗܰ֨;->ܿ(Ll/ۗܰ֨;)Ll/᩹ܶ۠;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    .line 743
    invoke-static {v1}, Ll/ۗܰ֨;->ᩳ(Ll/ۗܰ֨;)Ll/ᩳᩴ֨;

    move-result-object v1

    invoke-virtual {v1, v4}, Ll/ᩳᩴ֨;->֫(Ll/ۗ۠۠;)Ll/ۗ۠۠;

    .line 744
    iget-wide v1, p1, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v1, v5

    iput-wide v1, p1, Ll/ۛ֡֨;->᩶:J

    .line 745
    throw v0
.end method

.method public final synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
