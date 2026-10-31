.class public final synthetic Ll/ۧܶۜ;
.super Ljava/lang/Object;
.source "X8B6"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic ᩸:Ll/ܺܶۜ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ܺܶۜ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧܶۜ;->᩸:Ll/ܺܶۜ;

    iput p2, p0, Ll/ۧܶۜ;->᩹:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    sget p1, Ll/ܺܶۜ;->۬ۧ:I

    .line 648
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "onTranslucentConversionComplete"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    aget-object p2, p3, p2

    .line 649
    invoke-virtual {p1, p2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 650
    new-instance p1, Ll/ۨۜܿ;

    const/4 p2, 0x1

    iget p3, p0, Ll/ۧܶۜ;->᩹:I

    iget-object v0, p0, Ll/ۧܶۜ;->᩸:Ll/ܺܶۜ;

    invoke-direct {p1, p3, p2, v0}, Ll/ۨۜܿ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
