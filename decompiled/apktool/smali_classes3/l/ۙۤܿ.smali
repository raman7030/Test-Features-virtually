.class public final Ll/ۙۤܿ;
.super Ll/۟ܶۡ;
.source "G668"


# instance fields
.field public final synthetic ۜ:Ll/֡ۚۢ;

.field public final synthetic ۢ:Ll/֨ۙܽ;

.field public ܳ:Ll/ܶ᩵ܿ;

.field public final synthetic ᩷:Ll/۬ܿᩳ;

.field public final synthetic ᩻:Ll/ۗܺ᩷;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/۬ܿᩳ;Ll/֡ۚۢ;Ll/֨ۙܽ;)V
    .locals 0

    .line 312
    iput-object p1, p0, Ll/ۙۤܿ;->᩻:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۙۤܿ;->᩷:Ll/۬ܿᩳ;

    iput-object p3, p0, Ll/ۙۤܿ;->ۜ:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ۙۤܿ;->ۢ:Ll/֨ۙܽ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 329
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 330
    iget-object v0, p0, Ll/ۙۤܿ;->ۜ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 331
    iget-object v0, p0, Ll/ۙۤܿ;->ۢ:Ll/֨ۙܽ;

    .line 332
    iget-object v1, p0, Ll/ۙۤܿ;->ܳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v1}, Ll/֨ۙܽ;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 338
    iget-object v0, p0, Ll/ۙۤܿ;->᩻:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 317
    iget-object v0, p0, Ll/ۙۤܿ;->᩻:Ll/ۗܺ᩷;

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->ۧ(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 5

    .line 322
    invoke-static {}, Ll/ۡۨܽ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    iget-object v1, p0, Ll/ۙۤܿ;->᩷:Ll/۬ܿᩳ;

    invoke-virtual {v1}, Ll/۬ܿᩳ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v3

    invoke-virtual {v1}, Ll/۬ܿᩳ;->ܺ()Ljava/security/PrivateKey;

    move-result-object v4

    invoke-interface {v4}, Ljava/security/Key;->getEncoded()[B

    move-result-object v4

    invoke-static {v0, v2, v3, v4}, Ll/᩹ܿᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;[B[B)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۤܿ;->ܳ:Ll/ܶ᩵ܿ;

    .line 323
    invoke-virtual {v1}, Ll/۬ܿᩳ;->֡()V

    .line 324
    invoke-virtual {v1}, Ll/۬ܿᩳ;->ۧ()V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 343
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
