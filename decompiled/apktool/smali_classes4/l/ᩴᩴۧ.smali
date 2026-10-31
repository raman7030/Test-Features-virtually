.class public final Ll/ᩴᩴۧ;
.super Ljava/lang/Object;
.source "J8QH"


# instance fields
.field public ֫:I

.field public ۜ:I

.field public ۧ:I

.field public final ܳ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/lang/StringBuilder;

.field public ܿ:I

.field public final ᩳ:Ljava/util/ArrayList;

.field public ᩻:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 905
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 906
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩴᩴۧ;->ᩳ:Ljava/util/ArrayList;

    .line 907
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩴᩴۧ;->ܳ:Ljava/util/ArrayList;

    .line 908
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ᩴᩴۧ;->ܽ:Ljava/lang/StringBuilder;

    .line 909
    invoke-virtual {p0, p1}, Ll/ᩴᩴۧ;->ۧ(I)V

    .line 910
    iput p2, p0, Ll/ᩴᩴۧ;->ۧ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴᩴۧ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ᩴᩴۧ;->᩻:I

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ᩴᩴۧ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴᩴۧ;->ܿ:I

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ᩴᩴۧ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴᩴۧ;->᩻:I

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ᩴᩴۧ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴᩴۧ;->ۜ:I

    return-void
.end method

.method private ᩳ()Landroid/text/SpannableString;
    .locals 15

    .line 1057
    new-instance v0, Landroid/text/SpannableStringBuilder;

    iget-object v1, p0, Ll/ᩴᩴۧ;->ܽ:Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1058
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, 0x0

    .line 1068
    :cond_0
    :goto_0
    iget-object v10, p0, Ll/ᩴᩴۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v3, v11, :cond_b

    .line 1069
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۘᩴۧ;

    .line 1070
    iget-boolean v12, v11, Ll/ۘᩴۧ;->ܽ:Z

    .line 1071
    iget v13, v11, Ll/ۘᩴۧ;->ۧ:I

    const/16 v14, 0x8

    if-eq v13, v14, :cond_3

    const/4 v9, 0x7

    if-ne v13, v9, :cond_1

    const/4 v14, 0x1

    goto :goto_1

    :cond_1
    const/4 v14, 0x0

    :goto_1
    if-ne v13, v9, :cond_2

    goto :goto_2

    .line 1076
    :cond_2
    invoke-static {}, Ll/᩵ᩴۧ;->ۜ()[I

    move-result-object v8

    aget v8, v8, v13

    :goto_2
    move v9, v14

    .line 1079
    :cond_3
    iget v11, v11, Ll/ۘᩴۧ;->֫:I

    add-int/lit8 v3, v3, 0x1

    .line 1080
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v3, v13, :cond_4

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۘᩴۧ;

    iget v10, v10, Ll/ۘᩴۧ;->֫:I

    goto :goto_3

    :cond_4
    move v10, v1

    :goto_3
    if-ne v11, v10, :cond_5

    goto :goto_0

    :cond_5
    if-eq v4, v2, :cond_6

    if-nez v12, :cond_6

    .line 1123
    new-instance v10, Landroid/text/style/UnderlineSpan;

    invoke-direct {v10}, Landroid/text/style/UnderlineSpan;-><init>()V

    const/16 v12, 0x21

    invoke-virtual {v0, v10, v4, v11, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    const/4 v4, -0x1

    goto :goto_4

    :cond_6
    if-ne v4, v2, :cond_7

    if-eqz v12, :cond_7

    move v4, v11

    :cond_7
    :goto_4
    if-eq v5, v2, :cond_8

    if-nez v9, :cond_8

    .line 1127
    new-instance v10, Landroid/text/style/StyleSpan;

    const/4 v12, 0x2

    invoke-direct {v10, v12}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/16 v12, 0x21

    invoke-virtual {v0, v10, v5, v11, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    const/4 v5, -0x1

    goto :goto_5

    :cond_8
    if-ne v5, v2, :cond_9

    if-eqz v9, :cond_9

    move v5, v11

    :cond_9
    :goto_5
    if-eq v8, v7, :cond_0

    if-ne v7, v2, :cond_a

    goto :goto_6

    .line 1136
    :cond_a
    new-instance v10, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v10, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v7, 0x21

    invoke-virtual {v0, v10, v6, v11, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :goto_6
    move v7, v8

    move v6, v11

    goto :goto_0

    :cond_b
    const/16 v3, 0x21

    if-eq v4, v2, :cond_c

    if-eq v4, v1, :cond_c

    .line 1123
    new-instance v8, Landroid/text/style/UnderlineSpan;

    invoke-direct {v8}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {v0, v8, v4, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_c
    if-eq v5, v2, :cond_d

    if-eq v5, v1, :cond_d

    .line 1127
    new-instance v4, Landroid/text/style/StyleSpan;

    const/4 v8, 0x2

    invoke-direct {v4, v8}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v0, v4, v5, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_d
    if-eq v6, v1, :cond_f

    if-ne v7, v2, :cond_e

    goto :goto_7

    .line 1136
    :cond_e
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v2, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0, v2, v6, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1119
    :cond_f
    :goto_7
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    return-object v1
.end method


# virtual methods
.method public final ֫(I)Ll/᩶֡֫;
    .locals 8

    .line 977
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 979
    :goto_0
    iget-object v2, p0, Ll/ᩴᩴۧ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 980
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    const/16 v2, 0xa

    .line 981
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 984
    :cond_0
    invoke-direct {p0}, Ll/ᩴᩴۧ;->ᩳ()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 986
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 993
    :cond_1
    iget v1, p0, Ll/ᩴᩴۧ;->ܿ:I

    iget v2, p0, Ll/ᩴᩴۧ;->ۜ:I

    add-int/2addr v1, v2

    rsub-int/lit8 v2, v1, 0x20

    .line 995
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int v3, v1, v2

    const/high16 v4, -0x80000000

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq p1, v4, :cond_2

    goto :goto_1

    .line 999
    :cond_2
    iget p1, p0, Ll/ᩴᩴۧ;->֫:I

    if-ne p1, v5, :cond_4

    .line 1000
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result p1

    const/4 v4, 0x3

    if-lt p1, v4, :cond_3

    if-gez v2, :cond_4

    :cond_3
    const/4 p1, 0x1

    goto :goto_1

    .line 1005
    :cond_4
    iget p1, p0, Ll/ᩴᩴۧ;->֫:I

    if-ne p1, v5, :cond_5

    if-lez v3, :cond_5

    const/4 p1, 0x2

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    if-eq p1, v6, :cond_7

    const v3, 0x3dcccccd    # 0.1f

    const v4, 0x3f4ccccd    # 0.8f

    const/high16 v7, 0x42000000    # 32.0f

    if-eq p1, v5, :cond_6

    goto :goto_2

    :cond_6
    rsub-int/lit8 v1, v2, 0x20

    :goto_2
    int-to-float v1, v1

    div-float/2addr v1, v7

    mul-float v1, v1, v4

    add-float/2addr v1, v3

    goto :goto_3

    :cond_7
    const/high16 v1, 0x3f000000    # 0.5f

    .line 1033
    :goto_3
    iget v2, p0, Ll/ᩴᩴۧ;->᩻:I

    const/4 v3, 0x7

    if-le v2, v3, :cond_8

    add-int/lit8 v2, v2, -0x11

    goto :goto_4

    .line 1044
    :cond_8
    iget v3, p0, Ll/ᩴᩴۧ;->֫:I

    if-ne v3, v6, :cond_9

    iget v3, p0, Ll/ᩴᩴۧ;->ۧ:I

    sub-int/2addr v3, v6

    sub-int/2addr v2, v3

    .line 1047
    :cond_9
    :goto_4
    new-instance v3, Ll/᩹֡֫;

    invoke-direct {v3}, Ll/᩹֡֫;-><init>()V

    .line 1048
    invoke-virtual {v3, v0}, Ll/᩹֡֫;->֫(Ljava/lang/CharSequence;)V

    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 1049
    invoke-virtual {v3, v0}, Ll/᩹֡֫;->ۧ(Landroid/text/Layout$Alignment;)V

    int-to-float v0, v2

    .line 1050
    invoke-virtual {v3, v0, v6}, Ll/᩹֡֫;->֫(FI)V

    .line 1051
    invoke-virtual {v3, v1}, Ll/᩹֡֫;->ۧ(F)V

    .line 1052
    invoke-virtual {v3, p1}, Ll/᩹֡֫;->ۧ(I)V

    .line 1053
    invoke-virtual {v3}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 5

    .line 942
    iget-object v0, p0, Ll/ᩴᩴۧ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_0

    add-int/lit8 v2, v1, -0x1

    .line 944
    invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 946
    iget-object v0, p0, Ll/ᩴᩴۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_0
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_0

    .line 947
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘᩴۧ;

    .line 948
    iget v4, v3, Ll/ۘᩴۧ;->֫:I

    if-ne v4, v1, :cond_0

    add-int/lit8 v4, v4, -0x1

    .line 949
    iput v4, v3, Ll/ۘᩴۧ;->֫:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(C)V
    .locals 3

    .line 960
    iget-object v0, p0, Ll/ᩴᩴۧ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/16 v2, 0x20

    if-ge v1, v2, :cond_0

    .line 961
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final ֫(IZ)V
    .locals 2

    .line 938
    new-instance v0, Ll/ۘᩴۧ;

    iget-object v1, p0, Ll/ᩴᩴۧ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-direct {v0, p1, v1, p2}, Ll/ۘᩴۧ;-><init>(IIZ)V

    iget-object p1, p0, Ll/ᩴᩴۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 914
    iput p1, p0, Ll/ᩴᩴۧ;->֫:I

    .line 915
    iget-object p1, p0, Ll/ᩴᩴۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 916
    iget-object p1, p0, Ll/ᩴᩴۧ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 917
    iget-object p1, p0, Ll/ᩴᩴۧ;->ܽ:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    const/16 p1, 0xf

    .line 918
    iput p1, p0, Ll/ᩴᩴۧ;->᩻:I

    .line 919
    iput v0, p0, Ll/ᩴᩴۧ;->ܿ:I

    .line 920
    iput v0, p0, Ll/ᩴᩴۧ;->ۜ:I

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 924
    iget-object v0, p0, Ll/ᩴᩴۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩴᩴۧ;->ܳ:Ljava/util/ArrayList;

    .line 925
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩴᩴۧ;->ܽ:Ljava/lang/StringBuilder;

    .line 926
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 4

    .line 966
    invoke-direct {p0}, Ll/ᩴᩴۧ;->ᩳ()Landroid/text/SpannableString;

    move-result-object v0

    iget-object v1, p0, Ll/ᩴᩴۧ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 967
    iget-object v0, p0, Ll/ᩴᩴۧ;->ܽ:Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 968
    iget-object v0, p0, Ll/ᩴᩴۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 969
    iget v0, p0, Ll/ᩴᩴۧ;->ۧ:I

    iget v3, p0, Ll/ᩴᩴۧ;->᩻:I

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 970
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v3, v0, :cond_0

    .line 971
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ(I)V
    .locals 0

    .line 930
    iput p1, p0, Ll/ᩴᩴۧ;->֫:I

    return-void
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 934
    iput p1, p0, Ll/ᩴᩴۧ;->ۧ:I

    return-void
.end method
