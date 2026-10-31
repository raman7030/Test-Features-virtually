.class public final Ll/ᩴ᩺ᩳ;
.super Ljava/lang/Object;
.source "G4ML"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/ܶ᩺ᩳ;


# direct methods
.method public constructor <init>(Ll/ܶ᩺ᩳ;)V
    .locals 0

    .line 378
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩺ᩳ;->᩸:Ll/ܶ᩺ᩳ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 391
    iget-object p1, p0, Ll/ᩴ᩺ᩳ;->᩸:Ll/ܶ᩺ᩳ;

    invoke-static {p1}, Ll/ܶ᩺ᩳ;->ܺ(Ll/ܶ᩺ᩳ;)V

    .line 392
    invoke-virtual {p1}, Ll/ܶ᩺ᩳ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 393
    invoke-static {p1}, Ll/ܶ᩺ᩳ;->᩷(Ll/ܶ᩺ᩳ;)Ll/֨ۧܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ۧܿ;->ۜ()V

    .line 394
    invoke-static {p1}, Ll/ܶ᩺ᩳ;->ۢ(Ll/ܶ᩺ᩳ;)Ll/֨ۚۢ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 395
    invoke-static {p1}, Ll/ܶ᩺ᩳ;->ۢ(Ll/ܶ᩺ᩳ;)Ll/֨ۚۢ;

    move-result-object p1

    const-wide/16 v2, 0x64

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
