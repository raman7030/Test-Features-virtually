.class public final Ll/ۘۚۢ;
.super Ljava/lang/Object;
.source "T7AP"


# static fields
.field public static ֫:Ljava/lang/String;

.field public static ۧ:Ll/ܶ᩵ܿ;

.field public static ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 20
    invoke-static {}, Ll/ۘۚۢ;->ᩳ()V

    return-void
.end method

.method public static ֫()Ljava/lang/String;
    .locals 1

    .line 44
    sget-object v0, Ll/ۘۚۢ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 90
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    sget-object p0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    sput-object p0, Ll/ۘۚۢ;->ۧ:Ll/ܶ᩵ܿ;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 94
    invoke-static {p0, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    :goto_0
    sput-object p0, Ll/ۘۚۢ;->ۧ:Ll/ܶ᩵ܿ;

    .line 59
    :goto_1
    invoke-static {p1}, Ll/᩸ۗۡ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 61
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    sput p0, Ll/ۘۚۢ;->ܽ:I

    :cond_2
    if-nez p2, :cond_3

    const-string p0, ""

    goto :goto_2

    .line 122
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 64
    :goto_2
    invoke-static {p0}, Ll/ۘۚۢ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 65
    sput-object p0, Ll/ۘۚۢ;->֫:Ljava/lang/String;

    .line 67
    :cond_4
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    sget-object p1, Ll/ۘۚۢ;->ۧ:Ll/ܶ᩵ܿ;

    .line 68
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rwmip"

    invoke-interface {p0, p2, p1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    const-string p1, "rwmp"

    sget p2, Ll/ۘۚۢ;->ܽ:I

    .line 69
    invoke-interface {p0, p2, p1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    const-string p1, "rwmpc"

    sget-object p2, Ll/ۘۚۢ;->֫:Ljava/lang/String;

    .line 70
    invoke-interface {p0, p1, p2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    .line 71
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 4

    if-nez p0, :cond_0

    const-string p0, ""

    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 103
    :goto_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    .line 106
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    .line 109
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 110
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x30

    if-lt v1, v3, :cond_4

    const/16 v3, 0x39

    if-le v1, v3, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return v2

    :cond_5
    :goto_3
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 30
    sget-object v0, Ll/ۘۚۢ;->ۧ:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public static ܽ()I
    .locals 1

    .line 37
    sget v0, Ll/ۘۚۢ;->ܽ:I

    return v0
.end method

.method public static ᩳ()V
    .locals 3

    .line 78
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "rwmip"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 90
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 91
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    sput-object v0, Ll/ۘۚۢ;->ۧ:Ll/ܶ᩵ܿ;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 94
    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    :goto_0
    sput-object v0, Ll/ۘۚۢ;->ۧ:Ll/ܶ᩵ܿ;

    .line 79
    :goto_1
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "rwmp"

    const/16 v2, 0x1f91

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 80
    invoke-static {v0}, Ll/᩸ۗۡ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_2

    move v2, v0

    :cond_2
    sput v2, Ll/ۘۚۢ;->ܽ:I

    .line 81
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "rwmpc"

    const-string v2, ""

    .line 82
    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    move-object v0, v2

    goto :goto_2

    .line 122
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 83
    :goto_2
    invoke-static {v0}, Ll/ۘۚۢ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v2, v0

    :cond_4
    sput-object v2, Ll/ۘۚۢ;->֫:Ljava/lang/String;

    return-void
.end method
