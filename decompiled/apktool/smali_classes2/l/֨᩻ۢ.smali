.class public final synthetic Ll/֨᩻ۢ;
.super Ljava/lang/Object;
.source "E1KB"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܶ᩻ۢ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩻ۢ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩻ۢ;->᩸:Ll/ܶ᩻ۢ;

    iput-object p2, p0, Ll/֨᩻ۢ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 288
    iget-object v0, p0, Ll/֨᩻ۢ;->᩸:Ll/ܶ᩻ۢ;

    iget-object v0, v0, Ll/ܶ᩻ۢ;->ۙ:Ll/᩸᩻ۢ;

    invoke-static {v0}, Ll/᩸᩻ۢ;->ܽ(Ll/᩸᩻ۢ;)Ll/۫ۧۢ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 289
    invoke-static {v0}, Ll/᩸᩻ۢ;->ܽ(Ll/᩸᩻ۢ;)Ll/۫ۧۢ;

    move-result-object v0

    iget-object v1, p0, Ll/֨᩻ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/۫ۧۢ;->֫(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
