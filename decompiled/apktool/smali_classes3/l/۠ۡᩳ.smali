.class public final synthetic Ll/۠ۡᩳ;
.super Ljava/lang/Object;
.source "N1X5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Landroid/content/ServiceConnection;

.field public final synthetic ᩶:Landroid/app/Application;

.field public final synthetic ᩸:Ll/ۙۡᩳ;

.field public final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public synthetic constructor <init>(Ll/ۙۡᩳ;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Application;Landroid/content/ServiceConnection;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۡᩳ;->᩸:Ll/ۙۡᩳ;

    iput-object p2, p0, Ll/۠ۡᩳ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Ll/۠ۡᩳ;->᩶:Landroid/app/Application;

    iput-object p4, p0, Ll/۠ۡᩳ;->ۙ:Landroid/content/ServiceConnection;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Ll/۠ۡᩳ;->᩶:Landroid/app/Application;

    iget-object v1, p0, Ll/۠ۡᩳ;->ۙ:Landroid/content/ServiceConnection;

    iget-object v2, p0, Ll/۠ۡᩳ;->᩸:Ll/ۙۡᩳ;

    iget-object v3, p0, Ll/۠ۡᩳ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v2, v3, v0, v1}, Ll/ۙۡᩳ;->֫(Ll/ۙۡᩳ;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Application;Landroid/content/ServiceConnection;)V

    return-void
.end method
