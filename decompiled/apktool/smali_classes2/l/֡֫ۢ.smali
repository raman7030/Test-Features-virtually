.class public final Ll/֡֫ۢ;
.super Ljava/lang/Object;
.source "Z1GQ"

# interfaces
.implements Ll/֡ۨᩳ;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Ll/᩸ۤᩳ;


# instance fields
.field public ۗ:Ll/ᩳᩳܿ;

.field public ۙ:[Ljava/lang/String;

.field public ۛ:I

.field public ۤ:Ljava/lang/String;

.field public ۨ:I

.field public ۫:Ljava/lang/String;

.field public final synthetic ۬:Ll/۠֫ۢ;

.field public ᩶:Ljava/lang/String;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/۠֫ۢ;)V
    .locals 3

    .line 1044
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡֫ۢ;->۬:Ll/۠֫ۢ;

    .line 1040
    invoke-virtual {p1}, Ll/۠֫ۢ;->۠()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֡֫ۢ;->ۙ:[Ljava/lang/String;

    .line 1045
    new-instance v0, Ll/ᩳᩳܿ;

    invoke-virtual {p1}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0xff

    invoke-direct {v0, v1, v2}, Ll/ᩳᩳܿ;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Ll/֡֫ۢ;->ۗ:Ll/ᩳᩳܿ;

    .line 1046
    invoke-virtual {v0, p0}, Ll/ᩳᩳܿ;->֫(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1047
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0}, Ll/ᩳᩳܿ;->ܿ()V

    .line 1048
    invoke-static {p1}, Ll/۠֫ۢ;->᩻(Ll/۠֫ۢ;)Ll/۫ۨᩳ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۫ۨᩳ;->֫(Ll/᩸ۤᩳ;)V

    return-void
.end method

.method public static ֫(Ll/֡֫ۢ;)V
    .locals 6

    .line 1084
    iget-object v0, p0, Ll/֡֫ۢ;->۬:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->ۚ(Ll/۠֫ۢ;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 1087
    :cond_0
    iget-object v1, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/۠֫ۢ;->֫(Ll/۠֫ۢ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x11

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    const/4 p0, -0x1

    .line 1089
    invoke-static {p0, v1}, Ll/ۙ᩸᩷;->֫(ILjava/lang/CharSequence;)V

    .line 1090
    invoke-static {v3, v1}, Ll/᩸ۚۢ;->֫(ILjava/lang/CharSequence;)Ll/᩸ۚۢ;

    move-result-object p0

    .line 1091
    invoke-virtual {p0, v2, v3}, Ll/᩸ۚۢ;->֫(II)V

    .line 1092
    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    return-void

    .line 229
    :cond_1
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ܿۛ᩷;

    .line 1094
    invoke-static {v0}, Ll/۠֫ۢ;->᩵(Ll/۠֫ۢ;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 1347
    invoke-virtual {v1, v4, v5}, Ll/ܿۛ᩷;->ۧ(Ljava/lang/String;Ll/᩵ۛ᩷;)V

    .line 1095
    iget-object p0, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v4, v1, [Ljava/lang/Object;

    aput-object p0, v4, v3

    const p0, 0x7f1200f7

    invoke-virtual {v0, p0, v4}, Ll/ۡ᩻֫;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ll/᩸ۚۢ;->֫(ILjava/lang/CharSequence;)Ll/᩸ۚۢ;

    move-result-object p0

    .line 1096
    invoke-virtual {p0, v2, v3}, Ll/᩸ۚۢ;->֫(II)V

    .line 1097
    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    return-void
.end method

.method public static ֫(Ll/֡֫ۢ;Ll/۫ۨᩳ;)V
    .locals 7

    .line 1153
    iget-object v0, p0, Ll/֡֫ۢ;->ۗ:Ll/ᩳᩳܿ;

    iget-object v1, p0, Ll/֡֫ۢ;->۬:Ll/۠֫ۢ;

    invoke-static {v1}, Ll/۠֫ۢ;->ۚ(Ll/۠֫ۢ;)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    .line 1157
    :cond_0
    iget-object v2, p0, Ll/֡֫ۢ;->᩶:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "Resource not found: "

    const/4 v4, 0x0

    const-string v5, "/"

    if-eqz v2, :cond_1

    .line 1158
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Ll/֡֫ۢ;->ۙ:[Ljava/lang/String;

    aget-object v6, v6, v4

    .line 0
    invoke-static {v2, v6, v5}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 1160
    :cond_1
    invoke-static {v1}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v2

    iget-object v6, p0, Ll/֡֫ۢ;->᩶:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ll/᩵ۨ᩷;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    .line 1162
    invoke-static {v1}, Ll/۠֫ۢ;->֨(Ll/۠֫ۢ;)Ll/ۘۛ᩷;

    move-result-object p1

    new-instance v0, Ll/֫ۛۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1162
    invoke-virtual {p1, v0}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    return-void

    .line 1165
    :cond_2
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 0
    :goto_0
    invoke-static {v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1167
    iget-object v6, p0, Ll/֡֫ۢ;->۫:Ljava/lang/String;

    .line 0
    invoke-static {v2, v6, v5}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1168
    invoke-static {v1}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v5

    iget-object v6, p0, Ll/֡֫ۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v5, v2, v6}, Ll/᩵ۨ᩷;->ܽ(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 1169
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 1170
    invoke-static {v1}, Ll/۠֫ۢ;->֨(Ll/۠֫ۢ;)Ll/ۘۛ᩷;

    move-result-object p1

    new-instance v0, Ll/֫ۛۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1170
    invoke-virtual {p1, v0}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    return-void

    .line 1173
    :cond_3
    iget-boolean p0, p0, Ll/֡֫ۢ;->᩹:Z

    if-eqz p0, :cond_5

    .line 1174
    invoke-virtual {v1}, Ll/۠֫ۢ;->۠()Ljava/lang/String;

    move-result-object p0

    .line 1175
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۨ᩷;

    .line 1176
    iget-object v5, v3, Ll/ۖۨ᩷;->᩶:Ljava/lang/String;

    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1177
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    sget v5, Ll/᩹֡᩷;->֫:I

    invoke-direct {v1, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v5, 0x21

    invoke-virtual {v3, v1, v4, p0, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1182
    :cond_5
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1183
    invoke-virtual {v0, v2}, Ll/ᩳᩳܿ;->֫(Ljava/util/ArrayList;)V

    .line 1184
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result p0

    invoke-virtual {v0, p1, p0}, Ll/ᩳᩳܿ;->֫(Ll/۫ۨᩳ;I)V

    return-void
.end method

.method private ۧ(Ljava/util/ArrayList;)V
    .locals 3

    .line 1144
    iget-object v0, p0, Ll/֡֫ۢ;->ۙ:[Ljava/lang/String;

    array-length v0, v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    return-void

    .line 1147
    :cond_0
    iget-object v0, p0, Ll/֡֫ۢ;->۬:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->᩻(Ll/۠֫ۢ;)Ll/۫ۨᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۘ֫()Ll/֫ܰᩳ;

    move-result-object v1

    const/4 v2, 0x1

    .line 1148
    iput-boolean v2, v1, Ll/֫ܰᩳ;->֫:Z

    .line 1149
    iget v2, p0, Ll/֡֫ۢ;->ۨ:I

    iput v2, v1, Ll/֫ܰᩳ;->ܽ:I

    .line 1150
    iget v2, p0, Ll/֡֫ۢ;->ۛ:I

    iput v2, v1, Ll/֫ܰᩳ;->ۧ:I

    .line 1151
    invoke-static {v0}, Ll/۠֫ۢ;->᩻(Ll/۠֫ۢ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 1152
    new-instance v0, Ll/᩵֫ۢ;

    new-instance v2, Ll/ᩴ֫ۢ;

    invoke-direct {v2, p0}, Ll/ᩴ֫ۢ;-><init>(Ll/֡֫ۢ;)V

    invoke-direct {v0, p0, v2, v1}, Ll/᩵֫ۢ;-><init>(Ll/֡֫ۢ;Ll/ᩴ֫ۢ;Ll/֫ܰᩳ;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ۧ()Z
    .locals 6

    .line 1121
    iget-object v0, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    const-string v2, "?"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    const/16 v2, 0x20

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    .line 1122
    iget-object v0, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "/"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 1123
    array-length v4, v0

    const/4 v5, 0x2

    if-ne v4, v5, :cond_3

    .line 1124
    aget-object v4, v0, v1

    .line 1125
    aget-object v0, v0, v3

    iput-object v0, p0, Ll/֡֫ۢ;->᩸:Ljava/lang/String;

    const/16 v0, 0x3a

    .line 1126
    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-eq v0, v2, :cond_2

    const-string v0, ":"

    .line 1127
    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 1128
    array-length v2, v0

    if-eq v2, v5, :cond_1

    return v1

    .line 1131
    :cond_1
    aget-object v1, v0, v1

    iput-object v1, p0, Ll/֡֫ۢ;->᩶:Ljava/lang/String;

    .line 1132
    aget-object v0, v0, v3

    iput-object v0, p0, Ll/֡֫ۢ;->۫:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string v0, ""

    .line 1134
    iput-object v0, p0, Ll/֡֫ۢ;->᩶:Ljava/lang/String;

    .line 1135
    iput-object v4, p0, Ll/֡֫ۢ;->۫:Ljava/lang/String;

    :goto_0
    return v3

    :cond_3
    return v1
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1204
    iget-object p1, p0, Ll/֡֫ۢ;->ۗ:Ll/ᩳᩳܿ;

    invoke-virtual {p1}, Ll/ᩳᩳܿ;->֫()V

    .line 1205
    invoke-virtual {p1, p3}, Ll/ᩳᩳܿ;->֫(I)Ljava/lang/CharSequence;

    move-result-object p1

    check-cast p1, Ll/ۖۨ᩷;

    .line 1206
    iget-object p2, p0, Ll/֡֫ۢ;->۬:Ll/۠֫ۢ;

    invoke-static {p2}, Ll/۠֫ۢ;->᩻(Ll/۠֫ۢ;)Ll/۫ۨᩳ;

    move-result-object p3

    invoke-virtual {p3}, Ll/۫ۨᩳ;->᩵ܽ()V

    .line 229
    invoke-virtual {p2}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p2

    check-cast p2, Ll/ܿۛ᩷;

    .line 1207
    iget-object p3, p1, Ll/ۖۨ᩷;->᩶:Ljava/lang/String;

    iget-object p1, p1, Ll/ۖۨ᩷;->᩸:Ll/᩵ۛ᩷;

    invoke-virtual {p2, p3, p1}, Ll/ܿۛ᩷;->ۧ(Ljava/lang/String;Ll/᩵ۛ᩷;)V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 1212
    iget-object v0, p0, Ll/֡֫ۢ;->ۗ:Ll/ᩳᩳܿ;

    invoke-virtual {v0}, Ll/ᩳᩳܿ;->֫()V

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 10

    .line 1053
    iget-object v0, p0, Ll/֡֫ۢ;->۬:Ll/۠֫ۢ;

    invoke-static {v0}, Ll/۠֫ۢ;->᩻(Ll/۠֫ۢ;)Ll/۫ۨᩳ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/۫ۨᩳ;->֫(Ljava/util/ArrayList;)V

    .line 1054
    invoke-static {v0}, Ll/۠֫ۢ;->᩻(Ll/۠֫ۢ;)Ll/۫ۨᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۨᩳ;->۫֫()I

    move-result v1

    .line 1055
    invoke-static {v0}, Ll/۠֫ۢ;->᩻(Ll/۠֫ۢ;)Ll/۫ۨᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۫ۨᩳ;->۬֫()I

    move-result v2

    if-le v1, v2, :cond_0

    move v9, v2

    move v2, v1

    move v1, v9

    .line 1061
    :cond_0
    invoke-static {v0}, Ll/۠֫ۢ;->᩻(Ll/۠֫ۢ;)Ll/۫ۨᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v3

    invoke-interface {v3}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v3

    const/4 v4, -0x1

    if-eq v1, v2, :cond_1

    const/16 v5, 0xa

    .line 1064
    :try_start_0
    invoke-static {v3, v5, v1, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v5

    if-ne v5, v4, :cond_6

    :cond_1
    const/4 v5, 0x1

    sub-int/2addr v1, v5

    .line 1065
    invoke-static {v3, v1, v5}, Ll/۠֫ۢ;->֫(Ll/۟᩸ᩳ;IZ)I

    move-result v6

    const/4 v7, 0x0

    .line 1066
    invoke-static {v3, v2, v7}, Ll/۠֫ۢ;->֫(Ll/۟᩸ᩳ;IZ)I

    move-result v8

    if-eq v6, v4, :cond_2

    if-eq v8, v4, :cond_2

    add-int/2addr v6, v5

    .line 1068
    iput v6, p0, Ll/֡֫ۢ;->ۨ:I

    .line 1069
    iput v8, p0, Ll/֡֫ۢ;->ۛ:I

    .line 1070
    invoke-virtual {v3, v6, v8}, Ll/۟᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    .line 1071
    invoke-direct {p0}, Ll/֡֫ۢ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1072
    iput-boolean v7, p0, Ll/֡֫ۢ;->᩹:Z

    .line 1073
    invoke-direct {p0, p1}, Ll/֡֫ۢ;->ۧ(Ljava/util/ArrayList;)V

    goto/16 :goto_0

    .line 1076
    :cond_2
    invoke-static {v3, v1, v5}, Ll/۠֫ۢ;->ۧ(Ll/۟᩸ᩳ;IZ)I

    move-result v1

    .line 1077
    invoke-static {v3, v2, v7}, Ll/۠֫ۢ;->ۧ(Ll/۟᩸ᩳ;IZ)I

    move-result v2

    if-eq v1, v4, :cond_4

    if-eq v2, v4, :cond_4

    add-int/lit8 v6, v1, -0x1

    .line 1078
    invoke-static {v3, v6}, Ll/۠֫ۢ;->֫(Ll/۟᩸ᩳ;I)Z

    move-result v6

    if-eqz v6, :cond_4

    add-int/2addr v1, v5

    .line 1079
    iput v1, p0, Ll/֡֫ۢ;->ۨ:I

    .line 1080
    iput v2, p0, Ll/֡֫ۢ;->ۛ:I

    .line 1081
    invoke-virtual {v3, v1, v2}, Ll/۟᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    .line 1082
    invoke-static {v0}, Ll/۠֫ۢ;->᩵(Ll/۠֫ۢ;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1083
    new-instance v0, Ll/᩸ܳܿ;

    new-instance v1, Ll/ۘ֫ۢ;

    invoke-direct {v1, p0}, Ll/ۘ֫ۢ;-><init>(Ll/֡֫ۢ;)V

    const v2, 0x7f1205c4

    const v4, 0x7f08020a

    invoke-direct {v0, v2, v4, v1}, Ll/᩸ܳܿ;-><init>(IILl/۬ۤ;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    const-string v0, ""

    .line 1101
    iput-object v0, p0, Ll/֡֫ۢ;->᩶:Ljava/lang/String;

    .line 1102
    iget-object v0, p0, Ll/֡֫ۢ;->ۙ:[Ljava/lang/String;

    aget-object v0, v0, v5

    iput-object v0, p0, Ll/֡֫ۢ;->۫:Ljava/lang/String;

    .line 1103
    iget-object v0, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    iput-object v0, p0, Ll/֡֫ۢ;->᩸:Ljava/lang/String;

    .line 1104
    iput-boolean v5, p0, Ll/֡֫ۢ;->᩹:Z

    .line 1105
    invoke-direct {p0, p1}, Ll/֡֫ۢ;->ۧ(Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_4
    if-eq v1, v4, :cond_6

    if-eq v2, v4, :cond_6

    add-int/lit8 v0, v1, -0x1

    .line 1262
    new-instance v4, Ll/ۚ֫ۢ;

    invoke-direct {v4, v0, v3}, Ll/ۚ֫ۢ;-><init>(ILjava/lang/CharSequence;)V

    .line 1263
    invoke-virtual {v4}, Ll/ۚ֫ۢ;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v6, "="

    .line 1264
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 1265
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ll/ۚ֫ۢ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_5
    const-string v4, "parent="

    .line 1267
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    add-int/2addr v1, v5

    .line 1107
    iput v1, p0, Ll/֡֫ۢ;->ۨ:I

    .line 1108
    iput v2, p0, Ll/֡֫ۢ;->ۛ:I

    .line 1109
    invoke-virtual {v3, v1, v2}, Ll/۟᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֡֫ۢ;->ۤ:Ljava/lang/String;

    .line 1110
    invoke-direct {p0}, Ll/֡֫ۢ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1111
    iput-boolean v7, p0, Ll/֡֫ۢ;->᩹:Z

    .line 1112
    invoke-direct {p0, p1}, Ll/֡֫ۢ;->ۧ(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1117
    :cond_6
    :goto_0
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 1061
    :try_start_1
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method
