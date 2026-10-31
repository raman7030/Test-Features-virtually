.class public final Ll/ۡܶ᩷;
.super Ll/֡ܽ;
.source "09LR"


# instance fields
.field public final synthetic ᩳ:Ll/ܺܶ᩷;


# direct methods
.method public constructor <init>(Ll/ܺܶ᩷;)V
    .locals 0

    .line 543
    iput-object p1, p0, Ll/ۡܶ᩷;->ᩳ:Ll/ܺܶ᩷;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/֡ܽ;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 3

    .line 546
    iget-object v0, p0, Ll/ۡܶ᩷;->ᩳ:Ll/ܺܶ᩷;

    invoke-static {v0}, Ll/ܺܶ᩷;->ۧ(Ll/ܺܶ᩷;)Ll/ܰ۟ۜ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۟ۜ;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 547
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    invoke-static {v0}, Ll/ܺܶ᩷;->ᩳ(Ll/ܺܶ᩷;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    const v0, 0x7f1208cd

    .line 548
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v0, Ll/᩷ܶ᩷;

    invoke-direct {v0, p0}, Ll/᩷ܶ᩷;-><init>(Ll/ۡܶ᩷;)V

    const v2, 0x7f1208c6

    .line 549
    invoke-virtual {v1, v2, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/ۢܶ᩷;

    invoke-direct {v0, p0}, Ll/ۢܶ᩷;-><init>(Ll/ۡܶ᩷;)V

    const v2, 0x7f1202c2

    .line 550
    invoke-virtual {v1, v2, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 551
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 553
    :cond_0
    invoke-virtual {v0}, Ll/ܺܶ᩷;->finish()V

    return-void
.end method
