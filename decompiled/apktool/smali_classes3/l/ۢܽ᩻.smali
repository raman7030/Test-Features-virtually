.class public final Ll/ۢܽ᩻;
.super Ljava/lang/Object;
.source "X992"


# instance fields
.field public ֫:Ll/ܳܽ᩻;

.field public ۜ:Landroid/widget/TextView;

.field public ۧ:Ll/֡ۚۢ;

.field public ܳ:Ll/᩹۬ۜ;

.field public ܽ:Ljava/util/ArrayList;

.field public ܿ:Ll/᩸۬ۜ;

.field public ᩳ:Ll/ۢۢۡ;

.field public final ᩻:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ljava/util/ArrayList;)V
    .locals 5

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/ۢܽ᩻;->᩻:Ljava/util/LinkedList;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۢܽ᩻;->ܽ:Ljava/util/ArrayList;

    .line 48
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 49
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/PackageInfo;

    .line 50
    iget-object v3, p0, Ll/ۢܽ᩻;->ܽ:Ljava/util/ArrayList;

    new-instance v4, Ll/᩷ܽ᩻;

    invoke-direct {v4, p0, v2}, Ll/᩷ܽ᩻;-><init>(Ll/ۢܽ᩻;Landroid/content/pm/PackageInfo;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const p2, 0x7f0d00cd

    .line 53
    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p2

    const v0, 0x7f0a04e6

    .line 54
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/᩻ۡۡ;

    const v1, 0x7f0a0631

    .line 55
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/ۢܽ᩻;->ۜ:Landroid/widget/TextView;

    const v1, 0x7f0a02e0

    .line 56
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۢۢۡ;

    iput-object v1, p0, Ll/ۢܽ᩻;->ᩳ:Ll/ۢۢۡ;

    .line 57
    new-instance v2, Ll/ܳܽ᩻;

    invoke-direct {v2, p0}, Ll/ܳܽ᩻;-><init>(Ll/ۢܽ᩻;)V

    iput-object v2, p0, Ll/ۢܽ᩻;->֫:Ll/ܳܽ᩻;

    invoke-virtual {v1, v2}, Ll/ۢۢۡ;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 58
    new-instance v2, Ll/ᩳܽ᩻;

    invoke-direct {v2, p0}, Ll/ᩳܽ᩻;-><init>(Ll/ۢܽ᩻;)V

    invoke-virtual {v1, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const/4 v2, 0x1

    .line 63
    invoke-virtual {v1, v2}, Ll/ۢۢۡ;->setFastScrollEnabled(Z)V

    .line 64
    invoke-static {v1}, Ll/ۙ᩸ۡ;->֫(Landroid/widget/ListView;)V

    .line 65
    new-instance v1, Ll/ܿܽ᩻;

    invoke-direct {v1, p0}, Ll/ܿܽ᩻;-><init>(Ll/ۢܽ᩻;)V

    invoke-virtual {v0, v1}, Ll/᩻ۡۡ;->֫(Ll/ܿۡۡ;)V

    .line 76
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 77
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance p2, Ll/᩺ۛ᩷;

    const/4 v0, 0x1

    invoke-direct {p2, v0, p0}, Ll/᩺ۛ᩷;-><init>(ILjava/lang/Object;)V

    const v0, 0x7f12070a

    .line 78
    invoke-virtual {p1, v0, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p2, 0x7f12015e

    const/4 v0, 0x0

    .line 91
    invoke-virtual {p1, p2, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 92
    invoke-virtual {p1}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢܽ᩻;->ۧ:Ll/֡ۚۢ;

    return-void
.end method

.method public static ֫(Ll/ۢܽ᩻;)V
    .locals 4

    .line 79
    iget-object v0, p0, Ll/ۢܽ᩻;->ܿ:Ll/᩸۬ۜ;

    if-eqz v0, :cond_2

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 81
    iget-object v1, p0, Ll/ۢܽ᩻;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ܽ᩻;

    .line 82
    iget-boolean v3, v2, Ll/᩷ܽ᩻;->ܽ:Z

    if-eqz v3, :cond_0

    .line 83
    iget-object v2, v2, Ll/᩷ܽ᩻;->ܳ:Landroid/content/pm/PackageInfo;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 87
    iget-object p0, p0, Ll/ۢܽ᩻;->ܿ:Ll/᩸۬ۜ;

    iget-object v1, p0, Ll/᩸۬ۜ;->᩸:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object p0, p0, Ll/᩸۬ۜ;->᩹:Ljava/lang/Object;

    check-cast p0, Ll/ܽۢܳ;

    invoke-static {v1, p0, v0}, Ll/ܽܽ᩻;->֫(Ljava/util/List;Ll/ܽۢܳ;Ljava/util/ArrayList;)V

    :cond_2
    return-void
.end method

.method public static synthetic ֫(Ll/ۢܽ᩻;I)V
    .locals 1

    .line 59
    iget-object p0, p0, Ll/ۢܽ᩻;->֫:Ll/ܳܽ᩻;

    invoke-static {p0}, Ll/ܳܽ᩻;->֫(Ll/ܳܽ᩻;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ܽ᩻;

    .line 60
    iget-boolean v0, p1, Ll/᩷ܽ᩻;->ܽ:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p1, Ll/᩷ܽ᩻;->ܽ:Z

    .line 61
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public static ֫(Ll/ۢܽ᩻;Ljava/util/LinkedList;)V
    .locals 6

    .line 133
    :goto_0
    iget-object v0, p0, Ll/ۢܽ᩻;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 134
    :cond_0
    iget-object v0, p0, Ll/ۢܽ᩻;->᩻:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x64

    if-nez v0, :cond_4

    .line 135
    iget-object v0, p0, Ll/ۢܽ᩻;->ᩳ:Ll/ۢۢۡ;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    move-result v0

    iget-object v4, p0, Ll/ۢܽ᩻;->ᩳ:Ll/ۢۢۡ;

    invoke-virtual {v4}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v4

    sub-int/2addr v0, v4

    const/4 v4, 0x1

    add-int/2addr v0, v4

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 137
    iget-object v0, p0, Ll/ۢܽ᩻;->᩻:Ljava/util/LinkedList;

    monitor-enter v0

    .line 138
    :goto_1
    :try_start_0
    iget-object v5, p0, Ll/ۢܽ᩻;->᩻:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->size()I

    move-result v5

    if-le v5, v4, :cond_1

    .line 139
    iget-object v5, p0, Ll/ۢܽ᩻;->᩻:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    goto :goto_1

    .line 141
    :cond_1
    iget-object v4, p0, Ll/ۢܽ᩻;->᩻:Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ܽ᩻;

    .line 142
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    iget-boolean v0, v4, Ll/᩷ܽ᩻;->ܿ:Z

    if-nez v0, :cond_2

    goto :goto_2

    .line 288
    :cond_2
    iput-boolean v1, v4, Ll/᩷ܽ᩻;->ܿ:Z

    .line 289
    iget-object v0, v4, Ll/᩷ܽ᩻;->ܳ:Landroid/content/pm/PackageInfo;

    invoke-static {v0}, Ll/ۛۢۡ;->֫(Landroid/content/pm/PackageInfo;)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v0

    .line 290
    new-instance v1, Ll/ۜܽ᩻;

    invoke-direct {v1, v4, v0}, Ll/ۜܽ᩻;-><init>(Ll/᩷ܽ᩻;Landroid/graphics/drawable/BitmapDrawable;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 144
    :goto_2
    iget-object v0, p0, Ll/ۢܽ᩻;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۢܽ᩻;->ᩳ:Ll/ۢۢۡ;

    invoke-virtual {v0}, Ll/ۢۢۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 145
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_2

    .line 147
    :cond_3
    iget-object v0, p0, Ll/ۢܽ᩻;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_4

    :catchall_0
    move-exception p0

    .line 142
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 151
    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 152
    iget-object v0, p0, Ll/ۢܽ᩻;->᩻:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    .line 155
    :cond_5
    invoke-virtual {p1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ܽ᩻;

    .line 284
    iget-boolean v4, v0, Ll/᩷ܽ᩻;->ܿ:Z

    if-nez v4, :cond_6

    goto :goto_3

    .line 288
    :cond_6
    iput-boolean v1, v0, Ll/᩷ܽ᩻;->ܿ:Z

    .line 289
    iget-object v4, v0, Ll/᩷ܽ᩻;->ܳ:Landroid/content/pm/PackageInfo;

    invoke-static {v4}, Ll/ۛۢۡ;->֫(Landroid/content/pm/PackageInfo;)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v4

    .line 290
    new-instance v5, Ll/ۜܽ᩻;

    invoke-direct {v5, v0, v4}, Ll/ۜܽ᩻;-><init>(Ll/᩷ܽ᩻;Landroid/graphics/drawable/BitmapDrawable;)V

    invoke-static {v5}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 156
    :goto_3
    iget-object v0, p0, Ll/ۢܽ᩻;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Ll/ۢܽ᩻;->ᩳ:Ll/ۢۢۡ;

    invoke-virtual {v0}, Ll/ۢۢۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 157
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_3

    .line 159
    :cond_7
    iget-object v0, p0, Ll/ۢܽ᩻;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_8
    :goto_4
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۢܽ᩻;)Ll/ܳܽ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢܽ᩻;->֫:Ll/ܳܽ᩻;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۢܽ᩻;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢܽ᩻;->ۜ:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۢܽ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢܽ᩻;->ܽ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۢܽ᩻;)Ljava/util/LinkedList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢܽ᩻;->᩻:Ljava/util/LinkedList;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۢܽ᩻;)Ll/ۢۢۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢܽ᩻;->ᩳ:Ll/ۢۢۡ;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 112
    iget-object v0, p0, Ll/ۢܽ᩻;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 113
    iget-object v1, p0, Ll/ۢܽ᩻;->ܳ:Ll/᩹۬ۜ;

    if-eqz v1, :cond_0

    .line 114
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 116
    iget-object v1, p0, Ll/ۢܽ᩻;->ܳ:Ll/᩹۬ۜ;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 126
    iget-object v1, p0, Ll/ۢܽ᩻;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ܽ᩻;

    .line 127
    iget-boolean v3, v2, Ll/᩷ܽ᩻;->ܿ:Z

    if-eqz v3, :cond_1

    .line 128
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 131
    :cond_2
    sget-object v1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/ۖ֨ۡ;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p0, v0}, Ll/ۖ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۢܽ᩻;->ۜ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ֫(Ll/᩸۬ۜ;)V
    .locals 0

    .line 107
    iput-object p1, p0, Ll/ۢܽ᩻;->ܿ:Ll/᩸۬ۜ;

    return-void
.end method

.method public final ֫(Ll/᩹۬ۜ;)V
    .locals 4

    const v0, 0x7f120a76

    .line 96
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۢܽ᩻;->ۧ:Ll/֡ۚۢ;

    const/4 v3, -0x3

    invoke-virtual {v2, v3, v0, v1}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 97
    iput-object p1, p0, Ll/ۢܽ᩻;->ܳ:Ll/᩹۬ۜ;

    return-void
.end method
