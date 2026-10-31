.class public abstract Ll/ᩴ᩸᩵;
.super Ll/ۖ᩸᩵;
.source "CANR"


# instance fields
.field public transient ᩶:Ll/ۨܶ᩵;

.field public final ᩹:Ll/ܳ᩸᩵;


# direct methods
.method public constructor <init>(Ll/ۨܶ᩵;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 103
    invoke-interface {p1}, Ll/ۨܶ᩵;->getContext()Ll/ܳ᩸᩵;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Ll/ᩴ᩸᩵;-><init>(Ll/ۨܶ᩵;Ll/ܳ᩸᩵;)V

    return-void
.end method

.method public constructor <init>(Ll/ۨܶ᩵;Ll/ܳ᩸᩵;)V
    .locals 0

    .line 97
    invoke-direct {p0, p1}, Ll/ۖ᩸᩵;-><init>(Ll/ۨܶ᩵;)V

    .line 101
    iput-object p2, p0, Ll/ᩴ᩸᩵;->᩹:Ll/ܳ᩸᩵;

    return-void
.end method


# virtual methods
.method public getContext()Ll/ܳ᩸᩵;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ᩴ᩸᩵;->᩹:Ll/ܳ᩸᩵;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ۜ()Ll/ۨܶ᩵;
    .locals 2

    .line 112
    iget-object v0, p0, Ll/ᩴ᩸᩵;->᩶:Ll/ۨܶ᩵;

    if-nez v0, :cond_1

    .line 113
    invoke-virtual {p0}, Ll/ᩴ᩸᩵;->getContext()Ll/ܳ᩸᩵;

    move-result-object v0

    sget-object v1, Ll/۟ܶ᩵;->֡:Ll/ܰܶ᩵;

    invoke-interface {v0, v1}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object v0

    check-cast v0, Ll/۟ܶ᩵;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Ll/۟ܶ᩵;->֫(Ll/ᩴ᩸᩵;)Ll/ۧۛ᩵;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    .line 114
    :goto_0
    iput-object v0, p0, Ll/ᩴ᩸᩵;->᩶:Ll/ۨܶ᩵;

    :cond_1
    return-object v0
.end method

.method public ᩻()V
    .locals 3

    .line 117
    iget-object v0, p0, Ll/ᩴ᩸᩵;->᩶:Ll/ۨܶ᩵;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    .line 119
    invoke-virtual {p0}, Ll/ᩴ᩸᩵;->getContext()Ll/ܳ᩸᩵;

    move-result-object v1

    sget-object v2, Ll/۟ܶ᩵;->֡:Ll/ܰܶ᩵;

    invoke-interface {v1, v2}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v1, Ll/۟ܶ᩵;

    invoke-interface {v1, v0}, Ll/۟ܶ᩵;->֫(Ll/ۨܶ᩵;)V

    .line 121
    :cond_0
    sget-object v0, Ll/ۘ᩸᩵;->᩸:Ll/ۘ᩸᩵;

    iput-object v0, p0, Ll/ᩴ᩸᩵;->᩶:Ll/ۨܶ᩵;

    return-void
.end method
