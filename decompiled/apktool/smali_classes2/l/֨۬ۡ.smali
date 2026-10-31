.class public final Ll/֨۬ۡ;
.super Ljava/lang/Object;
.source "A9CK"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final ᩸:Ll/ܽۙܿ;


# direct methods
.method public constructor <init>(Ll/ܽۙܿ;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ll/֨۬ۡ;->᩸:Ll/ܽۙܿ;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p3, :cond_0

    .line 20
    array-length p1, p3

    if-lez p1, :cond_0

    const/4 p1, 0x0

    .line 21
    aget-object p1, p3, p1

    if-eqz p1, :cond_0

    .line 30
    new-instance p2, Ll/ۚ۬ۡ;

    invoke-direct {p2, p1}, Ll/ۚ۬ۡ;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, Ll/֨۬ۡ;->᩸:Ll/ܽۙܿ;

    invoke-virtual {p1, p2}, Ll/ܽۙܿ;->֫(Ll/ۚ۬ۡ;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
