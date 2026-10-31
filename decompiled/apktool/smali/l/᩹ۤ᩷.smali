.class public final Ll/᩹ۤ᩷;
.super Ll/۟ܶۡ;
.source "31K1"


# instance fields
.field public final synthetic ܳ:Ll/ܿۛ᩷;

.field public final synthetic ᩻:Ll/۟ۢ֫;


# direct methods
.method public constructor <init>(Ll/ܿۛ᩷;Ll/᩷ۡ֫;)V
    .locals 0

    .line 671
    iput-object p1, p0, Ll/᩹ۤ᩷;->ܳ:Ll/ܿۛ᩷;

    iput-object p2, p0, Ll/᩹ۤ᩷;->᩻:Ll/۟ۢ֫;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 3

    .line 715
    iget-object v0, p0, Ll/᩹ۤ᩷;->ܳ:Ll/ܿۛ᩷;

    invoke-static {v0}, Ll/ܿۛ᩷;->֡(Ll/ܿۛ᩷;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩹ۤ᩷;->᩻:Ll/۟ۢ֫;

    invoke-virtual {v1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v1

    sget-object v2, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-eq v1, v2, :cond_0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    const-string p1, "\u7f16\u8bd1\u5668\u6d4b\u8bd5\u5931\u8d25\uff0c\u8bf7\u5c06\u8be5\u6587\u4ef6\u53cd\u9988\u7ed9\u4f5c\u8005"

    .line 717
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 0

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 680
    iget-object v0, p0, Ll/᩹ۤ᩷;->ܳ:Ll/ܿۛ᩷;

    invoke-static {v0}, Ll/ܿۛ᩷;->ܺ(Ll/ܿۛ᩷;)Ll/᩵ۨ᩷;

    move-result-object v0

    new-instance v1, Ll/᩸ۤ᩷;

    invoke-direct {v1, p0}, Ll/᩸ۤ᩷;-><init>(Ll/᩹ۤ᩷;)V

    invoke-virtual {v0, v1}, Ll/᩵ۨ᩷;->֫(Ll/ۛۛ᩷;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    return-void
.end method
