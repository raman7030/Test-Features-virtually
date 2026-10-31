.class public final Ll/ܿ᩻᩻;
.super Ll/۟ᩴܿ;
.source "07HC"


# instance fields
.field public final synthetic ۬:Ll/᩷᩻᩻;


# direct methods
.method public constructor <init>(Ll/᩷᩻᩻;Ll/֫᩵ܿ;)V
    .locals 0

    .line 119
    iput-object p1, p0, Ll/ܿ᩻᩻;->۬:Ll/᩷᩻᩻;

    invoke-direct {p0, p2}, Ll/۟ᩴܿ;-><init>(Ll/֫᩵ܿ;)V

    return-void
.end method


# virtual methods
.method public final ᩻()Z
    .locals 2

    .line 122
    invoke-super {p0}, Ll/۟ᩴܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܿ᩻᩻;->۬:Ll/᩷᩻᩻;

    invoke-static {v0}, Ll/᩷᩻᩻;->ܽ(Ll/᩷᩻᩻;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/᩷᩻᩻;->ۧ(Ll/᩷᩻᩻;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
