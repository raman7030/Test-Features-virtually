.class public final synthetic Ll/۟᩸ۡ;
.super Ljava/lang/Object;
.source "X5CP"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/֫᩹ۡ;

.field public final synthetic ᩸:Lbin/mt/plus/Main;

.field public final synthetic ᩹:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Ll/֡ۚۢ;Ll/֫᩹ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟᩸ۡ;->᩸:Lbin/mt/plus/Main;

    iput-object p2, p0, Ll/۟᩸ۡ;->᩹:Ll/֡ۚۢ;

    iput-object p3, p0, Ll/۟᩸ۡ;->᩶:Ll/֫᩹ۡ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    const-string p1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 88
    iget-object v0, p0, Ll/۟᩸ۡ;->᩸:Lbin/mt/plus/Main;

    invoke-static {v0, p1}, Ll/֨ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    .line 89
    iget-object p1, p0, Ll/۟᩸ۡ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 90
    iget-object p1, p0, Ll/۟᩸ۡ;->᩶:Ll/֫᩹ۡ;

    invoke-interface {p1}, Ll/֫᩹ۡ;->onSuccess()V

    return-void

    .line 92
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;)V

    return-void
.end method
