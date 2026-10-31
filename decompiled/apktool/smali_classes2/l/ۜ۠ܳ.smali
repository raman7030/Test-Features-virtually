.class public final synthetic Ll/ۜ۠ܳ;
.super Ljava/lang/Object;
.source "052E"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۚ۠ܳ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۜ۠ܳ;->᩸:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 227
    new-instance v0, Ll/᩵۠ܳ;

    const v1, 0x7f120634

    iget-object v2, p0, Ll/ۜ۠ܳ;->᩸:Ll/ۗܺ᩷;

    invoke-direct {v0, v2, v1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    .line 231
    new-instance v1, Ll/ۘ۠ܳ;

    invoke-direct {v1, v0}, Ll/ۘ۠ܳ;-><init>(Ll/᩵۠ܳ;)V

    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->֫(Landroid/text/TextWatcher;)V

    const v1, 0x7f12022b

    .line 255
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۡ(I)V

    .line 42
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "rdtp"

    const-string v4, "yyyy-MM-dd_HH-mm-ss"

    invoke-interface {v1, v3, v4}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v1

    .line 256
    :goto_0
    invoke-virtual {v0, v4}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const v1, 0x7f12022c

    .line 257
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۜ(I)V

    .line 258
    invoke-virtual {v0}, Ll/۬ۗܿ;->ۜ()Landroid/widget/TextView;

    move-result-object v1

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-static {v3}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v3, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 259
    invoke-virtual {v0}, Ll/۬ۗܿ;->᩵()V

    const/4 v1, 0x1

    .line 205
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۧ(Z)V

    .line 261
    invoke-virtual {v0}, Ll/۬ۗܿ;->ᩳ()Ll/֡ۚۢ;

    move-result-object v1

    .line 262
    invoke-static {v1}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    .line 263
    new-instance v3, Ll/ᩴ۠ܳ;

    invoke-direct {v3, v0, v1}, Ll/ᩴ۠ܳ;-><init>(Ll/᩵۠ܳ;Ll/֡ۚۢ;)V

    const-wide/16 v4, 0x3e8

    .line 274
    invoke-static {v4, v5, v3}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    .line 275
    invoke-virtual {v1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۡۗܳ;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ll/ۡۗܳ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
