.class public final Ll/֨᩹ܽ;
.super Ll/۟ܶۡ;
.source "P676"


# instance fields
.field public ܳ:Ll/ᩳ᩵ۡ;

.field public final synthetic ᩻:Ll/᩷᩶ܽ;


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;)V
    .locals 0

    .line 935
    iput-object p1, p0, Ll/֨᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 958
    iget-object v0, p0, Ll/֨᩹ܽ;->ܳ:Ll/ᩳ᩵ۡ;

    .line 33
    iget-object v0, v0, Ll/ᩳ᩵ۡ;->᩶:Ll/᩻ᩴۡ;

    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v0

    .line 958
    iget-object v1, p0, Ll/֨᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    if-eqz v0, :cond_0

    .line 959
    invoke-static {v1}, Ll/᩷᩶ܽ;->ᩳ(Ll/᩷᩶ܽ;)Ll/ۚ᩹᩷;

    move-result-object v0

    iget-object v2, p0, Ll/֨᩹ܽ;->ܳ:Ll/ᩳ᩵ۡ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->۬:Ljava/lang/String;

    const-string v4, ".java"

    .line 0
    invoke-static {v3, v1, v4}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 959
    sget v3, Ll/ܶۖᩳ;->ᩴۧ:I

    const-string v3, "textViewer_dec"

    .line 353
    const-class v4, Ll/᩷᩶ܽ;

    invoke-static {v4, v2, v3}, Ll/ۗۖ᩷;->֫(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V

    .line 354
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v3

    const-class v4, Ll/ܶۖᩳ;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "method"

    const/4 v4, 0x2

    .line 355
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v3, "title"

    .line 356
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "saveStateOnResult"

    const/4 v3, 0x1

    .line 357
    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 358
    invoke-virtual {v0, v2}, Ll/ۚ᩹᩷;->֫(Landroid/content/Intent;)V

    return-void

    .line 961
    :cond_0
    iget-object v0, p0, Ll/֨᩹ܽ;->ܳ:Ll/ᩳ᩵ۡ;

    .line 41
    iget-object v0, v0, Ll/ᩳ᩵ۡ;->᩶:Ll/᩻ᩴۡ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x7f120230

    .line 185
    invoke-static {v0, v2}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 516
    invoke-virtual {v1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 967
    iget-object v0, p0, Ll/֨᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 941
    iget-object v0, p0, Ll/֨᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 946
    new-instance v0, Ll/ۗ᩶֡;

    invoke-direct {v0}, Ll/ۗ᩶֡;-><init>()V

    .line 947
    iget-object v1, p0, Ll/֨᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ۙ:Ll/ۧ᩸֡;

    invoke-virtual {v1, v0}, Ll/ۧ᩸֡;->֫(Ll/ۗ᩶֡;)V

    .line 949
    invoke-virtual {v0}, Ll/ۗ᩶֡;->ܳ()V

    .line 950
    invoke-virtual {v0}, Ll/ۗ᩶֡;->ܽ()I

    move-result v1

    new-array v1, v1, [B

    .line 951
    new-instance v2, Ll/֫ۗ֡;

    invoke-direct {v2, v1}, Ll/֫ۗ֡;-><init>([B)V

    .line 952
    invoke-virtual {v0, v2}, Ll/ۗ᩶֡;->֫(Ll/֫ۗ֡;)V

    .line 953
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "dex_decompile_engine"

    const/4 v3, 0x0

    invoke-interface {v0, v3, v2}, Ll/۫ۤۡ;->֫(BLjava/lang/String;)B

    move-result v0

    const-string v2, ""

    invoke-static {v2, v1, v0}, Ll/ۖ۠ۡ;->֫(Ljava/lang/String;[BI)Ll/ᩳ᩵ۡ;

    move-result-object v0

    iput-object v0, p0, Ll/֨᩹ܽ;->ܳ:Ll/ᩳ᩵ۡ;

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 972
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
