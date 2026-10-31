.class public final Ll/᩵۠᩵;
.super Ljava/lang/Object;
.source "VAXH"

# interfaces
.implements Ll/ܿ۠᩵;
.implements Ljava/io/Serializable;


# static fields
.field public static final ᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile ᩸:Ljava/lang/Object;

.field public volatile ᩹:Ll/֫᩹᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 146
    const-class v0, Ljava/lang/Object;

    const-string v1, "\u1a78"

    .line 144
    const-class v2, Ll/᩵۠᩵;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/᩵۠᩵;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ll/֫᩹᩵;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Ll/᩵۠᩵;->᩹:Ll/֫᩹᩵;

    .line 107
    sget-object p1, Ll/ۚ۠᩵;->֫:Ll/ۚ۠᩵;

    iput-object p1, p0, Ll/᩵۠᩵;->᩸:Ljava/lang/Object;

    return-void
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 141
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization is supported via proxy only"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    .line 139
    new-instance v0, Ll/ᩳ۠᩵;

    invoke-virtual {p0}, Ll/᩵۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ᩳ۠᩵;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 4

    .line 116
    iget-object v0, p0, Ll/᩵۠᩵;->᩸:Ljava/lang/Object;

    .line 117
    sget-object v1, Ll/ۚ۠᩵;->֫:Ll/ۚ۠᩵;

    if-eq v0, v1, :cond_0

    return-object v0

    .line 122
    :cond_0
    iget-object v0, p0, Ll/᩵۠᩵;->᩹:Ll/֫᩹᩵;

    if-eqz v0, :cond_3

    .line 125
    invoke-interface {v0}, Ll/֫᩹᩵;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 126
    sget-object v2, Ll/᩵۠᩵;->᩶:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_1
    invoke-virtual {v2, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v1, 0x0

    .line 127
    iput-object v1, p0, Ll/᩵۠᩵;->᩹:Ll/֫᩹᩵;

    return-object v0

    .line 0
    :cond_2
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_1

    .line 132
    :cond_3
    iget-object v0, p0, Ll/᩵۠᩵;->᩸:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 135
    iget-object v0, p0, Ll/᩵۠᩵;->᩸:Ljava/lang/Object;

    sget-object v1, Ll/ۚ۠᩵;->֫:Ll/ۚ۠᩵;

    if-eq v0, v1, :cond_0

    .line 137
    invoke-virtual {p0}, Ll/᩵۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    return-object v0
.end method
