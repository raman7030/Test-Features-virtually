.class public Ll/֫ۨܽ;
.super Ljava/lang/Object;
.source "H5BW"

# interfaces
.implements Ll/۠ۢ֫;


# instance fields
.field public final synthetic ᩶:Ll/ۢۨܽ;

.field public ᩸:Ljava/lang/String;

.field public final synthetic ᩹:Landroid/widget/Spinner;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/widget/Spinner;Ll/ۢۨܽ;)V
    .locals 0

    .line 330
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/֫ۨܽ;->᩹:Landroid/widget/Spinner;

    iput-object p3, p0, Ll/֫ۨܽ;->᩶:Ll/ۢۨܽ;

    .line 331
    iput-object p1, p0, Ll/֫ۨܽ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic ֫(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final ۧ(Ll/᩻ۡ֫;)V
    .locals 5

    .line 346
    iget-object p1, p0, Ll/֫ۨܽ;->᩶:Ll/ۢۨܽ;

    iget-object v0, p0, Ll/֫ۨܽ;->᩹:Landroid/widget/Spinner;

    :try_start_0
    sget-object v1, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ܿᩳ;

    invoke-virtual {v1}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/֫ۨܽ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 348
    invoke-static {p1}, Ll/ۢۨܽ;->ᩳ(Ll/ۢۨܽ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    nop

    .line 355
    :cond_0
    iget-object v1, p0, Ll/֫ۨܽ;->᩸:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    const/4 v1, 0x0

    .line 356
    :goto_0
    sget-object v3, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    .line 357
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ܿᩳ;

    invoke-virtual {v3}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ll/֫ۨܽ;->᩸:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 362
    :cond_2
    :goto_1
    invoke-virtual {v0}, Landroid/widget/AbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v1

    check-cast v1, Landroid/widget/BaseAdapter;

    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 363
    invoke-virtual {v0, v2}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 364
    invoke-static {p1}, Ll/ۢۨܽ;->ᩳ(Ll/ۢۨܽ;)V

    return-void
.end method

.method public final synthetic ܳ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final ܽ(Ll/᩻ۡ֫;)V
    .locals 1

    .line 336
    :try_start_0
    sget-object p1, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    iget-object v0, p0, Ll/֫ۨܽ;->᩹:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ܿᩳ;

    invoke-virtual {p1}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۨܽ;->᩸:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final synthetic ܿ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ᩳ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method
