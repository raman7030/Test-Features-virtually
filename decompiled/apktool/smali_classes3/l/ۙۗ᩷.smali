.class public final Ll/ۙۗ᩷;
.super Ll/۬ۗܿ;
.source "4AJZ"


# instance fields
.field public final synthetic ۟:Ll/ۗۗ᩷;


# direct methods
.method public constructor <init>(Ll/ۗۗ᩷;Ll/ۗܺ᩷;)V
    .locals 0

    .line 32
    iput-object p1, p0, Ll/ۙۗ᩷;->۟:Ll/ۗۗ᩷;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 36
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 38
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 43
    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz v0, :cond_1

    .line 51
    iget-object v1, p0, Ll/ۙۗ᩷;->۟:Ll/ۗۗ᩷;

    invoke-virtual {v1}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-virtual {v1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 52
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 45
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0}, Ljava/lang/NumberFormatException;-><init>()V

    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    const v0, 0x7f120b48

    .line 48
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
