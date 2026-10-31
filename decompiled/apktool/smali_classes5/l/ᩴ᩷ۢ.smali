.class public final Ll/ᩴ᩷ۢ;
.super Ll/ܰۨᩳ;
.source "O1K3"


# instance fields
.field public final synthetic ܽ:Ll/ۛ᩷ۢ;


# direct methods
.method public constructor <init>(Ll/ۛ᩷ۢ;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    iput-object p1, p0, Ll/ᩴ᩷ۢ;->ܽ:Ll/ۛ᩷ۢ;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plugin/api/util/ResultCallback;)V
    .locals 4

    .line 229
    iget-object v0, p0, Ll/ᩴ᩷ۢ;->ܽ:Ll/ۛ᩷ۢ;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ܿۛ᩷;

    .line 1075
    invoke-virtual {v0}, Ll/ۛ᩷ۢ;->ۖ()Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz p1, :cond_0

    .line 1077
    invoke-interface {p1}, Lbin/mt/plugin/api/util/ResultCallback;->onSuccess()V

    :cond_0
    return-void

    .line 1081
    :cond_1
    new-instance v2, Ll/۫᩷ۢ;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v0, v3}, Ll/۫᩷ۢ;-><init>(Ll/ܿۛ᩷;Ll/ۛ᩷ۢ;Z)V

    .line 1082
    new-instance v0, Ll/᩹᩷ۢ;

    invoke-direct {v0, v1, v2, p1}, Ll/᩹᩷ۢ;-><init>(Ll/ܿۛ᩷;Ll/۫᩷ۢ;Lbin/mt/plugin/api/util/ResultCallback;)V

    .line 1117
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ᩴ᩷ۢ;->ܽ:Ll/ۛ᩷ۢ;

    invoke-virtual {v1}, Ll/ۛ᩷ۢ;->֨()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".smali"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 258
    iget-object v0, p0, Ll/ᩴ᩷ۢ;->ܽ:Ll/ۛ᩷ۢ;

    invoke-virtual {v0}, Ll/ۛ᩷ۢ;->ۖ()Z

    move-result v0

    return v0
.end method
