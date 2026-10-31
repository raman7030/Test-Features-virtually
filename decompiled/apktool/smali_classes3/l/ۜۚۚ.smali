.class public final enum Ll/ۜۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "InColumnGroup"

    const/16 v1, 0xb

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۜۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1153
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method private ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 1

    const-string v0, "colgroup"

    .line 1213
    invoke-virtual {p2, v0}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1214
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    const/4 p1, 0x0

    return p1

    .line 1217
    :cond_0
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۚ()V

    .line 1218
    sget-object v0, Ll/᩺ۚۚ;->᩻֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 1219
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 7

    .line 1155
    invoke-static {p1}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 1156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    check-cast p1, Ll/ܿ֨ۚ;

    .line 1156
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܿ֨ۚ;)V

    return v1

    .line 1159
    :cond_0
    sget-object v0, Ll/᩸ۚۚ;->֫:[I

    iget-object v2, p1, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    if-eq v0, v1, :cond_c

    const/4 v2, 0x2

    if-eq v0, v2, :cond_b

    const/4 v3, 0x3

    const/4 v4, 0x0

    const-string v5, "template"

    const-string v6, "html"

    if-eq v0, v3, :cond_7

    const/4 v2, 0x4

    if-eq v0, v2, :cond_3

    const/4 v2, 0x6

    if-eq v0, v2, :cond_1

    .line 1207
    invoke-direct {p0, p1, p2}, Ll/ۜۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1202
    :cond_1
    invoke-virtual {p2, v6}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 1205
    :cond_2
    invoke-direct {p0, p1, p2}, Ll/ۜۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 466
    :cond_3
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, "colgroup"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 1198
    invoke-direct {p0, p1, p2}, Ll/ۜۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1186
    :cond_4
    invoke-virtual {p2, v0}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 1187
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v4

    .line 1190
    :cond_5
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۚ()V

    .line 1191
    sget-object p1, Ll/᩺ۚۚ;->᩻֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    return v1

    .line 1195
    :cond_6
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1, v0}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    return v1

    .line 458
    :cond_7
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v3, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1168
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_0

    :sswitch_1
    const-string v2, "col"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x1

    goto :goto_1

    :sswitch_2
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_0

    :cond_9
    const/4 v2, 0x0

    goto :goto_1

    :goto_0
    const/4 v2, -0x1

    :cond_a
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 1178
    invoke-direct {p0, p1, p2}, Ll/ۜۚۚ;->ۧ(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1170
    :pswitch_0
    sget-object v0, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    .line 171
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1172
    :pswitch_1
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۧ(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    return v1

    .line 1175
    :pswitch_2
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1, v0}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    return v1

    .line 1164
    :cond_b
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v1

    .line 474
    :cond_c
    check-cast p1, Ll/ܳ֨ۚ;

    .line 1161
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܳ֨ۚ;)V

    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4ec53386 -> :sswitch_2
        0x18180 -> :sswitch_1
        0x3107ab -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
