.class public final Ll/֨ۘۢ;
.super Ljava/lang/Object;
.source "DAMT"


# instance fields
.field public ֫:Z

.field public ۧ:Ljava/net/ServerSocket;

.field public ܳ:Ll/ۙۘۢ;

.field public ܽ:Z

.field public ܿ:Landroid/os/PowerManager$WakeLock;

.field public ᩳ:Ljava/lang/Thread;

.field public ᩻:Landroid/net/wifi/WifiManager$WifiLock;


# direct methods
.method public static ֫()Ll/֨ۘۢ;
    .locals 2

    .line 618
    new-instance v0, Ll/֨ۘۢ;

    .line 605
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 619
    iput-boolean v1, v0, Ll/֨ۘۢ;->֫:Z

    .line 620
    iput-boolean v1, v0, Ll/֨ۘۢ;->ܽ:Z

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/֨ۘۢ;Landroid/net/wifi/WifiManager$WifiLock;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֨ۘۢ;->᩻:Landroid/net/wifi/WifiManager$WifiLock;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۘۢ;Landroid/os/PowerManager$WakeLock;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֨ۘۢ;->ܿ:Landroid/os/PowerManager$WakeLock;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۘۢ;Ljava/lang/Thread;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֨ۘۢ;->ᩳ:Ljava/lang/Thread;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۘۢ;Ljava/net/ServerSocket;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֨ۘۢ;->ۧ:Ljava/net/ServerSocket;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۘۢ;Ll/ۙۘۢ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֨ۘۢ;->ܳ:Ll/ۙۘۢ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۘۢ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/֨ۘۢ;->֫:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۘۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֨ۘۢ;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/֨ۘۢ;)Ljava/net/ServerSocket;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۘۢ;->ۧ:Ljava/net/ServerSocket;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/֨ۘۢ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/֨ۘۢ;->ܽ:Z

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/֨ۘۢ;)Ll/ۙۘۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۘۢ;->ܳ:Ll/ۙۘۢ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/֨ۘۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֨ۘۢ;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/֨ۘۢ;)Landroid/os/PowerManager$WakeLock;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۘۢ;->ܿ:Landroid/os/PowerManager$WakeLock;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֨ۘۢ;)Ljava/lang/Thread;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۘۢ;->ᩳ:Ljava/lang/Thread;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/֨ۘۢ;)Landroid/net/wifi/WifiManager$WifiLock;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۘۢ;->᩻:Landroid/net/wifi/WifiManager$WifiLock;

    return-object p0
.end method
