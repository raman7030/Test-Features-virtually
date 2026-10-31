.class public final synthetic Ll/᩺᩶᩻;
.super Ljava/lang/Object;
.source "JAK2"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟᩶᩻;


# direct methods
.method public synthetic constructor <init>(Ll/۟᩶᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩶᩻;->᩸:Ll/۟᩶᩻;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 268
    iget-object v0, p0, Ll/᩺᩶᩻;->᩸:Ll/۟᩶᩻;

    iget-object v1, v0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    const v2, 0x7f120b85

    invoke-virtual {v1, v2}, Ll/᩹ۗܿ;->᩻(I)V

    .line 269
    iget-object v1, v0, Ll/۟᩶᩻;->ܳ:Ll/᩹ۗܿ;

    iget-object v0, v0, Ll/۟᩶᩻;->᩷:Ll/֫ۙ᩻;

    invoke-static {v0}, Ll/֫ۙ᩻;->ۧ(Ll/֫ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/᩹ۗܿ;->ᩳ(Ljava/lang/CharSequence;)V

    return-void
.end method
