.class public final Ll/ܳۡ᩻;
.super Ll/۟ܶۡ;
.source "TAIM"


# instance fields
.field public final synthetic ۜ:Z

.field public final synthetic ۡ:Ll/ܽۢܳ;

.field public final synthetic ۢ:Ljava/lang/String;

.field public ܳ:Ll/ۧۢܳ;

.field public final synthetic ᩷:Ljava/lang/String;

.field public final synthetic ᩻:Ll/ۚۡ᩻;


# direct methods
.method public constructor <init>(Ll/ۚۡ᩻;Ll/ܽۢܳ;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 305
    iput-object p1, p0, Ll/ܳۡ᩻;->᩻:Ll/ۚۡ᩻;

    iput-object p2, p0, Ll/ܳۡ᩻;->ۡ:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/ܳۡ᩻;->ۢ:Ljava/lang/String;

    iput-boolean p4, p0, Ll/ܳۡ᩻;->ۜ:Z

    iput-object p5, p0, Ll/ܳۡ᩻;->᩷:Ljava/lang/String;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 328
    iget-object v0, p0, Ll/ܳۡ᩻;->ۡ:Ll/ܽۢܳ;

    iget-object v1, p0, Ll/ܳۡ᩻;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 333
    iget-object v0, p0, Ll/ܳۡ᩻;->ۡ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 311
    iget-object v0, p0, Ll/ܳۡ᩻;->ۡ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ۡ֫()Ll/ۧۢܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۡ᩻;->ܳ:Ll/ۧۢܳ;

    return-void
.end method

.method public final ܿ()V
    .locals 5

    .line 316
    iget-object v0, p0, Ll/ܳۡ᩻;->᩻:Ll/ۚۡ᩻;

    invoke-virtual {v0}, Ll/ۚۡ᩻;->᩶()Ll/ۗۢ᩻;

    move-result-object v1

    iget-object v2, p0, Ll/ܳۡ᩻;->ۢ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ۗۢ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 319
    iget-boolean v1, p0, Ll/ܳۡ᩻;->ۜ:Z

    if-eqz v1, :cond_0

    .line 320
    invoke-virtual {v0}, Ll/ۚۡ᩻;->᩶()Ll/ۗۢ᩻;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/ۗۢ᩻;->ܿ(Ljava/lang/String;)V

    return-void

    .line 322
    :cond_0
    invoke-virtual {v0}, Ll/ۚۡ᩻;->᩶()Ll/ۗۢ᩻;

    move-result-object v0

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v2}, Ll/ۗۢ᩻;->ۧ(JLjava/lang/String;)Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void

    .line 317
    :cond_1
    new-instance v0, Ll/ܳۨۡ;

    const v1, 0x7f1203a1

    invoke-direct {v0, v1}, Ll/ܳۨۡ;-><init>(I)V

    throw v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 338
    iget-object v0, p0, Ll/ܳۡ᩻;->ܳ:Ll/ۧۢܳ;

    invoke-virtual {v0}, Ll/ۧۢܳ;->֫()V

    .line 339
    iget-object v0, p0, Ll/ܳۡ᩻;->᩻:Ll/ۚۡ᩻;

    invoke-virtual {v0}, Ll/ۚۡ᩻;->᩶()Ll/ۗۢ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    return-void
.end method
