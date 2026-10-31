.class public final Ll/᩸ۖ֡;
.super Ljava/lang/Object;
.source "K4X2"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Iterable;


# static fields
.field public static final serialVersionUID:J = -0x1ad7c1c2f00eb0f5L


# instance fields
.field public final ᩸:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Ll/᩸ۖ֡;->᩸:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 93
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Serialization is not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 112
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Serialization is not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final isEmpty()Z
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩸ۖ֡;->᩸:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/᩸ۖ֡;->᩸:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
