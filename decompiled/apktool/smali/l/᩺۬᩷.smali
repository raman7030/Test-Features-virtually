.class public final Ll/᩺۬᩷;
.super Ll/۟ܶۡ;
.source "81ID"


# instance fields
.field public final synthetic ܳ:Ll/ܰ۬᩷;


# direct methods
.method public constructor <init>(Ll/ܰ۬᩷;)V
    .locals 0

    .line 105
    iput-object p1, p0, Ll/᩺۬᩷;->ܳ:Ll/ܰ۬᩷;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 121
    iget-object v0, p0, Ll/᩺۬᩷;->ܳ:Ll/ܰ۬᩷;

    invoke-virtual {v0}, Ll/۬ۗܿ;->ۧ()V

    .line 122
    iget-object v0, v0, Ll/ܰ۬᩷;->۟:Ll/֫۫᩷;

    invoke-static {v0}, Ll/֫۫᩷;->ᩳ(Ll/֫۫᩷;)Landroid/widget/BaseAdapter;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 123
    invoke-static {v0}, Ll/֫۫᩷;->ܳ(Ll/֫۫᩷;)Ll/֡ۚۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 128
    iget-object v0, p0, Ll/᩺۬᩷;->ܳ:Ll/ܰ۬᩷;

    iget-object v0, v0, Ll/ܰ۬᩷;->۟:Ll/֫۫᩷;

    invoke-static {v0}, Ll/֫۫᩷;->ܽ(Ll/֫۫᩷;)Ll/ܿۛ᩷;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 109
    iget-object v0, p0, Ll/᩺۬᩷;->ܳ:Ll/ܰ۬᩷;

    iget-object v0, v0, Ll/ܰ۬᩷;->۟:Ll/֫۫᩷;

    invoke-static {v0}, Ll/֫۫᩷;->ܽ(Ll/֫۫᩷;)Ll/ܿۛ᩷;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 114
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/᩺۬᩷;->ܳ:Ll/ܰ۬᩷;

    invoke-virtual {v1}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "dex_backup_name"

    invoke-interface {v0, v3, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 115
    iget-object v0, v1, Ll/ܰ۬᩷;->۟:Ll/֫۫᩷;

    invoke-static {v0}, Ll/֫۫᩷;->ܿ(Ll/֫۫᩷;)Ll/᩶۬᩷;

    move-result-object v2

    invoke-virtual {v1}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/᩶۬᩷;->֫(Ljava/lang/String;)V

    .line 116
    invoke-static {v0}, Ll/֫۫᩷;->ܿ(Ll/֫۫᩷;)Ll/᩶۬᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩶۬᩷;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֫۫᩷;->֫(Ll/֫۫᩷;Ljava/util/ArrayList;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 133
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
