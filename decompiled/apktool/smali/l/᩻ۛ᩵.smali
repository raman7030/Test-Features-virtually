.class public abstract Ll/᩻ۛ᩵;
.super Ll/ܰۤ᩵;
.source "TAXM"


# instance fields
.field public final ۧ:Ll/᩷ۛ᩵;

.field public ܽ:Ll/ܿۛ᩵;


# direct methods
.method public constructor <init>(Ll/᩷ۛ᩵;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ll/ܰۤ᩵;-><init>()V

    .line 75
    iput-object p1, p0, Ll/᩻ۛ᩵;->ۧ:Ll/᩷ۛ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 73
    check-cast p1, Ll/᩷ۛ᩵;

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 81
    :goto_0
    iget-object v0, p0, Ll/᩻ۛ᩵;->ۧ:Ll/᩷ۛ᩵;

    if-eqz p2, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Ll/᩻ۛ᩵;->ܽ:Ll/ܿۛ᩵;

    :goto_1
    if-eqz v1, :cond_4

    .line 82
    sget-object v2, Ll/᩷ۛ᩵;->᩸:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :cond_2
    invoke-virtual {v2, p1, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz p2, :cond_4

    .line 84
    iget-object p1, p0, Ll/᩻ۛ᩵;->ܽ:Ll/ܿۛ᩵;

    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Ll/᩷ۛ᩵;->ۧ(Ll/᩷ۛ᩵;Ll/ܿۛ᩵;)V

    return-void

    .line 0
    :cond_3
    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p0, :cond_2

    :cond_4
    return-void
.end method
