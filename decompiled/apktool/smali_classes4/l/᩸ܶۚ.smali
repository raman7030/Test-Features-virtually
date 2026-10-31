.class public final Ll/᩸ܶۚ;
.super Ljava/lang/Object;
.source "P6MK"


# instance fields
.field public final ֫:Ll/۫ܶۚ;


# direct methods
.method public constructor <init>(Ll/۫ܶۚ;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/᩸ܶۚ;->֫:Ll/۫ܶۚ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸ܶۚ;)Ll/۫ܶۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ܶۚ;->֫:Ll/۫ܶۚ;

    return-object p0
.end method

.method public static ֫(Ll/᩸ܶۚ;Ll/᩶֡ۚ;)Ll/ܶܶۚ;
    .locals 8

    .line 148
    iget-object p0, p0, Ll/᩸ܶۚ;->֫:Ll/۫ܶۚ;

    invoke-virtual {p1}, Ll/᩶֡ۚ;->᩷֫()Ljava/lang/String;

    move-result-object v0

    .line 149
    new-instance v1, Ll/ܺ֡ۚ;

    invoke-direct {v1}, Ll/ܺ֡ۚ;-><init>()V

    .line 150
    new-instance v2, Ll/᩶֡ۚ;

    .line 91
    sget-object v3, Ll/֫֨ۚ;->ᩳ:Ll/֫֨ۚ;

    invoke-static {v0, v3}, Ll/ܽ֨ۚ;->֫(Ljava/lang/String;Ll/֫֨ۚ;)Ll/ܽ֨ۚ;

    move-result-object v3

    .line 150
    invoke-virtual {p1}, Ll/᩶֡ۚ;->ܽ()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4, v1}, Ll/᩶֡ۚ;-><init>(Ll/ܽ֨ۚ;Ljava/lang/String;Ll/ܺ֡ۚ;)V

    .line 153
    invoke-virtual {p1}, Ll/᩶֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v3

    .line 154
    invoke-virtual {v3}, Ll/ܺ֡ۚ;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۢ֡ۚ;

    .line 155
    invoke-virtual {p0, v0, p1, v6}, Ll/۫ܶۚ;->֫(Ljava/lang/String;Ll/᩶֡ۚ;Ll/ۢ֡ۚ;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 156
    invoke-virtual {v1, v6}, Ll/ܺ֡ۚ;->֫(Ll/ۢ֡ۚ;)V

    goto :goto_0

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 160
    :cond_1
    invoke-virtual {p0, v0}, Ll/۫ܶۚ;->֫(Ljava/lang/String;)Ll/ܺ֡ۚ;

    move-result-object p0

    .line 161
    invoke-virtual {v1, p0}, Ll/ܺ֡ۚ;->֫(Ll/ܺ֡ۚ;)V

    .line 165
    invoke-virtual {p1}, Ll/ۨ֡ۚ;->᩹()Ll/֫ۚۚ;

    move-result-object p0

    invoke-virtual {p0}, Ll/֫ۚۚ;->ۧ()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 166
    invoke-virtual {p1}, Ll/ۨ֡ۚ;->᩹()Ll/֫ۚۚ;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v2, v0}, Ll/֫ۚۚ;->֫(Ll/ۨ֡ۚ;Z)V

    .line 167
    :cond_2
    invoke-virtual {p1}, Ll/᩶֡ۚ;->ۨ()Ll/֫ۚۚ;

    move-result-object p0

    invoke-virtual {p0}, Ll/֫ۚۚ;->ۧ()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 168
    invoke-virtual {p1}, Ll/᩶֡ۚ;->ۨ()Ll/֫ۚۚ;

    move-result-object p0

    invoke-virtual {p0, v2, v4}, Ll/֫ۚۚ;->֫(Ll/ۨ֡ۚ;Z)V

    .line 170
    :cond_3
    new-instance p0, Ll/ܶܶۚ;

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 178
    iput-object v2, p0, Ll/ܶܶۚ;->֫:Ll/᩶֡ۚ;

    .line 179
    iput v5, p0, Ll/ܶܶۚ;->ۧ:I

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/֨֡ۚ;)Ll/֨֡ۚ;
    .locals 4

    .line 57
    invoke-virtual {p1}, Ll/᩶֡ۚ;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֨֡ۚ;->ۖ(Ljava/lang/String;)Ll/֨֡ۚ;

    move-result-object v0

    .line 58
    invoke-virtual {p1}, Ll/֨֡ۚ;->ᩴ֫()Ll/᩶֡ۚ;

    move-result-object v1

    invoke-virtual {v0}, Ll/֨֡ۚ;->ᩴ֫()Ll/᩶֡ۚ;

    move-result-object v2

    .line 142
    new-instance v3, Ll/۠ܶۚ;

    invoke-direct {v3, p0, v1, v2}, Ll/۠ܶۚ;-><init>(Ll/᩸ܶۚ;Ll/᩶֡ۚ;Ll/᩶֡ۚ;)V

    .line 143
    invoke-static {v3, v1}, Ll/᩹ܽܽ;->֫(Ll/ۡ᩹ۚ;Ll/ۨ֡ۚ;)V

    .line 59
    invoke-virtual {p1}, Ll/֨֡ۚ;->֡֫()Ll/֡֡ۚ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֡֡ۚ;->clone()Ll/֡֡ۚ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/֨֡ۚ;->ۧ(Ll/֡֡ۚ;)V

    return-object v0
.end method
