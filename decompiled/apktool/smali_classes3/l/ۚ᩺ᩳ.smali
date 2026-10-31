.class public final Ll/ۚ᩺ᩳ;
.super Ll/֫۫ܿ;
.source "G4ML"


# instance fields
.field public final synthetic ۗ:Ll/ܶ᩺ᩳ;

.field public final synthetic ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶ᩺ᩳ;Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 2

    .line 538
    iput-object p1, p0, Ll/ۚ᩺ᩳ;->ۗ:Ll/ܶ᩺ᩳ;

    iput-object p3, p0, Ll/ۚ᩺ᩳ;->۬:Ljava/lang/String;

    const-string v0, "srepr"

    invoke-direct {p0, p2, v0}, Ll/֫۫ܿ;-><init>(Ll/ۗܺ᩷;Ljava/lang/String;)V

    const p2, 0x7f120373

    .line 540
    invoke-virtual {p0, p2}, Ll/֫۫ܿ;->֫(I)V

    .line 542
    new-instance p2, Ll/ܳܺ;

    invoke-static {p1}, Ll/ܶ᩺ᩳ;->ܳ(Ll/ܶ᩺ᩳ;)Ll/ۗܺ᩷;

    move-result-object p1

    const/4 v0, 0x0

    const v1, 0x7f130025

    invoke-direct {p2, p1, v0, v1}, Ll/ܳܺ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p1, 0x7f120374

    .line 543
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(I)V

    .line 544
    invoke-virtual {p0, p2}, Ll/֫۫ܿ;->֫(Landroid/view/View;)V

    .line 546
    invoke-virtual {p0}, Ll/֫۫ܿ;->ۧ()Ll/ۚۖۡ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object p1

    .line 547
    invoke-virtual {p1, p3}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    const-string p2, "INTERNAL:RegexReplacement"

    const/4 p3, 0x1

    .line 2070
    invoke-virtual {p1, p2, p3}, Ll/۫ۨᩳ;->֫(Ljava/lang/String;Z)V

    const p2, 0x20001

    .line 549
    invoke-virtual {p1, p2}, Ll/ۤۤᩳ;->᩹(I)V

    const-string p2, "$0\\n"

    .line 550
    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->ܽ(Ljava/lang/String;)V

    .line 552
    invoke-virtual {p0}, Ll/֫۫ܿ;->᩻()V

    return-void
.end method


# virtual methods
.method public final ܿ()V
    .locals 3

    .line 557
    iget-object v0, p0, Ll/ۚ᩺ᩳ;->ۗ:Ll/ܶ᩺ᩳ;

    invoke-virtual {p0}, Ll/֫۫ܿ;->ܽ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 559
    :try_start_0
    invoke-static {v2, v1}, Ll/ܰۘܽ;->֫(Ll/ۨۘܽ;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 564
    iget-object v2, p0, Ll/ۚ᩺ᩳ;->۬:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 565
    invoke-static {v0}, Ll/ܶ᩺ᩳ;->ܺ(Ll/ܶ᩺ᩳ;)V

    .line 566
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v2, "srep"

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 567
    invoke-virtual {p0}, Ll/֫۫ܿ;->ܳ()V

    .line 569
    :cond_0
    invoke-virtual {p0}, Ll/֫۫ܿ;->֫()V

    return-void

    :catch_0
    move-exception v1

    .line 561
    invoke-static {v0, v1}, Ll/ܶ᩺ᩳ;->֫(Ll/ܶ᩺ᩳ;Ljava/util/regex/PatternSyntaxException;)V

    return-void
.end method
