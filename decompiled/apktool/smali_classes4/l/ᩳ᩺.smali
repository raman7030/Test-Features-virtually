.class public final Ll/ᩳ᩺;
.super Ljava/lang/Object;
.source "95QI"


# static fields
.field public static final ܿ:Ljava/util/ArrayList;

.field public static final synthetic ᩳ:I


# instance fields
.field public ֫:Landroid/util/SparseArray;

.field public ۧ:Ljava/lang/ref/WeakReference;

.field public ܽ:Ljava/util/WeakHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4988
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/ᩳ᩺;->ܿ:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 4984
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4992
    iput-object v0, p0, Ll/ᩳ᩺;->ܽ:Ljava/util/WeakHashMap;

    .line 4997
    iput-object v0, p0, Ll/ᩳ᩺;->֫:Landroid/util/SparseArray;

    .line 5003
    iput-object v0, p0, Ll/ᩳ᩺;->ۧ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private ۧ(Landroid/view/View;Landroid/view/KeyEvent;)Landroid/view/View;
    .locals 3

    .line 5042
    iget-object v0, p0, Ll/ᩳ᩺;->ܽ:Ljava/util/WeakHashMap;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 5045
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 5046
    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    .line 5048
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    .line 5049
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 5050
    invoke-direct {p0, v2, p2}, Ll/ᩳ᩺;->ۧ(Landroid/view/View;Landroid/view/KeyEvent;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    .line 5056
    :cond_2
    invoke-static {p1, p2}, Ll/ᩳ᩺;->ܽ(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p2

    if-eqz p2, :cond_3

    return-object p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static ܽ(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 2

    const p1, 0x7f0a05b5

    .line 5103
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    if-eqz p0, :cond_1

    .line 5105
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    :goto_0
    if-ltz p1, :cond_1

    .line 5106
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽ᩺;

    invoke-interface {v1}, Ll/ܽ᩺;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 5068
    iget-object v0, p0, Ll/ᩳ᩺;->ۧ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 5069
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    goto :goto_1

    .line 5072
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ᩳ᩺;->ۧ:Ljava/lang/ref/WeakReference;

    .line 5006
    iget-object v0, p0, Ll/ᩳ᩺;->֫:Landroid/util/SparseArray;

    if-nez v0, :cond_1

    .line 5007
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ᩳ᩺;->֫:Landroid/util/SparseArray;

    .line 5009
    :cond_1
    iget-object v0, p0, Ll/ᩳ᩺;->֫:Landroid/util/SparseArray;

    .line 5078
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 5079
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v1

    if-ltz v1, :cond_2

    .line 5081
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 5082
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->removeAt(I)V

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_3

    .line 5086
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/ref/WeakReference;

    :cond_3
    if-eqz v3, :cond_5

    .line 5089
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_4

    .line 5090
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 5091
    invoke-static {v0, p1}, Ll/ᩳ᩺;->ܽ(Landroid/view/View;Landroid/view/KeyEvent;)Z

    :cond_4
    return v2

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 7

    .line 5023
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_6

    .line 5141
    iget-object v0, p0, Ll/ᩳ᩺;->ܽ:Ljava/util/WeakHashMap;

    if-eqz v0, :cond_0

    .line 5142
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 5144
    :cond_0
    sget-object v2, Ll/ᩳ᩺;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    move-object v0, v2

    .line 5147
    monitor-enter v0

    .line 5148
    :try_start_0
    iget-object v3, p0, Ll/ᩳ᩺;->ܽ:Ljava/util/WeakHashMap;

    if-nez v3, :cond_2

    .line 5149
    new-instance v3, Ljava/util/WeakHashMap;

    invoke-direct {v3}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v3, p0, Ll/ᩳ᩺;->ܽ:Ljava/util/WeakHashMap;

    .line 5151
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v1

    :goto_0
    if-ltz v2, :cond_5

    .line 5152
    sget-object v3, Ll/ᩳ᩺;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 5153
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-nez v4, :cond_3

    .line 5155
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 5157
    :cond_3
    iget-object v3, p0, Ll/ᩳ᩺;->ܽ:Ljava/util/WeakHashMap;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5158
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 5159
    :goto_1
    instance-of v4, v3, Landroid/view/View;

    if-eqz v4, :cond_4

    .line 5160
    iget-object v4, p0, Ll/ᩳ᩺;->ܽ:Ljava/util/WeakHashMap;

    move-object v5, v3

    check-cast v5, Landroid/view/View;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v5, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5161
    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 5165
    :cond_5
    monitor-exit v0

    goto :goto_3

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 5027
    :cond_6
    :goto_3
    invoke-direct {p0, p1, p2}, Ll/ᩳ᩺;->ۧ(Landroid/view/View;Landroid/view/KeyEvent;)Landroid/view/View;

    move-result-object p1

    .line 5031
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_8

    .line 5032
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p2

    if-eqz p1, :cond_8

    .line 5033
    invoke-static {p2}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    move-result v0

    if-nez v0, :cond_8

    .line 5006
    iget-object v0, p0, Ll/ᩳ᩺;->֫:Landroid/util/SparseArray;

    if-nez v0, :cond_7

    .line 5007
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ᩳ᩺;->֫:Landroid/util/SparseArray;

    .line 5009
    :cond_7
    iget-object v0, p0, Ll/ᩳ᩺;->֫:Landroid/util/SparseArray;

    .line 5034
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_8
    if-eqz p1, :cond_9

    return v1

    :cond_9
    const/4 p1, 0x0

    return p1
.end method
