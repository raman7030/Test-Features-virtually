.class public final Ll/֡ܺ֡;
.super Ljava/lang/Object;
.source "J540"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x6f449111453ca76aL


# instance fields
.field public final ᩸:Ll/᩸ۖ֡;

.field public final ᩹:Ll/ܶܺ֡;


# direct methods
.method public constructor <init>(Ll/ܶܺ֡;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Ll/᩸ۖ֡;

    invoke-direct {v0}, Ll/᩸ۖ֡;-><init>()V

    iput-object v0, p0, Ll/֡ܺ֡;->᩸:Ll/᩸ۖ֡;

    .line 56
    iput-object p1, p0, Ll/֡ܺ֡;->᩹:Ll/ܶܺ֡;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 113
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Serialization is not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 132
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Serialization is not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 76
    iget-object v0, p0, Ll/֡ܺ֡;->᩸:Ll/᩸ۖ֡;

    invoke-virtual {v0}, Ll/᩸ۖ֡;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 77
    new-instance v1, Ll/ۘܺ֡;

    iget-object v2, p0, Ll/֡ܺ֡;->᩹:Ll/ܶܺ֡;

    .line 83
    invoke-direct {v1, v2}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 78
    new-instance v2, Ll/᩵ܺ֡;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1}, Ll/᩵ܺ֡;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v2}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 92
    iget-object v0, p0, Ll/֡ܺ֡;->᩸:Ll/᩸ۖ֡;

    invoke-virtual {v0}, Ll/᩸ۖ֡;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 93
    new-instance v1, Ll/ۘܺ֡;

    iget-object v2, p0, Ll/֡ܺ֡;->᩹:Ll/ܶܺ֡;

    .line 67
    invoke-direct {v1, v2}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 94
    new-instance v2, Ll/۫᩻ܳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1}, Ll/۫᩻ܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v2}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method
