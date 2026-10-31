.class public final Ll/۟ۗ᩷;
.super Ll/۬ۗܿ;
.source "X6MV"


# instance fields
.field public final synthetic ۟:Ll/֫۬᩷;


# direct methods
.method public constructor <init>(Ll/֫۬᩷;Ll/ۗܺ᩷;)V
    .locals 0

    .line 33
    iput-object p1, p0, Ll/۟ۗ᩷;->۟:Ll/֫۬᩷;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 5

    .line 37
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 39
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 45
    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/32 v2, 0x186a0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_2

    const-wide/32 v2, 0x3b9aca00

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    goto :goto_0

    .line 54
    :cond_1
    iget-object v2, p0, Ll/۟ۗ᩷;->۟:Ll/֫۬᩷;

    invoke-virtual {v2}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-virtual {v2}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v2

    long-to-int v1, v0

    invoke-interface {v3, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 55
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :cond_2
    :goto_0
    const v0, 0x7f120a65

    .line 51
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    :catch_0
    const v0, 0x7f120b48

    .line 47
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
