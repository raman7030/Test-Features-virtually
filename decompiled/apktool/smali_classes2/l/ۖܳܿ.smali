.class public final Ll/ۖܳܿ;
.super Ll/ܶ۬ܿ;
.source "4AWI"


# instance fields
.field public final synthetic ᩻:Ll/ۘܳܿ;


# direct methods
.method public constructor <init>(Ll/ۘܳܿ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 810
    iput-object p1, p0, Ll/ۖܳܿ;->᩻:Ll/ۘܳܿ;

    invoke-direct {p0, p2}, Ll/ܶ۬ܿ;-><init>(Ll/ۗܺ᩷;)V

    return-void
.end method


# virtual methods
.method public final ܽ()Z
    .locals 5

    const v0, 0x7f120b48

    const/4 v1, 0x0

    .line 815
    :try_start_0
    invoke-virtual {p0, v1}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v3, 0x1

    .line 822
    :try_start_1
    invoke-virtual {p0, v3}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 828
    sget v1, Ll/۠ܳܿ;->֫:I

    if-ge v2, v3, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-ge v0, v2, :cond_1

    move v0, v2

    .line 259
    :cond_1
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v4, "text_function_min_line"

    .line 260
    invoke-interface {v1, v2, v4}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "text_function_max_line"

    .line 261
    invoke-interface {v1, v0, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    .line 262
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 263
    invoke-static {}, Ll/۠ܳܿ;->ᩳ()V

    .line 829
    iget-object v0, p0, Ll/ۖܳܿ;->᩻:Ll/ۘܳܿ;

    invoke-static {v0}, Ll/ۘܳܿ;->֫(Ll/ۘܳܿ;)V

    return v3

    .line 824
    :catch_0
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 825
    invoke-virtual {p0, v3}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    .line 834
    :goto_0
    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/EditText;->setSelection(II)V

    .line 835
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return v1

    .line 817
    :catch_1
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 818
    invoke-virtual {p0, v1}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    goto :goto_0
.end method
