.class public final Ll/ۘܶܳ;
.super Ll/֨ܶܳ;
.source "L5KK"


# instance fields
.field public final synthetic ۙ:Ll/᩵ܶܳ;

.field public final ᩶:Ll/ܽᩴܳ;


# direct methods
.method public constructor <init>(Ll/᩵ܶܳ;Lbin/mt/plus/Main;Ll/ܽᩴܳ;)V
    .locals 0

    .line 100
    iput-object p1, p0, Ll/ۘܶܳ;->ۙ:Ll/᩵ܶܳ;

    .line 12
    invoke-direct {p0, p2}, Ll/ۨ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 102
    iput-object p3, p0, Ll/ۘܶܳ;->᩶:Ll/ܽᩴܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘܶܳ;)Ll/ܽᩴܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘܶܳ;->᩶:Ll/ܽᩴܳ;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 132
    iget-object p1, p0, Ll/ۘܶܳ;->ۙ:Ll/᩵ܶܳ;

    iget-object p1, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p1}, Ll/ۗܶܳ;->ܽ()Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Ll/֨ܶܳ;->᩹:Ll/ۡۤۡ;

    invoke-virtual {p1}, Ll/ۡۤۡ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 135
    :cond_0
    iget-object p1, p0, Ll/ۘܶܳ;->᩶:Ll/ܽᩴܳ;

    invoke-virtual {p1}, Ll/ܽᩴܳ;->᩻()Ll/ܿᩴܳ;

    move-result-object v0

    .line 136
    iget-object v1, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    if-nez v0, :cond_3

    .line 137
    invoke-virtual {v1}, Lbin/mt/plus/Main;->ۨ()V

    .line 138
    invoke-virtual {p1}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 139
    invoke-virtual {v1}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ll/ۢۘܳ;->ۜ()Ll/ܽۢܳ;

    move-result-object v0

    .line 140
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    if-nez v1, :cond_1

    .line 142
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    :cond_1
    if-eqz v1, :cond_2

    .line 143
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void

    .line 144
    :cond_3
    invoke-virtual {v0}, Ll/ܿᩴܳ;->ۧ()I

    move-result v2

    invoke-virtual {p1}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ll/ܿᩴܳ;->ܽ()Z

    move-result v0

    invoke-virtual {v1, v2, p1, v0}, Lbin/mt/plus/Main;->ۧ(ILjava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 145
    invoke-virtual {v1}, Lbin/mt/plus/Main;->ۨ()V

    :cond_4
    :goto_1
    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ܽ()Ll/ۨܺ᩷;
    .locals 3

    .line 109
    iget-object v0, p0, Ll/ۘܶܳ;->᩶:Ll/ܽᩴܳ;

    invoke-virtual {v0}, Ll/ܽᩴܳ;->᩷()Ll/᩶ۖܳ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 252
    iget-object v0, v1, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    return-object v0

    .line 113
    :cond_0
    invoke-virtual {v0}, Ll/ܽᩴܳ;->᩻()Ll/ܿᩴܳ;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    .line 115
    invoke-virtual {v1}, Ll/ܿᩴܳ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-static {v1, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Z)Ll/ۖ֨ܿ;

    move-result-object v1

    .line 115
    invoke-virtual {v1}, Ll/ۖ֨ܿ;->ܿ()Ll/᩶ۖܳ;

    move-result-object v1

    .line 116
    :goto_0
    invoke-virtual {v0, v1}, Ll/ܽᩴܳ;->֫(Ll/᩶ۖܳ;)V

    .line 252
    iget-object v0, v1, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    return-object v0

    .line 119
    :cond_2
    invoke-virtual {v0}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-static {v0, v2}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Z)Ll/ۖ֨ܿ;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ll/ۖ֨ܿ;->ܿ()Ll/᩶ۖܳ;

    move-result-object v0

    .line 252
    iget-object v0, v0, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    return-object v0
.end method
