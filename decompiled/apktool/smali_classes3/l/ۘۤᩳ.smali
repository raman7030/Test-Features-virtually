.class public final Ll/ۘۤᩳ;
.super Ljava/lang/Object;
.source "V8VP"

# interfaces
.implements Ll/᩹᩺ᩳ;


# instance fields
.field public ֡:Ll/֨ۧܿ;

.field public final ֨:Landroid/view/View;

.field public final ֫:Ll/֫ۢᩳ;

.field public final ۖ:Ll/۬ۡۡ;

.field public final ۘ:Landroid/view/View;

.field public ۚ:Ll/֨ۧܿ;

.field public final ۜ:Ll/ۚۖۡ;

.field public ۠:Ll/֨ۚۢ;

.field public final ۡ:Ll/۬ۡۡ;

.field public final ۢ:Ll/۬ۡۡ;

.field public final ۧ:Ll/ۖۤᩳ;

.field public final ܳ:Ll/᩸᩺ᩳ;

.field public final ܶ:Landroid/widget/TextView;

.field public final ܺ:Ljava/lang/String;

.field public final ܽ:Ll/۟۫ᩳ;

.field public final ܿ:Ll/۫ۨᩳ;

.field public final ᩳ:Ll/۫ۨᩳ;

.field public final ᩴ:Landroid/view/View;

.field public final ᩵:Landroid/view/View;

.field public ᩶:Landroid/view/MenuItem;

.field public final ᩷:Ll/ۚۖۡ;

.field public final ᩸:Landroid/widget/TextView;

.field public final ᩹:Ll/۬ۡۡ;

.field public final ᩻:Ll/᩸᩺ᩳ;


# direct methods
.method public constructor <init>(Ll/֫ۢᩳ;Ll/۟۫ᩳ;Ll/ۖۤᩳ;)V
    .locals 7

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Ll/֨ۚۢ;

    new-instance v1, Ll/ۗ᩵֫;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ll/ۗ᩵֫;-><init>(I)V

    invoke-direct {v0, p0, v1}, Ll/֨ۚۢ;-><init>(Ljava/lang/Object;Ll/ۚۚۢ;)V

    iput-object v0, p0, Ll/ۘۤᩳ;->۠:Ll/֨ۚۢ;

    .line 80
    iput-object p1, p0, Ll/ۘۤᩳ;->֫:Ll/֫ۢᩳ;

    .line 81
    iput-object p2, p0, Ll/ۘۤᩳ;->ܽ:Ll/۟۫ᩳ;

    .line 82
    invoke-virtual {p2}, Ll/۟۫ᩳ;->᩻()Ll/۫ۨᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۤᩳ;->ᩳ:Ll/۫ۨᩳ;

    .line 83
    invoke-virtual {p2}, Ll/۟۫ᩳ;->ۜ()Ll/۫ۨᩳ;

    move-result-object p2

    iput-object p2, p0, Ll/ۘۤᩳ;->ܿ:Ll/۫ۨᩳ;

    const-string v1, "text"

    .line 84
    iput-object v1, p0, Ll/ۘۤᩳ;->ܺ:Ljava/lang/String;

    .line 85
    new-instance v1, Ll/᩸᩺ᩳ;

    invoke-direct {v1, p1, v0}, Ll/᩸᩺ᩳ;-><init>(Ll/ۗܺ᩷;Ll/۫ۨᩳ;)V

    iput-object v1, p0, Ll/ۘۤᩳ;->ܳ:Ll/᩸᩺ᩳ;

    .line 86
    new-instance v2, Ll/᩸᩺ᩳ;

    invoke-direct {v2, p1, p2}, Ll/᩸᩺ᩳ;-><init>(Ll/ۗܺ᩷;Ll/۫ۨᩳ;)V

    iput-object v2, p0, Ll/ۘۤᩳ;->᩻:Ll/᩸᩺ᩳ;

    .line 87
    iput-object p3, p0, Ll/ۘۤᩳ;->ۧ:Ll/ۖۤᩳ;

    .line 89
    invoke-virtual {v1}, Ll/᩸᩺ᩳ;->ۧ()V

    .line 90
    invoke-virtual {v2}, Ll/᩸᩺ᩳ;->ۧ()V

    .line 92
    invoke-interface {p3}, Ll/ۖۤᩳ;->֫()Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Ll/ۘۤᩳ;->֨:Landroid/view/View;

    const v1, 0x7f0a04b5

    .line 93
    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/ۘۤᩳ;->᩵:Landroid/view/View;

    const v1, 0x7f0a04ae

    .line 94
    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/ۘۤᩳ;->ᩴ:Landroid/view/View;

    const v2, 0x7f0a04ad

    .line 95
    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Ll/ۘۤᩳ;->ۘ:Landroid/view/View;

    const v3, 0x7f0a018a

    .line 96
    invoke-virtual {p3, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ۚۖۡ;

    iput-object v3, p0, Ll/ۘۤᩳ;->᩷:Ll/ۚۖۡ;

    const v4, 0x7f0a0187

    .line 97
    invoke-virtual {p3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/ۚۖۡ;

    iput-object v4, p0, Ll/ۘۤᩳ;->ۜ:Ll/ۚۖۡ;

    const v5, 0x7f0a0598

    .line 99
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/۬ۡۡ;

    iput-object v5, p0, Ll/ۘۤᩳ;->ۖ:Ll/۬ۡۡ;

    const v5, 0x7f0a058a

    .line 100
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/۬ۡۡ;

    iput-object v5, p0, Ll/ۘۤᩳ;->ۢ:Ll/۬ۡۡ;

    const v5, 0x7f0a059b

    .line 101
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/۬ۡۡ;

    iput-object v5, p0, Ll/ۘۤᩳ;->᩹:Ll/۬ۡۡ;

    const v5, 0x7f0a0595

    .line 102
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/۬ۡۡ;

    iput-object v5, p0, Ll/ۘۤᩳ;->ۡ:Ll/۬ۡۡ;

    const v5, 0x7f0a04e1

    .line 103
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, p0, Ll/ۘۤᩳ;->᩸:Landroid/widget/TextView;

    const v5, 0x7f0a04e0

    .line 104
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, p0, Ll/ۘۤᩳ;->ܶ:Landroid/widget/TextView;

    .line 105
    move-object v5, p3

    check-cast v5, Landroid/view/ViewGroup;

    const v6, 0x7f0a01db

    invoke-virtual {p3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const-string v5, "text_s"

    const/4 v6, 0x0

    .line 248
    invoke-virtual {v3, v5, v6}, Ll/ۚۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "text_r"

    invoke-virtual {v4, v3, v6}, Ll/ۚۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    new-instance v3, Ll/֨ۧܿ;

    invoke-direct {v3, p1, v0}, Ll/֨ۧܿ;-><init>(Ll/ۗܺ᩷;Ll/۫ۨᩳ;)V

    iput-object v3, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    .line 109
    new-instance v3, Ll/֨ۧܿ;

    invoke-direct {v3, p1, p2}, Ll/֨ۧܿ;-><init>(Ll/ۗܺ᩷;Ll/۫ۨᩳ;)V

    iput-object v3, p0, Ll/ۘۤᩳ;->ۚ:Ll/֨ۧܿ;

    .line 192
    new-instance p1, Ll/᩹ۧܿ;

    const v3, 0x7f0a0638

    invoke-virtual {p3, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-direct {p1, v3}, Ll/᩹ۧܿ;-><init>(Landroid/widget/TextView;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x2

    if-ge v4, v5, :cond_1

    if-nez v4, :cond_0

    .line 194
    iget-object v5, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    goto :goto_1

    :cond_0
    iget-object v5, p0, Ll/ۘۤᩳ;->ۚ:Ll/֨ۧܿ;

    .line 195
    :goto_1
    new-instance v6, Ll/ۢۤᩳ;

    invoke-direct {v6, p0, p1}, Ll/ۢۤᩳ;-><init>(Ll/ۘۤᩳ;Ll/᩹ۧܿ;)V

    invoke-virtual {v5, v6}, Ll/֨ۧܿ;->֫(Ll/ۘۧܿ;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 234
    :cond_1
    new-instance v4, Ll/ܽۤᩳ;

    invoke-direct {v4, p0}, Ll/ܽۤᩳ;-><init>(Ll/ۘۤᩳ;)V

    .line 251
    new-instance v5, Ll/ᩳۤᩳ;

    invoke-direct {v5, p0, p1}, Ll/ᩳۤᩳ;-><init>(Ll/ۘۤᩳ;Ll/᩹ۧܿ;)V

    .line 286
    iget-object p1, p0, Ll/ۘۤᩳ;->ۖ:Ll/۬ۡۡ;

    invoke-virtual {p1, v5}, Ll/۬ۡۡ;->֫(Ll/ۗۡۡ;)V

    .line 287
    iget-object p1, p0, Ll/ۘۤᩳ;->ۢ:Ll/۬ۡۡ;

    invoke-virtual {p1, v5}, Ll/۬ۡۡ;->֫(Ll/ۗۡۡ;)V

    .line 288
    iget-object p1, p0, Ll/ۘۤᩳ;->᩹:Ll/۬ۡۡ;

    invoke-virtual {p1, v5}, Ll/۬ۡۡ;->֫(Ll/ۗۡۡ;)V

    .line 289
    iget-object p1, p0, Ll/ۘۤᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {p1, v5}, Ll/۬ۡۡ;->֫(Ll/ۗۡۡ;)V

    const p1, 0x7f0a01f4

    const v5, 0x7f0a0102

    const v6, 0x7f0a01f5

    .line 291
    filled-new-array {v6, p1, v2, v1, v5}, [I

    move-result-object p1

    :goto_2
    const/4 v1, 0x5

    if-ge v3, v1, :cond_2

    .line 292
    aget v1, p1, v3

    .line 293
    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 294
    invoke-static {v1}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 295
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 297
    :cond_2
    iget-object p1, p0, Ll/ۘۤᩳ;->᩷:Ll/ۚۖۡ;

    new-instance p3, Ll/ۡۤᩳ;

    invoke-direct {p3, p0}, Ll/ۡۤᩳ;-><init>(Ll/ۘۤᩳ;)V

    invoke-virtual {p1, p3}, Ll/ۚۖۡ;->֫(Landroid/text/TextWatcher;)V

    .line 318
    new-instance p1, Ll/ܿۤᩳ;

    const/4 p3, 0x0

    invoke-direct {p1, p3, p0}, Ll/ܿۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֫(Ljava/lang/Runnable;)V

    .line 319
    new-instance p1, Ll/ܿۤᩳ;

    invoke-direct {p1, p3, p0}, Ll/ܿۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, p1}, Ll/۫ۨᩳ;->֫(Ljava/lang/Runnable;)V

    .line 320
    new-instance p1, Ll/ܳۤᩳ;

    invoke-direct {p1, p0}, Ll/ܳۤᩳ;-><init>(Ll/ۘۤᩳ;)V

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֫(Ll/۠۟ᩳ;)V

    .line 321
    new-instance p1, Ll/᩻ۤᩳ;

    invoke-direct {p1, p0}, Ll/᩻ۤᩳ;-><init>(Ll/ۘۤᩳ;)V

    invoke-virtual {p2, p1}, Ll/۫ۨᩳ;->֫(Ll/۠۟ᩳ;)V

    .line 111
    iget-object p1, p0, Ll/ۘۤᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p1, p0}, Ll/۫ۨᩳ;->֫(Ll/᩹᩺ᩳ;)V

    .line 112
    iget-object p1, p0, Ll/ۘۤᩳ;->ܿ:Ll/۫ۨᩳ;

    invoke-virtual {p1, p0}, Ll/۫ۨᩳ;->֫(Ll/᩹᩺ᩳ;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۘۤᩳ;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    new-instance v0, Landroid/content/Intent;

    iget-object p0, p0, Ll/ۘۤᩳ;->֫:Ll/֫ۢᩳ;

    const-class v1, Ll/᩺᩸᩷;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 645
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۘۤᩳ;Landroid/view/View;)V
    .locals 4

    .line 235
    iget-object v0, p0, Ll/ۘۤᩳ;->ۜ:Ll/ۚۖۡ;

    iget-object v1, p0, Ll/ۘۤᩳ;->᩷:Ll/ۚۖۡ;

    iget-object v2, p0, Ll/ۘۤᩳ;->ܽ:Ll/۟۫ᩳ;

    invoke-virtual {v2}, Ll/۟۫ᩳ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ll/ۘۤᩳ;->ۚ:Ll/֨ۧܿ;

    .line 236
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v3, 0x7f0a01f5

    if-ne p1, v3, :cond_1

    .line 238
    invoke-virtual {v1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ll/֨ۧܿ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_1
    const v3, 0x7f0a01f4

    if-ne p1, v3, :cond_2

    .line 240
    invoke-virtual {v1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ll/֨ۧܿ;->֫(Ljava/lang/String;)V

    return-void

    :cond_2
    const v3, 0x7f0a04ad

    if-ne p1, v3, :cond_3

    const/4 p1, 0x0

    .line 242
    invoke-virtual {p0, p1}, Ll/ۘۤᩳ;->֫(Z)Z

    move-result p0

    if-nez p0, :cond_5

    .line 243
    invoke-virtual {v1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Ll/֨ۧܿ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const v3, 0x7f0a04ae

    if-ne p1, v3, :cond_4

    .line 246
    invoke-virtual {v1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Ll/֨ۧܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    const v0, 0x7f0a0102

    if-ne p1, v0, :cond_5

    .line 248
    invoke-virtual {p0}, Ll/ۘۤᩳ;->ܽ()V

    :cond_5
    return-void
.end method

.method public static ֫(Ll/ۘۤᩳ;Ljava/util/regex/PatternSyntaxException;)V
    .locals 1

    .line 184
    iget-object p0, p0, Ll/ۘۤᩳ;->֫:Ll/֫ۢᩳ;

    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    const v0, 0x7f120307

    .line 185
    invoke-virtual {p0, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 186
    invoke-static {p1}, Ll/ۨۘܽ;->֫(Ljava/util/regex/PatternSyntaxException;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const p1, 0x7f120189

    const/4 v0, 0x0

    .line 187
    invoke-virtual {p0, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 188
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/ۘۤᩳ;Ll/᩹ۧܿ;Ll/۬ۡۡ;ZZ)V
    .locals 5

    .line 252
    iget-object v0, p0, Ll/ۘۤᩳ;->ܺ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۘۤᩳ;->ۚ:Ll/֨ۧܿ;

    iget-object v2, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    const v3, 0x7f0a0598

    const-string v4, "_bit"

    if-ne p2, v3, :cond_2

    .line 254
    invoke-virtual {v2, p3}, Ll/֨ۧܿ;->ᩳ(Z)V

    .line 255
    invoke-virtual {v1, p3}, Ll/֨ۧܿ;->ᩳ(Z)V

    if-eqz p4, :cond_1

    if-eqz p3, :cond_0

    const p2, 0x7f120802

    goto :goto_0

    :cond_0
    const p2, 0x7f120801

    .line 257
    :goto_0
    invoke-virtual {p1, p2}, Ll/᩹ۧܿ;->֫(I)V

    .line 259
    :cond_1
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    .line 0
    invoke-static {v0, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 259
    invoke-virtual {v2}, Ll/֨ۧܿ;->֫()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 260
    invoke-virtual {p0}, Ll/ۘۤᩳ;->ۢ()V

    return-void

    :cond_2
    const v3, 0x7f0a059b

    if-ne p2, v3, :cond_5

    .line 262
    invoke-virtual {v2, p3}, Ll/֨ۧܿ;->ܿ(Z)V

    .line 263
    invoke-virtual {v1, p3}, Ll/֨ۧܿ;->ܿ(Z)V

    if-eqz p4, :cond_4

    if-eqz p3, :cond_3

    const p2, 0x7f120b84

    goto :goto_1

    :cond_3
    const p2, 0x7f120b83

    .line 265
    :goto_1
    invoke-virtual {p1, p2}, Ll/᩹ۧܿ;->֫(I)V

    .line 267
    :cond_4
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    .line 0
    invoke-static {v0, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 267
    invoke-virtual {v2}, Ll/֨ۧܿ;->֫()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 268
    invoke-virtual {p0}, Ll/ۘۤᩳ;->ۢ()V

    return-void

    :cond_5
    const v3, 0x7f0a058a

    if-ne p2, v3, :cond_8

    .line 270
    invoke-virtual {v2, p3}, Ll/֨ۧܿ;->֫(Z)V

    .line 271
    invoke-virtual {v1, p3}, Ll/֨ۧܿ;->֫(Z)V

    if-eqz p4, :cond_7

    if-eqz p3, :cond_6

    const p2, 0x7f120550

    goto :goto_2

    :cond_6
    const p2, 0x7f12054f

    .line 273
    :goto_2
    invoke-virtual {p1, p2}, Ll/᩹ۧܿ;->֫(I)V

    .line 275
    :cond_7
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    .line 0
    invoke-static {v0, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 275
    invoke-virtual {v2}, Ll/֨ۧܿ;->֫()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 276
    invoke-virtual {p0}, Ll/ۘۤᩳ;->ۢ()V

    return-void

    :cond_8
    const p0, 0x7f0a0595

    if-ne p2, p0, :cond_b

    .line 278
    invoke-virtual {v2, p3}, Ll/֨ۧܿ;->ۧ(Z)V

    .line 279
    invoke-virtual {v1, p3}, Ll/֨ۧܿ;->ۧ(Z)V

    if-eqz p4, :cond_a

    if-eqz p3, :cond_9

    const p0, 0x7f1206f0

    goto :goto_3

    :cond_9
    const p0, 0x7f1200ff

    .line 281
    :goto_3
    invoke-virtual {p1, p0}, Ll/᩹ۧܿ;->֫(I)V

    .line 283
    :cond_a
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    .line 0
    invoke-static {v0, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 283
    invoke-virtual {v2}, Ll/֨ۧܿ;->֫()B

    move-result p2

    invoke-interface {p0, p2, p1}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    :cond_b
    return-void
.end method

.method public static synthetic ֫(Ll/ۘۤᩳ;ZZLjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 395
    iget-object v0, p0, Ll/ۘۤᩳ;->ᩳ:Ll/۫ۨᩳ;

    iget-object v1, p0, Ll/ۘۤᩳ;->ᩴ:Landroid/view/View;

    iget-object v2, p0, Ll/ۘۤᩳ;->᩷:Ll/ۚۖۡ;

    invoke-direct {p0}, Ll/ۘۤᩳ;->ۘ()V

    .line 396
    iget-object v3, p0, Ll/ۘۤᩳ;->֨:Landroid/view/View;

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz p1, :cond_0

    const/4 v6, 0x0

    goto :goto_0

    :cond_0
    const/16 v6, 0x8

    :goto_0
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 397
    iget-object v3, p0, Ll/ۘۤᩳ;->᩵:Landroid/view/View;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    const/4 v4, 0x0

    :cond_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 398
    invoke-direct {p0}, Ll/ۘۤᩳ;->ۖ()V

    .line 399
    iget-object v3, p0, Ll/ۘۤᩳ;->ۧ:Ll/ۖۤᩳ;

    invoke-interface {v3}, Ll/ۖۤᩳ;->ۧ()V

    if-eqz p1, :cond_2

    .line 401
    invoke-virtual {v2, p3}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    :cond_2
    if-eqz p2, :cond_3

    .line 404
    iget-object p3, p0, Ll/ۘۤᩳ;->ۜ:Ll/ۚۖۡ;

    invoke-virtual {p3, p4}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 405
    iget-object p3, p0, Ll/ۘۤᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {p3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    if-eqz p1, :cond_6

    const p1, 0x3e851eb8    # 0.26f

    .line 409
    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    .line 410
    invoke-virtual {v1, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 411
    iget-object p3, p0, Ll/ۘۤᩳ;->ۘ:Landroid/view/View;

    .line 412
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result p4

    const/4 v3, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz p4, :cond_4

    .line 413
    invoke-virtual {p3, p1}, Landroid/view/View;->setAlpha(F)V

    .line 414
    invoke-virtual {p3, v5}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 416
    :cond_4
    invoke-virtual {p3, v4}, Landroid/view/View;->setAlpha(F)V

    .line 417
    invoke-virtual {p3, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 420
    :goto_1
    invoke-virtual {v2}, Ll/ۚۖۡ;->ᩳ()I

    move-result p1

    if-eqz p1, :cond_5

    .line 421
    invoke-virtual {p0}, Ll/ۘۤᩳ;->ۢ()V

    :cond_5
    if-eqz p2, :cond_6

    .line 423
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result p0

    if-nez p0, :cond_6

    .line 425
    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 426
    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    :cond_6
    return-void
.end method

.method private ۖ()V
    .locals 3

    .line 557
    iget-object v0, p0, Ll/ۘۤᩳ;->֨:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    iget-object v2, p0, Ll/ۘۤᩳ;->֫:Ll/֫ۢᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 558
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v1, Ll/᩹֡᩷;->ۖ:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void

    .line 560
    :cond_0
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-object v1, p0, Ll/ۘۤᩳ;->ܽ:Ll/۟۫ᩳ;

    invoke-virtual {v1}, Ll/۟۫ᩳ;->᩻()Ll/۫ۨᩳ;

    move-result-object v1

    .line 1084
    iget-object v1, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget v1, v1, Ll/᩺֫ܿ;->ܽ֫:I

    .line 560
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void
.end method

.method private ۘ()V
    .locals 4

    .line 325
    iget-object v0, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->ܳ()Z

    move-result v1

    .line 112
    iget-object v2, p0, Ll/ۘۤᩳ;->ۖ:Ll/۬ۡۡ;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Ll/۬ۡۡ;->֫(ZZ)V

    .line 326
    iget-object v1, p0, Ll/ۘۤᩳ;->ۢ:Ll/۬ۡۡ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->ܽ()Z

    move-result v2

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/۬ۡۡ;->֫(ZZ)V

    .line 327
    iget-object v1, p0, Ll/ۘۤᩳ;->᩹:Ll/۬ۡۡ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->᩻()Z

    move-result v2

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/۬ۡۡ;->֫(ZZ)V

    .line 328
    iget-object v1, p0, Ll/ۘۤᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->ᩳ()Z

    move-result v0

    .line 112
    invoke-virtual {v1, v0, v3}, Ll/۬ۡۡ;->֫(ZZ)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ۘۤᩳ;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ll/ۘۤᩳ;->ܺ()V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۘۤᩳ;)Ll/֨ۧܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۤᩳ;->ۚ:Ll/֨ۧܿ;

    return-object p0
.end method

.method private ܺ()V
    .locals 3

    .line 550
    invoke-virtual {p0}, Ll/ۘۤᩳ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 551
    iget-object v0, p0, Ll/ۘۤᩳ;->᩷:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    invoke-virtual {v2, v1}, Ll/֨ۧܿ;->ܽ(Ljava/lang/String;)V

    .line 552
    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۘۤᩳ;->ۚ:Ll/֨ۧܿ;

    invoke-virtual {v1, v0}, Ll/֨ۧܿ;->ܽ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic ܽ(Ll/ۘۤᩳ;)V
    .locals 3

    .line 167
    iget-object v0, p0, Ll/ۘۤᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ll/۫ۨᩳ;->scrollTo(II)V

    .line 168
    iget-object p0, p0, Ll/ۘۤᩳ;->ܿ:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v1

    invoke-virtual {p0, v2, v1}, Ll/۫ۨᩳ;->scrollTo(II)V

    .line 169
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 170
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/ۘۤᩳ;)Ll/֨ۧܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۘۤᩳ;)Ll/۟۫ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۤᩳ;->ܽ:Ll/۟۫ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ۘۤᩳ;)Ll/֨ۚۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۤᩳ;->۠:Ll/֨ۚۢ;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 458
    invoke-virtual {p0, v0, v1}, Ll/ۘۤᩳ;->֫(ZZ)V

    return-void
.end method

.method public final ֫(Landroid/view/MenuItem;)V
    .locals 1

    .line 153
    iput-object p1, p0, Ll/ۘۤᩳ;->᩶:Landroid/view/MenuItem;

    .line 154
    iget-object v0, p0, Ll/ۘۤᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-static {p1, v0}, Ll/ܶ᩺ᩳ;->ۧ(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Class;)V
    .locals 1

    .line 580
    iget-object v0, p0, Ll/ۘۤᩳ;->ܳ:Ll/᩸᩺ᩳ;

    invoke-virtual {v0}, Ll/᩸᩺ᩳ;->᩷()V

    .line 581
    iget-object v0, p0, Ll/ۘۤᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->֫(Ljava/lang/Class;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۘۤᩳ;->ܳ:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->֫(Ljava/lang/String;)V

    .line 140
    iget-object p1, p0, Ll/ۘۤᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {p1, p2}, Ll/᩸᩺ᩳ;->֫(Ljava/lang/String;)V

    .line 141
    iget-object p1, p0, Ll/ۘۤᩳ;->᩶:Landroid/view/MenuItem;

    iget-object p2, p0, Ll/ۘۤᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-static {p1, p2}, Ll/ܶ᩺ᩳ;->ۧ(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    .line 569
    iget-object v0, p0, Ll/ۘۤᩳ;->ܳ:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->֫(Ll/ۤۜܽ;)V

    .line 570
    iget-object v0, p0, Ll/ۘۤᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->֫(Ll/ۤۜܽ;)V

    return-void
.end method

.method public final ֫(Ll/۬ۜܽ;)V
    .locals 1

    .line 574
    iget-object v0, p0, Ll/ۘۤᩳ;->ܳ:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->֫(Ll/۬ۜܽ;)V

    .line 575
    iget-object v0, p0, Ll/ۘۤᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->֫(Ll/۬ۜܽ;)V

    .line 576
    iget-object p1, p0, Ll/ۘۤᩳ;->᩶:Landroid/view/MenuItem;

    iget-object v0, p0, Ll/ۘۤᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-static {p1, v0}, Ll/ܶ᩺ᩳ;->ۧ(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V

    return-void
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/ۙ֡ᩳ;Ljava/lang/Class;)V
    .locals 2

    .line 116
    new-instance p3, Ll/᩷ۤᩳ;

    invoke-direct {p3, p0}, Ll/᩷ۤᩳ;-><init>(Ll/ۘۤᩳ;)V

    iget-object v0, p0, Ll/ۘۤᩳ;->᩷:Ll/ۚۖۡ;

    .line 134
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v0

    iget-object v1, p0, Ll/ۘۤᩳ;->ۜ:Ll/ۚۖۡ;

    .line 135
    invoke-virtual {v1}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v1

    .line 116
    invoke-virtual {p2, p1, p3, v0, v1}, Ll/ۙ֡ᩳ;->֫(Ll/᩻ۡ֫;Ll/֫ܿܿ;Ll/ۤۤᩳ;Ll/ۤۤᩳ;)V

    return-void
.end method

.method public final ֫(ZZ)V
    .locals 8

    .line 463
    invoke-virtual {p0}, Ll/ۘۤᩳ;->᩻()Z

    move-result v0

    .line 464
    iget-object v1, p0, Ll/ۘۤᩳ;->ܽ:Ll/۟۫ᩳ;

    invoke-virtual {v1}, Ll/۟۫ᩳ;->᩷()Ll/۫ۨᩳ;

    move-result-object v1

    const/4 v2, 0x1

    .line 465
    iget-object v3, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    const/4 v4, 0x0

    if-nez v0, :cond_2

    .line 466
    iget-object v5, p0, Ll/ۘۤᩳ;->ᩳ:Ll/۫ۨᩳ;

    iget-object v5, v5, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v5}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v5

    if-nez v5, :cond_9

    iget-object v5, p0, Ll/ۘۤᩳ;->ܿ:Ll/۫ۨᩳ;

    iget-object v5, v5, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v5}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_2

    .line 468
    :cond_0
    sget-object v5, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Ll/ۘۤᩳ;->ܺ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "_bit"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v4, v6}, Ll/۫ۤۡ;->֫(BLjava/lang/String;)B

    move-result v5

    .line 469
    invoke-virtual {v3, v5}, Ll/֨ۧܿ;->֫(B)V

    .line 470
    iget-object v6, p0, Ll/ۘۤᩳ;->ۚ:Ll/֨ۧܿ;

    invoke-virtual {v6, v5}, Ll/֨ۧܿ;->֫(B)V

    .line 471
    invoke-direct {p0}, Ll/ۘۤᩳ;->ۘ()V

    .line 472
    iget-object v5, p0, Ll/ۘۤᩳ;->֨:Landroid/view/View;

    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 473
    iget-object v5, p0, Ll/ۘۤᩳ;->᩵:Landroid/view/View;

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 474
    invoke-direct {p0}, Ll/ۘۤᩳ;->ۖ()V

    .line 475
    iget-object v5, p0, Ll/ۘۤᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 476
    iget-object v5, p0, Ll/ۘۤᩳ;->ۧ:Ll/ۖۤᩳ;

    invoke-interface {v5}, Ll/ۖۤᩳ;->ۧ()V

    .line 478
    iget-object v5, p0, Ll/ۘۤᩳ;->ᩴ:Landroid/view/View;

    const v6, 0x3e851eb8    # 0.26f

    invoke-virtual {v5, v6}, Landroid/view/View;->setAlpha(F)V

    .line 479
    invoke-virtual {v5, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 481
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v5

    iget-object v7, p0, Ll/ۘۤᩳ;->ۘ:Landroid/view/View;

    if-eqz v5, :cond_1

    .line 482
    invoke-virtual {v7, v6}, Landroid/view/View;->setAlpha(F)V

    .line 483
    invoke-virtual {v7, v4}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_0

    :cond_1
    const/high16 v5, 0x3f800000    # 1.0f

    .line 485
    invoke-virtual {v7, v5}, Landroid/view/View;->setAlpha(F)V

    .line 486
    invoke-virtual {v7, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 489
    :cond_2
    :goto_0
    iget-object v5, p0, Ll/ۘۤᩳ;->᩷:Ll/ۚۖۡ;

    if-eqz p1, :cond_3

    .line 490
    invoke-virtual {v5}, Landroid/view/View;->requestFocus()Z

    .line 491
    invoke-virtual {v5}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v6

    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 493
    :cond_3
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۗ֫()[I

    move-result-object v6

    .line 494
    aget v4, v6, v4

    .line 495
    aget v2, v6, v2

    if-eq v4, v2, :cond_5

    if-nez p2, :cond_5

    .line 498
    :try_start_0
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p2

    invoke-interface {p2, v4, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 499
    invoke-virtual {v3}, Ll/֨ۧܿ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 500
    invoke-static {p2}, Ll/ۘ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "\r"

    const-string v1, "\\r"

    .line 501
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "\t"

    const-string v1, "\\t"

    .line 502
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 503
    :cond_4
    invoke-virtual {v5, p2}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_7

    .line 505
    invoke-virtual {v5}, Ll/ۚۖۡ;->᩷()V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    :cond_5
    if-nez v0, :cond_6

    .line 511
    invoke-virtual {v5}, Ll/ۚۖۡ;->ۜ()V

    if-eqz p1, :cond_7

    .line 513
    invoke-virtual {v5}, Ll/ۚۖۡ;->᩷()V

    goto :goto_1

    :cond_6
    if-nez p2, :cond_7

    goto :goto_2

    .line 518
    :cond_7
    :goto_1
    invoke-virtual {v5}, Ll/ۚۖۡ;->ᩳ()I

    move-result p1

    if-eqz p1, :cond_8

    .line 519
    invoke-virtual {p0}, Ll/ۘۤᩳ;->ۢ()V

    goto :goto_2

    .line 521
    :cond_8
    invoke-virtual {p0}, Ll/ۘۤᩳ;->ۡ()V

    :cond_9
    :goto_2
    return-void
.end method

.method public final ֫(Z)Z
    .locals 3

    .line 434
    iget-object v0, p0, Ll/ۘۤᩳ;->᩵:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 435
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 436
    iget-object v0, p0, Ll/ۘۤᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 438
    iget-object v1, p0, Ll/ۘۤᩳ;->ᩴ:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    const/4 v0, 0x1

    .line 439
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 440
    iget-object v1, p0, Ll/ۘۤᩳ;->ۜ:Ll/ۚۖۡ;

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 441
    invoke-virtual {v1}, Ll/ۚۖۡ;->ۜ()V

    .line 442
    invoke-virtual {v1}, Ll/ۚۖۡ;->᩷()V

    if-eqz p1, :cond_0

    .line 444
    invoke-virtual {v1}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    :cond_0
    return v0

    :cond_1
    return v2
.end method

.method public final ۜ()Z
    .locals 2

    .line 593
    iget-object v0, p0, Ll/ۘۤᩳ;->ܳ:Ll/᩸᩺ᩳ;

    invoke-virtual {v0}, Ll/᩸᩺ᩳ;->ۜ()Z

    move-result v0

    iget-object v1, p0, Ll/ۘۤᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v1}, Ll/᩸᩺ᩳ;->ۜ()Z

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public final ۡ()V
    .locals 7

    .line 333
    invoke-virtual {p0}, Ll/ۘۤᩳ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 336
    :cond_0
    iget-object v0, p0, Ll/ۘۤᩳ;->᩷:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ᩳ()I

    move-result v0

    iget-object v1, p0, Ll/ۘۤᩳ;->᩸:Landroid/widget/TextView;

    iget-object v2, p0, Ll/ۘۤᩳ;->ܶ:Landroid/widget/TextView;

    if-nez v0, :cond_2

    .line 362
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v3, "0"

    invoke-static {v3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 363
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 338
    :cond_1
    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 339
    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void

    .line 342
    :cond_2
    iget-object v0, p0, Ll/ۘۤᩳ;->ܽ:Ll/۟۫ᩳ;

    invoke-virtual {v0}, Ll/۟۫ᩳ;->᩷()Ll/۫ۨᩳ;

    move-result-object v0

    .line 343
    iget-object v3, v0, Ll/۫ۨᩳ;->֡ᩳ:Ll/ۜ֫ܿ;

    .line 345
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۗ֫()[I

    move-result-object v4

    .line 346
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v5, 0x0

    aget v5, v4, v5

    const/4 v6, 0x1

    aget v4, v4, v6

    invoke-virtual {v3, v0, v5, v4}, Ll/ۜ֫ܿ;->֫(Landroid/content/Context;II)Ll/ܽ֫ܿ;

    move-result-object v0

    .line 348
    invoke-virtual {v0}, Ll/ܽ֫ܿ;->֫()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 349
    sget-object v3, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 350
    sget-object v1, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 351
    :cond_3
    invoke-virtual {v0}, Ll/ܽ֫ܿ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 352
    sget v3, Ll/᩹֡᩷;->ۘ֫:I

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 353
    sget v1, Ll/᩹֡᩷;->ۘ֫:I

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 355
    :cond_4
    sget-object v3, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 356
    sget-object v1, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 358
    :goto_0
    invoke-virtual {v0}, Ll/ܽ֫ܿ;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 362
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 363
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public final ۢ()V
    .locals 2

    .line 545
    iget-object v0, p0, Ll/ۘۤᩳ;->۠:Ll/֨ۚۢ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 546
    invoke-direct {p0}, Ll/ۘۤᩳ;->ܺ()V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 458
    invoke-virtual {p0, v0, v0}, Ll/ۘۤᩳ;->֫(ZZ)V

    return-void
.end method

.method public final ۧ(Ll/ۤۜܽ;)V
    .locals 5

    .line 368
    iget-object v0, p0, Ll/ۘۤᩳ;->֨:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 369
    iget-object v2, p0, Ll/ۘۤᩳ;->᩵:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v1, 0x1

    .line 370
    :cond_1
    iget-object v2, p0, Ll/ۘۤᩳ;->᩷:Ll/ۚۖۡ;

    if-eqz v0, :cond_2

    .line 371
    invoke-virtual {v2}, Ll/ۚۖۡ;->ܳ()V

    .line 373
    :cond_2
    iget-object v3, p0, Ll/ۘۤᩳ;->ۜ:Ll/ۚۖۡ;

    if-eqz v1, :cond_3

    .line 374
    invoke-virtual {v3}, Ll/ۚۖۡ;->ܳ()V

    .line 376
    :cond_3
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 377
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    const-string v4, ""

    if-eqz v0, :cond_4

    .line 378
    invoke-virtual {v2}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    move-object v0, v4

    :goto_1
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_5

    .line 379
    invoke-virtual {v3}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_5
    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 380
    iget-object v0, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->֫()B

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    return-void
.end method

.method public final ۧ(Ll/۬ۜܽ;)V
    .locals 6

    .line 384
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v2

    .line 385
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v3

    .line 386
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v4

    .line 387
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    .line 388
    invoke-virtual {p1}, Ll/۬ۜܽ;->readByte()B

    move-result p1

    if-eqz v2, :cond_0

    .line 390
    iget-object v0, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    invoke-virtual {v0, p1}, Ll/֨ۧܿ;->֫(B)V

    .line 391
    iget-object v0, p0, Ll/ۘۤᩳ;->ۚ:Ll/֨ۧܿ;

    invoke-virtual {v0, p1}, Ll/֨ۧܿ;->֫(B)V

    .line 394
    :cond_0
    new-instance p1, Ll/ۜۤᩳ;

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ll/ۜۤᩳ;-><init>(Ll/ۘۤᩳ;ZZLjava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۧ(Landroid/view/MenuItem;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 677
    iget-object v2, v0, Ll/ۘۤᩳ;->ܽ:Ll/۟۫ᩳ;

    invoke-virtual {v2}, Ll/۟۫ᩳ;->᩷()Ll/۫ۨᩳ;

    move-result-object v3

    .line 678
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v4

    const v5, 0x7f0a0489

    const/4 v6, 0x1

    if-ne v4, v5, :cond_0

    .line 680
    invoke-virtual {v3}, Ll/۫ۨᩳ;->֡ܽ()V

    return v6

    :cond_0
    const v5, 0x7f0a065c

    if-ne v4, v5, :cond_1

    .line 682
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ܽᩳ()V

    return v6

    :cond_1
    const v5, 0x7f0a032e

    if-ne v4, v5, :cond_2

    .line 684
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ᩳ()V

    return v6

    :cond_2
    const v5, 0x7f0a0345

    if-ne v4, v5, :cond_3

    .line 686
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ܽ֫()V

    return v6

    :cond_3
    const v5, 0x7f0a037c

    if-ne v4, v5, :cond_4

    .line 688
    invoke-virtual/range {p0 .. p0}, Ll/ۘۤᩳ;->֫()V

    return v6

    :cond_4
    const v5, 0x7f0a035a

    .line 689
    iget-object v7, v0, Ll/ۘۤᩳ;->֫:Ll/֫ۢᩳ;

    if-ne v4, v5, :cond_5

    .line 650
    invoke-virtual {v2}, Ll/۟۫ᩳ;->᩷()Ll/۫ۨᩳ;

    move-result-object v1

    .line 651
    new-instance v2, Ll/ܺۤᩳ;

    invoke-direct {v2, v7, v1}, Ll/ܺۤᩳ;-><init>(Ll/֫ۢᩳ;Ll/۫ۨᩳ;)V

    const v3, 0x7f1205e5

    .line 668
    invoke-virtual {v2, v3}, Ll/۬ۗܿ;->ۡ(I)V

    const/4 v3, 0x2

    .line 669
    invoke-virtual {v2, v3}, Ll/۬ۗܿ;->ܿ(I)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "1\u2026"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 670
    invoke-virtual {v1}, Ll/۫ۨᩳ;->֨֫()I

    move-result v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    .line 671
    invoke-virtual {v2}, Ll/۬ۗܿ;->֫()V

    .line 672
    invoke-virtual {v2, v3}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 205
    invoke-virtual {v2, v6}, Ll/۬ۗܿ;->ۧ(Z)V

    return v6

    :cond_5
    const v5, 0x7f0a038c

    const/4 v8, 0x0

    .line 691
    iget-object v9, v0, Ll/ۘۤᩳ;->ܿ:Ll/۫ۨᩳ;

    iget-object v10, v0, Ll/ۘۤᩳ;->ᩳ:Ll/۫ۨᩳ;

    if-ne v4, v5, :cond_7

    .line 606
    invoke-virtual {v2}, Ll/۟۫ᩳ;->ᩴ()Z

    move-result v1

    iget-object v2, v0, Ll/ۘۤᩳ;->᩻:Ll/᩸᩺ᩳ;

    iget-object v3, v0, Ll/ۘۤᩳ;->ܳ:Ll/᩸᩺ᩳ;

    if-eqz v1, :cond_6

    move-object/from16 v17, v2

    move-object v14, v3

    move-object/from16 v18, v9

    move-object v15, v10

    goto :goto_0

    :cond_6
    move-object v14, v2

    move-object/from16 v17, v3

    move-object v15, v9

    move-object/from16 v18, v10

    .line 617
    :goto_0
    invoke-virtual {v14}, Ll/᩸᩺ᩳ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v17 .. v17}, Ll/᩸᩺ᩳ;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    .line 618
    invoke-static {}, Ll/ۜ᩷ܿ;->ܳ()Ljava/util/List;

    move-result-object v1

    new-array v2, v8, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    .line 619
    invoke-static {}, Ll/ۜ᩷ܿ;->ܳ()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v14}, Ll/᩸᩺ᩳ;->ܿ()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 620
    invoke-virtual {v7}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    const v4, 0x7f120611

    .line 621
    invoke-virtual {v3, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v4, Ll/֫ۤᩳ;

    move-object v11, v4

    move v12, v2

    move-object v13, v1

    invoke-direct/range {v11 .. v18}, Ll/֫ۤᩳ;-><init>(I[Ljava/lang/String;Ll/᩸᩺ᩳ;Ll/۫ۨᩳ;ZLl/᩸᩺ᩳ;Ll/۫ۨᩳ;)V

    .line 622
    invoke-virtual {v3, v1, v2, v4}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120189

    const/4 v2, 0x0

    .line 640
    invoke-virtual {v3, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120a15

    .line 641
    invoke-virtual {v3, v1, v2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 642
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1

    .line 643
    invoke-virtual {v1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/ۧۤᩳ;

    invoke-direct {v2, v0}, Ll/ۧۤᩳ;-><init>(Ll/ۘۤᩳ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return v6

    :cond_7
    const v2, 0x7f0a0380

    if-ne v4, v2, :cond_8

    .line 694
    const-class v1, Ll/ۖۢᩳ;

    invoke-virtual {v0, v1}, Ll/ۘۤᩳ;->֫(Ljava/lang/Class;)V

    return v6

    :cond_8
    const v2, 0x7f0a038a

    if-ne v4, v2, :cond_9

    .line 696
    invoke-virtual/range {p0 .. p0}, Ll/ۘۤᩳ;->᩷()V

    return v6

    :cond_9
    const v2, 0x7f0a0536

    if-ne v4, v2, :cond_b

    .line 698
    invoke-virtual {v10}, Ll/۫ۨᩳ;->ۧܽ()Z

    move-result v2

    xor-int/lit8 v3, v2, 0x1

    .line 699
    invoke-virtual {v10, v3}, Ll/۫ۨᩳ;->ۚ(Z)V

    .line 700
    invoke-virtual {v9, v3}, Ll/۫ۨᩳ;->ۚ(Z)V

    .line 701
    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    if-nez v2, :cond_a

    const-string v1, "smooth_mode"

    const v2, 0x7f1209b3

    .line 703
    invoke-static {v2, v7, v1}, Ll/ۧۛܿ;->֫(ILl/ۗܺ᩷;Ljava/lang/String;)V

    :cond_a
    return v6

    :cond_b
    const v2, 0x7f0a033b

    if-ne v4, v2, :cond_c

    .line 706
    invoke-static {v1, v3}, Ll/ܶ᩺ᩳ;->֫(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V

    return v6

    .line 707
    :cond_c
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    instance-of v2, v1, Ll/ܺ᩻ܿ;

    if-eqz v2, :cond_d

    check-cast v1, Ll/ܺ᩻ܿ;

    .line 708
    invoke-virtual {v1}, Ll/ܺ᩻ܿ;->֫()Ll/ۖ᩻ܿ;

    move-result-object v1

    invoke-virtual {v1, v3}, Ll/ۖ᩻ܿ;->֫(Ll/۫ۨᩳ;)V

    return v6

    :cond_d
    return v8
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Ll/ۘۤᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0}, Ll/᩸᩺ᩳ;->ܿ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()V
    .locals 3

    .line 529
    iget-object v0, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    .line 268
    invoke-virtual {v0}, Ll/֨ۧܿ;->ۜ()V

    .line 530
    iget-object v0, p0, Ll/ۘۤᩳ;->ۚ:Ll/֨ۧܿ;

    .line 268
    invoke-virtual {v0}, Ll/֨ۧܿ;->ۜ()V

    .line 531
    iget-object v0, p0, Ll/ۘۤᩳ;->֨:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-nez v1, :cond_0

    .line 532
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 533
    invoke-direct {p0}, Ll/ۘۤᩳ;->ۖ()V

    .line 534
    iget-object v0, p0, Ll/ۘۤᩳ;->᩷:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܳ()V

    .line 535
    iget-object v0, p0, Ll/ۘۤᩳ;->ۧ:Ll/ۖۤᩳ;

    invoke-interface {v0}, Ll/ۖۤᩳ;->ۧ()V

    .line 537
    :cond_0
    iget-object v0, p0, Ll/ۘۤᩳ;->᩵:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_1

    .line 538
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 539
    iget-object v0, p0, Ll/ۘۤᩳ;->ۜ:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܳ()V

    .line 541
    :cond_1
    iget-object v0, p0, Ll/ۘۤᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Ll/ۘۤᩳ;->ܳ:Ll/᩸᩺ᩳ;

    invoke-virtual {v0}, Ll/᩸᩺ᩳ;->ܿ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 585
    iget-object v0, p0, Ll/ۘۤᩳ;->۠:Ll/֨ۚۢ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 586
    iget-object v0, p0, Ll/ۘۤᩳ;->֡:Ll/֨ۧܿ;

    .line 268
    invoke-virtual {v0}, Ll/֨ۧܿ;->ۜ()V

    .line 587
    iget-object v0, p0, Ll/ۘۤᩳ;->ۚ:Ll/֨ۧܿ;

    .line 268
    invoke-virtual {v0}, Ll/֨ۧܿ;->ۜ()V

    .line 588
    iget-object v0, p0, Ll/ۘۤᩳ;->ܳ:Ll/᩸᩺ᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    :try_start_0
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 589
    :catch_0
    iget-object v0, p0, Ll/ۘۤᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    :try_start_1
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method

.method public final ᩷()V
    .locals 5

    .line 158
    iget-object v0, p0, Ll/ۘۤᩳ;->᩶:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 159
    iget-object v0, p0, Ll/ۘۤᩳ;->᩶:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    iget-object v1, p0, Ll/ۘۤᩳ;->ܳ:Ll/᩸᩺ᩳ;

    invoke-virtual {v1, v0}, Ll/᩸᩺ᩳ;->֫(Z)V

    .line 160
    iget-object v0, p0, Ll/ۘۤᩳ;->᩶:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    iget-object v2, p0, Ll/ۘۤᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v2, v0}, Ll/᩸᩺ᩳ;->֫(Z)V

    .line 161
    invoke-virtual {v1}, Ll/᩸᩺ᩳ;->ܽ()Ll/᩶۟ᩳ;

    move-result-object v0

    .line 162
    invoke-virtual {v2}, Ll/᩸᩺ᩳ;->ܽ()Ll/᩶۟ᩳ;

    move-result-object v1

    .line 163
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 164
    new-instance v3, Ll/ۢ᩸᩷;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v2, v4}, Ll/ۢ᩸᩷;-><init>(Ljava/lang/Object;Ljava/io/Serializable;I)V

    .line 175
    iget-object v2, p0, Ll/ۘۤᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v2, v0, v3}, Ll/۫ۨᩳ;->֫(Ll/᩶۟ᩳ;Ljava/lang/Runnable;)V

    .line 176
    iget-object v0, p0, Ll/ۘۤᩳ;->ܿ:Ll/۫ۨᩳ;

    invoke-virtual {v0, v1, v3}, Ll/۫ۨᩳ;->֫(Ll/᩶۟ᩳ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 525
    iget-object v0, p0, Ll/ۘۤᩳ;->֨:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
