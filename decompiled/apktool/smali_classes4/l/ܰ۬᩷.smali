.class public final Ll/ܰ۬᩷;
.super Ll/۬ۗܿ;
.source "81ID"


# instance fields
.field public final synthetic ֫֫:Z

.field public final synthetic ۟:Ll/֫۫᩷;


# direct methods
.method public constructor <init>(Ll/֫۫᩷;Ll/ۗܺ᩷;Z)V
    .locals 0

    .line 97
    iput-object p1, p0, Ll/ܰ۬᩷;->۟:Ll/֫۫᩷;

    iput-boolean p3, p0, Ll/ܰ۬᩷;->֫֫:Z

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ۖ()V
    .locals 3

    .line 140
    iget-boolean v0, p0, Ll/ܰ۬᩷;->֫֫:Z

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Ll/ܰ۬᩷;->۟:Ll/֫۫᩷;

    invoke-static {v0}, Ll/֫۫᩷;->ܳ(Ll/֫۫᩷;)Ll/֡ۚۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 142
    :cond_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 144
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "dex_backup_name"

    invoke-interface {v1, v2, v0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    :cond_1
    return-void
.end method

.method public final ᩴ()V
    .locals 1

    .line 100
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 105
    :cond_0
    new-instance v0, Ll/᩺۬᩷;

    invoke-direct {v0, p0}, Ll/᩺۬᩷;-><init>(Ll/ܰ۬᩷;)V

    .line 135
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
