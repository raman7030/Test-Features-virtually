.class public final Ll/֫ۙ᩻;
.super Ljava/lang/Object;
.source "JAK2"


# instance fields
.field public final ֫:Z

.field public ۧ:Ll/ܶ᩵ܿ;

.field public final ܳ:Ll/ܽۢܳ;

.field public final ܽ:Ljava/util/List;

.field public final ܿ:Ll/ۧۗ᩻;

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ljava/util/List;)V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/֫ۙ᩻;->ܳ:Ll/ܽۢܳ;

    .line 54
    invoke-virtual {p1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object p1

    check-cast p1, Ll/ۧۗ᩻;

    iput-object p1, p0, Ll/֫ۙ᩻;->ܿ:Ll/ۧۗ᩻;

    .line 55
    iput-object p2, p0, Ll/֫ۙ᩻;->ܽ:Ljava/util/List;

    .line 56
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-le p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/֫ۙ᩻;->ᩳ:Z

    .line 58
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳۜܳ;

    .line 59
    invoke-interface {p2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ll/ᩳۜܳ;->۬()Z

    move-result p2

    if-nez p2, :cond_1

    const/4 v0, 0x1

    .line 64
    :cond_2
    iput-boolean v0, p0, Ll/֫ۙ᩻;->֫:Z

    return-void
.end method

.method public static ֫(Ll/֫ۙ᩻;Ll/ܳۙ᩻;JZLl/ۨۧᩳ;Z)V
    .locals 12

    .line 145
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 146
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 147
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    move-object v1, p0

    .line 149
    iget-object v0, v1, Ll/֫ۙ᩻;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 150
    invoke-interface {v2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 151
    invoke-interface {v2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 154
    :cond_0
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 158
    :cond_1
    new-instance v11, Ll/۟᩶᩻;

    move-object v0, v11

    move-object v1, p0

    move-object/from16 v2, p5

    move/from16 v3, p6

    move/from16 v6, p4

    move-wide v7, p2

    move-object v10, p1

    invoke-direct/range {v0 .. v10}, Ll/۟᩶᩻;-><init>(Ll/֫ۙ᩻;Ll/ۨۧᩳ;ZLjava/util/HashSet;Ljava/util/ArrayList;ZJLjava/util/HashSet;Ll/ܳۙ᩻;)V

    .line 305
    invoke-virtual {v11}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ۙ᩻;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֫ۙ᩻;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/֫ۙ᩻;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۙ᩻;->ۧ:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/֫ۙ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۙ᩻;->ܽ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/֫ۙ᩻;)Ll/ܽۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۙ᩻;->ܳ:Ll/ܽۢܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֫ۙ᩻;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֫ۙ᩻;->ᩳ:Z

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ܳۙ᩻;)V
    .locals 12

    .line 68
    iget-object v0, p0, Ll/֫ۙ᩻;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 71
    iget-object v1, p0, Ll/֫ۙ᩻;->ܿ:Ll/ۧۗ᩻;

    invoke-virtual {v1}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/String;

    .line 72
    invoke-static {v2, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    iput-object v4, p0, Ll/֫ۙ᩻;->ۧ:Ll/ܶ᩵ܿ;

    .line 73
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v4

    const/4 v8, 0x1

    iget-object v5, p0, Ll/֫ۙ᩻;->ܳ:Ll/ܽۢܳ;

    if-eqz v4, :cond_0

    iget-object v4, p0, Ll/֫ۙ᩻;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 74
    :cond_0
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v4

    if-nez v4, :cond_1

    .line 75
    invoke-virtual {v5}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    new-array v1, v8, [Ljava/lang/Object;

    aput-object v2, v1, v3

    const v2, 0x7f120b8d

    invoke-static {v2, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 516
    invoke-virtual {v0, v1, v3}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void

    .line 78
    :cond_1
    :goto_0
    invoke-virtual {v5}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v2

    const v4, 0x7f0d01cd

    invoke-virtual {v2, v4}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/view/ViewGroup;

    const v2, 0x7f0a0074

    .line 79
    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroid/widget/CheckBox;

    const v2, 0x7f0a0075

    .line 80
    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    .line 81
    invoke-virtual {v4, v8}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const/16 v7, 0x8

    .line 82
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 83
    invoke-virtual {v1}, Ll/ۧۗ᩻;->ۜ֫()Z

    move-result v7

    .line 84
    iget-boolean v1, p0, Ll/֫ۙ᩻;->ᩳ:Z

    if-eqz v1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    goto :goto_1

    :cond_2
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩶᩻;

    invoke-virtual {v0}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v0

    :goto_1
    invoke-static {v0, v1}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v9

    if-eqz v7, :cond_3

    .line 85
    iget-object v0, p0, Ll/֫ۙ᩻;->ۧ:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/᩹ۨۡ;->֫(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    move-object v10, v0

    .line 86
    new-instance v11, Ll/ۛ᩶᩻;

    invoke-virtual {v5}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v2

    move-object v0, v11

    move-object v1, p0

    move v3, v7

    move-object v5, v6

    move-object v6, v10

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Ll/ۛ᩶᩻;-><init>(Ll/֫ۙ᩻;Lbin/mt/plus/Main;ZLandroid/widget/CheckBox;Landroid/view/ViewGroup;Ljava/lang/String;Ll/ܳۙ᩻;)V

    const v0, 0x7f1205eb

    .line 132
    invoke-virtual {v11, v0}, Ll/۬ۗܿ;->ۡ(I)V

    .line 133
    invoke-virtual {v11, v9}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 134
    invoke-static {}, Ll/ܿۤۡ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    .line 135
    invoke-virtual {v11}, Ll/۬ۗܿ;->֫()V

    const/4 v0, 0x6

    .line 136
    invoke-virtual {v11, v0}, Ll/۬ۗܿ;->ᩳ(I)V

    const/4 v0, 0x4

    .line 137
    invoke-virtual {v11, v0}, Ll/۬ۗܿ;->ܿ(I)V

    new-instance v1, Ll/֫֫᩻;

    .line 17
    invoke-direct {v1, v8}, Ll/֫֫᩻;-><init>(Z)V

    .line 138
    invoke-virtual {v11, v1}, Ll/۬ۗܿ;->֫(Landroid/text/TextWatcher;)V

    .line 205
    invoke-virtual {v11, v8}, Ll/۬ۗܿ;->ۧ(Z)V

    .line 140
    invoke-virtual {v11}, Ll/۬ۗܿ;->᩷()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/ۢ᩷ᩳ;

    invoke-direct {v2, v0, v11}, Ll/ۢ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    invoke-virtual {v11}, Ll/۬ۗܿ;->ᩳ()Ll/֡ۚۢ;

    move-result-object v0

    invoke-static {v0}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    return-void

    .line 69
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method
