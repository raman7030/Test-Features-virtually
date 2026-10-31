.class public final synthetic Ll/۫᩸ܿ;
.super Ljava/lang/Object;
.source "F99O"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Landroid/net/LocalServerSocket;

.field public final synthetic ᩹:Ll/ۨ᩸ܿ;


# direct methods
.method public synthetic constructor <init>(Landroid/net/LocalServerSocket;Ll/ۨ᩸ܿ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩸ܿ;->᩸:Landroid/net/LocalServerSocket;

    iput-object p2, p0, Ll/۫᩸ܿ;->᩹:Ll/ۨ᩸ܿ;

    iput-boolean p3, p0, Ll/۫᩸ܿ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/۫᩸ܿ;->᩹:Ll/ۨ᩸ܿ;

    iget-boolean v1, p0, Ll/۫᩸ܿ;->᩶:Z

    iget-object v2, p0, Ll/۫᩸ܿ;->᩸:Landroid/net/LocalServerSocket;

    invoke-static {v2, v0, v1}, Ll/᩺᩸ܿ;->֫(Landroid/net/LocalServerSocket;Ll/ۨ᩸ܿ;Z)V

    return-void
.end method
