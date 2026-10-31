.class public final synthetic Ll/֫᩻ܿ;
.super Ljava/lang/Object;
.source "89CO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ᩳ᩻ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳ᩻ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫᩻ܿ;->᩸:Ll/ᩳ᩻ܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 305
    invoke-static {}, Ll/ܳᩴܿ;->֫()Ljava/util/List;

    move-result-object p1

    .line 306
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 309
    :cond_0
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "stid"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v3, 0x0

    aput v3, v1, v3

    .line 311
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    const/4 v4, 0x0

    .line 312
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_2

    .line 313
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽᩴܿ;

    invoke-interface {v5}, Ll/ܽᩴܿ;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    aput v4, v1, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 319
    :cond_2
    :goto_1
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 320
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v4, v4, [Ljava/lang/CharSequence;

    const/4 v5, 0x0

    .line 321
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    .line 322
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܽᩴܿ;

    invoke-interface {v6, v0}, Ll/ܽᩴܿ;->֫(Landroid/content/pm/PackageManager;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 324
    :cond_3
    iget-object v0, p0, Ll/֫᩻ܿ;->᩸:Ll/ᩳ᩻ܿ;

    iget-object v0, v0, Ll/ᩳ᩻ܿ;->᩶:Ll/ۢ᩻ܿ;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v5, 0x7f120a19

    invoke-virtual {v0, v5}, Ll/᩵ۚۢ;->ۧ(I)V

    aget v3, v1, v3

    new-instance v5, Ll/ۡ֡ᩳ;

    const/4 v6, 0x1

    invoke-direct {v5, v6, v1}, Ll/ۡ֡ᩳ;-><init>(ILjava/lang/Object;)V

    .line 325
    invoke-virtual {v0, v4, v3, v5}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v3, Ll/ܽۜۡ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p1, v1}, Ll/ܽۜۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, 0x7f12070a

    .line 326
    invoke-virtual {v0, p1, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 330
    invoke-virtual {v0, p1, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 331
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
