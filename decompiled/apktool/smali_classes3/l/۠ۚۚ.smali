.class public final enum Ll/۠ۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AfterAfterFrameset"

    const/16 v1, 0x16

    .line 0
    invoke-direct {p0, v0, v1}, Ll/۠ۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1705
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 2

    .line 1707
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 474
    check-cast p1, Ll/ܳ֨ۚ;

    .line 1708
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܳ֨ۚ;)V

    goto :goto_0

    .line 1709
    :cond_0
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {p1}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 458
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    const-string v1, "html"

    .line 1709
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 1711
    :cond_1
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 1713
    :cond_2
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 458
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    const-string v1, "noframes"

    .line 1713
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1714
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    .line 171
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1716
    :cond_3
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    const/4 p1, 0x0

    return p1

    .line 1710
    :cond_4
    :goto_1
    sget-object v0, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    .line 171
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1
.end method
