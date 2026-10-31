.class public final Ll/ܶ֨ܽ;
.super Ll/֡֨ܽ;
.source "Z6QT"


# instance fields
.field public final ܳ:Ll/ܿ֨ܽ;

.field public final ܽ:Ll/ۧۚܽ;

.field public final ܿ:I

.field public final ᩳ:Ll/᩷ۚܽ;


# direct methods
.method public constructor <init>(Ll/᩷ۚܽ;Ll/᩶֡ܽ;Ll/ܿ֨ܽ;)V
    .locals 0

    .line 975
    invoke-direct {p0, p1}, Ll/֡֨ܽ;-><init>(Ll/ۛۚܽ;)V

    .line 976
    iput-object p1, p0, Ll/ܶ֨ܽ;->ᩳ:Ll/᩷ۚܽ;

    .line 977
    iget-object p2, p2, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    iput-object p2, p0, Ll/ܶ֨ܽ;->ܽ:Ll/ۧۚܽ;

    .line 978
    iput-object p3, p0, Ll/ܶ֨ܽ;->ܳ:Ll/ܿ֨ܽ;

    .line 979
    iget p1, p1, Ll/᩷ۚܽ;->ᩳ:I

    iput p1, p0, Ll/ܶ֨ܽ;->ܿ:I

    .line 980
    invoke-static {p3}, Ll/ܿ֨ܽ;->ܽ(Ll/ܿ֨ܽ;)I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶ֨ܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ֨ܽ;->ܽ:Ll/ۧۚܽ;

    return-object p0
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/ܶ֨ܽ;
    .locals 4

    .line 987
    instance-of v0, p0, Ll/᩷ۚܽ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/᩷ۚܽ;

    iget v0, p0, Ll/᩷ۚܽ;->ᩳ:I

    if-lez v0, :cond_1

    iget v1, p0, Ll/᩷ۚܽ;->ܽ:I

    if-ne v0, v1, :cond_1

    .line 990
    iget-object v1, p0, Ll/᩷ۚܽ;->ۧ:Ll/ۛۚܽ;

    instance-of v2, v1, Ll/᩶֡ܽ;

    if-eqz v2, :cond_1

    check-cast v1, Ll/᩶֡ܽ;

    .line 993
    iget-object v2, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    iget-object v3, v1, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-static {v2, v3, v0}, Ll/ܿ֨ܽ;->֫(Ll/ۛۚܽ;Ll/ۧۚܽ;I)Ll/ܿ֨ܽ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 994
    :cond_0
    new-instance v2, Ll/ܶ֨ܽ;

    invoke-direct {v2, p0, v1, v0}, Ll/ܶ֨ܽ;-><init>(Ll/᩷ۚܽ;Ll/᩶֡ܽ;Ll/ܿ֨ܽ;)V

    return-object v2

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܶ֨ܽ;)Ll/᩷ۚܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ֨ܽ;->ᩳ:Ll/᩷ۚܽ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܶ֨ܽ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܶ֨ܽ;->ܿ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܶ֨ܽ;)Ll/ܿ֨ܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ֨ܽ;->ܳ:Ll/ܿ֨ܽ;

    return-object p0
.end method
