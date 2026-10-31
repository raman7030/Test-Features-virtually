.class public Ll/֨ܶۖ;
.super Ljava/lang/Object;
.source "44YS"


# static fields
.field public static final ᩴ:Ljava/util/HashSet;

.field public static final ᩵:Ljava/util/Comparator;


# instance fields
.field public final ֫:Ll/ۖۙۖ;

.field public final ۖ:Ll/ۨۗۖ;

.field public final ۘ:Ll/᩺ۗۖ;

.field public final ۜ:Ll/ۜۗۖ;

.field public final ۡ:Ll/᩹ۗۖ;

.field public final ۢ:Ll/ۙۙۖ;

.field public final ۧ:Ll/᩹ۙۖ;

.field public final ܳ:Ll/֫ۗۖ;

.field public final ܺ:Ll/ۤۗۖ;

.field public final ܽ:Ll/᩷۬ۖ;

.field public final ܿ:Ll/ۛۙۖ;

.field public final ᩳ:Ll/۫ۙۖ;

.field public final ᩷:Ll/ܺۗۖ;

.field public final ᩻:Ll/ܳۗۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 548
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "decode_S"

    const-string v2, "decode_B"

    const-string v3, "decode_J"

    const-string v4, "decode_I"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 549
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Ll/֨ܶۖ;->ᩴ:Ljava/util/HashSet;

    .line 982
    new-instance v0, Ll/᩵ܶۖ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֨ܶۖ;->᩵:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    new-instance v0, Ll/۫ۙۖ;

    invoke-direct {v0}, Ll/۫ۙۖ;-><init>()V

    iput-object v0, p0, Ll/֨ܶۖ;->ᩳ:Ll/۫ۙۖ;

    .line 153
    new-instance v0, Ll/֫ۗۖ;

    .line 49
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object v0, p0, Ll/֨ܶۖ;->ܳ:Ll/֫ۗۖ;

    .line 154
    new-instance v0, Ll/ۜۗۖ;

    invoke-direct {v0}, Ll/ۜۗۖ;-><init>()V

    iput-object v0, p0, Ll/֨ܶۖ;->ۜ:Ll/ۜۗۖ;

    .line 155
    new-instance v0, Ll/ܺۗۖ;

    invoke-direct {v0}, Ll/ܺۗۖ;-><init>()V

    iput-object v0, p0, Ll/֨ܶۖ;->᩷:Ll/ܺۗۖ;

    .line 156
    new-instance v0, Ll/ۙۙۖ;

    .line 73
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 156
    iput-object v0, p0, Ll/֨ܶۖ;->ۢ:Ll/ۙۙۖ;

    .line 157
    new-instance v0, Ll/᩹ۗۖ;

    .line 59
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 157
    iput-object v0, p0, Ll/֨ܶۖ;->ۡ:Ll/᩹ۗۖ;

    .line 159
    new-instance v0, Ll/᩹ۙۖ;

    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object v0, p0, Ll/֨ܶۖ;->ۧ:Ll/᩹ۙۖ;

    .line 160
    new-instance v0, Ll/᩷۬ۖ;

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 160
    iput-object v0, p0, Ll/֨ܶۖ;->ܽ:Ll/᩷۬ۖ;

    .line 161
    new-instance v0, Ll/ۖۙۖ;

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 161
    iput-object v0, p0, Ll/֨ܶۖ;->֫:Ll/ۖۙۖ;

    .line 162
    new-instance v0, Ll/ۤۗۖ;

    .line 65
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 162
    iput-object v0, p0, Ll/֨ܶۖ;->ܺ:Ll/ۤۗۖ;

    .line 163
    new-instance v0, Ll/᩺ۗۖ;

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 163
    iput-object v0, p0, Ll/֨ܶۖ;->ۘ:Ll/᩺ۗۖ;

    .line 164
    new-instance v0, Ll/ۨۗۖ;

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 164
    iput-object v0, p0, Ll/֨ܶۖ;->ۖ:Ll/ۨۗۖ;

    .line 165
    new-instance v0, Ll/ܳۗۖ;

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 165
    iput-object v0, p0, Ll/֨ܶۖ;->᩻:Ll/ܳۗۖ;

    .line 166
    new-instance v0, Ll/ۛۙۖ;

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 166
    iput-object v0, p0, Ll/֨ܶۖ;->ܿ:Ll/ۛۙۖ;

    return-void
.end method

.method public static ֫(I)I
    .locals 2

    and-int/lit8 v0, p0, -0x21

    and-int/lit8 v1, p0, 0x2

    if-eqz v1, :cond_0

    and-int/lit8 p0, p0, -0x26

    return p0

    :cond_0
    and-int/lit8 v1, p0, 0x4

    if-eqz v1, :cond_1

    and-int/lit8 p0, p0, -0x22

    return p0

    :cond_1
    return v0
.end method

.method public static ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 722
    instance-of v0, p0, Ll/᩺۠ۖ;

    if-eqz v0, :cond_0

    .line 723
    check-cast p0, Ll/᩺۠ۖ;

    iget-object p0, p0, Ll/᩺۠ۖ;->֫:Ljava/lang/String;

    invoke-static {p0}, Ll/ۨ᩶ۚ;->ۜ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p0

    return-object p0

    .line 724
    :cond_0
    instance-of v0, p0, Ll/֫ܶۖ;

    if-eqz v0, :cond_1

    .line 725
    check-cast p0, Ll/֫ܶۖ;

    invoke-static {p0}, Ll/֨ܶۖ;->֫(Ll/֫ܶۖ;)Ll/֡᩶ۚ;

    move-result-object p0

    return-object p0

    .line 726
    :cond_1
    instance-of v0, p0, Ll/ۧܶۖ;

    if-eqz v0, :cond_2

    .line 727
    check-cast p0, Ll/ۧܶۖ;

    invoke-virtual {p0}, Ll/ۧܶۖ;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۨ᩶ۚ;->ᩳ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static ֫(Ll/ۧ᩸ۖ;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 827
    iget-object p0, p0, Ll/ۧ᩸ۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫᩸ۖ;

    .line 828
    iget-object v1, v0, Ll/֫᩸ۖ;->֫:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 829
    iget-object p0, v0, Ll/֫᩸ۖ;->ۧ:Ljava/lang/Object;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 198
    invoke-static {p0}, Ll/ۨ᩶ۚ;->ۜ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۨ᩶ۚ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫()Ljava/util/HashSet;
    .locals 1

    .line 0
    sget-object v0, Ll/֨ܶۖ;->ᩴ:Ljava/util/HashSet;

    return-object v0
.end method

.method public static ֫(Ljava/util/HashMap;Ljava/lang/String;)Ll/֡ܶۖ;
    .locals 1

    .line 836
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܶۖ;

    if-nez v0, :cond_0

    .line 838
    new-instance v0, Ll/֡ܶۖ;

    invoke-direct {v0, p1}, Ll/֡ܶۖ;-><init>(Ljava/lang/String;)V

    .line 839
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/֫ܶۖ;)Ll/֡᩶ۚ;
    .locals 13

    .line 734
    invoke-virtual {p0}, Ll/֫ܶۖ;->ܽ()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    .line 760
    :pswitch_0
    new-instance v0, Ll/֡᩶ۚ;

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۟۠ۖ;->֫()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    const/16 v2, 0x9

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 757
    :pswitch_1
    new-instance v0, Ll/֡᩶ۚ;

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۟۠ۖ;->֫()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v8, 0x7

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 754
    :pswitch_2
    new-instance v0, Ll/֡᩶ۚ;

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۟۠ۖ;->֫()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v2, 0x8

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 748
    :pswitch_3
    new-instance v0, Ll/֡᩶ۚ;

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۟۠ۖ;->֫()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v8, 0x5

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 751
    :pswitch_4
    new-instance v0, Ll/֡᩶ۚ;

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Ll/֫ܶۖ;->ۧ()Ll/۟۠ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۟۠ۖ;->֫()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v2, 0x6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 736
    :pswitch_5
    new-instance v0, Ll/֡᩶ۚ;

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۠ۖ;->֫()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v8, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 739
    :pswitch_6
    new-instance v0, Ll/֡᩶ۚ;

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۠ۖ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v2, 0x3

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 742
    :pswitch_7
    new-instance v0, Ll/֡᩶ۚ;

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۠ۖ;->֫()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v8, 0x2

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 745
    :pswitch_8
    new-instance v0, Ll/֡᩶ۚ;

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۠ۖ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Ll/֫ܶۖ;->֫()Ll/ܰ۠ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v2, 0x4

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/֡᩶ۚ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/util/List;Ll/ܰ᩹ۚ;)V
    .locals 2

    .line 264
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫᩸ۖ;

    .line 265
    iget-object v1, v0, Ll/֫᩸ۖ;->֫:Ljava/lang/String;

    iget-object v0, v0, Ll/֫᩸ۖ;->ۧ:Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ll/֨ܶۖ;->֫(Ll/ܰ᩹ۚ;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܰ᩹ۚ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 270
    instance-of v0, p2, [Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 271
    invoke-virtual {p0, p1}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;)Ll/ܰ᩹ۚ;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 273
    check-cast p2, [Ljava/lang/Object;

    .line 274
    array-length p1, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget-object v1, p2, v0

    const/4 v2, 0x0

    .line 275
    invoke-static {p0, v2, v1}, Ll/֨ܶۖ;->֫(Ll/ܰ᩹ۚ;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 277
    :cond_0
    invoke-virtual {p0}, Ll/ܰ᩹ۚ;->֫()V

    return-void

    .line 279
    :cond_1
    instance-of v0, p2, Ll/ۧ᩸ۖ;

    if-eqz v0, :cond_4

    .line 280
    check-cast p2, Ll/ۧ᩸ۖ;

    .line 281
    iget-object v0, p2, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܰ᩹ۚ;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 283
    iget-object p1, p2, Ll/ۧ᩸ۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֫᩸ۖ;

    .line 284
    iget-object v0, p2, Ll/֫᩸ۖ;->֫:Ljava/lang/String;

    iget-object p2, p2, Ll/֫᩸ۖ;->ۧ:Ljava/lang/Object;

    invoke-static {p0, v0, p2}, Ll/֨ܶۖ;->֫(Ll/ܰ᩹ۚ;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 286
    :cond_2
    invoke-virtual {p0}, Ll/ܰ᩹ۚ;->֫()V

    :cond_3
    return-void

    .line 288
    :cond_4
    instance-of v0, p2, Ll/ܰ۠ۖ;

    if-eqz v0, :cond_5

    .line 289
    check-cast p2, Ll/ܰ۠ۖ;

    .line 290
    invoke-virtual {p2}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ll/ܰ۠ۖ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 291
    :cond_5
    instance-of v0, p2, Ll/᩺۠ۖ;

    if-eqz v0, :cond_6

    .line 292
    check-cast p2, Ll/᩺۠ۖ;

    iget-object p2, p2, Ll/᩺۠ۖ;->֫:Ljava/lang/String;

    invoke-static {p2}, Ll/ۨ᩶ۚ;->ۜ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 293
    :cond_6
    instance-of v0, p2, Ll/۟۠ۖ;

    if-eqz v0, :cond_7

    .line 294
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string p1, "WARN: ignored method annotation value"

    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void

    :cond_7
    if-nez p2, :cond_8

    .line 297
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string p1, "WARN: ignored null annotation value"

    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void

    .line 299
    :cond_8
    invoke-virtual {p0, p2, p1}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Z)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 694
    :cond_0
    :try_start_0
    new-instance v1, Ll/ۜۙۚ;

    invoke-direct {v1, p0}, Ll/ۜۙۚ;-><init>(Ljava/lang/String;)V

    .line 695
    new-instance p0, Ll/ۢۙۚ;

    invoke-direct {p0}, Ll/ۢۙۚ;-><init>()V

    if-eqz p1, :cond_1

    .line 698
    invoke-virtual {v1, p0}, Ll/ۜۙۚ;->ۧ(Ll/᩷ۙۚ;)V

    return v0

    .line 700
    :cond_1
    invoke-virtual {v1, p0}, Ll/ۜۙۚ;->֫(Ll/᩷ۙۚ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(I)I
    .locals 2

    and-int/lit8 v0, p0, 0x7

    add-int/lit8 v1, v0, -0x1

    and-int/2addr v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    xor-int/lit8 p0, p0, 0x7

    :goto_0
    and-int/lit16 v0, p0, 0x100

    if-eqz v0, :cond_1

    const/16 v0, 0x200

    goto :goto_1

    :cond_1
    const/16 v0, 0x20

    :goto_1
    not-int v0, v0

    and-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ۘ᩸ۖ;Ll/ܺܶۖ;Ll/᩵ۛۡ;)V
    .locals 16

    move-object/from16 v0, p1

    .line 590
    iget-object v1, v0, Ll/ۘ᩸ۖ;->ۧ:Ljava/util/ArrayList;

    if-eqz v1, :cond_d

    .line 353
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 354
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v10, 0x1

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽ᩸ۖ;

    .line 355
    iget-object v4, v3, Ll/ܽ᩸ۖ;->᩶:Ljava/lang/String;

    invoke-static {v9, v4}, Ll/֨ܶۖ;->֫(Ljava/util/HashMap;Ljava/lang/String;)Ll/֡ܶۖ;

    move-result-object v4

    .line 356
    iget v5, v4, Ll/֡ܶۖ;->֫:I

    and-int/lit16 v5, v5, -0x601

    iget v6, v3, Ll/ܽ᩸ۖ;->᩸:I

    or-int/2addr v5, v6

    iput v5, v4, Ll/֡ܶۖ;->֫:I

    .line 357
    iget-object v3, v3, Ll/ܽ᩸ۖ;->᩹:Ljava/util/ArrayList;

    if-eqz v3, :cond_0

    .line 358
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۧ᩸ۖ;

    .line 359
    iget-object v6, v5, Ll/ۧ᩸ۖ;->ܽ:Ll/ܽܶۖ;

    sget-object v7, Ll/ܽܶۖ;->ۗ:Ll/ܽܶۖ;

    if-ne v6, v7, :cond_1

    .line 360
    iget-object v6, v5, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    const/4 v8, 0x0

    const/4 v10, -0x1

    sparse-switch v7, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v7, "Ldalvik/annotation/EnclosingMethod;"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    const/4 v10, 0x3

    goto :goto_1

    :sswitch_1
    const-string v7, "Ldalvik/annotation/MemberClasses;"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const/4 v10, 0x2

    goto :goto_1

    :sswitch_2
    const-string v7, "Ldalvik/annotation/EnclosingClass;"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    const/4 v10, 0x1

    goto :goto_1

    :sswitch_3
    const-string v7, "Ldalvik/annotation/InnerClass;"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_1

    :cond_5
    const/4 v10, 0x0

    :goto_1
    const-string v6, "value"

    packed-switch v10, :pswitch_data_0

    goto :goto_0

    .line 376
    :pswitch_0
    invoke-static {v5, v6}, Ll/֨ܶۖ;->֫(Ll/ۧ᩸ۖ;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۟۠ۖ;

    .line 377
    invoke-virtual {v5}, Ll/۟۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v6

    invoke-static {v9, v6}, Ll/֨ܶۖ;->֫(Ljava/util/HashMap;Ljava/lang/String;)Ll/֡ܶۖ;

    move-result-object v6

    .line 378
    iput-object v6, v4, Ll/֡ܶۖ;->ۧ:Ll/֡ܶۖ;

    .line 379
    iput-object v5, v4, Ll/֡ܶۖ;->ܽ:Ll/۟۠ۖ;

    .line 380
    invoke-virtual {v6, v4}, Ll/֡ܶۖ;->֫(Ll/֡ܶۖ;)V

    goto :goto_0

    .line 394
    :pswitch_1
    invoke-static {v5, v6}, Ll/֨ܶۖ;->֫(Ll/ۧ᩸ۖ;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/lang/Object;

    .line 395
    array-length v6, v5

    :goto_2
    if-ge v8, v6, :cond_1

    aget-object v7, v5, v8

    .line 396
    check-cast v7, Ll/᩺۠ۖ;

    .line 397
    iget-object v7, v7, Ll/᩺۠ۖ;->֫:Ljava/lang/String;

    invoke-static {v9, v7}, Ll/֨ܶۖ;->֫(Ljava/util/HashMap;Ljava/lang/String;)Ll/֡ܶۖ;

    move-result-object v7

    .line 398
    invoke-virtual {v4, v7}, Ll/֡ܶۖ;->֫(Ll/֡ܶۖ;)V

    .line 399
    iput-object v4, v7, Ll/֡ܶۖ;->ۧ:Ll/֡ܶۖ;

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 362
    :pswitch_2
    invoke-static {v5, v6}, Ll/֨ܶۖ;->֫(Ll/ۧ᩸ۖ;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺۠ۖ;

    .line 363
    iget-object v5, v5, Ll/᩺۠ۖ;->֫:Ljava/lang/String;

    invoke-static {v9, v5}, Ll/֨ܶۖ;->֫(Ljava/util/HashMap;Ljava/lang/String;)Ll/֡ܶۖ;

    move-result-object v5

    .line 364
    iput-object v5, v4, Ll/֡ܶۖ;->ۧ:Ll/֡ܶۖ;

    .line 372
    invoke-virtual {v5, v4}, Ll/֡ܶۖ;->֫(Ll/֡ܶۖ;)V

    goto/16 :goto_0

    .line 384
    :pswitch_3
    iget-object v5, v5, Ll/ۧ᩸ۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫᩸ۖ;

    .line 385
    iget-object v7, v6, Ll/֫᩸ۖ;->֫:Ljava/lang/String;

    iget-object v8, v6, Ll/֫᩸ۖ;->ۧ:Ljava/lang/Object;

    const-string v10, "accessFlags"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 386
    iget v6, v4, Ll/֡ܶۖ;->֫:I

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v7

    and-int/lit16 v7, v7, -0x601

    or-int/2addr v6, v7

    iput v6, v4, Ll/֡ܶۖ;->֫:I

    goto :goto_3

    :cond_7
    const-string v7, "name"

    .line 387
    iget-object v6, v6, Ll/֫᩸ۖ;->֫:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 388
    check-cast v8, Ljava/lang/String;

    iput-object v8, v4, Ll/֡ܶۖ;->ᩳ:Ljava/lang/String;

    goto :goto_3

    .line 592
    :cond_8
    new-instance v11, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 593
    new-instance v12, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 594
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ll/ܽ᩸ۖ;

    .line 595
    sget-object v14, Ll/֫ۨۡ;->֫:Ljava/util/concurrent/ExecutorService;

    new-instance v15, Ll/ۖܶۖ;

    move-object v1, v15

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    move-object v4, v12

    move-object/from16 v5, p1

    move-object/from16 v7, p2

    move-object v8, v9

    invoke-direct/range {v1 .. v8}, Ll/ۖܶۖ;-><init>(Ll/֨ܶۖ;Ll/᩵ۛۡ;Ljava/util/concurrent/atomic/AtomicReference;Ll/ۘ᩸ۖ;Ll/ܽ᩸ۖ;Ll/ܺܶۖ;Ljava/util/HashMap;)V

    invoke-interface {v14, v15}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 608
    :cond_9
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    .line 609
    invoke-virtual/range {p3 .. p3}, Ll/᩵ۛۡ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 610
    invoke-interface {v0, v10}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_5

    .line 616
    :cond_a
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1f4

    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    nop

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_6

    .line 619
    :catch_2
    :try_start_1
    invoke-virtual/range {p3 .. p3}, Ll/᩵ۛۡ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 620
    invoke-interface {v0, v10}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    .line 626
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 627
    instance-of v2, v0, Ljava/lang/RuntimeException;

    if-nez v2, :cond_c

    .line 629
    instance-of v2, v0, Ljava/lang/Error;

    if-nez v2, :cond_b

    goto :goto_5

    .line 630
    :cond_b
    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 628
    :cond_c
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    :cond_d
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71f1656d -> :sswitch_3
        -0x49044957 -> :sswitch_2
        0x8ffe875 -> :sswitch_1
        0x2e8e3754 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/ۘ᩸ۖ;Ll/ܽ᩸ۖ;Ll/ܺܶۖ;Ljava/util/HashMap;)V
    .locals 19

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    .line 441
    iget v1, v1, Ll/ۘ᩸ۖ;->ܽ:I

    .line 444
    iget-object v2, v0, Ll/ܽ᩸ۖ;->᩶:Ljava/lang/String;

    iget v3, v0, Ll/ܽ᩸ۖ;->᩸:I

    iget-object v4, v0, Ll/ܽ᩸ۖ;->ۗ:[Ljava/lang/String;

    invoke-static {v2}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    invoke-interface/range {p3 .. p3}, Ll/ܺܶۖ;->create()Ll/᩻᩶ۚ;

    move-result-object v12

    .line 57
    iget-object v5, v0, Ll/ܽ᩸ۖ;->ۙ:Ljava/util/ArrayList;

    const/4 v6, 0x0

    if-nez v5, :cond_0

    goto/16 :goto_c

    .line 60
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 61
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 62
    iget-object v8, v0, Ll/ܽ᩸ۖ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/16 v13, 0x46

    if-eqz v9, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۖ᩸ۖ;

    .line 63
    iget v14, v9, Ll/ۖ᩸ۖ;->᩸:I

    iget-object v15, v9, Ll/ۖ᩸ۖ;->ۙ:Ll/ܰ۠ۖ;

    const/16 v10, 0x18

    and-int/lit8 v11, v14, 0x18

    if-ne v11, v10, :cond_1

    .line 64
    iget-object v10, v9, Ll/ۖ᩸ۖ;->᩶:Ljava/lang/Object;

    const-string v11, ":"

    if-nez v10, :cond_3

    .line 65
    invoke-virtual {v15}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v13, 0x4c

    if-eq v10, v13, :cond_1

    const/16 v13, 0x5b

    if-ne v10, v13, :cond_2

    goto :goto_0

    .line 70
    :cond_2
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15}, Ll/ܰ۠ۖ;->֫()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {v15}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v10

    iget-object v14, v9, Ll/ۖ᩸ۖ;->᩶:Ljava/lang/Object;

    if-eqz v14, :cond_9

    if-eqz v10, :cond_9

    .line 156
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v18

    if-lez v18, :cond_9

    .line 157
    invoke-virtual {v10, v6}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v10, v13, :cond_8

    const/16 v13, 0x53

    if-eq v10, v13, :cond_7

    const/16 v13, 0x5a

    if-eq v10, v13, :cond_6

    const/16 v13, 0x49

    if-eq v10, v13, :cond_5

    const/16 v13, 0x4a

    if-eq v10, v13, :cond_4

    packed-switch v10, :pswitch_data_0

    goto :goto_2

    .line 174
    :pswitch_0
    check-cast v14, Ljava/lang/Double;

    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    const-wide/16 v16, 0x0

    cmpl-double v10, v13, v16

    if-nez v10, :cond_9

    goto :goto_1

    .line 162
    :pswitch_1
    check-cast v14, Ljava/lang/Character;

    invoke-virtual {v14}, Ljava/lang/Character;->charValue()C

    move-result v10

    if-nez v10, :cond_9

    goto :goto_1

    .line 164
    :pswitch_2
    check-cast v14, Ljava/lang/Byte;

    invoke-virtual {v14}, Ljava/lang/Byte;->byteValue()B

    move-result v10

    if-nez v10, :cond_9

    goto :goto_1

    .line 172
    :cond_4
    check-cast v14, Ljava/lang/Long;

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    const-wide/16 v16, 0x0

    cmp-long v10, v13, v16

    if-nez v10, :cond_9

    goto :goto_1

    .line 168
    :cond_5
    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-nez v10, :cond_9

    goto :goto_1

    .line 160
    :cond_6
    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    xor-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 166
    :cond_7
    check-cast v14, Ljava/lang/Short;

    invoke-virtual {v14}, Ljava/lang/Short;->shortValue()S

    move-result v10

    if-nez v10, :cond_9

    goto :goto_1

    .line 170
    :cond_8
    check-cast v14, Ljava/lang/Float;

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v10

    const/4 v13, 0x0

    cmpl-float v10, v10, v13

    if-nez v10, :cond_9

    :goto_1
    const/4 v10, 0x1

    goto :goto_3

    :cond_9
    :goto_2
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_1

    .line 72
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15}, Ll/ܰ۠ۖ;->֫()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 76
    :cond_a
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v7}, Ljava/util/HashMap;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_b

    goto/16 :goto_c

    .line 80
    :cond_b
    iget-object v8, v0, Ll/ܽ᩸ۖ;->۬:Ljava/util/ArrayList;

    if-eqz v8, :cond_d

    .line 81
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩵᩸ۖ;

    .line 82
    iget-object v10, v9, Ll/᩵᩸ۖ;->ۙ:Ll/۟۠ۖ;

    invoke-virtual {v10}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v10

    const-string v11, "<clinit>"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    goto :goto_4

    :cond_d
    const/4 v9, 0x0

    :goto_4
    if-eqz v9, :cond_f

    .line 89
    iget-object v8, v9, Ll/᩵᩸ۖ;->᩶:Ll/ᩳ᩸ۖ;

    if-eqz v8, :cond_15

    .line 90
    new-instance v9, Ll/۬ܶۖ;

    invoke-direct {v9, v0, v5, v7}, Ll/۬ܶۖ;-><init>(Ll/ܽ᩸ۖ;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 66
    iget-object v7, v8, Ll/ᩳ᩸ۖ;->ᩳ:Ljava/util/ArrayList;

    if-eqz v7, :cond_e

    .line 67
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֡᩸ۖ;

    .line 21
    iget-object v10, v10, Ll/֡᩸ۖ;->ܽ:Ll/ۨ۠ۖ;

    goto :goto_5

    .line 81
    :cond_e
    iget-object v7, v8, Ll/ᩳ᩸ۖ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩶᩸ۖ;

    .line 82
    invoke-virtual {v8, v9}, Ll/᩶᩸ۖ;->֫(Ll/۫ۙ;)V

    goto :goto_6

    .line 123
    :cond_f
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۖ᩸ۖ;

    .line 124
    iget-object v8, v7, Ll/ۖ᩸ۖ;->ۙ:Ll/ܰ۠ۖ;

    invoke-virtual {v8}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-eq v8, v13, :cond_14

    const/16 v9, 0x53

    if-eq v8, v9, :cond_13

    const/16 v9, 0x5a

    if-eq v8, v9, :cond_12

    const/16 v9, 0x49

    if-eq v8, v9, :cond_11

    const/16 v9, 0x4a

    if-eq v8, v9, :cond_10

    packed-switch v8, :pswitch_data_1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    goto :goto_8

    :pswitch_3
    const-wide/16 v8, 0x0

    .line 146
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    goto :goto_8

    :pswitch_4
    const-wide/16 v8, 0x0

    .line 138
    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    goto :goto_8

    :pswitch_5
    const-wide/16 v8, 0x0

    .line 132
    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v10

    :goto_8
    move-object v15, v10

    const-wide/16 v10, 0x0

    goto :goto_a

    :cond_10
    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    .line 144
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    goto :goto_9

    :cond_11
    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    .line 140
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    goto :goto_9

    :cond_12
    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    .line 134
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_9

    :cond_13
    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    .line 136
    invoke-static {v6}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v14

    :goto_9
    move-object v15, v14

    :goto_a
    const/4 v14, 0x0

    goto :goto_b

    :cond_14
    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v14, 0x0

    .line 142
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    .line 124
    :goto_b
    iput-object v15, v7, Ll/ۖ᩸ۖ;->᩶:Ljava/lang/Object;

    goto :goto_7

    .line 452
    :cond_15
    :goto_c
    iget-object v5, v0, Ll/ܽ᩸ۖ;->᩹:Ljava/util/ArrayList;

    const-string v13, "Ldalvik/annotation/Signature;"

    const-string v14, "value"

    if-eqz v5, :cond_18

    .line 453
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v7, 0x0

    :cond_16
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_19

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۧ᩸ۖ;

    .line 454
    iget-object v9, v8, Ll/ۧ᩸ۖ;->ܽ:Ll/ܽܶۖ;

    sget-object v10, Ll/ܽܶۖ;->ۗ:Ll/ܽܶۖ;

    if-ne v9, v10, :cond_16

    .line 455
    iget-object v9, v8, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_16

    .line 456
    invoke-static {v8, v14}, Ll/֨ܶۖ;->֫(Ll/ۧ᩸ۖ;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/Object;

    if-eqz v8, :cond_16

    .line 458
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    array-length v9, v8

    const/4 v10, 0x0

    :goto_e
    if-ge v10, v9, :cond_17

    aget-object v11, v8, v10

    .line 460
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_e

    .line 462
    :cond_17
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_d

    :cond_18
    const/4 v7, 0x0

    .line 470
    :cond_19
    array-length v5, v4

    new-array v11, v5, [Ljava/lang/String;

    const/4 v5, 0x0

    .line 471
    :goto_f
    array-length v8, v4

    if-ge v5, v8, :cond_1a

    .line 472
    aget-object v8, v4, v5

    invoke-static {v8}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v11, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :cond_1a
    move-object/from16 v5, p4

    .line 476
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܶۖ;

    if-eqz v4, :cond_1d

    .line 480
    iget-object v5, v4, Ll/֡ܶۖ;->ۧ:Ll/֡ܶۖ;

    if-nez v5, :cond_1c

    iget-object v5, v4, Ll/֡ܶۖ;->ܽ:Ll/۟۠ۖ;

    if-eqz v5, :cond_1b

    goto :goto_10

    :cond_1b
    const/4 v5, 0x0

    goto :goto_11

    :cond_1c
    :goto_10
    const/4 v5, 0x1

    :goto_11
    move v15, v5

    goto :goto_12

    :cond_1d
    const/4 v5, 0x0

    const/4 v15, 0x0

    :goto_12
    and-int/lit16 v5, v3, 0x200

    if-nez v5, :cond_1e

    or-int/lit8 v5, v3, 0x20

    goto :goto_13

    :cond_1e
    move v5, v3

    :goto_13
    and-int/lit8 v8, v5, -0xb

    if-eqz v15, :cond_1f

    and-int/lit8 v9, v5, 0x4

    if-eqz v9, :cond_1f

    and-int/lit8 v5, v5, -0xf

    or-int/lit8 v8, v5, 0x1

    :cond_1f
    const v5, -0x20001

    and-int/2addr v8, v5

    .line 484
    invoke-static {v7, v6}, Ll/֨ܶۖ;->֫(Ljava/lang/String;Z)Z

    move-result v5

    const-string v10, " by changing its signature to null."

    const-string v9, " with original signature "

    if-eqz v5, :cond_20

    .line 485
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v6, "Applying workaround to class "

    .line 0
    invoke-static {v6, v2, v9, v7, v10}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 485
    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object/from16 v16, v5

    goto :goto_14

    :cond_20
    move-object/from16 v16, v7

    :goto_14
    const v5, 0x303337

    if-lt v1, v5, :cond_21

    const/16 v1, 0x34

    const/16 v6, 0x34

    goto :goto_15

    :cond_21
    const/16 v1, 0x32

    const/16 v6, 0x32

    .line 198
    :goto_15
    invoke-static {v2}, Ll/ۨ᩶ۚ;->ۜ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨ᩶ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    .line 494
    iget-object v5, v0, Ll/ܽ᩸ۖ;->ۤ:Ljava/lang/String;

    if-nez v5, :cond_22

    const/4 v5, 0x0

    goto :goto_16

    .line 198
    :cond_22
    invoke-static {v5}, Ll/ۨ᩶ۚ;->ۜ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۨ᩶ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    :goto_16
    move-object/from16 v17, v5

    move-object v5, v12

    move v7, v8

    move-object v8, v1

    move-object v1, v9

    move-object/from16 v9, v16

    move/from16 v16, v3

    move-object v3, v10

    move-object/from16 v10, v17

    .line 493
    invoke-virtual/range {v5 .. v11}, Ll/᩻᩶ۚ;->֫(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 495
    iget-object v5, v0, Ll/ܽ᩸ۖ;->۫:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v12, v5, v6}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    new-instance v5, Ljava/util/ArrayList;

    const/4 v6, 0x5

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v4, :cond_26

    .line 957
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 958
    new-instance v7, Ljava/util/Stack;

    invoke-direct {v7}, Ljava/util/Stack;-><init>()V

    .line 959
    invoke-virtual {v7, v4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 960
    :cond_23
    :goto_17
    invoke-virtual {v7}, Ljava/util/Stack;->empty()Z

    move-result v8

    if-nez v8, :cond_26

    .line 961
    invoke-virtual {v7}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡ܶۖ;

    .line 962
    invoke-virtual {v6, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    goto :goto_17

    .line 965
    :cond_24
    invoke-virtual {v6, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 967
    iget-object v8, v8, Ll/֡ܶۖ;->ܿ:Ljava/util/HashSet;

    if-eqz v8, :cond_23

    .line 968
    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_18
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_23

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֡ܶۖ;

    .line 969
    iget-object v10, v9, Ll/֡ܶۖ;->ᩳ:Ljava/lang/String;

    iget-object v11, v9, Ll/֡ܶۖ;->ܳ:Ljava/lang/String;

    if-nez v10, :cond_25

    .line 970
    new-instance v10, Ll/᩵ۙۚ;

    invoke-static {v11}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 p1, v6

    iget v6, v9, Ll/֡ܶۖ;->֫:I

    .line 971
    invoke-static {v6}, Ll/֨ܶۖ;->֫(I)I

    move-result v6

    move-object/from16 p3, v8

    const/4 v8, 0x0

    invoke-direct {v10, v11, v6, v8, v8}, Ll/᩵ۙۚ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 970
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v17, v2

    goto :goto_19

    :cond_25
    move-object/from16 p1, v6

    move-object/from16 p3, v8

    .line 973
    new-instance v6, Ll/᩵ۙۚ;

    invoke-static {v11}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 198
    invoke-static {v2}, Ll/ۨ᩶ۚ;->ۜ(Ljava/lang/String;)Ll/ۨ᩶ۚ;

    move-result-object v10

    invoke-virtual {v10}, Ll/ۨ᩶ۚ;->ᩳ()Ljava/lang/String;

    move-result-object v10

    .line 973
    iget-object v11, v9, Ll/֡ܶۖ;->ᩳ:Ljava/lang/String;

    move-object/from16 v17, v2

    iget v2, v9, Ll/֡ܶۖ;->֫:I

    .line 974
    invoke-static {v2}, Ll/֨ܶۖ;->֫(I)I

    move-result v2

    invoke-direct {v6, v8, v2, v10, v11}, Ll/᩵ۙۚ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 973
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 976
    :goto_19
    invoke-virtual {v7, v9}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v6, p1

    move-object/from16 v8, p3

    move-object/from16 v2, v17

    goto :goto_18

    :cond_26
    move-object/from16 v17, v2

    if-eqz v15, :cond_2d

    .line 503
    iget-object v2, v4, Ll/֡ܶۖ;->ᩳ:Ljava/lang/String;

    if-nez v2, :cond_28

    .line 504
    iget-object v2, v4, Ll/֡ܶۖ;->ܽ:Ll/۟۠ۖ;

    if-eqz v2, :cond_27

    .line 506
    invoke-virtual {v2}, Ll/۟۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v7

    .line 507
    invoke-virtual {v2}, Ll/۟۠ۖ;->֫()Ljava/lang/String;

    move-result-object v2

    .line 506
    invoke-virtual {v12, v6, v7, v2}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1a

    .line 509
    :cond_27
    iget-object v2, v4, Ll/֡ܶۖ;->ۧ:Ll/֡ܶۖ;

    .line 510
    iget-object v2, v2, Ll/֡ܶۖ;->ܳ:Ljava/lang/String;

    invoke-static {v2}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    invoke-virtual {v12, v2, v6, v6}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 908
    :cond_28
    :goto_1a
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    move-object v6, v4

    :goto_1b
    if-eqz v6, :cond_2d

    .line 909
    iget-object v7, v6, Ll/֡ܶۖ;->ܳ:Ljava/lang/String;

    .line 910
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_29

    goto :goto_1d

    .line 913
    :cond_29
    iget-object v8, v6, Ll/֡ܶۖ;->ۧ:Ll/֡ܶۖ;

    if-nez v8, :cond_2a

    goto :goto_1d

    :cond_2a
    if-ne v8, v4, :cond_2b

    goto :goto_1d

    .line 921
    :cond_2b
    iget v9, v6, Ll/֡ܶۖ;->֫:I

    invoke-static {v9}, Ll/֨ܶۖ;->֫(I)I

    move-result v9

    .line 922
    iget-object v10, v6, Ll/֡ܶۖ;->ᩳ:Ljava/lang/String;

    if-eqz v10, :cond_2c

    .line 923
    new-instance v10, Ll/᩵ۙۚ;

    invoke-static {v7}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v8, Ll/֡ܶۖ;->ܳ:Ljava/lang/String;

    .line 924
    invoke-static {v8}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iget-object v11, v6, Ll/֡ܶۖ;->ᩳ:Ljava/lang/String;

    invoke-direct {v10, v7, v9, v8, v11}, Ll/᩵ۙۚ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 923
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    .line 926
    :cond_2c
    new-instance v8, Ll/᩵ۙۚ;

    invoke-static {v7}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x0

    invoke-direct {v8, v7, v9, v10, v10}, Ll/᩵ۙۚ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 909
    :goto_1c
    iget-object v6, v6, Ll/֡ܶۖ;->ۧ:Ll/֡ܶۖ;

    goto :goto_1b

    .line 515
    :cond_2d
    :goto_1d
    sget-object v2, Ll/֨ܶۖ;->᩵:Ljava/util/Comparator;

    invoke-static {v5, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 516
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_33

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵ۙۚ;

    .line 517
    iget-object v5, v4, Ll/᩵ۙۚ;->ۧ:Ljava/lang/String;

    if-eqz v5, :cond_32

    .line 423
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    if-ge v6, v7, :cond_2e

    goto :goto_20

    :cond_2e
    const/4 v6, 0x0

    .line 426
    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    move-result v6

    if-nez v6, :cond_2f

    goto :goto_20

    :cond_2f
    const/4 v6, 0x1

    .line 429
    :goto_1f
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_31

    .line 430
    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    move-result v7

    if-nez v7, :cond_30

    :goto_20
    const/4 v5, 0x0

    goto :goto_21

    :cond_30
    add-int/lit8 v6, v6, 0x1

    goto :goto_1f

    :cond_31
    const/4 v5, 0x1

    :goto_21
    if-nez v5, :cond_32

    .line 518
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v6, "WARN: ignored invalid inner class name , treat as anonymous inner class."

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v5, 0x0

    .line 519
    iput-object v5, v4, Ll/᩵ۙۚ;->ۧ:Ljava/lang/String;

    .line 520
    iput-object v5, v4, Ll/᩵ۙۚ;->ᩳ:Ljava/lang/String;

    .line 89
    :cond_32
    iget-object v5, v4, Ll/᩵ۙۚ;->ܽ:Ljava/lang/String;

    iget-object v6, v4, Ll/᩵ۙۚ;->ᩳ:Ljava/lang/String;

    iget-object v7, v4, Ll/᩵ۙۚ;->ۧ:Ljava/lang/String;

    iget v4, v4, Ll/᩵ۙۚ;->֫:I

    invoke-virtual {v12, v5, v4, v6, v7}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1e

    .line 525
    :cond_33
    iget-object v2, v0, Ll/ܽ᩸ۖ;->᩹:Ljava/util/ArrayList;

    if-eqz v2, :cond_36

    .line 211
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_34
    :goto_22
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_36

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧ᩸ۖ;

    .line 212
    iget-object v5, v4, Ll/ۧ᩸ۖ;->ܽ:Ll/ܽܶۖ;

    sget-object v6, Ll/ܽܶۖ;->ۗ:Ll/ܽܶۖ;

    if-eq v5, v6, :cond_34

    .line 202
    iget-object v6, v4, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    sget-object v7, Ll/ܽܶۖ;->᩶:Ll/ܽܶۖ;

    if-eq v5, v7, :cond_35

    const/4 v5, 0x1

    goto :goto_23

    :cond_35
    const/4 v5, 0x0

    :goto_23
    invoke-virtual {v12, v6, v5}, Ll/᩻᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v5

    if-eqz v5, :cond_34

    .line 204
    iget-object v4, v4, Ll/ۧ᩸ۖ;->֫:Ljava/util/ArrayList;

    invoke-static {v4, v5}, Ll/֨ܶۖ;->֫(Ljava/util/List;Ll/ܰ᩹ۚ;)V

    .line 205
    invoke-virtual {v5}, Ll/ܰ᩹ۚ;->֫()V

    goto :goto_22

    .line 527
    :cond_36
    iget-object v2, v0, Ll/ܽ᩸ۖ;->ۙ:Ljava/util/ArrayList;

    if-eqz v2, :cond_41

    .line 528
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_41

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖ᩸ۖ;

    .line 641
    iget-object v5, v4, Ll/ۖ᩸ۖ;->᩹:Ljava/util/ArrayList;

    iget-object v6, v4, Ll/ۖ᩸ۖ;->ۙ:Ll/ܰ۠ۖ;

    if-eqz v5, :cond_3a

    .line 642
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v7, 0x0

    :cond_37
    :goto_25
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۧ᩸ۖ;

    .line 643
    iget-object v9, v8, Ll/ۧ᩸ۖ;->ܽ:Ll/ܽܶۖ;

    sget-object v10, Ll/ܽܶۖ;->ۗ:Ll/ܽܶۖ;

    if-ne v9, v10, :cond_37

    .line 644
    iget-object v9, v8, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_38

    goto :goto_25

    .line 646
    :cond_38
    invoke-static {v8, v14}, Ll/֨ܶۖ;->֫(Ll/ۧ᩸ۖ;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/Object;

    if-eqz v8, :cond_37

    .line 648
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 649
    array-length v9, v8

    const/4 v10, 0x0

    :goto_26
    if-ge v10, v9, :cond_39

    aget-object v11, v8, v10

    .line 650
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_26

    .line 652
    :cond_39
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_25

    :cond_3a
    const/4 v7, 0x0

    .line 660
    :cond_3b
    iget-object v5, v4, Ll/ۖ᩸ۖ;->᩶:Ljava/lang/Object;

    invoke-static {v5}, Ll/֨ܶۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const/4 v5, 0x1

    .line 664
    invoke-static {v7, v5}, Ll/֨ܶۖ;->֫(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_3c

    .line 665
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Applying workaround to field "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v9, v5

    goto :goto_27

    :cond_3c
    move-object v9, v7

    .line 674
    :goto_27
    iget v5, v4, Ll/ۖ᩸ۖ;->᩸:I

    invoke-static {v5}, Ll/֨ܶۖ;->ۧ(I)I

    move-result v5

    const v7, -0x21001

    and-int/2addr v7, v5

    .line 676
    invoke-virtual {v6}, Ll/ܰ۠ۖ;->֫()Ljava/lang/String;

    move-result-object v8

    .line 677
    invoke-virtual {v6}, Ll/ܰ۠ۖ;->ܽ()Ljava/lang/String;

    move-result-object v11

    move-object v5, v12

    move v6, v7

    move-object v7, v8

    move-object v8, v11

    .line 676
    invoke-virtual/range {v5 .. v10}, Ll/᩻᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll/ۘ᩶ۚ;

    move-result-object v5

    if-nez v5, :cond_3d

    goto/16 :goto_24

    .line 682
    :cond_3d
    iget-object v4, v4, Ll/ۖ᩸ۖ;->᩹:Ljava/util/ArrayList;

    if-eqz v4, :cond_40

    .line 221
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3e
    :goto_28
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_40

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۧ᩸ۖ;

    .line 222
    iget-object v7, v6, Ll/ۧ᩸ۖ;->ܽ:Ll/ܽܶۖ;

    sget-object v8, Ll/ܽܶۖ;->ۗ:Ll/ܽܶۖ;

    if-eq v7, v8, :cond_3e

    .line 256
    iget-object v8, v6, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    sget-object v9, Ll/ܽܶۖ;->᩶:Ll/ܽܶۖ;

    if-eq v7, v9, :cond_3f

    const/4 v7, 0x1

    goto :goto_29

    :cond_3f
    const/4 v7, 0x0

    :goto_29
    invoke-virtual {v5, v8, v7}, Ll/ۘ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v7

    if-eqz v7, :cond_3e

    .line 258
    iget-object v6, v6, Ll/ۧ᩸ۖ;->֫:Ljava/util/ArrayList;

    invoke-static {v6, v7}, Ll/֨ܶۖ;->֫(Ljava/util/List;Ll/ܰ᩹ۚ;)V

    .line 259
    invoke-virtual {v7}, Ll/ܰ᩹ۚ;->֫()V

    goto :goto_28

    .line 683
    :cond_40
    invoke-virtual {v5}, Ll/ۘ᩶ۚ;->֫()V

    goto/16 :goto_24

    .line 532
    :cond_41
    iget-object v2, v0, Ll/ܽ᩸ۖ;->۬:Ljava/util/ArrayList;

    if-eqz v2, :cond_59

    .line 533
    new-instance v3, Ll/ۚܶۖ;

    .line 83
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, v17

    .line 534
    iput-object v4, v3, Ll/ۚܶۖ;->֫:Ljava/lang/String;

    .line 535
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_57

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Ll/᩵᩸ۖ;

    .line 307
    iget-object v5, v11, Ll/᩵᩸ۖ;->᩹:Ljava/util/ArrayList;

    iget v15, v11, Ll/᩵᩸ۖ;->᩸:I

    iget-object v10, v11, Ll/᩵᩸ۖ;->ۙ:Ll/۟۠ۖ;

    if-eqz v5, :cond_49

    .line 308
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_2b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_48

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۧ᩸ۖ;

    .line 309
    iget-object v9, v8, Ll/ۧ᩸ۖ;->ܽ:Ll/ܽܶۖ;

    move-object/from16 p1, v2

    sget-object v2, Ll/ܽܶۖ;->ۗ:Ll/ܽܶۖ;

    if-ne v9, v2, :cond_46

    .line 310
    iget-object v2, v8, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v9, "Ldalvik/annotation/Throws;"

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_44

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_42

    goto :goto_2e

    .line 323
    :cond_42
    invoke-static {v8, v14}, Ll/֨ܶۖ;->֫(Ll/ۧ᩸ۖ;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    if-eqz v2, :cond_46

    .line 325
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    array-length v8, v2

    const/4 v9, 0x0

    :goto_2c
    if-ge v9, v8, :cond_43

    move-object/from16 p3, v5

    aget-object v5, v2, v9

    .line 327
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v5, p3

    goto :goto_2c

    :cond_43
    move-object/from16 p3, v5

    .line 329
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    goto :goto_2f

    :cond_44
    move-object/from16 p3, v5

    .line 312
    invoke-static {v8, v14}, Ll/֨ܶۖ;->֫(Ll/ۧ᩸ۖ;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    if-eqz v2, :cond_47

    .line 314
    array-length v5, v2

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    .line 315
    :goto_2d
    array-length v8, v2

    if-ge v6, v8, :cond_45

    .line 316
    aget-object v8, v2, v6

    check-cast v8, Ll/᩺۠ۖ;

    .line 193
    iget-object v8, v8, Ll/᩺۠ۖ;->֫:Ljava/lang/String;

    invoke-static {v8}, Ll/֨ܶۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 317
    aput-object v8, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_2d

    :cond_45
    move-object v6, v5

    goto :goto_2f

    :cond_46
    :goto_2e
    move-object/from16 p3, v5

    :cond_47
    :goto_2f
    move-object/from16 v2, p1

    move-object/from16 v5, p3

    goto :goto_2b

    :cond_48
    move-object/from16 p1, v2

    move-object v2, v6

    goto :goto_30

    :cond_49
    move-object/from16 p1, v2

    const/4 v7, 0x0

    const/4 v2, 0x0

    :goto_30
    const/4 v5, 0x0

    .line 337
    invoke-static {v7, v5}, Ll/֨ܶۖ;->֫(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_4a

    .line 338
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Applying workaround to method "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " by changing its signature to null"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v9, v5

    goto :goto_31

    :cond_4a
    move-object v9, v7

    .line 345
    :goto_31
    invoke-static {v15}, Ll/֨ܶۖ;->ۧ(I)I

    move-result v5

    const v6, -0x30001

    and-int/2addr v6, v5

    .line 349
    invoke-virtual {v10}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10}, Ll/۟۠ۖ;->֫()Ljava/lang/String;

    move-result-object v8

    move-object v5, v12

    move-object/from16 v17, v10

    move-object v10, v2

    invoke-virtual/range {v5 .. v10}, Ll/᩻᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩶ۚ;

    move-result-object v2

    if-nez v2, :cond_4b

    move-object/from16 v6, p0

    move/from16 v5, v16

    goto/16 :goto_39

    :cond_4b
    move/from16 v5, v16

    and-int/lit16 v6, v5, 0x2000

    if-eqz v6, :cond_4e

    .line 775
    iget-object v6, v0, Ll/ܽ᩸ۖ;->᩹:Ljava/util/ArrayList;

    if-eqz v6, :cond_4d

    .line 776
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۧ᩸ۖ;

    .line 777
    iget-object v8, v7, Ll/ۧ᩸ۖ;->ܽ:Ll/ܽܶۖ;

    sget-object v9, Ll/ܽܶۖ;->ۗ:Ll/ܽܶۖ;

    if-ne v8, v9, :cond_4c

    iget-object v8, v7, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    const-string v9, "Ldalvik/annotation/AnnotationDefault;"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4c

    .line 778
    invoke-static {v7, v14}, Ll/֨ܶۖ;->֫(Ll/ۧ᩸ۖ;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۧ᩸ۖ;

    if-eqz v6, :cond_4d

    .line 780
    invoke-virtual/range {v17 .. v17}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ll/֨ܶۖ;->֫(Ll/ۧ᩸ۖ;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_32

    :cond_4d
    const/4 v6, 0x0

    :goto_32
    if-eqz v6, :cond_4e

    .line 787
    invoke-virtual {v2}, Ll/ܶ᩶ۚ;->֫()Ll/ܰ᩹ۚ;

    move-result-object v7

    if-eqz v7, :cond_4e

    const/4 v8, 0x0

    .line 789
    invoke-static {v7, v8, v6}, Ll/֨ܶۖ;->֫(Ll/ܰ᩹ۚ;Ljava/lang/String;Ljava/lang/Object;)V

    .line 790
    invoke-virtual {v7}, Ll/ܰ᩹ۚ;->֫()V

    .line 795
    :cond_4e
    iget-object v6, v11, Ll/᩵᩸ۖ;->᩹:Ljava/util/ArrayList;

    if-eqz v6, :cond_51

    .line 231
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4f
    :goto_33
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_51

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۧ᩸ۖ;

    .line 232
    iget-object v8, v7, Ll/ۧ᩸ۖ;->ܽ:Ll/ܽܶۖ;

    sget-object v9, Ll/ܽܶۖ;->ۗ:Ll/ܽܶۖ;

    if-eq v8, v9, :cond_4f

    .line 240
    iget-object v9, v7, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    sget-object v10, Ll/ܽܶۖ;->᩶:Ll/ܽܶۖ;

    if-eq v8, v10, :cond_50

    const/4 v8, 0x1

    goto :goto_34

    :cond_50
    const/4 v8, 0x0

    :goto_34
    invoke-virtual {v2, v9, v8}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v8

    if-eqz v8, :cond_4f

    .line 242
    iget-object v7, v7, Ll/ۧ᩸ۖ;->֫:Ljava/util/ArrayList;

    invoke-static {v7, v8}, Ll/֨ܶۖ;->֫(Ljava/util/List;Ll/ܰ᩹ۚ;)V

    .line 243
    invoke-virtual {v8}, Ll/ܰ᩹ۚ;->֫()V

    goto :goto_33

    .line 797
    :cond_51
    iget-object v6, v11, Ll/᩵᩸ۖ;->ۗ:[Ljava/util/List;

    if-eqz v6, :cond_55

    const/4 v6, 0x0

    .line 798
    :goto_35
    iget-object v7, v11, Ll/᩵᩸ۖ;->ۗ:[Ljava/util/List;

    array-length v8, v7

    if-ge v6, v8, :cond_55

    .line 799
    aget-object v7, v7, v6

    if-eqz v7, :cond_54

    .line 801
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_36
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_54

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۧ᩸ۖ;

    .line 802
    iget-object v9, v8, Ll/ۧ᩸ۖ;->ܽ:Ll/ܽܶۖ;

    sget-object v10, Ll/ܽܶۖ;->ۗ:Ll/ܽܶۖ;

    if-eq v9, v10, :cond_53

    .line 248
    iget-object v10, v8, Ll/ۧ᩸ۖ;->ۧ:Ljava/lang/String;

    sget-object v0, Ll/ܽܶۖ;->᩶:Ll/ܽܶۖ;

    if-eq v9, v0, :cond_52

    const/4 v0, 0x1

    goto :goto_37

    :cond_52
    const/4 v0, 0x0

    :goto_37
    invoke-virtual {v2, v6, v10, v0}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v0

    if-eqz v0, :cond_53

    .line 250
    iget-object v8, v8, Ll/ۧ᩸ۖ;->֫:Ljava/util/ArrayList;

    invoke-static {v8, v0}, Ll/֨ܶۖ;->֫(Ljava/util/List;Ll/ܰ᩹ۚ;)V

    .line 251
    invoke-virtual {v0}, Ll/ܰ᩹ۚ;->֫()V

    :cond_53
    move-object/from16 v0, p2

    goto :goto_36

    :cond_54
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p2

    goto :goto_35

    :cond_55
    and-int/lit16 v0, v15, 0x2500

    if-nez v0, :cond_56

    .line 811
    iget-object v0, v11, Ll/᩵᩸ۖ;->᩶:Ll/ᩳ᩸ۖ;

    if-eqz v0, :cond_56

    .line 812
    invoke-virtual {v2}, Ll/ܶ᩶ۚ;->ۧ()V

    move-object/from16 v6, p0

    .line 813
    invoke-virtual {v6, v11, v2, v3}, Ll/֨ܶۖ;->֫(Ll/᩵᩸ۖ;Ll/ܶ᩶ۚ;Ll/ۚܶۖ;)V

    goto :goto_38

    :cond_56
    move-object/from16 v6, p0

    .line 817
    :goto_38
    invoke-virtual {v2}, Ll/ܶ᩶ۚ;->ܽ()V

    :goto_39
    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v16, v5

    goto/16 :goto_2a

    :cond_57
    move-object/from16 v6, p0

    .line 538
    iget-object v0, v3, Ll/ۚܶۖ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_5a

    const-string v0, "^L"

    const-string v1, ""

    .line 539
    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ";$"

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v3, Ll/ۚܶۖ;->ۧ:Ljava/lang/String;

    .line 552
    :try_start_0
    const-class v2, Ll/֨ܶۖ;

    const-string v3, "/assets/Hex.class"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 553
    :try_start_1
    new-instance v3, Ll/ܿ᩶ۚ;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v3, v2}, Ll/ܿ᩶ۚ;-><init>(Ljava/io/InputStream;)V

    .line 554
    new-instance v4, Ll/ᩴܶۖ;

    invoke-direct {v4, v12, v1, v0}, Ll/ᩴܶۖ;-><init>(Ll/᩻᩶ۚ;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ܽ᩶ۚ;

    const/16 v1, 0x8

    .line 425
    invoke-virtual {v3, v4, v0, v1}, Ll/ܿ᩶ۚ;->֫(Ll/᩻᩶ۚ;[Ll/ܽ᩶ۚ;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 578
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3b

    :catchall_0
    move-exception v0

    move-object v1, v0

    if-eqz v2, :cond_58

    .line 552
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3a

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_58
    :goto_3a
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    .line 579
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failed to add res/Hex.decode_*"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_59
    move-object/from16 v6, p0

    .line 543
    :cond_5a
    :goto_3b
    invoke-virtual {v12}, Ll/᩻᩶ۚ;->֫()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public ֫(Ll/ۚ᩹ۖ;)V
    .locals 3

    .line 855
    invoke-static {p1}, Ll/᩸ۙۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 856
    iget-object v0, p0, Ll/֨ܶۖ;->ۧ:Ll/᩹ۙۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/᩹ۙۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 10
    iget-object v0, p0, Ll/֨ܶۖ;->᩷:Ll/ܺۗۖ;

    invoke-virtual {v0, p1}, Ll/ܺۗۖ;->֫(Ll/ۚ᩹ۖ;)Z

    iget-object v1, p0, Ll/֨ܶۖ;->ۜ:Ll/ۜۗۖ;

    invoke-virtual {v1, p1}, Ll/ۜۗۖ;->֫(Ll/ۚ᩹ۖ;)Z

    .line 859
    iget-object v2, p0, Ll/֨ܶۖ;->ۘ:Ll/᩺ۗۖ;

    .line 10
    invoke-virtual {v2, p1}, Ll/᩺ۗۖ;->֫(Ll/ۚ᩹ۖ;)Z

    .line 860
    iget-object v2, p0, Ll/֨ܶۖ;->᩻:Ll/ܳۗۖ;

    invoke-virtual {v2, p1}, Ll/ܳۗۖ;->֫(Ll/ۚ᩹ۖ;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 861
    invoke-static {p1}, Ll/᩹ۙۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 10
    invoke-virtual {v0, p1}, Ll/ܺۗۖ;->֫(Ll/ۚ᩹ۖ;)Z

    invoke-virtual {v1, p1}, Ll/ۜۗۖ;->֫(Ll/ۚ᩹ۖ;)Z

    .line 865
    :cond_0
    iget-object v2, p0, Ll/֨ܶۖ;->ܳ:Ll/֫ۗۖ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/֫ۗۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 866
    iget-object v2, p0, Ll/֨ܶۖ;->ܽ:Ll/᩷۬ۖ;

    .line 10
    invoke-virtual {v2, p1}, Ll/᩷۬ۖ;->֫(Ll/ۚ᩹ۖ;)Z

    .line 867
    iget-object v2, p0, Ll/֨ܶۖ;->֫:Ll/ۖۙۖ;

    .line 10
    invoke-virtual {v2, p1}, Ll/ۖۙۖ;->֫(Ll/ۚ᩹ۖ;)Z

    .line 868
    iget-object v2, p0, Ll/֨ܶۖ;->ܿ:Ll/ۛۙۖ;

    .line 10
    invoke-virtual {v2, p1}, Ll/ۛۙۖ;->֫(Ll/ۚ᩹ۖ;)Z

    .line 869
    iget-object v2, p0, Ll/֨ܶۖ;->ۖ:Ll/ۨۗۖ;

    .line 69
    invoke-virtual {v2, p1}, Ll/ۨۗۖ;->֫(Ll/ۚ᩹ۖ;)Z

    .line 874
    invoke-static {p1}, Ll/᩹ۙۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 10
    invoke-virtual {v0, p1}, Ll/ܺۗۖ;->֫(Ll/ۚ᩹ۖ;)Z

    invoke-virtual {v1, p1}, Ll/ۜۗۖ;->֫(Ll/ۚ᩹ۖ;)Z

    .line 878
    iget-object v0, p0, Ll/֨ܶۖ;->ۡ:Ll/᩹ۗۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/᩹ۗۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 879
    iget-object v0, p0, Ll/֨ܶۖ;->ܺ:Ll/ۤۗۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ۤۗۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 880
    iget-object v0, p0, Ll/֨ܶۖ;->ۢ:Ll/ۙۙۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ۙۙۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 881
    iget-object v0, p0, Ll/֨ܶۖ;->ᩳ:Ll/۫ۙۖ;

    invoke-virtual {v0, p1}, Ll/۫ۙۖ;->֫(Ll/ۚ᩹ۖ;)V

    return-void
.end method

.method public ֫(Ll/ۚ᩹ۖ;Ll/ܶ᩶ۚ;Ll/ۚܶۖ;)V
    .locals 1

    .line 845
    new-instance v0, Ll/ۡܶۖ;

    .line 77
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 847
    invoke-virtual {v0, p3}, Ll/ۡܶۖ;->֫(Ll/ۚܶۖ;)V

    .line 848
    invoke-virtual {v0, p1}, Ll/ۡܶۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 849
    invoke-virtual {v0, p2}, Ll/ۡܶۖ;->֫(Ll/ܶ᩶ۚ;)V

    .line 850
    invoke-virtual {v0}, Ll/ۡܶۖ;->֫()V

    const/4 p1, -0x1

    .line 851
    invoke-virtual {p2, p1, p1}, Ll/ܶ᩶ۚ;->ܽ(II)V

    return-void
.end method

.method public ֫(Ll/᩵᩸ۖ;Ll/ܶ᩶ۚ;Ll/ۚܶۖ;)V
    .locals 3

    .line 822
    new-instance v0, Ll/᩷ܶۖ;

    invoke-direct {v0}, Ll/᩷ܶۖ;-><init>()V

    iget v1, p1, Ll/᩵᩸ۖ;->᩸:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p1, Ll/᩵᩸ۖ;->ۙ:Ll/۟۠ۖ;

    iget-object p1, p1, Ll/᩵᩸ۖ;->᩶:Ll/ᩳ᩸ۖ;

    .line 823
    invoke-virtual {v0, v1, v2, p1}, Ll/᩷ܶۖ;->֫(ZLl/۟۠ۖ;Ll/ᩳ᩸ۖ;)Ll/ۚ᩹ۖ;

    move-result-object p1

    .line 585
    invoke-virtual {p0, p1}, Ll/֨ܶۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 586
    invoke-virtual {p0, p1, p2, p3}, Ll/֨ܶۖ;->֫(Ll/ۚ᩹ۖ;Ll/ܶ᩶ۚ;Ll/ۚܶۖ;)V

    return-void
.end method
