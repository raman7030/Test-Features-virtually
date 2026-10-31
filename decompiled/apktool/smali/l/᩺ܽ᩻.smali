.class public final synthetic Ll/᩺ܽ᩻;
.super Ljava/lang/Object;
.source "J951"

# interfaces
.implements Ll/ۛܶܺ;


# instance fields
.field public final synthetic ᩸:Z

.field public final synthetic ᩹:Ll/ܶ᩵ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩵ܿ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Ll/᩺ܽ᩻;->᩸:Z

    iput-object p1, p0, Ll/᩺ܽ᩻;->᩹:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 103
    iget-boolean v0, p0, Ll/᩺ܽ᩻;->᩸:Z

    if-eqz v0, :cond_0

    new-instance v0, Ll/ۘܰۡ;

    invoke-direct {v0}, Ll/ۘܰۡ;-><init>()V

    return-object v0

    :cond_0
    new-instance v0, Ll/ۘܰۡ;

    iget-object v1, p0, Ll/᩺ܽ᩻;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۘܰۡ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
