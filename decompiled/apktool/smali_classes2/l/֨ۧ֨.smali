.class public final Ll/֨ۧ֨;
.super Ll/ۗۧ֨;
.source "K3OA"


# instance fields
.field public final ۜ:I

.field public final ܳ:Ljava/util/Stack;

.field public final synthetic ᩻:Ll/ۤۧ֨;


# direct methods
.method public constructor <init>(Ll/ۤۧ֨;Ll/۫ۧ֨;)V
    .locals 2

    .line 999
    iput-object p1, p0, Ll/֨ۧ֨;->᩻:Ll/ۤۧ֨;

    const/4 v0, 0x0

    .line 1000
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, p1, p2, v1}, Ll/ۗۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;Ljava/lang/Object;)V

    .line 992
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Ll/֨ۧ֨;->ܳ:Ljava/util/Stack;

    .line 1001
    iput v0, p0, Ll/֨ۧ֨;->ۜ:I

    return-void
.end method

.method public constructor <init>(Ll/ۤۧ֨;Ll/۫ۧ֨;II)V
    .locals 0

    .line 994
    iput-object p1, p0, Ll/֨ۧ֨;->᩻:Ll/ۤۧ֨;

    .line 995
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Ll/ۗۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;Ljava/lang/Object;)V

    .line 992
    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Ll/֨ۧ֨;->ܳ:Ljava/util/Stack;

    .line 996
    iput p4, p0, Ll/֨ۧ֨;->ۜ:I

    return-void
.end method

.method private ᩳ()V
    .locals 13

    .line 1136
    iget-object v0, p0, Ll/֨ۧ֨;->᩻:Ll/ۤۧ֨;

    iget-boolean v1, v0, Ll/ۢܽ֨;->ܺ֫:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    const-string v5, "#%d.#%d;"

    const-string v6, "#%d:#%d;"

    const-string v7, " // unknown tag: "

    iget-object v8, p0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    const-string v9, "%d:#%d;"

    iget v10, p0, Ll/֨ۧ֨;->ۜ:I

    iget-object v11, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 1137
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 1144
    :pswitch_0
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v3

    aput-object v1, v4, v2

    invoke-static {v9, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Ll/ۗۧ֨;->֫:I

    invoke-virtual {v0, v2, v1}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v8}, Ll/۫ۧ֨;->֫(Ll/۫ۧ֨;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void

    .line 1141
    :pswitch_1
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v3

    aput-object v1, v4, v2

    invoke-virtual {v0, v9, v4}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 1142
    :pswitch_2
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v3

    aput-object v1, v4, v2

    invoke-virtual {v0, v6, v4}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 1139
    :pswitch_3
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v3

    aput-object v1, v4, v2

    invoke-virtual {v0, v5, v4}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 1147
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const-string v12, " // "

    packed-switch v1, :pswitch_data_1

    .line 1157
    :pswitch_4
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v3

    aput-object v1, v4, v2

    invoke-static {v9, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Ll/ۗۧ֨;->֫:I

    invoke-virtual {v0, v2, v1}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v8}, Ll/۫ۧ֨;->֫(Ll/۫ۧ֨;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void

    .line 1155
    :pswitch_5
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v5, v4, [Ljava/lang/Object;

    aput-object v11, v5, v3

    aput-object v1, v5, v2

    invoke-static {v9, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v5, p0, Ll/ۗۧ֨;->֫:I

    invoke-virtual {v0, v5, v1}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    invoke-virtual {v0, v10}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v3

    aput-object v1, v4, v2

    const-string v1, " // #%d:%s"

    invoke-virtual {v0, v1, v4}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 1151
    :pswitch_6
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v3

    aput-object v1, v4, v2

    invoke-static {v9, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Ll/ۗۧ֨;->֫:I

    invoke-virtual {v0, v2, v1}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/֨ۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void

    .line 1153
    :pswitch_7
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v3

    aput-object v1, v4, v2

    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Ll/ۗۧ֨;->֫:I

    invoke-virtual {v0, v2, v1}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/֨ۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void

    .line 1149
    :pswitch_8
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v3

    aput-object v1, v4, v2

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Ll/ۗۧ֨;->֫:I

    invoke-virtual {v0, v2, v1}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/֨ۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_4
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1007
    :cond_0
    instance-of v1, p1, Ll/֨ۧ֨;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 1008
    :cond_1
    invoke-super {p0, p1}, Ll/ۗۧ֨;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    .line 1009
    :cond_2
    check-cast p1, Ll/֨ۧ֨;

    .line 1010
    iget v1, p0, Ll/֨ۧ֨;->ۜ:I

    iget p1, p1, Ll/֨ۧ֨;->ۜ:I

    if-ne v1, p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1015
    invoke-super {p0}, Ll/ۗۧ֨;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 1016
    iget v1, p0, Ll/֨ۧ֨;->ۜ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1095
    iget-object v0, p0, Ll/֨ۧ֨;->᩻:Ll/ۤۧ֨;

    invoke-virtual {v0, p1}, Ll/ۤۧ֨;->᩶(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 1096
    invoke-static {v0}, Ll/ۤۧ֨;->ܽ(Ll/ۤۧ֨;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۧ֨;

    .line 1097
    iget-object v3, p0, Ll/֨ۧ֨;->ܳ:Ljava/util/Stack;

    invoke-virtual {v3, p0}, Ljava/util/Stack;->search(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, -0x1

    const-string v6, ""

    if-ne v4, v5, :cond_0

    .line 1098
    invoke-virtual {v3, p0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1099
    invoke-virtual {v0, p1}, Ll/ۤۧ֨;->ۜ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1100
    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    return-object p1

    .line 1103
    :cond_0
    instance-of v3, v1, Ll/֨ۧ֨;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    .line 1104
    iget-object v3, v1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v3}, Ll/۫ۧ֨;->᩻()Ljava/lang/String;

    move-result-object v3

    iget-object v7, v1, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ll/֨ۧ֨;

    iget v8, v8, Ll/֨ۧ֨;->ۜ:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v3, v9, v2

    aput-object v7, v9, v5

    aput-object v8, v9, v4

    const-string v2, "%-8s %d:#%d; "

    invoke-static {v2, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 1106
    :cond_1
    iget-object v3, v1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v3}, Ll/۫ۧ֨;->᩻()Ljava/lang/String;

    move-result-object v3

    iget-object v7, v1, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v2

    aput-object v7, v4, v5

    const-string v2, "%-8s #%d; "

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1108
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "circular reference to "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v4}, Ll/۫ۧ֨;->᩻()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " #"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1109
    iget-boolean v3, v0, Ll/ۢܽ֨;->֫֫:Z

    const-string v4, ">"

    const/16 v5, 0x19

    if-eqz v3, :cond_2

    .line 1110
    invoke-virtual {v0, v5, v2}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v6, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "<"

    invoke-virtual {p3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 1112
    :cond_2
    invoke-virtual {v0, v5, v2}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, " // <"

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 1114
    :goto_1
    new-instance p3, Ljava/io/IOException;

    invoke-direct {p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ll/ۗۧ֨;->֫(Ljava/io/IOException;)V

    return-object p2

    .line 1117
    :cond_3
    invoke-static {v0}, Ll/ۤۧ֨;->ۧ(Ll/ۤۧ֨;)Ll/᩶ۗۚ;

    move-result-object p1

    const-string p2, "??? The entry is missing from the constant_pool table"

    new-array p3, v2, [Ljava/lang/Object;

    invoke-virtual {p1, p2, p3}, Ll/᩶ۗۚ;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܰ֫֨;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1070
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1071
    iget-object v1, p1, Ll/ܰ֫֨;->۬֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 1072
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-lez v1, :cond_3

    const/4 p2, 0x0

    :goto_0
    if-ge p2, v1, :cond_3

    .line 1075
    iget-object v2, p1, Ll/ܰ֫֨;->۬֫:Ljava/util/ArrayList;

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v3, v1, -0x1

    if-eq p2, v3, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    const-string v4, ""

    if-eqz v3, :cond_1

    const-string v5, "^"

    goto :goto_2

    :cond_1
    move-object v5, v4

    :goto_2
    if-eqz v3, :cond_2

    const-string v4, "\u2f80"

    .line 1085
    :cond_2
    invoke-virtual {p0, v2, v5, v4}, Ll/֨ۧ֨;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1077
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 1080
    :cond_3
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1081
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֨۬ۚ;I)V
    .locals 0

    .line 1124
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->֫(Ll/֨۬ۚ;I)V

    .line 1125
    invoke-direct {p0}, Ll/֨ۧ֨;->ᩳ()V

    return-void
.end method

.method public final ۧ(Ll/֨۬ۚ;I)V
    .locals 0

    .line 1130
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->ۧ(Ll/֨۬ۚ;I)V

    .line 1131
    invoke-direct {p0}, Ll/֨ۧ֨;->ᩳ()V

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 7

    .line 1023
    iget-object v0, p0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const-string v2, "."

    const-string v3, ":"

    iget v4, p0, Ll/֨ۧ֨;->ۜ:I

    iget-object v5, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    iget-object v6, p0, Ll/֨ۧ֨;->᩻:Ll/ۤۧ֨;

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    const-string v0, "UnknownTag"

    return-object v0

    .line 1045
    :pswitch_1
    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1049
    :try_start_0
    invoke-static {v6}, Ll/ۤۧ֨;->֫(Ll/ۤۧ֨;)Ll/᩷ۧ֨;

    move-result-object v1

    iget-object v1, v1, Ll/᩷ۧ֨;->ۜۧ:Ll/۟ۧ֨;

    .line 80
    iget-object v1, v1, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢܽ֨;

    .line 1049
    check-cast v1, Ll/ܰ֫֨;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1055
    iget v0, v1, Ll/ܰ֫֨;->۫֫:I

    .line 1056
    invoke-virtual {v6, v0}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    .line 1057
    invoke-virtual {v6, v4}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "{"

    const-string v5, "}"

    .line 1058
    invoke-virtual {p0, v1, v4, v5}, Ll/֨ۧ֨;->֫(Ll/ܰ֫֨;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    const-string v1, "<Invalid bootstrap method index:"

    const-string v2, ">"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_1
    const-string v0, "<Missing BootstrapMethods attribute>"

    return-object v0

    .line 1041
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v6, v1}, Ll/ۤۧ֨;->֫(Ll/ۤۧ֨;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1038
    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v6, v1}, Ll/ۤۧ֨;->getName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1034
    :pswitch_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ll/ۤۧ֨;->֫(Ll/۫ۧ֨;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Ll/ۤۧ֨;->ۚ(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Ll/ۤۧ֨;->֫(Ll/ۤۧ֨;)Ll/᩷ۧ֨;

    move-result-object v3

    iget-object v3, v3, Ll/᩷ۧ֨;->᩸ۧ:Ljava/lang/String;

    invoke-static {v0, v3}, Ll/ۤۧ֨;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1035
    invoke-virtual {v6, v4}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1027
    :pswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v6, v1}, Ll/ۤۧ֨;->ۚ(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6}, Ll/ۤۧ֨;->֫(Ll/ۤۧ֨;)Ll/᩷ۧ֨;

    move-result-object v3

    iget-object v3, v3, Ll/᩷ۧ֨;->᩸ۧ:Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ۤۧ֨;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
