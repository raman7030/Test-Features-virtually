.class public final Ll/֡᩸ܳ;
.super Ll/۫ܶܳ;
.source "94PF"


# static fields
.field public static final ۛ:Ll/ܶ᩵ܿ;

.field public static final ۨ:Ll/ܶ᩵ܿ;


# instance fields
.field public ۤ:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 35
    sget-object v0, Ll/ܽ֡ܿ;->ᩳ:Ll/ܶ᩵ܿ;

    const-string v1, "projects"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    sput-object v0, Ll/֡᩸ܳ;->ۨ:Ll/ܶ᩵ܿ;

    .line 36
    sget-object v2, Ll/ܽ֡ܿ;->ܽ:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    sput-object v1, Ll/֡᩸ܳ;->ۛ:Ll/ܶ᩵ܿ;

    .line 39
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 40
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 41
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۙ()Z

    :cond_0
    return-void
.end method

.method public constructor <init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;)V
    .locals 2

    const v0, 0x7f12028a

    .line 46
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 28
    invoke-direct {p0, p1, v0, v0, p2}, Ll/۫ܶܳ;-><init>(Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;Ll/ۗܶܳ;)V

    .line 65
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p2, p0, Ll/֡᩸ܳ;->ۤ:Ljava/util/List;

    .line 47
    invoke-direct {p0}, Ll/֡᩸ܳ;->ܳ()Z

    .line 48
    invoke-virtual {p1}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object p2

    new-instance v0, Ll/᩹᩶۠;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩹᩶۠;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Ll/ۢۘܳ;->֫(Ljava/lang/Runnable;)V

    .line 49
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    new-instance p2, Ll/ۢ᩸ܳ;

    invoke-direct {p2, p0}, Ll/ۢ᩸ܳ;-><init>(Ll/֡᩸ܳ;)V

    invoke-virtual {p1, p2}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    return-void
.end method

.method public static ֫(Ll/֡᩸ܳ;Ll/᩵᩸ܳ;Ll/᩵᩸ܳ;)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 90
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

    iget-object p0, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-static {v1, v2, p0}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 94
    invoke-virtual {v0, p1, p2}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    .line 95
    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance p1, Ll/ۜ᩸ܳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 96
    invoke-interface {p0, p1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance p1, Ll/᩷᩸ܳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 97
    invoke-interface {p0, p1}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    .line 98
    sget p1, Ll/ܺۛ᩷;->֫:I

    .line 27
    new-instance p1, Ll/ۡ۫ᩳ;

    const/4 p2, 0x2

    invoke-direct {p1, p2, p0}, Ll/ۡ۫ᩳ;-><init>(ILjava/lang/Object;)V

    const-class p0, Ll/ܺۛ᩷;

    const-wide/16 v0, 0x3e8

    invoke-static {p1, p0, v0, v1}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void
.end method

.method private ܳ()Z
    .locals 8

    const/4 v0, 0x2

    new-array v0, v0, [Ll/ܶ᩵ܿ;

    .line 68
    sget-object v1, Ll/֡᩸ܳ;->ۨ:Ll/ܶ᩵ܿ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/֡᩸ܳ;->ۛ:Ll/ܶ᩵ܿ;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v0}, Ll/ܺۛ᩷;->֫([Ll/ܶ᩵ܿ;)Ljava/util/List;

    move-result-object v0

    .line 71
    iget-object v1, p0, Ll/֡᩸ܳ;->ۤ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ne v1, v4, :cond_0

    iget-object v1, p0, Ll/֡᩸ܳ;->ۤ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 73
    :cond_0
    iput-object v0, p0, Ll/֡᩸ܳ;->ۤ:Ljava/util/List;

    .line 76
    iget-object v1, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    const/4 v4, 0x0

    .line 82
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶ᩵ܿ;

    .line 83
    new-instance v6, Ll/ᩴ᩸ܳ;

    iget-object v7, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-direct {v6, p0, v7, v5}, Ll/ᩴ᩸ܳ;-><init>(Ll/֡᩸ܳ;Lbin/mt/plus/Main;Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    if-eqz v4, :cond_4

    .line 85
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    return v2

    :cond_4
    :goto_3
    return v3
.end method


# virtual methods
.method public final ֫(Ll/ܳܶܳ;I)V
    .locals 2

    .line 138
    check-cast p1, Ll/᩵᩸ܳ;

    .line 139
    iget-object v0, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴ᩸ܳ;

    .line 140
    invoke-static {p1, p2}, Ll/᩵᩸ܳ;->֫(Ll/᩵᩸ܳ;Ll/ᩴ᩸ܳ;)V

    .line 141
    iget-object v0, p1, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    invoke-static {p2}, Ll/ᩴ᩸ܳ;->ᩳ(Ll/ᩴ᩸ܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    iget-object v0, p1, Ll/ܳܶܳ;->ۗ:Landroid/widget/TextView;

    invoke-static {p2}, Ll/ᩴ᩸ܳ;->ܽ(Ll/ᩴ᩸ܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    iget-object v0, p1, Ll/ܳܶܳ;->᩶:Ll/ۤܺ᩷;

    invoke-static {p2}, Ll/ᩴ᩸ܳ;->֫(Ll/ᩴ᩸ܳ;)Ll/ۨܺ᩷;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤܺ᩷;->֫(Ll/ۨܺ᩷;)V

    .line 144
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    iget-object p2, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p2, p1}, Ll/ۗܶܳ;->֫(Ll/ܳܶܳ;)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 60
    invoke-direct {p0}, Ll/֡᩸ܳ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method
