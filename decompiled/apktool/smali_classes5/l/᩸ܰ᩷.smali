.class public Ll/᩸ܰ᩷;
.super Ll/ۡ᩻֫;
.source "I1KV"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Ll/ܶܳۡ;
.implements Ll/۠ܳۡ;
.implements Ll/֡۬᩷;


# instance fields
.field public ֫֫:Ll/۬۬ۧ;

.field public ۗ:Ll/ۛ᩵᩷;

.field public ۙ:Z

.field public ۛ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public ۟:I

.field public ۤ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public ۧ֫:Ll/ۘۛ᩷;

.field public ۨ:Ll/۬᩵᩷;

.field public ۫:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public ۬:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public ܰ:Landroid/animation/AnimatorSet;

.field public ᩶:Ll/᩵ۨ᩷;

.field public ᩸:Ll/ܰܳۡ;

.field public ᩹:Z

.field public ᩺:Ll/ۛ᩵᩷;


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f0d01ce

    .line 101
    invoke-direct {p0, v0}, Ll/ۡ᩻֫;-><init>(I)V

    const/4 v0, -0x1

    .line 94
    iput v0, p0, Ll/᩸ܰ᩷;->۟:I

    return-void
.end method

.method private ֫(ILjava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 893
    invoke-static {p2}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 894
    new-instance v7, Ll/ۚܰ᩷;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll/ۗܺ᩷;

    move-object v0, v7

    move-object v1, p0

    move-object v3, v6

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Ll/ۚܰ᩷;-><init>(Ll/᩸ܰ᩷;Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 925
    invoke-virtual {v7, p1}, Ll/۬ۗܿ;->ۡ(I)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "-"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 926
    invoke-virtual {v7, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 927
    invoke-virtual {v7}, Ll/۬ۗܿ;->֫()V

    .line 928
    invoke-virtual {v7}, Ll/۬ۗܿ;->֡()V

    const/4 p1, 0x6

    .line 929
    invoke-virtual {v7, p1}, Ll/۬ۗܿ;->ᩳ(I)V

    const/4 p1, 0x1

    .line 205
    invoke-virtual {v7, p1}, Ll/۬ۗܿ;->ۧ(Z)V

    .line 931
    new-instance p1, Ll/ܶܰ᩷;

    invoke-direct {p1, v6, v7}, Ll/ܶܰ᩷;-><init>(Ljava/lang/String;Ll/۬ۗܿ;)V

    invoke-virtual {v7, p1}, Ll/۬ۗܿ;->֫(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private ֫(Ljava/lang/Runnable;)V
    .locals 3

    .line 839
    iget-boolean v0, p0, Ll/᩸ܰ᩷;->᩹:Z

    if-eqz v0, :cond_0

    .line 840
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 842
    :cond_0
    new-instance v0, Ll/᩷ܰ᩷;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ll/᩷ܰ᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v1, 0x64

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static ֫(Ll/᩸ܰ᩷;)V
    .locals 2

    .line 648
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    if-nez v0, :cond_0

    return-void

    .line 651
    :cond_0
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_1

    const p0, 0x7f120415

    .line 652
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 655
    :cond_1
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0}, Ll/ܰܳۡ;->ۢ()Ljava/util/HashSet;

    move-result-object v0

    .line 656
    iget-object v1, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    invoke-virtual {v1, v0}, Ll/᩵ۨ᩷;->֫(Ljava/util/Collection;)V

    .line 657
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0}, Ll/ܰܳۡ;->ᩴ()V

    const/4 v0, 0x1

    .line 658
    invoke-direct {p0, v0}, Ll/᩸ܰ᩷;->֫(Z)V

    .line 659
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p0

    check-cast p0, Ll/ܿۛ᩷;

    invoke-virtual {p0}, Ll/ܿۛ᩷;->᩷֫()V

    return-void
.end method

.method public static ֫(Ll/᩸ܰ᩷;Ljava/lang/Integer;)V
    .locals 3

    .line 229
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x7f0a033f

    if-ne v0, v1, :cond_2

    .line 230
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1}, Ll/ܰܳۡ;->ۖ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 231
    iget-boolean p1, p0, Ll/᩸ܰ᩷;->ۙ:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 234
    :cond_0
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1}, Ll/ܰܳۡ;->֫()V

    :cond_1
    const/4 p1, 0x1

    .line 236
    iput-boolean p1, p0, Ll/᩸ܰ᩷;->ۙ:Z

    .line 237
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ܰܳۡ;->ۧ(Z)V

    .line 238
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1}, Ll/ܰܳۡ;->֡()V

    .line 239
    invoke-direct {p0}, Ll/᩸ܰ᩷;->ܽ()V

    return-void

    .line 240
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7f0a0354

    if-ne p1, v0, :cond_4

    .line 241
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1}, Ll/ܰܳۡ;->ۖ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 242
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1}, Ll/ܰܳۡ;->֫()V

    .line 244
    :cond_3
    iget-object p0, p0, Ll/᩸ܰ᩷;->᩺:Ll/ۛ᩵᩷;

    const-string p1, "zip"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x8

    const v1, 0x7f1205e1

    const/4 v2, 0x0

    .line 0
    invoke-static {p0, v1, v2, p1, v0}, Ll/ۛ᩵᩷;->֫(Ll/ۛ᩵᩷;ILjava/lang/String;[Ljava/lang/String;I)V

    :cond_4
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩸ܰ᩷;Ljava/lang/Runnable;)V
    .locals 1

    .line 843
    invoke-virtual {p0}, Ll/ۡ᩻֫;->isResumed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 844
    invoke-direct {p0, p1}, Ll/᩸ܰ᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩸ܰ᩷;Ljava/lang/String;)V
    .locals 2

    .line 200
    new-instance v0, Ll/ۨ֨ܿ;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Ll/ۨ֨ܿ;-><init>(Ljava/lang/Object;Ljava/lang/Comparable;I)V

    invoke-direct {p0, v0}, Ll/᩸ܰ᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸ܰ᩷;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 196
    new-instance v0, Ll/ܳܰ᩷;

    invoke-direct {v0, p0, p1, p2}, Ll/ܳܰ᩷;-><init>(Ll/᩸ܰ᩷;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-direct {p0, v0}, Ll/᩸ܰ᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸ܰ᩷;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const v0, 0x7f1205e1

    .line 0
    invoke-direct {p0, v0, p1, p2}, Ll/᩸ܰ᩷;->֫(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/᩸ܰ᩷;Ll/ܽ᩻ۡ;)V
    .locals 1

    .line 450
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ۜ()V

    .line 451
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 452
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1880
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩵ۨ᩷;->֫(Ljava/util/Collection;)V

    goto :goto_0

    .line 454
    :cond_0
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩵ۨ᩷;->᩷(Ljava/lang/String;)V

    .line 456
    :goto_0
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p0

    check-cast p0, Ll/ܿۛ᩷;

    invoke-virtual {p0}, Ll/ܿۛ᩷;->᩷֫()V

    return-void
.end method

.method public static ֫(Ll/᩸ܰ᩷;Ll/ܽ᩻ۡ;Landroid/view/MenuItem;)V
    .locals 11

    .line 420
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x7f1205ff

    if-ne p2, v0, :cond_0

    .line 422
    new-instance p2, Ll/۟᩺᩷;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Ll/۟᩺᩷;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/۟᩺᩷;->֫()V

    return-void

    :cond_0
    const v0, 0x7f1205c2

    const/4 v1, 0x6

    const/4 v2, 0x1

    if-ne p2, v0, :cond_1

    .line 424
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v8

    .line 983
    invoke-static {v8}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 984
    invoke-static {v8}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 985
    invoke-static {v9}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 986
    new-instance v10, Ll/۠ܰ᩷;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ll/ۗܺ᩷;

    move-object v3, v10

    move-object v4, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v3 .. v9}, Ll/۠ܰ᩷;-><init>(Ll/᩸ܰ᩷;Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1021
    invoke-virtual {v10, v0}, Ll/۬ۗܿ;->ۡ(I)V

    .line 1022
    invoke-virtual {v10, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 1023
    invoke-virtual {v10}, Ll/۬ۗܿ;->֫()V

    .line 1024
    invoke-virtual {v10, v1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 1025
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v10, p0, p1}, Ll/۬ۗܿ;->֫(II)V

    .line 205
    invoke-virtual {v10, v2}, Ll/۬ۗܿ;->ۧ(Z)V

    .line 1027
    new-instance p0, Ll/ܶܰ᩷;

    invoke-direct {p0, p2, v10}, Ll/ܶܰ᩷;-><init>(Ljava/lang/String;Ll/۬ۗܿ;)V

    invoke-virtual {v10, p0}, Ll/۬ۗܿ;->֫(Landroid/text/TextWatcher;)V

    return-void

    :cond_1
    const v0, 0x7f1205f9

    if-ne p2, v0, :cond_2

    .line 426
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v8

    .line 935
    invoke-static {v8}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 936
    invoke-static {v8}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 937
    invoke-static {v9}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 938
    new-instance v10, Ll/֨ܰ᩷;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ll/ۗܺ᩷;

    move-object v3, v10

    move-object v4, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v3 .. v9}, Ll/֨ܰ᩷;-><init>(Ll/᩸ܰ᩷;Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 973
    invoke-virtual {v10, v0}, Ll/۬ۗܿ;->ۡ(I)V

    .line 974
    invoke-virtual {v10, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 975
    invoke-virtual {v10}, Ll/۬ۗܿ;->֫()V

    .line 976
    invoke-virtual {v10}, Ll/۬ۗܿ;->֡()V

    .line 977
    invoke-virtual {v10, v1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 205
    invoke-virtual {v10, v2}, Ll/۬ۗܿ;->ۧ(Z)V

    .line 979
    new-instance p0, Ll/ܶܰ᩷;

    invoke-direct {p0, p2, v10}, Ll/ܶܰ᩷;-><init>(Ljava/lang/String;Ll/۬ۗܿ;)V

    invoke-virtual {v10, p0}, Ll/۬ۗܿ;->֫(Landroid/text/TextWatcher;)V

    return-void

    :cond_2
    const v0, 0x7f1205ad

    if-ne p2, v0, :cond_5

    .line 428
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->֫()I

    move-result p2

    if-eqz p2, :cond_4

    if-eq p2, v2, :cond_3

    goto/16 :goto_0

    .line 433
    :cond_3
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    const-string p2, "<?xml version=\'1.0\' encoding=\'utf-8\' ?>\n<resources>\n    \n</resources>\n"

    .line 886
    invoke-direct {p0, v0, p1, p2}, Ll/᩸ܰ᩷;->֫(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 430
    :cond_4
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    .line 663
    new-instance p2, Ll/ۘܰ᩷;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v3

    check-cast v3, Ll/ۗܺ᩷;

    invoke-direct {p2, p0, v3, p1}, Ll/ۘܰ᩷;-><init>(Ll/᩸ܰ᩷;Ll/ۗܺ᩷;Ljava/lang/String;)V

    .line 704
    invoke-virtual {p2, v0}, Ll/۬ۗܿ;->ۡ(I)V

    const-string p0, "attr, string, style..."

    .line 705
    invoke-virtual {p2, p0}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    .line 706
    invoke-virtual {p2}, Ll/۬ۗܿ;->֫()V

    .line 707
    invoke-virtual {p2, v1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 205
    invoke-virtual {p2, v2}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    :cond_5
    const v0, 0x7f1205e1

    const/4 v6, 0x0

    if-ne p2, v0, :cond_6

    .line 442
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const-string p2, "path"

    .line 443
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v9, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    iget-object v3, p0, Ll/᩸ܰ᩷;->ۨ:Ll/۬᩵᩷;

    const-string p0, "xml"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v8

    const/4 v4, 0x1

    const/4 v7, 0x0

    const v5, 0x7f1205e1

    .line 1718
    invoke-virtual/range {v3 .. v9}, Ll/ܶ᩵᩷;->֫(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    :cond_6
    const/4 v0, 0x0

    const v1, 0x7f1205ca

    if-ne p2, v1, :cond_7

    .line 446
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object p2

    sget v3, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v3, Ll/᩵ۚۢ;

    invoke-direct {v3, p2}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 447
    invoke-virtual {v3, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 448
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ۧ()Ljava/lang/String;

    move-result-object p2

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p2, v1, v0

    const p2, 0x7f120870

    invoke-virtual {p0, p2, v1}, Ll/ۡ᩻֫;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p2, Ll/ۘۜ᩷;

    invoke-direct {p2, v2, p0, p1}, Ll/ۘۜ᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p0, 0x7f12070a

    .line 449
    invoke-virtual {v3, p0, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    .line 457
    invoke-virtual {v3, p0, v6}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 458
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_7
    const v1, 0x7f120120

    if-ne p2, v1, :cond_8

    .line 460
    iput-boolean v0, p0, Ll/᩸ܰ᩷;->ۙ:Z

    .line 461
    iget-object p2, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p2, v2}, Ll/ܰܳۡ;->ۧ(Z)V

    .line 462
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->᩷()V

    .line 463
    invoke-direct {p0}, Ll/᩸ܰ᩷;->ܽ()V

    return-void

    :cond_8
    const v1, 0x7f12011a

    if-ne p2, v1, :cond_9

    .line 465
    iput-boolean v2, p0, Ll/᩸ܰ᩷;->ۙ:Z

    .line 466
    iget-object p2, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p2, v0}, Ll/ܰܳۡ;->ۧ(Z)V

    .line 467
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->᩷()V

    .line 468
    invoke-direct {p0}, Ll/᩸ܰ᩷;->ܽ()V

    :cond_9
    :goto_0
    return-void
.end method

.method public static ֫(Ll/᩸ܰ᩷;Ll/ܿۛۡ;[BLl/᩵ۨ᩷;)V
    .locals 5

    .line 157
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0, p1}, Ll/ܰܳۡ;->֫(Ll/ܿۛۡ;)V

    const/4 v0, 0x0

    .line 158
    iput v0, p0, Ll/᩸ܰ᩷;->۟:I

    .line 159
    iget-object v1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    .line 307
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 308
    iget-object v3, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    if-nez v3, :cond_0

    goto :goto_2

    .line 311
    :cond_0
    invoke-virtual {v3}, Ll/᩵ۨ᩷;->᩷()Ll/ۧ۫᩷;

    move-result-object v3

    const-string v4, "explorer"

    invoke-virtual {v3, v4}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 312
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 160
    invoke-virtual {p1}, Ll/ܿۛۡ;->֫()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۛۡ;

    .line 161
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/ܿۛۡ;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 317
    :cond_1
    :try_start_0
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object p1

    .line 318
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    const v4, 0x12345679

    if-ne v3, v4, :cond_2

    .line 319
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    iput v3, p0, Ll/᩸ܰ᩷;->۟:I

    .line 320
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    :goto_1
    if-ge v0, v3, :cond_2

    .line 322
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_0
    nop

    .line 159
    :cond_2
    :goto_2
    invoke-virtual {v1, v2}, Ll/ܰܳۡ;->֫(Ljava/util/HashSet;)V

    .line 164
    iget-object p1, p0, Ll/᩸ܰ᩷;->֫֫:Ll/۬۬ۧ;

    if-eqz p1, :cond_3

    .line 165
    iget v0, p0, Ll/᩸ܰ᩷;->۟:I

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->scrollToPosition(I)V

    const/4 p1, -0x1

    .line 166
    iput p1, p0, Ll/᩸ܰ᩷;->۟:I

    :cond_3
    if-eqz p2, :cond_5

    .line 169
    array-length p1, p2

    if-nez p1, :cond_4

    .line 170
    invoke-virtual {p3}, Ll/᩵ۨ᩷;->ۢ()Ll/ۧ۫᩷;

    move-result-object p1

    const-string p2, "selection"

    invoke-virtual {p1, p2}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 172
    :try_start_1
    iget-object p2, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object p3

    invoke-virtual {p2, p3}, Ll/ܰܳۡ;->֫([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p0

    .line 176
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۫()Z

    .line 177
    throw p0

    .line 176
    :catch_1
    :goto_3
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۫()Z

    goto :goto_4

    .line 179
    :cond_4
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1, p2}, Ll/ܰܳۡ;->֫([B)V

    :cond_5
    :goto_4
    const/4 p1, 0x1

    .line 182
    iput-boolean p1, p0, Ll/᩸ܰ᩷;->᩹:Z

    .line 183
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object p1

    .line 184
    instance-of p2, p1, Ll/ܿۛ᩷;

    if-eqz p2, :cond_6

    .line 185
    check-cast p1, Ll/ܿۛ᩷;

    invoke-virtual {p1}, Ll/ܿۛ᩷;->ܳ֫()V

    .line 187
    :cond_6
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 188
    iget-object p1, p0, Ll/᩸ܰ᩷;->ۧ֫:Ll/ۘۛ᩷;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getViewLifecycleOwner()Ll/᩻ۡ֫;

    move-result-object p2

    new-instance p3, Ll/ᩳܰ᩷;

    invoke-direct {p3, p0}, Ll/ᩳܰ᩷;-><init>(Ll/᩸ܰ᩷;)V

    invoke-virtual {p1, p2, p3}, Ll/ۘۛ᩷;->ۧ(Ll/᩻ۡ֫;Ll/᩶ۤۡ;)V

    .line 189
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1}, Ll/ܰܳۡ;->ۖ()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 190
    invoke-direct {p0}, Ll/᩸ܰ᩷;->ᩳ()V

    :cond_7
    return-void
.end method

.method public static synthetic ֫(Ll/᩸ܰ᩷;[BLl/᩵ۨ᩷;)V
    .locals 3

    .line 153
    iput-object p2, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    .line 154
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ۡܰ᩷;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Ll/ۡܰ᩷;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private ֫(Z)V
    .locals 14

    .line 583
    iget-object v0, p0, Ll/᩸ܰ᩷;->ܰ:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 584
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 585
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 588
    :cond_0
    iget-object v0, p0, Ll/᩸ܰ᩷;->ۤ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 589
    iget-object v1, p0, Ll/᩸ܰ᩷;->ۛ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 590
    iget-boolean v2, p0, Ll/᩸ܰ᩷;->ۙ:Z

    const/4 v3, 0x4

    if-eqz v2, :cond_1

    .line 591
    iget-object v2, p0, Ll/᩸ܰ᩷;->۫:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 592
    iget-object v4, p0, Ll/᩸ܰ᩷;->۬:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v4, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    goto :goto_0

    .line 594
    :cond_1
    iget-object v2, p0, Ll/᩸ܰ᩷;->۬:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 595
    iget-object v4, p0, Ll/᩸ܰ᩷;->۫:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v4, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 598
    :goto_0
    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    const-wide/16 v4, 0xc8

    invoke-virtual {v3, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    move-result-object v3

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x2

    if-eqz p1, :cond_2

    new-array p1, v7, [F

    .line 600
    fill-array-data p1, :array_0

    const-string v8, "alpha"

    invoke-static {v2, v8, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    new-array v9, v7, [F

    .line 601
    fill-array-data v9, :array_1

    invoke-static {v0, v8, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v9

    new-array v10, v7, [F

    .line 602
    fill-array-data v10, :array_2

    invoke-static {v1, v8, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v8

    new-array v4, v4, [Landroid/animation/Animator;

    aput-object p1, v4, v6

    aput-object v9, v4, v5

    aput-object v8, v4, v7

    .line 603
    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_1

    .line 605
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 607
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v8

    iget v9, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v8, v9

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v8, p1

    int-to-float p1, v8

    new-array v8, v7, [F

    const/4 v9, 0x0

    aput v9, v8, v6

    aput p1, v8, v5

    const-string p1, "translationY"

    .line 606
    invoke-static {v2, p1, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 609
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 611
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v11

    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v11, v12

    iget v10, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v11, v10

    int-to-float v10, v11

    new-array v11, v7, [F

    aput v9, v11, v6

    aput v10, v11, v5

    .line 610
    invoke-static {v0, p1, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v10

    .line 613
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 615
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v12

    iget v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v12, v13

    iget v11, v11, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v12, v11

    int-to-float v11, v12

    new-array v12, v7, [F

    aput v9, v12, v6

    aput v11, v12, v5

    .line 614
    invoke-static {v1, p1, v12}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 617
    new-instance v9, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v9}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v3, v9}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-array v4, v4, [Landroid/animation/Animator;

    aput-object v8, v4, v6

    aput-object v10, v4, v5

    aput-object p1, v4, v7

    .line 618
    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 620
    :goto_1
    new-instance p1, Ll/ۖܰ᩷;

    invoke-direct {p1, v2, v0, v1}, Ll/ۖܰ᩷;-><init>(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V

    invoke-virtual {v3, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 643
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->start()V

    .line 644
    iput-object v3, p0, Ll/᩸ܰ᩷;->ܰ:Landroid/animation/AnimatorSet;

    return-void

    :array_0
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x0
    .end array-data

    :array_2
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x0
    .end array-data
.end method

.method public static synthetic ۧ(Ll/᩸ܰ᩷;)V
    .locals 1

    .line 475
    iget-object p0, p0, Ll/᩸ܰ᩷;->֫֫:Ll/۬۬ۧ;

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 476
    invoke-virtual {p0, v0}, Ll/۬۬ۧ;->suppressLayout(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic ۧ(Ll/᩸ܰ᩷;Ljava/lang/String;)V
    .locals 1

    .line 198
    new-instance v0, Ll/ۜܰ᩷;

    invoke-direct {v0, p0, p1}, Ll/ۜܰ᩷;-><init>(Ll/᩸ܰ᩷;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ll/᩸ܰ᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/᩸ܰ᩷;)Ll/ۘۛ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ܰ᩷;->ۧ֫:Ll/ۘۛ᩷;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩸ܰ᩷;)Ll/ܰܳۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    return-object p0
.end method

.method private ܽ()V
    .locals 12

    .line 534
    iget-object v0, p0, Ll/᩸ܰ᩷;->ܰ:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 535
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 536
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 539
    :cond_0
    iget-object v0, p0, Ll/᩸ܰ᩷;->ۤ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 540
    iget-object v1, p0, Ll/᩸ܰ᩷;->ۛ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 541
    iget-boolean v2, p0, Ll/᩸ܰ᩷;->ۙ:Z

    const/4 v3, 0x4

    if-eqz v2, :cond_1

    .line 542
    iget-object v2, p0, Ll/᩸ܰ᩷;->۫:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 543
    iget-object v4, p0, Ll/᩸ܰ᩷;->۬:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v4, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    goto :goto_0

    .line 545
    :cond_1
    iget-object v2, p0, Ll/᩸ܰ᩷;->۬:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 546
    iget-object v4, p0, Ll/᩸ܰ᩷;->۫:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v4, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 549
    :goto_0
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 550
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 551
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v3, 0x0

    .line 553
    invoke-virtual {v2, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 554
    invoke-virtual {v0, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 555
    invoke-virtual {v1, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 557
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 558
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v5

    iget v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v5, v6

    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v5, v4

    int-to-float v4, v5

    .line 559
    invoke-virtual {v2, v4}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationY(F)V

    const v5, 0x3f4ccccd    # 0.8f

    .line 560
    invoke-virtual {v2, v5}, Landroid/view/View;->setAlpha(F)V

    const/4 v6, 0x2

    new-array v7, v6, [F

    aput v4, v7, v3

    const/4 v4, 0x1

    const/4 v8, 0x0

    aput v8, v7, v4

    const-string v9, "translationY"

    .line 561
    invoke-static {v2, v9, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 563
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 564
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v10

    iget v11, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v10, v11

    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v10, v7

    int-to-float v7, v10

    .line 565
    invoke-virtual {v0, v7}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationY(F)V

    .line 566
    invoke-virtual {v0, v5}, Landroid/view/View;->setAlpha(F)V

    new-array v10, v6, [F

    aput v7, v10, v3

    aput v8, v10, v4

    .line 567
    invoke-static {v0, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 569
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 570
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v10

    iget v11, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v10, v11

    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v10, v7

    int-to-float v7, v10

    .line 571
    invoke-virtual {v1, v7}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationY(F)V

    .line 572
    invoke-virtual {v1, v5}, Landroid/view/View;->setAlpha(F)V

    new-array v5, v6, [F

    aput v7, v5, v3

    aput v8, v5, v4

    .line 573
    invoke-static {v1, v9, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 575
    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    const-wide/16 v7, 0xc8

    invoke-virtual {v5, v7, v8}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    move-result-object v5

    .line 576
    new-instance v7, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v7}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v5, v7}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/4 v7, 0x3

    new-array v7, v7, [Landroid/animation/Animator;

    aput-object v2, v7, v3

    aput-object v0, v7, v4

    aput-object v1, v7, v6

    .line 577
    invoke-virtual {v5, v7}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 578
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    .line 579
    iput-object v5, p0, Ll/᩸ܰ᩷;->ܰ:Landroid/animation/AnimatorSet;

    return-void
.end method

.method public static ܽ(Ll/᩸ܰ᩷;Ljava/lang/String;)V
    .locals 2

    .line 798
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    if-nez v0, :cond_0

    return-void

    .line 801
    :cond_0
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0}, Ll/ܰܳۡ;->ۢ()Ljava/util/HashSet;

    move-result-object v0

    .line 802
    new-instance v1, Ll/᩵ܰ᩷;

    invoke-direct {v1, p0, p1, v0}, Ll/᩵ܰ᩷;-><init>(Ll/᩸ܰ᩷;Ljava/lang/String;Ljava/util/HashSet;)V

    .line 835
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/᩸ܰ᩷;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩸ܰ᩷;->ۙ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩸ܰ᩷;)Ll/᩵ۨ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    return-object p0
.end method

.method private ᩳ()V
    .locals 5

    .line 505
    iget-object v0, p0, Ll/᩸ܰ᩷;->ۤ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 506
    iget-object v1, p0, Ll/᩸ܰ᩷;->ۛ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 507
    iget-boolean v2, p0, Ll/᩸ܰ᩷;->ۙ:Z

    const/4 v3, 0x4

    if-eqz v2, :cond_0

    .line 508
    iget-object v2, p0, Ll/᩸ܰ᩷;->۫:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 509
    iget-object v4, p0, Ll/᩸ܰ᩷;->۬:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v4, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    goto :goto_0

    .line 511
    :cond_0
    iget-object v2, p0, Ll/᩸ܰ᩷;->۬:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 512
    iget-object v4, p0, Ll/᩸ܰ᩷;->۫:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v4, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 515
    :goto_0
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 516
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 517
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v3, 0x0

    .line 519
    invoke-virtual {v2, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 520
    invoke-virtual {v0, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 521
    invoke-virtual {v1, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    const/4 v3, 0x0

    .line 523
    invoke-virtual {v2, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationY(F)V

    const v4, 0x3f4ccccd    # 0.8f

    .line 524
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 525
    invoke-virtual {v0, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationY(F)V

    .line 526
    invoke-virtual {v0, v4}, Landroid/view/View;->setAlpha(F)V

    .line 527
    invoke-virtual {v1, v3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationY(F)V

    .line 528
    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/᩸ܰ᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0}, Ll/᩸ܰ᩷;->֫(Z)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 486
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0205

    const/4 v3, 0x0

    if-ne p1, v0, :cond_0

    .line 488
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const p1, 0x7f1205ca

    .line 489
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    .line 490
    invoke-virtual {p1}, Ll/ܰܳۡ;->ۡ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f12087a

    invoke-virtual {p0, p1, v1}, Ll/ۡ᩻֫;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p1, Ll/ۢ۫᩷;

    const/4 v1, 0x3

    invoke-direct {p1, v1, p0}, Ll/ۢ۫᩷;-><init>(ILjava/lang/Object;)V

    const v1, 0x7f12070a

    .line 491
    invoke-virtual {v0, v1, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 492
    invoke-virtual {v0, p1, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 493
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_0
    const v0, 0x7f0a0208

    if-ne p1, v0, :cond_1

    .line 495
    iget-object v1, p0, Ll/᩸ܰ᩷;->ۗ:Ll/ۛ᩵᩷;

    const-string p1, "zip"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v6, 0x10

    const v2, 0x7f1205d5

    const-string v4, "arsc.zip"

    .line 0
    invoke-static/range {v1 .. v6}, Ll/ۛ᩵᩷;->֫(Ll/ۛ᩵᩷;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V

    return-void

    :cond_1
    const v0, 0x7f0a020c

    if-ne p1, v0, :cond_2

    .line 497
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1}, Ll/ܰܳۡ;->֫()V

    return-void

    :cond_2
    const v0, 0x7f0a0213

    if-ne p1, v0, :cond_3

    .line 499
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    .line 671
    new-instance v0, Ll/᩸ܳۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Ll/ܰܳۡ;->֫(Ll/᩺ܳۡ;)V

    :cond_3
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 106
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    const-string v0, "batchExportMode"

    const/4 v1, 0x0

    .line 109
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/᩸ܰ᩷;->ۙ:Z

    const-string v0, "selection"

    .line 110
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 114
    :goto_0
    new-instance v0, Ll/ܺܰ᩷;

    const-string v1, "<>"

    .line 90
    invoke-static {v1}, Ll/ܰܳۡ;->ᩳ(Ljava/lang/String;)[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 114
    invoke-direct {v0, p0, v1}, Ll/ܺܰ᩷;-><init>(Ll/᩸ܰ᩷;[Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    .line 148
    iget-boolean v1, p0, Ll/᩸ܰ᩷;->ۙ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ll/ܰܳۡ;->ۧ(Z)V

    .line 149
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0, p0}, Ll/ܰܳۡ;->֫(Ll/ܶܳۡ;)V

    .line 150
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0, p0}, Ll/ܰܳۡ;->֫(Ll/۠ܳۡ;)V

    .line 151
    new-instance v0, Ll/ۙܺ֫;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v1, Ll/ۘۛ᩷;

    invoke-virtual {v0, v1}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object v0

    check-cast v0, Ll/ۘۛ᩷;

    iput-object v0, p0, Ll/᩸ܰ᩷;->ۧ֫:Ll/ۘۛ᩷;

    .line 152
    invoke-virtual {v0}, Ll/ۘۛ᩷;->ܳ()Ll/ۚۡ֫;

    move-result-object v0

    new-instance v1, Ll/ۢܰ᩷;

    invoke-direct {v1, p0, p1}, Ll/ۢܰ᩷;-><init>(Ll/᩸ܰ᩷;[B)V

    invoke-virtual {v0, p0, v1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 196
    new-instance p1, Ll/ܿۡܳ;

    const/4 v0, 0x3

    invoke-direct {p1, v0, p0}, Ll/ܿۡܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, p1}, Ll/᩵֡᩷;->֫(Ll/ۡ᩻֫;Ll/ۨ᩵᩷;)Ll/۬᩵᩷;

    move-result-object p1

    const-string v0, "project_import_init_path"

    .line 1696
    invoke-virtual {p1, v0}, Ll/ܶ᩵᩷;->֫(Ljava/lang/String;)V

    .line 197
    iput-object p1, p0, Ll/᩸ܰ᩷;->ۨ:Ll/۬᩵᩷;

    .line 198
    new-instance p1, Ll/ۛۢۢ;

    const/4 v1, 0x2

    invoke-direct {p1, v1, p0}, Ll/ۛۢۢ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, p1}, Ll/᩵֡᩷;->֫(Ll/ۡ᩻֫;Ll/᩺᩵᩷;)Ll/ۛ᩵᩷;

    move-result-object p1

    .line 1620
    invoke-virtual {p1, v0}, Ll/ܶ᩵᩷;->֫(Ljava/lang/String;)V

    .line 199
    iput-object p1, p0, Ll/᩸ܰ᩷;->᩺:Ll/ۛ᩵᩷;

    .line 200
    new-instance p1, Ll/ܳۡܳ;

    invoke-direct {p1, p0}, Ll/ܳۡܳ;-><init>(Ljava/lang/Object;)V

    invoke-static {p0, p1}, Ll/᩵֡᩷;->֫(Ll/ۡ᩻֫;Ll/᩺᩵᩷;)Ll/ۛ᩵᩷;

    move-result-object p1

    const-string v0, "project_export_init_path"

    .line 1620
    invoke-virtual {p1, v0}, Ll/ܶ᩵᩷;->֫(Ljava/lang/String;)V

    .line 201
    iput-object p1, p0, Ll/᩸ܰ᩷;->ۗ:Ll/ۛ᩵᩷;

    return-void
.end method

.method public final onDestroyView()V
    .locals 2

    .line 270
    invoke-super {p0}, Ll/ۡ᩻֫;->onDestroyView()V

    .line 271
    iget-object v0, p0, Ll/᩸ܰ᩷;->֫֫:Ll/۬۬ۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 272
    iput-object v1, p0, Ll/᩸ܰ᩷;->֫֫:Ll/۬۬ۧ;

    .line 273
    iput-object v1, p0, Ll/᩸ܰ᩷;->۬:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 274
    iput-object v1, p0, Ll/᩸ܰ᩷;->۫:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 275
    iput-object v1, p0, Ll/᩸ܰ᩷;->ۛ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 276
    iput-object v1, p0, Ll/᩸ܰ᩷;->ۤ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    return-void
.end method

.method public final onPause()V
    .locals 3

    .line 290
    invoke-super {p0}, Ll/ۡ᩻֫;->onPause()V

    .line 332
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    if-nez v0, :cond_0

    goto :goto_1

    .line 335
    :cond_0
    invoke-virtual {v0}, Ll/ܶ۬᩷;->ܽ()Ll/ۧ۫᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ۫᩷;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const v0, 0x12345679

    .line 0
    invoke-static {v0}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v0

    .line 341
    iget-object v1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v1}, Ll/ܰܳۡ;->ܳ()Ljava/util/HashSet;

    move-result-object v1

    .line 342
    iget-object v2, p0, Ll/᩸ܰ᩷;->֫֫:Ll/۬۬ۧ;

    invoke-virtual {v2}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v2

    check-cast v2, Ll/ۜۗۧ;

    .line 344
    invoke-virtual {v2}, Ll/ۜۗۧ;->findFirstVisibleItemPosition()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 345
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 346
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 347
    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 349
    :cond_2
    iget-object v1, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    invoke-virtual {v1}, Ll/᩵ۨ᩷;->᩷()Ll/ۧ۫᩷;

    move-result-object v1

    const-string v2, "explorer"

    invoke-virtual {v1, v2}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 351
    :try_start_0
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 354
    iget-object v1, p0, Ll/᩸ܰ᩷;->ۧ֫:Ll/ۘۛ᩷;

    if-eqz v1, :cond_3

    .line 355
    invoke-virtual {v1, v0}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 5

    .line 251
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "batchExportMode"

    .line 252
    iget-boolean v1, p0, Ll/᩸ܰ᩷;->ۙ:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 253
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0}, Ll/ܰܳۡ;->ᩳ()[B

    move-result-object v0

    if-eqz v0, :cond_1

    .line 255
    array-length v1, v0

    const/16 v2, 0x5000

    const-string v3, "selection"

    if-le v1, v2, :cond_0

    .line 257
    :try_start_0
    iget-object v1, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    invoke-virtual {v1}, Ll/᩵ۨ᩷;->ۢ()Ll/ۧ۫᩷;

    move-result-object v1

    invoke-virtual {v1, v3}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    array-length v2, v0

    const/4 v4, 0x0

    invoke-virtual {v1, v0, v4, v2}, Ll/ܶ᩵ܿ;->֫([BII)V

    new-array v0, v4, [B

    .line 258
    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 263
    :cond_0
    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    :catch_0
    :cond_1
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    const p2, 0x7f0a0486

    .line 206
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/۬۬ۧ;

    iput-object p2, p0, Ll/᩸ܰ᩷;->֫֫:Ll/۬۬ۧ;

    const-string v0, "RecyclerView0"

    .line 207
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const p2, 0x7f0a0205

    .line 208
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iput-object p2, p0, Ll/᩸ܰ᩷;->۬:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const p2, 0x7f0a0208

    .line 209
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iput-object p2, p0, Ll/᩸ܰ᩷;->۫:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const p2, 0x7f0a0213

    .line 210
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iput-object p2, p0, Ll/᩸ܰ᩷;->ۛ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const p2, 0x7f0a020c

    .line 211
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iput-object p1, p0, Ll/᩸ܰ᩷;->ۤ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 212
    iget-object p1, p0, Ll/᩸ܰ᩷;->֫֫:Ll/۬۬ۧ;

    iget-object p2, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1, p2}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 213
    iget p1, p0, Ll/᩸ܰ᩷;->۟:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    .line 214
    iget-object v0, p0, Ll/᩸ܰ᩷;->֫֫:Ll/۬۬ۧ;

    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->scrollToPosition(I)V

    .line 215
    iput p2, p0, Ll/᩸ܰ᩷;->۟:I

    .line 217
    :cond_0
    iget-boolean p1, p0, Ll/᩸ܰ᩷;->᩹:Z

    if-eqz p1, :cond_2

    .line 218
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getActivity()Ll/֡᩻֫;

    move-result-object p1

    .line 219
    instance-of p2, p1, Ll/ܿۛ᩷;

    if-eqz p2, :cond_1

    .line 220
    check-cast p1, Ll/ܿۛ᩷;

    invoke-virtual {p1}, Ll/ܿۛ᩷;->ܳ֫()V

    .line 222
    :cond_1
    iget-object p1, p0, Ll/᩸ܰ᩷;->ۧ֫:Ll/ۘۛ᩷;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getViewLifecycleOwner()Ll/᩻ۡ֫;

    move-result-object p2

    new-instance v0, Ll/ᩳܰ᩷;

    invoke-direct {v0, p0}, Ll/ᩳܰ᩷;-><init>(Ll/᩸ܰ᩷;)V

    invoke-virtual {p1, p2, v0}, Ll/ۘۛ᩷;->ۧ(Ll/᩻ۡ֫;Ll/᩶ۤۡ;)V

    .line 223
    iget-object p1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {p1}, Ll/ܰܳۡ;->ۖ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 224
    invoke-direct {p0}, Ll/᩸ܰ᩷;->ᩳ()V

    .line 227
    :cond_2
    iget-object p1, p0, Ll/᩸ܰ᩷;->ۧ֫:Ll/ۘۛ᩷;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getViewLifecycleOwner()Ll/᩻ۡ֫;

    move-result-object p2

    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/᩷ۛ᩻;

    const/4 v2, 0x6

    invoke-direct {v1, v2, v0}, Ll/᩷ۛ᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2, v1}, Ll/ۘۛ᩷;->֫(Ll/᩻ۡ֫;Ll/᩷ۛ᩻;)V

    .line 228
    iget-object p1, p0, Ll/᩸ܰ᩷;->ۧ֫:Ll/ۘۛ᩷;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getViewLifecycleOwner()Ll/᩻ۡ֫;

    move-result-object p2

    new-instance v0, Ll/ۛۤᩳ;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0}, Ll/ۛۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2, v0}, Ll/ۘۛ᩷;->֫(Ll/᩻ۡ֫;Ll/ۛۤᩳ;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 281
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0}, Ll/ܰܳۡ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0}, Ll/ܰܳۡ;->֫()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ll/ܽ᩻ۡ;)Z
    .locals 10

    .line 368
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ܳ()Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x0

    .line 68
    invoke-direct {v0, v1, v2, v3}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 369
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->᩻()Z

    move-result v1

    if-nez v1, :cond_0

    .line 370
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v2, 0x7f1205ff

    invoke-interface {v1, v3, v2, v3, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 378
    :cond_0
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->᩻()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    .line 379
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->֫()I

    move-result v1

    if-ne v1, v2, :cond_1

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    const-string v4, "/package-info"

    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 381
    :cond_1
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->֫()I

    move-result v1

    const/4 v4, 0x2

    if-ne v1, v4, :cond_3

    .line 382
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    const-string v4, "/type-info"

    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    const/4 v1, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    const/4 v4, 0x1

    :goto_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_2
    const/4 v8, 0x0

    goto :goto_5

    .line 391
    :cond_4
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->֫()I

    move-result v1

    if-ne v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    .line 394
    :goto_3
    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ܿ()I

    move-result v4

    if-nez v4, :cond_6

    iget-object v4, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v4}, Ll/ܰܳۡ;->᩷()Ll/ۧ᩻ۡ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۧ᩻ۡ;->ۧ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-gt v4, v2, :cond_6

    const/4 v4, 0x0

    goto :goto_4

    :cond_6
    const/4 v4, 0x1

    :goto_4
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    :goto_5
    if-eqz v5, :cond_7

    .line 401
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v5

    const v9, 0x7f1205ad

    invoke-interface {v5, v3, v9, v3, v9}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_7
    if-eqz v1, :cond_8

    .line 404
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v5, 0x7f1205e1

    invoke-interface {v1, v3, v5, v3, v5}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_8
    if-eqz v6, :cond_9

    .line 407
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v5, 0x7f1205f9

    invoke-interface {v1, v3, v5, v3, v5}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 408
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v5, 0x7f1205c2

    invoke-interface {v1, v3, v5, v3, v5}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_9
    if-eqz v4, :cond_a

    .line 411
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v4, 0x7f1205ca

    invoke-interface {v1, v3, v4, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_a
    if-eqz v7, :cond_b

    .line 414
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v4, 0x7f120120

    invoke-interface {v1, v3, v4, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_b
    if-eqz v8, :cond_c

    .line 417
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v4, 0x7f12011a

    invoke-interface {v1, v3, v4, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 419
    :cond_c
    new-instance v1, Ll/ۘᩴܳ;

    invoke-direct {v1, p0, p1}, Ll/ۘᩴܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 472
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result p1

    if-lez p1, :cond_d

    .line 473
    iget-object p1, p0, Ll/᩸ܰ᩷;->֫֫:Ll/۬۬ۧ;

    invoke-virtual {p1, v2}, Ll/۬۬ۧ;->suppressLayout(Z)V

    .line 474
    new-instance p1, Ll/ܿܰ᩷;

    invoke-direct {p1, p0}, Ll/ܿܰ᩷;-><init>(Ll/᩸ܰ᩷;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/۠ۖ;)V

    .line 479
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    :cond_d
    return v2
.end method

.method public final ۧ()V
    .locals 3

    .line 295
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    if-eqz v0, :cond_0

    .line 296
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0}, Ll/ܰܳۡ;->ܳ()Ljava/util/HashSet;

    move-result-object v0

    .line 297
    iget-object v1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    iget-object v2, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    invoke-virtual {v2}, Ll/᩵ۨ᩷;->ۘ()Ll/ܿۛۡ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܰܳۡ;->֫(Ll/ܿۛۡ;)V

    .line 298
    iget-object v1, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v1, v0}, Ll/ܰܳۡ;->֫(Ljava/util/HashSet;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 303
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩸:Ll/ܰܳۡ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܰܳۡ;->֫(Ljava/util/Collection;)V

    return-void
.end method

.method public final ۧ(Ll/ܽ᩻ۡ;)V
    .locals 3

    .line 362
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ܿۛ᩷;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 1347
    invoke-virtual {v0, v1, v2}, Ll/ܿۛ᩷;->ۧ(Ljava/lang/String;Ll/᩵ۛ᩷;)V

    .line 363
    iget-object v0, p0, Ll/᩸ܰ᩷;->᩶:Ll/᩵ۨ᩷;

    invoke-virtual {p1}, Ll/ܽ᩻ۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩵ۨ᩷;->֫(Ljava/lang/String;)V

    return-void
.end method
