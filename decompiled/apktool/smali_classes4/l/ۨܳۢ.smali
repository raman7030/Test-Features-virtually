.class public final Ll/ۨܳۢ;
.super Ll/۟ܶۡ;
.source "I1KV"


# instance fields
.field public final synthetic ۖ:Ljava/lang/String;

.field public final synthetic ۜ:Ll/ۗܺ᩷;

.field public final synthetic ۡ:Ljava/util/ArrayList;

.field public final synthetic ۢ:Landroid/widget/Spinner;

.field public ܳ:Ljava/util/ArrayList;

.field public final synthetic ܺ:Ljava/lang/String;

.field public final synthetic ᩷:Z

.field public final synthetic ᩻:Ll/۟ܳۢ;


# direct methods
.method public constructor <init>(Ll/۟ܳۢ;Ll/ۗܺ᩷;Landroid/widget/Spinner;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Z)V
    .locals 0

    .line 1058
    iput-object p1, p0, Ll/ۨܳۢ;->᩻:Ll/۟ܳۢ;

    iput-object p2, p0, Ll/ۨܳۢ;->ۜ:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ۨܳۢ;->ۢ:Landroid/widget/Spinner;

    iput-object p4, p0, Ll/ۨܳۢ;->ۖ:Ljava/lang/String;

    iput-object p5, p0, Ll/ۨܳۢ;->ۡ:Ljava/util/ArrayList;

    iput-object p6, p0, Ll/ۨܳۢ;->ܺ:Ljava/lang/String;

    iput-boolean p7, p0, Ll/ۨܳۢ;->᩷:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 1059
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۨܳۢ;->ܳ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 1123
    iget-object v0, p0, Ll/ۨܳۢ;->ۜ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 1063
    iget-object v0, p0, Ll/ۨܳۢ;->ۜ:Ll/ۗܺ᩷;

    const v1, 0x7f1207a7

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 13

    .line 1068
    new-instance v0, Ll/᩷ۗܳ;

    iget-object v1, p0, Ll/ۨܳۢ;->᩻:Ll/۟ܳۢ;

    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v2

    check-cast v2, Ll/ۗܺ᩷;

    invoke-direct {v0, v2}, Ll/᩷ۗܳ;-><init>(Ll/ۗܺ᩷;)V

    .line 1069
    invoke-static {v1}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۫ۧۢ;->ᩴ()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Ll/ۨܳۢ;->ۢ:Landroid/widget/Spinner;

    invoke-virtual {v3}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x1

    .line 1070
    :try_start_0
    iget-object v5, p0, Ll/ۨܳۢ;->ۖ:Ljava/lang/String;

    new-array v6, v4, [Ljava/lang/String;

    .line 114
    invoke-static {v5, v6}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;[B)Ll/ᩳܰۡ;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1071
    :try_start_1
    invoke-static {v1}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v6

    invoke-virtual {v6, v4}, Ll/۫ۧۢ;->֫(Z)V

    .line 1072
    iget-object v6, p0, Ll/ۨܳۢ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗ᩺ۡ;

    .line 1073
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    .line 1074
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v9

    add-int/lit8 v9, v9, -0x6

    invoke-virtual {v8, v4, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 1075
    iget-object v9, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    new-array v10, v3, [Ljava/lang/Object;

    aput-object v8, v10, v4

    const v11, 0x7f12048a

    invoke-virtual {v1, v11, v10}, Ll/ۡ᩻֫;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ll/۬۬ܿ;->֫(Ljava/lang/String;)V

    .line 1077
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, p0, Ll/ۨܳۢ;->ܺ:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1078
    invoke-virtual {v5, v7}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v7

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v7, v9}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v7

    .line 1080
    invoke-static {v1}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v9

    invoke-virtual {v9, v8}, Ll/۫ۧۢ;->ۧ(Ljava/lang/String;)Z

    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1081
    iget-object v10, p0, Ll/ۨܳۢ;->ܳ:Ljava/util/ArrayList;

    if-eqz v9, :cond_4

    .line 1082
    :try_start_2
    invoke-virtual {v0}, Ll/᩷ۗܳ;->᩵()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 26
    invoke-virtual {v0, v8}, Ll/᩷ۗܳ;->ܽ(Ljava/lang/String;)V

    .line 1084
    invoke-virtual {v0}, Ll/᩷ۗܳ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    .line 1088
    :cond_0
    invoke-virtual {v0}, Ll/᩷ۗܳ;->۬()I

    move-result v9

    if-eqz v9, :cond_3

    const/4 v11, 0x2

    if-eq v9, v11, :cond_1

    goto :goto_0

    :cond_1
    const/4 v9, 0x1

    .line 1098
    :cond_2
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr v9, v3

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 1099
    invoke-static {v1}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v12

    invoke-virtual {v12, v11}, Ll/۫ۧۢ;->ۧ(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_2

    .line 1100
    invoke-static {v1}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v8

    invoke-virtual {v8, v2, v11, v7}, Ll/۫ۧۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1101
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1090
    :cond_3
    invoke-static {v1}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v9

    invoke-virtual {v9, v8, v7}, Ll/۫ۧۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 1091
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1108
    :cond_4
    invoke-static {v1}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v9

    invoke-virtual {v9, v2, v8, v7}, Ll/۫ۧۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1109
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    .line 1112
    :cond_5
    :goto_1
    :try_start_3
    invoke-virtual {v5}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1113
    invoke-static {v1}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/۫ۧۢ;->֫(Z)V

    return-void

    :catchall_0
    move-exception v0

    .line 1070
    :try_start_4
    invoke-virtual {v5}, Ll/ᩳܰۡ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_5
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    .line 1113
    invoke-static {v1}, Ll/۟ܳۢ;->ᩳ(Ll/۟ܳۢ;)Ll/۫ۧۢ;

    move-result-object v1

    invoke-virtual {v1, v3}, Ll/۫ۧۢ;->֫(Z)V

    .line 1114
    throw v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 1128
    iget-object v0, p0, Ll/ۨܳۢ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1129
    iget-object v1, p0, Ll/ۨܳۢ;->᩻:Ll/۟ܳۢ;

    invoke-virtual {v1}, Ll/۟ܳۢ;->ۧ()V

    .line 1130
    invoke-static {v1}, Ll/۟ܳۢ;->ܽ(Ll/۟ܳۢ;)Ll/ܰܳۡ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܰܳۡ;->֫(Ljava/util/Collection;)V

    .line 1132
    :cond_0
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->֫()V

    .line 1133
    iget-boolean v0, p0, Ll/ۨܳۢ;->᩷:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 1134
    iget-object v1, p0, Ll/ۨܳۢ;->ۖ:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_1
    return-void
.end method
