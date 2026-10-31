.class public final Ll/ᩳۗ᩷;
.super Ll/۬ۗܿ;
.source "B6LU"


# instance fields
.field public final synthetic ۟:Ll/᩻ۗ᩷;


# direct methods
.method public constructor <init>(Ll/᩻ۗ᩷;Ll/ۗܺ᩷;)V
    .locals 0

    .line 103
    iput-object p1, p0, Ll/ᩳۗ᩷;->۟:Ll/᩻ۗ᩷;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 4

    .line 107
    iget-object v0, p0, Ll/ᩳۗ᩷;->۟:Ll/᩻ۗ᩷;

    :try_start_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩻ۗ᩷;->ܽ(Ljava/lang/String;)I

    move-result v1

    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/֫᩸ۧ;->֫(Ljava/io/Serializable;)V

    .line 109
    invoke-virtual {v0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-virtual {v0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 110
    invoke-static {v0, v1}, Ll/᩻ۗ᩷;->֫(Ll/᩻ۗ᩷;I)V

    .line 111
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const v0, 0x7f120516

    .line 113
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
