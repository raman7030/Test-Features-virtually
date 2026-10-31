.class public Ll/ۢܶۢ;
.super Ll/۟᩸᩷;
.source "JAJ0"


# static fields
.field public static final ᩸:Ll/ۚۡ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    sput-object v0, Ll/ۢܶۢ;->᩸:Ll/ۚۡ֫;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ll/۟᩸᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 18
    invoke-super {p0, p1}, Ll/۟᩸᩷;->onCreate(Landroid/os/Bundle;)V

    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 20
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    sget-object v0, Ll/ۢܶۢ;->᩸:Ll/ۚۡ֫;

    invoke-virtual {v0, p1}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 21
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lbin/mt/plus/Main;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "android.intent.action.MAIN"

    .line 22
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.category.LAUNCHER"

    .line 23
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 24
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
