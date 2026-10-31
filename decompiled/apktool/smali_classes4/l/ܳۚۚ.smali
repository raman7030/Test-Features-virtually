.class public final enum Ll/ܳۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "InTableText"

    const/16 v1, 0x9

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܳۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1086
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 6

    .line 1088
    iget-object v0, p1, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    sget-object v1, Ll/ܺ֨ۚ;->᩹:Ll/ܺ֨ۚ;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    .line 486
    check-cast p1, Ll/ܿ֨ۚ;

    .line 1090
    invoke-virtual {p1}, Ll/ܿ֨ۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ll/᩺ۚۚ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1091
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v3

    .line 1094
    :cond_0
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܺ()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܿ֨ۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return v2

    .line 1097
    :cond_1
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܺ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 1098
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܺ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1099
    invoke-static {v1}, Ll/᩺ۚۚ;->֫(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 1101
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    .line 1102
    invoke-virtual {p2}, Ll/֡ܶۚ;->֫()Ll/᩶֡ۚ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/ۨۚۚ;->۟:[Ljava/lang/String;

    invoke-static {v4, v5}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1103
    invoke-virtual {p2, v2}, Ll/ܿۚۚ;->ܽ(Z)V

    .line 1104
    new-instance v4, Ll/ܿ֨ۚ;

    invoke-direct {v4}, Ll/ܿ֨ۚ;-><init>()V

    invoke-virtual {v4, v1}, Ll/ܿ֨ۚ;->֫(Ljava/lang/String;)V

    sget-object v1, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    invoke-virtual {p2, v4, v1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    .line 1105
    invoke-virtual {p2, v3}, Ll/ܿۚۚ;->ܽ(Z)V

    goto :goto_0

    .line 1107
    :cond_2
    new-instance v4, Ll/ܿ֨ۚ;

    invoke-direct {v4}, Ll/ܿ֨ۚ;-><init>()V

    invoke-virtual {v4, v1}, Ll/ܿ֨ۚ;->֫(Ljava/lang/String;)V

    sget-object v1, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    invoke-virtual {p2, v4, v1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    goto :goto_0

    .line 1110
    :cond_3
    new-instance v4, Ll/ܿ֨ۚ;

    invoke-direct {v4}, Ll/ܿ֨ۚ;-><init>()V

    invoke-virtual {v4, v1}, Ll/ܿ֨ۚ;->֫(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ll/ܿۚۚ;->֫(Ll/ܿ֨ۚ;)V

    goto :goto_0

    .line 1112
    :cond_4
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩵()V

    .line 1114
    :cond_5
    invoke-virtual {p2}, Ll/ܿۚۚ;->֡()Ll/᩺ۚۚ;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 1115
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1
.end method
