.class public final Ll/ܰۢۢ;
.super Ll/۟ܶۡ;
.source "31PG"


# instance fields
.field public final synthetic ܳ:Ll/۟ۡۢ;


# direct methods
.method public constructor <init>(Ll/۟ۡۢ;)V
    .locals 0

    .line 225
    iput-object p1, p0, Ll/ܰۢۢ;->ܳ:Ll/۟ۡۢ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 255
    instance-of v0, p1, Ll/֫ۛۡ;

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/᩵ۤۡ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 258
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    .line 256
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 229
    iget-object v0, p0, Ll/ܰۢۢ;->ܳ:Ll/۟ۡۢ;

    invoke-static {v0}, Ll/۟ۡۢ;->ۜ(Ll/۟ۡۢ;)Ll/۫ۤۧ;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/۫ۤۧ;->֫(Z)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 234
    invoke-static {}, Ll/֫ܺۢ;->ܽ()V

    .line 235
    invoke-static {}, Ll/ܺܰۡ;->᩻()Z

    move-result v0

    iget-object v1, p0, Ll/ܰۢۢ;->ܳ:Ll/۟ۡۢ;

    if-eqz v0, :cond_0

    .line 236
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v1, v0}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;Ljava/util/List;)V

    .line 237
    invoke-static {v1, v0}, Ll/۟ۡۢ;->֫(Ll/۟ۡۢ;Ljava/util/List;)V

    return-void

    .line 239
    :cond_0
    invoke-static {}, Ll/ܿܺۢ;->ۧ()Ljava/util/List;

    move-result-object v0

    .line 240
    invoke-static {}, Ll/ܿܺۢ;->֫()Ljava/util/ArrayList;

    move-result-object v2

    .line 242
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v0}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;Ljava/util/List;)V

    .line 243
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v0}, Ll/۟ۡۢ;->֫(Ll/۟ۡۢ;Ljava/util/List;)V

    .line 244
    new-instance v0, Ll/᩵ۡۢ;

    invoke-direct {v0, v1}, Ll/᩵ۡۢ;-><init>(Ll/۟ۡۢ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 7

    .line 263
    iget-object v0, p0, Ll/ܰۢۢ;->ܳ:Ll/۟ۡۢ;

    invoke-static {v0}, Ll/۟ۡۢ;->ܽ(Ll/۟ۡۢ;)Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 264
    invoke-static {}, Ll/ܺܰۡ;->ۜ()Z

    move-result v1

    const/16 v3, 0x8

    const v4, 0x7f0a0205

    if-eqz v1, :cond_0

    .line 265
    invoke-static {v0}, Ll/۟ۡۢ;->ܽ(Ll/۟ۡۢ;)Landroid/widget/TextView;

    move-result-object v1

    const v5, 0x7f12051d

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 266
    invoke-static {v0}, Ll/۟ۡۢ;->ܽ(Ll/۟ۡۢ;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v5, Ll/᩺ۢۢ;

    invoke-direct {v5, p0}, Ll/᩺ۢۢ;-><init>(Ll/ܰۢۢ;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    invoke-virtual {v0, v4}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 268
    :cond_0
    invoke-static {}, Ll/ܺܰۡ;->᩻()Z

    move-result v1

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    .line 269
    invoke-static {v0}, Ll/۟ۡۢ;->ܽ(Ll/۟ۡۢ;)Landroid/widget/TextView;

    move-result-object v1

    const v6, 0x7f1200ba

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(I)V

    .line 270
    invoke-static {v0}, Ll/۟ۡۢ;->ܽ(Ll/۟ۡۢ;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 271
    invoke-virtual {v0, v4}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 273
    :cond_1
    invoke-static {v0}, Ll/۟ۡۢ;->ܽ(Ll/۟ۡۢ;)Landroid/widget/TextView;

    move-result-object v1

    const v3, 0x7f1200c7

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 274
    invoke-static {v0}, Ll/۟ۡۢ;->ܽ(Ll/۟ۡۢ;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 275
    invoke-virtual {v0, v4}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 277
    :goto_0
    invoke-static {v0}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;)Ll/ܺۡۢ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 278
    invoke-static {v0}, Ll/۟ۡۢ;->ۜ(Ll/۟ۡۢ;)Ll/۫ۤۧ;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/۫ۤۧ;->֫(Z)V

    return-void
.end method
