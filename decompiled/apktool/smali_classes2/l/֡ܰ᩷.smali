.class public final Ll/֡ܰ᩷;
.super Ll/۟ܶۡ;
.source "I1KV"


# instance fields
.field public final synthetic ۜ:Ll/ۗܺ᩷;

.field public final synthetic ۢ:Ljava/lang/String;

.field public ܳ:Ljava/lang/String;

.field public final synthetic ᩷:Ljava/lang/String;

.field public final synthetic ᩻:Ll/᩸ܰ᩷;


# direct methods
.method public constructor <init>(Ll/᩸ܰ᩷;Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 853
    iput-object p1, p0, Ll/֡ܰ᩷;->᩻:Ll/᩸ܰ᩷;

    iput-object p2, p0, Ll/֡ܰ᩷;->ۜ:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/֡ܰ᩷;->᩷:Ljava/lang/String;

    iput-object p4, p0, Ll/֡ܰ᩷;->ۢ:Ljava/lang/String;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 870
    iget-object v0, p0, Ll/֡ܰ᩷;->ۢ:Ljava/lang/String;

    iget-object v1, p0, Ll/֡ܰ᩷;->ܳ:Ljava/lang/String;

    iget-object v2, p0, Ll/֡ܰ᩷;->᩻:Ll/᩸ܰ᩷;

    invoke-static {v2, v0, v1}, Ll/᩸ܰ᩷;->֫(Ll/᩸ܰ᩷;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 875
    iget-object v0, p0, Ll/֡ܰ᩷;->ۜ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 858
    iget-object v0, p0, Ll/֡ܰ᩷;->ۜ:Ll/ۗܺ᩷;

    const v1, 0x7f120528

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 863
    iget-object v1, p0, Ll/֡ܰ᩷;->᩷:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֡ܰ᩷;->ܳ:Ljava/lang/String;

    .line 865
    invoke-static {v0}, Ll/᩷ۘܽ;->֫(Ljava/lang/CharSequence;)Ll/᩷ۘܽ;

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 880
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
