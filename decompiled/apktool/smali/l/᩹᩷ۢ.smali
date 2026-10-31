.class public final Ll/᩹᩷ۢ;
.super Ll/۟ܶۡ;
.source "O1K3"


# instance fields
.field public final synthetic ۜ:Ll/۫᩷ۢ;

.field public final synthetic ܳ:Ll/ܿۛ᩷;

.field public final synthetic ᩻:Lbin/mt/plugin/api/util/ResultCallback;


# direct methods
.method public constructor <init>(Ll/ܿۛ᩷;Ll/۫᩷ۢ;Lbin/mt/plugin/api/util/ResultCallback;)V
    .locals 0

    .line 1082
    iput-object p1, p0, Ll/᩹᩷ۢ;->ܳ:Ll/ܿۛ᩷;

    iput-object p2, p0, Ll/᩹᩷ۢ;->ۜ:Ll/۫᩷ۢ;

    iput-object p3, p0, Ll/᩹᩷ۢ;->᩻:Lbin/mt/plugin/api/util/ResultCallback;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 1096
    iget-object v0, p0, Ll/᩹᩷ۢ;->ܳ:Ll/ܿۛ᩷;

    invoke-virtual {v0}, Ll/ܿۛ᩷;->ۖ֫()V

    const v0, 0x7f1208d1

    .line 1097
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 1098
    iget-object v0, p0, Ll/᩹᩷ۢ;->᩻:Lbin/mt/plugin/api/util/ResultCallback;

    if-eqz v0, :cond_0

    .line 1099
    invoke-interface {v0}, Lbin/mt/plugin/api/util/ResultCallback;->onSuccess()V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 1105
    iget-object v0, p0, Ll/᩹᩷ۢ;->ۜ:Ll/۫᩷ۢ;

    invoke-virtual {v0, p1}, Ll/۫᩷ۢ;->֫(Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1106
    iget-object v0, p0, Ll/᩹᩷ۢ;->ܳ:Ll/ܿۛ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1108
    :cond_0
    iget-object v0, p0, Ll/᩹᩷ۢ;->᩻:Lbin/mt/plugin/api/util/ResultCallback;

    if-eqz v0, :cond_1

    .line 1109
    invoke-static {p1}, Ll/ᩳ᩸ۡ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 1086
    iget-object v0, p0, Ll/᩹᩷ۢ;->ܳ:Ll/ܿۛ᩷;

    const v1, 0x7f1208d2

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 1091
    iget-object v0, p0, Ll/᩹᩷ۢ;->ۜ:Ll/۫᩷ۢ;

    invoke-virtual {v0}, Ll/۫᩷ۢ;->֫()V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 1115
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
