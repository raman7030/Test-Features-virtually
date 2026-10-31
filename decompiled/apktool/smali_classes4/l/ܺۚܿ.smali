.class public final synthetic Ll/ܺۚܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ll/ۖۛۡ;


# instance fields
.field public final synthetic ᩸:Ll/ۖۚܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۚܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۚܿ;->᩸:Ll/ۖۚܿ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 530
    iget-object v0, p0, Ll/ܺۚܿ;->᩸:Ll/ۖۚܿ;

    iget-object v1, v0, Ll/ۖۚܿ;->᩷:Ll/᩺ۤܿ;

    invoke-virtual {v1, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    .line 532
    iget-object p1, v0, Ll/ۖۚܿ;->᩷:Ll/᩺ۤܿ;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ll/᩺ۤܿ;->֫(Z)V

    :cond_0
    return-void
.end method
