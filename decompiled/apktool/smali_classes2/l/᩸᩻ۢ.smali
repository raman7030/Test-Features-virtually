.class public Ll/᩸᩻ۢ;
.super Ll/ۡ᩻֫;
.source "E1KB"

# interfaces
.implements Ll/ܶܳۡ;
.implements Ll/۠ܳۡ;


# instance fields
.field public ۗ:Ll/ۘۛ᩷;

.field public ۙ:Ll/۬۬ۧ;

.field public ᩶:Ljava/util/List;

.field public ᩸:Ll/ۚ᩻ۢ;

.field public ᩹:Ll/۫ۧۢ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f0d01e2

    .line 53
    invoke-direct {p0, v0}, Ll/ۡ᩻֫;-><init>(I)V

    .line 50
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩸᩻ۢ;->᩶:Ljava/util/List;

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩻ۢ;)V
    .locals 1

    .line 138
    iget-object p0, p0, Ll/᩸᩻ۢ;->ۙ:Ll/۬۬ۧ;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ll/۬۬ۧ;->suppressLayout(Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩻ۢ;Ljava/lang/String;)V
    .locals 0

    .line 96
    iget-object p0, p0, Ll/᩸᩻ۢ;->᩹:Ll/۫ۧۢ;

    if-eqz p0, :cond_0

    .line 97
    invoke-virtual {p0, p1}, Ll/۫ۧۢ;->֫(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩻ۢ;Ljava/util/List;)V
    .locals 0

    .line 66
    iput-object p1, p0, Ll/᩸᩻ۢ;->᩶:Ljava/util/List;

    .line 67
    iget-object p0, p0, Ll/᩸᩻ۢ;->᩸:Ll/ۚ᩻ۢ;

    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public static ֫(Ll/᩸᩻ۢ;Ljava/util/Set;)V
    .locals 3

    .line 70
    iget-object v0, p0, Ll/᩸᩻ۢ;->᩸:Ll/ۚ᩻ۢ;

    invoke-virtual {v0}, Ll/ܰܳۡ;->ܳ()Ljava/util/HashSet;

    move-result-object v0

    .line 71
    iget-object v1, p0, Ll/᩸᩻ۢ;->᩸:Ll/ۚ᩻ۢ;

    const/4 v2, 0x1

    .line 153
    invoke-virtual {v1, v2, p1}, Ll/ܰܳۡ;->֫(ILjava/util/Collection;)V

    .line 72
    iget-object p1, p0, Ll/᩸᩻ۢ;->᩸:Ll/ۚ᩻ۢ;

    invoke-virtual {p1, v0}, Ll/ܰܳۡ;->֫(Ljava/util/HashSet;)V

    .line 73
    iget-object p0, p0, Ll/᩸᩻ۢ;->᩸:Ll/ۚ᩻ۢ;

    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩻ۢ;Ll/۫ۧۢ;)V
    .locals 2

    .line 64
    iput-object p1, p0, Ll/᩸᩻ۢ;->᩹:Ll/۫ۧۢ;

    .line 65
    new-instance v0, Ll/֫۠ۢ;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ll/֫۠ۢ;-><init>(Ll/᩻ۡ֫;I)V

    invoke-virtual {p1, p0, v0}, Ll/۫ۧۢ;->֫(Ll/᩸᩻ۢ;Ll/֫۠ۢ;)V

    .line 69
    new-instance v0, Ll/ۘ᩻ۢ;

    invoke-direct {v0, p0}, Ll/ۘ᩻ۢ;-><init>(Ll/᩸᩻ۢ;)V

    invoke-virtual {p1, p0, v0}, Ll/۫ۧۢ;->֫(Ll/᩸᩻ۢ;Ll/ۘ᩻ۢ;)V

    return-void
.end method

.method public static ֫(Ll/᩸᩻ۢ;Ll/᩺ᩳۢ;Ll/ܽ᩻ۡ;Landroid/view/MenuItem;)V
    .locals 3

    const-string v0, ".smali"

    .line 111
    invoke-virtual {p1, p3}, Ll/᩺ᩳۢ;->֫(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_0

    .line 114
    :cond_0
    invoke-interface {p3}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const p3, 0x7f120530

    if-ne p1, p3, :cond_1

    .line 115
    iget-object p0, p0, Ll/᩸᩻ۢ;->ۗ:Ll/ۘۛ᩷;

    invoke-virtual {p2}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۘۛ᩷;->֫(Ljava/lang/String;)V

    goto :goto_0

    .line 117
    :cond_1
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    check-cast p1, Ll/ܿۛ᩷;

    .line 119
    :try_start_0
    iget-object p0, p0, Ll/᩸᩻ۢ;->᩹:Ll/۫ۧۢ;

    invoke-virtual {p2}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Ll/۫ۧۢ;->ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 120
    invoke-virtual {p2}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ll/ܿۛ᩷;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 121
    invoke-static {}, Ll/֫᩷ᩳ;->ۧ()Ll/֫᩷ᩳ;

    move-result-object v1

    const v2, 0x7f1202ad

    .line 122
    invoke-virtual {v1, v2, p0}, Ll/֫᩷ᩳ;->֫(ILjava/lang/String;)V

    const p0, 0x7f1202aa

    .line 123
    invoke-virtual {v1, p0, p3}, Ll/֫᩷ᩳ;->ۧ(ILjava/lang/String;)V

    .line 124
    invoke-virtual {v1, v0}, Ll/֫᩷ᩳ;->ᩳ(Ljava/lang/String;)V

    .line 125
    invoke-virtual {v1}, Ll/֫᩷ᩳ;->֫()V

    .line 126
    invoke-virtual {p2}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ll/֫᩷ᩳ;->ۧ(Ljava/lang/String;)V

    const p0, 0x7f1201be

    .line 127
    invoke-virtual {v1, p0}, Ll/֫᩷ᩳ;->֫(I)V

    .line 128
    invoke-virtual {p2}, Ll/ܽ᩻ۡ;->ۧ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ll/֫᩷ᩳ;->ܽ(Ljava/lang/String;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    invoke-virtual {p2}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ll/֫᩷ᩳ;->֫(Ljava/lang/String;)V

    .line 130
    invoke-virtual {v1, p1}, Ll/֫᩷ᩳ;->֫(Ll/ۗܺ᩷;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const/4 p2, 0x0

    .line 546
    invoke-virtual {p1, p0, p2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :goto_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩸᩻ۢ;)Ll/ۚ᩻ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩻ۢ;->᩸:Ll/ۚ᩻ۢ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩸᩻ۢ;)Ll/۫ۧۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩻ۢ;->᩹:Ll/۫ۧۢ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/᩸᩻ۢ;)Ll/ۘۛ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩻ۢ;->ۗ:Ll/ۘۛ᩷;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩸᩻ۢ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸᩻ۢ;->᩶:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 58
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onCreate(Landroid/os/Bundle;)V

    .line 59
    new-instance p1, Ll/ۙܺ֫;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v0, Ll/ۘۛ᩷;

    invoke-virtual {p1, v0}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    check-cast p1, Ll/ۘۛ᩷;

    iput-object p1, p0, Ll/᩸᩻ۢ;->ۗ:Ll/ۘۛ᩷;

    .line 60
    new-instance p1, Ll/ۚ᩻ۢ;

    invoke-direct {p1, p0}, Ll/ۚ᩻ۢ;-><init>(Ll/᩸᩻ۢ;)V

    iput-object p1, p0, Ll/᩸᩻ۢ;->᩸:Ll/ۚ᩻ۢ;

    .line 61
    invoke-virtual {p1, p0}, Ll/ܰܳۡ;->֫(Ll/ܶܳۡ;)V

    .line 62
    iget-object p1, p0, Ll/᩸᩻ۢ;->᩸:Ll/ۚ᩻ۢ;

    invoke-virtual {p1, p0}, Ll/ܰܳۡ;->֫(Ll/۠ܳۡ;)V

    .line 63
    iget-object p1, p0, Ll/᩸᩻ۢ;->ۗ:Ll/ۘۛ᩷;

    invoke-virtual {p1}, Ll/ۘۛ᩷;->᩻()Ll/ۚۡ֫;

    move-result-object p1

    new-instance v0, Ll/ܳۘᩳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ܳۘᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public final onDestroyView()V
    .locals 2

    .line 87
    invoke-super {p0}, Ll/ۡ᩻֫;->onDestroyView()V

    .line 88
    iget-object v0, p0, Ll/᩸᩻ۢ;->ۙ:Ll/۬۬ۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 89
    iput-object v1, p0, Ll/᩸᩻ۢ;->ۙ:Ll/۬۬ۧ;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    const p2, 0x7f0a0486

    .line 80
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    iput-object p1, p0, Ll/᩸᩻ۢ;->ۙ:Ll/۬۬ۧ;

    const-string p2, "RecyclerView1"

    .line 81
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 82
    iget-object p1, p0, Ll/᩸᩻ۢ;->ۙ:Ll/۬۬ۧ;

    iget-object p2, p0, Ll/᩸᩻ۢ;->᩸:Ll/ۚ᩻ۢ;

    invoke-virtual {p1, p2}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    return-void
.end method

.method public final ֫(Ll/ܽ᩻ۡ;)Z
    .locals 6

    .line 105
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->᩻()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 106
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ܳ()Landroid/view/View;

    move-result-object v3

    .line 68
    invoke-direct {v0, v2, v3, v1}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 107
    new-instance v2, Ll/᩺ᩳۢ;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    .line 16
    invoke-direct {v2, v0, v3, v4}, Ll/᩺ᩳۢ;-><init>(Ll/᩸ۖ;Ljava/lang/String;Z)V

    .line 108
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v5, 0x7f120530

    invoke-interface {v3, v1, v5, v1, v5}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 109
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v5, 0x7f1201be

    invoke-interface {v3, v1, v5, v1, v5}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 110
    new-instance v1, Ll/ۖ᩻ۢ;

    invoke-direct {v1, p0, v2, p1}, Ll/ۖ᩻ۢ;-><init>(Ll/᩸᩻ۢ;Ll/᩺ᩳۢ;Ll/ܽ᩻ۡ;)V

    invoke-virtual {v0, v1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 137
    iget-object p1, p0, Ll/᩸᩻ۢ;->ۙ:Ll/۬۬ۧ;

    invoke-virtual {p1, v4}, Ll/۬۬ۧ;->suppressLayout(Z)V

    .line 138
    new-instance p1, Ll/ۗۖܳ;

    const/4 v1, 0x6

    invoke-direct {p1, v1, p0}, Ll/ۗۖܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/۠ۖ;)V

    .line 139
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return v4

    :cond_0
    return v1
.end method

.method public final ۧ(Ll/ܽ᩻ۡ;)V
    .locals 3

    .line 94
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    .line 95
    new-instance v0, Ll/᩻ۚܿ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Ll/᩻ۚܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v1, 0x1f4

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    .line 100
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ܿۛ᩷;

    const/4 v1, 0x0

    .line 1305
    invoke-virtual {v0, p1, v1}, Ll/ܿۛ᩷;->֫(Ljava/lang/String;Ll/᩵ۛ᩷;)V

    return-void
.end method
