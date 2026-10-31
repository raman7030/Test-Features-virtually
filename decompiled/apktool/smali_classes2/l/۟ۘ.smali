.class public final Ll/۟ۘ;
.super Ljava/lang/Object;
.source "V659"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۢᩴ;


# direct methods
.method public constructor <init>(Ll/ۢᩴ;)V
    .locals 0

    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۘ;->᩸:Ll/ۢᩴ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 252
    iget-object v0, p0, Ll/۟ۘ;->᩸:Ll/ۢᩴ;

    invoke-virtual {v0}, Ll/ۢᩴ;->showOverflowMenu()Z

    return-void
.end method
