.class public abstract Ll/ܰۤ᩵;
.super Ll/᩵ۛ᩵;
.source "MAWV"


# static fields
.field public static final synthetic ֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _consensus:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    const-class v0, Ljava/lang/Object;

    const-string v1, "_consensus"

    const-class v2, Ll/ܰۤ᩵;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܰۤ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    sget-object v0, Ll/᩺ۤ᩵;->֫:Ll/ܶۛ᩵;

    iput-object v0, p0, Ll/ܰۤ᩵;->_consensus:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 94
    iget-object v0, p0, Ll/ܰۤ᩵;->_consensus:Ljava/lang/Object;

    .line 95
    sget-object v1, Ll/᩺ۤ᩵;->֫:Ll/ܶۛ᩵;

    if-ne v0, v1, :cond_3

    .line 96
    invoke-virtual {p0, p1}, Ll/ܰۤ᩵;->ۧ(Ljava/lang/Object;)Ll/ܶۛ᩵;

    move-result-object v2

    .line 80
    iget-object v0, p0, Ll/ܰۤ᩵;->_consensus:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    sget-object v3, Ll/ܰۤ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_1
    invoke-virtual {v3, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v1, :cond_1

    .line 83
    iget-object v0, p0, Ll/ܰۤ᩵;->_consensus:Ljava/lang/Object;

    .line 99
    :cond_3
    :goto_0
    invoke-virtual {p0, p1, v0}, Ll/ܰۤ᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract ۧ(Ljava/lang/Object;)Ll/ܶۛ᩵;
.end method
