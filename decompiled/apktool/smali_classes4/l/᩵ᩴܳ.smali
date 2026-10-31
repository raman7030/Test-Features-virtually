.class public final synthetic Ll/᩵ᩴܳ;
.super Ljava/lang/Object;
.source "715M"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/ܶ᩵ܿ;

.field public final synthetic ᩸:Z

.field public final synthetic ᩹:Ll/ܽۢܳ;


# direct methods
.method public synthetic constructor <init>(ZLl/ܽۢܳ;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/᩵ᩴܳ;->᩸:Z

    iput-object p2, p0, Ll/᩵ᩴܳ;->᩹:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/᩵ᩴܳ;->᩶:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 123
    iget-boolean v0, p0, Ll/᩵ᩴܳ;->᩸:Z

    iget-object v1, p0, Ll/᩵ᩴܳ;->᩹:Ll/ܽۢܳ;

    iget-object v2, p0, Ll/᩵ᩴܳ;->᩶:Ll/ܶ᩵ܿ;

    if-nez v0, :cond_0

    .line 124
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 125
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void
.end method
