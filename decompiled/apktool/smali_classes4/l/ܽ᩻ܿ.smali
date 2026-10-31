.class public final synthetic Ll/ܽ᩻ܿ;
.super Ljava/lang/Object;
.source "89CO"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ᩳ᩻ܿ;

.field public final synthetic ᩹:Ll/ۘ᩻ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳ᩻ܿ;Ll/ۘ᩻ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩻ܿ;->᩸:Ll/ᩳ᩻ܿ;

    iput-object p2, p0, Ll/ܽ᩻ܿ;->᩹:Ll/ۘ᩻ܿ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    .line 349
    iget-object p1, p0, Ll/ܽ᩻ܿ;->᩹:Ll/ۘ᩻ܿ;

    invoke-virtual {p1}, Ll/ۘ᩻ܿ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۬ܿ᩷;->ܽ(Ljava/lang/String;)Ll/ܽܳ᩷;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 352
    invoke-virtual {v0}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x7f120758

    .line 354
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 356
    :goto_0
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 357
    invoke-virtual {p1}, Ll/ۘ᩻ܿ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 358
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    .line 359
    invoke-virtual {p1}, Ll/ۘ᩻ܿ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 360
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p1

    .line 361
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    sget v4, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v4, 0x12

    invoke-virtual {v1, v3, v2, p1, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 362
    new-instance v3, Landroid/text/style/RelativeSizeSpan;

    const v5, 0x3f4ccccd    # 0.8f

    invoke-direct {v3, v5}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v1, v3, v2, p1, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 363
    iget-object p1, p0, Ll/ܽ᩻ܿ;->᩸:Ll/ᩳ᩻ܿ;

    iget-object p1, p1, Ll/ᩳ᩻ܿ;->᩶:Ll/ۢ᩻ܿ;

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 364
    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 365
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 366
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 367
    invoke-static {p1}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    const/4 p1, 0x1

    return p1
.end method
