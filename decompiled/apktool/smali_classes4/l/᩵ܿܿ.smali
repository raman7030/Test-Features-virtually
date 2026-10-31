.class public final synthetic Ll/᩵ܿܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/֡ܳܿ;

.field public final synthetic ᩹:Ll/᩻ܳܿ;


# direct methods
.method public synthetic constructor <init>(Ll/֡ܳܿ;Ll/᩻ܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ܿܿ;->᩸:Ll/֡ܳܿ;

    iput-object p2, p0, Ll/᩵ܿܿ;->᩹:Ll/᩻ܳܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 2
    sget p1, Ll/֡ܳܿ;->֨ۧ:I

    .line 254
    iget-object p1, p0, Ll/᩵ܿܿ;->᩹:Ll/᩻ܳܿ;

    iget v0, p1, Ll/᩻ܳܿ;->ۧ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 257
    iget-object v2, p0, Ll/᩵ܿܿ;->᩸:Ll/֡ܳܿ;

    const/4 v3, 0x0

    const v4, 0x7f12015e

    const v5, 0x7f12070a

    const v6, 0x7f120b7b

    const/4 v7, 0x1

    if-ne v0, v7, :cond_3

    .line 985
    invoke-virtual {p1}, Ll/᩻ܳܿ;->֫()Ljava/util/List;

    move-result-object v0

    .line 986
    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v0, :cond_2

    .line 987
    iget-object v9, p1, Ll/᩻ܳܿ;->ܽ:Ljava/util/BitSet;

    invoke-virtual {v9, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    const/4 v8, -0x1

    .line 260
    :goto_1
    invoke-virtual {p1}, Ll/᩻ܳܿ;->֫()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶܳܿ;

    .line 261
    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v9

    invoke-virtual {v9, v6}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 262
    invoke-virtual {v0}, Ll/ܶܳܿ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    new-array v6, v7, [Ljava/lang/Object;

    aput-object v0, v6, v1

    const v0, 0x7f120870

    invoke-virtual {v2, v0, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/֡ܿܿ;

    invoke-direct {v0, v2, p1, v8}, Ll/֡ܿܿ;-><init>(Ll/֡ܳܿ;Ll/᩻ܳܿ;I)V

    .line 263
    invoke-virtual {v9, v5, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 269
    invoke-virtual {v9, v4, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 270
    invoke-virtual {v9}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 272
    :cond_3
    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, v6}, Ll/᩵ۚۢ;->ۧ(I)V

    iget v6, p1, Ll/᩻ܳܿ;->ۧ:I

    .line 273
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v6, v7, v1

    const v1, 0x7f12087b

    invoke-virtual {v2, v1, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/ۚܿܿ;

    invoke-direct {v1, v2, p1}, Ll/ۚܿܿ;-><init>(Ll/֡ܳܿ;Ll/᩻ܳܿ;)V

    .line 274
    invoke-virtual {v0, v5, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 279
    invoke-virtual {v0, v4, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 280
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
