.class public final Ll/᩷ۜ᩵;
.super Ljava/lang/ref/WeakReference;
.source "K6PM"


# instance fields
.field public final ֫:Ljava/lang/Throwable;

.field public final ۧ:I

.field public ܽ:Ll/᩷ۜ᩵;

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Ll/ۡۜ᩵;Ljava/lang/Throwable;Ll/᩷ۜ᩵;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0

    .line 423
    invoke-direct {p0, p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 424
    iput-object p2, p0, Ll/᩷ۜ᩵;->֫:Ljava/lang/Throwable;

    .line 425
    iput-object p3, p0, Ll/᩷ۜ᩵;->ܽ:Ll/᩷ۜ᩵;

    .line 426
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->getId()J

    move-result-wide p2

    iput-wide p2, p0, Ll/᩷ۜ᩵;->ᩳ:J

    .line 427
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Ll/᩷ۜ᩵;->ۧ:I

    return-void
.end method
