.class public final Ll/ۡ᩵ܳ;
.super Ll/᩶ۗۧ;
.source "715M"


# instance fields
.field public ֫:Z

.field public ۜ:I

.field public final synthetic ۢ:Ll/ۚ᩵ܳ;

.field public ۧ:J

.field public final ܳ:Ljava/util/ArrayList;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public final ᩷:Ll/᩺ᩴܳ;

.field public final ᩻:Ll/֫ۗۧ;


# direct methods
.method public constructor <init>(Ll/ۚ᩵ܳ;Ll/۬۬ۧ;Ll/᩺ᩴܳ;)V
    .locals 1

    .line 911
    iput-object p1, p0, Ll/ۡ᩵ܳ;->ۢ:Ll/ۚ᩵ܳ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 900
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۡ᩵ܳ;->ܳ:Ljava/util/ArrayList;

    .line 912
    iput-object p3, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    .line 913
    new-instance p1, Ll/֫ۗۧ;

    new-instance v0, Ll/᩷᩵ܳ;

    invoke-direct {v0, p0, p3}, Ll/᩷᩵ܳ;-><init>(Ll/ۡ᩵ܳ;Ll/᩺ᩴܳ;)V

    invoke-direct {p1, v0}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    iput-object p1, p0, Ll/ۡ᩵ܳ;->᩻:Ll/֫ۗۧ;

    .line 950
    invoke-virtual {p1, p2}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    return-void
.end method

.method public static ֫(Ll/ۡ᩵ܳ;Ll/ܽᩴܳ;)I
    .locals 2

    .line 1014
    iget-object v0, p0, Ll/ۡ᩵ܳ;->ܳ:Ljava/util/ArrayList;

    invoke-direct {p0}, Ll/ۡ᩵ܳ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1015
    iget-object p0, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    invoke-virtual {p0, p1}, Ll/᩺ᩴܳ;->֫(Ll/ܽᩴܳ;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    .line 1017
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p0, v1, :cond_2

    .line 1018
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤᩴܳ;

    iget-object v1, v1, Ll/ۤᩴܳ;->֫:Ll/ܽᩴܳ;

    if-ne v1, p1, :cond_1

    return p0

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static synthetic ֫(Ll/ۡ᩵ܳ;)V
    .locals 1

    .line 1057
    iget-object p0, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    invoke-static {p0}, Ll/᩺ᩴܳ;->ᩳ(Ll/᩺ᩴܳ;)Ll/۬۬ۧ;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ll/۬۬ۧ;->scrollToPosition(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡ᩵ܳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡ᩵ܳ;->ܽ:I

    return-void
.end method

.method public static ֫(Ll/ۡ᩵ܳ;Ll/ܽᩴܳ;I)V
    .locals 2

    .line 1029
    iget-object v0, p0, Ll/ۡ᩵ܳ;->ܳ:Ljava/util/ArrayList;

    const/4 v1, -0x1

    if-ne p2, v1, :cond_0

    .line 1030
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void

    .line 1033
    :cond_0
    invoke-direct {p0}, Ll/ۡ᩵ܳ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤᩴܳ;

    iget-object v1, v1, Ll/ۤᩴܳ;->֫:Ll/ܽᩴܳ;

    if-ne v1, p1, :cond_1

    .line 1034
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1036
    :cond_1
    invoke-virtual {p0, p2}, Ll/᩶ۗۧ;->notifyItemRemoved(I)V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۡ᩵ܳ;)Ll/֫ۗۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ᩵ܳ;->᩻:Ll/֫ۗۧ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۡ᩵ܳ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۡ᩵ܳ;->ᩳ()Z

    move-result p0

    return p0
.end method

.method public static synthetic ۧ(Ll/ۡ᩵ܳ;)V
    .locals 10

    .line 1204
    iget-object v0, p0, Ll/ۡ᩵ܳ;->ۢ:Ll/ۚ᩵ܳ;

    iget-object v1, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    invoke-static {v1}, Ll/᩺ᩴܳ;->ܿ(Ll/᩺ᩴܳ;)Ll/ۜᩴܳ;

    move-result-object v1

    .line 1205
    iget v2, p0, Ll/ۡ᩵ܳ;->ܽ:I

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const v6, 0x7f12015e

    const v7, 0x7f12070a

    const v8, 0x7f1205ca

    if-ne v2, v4, :cond_3

    .line 1209
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ۧ()Ll/ܽᩴܳ;

    move-result-object v2

    .line 1210
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ۜ()Z

    move-result v9

    if-eqz v9, :cond_1

    const v9, 0x7f120877

    goto :goto_0

    :cond_1
    const v9, 0x7f12086d

    :goto_0
    if-nez v2, :cond_2

    const-string v2, "null"

    goto :goto_1

    .line 1211
    :cond_2
    invoke-virtual {v2}, Ll/ܽᩴܳ;->ܳ()Ljava/lang/String;

    move-result-object v2

    .line 1212
    :goto_1
    invoke-static {v0}, Ll/ۚ᩵ܳ;->ܳ(Ll/ۚ᩵ܳ;)Ll/ۗܺ᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, v8}, Ll/᩵ۚۢ;->ۧ(I)V

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v3

    .line 1213
    invoke-static {v9, v4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v2, Ll/ᩳ᩵ܳ;

    invoke-direct {v2, p0, v1}, Ll/ᩳ᩵ܳ;-><init>(Ll/ۡ᩵ܳ;Ll/ۜᩴܳ;)V

    .line 1214
    invoke-virtual {v0, v7, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1218
    invoke-virtual {v0, v6, v5}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1219
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 1221
    :cond_3
    invoke-virtual {v1}, Ll/ۜᩴܳ;->ۜ()Z

    move-result v2

    if-eqz v2, :cond_4

    const v2, 0x7f120876

    goto :goto_2

    :cond_4
    const v2, 0x7f12086e

    .line 1222
    :goto_2
    invoke-static {v0}, Ll/ۚ᩵ܳ;->ܳ(Ll/ۚ᩵ܳ;)Ll/ۗܺ᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, v8}, Ll/᩵ۚۢ;->ۧ(I)V

    iget v8, p0, Ll/ۡ᩵ܳ;->ܽ:I

    .line 1223
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v8, v4, v3

    invoke-static {v2, v4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v2, Ll/ܿ᩵ܳ;

    invoke-direct {v2, p0, v1}, Ll/ܿ᩵ܳ;-><init>(Ll/ۡ᩵ܳ;Ll/ۜᩴܳ;)V

    .line 1224
    invoke-virtual {v0, v7, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1228
    invoke-virtual {v0, v6, v5}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1229
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۡ᩵ܳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡ᩵ܳ;->ᩳ:I

    return-void
.end method

.method public static ۧ(Ll/ۡ᩵ܳ;Ll/ܽᩴܳ;)V
    .locals 3

    .line 1043
    iget-object v0, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    invoke-virtual {v0, p1}, Ll/᩺ᩴܳ;->֫(Ll/ܽᩴܳ;)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    .line 1045
    invoke-virtual {p0}, Ll/ۡ᩵ܳ;->ܽ()V

    return-void

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 1049
    invoke-static {v0}, Ll/᩺ᩴܳ;->ᩳ(Ll/᩺ᩴܳ;)Ll/۬۬ۧ;

    move-result-object p0

    invoke-virtual {p0, v1}, Ll/۬۬ۧ;->scrollToPosition(I)V

    return-void

    .line 1052
    :cond_1
    invoke-virtual {v0, p1}, Ll/᩺ᩴܳ;->ܽ(I)Z

    move-result v2

    if-nez v2, :cond_2

    .line 1053
    invoke-virtual {p0}, Ll/ۡ᩵ܳ;->ܽ()V

    return-void

    .line 1056
    :cond_2
    invoke-virtual {p0, p1, v1}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    .line 1057
    invoke-static {v0}, Ll/᩺ᩴܳ;->ᩳ(Ll/᩺ᩴܳ;)Ll/۬۬ۧ;

    move-result-object p1

    new-instance v0, Ll/ۜ᩵ܳ;

    invoke-direct {v0, p0}, Ll/ۜ᩵ܳ;-><init>(Ll/ۡ᩵ܳ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 49
    sget-object p0, Ll/᩵ܶܳ;->ۛ:Ll/ۚۡ֫;

    const-class p1, Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۡ᩵ܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۡ᩵ܳ;->ܽ:I

    return p0
.end method

.method public static synthetic ܽ(Ll/ۡ᩵ܳ;)V
    .locals 5

    .line 1167
    iget-object v0, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    invoke-static {v0}, Ll/᩺ᩴܳ;->ܿ(Ll/᩺ᩴܳ;)Ll/ۜᩴܳ;

    move-result-object v1

    .line 1168
    iget v2, p0, Ll/ۡ᩵ܳ;->ܽ:I

    if-nez v2, :cond_0

    return-void

    .line 1171
    :cond_0
    new-instance v2, Ll/ܰᩴܳ;

    invoke-static {v0}, Ll/᩺ᩴܳ;->ܽ(Ll/᩺ᩴܳ;)I

    move-result v0

    invoke-direct {v2, v0}, Ll/ܰᩴܳ;-><init>(I)V

    .line 1172
    iget-object v0, p0, Ll/ۡ᩵ܳ;->ۢ:Ll/ۚ᩵ܳ;

    invoke-static {v0}, Ll/ۚ᩵ܳ;->ܳ(Ll/ۚ᩵ܳ;)Ll/ۗܺ᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v3, 0x7f1205c6

    invoke-virtual {v0, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v3, v2, Ll/ܰᩴܳ;->᩶:[Ll/᩷ᩴܳ;

    iget v4, v2, Ll/ܰᩴܳ;->᩸:I

    .line 1173
    invoke-virtual {v0, v3, v4, v2}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v3, Ll/ܳ᩵ܳ;

    invoke-direct {v3, p0, v2, v1}, Ll/ܳ᩵ܳ;-><init>(Ll/ۡ᩵ܳ;Ll/ܰᩴܳ;Ll/ۜᩴܳ;)V

    const p0, 0x7f12070a

    .line 1174
    invoke-virtual {v0, p0, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 v1, 0x0

    .line 1181
    invoke-virtual {v0, p0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1182
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method private ܿ()V
    .locals 9

    .line 982
    iget-object v0, p0, Ll/ۡ᩵ܳ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 983
    invoke-direct {p0}, Ll/ۡ᩵ܳ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 986
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 987
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 988
    :goto_0
    iget-object v5, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    invoke-virtual {v5}, Ll/᩺ᩴܳ;->֫()I

    move-result v6

    if-ge v4, v6, :cond_3

    .line 989
    invoke-virtual {v5, v4}, Ll/᩺ᩴܳ;->ۧ(I)Ll/ܽᩴܳ;

    move-result-object v5

    .line 990
    invoke-virtual {v5}, Ll/ܽᩴܳ;->ܳ()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Ll/ۡ᩵ܳ;->ۢ:Ll/ۚ᩵ܳ;

    invoke-static {v7}, Ll/ۚ᩵ܳ;->ۚ(Ll/ۚ᩵ܳ;)Ljava/lang/String;

    move-result-object v8

    .line 1578
    invoke-static {v8, v6, v3}, Ll/ۢܺ֡;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v6

    if-ltz v6, :cond_1

    .line 992
    new-instance v7, Ll/ۤᩴܳ;

    invoke-direct {v7, v5, v4, v6}, Ll/ۤᩴܳ;-><init>(Ll/ܽᩴܳ;II)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 995
    :cond_1
    invoke-virtual {v5}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v6

    invoke-static {v7}, Ll/ۚ᩵ܳ;->ۚ(Ll/ۚ᩵ܳ;)Ljava/lang/String;

    move-result-object v7

    .line 1578
    invoke-static {v7, v6, v3}, Ll/ۢܺ֡;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v6

    if-ltz v6, :cond_2

    .line 997
    new-instance v7, Ll/ۤᩴܳ;

    invoke-direct {v7, v5, v4, v6}, Ll/ۤᩴܳ;-><init>(Ll/ܽᩴܳ;II)V

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1000
    :cond_3
    invoke-static {}, Ll/ۤᩴܳ;->֫()Ll/۫ᩴܳ;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1001
    invoke-static {}, Ll/ۤᩴܳ;->֫()Ll/۫ᩴܳ;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1002
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1003
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/ۡ᩵ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡ᩵ܳ;->֫:Z

    return p0
.end method

.method public static synthetic ᩳ(Ll/ۡ᩵ܳ;)V
    .locals 5

    .line 1186
    iget-object v0, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    invoke-static {v0}, Ll/᩺ᩴܳ;->ܿ(Ll/᩺ᩴܳ;)Ll/ۜᩴܳ;

    move-result-object v1

    .line 1187
    iget v2, p0, Ll/ۡ᩵ܳ;->ܽ:I

    if-nez v2, :cond_0

    return-void

    .line 1190
    :cond_0
    new-instance v2, Ll/ܰᩴܳ;

    invoke-static {v0}, Ll/᩺ᩴܳ;->ܽ(Ll/᩺ᩴܳ;)I

    move-result v0

    invoke-direct {v2, v0}, Ll/ܰᩴܳ;-><init>(I)V

    .line 1191
    iget-object v0, p0, Ll/ۡ᩵ܳ;->ۢ:Ll/ۚ᩵ܳ;

    invoke-static {v0}, Ll/ۚ᩵ܳ;->ܳ(Ll/ۚ᩵ܳ;)Ll/ۗܺ᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v3, 0x7f1205ed

    invoke-virtual {v0, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v3, v2, Ll/ܰᩴܳ;->᩶:[Ll/᩷ᩴܳ;

    iget v4, v2, Ll/ܰᩴܳ;->᩸:I

    .line 1192
    invoke-virtual {v0, v3, v4, v2}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v3, Ll/᩻᩵ܳ;

    invoke-direct {v3, p0, v2, v1}, Ll/᩻᩵ܳ;-><init>(Ll/ۡ᩵ܳ;Ll/ܰᩴܳ;Ll/ۜᩴܳ;)V

    const p0, 0x7f12070a

    .line 1193
    invoke-virtual {v0, p0, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 v1, 0x0

    .line 1200
    invoke-virtual {v0, p0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1201
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method private ᩳ()Z
    .locals 1

    .line 975
    iget-object v0, p0, Ll/ۡ᩵ܳ;->ۢ:Ll/ۚ᩵ܳ;

    invoke-static {v0}, Ll/ۚ᩵ܳ;->ۚ(Ll/ۚ᩵ܳ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static bridge synthetic ᩷(Ll/ۡ᩵ܳ;)Ll/᩺ᩴܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ۡ᩵ܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۡ᩵ܳ;->ᩳ:I

    return p0
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 1128
    invoke-direct {p0}, Ll/ۡ᩵ܳ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1129
    iget-object v0, p0, Ll/ۡ᩵ܳ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    .line 1131
    :cond_0
    iget-object v0, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    invoke-virtual {v0}, Ll/᩺ᩴܳ;->֫()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 15

    move-object v0, p0

    move/from16 v1, p2

    .line 897
    move-object/from16 v2, p1

    check-cast v2, Ll/᩵᩵ܳ;

    const-string v3, "error "

    .line 1007
    :try_start_0
    invoke-direct {p0}, Ll/ۡ᩵ܳ;->ᩳ()Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v5, v0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    if-eqz v4, :cond_0

    .line 1008
    :try_start_1
    iget-object v4, v0, Ll/ۡ᩵ܳ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤᩴܳ;

    iget-object v1, v1, Ll/ۤᩴܳ;->֫:Ll/ܽᩴܳ;

    goto :goto_0

    .line 1010
    :cond_0
    invoke-virtual {v5, v1}, Ll/᩺ᩴܳ;->ۧ(I)Ll/ܽᩴܳ;

    move-result-object v1

    .line 1073
    :goto_0
    invoke-static {v2, v1}, Ll/᩵᩵ܳ;->֫(Ll/᩵᩵ܳ;Ll/ܽᩴܳ;)V

    .line 1074
    invoke-static {v2}, Ll/᩵᩵ܳ;->ᩳ(Ll/᩵᩵ܳ;)Ll/ۤܺ᩷;

    move-result-object v4

    invoke-static {v4, v1}, Ll/᩸ۘܳ;->֫(Ll/ۤܺ᩷;Ll/ܽᩴܳ;)V

    .line 1075
    invoke-static {v2}, Ll/᩵᩵ܳ;->ܳ(Ll/᩵᩵ܳ;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v1}, Ll/ܽᩴܳ;->ܳ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1076
    invoke-virtual {v1}, Ll/ܽᩴܳ;->᩻()Ll/ܿᩴܳ;

    move-result-object v4

    if-nez v4, :cond_1

    .line 1078
    invoke-static {v2}, Ll/᩵᩵ܳ;->ܿ(Ll/᩵᩵ܳ;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v1}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1080
    :cond_1
    invoke-virtual {v4}, Ll/ܿᩴܳ;->ۧ()I

    move-result v4

    invoke-static {v4}, Ll/۫᩻᩻;->ܽ(I)Ll/ۗ᩻᩻;

    move-result-object v4

    if-nez v4, :cond_2

    .line 1082
    invoke-static {v2}, Ll/᩵᩵ܳ;->ܿ(Ll/᩵᩵ܳ;)Landroid/widget/TextView;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1084
    :cond_2
    invoke-static {v2}, Ll/᩵᩵ܳ;->ܿ(Ll/᩵᩵ܳ;)Landroid/widget/TextView;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ll/ۗ᩻᩻;->ܿ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1087
    :goto_1
    invoke-static {v2}, Ll/᩵᩵ܳ;->ܽ(Ll/᩵᩵ܳ;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iget-object v4, v0, Ll/ۡ᩵ܳ;->ۢ:Ll/ۚ᩵ܳ;

    invoke-static {v4}, Ll/ۚ᩵ܳ;->᩷(Ll/ۚ᩵ܳ;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 1088
    invoke-virtual {v2}, Ll/᩵᩵ܳ;->֫()V

    .line 1089
    iget-boolean v3, v0, Ll/ۡ᩵ܳ;->֫:Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v4, 0x2

    const-string v8, "alpha"

    const/16 v9, 0x8

    const/4 v10, 0x0

    if-eqz v3, :cond_6

    .line 1090
    :try_start_2
    invoke-virtual {v5}, Ll/᩺ᩴܳ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1091
    invoke-static {v2}, Ll/᩵᩵ܳ;->ۧ(Ll/᩵᩵ܳ;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 1093
    :cond_3
    invoke-static {v2}, Ll/᩵᩵ܳ;->ۧ(Ll/᩵᩵ܳ;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1094
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    const-wide/16 v13, 0x64

    iget-wide v6, v0, Ll/ۡ᩵ܳ;->ۧ:J

    sub-long/2addr v11, v6

    cmp-long v3, v11, v13

    if-gez v3, :cond_4

    .line 1095
    invoke-static {v2}, Ll/᩵᩵ܳ;->ۧ(Ll/᩵᩵ܳ;)Landroid/widget/ImageView;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Landroid/view/View;->setAlpha(F)V

    .line 1096
    invoke-static {v2}, Ll/᩵᩵ܳ;->ۧ(Ll/᩵᩵ܳ;)Landroid/widget/ImageView;

    move-result-object v3

    new-array v4, v4, [F

    fill-array-data v4, :array_0

    invoke-static {v3, v8, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    const-wide/16 v4, 0xc8

    .line 1097
    invoke-virtual {v3, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 1098
    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    .line 1101
    :cond_4
    :goto_2
    iget-object v2, v2, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Ll/ܽᩴܳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_5

    sget v10, Ll/᩹֡᩷;->ܺ:I

    :cond_5
    invoke-virtual {v2, v10}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    :cond_6
    const-wide/16 v6, 0x64

    .line 1103
    invoke-virtual {v5}, Ll/᩺ᩴܳ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    iget-wide v13, v0, Ll/ۡ᩵ܳ;->ۧ:J

    sub-long/2addr v11, v13

    cmp-long v1, v11, v6

    if-gez v1, :cond_7

    .line 1104
    invoke-static {v2}, Ll/᩵᩵ܳ;->ۧ(Ll/᩵᩵ܳ;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1105
    invoke-static {v2}, Ll/᩵᩵ܳ;->ۧ(Ll/᩵᩵ܳ;)Landroid/widget/ImageView;

    move-result-object v1

    new-array v3, v4, [F

    fill-array-data v3, :array_1

    invoke-static {v1, v8, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    const-wide/16 v3, 0xc8

    .line 1106
    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 1107
    new-instance v3, Ll/ۢ᩵ܳ;

    invoke-direct {v3, v2}, Ll/ۢ᩵ܳ;-><init>(Ll/᩵᩵ܳ;)V

    invoke-virtual {v1, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1113
    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_3

    .line 1115
    :cond_7
    invoke-static {v2}, Ll/᩵᩵ܳ;->ۧ(Ll/᩵᩵ܳ;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1117
    :goto_3
    iget-object v1, v2, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v1, v1, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v1, :cond_8

    .line 1118
    iget-object v1, v2, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-static {v1}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_8
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    .line 1064
    iget-object p2, p0, Ll/ۡ᩵ܳ;->ۢ:Ll/ۚ᩵ܳ;

    invoke-static {p2}, Ll/ۚ᩵ܳ;->ܳ(Ll/ۚ᩵ܳ;)Ll/ۗܺ᩷;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0117

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 1065
    new-instance v0, Ll/᩵᩵ܳ;

    invoke-direct {v0, p2, p0, p1}, Ll/᩵᩵ܳ;-><init>(Ll/ۚ᩵ܳ;Ll/ۡ᩵ܳ;Landroid/view/View;)V

    return-object v0
.end method

.method public final ֫()V
    .locals 9

    .line 1236
    iget-boolean v0, p0, Ll/ۡ᩵ܳ;->֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 1237
    iput-boolean v0, p0, Ll/ۡ᩵ܳ;->֫:Z

    .line 1238
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۡ᩵ܳ;->ۧ:J

    .line 1239
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 1240
    iget-object v1, p0, Ll/ۡ᩵ܳ;->ۢ:Ll/ۚ᩵ܳ;

    invoke-static {v1}, Ll/ۚ᩵ܳ;->᩸(Ll/ۚ᩵ܳ;)Ll/ۜۡۡ;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ll/ۜۡۡ;->֫(Z)V

    .line 1243
    invoke-static {v1}, Ll/ۚ᩵ܳ;->᩶(Ll/ۚ᩵ܳ;)Ll/֡᩵ܳ;

    move-result-object v2

    .line 1244
    new-instance v4, Ll/֡᩵ܳ;

    invoke-static {v1}, Ll/ۚ᩵ܳ;->ᩴ(Ll/ۚ᩵ܳ;)Landroid/widget/HorizontalScrollView;

    move-result-object v5

    invoke-static {v1}, Ll/ۚ᩵ܳ;->ۜ(Ll/ۚ᩵ܳ;)Landroid/view/View;

    move-result-object v6

    invoke-static {v1}, Ll/ۚ᩵ܳ;->۠(Ll/ۚ᩵ܳ;)Landroid/view/View;

    move-result-object v7

    const/4 v8, 0x3

    new-array v8, v8, [Landroid/view/View;

    aput-object v5, v8, v0

    aput-object v6, v8, v3

    const/4 v5, 0x2

    aput-object v7, v8, v5

    invoke-direct {v4, v8}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    const/4 v6, 0x0

    .line 1245
    invoke-virtual {v2, v6}, Ll/֡᩵ܳ;->setAlpha(F)V

    .line 1246
    invoke-virtual {v2, v0}, Ll/֡᩵ܳ;->֫(I)V

    .line 1247
    iput-boolean v3, v4, Ll/֡᩵ܳ;->֫:Z

    new-array v0, v5, [F

    .line 1248
    fill-array-data v0, :array_0

    const-string v3, "alpha"

    invoke-static {v2, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v6, 0xc8

    invoke-virtual {v0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    new-array v0, v5, [F

    .line 1249
    fill-array-data v0, :array_1

    invoke-static {v4, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 1250
    invoke-static {v1}, Ll/ۚ᩵ܳ;->᩵(Ll/ۚ᩵ܳ;)Landroid/view/View;

    move-result-object v0

    invoke-static {v1}, Ll/ۚ᩵ܳ;->ۗ(Ll/ۚ᩵ܳ;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1252
    invoke-static {v1}, Ll/ۚ᩵ܳ;->ۜ(Ll/ۚ᩵ܳ;)Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1253
    invoke-static {v1}, Ll/ۚ᩵ܳ;->ܺ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1254
    invoke-static {v1}, Ll/ۚ᩵ܳ;->ۘ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1255
    invoke-static {v1}, Ll/ۚ᩵ܳ;->ۖ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final ֫(I)V
    .locals 9

    .line 1138
    iget-boolean v0, p0, Ll/ۡ᩵ܳ;->֫:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Ll/ۡ᩵ܳ;->ۢ:Ll/ۚ᩵ܳ;

    invoke-static {v0}, Ll/ۚ᩵ܳ;->۬(Ll/ۚ᩵ܳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    .line 1141
    :cond_0
    invoke-static {v0}, Ll/ۚ᩵ܳ;->᩹(Ll/ۚ᩵ܳ;)V

    const/4 v1, 0x1

    .line 1142
    iput-boolean v1, p0, Ll/ۡ᩵ܳ;->֫:Z

    .line 1143
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Ll/ۡ᩵ܳ;->ۧ:J

    .line 1144
    iput p1, p0, Ll/ۡ᩵ܳ;->ᩳ:I

    const/4 v2, -0x2

    .line 1145
    iput v2, p0, Ll/ۡ᩵ܳ;->ۜ:I

    .line 1146
    iget-object v2, p0, Ll/ۡ᩵ܳ;->᩷:Ll/᩺ᩴܳ;

    invoke-virtual {v2}, Ll/᩺ᩴܳ;->ܿ()V

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-eq p1, v3, :cond_1

    .line 1148
    invoke-virtual {v2, p1}, Ll/᩺ᩴܳ;->ۧ(I)Ll/ܽᩴܳ;

    move-result-object p1

    invoke-virtual {p1, v1}, Ll/ܽᩴܳ;->֫(Z)V

    .line 1149
    iput v1, p0, Ll/ۡ᩵ܳ;->ܽ:I

    goto :goto_0

    .line 1151
    :cond_1
    iput v4, p0, Ll/ۡ᩵ܳ;->ܽ:I

    .line 1153
    :goto_0
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 1154
    invoke-static {v0}, Ll/ۚ᩵ܳ;->᩸(Ll/ۚ᩵ܳ;)Ll/ۜۡۡ;

    move-result-object p1

    invoke-static {v2}, Ll/᩺ᩴܳ;->ܽ(Ll/᩺ᩴܳ;)I

    move-result v3

    invoke-virtual {p1, v3}, Ll/֡ܰۧ;->ᩳ(I)V

    .line 1155
    invoke-static {v0}, Ll/ۚ᩵ܳ;->᩸(Ll/ۚ᩵ܳ;)Ll/ۜۡۡ;

    move-result-object p1

    invoke-virtual {p1, v4}, Ll/ۜۡۡ;->֫(Z)V

    .line 1157
    new-instance p1, Ll/֡᩵ܳ;

    invoke-static {v0}, Ll/ۚ᩵ܳ;->ᩴ(Ll/ۚ᩵ܳ;)Landroid/widget/HorizontalScrollView;

    move-result-object v3

    invoke-static {v0}, Ll/ۚ᩵ܳ;->ۜ(Ll/ۚ᩵ܳ;)Landroid/view/View;

    move-result-object v5

    invoke-static {v0}, Ll/ۚ᩵ܳ;->۠(Ll/ۚ᩵ܳ;)Landroid/view/View;

    move-result-object v6

    const/4 v7, 0x3

    new-array v7, v7, [Landroid/view/View;

    aput-object v3, v7, v4

    aput-object v5, v7, v1

    const/4 v3, 0x2

    aput-object v6, v7, v3

    invoke-direct {p1, v7}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    .line 1158
    invoke-static {v0}, Ll/ۚ᩵ܳ;->᩶(Ll/ۚ᩵ܳ;)Ll/֡᩵ܳ;

    move-result-object v5

    const/4 v6, 0x0

    .line 1159
    invoke-virtual {p1, v6}, Ll/֡᩵ܳ;->setAlpha(F)V

    .line 1160
    invoke-virtual {p1, v4}, Ll/֡᩵ܳ;->֫(I)V

    .line 1161
    iput-boolean v1, v5, Ll/֡᩵ܳ;->ۧ:Z

    new-array v4, v3, [F

    .line 1162
    fill-array-data v4, :array_0

    const-string v6, "alpha"

    invoke-static {p1, v6, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v7, 0xc8

    invoke-virtual {p1, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    new-array p1, v3, [F

    .line 1163
    fill-array-data p1, :array_1

    invoke-static {v5, v6, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 1164
    invoke-static {v0}, Ll/ۚ᩵ܳ;->ۜ(Ll/ۚ᩵ܳ;)Landroid/view/View;

    move-result-object p1

    new-instance v3, Ll/۟ᩴܳ;

    invoke-direct {v3, p0}, Ll/۟ᩴܳ;-><init>(Ll/ۡ᩵ܳ;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1165
    invoke-static {v0}, Ll/ۚ᩵ܳ;->ܺ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {v2}, Ll/᩺ᩴܳ;->ᩳ()Z

    move-result v3

    const/16 v4, 0x8

    if-eqz v3, :cond_2

    const/16 v3, 0x8

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1166
    invoke-static {v0}, Ll/ۚ᩵ܳ;->ܺ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;

    move-result-object p1

    new-instance v3, Ll/֫᩵ܳ;

    invoke-direct {v3, p0}, Ll/֫᩵ܳ;-><init>(Ll/ۡ᩵ܳ;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1184
    invoke-static {v0}, Ll/ۚ᩵ܳ;->ۘ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {v2}, Ll/᩺ᩴܳ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1185
    invoke-static {v0}, Ll/ۚ᩵ܳ;->ۘ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;

    move-result-object p1

    new-instance v2, Ll/ۧ᩵ܳ;

    invoke-direct {v2, p0}, Ll/ۧ᩵ܳ;-><init>(Ll/ۡ᩵ܳ;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1203
    invoke-static {v0}, Ll/ۚ᩵ܳ;->ۖ(Ll/ۚ᩵ܳ;)Landroid/widget/LinearLayout;

    move-result-object p1

    new-instance v2, Ll/ܽ᩵ܳ;

    invoke-direct {v2, p0}, Ll/ܽ᩵ܳ;-><init>(Ll/ۡ᩵ܳ;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1232
    iget p1, p0, Ll/ۡ᩵ܳ;->ܽ:I

    if-lez p1, :cond_4

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    invoke-static {v0, v1}, Ll/ۚ᩵ܳ;->֫(Ll/ۚ᩵ܳ;Z)V

    :cond_5
    :goto_4
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final ۧ()V
    .locals 0

    .line 957
    invoke-direct {p0}, Ll/ۡ᩵ܳ;->ܿ()V

    .line 958
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ܽ()V
    .locals 0

    .line 966
    invoke-direct {p0}, Ll/ۡ᩵ܳ;->ܿ()V

    .line 968
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method
