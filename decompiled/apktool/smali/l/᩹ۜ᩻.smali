.class public final synthetic Ll/᩹ۜ᩻;
.super Ljava/lang/Object;
.source "B7T7"

# interfaces
.implements Ll/ܿۖ᩷;


# instance fields
.field public final synthetic ᩸:Ll/ۙۜ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ۙۜ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۜ᩻;->᩸:Ll/ۙۜ᩻;

    return-void
.end method


# virtual methods
.method public final ᩻()Z
    .locals 2

    .line 75
    iget-object v0, p0, Ll/᩹ۜ᩻;->᩸:Ll/ۙۜ᩻;

    iget-object v1, v0, Ll/ۙۜ᩻;->ۜ:Ll/᩺ۤܿ;

    invoke-virtual {v1}, Ll/᩺ۤܿ;->᩻()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Ll/ۙۜ᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

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
