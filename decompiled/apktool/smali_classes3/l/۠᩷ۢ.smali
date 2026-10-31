.class public final Ll/۠᩷ۢ;
.super Ll/۬ۗܿ;
.source "O1K3"


# instance fields
.field public final synthetic ֫֫:Ll/᩹ܶ֡;

.field public final synthetic ۟:Ll/ۛ᩷ۢ;

.field public final synthetic ۧ֫:Ll/֨۫֡;

.field public final synthetic ܽ֫:Ll/֨ۢۚ;

.field public final synthetic ᩳ֫:Ll/᩻ۧۢ;


# direct methods
.method public constructor <init>(Ll/ۛ᩷ۢ;Ll/ܿۛ᩷;Ll/֨۫֡;Ll/֨ۢۚ;Ll/᩹ܶ֡;Ll/᩻ۧۢ;)V
    .locals 0

    .line 793
    iput-object p1, p0, Ll/۠᩷ۢ;->۟:Ll/ۛ᩷ۢ;

    iput-object p3, p0, Ll/۠᩷ۢ;->ۧ֫:Ll/֨۫֡;

    iput-object p4, p0, Ll/۠᩷ۢ;->ܽ֫:Ll/֨ۢۚ;

    iput-object p5, p0, Ll/۠᩷ۢ;->֫֫:Ll/᩹ܶ֡;

    iput-object p6, p0, Ll/۠᩷ۢ;->ᩳ֫:Ll/᩻ۧۢ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 15

    .line 798
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-lez v0, :cond_f

    .line 806
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    .line 807
    iget-object v1, p0, Ll/۠᩷ۢ;->ۧ֫:Ll/֨۫֡;

    invoke-virtual {v1}, Ll/֨۫֡;->᩻()I

    move-result v2

    add-int/2addr v0, v2

    .line 810
    sget-object v3, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    iget-object v4, p0, Ll/۠᩷ۢ;->ܽ֫:Ll/֨ۢۚ;

    invoke-virtual {v4}, Ll/֨ۢۚ;->ܽ()I

    move-result v5

    invoke-virtual {v3, v5}, Ll/ܺۗ֡;->֫(I)Z

    move-result v3

    const/4 v5, 0x1

    xor-int/2addr v3, v5

    .line 813
    invoke-virtual {v4}, Ll/֨ۢۚ;->ۘ()Ll/֫ۡۚ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻ۡۚ;

    add-int/lit8 v8, v3, 0x1

    .line 50
    invoke-virtual {v7}, Ll/᩻ۡۚ;->getType()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/ۧ᩷ܽ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_0
    move v3, v8

    goto :goto_0

    :cond_1
    sub-int/2addr v2, v3

    sub-int v3, v0, v3

    .line 821
    invoke-virtual {v1, v0}, Ll/֨۫֡;->ܽ(I)V

    .line 823
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 824
    sget-object v6, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {v4}, Ll/֨ۢۚ;->ܽ()I

    move-result v7

    invoke-virtual {v6, v7}, Ll/ܺۗ֡;->֫(I)Z

    move-result v6

    const/4 v7, 0x0

    const/16 v8, 0x10

    if-nez v6, :cond_4

    if-ge v2, v8, :cond_3

    if-lt v3, v8, :cond_2

    goto :goto_1

    .line 831
    :cond_2
    new-instance v6, Ll/ܰ۫֡;

    sget-object v9, Ll/֨ۗ֡;->᩸ܿ:Ll/֨ۗ֡;

    invoke-direct {v6, v9, v2, v3}, Ll/ܰ۫֡;-><init>(Ll/֨ۗ֡;II)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 829
    :cond_3
    :goto_1
    new-instance v6, Ll/ۚۤ֡;

    sget-object v9, Ll/֨ۗ֡;->᩹ܿ:Ll/֨ۗ֡;

    invoke-direct {v6, v9, v2, v3}, Ll/ۚۤ֡;-><init>(Ll/֨ۗ֡;II)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    .line 834
    :goto_3
    invoke-virtual {v4}, Ll/֨ۢۚ;->ۘ()Ll/֫ۡۚ;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩻ۡۚ;

    add-int v11, v2, v6

    add-int v12, v3, v6

    add-int/lit8 v13, v6, 0x1

    .line 838
    invoke-virtual {v10}, Ll/᩻ۡۚ;->getType()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ll/ۧ᩷ܽ;->֫(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_7

    add-int/lit8 v6, v6, 0x2

    if-ge v11, v8, :cond_6

    if-lt v12, v8, :cond_5

    goto :goto_5

    .line 843
    :cond_5
    new-instance v10, Ll/ܰ۫֡;

    sget-object v13, Ll/֨ۗ֡;->۫ܿ:Ll/֨ۗ֡;

    invoke-direct {v10, v13, v11, v12}, Ll/ܰ۫֡;-><init>(Ll/֨ۗ֡;II)V

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 841
    :cond_6
    :goto_5
    new-instance v10, Ll/ۚۤ֡;

    sget-object v13, Ll/֨ۗ֡;->ۤܿ:Ll/֨ۗ֡;

    invoke-direct {v10, v13, v11, v12}, Ll/ۚۤ֡;-><init>(Ll/֨ۗ֡;II)V

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 845
    :cond_7
    invoke-virtual {v10}, Ll/᩻ۡۚ;->getType()Ljava/lang/String;

    move-result-object v6

    .line 54
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-ne v6, v5, :cond_a

    if-ge v11, v8, :cond_9

    if-lt v12, v8, :cond_8

    goto :goto_6

    .line 849
    :cond_8
    new-instance v6, Ll/ܰ۫֡;

    sget-object v10, Ll/֨ۗ֡;->ۚܿ:Ll/֨ۗ֡;

    invoke-direct {v6, v10, v11, v12}, Ll/ܰ۫֡;-><init>(Ll/֨ۗ֡;II)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 847
    :cond_9
    :goto_6
    new-instance v6, Ll/ۚۤ֡;

    sget-object v10, Ll/֨ۗ֡;->֨ܿ:Ll/֨ۗ֡;

    invoke-direct {v6, v10, v11, v12}, Ll/ۚۤ֡;-><init>(Ll/֨ۗ֡;II)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_a
    if-ge v11, v8, :cond_c

    if-lt v12, v8, :cond_b

    goto :goto_7

    .line 855
    :cond_b
    new-instance v6, Ll/ܰ۫֡;

    sget-object v10, Ll/֨ۗ֡;->᩸ܿ:Ll/֨ۗ֡;

    invoke-direct {v6, v10, v11, v12}, Ll/ܰ۫֡;-><init>(Ll/֨ۗ֡;II)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 853
    :cond_c
    :goto_7
    new-instance v6, Ll/ۚۤ֡;

    sget-object v10, Ll/֨ۗ֡;->᩹ܿ:Ll/֨ۗ֡;

    invoke-direct {v6, v10, v11, v12}, Ll/ۚۤ֡;-><init>(Ll/֨ۗ֡;II)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_8
    move v6, v13

    goto :goto_4

    .line 859
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v2, :cond_e

    .line 860
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۟۬֡;

    invoke-virtual {v1, v3, v6}, Ll/֨۫֡;->֫(ILl/۟۬֡;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    .line 862
    :cond_e
    new-instance v0, Ll/ۨۖܽ;

    invoke-direct {v0}, Ll/ۨۖܽ;-><init>()V

    .line 863
    new-instance v2, Ll/ۗ᩵ۚ;

    new-instance v3, Ll/᩺ۖܽ;

    invoke-direct {v3, v0}, Ll/᩺ۖܽ;-><init>(Ll/ۨۖܽ;)V

    invoke-direct {v2, v3}, Ll/ۗ᩵ۚ;-><init>(Ljava/io/Writer;)V

    .line 864
    new-instance v3, Ll/֨ܶ֡;

    iget-object v6, p0, Ll/۠᩷ۢ;->֫֫:Ll/᩹ܶ֡;

    invoke-direct {v3, v6, v4, v1}, Ll/֨ܶ֡;-><init>(Ll/᩹ܶ֡;Ll/ᩴ֫ۚ;Ll/᩵֫ۚ;)V

    .line 866
    :try_start_1
    invoke-virtual {v3, v2}, Ll/֨ܶ֡;->֫(Ll/ۗ᩵ۚ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 870
    invoke-virtual {v3}, Ll/֨ܶ֡;->ۧ()V

    .line 871
    invoke-virtual {v0}, Ll/ۨۖܽ;->length()I

    move-result v1

    sub-int/2addr v1, v5

    invoke-virtual {v0, v1}, Ll/ۨۖܽ;->ۧ(I)V

    .line 872
    iget-object v1, p0, Ll/۠᩷ۢ;->۟:Ll/ۛ᩷ۢ;

    invoke-static {v1}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    iget-object v3, p0, Ll/۠᩷ۢ;->ᩳ֫:Ll/᩻ۧۢ;

    invoke-virtual {v3}, Ll/᩻ۧۢ;->᩻()I

    move-result v4

    invoke-virtual {v3}, Ll/᩻ۧۢ;->ܽ()I

    move-result v6

    invoke-interface {v2, v4, v6, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    const/16 v2, 0xa

    .line 873
    invoke-static {v0, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v4

    add-int/2addr v4, v5

    .line 874
    invoke-static {v0, v2, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v0

    .line 875
    invoke-static {v1}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object v2

    invoke-virtual {v3}, Ll/᩻ۧۢ;->᩻()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 876
    invoke-static {v1}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ᩴܽ()V

    .line 877
    invoke-static {v1}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object v0

    .line 1330
    invoke-virtual {v0, v7}, Ll/۫ۨᩳ;->֫(Z)V

    return-void

    :catch_0
    move-exception v0

    .line 868
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 800
    :cond_f
    :try_start_2
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    const v0, 0x7f120b48

    .line 803
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
