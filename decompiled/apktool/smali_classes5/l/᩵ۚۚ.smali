.class public final enum Ll/᩵ۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "Initial"

    const/4 v1, 0x0

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩵ۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 6

    .line 22
    invoke-static {p1}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 24
    :cond_0
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    check-cast p1, Ll/ܳ֨ۚ;

    .line 25
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܳ֨ۚ;)V

    return v1

    .line 26
    :cond_1
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 450
    move-object v0, p1

    check-cast v0, Ll/᩻֨ۚ;

    .line 30
    new-instance v2, Ll/۠֡ۚ;

    iget-object v3, p2, Ll/֡ܶۚ;->ۜ:Ll/֫֨ۚ;

    .line 78
    iget-object v4, v0, Ll/᩻֨ۚ;->ܿ:Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 31
    invoke-virtual {v3, v4}, Ll/֫֨ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 86
    iget-object v4, v0, Ll/᩻֨ۚ;->᩻:Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 90
    iget-object v5, v0, Ll/᩻֨ۚ;->ۜ:Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 31
    invoke-direct {v2, v3, v4, v5}, Ll/۠֡ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v3, v0, Ll/᩻֨ۚ;->ܳ:Ljava/lang/String;

    .line 32
    invoke-virtual {v2, v3}, Ll/۠֡ۚ;->ܳ(Ljava/lang/String;)V

    .line 200
    iget-object v3, p2, Ll/֡ܶۚ;->ܽ:Ll/֨֡ۚ;

    .line 33
    invoke-virtual {v3, v2}, Ll/᩶֡ۚ;->ܽ(Ll/ۨ֡ۚ;)V

    .line 34
    invoke-virtual {p2, v2, p1}, Ll/֡ܶۚ;->֫(Ll/ۨ֡ۚ;Ll/ۖ֨ۚ;)V

    .line 94
    iget-boolean p1, v0, Ll/᩻֨ۚ;->ᩳ:Z

    if-eqz p1, :cond_2

    .line 200
    iget-object p1, p2, Ll/֡ܶۚ;->ܽ:Ll/֨֡ۚ;

    .line 36
    sget-object v0, Ll/ۚ֡ۚ;->ۙ:Ll/ۚ֡ۚ;

    invoke-virtual {p1, v0}, Ll/֨֡ۚ;->֫(Ll/ۚ֡ۚ;)V

    .line 37
    :cond_2
    sget-object p1, Ll/᩺ۚۚ;->ۤ:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    return v1

    .line 40
    :cond_3
    sget-object v0, Ll/᩺ۚۚ;->ۤ:Ll/᩺ۚۚ;

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 41
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1
.end method
