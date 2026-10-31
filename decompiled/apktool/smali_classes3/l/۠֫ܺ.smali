.class public abstract Ll/۠֫ܺ;
.super Ljava/lang/Object;
.source "4AVK"


# static fields
.field public static final ֫:Ljava/lang/ThreadLocal;

.field public static final ۧ:Ljava/lang/ThreadLocal;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 5
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/۠֫ܺ;->ۧ:Ljava/lang/ThreadLocal;

    .line 6
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/۠֫ܺ;->֫:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;C)C
    .locals 0

    .line 11
    sget-object p2, Ll/۠֫ܺ;->ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {p2, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 12
    invoke-static {p3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    sget-object p3, Ll/۠֫ܺ;->֫:Ljava/lang/ThreadLocal;

    invoke-virtual {p3, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p0}, Ll/۠֫ܺ;->֫()V

    const/4 p1, 0x0

    .line 14
    invoke-virtual {p2, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    return p1
.end method

.method public abstract ֫()V
.end method
