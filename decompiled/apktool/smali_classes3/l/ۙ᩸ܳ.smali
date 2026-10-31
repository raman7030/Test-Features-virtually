.class public final Ll/ۙ᩸ܳ;
.super Ll/۫ܶܳ;
.source "Y4ZV"


# static fields
.field public static final synthetic ۛ:I

.field public static ۨ:Ljava/util/HashMap;


# instance fields
.field public ۤ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۙ᩸ܳ;->ۨ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;)V
    .locals 1

    const v0, 0x7f12052f

    .line 40
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 28
    invoke-direct {p0, p1, v0, v0, p2}, Ll/۫ܶܳ;-><init>(Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;Ll/ۗܶܳ;)V

    .line 41
    new-instance v0, Ll/ۚ᩸ܳ;

    invoke-direct {v0, p0, p2}, Ll/ۚ᩸ܳ;-><init>(Ll/ۙ᩸ܳ;Ll/ۗܶܳ;)V

    invoke-static {p1, v0}, Ll/᩵᩸ܿ;->֫(Lbin/mt/plus/Main;Ll/ۚ᩸ܳ;)V

    .line 45
    new-instance v0, Ll/֨᩸ܳ;

    invoke-direct {v0, p0, p2}, Ll/֨᩸ܳ;-><init>(Ll/ۙ᩸ܳ;Ll/ۗܶܳ;)V

    invoke-static {p1, v0}, Ll/ᩴܶܿ;->֫(Lbin/mt/plus/Main;Ll/֨᩸ܳ;)V

    .line 49
    invoke-direct {p0}, Ll/ۙ᩸ܳ;->ܿ()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 83
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 0
    invoke-static {v1, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 86
    :cond_0
    sget-object v0, Ll/ۙ᩸ܳ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۙ᩸ܳ;Ll/ۗܶܳ;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ll/ۙ᩸ܳ;->ܿ()V

    .line 47
    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public static ֫(Ll/ۙ᩸ܳ;Ll/᩶᩸ܳ;)V
    .locals 4

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 93
    iget-object v0, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0, p0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result v1

    sub-int v1, p1, v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 273
    iget v3, p0, Ll/ۙ᩸ܳ;->ۤ:I

    if-lt v1, v3, :cond_0

    .line 274
    iget-object v3, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 275
    iget p0, p0, Ll/ۙ᩸ܳ;->ۤ:I

    sub-int/2addr v1, p0

    invoke-static {v1}, Ll/ᩴܶܿ;->֫(I)V

    .line 276
    invoke-virtual {v0, p1, v2}, Ll/᩶ۗۧ;->notifyItemRangeRemoved(II)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۙ᩸ܳ;Ll/᩶᩸ܳ;Ll/᩶᩸ܳ;)V
    .locals 5

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 258
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    .line 93
    iget-object v0, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0, p0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result v1

    sub-int v1, p1, v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, p0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result v2

    sub-int v2, p2, v2

    add-int/lit8 v2, v2, -0x1

    .line 261
    iget v3, p0, Ll/ۙ᩸ܳ;->ۤ:I

    sub-int v4, v1, v3

    sub-int v3, v2, v3

    invoke-static {v4, v3}, Ll/ᩴܶܿ;->֫(II)V

    .line 262
    iget-object p0, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-static {v1, v2, p0}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 263
    invoke-virtual {v0, p1, p2}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ۙ᩸ܳ;Ll/ۗܶܳ;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ll/ۙ᩸ܳ;->ܿ()V

    .line 43
    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public static ۧ(Ll/ۙ᩸ܳ;Ll/᩶᩸ܳ;)V
    .locals 4

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 93
    iget-object v0, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0, p0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result v1

    sub-int v1, p1, v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 290
    iget v3, p0, Ll/ۙ᩸ܳ;->ۤ:I

    if-lt v1, v3, :cond_0

    .line 291
    iget-object v3, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 292
    iget p0, p0, Ll/ۙ᩸ܳ;->ۤ:I

    sub-int/2addr v1, p0

    invoke-static {v1}, Ll/ᩴܶܿ;->ۧ(I)V

    .line 293
    invoke-virtual {v0, p1, v2}, Ll/᩶ۗۧ;->notifyItemRangeRemoved(II)V

    :cond_0
    return-void
.end method

.method private declared-synchronized ܿ()V
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 93
    :try_start_0
    iget-object v1, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 94
    iget-object v1, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    new-instance v9, Ll/᩹᩸ܳ;

    iget-object v4, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    const-string v6, "/"

    const-string v7, "/system"

    sget-object v8, Ll/᩶ۖܳ;->ۘ֫:Ll/᩶ۖܳ;

    const v5, 0x7f1208bf

    move-object v2, v9

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Ll/᩹᩸ܳ;-><init>(Ll/ۙ᩸ܳ;Lbin/mt/plus/Main;ILjava/lang/String;Ljava/lang/String;Ll/᩶ۖܳ;)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    iget-object v1, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    new-instance v9, Ll/᩹᩸ܳ;

    iget-object v4, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    sget-object v2, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    sget-object v8, Ll/᩶ۖܳ;->֡֫:Ll/᩶ۖܳ;

    const v5, 0x7f1209e3

    const/4 v7, 0x0

    move-object v2, v9

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Ll/᩹᩸ܳ;-><init>(Ll/ۙ᩸ܳ;Lbin/mt/plus/Main;ILjava/lang/String;Ljava/lang/String;Ll/᩶ۖܳ;)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    invoke-static {}, Ll/᩵᩸ܿ;->ۧ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ᩸ܿ;

    .line 97
    iget-object v3, v2, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v8

    .line 98
    iget-object v7, v2, Ll/ۘ᩸ܿ;->ۧ:Ljava/lang/String;

    .line 99
    iget-object v2, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    new-instance v3, Ll/᩹᩸ܳ;

    iget-object v6, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    sget-object v9, Ll/᩶ۖܳ;->֡֫:Ll/᩶ۖܳ;

    const/4 v10, 0x0

    move-object v4, v3

    move-object v5, p0

    invoke-direct/range {v4 .. v10}, Ll/᩹᩸ܳ;-><init>(Ll/ۙ᩸ܳ;Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;Ll/᩶ۖܳ;Ll/ۘܶܿ;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 101
    :cond_0
    iget-object v1, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, p0, Ll/ۙ᩸ܳ;->ۤ:I

    .line 102
    invoke-static {}, Ll/ᩴܶܿ;->ܿ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ll/ۘܶܿ;

    .line 103
    invoke-virtual {v9}, Ll/ۘܶܿ;->֫()Ljava/lang/String;

    move-result-object v7

    .line 104
    iget-object v6, v9, Ll/ۘܶܿ;->ܿ:Ljava/lang/String;

    .line 105
    iget-object v2, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    new-instance v10, Ll/᩹᩸ܳ;

    iget-object v5, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    sget-object v8, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    move-object v3, v10

    move-object v4, p0

    invoke-direct/range {v3 .. v9}, Ll/᩹᩸ܳ;-><init>(Ll/ۙ᩸ܳ;Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;Ll/᩶ۖܳ;Ll/ۘܶܿ;)V

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 107
    :cond_1
    sget-object v1, Ll/ۙ᩸ܳ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    const/4 v1, 0x0

    .line 108
    :goto_2
    iget-object v2, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 109
    iget-object v2, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩸ܳ;

    .line 110
    iget-object v3, v2, Ll/᩹᩸ܳ;->ۗ:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 111
    sget-object v4, Ll/ۙ᩸ܳ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    iget-object v2, v2, Ll/᩹᩸ܳ;->۫:Ljava/lang/String;

    invoke-virtual {v4, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 114
    :cond_3
    invoke-static {}, Ll/ᩴܶܿ;->ᩳ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘܶܿ;

    .line 115
    sget-object v3, Ll/ۙ᩸ܳ;->ۨ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ll/ۘܶܿ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    iget-object v2, v2, Ll/ۘܶܿ;->ܿ:Ljava/lang/String;

    invoke-static {v3, v4, v2}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 117
    :cond_4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 62
    iget-object v0, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/ۗܶܳ;->ܽ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 65
    :cond_0
    new-instance v0, Ll/᩸ۖ;

    iget-object v2, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    const v3, 0x800055

    invoke-direct {v0, v2, p1, v3}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 66
    invoke-static {p1}, Ll/۟᩷ۡ;->᩷(Landroid/view/View;)V

    .line 67
    invoke-virtual {v0}, Ll/᩸ۖ;->ᩳ()V

    .line 68
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v2, 0x7f1202d1

    .line 69
    invoke-interface {p1, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f0801ce

    .line 70
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 71
    new-instance p1, Ll/۠᩸ܳ;

    invoke-direct {p1, p0}, Ll/۠᩸ܳ;-><init>(Ll/ۙ᩸ܳ;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 78
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/ܳܶܳ;I)V
    .locals 13

    .line 162
    check-cast p1, Ll/᩶᩸ܳ;

    .line 163
    iget-object v0, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩹᩸ܳ;

    .line 164
    invoke-static {p1, p2}, Ll/᩶᩸ܳ;->֫(Ll/᩶᩸ܳ;Ll/᩹᩸ܳ;)V

    iget-object v0, p1, Ll/ܳܶܳ;->ۗ:Landroid/widget/TextView;

    .line 165
    iget-object v1, p1, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    iget-object v2, p2, Ll/᩹᩸ܳ;->۫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    invoke-static {p1}, Ll/᩶᩸ܳ;->֫(Ll/᩶᩸ܳ;)Ll/ۖۡۡ;

    move-result-object v1

    sget-object v2, Ll/ܺۡۡ;->᩶:Ll/ܺۡۡ;

    invoke-virtual {v1, v2}, Ll/ۖۡۡ;->֫(Ll/ܺۡۡ;)V

    .line 167
    iget-object v1, p2, Ll/᩹᩸ܳ;->ۤ:Ll/ۘܶܿ;

    const/4 v2, 0x0

    const-string v3, ""

    if-nez v1, :cond_3

    .line 168
    iget-object v1, p2, Ll/᩹᩸ܳ;->᩶:Ljava/lang/String;

    invoke-static {p1}, Ll/᩶᩸ܳ;->֫(Ll/᩶᩸ܳ;)Ll/ۖۡۡ;

    move-result-object v4

    :try_start_0
    const-string v5, "/"

    .line 327
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 328
    invoke-static {}, Ll/ۖ۬ܳ;->֫()Ll/ܺ۬ܳ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 330
    invoke-virtual {v1}, Ll/ܺ۬ܳ;->֫()J

    move-result-wide v5

    .line 331
    invoke-virtual {v1}, Ll/ܺ۬ܳ;->ۧ()J

    move-result-wide v7

    goto :goto_0

    .line 333
    :cond_0
    new-instance v1, Ll/ۚۤܳ;

    const-string v5, "/system"

    const-string v6, "/data"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ll/ۚۤܳ;-><init>([Ljava/lang/String;)V

    .line 334
    invoke-virtual {v1}, Ll/ۚۤܳ;->֫()J

    move-result-wide v5

    .line 335
    invoke-virtual {v1}, Ll/ۚۤܳ;->ۧ()J

    move-result-wide v7

    goto :goto_0

    .line 338
    :cond_1
    new-instance v5, Ll/ۚۤܳ;

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v1}, Ll/ۚۤܳ;-><init>([Ljava/lang/String;)V

    .line 339
    invoke-virtual {v5}, Ll/ۚۤܳ;->֫()J

    move-result-wide v6

    .line 340
    invoke-virtual {v5}, Ll/ۚۤܳ;->ۧ()J

    move-result-wide v8

    move-wide v5, v6

    move-wide v7, v8

    :goto_0
    const-wide/16 v9, 0x0

    cmp-long v1, v7, v9

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    sub-long v9, v7, v5

    const-wide/16 v11, 0x64

    mul-long v11, v11, v9

    .line 345
    div-long/2addr v11, v7

    long-to-int v1, v11

    invoke-virtual {v4, v1}, Ll/ۖۡۡ;->֫(I)V

    .line 346
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 347
    invoke-static {v9, v10}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v4

    .line 348
    invoke-static {v5, v6}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v4, v6, v2

    const/4 v4, 0x1

    aput-object v5, v6, v4

    const v4, 0x7f1202c0

    .line 346
    invoke-virtual {v1, v4, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    :catchall_0
    :goto_1
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 170
    :cond_3
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    :goto_2
    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    move-result v1

    if-nez v1, :cond_4

    .line 173
    invoke-static {p1}, Ll/᩶᩸ܳ;->֫(Ll/᩶᩸ܳ;)Ll/ۖۡۡ;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/ۖۡۡ;->֫(I)V

    .line 174
    invoke-static {p1}, Ll/᩶᩸ܳ;->֫(Ll/᩶᩸ܳ;)Ll/ۖۡۡ;

    move-result-object v1

    sget-object v2, Ll/ܺۡۡ;->᩹:Ll/ܺۡۡ;

    invoke-virtual {v1, v2}, Ll/ۖۡۡ;->֫(Ll/ܺۡۡ;)V

    .line 175
    iget-object v1, p2, Ll/᩹᩸ܳ;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    :cond_4
    iget-object v0, p1, Ll/ܳܶܳ;->᩶:Ll/ۤܺ᩷;

    iget-object v1, p2, Ll/᩹᩸ܳ;->ۙ:Ll/᩶ۖܳ;

    .line 252
    iget-object v1, v1, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    .line 177
    invoke-virtual {v0, v1}, Ll/ۤܺ᩷;->֫(Ll/ۨܺ᩷;)V

    .line 178
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    iget-object p2, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p2, p1}, Ll/ۗܶܳ;->֫(Ll/ܳܶܳ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ll/ۙ᩸ܳ;->ܿ()V

    return-void
.end method
