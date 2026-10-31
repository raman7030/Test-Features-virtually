.class public final Ll/֨ۘᩳ;
.super Ljava/lang/ref/WeakReference;
.source "G6SF"


# instance fields
.field public final ֫:Ll/᩷۠ᩴ;


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Ll/ܶۘᩳ;)V
    .locals 1

    .line 133
    invoke-static {}, Ll/ܶۘᩳ;->ܽ()Ljava/lang/ref/ReferenceQueue;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iput-object p1, p0, Ll/֨ۘᩳ;->֫:Ll/᩷۠ᩴ;

    return-void
.end method
