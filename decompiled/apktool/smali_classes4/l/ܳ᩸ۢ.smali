.class public final synthetic Ll/ܳ᩸ۢ;
.super Ljava/lang/Object;
.source "Y9AZ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/ܶ᩵ܿ;

.field public final synthetic ۙ:Ll/ۗܺ᩷;

.field public final synthetic ᩶:Ljava/lang/Runnable;

.field public final synthetic ᩸:Ll/ۢ᩸ۢ;

.field public final synthetic ᩹:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ۢ᩸ۢ;Ll/֡ۚۢ;Ljava/lang/Runnable;Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ᩸ۢ;->᩸:Ll/ۢ᩸ۢ;

    iput-object p2, p0, Ll/ܳ᩸ۢ;->᩹:Ll/֡ۚۢ;

    iput-object p3, p0, Ll/ܳ᩸ۢ;->᩶:Ljava/lang/Runnable;

    iput-object p4, p0, Ll/ܳ᩸ۢ;->ۙ:Ll/ۗܺ᩷;

    iput-object p5, p0, Ll/ܳ᩸ۢ;->ۗ:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 361
    iget-object p1, p0, Ll/ܳ᩸ۢ;->᩸:Ll/ۢ᩸ۢ;

    invoke-virtual {p1}, Ll/ۢ᩸ۢ;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 330
    iget-boolean v0, p1, Ll/ۢ᩸ۢ;->ۧ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 333
    iput-boolean v0, p1, Ll/ۢ᩸ۢ;->ۧ:Z

    .line 365
    iget-object p1, p0, Ll/ܳ᩸ۢ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 366
    invoke-static {}, Ll/᩺᩹ۢ;->֫()V

    .line 367
    invoke-static {}, Ll/֫᩸ۢ;->ܽ()V

    .line 368
    iget-object p1, p0, Ll/ܳ᩸ۢ;->᩶:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_1
    const-string p1, "bin.mt.termex"

    .line 371
    iget-object v0, p0, Ll/ܳ᩸ۢ;->ۙ:Ll/ۗܺ᩷;

    iget-object v1, p0, Ll/ܳ᩸ۢ;->ۗ:Ll/ܶ᩵ܿ;

    invoke-static {v0, v1, p1}, Ll/᩷֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    return-void
.end method
