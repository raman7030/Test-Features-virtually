.class public final Ll/᩵ۚ᩻;
.super Ll/۟ܶۡ;
.source "NA5M"


# instance fields
.field public final synthetic ܳ:Ll/ۗܺ᩷;

.field public final synthetic ᩻:Ll/ۚۚ᩻;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ۚۚ᩻;)V
    .locals 0

    .line 275
    iput-object p1, p0, Ll/᩵ۚ᩻;->ܳ:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/᩵ۚ᩻;->᩻:Ll/ۚۚ᩻;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 299
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const v0, 0x7f1206d4

    .line 301
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 306
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 308
    :cond_0
    iget-object v0, p0, Ll/᩵ۚ᩻;->ܳ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 279
    iget-object v0, p0, Ll/᩵ۚ᩻;->ܳ:Ll/ۗܺ᩷;

    const v1, 0x7f1201e9

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    .line 280
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/᩺ۤᩳ;

    const/4 v2, 0x3

    invoke-direct {v1, v2, v0}, Ll/᩺ۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ()V
    .locals 5

    .line 285
    iget-object v0, p0, Ll/᩵ۚ᩻;->᩻:Ll/ۚۚ᩻;

    invoke-virtual {v0}, Ll/ۚۚ᩻;->ۢ()Ll/ܿ۟᩵;

    move-result-object v1

    .line 286
    iget-object v2, v0, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 287
    invoke-virtual {v1}, Ll/ܿ۟᩵;->ۖ()Ll/ᩳ۟᩵;

    move-result-object v1

    new-instance v2, Ll/᩸ۚ᩻;

    iget-object v3, v0, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    invoke-direct {v2, v3}, Ll/᩸ۚ᩻;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ll/ᩳ۟᩵;->֫(Ll/᩺ܰ᩵;)V

    invoke-virtual {v1}, Ll/ᩳ۟᩵;->֫()Ll/ܿ۟᩵;

    move-result-object v1

    .line 290
    :cond_0
    new-instance v2, Ll/ۤ᩹ۘ;

    iget-object v3, v0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-direct {v2, v1, v3}, Ll/ۤ᩹ۘ;-><init>(Ll/ܿ۟᩵;Ljava/lang/String;)V

    .line 291
    iget-object v1, v0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 292
    iget-object v1, v0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    iget-object v3, v0, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    const/4 v4, 0x0

    .line 189
    invoke-virtual {v2, v1, v3, v4}, Ll/ۤ᩹ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 294
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, v0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ۤ᩹ۘ;->ᩳ(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 313
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 315
    :cond_0
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
