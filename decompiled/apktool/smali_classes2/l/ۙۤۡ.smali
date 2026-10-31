.class public final Ll/ۙۤۡ;
.super Ljava/lang/Object;
.source "S1JO"


# static fields
.field public static final ܽ:Ljava/lang/Object;


# instance fields
.field public ֫:Ll/ۚۡ֫;

.field public ۧ:Ljava/lang/ref/WeakReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۙۤۡ;->ܽ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    iput-object v0, p0, Ll/ۙۤۡ;->֫:Ll/ۚۡ֫;

    .line 13
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۙۤۡ;->ۧ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic ֫(Ll/᩶ۤۡ;[Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    .line 27
    aget-object v1, p1, v0

    .line 28
    sget-object v2, Ll/ۙۤۡ;->ܽ:Ljava/lang/Object;

    if-eq v1, v2, :cond_0

    .line 29
    aput-object v2, p1, v0

    .line 31
    invoke-interface {p0, v1}, Ll/᩶ۤۡ;->֫(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 39
    iget-object p1, p0, Ll/ۙۤۡ;->֫:Ll/ۚۡ֫;

    invoke-virtual {p1, v0}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۡܿܽ;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 43
    iget-object p1, p0, Ll/ۙۤۡ;->֫:Ll/ۚۡ֫;

    invoke-virtual {p1, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/᩶ۤۡ;)V
    .locals 3

    .line 16
    iget-object v0, p0, Ll/ۙۤۡ;->֫:Ll/ۚۡ֫;

    invoke-virtual {v0}, Ll/֡ۡ֫;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 17
    iget-object v1, p0, Ll/ۙۤۡ;->ۧ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۡ֫;

    if-eqz v1, :cond_0

    .line 19
    invoke-virtual {v0, v1}, Ll/֡ۡ֫;->ۧ(Ll/֨ۡ֫;)V

    .line 20
    iget-object v1, p0, Ll/ۙۤۡ;->ۧ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    .line 22
    :cond_0
    invoke-virtual {v0}, Ll/֡ۡ֫;->ۧ()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 23
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 26
    :cond_2
    :goto_0
    new-instance v1, Ll/᩹ۤۡ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p2}, Ll/᩹ۤۡ;-><init>(ILjava/lang/Object;)V

    .line 34
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Ll/ۙۤۡ;->ۧ:Ljava/lang/ref/WeakReference;

    .line 35
    invoke-virtual {v0, p1, v1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method
