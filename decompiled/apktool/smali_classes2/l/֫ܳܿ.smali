.class public final synthetic Ll/֫ܳܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ܳܳܿ;

.field public final synthetic ᩹:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Ll/ܳܳܿ;Landroid/view/View;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ܳܿ;->᩸:Ll/ܳܳܿ;

    iput-object p2, p0, Ll/֫ܳܿ;->᩹:Landroid/view/View;

    iput p3, p0, Ll/֫ܳܿ;->᩶:I

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 7

    .line 1130
    iget-object v0, p0, Ll/֫ܳܿ;->᩸:Ll/ܳܳܿ;

    iget-object v1, v0, Ll/ܳܳܿ;->ۙ:Ll/᩻ܳܿ;

    iget-object v2, v1, Ll/᩻ܳܿ;->ۢ:Ll/֡ܳܿ;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v3, 0x7f1202dd

    const/4 v4, 0x1

    if-ne p1, v3, :cond_0

    .line 1132
    iget-object p1, p0, Ll/֫ܳܿ;->᩹:Landroid/view/View;

    invoke-virtual {v0, p1}, Ll/ܳܳܿ;->onClick(Landroid/view/View;)V

    return v4

    .line 1133
    :cond_0
    iget v3, p0, Ll/֫ܳܿ;->᩶:I

    const v5, 0x7f1205ad

    if-ne p1, v5, :cond_1

    .line 1134
    invoke-static {v2}, Ll/֡ܳܿ;->ᩳ(Ll/֡ܳܿ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {v2}, Ll/֡ܳܿ;->᩻(Ll/֡ܳܿ;)Ll/ۜۡۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ܰۧ;->ܽ()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ܳܿ;

    .line 1135
    invoke-virtual {p1}, Ll/᩻ܳܿ;->ۧ()Ll/ۚܳܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object v0

    .line 1136
    new-instance v1, Ll/ܶܳܿ;

    invoke-direct {v1}, Ll/ܶܳܿ;-><init>()V

    new-instance v6, Ll/ܽܳܿ;

    invoke-direct {v6, v0, v3, p1}, Ll/ܽܳܿ;-><init>(Ljava/util/List;ILl/᩻ܳܿ;)V

    invoke-static {v2, v1, v5, v4, v6}, Ll/֡ܳܿ;->֫(Ll/֡ܳܿ;Ll/ܶܳܿ;IZLl/۬ۤ;)V

    return v4

    :cond_1
    const v5, 0x7f1205ca

    if-ne p1, v5, :cond_2

    .line 1143
    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v1, 0x7f120b7b

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v1, v0, Ll/ܳܳܿ;->ۗ:Landroid/widget/TextView;

    .line 1144
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const v1, 0x7f120870

    invoke-virtual {v2, v1, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/ᩳܳܿ;

    invoke-direct {v1, v0, v3}, Ll/ᩳܳܿ;-><init>(Ll/ܳܳܿ;I)V

    const v0, 0x7f12070a

    .line 1145
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 1150
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1151
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return v4

    :cond_2
    const v0, 0x7f1205c2

    if-ne p1, v0, :cond_3

    .line 1153
    invoke-static {v2}, Ll/֡ܳܿ;->ᩳ(Ll/֡ܳܿ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {v2}, Ll/֡ܳܿ;->᩻(Ll/֡ܳܿ;)Ll/ۜۡۡ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֡ܰۧ;->ܽ()I

    move-result v5

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ܳܿ;

    .line 1154
    invoke-virtual {p1}, Ll/᩻ܳܿ;->ۧ()Ll/ۚܳܿ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object v5

    .line 1155
    invoke-virtual {v1}, Ll/᩻ܳܿ;->֫()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶܳܿ;

    invoke-virtual {v1}, Ll/ܶܳܿ;->ܿ()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/ܶܳܿ;->֫(Lbin/mt/json/JSONObject;)Ll/ܶܳܿ;

    move-result-object v1

    .line 1156
    new-instance v6, Ll/ܿܳܿ;

    invoke-direct {v6, v5, v3, p1}, Ll/ܿܳܿ;-><init>(Ljava/util/List;ILl/᩻ܳܿ;)V

    invoke-static {v2, v1, v0, v4, v6}, Ll/֡ܳܿ;->֫(Ll/֡ܳܿ;Ll/ܶܳܿ;IZLl/۬ۤ;)V

    return v4

    :cond_3
    const v0, 0x7f12011f

    if-ne p1, v0, :cond_4

    .line 1163
    invoke-static {v2, v3}, Ll/֡ܳܿ;->ۧ(Ll/֡ܳܿ;I)V

    :cond_4
    return v4
.end method
