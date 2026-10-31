.class public final Ll/ܶۘۢ;
.super Ljava/lang/Object;
.source "5AL4"


# static fields
.field public static ֫:Ljava/lang/String;

.field public static ۧ:Ll/ܶ᩵ܿ;

.field public static ܽ:Ljava/lang/String;

.field public static ܿ:Ljava/lang/String;

.field public static ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 22
    invoke-static {}, Ll/ܶۘۢ;->᩻()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 57
    invoke-static {p0, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    sput-object p0, Ll/ܶۘۢ;->ۧ:Ll/ܶ᩵ܿ;

    goto :goto_0

    .line 83
    :cond_0
    sget-object p0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    sput-object p0, Ll/ܶۘۢ;->ۧ:Ll/ܶ᩵ܿ;

    .line 58
    :goto_0
    sput-object p1, Ll/ܶۘۢ;->ܿ:Ljava/lang/String;

    .line 59
    sput-object p2, Ll/ܶۘۢ;->ܽ:Ljava/lang/String;

    .line 61
    :try_start_0
    invoke-static {p3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 62
    sput-object p3, Ll/ܶۘۢ;->֫:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string p0, "UTF-8"

    .line 64
    sput-object p0, Ll/ܶۘۢ;->֫:Ljava/lang/String;

    .line 66
    :goto_1
    invoke-static {p4}, Ll/᩸ۗۡ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 68
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    sput p0, Ll/ܶۘۢ;->ᩳ:I

    .line 70
    :cond_1
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    sget-object p1, Ll/ܶۘۢ;->ۧ:Ll/ܶ᩵ܿ;

    .line 71
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rmp"

    invoke-interface {p0, p2, p1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    const-string p1, "rmun"

    sget-object p2, Ll/ܶۘۢ;->ܿ:Ljava/lang/String;

    .line 72
    invoke-interface {p0, p1, p2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    const-string p1, "rmpw"

    sget-object p2, Ll/ܶۘۢ;->ܽ:Ljava/lang/String;

    .line 73
    invoke-interface {p0, p1, p2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    const-string p1, "rmcs"

    sget-object p2, Ll/ܶۘۢ;->֫:Ljava/lang/String;

    .line 74
    invoke-interface {p0, p1, p2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    const-string p1, "rmpt"

    sget p2, Ll/ܶۘۢ;->ᩳ:I

    .line 75
    invoke-interface {p0, p2, p1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    .line 76
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ֫()Z
    .locals 1

    .line 45
    sget-object v0, Ll/ܶۘۢ;->ܿ:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 38
    sget-object v0, Ll/ܶۘۢ;->ܿ:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    sget-object v0, Ll/ܶۘۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Ll/ܶۘۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ()Ljava/lang/String;
    .locals 1

    .line 49
    sget-object v0, Ll/ܶۘۢ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public static ܳ()Ljava/lang/String;
    .locals 1

    .line 30
    sget-object v0, Ll/ܶۘۢ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public static ܽ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 26
    sget-object v0, Ll/ܶۘۢ;->ۧ:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public static ܿ()I
    .locals 1

    .line 53
    sget v0, Ll/ܶۘۢ;->ᩳ:I

    return v0
.end method

.method public static ᩳ()Ljava/lang/String;
    .locals 1

    .line 34
    sget-object v0, Ll/ܶۘۢ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public static ᩻()V
    .locals 3

    .line 88
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "rmp"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 89
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 90
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    sput-object v0, Ll/ܶۘۢ;->ۧ:Ll/ܶ᩵ܿ;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 92
    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 81
    sput-object v0, Ll/ܶۘۢ;->ۧ:Ll/ܶ᩵ܿ;

    goto :goto_0

    .line 83
    :cond_1
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    sput-object v0, Ll/ܶۘۢ;->ۧ:Ll/ܶ᩵ܿ;

    .line 94
    :goto_0
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "rmun"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܶۘۢ;->ܿ:Ljava/lang/String;

    .line 95
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "rmpw"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܶۘۢ;->ܽ:Ljava/lang/String;

    .line 96
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "rmcs"

    const-string v2, "UTF-8"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܶۘۢ;->֫:Ljava/lang/String;

    .line 97
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "rmpt"

    const/16 v2, 0x849

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 98
    invoke-static {v0}, Ll/᩸ۗۡ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_2

    move v2, v0

    :cond_2
    sput v2, Ll/ܶۘۢ;->ᩳ:I

    return-void
.end method
