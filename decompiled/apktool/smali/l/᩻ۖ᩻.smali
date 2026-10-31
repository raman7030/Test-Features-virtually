.class public final Ll/᩻ۖ᩻;
.super Ll/۟ܶۡ;
.source "H88G"


# instance fields
.field public final synthetic ۜ:Landroid/widget/EditText;

.field public final synthetic ۡ:Landroid/widget/EditText;

.field public final synthetic ۢ:Ll/ۢۖ᩻;

.field public ܳ:Ljava/util/List;

.field public final synthetic ᩷:Landroid/widget/EditText;

.field public final synthetic ᩻:Ll/ۗܺ᩷;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ۢۖ᩻;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    .line 383
    iput-object p1, p0, Ll/᩻ۖ᩻;->᩻:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/᩻ۖ᩻;->ۢ:Ll/ۢۖ᩻;

    iput-object p3, p0, Ll/᩻ۖ᩻;->ۡ:Landroid/widget/EditText;

    iput-object p4, p0, Ll/᩻ۖ᩻;->᩷:Landroid/widget/EditText;

    iput-object p5, p0, Ll/᩻ۖ᩻;->ۜ:Landroid/widget/EditText;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 9

    .line 398
    iget-object v0, p0, Ll/᩻ۖ᩻;->ܳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f1206e9

    .line 399
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 402
    :cond_0
    iget-object v0, p0, Ll/᩻ۖ᩻;->ܳ:Ljava/util/List;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܿۖ᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 403
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/֡۠ۢ;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/֡۠ۢ;-><init>(I)V

    .line 404
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/CharSequence;

    .line 405
    iget-object v1, p0, Ll/᩻ۖ᩻;->᩻:Ll/ۗܺ᩷;

    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    new-instance v8, Ll/ܳۖ᩻;

    iget-object v4, p0, Ll/᩻ۖ᩻;->ۢ:Ll/ۢۖ᩻;

    iget-object v5, p0, Ll/᩻ۖ᩻;->ۡ:Landroid/widget/EditText;

    iget-object v6, p0, Ll/᩻ۖ᩻;->᩷:Landroid/widget/EditText;

    iget-object v7, p0, Ll/᩻ۖ᩻;->ۜ:Landroid/widget/EditText;

    move-object v2, v8

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Ll/ܳۖ᩻;-><init>(Ll/᩻ۖ᩻;Ll/ۢۖ᩻;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 406
    invoke-virtual {v1, v0, v8}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 417
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 422
    iget-object v0, p0, Ll/᩻ۖ᩻;->᩻:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 388
    iget-object v0, p0, Ll/᩻ۖ᩻;->᩻:Ll/ۗܺ᩷;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 393
    iget-object v0, p0, Ll/᩻ۖ᩻;->ۢ:Ll/ۢۖ᩻;

    invoke-interface {v0}, Ll/ۡۖ᩻;->֫()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۖ᩻;->ܳ:Ljava/util/List;

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 427
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
