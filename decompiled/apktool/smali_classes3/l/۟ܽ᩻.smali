.class public final synthetic Ll/۟ܽ᩻;
.super Ljava/lang/Object;
.source "J951"

# interfaces
.implements Ll/ۛܶܺ;


# instance fields
.field public final synthetic ᩸:Ll/ܶ᩵ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ܽ᩻;->᩸:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 2
    sget v0, Ll/ۧᩳ᩻;->᩵֫:I

    .line 205
    new-instance v0, Ll/ۘܰۡ;

    iget-object v1, p0, Ll/۟ܽ᩻;->᩸:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۘܰۡ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
