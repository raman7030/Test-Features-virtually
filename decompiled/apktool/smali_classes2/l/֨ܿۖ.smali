.class public final Ll/֨ܿۖ;
.super Ll/ܶܿۖ;
.source "A87D"


# instance fields
.field public final synthetic ۧ:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object p1, p0, Ll/֨ܿۖ;->ۧ:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 39
    invoke-static {p1}, Ll/᩶ᩳۖ;->֫(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 110
    const-class p1, Ljava/lang/Object;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    iget-object p1, p0, Ll/֨ܿۖ;->ۧ:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v1, "UnsafeAllocator is used for non-instantiable type: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
