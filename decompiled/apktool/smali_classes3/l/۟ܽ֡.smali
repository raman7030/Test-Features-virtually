.class public final Ll/۟ܽ֡;
.super Ll/ܶᩳ֡;
.source "D4CH"


# instance fields
.field public ܿ:Ll/ܶᩳ֡;


# direct methods
.method public constructor <init>(Ll/ܶᩳ֡;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 27
    iput-object p1, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    return-void

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/ܶᩳ֡;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    invoke-virtual {v0}, Ll/ܶᩳ֡;->֫()Ll/ܶᩳ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(J)Ll/ܶᩳ֡;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    invoke-virtual {v0, p1, p2}, Ll/ܶᩳ֡;->֫(J)Ll/ܶᩳ֡;

    move-result-object p1

    return-object p1
.end method

.method public final ۜ()V
    .locals 1

    .line 2
    sget-object v0, Ll/ܶᩳ֡;->ᩳ:Ll/ܶᩳ֡;

    .line 37
    iput-object v0, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    return-void
.end method

.method public final ۧ()Ll/ܶᩳ֡;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    invoke-virtual {v0}, Ll/ܶᩳ֡;->ۧ()Ll/ܶᩳ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(J)Ll/ܶᩳ֡;
    .locals 1

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 42
    iget-object v0, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    invoke-virtual {v0, p1, p2}, Ll/ܶᩳ֡;->ۧ(J)Ll/ܶᩳ֡;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()J
    .locals 2

    .line 46
    iget-object v0, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    invoke-virtual {v0}, Ll/ܶᩳ֡;->ܳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ()J
    .locals 2

    .line 54
    iget-object v0, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    invoke-virtual {v0}, Ll/ܶᩳ֡;->ܽ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()V
    .locals 1

    .line 70
    iget-object v0, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    invoke-virtual {v0}, Ll/ܶᩳ֡;->ܿ()V

    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 50
    iget-object v0, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    invoke-virtual {v0}, Ll/ܶᩳ֡;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final ᩻()Ll/ܶᩳ֡;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/۟ܽ֡;->ܿ:Ll/ܶᩳ֡;

    return-object v0
.end method
