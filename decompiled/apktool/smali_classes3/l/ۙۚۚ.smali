.class public final enum Ll/ۙۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "InHead"

    const/4 v1, 0x3

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۙۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 103
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method private ֫(Ll/ۖ֨ۚ;Ll/֡ܶۚ;)Z
    .locals 1

    const-string v0, "head"

    .line 188
    invoke-virtual {p2, v0}, Ll/֡ܶۚ;->ܽ(Ljava/lang/String;)Z

    .line 189
    invoke-virtual {p2, p1}, Ll/֡ܶۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 7

    .line 105
    invoke-static {p1}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    check-cast p1, Ll/ܿ֨ۚ;

    .line 106
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܿ֨ۚ;)V

    return v1

    .line 109
    :cond_0
    sget-object v0, Ll/᩸ۚۚ;->֫:[I

    iget-object v2, p1, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    if-eq v0, v1, :cond_13

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eq v0, v2, :cond_12

    const/4 v2, 0x3

    const-string v4, "template"

    const-string v5, "head"

    if-eq v0, v2, :cond_7

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    .line 182
    invoke-direct {p0, p1, p2}, Ll/ۙۚۚ;->֫(Ll/ۖ֨ۚ;Ll/֡ܶۚ;)Z

    move-result p1

    return p1

    .line 466
    :cond_1
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 159
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 160
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۚ()V

    .line 161
    sget-object p1, Ll/᩺ۚۚ;->۬:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    return v1

    .line 162
    :cond_2
    sget-object v2, Ll/ۨۚۚ;->ܶ:[Ljava/lang/String;

    invoke-static {v0, v2}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 163
    invoke-direct {p0, p1, p2}, Ll/ۙۚۚ;->֫(Ll/ۖ֨ۚ;Ll/֡ܶۚ;)Z

    move-result p1

    return p1

    .line 164
    :cond_3
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 165
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۖ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 166
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v1

    .line 168
    :cond_4
    invoke-virtual {p2, v1}, Ll/ܿۚۚ;->ۧ(Z)V

    .line 169
    invoke-virtual {p2}, Ll/֡ܶۚ;->֫()Ll/᩶֡ۚ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    .line 170
    :cond_5
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۘ(Ljava/lang/String;)V

    .line 171
    invoke-virtual {p2}, Ll/ܿۚۚ;->ᩳ()V

    .line 172
    invoke-virtual {p2}, Ll/ܿۚۚ;->֨()V

    .line 173
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩸()Z

    return v1

    .line 177
    :cond_6
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v3

    .line 458
    :cond_7
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v2, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    const-string v6, "html"

    .line 119
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 120
    sget-object v0, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 121
    :cond_8
    sget-object v6, Ll/ۨۚۚ;->۠:[Ljava/lang/String;

    invoke-static {v2, v6}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 122
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۧ(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    move-result-object p1

    const-string v0, "base"

    .line 124
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "href"

    invoke-virtual {p1, v0}, Ll/ۨ֡ۚ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 125
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܿ(Ll/᩶֡ۚ;)V

    :cond_9
    return v1

    :cond_a
    const-string v6, "meta"

    .line 126
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 127
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۧ(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    return v1

    :cond_b
    const-string v6, "title"

    .line 129
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 130
    invoke-static {v0, p2}, Ll/᩺ۚۚ;->ۧ(Ll/ۢ֨ۚ;Ll/ܿۚۚ;)V

    return v1

    .line 131
    :cond_c
    sget-object v6, Ll/ۨۚۚ;->᩶:[Ljava/lang/String;

    invoke-static {v2, v6}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 132
    invoke-static {v0, p2}, Ll/᩺ۚۚ;->֫(Ll/ۢ֨ۚ;Ll/ܿۚۚ;)V

    return v1

    :cond_d
    const-string v6, "noscript"

    .line 133
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    .line 135
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    .line 136
    sget-object p1, Ll/᩺ۚۚ;->ܽ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    return v1

    :cond_e
    const-string v6, "script"

    .line 137
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    .line 139
    iget-object p1, p2, Ll/֡ܶۚ;->ۡ:Ll/᩵֨ۚ;

    sget-object v2, Ll/᩵ܶۚ;->֫ۧ:Ll/᩵ܶۚ;

    invoke-virtual {p1, v2}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    .line 140
    invoke-virtual {p2}, Ll/ܿۚۚ;->ᩴ()V

    .line 141
    sget-object p1, Ll/᩺ۚۚ;->ܺ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 142
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    return v1

    .line 143
    :cond_f
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 144
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v3

    .line 146
    :cond_10
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 147
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    .line 148
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۖ()V

    .line 149
    invoke-virtual {p2, v3}, Ll/ܿۚۚ;->֫(Z)V

    .line 150
    sget-object p1, Ll/᩺ۚۚ;->ۢ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 151
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ۧ(Ll/᩺ۚۚ;)V

    return v1

    .line 153
    :cond_11
    invoke-direct {p0, p1, p2}, Ll/ۙۚۚ;->֫(Ll/ۖ֨ۚ;Ll/֡ܶۚ;)Z

    move-result p1

    return p1

    .line 114
    :cond_12
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v3

    .line 474
    :cond_13
    check-cast p1, Ll/ܳ֨ۚ;

    .line 111
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܳ֨ۚ;)V

    return v1
.end method
