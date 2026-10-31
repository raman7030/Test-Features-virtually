.class public Ll/ܳۘۢ;
.super Ll/᩸ۘۢ;
.source "268J"

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    const-string v0, "221 Goodbye\r\n"

    .line 11
    iget-object v1, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-virtual {v1, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v1}, Ll/᩶ۘۢ;->ۧ()V

    return-void
.end method
