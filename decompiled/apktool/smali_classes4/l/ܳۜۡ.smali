.class public final Ll/ܳۜۡ;
.super Ll/ܺۜۡ;
.source "98W2"


# instance fields
.field public final ۜ:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ll/ܺۜۡ;

.field public final ܿ:Ll/ܺۜۡ;

.field public final ᩳ:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:Ll/ܺۜۡ;


# direct methods
.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 2

    const/4 v0, 0x5

    .line 184
    invoke-direct {p0, v0}, Ll/ܺۜۡ;-><init>(I)V

    .line 185
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۜۡ;->᩷:Ljava/lang/String;

    .line 186
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۜۡ;->ۧ:Ljava/lang/String;

    .line 187
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 188
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۜۡ;->ۜ:Ljava/lang/String;

    .line 211
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    invoke-static {p1}, Ll/ܺۜۡ;->֫(Ll/۬ۜܽ;)Ll/ܺۜۡ;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 189
    :goto_0
    iput-object v0, p0, Ll/ܳۜۡ;->᩻:Ll/ܺۜۡ;

    goto :goto_1

    .line 191
    :cond_1
    iput-object v1, p0, Ll/ܳۜۡ;->ۜ:Ljava/lang/String;

    .line 192
    iput-object v1, p0, Ll/ܳۜۡ;->᩻:Ll/ܺۜۡ;

    .line 194
    :goto_1
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 195
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۜۡ;->ᩳ:Ljava/lang/String;

    .line 211
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 212
    invoke-static {p1}, Ll/ܺۜۡ;->֫(Ll/۬ۜܽ;)Ll/ܺۜۡ;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    .line 196
    :goto_2
    iput-object v0, p0, Ll/ܳۜۡ;->ܽ:Ll/ܺۜۡ;

    goto :goto_3

    .line 198
    :cond_3
    iput-object v1, p0, Ll/ܳۜۡ;->ᩳ:Ljava/lang/String;

    .line 199
    iput-object v1, p0, Ll/ܳۜۡ;->ܽ:Ll/ܺۜۡ;

    .line 201
    :goto_3
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 202
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۜۡ;->ܳ:Ljava/lang/String;

    .line 211
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 212
    invoke-static {p1}, Ll/ܺۜۡ;->֫(Ll/۬ۜܽ;)Ll/ܺۜۡ;

    move-result-object v1

    .line 203
    :cond_4
    iput-object v1, p0, Ll/ܳۜۡ;->ܿ:Ll/ܺۜۡ;

    return-void

    .line 205
    :cond_5
    iput-object v1, p0, Ll/ܳۜۡ;->ܳ:Ljava/lang/String;

    .line 206
    iput-object v1, p0, Ll/ܳۜۡ;->ܿ:Ll/ܺۜۡ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܳۜۡ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 238
    iget-object p0, p0, Ll/ܳۜۡ;->ܿ:Ll/ܺۜۡ;

    if-eqz p0, :cond_0

    .line 239
    invoke-virtual {p0, p1}, Ll/ܺۜۡ;->֫(Ll/ۗܺ᩷;)V

    :cond_0
    return-void
.end method

.method public static synthetic ۧ(Ll/ܳۜۡ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 231
    iget-object p0, p0, Ll/ܳۜۡ;->ܽ:Ll/ܺۜۡ;

    if-eqz p0, :cond_0

    .line 232
    invoke-virtual {p0, p1}, Ll/ܺۜۡ;->֫(Ll/ۗܺ᩷;)V

    :cond_0
    return-void
.end method

.method public static synthetic ܽ(Ll/ܳۜۡ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 224
    iget-object p0, p0, Ll/ܳۜۡ;->᩻:Ll/ܺۜۡ;

    if-eqz p0, :cond_0

    .line 225
    invoke-virtual {p0, p1}, Ll/ܺۜۡ;->֫(Ll/ۗܺ᩷;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 4

    .line 220
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    iget-object v1, p0, Ll/ܳۜۡ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    const-string v1, ""

    .line 221
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    .line 222
    iget-object v1, p0, Ll/ܳۜۡ;->ۜ:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 223
    new-instance v2, Ll/ۨۜᩳ;

    const/4 v3, 0x5

    invoke-direct {v2, v3, p0, p1}, Ll/ۨۜᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ܽ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 229
    :cond_0
    iget-object v1, p0, Ll/ܳۜۡ;->ᩳ:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 230
    new-instance v2, Ll/ܽۜۡ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0, p1}, Ll/ܽۜۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 236
    :cond_1
    iget-object v1, p0, Ll/ܳۜۡ;->ܳ:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 237
    new-instance v2, Ll/ᩳۜۡ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0, p1}, Ll/ᩳۜۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 243
    :cond_2
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 244
    invoke-static {v0}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    const v1, 0x102000b

    .line 245
    invoke-virtual {v0, v1}, Ll/֡ۚۢ;->֫(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/high16 v1, 0x40000000    # 2.0f

    .line 246
    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    const/4 v1, 0x1

    .line 247
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 249
    invoke-static {p1}, Ll/ܺ᩶ۘ;->֫(Landroid/content/Context;)Ll/ۡ᩶ۘ;

    move-result-object p1

    new-instance v2, Ll/ܿۜۡ;

    .line 250
    invoke-direct {v2, v1}, Ll/᩶᩻ۡ;-><init>(Z)V

    .line 255
    invoke-virtual {v2}, Ll/᩶᩻ۡ;->֫()Ljava/util/List;

    move-result-object v1

    .line 250
    invoke-interface {p1, v1}, Ll/ۡ᩶ۘ;->֫(Ljava/util/List;)Ll/ۡ᩶ۘ;

    .line 256
    invoke-interface {p1}, Ll/ۡ᩶ۘ;->build()Ll/ܺ᩶ۘ;

    move-result-object p1

    iget-object v1, p0, Ll/ܳۜۡ;->ۧ:Ljava/lang/String;

    .line 257
    invoke-virtual {p1, v0, v1}, Ll/ܺ᩶ۘ;->֫(Landroid/widget/TextView;Ljava/lang/String;)V

    return-void
.end method
