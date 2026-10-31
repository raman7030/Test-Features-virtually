.class public final Ll/ۤۨܺ;
.super Ljava/lang/Object;
.source "45RK"


# static fields
.field public static final ֫:Ljava/lang/ThreadLocal;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ll/۫ۨܺ;

    .line 42
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 41
    sput-object v0, Ll/ۤۨܺ;->֫:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public static ֫()[C
    .locals 1

    .line 33
    sget-object v0, Ll/ۤۨܺ;->֫:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [C

    return-object v0
.end method
