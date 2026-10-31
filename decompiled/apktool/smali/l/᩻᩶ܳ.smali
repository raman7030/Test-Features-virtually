.class public Ll/᩻᩶ܳ;
.super Ll/ۤۜܳ;
.source "IB3L"


# instance fields
.field public ᩳ:Ll/᩶ۙܳ;


# direct methods
.method public constructor <init>(Ll/᩶ۙܳ;)V
    .locals 2

    const v0, 0x7f1205ff

    const v1, 0x7f080237

    .line 16
    invoke-direct {p0, v0, v1}, Ll/ۤۜܳ;-><init>(II)V

    .line 17
    iput-object p1, p0, Ll/᩻᩶ܳ;->ᩳ:Ll/᩶ۙܳ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩻᩶ܳ;Ll/ܽۢܳ;Ljava/util/List;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 33
    iget-object p0, p0, Ll/᩻᩶ܳ;->ᩳ:Ll/᩶ۙܳ;

    if-nez p4, :cond_0

    .line 34
    new-instance p2, Ll/ܳۙܳ;

    invoke-direct {p2, p1, p0}, Ll/ܳۙܳ;-><init>(Ll/ܽۢܳ;Ll/᩶ۙܳ;)V

    goto :goto_0

    .line 36
    :cond_0
    new-instance p4, Ll/ܳۙܳ;

    invoke-direct {p4, p1, p0}, Ll/ܳۙܳ;-><init>(Ll/ܽۢܳ;Ll/᩶ۙܳ;)V

    invoke-virtual {p4, p2}, Ll/ܳۙܳ;->֫(Ljava/util/List;)V

    .line 38
    :goto_0
    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 5

    .line 22
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    invoke-virtual {p1}, Ll/ܽۢܳ;->᩸()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ᩳ᩶ܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ᩳ᩶ܳ;-><init>(I)V

    .line 24
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܿ᩶ܳ;

    invoke-direct {v1, v2}, Ll/ܿ᩶ܳ;-><init>(I)V

    .line 25
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 26
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 27
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const v1, 0x7f1208f8

    .line 28
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const v3, 0x7f1208fa

    .line 29
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/CharSequence;

    aput-object v1, v4, v2

    const/4 v1, 0x1

    aput-object v3, v4, v1

    .line 30
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    const v2, 0x7f1205ff

    .line 31
    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v2, Ll/ܳ᩶ܳ;

    invoke-direct {v2, p0, p1, v0}, Ll/ܳ᩶ܳ;-><init>(Ll/᩻᩶ܳ;Ll/ܽۢܳ;Ljava/util/List;)V

    const/4 p1, -0x1

    .line 32
    invoke-virtual {v1, v4, p1, v2}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    .line 40
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 44
    :cond_0
    new-instance v0, Ll/ܳۙܳ;

    iget-object v1, p0, Ll/᩻᩶ܳ;->ᩳ:Ll/᩶ۙܳ;

    invoke-direct {v0, p1, v1}, Ll/ܳۙܳ;-><init>(Ll/ܽۢܳ;Ll/᩶ۙܳ;)V

    return-void
.end method
