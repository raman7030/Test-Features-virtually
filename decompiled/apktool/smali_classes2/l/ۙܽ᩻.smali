.class public final Ll/ۙܽ᩻;
.super Ljava/lang/Object;
.source "29SR"


# instance fields
.field public ֫:Ll/۠ܽ᩻;

.field public ۜ:I

.field public ۧ:Landroid/graphics/drawable/Drawable;

.field public ܳ:Ll/᩶ܽ᩻;

.field public ܽ:Ll/֡ۚۢ;

.field public ܿ:Ll/ۢۢۡ;

.field public ᩳ:Ljava/util/ArrayList;

.field public ᩷:Landroid/widget/TextView;

.field public final ᩻:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;)V
    .locals 5

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/ۙܽ᩻;->᩻:Ljava/util/LinkedList;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۙܽ᩻;->ᩳ:Ljava/util/ArrayList;

    .line 49
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 50
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ֨ۢ;

    .line 51
    iget-object v3, p0, Ll/ۙܽ᩻;->ᩳ:Ljava/util/ArrayList;

    new-instance v4, Ll/᩹ܽ᩻;

    invoke-direct {v4, p0, v2, v1}, Ll/᩹ܽ᩻;-><init>(Ll/ۙܽ᩻;Ll/ۨ֨ۢ;I)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v0, 0x7f08014c

    .line 794
    invoke-static {p1, v0}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/ۙܽ᩻;->ۧ:Landroid/graphics/drawable/Drawable;

    .line 54
    sget v1, Ll/᩹֡᩷;->ۜ֫:I

    invoke-static {v1}, Ll/ܰ᩸᩷;->֫(I)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    const v0, 0x7f0d00cd

    .line 56
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a04e6

    .line 57
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/᩻ۡۡ;

    const v2, 0x7f0a0631

    .line 58
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/ۙܽ᩻;->᩷:Landroid/widget/TextView;

    const v2, 0x7f0a02e0

    .line 59
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۢۢۡ;

    iput-object v2, p0, Ll/ۙܽ᩻;->ܿ:Ll/ۢۢۡ;

    .line 60
    new-instance v3, Ll/۠ܽ᩻;

    invoke-direct {v3, p0}, Ll/۠ܽ᩻;-><init>(Ll/ۙܽ᩻;)V

    iput-object v3, p0, Ll/ۙܽ᩻;->֫:Ll/۠ܽ᩻;

    invoke-virtual {v2, v3}, Ll/ۢۢۡ;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 61
    new-instance v3, Ll/ۚܽ᩻;

    invoke-direct {v3, p0}, Ll/ۚܽ᩻;-><init>(Ll/ۙܽ᩻;)V

    invoke-virtual {v2, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const/4 v3, 0x1

    .line 68
    invoke-virtual {v2, v3}, Ll/ۢۢۡ;->setFastScrollEnabled(Z)V

    .line 69
    invoke-static {v2}, Ll/ۙ᩸ۡ;->֫(Landroid/widget/ListView;)V

    .line 70
    new-instance v2, Ll/֨ܽ᩻;

    invoke-direct {v2, p0}, Ll/֨ܽ᩻;-><init>(Ll/ۙܽ᩻;)V

    invoke-virtual {v1, v2}, Ll/᩻ۡۡ;->֫(Ll/ܿۡۡ;)V

    .line 81
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 82
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance v0, Ll/۫ۗ᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p2}, Ll/۫ۗ᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p2, 0x7f12070a

    .line 83
    invoke-virtual {p1, p2, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p2, 0x7f12015e

    const/4 v0, 0x0

    .line 88
    invoke-virtual {p1, p2, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 89
    invoke-virtual {p1}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/ۙܽ᩻;->ܽ:Ll/֡ۚۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/ۙܽ᩻;)V
    .locals 1

    .line 124
    iget-object p0, p0, Ll/ۙܽ᩻;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܽ᩻;

    .line 125
    iget-object v0, v0, Ll/᩹ܽ᩻;->ܳ:Ll/ۨ֨ۢ;

    invoke-virtual {v0}, Ll/ۨ֨ۢ;->֫()Ljava/lang/String;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۙܽ᩻;I)V
    .locals 2

    .line 62
    iget-object v0, p0, Ll/ۙܽ᩻;->֫:Ll/۠ܽ᩻;

    invoke-static {v0}, Ll/۠ܽ᩻;->֫(Ll/۠ܽ᩻;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ܽ᩻;

    iget p1, p1, Ll/᩹ܽ᩻;->ᩳ:I

    .line 63
    iget v1, p0, Ll/ۙܽ᩻;->ۜ:I

    if-eq v1, p1, :cond_0

    .line 64
    iput p1, p0, Ll/ۙܽ᩻;->ۜ:I

    .line 65
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۙܽ᩻;Ljava/util/LinkedList;)V
    .locals 6

    .line 130
    :goto_0
    iget-object v0, p0, Ll/ۙܽ᩻;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 131
    :cond_0
    iget-object v0, p0, Ll/ۙܽ᩻;->᩻:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x64

    if-nez v0, :cond_4

    .line 132
    iget-object v0, p0, Ll/ۙܽ᩻;->ܿ:Ll/ۢۢۡ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    move-result v0

    iget-object v4, p0, Ll/ۙܽ᩻;->ܿ:Ll/ۢۢۡ;

    invoke-virtual {v4}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v4

    sub-int/2addr v0, v4

    const/4 v4, 0x1

    add-int/2addr v0, v4

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 134
    iget-object v0, p0, Ll/ۙܽ᩻;->᩻:Ljava/util/LinkedList;

    monitor-enter v0

    .line 135
    :goto_1
    :try_start_0
    iget-object v5, p0, Ll/ۙܽ᩻;->᩻:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->size()I

    move-result v5

    if-le v5, v4, :cond_1

    .line 136
    iget-object v5, p0, Ll/ۙܽ᩻;->᩻:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    goto :goto_1

    .line 138
    :cond_1
    iget-object v4, p0, Ll/ۙܽ᩻;->᩻:Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ܽ᩻;

    .line 139
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 296
    iget-boolean v0, v4, Ll/᩹ܽ᩻;->ܽ:Z

    if-nez v0, :cond_2

    goto :goto_2

    .line 300
    :cond_2
    iput-boolean v1, v4, Ll/᩹ܽ᩻;->ܽ:Z

    .line 301
    iget-object v0, v4, Ll/᩹ܽ᩻;->ܳ:Ll/ۨ֨ۢ;

    iget-object v0, v0, Ll/ۨ֨ۢ;->ܽ:Landroid/content/pm/PackageInfo;

    invoke-static {v0}, Ll/ۛۢۡ;->֫(Landroid/content/pm/PackageInfo;)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v0

    .line 302
    new-instance v1, Ll/᩸ܽ᩻;

    invoke-direct {v1, v4, v0}, Ll/᩸ܽ᩻;-><init>(Ll/᩹ܽ᩻;Landroid/graphics/drawable/BitmapDrawable;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 141
    :goto_2
    iget-object v0, p0, Ll/ۙܽ᩻;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۙܽ᩻;->ܿ:Ll/ۢۢۡ;

    invoke-virtual {v0}, Ll/ۢۢۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 142
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_2

    .line 144
    :cond_3
    iget-object v0, p0, Ll/ۙܽ᩻;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_4

    :catchall_0
    move-exception p0

    .line 139
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 148
    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 149
    iget-object v0, p0, Ll/ۙܽ᩻;->᩻:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    .line 152
    :cond_5
    invoke-virtual {p1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܽ᩻;

    .line 296
    iget-boolean v4, v0, Ll/᩹ܽ᩻;->ܽ:Z

    if-nez v4, :cond_6

    goto :goto_3

    .line 300
    :cond_6
    iput-boolean v1, v0, Ll/᩹ܽ᩻;->ܽ:Z

    .line 301
    iget-object v4, v0, Ll/᩹ܽ᩻;->ܳ:Ll/ۨ֨ۢ;

    iget-object v4, v4, Ll/ۨ֨ۢ;->ܽ:Landroid/content/pm/PackageInfo;

    invoke-static {v4}, Ll/ۛۢۡ;->֫(Landroid/content/pm/PackageInfo;)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v4

    .line 302
    new-instance v5, Ll/᩸ܽ᩻;

    invoke-direct {v5, v0, v4}, Ll/᩸ܽ᩻;-><init>(Ll/᩹ܽ᩻;Landroid/graphics/drawable/BitmapDrawable;)V

    invoke-static {v5}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 153
    :goto_3
    iget-object v0, p0, Ll/ۙܽ᩻;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Ll/ۙܽ᩻;->ܿ:Ll/ۢۢۡ;

    invoke-virtual {v0}, Ll/ۢۢۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 154
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_3

    .line 156
    :cond_7
    iget-object v0, p0, Ll/ۙܽ᩻;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_8
    :goto_4
    return-void
.end method

.method public static synthetic ֫(Ll/ۙܽ᩻;Ljava/util/List;)V
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ۙܽ᩻;->ܳ:Ll/᩶ܽ᩻;

    if-eqz v0, :cond_0

    .line 85
    iget p0, p0, Ll/ۙܽ᩻;->ۜ:I

    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨ֨ۢ;

    invoke-interface {v0, p0, p1}, Ll/᩶ܽ᩻;->֫(ILl/ۨ֨ۢ;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۙܽ᩻;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽ᩻;->᩷:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۙܽ᩻;)Ll/۠ܽ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽ᩻;->֫:Ll/۠ܽ᩻;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۙܽ᩻;)Ljava/util/LinkedList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽ᩻;->᩻:Ljava/util/LinkedList;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۙܽ᩻;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽ᩻;->ۧ:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۙܽ᩻;)Ll/ۢۢۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽ᩻;->ܿ:Ll/ۢۢۡ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۙܽ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙܽ᩻;->ᩳ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ۙܽ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۙܽ᩻;->ۜ:I

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 110
    iget-object v0, p0, Ll/ۙܽ᩻;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 117
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 118
    iget-object v1, p0, Ll/ۙܽ᩻;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܽ᩻;

    .line 119
    iget-boolean v3, v2, Ll/᩹ܽ᩻;->ܽ:Z

    if-eqz v3, :cond_0

    .line 120
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 123
    :cond_1
    sget-object v1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/֡ܽ᩻;

    invoke-direct {v2, p0}, Ll/֡ܽ᩻;-><init>(Ll/ۙܽ᩻;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 128
    new-instance v2, Ll/֡᩷ᩳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0, v0}, Ll/֡᩷ᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 103
    iput p1, p0, Ll/ۙܽ᩻;->ۜ:I

    .line 104
    iget-object v0, p0, Ll/ۙܽ᩻;->ܿ:Ll/ۢۢۡ;

    invoke-virtual {v0, p1}, Ll/ۢۢۡ;->setSelection(I)V

    .line 105
    iget-object p1, p0, Ll/ۙܽ᩻;->֫:Ll/۠ܽ᩻;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫(Ll/᩶ܽ᩻;)V
    .locals 0

    .line 98
    iput-object p1, p0, Ll/ۙܽ᩻;->ܳ:Ll/᩶ܽ᩻;

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ۙܽ᩻;->᩷:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method
