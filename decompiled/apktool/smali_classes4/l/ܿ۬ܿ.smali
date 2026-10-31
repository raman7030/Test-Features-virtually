.class public abstract Ll/ܿ۬ܿ;
.super Ljava/lang/Object;
.source "S5I2"


# instance fields
.field public ֫:Ll/ۗܺ᩷;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ll/֫۫ܿ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Z)V
    .locals 7

    const-string v5, "filter_regex"

    const-string v6, "filter_exactly_match"

    const-string v3, "filter_record"

    const-string v4, "filter_match_case"

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 24
    invoke-direct/range {v0 .. v6}, Ll/ܿ۬ܿ;-><init>(Ll/ۗܺ᩷;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v9, p0

    move-object/from16 v8, p1

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    move-object/from16 v12, p6

    .line 32
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iput-object v13, v9, Ll/ܿ۬ܿ;->ۧ:Ljava/util/ArrayList;

    .line 33
    iput-object v8, v9, Ll/ܿ۬ܿ;->֫:Ll/ۗܺ᩷;

    .line 34
    new-instance v14, Ll/ۙۢ;

    invoke-direct {v14, v8}, Ll/ۙۢ;-><init>(Landroid/content/Context;)V

    .line 35
    new-instance v15, Ll/ۙۢ;

    invoke-direct {v15, v8}, Ll/ۙۢ;-><init>(Landroid/content/Context;)V

    .line 36
    new-instance v7, Ll/ۙۢ;

    invoke-direct {v7, v8}, Ll/ۙۢ;-><init>(Landroid/content/Context;)V

    .line 37
    new-instance v6, Ll/ܽ۬ܿ;

    if-eqz p2, :cond_0

    const v0, 0x7f12017b

    const v4, 0x7f12017b

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    const/4 v4, -0x1

    :goto_0
    move-object v0, v6

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object v5, v15

    move-object/from16 v16, v13

    move-object v13, v6

    move-object v6, v7

    move-object v12, v7

    move-object v7, v14

    move-object/from16 v8, p1

    .line 38
    invoke-direct/range {v0 .. v8}, Ll/ܽ۬ܿ;-><init>(Ll/ܿ۬ܿ;Ll/ۗܺ᩷;Ljava/lang/String;ILl/ۙۢ;Ll/ۙۢ;Ll/ۙۢ;Ll/ۗܺ᩷;)V

    const v0, 0x7f1203d7

    .line 89
    invoke-virtual {v13, v0}, Ll/֫۫ܿ;->֫(I)V

    iput-object v13, v9, Ll/ܿ۬ܿ;->ܽ:Ll/֫۫ܿ;

    .line 90
    new-instance v0, Ll/ۧ۬ܿ;

    invoke-direct {v0, v9}, Ll/ۧ۬ܿ;-><init>(Ll/ܿ۬ܿ;)V

    invoke-virtual {v15, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f12054e

    .line 92
    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setText(I)V

    .line 93
    invoke-virtual {v14, v10}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 94
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const/4 v1, 0x0

    invoke-interface {v0, v10, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v14, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const v0, 0x7f1207ff

    .line 96
    invoke-virtual {v15, v0}, Landroid/widget/TextView;->setText(I)V

    .line 97
    invoke-virtual {v15, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 98
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0, v11, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v15, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const v0, 0x7f12030e

    .line 100
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(I)V

    move-object/from16 v0, p6

    move-object v2, v12

    .line 101
    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 102
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v3, v0, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 104
    invoke-virtual {v13, v14}, Ll/֫۫ܿ;->֫(Landroid/view/View;)V

    .line 105
    invoke-virtual {v13, v15}, Ll/֫۫ܿ;->֫(Landroid/view/View;)V

    .line 106
    invoke-virtual {v13, v2}, Ll/֫۫ܿ;->֫(Landroid/view/View;)V

    move-object/from16 v0, v16

    .line 108
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿ۬ܿ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ۬ܿ;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܿ۬ܿ;Z)V
    .locals 0

    .line 90
    iget-object p0, p0, Ll/ܿ۬ܿ;->ܽ:Ll/֫۫ܿ;

    invoke-virtual {p0}, Ll/֫۫ܿ;->ۧ()Ll/ۚۖۡ;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/ۚۖۡ;->ۧ(Z)V

    return-void
.end method


# virtual methods
.method public abstract ֫()V
.end method

.method public final ֫(IZ)V
    .locals 2

    .line 123
    new-instance v0, Ll/ۙۢ;

    iget-object v1, p0, Ll/ܿ۬ܿ;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, v1}, Ll/ۙۢ;-><init>(Landroid/content/Context;)V

    .line 124
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 129
    invoke-virtual {v0, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 131
    iget-object p1, p0, Ll/ܿ۬ܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    iget-object p1, p0, Ll/ܿ۬ܿ;->ܽ:Ll/֫۫ܿ;

    const/4 p2, 0x1

    invoke-virtual {p1, v0, p2}, Ll/֫۫ܿ;->֫(Landroid/view/View;I)V

    return-void
.end method

.method public final ֫(Ll/ۗۡ;)V
    .locals 2

    const/4 v0, 0x0

    .line 114
    iget-object v1, p0, Ll/ܿ۬ܿ;->ܽ:Ll/֫۫ܿ;

    invoke-virtual {v1, p1, v0}, Ll/֫۫ܿ;->֫(Landroid/view/View;I)V

    return-void
.end method

.method public abstract ֫(Ll/ᩳ۬ܿ;Ljava/lang/String;)V
.end method

.method public final ֫(I)Z
    .locals 4

    .line 145
    iget-object v0, p0, Ll/ܿ۬ܿ;->ۧ:Ljava/util/ArrayList;

    if-ltz p1, :cond_0

    add-int/lit8 v1, p1, 0x3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 148
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙۢ;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    return p1

    .line 146
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Index: "

    const-string v3, ", Size: "

    .line 0
    invoke-static {p1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 146
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()V
    .locals 1

    .line 137
    iget-object v0, p0, Ll/ܿ۬ܿ;->ܽ:Ll/֫۫ܿ;

    invoke-virtual {v0}, Ll/֫۫ܿ;->᩻()V

    return-void
.end method
