.class public final Ll/ۘۙۜ;
.super Ljava/lang/Object;
.source "M74S"


# direct methods
.method public static ֫(Ll/ۗܺ᩷;Ll/᩶ۛᩳ;)V
    .locals 6

    .line 43
    new-instance v0, Ll/ᩴۙۜ;

    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-direct {v0, v1}, Ll/ᩴۙۜ;-><init>(Ll/۫ۤۡ;)V

    .line 44
    new-instance v1, Ll/ܺۙۜ;

    invoke-direct {v1, p0, v0, p0, p1}, Ll/ܺۙۜ;-><init>(Ll/ۗܺ᩷;Ll/ᩴۙۜ;Ll/ۗܺ᩷;Ljava/lang/Runnable;)V

    const p1, 0x7f1209f9

    .line 77
    invoke-virtual {v1, p1}, Ll/֫۫ܿ;->֫(I)V

    .line 78
    invoke-virtual {v1}, Ll/֫۫ܿ;->ۧ()Ll/ۚۖۡ;

    move-result-object p1

    const v2, 0x7f0d00fc

    .line 79
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0a0276

    .line 80
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 81
    new-instance v4, Ll/᩻ۙۜ;

    invoke-direct {v4, v0, p1, v3, p0}, Ll/᩻ۙۜ;-><init>(Ll/ᩴۙۜ;Ll/ۚۖۡ;Landroid/widget/TextView;Ll/ۗܺ᩷;)V

    const v3, 0x7f0a0275

    .line 86
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    new-instance v5, Ll/ۜۙۜ;

    invoke-direct {v5, p1, p0, v0, v4}, Ll/ۜۙۜ;-><init>(Ll/ۚۖۡ;Ll/ۗܺ᩷;Ll/ᩴۙۜ;Ll/᩻ۙۜ;)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    invoke-virtual {p1}, Ll/ۚۖۡ;->ۢ()V

    .line 101
    invoke-virtual {p1}, Ll/ۚۖۡ;->᩻()V

    .line 103
    new-instance v3, Ll/᩷ۙۜ;

    invoke-direct {v3, v0, v4}, Ll/᩷ۙۜ;-><init>(Ll/ᩴۙۜ;Ll/᩻ۙۜ;)V

    invoke-virtual {p1, v3}, Ll/ۚۖۡ;->֫(Ll/᩷ۙۜ;)V

    .line 107
    new-instance v0, Ll/ۖۙۜ;

    invoke-direct {v0, v4}, Ll/ۖۙۜ;-><init>(Ll/᩻ۙۜ;)V

    invoke-virtual {p1, v0}, Ll/ۚۖۡ;->֫(Landroid/text/TextWatcher;)V

    const/16 v0, 0x11

    .line 113
    invoke-virtual {p1, v0}, Ll/ۚۖۡ;->֫(I)V

    .line 114
    invoke-virtual {p1}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object p1

    const/4 v0, 0x6

    .line 115
    invoke-virtual {p1, v0}, Ll/ۤۤᩳ;->᩸(I)V

    const v0, 0x7f1209fe

    .line 116
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/۫ۨᩳ;->ܽ(Ljava/lang/String;)V

    .line 117
    new-instance p0, Ll/ۢۙۜ;

    invoke-direct {p0, v1}, Ll/ۢۙۜ;-><init>(Ll/֫۫ܿ;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    const/4 p0, 0x2

    .line 126
    invoke-virtual {p1, p0}, Ll/۫ۨᩳ;->᩵(I)V

    .line 127
    invoke-virtual {v1, v2}, Ll/֫۫ܿ;->֫(Landroid/view/View;)V

    .line 128
    invoke-virtual {v1}, Ll/֫۫ܿ;->᩻()V

    return-void
.end method
