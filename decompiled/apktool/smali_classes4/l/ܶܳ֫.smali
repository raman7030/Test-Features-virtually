.class public Ll/ܶܳ֫;
.super Ljava/lang/Object;
.source "RB93"


# instance fields
.field public final ֫:Ll/ۙ᩷֫;

.field public final ۧ:Ll/᩻۫;


# direct methods
.method public constructor <init>(Ll/ۙ᩷֫;Ll/᩻۫;)V
    .locals 0

    .line 853
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 854
    iput-object p1, p0, Ll/ܶܳ֫;->֫:Ll/ۙ᩷֫;

    .line 855
    iput-object p2, p0, Ll/ܶܳ֫;->ۧ:Ll/᩻۫;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 877
    iget-object v0, p0, Ll/ܶܳ֫;->֫:Ll/ۙ᩷֫;

    iget-object v1, p0, Ll/ܶܳ֫;->ۧ:Ll/᩻۫;

    invoke-virtual {v0, v1}, Ll/ۙ᩷֫;->֫(Ll/᩻۫;)V

    return-void
.end method

.method public final ۧ()Ll/ۙ᩷֫;
    .locals 1

    .line 860
    iget-object v0, p0, Ll/ܶܳ֫;->֫:Ll/ۙ᩷֫;

    return-object v0
.end method

.method public final ܽ()Ll/᩻۫;
    .locals 1

    .line 865
    iget-object v0, p0, Ll/ܶܳ֫;->ۧ:Ll/᩻۫;

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 3

    .line 870
    iget-object v0, p0, Ll/ܶܳ֫;->֫:Ll/ۙ᩷֫;

    invoke-virtual {v0}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v1

    iget-object v1, v1, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    .line 869
    invoke-static {v1}, Ll/᩶᩷֫;->ۧ(Landroid/view/View;)Ll/᩶᩷֫;

    move-result-object v1

    .line 871
    invoke-virtual {v0}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object v0

    if-eq v1, v0, :cond_1

    .line 872
    sget-object v2, Ll/᩶᩷֫;->ۗ:Ll/᩶᩷֫;

    if-eq v1, v2, :cond_0

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
