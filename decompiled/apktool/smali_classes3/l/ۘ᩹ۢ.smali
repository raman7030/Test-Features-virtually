.class public Ll/ۘ᩹ۢ;
.super Ll/֫ۙ᩷;
.source "11SZ"

# interfaces
.implements Ll/᩷ۙ᩷;


# instance fields
.field public ۜۧ:Z

.field public ۢۧ:Ll/֫᩸ۧ;

.field public ᩷ۧ:Ll/֫᩸ۧ;

.field public ᩻ۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f150003

    .line 28
    invoke-direct {p0, v0}, Ll/֫ۙ᩷;-><init>(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۘ᩹ۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۘ᩹ۢ;->᩺()V

    return-void
.end method

.method private ᩺()V
    .locals 8

    .line 70
    invoke-static {}, Ll/֫᩸ۢ;->ۧ()Ll/۟ܶۢ;

    move-result-object v0

    .line 71
    invoke-static {}, Ll/ۘ᩸ۢ;->֫()Ll/ۖ᩸ۢ;

    move-result-object v1

    const/4 v2, 0x1

    .line 72
    iput-boolean v2, p0, Ll/ۘ᩹ۢ;->᩻ۧ:Z

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 74
    iget-object v0, p0, Ll/ۘ᩹ۢ;->ۢۧ:Ll/֫᩸ۧ;

    invoke-virtual {v0, v3}, Ll/֫᩸ۧ;->ܳ(Z)V

    .line 75
    iget-object v0, p0, Ll/ۘ᩹ۢ;->᩷ۧ:Ll/֫᩸ۧ;

    const v1, 0x7f120a3e

    invoke-virtual {v0, v1}, Ll/֫᩸ۧ;->ܿ(I)V

    return-void

    .line 73
    :cond_0
    iget-object v4, v0, Ll/۟ܶۢ;->ܳ:Ljava/lang/String;

    .line 77
    iget-object v5, p0, Ll/ۘ᩹ۢ;->ۢۧ:Ll/֫᩸ۧ;

    invoke-virtual {v5, v2}, Ll/֫᩸ۧ;->ܳ(Z)V

    const/4 v5, 0x2

    const v6, 0x7f120a3b

    if-nez v1, :cond_1

    .line 79
    iget-object v0, p0, Ll/ۘ᩹ۢ;->᩷ۧ:Ll/֫᩸ۧ;

    new-array v1, v5, [Ljava/lang/Object;

    aput-object v4, v1, v3

    const-string v4, "unknown"

    aput-object v4, v1, v2

    invoke-virtual {p0, v6, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    .line 80
    iput-boolean v3, p0, Ll/ۘ᩹ۢ;->᩻ۧ:Z

    return-void

    .line 81
    :cond_1
    iget v7, v1, Ll/ۖ᩸ۢ;->ᩳ:I

    iget v0, v0, Ll/۟ܶۢ;->ܿ:I

    if-le v7, v0, :cond_2

    .line 82
    iget-object v0, p0, Ll/ۘ᩹ۢ;->᩷ۧ:Ll/֫᩸ۧ;

    iget-object v1, v1, Ll/ۖ᩸ۢ;->ܿ:Ljava/lang/String;

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v3

    aput-object v1, v5, v2

    const v1, 0x7f120a3c

    invoke-virtual {p0, v1, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    return-void

    .line 84
    :cond_2
    iget-object v0, p0, Ll/ۘ᩹ۢ;->᩷ۧ:Ll/֫᩸ۧ;

    iget-object v1, v1, Ll/ۖ᩸ۢ;->ܿ:Ljava/lang/String;

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v3

    aput-object v1, v5, v2

    invoke-virtual {p0, v6, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 33
    invoke-super {p0, p1}, Ll/֫ۙ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 34
    invoke-static {}, Ll/ۗۖ᩷;->֫()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ll/۟᩸ۢ;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/ۘ᩹ۢ;->ۜۧ:Z

    return-void
.end method

.method public final ֫(Ll/۟᩶᩷;Ll/ۜ᩹ۧ;)V
    .locals 4

    const-string p1, "term_start_path"

    .line 45
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "term_create_session_as_root"

    .line 46
    invoke-virtual {p2, v1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "term_double_confirm_to_exit"

    .line 47
    invoke-virtual {p2, v2}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "terminal_su2_help"

    .line 48
    invoke-virtual {p2, v3}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object v3

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v3, p0, Ll/ۘ᩹ۢ;->ۢۧ:Ll/֫᩸ۧ;

    const-string v3, "term_ex"

    .line 49
    invoke-virtual {p2, v3}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p2

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ۘ᩹ۢ;->᩷ۧ:Ll/֫᩸ۧ;

    .line 50
    iget-boolean p2, p0, Ll/ۘ᩹ۢ;->ۜۧ:Z

    const/4 v3, 0x0

    if-eqz p2, :cond_0

    .line 51
    invoke-virtual {v0, v3}, Ll/֫᩸ۧ;->ܳ(Z)V

    .line 52
    invoke-virtual {v1, v3}, Ll/֫᩸ۧ;->ܳ(Z)V

    goto :goto_0

    .line 54
    :cond_0
    sget-object p2, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "/sdcard"

    invoke-interface {p2, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    .line 55
    invoke-virtual {v2, v3}, Ll/֫᩸ۧ;->ܳ(Z)V

    .line 57
    :goto_0
    invoke-direct {p0}, Ll/ۘ᩹ۢ;->᩺()V

    return-void
.end method

.method public final ֫(Ll/۟᩶᩷;Ll/֫᩸ۧ;Ljava/lang/Object;)Z
    .locals 0

    .line 62
    instance-of p1, p2, Ll/ۜܶۧ;

    if-eqz p1, :cond_0

    .line 63
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "TerminalPreferences"

    return-object v0
.end method

.method public final ܽ()V
    .locals 3

    .line 91
    iget-boolean v0, p0, Ll/ۘ᩹ۢ;->᩻ۧ:Z

    if-eqz v0, :cond_2

    .line 92
    invoke-static {}, Ll/֫᩸ۢ;->ۧ()Ll/۟ܶۢ;

    move-result-object v0

    .line 93
    invoke-static {}, Ll/ۘ᩸ۢ;->֫()Ll/ۖ᩸ۢ;

    move-result-object v1

    if-nez v1, :cond_0

    const v0, 0x7f12051f

    .line 95
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_0
    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 98
    iget v0, v0, Ll/۟ܶۢ;->ܿ:I

    iget v1, v1, Ll/ۖ᩸ۢ;->ᩳ:I

    if-lt v0, v1, :cond_1

    .line 99
    invoke-static {}, Ll/᩻᩹ۡ;->ۚ()Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-static {p0, v0, v2}, Ll/ۧۖ᩷;->֫(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void

    .line 102
    :cond_1
    new-instance v0, Ll/֨۫᩷;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0}, Ll/֨۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, v0, v2}, Ll/ۘ᩸ۢ;->֫(Ll/ۗܺ᩷;Ljava/lang/Runnable;Z)V

    :cond_2
    return-void
.end method
