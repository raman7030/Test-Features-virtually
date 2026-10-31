.class public final Ll/ۚۧᩳ;
.super Ljava/lang/Object;
.source "56B1"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public ۗ:I

.field public ۙ:Z

.field public final ۛ:Ll/ۧ۟ܽ;

.field public final ۤ:Landroid/widget/CheckBox;

.field public final ۫:Ljava/util/ArrayList;

.field public final ۬:Landroid/widget/Spinner;

.field public ᩶:Z

.field public final ᩸:Ll/۫۟ܽ;

.field public ᩹:Ll/֡ۚۢ;


# direct methods
.method public constructor <init>(Ll/۫۟ܽ;)V
    .locals 2

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۚۧᩳ;->۫:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 46
    iput v0, p0, Ll/ۚۧᩳ;->ۗ:I

    const/4 v0, 0x1

    .line 214
    iput-boolean v0, p0, Ll/ۚۧᩳ;->᩶:Z

    .line 49
    iput-object p1, p0, Ll/ۚۧᩳ;->᩸:Ll/۫۟ܽ;

    const v0, 0x7f0d0089

    .line 50
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0553

    .line 51
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    iput-object v1, p0, Ll/ۚۧᩳ;->۬:Landroid/widget/Spinner;

    const v1, 0x7f0a00d9

    .line 52
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/ۚۧᩳ;->ۤ:Landroid/widget/CheckBox;

    const v1, 0x7f0a05a2

    .line 53
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۧ۟ܽ;

    iput-object v1, p0, Ll/ۚۧᩳ;->ۛ:Ll/ۧ۟ܽ;

    .line 55
    new-instance v1, Ll/ۖۧᩳ;

    invoke-direct {v1, p0, p1, v0}, Ll/ۖۧᩳ;-><init>(Ll/ۚۧᩳ;Ll/۫۟ܽ;Landroid/view/View;)V

    .line 172
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۧᩳ;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۚۧᩳ;->ۧ(Ll/֨ۧᩳ;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۚۧᩳ;)V
    .locals 2

    .line 273
    new-instance v0, Landroid/content/Intent;

    iget-object p0, p0, Ll/ۚۧᩳ;->᩸:Ll/۫۟ܽ;

    const-class v1, Ll/᩺ܿ᩷;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 274
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۧᩳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۚۧᩳ;->ۗ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۧᩳ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۚۧᩳ;->᩹:Ll/֡ۚۢ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۧᩳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ۚۧᩳ;->ۙ:Z

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۚۧᩳ;)Ll/ۧ۟ܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۧᩳ;->ۛ:Ll/ۧ۟ܽ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۚۧᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۚۧᩳ;->ܿ()V

    return-void
.end method

.method public static ۧ(Ll/֨ۧᩳ;)Ljava/lang/String;
    .locals 3

    .line 191
    instance-of v0, p0, Ll/ۜۧᩳ;

    if-eqz v0, :cond_0

    .line 192
    check-cast p0, Ll/ۜۧᩳ;

    .line 193
    invoke-virtual {p0}, Ll/ۜۧᩳ;->ܺ()Ljava/lang/String;

    move-result-object v0

    .line 194
    invoke-virtual {p0}, Ll/ۜۧᩳ;->ۡ()Lbin/mt/plugin/api/translation/TranslationEngine;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "@|"

    const-string v2, "|"

    .line 0
    invoke-static {v1, v0, v2, p0}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 196
    :cond_0
    instance-of v0, p0, Ll/ۧۧᩳ;

    if-eqz v0, :cond_1

    .line 197
    check-cast p0, Ll/ۧۧᩳ;

    .line 198
    invoke-virtual {p0}, Ll/ۧۧᩳ;->ۡ()Ll/᩶֫ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩶֫ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    const-string v0, "#|"

    .line 0
    invoke-static {v0, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ll/ۚۧᩳ;)V
    .locals 3

    .line 266
    iget-object v0, p0, Ll/ۚۧᩳ;->۫:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۚۧᩳ;->۬:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ۧᩳ;

    .line 267
    invoke-virtual {v0}, Ll/֨ۧᩳ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 269
    :cond_0
    iget-object v1, p0, Ll/ۚۧᩳ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {v1}, Ll/֡ۚۢ;->dismiss()V

    .line 282
    iget-object v1, p0, Ll/ۚۧᩳ;->᩸:Ll/۫۟ܽ;

    invoke-virtual {v1}, Ll/۫۟ܽ;->۟()Ljava/util/List;

    move-result-object v1

    .line 283
    new-instance v2, Ll/ᩴۧᩳ;

    invoke-direct {v2, p0, v0, v1}, Ll/ᩴۧᩳ;-><init>(Ll/ۚۧᩳ;Ll/֨ۧᩳ;Ljava/util/List;)V

    .line 423
    invoke-virtual {v2}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۚۧᩳ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۧᩳ;->۫:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۚۧᩳ;)Ll/۫۟ܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۧᩳ;->᩸:Ll/۫۟ܽ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۚۧᩳ;)Landroid/widget/Spinner;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۧᩳ;->۬:Landroid/widget/Spinner;

    return-object p0
.end method

.method private ܿ()V
    .locals 5

    .line 253
    invoke-static {}, Ll/᩺᩵ۡ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f120757

    .line 254
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 257
    :cond_0
    iget-object v0, p0, Ll/ۚۧᩳ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/ۚۧᩳ;->᩸:Ll/۫۟ܽ;

    if-eqz v1, :cond_1

    const v0, 0x7f120a94

    .line 258
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 259
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/᩺ܿ᩷;

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 262
    :cond_1
    iget-object v1, p0, Ll/ۚۧᩳ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {v1}, Ll/֡ۚۢ;->᩷()V

    .line 263
    iget-boolean v1, p0, Ll/ۚۧᩳ;->᩶:Z

    if-eqz v1, :cond_2

    const/4 v0, 0x0

    .line 264
    iput-boolean v0, p0, Ll/ۚۧᩳ;->᩶:Z

    .line 265
    iget-object v0, p0, Ll/ۚۧᩳ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۛ᩶ܽ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ۛ᩶ܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 272
    iget-object v0, p0, Ll/ۚۧᩳ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ᩳۘܳ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/ᩳۘܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 509
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_3
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_4

    .line 510
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Ll/ۧۧᩳ;

    if-eqz v3, :cond_3

    .line 511
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 513
    :cond_4
    invoke-static {}, Ll/֫ۧᩳ;->֫()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶֫ᩳ;

    .line 514
    new-instance v4, Ll/ۧۧᩳ;

    invoke-direct {v4, v2, v3}, Ll/ۧۧᩳ;-><init>(Ll/ۗܺ᩷;Ll/᩶֫ᩳ;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 516
    :cond_5
    iget-object v0, p0, Ll/ۚۧᩳ;->۬:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 517
    invoke-direct {p0}, Ll/ۚۧᩳ;->ᩳ()V

    return-void
.end method

.method private ᩳ()V
    .locals 6

    .line 176
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "auto_translation_record"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 177
    iget-object v1, p0, Ll/ۚۧᩳ;->۬:Landroid/widget/Spinner;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const/4 v3, 0x0

    .line 178
    :goto_0
    iget-object v4, p0, Ll/ۚۧᩳ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v3, v5, :cond_1

    .line 179
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֨ۧᩳ;

    .line 180
    invoke-static {v4}, Ll/ۚۧᩳ;->ۧ(Ll/֨ۧᩳ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 181
    invoke-virtual {v1, v3}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 186
    :cond_1
    invoke-virtual {v1, v2}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ۚۧᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚۧᩳ;->ۙ:Z

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ۚۧᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۚۧᩳ;->ᩳ()V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ۚۧᩳ;)Landroid/widget/CheckBox;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۧᩳ;->ۤ:Landroid/widget/CheckBox;

    return-object p0
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 522
    invoke-static {}, Ll/ۜۧᩳ;->᩵()V

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 427
    iget-object v0, p0, Ll/ۚۧᩳ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۧᩳ;

    .line 428
    invoke-virtual {v1}, Ll/֨ۧᩳ;->᩻()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 433
    iget v0, p0, Ll/ۚۧᩳ;->ۗ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-static {}, Ll/۬ܿ᩷;->ܽ()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 439
    new-instance v0, Ll/᩵ۧᩳ;

    invoke-direct {v0, p0}, Ll/᩵ۧᩳ;-><init>(Ll/ۚۧᩳ;)V

    .line 505
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 217
    iget-boolean v0, p0, Ll/ۚۧᩳ;->ۙ:Z

    if-eqz v0, :cond_0

    .line 218
    new-instance v0, Ll/ۘۧᩳ;

    invoke-direct {v0, p0}, Ll/ۘۧᩳ;-><init>(Ll/ۚۧᩳ;)V

    .line 246
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 248
    :cond_0
    invoke-direct {p0}, Ll/ۚۧᩳ;->ܿ()V

    return-void
.end method
