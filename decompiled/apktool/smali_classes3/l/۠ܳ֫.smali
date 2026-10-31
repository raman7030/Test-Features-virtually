.class public final Ll/۠ܳ֫;
.super Ll/ܶܳ֫;
.source "RB93"


# instance fields
.field public ܽ:Ll/ۚ᩻֫;

.field public ܿ:Z

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ۙ᩷֫;Ll/᩻۫;Z)V
    .locals 0

    .line 890
    invoke-direct {p0, p1, p2}, Ll/ܶܳ֫;-><init>(Ll/ۙ᩷֫;Ll/᩻۫;)V

    const/4 p1, 0x0

    .line 884
    iput-boolean p1, p0, Ll/۠ܳ֫;->ܿ:Z

    .line 891
    iput-boolean p3, p0, Ll/۠ܳ֫;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;)Ll/ۚ᩻֫;
    .locals 4

    .line 896
    iget-boolean v0, p0, Ll/۠ܳ֫;->ܿ:Z

    if-eqz v0, :cond_0

    .line 897
    iget-object p1, p0, Ll/۠ܳ֫;->ܽ:Ll/ۚ᩻֫;

    return-object p1

    .line 900
    :cond_0
    invoke-virtual {p0}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v0

    .line 901
    invoke-virtual {p0}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object v1

    sget-object v2, Ll/᩶᩷֫;->ۗ:Ll/᩶᩷֫;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-boolean v2, p0, Ll/۠ܳ֫;->ᩳ:Z

    .line 899
    invoke-static {p1, v0, v1, v2}, Ll/۠᩻֫;->֫(Landroid/content/Context;Ll/ۡ᩻֫;ZZ)Ll/ۚ᩻֫;

    move-result-object p1

    iput-object p1, p0, Ll/۠ܳ֫;->ܽ:Ll/ۚ᩻֫;

    .line 903
    iput-boolean v3, p0, Ll/۠ܳ֫;->ܿ:Z

    return-object p1
.end method
