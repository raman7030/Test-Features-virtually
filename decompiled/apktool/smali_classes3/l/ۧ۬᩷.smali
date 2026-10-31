.class public final synthetic Ll/ۧ۬᩷;
.super Ljava/lang/Object;
.source "U998"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ᩳ۬᩷;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳ۬᩷;Ll/ۗܺ᩷;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ۬᩷;->᩸:Ll/ᩳ۬᩷;

    iput-object p2, p0, Ll/ۧ۬᩷;->᩹:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ۧ۬᩷;->᩶:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    sget v0, Ll/ᩳ۬᩷;->۫֫:I

    .line 109
    check-cast p1, Ll/ܿ۬᩷;

    .line 64
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "default"

    const-string v2, "theme"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ۬᩷;->ܽ(Ljava/lang/String;)Ll/ܽ۬᩷;

    move-result-object v0

    .line 110
    invoke-static {v0}, Ll/ܽ۬᩷;->֫(Ll/ܽ۬᩷;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܿ۬᩷;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܿ۬᩷;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 112
    iget-object v0, p0, Ll/ۧ۬᩷;->᩹:Ll/ۗܺ᩷;

    invoke-static {v0}, Ll/ۧ᩹᩷;->֫(Landroid/content/Context;)V

    .line 113
    invoke-virtual {p1}, Ll/ܿ۬᩷;->ܽ()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۧ۬᩷;->᩸:Ll/ᩳ۬᩷;

    invoke-virtual {v0, p1}, Ll/֫᩸ۧ;->֫(Ljava/io/Serializable;)V

    .line 115
    :cond_0
    iget-object p1, p0, Ll/ۧ۬᩷;->᩶:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method
