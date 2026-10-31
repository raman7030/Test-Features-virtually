.class public final Ll/ۖ۬ܺ;
.super Ll/᩶ۨܺ;
.source "Z3PG"


# instance fields
.field public final ᩸:Ll/᩶ۨܺ;

.field public ᩹:Ll/᩶ۨܺ;


# direct methods
.method public constructor <init>(Ll/֡۬ܺ;)V
    .locals 0

    .line 786
    invoke-direct {p0}, Ll/᩶ۨܺ;-><init>()V

    .line 787
    iget-object p1, p1, Ll/֡۬ܺ;->ۙ:Ll/ۢ۬ܺ;

    invoke-virtual {p1}, Ll/ۢ۬ܺ;->values()Ll/᩺ۗܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ۬ܺ;->᩸:Ll/᩶ۨܺ;

    .line 92
    sget-object p1, Ll/֡۫ܺ;->ۙ:Ll/ۙۨܺ;

    .line 788
    iput-object p1, p0, Ll/ۖ۬ܺ;->᩹:Ll/᩶ۨܺ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 792
    iget-object v0, p0, Ll/ۖ۬ܺ;->᩹:Ll/᩶ۨܺ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۖ۬ܺ;->᩸:Ll/᩶ۨܺ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

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

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 797
    iget-object v0, p0, Ll/ۖ۬ܺ;->᩹:Ll/᩶ۨܺ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 798
    iget-object v0, p0, Ll/ۖ۬ܺ;->᩸:Ll/᩶ۨܺ;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۗܺ;

    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۖ۬ܺ;->᩹:Ll/᩶ۨܺ;

    .line 800
    :cond_0
    iget-object v0, p0, Ll/ۖ۬ܺ;->᩹:Ll/᩶ۨܺ;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
