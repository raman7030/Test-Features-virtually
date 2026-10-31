.class public final Ll/۬ۨܿ;
.super Ljava/lang/Object;
.source "1AL3"


# static fields
.field public static final synthetic ֫:I = 0x0

.field public static ۧ:I = 0x1

.field public static ܳ:Z = false

.field public static ܽ:I = 0x1

.field public static ܿ:I = 0x1

.field public static ᩳ:Z = true

.field public static ᩻:Z = true


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 22
    invoke-static {}, Ll/۬ۨܿ;->ۢ()V

    return-void
.end method

.method public static ֫()I
    .locals 2

    .line 89
    sget v0, Ll/۬ۨܿ;->ۧ:I

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/16 v0, 0x8

    return v0

    :cond_0
    const/4 v0, 0x6

    return v0

    :cond_1
    const/16 v0, 0xa

    return v0
.end method

.method public static ֫(I)I
    .locals 1

    if-ltz p0, :cond_1

    const/4 v0, 0x2

    if-le p0, v0, :cond_0

    goto :goto_0

    :cond_0
    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Z)V
    .locals 2

    .line 58
    sput-boolean p0, Ll/۬ۨܿ;->ᩳ:Z

    .line 59
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "scp_5"

    .line 0
    invoke-static {v0, v1, p0}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return-void
.end method

.method public static ۜ()Z
    .locals 1

    .line 31
    sget-boolean v0, Ll/۬ۨܿ;->ܳ:Z

    return v0
.end method

.method public static ۡ()V
    .locals 2

    .line 26
    invoke-static {}, Ll/۬ۨܿ;->ۢ()V

    .line 136
    new-instance v0, Landroid/content/Intent;

    const-string v1, "ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    return-void
.end method

.method public static ۢ()V
    .locals 3

    .line 150
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "scp_6"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ll/۬ۨܿ;->ܳ:Z

    .line 151
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "scp_1"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ll/۬ۨܿ;->᩻:Z

    .line 152
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "scp_5"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ll/۬ۨܿ;->ᩳ:Z

    .line 153
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "scp_2"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ll/۬ۨܿ;->֫(I)I

    move-result v0

    sput v0, Ll/۬ۨܿ;->ܿ:I

    .line 154
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "scp_3"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ll/۬ۨܿ;->֫(I)I

    move-result v0

    sput v0, Ll/۬ۨܿ;->ۧ:I

    .line 155
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "scp_4"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ll/۬ۨܿ;->֫(I)I

    move-result v0

    sput v0, Ll/۬ۨܿ;->ܽ:I

    return-void
.end method

.method public static ۧ()I
    .locals 1

    .line 100
    sget v0, Ll/۬ۨܿ;->ۧ:I

    return v0
.end method

.method public static ۧ(I)V
    .locals 2

    .line 104
    invoke-static {p0}, Ll/۬ۨܿ;->֫(I)I

    move-result p0

    .line 105
    sput p0, Ll/۬ۨܿ;->ۧ:I

    .line 106
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "scp_3"

    .line 107
    invoke-interface {v0, p0, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    .line 108
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    .line 136
    new-instance p0, Landroid/content/Intent;

    const-string v0, "ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"

    invoke-direct {p0, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    return-void
.end method

.method public static ۧ(Z)V
    .locals 2

    .line 35
    sput-boolean p0, Ll/۬ۨܿ;->ܳ:Z

    .line 36
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "scp_6"

    .line 0
    invoke-static {v0, v1, p0}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return-void
.end method

.method public static ܳ()I
    .locals 2

    .line 65
    sget v0, Ll/۬ۨܿ;->ܿ:I

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 71
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07035e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    goto :goto_0

    .line 69
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07035f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    goto :goto_0

    .line 67
    :cond_1
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07035d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    :goto_0
    float-to-int v0, v0

    return v0
.end method

.method public static ܽ()I
    .locals 1

    .line 124
    sget v0, Ll/۬ۨܿ;->ܽ:I

    return v0
.end method

.method public static ܽ(I)V
    .locals 2

    .line 128
    invoke-static {p0}, Ll/۬ۨܿ;->֫(I)I

    move-result p0

    .line 129
    sput p0, Ll/۬ۨܿ;->ܽ:I

    .line 130
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "scp_4"

    .line 131
    invoke-interface {v0, p0, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    .line 132
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ܽ(Z)V
    .locals 2

    .line 46
    sput-boolean p0, Ll/۬ۨܿ;->᩻:Z

    .line 47
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "scp_1"

    .line 48
    invoke-interface {v0, v1, p0}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p0

    .line 49
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    .line 136
    new-instance p0, Landroid/content/Intent;

    const-string v0, "ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"

    invoke-direct {p0, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    return-void
.end method

.method public static ܿ()I
    .locals 1

    .line 76
    sget v0, Ll/۬ۨܿ;->ܿ:I

    return v0
.end method

.method public static ᩳ()I
    .locals 2

    .line 113
    sget v0, Ll/۬ۨܿ;->ܽ:I

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/16 v0, 0x14

    return v0

    :cond_0
    const/16 v0, 0x1e

    return v0

    :cond_1
    const/16 v0, 0xa

    return v0
.end method

.method public static ᩳ(I)V
    .locals 2

    .line 80
    invoke-static {p0}, Ll/۬ۨܿ;->֫(I)I

    move-result p0

    .line 81
    sput p0, Ll/۬ۨܿ;->ܿ:I

    .line 82
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "scp_2"

    .line 83
    invoke-interface {v0, p0, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    .line 84
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    .line 136
    new-instance p0, Landroid/content/Intent;

    const-string v0, "ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"

    invoke-direct {p0, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    return-void
.end method

.method public static ᩷()Z
    .locals 1

    .line 42
    sget-boolean v0, Ll/۬ۨܿ;->᩻:Z

    return v0
.end method

.method public static ᩻()Z
    .locals 1

    .line 54
    sget-boolean v0, Ll/۬ۨܿ;->ᩳ:Z

    return v0
.end method
