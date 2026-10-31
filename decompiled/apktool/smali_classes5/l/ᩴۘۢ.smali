.class public Ll/ᩴۘۢ;
.super Ll/۠ۖۢ;
.source "4610"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Ll/۠ۖۢ;-><init>(Ll/᩶ۘۢ;Ljava/lang/String;)V

    .line 8
    iput-object p2, p0, Ll/ᩴۘۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 13
    iget-object v0, p0, Ll/ᩴۘۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ll/۠ۖۢ;->֫(Ljava/lang/String;Z)V

    return-void
.end method
