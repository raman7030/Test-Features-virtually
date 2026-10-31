.class public final Ll/ۛ۠ܳ;
.super Ll/۫ܶܳ;
.source "M5NX"


# static fields
.field public static ۤ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;)V
    .locals 1

    const v0, 0x7f120116

    .line 36
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 28
    invoke-direct {p0, p1, v0, v0, p2}, Ll/۫ܶܳ;-><init>(Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;Ll/ۗܶܳ;)V

    .line 37
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p1, Ll/ۛ۠ܳ;->ۤ:Ljava/lang/ref/WeakReference;

    .line 38
    invoke-direct {p0}, Ll/ۛ۠ܳ;->ܳ()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ۠ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۛ۠ܳ;->᩻()V

    return-void
.end method

.method public static ֫(Ll/ۛ۠ܳ;Ll/۫۠ܳ;)V
    .locals 10

    .line 228
    iget-object v0, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    iget-object v1, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/۫۠ܳ;->ۧ(Ll/۫۠ܳ;)Ll/۬۠ܳ;

    move-result-object v2

    .line 229
    iget-object v3, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {v3}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v3

    if-eqz v2, :cond_6

    if-nez v3, :cond_0

    goto/16 :goto_2

    .line 234
    :cond_0
    invoke-virtual {v2}, Ll/۬۠ܳ;->֫()I

    move-result v2

    .line 143
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    const/4 v7, -0x1

    if-ge v6, v4, :cond_2

    .line 144
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֨ܶܳ;

    .line 145
    instance-of v9, v8, Ll/ۤ۠ܳ;

    if-eqz v9, :cond_1

    check-cast v8, Ll/ۤ۠ܳ;

    invoke-interface {v8}, Ll/ۤ۠ܳ;->֫()I

    move-result v8

    if-ne v8, v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    const/4 v6, -0x1

    .line 236
    :goto_1
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 93
    invoke-virtual {v0, p0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result v4

    const/4 v8, 0x1

    if-eq v6, v7, :cond_3

    if-eq p1, v7, :cond_3

    if-eq v4, v7, :cond_3

    add-int/2addr v4, v8

    add-int/2addr v4, v6

    if-ne p1, v4, :cond_3

    const/4 v5, 0x1

    .line 239
    :cond_3
    invoke-virtual {v3, v2}, Ll/ۢۘܳ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_5

    if-eqz v5, :cond_5

    if-ltz v6, :cond_5

    .line 167
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v6, v3, :cond_5

    .line 168
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ll/ۤ۠ܳ;

    if-eqz v4, :cond_5

    check-cast v3, Ll/ۤ۠ܳ;

    .line 169
    invoke-interface {v3}, Ll/ۤ۠ܳ;->֫()I

    move-result v3

    if-ne v3, v2, :cond_5

    .line 244
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 245
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4

    sub-int/2addr p1, v8

    const/4 p0, 0x2

    .line 246
    invoke-virtual {v0, p1, p0}, Ll/᩶ۗۧ;->notifyItemRangeRemoved(II)V

    return-void

    .line 248
    :cond_4
    invoke-virtual {v0, p1, v8}, Ll/᩶ۗۧ;->notifyItemRangeRemoved(II)V

    return-void

    .line 241
    :cond_5
    invoke-direct {p0}, Ll/ۛ۠ܳ;->᩻()V

    return-void

    .line 231
    :cond_6
    :goto_2
    invoke-direct {p0}, Ll/ۛ۠ܳ;->᩻()V

    return-void
.end method

.method private ܳ()V
    .locals 6

    .line 73
    iget-object v0, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 74
    iget-object v1, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {v1}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 75
    invoke-virtual {v1}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۢۘܳ;->᩻()Ll/ۨ᩸ۡ;

    move-result-object v2

    .line 76
    invoke-virtual {v2}, Ll/ۨ᩸ۡ;->ᩳ()V

    .line 78
    :try_start_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽ᩷ܳ;

    .line 79
    new-instance v5, Ll/۬۠ܳ;

    invoke-direct {v5, p0, v1, v4}, Ll/۬۠ܳ;-><init>(Ll/ۛ۠ܳ;Lbin/mt/plus/Main;Ll/ܽ᩷ܳ;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v2}, Ll/ۨ᩸ۡ;->ܿ()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ll/ۨ᩸ۡ;->ܿ()V

    .line 83
    throw v0

    :cond_1
    return-void
.end method

.method public static ܿ()V
    .locals 2

    .line 53
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 60
    sget-object v0, Ll/ۛ۠ܳ;->ۤ:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ۠ܳ;

    if-eqz v0, :cond_1

    .line 64
    invoke-direct {v0}, Ll/ۛ۠ܳ;->ܳ()V

    .line 65
    iget-object v0, v0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_1
    :goto_0
    return-void

    .line 43
    :cond_2
    new-instance v0, Ll/ۚܿ᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۚܿ᩷;-><init>(I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method private ᩻()V
    .locals 2

    .line 131
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 132
    invoke-static {}, Ll/ۛ۠ܳ;->ܿ()V

    return-void

    .line 135
    :cond_0
    invoke-direct {p0}, Ll/ۛ۠ܳ;->ܳ()V

    .line 136
    iget-object v0, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳܶܳ;I)V
    .locals 2

    .line 174
    check-cast p1, Ll/۫۠ܳ;

    .line 175
    iget-object v0, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۬۠ܳ;

    .line 176
    invoke-static {p1, p2}, Ll/۫۠ܳ;->֫(Ll/۫۠ܳ;Ll/۬۠ܳ;)V

    .line 177
    iget-object v0, p1, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    invoke-static {p2}, Ll/۬۠ܳ;->ܽ(Ll/۬۠ܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    iget-object v0, p1, Ll/ܳܶܳ;->ۗ:Landroid/widget/TextView;

    invoke-static {p2}, Ll/۬۠ܳ;->ۧ(Ll/۬۠ܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    iget-object v0, p1, Ll/ܳܶܳ;->᩶:Ll/ۤܺ᩷;

    invoke-static {p2}, Ll/۬۠ܳ;->֫(Ll/۬۠ܳ;)Ll/ۨܺ᩷;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤܺ᩷;->֫(Ll/ۨܺ᩷;)V

    .line 180
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
