.class public final Ll/ۛۢܳ;
.super Ljava/lang/Object;
.source "V1YC"


# instance fields
.field public ֫:Ll/ܶ᩵ܿ;

.field public ۧ:Ljava/lang/String;

.field public ܽ:J

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛۢܳ;->ᩳ:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛۢܳ;->ۧ:Ljava/lang/String;

    .line 22
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ۛۢܳ;->֫:Ll/ܶ᩵ܿ;

    .line 23
    invoke-virtual {p1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۛۢܳ;->ܽ:J

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p2, p0, Ll/ۛۢܳ;->ᩳ:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Ll/ۛۢܳ;->ۧ:Ljava/lang/String;

    .line 29
    iput-object p1, p0, Ll/ۛۢܳ;->֫:Ll/ܶ᩵ܿ;

    .line 30
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۛۢܳ;->ܽ:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۛۢܳ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ll/ܶ᩵ܿ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۛۢܳ;->֫:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 2

    .line 68
    iget-object v0, p0, Ll/ۛۢܳ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Ll/ۛۢܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Ll/ۛۢܳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 71
    iget-wide v0, p0, Ll/ۛۢܳ;->ܽ:J

    invoke-virtual {p1, v0, v1}, Ll/ۤۜܽ;->ۧ(J)V

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ۛۢܳ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()V
    .locals 2

    .line 34
    iget-object v0, p0, Ll/ۛۢܳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۛۢܳ;->ܽ:J

    return-void
.end method

.method public final ܽ()J
    .locals 2

    .line 38
    iget-wide v0, p0, Ll/ۛۢܳ;->ܽ:J

    return-wide v0
.end method

.method public final ܿ()Z
    .locals 5

    .line 46
    iget-object v0, p0, Ll/ۛۢܳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۛۢܳ;->ܽ:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۛۢܳ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method
