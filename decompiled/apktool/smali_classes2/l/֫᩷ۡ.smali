.class public Ll/֫᩷ۡ;
.super Landroid/widget/BaseAdapter;
.source "N155"

# interfaces
.implements Landroid/widget/Filterable;
.implements Ll/۫ۘ;


# instance fields
.field public final ۗ:Landroid/view/LayoutInflater;

.field public ۙ:Ll/۟ۜۡ;

.field public ۛ:Ljava/util/ArrayList;

.field public ۤ:Ljava/util/List;

.field public final ۨ:I

.field public ۫:Z

.field public final ۬:Ljava/lang/Object;

.field public ᩶:I

.field public final ᩸:Landroid/content/Context;

.field public ᩹:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(ILandroid/content/Context;Ljava/util/List;)V
    .locals 1

    .line 218
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 86
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֫᩷ۡ;->۬:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 126
    iput-boolean v0, p0, Ll/֫᩷ۡ;->۫:Z

    .line 219
    iput-object p2, p0, Ll/֫᩷ۡ;->᩸:Landroid/content/Context;

    .line 220
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    iput-object p2, p0, Ll/֫᩷ۡ;->ۗ:Landroid/view/LayoutInflater;

    .line 221
    iput p1, p0, Ll/֫᩷ۡ;->᩶:I

    iput p1, p0, Ll/֫᩷ۡ;->ۨ:I

    .line 222
    iput-object p3, p0, Ll/֫᩷ۡ;->ۤ:Ljava/util/List;

    return-void
.end method

.method private ֫(Landroid/view/LayoutInflater;ILandroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 0

    if-nez p3, :cond_0

    const/4 p3, 0x0

    .line 440
    invoke-virtual {p1, p5, p4, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p3

    .line 448
    :cond_0
    :try_start_0
    move-object p1, p3

    check-cast p1, Landroid/widget/TextView;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 465
    invoke-virtual {p0, p2}, Ll/֫᩷ۡ;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    .line 466
    instance-of p4, p2, Ljava/lang/CharSequence;

    if-eqz p4, :cond_1

    .line 467
    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p3

    :cond_1
    if-nez p2, :cond_2

    const-string p2, ""

    goto :goto_0

    .line 469
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p3

    :catch_0
    move-exception p1

    .line 461
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "ArrayAdapter requires the resource ID to be a TextView"

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static bridge synthetic ֫(Ll/֫᩷ۡ;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫᩷ۡ;->۬:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/֫᩷ۡ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֫᩷ۡ;->ۛ:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫᩷ۡ;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֫᩷ۡ;->ۤ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/֫᩷ۡ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫᩷ۡ;->ۤ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/֫᩷ۡ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫᩷ۡ;->ۛ:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final getAutofillOptions()[Ljava/lang/CharSequence;
    .locals 1

    .line 556
    invoke-super {p0}, Landroid/widget/BaseAdapter;->getAutofillOptions()[Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 398
    iget-object v0, p0, Ll/֫᩷ۡ;->ۤ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 517
    iget-object v0, p0, Ll/֫᩷ۡ;->᩹:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֫᩷ۡ;->ۗ:Landroid/view/LayoutInflater;

    :cond_0
    move-object v2, v0

    .line 518
    iget v6, p0, Ll/֫᩷ۡ;->᩶:I

    move-object v1, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Ll/֫᩷ۡ;->֫(Landroid/view/LayoutInflater;ILandroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final getDropDownViewTheme()Landroid/content/res/Resources$Theme;
    .locals 1

    .line 511
    iget-object v0, p0, Ll/֫᩷ۡ;->᩹:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    return-object v0
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .line 540
    iget-object v0, p0, Ll/֫᩷ۡ;->ۙ:Ll/۟ۜۡ;

    if-nez v0, :cond_0

    .line 541
    new-instance v0, Ll/۟ۜۡ;

    invoke-direct {v0, p0}, Ll/۟ۜۡ;-><init>(Ll/֫᩷ۡ;)V

    iput-object v0, p0, Ll/֫᩷ۡ;->ۙ:Ll/۟ۜۡ;

    .line 543
    :cond_0
    iget-object v0, p0, Ll/֫᩷ۡ;->ۙ:Ll/۟ۜۡ;

    return-object v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 405
    :try_start_0
    iget-object v0, p0, Ll/֫᩷ۡ;->ۤ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 430
    iget-object v1, p0, Ll/֫᩷ۡ;->ۗ:Landroid/view/LayoutInflater;

    iget v5, p0, Ll/֫᩷ۡ;->ۨ:I

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Ll/֫᩷ۡ;->֫(Landroid/view/LayoutInflater;ILandroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final notifyDataSetChanged()V
    .locals 1

    .line 363
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    const/4 v0, 0x1

    .line 364
    iput-boolean v0, p0, Ll/֫᩷ۡ;->۫:Z

    return-void
.end method

.method public final setDropDownViewTheme(Landroid/content/res/Resources$Theme;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 499
    iput-object p1, p0, Ll/֫᩷ۡ;->᩹:Landroid/view/LayoutInflater;

    return-void

    .line 500
    :cond_0
    iget-object v0, p0, Ll/֫᩷ۡ;->ۗ:Landroid/view/LayoutInflater;

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    if-ne p1, v1, :cond_1

    .line 501
    iput-object v0, p0, Ll/֫᩷ۡ;->᩹:Landroid/view/LayoutInflater;

    return-void

    .line 503
    :cond_1
    new-instance v0, Ll/۫᩻;

    iget-object v1, p0, Ll/֫᩷ۡ;->᩸:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Ll/۫᩻;-><init>(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V

    .line 504
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Ll/֫᩷ۡ;->᩹:Landroid/view/LayoutInflater;

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 333
    iget-object v0, p0, Ll/֫᩷ۡ;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 334
    :try_start_0
    iget-object v1, p0, Ll/֫᩷ۡ;->ۛ:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 335
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    .line 337
    :cond_0
    iget-object v1, p0, Ll/֫᩷ۡ;->ۤ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 340
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 341
    iget-boolean v0, p0, Ll/֫᩷ۡ;->۫:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/֫᩷ۡ;->notifyDataSetChanged()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 340
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 234
    iget-object v0, p0, Ll/֫᩷ۡ;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 235
    :try_start_0
    iget-object v1, p0, Ll/֫᩷ۡ;->ۛ:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 236
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 238
    :cond_0
    iget-object v1, p0, Ll/֫᩷ۡ;->ۤ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    iget-boolean p1, p0, Ll/֫᩷ۡ;->۫:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ll/֫᩷ۡ;->notifyDataSetChanged()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 241
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 2

    .line 260
    iget-object v0, p0, Ll/֫᩷ۡ;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 261
    :try_start_0
    iget-object v1, p0, Ll/֫᩷ۡ;->ۛ:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 262
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 264
    :cond_0
    iget-object v1, p0, Ll/֫᩷ۡ;->ۤ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 267
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 268
    iget-boolean p1, p0, Ll/֫᩷ۡ;->۫:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ll/֫᩷ۡ;->notifyDataSetChanged()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 267
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 382
    iput-boolean v0, p0, Ll/֫᩷ۡ;->۫:Z

    return-void
.end method
