.class public final Ll/᩵ܶܳ;
.super Ll/۫ܶܳ;
.source "L5KK"


# static fields
.field public static final ۛ:Ll/ۚۡ֫;

.field public static final ۨ:Ll/ۚۡ֫;


# instance fields
.field public final ۤ:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    sput-object v0, Ll/᩵ܶܳ;->ۨ:Ll/ۚۡ֫;

    .line 40
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    sput-object v0, Ll/᩵ܶܳ;->ۛ:Ll/ۚۡ֫;

    return-void
.end method

.method public constructor <init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;)V
    .locals 2

    const v0, 0x7f12012c

    .line 53
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 28
    invoke-direct {p0, p1, v0, v0, p2}, Ll/۫ܶܳ;-><init>(Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;Ll/ۗܶܳ;)V

    .line 41
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 42
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ܶܳ;->ۤ:Ljava/util/Set;

    .line 57
    sget-boolean v0, Ll/᩶ۖ᩷;->ۡ:Z

    if-eqz v0, :cond_0

    .line 58
    invoke-direct {p0}, Ll/᩵ܶܳ;->ܿ()V

    .line 60
    :cond_0
    new-instance v0, Ll/ۢܶܳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p2}, Ll/ۢܶܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Ll/ۡᩴܳ;->֫(Ll/ۗܺ᩷;Ll/֨ۡ֫;)V

    .line 66
    new-instance v0, Ll/᩻ۢᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p2}, Ll/᩻ۢᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object p2, Ll/᩵ܶܳ;->ۛ:Ll/ۚۡ֫;

    invoke-virtual {p2, p1, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public static ֫(Ll/᩵ܶܳ;Ljava/lang/String;Ll/ᩴܶܳ;Ll/ܽᩴܳ;)V
    .locals 8

    .line 197
    iget-object v0, p0, Ll/᩵ܶܳ;->ۤ:Ljava/util/Set;

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/String;

    .line 210
    invoke-static {p1, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 211
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-nez v3, :cond_0

    .line 58
    invoke-static {p1, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Z)Ll/ۖ֨ܿ;

    move-result-object v1

    .line 212
    invoke-virtual {v1}, Ll/ۖ֨ܿ;->ܿ()Ll/᩶ۖܳ;

    move-result-object v1

    goto :goto_0

    .line 214
    :cond_0
    sget-object v3, Ll/᩷ۧ᩻;->ܿ:Ll/᩷ۧ᩻;

    new-instance v4, Ll/ۢۧ᩻;

    invoke-direct {v4, v1}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v3, v4}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 58
    :catch_0
    :try_start_1
    invoke-static {p1, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Z)Ll/ۖ֨ܿ;

    move-result-object v1

    .line 216
    invoke-virtual {v1}, Ll/ۖ֨ܿ;->ܿ()Ll/᩶ۖܳ;

    move-result-object v1

    :goto_0
    move-object v7, v1

    .line 198
    new-instance v1, Ll/ۖܶܳ;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Ll/ۖܶܳ;-><init>(Ll/᩵ܶܳ;Ll/ᩴܶܳ;Ll/ܽᩴܳ;Ljava/lang/String;Ll/᩶ۖܳ;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 200
    invoke-interface {v0, p3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void

    :goto_1
    invoke-interface {v0, p3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 201
    throw p0
.end method

.method public static synthetic ֫(Ll/᩵ܶܳ;Ll/ۗܶܳ;)V
    .locals 1

    .line 67
    sget-boolean v0, Ll/᩶ۖ᩷;->ۡ:Z

    if-eqz v0, :cond_0

    .line 68
    invoke-direct {p0}, Ll/᩵ܶܳ;->ܿ()V

    .line 69
    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public static synthetic ۧ(Ll/᩵ܶܳ;Ll/ۗܶܳ;)V
    .locals 1

    .line 61
    sget-boolean v0, Ll/᩶ۖ᩷;->ۡ:Z

    if-eqz v0, :cond_0

    .line 62
    invoke-direct {p0}, Ll/᩵ܶܳ;->ܿ()V

    .line 63
    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method private ܿ()V
    .locals 7

    .line 85
    iget-object v0, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 86
    invoke-static {}, Ll/ۡᩴܳ;->ܺ()Ll/ۜᩴܳ;

    move-result-object v1

    .line 87
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ܽ()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 89
    invoke-virtual {v1, v3}, Ll/ۜᩴܳ;->ۧ(I)Ll/ܽᩴܳ;

    move-result-object v4

    .line 90
    new-instance v5, Ll/ۘܶܳ;

    iget-object v6, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-direct {v5, p0, v6, v4}, Ll/ۘܶܳ;-><init>(Ll/᩵ܶܳ;Lbin/mt/plus/Main;Ll/ܽᩴܳ;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳܶܳ;I)V
    .locals 8

    .line 153
    check-cast p1, Ll/ᩴܶܳ;

    .line 154
    iget-object v0, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘܶܳ;

    .line 155
    invoke-static {p1, p2}, Ll/ᩴܶܳ;->֫(Ll/ᩴܶܳ;Ll/ۘܶܳ;)V

    iget-object v0, p1, Ll/ܳܶܳ;->᩶:Ll/ۤܺ᩷;

    iget-object v1, p1, Ll/ܳܶܳ;->ۗ:Landroid/widget/TextView;

    .line 156
    iget-object v2, p1, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    invoke-static {p2}, Ll/ۘܶܳ;->֫(Ll/ۘܶܳ;)Ll/ܽᩴܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܽᩴܳ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    invoke-static {p2}, Ll/ۘܶܳ;->֫(Ll/ۘܶܳ;)Ll/ܽᩴܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽᩴܳ;->᩻()Ll/ܿᩴܳ;

    move-result-object v2

    if-nez v2, :cond_0

    .line 160
    invoke-static {p2}, Ll/ۘܶܳ;->֫(Ll/ۘܶܳ;)Ll/ܽᩴܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 162
    :cond_0
    invoke-virtual {v2}, Ll/ܿᩴܳ;->ۧ()I

    move-result v2

    invoke-static {v2}, Ll/۫᩻᩻;->ܽ(I)Ll/ۗ᩻᩻;

    move-result-object v2

    if-nez v2, :cond_1

    .line 164
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ll/ۘܶܳ;->֫(Ll/ۘܶܳ;)Ll/ܽᩴܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 166
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ll/ۗ᩻᩻;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ll/ۘܶܳ;->֫(Ll/ۘܶܳ;)Ll/ܽᩴܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    :goto_0
    invoke-static {p2}, Ll/ۘܶܳ;->֫(Ll/ۘܶܳ;)Ll/ܽᩴܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 180
    invoke-virtual {p2}, Ll/ۘܶܳ;->ܽ()Ll/ۨܺ᩷;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤܺ᩷;->֫(Ll/ۨܺ᩷;)V

    .line 181
    invoke-static {p2}, Ll/ۘܶܳ;->֫(Ll/ۘܶܳ;)Ll/ܽᩴܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽᩴܳ;->᩻()Ll/ܿᩴܳ;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {p2}, Ll/ۘܶܳ;->֫(Ll/ۘܶܳ;)Ll/ܽᩴܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽᩴܳ;->᩷()Ll/᩶ۖܳ;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 184
    :cond_2
    invoke-static {p2}, Ll/ۘܶܳ;->֫(Ll/ۘܶܳ;)Ll/ܽᩴܳ;

    move-result-object v4

    .line 191
    iget-object v0, p0, Ll/᩵ܶܳ;->ۤ:Ljava/util/Set;

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 194
    :cond_3
    invoke-virtual {v4}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v2

    .line 195
    sget-object v6, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v7, Ll/ܺܶܳ;

    const/4 v5, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Ll/ܺܶܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 171
    :cond_4
    :goto_1
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    iget-object p2, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p2, p1}, Ll/ۗܶܳ;->֫(Ll/ܳܶܳ;)V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 76
    sget-boolean v0, Ll/᩶ۖ᩷;->ۡ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 78
    :cond_0
    invoke-super {p0}, Ll/۫ܶܳ;->ܽ()I

    move-result v0

    return v0
.end method
